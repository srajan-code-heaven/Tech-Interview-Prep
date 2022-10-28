class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph g=new Graph();
        int indegree[]=new int[numCourses];
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[numCourses];
        for(int p[]:prerequisites)
        {
            ArrayList<Integer> temp=g.adj.getOrDefault(p[1],new ArrayList<>());
            temp.add(p[0]);
            g.adj.put(p[1],temp);
            indegree[p[0]]++;
        }
        
        for(int i=0;i<numCourses;i++)
        {
            if(g.adj.get(i)==null)
            {
                g.adj.put(i,new ArrayList<Integer>());
            }
        }
            
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
                visited[i]=true;
            }
        }
        
        while(!q.isEmpty())
        {
            int curr=q.poll();
            //for(int nei:g.adj.getOrDefault(curr,new ArrayList<>()))
            for(int nei:g.adj.get(curr))
            {
                indegree[nei]-=1;
                if(!visited[nei] && indegree[nei]==0)
                {
                    q.add(nei);
                    visited[nei]=true;
                }
            }
        }
        
        for(int i=0;i<numCourses;i++)
        {
            if(visited[i]==false)
            {
                return false;
            }
        }
        return true;
    }

}

class Graph
{
    HashMap<Integer,ArrayList<Integer>> adj;
    Graph()
    {
        adj=new HashMap<>();
    }
}
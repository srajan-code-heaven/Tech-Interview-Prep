class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         Graph g=new Graph();
       
        for(int p[]:prerequisites)
        {
            ArrayList<Integer> temp=g.adj.getOrDefault(p[1],new ArrayList<>());
            temp.add(p[0]);
            g.adj.put(p[1],temp);
        }
        
         for(int i=0;i<numCourses;i++)
        {
            if(g.adj.get(i)==null)
            {
                g.adj.put(i,new ArrayList<Integer>());
            }
        }
        
        
        boolean visited[]=new boolean[numCourses];
        boolean recStack[]=new boolean[numCourses];
        
        for(int i=0;i<numCourses;i++)
        {
            if(!visited[i] && hasCycle(i,g.adj,visited,recStack))
            {
                return false;
            }
        }
        
        return true;
    }
    
    boolean hasCycle(int curr,HashMap<Integer,ArrayList<Integer>> adj,boolean visited[],boolean recStack[])
    {
        if(recStack[curr]==true)
        {
            return true;
        }
        
        if(visited[curr]==true)
        {
            return false;
        }
        
        visited[curr]=true;
        recStack[curr]=true;
        for(int nei:adj.get(curr))
        {
            if(hasCycle(nei,adj,visited,recStack))
            {
                return true;
            }
        }
        recStack[curr]=false; 
        return false;
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
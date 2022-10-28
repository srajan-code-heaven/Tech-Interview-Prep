//207. Course Schedule

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Graph g=new Graph(numCourses);
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<prerequisites.length;i++)
        {
            g.addEdge(prerequisites[i][1],prerequisites[i][0]);
        }
        boolean recStack[]=new boolean[g.v];
        boolean visited[]=new boolean[g.v];
        Arrays.fill(visited,false);
        Arrays.fill(recStack,false);
        for(int i=0;i<g.v;i++)
        {
            if(!visited[i])
            {
                if(haveBackEdge(i,g.adj,recStack,visited,st))
                {
                    return new int[] {};
                }
            }
        }
        int ind=0;
        int ans[]=new int[numCourses];
        while(st.size()>0)
        {
            ans[ind]=st.pop();
            ind++;
        }
        return ans;
    }

    boolean haveBackEdge(int curr,LinkedList<Integer> adj[],boolean recStack[],boolean visited[],Stack<Integer> st)
    {
        if(recStack[curr])
        {
            return true;
        }
        if(visited[curr])
        {
            return false;
        }
        recStack[curr]=true;
        visited[curr]=true;
        Iterator<Integer> it=adj[curr].iterator();
        while(it.hasNext())
        {
            int temp=it.next();
            if(haveBackEdge(temp,adj,recStack,visited,st))
                {
                    return true;
                }
        }
        recStack[curr]=false;
        st.push(curr);
        return false;
    }
}
class Graph {
     int v;
      LinkedList<Integer> adj[];
    Graph(int v)
    {
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    void addEdge(int s,int d)
    {
        adj[s].add(d);
    }
}

class Solution {
    public boolean validTree(int n, int[][] edges) {
        Boolean visited[]=new Boolean[n];
        Graph g=new Graph(n);
        Arrays.fill(visited,false);

        for(int edge[]:edges)
        {
            g.addEdge(edge[0],edge[1]);
            g.addEdge(edge[1],edge[0]);
        }
  
        visited[0]=true;
        
        dfs(0,g,visited,n);
        
        if(edges.length!=n-1)
        {
            return false;
        }
        
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                return false;
            }
        }
        return true;
    }
    
    void dfs(int x,Graph g,Boolean visited[],int n)
    {
        for(int nei:g.adj[x])
        {
            if(visited[nei]==false)
            {
                visited[nei]=true;
                dfs(nei,g,visited,n);
            }
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
}
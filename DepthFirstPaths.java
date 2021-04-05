package com.Lab2;

public class DepthFirstPaths {
    private boolean[] marked;
    private int[] edgeto;
    private int s;

    public DepthFirstPaths(Graph G, int s) {
        //initialize data structures
        dfs(G, s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v))
            if (!marked[w]) {
                dfs(G, w);
                edgeto[w] = v;
        }
    }
}

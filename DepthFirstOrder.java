package com.Lab2;

import java.util.Iterator;

public class DepthFirstOrder {
    private boolean[] marked;
    private Stack<Integer> reversePost;

    public DepthFirstOrder(Digraph G) {
        reversePost = new Stack<>();
        marked = new boolean[G.getV()];
        for (int v = 0; v < G.getV(); v++)
            if (!marked[v])
                dfs(G, v);
    }

    private void dfs(Digraph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v))
            if (!marked[w])
                dfs(G, w);
            reversePost.push(v);
    }

    public Iterable<Integer> reversePost() {
        return reversePost;
    }
}

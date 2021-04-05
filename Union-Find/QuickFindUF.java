public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    private int root(int i) {
        while (i != id[i])
            i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return (root(p) == root(q));
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        int[] sz;
        sz = new int[id.length];
        if (i == j)
            return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] = sz[j] + sz[i];
        }
        else {
            id[j] = i;
            sz[i] = sz[i] + sz[j];
        }
    }

    public static void main(String[] args) {
        QuickFindUF graph = new QuickFindUF(10);
        graph.union(3, 4);
        graph.union(7, 8);
        graph.union(4, 7);
        if (graph.connected(3, 8))
            System.out.println("yes");
        else System.out.println("no");
    }
}

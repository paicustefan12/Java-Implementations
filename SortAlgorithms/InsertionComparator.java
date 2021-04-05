/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import java.util.Comparator;

public class InsertionComparator {
    public static <Key> void sort(Key[] a, Comparator<Key> comparator) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && less(comparator, a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
        }
    }

    private static <Key> boolean less(Comparator<Key> c, Key v, Key w) {
        return c.compare(v, w) < 0;
    }

    public static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[5];
        a[0] = 10;
        a[1] = 5;
        a[2] = 20;
        a[3] = 1;
        a[4] = 2;
        Quick.sort(a);
        for (int i = 0; i < 5; i++)
            System.out.println(a[i]);
    }
}

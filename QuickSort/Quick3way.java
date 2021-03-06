/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */
// 3-Way Quicksort(practical improvement for duplicate keys)

import edu.princeton.cs.algs4.StdRandom;

public class Quick3way {

    private static <Key extends Comparable<Key>> int partition(Key[] a, int low, int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (less(a[++i], a[low]))
                if (i == high)
                    break;
            while (less(a[low], a[--j]))
                if (j == low)
                    break;
            if (i >= j)
                break;
            exch(a, i, j);
        }

        exch(a, low, j);
        return j;
    }

    public static <Key extends Comparable<Key>> void sort(Key[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static <Key extends Comparable<Key>> void sort(Key[] a, int low, int high) {
        if (high <= low)
            return;
        int lt = low;
        int gt = high;
        Key v = a[low];
        int i = low;
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0)
                exch(a, lt++, i++);
            else if (cmp > 0)
                exch(a, i, gt--);
            else i++;
        }
        sort(a, low, lt - 1);
        sort(a, gt + 1, high);
    }

    private static <Key extends Comparable<Key>> boolean less(Key v, Key w) {
        return v.compareTo(w) < 0;
    }

    private static <Key extends Comparable<Key>> void exch(Key[] a, int i, int j) {
        Key swap = a[i];
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

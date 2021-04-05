/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */
// Bottom-up mergesort(non-recursive, but 10% slower)
public class MergeBU {

    private static <Key extends Comparable<Key>> void merge(Key[] a, Key[] aux, int low, int mid,
                                                            int high) {
        // assert isSorted(a, low, mid);
        // assert isSorted(a, mid + 1, high);

        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }

        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > high)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else a[k] = aux[i++];
        }
        // assert isSorted(a, low, high);
    }

    private static <Key extends Comparable<Key>> boolean less(Key v, Key w) {
        return v.compareTo(w) < 0;
    }

    public static <Key extends Comparable<Key>> void sort(Key[] a, Key[] aux) {
        int n = a.length;
        for (int sz = 1; sz < n; sz = sz + sz)
            for (int lo = 0; lo < n - sz; lo += sz + sz)
                merge(a, aux, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, n - 1));
    }


    public static void main(String[] args) {
    }
}

/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class Merge {

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

    private static <Key extends Comparable<Key>> void sort(Key[] a, Key[] aux, int low, int high) {
        if (high <= low)
            return;
        int mid = low + (high - low) / 2;
        sort(a, aux, low, mid);
        sort(a, aux, mid + 1, high);
        if (!less(a[mid + 1], a[mid])) return; // stop if already sorted(practical improvement)
        merge(a, aux, low, mid, high);
    }

    public static <Key extends Comparable<Key>> void sort(Key[] a) {
        Key[] aux = (Key[]) new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[5];

        a[0] = 10;
        a[1] = 5;
        a[2] = 20;
        a[3] = 1;
        a[4] = 2;
        Merge.sort(a);
        for (int i = 0; i < 5; i++)
            System.out.println(a[i]);
    }
}

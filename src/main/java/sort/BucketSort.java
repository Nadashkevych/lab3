package sort;

public class BucketSort implements Sortable {

    @Override
    public int[] sort(int[] tab) {
        int max = findMax(tab);
        int[] bucket = new int[max + 1];
        int[] sorted_tab = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            bucket[tab[i]]++;
        }

        int position = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                sorted_tab[position++] = i;
            }
        }
        return sorted_tab;
    }

    private static int findMax(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    @Override
    public double step_count() {
        return 0;
    }
}

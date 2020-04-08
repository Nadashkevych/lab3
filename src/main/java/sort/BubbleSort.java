package sort;

public class BubbleSort implements Sortable {

    @Override
    public int[] sort(int[] tab) {
        for (int i = 1; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - i; j++) {
                if (tab[j] < tab[j + 1]) {
                    swap(tab, j);
                }
            }
        }
        return tab;
    }

    private void swap(int[] tab, int a) {
        int tmp;
        tmp = tab[a];
        tab[a] = tab[a + 1];
        tab[a + 1] = tmp;
    }

    @Override
    public double step_count() {
        return 0;
    }
}

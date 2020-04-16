package sort;

public class BubbleSort implements Sortable {
    private int counter;

    @Override
    public int[] sort(int[] tab) {
        for (int i = 1; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - i; j++) {
                counter++;
                if (tab[j] < tab[j + 1]) {
                    swap(tab, j);
                }
            }
        }
        System.out.println(step_count());
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
        return counter;
    }
}

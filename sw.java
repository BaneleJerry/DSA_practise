class InsertionSortAlgorithm {

    private InsertionSortVisualization visualization;

    public InsertionSortAlgorithm(InsertionSortVisualization visualization) {
        this.visualization = visualization;
    }

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                visualization.updateArray(arr); // Update the array for visualization
            }
            arr[j + 1] = key;
            visualization.updateArray(arr); // Update the array for visualization
        }
    }
}

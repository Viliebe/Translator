int sumBelowDiagonal(int[][] arr, int rows, int cols) {
    int sum = 0;
    int rowIndex = 0;
    int colIndex = rows - 1;

    while (rowIndex < rows && colIndex >= 0) {
        sum += arr[rowIndex][colIndex];
        rowIndex++;
        colIndex--;
    }

    for (int i = 1; i < rows; i++) {
        rowIndex = i;
        colIndex = rows - i - 1;
        while (rowIndex < rows && colIndex >= i) {
            sum += arr[rowIndex][colIndex];
            rowIndex++;
            colIndex--;
        }
    }

    return sum;
}
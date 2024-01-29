public class SearchInSorted {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int target = 33;
        staircaseSearch(matrix, target);
    }

    public static boolean staircaseSearch(int matrix[][], int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("(" + row + " " + col + ")");
                return true;
            } else if (target < matrix[row][col])
                // Move Left
                col--;
            else
                // Move Bottom
                row++;
        }
        return false;
    }
}

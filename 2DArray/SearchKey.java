public class SearchKey {
    public static void main(String[] args) {
        int ar[][] = { { 1, 2 }, { 6, 5 } };
        search(ar);
    }

    public static void search(int ar[][]) {
        int key = 46;
        boolean found = false;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if (ar[i][j] == key) {
                    System.out.println(i + " " + j);
                    found = true;
                }

            }
        }
        if(!found)
        System.out.println("Key not found");
    }
}

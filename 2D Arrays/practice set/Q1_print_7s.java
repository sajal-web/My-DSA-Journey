public class Q1_print_7s {
    public static void main(String[] args) {
        int array[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        int key = 7;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == key) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

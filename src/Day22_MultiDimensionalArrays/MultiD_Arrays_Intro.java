package Day22_MultiDimensionalArrays;

public class MultiD_Arrays_Intro {
    public static void main(String[] args) {
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}, {9, 10, 11}};

        for (int i = arr2d.length - 1; i >= 0; i--) {// i -is index num of 1d arrays starting dron 0.

            for (int j = 0; j < arr2d[i].length; j++) {//j-index of elements start from 0.
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_________________________________________");




    }
}

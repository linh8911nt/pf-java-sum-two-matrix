import java.util.Scanner;

public class SumTwoMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;

        System.out.println("Enter row: ");
        row = input.nextInt();
        System.out.println("Enter colum: ");
        col = input.nextInt();

        int[][] matrixa = new int[row][col];
        System.out.println("Enter element matrixa ");
        for (row = 0; row < matrixa.length; row++) {
            for (col = 0; col < matrixa[row].length; col++) {
                System.out.println("Element matrixa (" + row + " , " + col + ")");
                matrixa[row][col] = input.nextInt();
            }
        }
        int[][] matrixb = new int[row][col];
        System.out.println("Enter element matrixb ");
        for (row = 0; row < matrixb.length; row++) {
            for (col = 0; col < matrixb[row].length; col++) {
                System.out.println("Element matrixb (" + row + " , " + col + ")");
                matrixb[row][col] = input.nextInt();
            }
        }
        int[][] matrixSum = new int[row][col];
        for (row = 0; row < matrixb.length; row++) {
            for (col = 0; col < matrixb[row].length; col++) {
                matrixSum[row][col] = matrixa[row][col] + matrixb[row][col];
            }
        }
        System.out.println("Matrixa: ");
        for (row = 0; row < matrixa.length; row++) {
            for (col = 0; col < matrixa[row].length; col++) {
                System.out.print(matrixa[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrixb: ");
        for (row = 0; row < matrixb.length; row++) {
            for (col = 0; col < matrixb[row].length; col++) {
                System.out.print(matrixb[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("MatrixSum: ");
        for (row = 0; row < matrixSum.length; row++) {
            for (col = 0; col < matrixSum[row].length; col++) {
                System.out.print(matrixSum[row][col] + " ");
            }
            System.out.println();
        }
    }
}

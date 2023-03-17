package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {
    public int [] [] createArray() {
        int [] [] tab = getSize();
        fillArray(tab);
        return  tab;
    }

    private int [] [] getSize() {
        Scanner sc = new Scanner(System.in);
        int tabSize = 100;
        int rowNumber;
        int columnNumber;
        do {
            System.out.println("Podaj liczbę wierszy");
            rowNumber = sc.nextInt();
            if (rowNumber > tabSize) {
                System.out.println("Maksymalna liczba wierszów to " + tabSize);
            }
            System.out.println("Podaj liczbę kolumn");
            columnNumber = sc.nextInt();
            if (columnNumber > tabSize) {
                System.out.println("Maksymalna liczba kolumn to " + tabSize);
            }
        } while (rowNumber > tabSize && columnNumber > tabSize);
        int [][] tab = new int[rowNumber][columnNumber];
        return tab;
    }

    private int[][] fillArray(int [] [] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = i * j;
            }
        }
        return tab;
    }

    public void printInfo(int [][] tab) {
        for (int[] row : tab) {
            System.out.println("____________________________________________________________");
            for (int cell : row) {
                System.out.printf("%4d |", cell);
            }
            System.out.println();
        }
        System.out.println("____________________________________________________________");
    }
}


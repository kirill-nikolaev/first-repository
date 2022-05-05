package org.example;

public class Robot {
    private int rows;
    private int columns;
    private long[][] numbers;

    public long calculateNumber(int n, int m) {
        rows = n;
        columns = m;
        numbers = new long[rows][columns];

        for (int i = 0; i < rows; i++)
            numbers[i][0] = 1;

        for (int i = 0; i < rows; i++)
            numbers[0][i] = 1;

        return calculate(n - 1, m - 1);
    }

    private long calculate(int n, int m){
        if (numbers[n][m] == 0)
            numbers[n][m] = calculate(n - 1, m) + calculate(n, m - 1);
        return numbers[n][m];
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.calculateNumber(22, 22));
    }
}

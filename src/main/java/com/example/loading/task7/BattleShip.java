package com.example.loading.task7;

public class BattleShip {

    public static int countBattleships(int[][] board) {
        int count = 0;
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Проверяем только начало корабля
                if (board[i][j] == 1 && (i == 0 || board[i - 1][j] == 0) && (j == 0 || board[i][j - 1] == 0)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] board = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1}
        };

        int shipsCount = countBattleships(board);
        System.out.println("Количество кораблей: " + shipsCount);
    }
}

package board;

public class Board {

    // Tabuleiro

    private String [][] board = new String[8][8];

    // getters e setters

    public String [][] getBoard () {
        return this.board;
    }

    public String getBoard (int row, int column) {
        return this.board [row][column];
    }

    public void setBoard (int row, int column, String data) {
        this.board [row][column] = data;
    }
}
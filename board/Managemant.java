package board;

import util.Movement;

public class Managemant {
    
    // Metodo para montar o tabuleiro

    public void montar (String [][] board) {

        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (row == 1 || row == 6) {
                    board [row][column] = "P ";
                }

                else if (row == 0 || row == 7) {
                    if (column == 0 || column == 7) {
                        board [row][column] = "T ";
                    }

                    else if (column == 1 || column == 6) {
                        board [row][column] = "C ";
                    }

                    else if (column == 2 || column == 5) {
                        board [row][column] = "B ";
                    }

                    else if (column == 3) {
                        board [row][column] = "Q ";
                    }

                    else {
                        board [row][column] = "K ";
                    }
                }

                else {
                    board [row][column] = "- ";
                }

                if (row == 0 || row == 1) {
                    board [row][column] = "\u001B[33m" + board [row][column] + "\u001B[0m";
                }
            }
        }
    }

    // Metodo para mover peças

    public void movement (String [][] board, String movement, boolean isValid) {

        Movement firstMovement = new Movement();
        Movement lastMovement = new Movement();
            
        String firstLetter = movement.substring(0, 1);
        String secondLetter = movement.substring(1, 2);
        String thirdLetter = movement.substring(2, 3);
        String fourthLetter = movement.substring(3, 4);

        firstMovement.search(firstLetter, secondLetter);
        lastMovement.search(thirdLetter, fourthLetter);

        if (isValid) {
            board [lastMovement.getX()][lastMovement.getY()] = board [firstMovement.getX()][firstMovement.getY()];
            board [firstMovement.getX()][firstMovement.getY()] = "- ";
        }

        else {
            System.out.println("Movimento Invalido!");
        }
    }

    public boolean isValid () {


        return true;
    }

    // Metodo para exibir tabuleiro

    public void display (String [][] board) {
        for (int row = 0; row < 8; row++) {
            System.out.print("\u001B[33m" + String.valueOf(8 - row) + "\u001B[0m" + "  ");
            
            for (int column = 0; column < 8; column++) {
                System.out.print(board[row][column] + " ");
            }

            System.out.print("\n");
        }

        System.out.println("\u001B[33m" + "   a  b  c  d  e  f  g  h" + "\u001B[0m");
    }
}

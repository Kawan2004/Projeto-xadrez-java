package board;

import java.util.Scanner;
import util.Clear;

public class Play {
    
    public static void main(String[] args) {
        
        Board board = new Board();
        Managemant managemant = new Managemant();
        managemant.montar(board.getBoard());

        Scanner input = new Scanner(System.in);
        Clear clear = new Clear();

        while (true) {

            clear.clearConsole();
            managemant.display(board.getBoard());
            System.out.print("\n> "); String movimento = input.nextLine();
            managemant.movement(board.getBoard(), movimento, true);
        }
    }
}

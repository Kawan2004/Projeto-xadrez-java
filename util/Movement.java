package util;

public class Movement {

    private int x;
    private int y;
    
    private String [] number = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private String [] caracter = {"a", "b", "c", "d", "e", "f", "g", "h"};

    public void search (String a, String b) {

        for (int letra = 0; letra < 8; letra++) {
            if (this.caracter[letra].equals(a)) {
                for (int numero = 0; numero < 8; numero++) {
                    if (number [numero].equals(b)) {
                        this.x = 7 - numero;
                        this.y = 0 + letra;
                    }
                }
            }
        }
    }

    public int getX () {
        return this.x;
    }

    public int getY () {
        return this.y;
    }
}

public class Main {
    public static void main(String[] args) {
        String[][] yildiz = new String[7][4];

        for (int i = 0; i < yildiz.length; i++) {
            for (int j = 0; j < yildiz[i].length; j++) {
                if (i == 0 || i == 3 || i == 6)
                    yildiz[i][j] = " * ";
                else if (j == 0 || j == 3)
                    yildiz[i][j] = " * ";
                else
                    yildiz[i][j] = "   ";
            }
            }
        for (String[] row : yildiz) {
            for (String col : row) {
                System.out.print( col );
            }
            System.out.println();
        }
    }
}

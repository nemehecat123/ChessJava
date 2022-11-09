/**
 * main
 */
public class main {
    public static int BPawn= 11;
    public static int BRook= 12;
    public static int BKnight=13;
    public static int BBishop= 14;
    public static int BKing= 15;
    public static int BQueen= 16;

    public static int WPawn= 21;
    public static int WRook= 22;
    public static int WKnight=23;
    public static int WBishop= 24;
    public static int WKing= 25;
    public static int WQueen= 26;

    public static void main(String[] args)  {
        int board[][] = {
                { BRook, BKnight, BBishop, BKing, BQueen, BBishop, BKnight, BRook },
                { BPawn, BPawn, BPawn, BPawn, BPawn, BPawn, BPawn, BPawn },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0 },
                { WPawn, WPawn, WPawn, WPawn, WPawn, WPawn, WPawn, WPawn },
                { WRook, WKnight, WBishop, WKing, WQueen, WBishop, WKnight, WRook }
        };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " \t|" );
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------");

        }

    }
    public static int NaVrsti(int a){ //vrne 0 ali 1... če je 1 je prvi igralec če je 0 je drugi 
        return a%2;

    }
}
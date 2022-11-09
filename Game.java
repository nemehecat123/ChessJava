import java.util.Scanner;

/**
 * 
 * Game
 */
public class Game {
	final public int BPawn   = 11;
	final public int BRook   = 12;
	final public int BKnight = 13;
	final public int BBishop = 14;
	final public int BKing   = 15;
	final public int BQueen  = 16;

	final public int WPawn   = 21;
	final public int WRook   = 22;
	final public int WKnight = 23;
	final public int WBishop = 24;
	final public int WKing   = 25;
	final public int WQueen  = 26;
	public int board[][] =  {
		{ BRook, BKnight, BBishop, BKing, BQueen, BBishop, BKnight, BRook },
		{ BPawn, BPawn  , BPawn  , BPawn, BPawn , BPawn  , BPawn  , BPawn },
		{ 0    , 0      , 0      , 0    , 0     , 0      , 0      , 0     },
		{ 0    , 0      , 0      , 0    , 0     , 0      , 0      , 0     },
		{ 0    , 0      , 0      , 0    , 0     , 0      , 0      , 0     },
		{ 0    , 0      , 0      , 0    , 0     , 0      , 0      , 0     },
		{ WPawn, WPawn  , WPawn  , WPawn, WPawn , WPawn  , WPawn  , WPawn },
		{ WRook, WKnight, WBishop, WKing, WQueen, WBishop, WKnight, WRook },
	};

	boolean checkMate = false;
	int turnCounter = 0;
	Scanner sc = new Scanner(System.in);

	public Game() {
		gameLoop();
	}

	public void gameLoop() {
		while (!checkMate) {
			int position[] = getPostition();
			System.out.println(position);

			displayBoard();
		}
	}

	public int[] getPostition() {
		String pos = "";
		do {
			System.out.print("Enter position: ");
			pos = sc.nextLine();
			if (pos.length() == 2) {
				break;
			} else {
				System.out.println("Enter a valid position");
			}
		} while (true);
		return new int[1];
	}
	
	public void displayBoard() {
		System.out.println("  +------+------+------+------+------+------+------+------+");
		for (int y = 0; y < board.length; y++) {
			System.out.print(y + " |");
			for (int x = 0; x < board.length; x++) {
				boolean isWhite = x % 2 == 1;
				if (y % 2 == 0) isWhite = x % 2 == 0; 
				System.out.print(displayPiece(board[y][x], 6, isWhite) + "|");
			}
			System.out.println();
			System.out.println("  +------+------+------+------+------+------+------+------+");
		}
		System.out.println("     a      b      c      d      e      f      g      h   ");
	}

	public String displayPiece(int piece_code, int length, boolean white) {
		String piece_string = "";
		int buffer_len = (length - 2)/ 2;
		String white_space = " ";
		if (white) white_space = "▒";

		switch (piece_code) {
			case BPawn:
				piece_string = "BP"; //"♙";
				break;
			case BRook:
				piece_string = "BR"; //"♖";
				break;
			case BKnight:
				piece_string = "Bk"; //"♘";
				break;
			case BBishop:
				piece_string = "BB"; //"♗";
				break;
			case BKing:
				piece_string = "BK"; //"♔";
				break;
			case BQueen:
				piece_string = "BQ"; //"♕";
				break;
			case WPawn:
				piece_string = "WP"; //"♟";
				break;
			case WRook:
				piece_string = "WR"; //"♜";
				break;
			case WKnight:
				piece_string = "Wk"; //"♞";
				break;
			case WBishop:
				piece_string = "WB"; //"♝";
				break;
			case WKing:
				piece_string = "WK"; //"♚";
				break;
			case WQueen:
				piece_string = "WQ"; //"♛";
				break;
			default:
		  		piece_string = white_space.repeat(2);
		}
		return  white_space.repeat(buffer_len) + piece_string + white_space.repeat(buffer_len);
	}

	public static void main(String[] args)  {
		new Game();
	}
}
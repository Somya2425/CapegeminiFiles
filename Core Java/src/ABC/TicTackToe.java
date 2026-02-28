package ABC;
import java.util.Scanner;
public class TicTackToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
		char[][] board = new char[3][3];
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				board[i][j] = ' ';
			}
		}
		
		while() {
			
		}
	}
		
	
	static boolean validMove(int row, int col) {
		if(row<0 || row>2 || col<0 || col>2|| board[row][col] == ' ') {
			return false;
		}
		return true;
	}
	
	static void printBoard() {
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				System.out.print(" " + board[i][0] + " " + board[i][1] + " " + board[i][2]);
				System.out.println();
			}
	    }
	}
	
	static void checkWin(char Player, char[][] board) {
		for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                return true;
        }
		 if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
		            (board[0][2] == player && board[1][1] == player && board[2][0] == player))
		            return true;

		 return false;
	}


}

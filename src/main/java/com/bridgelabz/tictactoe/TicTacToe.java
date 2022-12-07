package com.bridgelabz.tictactoe;

public class TicTacToe {
	

	public void TicTacToeGame() {
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) {
		
				board[i] =' ';
			
			System.out.println(board);

		}

	}

	public void main(String[] board) {
		TicTacToeGame();

	}
}
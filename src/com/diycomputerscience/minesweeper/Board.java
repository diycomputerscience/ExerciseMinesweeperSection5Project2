package com.diycomputerscience.minesweeper;


public class Board {

	public static final int MAX_ROWS = 6;
	public static final int MAX_COLS = 6;
	
	private Square squares[][];
	
	public Board() {
		this.squares = new Square[MAX_ROWS][MAX_COLS];
		// intitialize squares and set mines
		for(int row=0; row<MAX_ROWS; row++) {
			for(int col=0; col<MAX_COLS; col++) {
				Square square = new Square();
				long ctms = System.nanoTime();
				if(ctms % 2 != 0) {
					square.setMine(true);
				}
				squares[row][col] = square;
			}
		}
		
		// TODO: determine counts of all squares that are not mines
		
	}
	
	/**
	 * This method uncovers the specified Square
	 * @param row The row of the specified Square
	 * @param col The col of the specified Square
	 * @throws UncoveredMineException if the specified Square is a mine
	 */
	public void uncover(int row, int col) throws UncoveredMineException {
		this.squares[row][col].uncover();
	}
	
	/**
	 * This method marks the specified Square
	 * @param row The row of the specified Square
	 * @param col The col of the specified Square
	 */
	public void mark(int row, int col) {
		this.squares[row][col].mark();
	}
	
	public Square[][] getSquares() {
		return this.squares;		
	}

}

package com.diycomputerscience.minesweeper.utils;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.diycomputerscience.minesweeper.Board;

public class MinesweeperUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testComputeNeibhboursTopLeftCorner() {
		int neighbours[][] = MinesweeperUtils.computeNeibhbours(0, 0);
		assertEquals(3, neighbours.length);
		assertTrue(arrayContains(neighbours, 0, 1));
		assertTrue(arrayContains(neighbours, 1, 1));
		assertTrue(arrayContains(neighbours, 1, 0));
	}
	
	@Test
	public void testComputeNeibhboursTopRow() {
		int neighbours[][] = MinesweeperUtils.computeNeibhbours(0, 1);
		assertEquals(5, neighbours.length);		
		assertTrue(arrayContains(neighbours, 0, 2));
		assertTrue(arrayContains(neighbours, 1, 2));
		assertTrue(arrayContains(neighbours, 1, 1));
		assertTrue(arrayContains(neighbours, 1, 0));
		assertTrue(arrayContains(neighbours, 0, 0));
	}
	
	@Test
	public void testComputeNeibhboursTopRightCorner() {
		int neighbours[][] = MinesweeperUtils.computeNeibhbours(0, Board.MAX_COLS-1);
		assertEquals(3, neighbours.length);		
		assertTrue(arrayContains(neighbours, 1, Board.MAX_COLS-1));
		assertTrue(arrayContains(neighbours, 1, Board.MAX_COLS-2));
		assertTrue(arrayContains(neighbours, 0, Board.MAX_COLS-2));		
	}
	
	@Test
	public void testComputeNeibhboursRightRow() {
		int neighbours[][] = MinesweeperUtils.computeNeibhbours(1, Board.MAX_COLS-1);
		assertEquals(5, neighbours.length);		
		assertTrue(arrayContains(neighbours, 2, Board.MAX_COLS-1));
		assertTrue(arrayContains(neighbours, 2, Board.MAX_COLS-2));
		assertTrue(arrayContains(neighbours, 1, Board.MAX_COLS-2));
		assertTrue(arrayContains(neighbours, 0, Board.MAX_COLS-2));
		assertTrue(arrayContains(neighbours, 0, Board.MAX_COLS-1));
	}
	
	@Test
	public void testComputeNeibhboursBottomRightCorner() {
		int neighbours[][] = MinesweeperUtils.computeNeibhbours(Board.MAX_ROWS-1, Board.MAX_COLS-1);
		assertEquals(3, neighbours.length);
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-1, Board.MAX_COLS-2));
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-2, Board.MAX_COLS-2));
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-2, Board.MAX_COLS-1));
	}
	
	@Test
	public void testComputeNeibhboursBottomRow() {
		int neighbours[][] = MinesweeperUtils.computeNeibhbours(Board.MAX_ROWS-1, Board.MAX_COLS-2);
		assertEquals(5, neighbours.length);
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-1, Board.MAX_COLS-1));
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-1, Board.MAX_COLS-3));
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-2, Board.MAX_COLS-3));
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-2, Board.MAX_COLS-2));
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-2, Board.MAX_COLS-1));
	}
	
	@Test
	public void testComputeNeibhboursBottomLeftCorner() {
		int neighbours[][] = MinesweeperUtils.computeNeibhbours(Board.MAX_ROWS-1, 0);
		assertEquals(3, neighbours.length);
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-1, 1));
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-2, 0));
		assertTrue(arrayContains(neighbours, Board.MAX_ROWS-2, 1));
	}
	
	@Test
	public void testComputeNeibhboursLeftColumn() {
		int neighbours[][] = MinesweeperUtils.computeNeibhbours(1, 0);
		assertEquals(5, neighbours.length);
		assertTrue(arrayContains(neighbours, 1, 1));
		assertTrue(arrayContains(neighbours, 2, 1));
		assertTrue(arrayContains(neighbours, 2, 0));
		assertTrue(arrayContains(neighbours, 0, 0));
		assertTrue(arrayContains(neighbours, 0, 1));
	}
	
	@Test
	public void testComputeNeibhboursCenter() {
		int neighbours[][] = MinesweeperUtils.computeNeibhbours(1, 1);
		assertEquals(8, neighbours.length);
		assertTrue(arrayContains(neighbours, 1, 2));
		assertTrue(arrayContains(neighbours, 2, 2));
		assertTrue(arrayContains(neighbours, 2, 1));
		assertTrue(arrayContains(neighbours, 2, 0));
		assertTrue(arrayContains(neighbours, 1, 0));
		assertTrue(arrayContains(neighbours, 0, 0));
		assertTrue(arrayContains(neighbours, 0, 1));
		assertTrue(arrayContains(neighbours, 0, 2));
	}

	private boolean arrayContains(int neighbours[][], int row, int col) {
		boolean contains = false;
		for(int i=0; i<neighbours.length; i++) {
			if(neighbours[i][0] == row && neighbours[i][1] == col) {
				contains = true;
				break;
			}
		}
		return contains;
	}

}

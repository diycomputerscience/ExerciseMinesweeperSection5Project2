<h1>Section 5 Project 2</h1>

<h2>Overview</h2>

In the previous activity we started linking the UI with backend classes. We rendered all squares that were mines in RED. 

If you look at Minesweeper again, you will realize when a player uncovers a square which is not a mine, a number is displayed on the square. This is the number of squares that are mines around that square.

However, we first need the ability to determine the neighbors of a given square. With this capability in place, we will be able to determine how many  neighbors have mines, and compute the count. Eventually we will also add an instance attribute called ```count``` to the Square class. This attribute will hold the count (number of neighbours that are mines).

In this project, you have to compute the count for all squares that are not mines, and display them on the UI, as shown in Figure 1 below.

![Minesweeper board with mines marked in red and with counts](https://raw.github.com/diycomputerscience/MinesweeperImages/master/images/MinesweeperWithMinesMarkedInRedAndWithCounts.jpg)

_**Figure 1**_

We have to do a couple of things to complete this activity. We will start with the first  baby step and create a utility method computeNeighbours, which will compute the neighboring points for any given point. 

The code snippet below shows the signature for this method:

    public static int[][] computeNeibhbours(int row, int col) {

    } 

_**Code Snippet 1**_

The method shown above in Code Snippet 1, takes a ```row``` and ```col``` index, and computes the neighbors for that location. The image below shows sample input with expected output, so you understand how the method should work. The input is a ```row``` and ```col``` index, and the output is an array of arrays where every line of the array contains the ```row``` and ```col``` index of a point which is a neighbor of the input point.

![Neighbours count](https://raw.github.com/diycomputerscience/MinesweeperImages/master/images/Project5.2Neighbours.jpg)

**Note**: You must have realized that corner, and border squares, are to be treated differently than other squares.

Once the logic to compute counts in place, you will need to make some changes to ```Board``` and ```Square```, so that each square can hold the count of mines around it. 

<h2>Steps For This Project</h2>
 1. Notice that the test class ```MinesweeperUtilsTest``` has some compile errors. First remove those errors by implementing necessary code.
 1. Get the test class ```MinesweeperUtilsTest``` to pass.
 1. Add ```MinesweeperUtilsTest``` to ```AllTests```
 1. Run ```AllTests``` and verify that 37 tests are run, out of which there is one failure - ```UITest.testCountOnSquares```. This is due to the fact that we are not displaying counts on the UI as yet. 
 1. Add an ```integer``` attribute called ```count``` and accessor methods for it to Square.
 1. In ```Board.java```, refer to the **TODO:** in the constructor to understand what code needs to be added
 1. In the ```layoutSquares()``` method in ```UI.java``` add code to display the count on all squares that are not mines.
 1. Run ```UI``` and verify that counts are indeed displayed on the squares in the board.
 1. Run ```AllTests``` and verify that all the tests pass.

You may have noticed that we have not tested the logic which computes counts in the ```Board``` class. We have only tested the logic which computes neighbors. We have been unable to test this  logic because it is virtually untestable. Can you think and try to figure out why the logic that computes counts is difficult to test ? Think about it. We will dig more into this in next section.

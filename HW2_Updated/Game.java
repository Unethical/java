import java.util.*;
public class Game {
	private static final int min = 5, max = 15;
	public static Scanner scanner = new Scanner( System.in );
	static public void main(String [] args){
		int rows, cols, numOfSpots;
		rows = InputMethods.readInt("Enter the # of Rows", min, max);
		cols = InputMethods.readInt("Enter the # of Cols", min, max);
		boolean [][] compGrid, playGrid, matchGrid;
		
		compGrid = allocateGrid(rows, cols);
		playGrid = allocateGrid(rows, cols);
		matchGrid = allocateGrid(rows, cols);
		boolean b = true;
	while(b){

		compGrid = initGrid(compGrid);
		playGrid = initGrid(playGrid);
		matchGrid = initGrid(matchGrid);
		numOfSpots = InputMethods.readInt("Enter # of spots to set", rows, (rows*cols)/2); 
		compGrid = setRandomValues(compGrid, numOfSpots);
		playGrid = setInputValues(playGrid, numOfSpots);
		matchGrid = compareGrid(playGrid, compGrid, matchGrid);
		displayGrid("Player Grid:\n", "X", playGrid);
		displayGrid("Comp Grid:\n", "X", compGrid);
		displayGrid("Match Grid:\n", "X", matchGrid);
		b = InputMethods.wantsToRepeat();
	};
		
		
	}

	static public boolean[][] initGrid(boolean [][] grid){
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				grid[i][j] = false;
			}
		}
		return grid;
		
	}
	static public void displayGrid(String prompt, String mine, boolean[][] grid){
		System.out.println(prompt);
		for(int i=0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				System.out.printf("|");
				if(grid[i][j] == true){
					System.out.printf(mine);
				} else {
					System.out.printf(" ");
				}
			}
			System.out.printf("|\n");
		}
	}
	static public boolean[][] compareGrid(boolean[][] grid,boolean[][] grid2, boolean[][] grid3){
		
		for(int i=0; i < grid.length; i++)
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] == true && grid2[i][j] == true){
					grid3[i][j] = true;
				}
			}
		return grid3;
	}
	static public boolean[][] setInputValues(boolean[][] grid, int num){
		int row, col;
		int counter = 1;
		while(counter <= num){
			System.out.println("Set row and col index seperated by a space for mine " + counter);
			row = scanner.nextInt();
			col = scanner.nextInt();
			while((row >= grid.length || row < 0 )|| (col >= grid[0].length || col < 0)){

					System.out.println("Sorry out of bounds: ");
					row = scanner.nextInt();
					col = scanner.nextInt();	
				
			}
			if(!(grid[row][col] == true)){
				grid[row][col] = true;
				counter++;
			}else{
				System.out.println("Sorry already chosen.\n");
			}

		}
			return grid;
		
	}
	static public boolean[][] allocateGrid(int r, int c){
		boolean [][] grid;
		grid = new boolean[r][c];
		return grid;
		
	}
	static public boolean[][] setRandomValues(boolean [][] grid, int num){
		Random rand = new Random();
		int rows = grid.length;
		int cols = grid[0].length;
		int temp1, temp2;
		int counter = 1;
		while(counter <= num){
			temp1 = rand.nextInt(rows);
			temp2 = rand.nextInt(cols);
			if(!(grid[temp1][temp2] == true)){
				grid[temp1][temp2] = true;
				counter++;
				//cheater code
				//System.out.println(temp1 +" "+ temp2);
			}

		}

		return grid;
		
	}
	
	
}
/*
 * Enter the # of Rows6
Enter the # of Cols6
Enter # of spots to set20
Input out of range, must be >= 6 and <= 18
Enter # of spots to set6
Set row and col index seperated by a space for mine 1
-1 0
Sorry out of bounds: 
0 -1
Sorry out of bounds: 
0 8
Sorry out of bounds: 
8 0
Sorry out of bounds: 
1 1
Set row and col index seperated by a space for mine 2
0 0
Set row and col index seperated by a space for mine 3
2 4
Set row and col index seperated by a space for mine 4
4 3
Set row and col index seperated by a space for mine 5
3 1
Set row and col index seperated by a space for mine 6
1 2
Player Grid:

|X| | | | | 
| |X|X| | | 
| | | | |X| 
| |X| | | | 
| | | |X| | 
| | | | | | 
Comp Grid:

|X| | | | | 
| | | |X| | 
| | | | | | 
| |X|X| | | 
| | |X| | | 
|X| | | | | 
Match Grid:

|X| | | | | 
| | | | | | 
| | | | | | 
| |X| | | | 
| | | | | | 
| | | | | | 
Do you want to repeat? (y or Y)
y
Enter # of spots to set6
Set row and col index seperated by a space for mine 1
1 1
Set row and col index seperated by a space for mine 2
2 0
Set row and col index seperated by a space for mine 3
5 6
Sorry out of bounds: 
4 4
Set row and col index seperated by a space for mine 4
1 1
Sorry already chosen.

Set row and col index seperated by a space for mine 4
1 2
Set row and col index seperated by a space for mine 5
1 3
Set row and col index seperated by a space for mine 6
4 2
Player Grid:

| | | | | | 
| |X|X|X| | 
|X| | | | | 
| | | | | | 
| | |X| |X| 
| | | | | | 
Comp Grid:

| | | | | | 
| | | | | |X
|X| |X| | | 
| |X|X| | | 
| | | | | | 
| | |X| | | 
Match Grid:

| | | | | | 
| | | | | | 
|X| | | | | 
| | | | | | 
| | | | | | 
| | | | | | 
Do you want to repeat? (y or Y)
Y
Enter # of spots to set6
Set row and col index seperated by a space for mine 1
1 1
Set row and col index seperated by a space for mine 2
2 2
Set row and col index seperated by a space for mine 3
3 3
Set row and col index seperated by a space for mine 4
4 4
Set row and col index seperated by a space for mine 5
5 5
Set row and col index seperated by a space for mine 6
6 6
Sorry out of bounds: 
0 0
Player Grid:

|X| | | | | |
| |X| | | | |
| | |X| | | |
| | | |X| | |
| | | | |X| |
| | | | | |X|
Comp Grid:

| | | | | | |
| | | | | |X|
| | |X| | | |
|X| | | | | |
| | | |X| |X|
|X| | | | | |
Match Grid:

| | | | | | |
| | | | | | |
| | |X| | | |
| | | | | | |
| | | | | | |
| | | | | | |
Do you want to repeat? (y or Y)
n


 */

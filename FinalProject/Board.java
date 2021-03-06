public class Board{

    private String[][] board;

    public Board(){
	//initialize the board
	board = new String[6][6];
    }

    public String get(int row,int col)
    {
	return board[row][col];
    }

    public boolean add(int col, String marker){
	//attempt to add the piece to the column specified
	//return true if successful, otherwise false
	for(int i =0;i<board.length;i++)
	    {
		if(board[i][col]==" ")
		    {
			board[i][col] = marker;
			return true;
		    }
	    }
	return false;
    }

    /*
    public void remove(int col){
	//to be implemented for the AI, remove the highest piece in the column
    }
    */

    public String checkBoard(){
	//check if a player has won or if there is a draw
	//return an empty string if nothing interesting
	//return the marker of the winning player if someone won
	//return "draw" if no one won
	
	
    }

    public String toString(){
	//return the string representation of the board
    }
}

import java.util.HashSet;

public class Sudoku {

	public static void main(String[] args) {
		char[][] board =   {{'.', '.', '.', '.', '5', '.', '.', '1', '.'},
			                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
			                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
			                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
			                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
			                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
			                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
			                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
			                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}};
		Sudoku s = new Sudoku();
		System.out.println(s.isValidSudoku(board));

	}
	
	public boolean isValidSudoku(char[][] board) {
        for(int i =0; i< 9;i++){
            HashSet columnSet = new HashSet();
            for(int j=0; j<9;j++){
            	if(board[i][j] == '.') {
            		continue;
            	}
                if(!columnSet.add(board[i][j])){
                    return false;
                }
            }
        }
        for(int j =0; j< 9;j++){
            HashSet rowSet = new HashSet();
            for(int i=0; i<9;i++){
            	if(board[i][j] == '.') {
            		continue;
            	}
                if(!rowSet.add(board[i][j])){
                    return false;
                }
            }
        }
        for(int ms=0;ms<3;ms++){
            HashSet matricsSet = new HashSet();
            
            for(int i=3*ms; i< 3*(ms+1) ; i++){
            	int j=0;
                for(j=3*ms; j<3*(ms+1); j++){
                	System.out.println(i + "   :  "+j);
                	if(board[i][j] == '.') {
                		continue;
                	}
                    if(!matricsSet.add(board[i][j])){
                        return false;
                    }
                }
                
                if(i == (3*(ms+1)-1) && j==9) {
                	break;
                }
                	
                	i= 3*ms;
                
            }
            
            
        }

        return true;
        
    }

}

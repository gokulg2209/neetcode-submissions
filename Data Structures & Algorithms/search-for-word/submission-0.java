class Solution {
    public boolean exist(char[][] board, String word) {
        int rows= board.length;
        int colunms= board[0].length;
        for(int i=0; i < rows; i++){
            for(int j=0; j < colunms; j++){
                if(board[i][j]== word.charAt(0) && helper(board, word, i,j,0)){
                    return true; 
                }
            }
        }
        return false;  
    }

    public boolean helper(char[][] board, String word, int i, int j, int count){
        if(count == word.length()){
            return true;
        }

        if(i<0 || i>= board.length || j<0 || j >= board[0].length || board[i][j] != word.charAt(count)){
            return false;
        }

        char temp= board[i][j];
        board[i][j]=' ';
        boolean result= helper(board,word,i+1,j, count+1) || 
        helper(board,word,i-1,j, count+1) ||
        helper(board,word,i,j+1, count+1) ||
        helper(board,word,i,j-1, count+1);

        board[i][j]=temp;
        return result;
    }
}

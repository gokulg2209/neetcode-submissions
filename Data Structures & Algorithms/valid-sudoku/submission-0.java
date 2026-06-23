class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> result= new HashSet<>();
        for(int row=0;row<9;row++){
            for(int column=0;column<9;column++){
                char num=board[row][column];
                if(num=='.'){
                    continue;
                }
                String rowKey= num +"row"+row;
                String columnKey= num+"Column"+column;
                String boxKey= num+"box"+(row/3)+"-"+(column/3);

                if(!result.add(rowKey)||!result.add(columnKey)|| !result.add(boxKey)){
                    return false;
                }
            }
        }
        return true;
    }
}

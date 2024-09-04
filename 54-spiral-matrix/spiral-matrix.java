class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return result;
        }
        int startRows = 0;
        int startCols = 0;
        int endRows = matrix.length - 1;
        int endCols = matrix[0].length - 1;

        while(startRows <= endRows && startCols <= endCols){
            for(int j= startCols; j<=endCols; j++){
                result.add(matrix[startRows][j]);
            }
            startRows++;

            for(int i= startRows; i<=endRows; i++){
                result.add(matrix[i][endCols]);
            }
            endCols--;

            if(startRows <= endRows){
                for(int j= endCols; j>=startCols; j--){
                    result.add(matrix[endRows][j]);
                }
                endRows--;
            }

            if(startCols <= endCols){
                for(int i= endRows; i>= startRows; i--){
                    result.add(matrix[i][startCols]);
                }
                startCols++;
            }
        }
        return result;
    }
}
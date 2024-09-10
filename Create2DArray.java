public class Create2DArray {
    public static void main(String... args){

        int[] original = {1,2,3,4};
        int m = 2;
        int n = 2;
        Create2DArray create2DArray = new Create2DArray();
        int[][] result = create2DArray.construct2DArray(original, m, n);
        System.out.println(result);
    }

    public int[][] construct2DArray(int[] original, int m, int n){
        if (original.length != m * n) {
            return new int[0][0];
        }
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                result[i][j] = original[i * n + j];
            }
        }
        return result;
       
    }
}

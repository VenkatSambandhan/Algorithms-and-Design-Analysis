
public class RotateImage {

	public static void main(String[] args) {
	int[][] matrix = {{1,2,3,5},
					  {4,5,6,7},
					  {7,8,9,4},
					  {4,5,6,0}};
		rotate(matrix);
	}
	
	    public static void rotate(int[][] matrix) {
	        if(matrix == null || matrix.length==0)
	            return ;
	 
	        int m = matrix.length;
	        int n = matrix[0].length;
	        System.out.println("Length of rows:" +m);
	        System.out.println("Length of columns:" +n);
	 
	        int[][] result = new int[m][n];
	 
	        for(int i=0; i<m; i++){
	            for(int j=0; j<n; j++){
	                result[j][m-1-i] = matrix[i][j];
	            }
	        } 
	 
	       for(int i=0; i<m; i++){
	            for(int j=0; j<n; j++){
	                matrix[i][j] = result[i][j];
	                System.out.print(matrix[i][j]);
	            }
	            System.out.println();
	        } 
	       
	    }
	}
		




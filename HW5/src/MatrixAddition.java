public class MatrixAddition 
{
	public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b)
	{
		//creates new matrix with same dimensions as a and b, assuming that the two are the same size
		double[][] newMat = new double[a.length][a[0].length];
				
		//for loop to cycle through the new arrays and insert values into the new matrix
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				newMat[i][j] = a[i][j] + b[i][j];
			}
		}
		return newMat;
	}
	
	public static void main(String[] args)
	{
		//initiates two new matrices to be combined.
		double[][] matrixA = 
			{
				{1,2,3},
				{1,2,3},
				{1,2,3},
			};
		
		double[][] matrixB = 
			{
				{3,2,1},
				{3,2,1},
				{3,2,1},
			};
		
		//creates new added matrix
		double[][] matrixC = addMatrix(matrixA, matrixB);
		
		//cycles through the new matrix and prints out the values in the same size as the matrix
		for(int i = 0; i < matrixC.length; i++)
		{
			for(int j = 0; j < matrixC[i].length; j++)
			{
				System.out.print(matrixC[i][j] + " ");
			}
			System.out.println();
		}
		}
		
	}


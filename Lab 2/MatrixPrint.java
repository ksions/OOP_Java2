package lab2;

public class MatrixPrint 
{

	public static void main(String[] args) 
	{
		int [][] M = new int [5][5];
		M[0][0] = 0; M[0][1] = 2; M[0][2] = 3; M[0][3] = 4; M[0][4] = 0; M[1][0] = 6;
		M[1][1] = 0; M[1][2] = 8; M[1][3] = 0; M[1][4] = 10; M[2][0] = 11; M[2][1] = 12;
		M[2][2] = 0; M[2][3] = 14; M[2][4] = 15; M[3][0] = 16; M[3][1] = 0; M[3][2] = 18;
		M[3][3] = 0; M[3][4] = 20; M[4][0] = 0; M[4][1] = 22; M[4][2] = 23; M[4][3] = 24;
		M[4][4] = 0;
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(M[i][j] == 0)
				{
					System.out.print(" * ");
				} 
				else
				{
					if(M[i][j] > 10)
					{
						System.out.print(M[i][j] + " ");
					}
					else if(M[i][j] < 10 && M[i][j] > 1)
					{
						System.out.print(" "+ M[i][j] + " ");
					}
					else
					{
						System.out.print(10 + " ");
					}
						
				}
			}
			System.out.println();	
		}
		
	}

}

package javaIntro;

public class Java19MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 2 4 5 7
		 7 8 3 4
		 un pwd - admin
		 un pwd - teacher
		 un pwd - student 
		 */
		int a[][] = new int[2][4];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[0][3] = 7;
		a[1][0] = 7;
		a[1][1] = 8;
		a[1][2] = 3;
		a[1][3] = 4;
		
		int b[][] = {{2,4,5,7,2},{7,8,3,4,5},{1,2,3,4,5}};
		
		for (int i = 0; i< 3; i++)
		{
			for (int j =0; j < 5; j++)
			{
				System.out.println(b[i][j]);
			}
			
		}
		
		
	}

}

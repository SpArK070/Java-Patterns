class AlphabetsPattern{
	public static void main (String [] args){
		int n=5;
		
		for(int i=0; i<n; i++){

			// Printing A
			for(int j=0; j<n; j++){
				if(i==0 || i==n/2 || j==0 || j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing B
			for(int j=0; j<n; j++){
				if(i==0 || i==n-1 || j==0 || i+j==n-1&&i<=n/2 || i==j && i>=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing C
			for(int j=0; j<n; j++){
				if(i==0 || i==n-1 || j==0 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing D
			for(int j=0; j<n; j++){
				if(i==0 && j<=n/2 || i==n-1 && j<=n/2 || j==0 || i==j-n/2 || i+j==n-1+n/2 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing E
			for(int j=0; j<n; j++){
				if(i==0 || i==n-1 || j==0 || i==n/2 && j<=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing F
			for(int j=0; j<n; j++){
				if(i==0 || j==0 || i==n/2 && j<=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			//Printing G
			for(int j=0; j<n; j++){
				if(i==0 || i==n-1 || j==0 || j==n-1 && i>=n/2 || i==n/2 && j>=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing H
			for(int j=0; j<n; j++){
				if(j==0 || j==n-1 || i==n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing I
			for(int j=0; j<n; j++){
				if(i==0 || i==n-1 || j==n/2 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing J
			for(int j=0; j<n; j++){
				if(i==0 || i==n-1 && j<=n/2 || j==n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing K
			for(int j=0; j<n; j++){
				if(j==0 || i==n/2 && j<=n/2 || i+j==n-1&&i<=n/2 || i==j && i>=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			//Printing L
			for(int j=0; j<n; j++){
				if(j==0 || i==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing M
			for(int j=0; j<n; j++){
				if(j==0 || j==n-1 || i+j==n-1&&i<=n/2 || i==j && i<=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing N
			for(int j=0; j<n; j++){
				if(j==0 || j==n-1 || i==j )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");
			
			// Printing O
			for(int j=0; j<n; j++){
				if(j==0 || i==0 || i==n-1 || j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");
			//Printing P
			for(int j=0; j<n; j++){
				if(j==0 || i==0 || i==n/2 || j==n-1 && i<=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			//Printing Q

			for(int j=0; j<n; j++){
				if(j==0 || i==0 || i==n-1 && j<=n/2 || j==n-1 && i<=n/2 || i==j && i>=n/2 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			//Printing R
			for(int j=0; j<n; j++){
				if(j==0 || i==0 || i+j==n-1&&i<=n/2 || i==j && i>=n/2 || i==n/2 && j<=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			//Printing S
			for(int j=0; j<n; j++){
				if(i==0 || i==n-1 || i==n/2  || j==0 && i<=n/2 || j==n-1 && i>=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing T
			for(int j=0; j<n; j++){
				if(j==n/2 || i==0 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			//Printing U
			for(int j=0; j<n; j++){
				if(j==0 || i==n-1 || j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing V
			for(int j=0; j<n; j++){
				if(j==0 && i<=n/2 || i<=n/2 && j==n-1 || i+j==n-1+n/2 && j>=n/2 || i==j+n/2 && j<=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			//Printing W
			for(int j=0; j<n; j++){
				if(j==0 || j==n-1 || i+j==n-1&&i>=n/2 || i==j && i>=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing X
			for(int j=0; j<n; j++){
				if(i==j || i+j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			// Printing Y
			for(int j=0; j<n; j++){
				if(j==n/2 && i>=n/2 || i+j==n-1 && i<=n/2 || i==j && i<=n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\t");

			//Printing Z
			for(int j=0; j<n; j++){
				if(i==0 || i==n-1 || i+j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();

		}
	}
}
package Uncodemy;

public class Class30 {

	public static void main(String[] args) {
	done:
			for(int i=0; i<3; i++) 
			{ 
				for(int j=0; j<3; j++)
				{
			for(int k=0; k<3; k++)
			{
				System.out.println(k);
			if(k == 2) 
				break done; // jump to done
			}
			System.out.println("After k loop"); // skipped
			}
			System.out.println("After j loop"); // skipped
			}
			System.out.println("After i loop");
	}

}

import java.util.Scanner;
public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your roll no");
		int x = sc.nextInt();
		
		if(x%4==1)
		{
			
			System.out.println("you are in Emral group");
			
		}
		else 
			if(x%4==2)
		{
			
				System.out.println("you are in Ruby group");
			
		}
			else
				if(x%4==3)
				{
					
						System.out.println("you are in Pearls group");
					
				}
				else 	if(x%4==0)
				{
					
					System.out.println("you are in saphire group");
				
			}
			
		}
}

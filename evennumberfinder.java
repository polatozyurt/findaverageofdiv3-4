import java.util.Scanner ;
public class evennumberfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The program that finds  the even numbers between 0 till the number taken from the user	
		
		Scanner input = new Scanner(System.in);
		int num, avg1,i, count;	
		System.out.print("Enter a number: ");
		num =input.nextInt();
		avg1 =0 ;
		count = 0 ;
		for(i=1; i<num; i++) {
			if(i%3==0 && i%4 == 0) {
				avg1=avg1+i ;
				//System.out.print(i + ",");
				//System.out.print("\n" +avg1 + ",");
				count++ ;
			}
			
			
		
		
			
		}
		System.out.print(avg1/count);

}
}

package Assignment_nov9;

public class Add {
	//variable argument
	
		void add(int ...y)
		{
		int sum=0;
		for(int u:y)
			sum+= u;
		System.out.println(sum);
		}
	
		void add2(String ...y)
		{
		
		for(String  u:y)
		{
			System.out.println(u.charAt(0));
		}}
		
	public static void main(String... args) {
	Add a= new Add();
	a.add(2,3,4,5,6,7,78,8);
	
	a.add2("neha","priya","abc");
	
	}

}
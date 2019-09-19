public class CallByValue {

	public int add(int a,int b)
	{
		a=100;
		int result=a+b;
		return result;
		
	}
	public static void main(String[] args) {
		
		int c[]= {20};
		System.out.println("The lenght of an Array is" +c.length);
		
		CallByValue callByValue=new CallByValue();
		int a=10;
		int b=20;
		System.out.println("Pass the value a before"+ a);
		System.out.println(callByValue.add(10,20));
		System.out.println(" a value after Pass the value a before"+ a);
		

	}

}

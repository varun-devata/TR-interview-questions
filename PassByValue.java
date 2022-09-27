//in pass by value the copy of a variable is passed to the method 
//changes done by the method will be only inside the method
//original value of the variable will not change
public class PassByValue {
	
	public void fun(int a) {
		a++;
		System.out.println("Value of a inside fun metod " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("Value of a before passing " + a);
		PassByValue obj = new PassByValue();
		obj.fun(a);
		System.out.println("Value of a after passing " + a);
	}
	

}

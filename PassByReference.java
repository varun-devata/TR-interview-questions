
public class PassByReference {
	
	public void fun(int[] arr) {
		arr[1] = 90;
		System.out.println("Marks of 2nd subject inside method " + arr[1]);
	}

	public static void main(String[] args) {
		
		int[] marks = {45, 60, 72};
		System.out.println("Marks of 2nd subject before changing " + marks[1]);
		
		PassByReference obj = new PassByReference();
		
		obj.fun(marks);
		System.out.println("Marks of 2nd subject after changing " + marks[1]);
		

	}

}

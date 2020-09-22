package week12b;

//import java.util.Scanner;

public class human {
	
	String name;
	String eyecolor;
	int age;
	int height;
	
	public human() {
		super();
		
		
	}
	
	public void display() {
//		Scanner nam = new Scanner(System.in);
//		Scanner year = new Scanner(System.in);
//		Scanner hig = new Scanner(System.in);
//		Scanner eye = new Scanner(System.in);
//		String name = nam.nextLine();
//		int age = year.nextInt();
//		int height = hig.nextInt();
//		String eyecolor = eye.nextLine();
		System.out.println("Hello my name is "+name);
		System.out.println("I am "+age+" year old");
		System.out.println("I am "+height+" inches tall");
		System.out.println("My eye color is "+eyecolor);
		System.out.println("==========="+name+"==========");
		
	}
	public void eat() {
		System.out.println("Eating.....");
	}
	public void walk() {
		System.out.println("Walking....");
	}
	public void work() {
		System.out.println("Working....");
	}
	
	
	
	
	
}
//	
//	
//	
//	void display(){
//		int i;
//		Scanner myin = new Scanner(System.in);
//		int a = myin.nextInt();
//		int j ;
//		for(i=1;i<=a;++i	) {	
//			
//			System.out.println(i+ "*" );
//			}
//		
//	}
//	
//	public static void main(String[]args) {
//		human h1 = new human();
//		Scanner myin = new Scanner(System.in);
//		h1.display();
//	
//	
//	}
//}

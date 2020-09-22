package week12b;

public class animal {
	int age;
	String gender;
	int weight;
	public animal(int a,String g,int w){
		age = a ;
		gender = g;
		weight =w;
		System.out.println(a+" "+g+" "+w);
	}
	
	void eat() {
		System.out.println("Eating....");
	}
	void walk() {
		System.out.println("Walking....");
	}
	void sleep() {
		System.out.println("Sleeping....");
	}
}

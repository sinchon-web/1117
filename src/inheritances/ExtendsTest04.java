package inheritances;

class A{
	int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
	}
	
	
}
class B extends A{
	int a=100;
	int c=200;
	
	@Override//재정의
	void disp() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
}


public class ExtendsTest04 {

	public static void main(String[] args) {
		A a=new A();
		a.disp();
		System.out.println("--------");
		B b=new B();
		b.disp();
		
		System.out.println("--------");
		
		A ab=new B();
		System.out.println(ab.a);//A.a
		System.out.println(ab.b);//A.b
		//System.out.println(ab.c);//A에는 c가 없습니다.
		System.out.println("-----------");
		ab.disp();

	}

}

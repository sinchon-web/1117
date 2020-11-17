package inheritances;

class DD{
	int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
		System.out.println(b);
	}

	
	 
	public DD(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
}

class FF extends DD{
	//super()생략되어있다.
	//부모클래스 default생성자가 존재하지 않으면
	//부모에 존재하는 생성자를 명시하면 된다. super(a, b)
	public FF(int a, int b) {
		super(a, b);
	}
	
	int a=100;
	int c=200;
	void disp() {
		System.out.println(this.a);
		System.out.println(c);
		System.out.println(b);
		System.out.println(super.a);
		//부모클래스의 멤버와 서브클래스의 멤버를 구별할때 사용.
	}
	
}

public class ExtendsTest03 {

	public static void main(String[] args) {
		FF ff=new FF(1,2);
	}

}

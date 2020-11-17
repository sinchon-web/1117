package inheritances;

class AA{
	void disp() {
		System.out.println("AAA클래스입니다");
	}
}
class BB extends AA{
	void display() {
		System.out.println("BBB클래스입니다");
	}
	void disp() {
		System.out.println("BBB의 disp입니다");
	}
}

public class ExtendsTest02 {

	public static void main(String[] args) {
		
		BB bb=new BB();
		bb.disp();
		bb.display();
		
		AA aa=new AA();
		aa.disp();

	}

}

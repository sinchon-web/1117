package inheritances;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
//클래스내부에 추상메서드를 포함하고 있으면 추상클래스가 되어야합니다.
//추상클래스가 추상메서드를 꼭 포함하는것은 아니다.
abstract class XX{
	
	//추상메서드
	abstract void display() ;
}

abstract class ZZ{
	int a;
	public ZZ() {}
}

class ZZ_Sub extends ZZ{
	
}

class YY extends XX{

	@Override
	void display() {
		System.out.println("YY클래스의 display");
	}
	
}


public class ExtendsTest05 {
	public static void main(String[] args) throws FileNotFoundException {
		
		ZZ zz= new ZZ_Sub();
		
		XX xy=new YY();
		//Object ob=new YY();
		//InputStream is=new FileInputStream("");
		xy.display();
		
	}

}

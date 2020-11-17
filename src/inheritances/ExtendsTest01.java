package inheritances;

class AAA{
	int a=10;
	int b=20;
}

class AAA_Sub extends AAA{
	int c=100;
	int a=1000;
}

class CCC extends AAA{
	int x;
}
class DDD extends CCC{
	
}

public class ExtendsTest01 {

	public static void main(String[] args) {
		//단일상속만 가능
		AAA_Sub aaa=new AAA_Sub();
		
		System.out.println(aaa.c);
		System.out.println(aaa.a);
		System.out.println(aaa.b);

	}

}

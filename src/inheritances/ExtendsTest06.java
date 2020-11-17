package inheritances;

class Animal{}

//포유류는 동물입니다. Mammal IS-A Animal
class Mammal extends Animal{}
//파충류는 동물입니다. Reptile IS-A Animal
class Reptile extends Animal{}

//강아지는 포유동물입니다. Dog IS-A Mammal 
class Dog extends Mammal{}

//고로, 강아지는 동물입니다. Dog IS-A Animal

public class ExtendsTest06 {
	public static void main(String[] args) {
		Animal a=new Animal();
		Mammal m=new Mammal();
		Dog d=new Dog();
		
		System.out.println( m instanceof Animal);
		System.out.println( d instanceof Mammal);
		System.out.println( d instanceof Animal);
		
		//부산을갑니다.
	}

}

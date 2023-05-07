//final used for constant , declare method as final
final class Parent_2{
	
}

//Error due to final keyword that makes class unable to inherit

//class Child_2 extends Parent_2 {
//	
//}

final class Mymath{
	private Mymath() {
		
	}
	static final double PI = 3.14;
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Private makes it unable to make obj
//		Mymath obj = new Mymath();
//		obj.PI = 2.14;
		//Mymath.PI = 2.14;//static keyword makes it able but final unable to change
		System.out.println(Mymath.PI);
		
	}

}

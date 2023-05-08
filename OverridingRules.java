class Parent{
	void show() {
		System.out.println("Show....");
	}
}
class Child extends Parent{
	@Override //accessibility should be large according to Rule-1~weaker access rule(>=)
	void show() {
		System.out.println("Show...");
	}
}

class User{
	Parent show() {
		Parent obj = new Parent();
		return obj;
	}
	
	int show(int x,int y) {
		return x + y;
	}
}
class PrimeUser extends User{
	@Override //datatype should be same + numbers of variable
	int show(int x,int y) {
		return x - y;
	}
	
	@Override //different signature but no error bcoz Child extends Parent 
	//Rule 2~ Covariant Datatype
	Child show() {
		Child obj = new Child();
		return obj;
	}
}
public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

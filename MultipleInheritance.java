class Grandfather{
	int x=10;
	
}
class Father extends Grandfather{
	int x=20;
}
class Son extends Father{
	int x=30;
	public Son(int x) {
		// 40 + 30 + 20 + 10 = 100
		int total = x + this.x + super.x + ((Grandfather)this).x;
		System.out.println("total :"+ total);
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj = new Son(40);
	}

}

class Parent_1{
	int x;
	public Parent_1() {
		super();//by default calls
		x=20;
		System.out.println("Parent class const......");
	}
}
class Child_1 extends Parent_1{
	int x;
	public Child_1(){
		super(); //java internally uses super
		x=50;
		System.out.println("child class const..........");
	}
	public Child_1(int x) {
		this(); // calls upper constructor where x=50
		//30 + 50 + 20
		int total = x + this.x +super.x;
		System.out.println("child class param const.........." + total);
	}
}
public class SuperVsthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Child_1 c=new Child_1();
		Child_1 ch=new Child_1(30);
	}

}

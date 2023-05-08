class Emp{
	static int count=100;
	int id;
	String name;
	String dept;
	public Emp(String name, String dept) {
		count++;
		this.id=count;
		this.name=name;
		this.dept=dept;
		
	}
	void show() {
		System.out.println(name+" Id = "+id);
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
		Emp obj= new Emp("Ram" , "IT");
//		System.out.println(obj.name+" Your Id is : "+obj.id);
		obj.show();
		Emp obj1=new Emp("Krishna", "DevOps");
//		System.out.println(obj1.name+" Your Id is : "+obj1.id);
		obj1.show();
		
		obj.show();
	}

}

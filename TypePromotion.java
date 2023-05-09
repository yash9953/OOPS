//Type Promotion
//
//int > long 
//int  > float > double
//(Wrapper)float > Integer > Long > Double > var args..

public class TypePromotion {
	
	void show (byte x) {
		System.out.println("Byte x.....");
	}
	void show (short x) {
		System.out.println("short x.....");
		
	}
	void show (int x) {
		System.out.println("int x.....");
	}
	void show (int ...x) {
		System.out.println("variable length args int x.....");
	}
	void show (long x) {
		System.out.println("long x.....");
	}
	void show (float x) {
		System.out.println("float x.....");
	}
	void show (Float x) {
		System.out.println("Float wrapper x.....");
	}
	void show (Integer x) {
		System.out.println("Integer wrapper x.....");
	}
	void show (double x) {
		System.out.println("Double x.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromotion obj = new TypePromotion();
		obj.show(10);
	}

}

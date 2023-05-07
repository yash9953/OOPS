interface IPlayer{
	//void walk();		// public abstract void walk();
	default void walk() {
		
	}
	//void run();
	default void run() {
		
	}
	//void jump();
	default void jump() {
		
	}
	void punch();
	void kick();
	int SPEED = 10; 	// public final int SPEED =10;
}

// class used for common use of 3 variable
//abstract class common implements IPlayer{
//
//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void jump() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
//}
class King implements IPlayer{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	} 

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}
	
}

class Paul implements IPlayer{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Inteface {

	public static void main(String[] args) {
		

	}

}

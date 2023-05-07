
//Loan extends class parent class Object
class Loan{
	void applyForLoan() {
		System.out.println("Loan Apply Process....");
	}
	void roi() {
		System.out.println("Roi is 8.5% ");
	}
	void timePeriod() {
		System.out.println("Time Period should be 12 months");
	}
}

class HomeLoan extends Loan{
	@Override
	void roi() {
		System.out.println("ROI is 10.00%");
	}
	void eligibility() {
		System.out.println("Your salary must be greater than 50k");
	}
}

class EduLoan extends Loan{
	void repay() {
		
	}
	@Override
	void timePeriod() {
		System.out.println("Time Period should be 24 months");
	}
	void replay() {
		System.out.println("On full payment you will be charged 2% Extra");
	}
}

public class IsADemo {
	
	//Polymorphic call
	void caller(Loan loan) {
		loan.applyForLoan();
		loan.roi();
		loan.timePeriod();
		
		//DownCasting
		if(loan instanceof HomeLoan) {
			HomeLoan home = (HomeLoan)loan;
			home.eligibility();
		}
		else if(loan instanceof EduLoan) {
			EduLoan edu = (EduLoan)loan;
			edu.repay();
		}
	}

	public static void main(String[] args) {
		
		
		IsADemo obj = new IsADemo();
		obj.caller(new HomeLoan());
		obj.caller(new EduLoan());
		
//		HomeLoan home = new HomeLoan();
//		home.applyForLoan();		//Loan class
//		home.roi();					//HomeLoan(Override)
//		home.timePeriod();
//		home.eligibility();
//		
//		EduLoan edu = new EduLoan();
//		edu.applyForLoan();
//		edu.roi();
//		edu.timePeriod();			//EduLoan(Override)
//		edu.repay();				//EduLoan(Self)
		
		//UpCasting - Object type is parent class
		//methods are binded with type of object
//		Loan loan = new HomeLoan();
//		loan.applyForLoan();		
//		loan.roi();					
//		loan.timePeriod();
//		loan.eligibility();
//		
//		loan = new EduLoan();
//		loan.applyForLoan();
//		loan.roi();
//		loan.timePeriod();			
//		loan.repay();				
	}	

}

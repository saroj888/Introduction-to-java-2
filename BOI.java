package Assign_2;

public class BOI extends Bank {
	String branchId;

	public BOI(String city, float roi, String branchId) {
		super(city, roi);
		this.branchId = branchId;
	}

	public void getDetails() {
		super.getDetails();
		System.out.println("BranchId " + branchId);
	}
}
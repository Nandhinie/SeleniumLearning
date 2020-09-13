package week1.day1;

public class Mobile {
	long mobNumber=9886747248L;
	String mobColor="White";
	double mobWeight =3.45;
	boolean isRefurbished=false;

	public void makeCall() {
		System.out.println("Make Call to the number XXX");
	}
	
	public void sendMessage() {
		System.out.println("Send Text message to XXX");
	}
	
	public void takePhoto() {
		System.out.println("Take pictures");
	}
	
	public static void main(String[] args) {
		Mobile key = new Mobile();
		key.makeCall();
		key.takePhoto();
		key.sendMessage();
		System.out.println(key.mobNumber);
		System.out.println(key.mobColor);
		System.out.println(key.mobWeight);
		boolean refrbh = key.isRefurbished;
		System.out.println(refrbh);
	}
}

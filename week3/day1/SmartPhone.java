package week3.day1;

public class SmartPhone extends AndroidPhone{

	
	public void connectWhatsapp() {
		System.out.println("connected to Whatsapp ");
	}
	
	public void takeVideo() {
		System.out.println("Smart Phone Video - overriding - executes method in child class only");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone SP = new SmartPhone();
		SP.sendMsg();
		SP.makeCall();
		SP.saveContact();
		SP.connectWhatsapp();
		SP.takeVideo();


	}

}

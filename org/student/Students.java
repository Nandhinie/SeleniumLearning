package org.student;

public class Students {
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("ID : "+id);

	}
	
	public void getStudentInfo(int id,String name) {
		// TODO Auto-generated method stub
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);

	}
	
	public void getStudentInfo(String email,long phonenumber) {
		// TODO Auto-generated method stub
		System.out.println("Email : "+email);
		System.out.println("Ph No : "+phonenumber);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud=new Students();
		stud.getStudentInfo(535028);
		stud.getStudentInfo("nandhini@gmail.com",978676785);
		stud.getStudentInfo(535028,"Nandhini");

	}

}

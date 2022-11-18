package studentInformationSystem;

public class Teacher {
	String name;
	String mpno;
	String branch;
	public Teacher(String name, String mpno, String branch) {
		super();
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
	void print() {
		System.out.println("Name: "+this.name);
		System.out.println("Phone Number: "+this.mpno);
		System.out.println("Branch:  "+this.branch);
		
	}

}

package studentInformationSystem;

public class Main {

	public static void main(String[] args) {
		 Teacher t1=new Teacher("Mahmut Hoca","0555","TRH");
	        Teacher t2=new Teacher("Graham Bell","0554","FZK");
	        Teacher t3=new Teacher("Külyutmaz","0534","BIO");

	        Course tarih=new Course("Tarih","101","TRH");
	        tarih.addTeacher(t1);
	        Course fizik=new Course("Fizik","1020","FZK");
	        fizik.addTeacher(t2);
	        Course biyoloji=new Course("Bİyoloji","103","BIO");
	        biyoloji.addTeacher(t3);

	        Student s1=new Student("Kerimcan Durmaz",4,"40",tarih,fizik,biyoloji);
	        s1.addBulkExamNote(100,50,95,100,80,90);
	        s1.printNote();
	        s1.isPass();
	        Student s2=new Student("Danla Biliç",4,"41",tarih,fizik,biyoloji);
	        s2.addBulkExamNote(40,90,10,90,80,70);
	        s2.printNote();
	        s2.isPass();
	}

}

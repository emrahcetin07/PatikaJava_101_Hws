package studentInformationSystem;

public class Student {
	 String name,stuNo;
	    int classes;
	    Course mat;
	    Course fizik;
	    Course kimya;
	    Course behaviourNote;
	    double avarage;
	    boolean isPass;


	    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
	        this.name = name;
	        this.classes = classes;
	        this.stuNo = stuNo;
	        this.mat = mat;
	        this.fizik = fizik;
	        this.kimya = kimya;
	        calcAvarage();
	        this.isPass = false;
	    }


	    public void addBulkExamNote(int mat, int fizik, int kimya,int bnote1,int bnote2,int bnote3) {

	        if (mat >= 0 && mat <= 100) {
	            this.mat.note = mat;
	        }

	        if (fizik >= 0 && fizik <= 100) {
	            this.fizik.note = fizik;
	        }

	        if (kimya >= 0 && kimya <= 100) {
	            this.kimya.note = kimya;
	        }
	        if (bnote1>=0 && bnote1<=100){
	            this.mat.behaviourNote=bnote1;
	        }
	        if (bnote2>=0 && bnote2<=100){
	            this.fizik.behaviourNote=bnote2;
	        }
	        if (bnote3>=0 && bnote3<=100){
	            this.kimya.behaviourNote=bnote3;
	        }

	    }

	    public void isPass() {
	    	this.avarage=(((this.mat.note*0.80)+(this.mat.behaviourNote*0.20))
                    +((this.fizik.note*0.80)+(this.fizik.behaviourNote*0.20))
                    +((this.kimya.note*0.80)+(this.kimya.behaviourNote*0.20)))/3.00;
    System.out.println("============================");
    if (this.avarage>55){
        System.out.println("Sınıfı geçtiniz.");
        this.isPass=true;
    }else {
        System.out.println("Sınıfta kaldınız.");
        this.isPass=false;
	    }
	    }

	    public void calcAvarage() {
	        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
	    }

	    public boolean isCheckPass() {
	        calcAvarage();
	        return this.avarage > 55;
	    }

	    public void printNote(){
	        System.out.println("=========================");
	        System.out.println("Öğrenci : " + this.name);
	        System.out.println("Öğrenci : " + this.classes);
	        System.out.println("Matematik Notu : " + this.mat.note);
	        System.out.println("Matematik Sözlü Notu : " + this.mat.behaviourNote);
	        System.out.println("Fizik Notu : " + this.fizik.note);
	        System.out.println("Fizik Sözlü Notu : " + this.fizik.behaviourNote);
	        System.out.println("Kimya Notu : " + this.kimya.note);
	        System.out.println("Kimya Sözlü Notu : " + this.fizik.behaviourNote);
	    }
}

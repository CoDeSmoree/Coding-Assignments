package Module2;
//Write a program that uses a default constructor and a parameterized constructor to
//initialize objects of a class Student.
public class Student {
    static int usn;
    static char grade;
    static double marks;
    static String remarks;
    Student(){
        usn=0;
        grade='F';
        marks=0.0;
        remarks="failed";
    }
    Student(int usn, char grade, double marks, String remarks){
        this.usn=usn;
        this.grade=grade;
        this.marks=marks;
        this.remarks=remarks;

    }
    static void display(){
        System.out.println("USN: "+usn);
        System.out.println("Grade: "+ grade);
        System.out.println("Marks: "+marks);
        System.out.println("Remarks: "+remarks);

    }
    public static void main(String[] args) {
        Student def= new Student();
        def.display();
        Student par= new Student(5,'A',69.7,"First class");
        par.display();
    }
}

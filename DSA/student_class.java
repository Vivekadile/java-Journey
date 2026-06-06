

public class student_class {
    String name;
    int r;
    double marks;

    void display_info()
    {
        System.out.println("Name:-" +name);
        System.out.println("Roll number"+ r);
        System.out.println("marks:" +marks);
    }

    boolean isPassed()

    {
        return marks >40;
    }

    public static void main(String[] args) 
    { 
        student_class student1 =new student_class();
        student_class student2 =new student_class();

        student1.name="Alice";
        student1.r=101;
        student1.marks=85.5;

        student2.name="Job";
        student2.r=103;
        student2.marks=35.5;

        student1.display_info();
        student1.isPassed();

        student2.display_info();
        student2.isPassed();
        



        
    }

    
}

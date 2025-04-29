class Student_Course{
    String course;
    int marks;

     Student_Course(String course, int marks){
        this.course = course;
        this.marks = marks;
    }
    void display(){
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }

    
}

public class Demo2 {

    public static void main(String[] args) {
        
        Student_Course s1 = new Student_Course("DevOps", 100);
        Student_Course s2 = new Student_Course("BDA", 90);
        Student_Course s3 = new Student_Course("BDA", 90);

       
        s1.display();
        s2.display();
        s3.display();
        
    } 

}   

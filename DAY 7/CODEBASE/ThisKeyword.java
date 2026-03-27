class Student{
    String name;
    int rollno;
    String dept;
    Student(String name,int rollno,String dept){
        this.name=name;
        this.rollno=rollno;
        this.dept=dept;
    }
    void display(){
        System.out.println("Name : "+name +"Roll No : "+rollno+" Department : "+dept );
    }
}


public class ThisKeyword {
    public static void main(String[] args) {
        Student student1=new Student("Dhivya ",962,"10th");
        student1.display();
        Student student2=new Student("Dhivya ",432,"12th");
        student2.display();
        Student student3=new Student("Dhivya ",328,"CSE");
        student3.display();

    }
}
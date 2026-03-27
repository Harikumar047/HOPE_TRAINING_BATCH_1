class Student {
    String name;
    int rollNo;
    String department;

    Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
    }
}

class Undergraduate extends Student {
    int m1, m2, m3;

    Undergraduate(String name, int rollNo, String department, int m1, int m2, int m3) {
        super(name, rollNo, department);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void calculate() {
        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 90)
            System.out.println("Grade: A");
        else if (avg >= 75)
            System.out.println("Grade: B");
        else if (avg >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }

    void display() {
        super.display();
        calculate();
    }
}
class Postgraduate extends Student {
    int m1, m2, m3;

    Postgraduate(String name, int rollNo, String department, int m1, int m2, int m3) {
        super(name, rollNo, department);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void calculate() {
        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 85)
            System.out.println("Grade: Distinction");
        else if (avg >= 70)
            System.out.println("Grade: First Class");
        else if (avg >= 50)
            System.out.println("Grade: Second Class");
        else
            System.out.println("Grade: Fail");

        if (m1 >= 50 && m2 >= 50 && m3 >= 50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }

    void display() {
        super.display();
        calculate();
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Undergraduate ug = new Undergraduate("Hari", 1, "Computer Science", 85, 78, 90);
        Postgraduate pg = new Postgraduate("Gabiriel", 2, "Data Science", 72, 68, 80);

        System.out.println("----- Undergraduate Student -----");
        ug.display();

        System.out.println("\n----- Postgraduate Student -----");
        pg.display();
    }
}


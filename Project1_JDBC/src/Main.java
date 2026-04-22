public class Main{
    public static void main(String[] args)throws SQLException{
        StudentDAO dao= new StudentDAO;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a name");
        String name = sc.next();
        System.out.print("Enter the marks of the student:");
        int marks = sc.nextInt();
        dao.addStudent(new Student(0,name,marks));
        for(Student s: students){
            System.out.printf("%d %s %d", s.getId(),s.getName(),s.getMarks());
        }
    }
}
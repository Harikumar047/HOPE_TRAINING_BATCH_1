import java.sql.*;
pubilc class StudentDAO{
    public void addStudent(Student s)throws SQLException{
        String query="INSERT INTO students (name , marks) VALUE (?,?,?);"
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.PreparedStatement(query);
        }catch(Exception e ){
            System.out.println(e);
        }
    }
    public List<Student> getAllStudent() throws SQLException{
        List<Student> list = new Arraylist<>();
        String query = "SELECT * FROM students";
        try{
            Connection  con = DBConnection.getConnection();
            PreparedStatement ps = con.PreparedStatement(query);
            ResultSet res = ps.result(query);
        }
    }
}
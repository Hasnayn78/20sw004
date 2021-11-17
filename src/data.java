import java.sql.*;
public class data {

    public static void main(String[] args) {
        String name;
        String rollno;
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "200378");
            Statement st=con.createStatement();
            ResultSet set=st.executeQuery("select *from record");
            while(set.next()){
                name=set.getString("name");
                rollno=set.getString("Roll no");
                System.out.println(name+"\t"+rollno);
            }
            st.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
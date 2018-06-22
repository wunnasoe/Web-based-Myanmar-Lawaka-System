package Database;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOtherRecords {
	private static Connection con = null;
	public static void createDBConnection(){
		String connectionURL = "jdbc:mysql://localhost/lawaka?useUnicode=yes&characterEncoding=UTF-8";
		String user = "root";
		String pass = "root";
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(connectionURL, user, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	    
	}
	public static int userNo_Update(int no) throws SQLException{
		createDBConnection();
		Statement stmt = con.createStatement();
		int updateNo = no-1;
		int result=0;
		result = stmt.executeUpdate("update user set no="+updateNo+" where no="+no+";");
		con.close();
		return result;
	}
	public static int userName_Update(int no,String newName) throws SQLException{
		createDBConnection();
		Statement stmt = con.createStatement();
		int result=0;
		result = stmt.executeUpdate("update user set name='"+newName+"' where no="+no+";");
		con.close();
		return result;
	}
	public static int userPassword_Update(int no,String newPwd) throws SQLException{
		createDBConnection();
		Statement stmt = con.createStatement();
		int result=0;
		result = stmt.executeUpdate("update user set password='"+newPwd+"' where no="+no+";");
		con.close();
		return result;
	}
	public static int deleteUser(int no) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("delete from user where no=?");
		pstmt.setInt(1, no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Name(String serial_no,String newName) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set name =? where serial_no=?");
		pstmt.setString(1, newName);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_DoB(String serial_no,String newDoB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set date_of_birth =? where serial_no=?");
		pstmt.setString(1, newDoB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Nrc_no(String serial_no,String newNrc_no) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set nrc_no =? where serial_no=?");
		pstmt.setString(1, newNrc_no);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_UsefulLaw(String serial_no,String newUsefulLaw) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set useful_law =? where serial_no=?");
		pstmt.setString(1, newUsefulLaw);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Frc_front(String serial_no,InputStream newFrcF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set frc_front =? where serial_no=?");
		pstmt.setBlob(1, newFrcF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Frc_back(String serial_no,InputStream newFrcB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set frc_back =? where serial_no=?");
		pstmt.setBlob(1, newFrcB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Ucc1(String serial_no,InputStream newUcc1) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set ucc1 =? where serial_no=?");
		pstmt.setBlob(1, newUcc1);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Ucc2(String serial_no,InputStream newUcc2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set ucc2 =? where serial_no=?");
		pstmt.setBlob(1, newUcc2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Ucc3(String serial_no,InputStream newUcc3) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set ucc3 =? where serial_no=?");
		pstmt.setBlob(1, newUcc3);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Ucc4(String serial_no,InputStream newUcc4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set ucc4 =? where serial_no=?");
		pstmt.setBlob(1, newUcc4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Ucc5(String serial_no,InputStream newUcc5) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set ucc5 =? where serial_no=?");
		pstmt.setBlob(1, newUcc5);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Form1_front(String serial_no,InputStream newForm1_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set form1_front =? where serial_no=?");
		pstmt.setBlob(1, newForm1_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Form1_back(String serial_no,InputStream newForm1_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set form1_back =? where serial_no=?");
		pstmt.setBlob(1, newForm1_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Form2_front(String serial_no,InputStream newForm2_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set form2_front =? where serial_no=?");
		pstmt.setBlob(1, newForm2_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Form2_back(String serial_no,InputStream newForm2_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set form2_back =? where serial_no=?");
		pstmt.setBlob(1, newForm2_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Form59_4(String serial_no,InputStream newForm59_4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set form59_4 =? where serial_no=?");
		pstmt.setBlob(1, newForm59_4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Naing6ka_front(String serial_no,InputStream newNaing6kaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set naing6ka_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Naing6ka_back(String serial_no,InputStream newNaing6kaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set naing6ka_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Naing2_front(String serial_no,InputStream newNaing2F) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set naing2_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing2F);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Naing2_back(String serial_no,InputStream newNaing2B) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set naing2_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing2B);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Naing4(String serial_no,InputStream newNaing4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set naing4 =? where serial_no=?");
		pstmt.setBlob(1, newNaing4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Nrc(String serial_no,InputStream newNrc) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set nrc =? where serial_no=?");
		pstmt.setBlob(1, newNrc);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Eh4_4ka(String serial_no,InputStream newEh4_4ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set eh4_4ka =? where serial_no=?");
		pstmt.setBlob(1, newEh4_4ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Eh2(String serial_no,InputStream newEh2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set eh2 =? where serial_no=?");
		pstmt.setBlob(1, newEh2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Pju6_6ka(String serial_no,InputStream newPju6_6ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set pju6_6ka =? where serial_no=?");
		pstmt.setBlob(1, newPju6_6ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Pju8(String serial_no,InputStream newPju8) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set pju8 =? where serial_no=?");
		pstmt.setBlob(1, newPju8);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Statement(String serial_no,InputStream newStatement) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set statement =? where serial_no=?");
		pstmt.setBlob(1, newStatement);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Affidavit(String serial_no,InputStream newAffidavit) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set affidavit =? where serial_no=?");
		pstmt.setBlob(1, newAffidavit);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_ZazaNjanja_front(String serial_no,InputStream newZazaNjanjaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set zaza_njanja_affidavit_front =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_ZazaNjanja_back(String serial_no,InputStream newZazaNjanjaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set zaza_njanja_affidavit_back =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_TombRecord(String serial_no,InputStream newTombRecord) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set tomb_record =? where serial_no=?");
		pstmt.setBlob(1, newTombRecord);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFather_Other(String serial_no,InputStream newOther) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update father_record set other =? where serial_no=?");
		pstmt.setBlob(1, newOther);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Name(String serial_no,String newName) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set name =? where serial_no=?");
		pstmt.setString(1, newName);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_DoB(String serial_no,String newDoB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set date_of_birth =? where serial_no=?");
		pstmt.setString(1, newDoB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Nrc_no(String serial_no,String newNrc_no) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set nrc_no =? where serial_no=?");
		pstmt.setString(1, newNrc_no);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_UsefulLaw(String serial_no,String newUsefulLaw) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set useful_law =? where serial_no=?");
		pstmt.setString(1, newUsefulLaw);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Frc_front(String serial_no,InputStream newFrcF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set frc_front =? where serial_no=?");
		pstmt.setBlob(1, newFrcF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Frc_back(String serial_no,InputStream newFrcB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set frc_back =? where serial_no=?");
		pstmt.setBlob(1, newFrcB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Ucc1(String serial_no,InputStream newUcc1) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set ucc1 =? where serial_no=?");
		pstmt.setBlob(1, newUcc1);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Ucc2(String serial_no,InputStream newUcc2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set ucc2 =? where serial_no=?");
		pstmt.setBlob(1, newUcc2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Ucc3(String serial_no,InputStream newUcc3) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set ucc3 =? where serial_no=?");
		pstmt.setBlob(1, newUcc3);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Ucc4(String serial_no,InputStream newUcc4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set ucc4 =? where serial_no=?");
		pstmt.setBlob(1, newUcc4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Ucc5(String serial_no,InputStream newUcc5) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set ucc5 =? where serial_no=?");
		pstmt.setBlob(1, newUcc5);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Form1_front(String serial_no,InputStream newForm1_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set form1_front =? where serial_no=?");
		pstmt.setBlob(1, newForm1_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Form1_back(String serial_no,InputStream newForm1_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set form1_back =? where serial_no=?");
		pstmt.setBlob(1, newForm1_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Form2_front(String serial_no,InputStream newForm2_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set form2_front =? where serial_no=?");
		pstmt.setBlob(1, newForm2_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Form2_back(String serial_no,InputStream newForm2_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set form2_back =? where serial_no=?");
		pstmt.setBlob(1, newForm2_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Form59_4(String serial_no,InputStream newForm59_4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set form59_4 =? where serial_no=?");
		pstmt.setBlob(1, newForm59_4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Naing6ka_front(String serial_no,InputStream newNaing6kaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set naing6ka_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Naing6ka_back(String serial_no,InputStream newNaing6kaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set naing6ka_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Naing2_front(String serial_no,InputStream newNaing2F) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set naing2_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing2F);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Naing2_back(String serial_no,InputStream newNaing2B) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set naing2_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing2B);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Naing4(String serial_no,InputStream newNaing4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set naing4 =? where serial_no=?");
		pstmt.setBlob(1, newNaing4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Nrc(String serial_no,InputStream newNrc) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set nrc =? where serial_no=?");
		pstmt.setBlob(1, newNrc);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Eh4_4ka(String serial_no,InputStream newEh4_4ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set eh4_4ka =? where serial_no=?");
		pstmt.setBlob(1, newEh4_4ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Eh2(String serial_no,InputStream newEh2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set eh2 =? where serial_no=?");
		pstmt.setBlob(1, newEh2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Pju6_6ka(String serial_no,InputStream newPju6_6ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set pju6_6ka =? where serial_no=?");
		pstmt.setBlob(1, newPju6_6ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Pju8(String serial_no,InputStream newPju8) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set pju8 =? where serial_no=?");
		pstmt.setBlob(1, newPju8);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Statement(String serial_no,InputStream newStatement) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set statement =? where serial_no=?");
		pstmt.setBlob(1, newStatement);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Affidavit(String serial_no,InputStream newAffidavit) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set affidavit =? where serial_no=?");
		pstmt.setBlob(1, newAffidavit);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_ZazaNjanja_front(String serial_no,InputStream newZazaNjanjaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set zaza_njanja_affidavit_front =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_ZazaNjanja_back(String serial_no,InputStream newZazaNjanjaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set zaza_njanja_affidavit_back =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_TombRecord(String serial_no,InputStream newTombRecord) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set tomb_record =? where serial_no=?");
		pstmt.setBlob(1, newTombRecord);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMother_Other(String serial_no,InputStream newOther) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mother_record set other =? where serial_no=?");
		pstmt.setBlob(1, newOther);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Name(String serial_no,String newName) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set name =? where serial_no=?");
		pstmt.setString(1, newName);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_DoB(String serial_no,String newDoB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set date_of_birth =? where serial_no=?");
		pstmt.setString(1, newDoB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Nrc_no(String serial_no,String newNrc_no) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set nrc_no =? where serial_no=?");
		pstmt.setString(1, newNrc_no);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_UsefulLaw(String serial_no,String newUsefulLaw) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set useful_law =? where serial_no=?");
		pstmt.setString(1, newUsefulLaw);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Frc_front(String serial_no,InputStream newFrcF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set frc_front =? where serial_no=?");
		pstmt.setBlob(1, newFrcF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Frc_back(String serial_no,InputStream newFrcB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set frc_back =? where serial_no=?");
		pstmt.setBlob(1, newFrcB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Ucc1(String serial_no,InputStream newUcc1) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set ucc1 =? where serial_no=?");
		pstmt.setBlob(1, newUcc1);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Ucc2(String serial_no,InputStream newUcc2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set ucc2 =? where serial_no=?");
		pstmt.setBlob(1, newUcc2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Ucc3(String serial_no,InputStream newUcc3) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set ucc3 =? where serial_no=?");
		pstmt.setBlob(1, newUcc3);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Ucc4(String serial_no,InputStream newUcc4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set ucc4 =? where serial_no=?");
		pstmt.setBlob(1, newUcc4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Ucc5(String serial_no,InputStream newUcc5) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set ucc5 =? where serial_no=?");
		pstmt.setBlob(1, newUcc5);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Form1_front(String serial_no,InputStream newForm1_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set form1_front =? where serial_no=?");
		pstmt.setBlob(1, newForm1_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Form1_back(String serial_no,InputStream newForm1_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set form1_back =? where serial_no=?");
		pstmt.setBlob(1, newForm1_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Form2_front(String serial_no,InputStream newForm2_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set form2_front =? where serial_no=?");
		pstmt.setBlob(1, newForm2_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Form2_back(String serial_no,InputStream newForm2_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set form2_back =? where serial_no=?");
		pstmt.setBlob(1, newForm2_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Form59_4(String serial_no,InputStream newForm59_4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set form59_4 =? where serial_no=?");
		pstmt.setBlob(1, newForm59_4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Naing6ka_front(String serial_no,InputStream newNaing6kaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set naing6ka_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Naing6ka_back(String serial_no,InputStream newNaing6kaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set naing6ka_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Naing2_front(String serial_no,InputStream newNaing2F) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set naing2_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing2F);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Naing2_back(String serial_no,InputStream newNaing2B) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set naing2_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing2B);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Naing4(String serial_no,InputStream newNaing4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set naing4 =? where serial_no=?");
		pstmt.setBlob(1, newNaing4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Nrc(String serial_no,InputStream newNrc) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set nrc =? where serial_no=?");
		pstmt.setBlob(1, newNrc);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Eh4_4ka(String serial_no,InputStream newEh4_4ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set eh4_4ka =? where serial_no=?");
		pstmt.setBlob(1, newEh4_4ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Eh2(String serial_no,InputStream newEh2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set eh2 =? where serial_no=?");
		pstmt.setBlob(1, newEh2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Pju6_6ka(String serial_no,InputStream newPju6_6ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set pju6_6ka =? where serial_no=?");
		pstmt.setBlob(1, newPju6_6ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Pju8(String serial_no,InputStream newPju8) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set pju8 =? where serial_no=?");
		pstmt.setBlob(1, newPju8);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Statement(String serial_no,InputStream newStatement) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set statement =? where serial_no=?");
		pstmt.setBlob(1, newStatement);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Affidavit(String serial_no,InputStream newAffidavit) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set affidavit =? where serial_no=?");
		pstmt.setBlob(1, newAffidavit);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_ZazaNjanja_front(String serial_no,InputStream newZazaNjanjaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set zaza_njanja_affidavit_front =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_ZazaNjanja_back(String serial_no,InputStream newZazaNjanjaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set zaza_njanja_affidavit_back =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_TombRecord(String serial_no,InputStream newTombRecord) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set tomb_record =? where serial_no=?");
		pstmt.setBlob(1, newTombRecord);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGFather_Other(String serial_no,InputStream newOther) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandfather_record set other =? where serial_no=?");
		pstmt.setBlob(1, newOther);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Name(String serial_no,String newName) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set name =? where serial_no=?");
		pstmt.setString(1, newName);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_DoB(String serial_no,String newDoB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set date_of_birth =? where serial_no=?");
		pstmt.setString(1, newDoB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Nrc_no(String serial_no,String newNrc_no) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set nrc_no =? where serial_no=?");
		pstmt.setString(1, newNrc_no);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_UsefulLaw(String serial_no,String newUsefulLaw) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set useful_law =? where serial_no=?");
		pstmt.setString(1, newUsefulLaw);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Frc_front(String serial_no,InputStream newFrcF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set frc_front =? where serial_no=?");
		pstmt.setBlob(1, newFrcF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Frc_back(String serial_no,InputStream newFrcB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set frc_back =? where serial_no=?");
		pstmt.setBlob(1, newFrcB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Ucc1(String serial_no,InputStream newUcc1) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set ucc1 =? where serial_no=?");
		pstmt.setBlob(1, newUcc1);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Ucc2(String serial_no,InputStream newUcc2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set ucc2 =? where serial_no=?");
		pstmt.setBlob(1, newUcc2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Ucc3(String serial_no,InputStream newUcc3) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set ucc3 =? where serial_no=?");
		pstmt.setBlob(1, newUcc3);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Ucc4(String serial_no,InputStream newUcc4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set ucc4 =? where serial_no=?");
		pstmt.setBlob(1, newUcc4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Ucc5(String serial_no,InputStream newUcc5) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set ucc5 =? where serial_no=?");
		pstmt.setBlob(1, newUcc5);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Form1_front(String serial_no,InputStream newForm1_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set form1_front =? where serial_no=?");
		pstmt.setBlob(1, newForm1_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Form1_back(String serial_no,InputStream newForm1_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set form1_back =? where serial_no=?");
		pstmt.setBlob(1, newForm1_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Form2_front(String serial_no,InputStream newForm2_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set form2_front =? where serial_no=?");
		pstmt.setBlob(1, newForm2_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Form2_back(String serial_no,InputStream newForm2_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set form2_back =? where serial_no=?");
		pstmt.setBlob(1, newForm2_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Form59_4(String serial_no,InputStream newForm59_4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set form59_4 =? where serial_no=?");
		pstmt.setBlob(1, newForm59_4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Naing6ka_front(String serial_no,InputStream newNaing6kaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set naing6ka_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Naing6ka_back(String serial_no,InputStream newNaing6kaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set naing6ka_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Naing2_front(String serial_no,InputStream newNaing2F) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set naing2_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing2F);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Naing2_back(String serial_no,InputStream newNaing2B) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set naing2_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing2B);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Naing4(String serial_no,InputStream newNaing4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set naing4 =? where serial_no=?");
		pstmt.setBlob(1, newNaing4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Nrc(String serial_no,InputStream newNrc) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set nrc =? where serial_no=?");
		pstmt.setBlob(1, newNrc);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Eh4_4ka(String serial_no,InputStream newEh4_4ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set eh4_4ka =? where serial_no=?");
		pstmt.setBlob(1, newEh4_4ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Eh2(String serial_no,InputStream newEh2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set eh2 =? where serial_no=?");
		pstmt.setBlob(1, newEh2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Pju6_6ka(String serial_no,InputStream newPju6_6ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set pju6_6ka =? where serial_no=?");
		pstmt.setBlob(1, newPju6_6ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Pju8(String serial_no,InputStream newPju8) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set pju8 =? where serial_no=?");
		pstmt.setBlob(1, newPju8);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Statement(String serial_no,InputStream newStatement) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set statement =? where serial_no=?");
		pstmt.setBlob(1, newStatement);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Affidavit(String serial_no,InputStream newAffidavit) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set affidavit =? where serial_no=?");
		pstmt.setBlob(1, newAffidavit);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_ZazaNjanja_front(String serial_no,InputStream newZazaNjanjaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set zaza_njanja_affidavit_front =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_ZazaNjanja_back(String serial_no,InputStream newZazaNjanjaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set zaza_njanja_affidavit_back =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_TombRecord(String serial_no,InputStream newTombRecord) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set tomb_record =? where serial_no=?");
		pstmt.setBlob(1, newTombRecord);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateFGMother_Other(String serial_no,InputStream newOther) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update fgrandmother_record set other =? where serial_no=?");
		pstmt.setBlob(1, newOther);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMGFather_Name(String serial_no,String newName) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set name =? where serial_no=?");
		pstmt.setString(1, newName);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		pstmt.close();
    	con.close();
		return result;
	}
	public static int updateMGFather_DoB(String serial_no,String newDoB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set date_of_birth =? where serial_no=?");
		pstmt.setString(1, newDoB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Nrc_no(String serial_no,String newNrc_no) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set nrc_no =? where serial_no=?");
		pstmt.setString(1, newNrc_no);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_UsefulLaw(String serial_no,String newUsefulLaw) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set useful_law =? where serial_no=?");
		pstmt.setString(1, newUsefulLaw);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Frc_front(String serial_no,InputStream newFrcF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set frc_front =? where serial_no=?");
		pstmt.setBlob(1, newFrcF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Frc_back(String serial_no,InputStream newFrcB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set frc_back =? where serial_no=?");
		pstmt.setBlob(1, newFrcB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Ucc1(String serial_no,InputStream newUcc1) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set ucc1 =? where serial_no=?");
		pstmt.setBlob(1, newUcc1);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Ucc2(String serial_no,InputStream newUcc2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set ucc2 =? where serial_no=?");
		pstmt.setBlob(1, newUcc2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Ucc3(String serial_no,InputStream newUcc3) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set ucc3 =? where serial_no=?");
		pstmt.setBlob(1, newUcc3);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Ucc4(String serial_no,InputStream newUcc4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set ucc4 =? where serial_no=?");
		pstmt.setBlob(1, newUcc4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Ucc5(String serial_no,InputStream newUcc5) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set ucc5 =? where serial_no=?");
		pstmt.setBlob(1, newUcc5);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Form1_front(String serial_no,InputStream newForm1_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set form1_front =? where serial_no=?");
		pstmt.setBlob(1, newForm1_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Form1_back(String serial_no,InputStream newForm1_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set form1_back =? where serial_no=?");
		pstmt.setBlob(1, newForm1_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Form2_front(String serial_no,InputStream newForm2_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set form2_front =? where serial_no=?");
		pstmt.setBlob(1, newForm2_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Form2_back(String serial_no,InputStream newForm2_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set form2_back =? where serial_no=?");
		pstmt.setBlob(1, newForm2_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		return result;
	}
	public static int updateMGFather_Form59_4(String serial_no,InputStream newForm59_4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set form59_4 =? where serial_no=?");
		pstmt.setBlob(1, newForm59_4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Naing6ka_front(String serial_no,InputStream newNaing6kaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set naing6ka_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Naing6ka_back(String serial_no,InputStream newNaing6kaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set naing6ka_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Naing2_front(String serial_no,InputStream newNaing2F) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set naing2_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing2F);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Naing2_back(String serial_no,InputStream newNaing2B) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set naing2_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing2B);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Naing4(String serial_no,InputStream newNaing4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set naing4 =? where serial_no=?");
		pstmt.setBlob(1, newNaing4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Nrc(String serial_no,InputStream newNrc) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set nrc =? where serial_no=?");
		pstmt.setBlob(1, newNrc);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Eh4_4ka(String serial_no,InputStream newEh4_4ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set eh4_4ka =? where serial_no=?");
		pstmt.setBlob(1, newEh4_4ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Eh2(String serial_no,InputStream newEh2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set eh2 =? where serial_no=?");
		pstmt.setBlob(1, newEh2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Pju6_6ka(String serial_no,InputStream newPju6_6ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set pju6_6ka =? where serial_no=?");
		pstmt.setBlob(1, newPju6_6ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Pju8(String serial_no,InputStream newPju8) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set pju8 =? where serial_no=?");
		pstmt.setBlob(1, newPju8);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Statement(String serial_no,InputStream newStatement) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set statement =? where serial_no=?");
		pstmt.setBlob(1, newStatement);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Affidavit(String serial_no,InputStream newAffidavit) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set affidavit =? where serial_no=?");
		pstmt.setBlob(1, newAffidavit);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_ZazaNjanja_front(String serial_no,InputStream newZazaNjanjaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set zaza_njanja_affidavit_front =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_ZazaNjanja_back(String serial_no,InputStream newZazaNjanjaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set zaza_njanja_affidavit_back =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_TombRecord(String serial_no,InputStream newTombRecord) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set tomb_record =? where serial_no=?");
		pstmt.setBlob(1, newTombRecord);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGFather_Other(String serial_no,InputStream newOther) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandfather_record set other =? where serial_no=?");
		pstmt.setBlob(1, newOther);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Name(String serial_no,String newName) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set name =? where serial_no=?");
		pstmt.setString(1, newName);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_DoB(String serial_no,String newDoB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set date_of_birth =? where serial_no=?");
		pstmt.setString(1, newDoB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Nrc_no(String serial_no,String newNrc_no) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set nrc_no =? where serial_no=?");
		pstmt.setString(1, newNrc_no);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_UsefulLaw(String serial_no,String newUsefulLaw) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set useful_law =? where serial_no=?");
		pstmt.setString(1, newUsefulLaw);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Frc_front(String serial_no,InputStream newFrcF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set frc_front =? where serial_no=?");
		pstmt.setBlob(1, newFrcF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Frc_back(String serial_no,InputStream newFrcB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set frc_back =? where serial_no=?");
		pstmt.setBlob(1, newFrcB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Ucc1(String serial_no,InputStream newUcc1) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set ucc1 =? where serial_no=?");
		pstmt.setBlob(1, newUcc1);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Ucc2(String serial_no,InputStream newUcc2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set ucc2 =? where serial_no=?");
		pstmt.setBlob(1, newUcc2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Ucc3(String serial_no,InputStream newUcc3) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set ucc3 =? where serial_no=?");
		pstmt.setBlob(1, newUcc3);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Ucc4(String serial_no,InputStream newUcc4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set ucc4 =? where serial_no=?");
		pstmt.setBlob(1, newUcc4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Ucc5(String serial_no,InputStream newUcc5) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set ucc5 =? where serial_no=?");
		pstmt.setBlob(1, newUcc5);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Form1_front(String serial_no,InputStream newForm1_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set form1_front =? where serial_no=?");
		pstmt.setBlob(1, newForm1_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Form1_back(String serial_no,InputStream newForm1_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set form1_back =? where serial_no=?");
		pstmt.setBlob(1, newForm1_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Form2_front(String serial_no,InputStream newForm2_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set form2_front =? where serial_no=?");
		pstmt.setBlob(1, newForm2_front);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Form2_back(String serial_no,InputStream newForm2_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set form2_back =? where serial_no=?");
		pstmt.setBlob(1, newForm2_back);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();
		return result;
	}
	public static int updateMGMother_Form59_4(String serial_no,InputStream newForm59_4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set form59_4 =? where serial_no=?");
		pstmt.setBlob(1, newForm59_4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Naing6ka_front(String serial_no,InputStream newNaing6kaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set naing6ka_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Naing6ka_back(String serial_no,InputStream newNaing6kaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set naing6ka_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing6kaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Naing2_front(String serial_no,InputStream newNaing2F) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set naing2_front =? where serial_no=?");
		pstmt.setBlob(1, newNaing2F);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Naing2_back(String serial_no,InputStream newNaing2B) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set naing2_back =? where serial_no=?");
		pstmt.setBlob(1, newNaing2B);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Naing4(String serial_no,InputStream newNaing4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set naing4 =? where serial_no=?");
		pstmt.setBlob(1, newNaing4);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Nrc(String serial_no,InputStream newNrc) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set nrc =? where serial_no=?");
		pstmt.setBlob(1, newNrc);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Eh4_4ka(String serial_no,InputStream newEh4_4ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set eh4_4ka =? where serial_no=?");
		pstmt.setBlob(1, newEh4_4ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Eh2(String serial_no,InputStream newEh2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set eh2 =? where serial_no=?");
		pstmt.setBlob(1, newEh2);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Pju6_6ka(String serial_no,InputStream newPju6_6ka) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set pju6_6ka =? where serial_no=?");
		pstmt.setBlob(1, newPju6_6ka);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Pju8(String serial_no,InputStream newPju8) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set pju8 =? where serial_no=?");
		pstmt.setBlob(1, newPju8);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Statement(String serial_no,InputStream newStatement) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set statement =? where serial_no=?");
		pstmt.setBlob(1, newStatement);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Affidavit(String serial_no,InputStream newAffidavit) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set affidavit =? where serial_no=?");
		pstmt.setBlob(1, newAffidavit);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_ZazaNjanja_front(String serial_no,InputStream newZazaNjanjaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set zaza_njanja_affidavit_front =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaF);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_ZazaNjanja_back(String serial_no,InputStream newZazaNjanjaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set zaza_njanja_affidavit_back =? where serial_no=?");
		pstmt.setBlob(1, newZazaNjanjaB);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_TombRecord(String serial_no,InputStream newTombRecord) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set tomb_record =? where serial_no=?");
		pstmt.setBlob(1, newTombRecord);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updateMGMother_Other(String serial_no,InputStream newOther) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update mgrandmother_record set other =? where serial_no=?");
		pstmt.setBlob(1, newOther);
		pstmt.setString(2, serial_no);
		result = pstmt.executeUpdate();	
		return result;
	}

}

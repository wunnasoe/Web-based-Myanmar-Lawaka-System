package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import form.OtherRecordForm;
import form.UserForm;

public class InsertRecords {
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
	public static int insertFatherRecord(OtherRecordForm father) throws SQLException{
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	PreparedStatement ps = con.prepareStatement("insert into father_record (serial_no,name,date_of_birth,nrc_no,useful_law,frc_front,frc_back,ucc1,ucc2,ucc3,ucc4,ucc5,form1_front,form1_back,form2_front,form2_back,form59_4,naing6ka_front,naing6ka_back,naing2_front,naing2_back,naing4,nrc,eh4_4ka,eh2,pju6_6ka,pju8,statement,affidavit,zaza_njanja_affidavit_front,zaza_njanja_affidavit_back,tomb_record,other)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    	ps.setString(1, father.getOwner_sernail());
    	ps.setString(2, father.getName());
    	ps.setString(3, father.getDate_of_birth());
    	ps.setString(4, father.getNrc_no());
    	ps.setString(5, father.getUseful_law());
    	ps.setBlob(6, father.getFrc_front());
    	ps.setBlob(7, father.getFrc_back());
    	ps.setBlob(8, father.getUcc1());
    	ps.setBlob(9, father.getUcc2());
    	ps.setBlob(10, father.getUcc3());
    	ps.setBlob(11, father.getUcc4());
    	ps.setBlob(12, father.getUcc5());
    	ps.setBlob(13, father.getForm1_front());
    	ps.setBlob(14, father.getForm1_back());
    	ps.setBlob(15, father.getForm2_front());
    	ps.setBlob(16, father.getForm2_back());
    	ps.setBlob(17, father.getForm59_4());
    	ps.setBlob(18, father.getNaing6ka_front());
    	ps.setBlob(19, father.getNaing6ka_back());
    	ps.setBlob(20, father.getNaing2_front());
    	ps.setBlob(21, father.getNaing2_back());
    	ps.setBlob(22, father.getNaing4());
    	ps.setBlob(23, father.getNrc());
    	ps.setBlob(24, father.getEh4_4ka());
    	ps.setBlob(25, father.getEh2());
    	ps.setBlob(26, father.getPju6_6ka());
    	ps.setBlob(27, father.getPju8());
    	ps.setBlob(28, father.getStatement());
    	ps.setBlob(29, father.getAffidavit());
    	ps.setBlob(30, father.getZaza_njanja_affidavit_front());
    	ps.setBlob(31, father.getZaza_njanja_affidavit_back());
    	ps.setBlob(32, father.getTomb_record());
    	ps.setBlob(33, father.getOthers());
    	System.out.println(father.getFrc_front()+" father's frc front in InsertRecords");
    	
    	int result = ps.executeUpdate(); 
    	ps.close();
    	con.close();
    	return result;    	
    
	}
	public static int insertMotherRecord(OtherRecordForm mother) throws SQLException{
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	PreparedStatement ps = con.prepareStatement("insert into mother_record (serial_no,name,date_of_birth,nrc_no,useful_law,frc_front,frc_back,ucc1,ucc2,ucc3,ucc4,ucc5,form1_front,form1_back,form2_front,form2_back,form59_4,naing6ka_front,naing6ka_back,naing2_front,naing2_back,naing4,nrc,eh4_4ka,eh2,pju6_6ka,pju8,statement,affidavit,zaza_njanja_affidavit_front,zaza_njanja_affidavit_back,tomb_record,other)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    	//ps.setInt(1, i1);
    	ps.setString(1, mother.getOwner_sernail());
    	ps.setString(2, mother.getName());
    	ps.setString(3, mother.getDate_of_birth());
    	ps.setString(4, mother.getNrc_no());
    	ps.setString(5, mother.getUseful_law());
    	ps.setBlob(6, mother.getFrc_front());
    	ps.setBlob(7, mother.getFrc_back());
    	ps.setBlob(8, mother.getUcc1());
    	ps.setBlob(9, mother.getUcc2());
    	ps.setBlob(10, mother.getUcc3());
    	ps.setBlob(11, mother.getUcc4());
    	ps.setBlob(12, mother.getUcc5());
    	ps.setBlob(13, mother.getForm1_front());
    	ps.setBlob(14, mother.getForm1_back());
    	ps.setBlob(15, mother.getForm2_front());
    	ps.setBlob(16, mother.getForm2_back());
    	ps.setBlob(17, mother.getForm59_4());
    	ps.setBlob(18, mother.getNaing6ka_front());
    	ps.setBlob(19, mother.getNaing6ka_back());
    	ps.setBlob(20, mother.getNaing2_front());
    	ps.setBlob(21, mother.getNaing2_back());
    	ps.setBlob(22, mother.getNaing4());
    	ps.setBlob(23, mother.getNrc());
    	ps.setBlob(24, mother.getEh4_4ka());
    	ps.setBlob(25, mother.getEh2());
    	ps.setBlob(26, mother.getPju6_6ka());
    	ps.setBlob(27, mother.getPju8());
    	ps.setBlob(28, mother.getStatement());
    	ps.setBlob(29, mother.getAffidavit());
    	ps.setBlob(30, mother.getZaza_njanja_affidavit_front());
    	ps.setBlob(31, mother.getZaza_njanja_affidavit_back());
    	ps.setBlob(32, mother.getTomb_record());
    	ps.setBlob(33, mother.getOthers());
    	
    	int result = ps.executeUpdate(); 
    	ps.close();
    	con.close();
    	return result;   
	}
	public static int insertFGrandFatherRecord(OtherRecordForm mother) throws SQLException{
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	PreparedStatement ps = con.prepareStatement("insert into fgrandfather_record (serial_no,name,date_of_birth,nrc_no,useful_law,frc_front,frc_back,ucc1,ucc2,ucc3,ucc4,ucc5,form1_front,form1_back,form2_front,form2_back,form59_4,naing6ka_front,naing6ka_back,naing2_front,naing2_back,naing4,nrc,eh4_4ka,eh2,pju6_6ka,pju8,statement,affidavit,zaza_njanja_affidavit_front,zaza_njanja_affidavit_back,tomb_record,other)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    	//ps.setInt(1, i1);
    	ps.setString(1, mother.getOwner_sernail());
    	ps.setString(2, mother.getName());
    	ps.setString(3, mother.getDate_of_birth());
    	ps.setString(4, mother.getNrc_no());
    	ps.setString(5, mother.getUseful_law());
    	ps.setBlob(6, mother.getFrc_front());
    	ps.setBlob(7, mother.getFrc_back());
    	ps.setBlob(8, mother.getUcc1());
    	ps.setBlob(9, mother.getUcc2());
    	ps.setBlob(10, mother.getUcc3());
    	ps.setBlob(11, mother.getUcc4());
    	ps.setBlob(12, mother.getUcc5());
    	ps.setBlob(13, mother.getForm1_front());
    	ps.setBlob(14, mother.getForm1_back());
    	ps.setBlob(15, mother.getForm2_front());
    	ps.setBlob(16, mother.getForm2_back());
    	ps.setBlob(17, mother.getForm59_4());
    	ps.setBlob(18, mother.getNaing6ka_front());
    	ps.setBlob(19, mother.getNaing6ka_back());
    	ps.setBlob(20, mother.getNaing2_front());
    	ps.setBlob(21, mother.getNaing2_back());
    	ps.setBlob(22, mother.getNaing4());
    	ps.setBlob(23, mother.getNrc());
    	ps.setBlob(24, mother.getEh4_4ka());
    	ps.setBlob(25, mother.getEh2());
    	ps.setBlob(26, mother.getPju6_6ka());
    	ps.setBlob(27, mother.getPju8());
    	ps.setBlob(28, mother.getStatement());
    	ps.setBlob(29, mother.getAffidavit());
    	ps.setBlob(30, mother.getZaza_njanja_affidavit_front());
    	ps.setBlob(31, mother.getZaza_njanja_affidavit_back());
    	ps.setBlob(32, mother.getTomb_record());
    	ps.setBlob(33, mother.getOthers());
    	
    	int result = ps.executeUpdate(); 
    	ps.close();
    	con.close();
    	return result;   
	}
	public static int insertFGrandMotherRecord(OtherRecordForm mother) throws SQLException{
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	PreparedStatement ps = con.prepareStatement("insert into fgrandmother_record (serial_no,name,date_of_birth,nrc_no,useful_law,frc_front,frc_back,ucc1,ucc2,ucc3,ucc4,ucc5,form1_front,form1_back,form2_front,form2_back,form59_4,naing6ka_front,naing6ka_back,naing2_front,naing2_back,naing4,nrc,eh4_4ka,eh2,pju6_6ka,pju8,statement,affidavit,zaza_njanja_affidavit_front,zaza_njanja_affidavit_back,tomb_record,other)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    	//ps.setInt(1, i1);
    	ps.setString(1, mother.getOwner_sernail());
    	ps.setString(2, mother.getName());
    	ps.setString(3, mother.getDate_of_birth());
    	ps.setString(4, mother.getNrc_no());
    	ps.setString(5, mother.getUseful_law());
    	ps.setBlob(6, mother.getFrc_front());
    	ps.setBlob(7, mother.getFrc_back());
    	ps.setBlob(8, mother.getUcc1());
    	ps.setBlob(9, mother.getUcc2());
    	ps.setBlob(10, mother.getUcc3());
    	ps.setBlob(11, mother.getUcc4());
    	ps.setBlob(12, mother.getUcc5());
    	ps.setBlob(13, mother.getForm1_front());
    	ps.setBlob(14, mother.getForm1_back());
    	ps.setBlob(15, mother.getForm2_front());
    	ps.setBlob(16, mother.getForm2_back());
    	ps.setBlob(17, mother.getForm59_4());
    	ps.setBlob(18, mother.getNaing6ka_front());
    	ps.setBlob(19, mother.getNaing6ka_back());
    	ps.setBlob(20, mother.getNaing2_front());
    	ps.setBlob(21, mother.getNaing2_back());
    	ps.setBlob(22, mother.getNaing4());
    	ps.setBlob(23, mother.getNrc());
    	ps.setBlob(24, mother.getEh4_4ka());
    	ps.setBlob(25, mother.getEh2());
    	ps.setBlob(26, mother.getPju6_6ka());
    	ps.setBlob(27, mother.getPju8());
    	ps.setBlob(28, mother.getStatement());
    	ps.setBlob(29, mother.getAffidavit());
    	ps.setBlob(30, mother.getZaza_njanja_affidavit_front());
    	ps.setBlob(31, mother.getZaza_njanja_affidavit_back());
    	ps.setBlob(32, mother.getTomb_record());
    	ps.setBlob(33, mother.getOthers());
    	
    	int result = ps.executeUpdate(); 
    	ps.close();
    	con.close();
    	return result;   
	}
	public static int insertMGrandFatherRecord(OtherRecordForm mother) throws SQLException{
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	PreparedStatement ps = con.prepareStatement("insert into mgrandfather_record (serial_no,name,date_of_birth,nrc_no,useful_law,frc_front,frc_back,ucc1,ucc2,ucc3,ucc4,ucc5,form1_front,form1_back,form2_front,form2_back,form59_4,naing6ka_front,naing6ka_back,naing2_front,naing2_back,naing4,nrc,eh4_4ka,eh2,pju6_6ka,pju8,statement,affidavit,zaza_njanja_affidavit_front,zaza_njanja_affidavit_back,tomb_record,other)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    	//ps.setInt(1, i1);
    	ps.setString(1, mother.getOwner_sernail());
    	ps.setString(2, mother.getName());
    	ps.setString(3, mother.getDate_of_birth());
    	ps.setString(4, mother.getNrc_no());
    	ps.setString(5, mother.getUseful_law());
    	ps.setBlob(6, mother.getFrc_front());
    	ps.setBlob(7, mother.getFrc_back());
    	ps.setBlob(8, mother.getUcc1());
    	ps.setBlob(9, mother.getUcc2());
    	ps.setBlob(10, mother.getUcc3());
    	ps.setBlob(11, mother.getUcc4());
    	ps.setBlob(12, mother.getUcc5());
    	ps.setBlob(13, mother.getForm1_front());
    	ps.setBlob(14, mother.getForm1_back());
    	ps.setBlob(15, mother.getForm2_front());
    	ps.setBlob(16, mother.getForm2_back());
    	ps.setBlob(17, mother.getForm59_4());
    	ps.setBlob(18, mother.getNaing6ka_front());
    	ps.setBlob(19, mother.getNaing6ka_back());
    	ps.setBlob(20, mother.getNaing2_front());
    	ps.setBlob(21, mother.getNaing2_back());
    	ps.setBlob(22, mother.getNaing4());
    	ps.setBlob(23, mother.getNrc());
    	ps.setBlob(24, mother.getEh4_4ka());
    	ps.setBlob(25, mother.getEh2());
    	ps.setBlob(26, mother.getPju6_6ka());
    	ps.setBlob(27, mother.getPju8());
    	ps.setBlob(28, mother.getStatement());
    	ps.setBlob(29, mother.getAffidavit());
    	ps.setBlob(30, mother.getZaza_njanja_affidavit_front());
    	ps.setBlob(31, mother.getZaza_njanja_affidavit_back());
    	ps.setBlob(32, mother.getTomb_record());
    	ps.setBlob(33, mother.getOthers());
    	
    	int result = ps.executeUpdate();
    	ps.close();
    	con.close();
    	return result;   
	}
	public static int insertMGrandMotherRecord(OtherRecordForm mother) throws SQLException{
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	PreparedStatement ps = con.prepareStatement("insert into mgrandmother_record (serial_no,name,date_of_birth,nrc_no,useful_law,frc_front,frc_back,ucc1,ucc2,ucc3,ucc4,ucc5,form1_front,form1_back,form2_front,form2_back,form59_4,naing6ka_front,naing6ka_back,naing2_front,naing2_back,naing4,nrc,eh4_4ka,eh2,pju6_6ka,pju8,statement,affidavit,zaza_njanja_affidavit_front,zaza_njanja_affidavit_back,tomb_record,other)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    	//ps.setInt(1, i1);
    	ps.setString(1, mother.getOwner_sernail());
    	ps.setString(2, mother.getName());
    	ps.setString(3, mother.getDate_of_birth());
    	ps.setString(4, mother.getNrc_no());
    	ps.setString(5, mother.getUseful_law());
    	ps.setBlob(6, mother.getFrc_front());
    	ps.setBlob(7, mother.getFrc_back());
    	ps.setBlob(8, mother.getUcc1());
    	ps.setBlob(9, mother.getUcc2());
    	ps.setBlob(10, mother.getUcc3());
    	ps.setBlob(11, mother.getUcc4());
    	ps.setBlob(12, mother.getUcc5());
    	ps.setBlob(13, mother.getForm1_front());
    	ps.setBlob(14, mother.getForm1_back());
    	ps.setBlob(15, mother.getForm2_front());
    	ps.setBlob(16, mother.getForm2_back());
    	ps.setBlob(17, mother.getForm59_4());
    	ps.setBlob(18, mother.getNaing6ka_front());
    	ps.setBlob(19, mother.getNaing6ka_back());
    	ps.setBlob(20, mother.getNaing2_front());
    	ps.setBlob(21, mother.getNaing2_back());
    	ps.setBlob(22, mother.getNaing4());
    	ps.setBlob(23, mother.getNrc());
    	ps.setBlob(24, mother.getEh4_4ka());
    	ps.setBlob(25, mother.getEh2());
    	ps.setBlob(26, mother.getPju6_6ka());
    	ps.setBlob(27, mother.getPju8());
    	ps.setBlob(28, mother.getStatement());
    	ps.setBlob(29, mother.getAffidavit());
    	ps.setBlob(30, mother.getZaza_njanja_affidavit_front());
    	ps.setBlob(31, mother.getZaza_njanja_affidavit_back());
    	ps.setBlob(32, mother.getTomb_record());
    	ps.setBlob(33, mother.getOthers());
    	
    	int result = ps.executeUpdate();
    	ps.close();
    	con.close();
    	return result;   
	}
	public static int insertUser(UserForm user) throws SQLException{
		createDBConnection();
		PreparedStatement ps = con.prepareStatement("insert into user (no,name,password,role) values (?,?,?,?)");
		ps.setInt(1, user.getNo());		
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		ps.setBoolean(4, user.isRole());
		int result = ps.executeUpdate();
		ps.close();
    	con.close();
		return result;
	}
	public static int userCount() throws SQLException{
		createDBConnection();
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from user;");
		int i=0;
		while(rs.next())
			i++;
		
    	con.close();
		return i;
	}
}

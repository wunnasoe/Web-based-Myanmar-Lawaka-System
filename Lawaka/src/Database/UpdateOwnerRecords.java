package Database;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOwnerRecords {
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
	public static int updateOwnerName(String serial_no,String newName) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set name='"+newName+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerNrc_no(String serial_no,String newNrc_no) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set nrc_no='"+newNrc_no+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerDate_of_Brith(String serial_no,String newDOB) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set date_of_birth='"+newDOB+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerNationality(String serial_no,String newNationality) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set nationality='"+newNationality+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerRegion(String serial_no,String newRegion) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set region='"+newRegion+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerType_of_law(String serial_no,String newType_of_law) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set type_of_law='"+newType_of_law+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerUseful_law(String serial_no,String newUseful_law) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set useful_law='"+newUseful_law+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerGender(String serial_no,String newGender) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set gender='"+newGender+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerFileNo(String serial_no,String newFile_no) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set file_no='"+newFile_no+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerIssued_date(String serial_no,String newIssued_date) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set issued_date='"+newIssued_date+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updateOwnerRemark(String serial_no,String newRemark) throws SQLException{
		createDBConnection();
		int result=0;
		Statement stmt = con.createStatement();
		result = stmt.executeUpdate("update ownerrecord set remark='"+newRemark+"' where serial_no='"+serial_no+"'");
		return result;
	}
	public static int updatePhotoRecord_Nrc(int no,InputStream newNrc) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set nrc=? where no=?");
		pstmt.setBlob(1, newNrc);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_UCC1(int no,InputStream newUcc1) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set ucc1=? where no=?");
		pstmt.setBlob(1, newUcc1);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_UCC2(int no,InputStream newUcc2) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set ucc2=? where no=?");
		pstmt.setBlob(1, newUcc2);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_UCC3(int no,InputStream newUcc3) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set ucc3=? where no=?");
		pstmt.setBlob(1, newUcc3);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_UCC4(int no,InputStream newUcc4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set ucc4=? where no=?");
		pstmt.setBlob(1, newUcc4);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_UCC5(int no,InputStream newUcc5) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set ucc5=? where no=?");
		pstmt.setBlob(1, newUcc5);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Form1_front(int no,InputStream newForm1_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set form1_front =? where no=?");
		pstmt.setBlob(1, newForm1_front);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Form1_back(int no,InputStream newForm1_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set form1_back =? where no=?");
		pstmt.setBlob(1, newForm1_back);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Form2_front(int no,InputStream newForm2_front) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set form2_front =? where no=?");
		pstmt.setBlob(1, newForm2_front);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Form2_back(int no,InputStream newForm2_back) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set form2_back =? where no=?");
		pstmt.setBlob(1, newForm2_back);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Form59_4(int no,InputStream newForm59_4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set form59_4 =? where no=?");
		pstmt.setBlob(1, newForm59_4);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Naing3ka_front(int no,InputStream newNaing3kaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set naing3ka_front =? where no=?");
		pstmt.setBlob(1, newNaing3kaF);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Naing3ka_back(int no,InputStream newNaing3kaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set naing3ka_back =? where no=?");
		pstmt.setBlob(1, newNaing3kaB);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Htwei4_front(int no,InputStream newHtwei4F) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set htwei4_front =? where no=?");
		pstmt.setBlob(1, newHtwei4F);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Htwei4_back(int no,InputStream newHtwei4B) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set htwei4_back =? where no=?");
		pstmt.setBlob(1, newHtwei4B);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Naing2_front(int no,InputStream newNaing2F) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set naing2_front =? where no=?");
		pstmt.setBlob(1, newNaing2F);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Naing2_back(int no,InputStream newNaing2B) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set naing2_back =? where no=?");
		pstmt.setBlob(1, newNaing2B);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Naing4(int no,InputStream newNaing4) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set naing4 =? where no=?");
		pstmt.setBlob(1, newNaing4);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Affidavit(int no,InputStream newAffidavit) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set affidavit =? where no=?");
		pstmt.setBlob(1, newAffidavit);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_ZazaNjanja_front(int no,InputStream newZazaNjanjaF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set zaza_njanja_affidavit_front =? where no=?");
		pstmt.setBlob(1, newZazaNjanjaF);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_ZazaNjanja_back(int no,InputStream newZazaNjanjaB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set zaza_njanja_affidavit_back =? where no=?");
		pstmt.setBlob(1, newZazaNjanjaB);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Orapprove(int no,InputStream newOrapprove) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set orapprove =? where no=?");
		pstmt.setBlob(1, newOrapprove);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_FamilyCht_front(int no,InputStream newfamilyChtF) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set family_chart_front =? where no=?");
		pstmt.setBlob(1, newfamilyChtF);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_FamilyCht_back(int no,InputStream newfamilyChtB) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set family_chart_back =? where no=?");
		pstmt.setBlob(1, newfamilyChtB);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Birth_register(int no,InputStream newBirthregister) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set birth_register =? where no=?");
		pstmt.setBlob(1, newBirthregister);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_School_recmd(int no,InputStream newSchlrcmd) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set schrecom =? where no=?");
		pstmt.setBlob(1, newSchlrcmd);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
	public static int updatePhotoRecord_Other(int no,InputStream newOther) throws SQLException{
		createDBConnection();
		int result=0;
		PreparedStatement pstmt = con.prepareStatement("update photo_record set others =? where no=?");
		pstmt.setBlob(1, newOther);
		pstmt.setInt(2, no);
		result = pstmt.executeUpdate();	
		return result;
	}
}

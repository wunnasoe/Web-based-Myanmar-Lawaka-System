package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import form.OwnerRecordForm;
import form.PhotoRecordForm;

public class OwnerRecordDB {
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
	public static int countOwnerRecord() throws SQLException{
		createDBConnection();
		int c=0;
    	Statement stmt = con.createStatement();
    	ResultSet  rs =stmt.executeQuery("select * from ownerrecord;");
    	while(rs.next())
    		c++;
    	return c;
    	
	}
    public static int insertOwnerRecord(OwnerRecordForm owner ) throws SQLException{
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	PreparedStatement ps = con.prepareStatement("insert into ownerrecord (serial_no,name,nrc_no,date_of_birth,nationality,region,type_of_law,useful_law,gender,file_no,issued_date,remark)values (?,?,?,?,?,?,?,?,?,?,?,?)");
    	//ps.setInt(1, i1);
    	ps.setString(1, owner.getSerial_no());
    	ps.setString(2, owner.getName());
    	ps.setString(3, owner.getNrc_no());
    	ps.setString(4, owner.getDate_of_birth());
    	ps.setString(5, owner.getNationality());
    	ps.setString(6, owner.getRegion());
    	ps.setString(7,owner.getType_of_law() );
    	ps.setString(8, owner.getUseful_law());
    	ps.setString(9, owner.getGender());
    	ps.setString(10, owner.getFile_no());
    	ps.setString(11, owner.getIssued_date());
    	ps.setString(12, owner.getRemark());
    	int result = ps.executeUpdate(); 
    	ps.close();
    	con.close();
    	return result;    	
    }
    public static int insertPhotoRecord(PhotoRecordForm photorecord) throws SQLException{
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	PreparedStatement ps = con.prepareStatement("insert into photo_record (nrc,ucc1,ucc2,ucc3,ucc4,ucc5,form1_front,form1_back,form2_front,form2_back,form59_4,naing3ka_front,naing3ka_back,htwei4_front,htwei4_back,naing2_front,naing2_back,naing4,affidavit,zaza_njanja_affidavit_front,zaza_njanja_affidavit_back,orapprove,family_chart_front,family_chart_back,birth_register,schrecom,others) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    //	ps.setInt(1, i2++);
    	ps.setBlob(1, photorecord.getNrc());
    	ps.setBlob(2, photorecord.getUcc1());
    	ps.setBlob(3, photorecord.getUcc2());
    	ps.setBlob(4, photorecord.getUcc3());
    	ps.setBlob(5, photorecord.getUcc4());
    	ps.setBlob(6, photorecord.getUcc5());
    	ps.setBlob(7, photorecord.getForm1_front());
    	ps.setBlob(8, photorecord.getForm1_back());
    	ps.setBlob(9, photorecord.getForm2_front());
    	ps.setBlob(10, photorecord.getForm2_back());
    	ps.setBlob(11, photorecord.getForm59_4());
    	ps.setBlob(12, photorecord.getNaing3ka_front());
    	ps.setBlob(13, photorecord.getNaing3ka_back());
    	ps.setBlob(14, photorecord.getHtwei4_front());
    	ps.setBlob(15, photorecord.getHtwei4_back());
    	ps.setBlob(16, photorecord.getNaing2_front());
    	ps.setBlob(17, photorecord.getNaing2_back());
    	ps.setBlob(18, photorecord.getNaing4());
    	ps.setBlob(19, photorecord.getAffidavit());
    	ps.setBlob(20, photorecord.getZaza_njanja_affidavit_front());
    	ps.setBlob(21, photorecord.getZaza_njanja_affidavit_back());
    	ps.setBlob(22, photorecord.getOrapprove());
    	ps.setBlob(23, photorecord.getFamily_chart_front());
    	ps.setBlob(24, photorecord.getFamily_chart_back());
    	ps.setBlob(25, photorecord.getBirth_register());
    	ps.setBlob(26, photorecord.getSchrecom());
    	ps.setBlob(27, photorecord.getOthers());
    	
    	int result = ps.executeUpdate();
    	ps.close();
    	con.close();
    	return result;    	
    }
    
    public static ArrayList<OwnerRecordForm> RetrieveOwnerByNrc(String nrc_no) throws SQLException{
    	ArrayList<OwnerRecordForm> resultList = new ArrayList<OwnerRecordForm>();
    	
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select * from ownerrecord where nrc_no='"+nrc_no+"';");
    	while(rs.next()){
    		OwnerRecordForm owner = new OwnerRecordForm();
    		rs.getInt(1);
    		owner.setSerial_no(rs.getString(2));
    		owner.setName(rs.getString(3));
    		owner.setNrc_no(rs.getString(4));
    		owner.setDate_of_birth(rs.getString(5));
    		owner.setNationality(rs.getString(6));
    		owner.setRegion(rs.getString(7));
    		owner.setType_of_law(rs.getString(8));
    		owner.setUseful_law(rs.getString(9));
    		owner.setGender(rs.getString(10));
    		owner.setFile_no(rs.getString(11));
    		owner.setIssued_date(rs.getString(12));
    		owner.setRemark(rs.getString(13));
    		resultList.add(owner);
    	}    	
    	con.close();
    	return resultList;
    }
    
    public static ArrayList<OwnerRecordForm> RetrieveOwnerByName(String name) throws SQLException{
    	ArrayList<OwnerRecordForm> resultList = new ArrayList<OwnerRecordForm>();    	
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select * from ownerrecord where name='"+name+"';");
    	while(rs.next()){
    		OwnerRecordForm owner = new OwnerRecordForm();
    		rs.getInt(1);
    		owner.setSerial_no(rs.getString(2));
    		owner.setName(rs.getString(3));
    		owner.setNrc_no(rs.getString(4));
    		owner.setDate_of_birth(rs.getString(5));
    		owner.setNationality(rs.getString(6));
    		owner.setRegion(rs.getString(7));
    		owner.setType_of_law(rs.getString(8));
    		owner.setUseful_law(rs.getString(9));
    		owner.setGender(rs.getString(10));
    		owner.setFile_no(rs.getString(11));
    		owner.setIssued_date(rs.getString(12));
    		owner.setRemark(rs.getString(13));    	
        	    		
    		resultList.add(owner);
    	} 
    	con.close();
    	return resultList;
    }
    
    public static ArrayList<OwnerRecordForm> RetrieveOwnerByRegion(String region) throws SQLException{
    	ArrayList<OwnerRecordForm> resultList = new ArrayList<OwnerRecordForm>();
    	
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select * from ownerrecord where region='"+region+"';");
    	while(rs.next()){
    		OwnerRecordForm owner = new OwnerRecordForm();
    		rs.getInt(1);
    		owner.setSerial_no(rs.getString(2));
    		owner.setName(rs.getString(3));
    		owner.setNrc_no(rs.getString(4));
    		owner.setDate_of_birth(rs.getString(5));
    		owner.setNationality(rs.getString(6));
    		owner.setRegion(rs.getString(7));
    		owner.setType_of_law(rs.getString(8));
    		owner.setUseful_law(rs.getString(9));
    		owner.setGender(rs.getString(10));
    		owner.setFile_no(rs.getString(11));
    		owner.setIssued_date(rs.getString(12));
    		owner.setRemark(rs.getString(13));
    		
        	
    		resultList.add(owner);
    	}    	
    	con.close();
    	return resultList;
    }
    
    public static ArrayList<OwnerRecordForm> RetrieveOwnerByNameRegion(String name,String region) throws SQLException{
    	ArrayList<OwnerRecordForm> resultList = new ArrayList<OwnerRecordForm>();
    	
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select * from ownerrecord where name='"+name+"' and region='"+region+"';");
    	while(rs.next()){
    		OwnerRecordForm owner = new OwnerRecordForm();
    		rs.getInt(1);
    		owner.setSerial_no(rs.getString(2));
    		owner.setName(rs.getString(3));
    		owner.setNrc_no(rs.getString(4));
    		owner.setDate_of_birth(rs.getString(5));
    		owner.setNationality(rs.getString(6));
    		owner.setRegion(rs.getString(7));
    		owner.setType_of_law(rs.getString(8));
    		owner.setUseful_law(rs.getString(9));
    		owner.setGender(rs.getString(10));
    		owner.setFile_no(rs.getString(11));
    		owner.setIssued_date(rs.getString(12));
    		owner.setRemark(rs.getString(13));
    		resultList.add(owner);
    	}    	
    	
    	con.close();
    	return resultList;
    }
    
    public static ArrayList<OwnerRecordForm> RetrieveOwnerByNameNrc(String name,String nrc_no) throws SQLException{
    	ArrayList<OwnerRecordForm> resultList = new ArrayList<OwnerRecordForm>();
    	
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select * from ownerrecord where name='"+name+"' and nrc_no='"+nrc_no+"';");
    	while(rs.next()){
    		OwnerRecordForm owner = new OwnerRecordForm();
    		rs.getInt(1);
    		owner.setSerial_no(rs.getString(2));
    		owner.setName(rs.getString(3));
    		owner.setNrc_no(rs.getString(4));
    		owner.setDate_of_birth(rs.getString(5));
    		owner.setNationality(rs.getString(6));
    		owner.setRegion(rs.getString(7));
    		owner.setType_of_law(rs.getString(8));
    		owner.setUseful_law(rs.getString(9));
    		owner.setGender(rs.getString(10));
    		owner.setFile_no(rs.getString(11));
    		owner.setIssued_date(rs.getString(12));
    		owner.setRemark(rs.getString(13));
    		resultList.add(owner);
    	}    	
    	
    	con.close();
    	return resultList;
    }
    
    public static ArrayList<OwnerRecordForm> RetrieveOwnerByNrcRegion(String nrc_no,String region) throws SQLException{
    	ArrayList<OwnerRecordForm> resultList = new ArrayList<OwnerRecordForm>();
    	
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select * from ownerrecord where nrc_no='"+nrc_no+"' and region='"+region+"';");
    	while(rs.next()){
    		OwnerRecordForm owner = new OwnerRecordForm();
    		rs.getInt(1);
    		owner.setSerial_no(rs.getString(2));
    		owner.setName(rs.getString(3));
    		owner.setNrc_no(rs.getString(4));
    		owner.setDate_of_birth(rs.getString(5));
    		owner.setNationality(rs.getString(6));
    		owner.setRegion(rs.getString(7));
    		owner.setType_of_law(rs.getString(8));
    		owner.setUseful_law(rs.getString(9));
    		owner.setGender(rs.getString(10));
    		owner.setFile_no(rs.getString(11));
    		owner.setIssued_date(rs.getString(12));
    		owner.setRemark(rs.getString(13));
    		resultList.add(owner);
    	}    	
    	
    	con.close();
    	return resultList;
    }
    public static ArrayList<OwnerRecordForm> RetrieveOwnerByAll(String name,String nrc_no,String region) throws SQLException{
    	ArrayList<OwnerRecordForm> resultList = new ArrayList<OwnerRecordForm>();
    	
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select * from ownerrecord where name='"+name+"' and nrc_no='"+nrc_no+"' and region='"+region+"';");
    	while(rs.next()){
    		OwnerRecordForm owner = new OwnerRecordForm();
    		rs.getInt(1);
    		owner.setSerial_no(rs.getString(2));
    		owner.setName(rs.getString(3));
    		owner.setNrc_no(rs.getString(4));
    		owner.setDate_of_birth(rs.getString(5));
    		owner.setNationality(rs.getString(6));
    		owner.setRegion(rs.getString(7));
    		owner.setType_of_law(rs.getString(8));
    		owner.setUseful_law(rs.getString(9));
    		owner.setGender(rs.getString(10));
    		owner.setFile_no(rs.getString(11));
    		owner.setIssued_date(rs.getString(12));
    		owner.setRemark(rs.getString(13));
    		resultList.add(owner);
    	}    	
    	
    	con.close();
    	return resultList;
    }
    
    public static int retrieveNobySerial_no(String serial_no) throws SQLException{
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select no from ownerrecord where serial_no='"+serial_no+"';");
    	int no = 0;
    	while(rs.next())
    		no = rs.getInt(1);
    	
    	con.close();
    	return no;
    }
    
    public static PhotoRecordForm retrievePhotoRecordbyNo(int no) throws SQLException{
    	PhotoRecordForm photo_record = new PhotoRecordForm();
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select * from photo_record where no='"+no+"';");
    	while(rs.next()){
    		rs.getInt(1);
    		photo_record.setNrc(rs.getBlob(2).getBinaryStream());
    		photo_record.setUcc1(rs.getBlob(3).getBinaryStream());
    		photo_record.setUcc2(rs.getBlob(4).getBinaryStream());
    		photo_record.setUcc3(rs.getBlob(5).getBinaryStream());
    		photo_record.setUcc4(rs.getBlob(6).getBinaryStream());
    		photo_record.setUcc5(rs.getBlob(7).getBinaryStream());
    		photo_record.setForm1_front(rs.getBlob(8).getBinaryStream());
    		photo_record.setForm1_back(rs.getBlob(9).getBinaryStream());
    		photo_record.setForm2_front(rs.getBlob(10).getBinaryStream());
    		photo_record.setForm2_back(rs.getBlob(11).getBinaryStream());
    		photo_record.setForm59_4(rs.getBlob(12).getBinaryStream());
    		photo_record.setNaing3ka_front(rs.getBlob(13).getBinaryStream());
    		photo_record.setNaing3ka_back(rs.getBlob(14).getBinaryStream());
    		photo_record.setHtwei4_front(rs.getBlob(15).getBinaryStream());
    		photo_record.setHtwei4_back(rs.getBlob(16).getBinaryStream());
    		photo_record.setNaing2_front(rs.getBlob(17).getBinaryStream());
    		photo_record.setNaing2_back(rs.getBlob(18).getBinaryStream());
    		photo_record.setNaing4(rs.getBlob(19).getBinaryStream());
    		photo_record.setAffidavit(rs.getBlob(20).getBinaryStream());
    		photo_record.setZaza_njanja_affidavit_front(rs.getBlob(21).getBinaryStream());
    		photo_record.setZaza_njanja_affidavit_back(rs.getBlob(22).getBinaryStream());
    		photo_record.setOrapprove(rs.getBlob(23).getBinaryStream());
    		photo_record.setFamily_chart_front(rs.getBlob(24).getBinaryStream());
    		photo_record.setFamily_chart_back(rs.getBlob(25).getBinaryStream());
    		photo_record.setBirth_register(rs.getBlob(26).getBinaryStream());
    		photo_record.setSchrecom(rs.getBlob(27).getBinaryStream());
    		photo_record.setOthers(rs.getBlob(28).getBinaryStream());    		
    	}		
    	
    	con.close();
    	return photo_record;
    	
    }
    
    public static OwnerRecordForm retrieveOwnerBySerial(String serial_no) throws SQLException{
    	OwnerRecordForm owner = new OwnerRecordForm();
    	createDBConnection();
    	Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	ResultSet rs = stmt.executeQuery("select * from ownerrecord where serial_no='"+serial_no+"';");
    	while(rs.next()){
    		rs.getInt(1);
    		owner.setSerial_no(rs.getString(2));
    		owner.setName(rs.getString(3));
    		owner.setNrc_no(rs.getString(4));
    		owner.setDate_of_birth(rs.getString(5));
    		owner.setNationality(rs.getString(6));
    		owner.setRegion(rs.getString(7));
    		owner.setType_of_law(rs.getString(8));
    		owner.setUseful_law(rs.getString(9));
    		owner.setGender(rs.getString(10));
    		owner.setFile_no(rs.getString(11));
    		owner.setIssued_date(rs.getString(12));
    		owner.setRemark(rs.getString(13));
    }
    	
    	con.close();
    	return owner;
    }
    
}

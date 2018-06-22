package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import form.OtherRecordForm;
import form.UserForm;

public class RetrieveRecords {
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
	public static OtherRecordForm retrieveFatherRecord(String no) throws SQLException{
		
		OtherRecordForm father = new OtherRecordForm();
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	//ResultSet rs = stmt.executeQuery("select * from father_record where serial_no='"+no+"';");
    	ResultSet rs = stmt.executeQuery("select name,date_of_birth,nrc_no,useful_law, if(frc_front is null or frc_front='', null,frc_front) as frc_front,"
    			+ "if(frc_back is null or frc_back='', null, frc_back) as frc_back, if(ucc1 is null or ucc1='', null,ucc1) as ucc1,"
    			+ "if(ucc2 is null or ucc2='', null,ucc2) as ucc2, if(ucc3 is null or ucc3='', null,ucc3) as ucc3,"
    			+ "if(ucc4 is null or ucc4='', null,ucc4) as ucc4, if(ucc5 is null or ucc5='', null,ucc5) as ucc5,"
    			+ "if(form1_front is null or form1_front='', null, form1_front) as form1_front, if(form1_back is null or form1_back='', null,form1_back) as form1_back,"
    			+ "if(form2_front is null or form2_front='', null, form2_front) as form2_front, if(form2_back is null or form2_back='', null, form2_back) as form2_back,"
    			+ "if(form59_4 is null or form59_4='', null, form59_4) as form59_4, if(naing6ka_front is null or naing6ka_front='', null,naing6ka_front) as naing6ka_front,"
    			+ "if(naing6ka_back is null or naing6ka_back='', null, naing6ka_back) as naing6ka_back, if(naing2_front is null or naing2_front='',null, naing2_front) as naing2_front,"
    			+ "if(naing2_back is null or naing2_back='', null, naing2_back) as naing2_back, if(naing4 is null or naing4='', null,naing4) as naing4,"
    			+ "if(nrc is null or nrc='', null,nrc) as nrc, if(eh4_4ka is null or eh4_4ka='', null,eh4_4ka) as eh4_4ka, if(eh2 is null or eh2='', null,eh2) as eh2,"
    			+ "if(pju6_6ka is null or pju6_6ka='', null, pju6_6ka) as pju6_6ka, if(pju8 is null or pju8='', null, pju8) as pju8,"
    			+ "if(statement is null or statement='', null, statement) as statement, if(affidavit is null or affidavit='', null, affidavit) as affidavit,"
    			+ "if(zaza_njanja_affidavit_front is null or zaza_njanja_affidavit_front='', null, zaza_njanja_affidavit_front) as zaza_njanja_affidavit_front,"
    			+ "if(zaza_njanja_affidavit_back is null or zaza_njanja_affidavit_back='', null, zaza_njanja_affidavit_back) as zaza_njanja_affidavit_back,"
    			+ "if(tomb_record is null or tomb_record='', null, tomb_record) as tomb_record, if(other is null or other='', null, other) as other from father_record where serial_no='"+no+"';");
    	while(rs.next()){
    		//rs.getString(1);
    		father.setName(rs.getString(1));
    		father.setDate_of_birth(rs.getString(2));
    		father.setNrc_no(rs.getString(3));
    		father.setUseful_law(rs.getString(4));
    		if(rs.getBlob(5)==null)
    			father.setFrc_front(null);
    		else
    		    father.setFrc_front(rs.getBlob(5).getBinaryStream());
    		if(rs.getBlob(6)==null)
    			father.setFrc_back(null);
    		else
    			father.setFrc_back(rs.getBlob(6).getBinaryStream());
    		if(rs.getBlob(7)==null)
    			father.setUcc1(null);
    		else 
    			father.setUcc1(rs.getBlob(7).getBinaryStream());
    		if(rs.getBlob(8)==null)
    			father.setUcc2(null);
    		else
    			father.setUcc2(rs.getBlob(8).getBinaryStream());
    		if(rs.getBlob(9)==null)
    			father.setUcc3(null);
    		else
    			father.setUcc3(rs.getBlob(9).getBinaryStream());
    		if(rs.getBlob(10)==null)
    			father.setUcc4(null);
    		else
    			father.setUcc4(rs.getBlob(10).getBinaryStream());
    		if(rs.getBlob(11)==null)
    			father.setUcc5(null);
    		else
    			father.setUcc5(rs.getBlob(11).getBinaryStream());
    		if(rs.getBlob(12)==null)
    			father.setForm1_front(null);
    		else
    			father.setForm1_front(rs.getBlob(12).getBinaryStream());
    		if(rs.getBlob(13)==null)
    			father.setForm1_back(null);
    		else
    			father.setForm1_back(rs.getBlob(13).getBinaryStream());
    		if(rs.getBlob(14)==null)
    			father.setForm2_front(null);
    		else
    			father.setForm2_front(rs.getBlob(14).getBinaryStream());
    		if(rs.getBlob(15)==null)
    			father.setForm2_back(null);
    		else
    			father.setForm2_back(rs.getBlob(15).getBinaryStream());
    		if(rs.getBlob(16)==null)
    			father.setForm59_4(null);
    		else
    			father.setForm59_4(rs.getBlob(16).getBinaryStream());
    		if(rs.getBlob(17)==null)
    			father.setNaing6ka_front(null);
    		else
    			father.setNaing6ka_front(rs.getBlob(17).getBinaryStream());
    		if(rs.getBlob(18)==null)
    			father.setNaing6ka_back(null);
    		else
    			father.setNaing6ka_back(rs.getBlob(18).getBinaryStream());
    		if(rs.getBlob(19)==null)
    			father.setNaing2_front(null);
    		else
    			father.setNaing2_front(rs.getBlob(19).getBinaryStream());
    		if(rs.getBlob(20)==null)
    			father.setNaing2_back(null);
    		else
    			father.setNaing2_back(rs.getBlob(20).getBinaryStream());
    		if(rs.getBlob(21)==null)
    			father.setNaing4(null);
    		else
    			father.setNaing4(rs.getBlob(21).getBinaryStream());
    		if(rs.getBlob(22)==null)
    			father.setNrc(null);
    		else
    			father.setNrc(rs.getBlob(22).getBinaryStream());
    		if(rs.getBlob(23)==null)
    			father.setEh4_4ka(null);
    		else
    			father.setEh4_4ka(rs.getBlob(23).getBinaryStream());
    		if(rs.getBlob(24)==null)
    			father.setEh2(null);
    		else
    			father.setEh2(rs.getBlob(24).getBinaryStream());
    		if(rs.getBlob(25)==null)
    			father.setPju6_6ka(null);
    		else
    			father.setPju6_6ka(rs.getBlob(25).getBinaryStream());
    		if(rs.getBlob(26)==null)
    			father.setPju8(null);
    		else
    			father.setPju8(rs.getBlob(26).getBinaryStream());
    		if(rs.getBlob(27)==null)
    			father.setStatement(null);
    		else
    			father.setStatement(rs.getBlob(27).getBinaryStream());
    		if(rs.getBlob(28)==null)
    			father.setAffidavit(null);
    		else
    			father.setAffidavit(rs.getBlob(28).getBinaryStream());
    		if(rs.getBlob(29)==null)
    			father.setZaza_njanja_affidavit_front(null);
    		else
    			father.setZaza_njanja_affidavit_front(rs.getBlob(29).getBinaryStream());
    		if(rs.getBlob(30)==null)
    			father.setZaza_njanja_affidavit_back(null);
    		else
    			father.setZaza_njanja_affidavit_back(rs.getBlob(30).getBinaryStream());
    		if(rs.getBlob(31)==null)
    			father.setTomb_record(null);
    		else
    			father.setTomb_record(rs.getBlob(31).getBinaryStream());
    		if(rs.getBlob(32)==null)
    			father.setOthers(null);
    		else
    			father.setOthers(rs.getBlob(32).getBinaryStream());
    		
    	}
    	
    	con.close();
		return father;
	}
	
	public static OtherRecordForm retrieveMotherRecord(String no) throws SQLException{
		OtherRecordForm father = new OtherRecordForm();
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	//ResultSet rs = stmt.executeQuery("select * from father_record where serial_no='"+no+"';");
    	ResultSet rs = stmt.executeQuery("select name,date_of_birth,nrc_no,useful_law, if(frc_front is null or frc_front='', null,frc_front) as frc_front,"
    			+ "if(frc_back is null or frc_back='', null, frc_back) as frc_back, if(ucc1 is null or ucc1='', null,ucc1) as ucc1,"
    			+ "if(ucc2 is null or ucc2='', null,ucc2) as ucc2, if(ucc3 is null or ucc3='', null,ucc3) as ucc3,"
    			+ "if(ucc4 is null or ucc4='', null,ucc4) as ucc4, if(ucc5 is null or ucc5='', null,ucc5) as ucc5,"
    			+ "if(form1_front is null or form1_front='', null, form1_front) as form1_front, if(form1_back is null or form1_back='', null,form1_back) as form1_back,"
    			+ "if(form2_front is null or form2_front='', null, form2_front) as form2_front, if(form2_back is null or form2_back='', null, form2_back) as form2_back,"
    			+ "if(form59_4 is null or form59_4='', null, form59_4) as form59_4, if(naing6ka_front is null or naing6ka_front='', null,naing6ka_front) as naing6ka_front,"
    			+ "if(naing6ka_back is null or naing6ka_back='', null, naing6ka_back) as naing6ka_back, if(naing2_front is null or naing2_front='',null, naing2_front) as naing2_front,"
    			+ "if(naing2_back is null or naing2_back='', null, naing2_back) as naing2_back, if(naing4 is null or naing4='', null,naing4) as naing4,"
    			+ "if(nrc is null or nrc='', null,nrc) as nrc, if(eh4_4ka is null or eh4_4ka='', null,eh4_4ka) as eh4_4ka, if(eh2 is null or eh2='', null,eh2) as eh2,"
    			+ "if(pju6_6ka is null or pju6_6ka='', null, pju6_6ka) as pju6_6ka, if(pju8 is null or pju8='', null, pju8) as pju8,"
    			+ "if(statement is null or statement='', null, statement) as statement, if(affidavit is null or affidavit='', null, affidavit) as affidavit,"
    			+ "if(zaza_njanja_affidavit_front is null or zaza_njanja_affidavit_front='', null, zaza_njanja_affidavit_front) as zaza_njanja_affidavit_front,"
    			+ "if(zaza_njanja_affidavit_back is null or zaza_njanja_affidavit_back='', null, zaza_njanja_affidavit_back) as zaza_njanja_affidavit_back,"
    			+ "if(tomb_record is null or tomb_record='', null, tomb_record) as tomb_record, if(other is null or other='', null, other) as other from mother_record where serial_no='"+no+"';");
    	while(rs.next()){
    		//rs.getString(1);
    		father.setName(rs.getString(1));
    		father.setDate_of_birth(rs.getString(2));
    		father.setNrc_no(rs.getString(3));
    		father.setUseful_law(rs.getString(4));
    		if(rs.getBlob(5)==null)
    			father.setFrc_front(null);
    		else
    		    father.setFrc_front(rs.getBlob(5).getBinaryStream());
    		if(rs.getBlob(6)==null)
    			father.setFrc_back(null);
    		else
    			father.setFrc_back(rs.getBlob(6).getBinaryStream());
    		if(rs.getBlob(7)==null)
    			father.setUcc1(null);
    		else 
    			father.setUcc1(rs.getBlob(7).getBinaryStream());
    		if(rs.getBlob(8)==null)
    			father.setUcc2(null);
    		else
    			father.setUcc2(rs.getBlob(8).getBinaryStream());
    		if(rs.getBlob(9)==null)
    			father.setUcc3(null);
    		else
    			father.setUcc3(rs.getBlob(9).getBinaryStream());
    		if(rs.getBlob(10)==null)
    			father.setUcc4(null);
    		else
    			father.setUcc4(rs.getBlob(10).getBinaryStream());
    		if(rs.getBlob(11)==null)
    			father.setUcc5(null);
    		else
    			father.setUcc5(rs.getBlob(11).getBinaryStream());
    		if(rs.getBlob(12)==null)
    			father.setForm1_front(null);
    		else
    			father.setForm1_front(rs.getBlob(12).getBinaryStream());
    		if(rs.getBlob(13)==null)
    			father.setForm1_back(null);
    		else
    			father.setForm1_back(rs.getBlob(13).getBinaryStream());
    		if(rs.getBlob(14)==null)
    			father.setForm2_front(null);
    		else
    			father.setForm2_front(rs.getBlob(14).getBinaryStream());
    		if(rs.getBlob(15)==null)
    			father.setForm2_back(null);
    		else
    			father.setForm2_back(rs.getBlob(15).getBinaryStream());
    		if(rs.getBlob(16)==null)
    			father.setForm59_4(null);
    		else
    			father.setForm59_4(rs.getBlob(16).getBinaryStream());
    		if(rs.getBlob(17)==null)
    			father.setNaing6ka_front(null);
    		else
    			father.setNaing6ka_front(rs.getBlob(17).getBinaryStream());
    		if(rs.getBlob(18)==null)
    			father.setNaing6ka_back(null);
    		else
    			father.setNaing6ka_back(rs.getBlob(18).getBinaryStream());
    		if(rs.getBlob(19)==null)
    			father.setNaing2_front(null);
    		else
    			father.setNaing2_front(rs.getBlob(19).getBinaryStream());
    		if(rs.getBlob(20)==null)
    			father.setNaing2_back(null);
    		else
    			father.setNaing2_back(rs.getBlob(20).getBinaryStream());
    		if(rs.getBlob(21)==null)
    			father.setNaing4(null);
    		else
    			father.setNaing4(rs.getBlob(21).getBinaryStream());
    		if(rs.getBlob(22)==null)
    			father.setNrc(null);
    		else
    			father.setNrc(rs.getBlob(22).getBinaryStream());
    		if(rs.getBlob(23)==null)
    			father.setEh4_4ka(null);
    		else
    			father.setEh4_4ka(rs.getBlob(23).getBinaryStream());
    		if(rs.getBlob(24)==null)
    			father.setEh2(null);
    		else
    			father.setEh2(rs.getBlob(24).getBinaryStream());
    		if(rs.getBlob(25)==null)
    			father.setPju6_6ka(null);
    		else
    			father.setPju6_6ka(rs.getBlob(25).getBinaryStream());
    		if(rs.getBlob(26)==null)
    			father.setPju8(null);
    		else
    			father.setPju8(rs.getBlob(26).getBinaryStream());
    		if(rs.getBlob(27)==null)
    			father.setStatement(null);
    		else
    			father.setStatement(rs.getBlob(27).getBinaryStream());
    		if(rs.getBlob(28)==null)
    			father.setAffidavit(null);
    		else
    			father.setAffidavit(rs.getBlob(28).getBinaryStream());
    		if(rs.getBlob(29)==null)
    			father.setZaza_njanja_affidavit_front(null);
    		else
    			father.setZaza_njanja_affidavit_front(rs.getBlob(29).getBinaryStream());
    		if(rs.getBlob(30)==null)
    			father.setZaza_njanja_affidavit_back(null);
    		else
    			father.setZaza_njanja_affidavit_back(rs.getBlob(30).getBinaryStream());
    		if(rs.getBlob(31)==null)
    			father.setTomb_record(null);
    		else
    			father.setTomb_record(rs.getBlob(31).getBinaryStream());
    		if(rs.getBlob(32)==null)
    			father.setOthers(null);
    		else
    			father.setOthers(rs.getBlob(32).getBinaryStream());
    		
    	}
    	
    	con.close();
		return father;
		
	}
	
	public static OtherRecordForm retrieveFGrandFatherRecord(String no) throws SQLException{
		OtherRecordForm father = new OtherRecordForm();
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	//ResultSet rs = stmt.executeQuery("select * from father_record where serial_no='"+no+"';");
    	ResultSet rs = stmt.executeQuery("select name,date_of_birth,nrc_no,useful_law, if(frc_front is null or frc_front='', null,frc_front) as frc_front,"
    			+ "if(frc_back is null or frc_back='', null, frc_back) as frc_back, if(ucc1 is null or ucc1='', null,ucc1) as ucc1,"
    			+ "if(ucc2 is null or ucc2='', null,ucc2) as ucc2, if(ucc3 is null or ucc3='', null,ucc3) as ucc3,"
    			+ "if(ucc4 is null or ucc4='', null,ucc4) as ucc4, if(ucc5 is null or ucc5='', null,ucc5) as ucc5,"
    			+ "if(form1_front is null or form1_front='', null, form1_front) as form1_front, if(form1_back is null or form1_back='', null,form1_back) as form1_back,"
    			+ "if(form2_front is null or form2_front='', null, form2_front) as form2_front, if(form2_back is null or form2_back='', null, form2_back) as form2_back,"
    			+ "if(form59_4 is null or form59_4='', null, form59_4) as form59_4, if(naing6ka_front is null or naing6ka_front='', null,naing6ka_front) as naing6ka_front,"
    			+ "if(naing6ka_back is null or naing6ka_back='', null, naing6ka_back) as naing6ka_back, if(naing2_front is null or naing2_front='',null, naing2_front) as naing2_front,"
    			+ "if(naing2_back is null or naing2_back='', null, naing2_back) as naing2_back, if(naing4 is null or naing4='', null,naing4) as naing4,"
    			+ "if(nrc is null or nrc='', null,nrc) as nrc, if(eh4_4ka is null or eh4_4ka='', null,eh4_4ka) as eh4_4ka, if(eh2 is null or eh2='', null,eh2) as eh2,"
    			+ "if(pju6_6ka is null or pju6_6ka='', null, pju6_6ka) as pju6_6ka, if(pju8 is null or pju8='', null, pju8) as pju8,"
    			+ "if(statement is null or statement='', null, statement) as statement, if(affidavit is null or affidavit='', null, affidavit) as affidavit,"
    			+ "if(zaza_njanja_affidavit_front is null or zaza_njanja_affidavit_front='', null, zaza_njanja_affidavit_front) as zaza_njanja_affidavit_front,"
    			+ "if(zaza_njanja_affidavit_back is null or zaza_njanja_affidavit_back='', null, zaza_njanja_affidavit_back) as zaza_njanja_affidavit_back,"
    			+ "if(tomb_record is null or tomb_record='', null, tomb_record) as tomb_record, if(other is null or other='', null, other) as other from fgrandfather_record where serial_no='"+no+"';");
    	while(rs.next()){
    		//rs.getString(1);
    		father.setName(rs.getString(1));
    		father.setDate_of_birth(rs.getString(2));
    		father.setNrc_no(rs.getString(3));
    		father.setUseful_law(rs.getString(4));
    		if(rs.getBlob(5)==null)
    			father.setFrc_front(null);
    		else
    		    father.setFrc_front(rs.getBlob(5).getBinaryStream());
    		if(rs.getBlob(6)==null)
    			father.setFrc_back(null);
    		else
    			father.setFrc_back(rs.getBlob(6).getBinaryStream());
    		if(rs.getBlob(7)==null)
    			father.setUcc1(null);
    		else 
    			father.setUcc1(rs.getBlob(7).getBinaryStream());
    		if(rs.getBlob(8)==null)
    			father.setUcc2(null);
    		else
    			father.setUcc2(rs.getBlob(8).getBinaryStream());
    		if(rs.getBlob(9)==null)
    			father.setUcc3(null);
    		else
    			father.setUcc3(rs.getBlob(9).getBinaryStream());
    		if(rs.getBlob(10)==null)
    			father.setUcc4(null);
    		else
    			father.setUcc4(rs.getBlob(10).getBinaryStream());
    		if(rs.getBlob(11)==null)
    			father.setUcc5(null);
    		else
    			father.setUcc5(rs.getBlob(11).getBinaryStream());
    		if(rs.getBlob(12)==null)
    			father.setForm1_front(null);
    		else
    			father.setForm1_front(rs.getBlob(12).getBinaryStream());
    		if(rs.getBlob(13)==null)
    			father.setForm1_back(null);
    		else
    			father.setForm1_back(rs.getBlob(13).getBinaryStream());
    		if(rs.getBlob(14)==null)
    			father.setForm2_front(null);
    		else
    			father.setForm2_front(rs.getBlob(14).getBinaryStream());
    		if(rs.getBlob(15)==null)
    			father.setForm2_back(null);
    		else
    			father.setForm2_back(rs.getBlob(15).getBinaryStream());
    		if(rs.getBlob(16)==null)
    			father.setForm59_4(null);
    		else
    			father.setForm59_4(rs.getBlob(16).getBinaryStream());
    		if(rs.getBlob(17)==null)
    			father.setNaing6ka_front(null);
    		else
    			father.setNaing6ka_front(rs.getBlob(17).getBinaryStream());
    		if(rs.getBlob(18)==null)
    			father.setNaing6ka_back(null);
    		else
    			father.setNaing6ka_back(rs.getBlob(18).getBinaryStream());
    		if(rs.getBlob(19)==null)
    			father.setNaing2_front(null);
    		else
    			father.setNaing2_front(rs.getBlob(19).getBinaryStream());
    		if(rs.getBlob(20)==null)
    			father.setNaing2_back(null);
    		else
    			father.setNaing2_back(rs.getBlob(20).getBinaryStream());
    		if(rs.getBlob(21)==null)
    			father.setNaing4(null);
    		else
    			father.setNaing4(rs.getBlob(21).getBinaryStream());
    		if(rs.getBlob(22)==null)
    			father.setNrc(null);
    		else
    			father.setNrc(rs.getBlob(22).getBinaryStream());
    		if(rs.getBlob(23)==null)
    			father.setEh4_4ka(null);
    		else
    			father.setEh4_4ka(rs.getBlob(23).getBinaryStream());
    		if(rs.getBlob(24)==null)
    			father.setEh2(null);
    		else
    			father.setEh2(rs.getBlob(24).getBinaryStream());
    		if(rs.getBlob(25)==null)
    			father.setPju6_6ka(null);
    		else
    			father.setPju6_6ka(rs.getBlob(25).getBinaryStream());
    		if(rs.getBlob(26)==null)
    			father.setPju8(null);
    		else
    			father.setPju8(rs.getBlob(26).getBinaryStream());
    		if(rs.getBlob(27)==null)
    			father.setStatement(null);
    		else
    			father.setStatement(rs.getBlob(27).getBinaryStream());
    		if(rs.getBlob(28)==null)
    			father.setAffidavit(null);
    		else
    			father.setAffidavit(rs.getBlob(28).getBinaryStream());
    		if(rs.getBlob(29)==null)
    			father.setZaza_njanja_affidavit_front(null);
    		else
    			father.setZaza_njanja_affidavit_front(rs.getBlob(29).getBinaryStream());
    		if(rs.getBlob(30)==null)
    			father.setZaza_njanja_affidavit_back(null);
    		else
    			father.setZaza_njanja_affidavit_back(rs.getBlob(30).getBinaryStream());
    		if(rs.getBlob(31)==null)
    			father.setTomb_record(null);
    		else
    			father.setTomb_record(rs.getBlob(31).getBinaryStream());
    		if(rs.getBlob(32)==null)
    			father.setOthers(null);
    		else
    			father.setOthers(rs.getBlob(32).getBinaryStream());
    		
    	}
    	
    	con.close();
		return father;
		}
	public static OtherRecordForm retrieveFGrandMotherRecord(String no) throws SQLException{
		OtherRecordForm father = new OtherRecordForm();
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	//ResultSet rs = stmt.executeQuery("select * from father_record where serial_no='"+no+"';");
    	ResultSet rs = stmt.executeQuery("select name,date_of_birth,nrc_no,useful_law, if(frc_front is null or frc_front='', null,frc_front) as frc_front,"
    			+ "if(frc_back is null or frc_back='', null, frc_back) as frc_back, if(ucc1 is null or ucc1='', null,ucc1) as ucc1,"
    			+ "if(ucc2 is null or ucc2='', null,ucc2) as ucc2, if(ucc3 is null or ucc3='', null,ucc3) as ucc3,"
    			+ "if(ucc4 is null or ucc4='', null,ucc4) as ucc4, if(ucc5 is null or ucc5='', null,ucc5) as ucc5,"
    			+ "if(form1_front is null or form1_front='', null, form1_front) as form1_front, if(form1_back is null or form1_back='', null,form1_back) as form1_back,"
    			+ "if(form2_front is null or form2_front='', null, form2_front) as form2_front, if(form2_back is null or form2_back='', null, form2_back) as form2_back,"
    			+ "if(form59_4 is null or form59_4='', null, form59_4) as form59_4, if(naing6ka_front is null or naing6ka_front='', null,naing6ka_front) as naing6ka_front,"
    			+ "if(naing6ka_back is null or naing6ka_back='', null, naing6ka_back) as naing6ka_back, if(naing2_front is null or naing2_front='',null, naing2_front) as naing2_front,"
    			+ "if(naing2_back is null or naing2_back='', null, naing2_back) as naing2_back, if(naing4 is null or naing4='', null,naing4) as naing4,"
    			+ "if(nrc is null or nrc='', null,nrc) as nrc, if(eh4_4ka is null or eh4_4ka='', null,eh4_4ka) as eh4_4ka, if(eh2 is null or eh2='', null,eh2) as eh2,"
    			+ "if(pju6_6ka is null or pju6_6ka='', null, pju6_6ka) as pju6_6ka, if(pju8 is null or pju8='', null, pju8) as pju8,"
    			+ "if(statement is null or statement='', null, statement) as statement, if(affidavit is null or affidavit='', null, affidavit) as affidavit,"
    			+ "if(zaza_njanja_affidavit_front is null or zaza_njanja_affidavit_front='', null, zaza_njanja_affidavit_front) as zaza_njanja_affidavit_front,"
    			+ "if(zaza_njanja_affidavit_back is null or zaza_njanja_affidavit_back='', null, zaza_njanja_affidavit_back) as zaza_njanja_affidavit_back,"
    			+ "if(tomb_record is null or tomb_record='', null, tomb_record) as tomb_record, if(other is null or other='', null, other) as other from fgrandmother_record where serial_no='"+no+"';");
    	while(rs.next()){
    		//rs.getString(1);
    		father.setName(rs.getString(1));
    		father.setDate_of_birth(rs.getString(2));
    		father.setNrc_no(rs.getString(3));
    		father.setUseful_law(rs.getString(4));
    		if(rs.getBlob(5)==null)
    			father.setFrc_front(null);
    		else
    		    father.setFrc_front(rs.getBlob(5).getBinaryStream());
    		if(rs.getBlob(6)==null)
    			father.setFrc_back(null);
    		else
    			father.setFrc_back(rs.getBlob(6).getBinaryStream());
    		if(rs.getBlob(7)==null)
    			father.setUcc1(null);
    		else 
    			father.setUcc1(rs.getBlob(7).getBinaryStream());
    		if(rs.getBlob(8)==null)
    			father.setUcc2(null);
    		else
    			father.setUcc2(rs.getBlob(8).getBinaryStream());
    		if(rs.getBlob(9)==null)
    			father.setUcc3(null);
    		else
    			father.setUcc3(rs.getBlob(9).getBinaryStream());
    		if(rs.getBlob(10)==null)
    			father.setUcc4(null);
    		else
    			father.setUcc4(rs.getBlob(10).getBinaryStream());
    		if(rs.getBlob(11)==null)
    			father.setUcc5(null);
    		else
    			father.setUcc5(rs.getBlob(11).getBinaryStream());
    		if(rs.getBlob(12)==null)
    			father.setForm1_front(null);
    		else
    			father.setForm1_front(rs.getBlob(12).getBinaryStream());
    		if(rs.getBlob(13)==null)
    			father.setForm1_back(null);
    		else
    			father.setForm1_back(rs.getBlob(13).getBinaryStream());
    		if(rs.getBlob(14)==null)
    			father.setForm2_front(null);
    		else
    			father.setForm2_front(rs.getBlob(14).getBinaryStream());
    		if(rs.getBlob(15)==null)
    			father.setForm2_back(null);
    		else
    			father.setForm2_back(rs.getBlob(15).getBinaryStream());
    		if(rs.getBlob(16)==null)
    			father.setForm59_4(null);
    		else
    			father.setForm59_4(rs.getBlob(16).getBinaryStream());
    		if(rs.getBlob(17)==null)
    			father.setNaing6ka_front(null);
    		else
    			father.setNaing6ka_front(rs.getBlob(17).getBinaryStream());
    		if(rs.getBlob(18)==null)
    			father.setNaing6ka_back(null);
    		else
    			father.setNaing6ka_back(rs.getBlob(18).getBinaryStream());
    		if(rs.getBlob(19)==null)
    			father.setNaing2_front(null);
    		else
    			father.setNaing2_front(rs.getBlob(19).getBinaryStream());
    		if(rs.getBlob(20)==null)
    			father.setNaing2_back(null);
    		else
    			father.setNaing2_back(rs.getBlob(20).getBinaryStream());
    		if(rs.getBlob(21)==null)
    			father.setNaing4(null);
    		else
    			father.setNaing4(rs.getBlob(21).getBinaryStream());
    		if(rs.getBlob(22)==null)
    			father.setNrc(null);
    		else
    			father.setNrc(rs.getBlob(22).getBinaryStream());
    		if(rs.getBlob(23)==null)
    			father.setEh4_4ka(null);
    		else
    			father.setEh4_4ka(rs.getBlob(23).getBinaryStream());
    		if(rs.getBlob(24)==null)
    			father.setEh2(null);
    		else
    			father.setEh2(rs.getBlob(24).getBinaryStream());
    		if(rs.getBlob(25)==null)
    			father.setPju6_6ka(null);
    		else
    			father.setPju6_6ka(rs.getBlob(25).getBinaryStream());
    		if(rs.getBlob(26)==null)
    			father.setPju8(null);
    		else
    			father.setPju8(rs.getBlob(26).getBinaryStream());
    		if(rs.getBlob(27)==null)
    			father.setStatement(null);
    		else
    			father.setStatement(rs.getBlob(27).getBinaryStream());
    		if(rs.getBlob(28)==null)
    			father.setAffidavit(null);
    		else
    			father.setAffidavit(rs.getBlob(28).getBinaryStream());
    		if(rs.getBlob(29)==null)
    			father.setZaza_njanja_affidavit_front(null);
    		else
    			father.setZaza_njanja_affidavit_front(rs.getBlob(29).getBinaryStream());
    		if(rs.getBlob(30)==null)
    			father.setZaza_njanja_affidavit_back(null);
    		else
    			father.setZaza_njanja_affidavit_back(rs.getBlob(30).getBinaryStream());
    		if(rs.getBlob(31)==null)
    			father.setTomb_record(null);
    		else
    			father.setTomb_record(rs.getBlob(31).getBinaryStream());
    		if(rs.getBlob(32)==null)
    			father.setOthers(null);
    		else
    			father.setOthers(rs.getBlob(32).getBinaryStream());
    		
    	}
    	
    	con.close();
		return father;
		}
	public static OtherRecordForm retrieveMGrandFatherRecord(String no) throws SQLException{
		OtherRecordForm father = new OtherRecordForm();
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	//ResultSet rs = stmt.executeQuery("select * from father_record where serial_no='"+no+"';");
    	ResultSet rs = stmt.executeQuery("select name,date_of_birth,nrc_no,useful_law, if(frc_front is null or frc_front='', null,frc_front) as frc_front,"
    			+ "if(frc_back is null or frc_back='', null, frc_back) as frc_back, if(ucc1 is null or ucc1='', null,ucc1) as ucc1,"
    			+ "if(ucc2 is null or ucc2='', null,ucc2) as ucc2, if(ucc3 is null or ucc3='', null,ucc3) as ucc3,"
    			+ "if(ucc4 is null or ucc4='', null,ucc4) as ucc4, if(ucc5 is null or ucc5='', null,ucc5) as ucc5,"
    			+ "if(form1_front is null or form1_front='', null, form1_front) as form1_front, if(form1_back is null or form1_back='', null,form1_back) as form1_back,"
    			+ "if(form2_front is null or form2_front='', null, form2_front) as form2_front, if(form2_back is null or form2_back='', null, form2_back) as form2_back,"
    			+ "if(form59_4 is null or form59_4='', null, form59_4) as form59_4, if(naing6ka_front is null or naing6ka_front='', null,naing6ka_front) as naing6ka_front,"
    			+ "if(naing6ka_back is null or naing6ka_back='', null, naing6ka_back) as naing6ka_back, if(naing2_front is null or naing2_front='',null, naing2_front) as naing2_front,"
    			+ "if(naing2_back is null or naing2_back='', null, naing2_back) as naing2_back, if(naing4 is null or naing4='', null,naing4) as naing4,"
    			+ "if(nrc is null or nrc='', null,nrc) as nrc, if(eh4_4ka is null or eh4_4ka='', null,eh4_4ka) as eh4_4ka, if(eh2 is null or eh2='', null,eh2) as eh2,"
    			+ "if(pju6_6ka is null or pju6_6ka='', null, pju6_6ka) as pju6_6ka, if(pju8 is null or pju8='', null, pju8) as pju8,"
    			+ "if(statement is null or statement='', null, statement) as statement, if(affidavit is null or affidavit='', null, affidavit) as affidavit,"
    			+ "if(zaza_njanja_affidavit_front is null or zaza_njanja_affidavit_front='', null, zaza_njanja_affidavit_front) as zaza_njanja_affidavit_front,"
    			+ "if(zaza_njanja_affidavit_back is null or zaza_njanja_affidavit_back='', null, zaza_njanja_affidavit_back) as zaza_njanja_affidavit_back,"
    			+ "if(tomb_record is null or tomb_record='', null, tomb_record) as tomb_record, if(other is null or other='', null, other) as other from mgrandfather_record where serial_no='"+no+"';");
    	while(rs.next()){
    		//rs.getString(1);
    		father.setName(rs.getString(1));
    		father.setDate_of_birth(rs.getString(2));
    		father.setNrc_no(rs.getString(3));
    		father.setUseful_law(rs.getString(4));
    		if(rs.getBlob(5)==null)
    			father.setFrc_front(null);
    		else
    		    father.setFrc_front(rs.getBlob(5).getBinaryStream());
    		if(rs.getBlob(6)==null)
    			father.setFrc_back(null);
    		else
    			father.setFrc_back(rs.getBlob(6).getBinaryStream());
    		if(rs.getBlob(7)==null)
    			father.setUcc1(null);
    		else 
    			father.setUcc1(rs.getBlob(7).getBinaryStream());
    		if(rs.getBlob(8)==null)
    			father.setUcc2(null);
    		else
    			father.setUcc2(rs.getBlob(8).getBinaryStream());
    		if(rs.getBlob(9)==null)
    			father.setUcc3(null);
    		else
    			father.setUcc3(rs.getBlob(9).getBinaryStream());
    		if(rs.getBlob(10)==null)
    			father.setUcc4(null);
    		else
    			father.setUcc4(rs.getBlob(10).getBinaryStream());
    		if(rs.getBlob(11)==null)
    			father.setUcc5(null);
    		else
    			father.setUcc5(rs.getBlob(11).getBinaryStream());
    		if(rs.getBlob(12)==null)
    			father.setForm1_front(null);
    		else
    			father.setForm1_front(rs.getBlob(12).getBinaryStream());
    		if(rs.getBlob(13)==null)
    			father.setForm1_back(null);
    		else
    			father.setForm1_back(rs.getBlob(13).getBinaryStream());
    		if(rs.getBlob(14)==null)
    			father.setForm2_front(null);
    		else
    			father.setForm2_front(rs.getBlob(14).getBinaryStream());
    		if(rs.getBlob(15)==null)
    			father.setForm2_back(null);
    		else
    			father.setForm2_back(rs.getBlob(15).getBinaryStream());
    		if(rs.getBlob(16)==null)
    			father.setForm59_4(null);
    		else
    			father.setForm59_4(rs.getBlob(16).getBinaryStream());
    		if(rs.getBlob(17)==null)
    			father.setNaing6ka_front(null);
    		else
    			father.setNaing6ka_front(rs.getBlob(17).getBinaryStream());
    		if(rs.getBlob(18)==null)
    			father.setNaing6ka_back(null);
    		else
    			father.setNaing6ka_back(rs.getBlob(18).getBinaryStream());
    		if(rs.getBlob(19)==null)
    			father.setNaing2_front(null);
    		else
    			father.setNaing2_front(rs.getBlob(19).getBinaryStream());
    		if(rs.getBlob(20)==null)
    			father.setNaing2_back(null);
    		else
    			father.setNaing2_back(rs.getBlob(20).getBinaryStream());
    		if(rs.getBlob(21)==null)
    			father.setNaing4(null);
    		else
    			father.setNaing4(rs.getBlob(21).getBinaryStream());
    		if(rs.getBlob(22)==null)
    			father.setNrc(null);
    		else
    			father.setNrc(rs.getBlob(22).getBinaryStream());
    		if(rs.getBlob(23)==null)
    			father.setEh4_4ka(null);
    		else
    			father.setEh4_4ka(rs.getBlob(23).getBinaryStream());
    		if(rs.getBlob(24)==null)
    			father.setEh2(null);
    		else
    			father.setEh2(rs.getBlob(24).getBinaryStream());
    		if(rs.getBlob(25)==null)
    			father.setPju6_6ka(null);
    		else
    			father.setPju6_6ka(rs.getBlob(25).getBinaryStream());
    		if(rs.getBlob(26)==null)
    			father.setPju8(null);
    		else
    			father.setPju8(rs.getBlob(26).getBinaryStream());
    		if(rs.getBlob(27)==null)
    			father.setStatement(null);
    		else
    			father.setStatement(rs.getBlob(27).getBinaryStream());
    		if(rs.getBlob(28)==null)
    			father.setAffidavit(null);
    		else
    			father.setAffidavit(rs.getBlob(28).getBinaryStream());
    		if(rs.getBlob(29)==null)
    			father.setZaza_njanja_affidavit_front(null);
    		else
    			father.setZaza_njanja_affidavit_front(rs.getBlob(29).getBinaryStream());
    		if(rs.getBlob(30)==null)
    			father.setZaza_njanja_affidavit_back(null);
    		else
    			father.setZaza_njanja_affidavit_back(rs.getBlob(30).getBinaryStream());
    		if(rs.getBlob(31)==null)
    			father.setTomb_record(null);
    		else
    			father.setTomb_record(rs.getBlob(31).getBinaryStream());
    		if(rs.getBlob(32)==null)
    			father.setOthers(null);
    		else
    			father.setOthers(rs.getBlob(32).getBinaryStream());
    		
    	}
    	
    	con.close();
		return father;
		}
	public static OtherRecordForm retrieveMGrandMotherRecord(String no) throws SQLException{
		OtherRecordForm father = new OtherRecordForm();
		createDBConnection();
		Statement stmt = con.createStatement();
    	stmt.executeQuery("set global max_allowed_packet=16*1024*1024;");
    	//ResultSet rs = stmt.executeQuery("select * from father_record where serial_no='"+no+"';");
    	ResultSet rs = stmt.executeQuery("select name,date_of_birth,nrc_no,useful_law, if(frc_front is null or frc_front='', null,frc_front) as frc_front,"
    			+ "if(frc_back is null or frc_back='', null, frc_back) as frc_back, if(ucc1 is null or ucc1='', null,ucc1) as ucc1,"
    			+ "if(ucc2 is null or ucc2='', null,ucc2) as ucc2, if(ucc3 is null or ucc3='', null,ucc3) as ucc3,"
    			+ "if(ucc4 is null or ucc4='', null,ucc4) as ucc4, if(ucc5 is null or ucc5='', null,ucc5) as ucc5,"
    			+ "if(form1_front is null or form1_front='', null, form1_front) as form1_front, if(form1_back is null or form1_back='', null,form1_back) as form1_back,"
    			+ "if(form2_front is null or form2_front='', null, form2_front) as form2_front, if(form2_back is null or form2_back='', null, form2_back) as form2_back,"
    			+ "if(form59_4 is null or form59_4='', null, form59_4) as form59_4, if(naing6ka_front is null or naing6ka_front='', null,naing6ka_front) as naing6ka_front,"
    			+ "if(naing6ka_back is null or naing6ka_back='', null, naing6ka_back) as naing6ka_back, if(naing2_front is null or naing2_front='',null, naing2_front) as naing2_front,"
    			+ "if(naing2_back is null or naing2_back='', null, naing2_back) as naing2_back, if(naing4 is null or naing4='', null,naing4) as naing4,"
    			+ "if(nrc is null or nrc='', null,nrc) as nrc, if(eh4_4ka is null or eh4_4ka='', null,eh4_4ka) as eh4_4ka, if(eh2 is null or eh2='', null,eh2) as eh2,"
    			+ "if(pju6_6ka is null or pju6_6ka='', null, pju6_6ka) as pju6_6ka, if(pju8 is null or pju8='', null, pju8) as pju8,"
    			+ "if(statement is null or statement='', null, statement) as statement, if(affidavit is null or affidavit='', null, affidavit) as affidavit,"
    			+ "if(zaza_njanja_affidavit_front is null or zaza_njanja_affidavit_front='', null, zaza_njanja_affidavit_front) as zaza_njanja_affidavit_front,"
    			+ "if(zaza_njanja_affidavit_back is null or zaza_njanja_affidavit_back='', null, zaza_njanja_affidavit_back) as zaza_njanja_affidavit_back,"
    			+ "if(tomb_record is null or tomb_record='', null, tomb_record) as tomb_record, if(other is null or other='', null, other) as other from mgrandmother_record where serial_no='"+no+"';");
    	while(rs.next()){
    		//rs.getString(1);
    		father.setName(rs.getString(1));
    		father.setDate_of_birth(rs.getString(2));
    		father.setNrc_no(rs.getString(3));
    		father.setUseful_law(rs.getString(4));
    		if(rs.getBlob(5)==null)
    			father.setFrc_front(null);
    		else
    		    father.setFrc_front(rs.getBlob(5).getBinaryStream());
    		if(rs.getBlob(6)==null)
    			father.setFrc_back(null);
    		else
    			father.setFrc_back(rs.getBlob(6).getBinaryStream());
    		if(rs.getBlob(7)==null)
    			father.setUcc1(null);
    		else 
    			father.setUcc1(rs.getBlob(7).getBinaryStream());
    		if(rs.getBlob(8)==null)
    			father.setUcc2(null);
    		else
    			father.setUcc2(rs.getBlob(8).getBinaryStream());
    		if(rs.getBlob(9)==null)
    			father.setUcc3(null);
    		else
    			father.setUcc3(rs.getBlob(9).getBinaryStream());
    		if(rs.getBlob(10)==null)
    			father.setUcc4(null);
    		else
    			father.setUcc4(rs.getBlob(10).getBinaryStream());
    		if(rs.getBlob(11)==null)
    			father.setUcc5(null);
    		else
    			father.setUcc5(rs.getBlob(11).getBinaryStream());
    		if(rs.getBlob(12)==null)
    			father.setForm1_front(null);
    		else
    			father.setForm1_front(rs.getBlob(12).getBinaryStream());
    		if(rs.getBlob(13)==null)
    			father.setForm1_back(null);
    		else
    			father.setForm1_back(rs.getBlob(13).getBinaryStream());
    		if(rs.getBlob(14)==null)
    			father.setForm2_front(null);
    		else
    			father.setForm2_front(rs.getBlob(14).getBinaryStream());
    		if(rs.getBlob(15)==null)
    			father.setForm2_back(null);
    		else
    			father.setForm2_back(rs.getBlob(15).getBinaryStream());
    		if(rs.getBlob(16)==null)
    			father.setForm59_4(null);
    		else
    			father.setForm59_4(rs.getBlob(16).getBinaryStream());
    		if(rs.getBlob(17)==null)
    			father.setNaing6ka_front(null);
    		else
    			father.setNaing6ka_front(rs.getBlob(17).getBinaryStream());
    		if(rs.getBlob(18)==null)
    			father.setNaing6ka_back(null);
    		else
    			father.setNaing6ka_back(rs.getBlob(18).getBinaryStream());
    		if(rs.getBlob(19)==null)
    			father.setNaing2_front(null);
    		else
    			father.setNaing2_front(rs.getBlob(19).getBinaryStream());
    		if(rs.getBlob(20)==null)
    			father.setNaing2_back(null);
    		else
    			father.setNaing2_back(rs.getBlob(20).getBinaryStream());
    		if(rs.getBlob(21)==null)
    			father.setNaing4(null);
    		else
    			father.setNaing4(rs.getBlob(21).getBinaryStream());
    		if(rs.getBlob(22)==null)
    			father.setNrc(null);
    		else
    			father.setNrc(rs.getBlob(22).getBinaryStream());
    		if(rs.getBlob(23)==null)
    			father.setEh4_4ka(null);
    		else
    			father.setEh4_4ka(rs.getBlob(23).getBinaryStream());
    		if(rs.getBlob(24)==null)
    			father.setEh2(null);
    		else
    			father.setEh2(rs.getBlob(24).getBinaryStream());
    		if(rs.getBlob(25)==null)
    			father.setPju6_6ka(null);
    		else
    			father.setPju6_6ka(rs.getBlob(25).getBinaryStream());
    		if(rs.getBlob(26)==null)
    			father.setPju8(null);
    		else
    			father.setPju8(rs.getBlob(26).getBinaryStream());
    		if(rs.getBlob(27)==null)
    			father.setStatement(null);
    		else
    			father.setStatement(rs.getBlob(27).getBinaryStream());
    		if(rs.getBlob(28)==null)
    			father.setAffidavit(null);
    		else
    			father.setAffidavit(rs.getBlob(28).getBinaryStream());
    		if(rs.getBlob(29)==null)
    			father.setZaza_njanja_affidavit_front(null);
    		else
    			father.setZaza_njanja_affidavit_front(rs.getBlob(29).getBinaryStream());
    		if(rs.getBlob(30)==null)
    			father.setZaza_njanja_affidavit_back(null);
    		else
    			father.setZaza_njanja_affidavit_back(rs.getBlob(30).getBinaryStream());
    		if(rs.getBlob(31)==null)
    			father.setTomb_record(null);
    		else
    			father.setTomb_record(rs.getBlob(31).getBinaryStream());
    		if(rs.getBlob(32)==null)
    			father.setOthers(null);
    		else
    			father.setOthers(rs.getBlob(32).getBinaryStream());
    		
    	}
    	
    	con.close();
		return father;
		}
	public static ArrayList<UserForm> retrieveAllUser() throws SQLException{
		ArrayList<UserForm> userList = new ArrayList<UserForm>();
		createDBConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from user;");
		while(rs.next()){
			UserForm user = new UserForm();
			user.setNo(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPassword(rs.getString(3));
			user.setRole(rs.getBoolean(4));
			userList.add(user);
		}
	
    	con.close();
		return userList;
	}

}

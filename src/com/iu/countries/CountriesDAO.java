package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.regions.RegionsDTO;
import com.iu.util.DBConnector;

public class CountriesDAO{
	//getDetail : coutries_id로 검색
	public CountriesDTO getDetail(String country_ID) throws Exception{
		CountriesDTO countriesDTO = null;
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID =?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, country_ID);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			String rID = rs.getString("COUNTRY_ID");
			String rName = rs.getString("COUNTRY_NAME");
			countriesDTO.setCountry_ID(rID);
			countriesDTO.setCountry_name(rName);
//			System.out.println(rID);
//			System.out.println(rName);
		}
		//6.자원해제
		DBConnector.disConnect(rs, st, con);
		return countriesDTO;
	}
	
	public void getList() throws Exception{
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString("Country_id");
			String name = rs.getString("Country_name");
			System.out.print(id+" ");
			System.out.println(name);
		}
		//6.자원해제
		DBConnector.disConnect(rs, st, con);
	}

}

package com.iu.test;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		DBConnector dbConnector = new DBConnector();
		RegionsDAO regionDAO = new RegionsDAO();
		CountriesDAO countryDAO = new CountriesDAO();
		try {
//			regionDAO.getList();
			countryDAO.getList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

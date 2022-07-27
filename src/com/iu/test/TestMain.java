package com.iu.test;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		DBConnector dbConnector = new DBConnector();
		RegionsDAO regionDAO = new RegionsDAO();
		CountriesDAO countryDAO = new CountriesDAO();
		RegionsView regionsView = new RegionsView();
		try {
//			regionDAO.getList();
//			countryDAO.getList();
//			regionDAO.getDetail(1);
			regionsView.view(regionDAO.getDetail(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

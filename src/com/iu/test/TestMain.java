package com.iu.test;

import com.iu.countries.CountriesDAO;
import com.iu.employees.EmployeesDAO;
import com.iu.employees.EmployeesDTO;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		DBConnector dbConnector = new DBConnector();
		RegionsDAO regionDAO = new RegionsDAO();
		CountriesDAO countryDAO = new CountriesDAO();
		RegionsView regionsView = new RegionsView();
		EmployeesDAO employeesDAO = new EmployeesDAO();
		EmployeesDTO employeesDTO = new EmployeesDTO();
		try {
//			regionDAO.getList();
//			countryDAO.getList();
//			regionDAO.getDetail(1);
//			regionsView.view(regionDAO.getDetail(1));
//			employeesDAO.getSalaryInfo();
//			countriesDAO.
			employeesDTO.setEmployee_id(192);
			employeesDTO = employeesDAO.getJoinTest(employeesDTO);
			System.out.println("LAST_NAME\t SALARY\t MLAST_NAME\t MSALARY");
			System.out.print(employeesDTO.getLast_name()+"\t");
			System.out.print(employeesDTO.getSalary()+"\t");
			System.out.print(employeesDTO.getMlast_name()+"\t");
			System.out.print(employeesDTO.getMsalary()+"\t");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

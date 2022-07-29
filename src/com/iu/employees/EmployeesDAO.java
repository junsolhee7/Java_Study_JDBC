package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.iu.util.DBConnector;

public class EmployeesDAO {
	public EmployeesDTO getJoinTest(EmployeesDTO employeesDTO) throws Exception{
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		//2.sql 작성
		String sql = "SELECT E.LAST_NAME, E.SALARY, M.LAST_NAME, M.SALARY "
				+ "FROM EMPLOYEES E "
				+ "    INNER JOIN "
				+ "    EMPLOYEES M "
				+ "    ON(E.MANAGER_ID=M.EMPLOYEE_ID) "
				+ "WHERE E.EMPLOYEE_ID=?";
		//3.미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4.? 세팅
		st.setInt(1, employeesDTO.getEmployee_id());
		
		//5.전송후 결과처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			employeesDTO = new EmployeesDTO();
			
			employeesDTO.setLast_name(rs.getString("LAST_NAME"));
			employeesDTO.setSalary(rs.getInt("SALARY"));
//			employeesDTO.setMlast_name(rs.getString("LAST_NAME_1"));//_1?
//			employeesDTO.setMsalary(rs.getInt("SALARY_1"));//_1?
			
		}
		//6.연결 해제
		DBConnector.disConnect(rs, st, con); 
		return employeesDTO;
	}
	public void getList() {
		
	}
	public void getDetail() {
		
	}
	public void getSalaryInfo() throws Exception{

		//1.db 연결
		Connection con = DBConnector.getConnection();
		//2.sql 작성
		String sql = "SELECT SUM(SALARY), AVG(SALARY), MAX(SALARY) FROM EMPLOYEES";
		//3.미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		//4.?가 있으면 값세팅
		//5.최종 전송 후 결과처리
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			
			int sum = rs.getInt("SUM(SALARY)");
			double avg = rs.getDouble(2);
			int max = rs.getInt("MAX");
			System.out.println(sum);
			System.out.println(avg);
			System.out.println(max);
		}
		//6.자원 해제
		DBConnector.disConnect(rs, st, con);
		
				
	}

}

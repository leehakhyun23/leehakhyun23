package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Delete {

	public static void main(String[] args) {
		Connection con = null;
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";
	      String driver = "oracle.jdbc.driver.OracleDriver";
	      String id = "scott";
	      String pw = "tiger";
	      PreparedStatement pstmt = null;
	      
	            
	      try {
	         Class.forName(driver);
	         con = DriverManager.getConnection(url, id, pw);
	         
	         Scanner scanner = new Scanner(System.in);
	         
	         System.out.print("삭제할 회원의 번호를 입력하세요 : ");
	         int num = scanner.nextInt();
	         
	         String sql = "delete from customer where num = ?";
	         
	         pstmt = con.prepareStatement(sql);
	         
	         pstmt.setInt(1, num);
	         
	         pstmt.executeUpdate();
	         
	         System.out.println("성공적으로 회원 삭제가 완료되었습니다.");
	         
	       } catch (ClassNotFoundException e) {
	               e.printStackTrace();
	      } catch (SQLException e) {
	               e.printStackTrace();
	      }
	      try {
	             if(con != null)   con.close();
	             if(pstmt != null) pstmt.close();
	                  
	      } catch (SQLException e) {
	                  e.printStackTrace();
	      }

	   }

	}
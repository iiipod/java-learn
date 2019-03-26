package solidot.org;

import java.sql.Connection;
import java.sql.DriverManager;
public class mysqlTest {
		
	public Connection connectToMySql() {
		try {
//			String driver = "com.mysql.cj.jdbc.Driver";//根据报错信息修改
			String driver = "com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/pwn?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";//链接的mysql
			Class.forName(driver).newInstance();//处理异常
			Connection connection = DriverManager.getConnection(url,"user","123456");//处理异常
			System.out.println(connection.toString());//测试是否连接成功
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error:数据库连接出错");
		}
		return null;//catch之后执行
	}


}

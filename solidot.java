package solidot;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;


public class solidot<prviate> {
	public static void main(String[] args) {
	//final String url = "http://iiipod.github.io/";
	final String url = "http://solidot.org";
	Document doc = null;
	try {
		doc = Jsoup.connect(url).get();
		//doc = Jsoup.parse(new URL(url).openStream(), "UTF-8", url);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//String title = doc.getElementsByClass("posts").text();
	//String title = doc.getElementsByClass("p_mainnew").text();
	//System.out.println(title);
	
	
	Elements title = doc.select("div.ct_tittle > div.bg_htit");
	
	for(Element t1:title)
	{
		System.out.println(t1.text());
	}
	
	for(int i=0;i<20;i++)
	{
		System.out.println(title.eachText());
	}
	
	Elements content = doc.select("div.p_content > div");

	for(Element c1:content) {
		System.out.println(c1.text());
	}
	
	//stem.out.println(title.html());
	
	//Element content = doc.selectFirst("div.p_content > div");
	//System.out.println(content.text());
	//solidot.connjavadb();
	
	}
	
	
	static void connjavadb() {
		String url="jdbc:mysql://127.0.0.1:3306/";

		String user="java";

		String password="www.l0.pl";
		
		Class.forName("com.mysql.jdbc.Driver");

		try {
			java.sql.Connection conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//java.sql.Connection conn;
		Statement curse = conn.createStatement();
		ResultSet rs=curse.executeQuery("select * from user");
		
		rs.close();
		curse.close();
		conn.close();
	}
}

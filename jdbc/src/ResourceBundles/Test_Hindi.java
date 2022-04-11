package ResourceBundles;

import java.sql.Connection;
import java.util.ResourceBundle;

public class Test_Hindi {

	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundles.hi");
		
		System.out.println(rb.getString("greeting"));

	}
}

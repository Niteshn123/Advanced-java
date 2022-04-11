package jdbcProjectFstMarksheet;

public class Test_Marksheet_Model {
	public static void main(String[] args) throws Exception {
		Testadd();
	}

	private static void Testadd() throws Exception {
		
		MarksheetJavaBean bean = new MarksheetJavaBean();
		bean.setId(5);
	    bean.setRollNo("Ray01");
	    bean.setName("Nitesh");
	    bean.setLname("vishvkarma");
	    bean.setPhy(78);
	    bean.setChem(50);
	    bean.setMaths(95);
	    
	    Marksheet_Model model = new Marksheet_Model();
	    model.add(bean);
	
	
	}

}

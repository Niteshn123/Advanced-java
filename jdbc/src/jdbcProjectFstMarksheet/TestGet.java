package jdbcProjectFstMarksheet;

public class TestGet {
	
	public static void main(String[] args) throws Exception {
		testget();
	}

	private static void testget() throws Exception {
		
		MarksheetJavaBean bean = new MarksheetJavaBean();
         bean.setRollNo("Ray04");
         
         Model_GET mg = new Model_GET();
         mg.get(bean);
         
		
	}

}

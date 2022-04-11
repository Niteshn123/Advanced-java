package jdbcProjectFstMarksheet;

public class TestMarksheetModel_Delete {

	public static void main(String[] args) throws Exception {
		Testdelete();
	}

		
		private static void Testdelete() throws Exception {
		// TODO Auto-generated method stub
		

		MarksheetJavaBean bean = new MarksheetJavaBean();
		bean.setId(5);
	

		MarksheetModeDelete model =new MarksheetModeDelete();
	    model.delete(bean);;
	    

		}
}

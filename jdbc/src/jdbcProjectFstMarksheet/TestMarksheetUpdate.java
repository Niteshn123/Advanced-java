package jdbcProjectFstMarksheet;

public class TestMarksheetUpdate {
	public static void main(String[] args) throws Exception {
		Testupdate();
	}

	private static void Testupdate() throws Exception {
		
		MarksheetJavaBean bean = new MarksheetJavaBean();
		//bean.setId(2);
	   
		bean.setName("abhishek");
		bean.setId(2);

	    MarksheetModelUpdate model =new MarksheetModelUpdate();
	    model.update(bean);
	    


	}
}	

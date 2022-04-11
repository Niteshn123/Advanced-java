package ResourceBundles;

import java.util.Iterator;
import java.util.List;

import jdbcProjectFstMarksheet.MarksheetJavaBean;
import jdbcProjectFstMarksheet.MarksheetModeDelete;
import jdbcProjectFstMarksheet.MarksheetModelUpdate;

public class Test_Marksheet_Model {
	public static void main(String[] args) throws Exception {
		// Testadd();
		// testupdate();
		// Testdelete();
		// TestMeritlist();
		testSearch();

	}

	private static void testSearch() throws Exception {
		Marksheet_Model model = new Marksheet_Model();
		List list = model.search();
		Iterator it = list.iterator();

		while (it.hasNext()) {

			MarksheetJavaBean bean1 = (MarksheetJavaBean) it.next();
			System.out.print(bean1.getId());
			System.out.print("\t" + bean1.getRollNo());
			System.out.print("\t" + bean1.getLname());
			System.out.print("\t" + bean1.getLname());
			System.out.print("\t" + bean1.getPhy());
			System.out.print("\t" + bean1.getChem());
			System.out.println("\t" + bean1.getMaths());

		}

	}

	private static void Testadd() throws Exception {

		MarksheetJavaBean bean = new MarksheetJavaBean();
		bean.setId(12);
		bean.setRollNo("Ray010");
		bean.setName("Nitesh");
		bean.setLname("vishvkarma");
		bean.setPhy(78);
		bean.setChem(50);
		bean.setMaths(95);

		Marksheet_Model model = new Marksheet_Model();
		model.add(bean);

	}

	private static void testupdate() throws Exception {

		MarksheetJavaBean bean = new MarksheetJavaBean();
		// bean.setId(2);

		bean.setName("abhishek");
		bean.setId(2);

		MarksheetModelUpdate model = new MarksheetModelUpdate();
		model.update(bean);
	}

	private static void Testdelete() throws Exception {
		// TODO Auto-generated method stub

		MarksheetJavaBean bean = new MarksheetJavaBean();
		bean.setId(4);
		MarksheetModeDelete model = new MarksheetModeDelete();
		model.delete(bean);
		;
	}

	private static void TestMeritlist() throws Exception {
		// TODO Auto-generated method stub
		Marksheet_Model model = new Marksheet_Model();
		List list = model.getMeritList();
		Iterator it = list.iterator();

		while (it.hasNext()) {

			MarksheetJavaBean bean1 = (MarksheetJavaBean) it.next();
			System.out.println(bean1.getId());
			System.out.println("\t" + bean1.getRollNo());
			System.out.println("\t" + bean1.getLname());
			System.out.println("\t" + bean1.getLname());
			System.out.println("\t" + bean1.getPhy());
			System.out.println("\t" + bean1.getChem());
			System.out.println("\t" + bean1.getMaths());

		}
	}
}

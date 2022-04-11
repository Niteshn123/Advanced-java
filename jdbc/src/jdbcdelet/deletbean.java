package jdbcdelet;

public class deletbean {
	
	private int id;
	private String rollNo ;
	private String name ;
	private String lname ;
	private int Phy;
	private int Chem;
	private int Maths;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPhy() {
		return Phy;
	}
	public void setPhy(int phy) {
		Phy = phy;
	}
	public int getChem() {
		return Chem;
	}
	public void setChem(int chem) {
		Chem = chem;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	

}

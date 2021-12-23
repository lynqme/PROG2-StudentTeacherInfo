import java.io.PrintWriter;

public class Teacher implements CSVPrintable {
	private String name="";
	private int ID, phone;
	public Teacher(String name, int ID, int phone) {
		this.name=name;
		this.ID=ID;
		this.phone=phone;
	}
	//getters and setters
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPhone() {
		return phone;
	}
	public String getName() {
		return null;
	}
	public int getID() {
		return 0;
	}
	public void csvPrintln(PrintWriter out) {
		StringBuffer data = new StringBuffer("");
		data.append(name +", ");
		data.append(ID+", ");
		data.append(phone);
		out.println(data);
	}
}

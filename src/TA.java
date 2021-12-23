import java.io.PrintWriter;

public class TA extends Student{
	String name="";
	long studentID, phone;
	int teachID;
	public TA(String name, long studentID, int teachID, long phone) {
		super(name, studentID, phone);
		this.name=name;
		this.studentID=studentID;
		this.phone=phone;
		this.teachID=teachID;
	}

	
	public void csvPrintln(PrintWriter out) {
		StringBuffer data = new StringBuffer("");
		data.append(name + ", ");
		data.append(studentID + ", ");
		data.append(teachID + ", ");
		data.append(phone);
		out.println(data);
	}
}

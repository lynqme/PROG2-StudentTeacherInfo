import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int amt;
		Scanner input = new Scanner(System.in);
		PrintWriter out=null;
	try {
		out = new PrintWriter(new FileWriter("output.csv"));
		} 
	catch(FileNotFoundException e) {
			System.out.println("error in creating file");
			e.printStackTrace();
		}
		String userinput ="";
		System.out.println("How many students, teachers, or TA's will you be adding to this file?");
		amt = input.nextInt();
		input.nextLine();
		
		for(int temp =0; temp<amt; temp++) {
			System.out.println("Please enter position, name (in first name,last name format), student ID number (or 0 if inapplicable), teacher ID number (or 0 if inapplicable), and phone number");
			userinput = input.nextLine();
			String[] records = userinput.split(" ");
		
			String objectName = records[0];
			if (objectName.equalsIgnoreCase("Teacher")) {
				String name = records[1];
				long studentID = Long.parseLong(records[2]);
				int teacherID = Integer.parseInt(records[3]);
				int phone = Integer.parseInt(records[4].substring(6));
				Teacher teach = new Teacher(name, teacherID, phone);
				teach.csvPrintln(out);
			
			} else if (objectName.equalsIgnoreCase("Student") || objectName.equalsIgnoreCase("TA")) {
				String name = records[1];
				long studentID = Long.parseLong(records[2]);
				int teacherID = Integer.parseInt(records[3]);
				long phone = Long.parseLong(records[4]);
				if(objectName.equalsIgnoreCase("Student")) {
					Student student = new Student(name, studentID,phone);
					student.csvPrintln(out);
				}else if(objectName.equalsIgnoreCase("TA")) {
					TA ta = new TA(name, studentID, teacherID, phone);
					ta.csvPrintln(out);
				}
			} else  System.out.println("Enter position");
		}
		out.close();
	}
}
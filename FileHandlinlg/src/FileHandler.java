import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.jar.Attributes.Name;

public class FileHandler {


	ArrayList<Employee> list = new ArrayList<Employee>();

	public void readFromFile(String file) throws IOException 
	{

		File fileName = new File(file);


		BufferedReader buf = new BufferedReader(new FileReader(fileName));

		String line = null;


		while((line = buf.readLine())!=null) 
		{
			addEmp(line);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private void display() 
	{
		
		
//		for(Employee em: list) {
//			System.out.println(em);
//		}

		
		String array[] = new String[list.size()];              
		for(Employee j:list){
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private void addEmp(String line) 
	{
		String hold [] = line.split(",");
		
		String hi = " hel there";
		
		
		

		Employee em = new Employee(hold[0], hold[1], hold[2], Double.parseDouble(hold[3]));

		list.add(em);
	}
	
	
	
	
		
	 public void appendData(String f) {
		 
		 
	       File  file = new File(f);
	      
	        try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	            
	            for(Employee em: list) {
	            writer.append(em.toString());
	            }
	            writer.close();
	            
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	

	public static void main(String[] args) throws IOException {

		FileHandler f1 = new FileHandler();

		f1.readFromFile("FileToRead.txt");

//		f1.display();
		
		
		Employee em =new  Employee("hassan", "334", "hass@gmail.com", 5000);
		
		
		f1.appendData("file1.txt");
		
		



	}

}

package com.hcl.csvparser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class App1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> empList = new ArrayList<>();
		try (
	            Reader reader = Files.newBufferedReader(Paths.get(args[0]));
				CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
	        ) {
	            for (CSVRecord csvRecord : csvParser) {
	                // Accessing Values by Column Index
	                int empId = Integer.parseInt(csvRecord.get(0));
	                String empName = csvRecord.get(1);
	                String empPhone = csvRecord.get(2);
	                
	                Employee emp = new Employee(empId, empName, empPhone);
	                empList.add(emp);
	            
	            }
	            for (Employee e: empList) {
	            	System.out.println(e);
	            }
	            
	            empList.forEach(System.out::println); //Lambda function
	            empList.forEach(x -> System.out.println(x));
	        }
	    }  
	

}

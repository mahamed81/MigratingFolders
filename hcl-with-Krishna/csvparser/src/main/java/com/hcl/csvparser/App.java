package com.hcl.csvparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");

		/*
		 * TODO: using common-csv dependency for parsing csv file
		 */
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]));) {
			String line = null;
			br.readLine(); // skip the header line of csv file

			ArrayList<Employee> empList = new ArrayList<Employee>();

			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(",");
				Employee emp = new Employee(Integer.parseInt(tokens[0]), tokens[1], tokens[2]);
				empList.add(emp);
			}

			for (Object ob : empList) {
				System.out.println(ob);
			}
		}
	}
}

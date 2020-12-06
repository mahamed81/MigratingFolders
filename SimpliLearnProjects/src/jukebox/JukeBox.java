package jukebox;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;

public class JukeBox {
	
	ArrayList<Songs>  list = new ArrayList<Songs>();

	public static void main(String[] args) {
		
		new JukeBox().go();

	}
	
	public void go() {
		getSongs();
		
		for(Object ob: list)
		System.out.println(ob);
	}


	private void getSongs() {
		
		StringBuilder f = new StringBuilder();
		
		StringBuffer f2 = new StringBuffer();
		
//		BufferedWriter b2 = new BufferedWriter(new FileWriter("dfd"))
		
		File file = new File("songs.txt");
		
	try {
		BufferedReader b = new BufferedReader(new FileReader(file));
		
		
		
		String line = null;
		
		while((line=b.readLine())!=null) {
			addSongs(line);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
	
	private void addSongs(String lineToParse) {
		String[] tokens =lineToParse.split(",");
		
		Songs newSongs = new Songs(tokens[0],tokens[1], tokens[2], tokens[3]);
		
		list.add(newSongs);
		
		
		
	}
	

}

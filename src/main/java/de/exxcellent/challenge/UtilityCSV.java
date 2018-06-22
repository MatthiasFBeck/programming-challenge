package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UtilityCSV {
	
	// storage for csv file content
	List<List> data = new ArrayList<>();
	
	// load csv file
	public void loadCSV(String fileName){
		
		// empty data storage
		data = new ArrayList<>();
		
		
		BufferedReader br = null;
		String line = "";
		// define character data will be seperated by
		String splittingChar = ",";
		int lineCounter = 0;
		
		try {

			br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				
				// add new ArrayList to data so next line of data can be stored
				data.add(new ArrayList());
				
				// save line of data as lineInput
				String[] lineInput = line.split(splittingChar);
				
				// fill data storage with current line of data
				for (int j = 0; j < lineInput.length; j++){
					data.get(lineCounter).add(lineInput[j]);
				}
				lineCounter++;

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

}

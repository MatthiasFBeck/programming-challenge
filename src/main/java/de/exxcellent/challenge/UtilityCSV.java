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
	
	// Method takes 2 columns, calculates the line with the smallest absolute difference and returns the line name (first column entry of calculated line). Method expects a head: no data to be analyzed in first row.
	public String minDist(int col1, int col2){
		
		String result = (String)data.get(1).get(0);
		
		for (int i = 1; i < data.size(); i++){
			
		}
		return "";
	}
	

}

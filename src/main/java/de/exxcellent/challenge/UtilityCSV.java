package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.lang.IndexOutOfBoundsException;
import java.lang.Math;
import java.lang.Double;

public class UtilityCSV {
	
	// storage for csv file content
	List<List> data = new ArrayList<>();
	
	public UtilityCSV(String fileName){
		this.loadCSV(fileName);
	}
	
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
		
		// storage smallest absolute difference calculated so far. Initialize with difference of first row
		Double smallestDiff = Math.abs(Double.parseDouble((String)data.get(1).get(col1)) - Double.parseDouble((String)data.get(1).get(col2)));
		
		for (int i = 1; i < data.size(); i++){
			// store the two values of the current line
			Double val1 = Double.parseDouble((String)data.get(i).get(col1));
			Double val2 = Double.parseDouble((String)data.get(i).get(col2));
			
			if (Math.abs(val1 - val2) < smallestDiff){
				smallestDiff = Math.abs(val1 - val2);
				result = (String)data.get(i).get(0);
			}
		}
		return result;
	}
	
	// Method takes 2 columns, calculates the line with the biggest absolute difference and returns the line name (first column entry of calculated line). Method expects a head: no data to be analyzed in first row.
		public String maxDist(int col1, int col2){
			String result = "";
			
				result = (String)data.get(1).get(0);
				
				// storage biggest absolute difference calculated so far. Initialize with difference of first row
				Double biggestDiff = Math.abs(Double.parseDouble((String)data.get(1).get(col1)) - Double.parseDouble((String)data.get(1).get(col2)));
				
				for (int i = 1; i < data.size(); i++){
					// store the two values of the current line
					Double val1 = Double.parseDouble((String)data.get(i).get(col1));
					Double val2 = Double.parseDouble((String)data.get(i).get(col2));
					
					if (Math.abs(val1 - val2) > biggestDiff){
						biggestDiff = Math.abs(val1 - val2);
						result = (String)data.get(i).get(0);
					}
				}
			
			return result;
		}
	

}

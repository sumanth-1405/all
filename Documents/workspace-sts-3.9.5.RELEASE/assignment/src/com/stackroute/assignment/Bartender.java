package com.stackroute.assignment;

import java.util.HashMap;

public class Bartender {
	
}



String headerRow = "";
HashMap<String, Integer> HeaderMap = new HashMap<String, Integer>();
//br = new BufferedReader(new FileReader(fileName));
String str = br.readLine();
if (str != null) {
	headerRow = str;
}
String[] headerArray=headerRow.split(",");
for(int i=0;i<headerArray.length;i++) {
	HeaderMap.put(headerArray[i], i);

//br.close();


package com.testapp.test1.test;

import java.io.*;
import java.io.IOException;
import java.util.*; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @date 2019-05-16
 * @author Gopikrishna Putti
 */
public class Test {

	private static ObjectMapper mapper = new ObjectMapper();
	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String str = "{\"key\": \"186\", \"Product Names\": \"Starbucks Doubleshot Coffee Smoothie �  Vanilla Honey\", \"Sale Prices\": \"$3,384.53\"}";
		
		String encoded = Base64.getEncoder().encodeToString(str.getBytes());
		// decode a String
		byte [] barr = Base64.getDecoder().decode(encoded); 		
		
		String newstr = new String(barr);
//		System.out.println(newstr);
		
		
		str = getFileContentsFromtPath("/Users/gopi/Desktop/failing.json");
		
		Map map = mapper.readValue(str, Map.class);
		
		System.out.println(map.get("Product Names"));
	}
	
	
	// returns file contents as string.
	public static String getFileContentsFromtPath(String path) {

		StringBuilder sb = new StringBuilder( );
		try {			
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;			
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\r\n");
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();

	}


	
	
	
}

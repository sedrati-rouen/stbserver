package fr.univ.stbserver.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.DefaultResourceLoader;

public class TestSTB {
	
	StringBuilder message;
	org.springframework.core.io.Resource resource ;
	
	public StringBuilder loadFileXML() throws IOException{
		 StringBuilder message = new StringBuilder();
		resource = new DefaultResourceLoader().getResource("classpath:smallSTB.xml");

		InputStream is = resource.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is)); 
		String line = br.readLine();
		while( line != null){ 
			message.append(line).append("\n"); 
			line = br.readLine(); 
			}
		
		return message;
		
	}}
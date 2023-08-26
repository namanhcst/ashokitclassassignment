package com.example.demo.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;

public class FileUtils {

	public static String covertFilesToBase64EncodedString(String path) {

		try {
			byte[] allBytes = Files.readAllBytes(Paths.get(path));
			String encodedFile = Base64.getEncoder().encodeToString(allBytes);
			System.out.println("encoded file: "+encodedFile);
			return encodedFile;

		} catch (IOException e) {
			System.out.println("Error reading the image file: " + e.getMessage());
		}
		return null;
	}
	
	public static void CreateFileFromFileEncodedSring(String outpuFilePath, String fileEncoded) {
		
		try {
		Path path = Paths.get(outpuFilePath);
		byte[] fileInBytes =Base64.getDecoder().decode(fileEncoded);		
			Files.write(path, fileInBytes, StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

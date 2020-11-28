package com.exam.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunShellScript {
	public static void main(String[] args) {
		try {
			//InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			File directory = new File(".\\src\\main\\resources\\clamavpoc.sh");
			   System.out.println(directory.getAbsolutePath());
			String command = "cmd /c "+directory.getPath();
			Process process = Runtime.getRuntime().exec(command);
		
			StringBuilder output = new StringBuilder();

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}

			int exitVal = process.waitFor();
			if (exitVal == 0) {
				System.out.println("Success!");
				System.out.println(output);
				System.exit(0);
			} else {
				// abnormal...
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

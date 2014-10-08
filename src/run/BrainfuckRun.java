package run;

import java.io.File;

import org.faabtech.brainfuck.BrainfuckEngine;


public class BrainfuckRun {
	
	private static final String FILE_LOCATION = "samples/brainfuck/cat.bf";
	
	/**
	 * To change the file location or name, just change the string FILE_lOCATION in this class.
	 * 
	 * @param args java arguments (no need to pass any)
	 * @throws Exception if the file location is invalid
	 */
	public static void main(String[] args) throws Exception {
		new BrainfuckEngine(30000).interpret(new File(FILE_LOCATION));
	}

}

package run;

import java.io.File;

import org.faabtech.brainfuck.UnnecessaryEngine;

public class UnnecessaryRun {
	private static final String FILE_LOCATION = "samples/unnecessary/example.unn";
	
	/**
	 * To change the file location or name, just change the string FILE_lOCATION in this class.
	 * 
	 * @param args java arguments (no need to pass any)
	 * @throws Exception
	 * 
	 * @author xbony2
	 */
	public static void main(String[] args) throws Exception{
		new UnnecessaryEngine().interpret(new File(FILE_LOCATION));
	}
}

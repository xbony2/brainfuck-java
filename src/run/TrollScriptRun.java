package run;

import java.io.File;

import org.faabtech.brainfuck.impl.TrollScriptEngine;

public class TrollScriptRun {
	
	private static final String FILE_LOCATION = "samples/trollscript/fibbonacci.troll";

	/**
	 * To change the file location or name, just change the string FILE_lOCATION in this class.
	 * 
	 * @param args java arguments (no need to pass any)
	 * @throws Exception if the file location is invalid
	 * 
	 * @author Fabian M.
	 */
	public static void main(String[] args) throws Exception {
		new TrollScriptEngine(30000).interpret(new File(FILE_LOCATION));
	}

}

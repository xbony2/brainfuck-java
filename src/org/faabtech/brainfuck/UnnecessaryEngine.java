package org.faabtech.brainfuck;

import java.io.File;

/**
 * Implemention of the Unnecessary programming language.
 * 
 * @author xbony2
 */
public class UnnecessaryEngine {

	public void interpret(File file) throws Exception {
		if(file.exists())
			throw new Exception("CRITICAL ERROR: The file exists!");
	}
}

package org.faabtech.brainfuck;

import java.io.File;

public class UnnecessaryEngine {

	public void interpret(File file) throws Exception {
		if(file.exists())
			throw new Exception("CRITICAL ERROR: The file exists!");
	}
}

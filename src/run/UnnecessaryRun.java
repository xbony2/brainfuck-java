package run;

import java.io.File;

import org.faabtech.brainfuck.UnnecessaryEngine;

public class UnnecessaryRun {
	private static final String FILE_LOCATION = "samples/unnessary/example.unn";
	
	public static void main(String[] args) throws Exception{
		new UnnecessaryEngine().interpret(new File(FILE_LOCATION));
	}
}

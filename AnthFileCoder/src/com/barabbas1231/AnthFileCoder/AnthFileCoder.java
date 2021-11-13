/**
 * 
 */
package com.barabbas1231.AnthFileCoder;

import java.io.IOException;

import filelogistics.*;
/**
 * @author Andy
 *
 */
public class AnthFileCoder {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			char fileChar;
			FileLogisticsWorker flw = new FileLogisticsWorker(args[0]);
			while (flw.getAvailable() != -1) {
				fileChar = flw.getChar();
			}



	}

}



package filelogistics;



import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class FileLogisticsWorker {

	//private DataInputStream dis;
	private BufferedReader br;
	
	private char[] bufferChar;
	private int available;

	

	public FileLogisticsWorker (String file) {

		try {

			//dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			br = new BufferedReader(new FileReader(file));

		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		
		available = 0;
		bufferChar = new char[1];

	}

	

	public char getChar() {

		char fileLetter = 0;

		

		try {

			available = br.read(bufferChar);

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		
		fileLetter = bufferChar[0];
		
		return fileLetter;

	}

	

	public int getAvailable() {

		return available;

	} 

	

}

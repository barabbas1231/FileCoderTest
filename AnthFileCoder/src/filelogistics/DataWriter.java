package filelogistics;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class DataWriter {
	private BufferedWriter bw;
	private File flw;
	
	public DataWriter(String file) {
		String filepath =  "_" +  file; 
		flw = new File(filepath);
		
		try {

			
			bw = new BufferedWriter(new FileWriter(flw));

		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void write(String a) {
		try {
			bw.write(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

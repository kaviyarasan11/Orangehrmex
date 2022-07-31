package Mustknownconceptjava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writefileeg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Location="Filewritebf.txt";
		String Content="Welcome 126 bf";
		FileWriter fw=new FileWriter(Location);
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write(Content);
bf.close();
	}

}

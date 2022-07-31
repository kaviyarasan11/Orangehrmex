package Mustknownconceptjava;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Filereadereg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Loaction="Filewrite.txt";
		FileReader fr=new FileReader(Loaction);
		BufferedReader br=new BufferedReader(fr);
		String text =br.readLine();
		System.out.println(text);
		br.close();
		
	}

}

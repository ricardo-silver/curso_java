package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import entities.Produto;


public class ExercicioArquivos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		ArrayList<Produto> produto  = new ArrayList<Produto>();

		// Leitura do arquivo

		String pathReader = "D:\\temp\\in.csv";

		File pathFile = new File(pathReader);


		String line = "";

		try(BufferedReader br = new BufferedReader(new FileReader(pathReader))) {

			while(line!= null) {

				line= br.readLine();

				if (line != null)
				{
					String[] textoSeparado = line.split(",");

					produto.add(new Produto(textoSeparado[0],Double.parseDouble(textoSeparado[1]),Integer.parseInt(textoSeparado[2]) ));								
				}
			}
		} catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		} 

		// Escrita do arquivo

		String pathWriter = pathFile.getParent() + "\\out\\out.csv";

		boolean success= new File(pathFile.getParent() + "\\out").mkdir();

		if (success) {

			try( BufferedWriter bw = new BufferedWriter ( new FileWriter(pathWriter))) {

				for( Produto prod: produto) {

					bw.write(prod.toString());
					bw.newLine();				
				}			
			} 
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

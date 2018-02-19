
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercicio3 {
    
	public static void main(String[] args) {
		File entrada = new File("/home/cg/root/in.txt");
		File saida = new File("/home/cg/root/out.txt");
		
		try {
			List<String> data = lerArquivo(entrada);			
			//System.out.println(data);
			escreveArquivo(data, saida);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
			
	}
	
	public static List<String> lerArquivo(File file) throws FileNotFoundException, IOException{
		List<String> data = new ArrayList<String>();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String s;
			while((s = br.readLine()) != null) {				
				data.add(s);
			}
			
		}
		return data;	
	}
	
	public static void escreveArquivo(List<String> data, File saida) throws IOException{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(saida))){			
			for(String s : data) {
				bw.write(s.replace(" ", "\r\n"));
				bw.newLine();
			}
		}
	}
	
	
	public static void  imprimeArquivo(File file) {
		BufferedReader br = null;
		String line = null;
		try {
			br = new BufferedReader(new FileReader(file));
			while(br.ready()) {
//				line = br.readLine().replace(" ", "|");
				System.out.println(line);
			}
			br.close();
		}catch(IOException e) {
			e.getMessage();
		}
		
	}
	

}

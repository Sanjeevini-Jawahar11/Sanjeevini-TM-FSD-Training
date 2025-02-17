package Week3;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
public class FileNotFoundExceptionExxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter
					("Kesari.srt"));
			writer.write("0:40-0:50");
			writer.write("\nIts not same bro");
			writer.write("\n1:40-2:50");
			writer.write("\nFile Handling");
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try {
			BufferedReader reader=new BufferedReader(new FileReader("Kesai.srt"));
			String content;
			while((content=reader.readLine())!=null) {
				System.out.println(content);
			}
			reader.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}

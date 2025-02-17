package Week3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class EmptyFileExceptionExxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter("EmptyFile.txt"));
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try {
			BufferedReader reader=new BufferedReader(new FileReader("EmptyFile.txt"));
			String content;
			while((content=reader.readLine())==null) {
				throw new EmptyFileException("File is Empty...");
			}
			reader.close();
		}
		catch(EmptyFileException e) {
			System.out.println(e.getMessage());
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}

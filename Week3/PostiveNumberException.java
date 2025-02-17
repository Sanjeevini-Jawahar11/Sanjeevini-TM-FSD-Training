package Week3;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.IOException;
public class PostiveNumberException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter("NumbersFile.txt"));
			writer.write("-1");
			writer.write("-7");
			writer.write("-3");
			writer.write("1");
			writer.write("2");
			writer.write("3");	
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try {
			List<Integer> array=new ArrayList<>();
			BufferedReader reader=new BufferedReader(new FileReader("NumbersFile.txt"));
			String number;
			while((number=reader.readLine())!=null) {
				if(Integer.valueOf(number)<0) {
					array.add(Integer.valueOf(number));
				}
				else {
					throw new InputMismatchException();
				}
			}
			reader.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}

}

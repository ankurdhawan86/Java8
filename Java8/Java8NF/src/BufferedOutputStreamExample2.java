
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedOutputStreamExample2 {

	public static void main(String[] args) {
		File file = new File("C:\\personal\\git\\Java8\\outfile.txt");
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter =null;
		try {
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("This is an example of writing data to a file again");
			bufferedWriter.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fileWriter != null) {
					fileWriter.close();
				}
				if(bufferedWriter != null) {
					bufferedWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
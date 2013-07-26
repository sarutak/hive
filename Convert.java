import java.io.*;

public class Convert {

    public static void main(String[] args) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
	String line;

	while((line = reader.readLine()) != null) {
	    String[] splits = line.split(",");
	    System.out.print(splits[0]+"\u0001");
	    
	    int len = splits[1].length();
	    for(int i = 0; i < len; i++) {
		System.out.printf("\\u%04x", splits[1].codePointAt(i));
	    }
	    System.out.println();
	}
	reader.close();
    }
}

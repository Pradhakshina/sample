import java.io.File;
import java.io.IOException;
public class Demo {


	   public static void main(String[] args)
	   {
		   File tempFile = new File("‪‪D:\\Document.docx");
		   boolean stat = tempFile.exists();
		   System.out.println("File status:"+stat);
	   }
	}
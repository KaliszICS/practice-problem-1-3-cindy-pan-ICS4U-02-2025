import java.io.*;

public class PracticeProblem {

	public static String readFile(String filename) {
		FileReader fiRe = null;
		int i;
			char o;
			String out = "";
		try{
			 fiRe = new FileReader(filename);
			
			while ((i = fiRe.read())!=-1){
				o = ((char)i);
				out = out + String.valueOf(o);
				
			} 
			
		}
		catch (Exception e){

		}
		
		finally {
			try {
				if (fiRe!=null){
					fiRe.close();
				}
			}
			catch (IOException e){

			}
		}
		out = out.substring(0 , out.length()-1);
		return out;
	}
}

	



import java.util.Random;

public class Kokeilu {
  public static void main (String[] aArg) throws Exception  {
	 	 
	  for (int i = 0; i < 10; i ++) {
		  Random arpa = new Random();
		  int x = arpa.nextInt(3);
		  int y = arpa.nextInt(3);
      System.out.println(x + y);
	  }	 
  }
}

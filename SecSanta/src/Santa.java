import java.util.Arrays;
import java.util.Collections;


public class Santa {
	private static boolean arrayConString(String[] a, String s){
		for (String ss: a) 
		if (ss.equals(s)) 
		return true;
		return false;
	}
	
	public static void main(String[] args) {
		String[][] names = {{"Fyroz"}, {"Hari"}, {"krupa"}, {"Sreeneela"}, {"Harish"}, {"Ramu"}, {"Vinay"}, {"Dhanunjay"},{"kondayya"}};
		String[] givers = new String[9];
		String[] recievers = new String[9];
		int g = 0;
		for (String[] a: names)	
		for (String s: a){
				givers[g] = s;
				g++;
		}
		recievers = givers.clone();
		boolean goAgain = true;
		while (goAgain)
		{
			goAgain = false;
			Collections.shuffle(Arrays.asList(recievers));
			for(int i = 0; i < givers.length; i++) 
			for(String[] a:names)
			{
				if (arrayConString(a, givers[i]) && arrayConString(a, recievers[i])) 
				goAgain = true;
			}
		}
		for(int i = 0; i < givers.length; i++)
		{
		    System.out.println(givers[i] + "->" + recievers[i]);
		}
	}

}

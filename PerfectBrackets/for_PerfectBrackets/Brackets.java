package for_PerfectBrackets;

import java.util.ArrayList;
import java.util.List;

public class Brackets {

	public static void main(String[] args) {

		int n = 3;
		System.out.println(generateParenthesis(n));
		
		
	}
	
	//Method List of String type to generate paren
	public static List<String> generateParenthesis(int n) {
        
		int openCount = 0; 									
		int closedCount = 0;								
		List<String> answers = new ArrayList<String>();		
		StringBuilder str = new StringBuilder();
		backTracking(answers, openCount, closedCount, n, str);  
		return answers;  
	  
	}
		//for string builder, change str to StringBuilder
		private static void backTracking(List<String> answers, int openCount, int closedCount, int n, StringBuilder str) {	
			if (str.length() == (n*2)) {
				String newString = str.toString();
				answers.add(newString);										
				return;

			}
			if(openCount < n) {													
				str.append("{");															
				backTracking(answers, openCount+1, closedCount, n, str);
				str.deleteCharAt(str.length()-1);
			}
			if(closedCount < openCount) {
				str.append("}");
				backTracking(answers, openCount, closedCount+1, n, str);
				str.deleteCharAt(str.length()-1);
				
			}
		}
		




	
	


}
	

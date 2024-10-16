package worksheet2; 


import java.util.Arrays; 
import java.util.ArrayList; 



public class worksheet2 {
	static int scores[] = {10, 40, -10, 50, 70, 65, 54, 23, 82}; 
	
	public int[] oddAndEven(int[] scores) {
		int evenCounter = 0; 
		int oddCounter = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] % 2 == 0) {
				evenCounter += evenCounter + 1;
			}
			else {
				oddCounter = oddCounter + 1;
			}
		}
		int finScores[] = new int[2];
		finScores[0] = oddCounter; 
		finScores[1] = evenCounter; 
		return finScores; 
	}
	
	public boolean containsX(int[] scores, int x) {
		boolean containsFlag = false; 
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == x) {
				containsFlag = true; 
				break;
			}
		}
		
		return containsFlag;
	}
	
	public Line longestLine(Line[] lineArray) {		
		Line l = new Line();
		int max = lineArray[0];
		for(int i = 0; i < lineArray.length; i ++) {
			if(max < lineArray[i].length()) {
				max = lineArray[i];
			}
		}
		return max;
	}
	
	public void deleteOriginLines(Line[] lineArray) {
		Line[] l; 
		for(int i = 0; i < lineArray.length; i++) {
			if(lineArray[i].getStart || lineArray[i].getEnd != 0) {
				l[i] = lineArray[i];
			}
		}
	}
	
	public Line longestLine(ArrayList<Line> lineList) {
		Line l = new Line();
		int max = lineArray[0];
		for(int i = 0; i < lineList.size(); i++) {
			if(max < lineList.length()) {
				max = lineList[i];
			}
		}
		return max; 
	}
	
	public void deleteOriginLines(ArrayList<Line> lineList) {
		Line[] l; 
		for(int i = 0; i < lineArray.length; i++) {
			if(lineArray[i].getStart || lineList[i].getEnd == 0) {
				lineList.remove(i); 
			}
		}
	}
	

}

package kr.go.util;

public class WordFilter {
	private String [] list = {"시발", "새끼", "씨발"};
	
	public boolean compare(String keyword){
		boolean k = false;
		for(String w : list){
			if(keyword.contains(w)){
				k = true;
			}
		}
		return k ;
	}
}
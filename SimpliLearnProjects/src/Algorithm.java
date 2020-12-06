
public class Algorithm {
	
	
	
	public int search(String match, String [] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals(match)) {
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Algorithm a = new Algorithm();
		
//		a.search(match: "hello", new String [] {"mama", "hehe", "didi"}));

	}

}

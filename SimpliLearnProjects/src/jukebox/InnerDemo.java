package jukebox;

public class InnerDemo {
	
	
	
	private static final int ARRAY_SIZE = 15;
	
	private int [] innerArray  = new  int [ARRAY_SIZE];
	
	
		public InnerDemo() {
			for(int i =0; i<ARRAY_SIZE; i ++) {
				innerArray[i] = i;
				
			}
		}
		
		public void printEven() {
			InnerEven ev = new InnerEven();
			
			while(ev.hasNext()) {
				System.out.println(ev.getNext());
			}
			
			
		}
	
	private class InnerEven{
		
		private int next = 0;
		
		public boolean hasNext() {
			
			return (next<=ARRAY_SIZE);
		}
		
		public int getNext() {
			int temp = innerArray[next];
			
			next+=2;
			return temp;
			
		}
	}
	

	public static void main(String[] args) {
		InnerDemo  d1 = new InnerDemo();
		d1.printEven();
	}

}

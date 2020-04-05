import java.util.Iterator;

public class Triple {
	public int[] a  = {1,2,3};
	public Triple() {	
	}

	public MyIterator myIterator = new MyIterator();
	public class MyIterator implements Iterator{
		
		int currIndex = 0;
		public MyIterator() {
		}
		
		@Override
		public boolean hasNext() {
			currIndex++;
			return true;
		}
		@Override
		public Object next() {
			int result = a[(currIndex-1)%3];
			return result;
		}
	}

	public MyIterator iterator() {
		return myIterator;
	}
	
	public static void main(String[] args) {
        Triple t = new Triple();
        Iterator ti = t.iterator();
        for(int i = 0; i < 10; i++)
                if (ti.hasNext())
                        System.out.print(ti.next() + " ");
        	System.out.println();
	}

	
}

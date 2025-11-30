import java.util.ArrayList;

//public class SortingDriver {
	
	public class SortingDriver {
		  /** The method for sorting the numbers */
		// Original class is insertionSort
		  
		  /** A test method */
		  public static void main(String[] args) {
		  /*  int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
			  //insertionSortArr(list);
		      for (int i = 0; i < list.length; i++) {
			      System.out.print(list[i] + " ");
			  }
		      System.out.println();
			  Sorting.insertionSortArr(list);
			  for (int i = 0; i < list.length; i++) {
			      System.out.print(list[i] + " ");
			  }
			  */
	    
			/*  ArrayList<Integer> intList = new ArrayList<Integer>();
			intList.add(2);
			intList.add(3);
			intList.add(2);
			intList.add(5);
			intList.add(6);
			intList.add(1);
			intList.add(-2); 
			intList.add(3); 
			intList.add(14); 
			intList.add(12);
			System.out.println(intList);
		   // Sorting.insertionSort(intList);
		    Sorting.insertionSortGenArr(intList);
		    System.out.println(intList);
		  }  */
		  
		  ArrayList<String> stringList = new ArrayList<String>();
			stringList.add("Shreya");
			stringList.add("Giri");
			stringList.add("Niru");
			stringList.add("Yogi");
			System.out.println(stringList); 
		    Sorting.insertionSortGenArr(stringList);
		    System.out.println(stringList);
		  }
		}
  
//}

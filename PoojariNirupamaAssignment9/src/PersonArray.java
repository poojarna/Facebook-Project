/**
* June 17, 2022
* Name: Nirupama Poojari
* Description: Add or insert values in an array.
*/

public class PersonArray { // Class PersonArray starts

 
  /** 
    * Prints to the console the array of Persons.
    * @param arr each person from one dimensional array 
    * @return one dimensional array
    */ 
  public static void print(Person[] arr) { // print() starts
    System.out.print("["); // Prints starting square bracket
    for (int i = 0; i < arr.length; i++) { // for loop starts
      if (i < arr.length - 1) { // If-else starts
        System.out.print("(" + arr[i].getName() 
            + ", " +  arr[i].getAge() + "), "); // Person name and age
      } else {  // Else starts
        
        // Prints ending name and age
        
        System.out.print("(" + arr[arr.length - 1].getName() 
                         + ", " +  arr[arr.length - 1].getAge() + ")");
      } // if-else ends
    } // for loop ends
    System.out.println("]"); // Ending square bracket
  } // print() ends
  
  /** 
    * Insert newPerson into arr in position pos and provide the  
    * array with the new Person back to the calling method. 
    * @param arr  each person from array
    * @param pos  person index 
    * @param newPerson  new person added 
    * @return a new array.
    */ 
  public static Person[] insert(Person[] arr, 
                               int pos, Person newPerson) { // insert starts
    Person[] arrNew = new Person[arr.length + 1]; // Return value arrNew
    for (int i = 0; i < pos; i++) { // for-loop starts
      arrNew[i] = arr[i]; // arr value assigned to new
    } // for-loop ends
    arrNew[pos] = newPerson; // NewPerson assigned position
    int arrIndex = pos; // pos assigned to arrIndex
    for (int i = pos; i < arr.length; i++) { // for-loop starts
      arrNew[++arrIndex] = arr[i]; // Each index one position ahead
    } // for-loop ends
    return arrNew;
  } // insert ends
  
  /** 
   * Remove the Person in position pos from arr and provide 
   * the new array back to the calling method. 
   * @param arr  person from array
   * @param pos  Person's position
   * @return a new array without the last element.
   */   
  public static Person[] remove(Person[] arr, int pos) { // remove() starts
    Person[] arrNew = new Person[arr.length - 1]; // New array
    for (int i = 0; i < pos; i++) { // for-loop starts
      arrNew[i] = arr[i]; // Values assigned to new array
    } // for-loop ends 
    int arrIndex = pos; // Position assigned to index
    for (int i = pos + 1; i < arr.length; i++) { // for-loop starts 
      arrNew[arrIndex++] = arr[i]; // New index values from prev.
    } // for-loop ends
    return arrNew; // Returns new array
  } // remove() starts
   
  /** 
    * Linear search through array arr for the provided key. 
    * @param arr Person in array  
    * @param key Another person in array
    * @return index of person or -1 if not in the array.
    */ 
  public static int linearSearch(Person[] arr,
                                  Person key) { // linearSearch() starts
    int ret = -1; // Return value initialized to -1     
    for (int i = 0; i < arr.length; i++) { // For loop starts
      if (equals(key, arr[i])) { // If starts
        ret = i; // i assigned to ret
      } // If ends
    } // For loop ends
    return ret; // Returns ret
  } // linearSearch() starts
  
  /** 
    * Compares Person a, b in array. 
    * @param Person a   
    * @param Person b
    * @return boolean statement to check for comparison
    */ 
  public static boolean equals(Person a, Person b) { // equals() starts
    boolean ret = false; // Return value ret 
    if (a.getName().equals(b.getName()) 
         && a.getAge() == b.getAge() 
         && a.getFavoriteColor().equals(b.getFavoriteColor())) { // If starts
      ret = true; // ret true if condition is true
    } // If ends
    return ret; // Returns ret
  } // equals() ends
  
  /** 
    * Compares Person a, b in array. 
    * @param Person a  Person from array   
    * @param Person b  another person from array
    * @return index of Person, or -1 if not in the array.
    */ 
  public static int equals1(Person a, Person b) { // equals1() starts
    int ret = 0; // Ret initialized to zero
    if ((a.getName().compareToIgnoreCase(b.getName()) == 0) 
        && a.getAge() == b.getAge() 
        && a.getFavoriteColor().equals(b.getFavoriteColor())) { // If starts
      ret = 0; // Ret assigned zero
    } else if (a.getName().compareToIgnoreCase(b.getName()) < 0) { 
      // Else-if starts
      ret = -1; // Ret assigned negative one
    } else { // Else starts
      ret = 1; // Ret assigned one
    } // If else ends
    return ret;
  } // equals1() ends 
     
  /**  
    * Binary search through Array arr for the provided key.
    * @param arr  one dimensional array
    * @param key  person's index in array
    * @return  index of Person or -1
    */ 
  public static int binarySearch(Person[] arr, 
                                 Person key) { // binarySearch() starts
    int low = 0; // low initialized
    int high = arr.length - 1; // high is initiliazed
    
    while (low <= high) { // while loop starts
      int mid = (low + high) / 2; // mid calculated
      int compare = equals1(arr[mid], key); // compare is middle person and key
      if (compare == 0) { // if starts
        return mid; // returns mid
      } else if (compare < 0) { // else if starts
        low = mid + 1; // low is assigned mid + 1
      } else if (compare > 0) { // else if starts
        high = mid - 1; // low is assigned mid - 1
      } // if else if ends
    } // while loop ends
    return -1;
  } // binarySearch() ends
 
 
} // Class PersonArray ends

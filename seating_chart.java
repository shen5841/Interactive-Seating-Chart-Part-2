import java.util.*;
import java.util.concurrent.ThreadLocalRandom; //for randomizing list

/**
* Use Instructions: 
* 1. Use createClassArray (int size) to create an array to store all the names of the classmates
* 2. Each student’s name will be manually added into the classArray by using
* addStudent(String studentName, int studentIndex)
* 3. Type shuffleArray(GroupSorter.classArray) to shuffle/randomize the order of the classArray
* 4. Use groupSorter (int size), type in the size of the groups you want
* 5. Print out the groupArray to get your groups, note that the leftover people that does not meet the group size requirement will be in a group.
*/

public class GroupSorter {
//global variables
String[] classArray;
String[][] groupArray;
int classSize;
int groupSize;
int numGroupsFull; //number of groups that are full in size
Int numStudentsInFullGroups; //number of students being allocated into full-size groups
//getWorld().getObject(Student.class) returns an arraylist of all the student objects

//Tanvi
//creates classArray with specified size
public void createClassArray (int size) {
	classSize = size;
	classArray = new String[size];
}

//Daniel
//adds student name into specified slot in the classArray
public void addStudent(String studentName, int studentIndex){
	classArray[studentIndex] = studentName;
}
	
	//felix
// Implementing Fisher–Yates shuffle, shuffles classArray
static void shuffleArray(Str[] ar) {
// If running on Java 6 or older, use `new Random()` on RHS here
    	Random rnd = ThreadLocalRandom.current();
    	for (int i = ar.length - 1; i > 0; i--) {
      		int index = rnd.nextInt(i + 1);
      		// Simple swap
      		Str c = ar[index];
      		ar[index] = ar[i];
      		ar[i] = c;
  	}
}

//Shelja
//sorts students in the classArray into groups
public void groupSorter (int size) {
	groupSize = size;
	numGroupsFull = classSize / groupSize;
	numStudentsInFullGroups = numGroupsFull * groupSize;
	studentIndex = 0;
	for (int i = 0; i < numGroupsFull; i++) {
		for (int j = 0; j < groupSize; j++) {
			groupArray[i][j] = classArray[studentIndex];
			studentIndex++;
}
}
}
}

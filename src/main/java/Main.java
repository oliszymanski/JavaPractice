import org.jetbrains.annotations.NotNull;

import java.util.HashSet;


public class Main {

	static void checkMaxValue( @NotNull HashSet<Integer> hashSet, int num ){
		/*
		* input:
		* 		hashSet:		set of elements,
		* 		num:			some number for checking and modifying,
		* */


		boolean elementExists = hashSet.contains(num);		// checking if given number is in the set already


		for (Integer element : hashSet){
			if (elementExists){ break; }

			else if (num > element){
				element = num;
				break;
			}
		}
	}


	public static void main(String[] args) {

		HashSet<Integer> mySet = new HashSet<>();


		mySet.add(1);			// inserting elements into my set
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(5);
		mySet.add(6);

		checkMaxValue(mySet, 3);		// testing checkMaxValue() with mySet and some number
		checkMaxValue(mySet, 8);

		System.out.println(mySet);			// display output
	}
}
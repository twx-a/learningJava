package thirdProject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    // get student marks, get total marks, get max marks, get min marks, get average.

    //initialize instance variables.
    public String name;
    public int[] marks;

    public Student(String currentStudent, int... studentMarks) {
	this.name = currentStudent;
	this.marks = studentMarks;
    }

    public int getNumberOfSubjects() {
	return marks.length;
    }

    public int getTotalSumOfMarks() {
	// TODO Auto-generated method stub
	// simple loop for each
	int sum = 0;
	for (int mark : marks) {
	    sum += mark;
	}
	return sum;
    }

    public int maxMark() {
	// for each, to note that mark is the value itself.
	int max = marks[0];
	for (int mark : marks) {
	    if (mark > max) {
		max = mark;
	    }
	}
	return max;
    }

    public int minMark() {
	// for loop old way
	int min = marks[0];
	for (int i = 0; i < marks.length; i++) {
	    if (marks[i] < min) {
		min = marks[i];
	    }
	}
	return min;
    }

    public BigDecimal avgMark(int firstStudentSum, int firstStudentSubjects) {
	// TODO Auto-generated method stub
	// convert to big decimal
	BigDecimal bigDecimalSum = new BigDecimal(firstStudentSum);
	BigDecimal bigDecimalCount = new BigDecimal(firstStudentSubjects);
	// divide the sum by the arr length to get avg
	BigDecimal averageBigDecimal = bigDecimalSum.divide(bigDecimalCount, 3, RoundingMode.UP);

	return averageBigDecimal;
    }

}

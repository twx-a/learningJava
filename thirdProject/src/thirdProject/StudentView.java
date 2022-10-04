package thirdProject;

public class StudentView {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	// init some fake data.
	// init new instance
	int[] marks1 = { 88, 72, 96, 98 };
	int[] marks2 = { 99, 66, 60, 89 };
	String[] classList = { "Allen", "Dave", "Cherie", "Bray", "Jim" };
	Student firstStudent = new Student(classList[0], marks1);

	int firstStudentSubjects = firstStudent.getNumberOfSubjects();
	System.out.printf("Total subjects are: %d", firstStudentSubjects).println();

	int firstStudentSum = firstStudent.getTotalSumOfMarks();
	System.out.printf("Total marks of %s is %d", firstStudent.name, firstStudentSum).println();
	System.out.printf("Highest mark for %s is %d", firstStudent.name, firstStudent.maxMark()).println();
	System.out.printf("Lowest mark for %s is %d", firstStudent.name, firstStudent.minMark()).println();
	System.out.printf("Average mark for %s is ", firstStudent.name)
	.println(firstStudent.avgMark(firstStudentSum, firstStudentSubjects));
	System.out.println(firstStudent.avgMark(firstStudentSum, firstStudentSubjects).getClass());
    }

}

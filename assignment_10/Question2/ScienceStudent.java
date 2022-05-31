package assignment_day10.Question2;

public class ScienceStudent extends Student{

	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	
	
	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks) {
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}



	@Override
	double getPercentage() {
	
		return  (physicsMarks + chemistryMarks + mathsMarks)/3;
	}

	


}

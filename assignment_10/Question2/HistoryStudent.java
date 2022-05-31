package assignment_day10.Question2;

public class HistoryStudent extends Student{

	int historyMarks;
	int civicsMarks;
	
	
	
	public HistoryStudent(int historyMarks, int civicsMarks) {
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}



	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		return  (historyMarks+civicsMarks)/2;
	}

}

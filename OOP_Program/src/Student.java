
public class Student {
	private String name;
	private int score;

	public void setName(String Name) {
		name = Name;
	}

	public String getName() {
		return name;
	}

	public void setScore(int Score) {
		score = Score;
	}

	public int getScore() {
		return score;
	}

	public boolean checkScore() {
		if (score >= 0 && score <= 100)
			return true;
		else
			return false;
	}

	public boolean isPass() {
		if (score >= 50 && score <=100)
			return true;
		else
			return false;
	}
	public String findGrade(int score) {
		return ((score>=80 && score<=100) ? "A" : (score>=75 && score<=79) ? "B+" 
			   : (score>=70 && score<=74) ? "B" : (score>=65 && score<=69) ? "C+" 
			   : (score>=60 && score<=64) ? "C" : (score>=55 && score<=59) ? "D+" 
			   : (score>=50 && score<=54) ? "D" : "F");
	}
}

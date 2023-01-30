package partOne;

public class Team {
	//adding a class attributes
	
	//public static int solvedQuestions;
	int id;
	String name;
	int solvedQuestion;
	int elapsedTime;
	
	//Constructor: To initialize the attributes 
	public Team(int id, String name,int solvedQuestion, int elapsedTime) {
		this.id= id;
		this.name=name;
		this.solvedQuestion= 0;
		this.elapsedTime=0;
	}
	public Team(int id, String name) {
		this.id= id;
		this.name=name;
	}
	public void solvedQuestion(int time) {
		this.solvedQuestion++;
		this.elapsedTime += time;
	}

}

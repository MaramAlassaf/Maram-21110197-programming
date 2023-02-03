package partOneFinal;

public class Team {
	/*
	 * Adding attributes for the Team Class
	 * 
	 * */
	int team_Id;            //The team ID
    String team_name;      //The Team Name
    int solvedQuestions;  //The total solved questions for each team
    int elapsedTime;     // The total time the took to solve 10 questions
    
    //Adding a constructor to initialize the attributes
    Team(int team_Id, String team_name, int solvedQuestions, int elapsedTime) {
        this.team_Id = team_Id;
        this.team_name = team_name;
        this.solvedQuestions = solvedQuestions;
        this.elapsedTime = elapsedTime;
    }
    
    //Another constructor to initialize 2 attributes (Team ID, Team Name) 
    //Constructor OVERLOADING 
    Team(int team_Id, String team_name){
    	 this.team_Id = team_Id;
         this.team_name = team_name;
    }
}

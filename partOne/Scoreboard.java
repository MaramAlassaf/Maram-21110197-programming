package partOne;

import java.util.ArrayList;
import java.util.Random;

public class Scoreboard {
	 ArrayList<Team> teams;
	    Random rand = new Random();
	    int totalQuestions = 10;
	    int totalTime = 300;
	    public Scoreboard() {
	    teams = new ArrayList<>();
	    }

	    public void addTeam(int id, String name) {
	        teams.add(new Team(id, name));
	    }
    static void bubbleSort(Team[] teams) {
        int n = teams.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (teams[j].solvedQuestion < teams[j+1].solvedQuestion) {
                    Team temp = teams[j];
                    teams[j] = teams[j+1];
                    teams[j+1] = temp;
                } else if (teams[j].solvedQuestion == teams[j+1].solvedQuestion) {
                    if (teams[j].elapsedTime > teams[j+1].elapsedTime) {
                        Team temp = teams[j];
                        teams[j] = teams[j+1];
                        teams[j+1] = temp;
                    }
                }
            }
        }
    }


}

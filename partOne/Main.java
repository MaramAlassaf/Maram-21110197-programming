package partOne;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		 Team[] teams = new Team[10];
	        Random rand = new Random();

	        // Initialize teams with random data
	        for (int i = 0; i < 10; i++) {
	            teams[i] = new Team(i+1, "Team " + (i+1), rand.nextInt(10), rand.nextInt(300));
	        }

	        // Sort teams using bubble sort
	        bubbleSort(teams);

	}
	
	public void displayResults() {
		 System.out.println("################################################################################");
	        System.out.println("# Rank # Team ID # Team Name # Solved Questions # Elapsed Time #");
	        System.out.println("################################################################################");
	        
			for (int i = 0; i < teams.size(); i++) {
	            Team team = Team.get(i);
	            String rank = (i + 1) + "";
	            if (i == 0) {
	                rank += "st";
	            } else if (i == 1) {
	                rank += "nd";
	            } else if (i == 2) {
	                rank += "rd";
	            } else {
	                rank += "th";
	            }
	            System.out.println("# " + rank + " # " + team.id + " # " + team.name + " # " + team.solvedQuestion + "/10 # " + team.elapsedTime + " #");
	        }
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

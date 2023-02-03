package partOneFinal;
                                    
import java.util.Random;

public class Main { 
	
    public static void main(String[] args) {
    	
        // Create an array of teams
    	Team[] teamsArray = new Team[10];
        String[] teamName ={"Coders-HTU", "Syn-JU", "Fast-JUST", "Debuggers-MU", "Algorithms-HU", "Breakers-ASU", "Opti-PSUT", "Hackers-MEU", "Heros-BAU", "Rooters-YU" };
        int[] teamId = {121,101,959,456,343,505,295,967,809,373};
        //Using the random generator to set the number of solved question and the time
        Random rand = new Random();

        // Initialize the teams with random data
        for (int i = 0; i < teamsArray.length; i++) {
            teamsArray[i] = new Team(teamId[i], teamName[i], rand.nextInt(10), rand.nextInt(300));
        }

        // Sort the teams using the bubble sort algorithm
        for (int i = 0; i < teamsArray.length -1; i++) {             //(-1) means to check all the array index except for the last element
            for (int j = 0; j < teamsArray.length - i - 1; j++) {    //(i) refers for the indexes that are already sorted
                if (teamsArray[j].solvedQuestions < teamsArray[j + 1].solvedQuestions) { //Compare between the number of solved questions between the indexes
                    Team swap = teamsArray[j];        //0  <  8    swap=0
                    teamsArray[j] = teamsArray[j + 1];    // 0 = 8
                    teamsArray[j + 1] = swap;       //  8 = swap
                }
                else if (teamsArray[j].solvedQuestions == teamsArray[j + 1].solvedQuestions) //if the solved questions are equal 
                {
                    if (teamsArray[j].elapsedTime > teamsArray[j + 1].elapsedTime) {		//compare between the elapsed time for each team
                        Team swap = teamsArray[j];		//50  >  10    swap=50
                        teamsArray[j] = teamsArray[j + 1];    //50 = 10 
                        teamsArray[j + 1] = swap;        // 10 = swap
                    } //end of if statement
                } //end of the else if
            } // end of the inner loop
        } //end of the outer loop

        // Print the sorted results
        System.out.println("##########################################################################################################################");
        System.out.println("#      Rank      #      Team ID        #      Team Name        #      Solved Questions        #      Elapsed Time        #");
        System.out.println("##########################################################################################################################");
        for (int i = 0; i < teamsArray.length ; i++) {
            String rank = (i + 1) + "";
            if (i == 0) {
                rank += "st ";
            } else if (i == 1) {
                rank += "nd ";
            } else if (i == 2) {
                rank += "rd ";
            } 
            else if (i==10) {
            	rank += "th";
            }
            else {
                rank += "th ";
            }
            
            System.out.println(String.format("#      %4s      #      %6d        #     %12s       #         %2d /10             #           %2d        #",rank,teamsArray[i].team_Id,teamsArray[i].team_name,teamsArray[i].solvedQuestions,teamsArray[i].elapsedTime ));
        }
    }
}

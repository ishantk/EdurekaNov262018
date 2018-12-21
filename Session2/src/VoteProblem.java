
public class VoteProblem {

	public static void main(String[] args) {
		
		// Model -> Store the data
		// We have learnt single value storage container
		
		// Vote Counts stored for DEMOCRATIC PARTY
		int demArizonaVotes = 126;
		int demFloridaVotes = 32;
		int demVermontVotes = 230;
		int demTexasVotes = 21;
		int demGeorgiaVotes = 200;
		
		// Vote Counts stored for REPUBLICAN PARTY
		int repArizonaVotes = 152;
		int repFloridaVotes = 85;
		int repVermontVotes = 121;
		int repTexasVotes = 215;
		int repGeorgiaVotes = 13;	
		
		int demVoteCount = demArizonaVotes + demFloridaVotes + demVermontVotes + demTexasVotes + demGeorgiaVotes;
		int repVoteCount = repArizonaVotes + repFloridaVotes + repVermontVotes + repTexasVotes + repGeorgiaVotes;
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party Won by "+(demVoteCount - repVoteCount)+" Votes !!");
		}else{
			System.out.println("Republican Party Won by "+(repVoteCount - demVoteCount)+" Votes !!");
		}
		
		System.out.println("===========================");
		
		// Above we solved the problem with ease !!
		// But data storage is no good !! 
		// In case we have n number of regions saving the data in single value containers is a tough job, we will be writing so much of code

		// When we have lot of data, we must use Multi Value Container !!
		// We have Arrays to begin with !!
		
		int[] demVotes = {126, 32, 230, 21, 200};
		int[] repVotes = {152, 85, 121, 215, 13};
		
		demVoteCount = 0;
		repVoteCount = 0;
		
		for(int vote : demVotes){
			demVoteCount = demVoteCount + vote;
		}
		
		for(int vote : repVotes){
			repVoteCount = repVoteCount + vote;
		}
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party Won by "+(demVoteCount - repVoteCount)+" Votes !!");
		}else{
			System.out.println("Republican Party Won by "+(repVoteCount - demVoteCount)+" Votes !!");
		}
		
		// Error at Runtime -> ArrayIndexOutOfBoundsException
		// System.out.println("demVotes[10] is: "+demVotes[10]);
		
	}

}

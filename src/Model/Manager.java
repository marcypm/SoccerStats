package Model;

import java.util.List;

public class Manager {
	List<Match> leagueMatches;
	List<Team> leageTeams;
	
	public Manager(){
		//TODO: IMPLEMENT THIS TOO
	}
	
	public void DisplayTopScoringMatches(){
		//TODO: IMPLEMENT THIS
	}
	public void DisplayTop5Players(){
		//Player [5] PlayerName;
		int goals =0;
		List<Player> players;
		
		for (Team x: leageTeams){
			players=x.getPlayers();
			
			for(Player play: players) {
				int playergoals = 0;
				List<Shot> playerShots;
				playerShots = play.getShots();
				
				for(Shot s: playerShots){
					if(s == Shot.Goal)
						playergoals ++;
				}
			}
			
			
		}
		
	}
	public void DisplayTopGoalie(){
		//TODO: IMPLEMENT THIS
	}
	
	public static void main(String args[]){
		Manager m = new Manager();
		m.DisplayTop5Players();
		m.DisplayTopScoringMatches();
		m.DisplayTopGoalie();
	}
}

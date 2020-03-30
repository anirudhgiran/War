/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Anirudh Giran
 * @modifier Jasleen Kaur
 */
public class Winner extends Game{
    Player player_1 = new Player();
		Player player_2 = new Player(); 
		TwoHands p1 = new TwoHands();
		TwoHands p2 = new TwoHands();
		ArrayList<Card> c1 = new ArrayList<>();
		ArrayList<Card> c2 = new ArrayList<>();
    
    public Winner(){
        super("");
    }
    
    public void play(){
    

        while(this.p1.getHandOne().size() > 0 && this.p2.getHandTwo().size() > 0) {
				Card c1 = this.p1.getHandOne().remove(0);
				Card c2 = this.p2.getHandTwo().remove(0);
				System.out.println(player_1.getPlayerID()+" throw : "+ c1);
				System.out.println(player_2.getPlayerID()+" throw : "+ c2);
				if(c1.getValue().compareTo(c2.getValue()) < 0) {
					this.player_2.score+=1;
				}
				if(c1.getValue().compareTo(c2.getValue()) > 0) {
					this.player_1.score+=1;
				}
			}
			System.out.println();
		};
  public void declareWinner(){
				if(player_1.score > player_2.score) {
					System.out.println(player_1.getPlayerID()+" wins with " + (player_1.score - player_2.score) + " score");
				} else if(player_1.score < player_2.score) {
					System.out.println(player_2.getPlayerID()+" wins with " + (player_2.score - player_1.score) + " score");
				} else {
					System.out.println("Match draw");
				}
			}
		};
    
    
}

}


    

package kadai_028;

import java.util.HashMap;

public class Jyanken_Chapter28 {
	
	
	
	public String getMyChoice(String me) {
		
		if(me.equals("r")) {
			return "グー";
		}else if(me.equals("s")) {
			return "チョキ";
		}else if(me.equals("p")) {
			return "パー";
		}else {
			return "エラー";
		}
	}
	
	public String getRandom() {
		String[]  hand= {"グー","チョキ","パー"};
		int random=(int) Math.floor((Math.random() * 3));
		return hand[random];
	}
	
	public void playGame(String me,String you) {
		HashMap<String, String> hands;
		hands = new HashMap<>();
		hands.put("r", "グー");
		hands.put("s", "チョキ");
		hands.put("p", "パー");
		
		if(hands.get(me).equals(you)) {
			System.out.println("あいこです");
		}else if(hands.get(me).equals("グー")&&you.equals("チョキ")) {
			
			System.out.println("自分の勝ちです");
			
		}else if(hands.get(me).equals("チョキ")&&you.equals("パー")) {
			
			System.out.println("自分の勝ちです");
			
		}else if(hands.get(me).equals("パー")&&you.equals("グー")) {
			
			System.out.println("自分の勝ちです");
			
		}else {
			
			System.out.println("自分の負けです");
		}
	}
	


}

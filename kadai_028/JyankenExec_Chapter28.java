package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Jyanken_Chapter28 Jyanken=new Jyanken_Chapter28();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner=new Scanner(System.in);
		String  zibun= scanner.nextLine();
		
			while(Jyanken.getMyChoice(zibun).equals("エラー")) {
				System.out.println("エラー");
				System.out.println("もう一度入力しましょう");
				
				  zibun= scanner.nextLine();
		}
			
		String aite=Jyanken.getRandom();
		System.out.println("自分の手は"+Jyanken.getMyChoice(zibun)+",対戦相手の手は"+aite);
		Jyanken.playGame(zibun,aite);
		
	}

	

}

package controller;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	private int sscore = 0;
	public void RPgamestart(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println(";;!~~~~~~~~~~--------~--~~---~~~~~~---~~~~~~~~~~~~~~~~---~---~----------~----~~~~~~~~~~~~~----~~~~~---~~-----------~~~~~~~~-~*$$$$\r\n"
				+ ";!;~~~~~--~~---------~--~~---~~~~~~--~~~~~~~~~~~~~-~------~-~~~~~~~~~~~-------~~~~~~~~~~~~~--~~~~~~---~~~----------~~~-~~~~~~!=$$$\r\n"
				+ ";;:~~~~~--~~~~~~~----~-----~-~~:~~--~~~~~~~~~~~~~~~~~~-----~~~~~~~~~~~~~---~~~~~~~-~~::~~~~---~~~~---~~~~~~--------~~--~~~~~~;=$$$\r\n"
				+ ";!:~~~::~~:::;:~~:::~~~~~~~~:;~~~::~~---~~~~~~~~:;;~~:::~~-~~::~:~~:;~~:::~~~~~::~~:!~~:::~-~~~:~~~~~:!~~:::::::::~---::~:::~:=$$$\r\n"
				+ ";;--:;--:;;..,:. .---~:;;;;:~*;  .-!;--~;:::::::~~!.  .~!-::~----~;**,  .~:~:;;:-~:!=~  .~!~:;~----~:!=:  .~**-..,:;~-*!...,;!*$$$\r\n"
				+ "*=,  ,:   !.  ;,  :~         ;*.  ,=$~~:!.  .     :,   ~=::   --   !$:   -!   -!,  .=;   ~$!;   -~.  :$!   -=$:   ,=;~*=,   :=!$$$\r\n"
				+ "*=-  ,!  .!.  ;,  :~   ~*!;:~**.  ,*=~-;$!:*=;   ,*,   :$*.  -==-  ,=:   ~=    *-  .*;   ~$=-  ,==~  .*!   -=$:   -=!:;=,   ;=;=$$\r\n"
				+ "!*-  ,!  .!.  ;,  :~   ~!!!~~=*.  ,*=~-~=$$$$!   -=,   :$*   -$$-  ,*:   ~=    *-  .=;   ~$=,  ,=$~   !!   -==:   .-,,,,    ;=:*$$\r\n"
				+ ";!-  ,!  .!.  ;,  :~   .... .!*.  ,*=~~~:==*=;   -=,   :$*   -$$-  ,*:   ~=    *-  .=;   ~$=,  ,=$~   !!   -==:   .-~~~-.   ;=:;=$\r\n"
				+ ":!-  ,:   ;.  ;,  :~   :==*!;=*.  ,==~~-~~~~*;   ~=,   :=*   -$$-  ,*:   ~=    ;,  .=;   ~=*,  ,=$~   !!   -==:   -=$$$=,   ;=~:=$\r\n"
				+ "~!-   .       ;,  :~   ~;;;~.!*.  ,*=~--~~-~*-   !$,    .-   -$$-  -=:   ~=    .   .=;   ..,,  ,=$~  .*!   -==:   -$$$$$,   ;=~~*$\r\n"
				+ "~!-  ,;   :.  ;,  :~  .,,,,,,~*.  -==~-~~~-~!   .=$,   .,~;. .~~  ,;=:   ~=    *-  .=;   .,~;,  ~~. .:$!   -==:   ,;;;;;.   ;=~~!$\r\n"
				+ "~!-  ,!  .!.  ;,  :!::!********~~:!$*~-~~~~:!   ;$$,   :==$*;:::::*=$:   ~=    *-  .=;   ~=$$=;:::::!=$!   -==:  .-~::::.  -*=~~;$\r\n"
				+ "~!-  ,!  .!.  ;,  :$=!.          ,=$;~~~~~~;-  ,=$$,   :=*********!-!:   ~=    *-  .=;   ~$*********!-;;   -=$*;***~:!*=!;*=$*~~:=\r\n"
				+ "~!-  ,!  .!.  ;,  :$*    ~;;;;-   -=;-----~;. .!$==,   :=- .,    ,. ::   ~=    *-  .=;   ~$!..,    ,,..;   -=$$$$$$;   -=$$$$;-~:=\r\n"
				+ "~!-  ,!  .!.  ;,  :$;   ,=$$$$*   ,**~---~;-  !$$!*,   :$=!!!   ,**!*:   ~=    *-  .*;   ~$=!!!,   !*!!!   -=*=$$=$!.  ,=$$=*;~~~*\r\n"
				+ "-!-   .  .!.  ;,  :$;   ,=$$$$!   ,==~--~:: ,*$$!:*,   :$$$$*   ,=$$$:   ~=    .   .=;   ~$$$$=,   !$$$!   -*~:::::~   .:::, ~!~~*\r\n"
				+ "~!~.,:~.,:*.  ;,  !$*,   -~~~~,   ~$=~--:~-:=$$!~~*,  .!$!*=*   ~==*=:   !=..-~:-.,:$;   ;$**=*,  ,=$*=!   :=~--~~~~~~~~~~---:=;~!\r\n"
				+ "~*=*=$$*===,-;*--;=$$*;::::::::::;=$*~-~=*=$$$;~~~*-,:*$=~~!*.~;=$!~*;,:!$$**=$$=*=$$;,:!=$:~:=--;*$=:*!,:!=$$==$$$$$$$$$$$===$!~;\r\n"
				+ "~!$$$$$$$$$==$$==$$==$$$=$$$$$$$$$$$:---*$$$*:~--~===$$$!-~;$==$$=~~===$$$$$$$$$$$$$=$=$$$*~~~$==$$$!~!$==$$$$$$$=======$$$$$$=:~:\r\n"
				+ "~~;!!;;!!;!$$$=$$$=;:!=$$$$$$$$$$$*;~---:!!:~~~~-~!$$$=!:~~~=$$=*;~-!$$$=!;!!!;:!!!;;$$$=!~--~*$$$*;~~:=$$=!:;;:::~:::::::::;;:~~:\r\n"
				+ "~~~~~~~~~-~:;:~;;:~~-~~~:::::::::~~~-~~-~~~~~~~~~~-;;:~~-~--~;:~~~~-~:;:~~~~~~~~~~~~-:::~~~~~-~:;~~~~~-~;:~~~~~~-----~-~~~~~~~~~~:\r\n"
				+ "~~~~~~~~~~--~-~~~~~~----~-~~~~~~-~~~~~~~~~--~~~--~~~-~~~~~~~~-~~~~~~~-~~~~~~~~~----~--~~~~~~~~~-~~~~~--------~~~~~~~-~~~~~~~~~~~~~\r\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~-~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-~-~~~~~~~~~~~~~~~~~~~~~~~~\r\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	    System.out.print("베팅할 점수를 입력하세요> ");
	    int bettingScore = sc.nextInt();
	    
	    System.out.println("예상 결과를 입력하세요");
	    System.out.println("[1]승 [2]패 [3]무승부");
		System.out.print(">> ");
	    int bettingResult = sc.nextInt();
	    
	    System.out.println("제시할 표식을 입력하세요");
	    System.out.println("[1]가위 [2]바위 [3]보");
	    System.out.print(">> ");
	    int playerMark = sc.nextInt() - 1;
	    
	    int score = 10; // db에서 가져온 사용자의 score
	    
	    // 컴퓨터 표식
	    Random random = new Random();
	    int computerMark = random.nextInt(3); // 0 이상 3 미만의 정수 반환
	    
	    showResult(playerMark, computerMark);
//	    System.out.println(getRealResult(playerMark, computerMark));
	    int realResult = getRealResult(playerMark, computerMark);
	    
	    sscore = getBettingResult(realResult, bettingResult, bettingScore, score);
	    System.out.println("최종점수" + sscore);
	    
	    
	  }
	public int getSscore() {
		return sscore;
	}
	
	
	
	
	public int getBettingResult(int realResult, int bettingResult, int bettingScore, int score) {
		if(realResult == bettingResult) {
			System.out.println("베팅에 성공했습니다.");
			System.out.println("베팅한 점수 [ " + bettingScore + " ]의 2배만큼 점수가 증가합니다.");
			score = bettingScore * 2;
		}else {
			System.out.println("베팅에 실패했습니다.");
			System.out.println("베팅한 점수 [ " + bettingScore + " ] 만큼 점수가 감소합니다.");
			score -= bettingScore;
		}
		
		return score;
	}
	
	public int getRealResult(int playerMark, int computerMark){
		int[][] result = { 
				{3, 2, 1},
				{1, 3, 2},
				{2, 1, 3} 
		};
		
		return result[playerMark][computerMark];
	}
	public void showResult(int playerMark, int computerMark){
		String[][] result = { 
			{"상대방은 가위를 냈습니다.\n비겼습니다.", "상대방은 바위를 냈습니다.\n졌습니다.", "상대방은 보를 냈습니다.\n이겼습니다."},
			{"상대방은 가위를 냈습니다.\n이겼습니다.", "상대방은 바위를 냈습니다.\n비겼습니다.", "상대방은 보를 냈습니다.\n졌습니다."},
			{"상대방은 가위를 냈습니다.\n졌습니다.", "상대방은 바위를 냈습니다.\n이겼습니다.", "상대방은 보를 냈습니다.\n비겼습니다."} 
		};
		
		System.out.println(result[playerMark][computerMark]);
	}
	
}

package controller;

public class RockPaperScissorsCon {
	MainCon mainCon = new MainCon();
	
	// 상대방 표식과 승패 결과 출력
	public void showResult(int playerMark, int computerMark){
		String[][] result = { 
			{"상대방은 가위를 냈습니다.\n비겼습니다.", "상대방은 바위를 냈습니다.\n졌습니다.", "상대방은 보를 냈습니다.\n이겼습니다."},
			{"상대방은 가위를 냈습니다.\n이겼습니다.", "상대방은 바위를 냈습니다.\n비겼습니다.", "상대방은 보를 냈습니다.\n졌습니다."},
			{"상대방은 가위를 냈습니다.\n졌습니다.", "상대방은 바위를 냈습니다.\n이겼습니다.", "상대방은 보를 냈습니다.\n비겼습니다."} 
		};
		
		System.out.println(result[playerMark][computerMark]);
	}
	
	// player 승:1 패:2 무:3
	public int getRealResult(int playerMark, int computerMark){
		int[][] result = { 
				{3, 2, 1},
				{1, 3, 2},
				{2, 1, 3} 
		};
		
		return result[playerMark][computerMark];
	}
	
	// 베팅 결과
	public int getBettingResult(int realResult, int bettingResult, int bettingScore, int score) {
		
		String resultText = "______  _____  _____  _   _  _      _____ \r\n"
				+ "| ___ \\|  ___|/  ___|| | | || |    |_   _|\r\n"
				+ "| |_/ /| |__  \\ `--. | | | || |      | |  \r\n"
				+ "|    / |  __|  `--. \\| | | || |      | |  \r\n"
				+ "| |\\ \\ | |___ /\\__/ /| |_| || |____  | |  \r\n"
				+ "\\_| \\_|\\____/ \\____/  \\___/ \\_____/  \\_/  ";
		
		if(realResult == bettingResult) {
			mainCon.changeColor(resultText, "cyan");
			System.out.println("베팅에 성공했습니다.");
			System.out.println("베팅한 점수 [ " + bettingScore + " ]의 2배만큼 점수가 증가합니다.");
			score = bettingScore * 2;
		}else {
			mainCon.changeColor(resultText, "cyan");
			System.out.println("베팅에 실패했습니다.");
			System.out.println("베팅한 점수 [ " + bettingScore + " ] 만큼 점수가 감소합니다.");
			score -= bettingScore;
		}
		
		return score;
	}
}

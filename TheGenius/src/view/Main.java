package view;

import java.util.Scanner;

import controller.MainCon;
import controller.MemberCon;
import model.MemberDTO;


public class Main {
	public static void main(String[] args) {
		
		MainCon mainCon = new MainCon();
		MemberCon con = new MemberCon();
		RockPaperScissorsMain rpsMain = new RockPaperScissorsMain();
		SameNumMain snMain = new SameNumMain();
		
		Scanner sc = new Scanner(System.in);
		
		String welcomeMent = "\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$$#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$$######$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@####*!=####$@@$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=@##**#;;==*-@####$-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~*#####-=$#@@@@#$$:!=$$=!=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=,,:####@@@@@@@@@@@@#=;~,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.,, !* $@@@@@@@@@@#!:,,,,~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.,.  *====@@@@@#*,,,,,,,.:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,..  *=====$$!-,,... .,,,~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,.   *===$*!!,,....  .,,,~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,.- ! *!!;;;!,.....  ..,.~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$,.. --~;;;;!-...    ,.,,~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,.-.,,.-::;;...   ,.,,,,~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#*,,,.,.,--~.  ,...,..,$#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=*.,,.,,, ......~*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#!-.......;;@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-,.-!@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      @@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@     @@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       @@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@    @@@@@@@@@@@@@@@@@@@@@@@@!    @@     @@@@@@@@@      @@@$=@*==@*#@@@@       @@@@@@@@@@@@       @@@@@@@@@@@\r\n"
				+ "@         !     @@@@@@@              ~@;    @@@    @@@@@@@@@@@     @@@          =@@@      @@@@@@@@@@@       @@@@@@@@@@@@\r\n"
				+ "@    @@@@  !.   @@@@@@@@          @@@@!     @@@    @@@@@@@@@@@     @:*     @     @@@      @@@@@@@@@@         @@@@@@@@@@@\r\n"
				+ "@    @@@~=..-.,.@@@@@@@@@@@#       @@@@!    @@@    @@@@@@@@@@@     @#    @@@@$,           @@@@@@@@@	@     @@@@@@@@@@\r\n"
				+ "@    ::;-;-,,...@@@@@@@@@@$$        @@@;    @@@    @@@@@@@@@@@     @#    @@@@@    @@      @@@@@@@@     @@      *@@@@@@@@\r\n"
				+ "@               @@@@@@@@@=    @@!    @@@    @@@    @@@@@@@##@@     @@,    @@=;    @@      @@@@@@!    $@@@@:     =@@@@@@@\r\n"
				+ "@@@@@@@@@@@     @@@@@@@#$    =@@#     @;    @@$              @     @@@,         ;@@@@     @@@@@     @@@@@@@$      @@@@@@\r\n"
				+ "@@@@@@@@@@@    @@@@@@@*     @@@@@@-. .:!    @@.            ,@@     @@@@@@     @@@@@@@     @@@      @@@@@@@@@@      !@@@@\r\n"
				+ "@@@@@@@@@@@  @@@@@@@@@!    @@@@@@@@@@@!     @@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@     @@      @@@@@@@@@@@@$     !@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@    !#@@@@@@@@@@@@@*     @@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@                                 #@\r\n"
				+ "@@@@@@@@@@@@@@@@@#     @@@@@@@@@@@@@@@@!    @@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@                                  ;\r\n"
				+ "@@@@@@@@@@@@@@@@   ~@@@@@@@@@@@@@@@@@@@!    @@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@# #@@@@@@@@@@@@@@@@@@@@@#,,,-@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
				+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*.,@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
				
			mainCon.changeColor(welcomeMent, "cyan");
//			mainCon.changeBgColor(welcomeMent, "yellow");
		System.out.println();
		while(true) {
			System.out.println("[1]로그인 [2]회원가입 [3]종료");
			System.out.println("선택>> ");
			int select = sc.nextInt();
			
			if(select == 1) { // 로그인
				System.out.println("===== 로그인 =====");
				System.out.println("id");
				String ID = sc.next();
				System.out.println("pw");
				String PW = sc.next();
				MemberDTO dto = new MemberDTO(ID,PW);
				con.login(dto);
				if(con.login(dto)==true) {
					System.out.println("로그인 성공 "+ dto.getID()+"님 환영합니다");
					while(true) {
					System.out.println("[1]로그아웃 [2]회원탈퇴 [3]게임선택 [4]랭킹확인");
					int select2 = sc.nextInt();
					if(select2 == 1) {
						break;
					}else if (select2 == 2) {//회원탈퇴
						while(true) {
						System.out.println("정말 회원탈퇴를 하겠습니까?(Y/N)");
						String yesno = sc.next();
						if(yesno.equals("Y")) {
							System.out.println("아이디와 비밀번호를 입력해주세요");
							System.out.print("ID >> ");
							String DID = sc.next();
							System.out.print("PW >> ");
							String DPW = sc.next();
							if(dto.getID().equals(DID) && dto.getPW().equals(DPW)) {
								con.delete(dto);
								break;
							} else {
								System.out.println("다시입력");
								break;
							}
						}else if(yesno!="Y"&&yesno!="N") {
							System.out.println("Y/N중에 입력해주세요");
						}
					}
//===========================================게임선택=====================================
					}else if(select2 == 3) {
						System.out.println("[1]같은숫자찾기 [2]다섯고개 [3]베팅가위바위보 [4]랭킹확인");
						int selectGame = sc.nextInt();
						switch (selectGame) {
						case 1: 
							snMain.startGame();
							break;
						case 2:
							rpsMain.startGame();
							break;
						case 3:
							rpsMain.startGame();
							break;
						default:
							break;
						}						
						
						
					}else if(select2 == 4) {//랭킹확인
						con.rank();
					}
					}
				}
				System.out.println("다시 시도하십시오");
			}else if(select == 2){ // 회원가입 
				System.out.println("===== 회원가입 =====");
				con.joinmember();
								
			}else if(select == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else{
				System.out.println("로그인이 필요합니다 :)");
			}
			
		}
		
	
	
	
	}
}

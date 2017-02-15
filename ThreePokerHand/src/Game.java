import java.util.Arrays;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value2 = 0;
		int value3 = 0;

		// 동일한 점수일때 숫자비교
		int numcheck1 = 0, numcheck2 = 0;

		// 플레이어 총점
		int rank1 = 0, rank2 = 0;

		// 족보별 점수
		int onepair = 10000;
		int twopair = 100000;
		int three = 1000000;
		int straight = 10000000;
		int flush = 20000000;
		int fullhouse = 30000000;
		int four = 40000000;
		int straightflush = 50000000;

		// // 무늬별 점수 // 무늬도 따진다면 소수점으로 계산시 추가.
		// double spade = 0.1;
		// double club = 0.01;
		// double heart = 0.001;
		// double diamond = 0.0001;
		// double shaper1 = 0, shaper2 = 0;

		Cards card = new Cards();
			
		//배열에 직접 입력하지않고 문자열로 입력한다면
//		
//		String player1 ="As Jd Ks Js 10s";
//		String player2 ="Ks Js Jd 8s 5s";
//		
//		card.play1 = player1.split(" ");
//		card.play2 = player2.split(" ");
//	
//		
	
		System.out.print("Player1"+"(\"");
		for (int i = 0; i < 5; i++) {
			if(i<4){
				System.out.print(card.play1[i]+" ");
			}else{
				System.out.print(card.play1[i]);
			}
		}
		System.out.print("\"), ");
		

		System.out.print("Player2"+"(\"");
		for (int i = 0; i < 5; i++) {
			if(i<4){
				System.out.print(card.play2[i]+" ");
			}else{
				System.out.print(card.play2[i]);
			}
		}
		System.out.print("\")");
		System.out.println();

		System.out.println();
		System.out.println("Result");

		// 무늬 분리
		for (int i = 0; i < 5; i++) {
			if (card.play1[i].contains("s")) {
				card.shp1[i] = "s";

			} else if (card.play1[i].contains("d")) {
				card.shp1[i] = "d";

			} else if (card.play1[i].contains("c")) {
				card.shp1[i] = "c";

			} else if (card.play1[i].contains("h")) {
				card.shp1[i] = "h";

			}
		}

		for (int i = 0; i < 5; i++) {
			if (card.play2[i].contains("s")) {
				card.shp2[i] = "s";

			} else if (card.play2[i].contains("d")) {
				card.shp2[i] = "d";

			} else if (card.play2[i].contains("c")) {
				card.shp2[i] = "c";

			} else if (card.play2[i].contains("h")) {
				card.shp2[i] = "h";

			}
		}

		// 점수분류
		///////////////////////// player1
		for (int i = 0; i < 5; i++) {
			if (card.play1[i].contains("A")) {
				card.num1[i] = 14;
			} else if (card.play1[i].contains("K")) {
				card.num1[i] = 13;
			} else if (card.play1[i].contains("Q")) {
				card.num1[i] = 12;
			} else if (card.play1[i].contains("J")) {
				card.num1[i] = 11;
			} else if (card.play1[i].contains("10")) {
				card.num1[i] = 10;
			} else if (card.play1[i].contains("9")) {
				card.num1[i] = 9;
			} else if (card.play1[i].contains("8")) {
				card.num1[i] = 8;
			} else if (card.play1[i].contains("7")) {
				card.num1[i] = 7;
			} else if (card.play1[i].contains("6")) {
				card.num1[i] = 6;
			} else if (card.play1[i].contains("5")) {
				card.num1[i] = 5;
			} else if (card.play1[i].contains("4")) {
				card.num1[i] = 4;
			} else if (card.play1[i].contains("3")) {
				card.num1[i] = 3;
			} else {
				card.num1[i] = 2;
			}
		}

		// player2
		for (int i = 0; i < 5; i++) {
			if (card.play2[i].contains("A")) {
				card.num2[i] = 14;
			} else if (card.play2[i].contains("K")) {
				card.num2[i] = 13;
			} else if (card.play2[i].contains("Q")) {
				card.num2[i] = 12;
			} else if (card.play2[i].contains("J")) {
				card.num2[i] = 11;
			} else if (card.play2[i].contains("10")) {
				card.num2[i] = 10;
			} else if (card.play2[i].contains("9")) {
				card.num2[i] = 9;
			} else if (card.play2[i].contains("8")) {
				card.num2[i] = 8;
			} else if (card.play2[i].contains("7")) {
				card.num2[i] = 7;
			} else if (card.play2[i].contains("6")) {
				card.num2[i] = 6;
			} else if (card.play2[i].contains("5")) {
				card.num2[i] = 5;
			} else if (card.play2[i].contains("4")) {
				card.num2[i] = 4;
			} else if (card.play2[i].contains("3")) {
				card.num2[i] = 3;
			} else {
				card.num2[i] = 2;
			}
		}

//		/// 무늬출력 테스트
//		for (int i = 0; i < 5; i++) {
//			System.out.print(card.shp1[i] + " ");
//		}

		Arrays.sort(card.play1);
		Arrays.sort(card.num1);
		Arrays.sort(card.play2);
		Arrays.sort(card.num2);
//		System.out.println("sort");

		
		//숫자 계산 및 나열확인
//		System.out.print("Player1 got ");
//		for (int i = 0; i < 5; i++) {
//			System.out.print(card.num1[i] + " ");
//		}
//		System.out.println();
//
//		System.out.print("Player2 got ");
//		for (int i = 0; i < 5; i++) {
//			System.out.print(card.num2[i] + " ");
//		}
		System.out.println();

		// 원페어일경우
		if (card.num1[0] == card.num1[1]) {
			numcheck1 = card.num1[0] + card.num1[1];
			rank1 = onepair;
		} else if (card.num1[0] == card.num1[2]) {
			numcheck1 = card.num1[0] + card.num1[2];
			rank1 = onepair;
		} else if (card.num1[0] == card.num1[3]) {
			numcheck1 = card.num1[0] + card.num1[3];
			rank1 = onepair;
		} else if (card.num1[0] == card.num1[4]) {
			numcheck1 = card.num1[0] + card.num1[4];
			rank1 = onepair;
		} else if (card.num1[1] == card.num1[2]) {
			numcheck1 = card.num1[1] + card.num1[2];
			rank1 = onepair;
		} else if (card.num1[1] == card.num1[3]) {
			numcheck1 = card.num1[1] + card.num1[3];
			rank1 = onepair;
		} else if (card.num1[1] == card.num1[4]) {
			numcheck1 = card.num1[1] + card.num1[4];
			rank1 = onepair;
		} else if (card.num1[2] == card.num1[3]) {
			numcheck1 = card.num1[2] + card.num1[3];
			rank1 = onepair;
		} else if (card.num1[2] == card.num1[4]) {
			numcheck1 = card.num1[2] + card.num1[4];
			rank1 = onepair;
		} else if (card.num1[3] == card.num1[4]) {
			numcheck1 = card.num1[3] + card.num1[4];
			rank1 = onepair;

		}

		// 투페어일경우
		if (card.num1[0] == card.num1[1] && card.num1[2] == card.num1[3]) {
			rank1 = twopair;
			if (card.num1[0] + card.num1[1] > card.num1[2] + card.num1[3]) {
				numcheck1 = card.num1[0] + card.num1[1];
			} else {
				numcheck1 = card.num1[2] + card.num1[3];
			}
		} else if (card.num1[1] == card.num1[2] && card.num1[3] == card.num1[4]) {
			rank1 = twopair;
			if (card.num1[1] + card.num1[2] > card.num1[3] + card.num1[4]) {
				numcheck1 = card.num1[1] + card.num1[2];
			} else {
				numcheck1 = card.num1[3] + card.num1[4];
			}
		} else if (card.num1[0] == card.num1[1] && card.num1[3] == card.num1[4]) {
			rank1 = twopair;
			if (card.num1[0] + card.num1[1] > card.num1[3] + card.num1[4]) {
				numcheck1 = card.num1[0] + card.num1[1];
			} else {
				numcheck1 = card.num1[3] + card.num1[4];
			}
		} else if (card.num1[0] == card.num1[1] && card.num1[2] == card.num1[4]) {
			rank1 = twopair;
			if (card.num1[0] + card.num1[1] > card.num1[2] + card.num1[4]) {
				numcheck1 = card.num1[0] + card.num1[1];
			} else {
				numcheck1 = card.num1[2] + card.num1[4];
			}
		} else if (card.num1[0] == card.num1[2] && card.num1[1] == card.num1[4]) {
			rank1 = twopair;
			if (card.num1[0] + card.num1[2] > card.num1[1] + card.num1[4]) {
				numcheck1 = card.num1[0] + card.num1[2];
			} else {
				numcheck1 = card.num1[1] + card.num1[4];
			}
		}

		// 트리플
		if (card.num1[0] == card.num1[1] && card.num1[1] == card.num1[2]) {
			numcheck1 = card.num1[0] + card.num1[1] + card.num1[2];
			rank1 = three;

		} else if (card.num1[1] == card.num1[2] && card.num1[2] == card.num1[3]) {
			numcheck1 = card.num1[1] + card.num1[2] + card.num1[3];
			rank1 = three;

		} else if (card.num1[1] == card.num1[3] && card.num1[3] == card.num1[4]) {
			numcheck1 = card.num1[1] + card.num1[3] + card.num1[4];
			rank1 = three;

		} else if (card.num1[2] == card.num1[3] && card.num1[3] == card.num1[4]) {
			numcheck1 = card.num1[2] + card.num1[3] + card.num1[4];
			rank1 = three;

		} else if (card.num1[0] == card.num1[1] && card.num1[1] == card.num1[3]) {
			numcheck1 = card.num1[0] + card.num1[1] + card.num1[3];
			rank1 = three;

		} else if (card.num1[0] == card.num1[3] && card.num1[3] == card.num1[4]) {
			numcheck1 = card.num1[0] + card.num1[3] + card.num1[4];
			rank1 = three;

		} else if (card.num1[0] == card.num1[1] && card.num1[1] == card.num1[4]) {
			numcheck1 = card.num1[0] + card.num1[1] + card.num1[4];
			rank1 = three;
		}

		// fullhouse
		if (card.num1[0] == card.num1[1] && card.num1[1] == card.num1[2] && card.num1[3] == card.num1[4]) {
			numcheck1 = card.num1[0] + card.num1[1] + card.num1[2];
			rank1 = fullhouse;

		} else if (card.num1[2] == card.num1[3] && card.num1[3] == card.num1[4] && card.num1[0] == card.num1[1]) {
			numcheck1 = card.num1[2] + card.num1[3] + card.num1[4];
			rank1 = fullhouse;

		} else if (card.num1[1] == card.num1[2] && card.num1[2] == card.num1[3] && card.num1[0] == card.num1[4]) {
			numcheck1 = card.num1[1] + card.num1[2] + card.num1[3];
			rank1 = fullhouse;

		} else if (card.num1[0] == card.num1[2] && card.num1[1] == card.num1[3] && card.num1[3] == card.num1[4]) {
			numcheck1 = card.num1[1] + card.num1[3] + card.num1[4];
			rank1 = fullhouse;

		} else if (card.num1[2] == card.num1[4] && card.num1[0] == card.num1[1] && card.num1[1] == card.num1[3]) {
			numcheck1 = card.num1[0] + card.num1[1] + card.num1[3];
			rank1 = fullhouse;
		}

		// straight
		// 5.4.3.2.A경우
		if (card.play1[0].contains("2") && card.play1[1].contains("3") && card.play1[2].contains("4")
				&& card.play1[3].contains("5") && card.play1[4].contains("A")) {
			numcheck1 = card.num1[0] + card.num1[1] + card.num1[2] + card.num1[3] + card.num1[4] + 1;
			rank1 = straight;
			value2++;
		}
		// 그외 경우
		if (card.num1[0] + 1 == card.num1[1] && (card.num1[1] + 1) == card.num1[2] && (card.num1[2] + 1) == card.num1[3]
				&& (card.num1[3] + 1) == card.num1[4]) {
			numcheck1 = card.num1[0] + card.num1[1] + card.num1[2] + card.num1[3] + card.num1[4];
			rank1 = straight;
			value2++;

		}

		// flush
		if (card.shp1[0].equals(card.shp1[1]) && card.shp1[0].equals(card.shp1[2]) && card.shp1[0].equals(card.shp1[3])
				&& card.shp1[0].equals(card.shp1[4])) {
			rank1 = flush;
			value2++;
			if (value2 == 2) {
				rank1 = straightflush;
			}

		}

		// four
		if (card.num1[0] == card.num1[1] && card.num1[1] == card.num1[2] && card.num1[2] == card.num1[3]) {
			numcheck1 = card.num1[0] + card.num1[1] + card.num1[2] + card.num1[3];
			rank1 = four;
		} else if (card.num1[1] == card.num1[2] && card.num1[2] == card.num1[3] && card.num1[3] == card.num1[4]) {
			numcheck1 = card.num1[1] + card.num1[2] + card.num1[3] + card.num1[4];
			rank1 = four;
		}

		//// player2

		// 원페어일경우
		if (card.num2[0] == card.num2[1]) {
			numcheck2 = card.num2[0] + card.num2[1];
			rank2 = onepair;
		} else if (card.num2[0] == card.num2[2]) {
			numcheck2 = card.num2[0] + card.num2[2];
			rank2 = onepair;
		} else if (card.num2[0] == card.num2[3]) {
			numcheck2 = card.num2[0] + card.num2[3];
			rank2 = onepair;
		} else if (card.num2[0] == card.num2[4]) {
			numcheck2 = card.num2[0] + card.num2[4];
			rank2 = onepair;
		} else if (card.num2[1] == card.num2[2]) {
			numcheck2 = card.num2[1] + card.num2[2];
			rank2 = onepair;
		} else if (card.num2[1] == card.num2[3]) {
			numcheck2 = card.num2[1] + card.num2[3];
			rank2 = onepair;
		} else if (card.num2[1] == card.num2[4]) {
			numcheck2 = card.num2[1] + card.num2[4];
			rank2 = onepair;
		} else if (card.num2[2] == card.num2[3]) {
			numcheck2 = card.num2[2] + card.num2[3];
			rank2 = onepair;
		} else if (card.num2[2] == card.num2[4]) {
			numcheck2 = card.num2[2] + card.num2[4];
			rank2 = onepair;
		} else if (card.num2[3] == card.num2[4]) {
			numcheck2 = card.num2[3] + card.num2[4];
			rank2 = onepair;

		}

		// 투페어일경우
		if (card.num2[0] == card.num2[1] && card.num2[2] == card.num2[3]) {
			rank2 = twopair;
			if (card.num2[0] + card.num2[1] > card.num2[2] + card.num2[3]) {
				numcheck2 = card.num2[0] + card.num2[1];
			} else {
				numcheck2 = card.num2[2] + card.num2[3];
			}
		} else if (card.num2[1] == card.num2[2] && card.num2[3] == card.num2[4]) {
			rank2 = twopair;
			if (card.num2[1] + card.num2[2] > card.num2[3] + card.num2[4]) {
				numcheck2 = card.num2[1] + card.num2[2];
			} else {
				numcheck2 = card.num2[3] + card.num2[4];
			}
		} else if (card.num2[0] == card.num2[1] && card.num2[3] == card.num2[4]) {
			rank2 = twopair;
			if (card.num2[0] + card.num2[1] > card.num2[3] + card.num2[4]) {
				numcheck2 = card.num2[0] + card.num2[1];
			} else {
				numcheck2 = card.num2[3] + card.num2[4];
			}
		} else if (card.num2[0] == card.num2[1] && card.num2[2] == card.num2[4]) {
			rank2 = twopair;
			if (card.num2[0] + card.num2[1] > card.num2[2] + card.num2[4]) {
				numcheck2 = card.num2[0] + card.num2[1];
			} else {
				numcheck2 = card.num2[2] + card.num2[4];
			}
		} else if (card.num2[0] == card.num2[2] && card.num2[1] == card.num2[4]) {
			rank2 = twopair;
			if (card.num2[0] + card.num2[2] > card.num2[1] + card.num2[4]) {
				numcheck2 = card.num2[0] + card.num2[2];
			} else {
				numcheck2 = card.num2[1] + card.num2[4];
			}
		}

		// 트리플
		if (card.num2[0] == card.num2[1] && card.num2[1] == card.num2[2]) {
			numcheck2 = card.num2[0] + card.num2[1] + card.num2[2];
			rank2 = three;

		} else if (card.num2[1] == card.num2[2] && card.num2[2] == card.num2[3]) {
			numcheck2 = card.num2[1] + card.num2[2] + card.num2[3];
			rank2 = three;

		} else if (card.num2[1] == card.num2[3] && card.num2[3] == card.num2[4]) {
			numcheck2 = card.num2[1] + card.num2[3] + card.num2[4];
			rank2 = three;

		} else if (card.num2[2] == card.num2[3] && card.num2[3] == card.num2[4]) {
			numcheck2 = card.num2[2] + card.num2[3] + card.num2[4];
			rank2 = three;

		} else if (card.num2[0] == card.num2[1] && card.num2[1] == card.num2[3]) {
			numcheck2 = card.num2[0] + card.num2[1] + card.num2[3];
			rank2 = three;

		} else if (card.num2[0] == card.num2[3] && card.num2[3] == card.num2[4]) {
			numcheck2 = card.num2[0] + card.num2[3] + card.num2[4];
			rank2 = three;

		} else if (card.num2[0] == card.num2[1] && card.num2[1] == card.num2[4]) {
			numcheck2 = card.num2[0] + card.num2[1] + card.num2[4];
			rank2 = three;
		}

		// fullhouse
		if (card.num2[0] == card.num2[1] && card.num2[1] == card.num2[2] && card.num2[3] == card.num2[4]) {
			numcheck2 = card.num2[0] + card.num2[1] + card.num2[2];
			rank2 = fullhouse;

		} else if (card.num2[2] == card.num2[3] && card.num2[3] == card.num2[4] && card.num2[0] == card.num2[1]) {
			numcheck2 = card.num2[2] + card.num2[3] + card.num2[4];
			rank2 = fullhouse;

		} else if (card.num2[1] == card.num2[2] && card.num2[2] == card.num2[3] && card.num2[0] == card.num2[4]) {
			numcheck2 = card.num2[1] + card.num2[2] + card.num2[3];
			rank2 = fullhouse;

		} else if (card.num2[0] == card.num2[2] && card.num2[1] == card.num2[3] && card.num2[3] == card.num2[4]) {
			numcheck2 = card.num2[1] + card.num2[3] + card.num2[4];
			rank2 = fullhouse;

		} else if (card.num2[2] == card.num2[4] && card.num2[0] == card.num2[1] && card.num2[1] == card.num2[3]) {
			numcheck2 = card.num2[0] + card.num2[1] + card.num2[3];
			rank2 = fullhouse;
		}

		// straight
		// 5.4.3.2.A경우
		if (card.play2[0].contains("2") && card.play2[1].contains("3") && card.play2[2].contains("4")
				&& card.play2[3].contains("5") && card.play2[4].contains("A")) {
			numcheck2 = card.num2[0] + card.num2[1] + card.num2[2] + card.num2[3] + card.num2[4] + 1;
			rank2 = straight;
			value3++;
		}
		// 그외 경우
		if (card.num2[0] + 1 == card.num2[1] && (card.num2[1] + 1) == card.num2[2] && (card.num2[2] + 1) == card.num2[3]
				&& (card.num2[3] + 1) == card.num2[4]) {
			numcheck2 = card.num2[0] + card.num2[1] + card.num2[2] + card.num2[3] + card.num2[4];
			rank2 = straight;
			value3++;

		}

		// flush
		if (card.shp2[0].equals(card.shp2[1]) && card.shp2[0].equals(card.shp2[2]) && card.shp2[0].equals(card.shp2[3])
				&& card.shp2[0].equals(card.shp2[4])) {
			rank2 = flush;
			value3++;
			if (value3 == 2) {
				rank2 = straightflush;
			}

		}

		// four
		if (card.num2[0] == card.num2[1] && card.num2[1] == card.num2[2] && card.num2[2] == card.num2[3]) {
			numcheck2 = card.num2[0] + card.num2[1] + card.num2[2] + card.num2[3];
			rank2 = four;
		} else if (card.num2[1] == card.num2[2] && card.num2[2] == card.num2[3] && card.num2[3] == card.num2[4]) {
			numcheck2 = card.num2[1] + card.num2[2] + card.num2[3] + card.num2[4];
			rank2 = four;
		}

		
		
		
		// 점수합산 예외처리
		// pair
		//페어일 경우 페어가 높은순 . 같으면 나머지 장중 높은순 가점
		if (rank1 == rank2) {
			if (numcheck1 > numcheck2) {
				rank1++;
			} else if (numcheck1 < numcheck2) {
				rank2++;
			} else {
				for (int i = 4; i > 1; i--) {
					if (card.num1[i] > card.num2[i]) {
						rank1++;
					} else if (card.num1[i] < card.num2[i]) {
						rank2++;
					}
				}
			}
		}

		// flush 같을경우 승패결정
		if (rank1 == 20000000 && rank2 == 20000000) {
			for (int i = 4; i > 1; i--) {
				if (card.num1[i] > card.num2[i]) {
					rank1++;
				} else if (card.num1[i] < card.num2[i]) {
					rank2++;
				}
			}
		}

		//////////// 종합점수!
//		System.out.println("player1 = " + rank1);
//		System.out.println("player2 = " + rank2);

		
		
		//출력
		if (rank1 > rank2) {
			System.out.println("Player1 wins");
		} else if (rank2 > rank1) {
			System.out.println("Player2 wins");
		} else {
			System.out.println("Draw");
		}

	}

}

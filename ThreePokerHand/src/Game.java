import java.util.Arrays;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value2 = 0;
		int value3 = 0;

		// ������ �����϶� ���ں�
		int numcheck1 = 0, numcheck2 = 0;

		// �÷��̾� ����
		int rank1 = 0, rank2 = 0;

		// ������ ����
		int onepair = 10000;
		int twopair = 100000;
		int three = 1000000;
		int straight = 10000000;
		int flush = 20000000;
		int fullhouse = 30000000;
		int four = 40000000;
		int straightflush = 50000000;

		// // ���̺� ���� // ���̵� �����ٸ� �Ҽ������� ���� �߰�.
		// double spade = 0.1;
		// double club = 0.01;
		// double heart = 0.001;
		// double diamond = 0.0001;
		// double shaper1 = 0, shaper2 = 0;

		Cards card = new Cards();
			
		//�迭�� ���� �Է������ʰ� ���ڿ��� �Է��Ѵٸ�
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

		// ���� �и�
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

		// �����з�
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

//		/// ������� �׽�Ʈ
//		for (int i = 0; i < 5; i++) {
//			System.out.print(card.shp1[i] + " ");
//		}

		Arrays.sort(card.play1);
		Arrays.sort(card.num1);
		Arrays.sort(card.play2);
		Arrays.sort(card.num2);
//		System.out.println("sort");

		
		//���� ��� �� ����Ȯ��
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

		// ������ϰ��
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

		// ������ϰ��
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

		// Ʈ����
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
		// 5.4.3.2.A���
		if (card.play1[0].contains("2") && card.play1[1].contains("3") && card.play1[2].contains("4")
				&& card.play1[3].contains("5") && card.play1[4].contains("A")) {
			numcheck1 = card.num1[0] + card.num1[1] + card.num1[2] + card.num1[3] + card.num1[4] + 1;
			rank1 = straight;
			value2++;
		}
		// �׿� ���
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

		// ������ϰ��
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

		// ������ϰ��
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

		// Ʈ����
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
		// 5.4.3.2.A���
		if (card.play2[0].contains("2") && card.play2[1].contains("3") && card.play2[2].contains("4")
				&& card.play2[3].contains("5") && card.play2[4].contains("A")) {
			numcheck2 = card.num2[0] + card.num2[1] + card.num2[2] + card.num2[3] + card.num2[4] + 1;
			rank2 = straight;
			value3++;
		}
		// �׿� ���
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

		
		
		
		// �����ջ� ����ó��
		// pair
		//����� ��� �� ������ . ������ ������ ���� ������ ����
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

		// flush ������� ���а���
		if (rank1 == 20000000 && rank2 == 20000000) {
			for (int i = 4; i > 1; i--) {
				if (card.num1[i] > card.num2[i]) {
					rank1++;
				} else if (card.num1[i] < card.num2[i]) {
					rank2++;
				}
			}
		}

		//////////// ��������!
//		System.out.println("player1 = " + rank1);
//		System.out.println("player2 = " + rank2);

		
		
		//���
		if (rank1 > rank2) {
			System.out.println("Player1 wins");
		} else if (rank2 > rank1) {
			System.out.println("Player2 wins");
		} else {
			System.out.println("Draw");
		}

	}

}

import java.util.ArrayList;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringList str = new StringList();
		
		// 순배열
		for (int i = 0; i < str.string1.length(); i++) {
			str.a.add(str.string1.substring(i, i + 1));
		}
		// 역배열
		for (int i = 0; i < str.string1.length(); i++) {
			str.b.add(str.string1.substring(str.string1.length() - i - 1, str.string1.length() - i));
		}
		// 지점 확인용 Flag
		int flag1 = 0;
		int flag2 = 0;

		Outer: for (int m = 0; m < str.b.size(); m++) {
			innerFor: for (int i = flag1; i < str.b.size(); i++) {
				if (str.b.get(i).equals(">")) {
					for (int f = i; f < str.b.size(); f++) {
						if (str.b.get(f).equals("<")) {
							// 다음 탐색지점 플래그
							flag1 = f + 1;
							break;
						}
					}
					break innerFor;
				} else {
					// 마지막 탈출
					if (str.b.get(i) == str.b.get(str.b.size() - 1)) {
						System.out.print((str.b.get(i)));
						break Outer;

					} else {
						System.out.print((str.b.get(i)));
					}

				}

			}

			innerFor: for (int j = flag2; j < str.a.size(); j++) {
				if (str.a.get(j).equals("<")) {
					for (int aa = j; aa < str.a.size(); aa++) {
						System.out.print(str.a.get(aa));
						if (str.a.get(aa).equals(">")) { // 만약 >만났다!
							flag2 = aa;
							break innerFor;
						}
					}
				}
			}

		}
	}
}

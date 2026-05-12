package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		System.out.println("※※※山手線ゲーム※※※\n");
		System.out.println("　　　ゲームスタート！");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] yamanote = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎", "原宿",
				"品川", "目白", "大塚", "上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鴬谷", "代々木", "新大久保", "巣鴨",
				"高輪ゲートウェイ" };

		String[] usedyamanote = new String[30];
		int usedCount = 0;
		for (int i = 0; i < 15; i++) {
			boolean found = false;
			String station = br.readLine();

			for (String A : yamanote) {
				if (station.equals(A)) {
					found = true;
					break;
				}
			}

			for (int j = 0; j < usedCount; j++) {
				if (usedyamanote[j].equals(station)) {
					found = false;
					break;
				}
			}

			if (found == false) {
				System.out.println("あなたの負けです！");
				return;
			}
			usedyamanote[usedCount++] = station;

			int y = 0;
			while (true) {
				Boolean used = false;
				y = (int) (Math.random() * yamanote.length);
				for (int j = 0; j < usedCount; j++) {
					if (yamanote[y].equals(usedyamanote[j])) {
						used = true;
						break;
					}
				}
				if (!used) {
					break;
				}
			}

			usedyamanote[usedCount++] = yamanote[y];
			System.out.println(yamanote[y]);
		}
		System.out.println("あなたの勝ちです！");
	}

}

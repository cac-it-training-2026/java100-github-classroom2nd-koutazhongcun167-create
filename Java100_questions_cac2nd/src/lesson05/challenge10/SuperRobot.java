package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SuperRobot {

	int water;
	int energy;
	String name;
	int eggNum;
	int butterNum;

	public String makeEggDishes(int riceNum, int meetNum, int eggNum, int butterNum) {
		String Superdish;
		if (riceNum >= 170 && meetNum >= 50 && eggNum >= 1 && butterNum >= 80) {
			Superdish = "チャーハン";
		} else if (eggNum >= 2 && riceNum >= 5) {
			Superdish = "卵かけご飯";
		} else if (eggNum >= 1) {
			Superdish = "ゆで卵";
		} else {
			Superdish = null;
		}
		return Superdish;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	void randomWater() {
		water = (int) (Math.random() * 9) + 1;
	}

	public void pumpWater() {
		System.out.println("水を" + water + "リットル出します\n");
	}

	public void makeOmelet(int eggNum, int butterNum) {
		int omrt = 0;
		int omom = eggNum / 2;
		int rtrt = butterNum / 5;

		if (omom > rtrt) {
			omrt = rtrt;
		} else {
			omrt = omom;
		}
		System.out.println("\n" + omrt + "人分のオムレツを作成しました。\n");

	}

}

//ここに次の条件を満たすクラスを作成してください。
//クラス名：ClearRobot
//メソッド名：clearTable(引数int[] ingredients
//戻り値void、渡された配列を0でクリアする)
class ClearRobot {
	public void clearTable(int[] ingredients) {
		for (int i = 0; i < ingredients.length; i++) {
			ingredients[i] = 0;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("お米の量を入力してください（グラム）＞");
		String riceNumStr = br.readLine();
		int riceNum = Integer.parseInt(riceNumStr);

		System.out.print("\n肉の量を入力してください（グラム）＞");
		String meetNumStr = br.readLine();
		int meetNum = Integer.parseInt(meetNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//makeEggDishesを実行する。
		//標準出力でメニューを表示する。
		SuperRobot robo = new SuperRobot();
		String Superdish = robo.makeEggDishes(riceNum, meetNum, eggNum, butterNum);
		if (Superdish == null) {
			System.out.println("\n何も作れません。");
		} else {
			System.out.println("\n" + Superdish + "が出来ました。");
		}

	}
}

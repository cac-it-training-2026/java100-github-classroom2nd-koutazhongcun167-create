/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題14 Mathクラス②（MAX）
 *
 * 地球に戻れるかどうかは航続距離がどれくらいあるかも
 * 関係しています。航続距離（○○光年）より燃料が上回っていれば
 * どうやら目的地までたどり着けるようです。
 *
 * 宇宙船クラス（Spaceship）に燃料タンク(fuel)とsetter、getterを記述し、
 * メソッドpublic boolean compareFuel(double fuelNum, double lightYear)を
 * 記述してください。compareFuelメソッドは燃料が上回っていればtrue、
 * 下回っていればfalseを返します。
 *
 * <実行例1>
 *
 * 宇宙飛行士：
 * 航続距離が気になるな～。
 * 燃料と比べてみるか。
 *
 * 航続距離を入力してください＞200
 * 燃料を入力してください＞200.01
 *
 * 宇宙飛行士：
 * よし！たどり着けるぞ。
 *
 * <実行例2>
 *
 * 宇宙飛行士：
 * 航続距離が気になるな～。
 * 燃料と比べてみるか。
 *
 * 航続距離を入力してください＞200
 * 燃料を入力してください＞199.99
 *
 * 宇宙飛行士：
 * これじゃあたどり着けないよう。どうしよう。。。
 *
 */

package lesson06.challenge14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにSpaceshipクラスを記述する
class Spaceship {
	public Spaceship() {
	}

	private int air;
	private int fuel;
	private static int number;

	public Spaceship(int air, int fuel) {
		this.air = air;
		this.fuel = fuel;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getAir() {
		return air;
	}

	public void setAir(int air) {
		this.air = air;
	}

	//ここに適切な処理を記述する。
	public static void count() {
		System.out.println("宇宙船は全部で" + number + "台あります。");
	}

	public boolean checkFuel(double fuelNum) {
		if (Math.floor(fuelNum) >= 12.0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean compareFuel(double fuelNum, double lightYear) {
		if (lightYear < fuelNum) {
			return true;
		} else {
			return false;
		}
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.println("宇宙飛行士：");
		System.out.println("航続距離が気になるな～。");
		System.out.println("燃料と比べてみるか。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("航続距離を入力してください＞");
		String lightYearStr = br.readLine();
		double lightYear = Double.parseDouble(lightYearStr);

		System.out.print("燃料を入力してください＞");
		String fuelStr = br.readLine();
		double fuelNum = Double.parseDouble(fuelStr);

		//ここに適切な処理を記述する
		Spaceship spa = new Spaceship();

		boolean isCheck = false;

		//ここに適切な処理を記述する
		isCheck = spa.compareFuel(fuelNum, lightYear);

		System.out.println("\n宇宙飛行士：");
		if (isCheck) {
			System.out.println("よし！たどり着けるぞ。");
		} else {
			System.out.println("これじゃあたどり着けないよう。どうしよう。。。");
		}
	}
}

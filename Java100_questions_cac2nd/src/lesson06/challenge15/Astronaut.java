/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題15 メソッドに参照渡し
 *
 * 地球に帰ってきました。
 * 帰路さまざまな障害を乗り越えて来ましたので、
 * 宇宙船がかなりの損傷を受けています。
 * ドックに預けて修理をしてもらいましょう。
 *
 * 宇宙船クラス（Spaceship）にダメージ(damage)とsetter、getterを記述し、
 * ドッククラス（Dock）にメソッドpublic void repairShip(Spaceship ship)
 * を記述してください。
 * メソッドrepairShip(Spaceship ship)は引数shipのダメージを0にします。
 *
 * <実行例>
 *
 * 宇宙飛行士：
 * やっとのことで帰ってきたけど、損傷がひどいな。
 * 修理に出そう。
 *
 * ダメージを入力してください＞200
 *
 * 現在のダメージ：200
 *
 * 宇宙飛行士：
 * よし！ドックから戻ってきたぞ！
 *
 * 現在のダメージ：0
 *
 */

package lesson06.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにSpaceshipクラスを記述する
class Spaceship {

	public Spaceship() {
	}

	private int damage;
	private int air;
	private int fuel;
	private static int number;

	public Spaceship(int damage, int air, int fuel) {
		this.damage = damage;
		this.air = air;
		this.fuel = fuel;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
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

//ここにDockクラスを記述する
class Dock {
	public void repairShip(Spaceship ship) {
		ship.setDamage(0);
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.println("宇宙飛行士：");
		System.out.println("やっとのことで帰ってきたけど、損傷がひどいな。");
		System.out.println("修理に出そう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ダメージを入力してください＞");
		String damageStr = br.readLine();
		int damage = Integer.parseInt(damageStr);

		System.out.println("\n現在のダメージ：" + damage);

		//ここに適切な処理を記述する
		Dock dock = new Dock();
		Spaceship ship = new Spaceship();
		ship.setDamage(damage);

		System.out.println("\n宇宙飛行士：");
		System.out.println("よし！ドックから戻ってきたぞ！\n");

		//ここに適切な処理を記述する
		dock.repairShip(ship);
		damage = ship.getDamage();

		System.out.println("現在のダメージ：" + damage);
	}
}

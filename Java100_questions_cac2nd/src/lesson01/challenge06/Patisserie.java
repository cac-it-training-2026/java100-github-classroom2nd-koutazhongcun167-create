/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int sitstock = 30;
		int syokstock = 30;
		int pisstock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + sitstock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + syokstock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pisstock + "個\n");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン　　　>");
		String sit = reader.readLine();
		int sitko = Integer.parseInt(sit);
		System.out.print("ショコラ　　　>");
		String syok = reader.readLine();
		int syokko = Integer.parseInt(syok);
		System.out.print("ピスタージュ　>");
		String pis = reader.readLine();
		int pisko = Integer.parseInt(pis);

		System.out.println("\nシトロン　　　>" + sit + '個');
		System.out.println("ショコラ　　　>" + syok + '個');
		System.out.println("ピスタージュ　>" + pis + "個\n");

		System.out.println("合計個数　　" + (sitko + syokko + pisko) + "個");
		System.out.println("合計金額　" + (sitko * 250 + syokko * 280 + pisko * 320) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");

		System.out.println("シトロン　　　\\250 ・・・ 残り" + (sitstock - sitko) + "個");
		System.out.println("ショコラ　　　\\250 ・・・ 残り" + (syokstock - syokko) + "個");
		System.out.println("ピスターシュ　\\250 ・・・ 残り" + (pisstock - pisko) + "個");

	}

}

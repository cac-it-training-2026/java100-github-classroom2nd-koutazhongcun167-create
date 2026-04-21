/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double sitko = Double.parseDouble(sit);
		System.out.print("ショコラ　　　>");
		String syok = reader.readLine();
		double syokko = Double.parseDouble(syok);
		System.out.print("ピスタージュ　>");
		String pis = reader.readLine();
		double pisko = Double.parseDouble(pis);

		System.out.println("\nシトロン　　　>" + sitko + '個');
		System.out.println("ショコラ　　　>" + syokko + '個');
		System.out.println("ピスタージュ　>" + pisko + "個\n");

		double totalcount = (sitko + syokko + pisko);
		System.out.println("合計個数　　" + totalcount + "個");

		double totalprice = (sitko * 250 + syokko * 280 + pisko * 320);
		int totalprice2 = (int) totalprice;
		System.out.println("合計金額　" + totalprice2 + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");

		double lastsitstock = (sitstock - sitko);
		int lastsitstock2 = (int) lastsitstock;
		double lastsyokstock = (syokstock - syokko);
		int lastsyokstock2 = (int) lastsyokstock;
		double lastpisstock = (pisstock - pisko);
		int lastpisstock2 = (int) lastpisstock;
		System.out.println("シトロン　　　\\250 ・・・ 残り" + lastsitstock2 + "個");
		System.out.println("ショコラ　　　\\250 ・・・ 残り" + lastsyokstock2 + "個");
		System.out.println("ピスターシュ　\\250 ・・・ 残り" + lastpisstock2 + "個");

	}

}

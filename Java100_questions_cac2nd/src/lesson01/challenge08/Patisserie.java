/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		System.out.println("ショコラ　　　\\280 ・・・ 残り" + lastsyokstock2 + "個");
		System.out.println("ピスターシュ　\\320 ・・・ 残り" + lastpisstock2 + "個\n");

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("売上の割合");
		System.out.println("売上合計　　　\\" + totalprice2);

		System.out.println("\n内訳");

		double sitsales = sitko * 250;
		double syoksales = syokko * 280;
		double pissales = pisko * 320;

		int sitparsent = (int) (sitsales / totalprice * 100);
		int syokparsent = (int) (syoksales / totalprice * 100);
		int pisparsent = (int) (pissales / totalprice * 100);

		System.out.println("シトロン　　　\\" + totalprice2 + "・・・" + sitparsent + "%");
		System.out.println("ショコラ　　　\\" + totalprice2 + "・・・" + syokparsent + "%");
		System.out.println("ピスターシュ　\\" + totalprice2 + "・・・" + pisparsent + "%");

	}

}

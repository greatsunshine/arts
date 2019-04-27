package leetcode;

import org.junit.Test;

/**
 * DESCRIPTION:Z形变换 除去第一行和最后一行，每行奇数位和偶数位分别对应两个等差数列
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 *
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 * @author coins
 * @create 2019-04-25 23:10
 */
public class Test06 {
	private StringBuilder sb = new StringBuilder();
	public String convert(String s, int numRows) {
		if(s==null||s.length()==0){
			return "";
		}
		if(numRows==1){
			return s;
		}
		char[] chars = s.toCharArray();
		//求出等差数列公差
		int d = 2*numRows-2;
		for (int row = 0; row < numRows; row++) {
			//求出两个等差数列第一个元素角标
			int first1 = row;
			int first2 = d-row;
			for (int j = 0;; j++) {
				if(j%2==0){
					if(first1>=s.length()) break;
					sb.append(chars[first1]);
					first1+=d;
				}else{
					if(row!=0&&row!=numRows-1){
						if(first2>=s.length()) break;
						sb.append(chars[first2]);
						first2+=d;
					}
				}
			}
		}
		return sb.toString();
	}

	@Test
	public void testConvert(){
		String s ="LEETCODEISHIRING";
		String convert = convert(s, 1);
		System.out.println(convert);
	}
}

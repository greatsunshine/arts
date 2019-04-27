package leetcode;

import org.junit.Test;

/**
 * DESCRIPTION:最长回文串，中心拓展法
 * 时间复杂度为O(n²)
 * @author coins
 * @create 2019-04-24 23:47
 */
public class Test05 {

	//回文串长度
	private int palindromeLen = 0;
	//回文串结果
	private String palindromeReuslt = "";

	public String longPalindrome(String s) {
		//字符串最大长度为1000
		if (s == null || s.length() == 0 || s.length() > 1000) {
			return "";
		}
		for (int i = 0; i < s.length(); i++) {
			//回文串为奇数时
			findPalindrome(s, i, i);
			//回文串为偶数时
			findPalindrome(s, i, i + 1);
		}
		return palindromeReuslt;
	}
	private void findPalindrome(String s, int low, int high) {
		while (low >= 0 && high <= s.length() - 1) {
			if (s.charAt(low)==s.charAt(high)) {
				if(high - low + 1 > palindromeLen){
					palindromeLen = high - low + 1;
					palindromeReuslt = s.substring(low, high + 1);
				}
				low--;
				high++;
			}else{
				break;
			}
		}
	}

	@Test
	public void testPalindrome() {
		String s = "google";
		String s1 = longPalindrome(s);
		System.out.println(s1);
	}
}

package com.poorak.String;

public class ZigZagConversion {
	public String convert(String s, int nRows) {
		if (s == null)
			return s;
		if (s.isEmpty())
			return s;

		if (nRows == 1)
			return s;

		if (nRows >= s.length())
			return s;

		int next = 2 * nRows - 2;

		String result = "";

		for (int i = 0; i < nRows; i++) {
			for (int j = i; j < s.length(); j = j + next) {
				result += s.charAt(j);
			}
		}

		return result;
	}

	String convert2(String s, int nRows) {
		String result = "";
		if (nRows == 1)
			return s;
		for (int i = 0; i < nRows && i < s.length(); i++) {
			int inc = 2 * (nRows - i - 1);
			int cur = i;
			int pre = -1;
			while (cur < s.length()) {
				if (cur != pre)
					result += s.charAt(cur);
				pre = cur;
				cur += inc;
				inc = 2 * (nRows - 1) - inc;
			}
		}
		return result;
	}
}

package sample;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class RearrangeKString {

	public String rearrangeString(String str, int k) {
		if (k == 0)
			return str;

		// initialize the counter for each character
		final HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		// sort the chars by frequency
		PriorityQueue<Character> queue = new PriorityQueue<Character>(new Comparator<Character>() {
			public int compare(Character c1, Character c2) {
				if (map.get(c2).intValue() != map.get(c1).intValue()) {
					return map.get(c2) - map.get(c1);
				} else {
					return c1.compareTo(c2);
				}
			}
		});

		for (char c : map.keySet())
			queue.offer(c);

		StringBuilder sb = new StringBuilder();
		int len = str.length();
		while (!queue.isEmpty()) {
			int cnt = Math.min(k, len);
			ArrayList<Character> temp = new ArrayList<Character>();

			for (int i = 0; i < cnt; i++) {
				if (queue.isEmpty())
					return "";
				char c = queue.poll();
				sb.append(String.valueOf(c));
				map.put(c, map.get(c) - 1);
				if (map.get(c) > 0) {
					temp.add(c);
				}

				len--;
			}

			for (char c : temp)
				queue.offer(c);
		}

		return sb.toString();
	}

	public static void main(String args[]) {
		String input = "aabbcc";
		// abcabc
		// a a b b c c
		// a b c a b c

		int k = 3;
		String result = new RearrangeKString().rearrangeString(input, k);

		System.out.println("RearrangeKString.main():result:" + result);
	}
}

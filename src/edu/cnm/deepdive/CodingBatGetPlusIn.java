package edu.cnm.deepdive;

/*

Given a string and a non-empty word string, return a version of the original String where all chars
have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */

public class CodingBatGetPlusIn {

  public static void main(String[] args) {
    System.out.printf("for the Strings %s and %s, the outcome will be " + plusOut("12xy34", "xy")
        + ".\n", "12xy34", "xy");
    System.out.printf("for the Strings %s and %s, the outcome will be " + plusOut("12xy34", "1")
        + ".\n", "12xy34", "1");
    System.out.printf("for the Strings %s and %s, the outcome will be " + plusOut("12xy34xyabcxy", "xy")
        + ".\n", "12xy34xyabcxy", "xy");
  }

  public static String plusOut(String str, String word) {
    String result = "";
    int len = word.length();

    for (int i = 0; i <= str.length() - len; i++) {
      if (!str.substring(i, i + len).equals(word)) {
        result += "+";
      } else {
        result += word;
        i = i + len - 1;
      }
    }

    for (int i = 1; i < len; i++) {
      if (!str.endsWith(word)) {
        result += "+";
      }
    }



    return result;
  }

}

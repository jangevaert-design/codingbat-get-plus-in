package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatGetPlusIn.plusOut;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatGetPlusInTest {


  private String[] strParams = {
      "12xy34",
      "12xy34",
      "12xy34xyabcxy",
      "abXYabcXYZ",
      "abXYabcXYZ",
      "abXYabcXYZ",
      "abXYxyzXYZ",
      "--++ab",
      "aaxxxxbb",
      "123123"
  };

  private String[] wordParams = {
      "xy",
      "1",
      "xy",
      "ab",
      "abc",
      "XY",
      "XYZ",
      "++",
      "xx",
      "3",
  };

  private String[] stringExpected = {
      "++xy++",
      "1+++++",
      "++xy++xy+++xy",
      "ab++ab++++",
      "++++abc+++",
      "++XY+++XY+",
      "+++++++XYZ",
      "++++++",
      "++xxxx++",
      "++3++3"
  };

  @Test
  void plusTest() {
    for (int i = 0; i < strParams.length; i++) {
      String actual = plusOut(strParams[i], wordParams[i]);
      Assertions.assertEquals(actual, stringExpected[i]);

    }
  }

}
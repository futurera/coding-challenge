package io.futurera.algorithm.tests;

import java.util.ArrayList;
import java.util.List;

import io.futurera.algorithm.BracketMatch;

/**********************************************************************
 * * Below are to test your codes. DO NOT LOOK WHEN YOU ARE CODING! * *
 **********************************************************************/
class BracketMatchTestRunner {

  public static void main(String[] args) {
    List<Boolean> result = new ArrayList<>();
    result.add(testcase1());
    result.add(testcase2());
    result.add(testcase3());
    result.add(testcase4());
    result.add(testcase5());
    result.add(testcase6());
    result.add(testcase7());
    result.add(testcase8());
    result.add(testcase9());
    result.add(testcase10());
    result.add(testcase11());
    result.add(testcase12());
    result.add(testcase13());
    result.add(testcase14());
    result.add(testcase15());
    result.add(testcase16());
    result.add(testcase17());
    result.add(testcase18());
    result.add(testcase19());
    result.add(testcase20());
    result.add(testcase21());
    result.add(testcase22());
    result.add(testcase23());
    result.add(testcase24());
    result.add(testcase25());
    result.add(testcase26());

    long fails = result.stream().filter(r -> r == false).count();
    if (fails == 0L)
      System.out.println("All test cases passed");
    else
      System.out.println("At least one test case fails");
    System.out.println("--------------------\nTest DONE");
  }

  private static boolean testcase1() {
    String s = "(((((((((())))))))))";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase2() {
    String s = "{{{{{{{{{{}}}}}}}}}}";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase3() {
    String s = "[[[[[[[[[[]]]]]]]]]]";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase4() {
    String s = "(one (two (three (four (five (six (seven (eight (nine (ten))))))))))";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase5() {
    String s = "[one (two (three (four (five (six (seven (eight (nine (ten )))))))))]";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase6() {
    String s = "{one {two {three {four {five {six {seven {eight {nine {ten}}}}}}}}}}";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase7() {
    String s = "[one {two {three {four {five {six {seven {eight {nine {ten }}}}}}}}}]";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase8() {
    String s = "[one [two [three [four [five [six [seven [eight [nine [ten]]]]]]]]]]";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase9() {
    String s = "[one [two [three [four [five [six [seven [eight [nine [ten ]]]]{}]]]]]]";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase10() {
    String s = "((((((((([a])))))))))";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase11() {
    String s = "{{{{{{{{{[a]}}}}}}}}}";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase12() {
    String s = "[[[[[[[[[[a]]]]]]]]]]";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase13() {
    String s = "{((((((((((a ))))))))))}";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase14() {
    String s = "{{{{{{{{{{a[] }}}}}}}}}}";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase15() {
    String s = "[[[[[[[[[[a ]]]]]]]]]]()";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase16() {
    String s = "{[(]}";
    int expected = 0;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase17() {
    String s = "{ }";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase18() {
    String s = "{ } { }";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase19() {
    String s = "{ { } }";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase20() {
    String s = "{ { { } { { } } } }";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase21() {
    String s = "{";
    int expected = 0;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase22() {
    String s = "}  {";
    int expected = 0;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase23() {
    String s = "{ { }";
    int expected = 0;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase24() {
    String s = "{ { } }  } { }";
    int expected = 0;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase25() {
    String s = "";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }

  private static boolean testcase26() {
    String s = "a";
    int expected = 1;
    int result = BracketMatch.run(s);
    return expected == result;
  }
}
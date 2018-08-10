package io.futurera.algorithm;

public class BracketMatchTest {
    public static void main(String[] args) {
        System.out.println("test case completed.");
    }

    private static boolean testcase1(){
        String s = "(((((((((())))))))))";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }
    private static boolean testcase2(){
        String s = "{{{{{{{{{{}}}}}}}}}}";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }
    private static boolean testcase3(){
        String s = "[[[[[[[[[[]]]]]]]]]]";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }
    private static boolean testcase4(){
        String s = "(one (two (three (four (five (six (seven (eight (nine (ten))))))))))";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }
    private static boolean testcase5(){
        String s = "(one (two (three (four (five (six (seven (eight (nine (ten ))))))))))";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase6(){
        String s = "{one {two {three {four {five {six {seven {eight {nine {ten}}}}}}}}}}";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase7(){
        String s = "{one {two {three {four {five {six {seven {eight {nine {ten }}}}}}}}}}";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase8(){
        String s = "[one [two [three [four [five [six [seven [eight [nine [ten]]]]]]]]]]";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase9(){
        String s = "[one [two [three [four [five [six [seven [eight [nine [ten ]]]]]]]]]]";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase10(){
        String s = "((((((((((a))))))))))";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase11(){
        String s = "{{{{{{{{{{a}}}}}}}}}}";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase12(){
        String s = "[[[[[[[[[[a]]]]]]]]]]";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase13(){
        String s = "((((((((((a ))))))))))";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase14(){
        String s = "{{{{{{{{{{a }}}}}}}}}}";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }

    private static boolean testcase15(){
        String s = "[[[[[[[[[[a ]]]]]]]]]]";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }
    private static boolean testcase16(){
        String s = "{[(]}";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected != result;
    }
    private static boolean testcase17(){
        String s = "{ }";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }
    private static boolean testcase18(){
        String s = "{ } { }";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }
    private static boolean testcase19(){
        String s = "{ { } }";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }
    private static boolean testcase20(){
        String s = "{ { { } { { } } } }";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected == result;
    }
    private static boolean testcase21(){
        String s = "{";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected != result;
    }
    private static boolean testcase22(){
        String s = "}  {";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected != result;
    }
    private static boolean testcase23(){
        String s = "{ { }";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected != result;
    }
    private static boolean testcase24(){
        String s = "{ { } }  } { }";
        int expected = 0;
        BracketMatch bm = new BracketMatch();
        int result = bm.bracketMatch(s);
        return expected != result;
    }

}

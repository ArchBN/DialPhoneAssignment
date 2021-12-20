//Test class to cover scenarios
package PhoneDial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static PhoneDial.TelephoneDialPad.retrieveCombinations;


public class TelephoneDialPadTest {
    //Tests to cover 0 digits input(Negative Test)
    @Test
    @Tag("High")
    public void Test_Nodigit() {
        String sut = "0";
        List<String> l = Arrays.asList("0");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate 0 digit Input");
    }

    @Test
    @Tag("High")
    public void Test_Number1() {
        String sut = "1";
        List<String> l = Arrays.asList("1");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate input 1");
    }

    //Tests to cover 1 digit input
    @Test
    @Tag("High")
    public void Test_OnedigitMinnumber() {
        String sut = "2";
        List<String> l = Arrays.asList("A", "B", "C");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate One digit Input");
    }

    //Test to cover digit 3
    @Test
    @Tag("High")
    public void Test_Onedigitnumber3() {
        String sut = "3";
        List<String> l = Arrays.asList("D", "E", "F");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate digit 3 Input");
    }

    @Test
    @Tag("Medium")
    public void Test_Onedigitnumber4() {
        String sut = "4";
        List<String> l = Arrays.asList("G", "H", "I");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate One digit Input");

    }

    @Test
    @Tag("Medium")
    public void Test_Onedigitnumber5() {
        String sut = "5";
        List<String> l = Arrays.asList("J", "K", "L");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate One digit Input");
    }

    @Test
    @Tag("Medium")
    public void Test_Onedigitnumber6() {
        String sut = "6";
        List<String> l = Arrays.asList("M", "N", "O");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate One digit Input");
    }

    @Test
    @Tag("Medium")
    public void Test_Onedigitnumber7() {
        String sut = "7";
        List<String> l = Arrays.asList("P", "Q", "R", "S");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate One digit Input");
    }

    //Tests to cover 2 digits input
    @Test
    @Tag("High")
    public void Test_Twodigits() {
        String sut = "23";
        List<String> l = Arrays.asList("AD", "AE", "AF", "BD", "BE", "BF", "CD", "CE", "CF");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);

        }
        System.out.println("Pass:Validate Two digits Input");
    }

    //Tests to cover 3 digits input
    @Test
    @Tag("High")
    public void Test_Threedigits() {
        String sut = "234";
        List<String> l = Arrays.asList("ADG", "ADH", "ADI", "AEG", "AEH", "AEI", "AFG", "AFH", "AFI", "BDG", "BDH", "BDI", "BEG", "BEH", "BEI", "BFG", "BFH", "BFI",
                "CDG", "CDH", "CDI", "CEG", "CEH", "CEI", "CFG", "CFH", "CFI");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate Three digits Input");
    }

    //Tests to cover Singledigit max Number
    @Test
    @Tag("High")
    public void Test_SingledigitMaxnumber() {
        String sut = "9";
        List<String> l = Arrays.asList("W", "X", "Y", "Z");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate Singledigit Maxnumber");
    }

    @Test
    @Tag("Medium")
    public void Test_InvalidInput1() {
        String sut = "3";
        List<String> l = Arrays.asList("D00000000", "E00000000", "F00000000");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate the Invalid Input");

    }

    @Test
    @Tag("Medium")
    public void Test_InvalidInput2() {
        String sut = "2";
        List<String> l = Arrays.asList("A", "A", "F");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);

        }
        System.out.println("Pass:Validate Invalid Input");
    }

    @Test
    @Tag("Medium")
    public void Test_InvalidInput3() {
        String sut = "2";
        List<String> l = Arrays.asList("A", "A", "");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate Invalid digits Input");
    }

    @Test
    @Tag("Low")
    public void Test_InvalidInput4() {
        String sut = "2";
        List<String> l = Arrays.asList("a", "b", "c");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate Invalid digits Input");
    }

    @Test
    @Tag("Low")
    public void Test_InvalidInput5() {
        String sut = "3    ";
        List<String> l = Arrays.asList("D00000000", "E00000000", "F00000000");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate Invalid digits Input");
    }

    @Test
    @Tag("Low")
    public void Test_InvalidInput6() {
        String sut = "4";
        List<String> l = Arrays.asList("G", "Q", "Y");
        List<String> combinationList = retrieveCombinations(sut);
        for (String s : combinationList) {
            System.out.println(s);
            Assertions.assertEquals(combinationList, l);
        }
        System.out.println("Pass:Validate Invalid digits Input");
    }

}


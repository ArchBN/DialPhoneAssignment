package myruntest1;
//Tests to run High and Medium priority cases

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import java.util.List;

import static PhoneDial.TelephoneDialPad.retrieveCombinations;

@RunWith(value = JUnitPlatform.class)
@SelectPackages(value = {"PhoneDial"})

public class Testparameters {
    @ParameterizedTest
    @CsvFileSource(resources = "/TestData.csv", numLinesToSkip = 1)
    public void Test_ParameterTest(String input, String expected) {
        List<String> expt = List.of(expected);
        List<String> combinationList = retrieveCombinations(input);
        for (String s : combinationList) {
            Assertions.assertSame(combinationList, expt);
            System.out.println(combinationList);
        }

    }
}

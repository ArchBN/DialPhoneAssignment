//Tests to run High and Medium priority cases
package myruntest1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(value = JUnitPlatform.class)
@SelectPackages(value = {"PhoneDial"})
@IncludeTags(value = {"High", "Medium"})
public class Runtest1 {
}

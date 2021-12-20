//Tests to run Low Prioirty cases

package myruntest1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(value = JUnitPlatform.class)
@SelectPackages(value = {"PhoneDial"})
@IncludeTags(value = {"Low"})
public class Runtest2 {
}

package org.automation.suits;

import org.automation.tests.TestMenuItems;
import org.automation.tests.TestSearch;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by shantonu on 12/10/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestMenuItems.class, TestSearch.class})
public class RegressionTests {
}

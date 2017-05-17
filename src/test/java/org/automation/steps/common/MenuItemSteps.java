package org.automation.steps.common;

import cucumber.api.java.en.Then;
import org.automation.core.StepBase;
import org.automation.pages.common.Menu;

/**
 * Created by shantonu on 4/24/17.
 * //todo , all menu items
 */
public class MenuItemSteps extends StepBase {
    private Menu menu;

    private MenuItemSteps() {
    }

    public MenuItemSteps(Menu allMenu) {
        menu = allMenu;
    }

    //an example , we need to do for all menu items
    @Then("")
    public void goto_laptop_notebook() {
        menu.laptop_notebook.clear();
        menu.laptop_notebook.click();


    }


}

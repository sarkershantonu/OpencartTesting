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
    @Then("")
    public void goto_laptop_notebook_macs() {
        menu.laptop_notebook_macs.clear();
        menu.laptop_notebook_macs.click();


    }
    @Then("")
    public void goto_laptop_notebook_windows() {
        menu.laptop_notebook_windows.clear();
        menu.laptop_notebook_windows.click();


    }
    @Then("")
    public void goto_mac() {
        menu.mac.clear();
        menu.mac.click();


    }
    @Then("")
    public void goto_macs() {
        menu.macs.clear();
        menu.macs.click();


    }
    @Then("")
    public void goto_windows() {
        menu.windows.clear();
        menu.windows.click();


    }
    @Then("")
    public void goto_components() {
        menu.components.clear();
        menu.components.click();


    }
    @Then("")
    public void goto_software() {
        menu.software.clear();
        menu.software.click();


    }
    @Then("")
    public void goto_tablets() {
        menu.tablets.clear();
        menu.tablets.click();


    }


}

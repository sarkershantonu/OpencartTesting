package org.automation.steps.common;

import org.automation.core.StepBase;
import org.automation.pages.common.Menu;

/**
 * Created by shantonu on 4/24/17.
 */
public class MenuItemSteps extends StepBase {
    private Menu menu;

    private MenuItemSteps() {
    }

    public MenuItemSteps(Menu allMenu) {
        menu = allMenu;
    }

    public void gotoLink() {
        menu.laptop_notebook.clear();
        menu.laptop_notebook.click();

    }


}

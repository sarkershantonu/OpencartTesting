package org.automation.steps.common;

import cucumber.api.java.en.Then;
import org.automation.core.StepBase;
import org.automation.pages.common.Menu;
import org.junit.Ignore;

/**
 * Created by shantonu on 4/24/17.
 * //all category link clicked
 */
@Ignore
public class MenuItemSteps extends StepBase {
    private Menu menu;

    private MenuItemSteps() {
    }

    public MenuItemSteps(Menu allMenu) {
        menu = allMenu;
    }

    //an example , we need to do for all menu items
  
    public void goto_laptop_notebook() {
        menu.laptop_notebook.clear();
        menu.laptop_notebook.click();
    }
  
    public void goto_laptop_notebook_macs() {
        menu.laptop_notebook_macs.clear();
        menu.laptop_notebook_macs.click();
    }
  
    public void goto_laptop_notebook_windows() {
        menu.laptop_notebook_windows.clear();
        menu.laptop_notebook_windows.click();
    }
  
    public void goto_mac() {
        menu.mac.clear();
        menu.mac.click();
    }
  
    public void goto_macs() {
        menu.macs.clear();
        menu.macs.click();
    }
  
    public void goto_windows() {
        menu.windows.clear();
        menu.windows.click();
    }

  
    public void goto_components_mice_trackballs() {
        menu.components_mice_trackballs.clear();
        menu.components_mice_trackballs.click();
    }

  
    public void goto_components() {
        menu.components.clear();
        menu.components.click();
    }
  
    public void goto_components_webCam() {
        menu.components_webCam.clear();
        menu.components_webCam.click();
    }

  
    public void goto_components_scanners() {
        menu.components_scanners.clear();
        menu.components_scanners.click();
    }
  
    public void goto_components_printers() {
        menu.components_printers.clear();
        menu.components_printers.click();
    }

  
    public void goto_components_monitors() {
        menu.components_monitors.clear();
        menu.components_monitors.click();
    }

  
    public void goto_software() {
        menu.software.clear();
        menu.software.click();
    }
  
    public void goto_tablets() {
        menu.tablets.clear();
        menu.tablets.click();
    }
  
    public void goto_desktop() {
        menu.desktop.clear();
        menu.desktop.click();
    }
  
    public void goto_pc() {
        menu.pc.clear();
        menu.pc.click();
    }

  
    public void goto_phone_pda() {
        menu.phone_pda.clear();
        menu.phone_pda.click();
    }

  
    public void goto_cameras() {
        menu.cameras.clear();
        menu.cameras.click();
    }

  
    public void goto_mp3_players() {
        menu.mp3_players.clear();
        menu.mp3_players.click();
    }

}

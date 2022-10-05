package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistroConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class RegistroUsuarioService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void enterSearchCriteria(String text) {
        setInput(RegistroConstants.INPUT_SEARCH_XPATH, text);
    }

    public static void clickSearchButton() {
        click(RegistroConstants.SEARCH_BUTTON_NAME);
    }
}

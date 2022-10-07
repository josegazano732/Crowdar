package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistroConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class RegistroUsuarioService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));

    }

    public static void clickMiCuenta() {
        click(RegistroConstants.CLICK_MI_CUENTA);
    }

    public static void enterEmailCriteria(String text) {
        setInput(RegistroConstants.INPUT_EMAIL_ID, text);
    }

    public  static void enterPassworCriteria(String text) {
        setInput(RegistroConstants.INPUT_PASSWORD_ID, text);
    }

    public static void clickSearchButton() {
        click(RegistroConstants.BUTTON_NAME);
    }


}

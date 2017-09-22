package repoter.hamza.alif.mvplogin.login.Main;

import java.util.List;

/**
 * Created by karim pc on 9/21/2017.
 */

public interface MainView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);


}

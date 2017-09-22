package repoter.hamza.alif.mvplogin.login.login;

/**
 * Created by karim pc on 9/21/2017.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}

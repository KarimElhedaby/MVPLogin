package repoter.hamza.alif.mvplogin.login.login;

/**
 * Created by karim pc on 9/21/2017.
 */

public interface LoginView  {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();

}

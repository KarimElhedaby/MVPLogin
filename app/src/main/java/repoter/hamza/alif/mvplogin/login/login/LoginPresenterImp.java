package repoter.hamza.alif.mvplogin.login.login;

/**
 * Created by karim pc on 9/21/2017.
 */

public class LoginPresenterImp implements LoginPresenter, LoginInteractor.OnloginfinishedListner {
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImp(LoginView loginView) {
        this.loginView = loginView;
        loginInteractor = new LoginInteractorImp();
    }

    @Override
    public void validateCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }
        loginInteractor.login(username, password, this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();
        }

    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}

package repoter.hamza.alif.mvplogin.login.login;

/**
 * Created by karim pc on 9/21/2017.
 */
public interface LoginInteractor {
    interface OnloginfinishedListner {
        void onPasswordError();

        void onUsernameError();

        void onSuccess();
    }

    void login(String username, String password, OnloginfinishedListner listener);
}

package repoter.hamza.alif.mvplogin.login.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by karim pc on 9/21/2017.
 */

public class LoginInteractorImp implements LoginInteractor {
    @Override
    public void login(final String username, final String password,
                      final OnloginfinishedListner listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                    return;
                }
                if (!error) {
                    listener.onSuccess();
                }

            }
        }, 2000);
    }
}

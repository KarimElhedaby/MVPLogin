package repoter.hamza.alif.mvplogin.login.Main;

import java.util.List;

/**
 * Created by karim pc on 9/21/2017.
 */

public interface FinditemsInteractor {

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}

package repoter.hamza.alif.mvplogin.login.Main;

import java.util.List;

/**
 * Created by karim pc on 9/22/2017.
 */

public class MainPresenterImp implements MainPresenter, FinditemsInteractor.OnFinishedListener {

    private MainView mainView;
    private FinditemsInteractor findItemsInteractor;

    public MainPresenterImp(MainView mainView, FinditemsInteractor findItemsInteractor) {
        this.mainView = mainView;
        this.findItemsInteractor = findItemsInteractor;
    }

    @Override public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }

        findItemsInteractor.findItems(this);
    }

    @Override public void onItemClicked(int position) {
        if (mainView != null) {
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override public void onDestroy() {
        mainView = null;
    }

    @Override public void onFinished(List<String> items) {
        if (mainView != null) {
            mainView.setItems(items);
            mainView.hideProgress();
        }
    }

    public MainView getMainView() {
        return mainView;
    }
}

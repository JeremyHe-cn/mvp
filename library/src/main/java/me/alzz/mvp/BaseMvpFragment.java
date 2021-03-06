package me.alzz.mvp;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.v4.app.Fragment;

/**
 * mvp简单的Fragment实现类
 * Created by jeremyhe on 2017/9/12.
 */

public class BaseMvpFragment extends Fragment implements IView {

    @CallSuper
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Presenter.init(context);
        Presenter.bind(this);
    }
}

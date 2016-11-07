package com.simonfea.devtoolbox.presentation.presenters.impl;

import com.simonfea.devtoolbox.domain.executor.Executor;
import com.simonfea.devtoolbox.domain.executor.MainThread;
import com.simonfea.devtoolbox.domain.interactors.SampleInteractor;
import com.simonfea.devtoolbox.presentation.presenters.base.AbstractPresenter;
import com.simonfea.devtoolbox.presentation.presenters.MainPresenter;

/**
 * Created by dmilicic on 12/13/15.
 */
public class MainPresenterImpl extends AbstractPresenter implements MainPresenter,
        SampleInteractor.Callback {

    private MainPresenter.View mView;

    public MainPresenterImpl(Executor executor,
                             MainThread mainThread,
                             View view) {
        super(executor, mainThread);
        mView = view;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }
}

package com.nextzy.mrsmile.mvp_example.common;

/**
 * Created by nextzy on 8/6/2016 AD.
 */
public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}

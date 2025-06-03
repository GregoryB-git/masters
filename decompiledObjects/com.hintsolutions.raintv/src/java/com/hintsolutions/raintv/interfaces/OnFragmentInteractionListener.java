/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 *  java.lang.Object
 */
package com.hintsolutions.raintv.interfaces;

import android.widget.TextView;

public interface OnFragmentInteractionListener {
    public void confirmSubscriptions();

    public void hideProgress();

    public void onMenuClicked();

    public void onSearchClicked();

    public void onSubscriptionClicked();

    public void onUserAuthorized();

    public void setupNotificationsCount(TextView var1);

    public void showProgress();

    public void startAudioLiveActivity();

    public void startLiveActivity();
}


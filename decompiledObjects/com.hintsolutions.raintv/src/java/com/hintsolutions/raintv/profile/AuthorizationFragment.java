/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  butterknife.OnClick
 *  java.lang.CharSequence
 *  java.lang.ClassCastException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package com.hintsolutions.raintv.profile;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.interfaces.OnFragmentInteractionListener;
import com.hintsolutions.raintv.profile.AuthorizationActivity;
import com.hintsolutions.raintv.profile.RegistrationActivity;
import java.util.HashMap;
import java.util.Map;

public class AuthorizationFragment
extends BaseFragment {
    private OnFragmentInteractionListener mListener;
    @BindView(value=2131297237)
    public TextView title;
    @BindView(value=2131297243)
    public TextView toggleBadgeTextView;
    @BindView(value=2131296364)
    public TextView versionView;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onActivityResult(int n2, int n4, Intent object) {
        if (n2 != 7) return;
        if (n4 != -1) return;
        try {
            object = this.mListener;
            if (object != null) {
                object.onUserAuthorized();
                return;
            }
            if (this.getActivity() == null) return;
            if (!(this.getActivity() instanceof MainActivity)) return;
            ((MainActivity)this.getActivity()).onUserAuthorized();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.mListener = (OnFragmentInteractionListener)this.getActivity();
            return;
        }
        catch (ClassCastException classCastException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getActivity().toString());
            stringBuilder.append(" must implement OnFragmentInteractionListener");
            throw new ClassCastException(stringBuilder.toString());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492967, (ViewGroup)object, false);
        this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        this.title.setText(2131755056);
        object = this.mListener;
        if (object != null) {
            object.setupNotificationsCount(this.toggleBadgeTextView);
        }
        try {
            bundle = this.getActivity().getPackageManager().getPackageInfo(this.getActivity().getApplicationContext().getPackageName(), 0);
            TextView textView = this.versionView;
            object = new StringBuilder();
            object.append("v. ");
            object.append(String.valueOf((Object)bundle.versionName));
            textView.setText((CharSequence)object.toString());
            return layoutInflater;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return layoutInflater;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.mListener = null;
    }

    @OnClick(value={2131296851})
    public void onMenuClicked() {
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.onMenuClicked();
        }
    }

    @OnClick(value={2131296375})
    public void startAuthorization() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"pay");
            hashMap.put((Object)"action", (Object)"click");
            hashMap.put((Object)"label", (Object)"subscribe");
            hashMap.put((Object)"value", (Object)"login");
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.startActivityForResult(new Intent((Context)this.getActivity(), AuthorizationActivity.class), 7);
    }

    @OnClick(value={2131297053})
    public void startRegistration() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"category", (Object)"pay");
            hashMap.put((Object)"action", (Object)"click");
            hashMap.put((Object)"label", (Object)"subscribe");
            hashMap.put((Object)"value", (Object)"register");
            this.analyticsManager.logRainView(this.rainApi, this.userManager.getUserId(), this.hashView, (Map)hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.startActivityForResult(new Intent((Context)this.getActivity(), RegistrationActivity.class), 7);
    }
}


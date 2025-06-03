/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.Nullable
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.google.gson.Gson
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  ru.tvrain.core.data.OnesignalTags
 *  ru.tvrain.core.data.UserInfo
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.analytics.tagmanager.TagManager
 *  tvrain.analytics.tagmanager.TagManagerUtils
 */
package com.hintsolutions.raintv.profile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.Gson;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.interfaces.OnFragmentInteractionListener;
import com.onesignal.OneSignal;
import ru.tvrain.core.data.OnesignalTags;
import ru.tvrain.core.data.UserInfo;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.analytics.tagmanager.TagManagerUtils;

public class LegacyProfileFragment
extends BaseFragment {
    private OnFragmentInteractionListener mListener;
    @BindView(value=2131296851)
    public RelativeLayout menuToggleHolder;
    @BindView(value=2131297172)
    public TextView subscription;
    @BindView(value=2131297237)
    public TextView title;

    public static /* synthetic */ void b(Throwable throwable) {
        LegacyProfileFragment.lambda$getUserInfo$1(throwable);
    }

    public static /* synthetic */ void c(LegacyProfileFragment legacyProfileFragment, View view) {
        legacyProfileFragment.lambda$onViewCreated$3(view);
    }

    public static /* synthetic */ void d(LegacyProfileFragment legacyProfileFragment, View view) {
        legacyProfileFragment.lambda$onViewCreated$2(view);
    }

    public static /* synthetic */ void e(UserInfo userInfo) {
        LegacyProfileFragment.lambda$getUserInfo$0(userInfo);
    }

    private void getUserInfo() {
        this.addSubscription(this.rainApi.getCurrentUser(this.getAuthorization()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new v1(17), (Action1)new v1(18)));
    }

    private static /* synthetic */ void lambda$getUserInfo$0(UserInfo userInfo) {
        if (userInfo.quickauth.booleanValue()) {
            OneSignal.sendTags(new Gson().toJson((Object)userInfo.onesignal_tags, OnesignalTags.class));
        }
    }

    private static /* synthetic */ void lambda$getUserInfo$1(Throwable throwable) {
    }

    private /* synthetic */ void lambda$onViewCreated$2(View object) {
        object = this.mListener;
        if (object != null) {
            object.onMenuClicked();
        }
    }

    private /* synthetic */ void lambda$onViewCreated$3(View view) {
        if (this.mListener != null) {
            TagManagerUtils.logPayWallClick((TagManager)this.activityInterface.getTagManager(), (String)"\u0448\u0430\u043f\u043a\u0430 \u0432 \u043f\u0440\u043e\u0444\u0438\u043b\u0435");
            this.mListener.onSubscriptionClicked();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            OnFragmentInteractionListener onFragmentInteractionListener;
            this.mListener = onFragmentInteractionListener = (OnFragmentInteractionListener)context;
            onFragmentInteractionListener.confirmSubscriptions();
            return;
        }
        catch (ClassCastException classCastException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.toString());
            stringBuilder.append(" must implement OnFragmentInteractionListener");
            throw new ClassCastException(stringBuilder.toString());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492978, viewGroup, false);
        this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        this.getUserInfo();
        this.activityInterface.getTagManager().logOpenView("Profile");
        this.title.setText(2131755507);
        return layoutInflater;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.mListener = null;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.menuToggleHolder.setOnClickListener((View.OnClickListener)new n2(this, 0));
        this.subscription.setOnClickListener((View.OnClickListener)new n2(this, 1));
    }
}


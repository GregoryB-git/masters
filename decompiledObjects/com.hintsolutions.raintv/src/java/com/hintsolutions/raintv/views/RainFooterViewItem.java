/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  butterknife.ButterKnife
 *  butterknife.OnClick
 *  butterknife.Optional
 *  com.google.firebase.crashlytics.FirebaseCrashlytics
 *  com.hintsolutions.raintv.common.BaseActivity
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.hintsolutions.raintv.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.interfaces.AdapterViewItem;

public class RainFooterViewItem
implements AdapterViewItem {
    private Context mContext;
    private View mFooter;
    private int topPadding = 0;

    public RainFooterViewItem(Context context) {
        this.mContext = context;
    }

    public int getBottom() {
        View view = this.mFooter;
        int n = view != null ? view.getBottom() : 0;
        return n;
    }

    public int getTopPadding() {
        View view = this.mFooter;
        int n = view != null ? view.getPaddingTop() : 0;
        return n;
    }

    @Override
    public View getView(ViewGroup viewGroup) {
        viewGroup = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2131492964, viewGroup, false);
        this.mFooter = viewGroup;
        ButterKnife.bind((Object)this, (View)viewGroup);
        this.mFooter.setPadding(0, this.topPadding, 0, 0);
        return this.mFooter;
    }

    @OnClick(value={2131296617})
    @Optional
    public void openRainFacebook() {
        try {
            Uri uri = Uri.parse((String)"https://www.facebook.com/tvrain");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (intent.resolveActivity(this.mContext.getPackageManager()) != null) {
                this.mContext.startActivity(intent);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            FirebaseCrashlytics.getInstance().recordException((Throwable)exception);
        }
    }

    @OnClick(value={2131297297})
    @Optional
    public void openRainTwitter() {
        try {
            Uri uri = Uri.parse((String)"https://twitter.com/tvrain");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (intent.resolveActivity(this.mContext.getPackageManager()) != null) {
                this.mContext.startActivity(intent);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            FirebaseCrashlytics.getInstance().recordException((Throwable)exception);
        }
    }

    @OnClick(value={2131297341})
    @Optional
    public void openRainVk() {
        try {
            Uri uri = Uri.parse((String)"http://vk.com/tvrain");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (intent.resolveActivity(this.mContext.getPackageManager()) != null) {
                this.mContext.startActivity(intent);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            FirebaseCrashlytics.getInstance().recordException((Throwable)exception);
        }
    }

    @OnClick(value={2131297361})
    @Optional
    public void openRainYoutube() {
        try {
            Uri uri = Uri.parse((String)"http://www.youtube.com/user/tvrainru");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (intent.resolveActivity(this.mContext.getPackageManager()) != null) {
                this.mContext.startActivity(intent);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            FirebaseCrashlytics.getInstance().recordException((Throwable)exception);
        }
    }

    public void setTopPadding(int n) {
        this.topPadding = n;
    }

    @OnClick(value={2131296370})
    @Optional
    public void startAudioLiveActivity() {
        ((BaseActivity)this.mContext).startAudioLiveActivity();
    }
}


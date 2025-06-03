/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.webkit.WebView
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  butterknife.BindView
 *  butterknife.OnClick
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  ru.tvrain.core.data.Offerta
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package com.hintsolutions.raintv.subscriptions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.subscriptions.PurchaseInfoActivity;
import ru.tvrain.core.data.Offerta;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class AgreementActivity
extends BaseActivity {
    public static final String WITH_ACCEPT_BUTTON = "withAcceptButton";
    @BindView(value=2131296349)
    public Button acceptButton;
    @BindView(value=2131297034)
    public FrameLayout mProgressFrame;
    @BindView(value=2131296348)
    public WebView webView;

    public static /* synthetic */ void A(AgreementActivity agreementActivity, Offerta offerta) {
        agreementActivity.lambda$loadOferta$0(offerta);
    }

    private /* synthetic */ void lambda$loadOferta$0(Offerta offerta) {
        this.hideProgress();
        this.updateWebView(offerta.text);
    }

    private /* synthetic */ void lambda$loadOferta$1(Throwable throwable) {
        this.hideProgress();
    }

    private void loadOferta() {
        this.showProgress();
        this.addSubscription(this.rainApi.getOferta().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new i(this, 0), (Action1)new i(this, 1)));
    }

    private void setAgreementApplied() {
        this.cache.putBoolean("agreement_accepted", true);
    }

    private void updateWebView(String string) {
        string = z2.p("<!doctype html>\n<html>\n<head>\n    <meta name=\"viewport\" content=\"width=device-width\">\n</head>\n<body>", string, "</body></html>");
        this.webView.setInitialScale(1);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setLoadWithOverviewMode(true);
        this.webView.getSettings().setUseWideViewPort(true);
        this.webView.getSettings().setDefaultTextEncodingName("utf-8");
        this.webView.loadDataWithBaseURL("https://tvrain.tv/", string, "text/html", "utf-8", null);
    }

    public static /* synthetic */ void z(AgreementActivity agreementActivity, Throwable throwable) {
        agreementActivity.lambda$loadOferta$1(throwable);
    }

    @Override
    public int getLayoutResource() {
        return 2131492892;
    }

    public void hideProgress() {
        this.mProgressFrame.setVisibility(8);
    }

    @OnClick(value={2131296349})
    public void onAgreeClick() {
        this.setAgreementApplied();
        this.startActivity(new Intent((Context)this, PurchaseInfoActivity.class));
        this.finish();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.getIntent().getBooleanExtra(WITH_ACCEPT_BUTTON, false)) {
            this.acceptButton.setVisibility(8);
        }
        this.loadOferta();
    }

    public void showProgress() {
        this.mProgressFrame.setVisibility(0);
    }
}


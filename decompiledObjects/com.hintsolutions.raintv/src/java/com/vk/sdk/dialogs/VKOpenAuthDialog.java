/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.view.View
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.vk.sdk.api.VKError
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package com.vk.sdk.dialogs;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.sdk.R;
import com.vk.sdk.VKServiceActivity;
import com.vk.sdk.api.VKError;
import com.vk.sdk.util.VKUtil;
import java.util.Locale;

public class VKOpenAuthDialog
implements DialogInterface.OnDismissListener {
    private static final String CANCEL = "cancel";
    private static final String ERROR = "error";
    private static final String REDIRECT_URL = "https://oauth.vk.com/blank.html";
    public static final String VK_EXTRA_API_VERSION = "version";
    public static final String VK_EXTRA_CLIENT_ID = "client_id";
    public static final String VK_EXTRA_REVOKE = "revoke";
    public static final String VK_EXTRA_SCOPE = "scope";
    public static final String VK_EXTRA_TOKEN_DATA = "extra-token-data";
    public static final String VK_EXTRA_VALIDATION_REQUEST = "extra-validation-request";
    public static final String VK_RESULT_INTENT_NAME = "com.vk.auth-token";
    public Bundle mBundle;
    public Intent mData;
    public Dialog mDialog;
    public View mProgress;
    public int mReqCode;
    public int mResCode = -1;
    public View mView;
    @Nullable
    public VKError mVkError;
    public WebView mWebView;

    private void finish() {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"SetJavaScriptEnabled"})
    private void loadPage() {
        try {
            void var5_12;
            WebView webView;
            void var4_4;
            VKError vKError = this.mVkError;
            if (vKError == null) {
                Object var4_2 = null;
            } else {
                String string2 = vKError.redirectUri;
            }
            void var5_9 = var4_4;
            if (var4_4 == null) {
                int n = this.mBundle.getInt(VK_EXTRA_CLIENT_ID, 0);
                String string3 = this.mBundle.getString(VK_EXTRA_SCOPE);
                String string4 = this.mBundle.getString(VK_EXTRA_API_VERSION);
                boolean bl = this.mBundle.getBoolean(VK_EXTRA_REVOKE, false);
                webView = Locale.US;
                int n3 = bl ? 1 : 0;
                String string5 = String.format((Locale)webView, (String)"https://oauth.vk.com/authorize?client_id=%s&scope=%s&redirect_uri=%s&display=mobile&v=%s&response_type=token&revoke=%d", (Object[])new Object[]{n, string3, REDIRECT_URL, string4, n3});
            }
            webView = this.mWebView;
            OAuthWebViewClient oAuthWebViewClient = new OAuthWebViewClient(this);
            webView.setWebViewClient((WebViewClient)oAuthWebViewClient);
            this.mWebView.getSettings().setJavaScriptEnabled(true);
            this.mWebView.loadUrl((String)var5_12);
            this.mWebView.setBackgroundColor(0);
            this.mWebView.setLayerType(1, null);
            this.mWebView.setVerticalScrollBarEnabled(false);
            this.mWebView.setVisibility(4);
            this.mWebView.setOverScrollMode(2);
            this.mProgress.setVisibility(0);
            return;
        }
        catch (Exception exception) {
            this.setResult(0);
            this.finish();
        }
    }

    private void setResult(int n) {
        this.mResCode = n;
    }

    private void setResult(int n, Intent intent) {
        this.mResCode = n;
        this.mData = intent;
    }

    public void onDismiss(DialogInterface object) {
        object = this.mView;
        object = object == null ? null : (Activity)object.getContext();
        if (object instanceof VKServiceActivity) {
            ((VKServiceActivity)((Object)object)).onActivityResultPublic(this.mReqCode, this.mResCode, this.mData);
        }
    }

    public void show(@NonNull Activity activity, Bundle bundle, int n, @Nullable VKError vKError) {
        this.mVkError = vKError;
        this.mBundle = bundle;
        this.mReqCode = n;
        bundle = View.inflate((Context)activity, (int)R.layout.vk_open_auth_dialog, null);
        this.mView = bundle;
        this.mProgress = bundle.findViewById(R.id.progress);
        this.mWebView = (WebView)this.mView.findViewById(R.id.copyUrl);
        activity = new Dialog((Context)activity, R.style.VKAlertDialog);
        activity.setContentView(this.mView);
        activity.setOnCancelListener(new DialogInterface.OnCancelListener(this, (Dialog)activity){
            public final VKOpenAuthDialog this$0;
            public final Dialog val$dialog;
            {
                this.this$0 = vKOpenAuthDialog;
                this.val$dialog = dialog;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.val$dialog.dismiss();
            }
        });
        activity.setOnDismissListener((DialogInterface.OnDismissListener)this);
        activity.getWindow().setStatusBarColor(0);
        this.mDialog = activity;
        activity.show();
        this.loadPage();
    }

    public static class OAuthWebViewClient
    extends WebViewClient {
        public boolean canShowPage = true;
        @NonNull
        public final VKOpenAuthDialog vkOpenAuthDialog;

        public OAuthWebViewClient(@NonNull VKOpenAuthDialog vKOpenAuthDialog) {
            this.vkOpenAuthDialog = vKOpenAuthDialog;
        }

        public void onPageFinished(WebView webView, String string2) {
            super.onPageFinished(webView, string2);
            if (this.canShowPage) {
                string2 = this.vkOpenAuthDialog.mProgress;
                if (string2 != null) {
                    string2.setVisibility(8);
                }
                webView.setVisibility(0);
            }
        }

        public void onPageStarted(WebView webView, String string2, Bitmap bitmap) {
            super.onPageStarted(webView, string2, bitmap);
            this.processUrl(string2);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void onReceivedError(WebView webView, int n, String string2, String string3) {
            super.onReceivedError(webView, n, string2, string3);
            this.canShowPage = false;
            webView = new AlertDialog.Builder(webView.getContext()).setMessage((CharSequence)string2).setPositiveButton(R.string.vk_retry, new DialogInterface.OnClickListener(this){
                public final OAuthWebViewClient this$0;
                {
                    this.this$0 = oAuthWebViewClient;
                }

                public void onClick(DialogInterface dialogInterface, int n) {
                    this.this$0.vkOpenAuthDialog.loadPage();
                }
            }).setNegativeButton(0x1040000, new DialogInterface.OnClickListener(this){
                public final OAuthWebViewClient this$0;
                {
                    this.this$0 = oAuthWebViewClient;
                }

                public void onClick(DialogInterface dialogInterface, int n) {
                    this.this$0.vkOpenAuthDialog.finish();
                }
            });
            try {
                webView.show();
                return;
            }
            catch (Exception exception) {
                return;
            }
        }

        public boolean processUrl(String map) {
            if (map.startsWith(VKOpenAuthDialog.REDIRECT_URL)) {
                Intent intent = new Intent(VKOpenAuthDialog.VK_RESULT_INTENT_NAME);
                map = map.substring(map.indexOf(35) + 1);
                intent.putExtra(VKOpenAuthDialog.VK_EXTRA_TOKEN_DATA, (String)map);
                map = VKUtil.explodeQueryString((String)map);
                VKError vKError = this.vkOpenAuthDialog.mVkError;
                if (vKError != null) {
                    intent.putExtra(VKOpenAuthDialog.VK_EXTRA_VALIDATION_REQUEST, vKError.request.registerObject());
                }
                if (map != null && (map.containsKey((Object)VKOpenAuthDialog.ERROR) || map.containsKey((Object)VKOpenAuthDialog.CANCEL))) {
                    this.vkOpenAuthDialog.setResult(0, intent);
                } else {
                    this.vkOpenAuthDialog.setResult(-1, intent);
                }
                this.vkOpenAuthDialog.finish();
                return true;
            }
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
            if (this.processUrl(string2)) {
                return true;
            }
            this.canShowPage = true;
            return false;
        }
    }
}


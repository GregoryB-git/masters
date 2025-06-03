/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 *  androidx.annotation.CallSuper
 *  androidx.annotation.UiThread
 *  butterknife.Unbinder
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.profile;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.profile.WebViewActivity;

public class WebViewActivity_ViewBinding
implements Unbinder {
    private WebViewActivity target;

    @UiThread
    public WebViewActivity_ViewBinding(WebViewActivity webViewActivity) {
        this(webViewActivity, webViewActivity.getWindow().getDecorView());
    }

    @UiThread
    public WebViewActivity_ViewBinding(WebViewActivity webViewActivity, View view) {
        this.target = webViewActivity;
        webViewActivity.authWebView = (WebView)Utils.findRequiredViewAsType((View)view, (int)2131296373, (String)"field 'authWebView'", WebView.class);
    }

    @CallSuper
    public void unbind() {
        WebViewActivity webViewActivity = this.target;
        if (webViewActivity != null) {
            this.target = null;
            webViewActivity.authWebView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}


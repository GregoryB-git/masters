/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 *  android.widget.ProgressBar
 *  androidx.annotation.UiThread
 *  androidx.appcompat.widget.Toolbar
 *  butterknife.internal.Utils
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.common;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.internal.Utils;
import com.hintsolutions.raintv.common.BaseActivity_ViewBinding;
import com.hintsolutions.raintv.common.WebViewActivity;

public class WebViewActivity_ViewBinding
extends BaseActivity_ViewBinding {
    private WebViewActivity target;

    @UiThread
    public WebViewActivity_ViewBinding(WebViewActivity webViewActivity) {
        this(webViewActivity, webViewActivity.getWindow().getDecorView());
    }

    @UiThread
    public WebViewActivity_ViewBinding(WebViewActivity webViewActivity, View view) {
        super(webViewActivity, view);
        this.target = webViewActivity;
        webViewActivity.toolbar = (Toolbar)Utils.findRequiredViewAsType((View)view, (int)2131297244, (String)"field 'toolbar'", Toolbar.class);
        webViewActivity.webView = (WebView)Utils.findRequiredViewAsType((View)view, (int)2131297346, (String)"field 'webView'", WebView.class);
        webViewActivity.horizontalProgressBar = (ProgressBar)Utils.findRequiredViewAsType((View)view, (int)2131296679, (String)"field 'horizontalProgressBar'", ProgressBar.class);
    }

    @Override
    public void unbind() {
        WebViewActivity webViewActivity = this.target;
        if (webViewActivity != null) {
            this.target = null;
            webViewActivity.toolbar = null;
            webViewActivity.webView = null;
            webViewActivity.horizontalProgressBar = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}


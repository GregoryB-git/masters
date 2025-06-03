/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.webkit.WebView
 *  java.lang.Object
 */
package com.vk.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class WebView
extends android.webkit.WebView {
    public WebView(Context context) {
        super(context);
    }

    public WebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WebView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebView webView = this;
        while (webView.getParent() instanceof View) {
            webView = (View)webView.getParent();
            webView.setBackgroundColor(0);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.RelativeLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ActivityWebViewBinding
implements ViewBinding {
    @NonNull
    public final WebView authWebView;
    @NonNull
    private final RelativeLayout rootView;

    private ActivityWebViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull WebView webView) {
        this.rootView = relativeLayout;
        this.authWebView = webView;
    }

    @NonNull
    public static ActivityWebViewBinding bind(@NonNull View view) {
        WebView webView = (WebView)ViewBindings.findChildViewById((View)view, (int)2131296373);
        if (webView != null) {
            return new ActivityWebViewBinding((RelativeLayout)view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131296373)));
    }

    @NonNull
    public static ActivityWebViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityWebViewBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWebViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492915, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityWebViewBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
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
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ActivityWebViewCommonBinding
implements ViewBinding {
    @NonNull
    public final ProgressBar horizontalProgressBar;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final WebView webView;

    private ActivityWebViewCommonBinding(@NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull Toolbar toolbar, @NonNull WebView webView) {
        this.rootView = linearLayout;
        this.horizontalProgressBar = progressBar;
        this.toolbar = toolbar;
        this.webView = webView;
    }

    @NonNull
    public static ActivityWebViewCommonBinding bind(@NonNull View view) {
        int n = 2131296679;
        ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById((View)view, (int)2131296679);
        if (progressBar != null) {
            n = 2131297244;
            Toolbar toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)2131297244);
            if (toolbar != null) {
                n = 2131297346;
                WebView webView = (WebView)ViewBindings.findChildViewById((View)view, (int)2131297346);
                if (webView != null) {
                    return new ActivityWebViewCommonBinding((LinearLayout)view, progressBar, toolbar, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityWebViewCommonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityWebViewCommonBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWebViewCommonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492916, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityWebViewCommonBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


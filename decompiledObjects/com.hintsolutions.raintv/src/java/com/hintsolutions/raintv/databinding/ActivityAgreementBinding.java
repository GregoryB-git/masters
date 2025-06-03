/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
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
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.ToolbarBinding;

public final class ActivityAgreementBinding
implements ViewBinding {
    @NonNull
    public final WebView agreement;
    @NonNull
    public final Button agreementAgree;
    @NonNull
    public final FrameLayout progressFrame;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ToolbarBinding toolbar;

    private ActivityAgreementBinding(@NonNull LinearLayout linearLayout, @NonNull WebView webView, @NonNull Button button, @NonNull FrameLayout frameLayout, @NonNull ToolbarBinding toolbarBinding) {
        this.rootView = linearLayout;
        this.agreement = webView;
        this.agreementAgree = button;
        this.progressFrame = frameLayout;
        this.toolbar = toolbarBinding;
    }

    @NonNull
    public static ActivityAgreementBinding bind(@NonNull View view) {
        int n = 2131296348;
        WebView webView = (WebView)ViewBindings.findChildViewById((View)view, (int)2131296348);
        if (webView != null) {
            n = 2131296349;
            Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296349);
            if (button != null) {
                n = 2131297034;
                FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131297034);
                if (frameLayout != null) {
                    n = 2131297244;
                    Object object = ViewBindings.findChildViewById((View)view, (int)2131297244);
                    if (object != null) {
                        object = ToolbarBinding.bind(object);
                        return new ActivityAgreementBinding((LinearLayout)view, webView, button, frameLayout, (ToolbarBinding)object);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityAgreementBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityAgreementBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAgreementBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492892, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityAgreementBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


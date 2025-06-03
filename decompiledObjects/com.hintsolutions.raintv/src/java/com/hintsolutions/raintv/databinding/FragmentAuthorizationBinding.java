/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.appbar.AppBarLayout
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;

public final class FragmentAuthorizationBinding
implements ViewBinding {
    @NonNull
    public final AppBarLayout appBar;
    @NonNull
    public final TextView appVersion2;
    @NonNull
    public final Button authorization;
    @NonNull
    public final Button registration;
    @NonNull
    private final LinearLayout rootView;

    private FragmentAuthorizationBinding(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2) {
        this.rootView = linearLayout;
        this.appBar = appBarLayout;
        this.appVersion2 = textView;
        this.authorization = button;
        this.registration = button2;
    }

    @NonNull
    public static FragmentAuthorizationBinding bind(@NonNull View view) {
        int n = 2131296360;
        AppBarLayout appBarLayout = (AppBarLayout)ViewBindings.findChildViewById((View)view, (int)2131296360);
        if (appBarLayout != null) {
            n = 2131296364;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296364);
            if (textView != null) {
                n = 2131296375;
                Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296375);
                if (button != null) {
                    n = 2131297053;
                    Button button2 = (Button)ViewBindings.findChildViewById((View)view, (int)2131297053);
                    if (button2 != null) {
                        return new FragmentAuthorizationBinding((LinearLayout)view, appBarLayout, textView, button, button2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FragmentAuthorizationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentAuthorizationBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentAuthorizationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492967, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAuthorizationBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class SubscriptionBinding
implements ViewBinding {
    @NonNull
    private final View rootView;
    @NonNull
    public final TextView subscription;

    private SubscriptionBinding(@NonNull View view, @NonNull TextView textView) {
        this.rootView = view;
        this.subscription = textView;
    }

    @NonNull
    public static SubscriptionBinding bind(@NonNull View view) {
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297172);
        if (textView != null) {
            return new SubscriptionBinding(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131297172)));
    }

    @NonNull
    public static SubscriptionBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(2131493153, viewGroup);
            return SubscriptionBinding.bind((View)viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}


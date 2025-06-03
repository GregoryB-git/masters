/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class DialogRateAppBinding
implements ViewBinding {
    @NonNull
    public final Button cancelButton;
    @NonNull
    public final ImageView closeButton;
    @NonNull
    public final Button rateButton;
    @NonNull
    public final Button rateLaterButton;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final TextView textView;

    private DialogRateAppBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull Button button2, @NonNull Button button3, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.cancelButton = button;
        this.closeButton = imageView;
        this.rateButton = button2;
        this.rateLaterButton = button3;
        this.textView = textView;
    }

    @NonNull
    public static DialogRateAppBinding bind(@NonNull View view) {
        int n = 2131296425;
        Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296425);
        if (button != null) {
            n = 2131296483;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296483);
            if (imageView != null) {
                n = 2131297041;
                Button button2 = (Button)ViewBindings.findChildViewById((View)view, (int)2131297041);
                if (button2 != null) {
                    n = 2131297042;
                    Button button3 = (Button)ViewBindings.findChildViewById((View)view, (int)2131297042);
                    if (button3 != null) {
                        n = 2131297210;
                        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297210);
                        if (textView != null) {
                            return new DialogRateAppBinding((RelativeLayout)view, button, imageView, button2, button3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static DialogRateAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return DialogRateAppBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogRateAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492952, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogRateAppBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


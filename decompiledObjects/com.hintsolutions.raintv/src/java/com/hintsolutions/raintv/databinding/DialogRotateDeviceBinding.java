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

public final class DialogRotateDeviceBinding
implements ViewBinding {
    @NonNull
    public final ImageView closeButton;
    @NonNull
    public final Button continueButton;
    @NonNull
    public final Button instructionButton;
    @NonNull
    public final ImageView logo;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final TextView textView;

    private DialogRotateDeviceBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull Button button2, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.closeButton = imageView;
        this.continueButton = button;
        this.instructionButton = button2;
        this.logo = imageView2;
        this.textView = textView;
    }

    @NonNull
    public static DialogRotateDeviceBinding bind(@NonNull View view) {
        int n = 2131296483;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296483);
        if (imageView != null) {
            n = 2131296510;
            Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296510);
            if (button != null) {
                n = 2131296713;
                Button button2 = (Button)ViewBindings.findChildViewById((View)view, (int)2131296713);
                if (button2 != null) {
                    n = 2131296759;
                    ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296759);
                    if (imageView2 != null) {
                        n = 2131297210;
                        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297210);
                        if (textView != null) {
                            return new DialogRotateDeviceBinding((RelativeLayout)view, imageView, button, button2, imageView2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static DialogRotateDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return DialogRotateDeviceBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogRotateDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492953, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogRotateDeviceBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


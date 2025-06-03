/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ViewScheduleControllerBinding
implements ViewBinding {
    @NonNull
    public final TextView date;
    @NonNull
    public final ImageButton nextDate;
    @NonNull
    public final ImageButton prevDate;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final LinearLayout scheduleController;

    private ViewScheduleControllerBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.date = textView;
        this.nextDate = imageButton;
        this.prevDate = imageButton2;
        this.scheduleController = linearLayout2;
    }

    @NonNull
    public static ViewScheduleControllerBinding bind(@NonNull View view) {
        int n = 2131296527;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296527);
        if (textView != null) {
            n = 2131296963;
            ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131296963);
            if (imageButton != null) {
                n = 2131297020;
                ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131297020);
                if (imageButton2 != null) {
                    view = (LinearLayout)view;
                    return new ViewScheduleControllerBinding((LinearLayout)view, textView, imageButton, imageButton2, (LinearLayout)view);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ViewScheduleControllerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ViewScheduleControllerBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewScheduleControllerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493198, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewScheduleControllerBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


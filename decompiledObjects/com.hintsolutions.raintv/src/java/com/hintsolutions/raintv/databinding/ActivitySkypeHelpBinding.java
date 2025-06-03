/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.RelativeLayout
 *  android.widget.Spinner
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.floatingactionbutton.FloatingActionButton
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class ActivitySkypeHelpBinding
implements ViewBinding {
    @NonNull
    public final TextView contentTextView;
    @NonNull
    public final Spinner daySpinner;
    @NonNull
    public final FloatingActionButton floatingButton;
    @NonNull
    public final EditText loginEditText;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final Spinner timeSpinner;
    @NonNull
    public final Toolbar toolbar;

    private ActivitySkypeHelpBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull Spinner spinner, @NonNull FloatingActionButton floatingActionButton, @NonNull EditText editText, @NonNull Spinner spinner2, @NonNull Toolbar toolbar) {
        this.rootView = relativeLayout;
        this.contentTextView = textView;
        this.daySpinner = spinner;
        this.floatingButton = floatingActionButton;
        this.loginEditText = editText;
        this.timeSpinner = spinner2;
        this.toolbar = toolbar;
    }

    @NonNull
    public static ActivitySkypeHelpBinding bind(@NonNull View view) {
        int n = 2131296506;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296506);
        if (textView != null) {
            n = 2131296529;
            Spinner spinner = (Spinner)ViewBindings.findChildViewById((View)view, (int)2131296529);
            if (spinner != null) {
                n = 2131296639;
                FloatingActionButton floatingActionButton = (FloatingActionButton)ViewBindings.findChildViewById((View)view, (int)2131296639);
                if (floatingActionButton != null) {
                    n = 2131296758;
                    EditText editText = (EditText)ViewBindings.findChildViewById((View)view, (int)2131296758);
                    if (editText != null) {
                        n = 2131297235;
                        Spinner spinner2 = (Spinner)ViewBindings.findChildViewById((View)view, (int)2131297235);
                        if (spinner2 != null) {
                            n = 2131297244;
                            Toolbar toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)2131297244);
                            if (toolbar != null) {
                                return new ActivitySkypeHelpBinding((RelativeLayout)view, textView, spinner, floatingActionButton, editText, spinner2, toolbar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivitySkypeHelpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivitySkypeHelpBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySkypeHelpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492911, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivitySkypeHelpBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


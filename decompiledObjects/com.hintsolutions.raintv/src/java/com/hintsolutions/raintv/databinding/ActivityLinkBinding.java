/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
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
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.ToolbarBinding;

public final class ActivityLinkBinding
implements ViewBinding {
    @NonNull
    public final Button authorization;
    @NonNull
    public final Button later;
    @NonNull
    public final Button registration;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ToolbarBinding toolbar;

    private ActivityLinkBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull ToolbarBinding toolbarBinding) {
        this.rootView = linearLayout;
        this.authorization = button;
        this.later = button2;
        this.registration = button3;
        this.toolbar = toolbarBinding;
    }

    @NonNull
    public static ActivityLinkBinding bind(@NonNull View view) {
        int n = 2131296375;
        Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296375);
        if (button != null) {
            n = 2131296728;
            Button button2 = (Button)ViewBindings.findChildViewById((View)view, (int)2131296728);
            if (button2 != null) {
                n = 2131297053;
                Button button3 = (Button)ViewBindings.findChildViewById((View)view, (int)2131297053);
                if (button3 != null) {
                    n = 2131297244;
                    Object object = ViewBindings.findChildViewById((View)view, (int)2131297244);
                    if (object != null) {
                        object = ToolbarBinding.bind(object);
                        return new ActivityLinkBinding((LinearLayout)view, button, button2, button3, (ToolbarBinding)object);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityLinkBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityLinkBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityLinkBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492898, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityLinkBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


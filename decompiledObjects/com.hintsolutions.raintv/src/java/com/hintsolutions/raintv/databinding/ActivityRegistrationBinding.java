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
 *  com.rengwuxian.materialedittext.MaterialEditText
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
import com.rengwuxian.materialedittext.MaterialEditText;

public final class ActivityRegistrationBinding
implements ViewBinding {
    @NonNull
    public final MaterialEditText email;
    @NonNull
    public final MaterialEditText firstname;
    @NonNull
    public final MaterialEditText password1;
    @NonNull
    public final MaterialEditText password2;
    @NonNull
    public final Button registration;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ToolbarBinding toolbar;

    private ActivityRegistrationBinding(@NonNull LinearLayout linearLayout, @NonNull MaterialEditText materialEditText, @NonNull MaterialEditText materialEditText2, @NonNull MaterialEditText materialEditText3, @NonNull MaterialEditText materialEditText4, @NonNull Button button, @NonNull ToolbarBinding toolbarBinding) {
        this.rootView = linearLayout;
        this.email = materialEditText;
        this.firstname = materialEditText2;
        this.password1 = materialEditText3;
        this.password2 = materialEditText4;
        this.registration = button;
        this.toolbar = toolbarBinding;
    }

    @NonNull
    public static ActivityRegistrationBinding bind(@NonNull View view) {
        int n = 2131296580;
        MaterialEditText materialEditText = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296580);
        if (materialEditText != null) {
            n = 2131296629;
            MaterialEditText materialEditText2 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296629);
            if (materialEditText2 != null) {
                n = 2131296998;
                MaterialEditText materialEditText3 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296998);
                if (materialEditText3 != null) {
                    n = 2131296999;
                    MaterialEditText materialEditText4 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296999);
                    if (materialEditText4 != null) {
                        n = 2131297053;
                        Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131297053);
                        if (button != null) {
                            n = 2131297244;
                            Object object = ViewBindings.findChildViewById((View)view, (int)2131297244);
                            if (object != null) {
                                object = ToolbarBinding.bind(object);
                                return new ActivityRegistrationBinding((LinearLayout)view, materialEditText, materialEditText2, materialEditText3, materialEditText4, button, (ToolbarBinding)object);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityRegistrationBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492907, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityRegistrationBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


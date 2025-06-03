/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageButton
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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.ToolbarBinding;
import com.rengwuxian.materialedittext.MaterialEditText;

public final class ActivityAuthorizationBinding
implements ViewBinding {
    @NonNull
    public final MaterialEditText email;
    @NonNull
    public final ImageButton facebook;
    @NonNull
    public final ImageButton google;
    @NonNull
    public final Button login;
    @NonNull
    public final MaterialEditText password;
    @NonNull
    public final LinearLayout recovery;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ToolbarBinding toolbar;
    @NonNull
    public final ImageButton twitter;

    private ActivityAuthorizationBinding(@NonNull LinearLayout linearLayout, @NonNull MaterialEditText materialEditText, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull Button button, @NonNull MaterialEditText materialEditText2, @NonNull LinearLayout linearLayout2, @NonNull ToolbarBinding toolbarBinding, @NonNull ImageButton imageButton3) {
        this.rootView = linearLayout;
        this.email = materialEditText;
        this.facebook = imageButton;
        this.google = imageButton2;
        this.login = button;
        this.password = materialEditText2;
        this.recovery = linearLayout2;
        this.toolbar = toolbarBinding;
        this.twitter = imageButton3;
    }

    @NonNull
    public static ActivityAuthorizationBinding bind(@NonNull View view) {
        int n = 2131296580;
        MaterialEditText materialEditText = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296580);
        if (materialEditText != null) {
            n = 2131296617;
            ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131296617);
            if (imageButton != null) {
                n = 2131296660;
                ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131296660);
                if (imageButton2 != null) {
                    n = 2131296757;
                    Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296757);
                    if (button != null) {
                        n = 2131296997;
                        MaterialEditText materialEditText2 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296997);
                        if (materialEditText2 != null) {
                            n = 2131297049;
                            LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297049);
                            if (linearLayout != null) {
                                n = 2131297244;
                                View view2 = ViewBindings.findChildViewById((View)view, (int)2131297244);
                                if (view2 != null) {
                                    ToolbarBinding toolbarBinding = ToolbarBinding.bind(view2);
                                    n = 2131297297;
                                    view2 = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131297297);
                                    if (view2 != null) {
                                        return new ActivityAuthorizationBinding((LinearLayout)view, materialEditText, imageButton, imageButton2, button, materialEditText2, linearLayout, toolbarBinding, (ImageButton)view2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityAuthorizationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityAuthorizationBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAuthorizationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492894, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityAuthorizationBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


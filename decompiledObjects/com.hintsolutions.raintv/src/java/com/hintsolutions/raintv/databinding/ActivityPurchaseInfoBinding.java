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

public final class ActivityPurchaseInfoBinding
implements ViewBinding {
    @NonNull
    public final MaterialEditText info;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final Button send;
    @NonNull
    public final ToolbarBinding toolbar;

    private ActivityPurchaseInfoBinding(@NonNull LinearLayout linearLayout, @NonNull MaterialEditText materialEditText, @NonNull Button button, @NonNull ToolbarBinding toolbarBinding) {
        this.rootView = linearLayout;
        this.info = materialEditText;
        this.send = button;
        this.toolbar = toolbarBinding;
    }

    @NonNull
    public static ActivityPurchaseInfoBinding bind(@NonNull View view) {
        int n = 2131296710;
        MaterialEditText materialEditText = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296710);
        if (materialEditText != null) {
            n = 2131297117;
            Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131297117);
            if (button != null) {
                n = 2131297244;
                Object object = ViewBindings.findChildViewById((View)view, (int)2131297244);
                if (object != null) {
                    object = ToolbarBinding.bind(object);
                    return new ActivityPurchaseInfoBinding((LinearLayout)view, materialEditText, button, (ToolbarBinding)object);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ActivityPurchaseInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityPurchaseInfoBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityPurchaseInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492905, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityPurchaseInfoBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


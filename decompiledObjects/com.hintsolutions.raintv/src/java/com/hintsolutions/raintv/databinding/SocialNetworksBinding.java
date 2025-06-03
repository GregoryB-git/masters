/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
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
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class SocialNetworksBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout facebook;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final LinearLayout twitter;
    @NonNull
    public final LinearLayout vk;
    @NonNull
    public final LinearLayout youtube;

    private SocialNetworksBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.facebook = linearLayout2;
        this.twitter = linearLayout3;
        this.vk = linearLayout4;
        this.youtube = linearLayout5;
    }

    @NonNull
    public static SocialNetworksBinding bind(@NonNull View view) {
        int n = 2131296617;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296617);
        if (linearLayout != null) {
            n = 2131297297;
            LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297297);
            if (linearLayout2 != null) {
                n = 2131297341;
                LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297341);
                if (linearLayout3 != null) {
                    n = 2131297361;
                    LinearLayout linearLayout4 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297361);
                    if (linearLayout4 != null) {
                        return new SocialNetworksBinding((LinearLayout)view, linearLayout, linearLayout2, linearLayout3, linearLayout4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static SocialNetworksBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return SocialNetworksBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SocialNetworksBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493151, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return SocialNetworksBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


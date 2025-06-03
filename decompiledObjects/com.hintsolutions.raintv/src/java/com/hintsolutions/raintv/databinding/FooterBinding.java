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
import com.hintsolutions.raintv.databinding.AudioBinding;
import com.hintsolutions.raintv.databinding.CopyrightBinding;
import com.hintsolutions.raintv.databinding.SocialNetworksBinding;

public final class FooterBinding
implements ViewBinding {
    @NonNull
    public final AudioBinding audio;
    @NonNull
    public final CopyrightBinding copyright;
    @NonNull
    public final LinearLayout layout;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final SocialNetworksBinding socialNetworks;

    private FooterBinding(@NonNull LinearLayout linearLayout, @NonNull AudioBinding audioBinding, @NonNull CopyrightBinding copyrightBinding, @NonNull LinearLayout linearLayout2, @NonNull SocialNetworksBinding socialNetworksBinding) {
        this.rootView = linearLayout;
        this.audio = audioBinding;
        this.copyright = copyrightBinding;
        this.layout = linearLayout2;
        this.socialNetworks = socialNetworksBinding;
    }

    @NonNull
    public static FooterBinding bind(@NonNull View view) {
        int n = 2131296370;
        Object object = ViewBindings.findChildViewById((View)view, (int)2131296370);
        if (object != null) {
            object = AudioBinding.bind(object);
            n = 2131296515;
            View view2 = ViewBindings.findChildViewById((View)view, (int)2131296515);
            if (view2 != null) {
                CopyrightBinding copyrightBinding = CopyrightBinding.bind(view2);
                LinearLayout linearLayout = (LinearLayout)view;
                n = 2131297142;
                view2 = ViewBindings.findChildViewById((View)view, (int)2131297142);
                if (view2 != null) {
                    return new FooterBinding(linearLayout, (AudioBinding)object, copyrightBinding, linearLayout, SocialNetworksBinding.bind(view2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static FooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FooterBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492964, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FooterBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


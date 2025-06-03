/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.hintsolutions.raintv.views.CustomFontTextView
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class NewslistSliderItemBinding
implements ViewBinding {
    @NonNull
    public final TextView date;
    @NonNull
    public final ImageView image;
    @NonNull
    public final FrameLayout imageLayout;
    @NonNull
    public final LinearLayout layout;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final CustomFontTextView text;
    @NonNull
    public final FrameLayout textLayout;

    private NewslistSliderItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull CustomFontTextView customFontTextView, @NonNull FrameLayout frameLayout2) {
        this.rootView = linearLayout;
        this.date = textView;
        this.image = imageView;
        this.imageLayout = frameLayout;
        this.layout = linearLayout2;
        this.text = customFontTextView;
        this.textLayout = frameLayout2;
    }

    @NonNull
    public static NewslistSliderItemBinding bind(@NonNull View view) {
        int n = 2131296527;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296527);
        if (textView != null) {
            n = 2131296689;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296689);
            if (imageView != null) {
                n = 2131296704;
                FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131296704);
                if (frameLayout != null) {
                    LinearLayout linearLayout = (LinearLayout)view;
                    n = 2131297202;
                    CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297202);
                    if (customFontTextView != null) {
                        n = 2131297224;
                        FrameLayout frameLayout2 = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131297224);
                        if (frameLayout2 != null) {
                            return new NewslistSliderItemBinding(linearLayout, textView, imageView, frameLayout, linearLayout, customFontTextView, frameLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static NewslistSliderItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return NewslistSliderItemBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NewslistSliderItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493115, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewslistSliderItemBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


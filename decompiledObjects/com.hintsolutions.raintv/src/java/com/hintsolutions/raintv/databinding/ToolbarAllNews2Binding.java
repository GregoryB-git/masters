/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class ToolbarAllNews2Binding
implements ViewBinding {
    @NonNull
    public final LinearLayout customToolbar;
    @NonNull
    public final ImageView imageView8;
    @NonNull
    public final RelativeLayout menuToggleHolder;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ImageView searchBtn;
    @NonNull
    public final TextView toggleBadgeTextView;
    @NonNull
    public final Button toolbarDonate;
    @NonNull
    public final CustomFontTextView toolbarTitle;

    private ToolbarAllNews2Binding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull Button button, @NonNull CustomFontTextView customFontTextView) {
        this.rootView = linearLayout;
        this.customToolbar = linearLayout2;
        this.imageView8 = imageView;
        this.menuToggleHolder = relativeLayout;
        this.searchBtn = imageView2;
        this.toggleBadgeTextView = textView;
        this.toolbarDonate = button;
        this.toolbarTitle = customFontTextView;
    }

    @NonNull
    public static ToolbarAllNews2Binding bind(@NonNull View view) {
        int n = 2131296524;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296524);
        if (linearLayout != null) {
            n = 2131296702;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296702);
            if (imageView != null) {
                n = 2131296851;
                RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296851);
                if (relativeLayout != null) {
                    n = 2131297091;
                    ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297091);
                    if (imageView2 != null) {
                        n = 2131297243;
                        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297243);
                        if (textView != null) {
                            n = 2131297245;
                            Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131297245);
                            if (button != null) {
                                n = 2131297246;
                                CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297246);
                                if (customFontTextView != null) {
                                    return new ToolbarAllNews2Binding((LinearLayout)view, linearLayout, imageView, relativeLayout, imageView2, textView, button, customFontTextView);
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
    public static ToolbarAllNews2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return ToolbarAllNews2Binding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ToolbarAllNews2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131493174, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarAllNews2Binding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


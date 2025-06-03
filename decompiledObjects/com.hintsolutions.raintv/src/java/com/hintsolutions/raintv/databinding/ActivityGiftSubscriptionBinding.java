/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.ToolbarBinding;

public final class ActivityGiftSubscriptionBinding
implements ViewBinding {
    @NonNull
    public final TextView boughtAmount;
    @NonNull
    public final TextView linkTextView;
    @NonNull
    public final TextView registeredAmount;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final Button share;
    @NonNull
    public final TextView textView20;
    @NonNull
    public final TextView textView21;
    @NonNull
    public final TextView textView22;
    @NonNull
    public final TextView textView23;
    @NonNull
    public final TextView textView25;
    @NonNull
    public final ToolbarBinding toolbar;

    private ActivityGiftSubscriptionBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Button button, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull ToolbarBinding toolbarBinding) {
        this.rootView = linearLayout;
        this.boughtAmount = textView;
        this.linkTextView = textView2;
        this.registeredAmount = textView3;
        this.share = button;
        this.textView20 = textView4;
        this.textView21 = textView5;
        this.textView22 = textView6;
        this.textView23 = textView7;
        this.textView25 = textView8;
        this.toolbar = toolbarBinding;
    }

    @NonNull
    public static ActivityGiftSubscriptionBinding bind(@NonNull View view) {
        int n = 2131296400;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296400);
        if (textView != null) {
            n = 2131296745;
            TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296745);
            if (textView2 != null) {
                n = 2131297052;
                TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297052);
                if (textView3 != null) {
                    n = 2131297121;
                    Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131297121);
                    if (button != null) {
                        n = 2131297213;
                        TextView textView4 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297213);
                        if (textView4 != null) {
                            n = 2131297214;
                            TextView textView5 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297214);
                            if (textView5 != null) {
                                n = 2131297215;
                                TextView textView6 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297215);
                                if (textView6 != null) {
                                    n = 2131297216;
                                    TextView textView7 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297216);
                                    if (textView7 != null) {
                                        n = 2131297217;
                                        TextView textView8 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297217);
                                        if (textView8 != null) {
                                            n = 2131297244;
                                            Object object = ViewBindings.findChildViewById((View)view, (int)2131297244);
                                            if (object != null) {
                                                object = ToolbarBinding.bind(object);
                                                return new ActivityGiftSubscriptionBinding((LinearLayout)view, textView, textView2, textView3, button, textView4, textView5, textView6, textView7, textView8, (ToolbarBinding)object);
                                            }
                                        }
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
    public static ActivityGiftSubscriptionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityGiftSubscriptionBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityGiftSubscriptionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492897, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityGiftSubscriptionBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


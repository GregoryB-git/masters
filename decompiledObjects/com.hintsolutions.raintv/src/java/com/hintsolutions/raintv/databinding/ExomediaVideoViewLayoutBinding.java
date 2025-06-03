/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewStub
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
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
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class ExomediaVideoViewLayoutBinding
implements ViewBinding {
    @NonNull
    public final ImageView exomediaVideoPreviewImage;
    @NonNull
    public final ImageView rewindBackAnim1;
    @NonNull
    public final ImageView rewindBackAnim2;
    @NonNull
    public final ImageView rewindBackAnim3;
    @NonNull
    public final TextView rewindBackDuration;
    @NonNull
    public final LinearLayout rewindBackLayout;
    @NonNull
    public final RelativeLayout rewindBackdrop;
    @NonNull
    public final ImageView rewindForwardAnim1;
    @NonNull
    public final ImageView rewindForwardAnim2;
    @NonNull
    public final ImageView rewindForwardAnim3;
    @NonNull
    public final TextView rewindForwardDuration;
    @NonNull
    public final LinearLayout rewindForwardLayout;
    @NonNull
    public final TextView rewindInfo;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final ViewStub videoViewApiImplStub;

    private ExomediaVideoViewLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull ViewStub viewStub) {
        this.rootView = relativeLayout;
        this.exomediaVideoPreviewImage = imageView;
        this.rewindBackAnim1 = imageView2;
        this.rewindBackAnim2 = imageView3;
        this.rewindBackAnim3 = imageView4;
        this.rewindBackDuration = textView;
        this.rewindBackLayout = linearLayout;
        this.rewindBackdrop = relativeLayout2;
        this.rewindForwardAnim1 = imageView5;
        this.rewindForwardAnim2 = imageView6;
        this.rewindForwardAnim3 = imageView7;
        this.rewindForwardDuration = textView2;
        this.rewindForwardLayout = linearLayout2;
        this.rewindInfo = textView3;
        this.videoViewApiImplStub = viewStub;
    }

    @NonNull
    public static ExomediaVideoViewLayoutBinding bind(@NonNull View view) {
        int n = 2131296612;
        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296612);
        if (imageView != null) {
            n = 2131297056;
            ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297056);
            if (imageView2 != null) {
                n = 2131297057;
                ImageView imageView3 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297057);
                if (imageView3 != null) {
                    n = 2131297058;
                    ImageView imageView4 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297058);
                    if (imageView4 != null) {
                        n = 2131297059;
                        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297059);
                        if (textView != null) {
                            n = 2131297060;
                            LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297060);
                            if (linearLayout != null) {
                                n = 2131297061;
                                RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297061);
                                if (relativeLayout != null) {
                                    n = 2131297062;
                                    ImageView imageView5 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297062);
                                    if (imageView5 != null) {
                                        n = 2131297063;
                                        ImageView imageView6 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297063);
                                        if (imageView6 != null) {
                                            n = 2131297064;
                                            ImageView imageView7 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297064);
                                            if (imageView7 != null) {
                                                n = 2131297065;
                                                TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297065);
                                                if (textView2 != null) {
                                                    n = 2131297066;
                                                    LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297066);
                                                    if (linearLayout2 != null) {
                                                        n = 2131297067;
                                                        TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297067);
                                                        if (textView3 != null) {
                                                            n = 2131297322;
                                                            ViewStub viewStub = (ViewStub)ViewBindings.findChildViewById((View)view, (int)2131297322);
                                                            if (viewStub != null) {
                                                                return new ExomediaVideoViewLayoutBinding((RelativeLayout)view, imageView, imageView2, imageView3, imageView4, textView, linearLayout, relativeLayout, imageView5, imageView6, imageView7, textView2, linearLayout2, textView3, viewStub);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    @NonNull
    public static ExomediaVideoViewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ExomediaVideoViewLayoutBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ExomediaVideoViewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492963, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExomediaVideoViewLayoutBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}


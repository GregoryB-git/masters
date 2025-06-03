/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.appbar.AppBarLayout
 *  java.lang.NullPointerException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;

public final class ActivityProfileBinding
implements ViewBinding {
    @NonNull
    public final TextView about;
    @NonNull
    public final AppBarLayout appBarLayout;
    @NonNull
    public final ImageView avatar;
    @NonNull
    public final TextView description;
    @NonNull
    public final RelativeLayout facebookLayout;
    @NonNull
    public final ImageView facebookLogo;
    @NonNull
    public final ImageView facebookPlus;
    @NonNull
    public final LinearLayout likedLayout;
    @NonNull
    public final RecyclerView likedRecyclerView;
    @NonNull
    public final TextView likedTitle;
    @NonNull
    public final TextView name;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final RelativeLayout twitterLayout;
    @NonNull
    public final ImageView twitterLogo;
    @NonNull
    public final ImageView twitterPlus;
    @NonNull
    public final LinearLayout videosLayout;
    @NonNull
    public final RecyclerView videosRecyclerView;
    @NonNull
    public final TextView videosTitle;
    @NonNull
    public final RelativeLayout vkLayout;
    @NonNull
    public final ImageView vkLogo;
    @NonNull
    public final ImageView vkPlus;

    private ActivityProfileBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull AppBarLayout appBarLayout, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Toolbar toolbar, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout3, @NonNull RecyclerView recyclerView2, @NonNull TextView textView5, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView6, @NonNull ImageView imageView7) {
        this.rootView = linearLayout;
        this.about = textView;
        this.appBarLayout = appBarLayout;
        this.avatar = imageView;
        this.description = textView2;
        this.facebookLayout = relativeLayout;
        this.facebookLogo = imageView2;
        this.facebookPlus = imageView3;
        this.likedLayout = linearLayout2;
        this.likedRecyclerView = recyclerView;
        this.likedTitle = textView3;
        this.name = textView4;
        this.toolbar = toolbar;
        this.twitterLayout = relativeLayout2;
        this.twitterLogo = imageView4;
        this.twitterPlus = imageView5;
        this.videosLayout = linearLayout3;
        this.videosRecyclerView = recyclerView2;
        this.videosTitle = textView5;
        this.vkLayout = relativeLayout3;
        this.vkLogo = imageView6;
        this.vkPlus = imageView7;
    }

    @NonNull
    public static ActivityProfileBinding bind(@NonNull View view) {
        int n = 2131296270;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296270);
        if (textView != null) {
            n = 2131296362;
            AppBarLayout appBarLayout = (AppBarLayout)ViewBindings.findChildViewById((View)view, (int)2131296362);
            if (appBarLayout != null) {
                n = 2131296382;
                ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296382);
                if (imageView != null) {
                    n = 2131296536;
                    TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296536);
                    if (textView2 != null) {
                        n = 2131296618;
                        RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296618);
                        if (relativeLayout != null) {
                            n = 2131296619;
                            ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296619);
                            if (imageView2 != null) {
                                n = 2131296620;
                                ImageView imageView3 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296620);
                                if (imageView3 != null) {
                                    n = 2131296736;
                                    LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296736);
                                    if (linearLayout != null) {
                                        n = 2131296737;
                                        RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296737);
                                        if (recyclerView != null) {
                                            n = 2131296738;
                                            TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296738);
                                            if (textView3 != null) {
                                                n = 2131296946;
                                                TextView textView4 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296946);
                                                if (textView4 != null) {
                                                    n = 2131297244;
                                                    Toolbar toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)2131297244);
                                                    if (toolbar != null) {
                                                        n = 2131297298;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297298);
                                                        if (relativeLayout2 != null) {
                                                            n = 2131297299;
                                                            ImageView imageView4 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297299);
                                                            if (imageView4 != null) {
                                                                n = 2131297300;
                                                                ImageView imageView5 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297300);
                                                                if (imageView5 != null) {
                                                                    n = 2131297324;
                                                                    LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297324);
                                                                    if (linearLayout2 != null) {
                                                                        n = 2131297325;
                                                                        RecyclerView recyclerView2 = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131297325);
                                                                        if (recyclerView2 != null) {
                                                                            n = 2131297326;
                                                                            TextView textView5 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297326);
                                                                            if (textView5 != null) {
                                                                                n = 2131297342;
                                                                                RelativeLayout relativeLayout3 = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131297342);
                                                                                if (relativeLayout3 != null) {
                                                                                    n = 2131297343;
                                                                                    ImageView imageView6 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297343);
                                                                                    if (imageView6 != null) {
                                                                                        n = 2131297344;
                                                                                        ImageView imageView7 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297344);
                                                                                        if (imageView7 != null) {
                                                                                            return new ActivityProfileBinding((LinearLayout)view, textView, appBarLayout, imageView, textView2, relativeLayout, imageView2, imageView3, linearLayout, recyclerView, textView3, textView4, toolbar, relativeLayout2, imageView4, imageView5, linearLayout2, recyclerView2, textView5, relativeLayout3, imageView6, imageView7);
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
    public static ActivityProfileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityProfileBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityProfileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492903, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityProfileBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


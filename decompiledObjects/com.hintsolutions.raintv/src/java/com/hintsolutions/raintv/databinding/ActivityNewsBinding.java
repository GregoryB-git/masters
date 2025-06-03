/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.recyclerview.widget.RecyclerView
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
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.CopyrightBinding;
import com.hintsolutions.raintv.databinding.ToolbarWithoutElevationBinding;
import com.hintsolutions.raintv.views.CustomFontTextView;

public final class ActivityNewsBinding
implements ViewBinding {
    @NonNull
    public final RecyclerView bestRecyclerView;
    @NonNull
    public final Button buySubscriptionButton;
    @NonNull
    public final CopyrightBinding copyright;
    @NonNull
    public final CustomFontTextView date;
    @NonNull
    public final ImageView detailImg;
    @NonNull
    public final Button fullTextButton;
    @NonNull
    public final LinearLayout fullTextForSubscribersLayout;
    @NonNull
    public final LinearLayout fullTextLayout;
    @NonNull
    public final RelativeLayout galleryFragment;
    @NonNull
    public final ImageView imageView13;
    @NonNull
    public final LinearLayout info;
    @NonNull
    public final View infoDelimiter;
    @NonNull
    public final CustomFontTextView newsAuthors;
    @NonNull
    public final TextView newsTitle;
    @NonNull
    public final LinearLayout partLayout;
    @NonNull
    public final ImageView paymentIcon;
    @NonNull
    public final ImageView playVideoImageView;
    @NonNull
    public final FrameLayout popularArticlesInProgram;
    @NonNull
    public final WebView predetailWebView;
    @NonNull
    public final CustomFontTextView program;
    @NonNull
    public final LinearLayout programContainer;
    @NonNull
    public final LinearLayout recommendationsLayout;
    @NonNull
    public final RecyclerView recommendationsRecyclerView;
    @NonNull
    public final TextView recommendationsTitle;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView textView5;
    @NonNull
    public final WebView timeCodesWebView;
    @NonNull
    public final ToolbarWithoutElevationBinding toolbar;
    @NonNull
    public final CustomFontTextView viewsCount;
    @NonNull
    public final LinearLayout viewsCountContainer;
    @NonNull
    public final WebView webView;

    private ActivityNewsBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull Button button, @NonNull CopyrightBinding copyrightBinding, @NonNull CustomFontTextView customFontTextView, @NonNull ImageView imageView, @NonNull Button button2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout4, @NonNull View view, @NonNull CustomFontTextView customFontTextView2, @NonNull TextView textView, @NonNull LinearLayout linearLayout5, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull FrameLayout frameLayout, @NonNull WebView webView, @NonNull CustomFontTextView customFontTextView3, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull RecyclerView recyclerView2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull WebView webView2, @NonNull ToolbarWithoutElevationBinding toolbarWithoutElevationBinding, @NonNull CustomFontTextView customFontTextView4, @NonNull LinearLayout linearLayout8, @NonNull WebView webView3) {
        this.rootView = linearLayout;
        this.bestRecyclerView = recyclerView;
        this.buySubscriptionButton = button;
        this.copyright = copyrightBinding;
        this.date = customFontTextView;
        this.detailImg = imageView;
        this.fullTextButton = button2;
        this.fullTextForSubscribersLayout = linearLayout2;
        this.fullTextLayout = linearLayout3;
        this.galleryFragment = relativeLayout;
        this.imageView13 = imageView2;
        this.info = linearLayout4;
        this.infoDelimiter = view;
        this.newsAuthors = customFontTextView2;
        this.newsTitle = textView;
        this.partLayout = linearLayout5;
        this.paymentIcon = imageView3;
        this.playVideoImageView = imageView4;
        this.popularArticlesInProgram = frameLayout;
        this.predetailWebView = webView;
        this.program = customFontTextView3;
        this.programContainer = linearLayout6;
        this.recommendationsLayout = linearLayout7;
        this.recommendationsRecyclerView = recyclerView2;
        this.recommendationsTitle = textView2;
        this.textView5 = textView3;
        this.timeCodesWebView = webView2;
        this.toolbar = toolbarWithoutElevationBinding;
        this.viewsCount = customFontTextView4;
        this.viewsCountContainer = linearLayout8;
        this.webView = webView3;
    }

    @NonNull
    public static ActivityNewsBinding bind(@NonNull View view) {
        int n = 2131296394;
        RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296394);
        if (recyclerView != null) {
            n = 2131296421;
            Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296421);
            if (button != null) {
                n = 2131296515;
                View view2 = ViewBindings.findChildViewById((View)view, (int)2131296515);
                if (view2 != null) {
                    CopyrightBinding copyrightBinding = CopyrightBinding.bind(view2);
                    n = 2131296527;
                    CustomFontTextView customFontTextView = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296527);
                    if (customFontTextView != null) {
                        n = 2131296543;
                        ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296543);
                        if (imageView != null) {
                            n = 2131296648;
                            Button button2 = (Button)ViewBindings.findChildViewById((View)view, (int)2131296648);
                            if (button2 != null) {
                                n = 2131296649;
                                LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296649);
                                if (linearLayout != null) {
                                    n = 2131296650;
                                    LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296650);
                                    if (linearLayout2 != null) {
                                        n = 2131296652;
                                        RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296652);
                                        if (relativeLayout != null) {
                                            n = 2131296694;
                                            ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296694);
                                            if (imageView2 != null) {
                                                n = 2131296710;
                                                LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296710);
                                                if (linearLayout3 != null) {
                                                    n = 2131296711;
                                                    View view3 = ViewBindings.findChildViewById((View)view, (int)2131296711);
                                                    if (view3 != null) {
                                                        n = 2131296960;
                                                        CustomFontTextView customFontTextView2 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131296960);
                                                        if (customFontTextView2 != null) {
                                                            n = 2131296962;
                                                            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296962);
                                                            if (textView != null) {
                                                                n = 2131296996;
                                                                LinearLayout linearLayout4 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296996);
                                                                if (linearLayout4 != null) {
                                                                    n = 2131297003;
                                                                    ImageView imageView3 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297003);
                                                                    if (imageView3 != null) {
                                                                        n = 2131297010;
                                                                        ImageView imageView4 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131297010);
                                                                        if (imageView4 != null) {
                                                                            n = 2131297013;
                                                                            FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)2131297013);
                                                                            if (frameLayout != null) {
                                                                                n = 2131297018;
                                                                                WebView webView = (WebView)ViewBindings.findChildViewById((View)view, (int)2131297018);
                                                                                if (webView != null) {
                                                                                    n = 2131297022;
                                                                                    view2 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297022);
                                                                                    if (view2 != null) {
                                                                                        n = 2131297024;
                                                                                        LinearLayout linearLayout5 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297024);
                                                                                        if (linearLayout5 != null) {
                                                                                            n = 2131297045;
                                                                                            LinearLayout linearLayout6 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297045);
                                                                                            if (linearLayout6 != null) {
                                                                                                n = 2131297046;
                                                                                                RecyclerView recyclerView2 = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131297046);
                                                                                                if (recyclerView2 != null) {
                                                                                                    n = 2131297047;
                                                                                                    TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297047);
                                                                                                    if (textView2 != null) {
                                                                                                        n = 2131297220;
                                                                                                        TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297220);
                                                                                                        if (textView3 != null) {
                                                                                                            n = 2131297234;
                                                                                                            WebView webView2 = (WebView)ViewBindings.findChildViewById((View)view, (int)2131297234);
                                                                                                            if (webView2 != null) {
                                                                                                                n = 2131297244;
                                                                                                                Object object = ViewBindings.findChildViewById((View)view, (int)2131297244);
                                                                                                                if (object != null) {
                                                                                                                    object = ToolbarWithoutElevationBinding.bind(object);
                                                                                                                    n = 2131297337;
                                                                                                                    CustomFontTextView customFontTextView3 = (CustomFontTextView)ViewBindings.findChildViewById((View)view, (int)2131297337);
                                                                                                                    if (customFontTextView3 != null) {
                                                                                                                        n = 2131297338;
                                                                                                                        LinearLayout linearLayout7 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297338);
                                                                                                                        if (linearLayout7 != null) {
                                                                                                                            n = 2131297346;
                                                                                                                            WebView webView3 = (WebView)ViewBindings.findChildViewById((View)view, (int)2131297346);
                                                                                                                            if (webView3 != null) {
                                                                                                                                return new ActivityNewsBinding((LinearLayout)view, recyclerView, button, copyrightBinding, customFontTextView, imageView, button2, linearLayout, linearLayout2, relativeLayout, imageView2, linearLayout3, view3, customFontTextView2, textView, linearLayout4, imageView3, imageView4, frameLayout, webView, (CustomFontTextView)view2, linearLayout5, linearLayout6, recyclerView2, textView2, textView3, webView2, (ToolbarWithoutElevationBinding)object, customFontTextView3, linearLayout7, webView3);
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
    public static ActivityNewsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityNewsBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityNewsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492901, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityNewsBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


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
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.core.widget.NestedScrollView
 *  androidx.recyclerview.widget.RecyclerView
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.hintsolutions.raintv.databinding.CopyrightBinding;
import com.pnikosis.materialishprogress.ProgressWheel;

public final class FragmentProfileBinding
implements ViewBinding {
    @NonNull
    public final CopyrightBinding copyright;
    @NonNull
    public final TextView description;
    @NonNull
    public final LinearLayout descriptionDivider;
    @NonNull
    public final ImageView editProfileLayout;
    @NonNull
    public final TextView emptyLabel;
    @NonNull
    public final LinearLayout friendsLayout;
    @NonNull
    public final RecyclerView friendsRecyclerView;
    @NonNull
    public final TextView friendsTitle;
    @NonNull
    public final LinearLayout giftLayout;
    @NonNull
    public final ImageView imageView19;
    @NonNull
    public final ImageView imageView5;
    @NonNull
    public final Button inviteFriends;
    @NonNull
    public final LinearLayout inviteFriendsLayout;
    @NonNull
    public final LinearLayout likedLayout;
    @NonNull
    public final RecyclerView likedRecyclerView;
    @NonNull
    public final TextView likedTitle;
    @NonNull
    public final LinearLayout myVideosLayout;
    @NonNull
    public final RecyclerView myVideosRecyclerView;
    @NonNull
    public final TextView myVideosTitle;
    @NonNull
    public final ProgressWheel progressWheel;
    @NonNull
    public final LinearLayout rcLayout;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final TextView textView19;
    @NonNull
    public final TextView textView2;

    private FragmentProfileBinding(@NonNull LinearLayout linearLayout, @NonNull CopyrightBinding copyrightBinding, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3, @NonNull RecyclerView recyclerView, @NonNull TextView textView3, @NonNull LinearLayout linearLayout4, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull Button button, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull RecyclerView recyclerView2, @NonNull TextView textView4, @NonNull LinearLayout linearLayout7, @NonNull RecyclerView recyclerView3, @NonNull TextView textView5, @NonNull ProgressWheel progressWheel, @NonNull LinearLayout linearLayout8, @NonNull NestedScrollView nestedScrollView, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = linearLayout;
        this.copyright = copyrightBinding;
        this.description = textView;
        this.descriptionDivider = linearLayout2;
        this.editProfileLayout = imageView;
        this.emptyLabel = textView2;
        this.friendsLayout = linearLayout3;
        this.friendsRecyclerView = recyclerView;
        this.friendsTitle = textView3;
        this.giftLayout = linearLayout4;
        this.imageView19 = imageView2;
        this.imageView5 = imageView3;
        this.inviteFriends = button;
        this.inviteFriendsLayout = linearLayout5;
        this.likedLayout = linearLayout6;
        this.likedRecyclerView = recyclerView2;
        this.likedTitle = textView4;
        this.myVideosLayout = linearLayout7;
        this.myVideosRecyclerView = recyclerView3;
        this.myVideosTitle = textView5;
        this.progressWheel = progressWheel;
        this.rcLayout = linearLayout8;
        this.scrollView = nestedScrollView;
        this.textView19 = textView6;
        this.textView2 = textView7;
    }

    @NonNull
    public static FragmentProfileBinding bind(@NonNull View view) {
        int n = 2131296515;
        View view2 = ViewBindings.findChildViewById((View)view, (int)2131296515);
        if (view2 != null) {
            CopyrightBinding copyrightBinding = CopyrightBinding.bind(view2);
            n = 2131296536;
            TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296536);
            if (textView != null) {
                n = 2131296537;
                LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296537);
                if (linearLayout != null) {
                    n = 2131296573;
                    view2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296573);
                    if (view2 != null) {
                        n = 2131296581;
                        TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296581);
                        if (textView2 != null) {
                            n = 2131296644;
                            LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296644);
                            if (linearLayout2 != null) {
                                n = 2131296645;
                                RecyclerView recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296645);
                                if (recyclerView != null) {
                                    n = 2131296646;
                                    TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296646);
                                    if (textView3 != null) {
                                        n = 2131296657;
                                        LinearLayout linearLayout3 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296657);
                                        if (linearLayout3 != null) {
                                            n = 2131296695;
                                            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296695);
                                            if (imageView != null) {
                                                n = 2131296699;
                                                ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296699);
                                                if (imageView2 != null) {
                                                    n = 2131296715;
                                                    Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296715);
                                                    if (button != null) {
                                                        n = 2131296716;
                                                        LinearLayout linearLayout4 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296716);
                                                        if (linearLayout4 != null) {
                                                            n = 2131296736;
                                                            LinearLayout linearLayout5 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296736);
                                                            if (linearLayout5 != null) {
                                                                n = 2131296737;
                                                                RecyclerView recyclerView2 = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296737);
                                                                if (recyclerView2 != null) {
                                                                    n = 2131296738;
                                                                    TextView textView4 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296738);
                                                                    if (textView4 != null) {
                                                                        n = 2131296943;
                                                                        LinearLayout linearLayout6 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131296943);
                                                                        if (linearLayout6 != null) {
                                                                            n = 2131296944;
                                                                            RecyclerView recyclerView3 = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)2131296944);
                                                                            if (recyclerView3 != null) {
                                                                                n = 2131296945;
                                                                                TextView textView5 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296945);
                                                                                if (textView5 != null) {
                                                                                    n = 2131297031;
                                                                                    ProgressWheel progressWheel = (ProgressWheel)ViewBindings.findChildViewById((View)view, (int)2131297031);
                                                                                    if (progressWheel != null) {
                                                                                        n = 2131297044;
                                                                                        LinearLayout linearLayout7 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297044);
                                                                                        if (linearLayout7 != null) {
                                                                                            n = 2131297087;
                                                                                            NestedScrollView nestedScrollView = (NestedScrollView)ViewBindings.findChildViewById((View)view, (int)2131297087);
                                                                                            if (nestedScrollView != null) {
                                                                                                n = 2131297211;
                                                                                                TextView textView6 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297211);
                                                                                                if (textView6 != null) {
                                                                                                    n = 2131297212;
                                                                                                    TextView textView7 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297212);
                                                                                                    if (textView7 != null) {
                                                                                                        return new FragmentProfileBinding((LinearLayout)view, copyrightBinding, textView, linearLayout, (ImageView)view2, textView2, linearLayout2, recyclerView, textView3, linearLayout3, imageView, imageView2, button, linearLayout4, linearLayout5, recyclerView2, textView4, linearLayout6, recyclerView3, textView5, progressWheel, linearLayout7, nestedScrollView, textView6, textView7);
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
    public static FragmentProfileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentProfileBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentProfileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492977, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentProfileBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


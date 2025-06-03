/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 *  android.widget.Spinner
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
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
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.rengwuxian.materialedittext.MaterialEditText;

public final class ActivityFormBinding
implements ViewBinding {
    @NonNull
    public final MaterialEditText about;
    @NonNull
    public final MaterialEditText birthday;
    @NonNull
    public final MaterialEditText city;
    @NonNull
    public final Button continueButton;
    @NonNull
    public final MaterialEditText country;
    @NonNull
    public final RelativeLayout customFormToolbar;
    @NonNull
    public final ImageView doneIcon;
    @NonNull
    public final Spinner educationSpinner;
    @NonNull
    public final MaterialEditText firstName;
    @NonNull
    public final Spinner genderSpinner;
    @NonNull
    public final MaterialEditText lastName;
    @NonNull
    public final TextView loadingText;
    @NonNull
    public final ImageView logo;
    @NonNull
    public final MaterialEditText profession;
    @NonNull
    public final ProgressWheel progressWheel;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final ScrollView scrollView;
    @NonNull
    public final CheckBox showLocation;
    @NonNull
    public final TextView textView3;
    @NonNull
    public final TextView textView4;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final LinearLayout uploadProgressLayout;
    @NonNull
    public final Spinner workSpinner;

    private ActivityFormBinding(@NonNull LinearLayout linearLayout, @NonNull MaterialEditText materialEditText, @NonNull MaterialEditText materialEditText2, @NonNull MaterialEditText materialEditText3, @NonNull Button button, @NonNull MaterialEditText materialEditText4, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull Spinner spinner, @NonNull MaterialEditText materialEditText5, @NonNull Spinner spinner2, @NonNull MaterialEditText materialEditText6, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull MaterialEditText materialEditText7, @NonNull ProgressWheel progressWheel, @NonNull ScrollView scrollView, @NonNull CheckBox checkBox, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull Toolbar toolbar, @NonNull LinearLayout linearLayout2, @NonNull Spinner spinner3) {
        this.rootView = linearLayout;
        this.about = materialEditText;
        this.birthday = materialEditText2;
        this.city = materialEditText3;
        this.continueButton = button;
        this.country = materialEditText4;
        this.customFormToolbar = relativeLayout;
        this.doneIcon = imageView;
        this.educationSpinner = spinner;
        this.firstName = materialEditText5;
        this.genderSpinner = spinner2;
        this.lastName = materialEditText6;
        this.loadingText = textView;
        this.logo = imageView2;
        this.profession = materialEditText7;
        this.progressWheel = progressWheel;
        this.scrollView = scrollView;
        this.showLocation = checkBox;
        this.textView3 = textView2;
        this.textView4 = textView3;
        this.toolbar = toolbar;
        this.uploadProgressLayout = linearLayout2;
        this.workSpinner = spinner3;
    }

    @NonNull
    public static ActivityFormBinding bind(@NonNull View view) {
        int n = 2131296270;
        MaterialEditText materialEditText = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296270);
        if (materialEditText != null) {
            n = 2131296395;
            MaterialEditText materialEditText2 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296395);
            if (materialEditText2 != null) {
                n = 2131296476;
                MaterialEditText materialEditText3 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296476);
                if (materialEditText3 != null) {
                    n = 2131296510;
                    Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296510);
                    if (button != null) {
                        n = 2131296518;
                        MaterialEditText materialEditText4 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296518);
                        if (materialEditText4 != null) {
                            n = 2131296523;
                            RelativeLayout relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)2131296523);
                            if (relativeLayout != null) {
                                n = 2131296555;
                                ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296555);
                                if (imageView != null) {
                                    n = 2131296577;
                                    Spinner spinner = (Spinner)ViewBindings.findChildViewById((View)view, (int)2131296577);
                                    if (spinner != null) {
                                        n = 2131296628;
                                        MaterialEditText materialEditText5 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296628);
                                        if (materialEditText5 != null) {
                                            n = 2131296654;
                                            Spinner spinner2 = (Spinner)ViewBindings.findChildViewById((View)view, (int)2131296654);
                                            if (spinner2 != null) {
                                                n = 2131296726;
                                                MaterialEditText materialEditText6 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296726);
                                                if (materialEditText6 != null) {
                                                    n = 2131296755;
                                                    TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296755);
                                                    if (textView != null) {
                                                        n = 2131296759;
                                                        ImageView imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)2131296759);
                                                        if (imageView2 != null) {
                                                            n = 2131297021;
                                                            MaterialEditText materialEditText7 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131297021);
                                                            if (materialEditText7 != null) {
                                                                n = 2131297031;
                                                                ProgressWheel progressWheel = (ProgressWheel)ViewBindings.findChildViewById((View)view, (int)2131297031);
                                                                if (progressWheel != null) {
                                                                    n = 2131297087;
                                                                    ScrollView scrollView = (ScrollView)ViewBindings.findChildViewById((View)view, (int)2131297087);
                                                                    if (scrollView != null) {
                                                                        n = 2131297130;
                                                                        CheckBox checkBox = (CheckBox)ViewBindings.findChildViewById((View)view, (int)2131297130);
                                                                        if (checkBox != null) {
                                                                            n = 2131297218;
                                                                            TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297218);
                                                                            if (textView2 != null) {
                                                                                n = 2131297219;
                                                                                TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297219);
                                                                                if (textView3 != null) {
                                                                                    n = 2131297244;
                                                                                    Toolbar toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)2131297244);
                                                                                    if (toolbar != null) {
                                                                                        n = 2131297308;
                                                                                        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)2131297308);
                                                                                        if (linearLayout != null) {
                                                                                            n = 2131297353;
                                                                                            Spinner spinner3 = (Spinner)ViewBindings.findChildViewById((View)view, (int)2131297353);
                                                                                            if (spinner3 != null) {
                                                                                                return new ActivityFormBinding((LinearLayout)view, materialEditText, materialEditText2, materialEditText3, button, materialEditText4, relativeLayout, imageView, spinner, materialEditText5, spinner2, materialEditText6, textView, imageView2, materialEditText7, progressWheel, scrollView, checkBox, textView2, textView3, toolbar, linearLayout, spinner3);
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
    public static ActivityFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityFormBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492896, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityFormBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}


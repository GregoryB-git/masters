/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageButton
 *  android.widget.ScrollView
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
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
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rengwuxian.materialedittext.MaterialEditText;

public final class FragmentPersonalBinding
implements ViewBinding {
    @NonNull
    public final TextView appVersion1;
    @NonNull
    public final MaterialEditText email;
    @NonNull
    public final MaterialEditText firstname;
    @NonNull
    public final MaterialEditText lastname;
    @NonNull
    public final Button logout;
    @NonNull
    private final ScrollView rootView;
    @NonNull
    public final Button save;
    @NonNull
    public final Button startlinking;
    @NonNull
    public final ImageButton twitter;
    @NonNull
    public final TextView userId;
    @NonNull
    public final ImageButton vk;

    private FragmentPersonalBinding(@NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull MaterialEditText materialEditText, @NonNull MaterialEditText materialEditText2, @NonNull MaterialEditText materialEditText3, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull ImageButton imageButton, @NonNull TextView textView2, @NonNull ImageButton imageButton2) {
        this.rootView = scrollView;
        this.appVersion1 = textView;
        this.email = materialEditText;
        this.firstname = materialEditText2;
        this.lastname = materialEditText3;
        this.logout = button;
        this.save = button2;
        this.startlinking = button3;
        this.twitter = imageButton;
        this.userId = textView2;
        this.vk = imageButton2;
    }

    @NonNull
    public static FragmentPersonalBinding bind(@NonNull View view) {
        int n = 2131296363;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)2131296363);
        if (textView != null) {
            n = 2131296580;
            MaterialEditText materialEditText = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296580);
            if (materialEditText != null) {
                n = 2131296629;
                MaterialEditText materialEditText2 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296629);
                if (materialEditText2 != null) {
                    n = 2131296727;
                    MaterialEditText materialEditText3 = (MaterialEditText)ViewBindings.findChildViewById((View)view, (int)2131296727);
                    if (materialEditText3 != null) {
                        n = 2131296760;
                        Button button = (Button)ViewBindings.findChildViewById((View)view, (int)2131296760);
                        if (button != null) {
                            n = 2131297076;
                            Button button2 = (Button)ViewBindings.findChildViewById((View)view, (int)2131297076);
                            if (button2 != null) {
                                n = 2131297163;
                                Button button3 = (Button)ViewBindings.findChildViewById((View)view, (int)2131297163);
                                if (button3 != null) {
                                    n = 2131297297;
                                    ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131297297);
                                    if (imageButton != null) {
                                        n = 2131297310;
                                        TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)2131297310);
                                        if (textView2 != null) {
                                            n = 2131297341;
                                            ImageButton imageButton2 = (ImageButton)ViewBindings.findChildViewById((View)view, (int)2131297341);
                                            if (imageButton2 != null) {
                                                return new FragmentPersonalBinding((ScrollView)view, textView, materialEditText, materialEditText2, materialEditText3, button, button2, button3, imageButton, textView2, imageButton2);
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
    public static FragmentPersonalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return FragmentPersonalBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPersonalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl) {
        layoutInflater = layoutInflater.inflate(2131492976, viewGroup, false);
        if (bl) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentPersonalBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ScrollView getRoot() {
        return this.rootView;
    }
}


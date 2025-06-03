/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.TextView
 *  androidx.annotation.StringRes
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.mikepenz.materialize.holder;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.StringRes;

public class StringHolder {
    private CharSequence mText;
    private int mTextRes;

    public StringHolder(@StringRes int n) {
        this.mTextRes = n;
    }

    public StringHolder(CharSequence charSequence) {
        this.mTextRes = -1;
        this.mText = charSequence;
    }

    public StringHolder(String string2) {
        this.mTextRes = -1;
        this.mText = string2;
    }

    public static void applyTo(StringHolder stringHolder, TextView textView) {
        if (stringHolder != null && textView != null) {
            stringHolder.applyTo(textView);
        }
    }

    public static boolean applyToOrHide(StringHolder stringHolder, TextView textView) {
        if (stringHolder != null && textView != null) {
            return stringHolder.applyToOrHide(textView);
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        return false;
    }

    public void applyTo(TextView textView) {
        CharSequence charSequence = this.mText;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            int n = this.mTextRes;
            if (n != -1) {
                textView.setText(n);
            } else {
                textView.setText((CharSequence)"");
            }
        }
    }

    public boolean applyToOrHide(TextView textView) {
        CharSequence charSequence = this.mText;
        if (charSequence != null) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            return true;
        }
        int n = this.mTextRes;
        if (n != -1) {
            textView.setText(n);
            textView.setVisibility(0);
            return true;
        }
        textView.setVisibility(8);
        return false;
    }

    public CharSequence getText() {
        return this.mText;
    }

    public String getText(Context context) {
        CharSequence charSequence = this.mText;
        if (charSequence != null) {
            return charSequence.toString();
        }
        int n = this.mTextRes;
        if (n != -1) {
            return context.getString(n);
        }
        return null;
    }

    public int getTextRes() {
        return this.mTextRes;
    }

    public void setText(String string2) {
        this.mText = string2;
    }

    public void setTextRes(int n) {
        this.mTextRes = n;
    }

    public String toString() {
        return this.mText.toString();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.inputmethod.InputMethodManager
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.util;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;

public class KeyboardUtil {
    private View contentView;
    private View decorView;
    public ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(this){
        public final KeyboardUtil this$0;
        {
            this.this$0 = keyboardUtil;
        }

        public void onGlobalLayout() {
            Rect rect = new Rect();
            this.this$0.decorView.getWindowVisibleDisplayFrame(rect);
            int n = ((KeyboardUtil)this.this$0).decorView.getContext().getResources().getDisplayMetrics().heightPixels - rect.bottom;
            if (n != 0) {
                if (this.this$0.contentView.getPaddingBottom() != n) {
                    this.this$0.contentView.setPadding(0, 0, 0, n);
                }
            } else if (this.this$0.contentView.getPaddingBottom() != 0) {
                this.this$0.contentView.setPadding(0, 0, 0, 0);
            }
        }
    };

    public KeyboardUtil(Activity activity, View view) {
        activity = activity.getWindow().getDecorView();
        this.decorView = activity;
        this.contentView = view;
        activity.getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public static void hideKeyboard(Activity activity) {
        if (activity != null && activity.getCurrentFocus() != null) {
            ((InputMethodManager)activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void disable() {
        this.decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void enable() {
        this.decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }
}


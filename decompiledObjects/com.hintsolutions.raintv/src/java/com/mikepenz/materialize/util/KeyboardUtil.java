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
package com.mikepenz.materialize.util;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.mikepenz.materialize.util.UIUtils;

public class KeyboardUtil {
    private View contentView;
    private View decorView;
    private float initialDpDiff = -1.0f;
    public ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(this){
        public final KeyboardUtil this$0;
        {
            this.this$0 = keyboardUtil;
        }

        public void onGlobalLayout() {
            Rect rect = new Rect();
            this.this$0.decorView.getWindowVisibleDisplayFrame(rect);
            float f = UIUtils.convertPixelsToDp(this.this$0.decorView.getRootView().getHeight() - (rect.bottom - rect.top), this.this$0.decorView.getContext());
            if (this.this$0.initialDpDiff == -1.0f) {
                KeyboardUtil.access$102(this.this$0, f);
            }
            if (f - this.this$0.initialDpDiff > 100.0f) {
                if (this.this$0.contentView.getPaddingBottom() == 0) {
                    this.this$0.contentView.setPadding(0, 0, 0, (int)UIUtils.convertDpToPixel(f - this.this$0.initialDpDiff, this.this$0.decorView.getContext()));
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

    public static /* synthetic */ float access$102(KeyboardUtil keyboardUtil, float f) {
        keyboardUtil.initialDpDiff = f;
        return f;
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


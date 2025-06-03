/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.WindowInsets
 *  android.widget.RelativeLayout
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

public class FitsSystemWindowRelativeLayout
extends RelativeLayout {
    private Rect originalPadding;

    public FitsSystemWindowRelativeLayout(Context context) {
        super(context);
        this.setup();
    }

    public FitsSystemWindowRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setup();
    }

    public FitsSystemWindowRelativeLayout(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.setup();
    }

    @TargetApi(value=21)
    public FitsSystemWindowRelativeLayout(Context context, AttributeSet attributeSet, int n, int n2) {
        super(context, attributeSet, n, n2);
        this.setup();
    }

    private boolean navBarCanMove() {
        boolean bl = this.getResources().getConfiguration().smallestScreenWidthDp <= 600;
        return bl;
    }

    private void setup() {
        this.setFitsSystemWindows(true);
        if (this.originalPadding == null) {
            this.originalPadding = new Rect(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
        this.updatePadding(new Rect());
    }

    private void updatePadding(Rect rect) {
        Rect rect2 = this.originalPadding;
        int n = rect2.left;
        int n2 = rect.left;
        int n3 = rect2.right;
        int n4 = rect.right;
        int n6 = rect2.bottom;
        int n7 = rect.bottom;
        this.setPadding(n + n2, rect2.top + rect.top, n3 + n4, n6 + n7);
    }

    public boolean fitSystemWindows(@NonNull Rect rect) {
        this.updatePadding(rect);
        return false;
    }

    @TargetApi(value=20)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.fitSystemWindows(new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom()));
        return windowInsets;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.navBarCanMove()) {
            this.setup();
        }
    }
}


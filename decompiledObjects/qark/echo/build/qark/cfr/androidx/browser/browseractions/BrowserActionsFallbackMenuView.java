/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.LinearLayout
 *  java.lang.Deprecated
 *  java.lang.Math
 */
package androidx.browser.browseractions;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import p.a;

@Deprecated
public class BrowserActionsFallbackMenuView
extends LinearLayout {
    public final int o;
    public final int p;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = this.getResources().getDimensionPixelOffset(a.b);
        this.p = this.getResources().getDimensionPixelOffset(a.a);
    }

    public void onMeasure(int n8, int n9) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)Math.min((int)(this.getResources().getDisplayMetrics().widthPixels - this.o * 2), (int)this.p), (int)1073741824), n9);
    }
}


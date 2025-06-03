/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.FrameLayout
 *  java.lang.Math
 *  java.lang.Object
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

public class ContentFrameLayout
extends FrameLayout {
    public TypedValue o;
    public TypedValue p;
    public TypedValue q;
    public TypedValue r;
    public TypedValue s;
    public TypedValue t;
    public final Rect u = new Rect();

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.s == null) {
            this.s = new TypedValue();
        }
        return this.s;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.t == null) {
            this.t = new TypedValue();
        }
        return this.t;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.q == null) {
            this.q = new TypedValue();
        }
        return this.q;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.r == null) {
            this.r = new TypedValue();
        }
        return this.r;
    }

    public TypedValue getMinWidthMajor() {
        if (this.o == null) {
            this.o = new TypedValue();
        }
        return this.o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.p == null) {
            this.p = new TypedValue();
        }
        return this.p;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMeasure(int var1_1, int var2_2) {
        block15 : {
            block13 : {
                block14 : {
                    block12 : {
                        var11_3 = this.getContext().getResources().getDisplayMetrics();
                        var4_4 = var11_3.widthPixels;
                        var5_5 = var11_3.heightPixels;
                        var8_6 = 1;
                        var4_4 = var4_4 < var5_5 ? 1 : 0;
                        var9_7 = View.MeasureSpec.getMode((int)var1_1);
                        var7_8 = View.MeasureSpec.getMode((int)var2_2);
                        if (var9_7 != Integer.MIN_VALUE) ** GOTO lbl-1000
                        var10_9 = var4_4 != 0 ? this.r : this.q;
                        if (var10_9 == null || (var5_5 = var10_9.type) == 0) ** GOTO lbl-1000
                        if (var5_5 != 5) break block12;
                        var3_10 = var10_9.getDimension(var11_3);
                        ** GOTO lbl18
                    }
                    if (var5_5 == 6) {
                        var5_5 = var11_3.widthPixels;
                        var3_10 = var10_9.getFraction((float)var5_5, (float)var5_5);
lbl18: // 2 sources:
                        var5_5 = (int)var3_10;
                    } else {
                        var5_5 = 0;
                    }
                    if (var5_5 > 0) {
                        var10_9 = this.u;
                        var6_11 = View.MeasureSpec.makeMeasureSpec((int)Math.min((int)(var5_5 - (var10_9.left + var10_9.right)), (int)View.MeasureSpec.getSize((int)var1_1)), (int)1073741824);
                        var1_1 = 1;
                    } else lbl-1000: // 3 sources:
                    {
                        var5_5 = 0;
                        var6_11 = var1_1;
                        var1_1 = var5_5;
                    }
                    var5_5 = var2_2;
                    if (var7_8 != Integer.MIN_VALUE) break block13;
                    var10_9 = var4_4 != 0 ? this.s : this.t;
                    var5_5 = var2_2;
                    if (var10_9 == null) break block13;
                    var7_8 = var10_9.type;
                    var5_5 = var2_2;
                    if (var7_8 == 0) break block13;
                    if (var7_8 != 5) break block14;
                    var3_10 = var10_9.getDimension(var11_3);
                    ** GOTO lbl44
                }
                if (var7_8 == 6) {
                    var5_5 = var11_3.heightPixels;
                    var3_10 = var10_9.getFraction((float)var5_5, (float)var5_5);
lbl44: // 2 sources:
                    var7_8 = (int)var3_10;
                } else {
                    var7_8 = 0;
                }
                var5_5 = var2_2;
                if (var7_8 > 0) {
                    var10_9 = this.u;
                    var5_5 = View.MeasureSpec.makeMeasureSpec((int)Math.min((int)(var7_8 - (var10_9.top + var10_9.bottom)), (int)View.MeasureSpec.getSize((int)var2_2)), (int)1073741824);
                }
            }
            super.onMeasure(var6_11, var5_5);
            var7_8 = this.getMeasuredWidth();
            var6_11 = View.MeasureSpec.makeMeasureSpec((int)var7_8, (int)1073741824);
            if (var1_1 != 0 || var9_7 != Integer.MIN_VALUE) ** GOTO lbl-1000
            var10_9 = var4_4 != 0 ? this.p : this.o;
            if (var10_9 == null || (var1_1 = var10_9.type) == 0) ** GOTO lbl-1000
            if (var1_1 != 5) break block15;
            var3_10 = var10_9.getDimension(var11_3);
            ** GOTO lbl65
        }
        if (var1_1 == 6) {
            var1_1 = var11_3.widthPixels;
            var3_10 = var10_9.getFraction((float)var1_1, (float)var1_1);
lbl65: // 2 sources:
            var1_1 = (int)var3_10;
        } else {
            var1_1 = 0;
        }
        var2_2 = var1_1;
        if (var1_1 > 0) {
            var10_9 = this.u;
            var2_2 = var1_1 - (var10_9.left + var10_9.right);
        }
        if (var7_8 < var2_2) {
            var2_2 = View.MeasureSpec.makeMeasureSpec((int)var2_2, (int)1073741824);
            var1_1 = var8_6;
        } else lbl-1000: // 3 sources:
        {
            var1_1 = 0;
            var2_2 = var6_11;
        }
        if (var1_1 == 0) return;
        super.onMeasure(var2_2, var5_5);
    }

    public void setAttachListener(a a8) {
    }

    public static interface a {
    }

}


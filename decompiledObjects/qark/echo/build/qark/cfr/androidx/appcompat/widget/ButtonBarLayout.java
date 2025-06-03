/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  java.lang.Math
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package androidx.appcompat.widget;

import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import e.i;

public class ButtonBarLayout
extends LinearLayout {
    public boolean o;
    public int p = -1;
    public int q = 0;

    public ButtonBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, i.n0);
        s.B((View)this, context, i.n0, attributeSet, typedArray, 0, 0);
        this.o = typedArray.getBoolean(i.o0, true);
        typedArray.recycle();
    }

    private void setStacked(boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public final int a(int n8) {
        int n9 = this.getChildCount();
        while (n8 < n9) {
            if (this.getChildAt(n8).getVisibility() == 0) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    public final boolean b() {
        if (this.getOrientation() == 1) {
            return true;
        }
        return false;
    }

    public int getMinimumHeight() {
        return Math.max((int)this.q, (int)super.getMinimumHeight());
    }

    public void onMeasure(int n8, int n9) {
        int n10;
        int n11;
        block15 : {
            block14 : {
                boolean bl;
                block13 : {
                    n11 = View.MeasureSpec.getSize((int)n8);
                    boolean bl2 = this.o;
                    n10 = 0;
                    if (bl2) {
                        if (n11 > this.p && this.b()) {
                            this.setStacked(false);
                        }
                        this.p = n11;
                    }
                    if (!this.b() && View.MeasureSpec.getMode((int)n8) == 1073741824) {
                        n11 = View.MeasureSpec.makeMeasureSpec((int)n11, (int)Integer.MIN_VALUE);
                        bl = true;
                    } else {
                        n11 = n8;
                        bl = false;
                    }
                    super.onMeasure(n11, n9);
                    if (!this.o || this.b() || (this.getMeasuredWidthAndState() & -16777216) != 16777216) break block13;
                    this.setStacked(true);
                    break block14;
                }
                if (!bl) break block15;
            }
            super.onMeasure(n8, n9);
        }
        n11 = this.a(0);
        n8 = n10;
        if (n11 >= 0) {
            View view = this.getChildAt(n11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
            n9 = this.getPaddingTop() + view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.b()) {
                n11 = this.a(n11 + 1);
                n8 = n9;
                if (n11 >= 0) {
                    n8 = n9 + (this.getChildAt(n11).getPaddingTop() + (int)(this.getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                n8 = n9 + this.getPaddingBottom();
            }
        }
        if (s.n((View)this) != n8) {
            this.setMinimumHeight(n8);
        }
    }

    public void setAllowStacking(boolean bl) {
        if (this.o != bl) {
            this.o = bl;
            if (!bl && this.getOrientation() == 1) {
                this.setStacked(false);
            }
            this.requestLayout();
        }
    }
}


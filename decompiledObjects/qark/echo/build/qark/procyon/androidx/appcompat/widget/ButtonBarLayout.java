// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.view.View;
import I.s;
import e.i;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout
{
    public boolean o;
    public int p;
    public int q;
    
    public ButtonBarLayout(@NonNull final Context context, final AttributeSet set) {
        super(context, set);
        this.p = -1;
        this.q = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i.n0);
        s.B((View)this, context, i.n0, set, obtainStyledAttributes, 0, 0);
        this.o = obtainStyledAttributes.getBoolean(i.o0, true);
        obtainStyledAttributes.recycle();
    }
    
    private void setStacked(final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final int a(int i) {
        while (i < ((ViewGroup)this).getChildCount()) {
            if (((ViewGroup)this).getChildAt(i).getVisibility() == 0) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public final boolean b() {
        return this.getOrientation() == 1;
    }
    
    public int getMinimumHeight() {
        return Math.max(this.q, super.getMinimumHeight());
    }
    
    public void onMeasure(int minimumHeight, int n) {
        final int size = View$MeasureSpec.getSize(minimumHeight);
        final boolean o = this.o;
        final int n2 = 0;
        if (o) {
            if (size > this.p && this.b()) {
                this.setStacked(false);
            }
            this.p = size;
        }
        int measureSpec;
        boolean b;
        if (!this.b() && View$MeasureSpec.getMode(minimumHeight) == 1073741824) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            b = true;
        }
        else {
            measureSpec = minimumHeight;
            b = false;
        }
        super.onMeasure(measureSpec, n);
        Label_0129: {
            if (this.o && !this.b() && (((View)this).getMeasuredWidthAndState() & 0xFF000000) == 0x1000000) {
                this.setStacked(true);
            }
            else if (!b) {
                break Label_0129;
            }
            super.onMeasure(minimumHeight, n);
        }
        final int a = this.a(0);
        minimumHeight = n2;
        if (a >= 0) {
            final View child = ((ViewGroup)this).getChildAt(a);
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)child.getLayoutParams();
            n = ((View)this).getPaddingTop() + child.getMeasuredHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin;
            if (this.b()) {
                final int a2 = this.a(a + 1);
                minimumHeight = n;
                if (a2 >= 0) {
                    minimumHeight = n + (((ViewGroup)this).getChildAt(a2).getPaddingTop() + (int)(((View)this).getResources().getDisplayMetrics().density * 16.0f));
                }
            }
            else {
                minimumHeight = n + ((View)this).getPaddingBottom();
            }
        }
        if (s.n((View)this) != minimumHeight) {
            ((View)this).setMinimumHeight(minimumHeight);
        }
    }
    
    public void setAllowStacking(final boolean o) {
        if (this.o != o) {
            this.o = o;
            if (!o && this.getOrientation() == 1) {
                this.setStacked(false);
            }
            ((View)this).requestLayout();
        }
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.View;
import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
    public TypedValue o;
    public TypedValue p;
    public TypedValue q;
    public TypedValue r;
    public TypedValue s;
    public TypedValue t;
    public final Rect u;
    
    public ContentFrameLayout(@NonNull final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ContentFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.u = new Rect();
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
    
    public void onMeasure(int n, int measureSpec) {
        final DisplayMetrics displayMetrics = ((View)this).getContext().getResources().getDisplayMetrics();
        final int widthPixels = displayMetrics.widthPixels;
        final int heightPixels = displayMetrics.heightPixels;
        final int n2 = 1;
        final boolean b = widthPixels < heightPixels;
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(measureSpec);
        int measureSpec2 = 0;
        Label_0207: {
            if (mode == Integer.MIN_VALUE) {
                TypedValue typedValue;
                if (b) {
                    typedValue = this.r;
                }
                else {
                    typedValue = this.q;
                }
                if (typedValue != null) {
                    final int type = typedValue.type;
                    if (type != 0) {
                        int n4 = 0;
                        Label_0154: {
                            float n3;
                            if (type == 5) {
                                n3 = typedValue.getDimension(displayMetrics);
                            }
                            else {
                                if (type != 6) {
                                    n4 = 0;
                                    break Label_0154;
                                }
                                final int widthPixels2 = displayMetrics.widthPixels;
                                n3 = typedValue.getFraction((float)widthPixels2, (float)widthPixels2);
                            }
                            n4 = (int)n3;
                        }
                        if (n4 > 0) {
                            final Rect u = this.u;
                            measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.min(n4 - (u.left + u.right), View$MeasureSpec.getSize(n)), 1073741824);
                            n = 1;
                            break Label_0207;
                        }
                    }
                }
            }
            final int n5 = 0;
            measureSpec2 = n;
            n = n5;
        }
        int measureSpec3 = measureSpec;
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2;
            if (b) {
                typedValue2 = this.s;
            }
            else {
                typedValue2 = this.t;
            }
            measureSpec3 = measureSpec;
            if (typedValue2 != null) {
                final int type2 = typedValue2.type;
                measureSpec3 = measureSpec;
                if (type2 != 0) {
                    int n7 = 0;
                    Label_0313: {
                        float n6;
                        if (type2 == 5) {
                            n6 = typedValue2.getDimension(displayMetrics);
                        }
                        else {
                            if (type2 != 6) {
                                n7 = 0;
                                break Label_0313;
                            }
                            final int heightPixels2 = displayMetrics.heightPixels;
                            n6 = typedValue2.getFraction((float)heightPixels2, (float)heightPixels2);
                        }
                        n7 = (int)n6;
                    }
                    measureSpec3 = measureSpec;
                    if (n7 > 0) {
                        final Rect u2 = this.u;
                        measureSpec3 = View$MeasureSpec.makeMeasureSpec(Math.min(n7 - (u2.top + u2.bottom), View$MeasureSpec.getSize(measureSpec)), 1073741824);
                    }
                }
            }
        }
        super.onMeasure(measureSpec2, measureSpec3);
        final int measuredWidth = ((View)this).getMeasuredWidth();
        final int measureSpec4 = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        Label_0520: {
            if (n == 0 && mode == Integer.MIN_VALUE) {
                TypedValue typedValue3;
                if (b) {
                    typedValue3 = this.p;
                }
                else {
                    typedValue3 = this.o;
                }
                if (typedValue3 != null) {
                    n = typedValue3.type;
                    if (n != 0) {
                        Label_0470: {
                            float n8;
                            if (n == 5) {
                                n8 = typedValue3.getDimension(displayMetrics);
                            }
                            else {
                                if (n != 6) {
                                    n = 0;
                                    break Label_0470;
                                }
                                n = displayMetrics.widthPixels;
                                n8 = typedValue3.getFraction((float)n, (float)n);
                            }
                            n = (int)n8;
                        }
                        measureSpec = n;
                        if (n > 0) {
                            final Rect u3 = this.u;
                            measureSpec = n - (u3.left + u3.right);
                        }
                        if (measuredWidth < measureSpec) {
                            measureSpec = View$MeasureSpec.makeMeasureSpec(measureSpec, 1073741824);
                            n = n2;
                            break Label_0520;
                        }
                    }
                }
            }
            n = 0;
            measureSpec = measureSpec4;
        }
        if (n != 0) {
            super.onMeasure(measureSpec, measureSpec3);
        }
    }
    
    public void setAttachListener(final a a) {
    }
    
    public interface a
    {
    }
}

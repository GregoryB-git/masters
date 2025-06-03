/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.appcompat.widget;

import I.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import e.e;
import e.f;
import e.i;
import l.X;
import l.d0;

public class ActionBarContextView
extends l.a {
    public TextView A;
    public TextView B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public CharSequence v;
    public CharSequence w;
    public View x;
    public View y;
    public LinearLayout z;

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.d);
    }

    public ActionBarContextView(Context object, AttributeSet attributeSet, int n8) {
        super((Context)object, attributeSet, n8);
        object = X.s((Context)object, attributeSet, i.w, n8, 0);
        s.E((View)this, object.f(i.x));
        this.C = object.l(i.B, 0);
        this.D = object.l(i.A, 0);
        this.s = object.k(i.z, 0);
        this.F = object.l(i.y, f.d);
        object.t();
    }

    public final void d() {
        LinearLayout linearLayout;
        int n8;
        block8 : {
            block7 : {
                if (this.z == null) {
                    LayoutInflater.from((Context)this.getContext()).inflate(f.a, (ViewGroup)this);
                    this.z = linearLayout = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
                    this.A = (TextView)linearLayout.findViewById(e.e);
                    this.B = (TextView)this.z.findViewById(e.d);
                    if (this.C != 0) {
                        this.A.setTextAppearance(this.getContext(), this.C);
                    }
                    if (this.D != 0) {
                        this.B.setTextAppearance(this.getContext(), this.D);
                    }
                }
                this.A.setText(this.v);
                this.B.setText(this.w);
                boolean bl = TextUtils.isEmpty((CharSequence)this.v);
                boolean bl2 = TextUtils.isEmpty((CharSequence)this.w) ^ true;
                linearLayout = this.B;
                int n9 = 8;
                n8 = bl2 ? 0 : 8;
                linearLayout.setVisibility(n8);
                linearLayout = this.z;
                if (bl ^ true) break block7;
                n8 = n9;
                if (!bl2) break block8;
            }
            n8 = 0;
        }
        linearLayout.setVisibility(n8);
        if (this.z.getParent() == null) {
            this.addView((View)this.z);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet);
    }

    public CharSequence getSubtitle() {
        return this.w;
    }

    public CharSequence getTitle() {
        return this.v;
    }

    public void onDetachedFromWindow() {
        ViewGroup.super.onDetachedFromWindow();
        a a8 = this.r;
        if (a8 != null) {
            a8.z();
            this.r.A();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource((View)this);
            accessibilityEvent.setClassName((CharSequence)this.getClass().getName());
            accessibilityEvent.setPackageName((CharSequence)this.getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.v);
            return;
        }
        ViewGroup.super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        bl = d0.a((View)this);
        int n12 = bl ? n10 - n8 - this.getPaddingRight() : this.getPaddingLeft();
        int n13 = this.getPaddingTop();
        int n14 = n11 - n9 - this.getPaddingTop() - this.getPaddingBottom();
        Object object = this.x;
        n9 = n12;
        if (object != null) {
            n9 = n12;
            if (object.getVisibility() != 8) {
                object = (ViewGroup.MarginLayoutParams)this.x.getLayoutParams();
                n9 = bl ? object.rightMargin : object.leftMargin;
                n11 = bl ? object.leftMargin : object.rightMargin;
                n9 = l.a.b(n12, n9, bl);
                n9 = l.a.b(n9 + this.c(this.x, n9, n13, n14, bl), n11, bl);
            }
        }
        object = this.z;
        n11 = n9;
        if (object != null) {
            n11 = n9;
            if (this.y == null) {
                n11 = n9;
                if (object.getVisibility() != 8) {
                    n11 = n9 + this.c((View)this.z, n9, n13, n14, bl);
                }
            }
        }
        if ((object = this.y) != null) {
            this.c((View)object, n11, n13, n14, bl);
        }
        n8 = bl ? this.getPaddingLeft() : n10 - n8 - this.getPaddingRight();
        object = this.q;
        if (object != null) {
            this.c((View)object, n8, n13, n14, bl ^ true);
        }
    }

    public void onMeasure(int n8, int n9) {
        int n10 = View.MeasureSpec.getMode((int)n8);
        int n11 = 1073741824;
        if (n10 == 1073741824) {
            if (View.MeasureSpec.getMode((int)n9) != 0) {
                int n12;
                int n13 = View.MeasureSpec.getSize((int)n8);
                n10 = this.s;
                if (n10 <= 0) {
                    n10 = View.MeasureSpec.getSize((int)n9);
                }
                int n14 = this.getPaddingTop() + this.getPaddingBottom();
                n8 = n13 - this.getPaddingLeft() - this.getPaddingRight();
                int n15 = n10 - n14;
                int n16 = View.MeasureSpec.makeMeasureSpec((int)n15, (int)Integer.MIN_VALUE);
                Object object = this.x;
                int n17 = 0;
                n9 = n8;
                if (object != null) {
                    n8 = this.a((View)object, n8, n16, 0);
                    object = (ViewGroup.MarginLayoutParams)this.x.getLayoutParams();
                    n9 = n8 - (object.leftMargin + object.rightMargin);
                }
                object = this.q;
                n8 = n9;
                if (object != null) {
                    n8 = n9;
                    if (object.getParent() == this) {
                        n8 = this.a((View)this.q, n9, n16, 0);
                    }
                }
                object = this.z;
                n9 = n8;
                if (object != null) {
                    n9 = n8;
                    if (this.y == null) {
                        if (this.E) {
                            n9 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                            this.z.measure(n9, n16);
                            n12 = this.z.getMeasuredWidth();
                            n16 = n12 <= n8 ? 1 : 0;
                            n9 = n8;
                            if (n16 != 0) {
                                n9 = n8 - n12;
                            }
                            object = this.z;
                            n8 = n16 != 0 ? 0 : 8;
                            object.setVisibility(n8);
                        } else {
                            n9 = this.a((View)object, n8, n16, 0);
                        }
                    }
                }
                if ((object = this.y) != null) {
                    object = object.getLayoutParams();
                    n12 = object.width;
                    n8 = n12 != -2 ? 1073741824 : Integer.MIN_VALUE;
                    n16 = n9;
                    if (n12 >= 0) {
                        n16 = Math.min((int)n12, (int)n9);
                    }
                    n9 = (n12 = object.height) != -2 ? n11 : Integer.MIN_VALUE;
                    n11 = n15;
                    if (n12 >= 0) {
                        n11 = Math.min((int)n12, (int)n15);
                    }
                    this.y.measure(View.MeasureSpec.makeMeasureSpec((int)n16, (int)n8), View.MeasureSpec.makeMeasureSpec((int)n11, (int)n9));
                }
                if (this.s <= 0) {
                    n11 = this.getChildCount();
                    n9 = 0;
                    for (n8 = n17; n8 < n11; ++n8) {
                        n16 = this.getChildAt(n8).getMeasuredHeight() + n14;
                        n10 = n9;
                        if (n16 > n9) {
                            n10 = n16;
                        }
                        n9 = n10;
                    }
                    this.setMeasuredDimension(n13, n9);
                    return;
                }
                this.setMeasuredDimension(n13, n10);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public void setContentHeight(int n8) {
        this.s = n8;
    }

    public void setCustomView(View view) {
        View view2 = this.y;
        if (view2 != null) {
            this.removeView(view2);
        }
        this.y = view;
        if (view != null && (view2 = this.z) != null) {
            this.removeView(view2);
            this.z = null;
        }
        if (view != null) {
            this.addView(view);
        }
        this.requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.w = charSequence;
        this.d();
    }

    public void setTitle(CharSequence charSequence) {
        this.v = charSequence;
        this.d();
    }

    public void setTitleOptional(boolean bl) {
        if (bl != this.E) {
            this.requestLayout();
        }
        this.E = bl;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}


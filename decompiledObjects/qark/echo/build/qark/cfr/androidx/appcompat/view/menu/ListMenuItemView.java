/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView
 *  android.widget.AbsListView$SelectionBoundsAdjuster
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RadioButton
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.appcompat.view.menu;

import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import e.a;
import e.f;
import e.i;
import l.X;

public class ListMenuItemView
extends LinearLayout
implements h.a,
AbsListView.SelectionBoundsAdjuster {
    public boolean A;
    public Drawable B;
    public boolean C;
    public LayoutInflater D;
    public boolean E;
    public e o;
    public ImageView p;
    public RadioButton q;
    public TextView r;
    public CheckBox s;
    public TextView t;
    public ImageView u;
    public ImageView v;
    public LinearLayout w;
    public Drawable x;
    public int y;
    public Context z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.o);
    }

    public ListMenuItemView(Context context, AttributeSet object, int n8) {
        super(context, (AttributeSet)object);
        object = X.s(this.getContext(), (AttributeSet)object, i.r1, n8, 0);
        this.x = object.f(i.t1);
        this.y = object.l(i.s1, -1);
        this.A = object.a(i.u1, false);
        this.z = context;
        this.B = object.f(i.v1);
        context = context.getTheme();
        n8 = a.n;
        context = context.obtainStyledAttributes(null, new int[]{16843049}, n8, 0);
        this.C = context.hasValue(0);
        object.t();
        context.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.D == null) {
            this.D = LayoutInflater.from((Context)this.getContext());
        }
        return this.D;
    }

    private void setSubMenuArrowVisible(boolean bl) {
        ImageView imageView = this.u;
        if (imageView != null) {
            int n8 = bl ? 0 : 8;
            imageView.setVisibility(n8);
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.v;
        if (imageView != null && imageView.getVisibility() == 0) {
            imageView = (LinearLayout.LayoutParams)this.v.getLayoutParams();
            rect.top += this.v.getHeight() + imageView.topMargin + imageView.bottomMargin;
        }
    }

    public final void b(View view) {
        this.c(view, -1);
    }

    public final void c(View view, int n8) {
        LinearLayout linearLayout = this.w;
        if (linearLayout != null) {
            linearLayout.addView(view, n8);
            return;
        }
        this.addView(view, n8);
    }

    @Override
    public void d(e e8, int n8) {
        this.o = e8;
        n8 = e8.isVisible() ? 0 : 8;
        this.setVisibility(n8);
        this.setTitle(e8.h(this));
        this.setCheckable(e8.isCheckable());
        this.h(e8.z(), e8.e());
        this.setIcon(e8.getIcon());
        this.setEnabled(e8.isEnabled());
        this.setSubMenuArrowVisible(e8.hasSubMenu());
        this.setContentDescription(e8.getContentDescription());
    }

    public final void e() {
        CheckBox checkBox;
        this.s = checkBox = (CheckBox)this.getInflater().inflate(f.f, (ViewGroup)this, false);
        this.b((View)checkBox);
    }

    public final void f() {
        ImageView imageView;
        this.p = imageView = (ImageView)this.getInflater().inflate(f.g, (ViewGroup)this, false);
        this.c((View)imageView, 0);
    }

    public final void g() {
        RadioButton radioButton;
        this.q = radioButton = (RadioButton)this.getInflater().inflate(f.h, (ViewGroup)this, false);
        this.b((View)radioButton);
    }

    @Override
    public e getItemData() {
        return this.o;
    }

    public void h(boolean bl, char c8) {
        c8 = bl && this.o.z() ? '\u0000' : (char)8;
        if (c8 == '\u0000') {
            this.t.setText((CharSequence)this.o.f());
        }
        if (this.t.getVisibility() != c8) {
            this.t.setVisibility((int)c8);
        }
    }

    public void onFinishInflate() {
        TextView textView;
        super.onFinishInflate();
        s.E((View)this, this.x);
        this.r = textView = (TextView)this.findViewById(e.e.A);
        int n8 = this.y;
        if (n8 != -1) {
            textView.setTextAppearance(this.z, n8);
        }
        this.t = (TextView)this.findViewById(e.e.v);
        textView = (ImageView)this.findViewById(e.e.y);
        this.u = textView;
        if (textView != null) {
            textView.setImageDrawable(this.B);
        }
        this.v = (ImageView)this.findViewById(e.e.l);
        this.w = (LinearLayout)this.findViewById(e.e.h);
    }

    public void onMeasure(int n8, int n9) {
        if (this.p != null && this.A) {
            ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams)this.p.getLayoutParams();
            int n10 = layoutParams.height;
            if (n10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = n10;
            }
        }
        super.onMeasure(n8, n9);
    }

    public void setCheckable(boolean bl) {
        CheckBox checkBox;
        RadioButton radioButton;
        if (!bl && this.q == null && this.s == null) {
            return;
        }
        if (this.o.l()) {
            if (this.q == null) {
                this.g();
            }
            radioButton = this.q;
            checkBox = this.s;
        } else {
            if (this.s == null) {
                this.e();
            }
            radioButton = this.s;
            checkBox = this.q;
        }
        if (bl) {
            radioButton.setChecked(this.o.isChecked());
            if (radioButton.getVisibility() != 0) {
                radioButton.setVisibility(0);
            }
            if (checkBox != null && checkBox.getVisibility() != 8) {
                checkBox.setVisibility(8);
                return;
            }
        } else {
            radioButton = this.s;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
            if ((radioButton = this.q) != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean bl) {
        RadioButton radioButton;
        if (this.o.l()) {
            if (this.q == null) {
                this.g();
            }
            radioButton = this.q;
        } else {
            if (this.s == null) {
                this.e();
            }
            radioButton = this.s;
        }
        radioButton.setChecked(bl);
    }

    public void setForceShowIcon(boolean bl) {
        this.E = bl;
        this.A = bl;
    }

    public void setGroupDividerEnabled(boolean bl) {
        ImageView imageView = this.v;
        if (imageView != null) {
            int n8 = !this.C && bl ? 0 : 8;
            imageView.setVisibility(n8);
        }
    }

    public void setIcon(Drawable drawable2) {
        boolean bl = this.o.y() || this.E;
        if (!bl && !this.A) {
            return;
        }
        ImageView imageView = this.p;
        if (imageView == null && drawable2 == null && !this.A) {
            return;
        }
        if (imageView == null) {
            this.f();
        }
        if (drawable2 == null && !this.A) {
            this.p.setVisibility(8);
            return;
        }
        imageView = this.p;
        if (!bl) {
            drawable2 = null;
        }
        imageView.setImageDrawable(drawable2);
        if (this.p.getVisibility() != 0) {
            this.p.setVisibility(0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setTitle(CharSequence charSequence) {
        int n8;
        if (charSequence != null) {
            this.r.setText(charSequence);
            if (this.r.getVisibility() == 0) {
                return;
            }
            charSequence = this.r;
            n8 = 0;
        } else {
            int n9 = this.r.getVisibility();
            n8 = 8;
            if (n9 == 8) return;
            charSequence = this.r;
        }
        charSequence.setVisibility(n8);
    }
}


// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import android.widget.CompoundButton;
import android.view.ViewGroup$LayoutParams;
import I.s;
import android.view.ViewGroup;
import e.f;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Rect;
import android.content.res.TypedArray;
import android.content.res.Resources$Theme;
import l.X;
import e.i;
import e.a;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.widget.AbsListView$SelectionBoundsAdjuster;
import android.widget.LinearLayout;

public class ListMenuItemView extends LinearLayout implements a, AbsListView$SelectionBoundsAdjuster
{
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
    
    public ListMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, e.a.o);
    }
    
    public ListMenuItemView(final Context z, final AttributeSet set, int n) {
        super(z, set);
        final X s = X.s(((View)this).getContext(), set, i.r1, n, 0);
        this.x = s.f(i.t1);
        this.y = s.l(i.s1, -1);
        this.A = s.a(i.u1, false);
        this.z = z;
        this.B = s.f(i.v1);
        final Resources$Theme theme = z.getTheme();
        n = e.a.n;
        final TypedArray obtainStyledAttributes = theme.obtainStyledAttributes((AttributeSet)null, new int[] { 16843049 }, n, 0);
        this.C = obtainStyledAttributes.hasValue(0);
        s.t();
        obtainStyledAttributes.recycle();
    }
    
    private LayoutInflater getInflater() {
        if (this.D == null) {
            this.D = LayoutInflater.from(((View)this).getContext());
        }
        return this.D;
    }
    
    private void setSubMenuArrowVisible(final boolean b) {
        final ImageView u = this.u;
        if (u != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            u.setVisibility(visibility);
        }
    }
    
    public boolean a() {
        return false;
    }
    
    public void adjustListItemSelectionBounds(final Rect rect) {
        final ImageView v = this.v;
        if (v != null && ((View)v).getVisibility() == 0) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((View)this.v).getLayoutParams();
            rect.top += ((View)this.v).getHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin;
        }
    }
    
    public final void b(final View view) {
        this.c(view, -1);
    }
    
    public final void c(final View view, final int n) {
        final LinearLayout w = this.w;
        if (w != null) {
            ((ViewGroup)w).addView(view, n);
            return;
        }
        ((ViewGroup)this).addView(view, n);
    }
    
    public void d(final e o, int visibility) {
        this.o = o;
        if (o.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)this).setVisibility(visibility);
        this.setTitle(o.h(this));
        this.setCheckable(o.isCheckable());
        this.h(o.z(), o.e());
        this.setIcon(o.getIcon());
        ((View)this).setEnabled(o.isEnabled());
        this.setSubMenuArrowVisible(o.hasSubMenu());
        ((View)this).setContentDescription(o.getContentDescription());
    }
    
    public final void e() {
        this.b((View)(this.s = (CheckBox)this.getInflater().inflate(f.f, (ViewGroup)this, false)));
    }
    
    public final void f() {
        this.c((View)(this.p = (ImageView)this.getInflater().inflate(f.g, (ViewGroup)this, false)), 0);
    }
    
    public final void g() {
        this.b((View)(this.q = (RadioButton)this.getInflater().inflate(f.h, (ViewGroup)this, false)));
    }
    
    public e getItemData() {
        return this.o;
    }
    
    public void h(final boolean b, final char c) {
        int visibility;
        if (b && this.o.z()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        if (visibility == 0) {
            this.t.setText((CharSequence)this.o.f());
        }
        if (((View)this.t).getVisibility() != visibility) {
            ((View)this.t).setVisibility(visibility);
        }
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        I.s.E((View)this, this.x);
        final TextView r = (TextView)((View)this).findViewById(e.e.A);
        this.r = r;
        final int y = this.y;
        if (y != -1) {
            r.setTextAppearance(this.z, y);
        }
        this.t = (TextView)((View)this).findViewById(e.e.v);
        final ImageView u = (ImageView)((View)this).findViewById(e.e.y);
        if ((this.u = u) != null) {
            u.setImageDrawable(this.B);
        }
        this.v = (ImageView)((View)this).findViewById(e.e.l);
        this.w = (LinearLayout)((View)this).findViewById(e.e.h);
    }
    
    public void onMeasure(final int n, final int n2) {
        if (this.p != null && this.A) {
            final ViewGroup$LayoutParams layoutParams = ((View)this).getLayoutParams();
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((View)this.p).getLayoutParams();
            final int height = layoutParams.height;
            if (height > 0 && linearLayout$LayoutParams.width <= 0) {
                linearLayout$LayoutParams.width = height;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public void setCheckable(final boolean b) {
        if (!b && this.q == null && this.s == null) {
            return;
        }
        Object o;
        Object o2;
        if (this.o.l()) {
            if (this.q == null) {
                this.g();
            }
            o = this.q;
            o2 = this.s;
        }
        else {
            if (this.s == null) {
                this.e();
            }
            o = this.s;
            o2 = this.q;
        }
        if (b) {
            ((CompoundButton)o).setChecked(this.o.isChecked());
            if (((View)o).getVisibility() != 0) {
                ((View)o).setVisibility(0);
            }
            if (o2 != null && ((View)o2).getVisibility() != 8) {
                ((View)o2).setVisibility(8);
            }
        }
        else {
            final CheckBox s = this.s;
            if (s != null) {
                ((View)s).setVisibility(8);
            }
            final RadioButton q = this.q;
            if (q != null) {
                ((View)q).setVisibility(8);
            }
        }
    }
    
    public void setChecked(final boolean checked) {
        Object o;
        if (this.o.l()) {
            if (this.q == null) {
                this.g();
            }
            o = this.q;
        }
        else {
            if (this.s == null) {
                this.e();
            }
            o = this.s;
        }
        ((CompoundButton)o).setChecked(checked);
    }
    
    public void setForceShowIcon(final boolean b) {
        this.E = b;
        this.A = b;
    }
    
    public void setGroupDividerEnabled(final boolean b) {
        final ImageView v = this.v;
        if (v != null) {
            int visibility;
            if (!this.C && b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            v.setVisibility(visibility);
        }
    }
    
    public void setIcon(Drawable imageDrawable) {
        final boolean b = this.o.y() || this.E;
        if (!b && !this.A) {
            return;
        }
        final ImageView p = this.p;
        if (p == null && imageDrawable == null && !this.A) {
            return;
        }
        if (p == null) {
            this.f();
        }
        if (imageDrawable == null && !this.A) {
            this.p.setVisibility(8);
            return;
        }
        final ImageView p2 = this.p;
        if (!b) {
            imageDrawable = null;
        }
        p2.setImageDrawable(imageDrawable);
        if (((View)this.p).getVisibility() != 0) {
            this.p.setVisibility(0);
        }
    }
    
    public void setTitle(final CharSequence text) {
        TextView textView;
        int visibility;
        if (text != null) {
            this.r.setText(text);
            if (((View)this.r).getVisibility() == 0) {
                return;
            }
            textView = this.r;
            visibility = 0;
        }
        else {
            final int visibility2 = ((View)this.r).getVisibility();
            visibility = 8;
            if (visibility2 == 8) {
                return;
            }
            textView = this.r;
        }
        ((View)textView).setVisibility(visibility);
    }
}

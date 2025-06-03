package androidx.appcompat.view.menu;

import I.AbstractC0421s;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import e.AbstractC1230a;
import e.AbstractC1234e;
import e.AbstractC1235f;
import e.AbstractC1238i;
import l.X;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements h.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    public boolean f8373A;

    /* renamed from: B, reason: collision with root package name */
    public Drawable f8374B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8375C;

    /* renamed from: D, reason: collision with root package name */
    public LayoutInflater f8376D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8377E;

    /* renamed from: o, reason: collision with root package name */
    public e f8378o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f8379p;

    /* renamed from: q, reason: collision with root package name */
    public RadioButton f8380q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f8381r;

    /* renamed from: s, reason: collision with root package name */
    public CheckBox f8382s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f8383t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f8384u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f8385v;

    /* renamed from: w, reason: collision with root package name */
    public LinearLayout f8386w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f8387x;

    /* renamed from: y, reason: collision with root package name */
    public int f8388y;

    /* renamed from: z, reason: collision with root package name */
    public Context f8389z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1230a.f13344o);
    }

    private LayoutInflater getInflater() {
        if (this.f8376D == null) {
            this.f8376D = LayoutInflater.from(getContext());
        }
        return this.f8376D;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        ImageView imageView = this.f8384u;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean a() {
        return false;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f8385v;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8385v.getLayoutParams();
        rect.top += this.f8385v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view) {
        c(view, -1);
    }

    public final void c(View view, int i7) {
        LinearLayout linearLayout = this.f8386w;
        if (linearLayout != null) {
            linearLayout.addView(view, i7);
        } else {
            addView(view, i7);
        }
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void d(e eVar, int i7) {
        this.f8378o = eVar;
        setVisibility(eVar.isVisible() ? 0 : 8);
        setTitle(eVar.h(this));
        setCheckable(eVar.isCheckable());
        h(eVar.z(), eVar.e());
        setIcon(eVar.getIcon());
        setEnabled(eVar.isEnabled());
        setSubMenuArrowVisible(eVar.hasSubMenu());
        setContentDescription(eVar.getContentDescription());
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC1235f.f13444f, (ViewGroup) this, false);
        this.f8382s = checkBox;
        b(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC1235f.f13445g, (ViewGroup) this, false);
        this.f8379p = imageView;
        c(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC1235f.f13446h, (ViewGroup) this, false);
        this.f8380q = radioButton;
        b(radioButton);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public e getItemData() {
        return this.f8378o;
    }

    public void h(boolean z7, char c7) {
        int i7 = (z7 && this.f8378o.z()) ? 0 : 8;
        if (i7 == 0) {
            this.f8383t.setText(this.f8378o.f());
        }
        if (this.f8383t.getVisibility() != i7) {
            this.f8383t.setVisibility(i7);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        AbstractC0421s.E(this, this.f8387x);
        TextView textView = (TextView) findViewById(AbstractC1234e.f13411A);
        this.f8381r = textView;
        int i7 = this.f8388y;
        if (i7 != -1) {
            textView.setTextAppearance(this.f8389z, i7);
        }
        this.f8383t = (TextView) findViewById(AbstractC1234e.f13434v);
        ImageView imageView = (ImageView) findViewById(AbstractC1234e.f13437y);
        this.f8384u = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f8374B);
        }
        this.f8385v = (ImageView) findViewById(AbstractC1234e.f13424l);
        this.f8386w = (LinearLayout) findViewById(AbstractC1234e.f13420h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        if (this.f8379p != null && this.f8373A) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f8379p.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f8380q == null && this.f8382s == null) {
            return;
        }
        if (this.f8378o.l()) {
            if (this.f8380q == null) {
                g();
            }
            compoundButton = this.f8380q;
            view = this.f8382s;
        } else {
            if (this.f8382s == null) {
                e();
            }
            compoundButton = this.f8382s;
            view = this.f8380q;
        }
        if (z7) {
            compoundButton.setChecked(this.f8378o.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f8382s;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f8380q;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if (this.f8378o.l()) {
            if (this.f8380q == null) {
                g();
            }
            compoundButton = this.f8380q;
        } else {
            if (this.f8382s == null) {
                e();
            }
            compoundButton = this.f8382s;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.f8377E = z7;
        this.f8373A = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        ImageView imageView = this.f8385v;
        if (imageView != null) {
            imageView.setVisibility((this.f8375C || !z7) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z7 = this.f8378o.y() || this.f8377E;
        if (z7 || this.f8373A) {
            ImageView imageView = this.f8379p;
            if (imageView == null && drawable == null && !this.f8373A) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f8373A) {
                this.f8379p.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f8379p;
            if (!z7) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f8379p.getVisibility() != 0) {
                this.f8379p.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i7;
        TextView textView;
        if (charSequence != null) {
            this.f8381r.setText(charSequence);
            if (this.f8381r.getVisibility() == 0) {
                return;
            }
            textView = this.f8381r;
            i7 = 0;
        } else {
            i7 = 8;
            if (this.f8381r.getVisibility() == 8) {
                return;
            } else {
                textView = this.f8381r;
            }
        }
        textView.setVisibility(i7);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        X s7 = X.s(getContext(), attributeSet, AbstractC1238i.f13635r1, i7, 0);
        this.f8387x = s7.f(AbstractC1238i.f13643t1);
        this.f8388y = s7.l(AbstractC1238i.f13639s1, -1);
        this.f8373A = s7.a(AbstractC1238i.f13647u1, false);
        this.f8389z = context;
        this.f8374B = s7.f(AbstractC1238i.f13651v1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC1230a.f13343n, 0);
        this.f8375C = obtainStyledAttributes.hasValue(0);
        s7.t();
        obtainStyledAttributes.recycle();
    }
}

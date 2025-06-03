package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import b.a0;
import l.b1;
import l.d0;
import l.l0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends d0 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: p, reason: collision with root package name */
    public h f592p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f593q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f594r;

    /* renamed from: s, reason: collision with root package name */
    public f.b f595s;
    public a t;

    /* renamed from: u, reason: collision with root package name */
    public b f596u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f597v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f598w;

    /* renamed from: x, reason: collision with root package name */
    public int f599x;

    /* renamed from: y, reason: collision with root package name */
    public int f600y;

    /* renamed from: z, reason: collision with root package name */
    public int f601z;

    public class a extends l0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // l.l0
        public final k.f b() {
            a.C0012a c0012a;
            b bVar = ActionMenuItemView.this.f596u;
            if (bVar == null || (c0012a = androidx.appcompat.widget.a.this.B) == null) {
                return null;
            }
            return c0012a.a();
        }

        @Override // l.l0
        public final boolean c() {
            k.f b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.f595s;
            return bVar != null && bVar.a(actionMenuItemView.f592p) && (b10 = b()) != null && b10.a();
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f597v = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f1575p, 0, 0);
        this.f599x = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f601z = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f600y = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return l();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return l() && this.f592p.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        this.f592p = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f691a);
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.t == null) {
            this.t = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f592p;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void n() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f593q);
        if (this.f594r != null) {
            if (!((this.f592p.f713y & 4) == 4) || (!this.f597v && !this.f598w)) {
                z10 = false;
            }
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f593q : null);
        CharSequence charSequence = this.f592p.f706q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z12 ? null : this.f592p.f695e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f592p.f707r;
        if (TextUtils.isEmpty(charSequence2)) {
            b1.a(this, z12 ? null : this.f592p.f695e);
        } else {
            b1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.f595s;
        if (bVar != null) {
            bVar.a(this.f592p);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f597v = m();
        n();
    }

    @Override // l.d0, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean l10 = l();
        if (l10 && (i12 = this.f600y) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f599x) : this.f599x;
        if (mode != 1073741824 && this.f599x > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (l10 || this.f594r == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f594r.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f592p.hasSubMenu() && (aVar = this.t) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f598w != z10) {
            this.f598w = z10;
            h hVar = this.f592p;
            if (hVar != null) {
                f fVar = hVar.f703n;
                fVar.f674k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f594r = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f601z;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(f.b bVar) {
        this.f595s = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f600y = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f596u = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f593q = charSequence;
        n();
    }
}

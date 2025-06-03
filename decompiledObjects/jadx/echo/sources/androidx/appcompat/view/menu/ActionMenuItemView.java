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
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionMenuView;
import e.AbstractC1238i;
import l.AbstractViewOnTouchListenerC1497E;
import l.C1523w;
import l.Z;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1523w implements h.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: A, reason: collision with root package name */
    public int f8358A;

    /* renamed from: B, reason: collision with root package name */
    public int f8359B;

    /* renamed from: C, reason: collision with root package name */
    public int f8360C;

    /* renamed from: s, reason: collision with root package name */
    public e f8361s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f8362t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f8363u;

    /* renamed from: v, reason: collision with root package name */
    public d.b f8364v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractViewOnTouchListenerC1497E f8365w;

    /* renamed from: x, reason: collision with root package name */
    public b f8366x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8367y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8368z;

    public class a extends AbstractViewOnTouchListenerC1497E {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // l.AbstractViewOnTouchListenerC1497E
        public k.c b() {
            b bVar = ActionMenuItemView.this.f8366x;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // l.AbstractViewOnTouchListenerC1497E
        public boolean c() {
            k.c b7;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            d.b bVar = actionMenuItemView.f8364v;
            return bVar != null && bVar.a(actionMenuItemView.f8361s) && (b7 = b()) != null && b7.i();
        }
    }

    public static abstract class b {
        public abstract k.c a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean a() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return f() && this.f8361s.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void d(e eVar, int i7) {
        this.f8361s = eVar;
        setIcon(eVar.getIcon());
        setTitle(eVar.h(this));
        setId(eVar.getItemId());
        setVisibility(eVar.isVisible() ? 0 : 8);
        setEnabled(eVar.isEnabled());
        if (eVar.hasSubMenu() && this.f8365w == null) {
            this.f8365w = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        return i7 >= 480 || (i7 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public e getItemData() {
        return this.f8361s;
    }

    public final void h() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f8362t);
        if (this.f8363u != null && (!this.f8361s.A() || (!this.f8367y && !this.f8368z))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        setText(z9 ? this.f8362t : null);
        CharSequence contentDescription = this.f8361s.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z9 ? null : this.f8361s.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f8361s.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            Z.a(this, z9 ? null : this.f8361s.getTitle());
        } else {
            Z.a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d.b bVar = this.f8364v;
        if (bVar != null) {
            bVar.a(this.f8361s);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8367y = g();
        h();
    }

    @Override // l.C1523w, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        boolean f7 = f();
        if (f7 && (i9 = this.f8359B) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f8358A) : this.f8358A;
        if (mode != 1073741824 && this.f8358A > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i8);
        }
        if (f7 || this.f8363u == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f8363u.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC1497E abstractViewOnTouchListenerC1497E;
        if (this.f8361s.hasSubMenu() && (abstractViewOnTouchListenerC1497E = this.f8365w) != null && abstractViewOnTouchListenerC1497E.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }

    public void setExpandedFormat(boolean z7) {
        if (this.f8368z != z7) {
            this.f8368z = z7;
            e eVar = this.f8361s;
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8363u = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f8360C;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(d.b bVar) {
        this.f8364v = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
        this.f8359B = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(b bVar) {
        this.f8366x = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f8362t = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.f8367y = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1238i.f13641t, i7, 0);
        this.f8358A = obtainStyledAttributes.getDimensionPixelSize(AbstractC1238i.f13645u, 0);
        obtainStyledAttributes.recycle();
        this.f8360C = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f8359B = -1;
        setSaveEnabled(false);
    }
}

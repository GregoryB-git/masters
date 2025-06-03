package androidx.appcompat.widget;

import I.AbstractC0408e;
import I.AbstractC0411h;
import I.AbstractC0421s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import e.AbstractC1230a;
import e.AbstractC1238i;
import f.AbstractC1279a;
import g.AbstractC1294a;
import j.C1367c;
import j.InterfaceC1366b;
import java.util.ArrayList;
import java.util.List;
import l.C1508g;
import l.C1523w;
import l.InterfaceC1493A;
import l.O;
import l.X;
import l.d0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f8697A;

    /* renamed from: B, reason: collision with root package name */
    public int f8698B;

    /* renamed from: C, reason: collision with root package name */
    public int f8699C;

    /* renamed from: D, reason: collision with root package name */
    public int f8700D;

    /* renamed from: E, reason: collision with root package name */
    public int f8701E;

    /* renamed from: F, reason: collision with root package name */
    public int f8702F;

    /* renamed from: G, reason: collision with root package name */
    public int f8703G;

    /* renamed from: H, reason: collision with root package name */
    public O f8704H;

    /* renamed from: I, reason: collision with root package name */
    public int f8705I;

    /* renamed from: J, reason: collision with root package name */
    public int f8706J;

    /* renamed from: K, reason: collision with root package name */
    public int f8707K;

    /* renamed from: L, reason: collision with root package name */
    public CharSequence f8708L;

    /* renamed from: M, reason: collision with root package name */
    public CharSequence f8709M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f8710N;

    /* renamed from: O, reason: collision with root package name */
    public ColorStateList f8711O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f8712P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f8713Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f8714R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f8715S;

    /* renamed from: T, reason: collision with root package name */
    public final int[] f8716T;

    /* renamed from: U, reason: collision with root package name */
    public final ActionMenuView.e f8717U;

    /* renamed from: V, reason: collision with root package name */
    public androidx.appcompat.widget.d f8718V;

    /* renamed from: W, reason: collision with root package name */
    public androidx.appcompat.widget.a f8719W;

    /* renamed from: a0, reason: collision with root package name */
    public d f8720a0;

    /* renamed from: b0, reason: collision with root package name */
    public g.a f8721b0;

    /* renamed from: c0, reason: collision with root package name */
    public d.a f8722c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f8723d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Runnable f8724e0;

    /* renamed from: o, reason: collision with root package name */
    public ActionMenuView f8725o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f8726p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f8727q;

    /* renamed from: r, reason: collision with root package name */
    public ImageButton f8728r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f8729s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f8730t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f8731u;

    /* renamed from: v, reason: collision with root package name */
    public ImageButton f8732v;

    /* renamed from: w, reason: collision with root package name */
    public View f8733w;

    /* renamed from: x, reason: collision with root package name */
    public Context f8734x;

    /* renamed from: y, reason: collision with root package name */
    public int f8735y;

    /* renamed from: z, reason: collision with root package name */
    public int f8736z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.H();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.d();
        }
    }

    public class d implements androidx.appcompat.view.menu.g {

        /* renamed from: o, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f8740o;

        /* renamed from: p, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f8741p;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.g
        public void b(androidx.appcompat.view.menu.d dVar, boolean z7) {
        }

        @Override // androidx.appcompat.view.menu.g
        public void c(Context context, androidx.appcompat.view.menu.d dVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.d dVar2 = this.f8740o;
            if (dVar2 != null && (eVar = this.f8741p) != null) {
                dVar2.e(eVar);
            }
            this.f8740o = dVar;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean e(j jVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g
        public void f(boolean z7) {
            if (this.f8741p != null) {
                androidx.appcompat.view.menu.d dVar = this.f8740o;
                if (dVar != null) {
                    int size = dVar.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.f8740o.getItem(i7) == this.f8741p) {
                            return;
                        }
                    }
                }
                h(this.f8740o, this.f8741p);
            }
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean h(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.e eVar) {
            KeyEvent.Callback callback = Toolbar.this.f8733w;
            if (callback instanceof InterfaceC1366b) {
                ((InterfaceC1366b) callback).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f8733w);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f8732v);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f8733w = null;
            toolbar3.a();
            this.f8741p = null;
            Toolbar.this.requestLayout();
            eVar.q(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean j(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.e eVar) {
            Toolbar.this.e();
            ViewParent parent = Toolbar.this.f8732v.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f8732v);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f8732v);
            }
            Toolbar.this.f8733w = eVar.getActionView();
            this.f8741p = eVar;
            ViewParent parent2 = Toolbar.this.f8733w.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f8733w);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f14061a = (toolbar4.f8698B & 112) | 8388611;
                generateDefaultLayoutParams.f8743b = 2;
                toolbar4.f8733w.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f8733w);
            }
            Toolbar.this.B();
            Toolbar.this.requestLayout();
            eVar.q(true);
            KeyEvent.Callback callback = Toolbar.this.f8733w;
            if (callback instanceof InterfaceC1366b) {
                ((InterfaceC1366b) callback).b();
            }
            return true;
        }
    }

    public static class e extends AbstractC1279a {

        /* renamed from: b, reason: collision with root package name */
        public int f8743b;

        public e(int i7, int i8) {
            super(i7, i8);
            this.f8743b = 0;
            this.f14061a = 8388627;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8743b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8743b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8743b = 0;
            a(marginLayoutParams);
        }

        public e(e eVar) {
            super((AbstractC1279a) eVar);
            this.f8743b = 0;
            this.f8743b = eVar.f8743b;
        }

        public e(AbstractC1279a abstractC1279a) {
            super(abstractC1279a);
            this.f8743b = 0;
        }
    }

    public interface f {
    }

    public static class g extends N.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        public int f8744q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f8745r;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i7) {
                return new g[i7];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8744q = parcel.readInt();
            this.f8745r = parcel.readInt() != 0;
        }

        @Override // N.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f8744q);
            parcel.writeInt(this.f8745r ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1230a.f13348s);
    }

    private MenuInflater getMenuInflater() {
        return new C1367c(getContext());
    }

    public final void A() {
        removeCallbacks(this.f8724e0);
        post(this.f8724e0);
    }

    public void B() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f8743b != 2 && childAt != this.f8725o) {
                removeViewAt(childCount);
                this.f8715S.add(childAt);
            }
        }
    }

    public void C(int i7, int i8) {
        f();
        this.f8704H.g(i7, i8);
    }

    public void D(Context context, int i7) {
        this.f8697A = i7;
        TextView textView = this.f8727q;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public void E(Context context, int i7) {
        this.f8736z = i7;
        TextView textView = this.f8726p;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public final boolean F() {
        if (!this.f8723d0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (G(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean G(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean H() {
        ActionMenuView actionMenuView = this.f8725o;
        return actionMenuView != null && actionMenuView.K();
    }

    public void a() {
        for (int size = this.f8715S.size() - 1; size >= 0; size--) {
            addView((View) this.f8715S.get(size));
        }
        this.f8715S.clear();
    }

    public final void b(List list, int i7) {
        boolean z7 = AbstractC0421s.m(this) == 1;
        int childCount = getChildCount();
        int a7 = AbstractC0408e.a(i7, AbstractC0421s.m(this));
        list.clear();
        if (!z7) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f8743b == 0 && G(childAt) && n(eVar.f14061a) == a7) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f8743b == 0 && G(childAt2) && n(eVar2.f14061a) == a7) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f8743b = 1;
        if (!z7 || this.f8733w == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f8715S.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public void d() {
        d dVar = this.f8720a0;
        androidx.appcompat.view.menu.e eVar = dVar == null ? null : dVar.f8741p;
        if (eVar != null) {
            eVar.collapseActionView();
        }
    }

    public void e() {
        if (this.f8732v == null) {
            C1508g c1508g = new C1508g(getContext(), null, AbstractC1230a.f13347r);
            this.f8732v = c1508g;
            c1508g.setImageDrawable(this.f8730t);
            this.f8732v.setContentDescription(this.f8731u);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f14061a = (this.f8698B & 112) | 8388611;
            generateDefaultLayoutParams.f8743b = 2;
            this.f8732v.setLayoutParams(generateDefaultLayoutParams);
            this.f8732v.setOnClickListener(new c());
        }
    }

    public final void f() {
        if (this.f8704H == null) {
            this.f8704H = new O();
        }
    }

    public final void g() {
        if (this.f8729s == null) {
            this.f8729s = new AppCompatImageView(getContext());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f8732v;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f8732v;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        O o7 = this.f8704H;
        if (o7 != null) {
            return o7.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f8706J;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        O o7 = this.f8704H;
        if (o7 != null) {
            return o7.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        O o7 = this.f8704H;
        if (o7 != null) {
            return o7.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        O o7 = this.f8704H;
        if (o7 != null) {
            return o7.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f8705I;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.d I6;
        ActionMenuView actionMenuView = this.f8725o;
        return (actionMenuView == null || (I6 = actionMenuView.I()) == null || !I6.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f8706J, 0));
    }

    public int getCurrentContentInsetLeft() {
        return AbstractC0421s.m(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return AbstractC0421s.m(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f8705I, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f8729s;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f8729s;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        h();
        return this.f8725o.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f8728r;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f8728r;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.f8719W;
    }

    public Drawable getOverflowIcon() {
        h();
        return this.f8725o.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f8734x;
    }

    public int getPopupTheme() {
        return this.f8735y;
    }

    public CharSequence getSubtitle() {
        return this.f8709M;
    }

    public final TextView getSubtitleTextView() {
        return this.f8727q;
    }

    public CharSequence getTitle() {
        return this.f8708L;
    }

    public int getTitleMarginBottom() {
        return this.f8703G;
    }

    public int getTitleMarginEnd() {
        return this.f8701E;
    }

    public int getTitleMarginStart() {
        return this.f8700D;
    }

    public int getTitleMarginTop() {
        return this.f8702F;
    }

    public final TextView getTitleTextView() {
        return this.f8726p;
    }

    public InterfaceC1493A getWrapper() {
        if (this.f8718V == null) {
            this.f8718V = new androidx.appcompat.widget.d(this, true);
        }
        return this.f8718V;
    }

    public final void h() {
        i();
        if (this.f8725o.I() == null) {
            androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) this.f8725o.getMenu();
            if (this.f8720a0 == null) {
                this.f8720a0 = new d();
            }
            this.f8725o.setExpandedActionViewsExclusive(true);
            dVar.b(this.f8720a0, this.f8734x);
        }
    }

    public final void i() {
        if (this.f8725o == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f8725o = actionMenuView;
            actionMenuView.setPopupTheme(this.f8735y);
            this.f8725o.setOnMenuItemClickListener(this.f8717U);
            this.f8725o.J(this.f8721b0, this.f8722c0);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f14061a = (this.f8698B & 112) | 8388613;
            this.f8725o.setLayoutParams(generateDefaultLayoutParams);
            c(this.f8725o, false);
        }
    }

    public final void j() {
        if (this.f8728r == null) {
            this.f8728r = new C1508g(getContext(), null, AbstractC1230a.f13347r);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f14061a = (this.f8698B & 112) | 8388611;
            this.f8728r.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof AbstractC1279a ? new e((AbstractC1279a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int n(int i7) {
        int m7 = AbstractC0421s.m(this);
        int a7 = AbstractC0408e.a(i7, m7) & 7;
        return (a7 == 1 || a7 == 3 || a7 == 5) ? a7 : m7 == 1 ? 5 : 3;
    }

    public final int o(View view, int i7) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int p7 = p(eVar.f14061a);
        if (p7 == 48) {
            return getPaddingTop() - i8;
        }
        if (p7 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i9 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i9 < i10) {
            i9 = i10;
        } else {
            int i11 = (((height - paddingBottom) - measuredHeight) - i9) - paddingTop;
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i11 < i12) {
                i9 = Math.max(0, i9 - (i12 - i11));
            }
        }
        return paddingTop + i9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f8724e0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8713Q = false;
        }
        if (!this.f8713Q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f8713Q = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8713Q = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0297 A[LOOP:0: B:46:0x0295->B:47:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b9 A[LOOP:1: B:50:0x02b7->B:51:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f2 A[LOOP:2: B:59:0x02f0->B:60:0x02f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr = this.f8716T;
        boolean a7 = d0.a(this);
        int i16 = !a7 ? 1 : 0;
        if (G(this.f8728r)) {
            z(this.f8728r, i7, 0, i8, 0, this.f8699C);
            i9 = this.f8728r.getMeasuredWidth() + q(this.f8728r);
            i10 = Math.max(0, this.f8728r.getMeasuredHeight() + r(this.f8728r));
            i11 = View.combineMeasuredStates(0, this.f8728r.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (G(this.f8732v)) {
            z(this.f8732v, i7, 0, i8, 0, this.f8699C);
            i9 = this.f8732v.getMeasuredWidth() + q(this.f8732v);
            i10 = Math.max(i10, this.f8732v.getMeasuredHeight() + r(this.f8732v));
            i11 = View.combineMeasuredStates(i11, this.f8732v.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        iArr[a7 ? 1 : 0] = Math.max(0, currentContentInsetStart - i9);
        if (G(this.f8725o)) {
            z(this.f8725o, i7, max, i8, 0, this.f8699C);
            i12 = this.f8725o.getMeasuredWidth() + q(this.f8725o);
            i10 = Math.max(i10, this.f8725o.getMeasuredHeight() + r(this.f8725o));
            i11 = View.combineMeasuredStates(i11, this.f8725o.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i12);
        iArr[i16] = Math.max(0, currentContentInsetEnd - i12);
        if (G(this.f8733w)) {
            max2 += y(this.f8733w, i7, max2, i8, 0, iArr);
            i10 = Math.max(i10, this.f8733w.getMeasuredHeight() + r(this.f8733w));
            i11 = View.combineMeasuredStates(i11, this.f8733w.getMeasuredState());
        }
        if (G(this.f8729s)) {
            max2 += y(this.f8729s, i7, max2, i8, 0, iArr);
            i10 = Math.max(i10, this.f8729s.getMeasuredHeight() + r(this.f8729s));
            i11 = View.combineMeasuredStates(i11, this.f8729s.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (((e) childAt.getLayoutParams()).f8743b == 0 && G(childAt)) {
                max2 += y(childAt, i7, max2, i8, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + r(childAt));
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        int i18 = this.f8702F + this.f8703G;
        int i19 = this.f8700D + this.f8701E;
        if (G(this.f8726p)) {
            y(this.f8726p, i7, max2 + i19, i8, i18, iArr);
            int measuredWidth = this.f8726p.getMeasuredWidth() + q(this.f8726p);
            i13 = this.f8726p.getMeasuredHeight() + r(this.f8726p);
            i14 = View.combineMeasuredStates(i11, this.f8726p.getMeasuredState());
            i15 = measuredWidth;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (G(this.f8727q)) {
            i15 = Math.max(i15, y(this.f8727q, i7, max2 + i19, i8, i13 + i18, iArr));
            i13 += this.f8727q.getMeasuredHeight() + r(this.f8727q);
            i14 = View.combineMeasuredStates(i14, this.f8727q.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i15 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, (-16777216) & i14), F() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i10, i13) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, i14 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f8725o;
        androidx.appcompat.view.menu.d I6 = actionMenuView != null ? actionMenuView.I() : null;
        int i7 = gVar.f8744q;
        if (i7 != 0 && this.f8720a0 != null && I6 != null && (findItem = I6.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f8745r) {
            A();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        f();
        this.f8704H.f(i7 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.e eVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.f8720a0;
        if (dVar != null && (eVar = dVar.f8741p) != null) {
            gVar.f8744q = eVar.getItemId();
        }
        gVar.f8745r = v();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8712P = false;
        }
        if (!this.f8712P) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f8712P = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8712P = false;
        }
        return true;
    }

    public final int p(int i7) {
        int i8 = i7 & 112;
        return (i8 == 16 || i8 == 48 || i8 == 80) ? i8 : this.f8707K & 112;
    }

    public final int q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0411h.b(marginLayoutParams) + AbstractC0411h.a(marginLayoutParams);
    }

    public final int r(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int s(List list, int[] iArr) {
        int i7 = iArr[0];
        int i8 = iArr[1];
        int size = list.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            View view = (View) list.get(i9);
            e eVar = (e) view.getLayoutParams();
            int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i7;
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i8;
            int max = Math.max(0, i11);
            int max2 = Math.max(0, i12);
            int max3 = Math.max(0, -i11);
            int max4 = Math.max(0, -i12);
            i10 += max + view.getMeasuredWidth() + max2;
            i9++;
            i8 = max4;
            i7 = max3;
        }
        return i10;
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(AbstractC1294a.b(getContext(), i7));
    }

    public void setCollapsible(boolean z7) {
        this.f8723d0 = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f8706J) {
            this.f8706J = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f8705I) {
            this.f8705I = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(AbstractC1294a.b(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(AbstractC1294a.b(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        j();
        this.f8728r.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        h();
        this.f8725o.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f8735y != i7) {
            this.f8735y = i7;
            if (i7 == 0) {
                this.f8734x = getContext();
            } else {
                this.f8734x = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.f8703G = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f8701E = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f8700D = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f8702F = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public void t(int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    public final boolean u(View view) {
        return view.getParent() == this || this.f8715S.contains(view);
    }

    public boolean v() {
        ActionMenuView actionMenuView = this.f8725o;
        return actionMenuView != null && actionMenuView.F();
    }

    public final int w(View view, int i7, int[] iArr, int i8) {
        e eVar = (e) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i7 + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        int o7 = o(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, o7, max + measuredWidth, view.getMeasuredHeight() + o7);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    public final int x(View view, int i7, int[] iArr, int i8) {
        e eVar = (e) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int o7 = o(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, o7, max, view.getMeasuredHeight() + o7);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int y(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i11) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void z(View view, int i7, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8707K = 8388627;
        this.f8714R = new ArrayList();
        this.f8715S = new ArrayList();
        this.f8716T = new int[2];
        this.f8717U = new a();
        this.f8724e0 = new b();
        X s7 = X.s(getContext(), attributeSet, AbstractC1238i.f13604j2, i7, 0);
        AbstractC0421s.B(this, context, AbstractC1238i.f13604j2, attributeSet, s7.o(), i7, 0);
        this.f8736z = s7.l(AbstractC1238i.f13512L2, 0);
        this.f8697A = s7.l(AbstractC1238i.f13476C2, 0);
        this.f8707K = s7.j(AbstractC1238i.f13608k2, this.f8707K);
        this.f8698B = s7.j(AbstractC1238i.f13612l2, 48);
        int d7 = s7.d(AbstractC1238i.f13488F2, 0);
        d7 = s7.p(AbstractC1238i.f13508K2) ? s7.d(AbstractC1238i.f13508K2, d7) : d7;
        this.f8703G = d7;
        this.f8702F = d7;
        this.f8701E = d7;
        this.f8700D = d7;
        int d8 = s7.d(AbstractC1238i.f13500I2, -1);
        if (d8 >= 0) {
            this.f8700D = d8;
        }
        int d9 = s7.d(AbstractC1238i.f13496H2, -1);
        if (d9 >= 0) {
            this.f8701E = d9;
        }
        int d10 = s7.d(AbstractC1238i.f13504J2, -1);
        if (d10 >= 0) {
            this.f8702F = d10;
        }
        int d11 = s7.d(AbstractC1238i.f13492G2, -1);
        if (d11 >= 0) {
            this.f8703G = d11;
        }
        this.f8699C = s7.e(AbstractC1238i.f13656w2, -1);
        int d12 = s7.d(AbstractC1238i.f13640s2, Integer.MIN_VALUE);
        int d13 = s7.d(AbstractC1238i.f13624o2, Integer.MIN_VALUE);
        int e7 = s7.e(AbstractC1238i.f13632q2, 0);
        int e8 = s7.e(AbstractC1238i.f13636r2, 0);
        f();
        this.f8704H.e(e7, e8);
        if (d12 != Integer.MIN_VALUE || d13 != Integer.MIN_VALUE) {
            this.f8704H.g(d12, d13);
        }
        this.f8705I = s7.d(AbstractC1238i.f13644t2, Integer.MIN_VALUE);
        this.f8706J = s7.d(AbstractC1238i.f13628p2, Integer.MIN_VALUE);
        this.f8730t = s7.f(AbstractC1238i.f13620n2);
        this.f8731u = s7.n(AbstractC1238i.f13616m2);
        CharSequence n7 = s7.n(AbstractC1238i.f13484E2);
        if (!TextUtils.isEmpty(n7)) {
            setTitle(n7);
        }
        CharSequence n8 = s7.n(AbstractC1238i.f13472B2);
        if (!TextUtils.isEmpty(n8)) {
            setSubtitle(n8);
        }
        this.f8734x = getContext();
        setPopupTheme(s7.l(AbstractC1238i.f13468A2, 0));
        Drawable f7 = s7.f(AbstractC1238i.f13668z2);
        if (f7 != null) {
            setNavigationIcon(f7);
        }
        CharSequence n9 = s7.n(AbstractC1238i.f13664y2);
        if (!TextUtils.isEmpty(n9)) {
            setNavigationContentDescription(n9);
        }
        Drawable f8 = s7.f(AbstractC1238i.f13648u2);
        if (f8 != null) {
            setLogo(f8);
        }
        CharSequence n10 = s7.n(AbstractC1238i.f13652v2);
        if (!TextUtils.isEmpty(n10)) {
            setLogoDescription(n10);
        }
        if (s7.p(AbstractC1238i.f13516M2)) {
            setTitleTextColor(s7.c(AbstractC1238i.f13516M2));
        }
        if (s7.p(AbstractC1238i.f13480D2)) {
            setSubtitleTextColor(s7.c(AbstractC1238i.f13480D2));
        }
        if (s7.p(AbstractC1238i.f13660x2)) {
            t(s7.l(AbstractC1238i.f13660x2, 0));
        }
        s7.t();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.f8732v;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            this.f8732v.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f8732v;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f8730t);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!u(this.f8729s)) {
                c(this.f8729s, true);
            }
        } else {
            ImageView imageView = this.f8729s;
            if (imageView != null && u(imageView)) {
                removeView(this.f8729s);
                this.f8715S.remove(this.f8729s);
            }
        }
        ImageView imageView2 = this.f8729s;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageView imageView = this.f8729s;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageButton imageButton = this.f8728r;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!u(this.f8728r)) {
                c(this.f8728r, true);
            }
        } else {
            ImageButton imageButton = this.f8728r;
            if (imageButton != null && u(imageButton)) {
                removeView(this.f8728r);
                this.f8715S.remove(this.f8728r);
            }
        }
        ImageButton imageButton2 = this.f8728r;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f8727q;
            if (textView != null && u(textView)) {
                removeView(this.f8727q);
                this.f8715S.remove(this.f8727q);
            }
        } else {
            if (this.f8727q == null) {
                Context context = getContext();
                C1523w c1523w = new C1523w(context);
                this.f8727q = c1523w;
                c1523w.setSingleLine();
                this.f8727q.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f8697A;
                if (i7 != 0) {
                    this.f8727q.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f8711O;
                if (colorStateList != null) {
                    this.f8727q.setTextColor(colorStateList);
                }
            }
            if (!u(this.f8727q)) {
                c(this.f8727q, true);
            }
        }
        TextView textView2 = this.f8727q;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f8709M = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f8711O = colorStateList;
        TextView textView = this.f8727q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f8726p;
            if (textView != null && u(textView)) {
                removeView(this.f8726p);
                this.f8715S.remove(this.f8726p);
            }
        } else {
            if (this.f8726p == null) {
                Context context = getContext();
                C1523w c1523w = new C1523w(context);
                this.f8726p = c1523w;
                c1523w.setSingleLine();
                this.f8726p.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f8736z;
                if (i7 != 0) {
                    this.f8726p.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f8710N;
                if (colorStateList != null) {
                    this.f8726p.setTextColor(colorStateList);
                }
            }
            if (!u(this.f8726p)) {
                c(this.f8726p, true);
            }
        }
        TextView textView2 = this.f8726p;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f8708L = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f8710N = colorStateList;
        TextView textView = this.f8726p;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}

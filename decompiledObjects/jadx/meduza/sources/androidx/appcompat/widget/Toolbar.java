package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import b.a0;
import b.k;
import b.v;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import e0.j;
import e0.m;
import e0.o;
import e0.o0;
import g.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import l.b1;
import l.d0;
import l.h0;
import l.n;
import l.p;
import l.s0;
import l.z0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements j {
    public int A;
    public s0 B;
    public int C;
    public int D;
    public int E;
    public CharSequence F;
    public CharSequence G;
    public ColorStateList H;
    public ColorStateList I;
    public boolean J;
    public boolean K;
    public final ArrayList<View> L;
    public final ArrayList<View> M;
    public final int[] N;
    public final m O;
    public ArrayList<MenuItem> P;
    public h Q;
    public final a R;
    public androidx.appcompat.widget.d S;
    public androidx.appcompat.widget.a T;
    public f U;
    public j.a V;
    public f.a W;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f847a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f848a0;

    /* renamed from: b, reason: collision with root package name */
    public d0 f849b;

    /* renamed from: b0, reason: collision with root package name */
    public OnBackInvokedCallback f850b0;

    /* renamed from: c, reason: collision with root package name */
    public d0 f851c;

    /* renamed from: c0, reason: collision with root package name */
    public OnBackInvokedDispatcher f852c0;

    /* renamed from: d, reason: collision with root package name */
    public n f853d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f854d0;

    /* renamed from: e, reason: collision with root package name */
    public p f855e;

    /* renamed from: e0, reason: collision with root package name */
    public final b f856e0;
    public Drawable f;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f857o;

    /* renamed from: p, reason: collision with root package name */
    public n f858p;

    /* renamed from: q, reason: collision with root package name */
    public View f859q;

    /* renamed from: r, reason: collision with root package name */
    public Context f860r;

    /* renamed from: s, reason: collision with root package name */
    public int f861s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f862u;

    /* renamed from: v, reason: collision with root package name */
    public int f863v;

    /* renamed from: w, reason: collision with root package name */
    public int f864w;

    /* renamed from: x, reason: collision with root package name */
    public int f865x;

    /* renamed from: y, reason: collision with root package name */
    public int f866y;

    /* renamed from: z, reason: collision with root package name */
    public int f867z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.widget.a aVar;
            ActionMenuView actionMenuView = Toolbar.this.f847a;
            if (actionMenuView == null || (aVar = actionMenuView.B) == null) {
                return;
            }
            aVar.l();
        }
    }

    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            f.a aVar = Toolbar.this.W;
            return aVar != null && aVar.a(fVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.widget.a aVar = Toolbar.this.f847a.B;
            if (!(aVar != null && aVar.k())) {
                Iterator<o> it = Toolbar.this.O.f3807b.iterator();
                while (it.hasNext()) {
                    it.next().d(fVar);
                }
            }
            f.a aVar2 = Toolbar.this.W;
            if (aVar2 != null) {
                aVar2.b(fVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = Toolbar.this.U;
            androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f873b;
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new v(runnable, 1);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.j {

        /* renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.f f872a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f873b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean e(androidx.appcompat.view.menu.h hVar) {
            KeyEvent.Callback callback = Toolbar.this.f859q;
            if (callback instanceof j.b) {
                ((j.b) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f859q);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f858p);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f859q = null;
            int size = toolbar3.M.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.M.clear();
                    this.f873b = null;
                    Toolbar.this.requestLayout();
                    hVar.C = false;
                    hVar.f703n.p(false);
                    Toolbar.this.r();
                    return true;
                }
                toolbar3.addView(toolbar3.M.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final void f(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f872a;
            if (fVar2 != null && (hVar = this.f873b) != null) {
                fVar2.d(hVar);
            }
            this.f872a = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void g() {
            if (this.f873b != null) {
                androidx.appcompat.view.menu.f fVar = this.f872a;
                boolean z10 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (this.f872a.getItem(i10) == this.f873b) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z10) {
                    return;
                }
                e(this.f873b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean i(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean j(androidx.appcompat.view.menu.h hVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f858p.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f858p);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f858p);
            }
            Toolbar.this.f859q = hVar.getActionView();
            this.f873b = hVar;
            ViewParent parent2 = Toolbar.this.f859q.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f859q);
                }
                Toolbar.this.getClass();
                g gVar = new g();
                Toolbar toolbar4 = Toolbar.this;
                gVar.f5540a = 8388611 | (toolbar4.f863v & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                gVar.f875b = 2;
                toolbar4.f859q.setLayoutParams(gVar);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f859q);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).f875b != 2 && childAt != toolbar6.f847a) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.M.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            hVar.C = true;
            hVar.f703n.p(false);
            KeyEvent.Callback callback = Toolbar.this.f859q;
            if (callback instanceof j.b) {
                ((j.b) callback).onActionViewExpanded();
            }
            Toolbar.this.r();
            return true;
        }
    }

    public static class g extends a.C0088a {

        /* renamed from: b, reason: collision with root package name */
        public int f875b;

        public g() {
            this.f875b = 0;
            this.f5540a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f875b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f875b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f875b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(g gVar) {
            super((a.C0088a) gVar);
            this.f875b = 0;
            this.f875b = gVar.f875b;
        }

        public g(a.C0088a c0088a) {
            super(c0088a);
            this.f875b = 0;
        }
    }

    public interface h {
    }

    public static class i extends n0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f876c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f877d;

        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new i[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f876c = parcel.readInt();
            this.f877d = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // n0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f11178a, i10);
            parcel.writeInt(this.f876c);
            parcel.writeInt(this.f877d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, io.meduza.meduza.R.attr.toolbarStyle);
        this.E = 8388627;
        this.L = new ArrayList<>();
        this.M = new ArrayList<>();
        this.N = new int[2];
        this.O = new m(new k(this, 1));
        this.P = new ArrayList<>();
        this.R = new a();
        this.f856e0 = new b();
        Context context2 = getContext();
        int[] iArr = a0.K;
        z0 m10 = z0.m(context2, attributeSet, iArr, io.meduza.meduza.R.attr.toolbarStyle);
        e0.d0.g(this, context, iArr, attributeSet, m10.f9519b, io.meduza.meduza.R.attr.toolbarStyle);
        this.t = m10.i(28, 0);
        this.f862u = m10.i(19, 0);
        this.E = m10.f9519b.getInteger(0, this.E);
        this.f863v = m10.f9519b.getInteger(2, 48);
        int c10 = m10.c(22, 0);
        c10 = m10.l(27) ? m10.c(27, c10) : c10;
        this.A = c10;
        this.f867z = c10;
        this.f866y = c10;
        this.f865x = c10;
        int c11 = m10.c(25, -1);
        if (c11 >= 0) {
            this.f865x = c11;
        }
        int c12 = m10.c(24, -1);
        if (c12 >= 0) {
            this.f866y = c12;
        }
        int c13 = m10.c(26, -1);
        if (c13 >= 0) {
            this.f867z = c13;
        }
        int c14 = m10.c(23, -1);
        if (c14 >= 0) {
            this.A = c14;
        }
        this.f864w = m10.d(13, -1);
        int c15 = m10.c(9, Integer.MIN_VALUE);
        int c16 = m10.c(5, Integer.MIN_VALUE);
        int d10 = m10.d(7, 0);
        int d11 = m10.d(8, 0);
        if (this.B == null) {
            this.B = new s0();
        }
        s0 s0Var = this.B;
        s0Var.f9461h = false;
        if (d10 != Integer.MIN_VALUE) {
            s0Var.f9459e = d10;
            s0Var.f9455a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            s0Var.f = d11;
            s0Var.f9456b = d11;
        }
        if (c15 != Integer.MIN_VALUE || c16 != Integer.MIN_VALUE) {
            s0Var.a(c15, c16);
        }
        this.C = m10.c(10, Integer.MIN_VALUE);
        this.D = m10.c(6, Integer.MIN_VALUE);
        this.f = m10.e(4);
        this.f857o = m10.k(3);
        CharSequence k10 = m10.k(21);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m10.k(18);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.f860r = getContext();
        setPopupTheme(m10.i(17, 0));
        Drawable e10 = m10.e(16);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m10.k(15);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m10.e(11);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m10.k(12);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        if (m10.l(29)) {
            setTitleTextColor(m10.b(29));
        }
        if (m10.l(20)) {
            setSubtitleTextColor(m10.b(20));
        }
        if (m10.l(14)) {
            getMenuInflater().inflate(m10.i(14, 0), getMenu());
        }
        m10.n();
    }

    public static g g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0088a ? new g((a.C0088a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.f(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        WeakHashMap<View, o0> weakHashMap = e0.d0.f3766a;
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f875b == 0 && q(childAt)) {
                    int i12 = gVar.f5540a;
                    WeakHashMap<View, o0> weakHashMap2 = e0.d0.f3766a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f875b == 0 && q(childAt2)) {
                int i14 = gVar2.f5540a;
                WeakHashMap<View, o0> weakHashMap3 = e0.d0.f3766a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // e0.j
    public final void addMenuProvider(o oVar) {
        m mVar = this.O;
        mVar.f3807b.add(oVar);
        mVar.f3806a.run();
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVar = layoutParams == null ? new g() : !checkLayoutParams(layoutParams) ? g(layoutParams) : (g) layoutParams;
        gVar.f875b = 1;
        if (!z10 || this.f859q == null) {
            addView(view, gVar);
        } else {
            view.setLayoutParams(gVar);
            this.M.add(view);
        }
    }

    public final void c() {
        if (this.f858p == null) {
            n nVar = new n(getContext(), null, io.meduza.meduza.R.attr.toolbarNavigationButtonStyle);
            this.f858p = nVar;
            nVar.setImageDrawable(this.f);
            this.f858p.setContentDescription(this.f857o);
            g gVar = new g();
            gVar.f5540a = 8388611 | (this.f863v & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            gVar.f875b = 2;
            this.f858p.setLayoutParams(gVar);
            this.f858p.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f847a;
        if (actionMenuView.f783x == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.U == null) {
                this.U = new f();
            }
            this.f847a.setExpandedActionViewsExclusive(true);
            fVar.b(this.U, this.f860r);
            r();
        }
    }

    public final void e() {
        if (this.f847a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f847a = actionMenuView;
            actionMenuView.setPopupTheme(this.f861s);
            this.f847a.setOnMenuItemClickListener(this.R);
            ActionMenuView actionMenuView2 = this.f847a;
            j.a aVar = this.V;
            c cVar = new c();
            actionMenuView2.C = aVar;
            actionMenuView2.D = cVar;
            g gVar = new g();
            gVar.f5540a = 8388613 | (this.f863v & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f847a.setLayoutParams(gVar);
            b(this.f847a, false);
        }
    }

    public final void f() {
        if (this.f853d == null) {
            this.f853d = new n(getContext(), null, io.meduza.meduza.R.attr.toolbarNavigationButtonStyle);
            g gVar = new g();
            gVar.f5540a = 8388611 | (this.f863v & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f853d.setLayoutParams(gVar);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        n nVar = this.f858p;
        if (nVar != null) {
            return nVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        n nVar = this.f858p;
        if (nVar != null) {
            return nVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        s0 s0Var = this.B;
        if (s0Var != null) {
            return s0Var.f9460g ? s0Var.f9455a : s0Var.f9456b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.D;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        s0 s0Var = this.B;
        if (s0Var != null) {
            return s0Var.f9455a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        s0 s0Var = this.B;
        if (s0Var != null) {
            return s0Var.f9456b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        s0 s0Var = this.B;
        if (s0Var != null) {
            return s0Var.f9460g ? s0Var.f9456b : s0Var.f9455a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.C;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f847a;
        return actionMenuView != null && (fVar = actionMenuView.f783x) != null && fVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.D, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, o0> weakHashMap = e0.d0.f3766a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, o0> weakHashMap = e0.d0.f3766a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.C, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        p pVar = this.f855e;
        if (pVar != null) {
            return pVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        p pVar = this.f855e;
        if (pVar != null) {
            return pVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f847a.getMenu();
    }

    public View getNavButtonView() {
        return this.f853d;
    }

    public CharSequence getNavigationContentDescription() {
        n nVar = this.f853d;
        if (nVar != null) {
            return nVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        n nVar = this.f853d;
        if (nVar != null) {
            return nVar.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.T;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f847a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f860r;
    }

    public int getPopupTheme() {
        return this.f861s;
    }

    public CharSequence getSubtitle() {
        return this.G;
    }

    public final TextView getSubtitleTextView() {
        return this.f851c;
    }

    public CharSequence getTitle() {
        return this.F;
    }

    public int getTitleMarginBottom() {
        return this.A;
    }

    public int getTitleMarginEnd() {
        return this.f866y;
    }

    public int getTitleMarginStart() {
        return this.f865x;
    }

    public int getTitleMarginTop() {
        return this.f867z;
    }

    public final TextView getTitleTextView() {
        return this.f849b;
    }

    public h0 getWrapper() {
        if (this.S == null) {
            this.S = new androidx.appcompat.widget.d(this, true);
        }
        return this.S;
    }

    public final int h(int i10, View view) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = gVar.f5540a & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.E & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    public final void k() {
        Iterator<MenuItem> it = this.P.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        m mVar = this.O;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<o> it2 = mVar.f3807b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.P = currentMenuItems2;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.M.contains(view);
    }

    public final int m(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int o(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f856e0);
        r();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.K = false;
        }
        if (!this.K) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.K = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x028a A[LOOP:0: B:45:0x0288->B:46:0x028a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ac A[LOOP:1: B:49:0x02aa->B:50:0x02ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d1 A[LOOP:2: B:53:0x02cf->B:54:0x02d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0326 A[LOOP:3: B:62:0x0324->B:63:0x0326, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f11178a);
        ActionMenuView actionMenuView = this.f847a;
        androidx.appcompat.view.menu.f fVar = actionMenuView != null ? actionMenuView.f783x : null;
        int i10 = iVar.f876c;
        if (i10 != 0 && this.U != null && fVar != null && (findItem = fVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f877d) {
            removeCallbacks(this.f856e0);
            post(this.f856e0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            l.s0 r0 = r2.B
            if (r0 != 0) goto Le
            l.s0 r0 = new l.s0
            r0.<init>()
            r2.B = r0
        Le:
            l.s0 r0 = r2.B
            r1 = 1
            if (r3 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            boolean r3 = r0.f9460g
            if (r1 != r3) goto L1a
            goto L48
        L1a:
            r0.f9460g = r1
            boolean r3 = r0.f9461h
            if (r3 == 0) goto L40
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L32
            int r1 = r0.f9458d
            if (r1 == r3) goto L29
            goto L2b
        L29:
            int r1 = r0.f9459e
        L2b:
            r0.f9455a = r1
            int r1 = r0.f9457c
            if (r1 == r3) goto L44
            goto L46
        L32:
            int r1 = r0.f9457c
            if (r1 == r3) goto L37
            goto L39
        L37:
            int r1 = r0.f9459e
        L39:
            r0.f9455a = r1
            int r1 = r0.f9458d
            if (r1 == r3) goto L44
            goto L46
        L40:
            int r3 = r0.f9459e
            r0.f9455a = r3
        L44:
            int r1 = r0.f
        L46:
            r0.f9456b = r1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if ((r1 != null && r1.k()) != false) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar$i r0 = new androidx.appcompat.widget.Toolbar$i
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.Toolbar$f r1 = r4.U
            if (r1 == 0) goto L15
            androidx.appcompat.view.menu.h r1 = r1.f873b
            if (r1 == 0) goto L15
            int r1 = r1.f691a
            r0.f876c = r1
        L15:
            androidx.appcompat.widget.ActionMenuView r1 = r4.f847a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2b
            androidx.appcompat.widget.a r1 = r1.B
            if (r1 == 0) goto L27
            boolean r1 = r1.k()
            if (r1 == 0) goto L27
            r1 = r2
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L2b
            goto L2c
        L2b:
            r2 = r3
        L2c:
            r0.f877d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.J = false;
        }
        if (!this.J) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.J = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.J = false;
        }
        return true;
    }

    public final void p(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void r() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            f fVar = this.U;
            int i10 = 1;
            boolean z10 = false;
            if (((fVar == null || fVar.f873b == null) ? false : true) && a10 != null) {
                WeakHashMap<View, o0> weakHashMap = e0.d0.f3766a;
                if (isAttachedToWindow() && this.f854d0) {
                    z10 = true;
                }
            }
            if (z10 && this.f852c0 == null) {
                if (this.f850b0 == null) {
                    this.f850b0 = e.b(new b.m(this, i10));
                }
                e.c(a10, this.f850b0);
            } else {
                if (z10 || (onBackInvokedDispatcher = this.f852c0) == null) {
                    return;
                }
                e.d(onBackInvokedDispatcher, this.f850b0);
                a10 = null;
            }
            this.f852c0 = a10;
        }
    }

    @Override // e0.j
    public final void removeMenuProvider(o oVar) {
        this.O.a(oVar);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f854d0 != z10) {
            this.f854d0 = z10;
            r();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        n nVar = this.f858p;
        if (nVar != null) {
            nVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(x6.b.X(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f858p.setImageDrawable(drawable);
        } else {
            n nVar = this.f858p;
            if (nVar != null) {
                nVar.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f848a0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.D) {
            this.D = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.C) {
            this.C = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(x6.b.X(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f855e == null) {
                this.f855e = new p(getContext());
            }
            if (!l(this.f855e)) {
                b(this.f855e, true);
            }
        } else {
            p pVar = this.f855e;
            if (pVar != null && l(pVar)) {
                removeView(this.f855e);
                this.M.remove(this.f855e);
            }
        }
        p pVar2 = this.f855e;
        if (pVar2 != null) {
            pVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f855e == null) {
            this.f855e = new p(getContext());
        }
        p pVar = this.f855e;
        if (pVar != null) {
            pVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        n nVar = this.f853d;
        if (nVar != null) {
            nVar.setContentDescription(charSequence);
            b1.a(this.f853d, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(x6.b.X(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.f853d)) {
                b(this.f853d, true);
            }
        } else {
            n nVar = this.f853d;
            if (nVar != null && l(nVar)) {
                removeView(this.f853d);
                this.M.remove(this.f853d);
            }
        }
        n nVar2 = this.f853d;
        if (nVar2 != null) {
            nVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f853d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.Q = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f847a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f861s != i10) {
            this.f861s = i10;
            if (i10 == 0) {
                this.f860r = getContext();
            } else {
                this.f860r = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            d0 d0Var = this.f851c;
            if (d0Var != null && l(d0Var)) {
                removeView(this.f851c);
                this.M.remove(this.f851c);
            }
        } else {
            if (this.f851c == null) {
                Context context = getContext();
                d0 d0Var2 = new d0(context, null);
                this.f851c = d0Var2;
                d0Var2.setSingleLine();
                this.f851c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f862u;
                if (i10 != 0) {
                    this.f851c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.f851c.setTextColor(colorStateList);
                }
            }
            if (!l(this.f851c)) {
                b(this.f851c, true);
            }
        }
        d0 d0Var3 = this.f851c;
        if (d0Var3 != null) {
            d0Var3.setText(charSequence);
        }
        this.G = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.I = colorStateList;
        d0 d0Var = this.f851c;
        if (d0Var != null) {
            d0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            d0 d0Var = this.f849b;
            if (d0Var != null && l(d0Var)) {
                removeView(this.f849b);
                this.M.remove(this.f849b);
            }
        } else {
            if (this.f849b == null) {
                Context context = getContext();
                d0 d0Var2 = new d0(context, null);
                this.f849b = d0Var2;
                d0Var2.setSingleLine();
                this.f849b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.t;
                if (i10 != 0) {
                    this.f849b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.f849b.setTextColor(colorStateList);
                }
            }
            if (!l(this.f849b)) {
                b(this.f849b, true);
            }
        }
        d0 d0Var3 = this.f849b;
        if (d0Var3 != null) {
            d0Var3.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.A = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f866y = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f865x = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f867z = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        d0 d0Var = this.f849b;
        if (d0Var != null) {
            d0Var.setTextColor(colorStateList);
        }
    }
}

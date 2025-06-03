package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.f;
import androidx.appcompat.widget.a;
import b.a0;
import e0.o0;
import e0.q0;
import g.g;
import io.meduza.meduza.R;
import l.a1;
import l.d0;
import l.h0;
import l.s0;
import l.z0;

/* loaded from: classes.dex */
public final class d implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f912a;

    /* renamed from: b, reason: collision with root package name */
    public int f913b;

    /* renamed from: c, reason: collision with root package name */
    public c f914c;

    /* renamed from: d, reason: collision with root package name */
    public View f915d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f916e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f917g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f918h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f919i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f920j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f921k;

    /* renamed from: l, reason: collision with root package name */
    public Window.Callback f922l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f923m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.a f924n;

    /* renamed from: o, reason: collision with root package name */
    public int f925o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f926p;

    public class a extends q0 {

        /* renamed from: b, reason: collision with root package name */
        public boolean f927b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f928c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(0);
            this.f928c = i10;
            this.f927b = false;
        }

        @Override // e0.q0, e0.p0
        public final void a() {
            this.f927b = true;
        }

        @Override // e0.q0, e0.p0
        public final void b() {
            d.this.f912a.setVisibility(0);
        }

        @Override // e0.p0
        public final void c() {
            if (this.f927b) {
                return;
            }
            d.this.f912a.setVisibility(this.f928c);
        }
    }

    public d(Toolbar toolbar, boolean z10) {
        Drawable drawable;
        Toolbar toolbar2;
        this.f925o = 0;
        this.f912a = toolbar;
        this.f919i = toolbar.getTitle();
        this.f920j = toolbar.getSubtitle();
        this.f918h = this.f919i != null;
        this.f917g = toolbar.getNavigationIcon();
        z0 m10 = z0.m(toolbar.getContext(), null, a0.f, R.attr.actionBarStyle);
        int i10 = 15;
        this.f926p = m10.e(15);
        if (z10) {
            CharSequence k10 = m10.k(27);
            if (!TextUtils.isEmpty(k10)) {
                setTitle(k10);
            }
            CharSequence k11 = m10.k(25);
            if (!TextUtils.isEmpty(k11)) {
                this.f920j = k11;
                if ((this.f913b & 8) != 0) {
                    this.f912a.setSubtitle(k11);
                }
            }
            Drawable e10 = m10.e(20);
            if (e10 != null) {
                this.f = e10;
                v();
            }
            Drawable e11 = m10.e(17);
            if (e11 != null) {
                setIcon(e11);
            }
            if (this.f917g == null && (drawable = this.f926p) != null) {
                this.f917g = drawable;
                if ((this.f913b & 4) != 0) {
                    toolbar2 = this.f912a;
                } else {
                    toolbar2 = this.f912a;
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            k(m10.h(10, 0));
            int i11 = m10.i(9, 0);
            if (i11 != 0) {
                View inflate = LayoutInflater.from(this.f912a.getContext()).inflate(i11, (ViewGroup) this.f912a, false);
                View view = this.f915d;
                if (view != null && (this.f913b & 16) != 0) {
                    this.f912a.removeView(view);
                }
                this.f915d = inflate;
                if (inflate != null && (this.f913b & 16) != 0) {
                    this.f912a.addView(inflate);
                }
                k(this.f913b | 16);
            }
            int layoutDimension = m10.f9519b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.f912a.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.f912a.setLayoutParams(layoutParams);
            }
            int c10 = m10.c(7, -1);
            int c11 = m10.c(3, -1);
            if (c10 >= 0 || c11 >= 0) {
                Toolbar toolbar3 = this.f912a;
                int max = Math.max(c10, 0);
                int max2 = Math.max(c11, 0);
                if (toolbar3.B == null) {
                    toolbar3.B = new s0();
                }
                toolbar3.B.a(max, max2);
            }
            int i12 = m10.i(28, 0);
            if (i12 != 0) {
                Toolbar toolbar4 = this.f912a;
                Context context = toolbar4.getContext();
                toolbar4.t = i12;
                d0 d0Var = toolbar4.f849b;
                if (d0Var != null) {
                    d0Var.setTextAppearance(context, i12);
                }
            }
            int i13 = m10.i(26, 0);
            if (i13 != 0) {
                Toolbar toolbar5 = this.f912a;
                Context context2 = toolbar5.getContext();
                toolbar5.f862u = i13;
                d0 d0Var2 = toolbar5.f851c;
                if (d0Var2 != null) {
                    d0Var2.setTextAppearance(context2, i13);
                }
            }
            int i14 = m10.i(22, 0);
            if (i14 != 0) {
                this.f912a.setPopupTheme(i14);
            }
        } else {
            if (this.f912a.getNavigationIcon() != null) {
                this.f926p = this.f912a.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f913b = i10;
        }
        m10.n();
        if (R.string.abc_action_bar_up_description != this.f925o) {
            this.f925o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f912a.getNavigationContentDescription())) {
                int i15 = this.f925o;
                this.f921k = i15 != 0 ? getContext().getString(i15) : null;
                u();
            }
        }
        this.f921k = this.f912a.getNavigationContentDescription();
        this.f912a.setNavigationOnClickListener(new a1(this));
    }

    @Override // l.h0
    public final boolean a() {
        ActionMenuView actionMenuView = this.f912a.f847a;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a aVar = actionMenuView.B;
            if (aVar != null && aVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.h0
    public final void b() {
        this.f923m = true;
    }

    @Override // l.h0
    public final boolean c() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f912a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f847a) != null && actionMenuView.A;
    }

    @Override // l.h0
    public final void collapseActionView() {
        Toolbar.f fVar = this.f912a.U;
        h hVar = fVar == null ? null : fVar.f873b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // l.h0
    public final void d(f fVar, g.d dVar) {
        if (this.f924n == null) {
            this.f924n = new androidx.appcompat.widget.a(this.f912a.getContext());
        }
        androidx.appcompat.widget.a aVar = this.f924n;
        aVar.f624e = dVar;
        Toolbar toolbar = this.f912a;
        if (fVar == null && toolbar.f847a == null) {
            return;
        }
        toolbar.e();
        f fVar2 = toolbar.f847a.f783x;
        if (fVar2 == fVar) {
            return;
        }
        if (fVar2 != null) {
            fVar2.r(toolbar.T);
            fVar2.r(toolbar.U);
        }
        if (toolbar.U == null) {
            toolbar.U = toolbar.new f();
        }
        aVar.f889y = true;
        if (fVar != null) {
            fVar.b(aVar, toolbar.f860r);
            fVar.b(toolbar.U, toolbar.f860r);
        } else {
            aVar.f(toolbar.f860r, null);
            toolbar.U.f(toolbar.f860r, null);
            aVar.g();
            toolbar.U.g();
        }
        toolbar.f847a.setPopupTheme(toolbar.f861s);
        toolbar.f847a.setPresenter(aVar);
        toolbar.T = aVar;
        toolbar.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // l.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f912a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f847a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            androidx.appcompat.widget.a r0 = r0.B
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.a$c r3 = r0.C
            if (r3 != 0) goto L19
            boolean r0 = r0.k()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d.e():boolean");
    }

    @Override // l.h0
    public final boolean f() {
        ActionMenuView actionMenuView = this.f912a.f847a;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a aVar = actionMenuView.B;
            if (aVar != null && aVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.h0
    public final boolean g() {
        ActionMenuView actionMenuView = this.f912a.f847a;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a aVar = actionMenuView.B;
            if (aVar != null && aVar.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.h0
    public final Context getContext() {
        return this.f912a.getContext();
    }

    @Override // l.h0
    public final CharSequence getTitle() {
        return this.f912a.getTitle();
    }

    @Override // l.h0
    public final void h() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f912a.f847a;
        if (actionMenuView == null || (aVar = actionMenuView.B) == null) {
            return;
        }
        aVar.h();
        a.C0012a c0012a = aVar.B;
        if (c0012a == null || !c0012a.b()) {
            return;
        }
        c0012a.f724j.dismiss();
    }

    @Override // l.h0
    public final void i() {
    }

    @Override // l.h0
    public final boolean j() {
        Toolbar.f fVar = this.f912a.U;
        return (fVar == null || fVar.f873b == null) ? false : true;
    }

    @Override // l.h0
    public final void k(int i10) {
        View view;
        Toolbar toolbar;
        Toolbar toolbar2;
        Drawable drawable;
        int i11 = this.f913b ^ i10;
        this.f913b = i10;
        if (i11 != 0) {
            CharSequence charSequence = null;
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    u();
                }
                if ((this.f913b & 4) != 0) {
                    toolbar2 = this.f912a;
                    drawable = this.f917g;
                    if (drawable == null) {
                        drawable = this.f926p;
                    }
                } else {
                    toolbar2 = this.f912a;
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            if ((i11 & 3) != 0) {
                v();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f912a.setTitle(this.f919i);
                    toolbar = this.f912a;
                    charSequence = this.f920j;
                } else {
                    this.f912a.setTitle((CharSequence) null);
                    toolbar = this.f912a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f915d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f912a.addView(view);
            } else {
                this.f912a.removeView(view);
            }
        }
    }

    @Override // l.h0
    public final void l() {
        c cVar = this.f914c;
        if (cVar != null) {
            ViewParent parent = cVar.getParent();
            Toolbar toolbar = this.f912a;
            if (parent == toolbar) {
                toolbar.removeView(this.f914c);
            }
        }
        this.f914c = null;
    }

    @Override // l.h0
    public final void m(int i10) {
        this.f = i10 != 0 ? x6.b.X(getContext(), i10) : null;
        v();
    }

    @Override // l.h0
    public final void n() {
    }

    @Override // l.h0
    public final o0 o(int i10, long j10) {
        o0 a10 = e0.d0.a(this.f912a);
        a10.a(i10 == 0 ? 1.0f : 0.0f);
        a10.c(j10);
        a10.d(new a(i10));
        return a10;
    }

    @Override // l.h0
    public final void p(int i10) {
        this.f912a.setVisibility(i10);
    }

    @Override // l.h0
    public final int q() {
        return this.f913b;
    }

    @Override // l.h0
    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // l.h0
    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // l.h0
    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? x6.b.X(getContext(), i10) : null);
    }

    @Override // l.h0
    public final void setIcon(Drawable drawable) {
        this.f916e = drawable;
        v();
    }

    @Override // l.h0
    public final void setTitle(CharSequence charSequence) {
        this.f918h = true;
        this.f919i = charSequence;
        if ((this.f913b & 8) != 0) {
            this.f912a.setTitle(charSequence);
            if (this.f918h) {
                e0.d0.i(this.f912a.getRootView(), charSequence);
            }
        }
    }

    @Override // l.h0
    public final void setWindowCallback(Window.Callback callback) {
        this.f922l = callback;
    }

    @Override // l.h0
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f918h) {
            return;
        }
        this.f919i = charSequence;
        if ((this.f913b & 8) != 0) {
            this.f912a.setTitle(charSequence);
            if (this.f918h) {
                e0.d0.i(this.f912a.getRootView(), charSequence);
            }
        }
    }

    @Override // l.h0
    public final void t(boolean z10) {
        this.f912a.setCollapsible(z10);
    }

    public final void u() {
        if ((this.f913b & 4) != 0) {
            if (TextUtils.isEmpty(this.f921k)) {
                this.f912a.setNavigationContentDescription(this.f925o);
            } else {
                this.f912a.setNavigationContentDescription(this.f921k);
            }
        }
    }

    public final void v() {
        Drawable drawable;
        int i10 = this.f913b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.f916e;
        }
        this.f912a.setLogo(drawable);
    }
}

package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import e.AbstractC1230a;
import e.AbstractC1233d;
import e.AbstractC1236g;
import e.AbstractC1238i;
import g.AbstractC1294a;
import k.C1393a;
import l.InterfaceC1493A;
import l.X;

/* loaded from: classes.dex */
public class d implements InterfaceC1493A {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f8796a;

    /* renamed from: b, reason: collision with root package name */
    public int f8797b;

    /* renamed from: c, reason: collision with root package name */
    public View f8798c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f8799d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f8800e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8801f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8802g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f8803h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f8804i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f8805j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f8806k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8807l;

    /* renamed from: m, reason: collision with root package name */
    public int f8808m;

    /* renamed from: n, reason: collision with root package name */
    public int f8809n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f8810o;

    public class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        public final C1393a f8811o;

        public a() {
            this.f8811o = new C1393a(d.this.f8796a.getContext(), 0, R.id.home, 0, 0, d.this.f8803h);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f8806k;
            if (callback == null || !dVar.f8807l) {
                return;
            }
            callback.onMenuItemSelected(0, this.f8811o);
        }
    }

    public d(Toolbar toolbar, boolean z7) {
        this(toolbar, z7, AbstractC1236g.f13452a, AbstractC1233d.f13398n);
    }

    @Override // l.InterfaceC1493A
    public void a(CharSequence charSequence) {
        if (this.f8802g) {
            return;
        }
        o(charSequence);
    }

    @Override // l.InterfaceC1493A
    public void b(Window.Callback callback) {
        this.f8806k = callback;
    }

    @Override // l.InterfaceC1493A
    public void c(int i7) {
        i(i7 != 0 ? AbstractC1294a.b(e(), i7) : null);
    }

    public final int d() {
        if (this.f8796a.getNavigationIcon() == null) {
            return 11;
        }
        this.f8810o = this.f8796a.getNavigationIcon();
        return 15;
    }

    public Context e() {
        return this.f8796a.getContext();
    }

    public void f(View view) {
        View view2 = this.f8798c;
        if (view2 != null && (this.f8797b & 16) != 0) {
            this.f8796a.removeView(view2);
        }
        this.f8798c = view;
        if (view == null || (this.f8797b & 16) == 0) {
            return;
        }
        this.f8796a.addView(view);
    }

    public void g(int i7) {
        if (i7 == this.f8809n) {
            return;
        }
        this.f8809n = i7;
        if (TextUtils.isEmpty(this.f8796a.getNavigationContentDescription())) {
            j(this.f8809n);
        }
    }

    @Override // l.InterfaceC1493A
    public CharSequence getTitle() {
        return this.f8796a.getTitle();
    }

    public void h(int i7) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i8 = this.f8797b ^ i7;
        this.f8797b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i8 & 3) != 0) {
                r();
            }
            if ((i8 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    this.f8796a.setTitle(this.f8803h);
                    toolbar = this.f8796a;
                    charSequence = this.f8804i;
                } else {
                    charSequence = null;
                    this.f8796a.setTitle((CharSequence) null);
                    toolbar = this.f8796a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i8 & 16) == 0 || (view = this.f8798c) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                this.f8796a.addView(view);
            } else {
                this.f8796a.removeView(view);
            }
        }
    }

    public void i(Drawable drawable) {
        this.f8800e = drawable;
        r();
    }

    public void j(int i7) {
        k(i7 == 0 ? null : e().getString(i7));
    }

    public void k(CharSequence charSequence) {
        this.f8805j = charSequence;
        p();
    }

    public void l(Drawable drawable) {
        this.f8801f = drawable;
        q();
    }

    public void m(CharSequence charSequence) {
        this.f8804i = charSequence;
        if ((this.f8797b & 8) != 0) {
            this.f8796a.setSubtitle(charSequence);
        }
    }

    public void n(CharSequence charSequence) {
        this.f8802g = true;
        o(charSequence);
    }

    public final void o(CharSequence charSequence) {
        this.f8803h = charSequence;
        if ((this.f8797b & 8) != 0) {
            this.f8796a.setTitle(charSequence);
        }
    }

    public final void p() {
        if ((this.f8797b & 4) != 0) {
            if (TextUtils.isEmpty(this.f8805j)) {
                this.f8796a.setNavigationContentDescription(this.f8809n);
            } else {
                this.f8796a.setNavigationContentDescription(this.f8805j);
            }
        }
    }

    public final void q() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f8797b & 4) != 0) {
            toolbar = this.f8796a;
            drawable = this.f8801f;
            if (drawable == null) {
                drawable = this.f8810o;
            }
        } else {
            toolbar = this.f8796a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void r() {
        Drawable drawable;
        int i7 = this.f8797b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.f8800e) == null) {
            drawable = this.f8799d;
        }
        this.f8796a.setLogo(drawable);
    }

    @Override // l.InterfaceC1493A
    public void setIcon(int i7) {
        setIcon(i7 != 0 ? AbstractC1294a.b(e(), i7) : null);
    }

    public d(Toolbar toolbar, boolean z7, int i7, int i8) {
        Drawable drawable;
        this.f8808m = 0;
        this.f8809n = 0;
        this.f8796a = toolbar;
        this.f8803h = toolbar.getTitle();
        this.f8804i = toolbar.getSubtitle();
        this.f8802g = this.f8803h != null;
        this.f8801f = toolbar.getNavigationIcon();
        X s7 = X.s(toolbar.getContext(), null, AbstractC1238i.f13565a, AbstractC1230a.f13332c, 0);
        this.f8810o = s7.f(AbstractC1238i.f13601j);
        if (z7) {
            CharSequence n7 = s7.n(AbstractC1238i.f13625p);
            if (!TextUtils.isEmpty(n7)) {
                n(n7);
            }
            CharSequence n8 = s7.n(AbstractC1238i.f13617n);
            if (!TextUtils.isEmpty(n8)) {
                m(n8);
            }
            Drawable f7 = s7.f(AbstractC1238i.f13609l);
            if (f7 != null) {
                i(f7);
            }
            Drawable f8 = s7.f(AbstractC1238i.f13605k);
            if (f8 != null) {
                setIcon(f8);
            }
            if (this.f8801f == null && (drawable = this.f8810o) != null) {
                l(drawable);
            }
            h(s7.i(AbstractC1238i.f13593h, 0));
            int l7 = s7.l(AbstractC1238i.f13589g, 0);
            if (l7 != 0) {
                f(LayoutInflater.from(this.f8796a.getContext()).inflate(l7, (ViewGroup) this.f8796a, false));
                h(this.f8797b | 16);
            }
            int k7 = s7.k(AbstractC1238i.f13597i, 0);
            if (k7 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f8796a.getLayoutParams();
                layoutParams.height = k7;
                this.f8796a.setLayoutParams(layoutParams);
            }
            int d7 = s7.d(AbstractC1238i.f13585f, -1);
            int d8 = s7.d(AbstractC1238i.f13581e, -1);
            if (d7 >= 0 || d8 >= 0) {
                this.f8796a.C(Math.max(d7, 0), Math.max(d8, 0));
            }
            int l8 = s7.l(AbstractC1238i.f13629q, 0);
            if (l8 != 0) {
                Toolbar toolbar2 = this.f8796a;
                toolbar2.E(toolbar2.getContext(), l8);
            }
            int l9 = s7.l(AbstractC1238i.f13621o, 0);
            if (l9 != 0) {
                Toolbar toolbar3 = this.f8796a;
                toolbar3.D(toolbar3.getContext(), l9);
            }
            int l10 = s7.l(AbstractC1238i.f13613m, 0);
            if (l10 != 0) {
                this.f8796a.setPopupTheme(l10);
            }
        } else {
            this.f8797b = d();
        }
        s7.t();
        g(i7);
        this.f8805j = this.f8796a.getNavigationContentDescription();
        this.f8796a.setNavigationOnClickListener(new a());
    }

    @Override // l.InterfaceC1493A
    public void setIcon(Drawable drawable) {
        this.f8799d = drawable;
        r();
    }
}

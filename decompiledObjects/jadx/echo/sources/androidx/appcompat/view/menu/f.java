package androidx.appcompat.view.menu;

import I.AbstractC0408e;
import I.AbstractC0421s;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;
import e.AbstractC1232c;
import k.AbstractC1394b;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8499a;

    /* renamed from: b, reason: collision with root package name */
    public final d f8500b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8501c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8502d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8503e;

    /* renamed from: f, reason: collision with root package name */
    public View f8504f;

    /* renamed from: g, reason: collision with root package name */
    public int f8505g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8506h;

    /* renamed from: i, reason: collision with root package name */
    public g.a f8507i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC1394b f8508j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8509k;

    /* renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f8510l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            f.this.e();
        }
    }

    public f(Context context, d dVar, View view, boolean z7, int i7) {
        this(context, dVar, view, z7, i7, 0);
    }

    public final AbstractC1394b a() {
        Display defaultDisplay = ((WindowManager) this.f8499a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC1394b bVar = Math.min(point.x, point.y) >= this.f8499a.getResources().getDimensionPixelSize(AbstractC1232c.f13355a) ? new b(this.f8499a, this.f8504f, this.f8502d, this.f8503e, this.f8501c) : new i(this.f8499a, this.f8500b, this.f8504f, this.f8502d, this.f8503e, this.f8501c);
        bVar.l(this.f8500b);
        bVar.u(this.f8510l);
        bVar.p(this.f8504f);
        bVar.k(this.f8507i);
        bVar.r(this.f8506h);
        bVar.s(this.f8505g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f8508j.dismiss();
        }
    }

    public AbstractC1394b c() {
        if (this.f8508j == null) {
            this.f8508j = a();
        }
        return this.f8508j;
    }

    public boolean d() {
        AbstractC1394b abstractC1394b = this.f8508j;
        return abstractC1394b != null && abstractC1394b.i();
    }

    public void e() {
        this.f8508j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f8509k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f8504f = view;
    }

    public void g(boolean z7) {
        this.f8506h = z7;
        AbstractC1394b abstractC1394b = this.f8508j;
        if (abstractC1394b != null) {
            abstractC1394b.r(z7);
        }
    }

    public void h(int i7) {
        this.f8505g = i7;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f8509k = onDismissListener;
    }

    public void j(g.a aVar) {
        this.f8507i = aVar;
        AbstractC1394b abstractC1394b = this.f8508j;
        if (abstractC1394b != null) {
            abstractC1394b.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i7, int i8, boolean z7, boolean z8) {
        AbstractC1394b c7 = c();
        c7.v(z8);
        if (z7) {
            if ((AbstractC0408e.a(this.f8505g, AbstractC0421s.m(this.f8504f)) & 7) == 5) {
                i7 -= this.f8504f.getWidth();
            }
            c7.t(i7);
            c7.w(i8);
            int i9 = (int) ((this.f8499a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c7.q(new Rect(i7 - i9, i8 - i9, i7 + i9, i8 + i9));
        }
        c7.a();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f8504f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i7, int i8) {
        if (d()) {
            return true;
        }
        if (this.f8504f == null) {
            return false;
        }
        l(i7, i8, true, true);
        return true;
    }

    public f(Context context, d dVar, View view, boolean z7, int i7, int i8) {
        this.f8505g = 8388611;
        this.f8510l = new a();
        this.f8499a = context;
        this.f8500b = dVar;
        this.f8504f = view;
        this.f8501c = z7;
        this.f8502d = i7;
        this.f8503e = i8;
    }
}

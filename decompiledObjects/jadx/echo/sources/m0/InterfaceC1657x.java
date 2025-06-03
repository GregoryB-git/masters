package m0;

import android.os.Handler;
import d0.C1194q;
import g0.AbstractC1297a;
import k0.C1427o;
import k0.C1429p;
import m0.InterfaceC1657x;
import m0.InterfaceC1659z;

/* renamed from: m0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1657x {

    /* renamed from: m0.x$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f17608a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1657x f17609b;

        public a(Handler handler, InterfaceC1657x interfaceC1657x) {
            this.f17608a = interfaceC1657x != null ? (Handler) AbstractC1297a.e(handler) : null;
            this.f17609b = interfaceC1657x;
        }

        public final /* synthetic */ void A(String str) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).s(str);
        }

        public final /* synthetic */ void B(C1427o c1427o) {
            c1427o.c();
            ((InterfaceC1657x) g0.M.i(this.f17609b)).f(c1427o);
        }

        public final /* synthetic */ void C(C1427o c1427o) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).A(c1427o);
        }

        public final /* synthetic */ void D(C1194q c1194q, C1429p c1429p) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).z(c1194q, c1429p);
        }

        public final /* synthetic */ void E(long j7) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).l(j7);
        }

        public final /* synthetic */ void F(boolean z7) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).c(z7);
        }

        public final /* synthetic */ void G(int i7, long j7, long j8) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).v(i7, j7, j8);
        }

        public void H(final long j7) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.E(j7);
                    }
                });
            }
        }

        public void I(final boolean z7) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.F(z7);
                    }
                });
            }
        }

        public void J(final int i7, final long j7, final long j8) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.G(i7, j7, j8);
                    }
                });
            }
        }

        public void m(final Exception exc) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.v(exc);
                    }
                });
            }
        }

        public void n(final Exception exc) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.w(exc);
                    }
                });
            }
        }

        public void o(final InterfaceC1659z.a aVar) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.x(aVar);
                    }
                });
            }
        }

        public void p(final InterfaceC1659z.a aVar) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.y(aVar);
                    }
                });
            }
        }

        public void q(final String str, final long j7, final long j8) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.z(str, j7, j8);
                    }
                });
            }
        }

        public void r(final String str) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.A(str);
                    }
                });
            }
        }

        public void s(final C1427o c1427o) {
            c1427o.c();
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.B(c1427o);
                    }
                });
            }
        }

        public void t(final C1427o c1427o) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.C(c1427o);
                    }
                });
            }
        }

        public void u(final C1194q c1194q, final C1429p c1429p) {
            Handler handler = this.f17608a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: m0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1657x.a.this.D(c1194q, c1429p);
                    }
                });
            }
        }

        public final /* synthetic */ void v(Exception exc) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).p(exc);
        }

        public final /* synthetic */ void w(Exception exc) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).d(exc);
        }

        public final /* synthetic */ void x(InterfaceC1659z.a aVar) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).a(aVar);
        }

        public final /* synthetic */ void y(InterfaceC1659z.a aVar) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).e(aVar);
        }

        public final /* synthetic */ void z(String str, long j7, long j8) {
            ((InterfaceC1657x) g0.M.i(this.f17609b)).t(str, j7, j8);
        }
    }

    void A(C1427o c1427o);

    void a(InterfaceC1659z.a aVar);

    void c(boolean z7);

    void d(Exception exc);

    void e(InterfaceC1659z.a aVar);

    void f(C1427o c1427o);

    void l(long j7);

    void p(Exception exc);

    void s(String str);

    void t(String str, long j7, long j8);

    void v(int i7, long j7, long j8);

    void z(C1194q c1194q, C1429p c1429p);
}

package D0;

import D0.E;
import android.os.Handler;
import android.os.SystemClock;
import d0.C1177P;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.M;
import k0.C1427o;
import k0.C1429p;

/* loaded from: classes.dex */
public interface E {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f1053a;

        /* renamed from: b, reason: collision with root package name */
        public final E f1054b;

        public a(Handler handler, E e7) {
            this.f1053a = e7 != null ? (Handler) AbstractC1297a.e(handler) : null;
            this.f1054b = e7;
        }

        public void A(final Object obj) {
            if (this.f1053a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f1053a.post(new Runnable() { // from class: D0.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.w(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j7, final int i7) {
            Handler handler = this.f1053a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: D0.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.x(j7, i7);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f1053a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: D0.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.y(exc);
                    }
                });
            }
        }

        public void D(final C1177P c1177p) {
            Handler handler = this.f1053a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: D0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.z(c1177p);
                    }
                });
            }
        }

        public void k(final String str, final long j7, final long j8) {
            Handler handler = this.f1053a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: D0.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.q(str, j7, j8);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f1053a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: D0.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.r(str);
                    }
                });
            }
        }

        public void m(final C1427o c1427o) {
            c1427o.c();
            Handler handler = this.f1053a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: D0.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.s(c1427o);
                    }
                });
            }
        }

        public void n(final int i7, final long j7) {
            Handler handler = this.f1053a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: D0.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.t(i7, j7);
                    }
                });
            }
        }

        public void o(final C1427o c1427o) {
            Handler handler = this.f1053a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: D0.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.u(c1427o);
                    }
                });
            }
        }

        public void p(final C1194q c1194q, final C1429p c1429p) {
            Handler handler = this.f1053a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: D0.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.a.this.v(c1194q, c1429p);
                    }
                });
            }
        }

        public final /* synthetic */ void q(String str, long j7, long j8) {
            ((E) M.i(this.f1054b)).i(str, j7, j8);
        }

        public final /* synthetic */ void r(String str) {
            ((E) M.i(this.f1054b)).g(str);
        }

        public final /* synthetic */ void s(C1427o c1427o) {
            c1427o.c();
            ((E) M.i(this.f1054b)).o(c1427o);
        }

        public final /* synthetic */ void t(int i7, long j7) {
            ((E) M.i(this.f1054b)).w(i7, j7);
        }

        public final /* synthetic */ void u(C1427o c1427o) {
            ((E) M.i(this.f1054b)).n(c1427o);
        }

        public final /* synthetic */ void v(C1194q c1194q, C1429p c1429p) {
            ((E) M.i(this.f1054b)).u(c1194q, c1429p);
        }

        public final /* synthetic */ void w(Object obj, long j7) {
            ((E) M.i(this.f1054b)).h(obj, j7);
        }

        public final /* synthetic */ void x(long j7, int i7) {
            ((E) M.i(this.f1054b)).y(j7, i7);
        }

        public final /* synthetic */ void y(Exception exc) {
            ((E) M.i(this.f1054b)).q(exc);
        }

        public final /* synthetic */ void z(C1177P c1177p) {
            ((E) M.i(this.f1054b)).b(c1177p);
        }
    }

    void b(C1177P c1177p);

    void g(String str);

    void h(Object obj, long j7);

    void i(String str, long j7, long j8);

    void n(C1427o c1427o);

    void o(C1427o c1427o);

    void q(Exception exc);

    void u(C1194q c1194q, C1429p c1429p);

    void w(int i7, long j7);

    void y(long j7, int i7);
}

package p0;

import android.os.Handler;
import g0.AbstractC1297a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p0.v;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public interface v {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f18343a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2142x.b f18344b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f18345c;

        /* renamed from: p0.v$a$a, reason: collision with other inner class name */
        public static final class C0245a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f18346a;

            /* renamed from: b, reason: collision with root package name */
            public v f18347b;

            public C0245a(Handler handler, v vVar) {
                this.f18346a = handler;
                this.f18347b = vVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, v vVar) {
            AbstractC1297a.e(handler);
            AbstractC1297a.e(vVar);
            this.f18345c.add(new C0245a(handler, vVar));
        }

        public void h() {
            Iterator it = this.f18345c.iterator();
            while (it.hasNext()) {
                C0245a c0245a = (C0245a) it.next();
                final v vVar = c0245a.f18347b;
                g0.M.S0(c0245a.f18346a, new Runnable() { // from class: p0.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a.this.n(vVar);
                    }
                });
            }
        }

        public void i() {
            Iterator it = this.f18345c.iterator();
            while (it.hasNext()) {
                C0245a c0245a = (C0245a) it.next();
                final v vVar = c0245a.f18347b;
                g0.M.S0(c0245a.f18346a, new Runnable() { // from class: p0.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a.this.o(vVar);
                    }
                });
            }
        }

        public void j() {
            Iterator it = this.f18345c.iterator();
            while (it.hasNext()) {
                C0245a c0245a = (C0245a) it.next();
                final v vVar = c0245a.f18347b;
                g0.M.S0(c0245a.f18346a, new Runnable() { // from class: p0.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a.this.p(vVar);
                    }
                });
            }
        }

        public void k(final int i7) {
            Iterator it = this.f18345c.iterator();
            while (it.hasNext()) {
                C0245a c0245a = (C0245a) it.next();
                final v vVar = c0245a.f18347b;
                g0.M.S0(c0245a.f18346a, new Runnable() { // from class: p0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a.this.q(vVar, i7);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator it = this.f18345c.iterator();
            while (it.hasNext()) {
                C0245a c0245a = (C0245a) it.next();
                final v vVar = c0245a.f18347b;
                g0.M.S0(c0245a.f18346a, new Runnable() { // from class: p0.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a.this.r(vVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator it = this.f18345c.iterator();
            while (it.hasNext()) {
                C0245a c0245a = (C0245a) it.next();
                final v vVar = c0245a.f18347b;
                g0.M.S0(c0245a.f18346a, new Runnable() { // from class: p0.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.a.this.s(vVar);
                    }
                });
            }
        }

        public final /* synthetic */ void n(v vVar) {
            vVar.S(this.f18343a, this.f18344b);
        }

        public final /* synthetic */ void o(v vVar) {
            vVar.g0(this.f18343a, this.f18344b);
        }

        public final /* synthetic */ void p(v vVar) {
            vVar.l0(this.f18343a, this.f18344b);
        }

        public final /* synthetic */ void q(v vVar, int i7) {
            vVar.b0(this.f18343a, this.f18344b);
            vVar.M(this.f18343a, this.f18344b, i7);
        }

        public final /* synthetic */ void r(v vVar, Exception exc) {
            vVar.d0(this.f18343a, this.f18344b, exc);
        }

        public final /* synthetic */ void s(v vVar) {
            vVar.T(this.f18343a, this.f18344b);
        }

        public void t(v vVar) {
            Iterator it = this.f18345c.iterator();
            while (it.hasNext()) {
                C0245a c0245a = (C0245a) it.next();
                if (c0245a.f18347b == vVar) {
                    this.f18345c.remove(c0245a);
                }
            }
        }

        public a u(int i7, InterfaceC2142x.b bVar) {
            return new a(this.f18345c, i7, bVar);
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i7, InterfaceC2142x.b bVar) {
            this.f18345c = copyOnWriteArrayList;
            this.f18343a = i7;
            this.f18344b = bVar;
        }
    }

    void M(int i7, InterfaceC2142x.b bVar, int i8);

    void S(int i7, InterfaceC2142x.b bVar);

    void T(int i7, InterfaceC2142x.b bVar);

    void b0(int i7, InterfaceC2142x.b bVar);

    void d0(int i7, InterfaceC2142x.b bVar, Exception exc);

    void g0(int i7, InterfaceC2142x.b bVar);

    void l0(int i7, InterfaceC2142x.b bVar);
}

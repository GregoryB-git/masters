package androidx.media3.exoplayer.dash;

import F0.S;
import F0.T;
import android.os.Handler;
import android.os.Message;
import d0.C1162A;
import d0.C1194q;
import d0.C1201x;
import d0.InterfaceC1186i;
import g0.M;
import g0.z;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k0.C1441v0;
import o0.C1752c;
import x0.P;
import y0.AbstractC2226e;

/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public final B0.b f9874o;

    /* renamed from: p, reason: collision with root package name */
    public final b f9875p;

    /* renamed from: t, reason: collision with root package name */
    public C1752c f9879t;

    /* renamed from: u, reason: collision with root package name */
    public long f9880u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9881v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9882w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9883x;

    /* renamed from: s, reason: collision with root package name */
    public final TreeMap f9878s = new TreeMap();

    /* renamed from: r, reason: collision with root package name */
    public final Handler f9877r = M.B(this);

    /* renamed from: q, reason: collision with root package name */
    public final Q0.b f9876q = new Q0.b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f9884a;

        /* renamed from: b, reason: collision with root package name */
        public final long f9885b;

        public a(long j7, long j8) {
            this.f9884a = j7;
            this.f9885b = j8;
        }
    }

    public interface b {
        void a();

        void b(long j7);
    }

    public final class c implements T {

        /* renamed from: a, reason: collision with root package name */
        public final P f9886a;

        /* renamed from: b, reason: collision with root package name */
        public final C1441v0 f9887b = new C1441v0();

        /* renamed from: c, reason: collision with root package name */
        public final O0.b f9888c = new O0.b();

        /* renamed from: d, reason: collision with root package name */
        public long f9889d = -9223372036854775807L;

        public c(B0.b bVar) {
            this.f9886a = P.l(bVar);
        }

        @Override // F0.T
        public void a(z zVar, int i7, int i8) {
            this.f9886a.e(zVar, i7);
        }

        @Override // F0.T
        public void b(long j7, int i7, int i8, int i9, T.a aVar) {
            this.f9886a.b(j7, i7, i8, i9, aVar);
            l();
        }

        @Override // F0.T
        public int c(InterfaceC1186i interfaceC1186i, int i7, boolean z7, int i8) {
            return this.f9886a.f(interfaceC1186i, i7, z7);
        }

        @Override // F0.T
        public void d(C1194q c1194q) {
            this.f9886a.d(c1194q);
        }

        @Override // F0.T
        public /* synthetic */ void e(z zVar, int i7) {
            S.b(this, zVar, i7);
        }

        @Override // F0.T
        public /* synthetic */ int f(InterfaceC1186i interfaceC1186i, int i7, boolean z7) {
            return S.a(this, interfaceC1186i, i7, z7);
        }

        public final O0.b g() {
            this.f9888c.m();
            if (this.f9886a.T(this.f9887b, this.f9888c, 0, false) != -4) {
                return null;
            }
            this.f9888c.C();
            return this.f9888c;
        }

        public boolean h(long j7) {
            return d.this.j(j7);
        }

        public void i(AbstractC2226e abstractC2226e) {
            long j7 = this.f9889d;
            if (j7 == -9223372036854775807L || abstractC2226e.f21259h > j7) {
                this.f9889d = abstractC2226e.f21259h;
            }
            d.this.m(abstractC2226e);
        }

        public boolean j(AbstractC2226e abstractC2226e) {
            long j7 = this.f9889d;
            return d.this.n(j7 != -9223372036854775807L && j7 < abstractC2226e.f21258g);
        }

        public final void k(long j7, long j8) {
            d.this.f9877r.sendMessage(d.this.f9877r.obtainMessage(1, new a(j7, j8)));
        }

        public final void l() {
            while (this.f9886a.L(false)) {
                O0.b g7 = g();
                if (g7 != null) {
                    long j7 = g7.f15402t;
                    C1201x a7 = d.this.f9876q.a(g7);
                    if (a7 != null) {
                        Q0.a aVar = (Q0.a) a7.d(0);
                        if (d.h(aVar.f4314o, aVar.f4315p)) {
                            m(j7, aVar);
                        }
                    }
                }
            }
            this.f9886a.s();
        }

        public final void m(long j7, Q0.a aVar) {
            long f7 = d.f(aVar);
            if (f7 == -9223372036854775807L) {
                return;
            }
            k(j7, f7);
        }

        public void n() {
            this.f9886a.U();
        }
    }

    public d(C1752c c1752c, b bVar, B0.b bVar2) {
        this.f9879t = c1752c;
        this.f9875p = bVar;
        this.f9874o = bVar2;
    }

    public static long f(Q0.a aVar) {
        try {
            return M.Q0(M.H(aVar.f4318s));
        } catch (C1162A unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    public final Map.Entry e(long j7) {
        return this.f9878s.ceilingEntry(Long.valueOf(j7));
    }

    public final void g(long j7, long j8) {
        Long l7 = (Long) this.f9878s.get(Long.valueOf(j8));
        if (l7 != null && l7.longValue() <= j7) {
            return;
        }
        this.f9878s.put(Long.valueOf(j8), Long.valueOf(j7));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f9883x) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f9884a, aVar.f9885b);
        return true;
    }

    public final void i() {
        if (this.f9881v) {
            this.f9882w = true;
            this.f9881v = false;
            this.f9875p.a();
        }
    }

    public boolean j(long j7) {
        C1752c c1752c = this.f9879t;
        boolean z7 = false;
        if (!c1752c.f18085d) {
            return false;
        }
        if (this.f9882w) {
            return true;
        }
        Map.Entry e7 = e(c1752c.f18089h);
        if (e7 != null && ((Long) e7.getValue()).longValue() < j7) {
            this.f9880u = ((Long) e7.getKey()).longValue();
            l();
            z7 = true;
        }
        if (z7) {
            i();
        }
        return z7;
    }

    public c k() {
        return new c(this.f9874o);
    }

    public final void l() {
        this.f9875p.b(this.f9880u);
    }

    public void m(AbstractC2226e abstractC2226e) {
        this.f9881v = true;
    }

    public boolean n(boolean z7) {
        if (!this.f9879t.f18085d) {
            return false;
        }
        if (this.f9882w) {
            return true;
        }
        if (!z7) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f9883x = true;
        this.f9877r.removeCallbacksAndMessages(null);
    }

    public final void p() {
        Iterator it = this.f9878s.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f9879t.f18089h) {
                it.remove();
            }
        }
    }

    public void q(C1752c c1752c) {
        this.f9882w = false;
        this.f9880u = -9223372036854775807L;
        this.f9879t = c1752c;
        p();
    }
}

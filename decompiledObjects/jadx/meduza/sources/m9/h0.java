package m9;

import eb.e1;
import g9.b0;
import i9.i1;
import i9.m1;
import java.util.ArrayDeque;
import java.util.HashMap;
import ka.a0;
import ka.s;
import m9.o0;
import ma.n1;
import ma.x;
import n9.a;

/* loaded from: classes.dex */
public final class h0 implements o0.a {

    /* renamed from: a, reason: collision with root package name */
    public final j9.f f10794a;

    /* renamed from: b, reason: collision with root package name */
    public final a f10795b;

    /* renamed from: c, reason: collision with root package name */
    public final i9.n f10796c;

    /* renamed from: d, reason: collision with root package name */
    public final j f10797d;

    /* renamed from: e, reason: collision with root package name */
    public final h f10798e;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f10799g;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f10801i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f10802j;

    /* renamed from: k, reason: collision with root package name */
    public o0 f10803k;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10800h = false;
    public final HashMap f = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f10804l = new ArrayDeque();

    public interface a {
        void a(k9.h hVar);

        void b(g9.d0 d0Var);

        void c(d0 d0Var);

        t8.e<j9.i> d(int i10);

        void e(int i10, e1 e1Var);

        void f(int i10, e1 e1Var);
    }

    public h0(j9.f fVar, b0.a aVar, i9.n nVar, j jVar, n9.a aVar2, d dVar) {
        this.f10794a = fVar;
        this.f10795b = aVar;
        this.f10796c = nVar;
        this.f10797d = jVar;
        this.f10798e = dVar;
        this.f10799g = new b0(aVar2, new aa.m0(aVar, 10));
        this.f10801i = new p0(jVar.f10818c, jVar.f10817b, jVar.f10816a, new f0(this));
        this.f10802j = new q0(jVar.f10818c, jVar.f10817b, jVar.f10816a, new g0(this));
        dVar.a(new i1(1, this, aVar2));
    }

    public final void a() {
        i0 i0Var = i0.Initial;
        p0 p0Var = this.f10801i;
        if (p0Var.d()) {
            p0Var.a(i0Var, e1.f5070e);
        }
        q0 q0Var = this.f10802j;
        if (q0Var.d()) {
            q0Var.a(i0Var, e1.f5070e);
        }
        if (!this.f10804l.isEmpty()) {
            p2.m0.y(1, "RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.f10804l.size()));
            this.f10804l.clear();
        }
        this.f10803k = null;
    }

    public final void b() {
        this.f10800h = true;
        q0 q0Var = this.f10802j;
        ma.h i10 = this.f10796c.f7745c.i();
        q0Var.getClass();
        i10.getClass();
        q0Var.f10878v = i10;
        if (g()) {
            i();
        } else {
            this.f10799g.c(g9.d0.UNKNOWN);
        }
        c();
    }

    public final void c() {
        int i10 = this.f10804l.isEmpty() ? -1 : ((k9.g) this.f10804l.getLast()).f9153a;
        while (true) {
            if (!(this.f10800h && this.f10804l.size() < 10)) {
                break;
            }
            k9.g f = this.f10796c.f7745c.f(i10);
            if (f != null) {
                x6.b.Z("addToWritePipeline called when pipeline is full", this.f10800h && this.f10804l.size() < 10, new Object[0]);
                this.f10804l.add(f);
                if (this.f10802j.c()) {
                    q0 q0Var = this.f10802j;
                    if (q0Var.f10877u) {
                        q0Var.j(f.f9156d);
                    }
                }
                i10 = f.f9153a;
            } else if (this.f10804l.size() == 0) {
                q0 q0Var2 = this.f10802j;
                if (q0Var2.c() && q0Var2.f10731b == null) {
                    q0Var2.f10731b = q0Var2.f.b(q0Var2.f10735g, m9.a.f10726p, q0Var2.f10734e);
                }
            }
        }
        if (h()) {
            x6.b.Z("startWriteStream() called when shouldStartWriteStream() is false.", h(), new Object[0]);
            this.f10802j.g();
        }
    }

    public final void d(m1 m1Var) {
        Integer valueOf = Integer.valueOf(m1Var.f7735b);
        if (this.f.containsKey(valueOf)) {
            return;
        }
        this.f.put(valueOf, m1Var);
        if (g()) {
            i();
        } else if (this.f10801i.c()) {
            f(m1Var);
        }
    }

    public final void e(int i10) {
        this.f10803k.a(i10).f10831a++;
        p0 p0Var = this.f10801i;
        x6.b.Z("Unwatching targets requires an open stream", p0Var.c(), new Object[0]);
        s.a L = ka.s.L();
        String str = p0Var.t.f10779b;
        L.m();
        ka.s.H((ka.s) L.f11120b, str);
        L.m();
        ka.s.J((ka.s) L.f11120b, i10);
        p0Var.i(L.k());
    }

    public final void f(m1 m1Var) {
        String str;
        this.f10803k.a(m1Var.f7735b).f10831a++;
        if (!m1Var.f7739g.isEmpty() || m1Var.f7738e.compareTo(j9.q.f8701b) > 0) {
            m1Var = new m1(m1Var.f7734a, m1Var.f7735b, m1Var.f7736c, m1Var.f7737d, m1Var.f7738e, m1Var.f, m1Var.f7739g, Integer.valueOf(this.f10795b.d(m1Var.f7735b).size()));
        }
        p0 p0Var = this.f10801i;
        x6.b.Z("Watching queries requires an open stream", p0Var.c(), new Object[0]);
        s.a L = ka.s.L();
        String str2 = p0Var.t.f10779b;
        L.m();
        ka.s.H((ka.s) L.f11120b, str2);
        e0 e0Var = p0Var.t;
        e0Var.getClass();
        a0.a M = ka.a0.M();
        g9.k0 k0Var = m1Var.f7734a;
        if (k0Var.e()) {
            a0.b.a K = a0.b.K();
            String m10 = e0.m(e0Var.f10778a, k0Var.f6007d);
            K.m();
            a0.b.G((a0.b) K.f11120b, m10);
            a0.b k10 = K.k();
            M.m();
            ka.a0.H((ka.a0) M.f11120b, k10);
        } else {
            a0.c l10 = e0Var.l(k0Var);
            M.m();
            ka.a0.G((ka.a0) M.f11120b, l10);
        }
        int i10 = m1Var.f7735b;
        M.m();
        ka.a0.K((ka.a0) M.f11120b, i10);
        if (!m1Var.f7739g.isEmpty() || m1Var.f7738e.compareTo(j9.q.f8701b) <= 0) {
            ma.h hVar = m1Var.f7739g;
            M.m();
            ka.a0.I((ka.a0) M.f11120b, hVar);
        } else {
            n1 n2 = e0.n(m1Var.f7738e.f8702a);
            M.m();
            ka.a0.J((ka.a0) M.f11120b, n2);
        }
        if (m1Var.f7740h != null && (!m1Var.f7739g.isEmpty() || m1Var.f7738e.compareTo(j9.q.f8701b) > 0)) {
            x.a J = ma.x.J();
            int intValue = m1Var.f7740h.intValue();
            J.m();
            ma.x.G((ma.x) J.f11120b, intValue);
            M.m();
            ka.a0.L((ka.a0) M.f11120b, J.k());
        }
        ka.a0 k11 = M.k();
        L.m();
        ka.s.I((ka.s) L.f11120b, k11);
        p0Var.t.getClass();
        i9.e0 e0Var2 = m1Var.f7737d;
        int ordinal = e0Var2.ordinal();
        HashMap hashMap = null;
        if (ordinal == 0) {
            str = null;
        } else if (ordinal == 1) {
            str = "existence-filter-mismatch";
        } else if (ordinal == 2) {
            str = "existence-filter-mismatch-bloom";
        } else {
            if (ordinal != 3) {
                x6.b.T("Unrecognized query purpose: %s", e0Var2);
                throw null;
            }
            str = "limbo-document";
        }
        if (str != null) {
            hashMap = new HashMap(1);
            hashMap.put("goog-listen-tags", str);
        }
        if (hashMap != null) {
            L.m();
            ka.s.G((ka.s) L.f11120b).putAll(hashMap);
        }
        p0Var.i(L.k());
    }

    public final boolean g() {
        return (!this.f10800h || this.f10801i.d() || this.f.isEmpty()) ? false : true;
    }

    public final boolean h() {
        return (!this.f10800h || this.f10802j.d() || this.f10804l.isEmpty()) ? false : true;
    }

    public final void i() {
        x6.b.Z("startWatchStream() called when shouldStartWatchStream() is false.", g(), new Object[0]);
        this.f10803k = new o0(this.f10794a, this);
        this.f10801i.g();
        b0 b0Var = this.f10799g;
        if (b0Var.f10751b == 0) {
            b0Var.b(g9.d0.UNKNOWN);
            x6.b.Z("onlineStateTimer shouldn't be started yet", b0Var.f10752c == null, new Object[0]);
            b0Var.f10752c = b0Var.f10754e.b(a.c.ONLINE_STATE_TIMEOUT, 10000L, new u.a(b0Var, 14));
        }
    }

    public final void j(int i10) {
        x6.b.Z("stopListening called on target no currently watched: %d", ((m1) this.f.remove(Integer.valueOf(i10))) != null, Integer.valueOf(i10));
        if (this.f10801i.c()) {
            e(i10);
        }
        if (this.f.isEmpty()) {
            if (!this.f10801i.c()) {
                if (this.f10800h) {
                    this.f10799g.c(g9.d0.UNKNOWN);
                }
            } else {
                p0 p0Var = this.f10801i;
                if (p0Var.c() && p0Var.f10731b == null) {
                    p0Var.f10731b = p0Var.f.b(p0Var.f10735g, m9.a.f10726p, p0Var.f10734e);
                }
            }
        }
    }
}

package p0;

import X2.AbstractC0703v;
import X2.AbstractC0706y;
import X2.a0;
import X2.g0;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import d0.AbstractC1184g;
import d0.AbstractC1203z;
import d0.C1190m;
import d0.C1194q;
import g0.AbstractC1297a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import l0.y1;
import p0.C1775g;
import p0.C1776h;
import p0.F;
import p0.InterfaceC1782n;
import p0.v;
import p0.x;

/* renamed from: p0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1776h implements x {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f18276b;

    /* renamed from: c, reason: collision with root package name */
    public final F.c f18277c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f18278d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f18279e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18280f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f18281g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18282h;

    /* renamed from: i, reason: collision with root package name */
    public final g f18283i;

    /* renamed from: j, reason: collision with root package name */
    public final B0.m f18284j;

    /* renamed from: k, reason: collision with root package name */
    public final C0244h f18285k;

    /* renamed from: l, reason: collision with root package name */
    public final long f18286l;

    /* renamed from: m, reason: collision with root package name */
    public final List f18287m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f18288n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f18289o;

    /* renamed from: p, reason: collision with root package name */
    public int f18290p;

    /* renamed from: q, reason: collision with root package name */
    public F f18291q;

    /* renamed from: r, reason: collision with root package name */
    public C1775g f18292r;

    /* renamed from: s, reason: collision with root package name */
    public C1775g f18293s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f18294t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f18295u;

    /* renamed from: v, reason: collision with root package name */
    public int f18296v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f18297w;

    /* renamed from: x, reason: collision with root package name */
    public y1 f18298x;

    /* renamed from: y, reason: collision with root package name */
    public volatile d f18299y;

    /* renamed from: p0.h$b */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public boolean f18303d;

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f18300a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public UUID f18301b = AbstractC1184g.f12618d;

        /* renamed from: c, reason: collision with root package name */
        public F.c f18302c = N.f18228d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f18304e = new int[0];

        /* renamed from: f, reason: collision with root package name */
        public boolean f18305f = true;

        /* renamed from: g, reason: collision with root package name */
        public B0.m f18306g = new B0.k();

        /* renamed from: h, reason: collision with root package name */
        public long f18307h = 300000;

        public C1776h a(Q q7) {
            return new C1776h(this.f18301b, this.f18302c, q7, this.f18300a, this.f18303d, this.f18304e, this.f18305f, this.f18306g, this.f18307h);
        }

        public b b(B0.m mVar) {
            this.f18306g = (B0.m) AbstractC1297a.e(mVar);
            return this;
        }

        public b c(boolean z7) {
            this.f18303d = z7;
            return this;
        }

        public b d(boolean z7) {
            this.f18305f = z7;
            return this;
        }

        public b e(int... iArr) {
            for (int i7 : iArr) {
                boolean z7 = true;
                if (i7 != 2 && i7 != 1) {
                    z7 = false;
                }
                AbstractC1297a.a(z7);
            }
            this.f18304e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, F.c cVar) {
            this.f18301b = (UUID) AbstractC1297a.e(uuid);
            this.f18302c = (F.c) AbstractC1297a.e(cVar);
            return this;
        }
    }

    /* renamed from: p0.h$c */
    public class c implements F.b {
        public c() {
        }

        @Override // p0.F.b
        public void a(F f7, byte[] bArr, int i7, int i8, byte[] bArr2) {
            ((d) AbstractC1297a.e(C1776h.this.f18299y)).obtainMessage(i7, bArr).sendToTarget();
        }
    }

    /* renamed from: p0.h$d */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C1775g c1775g : C1776h.this.f18287m) {
                if (c1775g.t(bArr)) {
                    c1775g.B(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: p0.h$e */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: p0.h$f */
    public class f implements x.b {

        /* renamed from: b, reason: collision with root package name */
        public final v.a f18310b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1782n f18311c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f18312d;

        public f(v.a aVar) {
            this.f18310b = aVar;
        }

        public void c(final C1194q c1194q) {
            ((Handler) AbstractC1297a.e(C1776h.this.f18295u)).post(new Runnable() { // from class: p0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C1776h.f.this.d(c1194q);
                }
            });
        }

        public final /* synthetic */ void d(C1194q c1194q) {
            if (C1776h.this.f18290p == 0 || this.f18312d) {
                return;
            }
            C1776h c1776h = C1776h.this;
            this.f18311c = c1776h.t((Looper) AbstractC1297a.e(c1776h.f18294t), this.f18310b, c1194q, false);
            C1776h.this.f18288n.add(this);
        }

        public final /* synthetic */ void e() {
            if (this.f18312d) {
                return;
            }
            InterfaceC1782n interfaceC1782n = this.f18311c;
            if (interfaceC1782n != null) {
                interfaceC1782n.e(this.f18310b);
            }
            C1776h.this.f18288n.remove(this);
            this.f18312d = true;
        }

        @Override // p0.x.b
        public void release() {
            g0.M.S0((Handler) AbstractC1297a.e(C1776h.this.f18295u), new Runnable() { // from class: p0.j
                @Override // java.lang.Runnable
                public final void run() {
                    C1776h.f.this.e();
                }
            });
        }
    }

    /* renamed from: p0.h$g */
    public class g implements C1775g.a {

        /* renamed from: a, reason: collision with root package name */
        public final Set f18314a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public C1775g f18315b;

        public g() {
        }

        @Override // p0.C1775g.a
        public void a(C1775g c1775g) {
            this.f18314a.add(c1775g);
            if (this.f18315b != null) {
                return;
            }
            this.f18315b = c1775g;
            c1775g.H();
        }

        @Override // p0.C1775g.a
        public void b() {
            this.f18315b = null;
            AbstractC0703v U6 = AbstractC0703v.U(this.f18314a);
            this.f18314a.clear();
            g0 it = U6.iterator();
            while (it.hasNext()) {
                ((C1775g) it.next()).C();
            }
        }

        @Override // p0.C1775g.a
        public void c(Exception exc, boolean z7) {
            this.f18315b = null;
            AbstractC0703v U6 = AbstractC0703v.U(this.f18314a);
            this.f18314a.clear();
            g0 it = U6.iterator();
            while (it.hasNext()) {
                ((C1775g) it.next()).D(exc, z7);
            }
        }

        public void d(C1775g c1775g) {
            this.f18314a.remove(c1775g);
            if (this.f18315b == c1775g) {
                this.f18315b = null;
                if (this.f18314a.isEmpty()) {
                    return;
                }
                C1775g c1775g2 = (C1775g) this.f18314a.iterator().next();
                this.f18315b = c1775g2;
                c1775g2.H();
            }
        }
    }

    /* renamed from: p0.h$h, reason: collision with other inner class name */
    public class C0244h implements C1775g.b {
        public C0244h() {
        }

        @Override // p0.C1775g.b
        public void a(C1775g c1775g, int i7) {
            if (C1776h.this.f18286l != -9223372036854775807L) {
                C1776h.this.f18289o.remove(c1775g);
                ((Handler) AbstractC1297a.e(C1776h.this.f18295u)).removeCallbacksAndMessages(c1775g);
            }
        }

        @Override // p0.C1775g.b
        public void b(final C1775g c1775g, int i7) {
            if (i7 == 1 && C1776h.this.f18290p > 0 && C1776h.this.f18286l != -9223372036854775807L) {
                C1776h.this.f18289o.add(c1775g);
                ((Handler) AbstractC1297a.e(C1776h.this.f18295u)).postAtTime(new Runnable() { // from class: p0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1775g.this.e(null);
                    }
                }, c1775g, SystemClock.uptimeMillis() + C1776h.this.f18286l);
            } else if (i7 == 0) {
                C1776h.this.f18287m.remove(c1775g);
                if (C1776h.this.f18292r == c1775g) {
                    C1776h.this.f18292r = null;
                }
                if (C1776h.this.f18293s == c1775g) {
                    C1776h.this.f18293s = null;
                }
                C1776h.this.f18283i.d(c1775g);
                if (C1776h.this.f18286l != -9223372036854775807L) {
                    ((Handler) AbstractC1297a.e(C1776h.this.f18295u)).removeCallbacksAndMessages(c1775g);
                    C1776h.this.f18289o.remove(c1775g);
                }
            }
            C1776h.this.C();
        }
    }

    public C1776h(UUID uuid, F.c cVar, Q q7, HashMap hashMap, boolean z7, int[] iArr, boolean z8, B0.m mVar, long j7) {
        AbstractC1297a.e(uuid);
        AbstractC1297a.b(!AbstractC1184g.f12616b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f18276b = uuid;
        this.f18277c = cVar;
        this.f18278d = q7;
        this.f18279e = hashMap;
        this.f18280f = z7;
        this.f18281g = iArr;
        this.f18282h = z8;
        this.f18284j = mVar;
        this.f18283i = new g();
        this.f18285k = new C0244h();
        this.f18296v = 0;
        this.f18287m = new ArrayList();
        this.f18288n = a0.h();
        this.f18289o = a0.h();
        this.f18286l = j7;
    }

    public static boolean u(InterfaceC1782n interfaceC1782n) {
        if (interfaceC1782n.getState() != 1) {
            return false;
        }
        Throwable cause = ((InterfaceC1782n.a) AbstractC1297a.e(interfaceC1782n.g())).getCause();
        return (cause instanceof ResourceBusyException) || AbstractC1768B.c(cause);
    }

    public static List y(C1190m c1190m, UUID uuid, boolean z7) {
        ArrayList arrayList = new ArrayList(c1190m.f12658r);
        for (int i7 = 0; i7 < c1190m.f12658r; i7++) {
            C1190m.b e7 = c1190m.e(i7);
            if ((e7.d(uuid) || (AbstractC1184g.f12617c.equals(uuid) && e7.d(AbstractC1184g.f12616b))) && (e7.f12663s != null || z7)) {
                arrayList.add(e7);
            }
        }
        return arrayList;
    }

    public final InterfaceC1782n A(int i7, boolean z7) {
        F f7 = (F) AbstractC1297a.e(this.f18291q);
        if ((f7.k() == 2 && G.f18222d) || g0.M.H0(this.f18281g, i7) == -1 || f7.k() == 1) {
            return null;
        }
        C1775g c1775g = this.f18292r;
        if (c1775g == null) {
            C1775g x7 = x(AbstractC0703v.Y(), true, null, z7);
            this.f18287m.add(x7);
            this.f18292r = x7;
        } else {
            c1775g.a(null);
        }
        return this.f18292r;
    }

    public final void B(Looper looper) {
        if (this.f18299y == null) {
            this.f18299y = new d(looper);
        }
    }

    public final void C() {
        if (this.f18291q != null && this.f18290p == 0 && this.f18287m.isEmpty() && this.f18288n.isEmpty()) {
            ((F) AbstractC1297a.e(this.f18291q)).release();
            this.f18291q = null;
        }
    }

    public final void D() {
        g0 it = AbstractC0706y.T(this.f18289o).iterator();
        while (it.hasNext()) {
            ((InterfaceC1782n) it.next()).e(null);
        }
    }

    public final void E() {
        g0 it = AbstractC0706y.T(this.f18288n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    public void F(int i7, byte[] bArr) {
        AbstractC1297a.f(this.f18287m.isEmpty());
        if (i7 == 1 || i7 == 3) {
            AbstractC1297a.e(bArr);
        }
        this.f18296v = i7;
        this.f18297w = bArr;
    }

    public final void G(InterfaceC1782n interfaceC1782n, v.a aVar) {
        interfaceC1782n.e(aVar);
        if (this.f18286l != -9223372036854775807L) {
            interfaceC1782n.e(null);
        }
    }

    public final void H(boolean z7) {
        if (z7 && this.f18294t == null) {
            g0.o.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) AbstractC1297a.e(this.f18294t)).getThread()) {
            g0.o.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f18294t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p0.x
    public void a(Looper looper, y1 y1Var) {
        z(looper);
        this.f18298x = y1Var;
    }

    @Override // p0.x
    public int b(C1194q c1194q) {
        H(false);
        int k7 = ((F) AbstractC1297a.e(this.f18291q)).k();
        C1190m c1190m = c1194q.f12730r;
        if (c1190m != null) {
            if (v(c1190m)) {
                return k7;
            }
            return 1;
        }
        if (g0.M.H0(this.f18281g, AbstractC1203z.k(c1194q.f12726n)) != -1) {
            return k7;
        }
        return 0;
    }

    @Override // p0.x
    public InterfaceC1782n c(v.a aVar, C1194q c1194q) {
        H(false);
        AbstractC1297a.f(this.f18290p > 0);
        AbstractC1297a.h(this.f18294t);
        return t(this.f18294t, aVar, c1194q, true);
    }

    @Override // p0.x
    public x.b d(v.a aVar, C1194q c1194q) {
        AbstractC1297a.f(this.f18290p > 0);
        AbstractC1297a.h(this.f18294t);
        f fVar = new f(aVar);
        fVar.c(c1194q);
        return fVar;
    }

    @Override // p0.x
    public final void g() {
        H(true);
        int i7 = this.f18290p;
        this.f18290p = i7 + 1;
        if (i7 != 0) {
            return;
        }
        if (this.f18291q == null) {
            F a7 = this.f18277c.a(this.f18276b);
            this.f18291q = a7;
            a7.a(new c());
        } else if (this.f18286l != -9223372036854775807L) {
            for (int i8 = 0; i8 < this.f18287m.size(); i8++) {
                ((C1775g) this.f18287m.get(i8)).a(null);
            }
        }
    }

    @Override // p0.x
    public final void release() {
        H(true);
        int i7 = this.f18290p - 1;
        this.f18290p = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f18286l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f18287m);
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C1775g) arrayList.get(i8)).e(null);
            }
        }
        E();
        C();
    }

    public final InterfaceC1782n t(Looper looper, v.a aVar, C1194q c1194q, boolean z7) {
        List list;
        B(looper);
        C1190m c1190m = c1194q.f12730r;
        if (c1190m == null) {
            return A(AbstractC1203z.k(c1194q.f12726n), z7);
        }
        C1775g c1775g = null;
        byte b7 = 0;
        if (this.f18297w == null) {
            list = y((C1190m) AbstractC1297a.e(c1190m), this.f18276b, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f18276b);
                g0.o.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new D(new InterfaceC1782n.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f18280f) {
            Iterator it = this.f18287m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1775g c1775g2 = (C1775g) it.next();
                if (g0.M.c(c1775g2.f18243a, list)) {
                    c1775g = c1775g2;
                    break;
                }
            }
        } else {
            c1775g = this.f18293s;
        }
        if (c1775g == null) {
            c1775g = x(list, false, aVar, z7);
            if (!this.f18280f) {
                this.f18293s = c1775g;
            }
            this.f18287m.add(c1775g);
        } else {
            c1775g.a(aVar);
        }
        return c1775g;
    }

    public final boolean v(C1190m c1190m) {
        if (this.f18297w != null) {
            return true;
        }
        if (y(c1190m, this.f18276b, true).isEmpty()) {
            if (c1190m.f12658r != 1 || !c1190m.e(0).d(AbstractC1184g.f12616b)) {
                return false;
            }
            g0.o.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f18276b);
        }
        String str = c1190m.f12657q;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? g0.M.f14261a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    public final C1775g w(List list, boolean z7, v.a aVar) {
        AbstractC1297a.e(this.f18291q);
        C1775g c1775g = new C1775g(this.f18276b, this.f18291q, this.f18283i, this.f18285k, list, this.f18296v, this.f18282h | z7, z7, this.f18297w, this.f18279e, this.f18278d, (Looper) AbstractC1297a.e(this.f18294t), this.f18284j, (y1) AbstractC1297a.e(this.f18298x));
        c1775g.a(aVar);
        if (this.f18286l != -9223372036854775807L) {
            c1775g.a(null);
        }
        return c1775g;
    }

    public final C1775g x(List list, boolean z7, v.a aVar, boolean z8) {
        C1775g w7 = w(list, z7, aVar);
        if (u(w7) && !this.f18289o.isEmpty()) {
            D();
            G(w7, aVar);
            w7 = w(list, z7, aVar);
        }
        if (!u(w7) || !z8 || this.f18288n.isEmpty()) {
            return w7;
        }
        E();
        if (!this.f18289o.isEmpty()) {
            D();
        }
        G(w7, aVar);
        return w(list, z7, aVar);
    }

    public final synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f18294t;
            if (looper2 == null) {
                this.f18294t = looper;
                this.f18295u = new Handler(looper);
            } else {
                AbstractC1297a.f(looper2 == looper);
                AbstractC1297a.e(this.f18295u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

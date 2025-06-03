/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.ResourceBusyException
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.UUID
 */
package p0;

import X2.a0;
import X2.g0;
import X2.y;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import d0.m;
import d0.q;
import d0.z;
import g0.M;
import g0.a;
import g0.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import l0.y1;
import p0.B;
import p0.D;
import p0.F;
import p0.G;
import p0.N;
import p0.Q;
import p0.g;
import p0.i;
import p0.j;
import p0.k;
import p0.n;
import p0.v;
import p0.x;

public class h
implements x {
    public final UUID b;
    public final F.c c;
    public final Q d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final g i;
    public final B0.m j;
    public final h k;
    public final long l;
    public final List m;
    public final Set n;
    public final Set o;
    public int p;
    public F q;
    public p0.g r;
    public p0.g s;
    public Looper t;
    public Handler u;
    public int v;
    public byte[] w;
    public y1 x;
    public volatile d y;

    public h(UUID uUID, F.c c8, Q q8, HashMap hashMap, boolean bl, int[] arrn, boolean bl2, B0.m m8, long l8) {
        a.e((Object)uUID);
        a.b(d0.g.b.equals((Object)uUID) ^ true, "Use C.CLEARKEY_UUID instead");
        this.b = uUID;
        this.c = c8;
        this.d = q8;
        this.e = hashMap;
        this.f = bl;
        this.g = arrn;
        this.h = bl2;
        this.j = m8;
        this.i = new g();
        this.k = new h(null);
        this.v = 0;
        this.m = new ArrayList();
        this.n = a0.h();
        this.o = a0.h();
        this.l = l8;
    }

    public /* synthetic */ h(UUID uUID, F.c c8, Q q8, HashMap hashMap, boolean bl, int[] arrn, boolean bl2, B0.m m8, long l8,  a8) {
        this(uUID, c8, q8, hashMap, bl, arrn, bl2, m8, l8);
    }

    public static boolean u(n n8) {
        int n9 = n8.getState();
        boolean bl = false;
        if (n9 != 1) {
            return false;
        }
        if ((n8 = ((n.a)((Object)a.e((Object)n8.g()))).getCause()) instanceof ResourceBusyException || B.c((Throwable)n8)) {
            bl = true;
        }
        return bl;
    }

    public static List y(m m8, UUID uUID, boolean bl) {
        ArrayList arrayList = new ArrayList(m8.r);
        for (int i8 = 0; i8 < m8.r; ++i8) {
            m.b b8 = m8.e(i8);
            if (!b8.d(uUID) && (!d0.g.c.equals((Object)uUID) || !b8.d(d0.g.b)) || b8.s == null && !bl) continue;
            arrayList.add((Object)b8);
        }
        return arrayList;
    }

    public final n A(int n8, boolean bl) {
        Object object = (F)a.e(this.q);
        if (object.k() == 2 && G.d) {
            return null;
        }
        if (M.H0(this.g, n8) != -1) {
            if (object.k() == 1) {
                return null;
            }
            object = this.r;
            if (object == null) {
                object = this.x(X2.v.Y(), true, null, bl);
                this.m.add(object);
                this.r = object;
            } else {
                object.a(null);
            }
            return this.r;
        }
        return null;
    }

    public final void B(Looper looper) {
        if (this.y == null) {
            this.y = new d(looper);
        }
    }

    public final void C() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            ((F)a.e(this.q)).release();
            this.q = null;
        }
    }

    public final void D() {
        g0 g02 = y.T((Collection)this.o).q();
        while (g02.hasNext()) {
            ((n)g02.next()).e(null);
        }
    }

    public final void E() {
        g0 g02 = y.T((Collection)this.n).q();
        while (g02.hasNext()) {
            ((f)g02.next()).release();
        }
    }

    public void F(int n8, byte[] arrby) {
        a.f(this.m.isEmpty());
        if (n8 == 1 || n8 == 3) {
            a.e(arrby);
        }
        this.v = n8;
        this.w = arrby;
    }

    public final void G(n n8, v.a a8) {
        n8.e(a8);
        if (this.l != -9223372036854775807L) {
            n8.e(null);
        }
    }

    public final void H(boolean bl) {
        if (bl && this.t == null) {
            o.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", (Throwable)new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper)a.e((Object)this.t)).getThread()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append("\nExpected thread: ");
            stringBuilder.append(this.t.getThread().getName());
            o.i("DefaultDrmSessionMgr", stringBuilder.toString(), (Throwable)new IllegalStateException());
        }
    }

    @Override
    public void a(Looper looper, y1 y12) {
        this.z(looper);
        this.x = y12;
    }

    @Override
    public int b(q q8) {
        int n8 = 0;
        this.H(false);
        int n9 = ((F)a.e(this.q)).k();
        m m8 = q8.r;
        if (m8 == null) {
            int n10 = z.k(q8.n);
            if (M.H0(this.g, n10) != -1) {
                n8 = n9;
            }
            return n8;
        }
        if (this.v(m8)) {
            return n9;
        }
        return 1;
    }

    @Override
    public n c(v.a a8, q q8) {
        boolean bl = false;
        this.H(false);
        if (this.p > 0) {
            bl = true;
        }
        a.f(bl);
        a.h((Object)this.t);
        return this.t(this.t, a8, q8, true);
    }

    @Override
    public x.b d(v.a object, q q8) {
        boolean bl = this.p > 0;
        a.f(bl);
        a.h((Object)this.t);
        object = new f((v.a)object);
        object.c(q8);
        return object;
    }

    @Override
    public final void g() {
        this.H(true);
        int n8 = this.p;
        this.p = n8 + 1;
        if (n8 != 0) {
            return;
        }
        if (this.q == null) {
            F f8;
            this.q = f8 = this.c.a(this.b);
            f8.a(new c(null));
            return;
        }
        if (this.l != -9223372036854775807L) {
            for (n8 = 0; n8 < this.m.size(); ++n8) {
                ((p0.g)this.m.get(n8)).a(null);
            }
        }
    }

    @Override
    public final void release() {
        int n8;
        this.H(true);
        this.p = n8 = this.p - 1;
        if (n8 != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList((Collection)this.m);
            for (n8 = 0; n8 < arrayList.size(); ++n8) {
                ((p0.g)arrayList.get(n8)).e(null);
            }
        }
        this.E();
        this.C();
    }

    public final n t(Looper object, v.a a8, q object2, boolean bl) {
        this.B((Looper)object);
        object = object2.r;
        if (object == null) {
            return this.A(z.k(object2.n), bl);
        }
        object2 = this.w;
        Object var5_5 = null;
        if (object2 == null) {
            object2 = object = h.y((m)a.e(object), this.b, false);
            if (object.isEmpty()) {
                object = new e(this.b, null);
                o.d("DefaultDrmSessionMgr", "DRM error", (Throwable)object);
                if (a8 != null) {
                    a8.l((Exception)object);
                }
                return new D(new n.a((Throwable)object, 6003));
            }
        } else {
            object2 = null;
        }
        if (!this.f) {
            object = this.s;
        } else {
            Iterator iterator = this.m.iterator();
            do {
                object = var5_5;
                if (!iterator.hasNext()) break;
                object = (p0.g)iterator.next();
            } while (!M.c((Object)object.a, object2));
        }
        if (object == null) {
            object = this.x((List)object2, false, a8, bl);
            if (!this.f) {
                this.s = object;
            }
            this.m.add(object);
            return object;
        }
        object.a(a8);
        return object;
    }

    public final boolean v(m object) {
        if (this.w != null) {
            return true;
        }
        if (h.y((m)object, this.b, true).isEmpty()) {
            if (object.r == 1 && object.e(0).d(d0.g.b)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
                stringBuilder.append((Object)this.b);
                o.h("DefaultDrmSessionMgr", stringBuilder.toString());
            } else {
                return false;
            }
        }
        if ((object = object.q) != null) {
            if ("cenc".equals(object)) {
                return true;
            }
            if ("cbcs".equals(object)) {
                if (M.a >= 25) {
                    return true;
                }
                return false;
            }
            if (!"cbc1".equals(object)) {
                if ("cens".equals(object)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final p0.g w(List object, boolean bl, v.a a8) {
        a.e(this.q);
        boolean bl2 = this.h;
        object = new p0.g(this.b, this.q, this.i, this.k, (List)object, this.v, bl2 | bl, bl, this.w, this.e, this.d, (Looper)a.e((Object)this.t), this.j, (y1)a.e(this.x));
        object.a(a8);
        if (this.l != -9223372036854775807L) {
            object.a(null);
        }
        return object;
    }

    public final p0.g x(List list, boolean bl, v.a a8, boolean bl2) {
        p0.g g8;
        p0.g g9 = g8 = this.w(list, bl, a8);
        if (h.u(g8)) {
            g9 = g8;
            if (!this.o.isEmpty()) {
                this.D();
                this.G(g8, a8);
                g9 = this.w(list, bl, a8);
            }
        }
        g8 = g9;
        if (h.u(g9)) {
            g8 = g9;
            if (bl2) {
                g8 = g9;
                if (!this.n.isEmpty()) {
                    this.E();
                    if (!this.o.isEmpty()) {
                        this.D();
                    }
                    this.G(g9, a8);
                    g8 = this.w(list, bl, a8);
                }
            }
        }
        return g8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void z(Looper looper) {
        // MONITORENTER : this
        Looper looper2 = this.t;
        if (looper2 == null) {
            this.t = looper;
            this.u = new Handler(looper);
            return;
        }
        boolean bl = looper2 == looper;
        a.f(bl);
        a.e((Object)this.u);
        // MONITOREXIT : this
    }

    public static final class b {
        public final HashMap a = new HashMap();
        public UUID b = d0.g.d;
        public F.c c = N.d;
        public boolean d;
        public int[] e = new int[0];
        public boolean f = true;
        public B0.m g = new B0.k();
        public long h = 300000L;

        public h a(Q q8) {
            return new h(this.b, this.c, q8, this.a, this.d, this.e, this.f, this.g, this.h, null);
        }

        public b b(B0.m m8) {
            this.g = (B0.m)a.e(m8);
            return this;
        }

        public b c(boolean bl) {
            this.d = bl;
            return this;
        }

        public b d(boolean bl) {
            this.f = bl;
            return this;
        }

        public /* varargs */ b e(int ... arrn) {
            int n8 = arrn.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                boolean bl;
                int n9 = arrn[i8];
                boolean bl2 = bl = true;
                if (n9 != 2) {
                    bl2 = n9 == 1 ? bl : false;
                }
                a.a(bl2);
            }
            this.e = (int[])arrn.clone();
            return this;
        }

        public b f(UUID uUID, F.c c8) {
            this.b = (UUID)a.e((Object)uUID);
            this.c = (F.c)a.e(c8);
            return this;
        }
    }

    public class c
    implements F.b {
        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }

        @Override
        public void a(F f8, byte[] arrby, int n8, int n9, byte[] arrby2) {
            ((d)((Object)a.e((Object)h.this.y))).obtainMessage(n8, (Object)arrby).sendToTarget();
        }
    }

    public class d
    extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] arrby = (byte[])message.obj;
            if (arrby == null) {
                return;
            }
            for (p0.g g8 : h.this.m) {
                if (!g8.t(arrby)) continue;
                g8.B(message.what);
                break;
            }
        }
    }

    public static final class e
    extends Exception {
        public e(UUID uUID) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Media does not support uuid: ");
            stringBuilder.append((Object)uUID);
            super(stringBuilder.toString());
        }

        public /* synthetic */ e(UUID uUID,  a8) {
            this(uUID);
        }
    }

    public class f
    implements x.b {
        public final v.a b;
        public n c;
        public boolean d;

        public f(v.a a8) {
            this.b = a8;
        }

        public static /* synthetic */ void a(f f8, q q8) {
            f8.d(q8);
        }

        public static /* synthetic */ void b(f f8) {
            f8.e();
        }

        public void c(q q8) {
            ((Handler)a.e((Object)h.this.u)).post((Runnable)new i(this, q8));
        }

        public final /* synthetic */ void d(q q8) {
            if (h.this.p != 0) {
                if (this.d) {
                    return;
                }
                h h8 = h.this;
                this.c = h8.t((Looper)a.e((Object)h8.t), this.b, q8, false);
                h.this.n.add((Object)this);
            }
        }

        public final /* synthetic */ void e() {
            if (this.d) {
                return;
            }
            n n8 = this.c;
            if (n8 != null) {
                n8.e(this.b);
            }
            h.this.n.remove((Object)this);
            this.d = true;
        }

        @Override
        public void release() {
            M.S0((Handler)a.e((Object)h.this.u), new j(this));
        }
    }

    public class g
    implements g.a {
        public final Set a;
        public p0.g b;

        public g() {
            this.a = new HashSet();
        }

        @Override
        public void a(p0.g g8) {
            this.a.add((Object)g8);
            if (this.b != null) {
                return;
            }
            this.b = g8;
            g8.H();
        }

        @Override
        public void b() {
            this.b = null;
            Object object = X2.v.U((Collection)this.a);
            this.a.clear();
            object = object.q();
            while (object.hasNext()) {
                ((p0.g)object.next()).C();
            }
        }

        @Override
        public void c(Exception exception, boolean bl) {
            this.b = null;
            Object object = X2.v.U((Collection)this.a);
            this.a.clear();
            object = object.q();
            while (object.hasNext()) {
                ((p0.g)object.next()).D(exception, bl);
            }
        }

        public void d(p0.g g8) {
            this.a.remove((Object)g8);
            if (this.b == g8) {
                this.b = null;
                if (!this.a.isEmpty()) {
                    this.b = g8 = (p0.g)this.a.iterator().next();
                    g8.H();
                }
            }
        }
    }

    public class h
    implements g.b {
        public h() {
        }

        public /* synthetic */ h( a8) {
            this();
        }

        public static /* synthetic */ void c(p0.g g8) {
            g8.e(null);
        }

        @Override
        public void a(p0.g g8, int n8) {
            if (h.this.l != -9223372036854775807L) {
                h.this.o.remove((Object)g8);
                ((Handler)a.e((Object)h.this.u)).removeCallbacksAndMessages((Object)g8);
            }
        }

        @Override
        public void b(p0.g g8, int n8) {
            if (n8 == 1 && h.this.p > 0 && h.this.l != -9223372036854775807L) {
                h.this.o.add((Object)g8);
                ((Handler)a.e((Object)h.this.u)).postAtTime((Runnable)new k(g8), (Object)g8, SystemClock.uptimeMillis() + h.this.l);
            } else if (n8 == 0) {
                h.this.m.remove((Object)g8);
                if (h.this.r == g8) {
                    h.this.r = null;
                }
                if (h.this.s == g8) {
                    h.this.s = null;
                }
                h.this.i.d(g8);
                if (h.this.l != -9223372036854775807L) {
                    ((Handler)a.e((Object)h.this.u)).removeCallbacksAndMessages((Object)g8);
                    h.this.o.remove((Object)g8);
                }
            }
            h.this.C();
        }
    }

}


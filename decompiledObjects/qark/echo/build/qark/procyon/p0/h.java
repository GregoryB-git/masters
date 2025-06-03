// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import android.os.SystemClock;
import java.util.HashSet;
import android.os.Message;
import B0.k;
import java.util.Iterator;
import d0.z;
import g0.o;
import X2.g0;
import java.util.Collection;
import X2.y;
import g0.M;
import android.media.ResourceBusyException;
import d0.q;
import X2.a0;
import java.util.ArrayList;
import g0.a;
import l0.y1;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.List;
import B0.m;
import java.util.HashMap;
import java.util.UUID;

public class h implements x
{
    public final UUID b;
    public final F.c c;
    public final Q d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final g i;
    public final m j;
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
    
    public h(final UUID uuid, final F.c c, final Q d, final HashMap e, final boolean f, final int[] g, final boolean h, final m j, final long l) {
        g0.a.e(uuid);
        g0.a.b(d0.g.b.equals(uuid) ^ true, "Use C.CLEARKEY_UUID instead");
        this.b = uuid;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
        this.i = new g();
        this.k = new h(null);
        this.v = 0;
        this.m = new ArrayList();
        this.n = a0.h();
        this.o = a0.h();
        this.l = l;
    }
    
    public static /* synthetic */ p0.g e(final h h) {
        return h.s;
    }
    
    public static /* synthetic */ p0.g f(final h h, final p0.g s) {
        return h.s = s;
    }
    
    public static /* synthetic */ g h(final h h) {
        return h.i;
    }
    
    public static /* synthetic */ List m(final h h) {
        return h.m;
    }
    
    public static /* synthetic */ long n(final h h) {
        return h.l;
    }
    
    public static /* synthetic */ Set o(final h h) {
        return h.o;
    }
    
    public static /* synthetic */ Handler p(final h h) {
        return h.u;
    }
    
    public static /* synthetic */ int q(final h h) {
        return h.p;
    }
    
    public static /* synthetic */ p0.g r(final h h) {
        return h.r;
    }
    
    public static /* synthetic */ p0.g s(final h h, final p0.g r) {
        return h.r = r;
    }
    
    public static boolean u(final n n) {
        final int state = n.getState();
        boolean b = false;
        if (state != 1) {
            return false;
        }
        final Throwable cause = ((n.a)g0.a.e(n.g())).getCause();
        if (cause instanceof ResourceBusyException || B.c(cause)) {
            b = true;
        }
        return b;
    }
    
    public static List y(final d0.m m, final UUID obj, final boolean b) {
        final ArrayList<d0.m.b> list = new ArrayList<d0.m.b>(m.r);
        for (int i = 0; i < m.r; ++i) {
            final d0.m.b e = m.e(i);
            if ((e.d(obj) || (d0.g.c.equals(obj) && e.d(d0.g.b))) && (e.s != null || b)) {
                list.add(e);
            }
        }
        return list;
    }
    
    public final n A(final int n, final boolean b) {
        final F f = (F)g0.a.e(this.q);
        if (f.k() == 2 && G.d) {
            return null;
        }
        if (M.H0(this.g, n) == -1) {
            return null;
        }
        if (f.k() == 1) {
            return null;
        }
        final p0.g r = this.r;
        if (r == null) {
            final p0.g x = this.x(X2.v.Y(), true, null, b);
            this.m.add(x);
            this.r = x;
        }
        else {
            r.a(null);
        }
        return this.r;
    }
    
    public final void B(final Looper looper) {
        if (this.y == null) {
            this.y = new d(looper);
        }
    }
    
    public final void C() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            ((F)g0.a.e(this.q)).release();
            this.q = null;
        }
    }
    
    public final void D() {
        final g0 q = X2.y.T(this.o).q();
        while (q.hasNext()) {
            q.next().e(null);
        }
    }
    
    public final void E() {
        final g0 q = X2.y.T(this.n).q();
        while (q.hasNext()) {
            q.next().release();
        }
    }
    
    public void F(final int v, final byte[] w) {
        g0.a.f(this.m.isEmpty());
        if (v == 1 || v == 3) {
            g0.a.e(w);
        }
        this.v = v;
        this.w = w;
    }
    
    public final void G(final n n, final v.a a) {
        n.e(a);
        if (this.l != -9223372036854775807L) {
            n.e(null);
        }
    }
    
    public final void H(final boolean b) {
        if (b && this.t == null) {
            g0.o.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper)g0.a.e(this.t)).getThread()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ");
            sb.append(Thread.currentThread().getName());
            sb.append("\nExpected thread: ");
            sb.append(this.t.getThread().getName());
            g0.o.i("DefaultDrmSessionMgr", sb.toString(), new IllegalStateException());
        }
    }
    
    @Override
    public void a(final Looper looper, final y1 x) {
        this.z(looper);
        this.x = x;
    }
    
    @Override
    public int b(final q q) {
        int n = 0;
        this.H(false);
        final int k = ((F)g0.a.e(this.q)).k();
        final d0.m r = q.r;
        if (r == null) {
            if (M.H0(this.g, z.k(q.n)) != -1) {
                n = k;
            }
            return n;
        }
        if (this.v(r)) {
            return k;
        }
        return 1;
    }
    
    @Override
    public n c(final v.a a, final q q) {
        boolean b = false;
        this.H(false);
        if (this.p > 0) {
            b = true;
        }
        a.f(b);
        a.h(this.t);
        return this.t(this.t, a, q, true);
    }
    
    @Override
    public x.b d(final v.a a, final q q) {
        a.f(this.p > 0);
        a.h(this.t);
        final f f = new f(a);
        f.c(q);
        return f;
    }
    
    @Override
    public final void g() {
        this.H(true);
        if (this.p++ != 0) {
            return;
        }
        if (this.q == null) {
            (this.q = this.c.a(this.b)).a((F.b)new c(null));
            return;
        }
        if (this.l != -9223372036854775807L) {
            for (int i = 0; i < this.m.size(); ++i) {
                ((p0.g)this.m.get(i)).a(null);
            }
        }
    }
    
    @Override
    public final void release() {
        this.H(true);
        final int p = this.p - 1;
        this.p = p;
        if (p != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            final ArrayList<p0.g> list = new ArrayList<p0.g>(this.m);
            for (int i = 0; i < list.size(); ++i) {
                ((p0.g)list.get(i)).e(null);
            }
        }
        this.E();
        this.C();
    }
    
    public final n t(final Looper looper, final v.a a, final q q, final boolean b) {
        this.B(looper);
        final d0.m r = q.r;
        if (r == null) {
            return this.A(z.k(q.n), b);
        }
        final byte[] w = this.w;
        final p0.g g = null;
        List y;
        if (w == null) {
            if ((y = y((d0.m)a.e(r), this.b, false)).isEmpty()) {
                final e e = new e(this.b, null);
                g0.o.d("DefaultDrmSessionMgr", "DRM error", e);
                if (a != null) {
                    a.l(e);
                }
                return new D(new n.a(e, 6003));
            }
        }
        else {
            y = null;
        }
        p0.g s;
        if (!this.f) {
            s = this.s;
        }
        else {
            final Iterator iterator = this.m.iterator();
            do {
                s = g;
                if (!iterator.hasNext()) {
                    break;
                }
                s = iterator.next();
            } while (!M.c(s.a, y));
        }
        if (s == null) {
            final p0.g x = this.x(y, false, a, b);
            if (!this.f) {
                this.s = x;
            }
            this.m.add(x);
            return x;
        }
        s.a(a);
        return s;
    }
    
    public final boolean v(final d0.m m) {
        if (this.w != null) {
            return true;
        }
        if (y(m, this.b, true).isEmpty()) {
            if (m.r != 1 || !m.e(0).d(d0.g.b)) {
                return false;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.b);
            g0.o.h("DefaultDrmSessionMgr", sb.toString());
        }
        final String q = m.q;
        if (q == null) {
            return true;
        }
        if ("cenc".equals(q)) {
            return true;
        }
        if ("cbcs".equals(q)) {
            return M.a >= 25;
        }
        return !"cbc1".equals(q) && !"cens".equals(q);
    }
    
    public final p0.g w(final List list, final boolean b, final v.a a) {
        a.e(this.q);
        final p0.g g = new p0.g(this.b, this.q, (p0.g.a)this.i, (p0.g.b)this.k, list, this.v, this.h | b, b, this.w, this.e, this.d, (Looper)a.e(this.t), this.j, (y1)a.e(this.x));
        g.a(a);
        if (this.l != -9223372036854775807L) {
            g.a(null);
        }
        return g;
    }
    
    public final p0.g x(final List list, final boolean b, final v.a a, final boolean b2) {
        p0.g g2;
        final p0.g g = g2 = this.w(list, b, a);
        if (u(g)) {
            g2 = g;
            if (!this.o.isEmpty()) {
                this.D();
                this.G(g, a);
                g2 = this.w(list, b, a);
            }
        }
        p0.g w = g2;
        if (u(g2)) {
            w = g2;
            if (b2) {
                w = g2;
                if (!this.n.isEmpty()) {
                    this.E();
                    if (!this.o.isEmpty()) {
                        this.D();
                    }
                    this.G(g2, a);
                    w = this.w(list, b, a);
                }
            }
        }
        return w;
    }
    
    public final void z(final Looper t) {
        Looper t2 = null;
        final Looper looper;
        boolean b;
        Label_0046_Outer:Label_0031_Outer:
        while (true) {
            // monitorenter(this)
            while (true) {
                Label_0054: {
                    while (true) {
                        try {
                            t2 = this.t;
                            while (true) {
                                if (t2 == null) {
                                    this.t = t;
                                    this.u = new Handler(t);
                                    // monitorexit(this)
                                    return;
                                }
                                break Label_0054;
                                throw looper;
                                g0.a.f(b);
                                g0.a.e(this.u);
                                continue Label_0046_Outer;
                            }
                        }
                        // monitorexit(this)
                        finally {
                            continue Label_0031_Outer;
                        }
                        break;
                    }
                }
                b = (t2 == looper);
                continue;
            }
        }
    }
    
    public static final class b
    {
        public final HashMap a;
        public UUID b;
        public F.c c;
        public boolean d;
        public int[] e;
        public boolean f;
        public m g;
        public long h;
        
        public b() {
            this.a = new HashMap();
            this.b = d0.g.d;
            this.c = N.d;
            this.e = new int[0];
            this.f = true;
            this.g = new k();
            this.h = 300000L;
        }
        
        public h a(final Q q) {
            return new h(this.b, this.c, q, this.a, this.d, this.e, this.f, this.g, this.h, null);
        }
        
        public b b(final m m) {
            this.g = (m)g0.a.e(m);
            return this;
        }
        
        public b c(final boolean d) {
            this.d = d;
            return this;
        }
        
        public b d(final boolean f) {
            this.f = f;
            return this;
        }
        
        public b e(final int... array) {
            for (int length = array.length, i = 0; i < length; ++i) {
                final int n = array[i];
                boolean b = true;
                if (n != 2) {
                    b = (n == 1 && b);
                }
                g0.a.a(b);
            }
            this.e = array.clone();
            return this;
        }
        
        public b f(final UUID uuid, final F.c c) {
            this.b = (UUID)g0.a.e(uuid);
            this.c = (F.c)g0.a.e(c);
            return this;
        }
    }
    
    public class c implements F.b
    {
        @Override
        public void a(final F f, final byte[] array, final int n, final int n2, final byte[] array2) {
            ((d)g0.a.e(p0.h.this.y)).obtainMessage(n, (Object)array).sendToTarget();
        }
    }
    
    public class d extends Handler
    {
        public d(final Looper looper) {
            super(looper);
        }
        
        public void handleMessage(final Message message) {
            final byte[] array = (byte[])message.obj;
            if (array == null) {
                return;
            }
            for (final p0.g g : p0.h.m(p0.h.this)) {
                if (g.t(array)) {
                    g.B(message.what);
                    break;
                }
            }
        }
    }
    
    public static final class e extends Exception
    {
        public e(final UUID obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Media does not support uuid: ");
            sb.append(obj);
            super(sb.toString());
        }
    }
    
    public class f implements x.b
    {
        public final v.a b;
        public n c;
        public boolean d;
        
        public f(final v.a b) {
            this.b = b;
        }
        
        public void c(final q q) {
            ((Handler)a.e(p0.h.p(p0.h.this))).post((Runnable)new i(this, q));
        }
        
        @Override
        public void release() {
            M.S0((Handler)a.e(p0.h.p(p0.h.this)), new j(this));
        }
    }
    
    public class g implements a
    {
        public final Set a;
        public p0.g b;
        
        public g() {
            this.a = new HashSet();
        }
        
        @Override
        public void a(final p0.g b) {
            this.a.add(b);
            if (this.b != null) {
                return;
            }
            (this.b = b).H();
        }
        
        @Override
        public void b() {
            this.b = null;
            final X2.v u = X2.v.U(this.a);
            this.a.clear();
            final g0 q = u.q();
            while (q.hasNext()) {
                q.next().C();
            }
        }
        
        @Override
        public void c(final Exception ex, final boolean b) {
            this.b = null;
            final X2.v u = X2.v.U(this.a);
            this.a.clear();
            final g0 q = u.q();
            while (q.hasNext()) {
                q.next().D(ex, b);
            }
        }
        
        public void d(p0.g b) {
            this.a.remove(b);
            if (this.b == b) {
                this.b = null;
                if (!this.a.isEmpty()) {
                    b = this.a.iterator().next();
                    (this.b = b).H();
                }
            }
        }
    }
    
    public class h implements g.b
    {
        @Override
        public void a(final g g, final int n) {
            if (p0.h.n(p0.h.this) != -9223372036854775807L) {
                p0.h.o(p0.h.this).remove(g);
                ((Handler)g0.a.e(p0.h.p(p0.h.this))).removeCallbacksAndMessages((Object)g);
            }
        }
        
        @Override
        public void b(final g g, final int n) {
            if (n == 1 && p0.h.q(p0.h.this) > 0 && p0.h.n(p0.h.this) != -9223372036854775807L) {
                p0.h.o(p0.h.this).add(g);
                ((Handler)g0.a.e(p0.h.p(p0.h.this))).postAtTime((Runnable)new p0.k(g), (Object)g, SystemClock.uptimeMillis() + p0.h.n(p0.h.this));
            }
            else if (n == 0) {
                p0.h.m(p0.h.this).remove(g);
                if (p0.h.r(p0.h.this) == g) {
                    p0.h.s(p0.h.this, null);
                }
                if (p0.h.e(p0.h.this) == g) {
                    p0.h.f(p0.h.this, null);
                }
                p0.h.h(p0.h.this).d(g);
                if (p0.h.n(p0.h.this) != -9223372036854775807L) {
                    ((Handler)g0.a.e(p0.h.p(p0.h.this))).removeCallbacksAndMessages((Object)g);
                    p0.h.o(p0.h.this).remove(g);
                }
            }
            p0.h.this.C();
        }
    }
}

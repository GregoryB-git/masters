// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import d0.r;
import java.util.Collection;
import k0.u;
import java.util.ArrayList;
import d0.n;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import W2.s;
import android.media.MediaFormat;
import java.util.Iterator;
import d0.P;
import g0.A;
import android.view.Surface;
import java.util.List;
import X2.v;
import java.util.Objects;
import android.os.Handler$Callback;
import android.os.Looper;
import g0.M;
import d0.N;
import d0.h;
import g0.a;
import android.util.Pair;
import g0.k;
import java.util.concurrent.CopyOnWriteArraySet;
import g0.c;
import d0.F;
import android.content.Context;
import java.util.concurrent.Executor;
import d0.O;

public final class d implements G, O
{
    public static final Executor n;
    public final Context a;
    public final h b;
    public final q c;
    public final t d;
    public final F.a e;
    public final g0.c f;
    public final CopyOnWriteArraySet g;
    public d0.q h;
    public p i;
    public k j;
    public Pair k;
    public int l;
    public int m;
    
    static {
        n = new D0.b();
    }
    
    public d(final b b) {
        final Context a = D0.d.b.a(b);
        this.a = a;
        final h b2 = new h(a);
        this.b = b2;
        final g0.c b3 = D0.d.b.b(b);
        this.f = b3;
        final q c = D0.d.b.c(b);
        (this.c = c).o(b3);
        this.d = new t((t.a)new c(null), c);
        this.e = (F.a)g0.a.h(D0.d.b.d(b));
        this.g = new CopyOnWriteArraySet();
        this.m = 0;
        this.u((d)b2);
    }
    
    public static /* synthetic */ d0.q k(final d d) {
        return d.h;
    }
    
    public static /* synthetic */ d0.q l(final d d, final d0.q h) {
        return d.h = h;
    }
    
    public static /* synthetic */ CopyOnWriteArraySet m(final d d) {
        return d.g;
    }
    
    public static /* synthetic */ Pair n(final d d) {
        return d.k;
    }
    
    public static /* synthetic */ p o(final d d) {
        return d.i;
    }
    
    public static /* synthetic */ g0.c p(final d d) {
        return d.f;
    }
    
    public static /* synthetic */ F q(final d d) {
        d.getClass();
        return null;
    }
    
    public static /* synthetic */ Executor r() {
        return d.n;
    }
    
    public static /* synthetic */ q s(final d d) {
        return d.c;
    }
    
    public static /* synthetic */ N t(final d d, final d0.q q) {
        d.A(q);
        return null;
    }
    
    public static d0.h y(final d0.h h) {
        if (h != null && h.g()) {
            return h;
        }
        return h.h;
    }
    
    public final N A(final d0.q q) {
        g0.a.f(this.m == 0);
        d0.h h2;
        final d0.h h = h2 = y(q.A);
        if (h.c == 7) {
            h2 = h;
            if (M.a < 34) {
                h2 = h.a().e(6).a();
            }
        }
        final k e = this.f.e((Looper)g0.a.h(Looper.myLooper()), null);
        this.j = e;
        try {
            final F.a e2 = this.e;
            final Context a = this.a;
            final d0.k a2 = d0.k.a;
            Objects.requireNonNull(e);
            e2.a(a, h2, a2, this, new D0.a(e), v.Y(), 0L);
            final Pair k = this.k;
            if (k != null) {
                final Surface surface = (Surface)k.first;
                final A a3 = (A)k.second;
                this.E(surface, a3.b(), a3.a());
            }
        }
        catch (d0.M m) {
            throw new D0.F.b(m, q);
        }
        throw null;
    }
    
    public final boolean B() {
        return this.m == 1;
    }
    
    public final boolean C() {
        return this.l == 0 && this.d.e();
    }
    
    public final void E(final Surface surface, final int n, final int n2) {
    }
    
    public void F() {
        if (this.m == 2) {
            return;
        }
        final k j = this.j;
        if (j != null) {
            j.h(null);
        }
        this.k = null;
        this.m = 2;
    }
    
    public void G(final long n, final long n2) {
        if (this.l == 0) {
            this.d.h(n, n2);
        }
    }
    
    public void H(final Surface obj, final A a) {
        final Pair k = this.k;
        if (k != null && ((Surface)k.first).equals(obj) && ((A)this.k.second).equals(a)) {
            return;
        }
        this.k = Pair.create((Object)obj, (Object)a);
        this.E(obj, a.b(), a.a());
    }
    
    public final void I(final float n) {
        this.d.j(n);
    }
    
    public final void J(final p i) {
        this.i = i;
    }
    
    @Override
    public q a() {
        return this.c;
    }
    
    @Override
    public D0.F b() {
        return this.b;
    }
    
    public void u(final d e) {
        this.g.add(e);
    }
    
    public void v() {
        final A c = A.c;
        this.E(null, c.b(), c.a());
        this.k = null;
    }
    
    public final void w() {
        if (!this.B()) {
            return;
        }
        ++this.l;
        this.d.b();
        ((k)g0.a.h(this.j)).j(new D0.c(this));
    }
    
    public final void x() {
        final int l = this.l - 1;
        this.l = l;
        if (l > 0) {
            return;
        }
        if (l >= 0) {
            this.d.b();
            return;
        }
        throw new IllegalStateException(String.valueOf(this.l));
    }
    
    public final boolean z(final long n) {
        return this.l == 0 && this.d.d(n);
    }
    
    public static final class b
    {
        public final Context a;
        public final q b;
        public N.a c;
        public F.a d;
        public g0.c e;
        public boolean f;
        
        public b(final Context context, final q b) {
            this.a = context.getApplicationContext();
            this.b = b;
            this.e = g0.c.a;
        }
        
        public static /* synthetic */ Context a(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ g0.c b(final b b) {
            return b.e;
        }
        
        public static /* synthetic */ q c(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ F.a d(final b b) {
            return b.d;
        }
        
        public d e() {
            g0.a.f(this.f ^ true);
            if (this.d == null) {
                if (this.c == null) {
                    this.c = new e(null);
                }
                this.d = new f(this.c);
            }
            final d d = new d(this, null);
            this.f = true;
            return d;
        }
        
        public b f(final g0.c e) {
            this.e = e;
            return this;
        }
    }
    
    public final class c implements a
    {
        @Override
        public void b(final P p) {
            d.l(d.this, new d0.q.b().v0(p.a).Y(p.b).o0("video/raw").K());
            final Iterator<d> iterator = d.m(d.this).iterator();
            while (iterator.hasNext()) {
                iterator.next().b(d.this, p);
            }
        }
        
        @Override
        public void c(final long n, final long n2, final long n3, final boolean b) {
            if (b && d.n(d.this) != null) {
                final Iterator<d> iterator = (Iterator<d>)d.m(d.this).iterator();
                while (iterator.hasNext()) {
                    iterator.next().d(d.this);
                }
            }
            if (d.o(d.this) != null) {
                d0.q q;
                if (d.k(d.this) == null) {
                    q = new d0.q.b().K();
                }
                else {
                    q = d.k(d.this);
                }
                d.o(d.this).k(n2, d.p(d.this).c(), q, null);
            }
            d.q(d.this);
            android.support.v4.media.a.a(g0.a.h(null));
            throw null;
        }
        
        @Override
        public void d() {
            final Iterator<d> iterator = d.m(d.this).iterator();
            while (iterator.hasNext()) {
                iterator.next().a(d.this);
            }
            d.q(d.this);
            android.support.v4.media.a.a(g0.a.h(null));
            throw null;
        }
    }
    
    public interface d
    {
        void a(final D0.d p0);
        
        void b(final D0.d p0, final P p1);
        
        void d(final D0.d p0);
    }
    
    public static final class e implements a
    {
        public static final s a;
        
        static {
            a = W2.t.a(new D0.e());
        }
    }
    
    public static final class f implements a
    {
        public final N.a a;
        
        public f(final N.a a) {
            this.a = a;
        }
        
        @Override
        public F a(final Context ex, final d0.h h, final d0.k k, final O o, final Executor executor, final List list, final long n) {
            try {
                final Constructor<?> constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(N.a.class);
                try {
                    ((a)constructor.newInstance(this.a)).a((Context)ex, h, k, o, executor, list, n);
                    return null;
                }
                catch (Exception ex) {}
            }
            catch (Exception ex2) {}
            throw d0.M.a(ex);
        }
    }
    
    public abstract static final class g
    {
        public static Constructor a;
        public static Method b;
        public static Method c;
        
        public static n a(final float f) {
            try {
                b();
                final Object instance = g.a.newInstance(new Object[0]);
                g.b.invoke(instance, f);
                android.support.v4.media.a.a(g0.a.e(g.c.invoke(instance, new Object[0])));
                return null;
            }
            catch (Exception cause) {
                throw new IllegalStateException(cause);
            }
        }
        
        public static void b() {
            if (g.a == null || g.b == null || g.c == null) {
                final Class<?> forName = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                g.a = forName.getConstructor((Class<?>[])new Class[0]);
                g.b = forName.getMethod("setRotationDegrees", Float.TYPE);
                g.c = forName.getMethod("build", (Class<?>[])new Class[0]);
            }
        }
    }
    
    public final class h implements F, d
    {
        public final Context a;
        public final int b;
        public final ArrayList c;
        public d0.q d;
        public int e;
        public long f;
        public long g;
        public boolean h;
        public long i;
        public long j;
        public boolean k;
        public long l;
        public a m;
        public Executor n;
        
        public h(final Context a) {
            this.a = a;
            this.b = M.b0(a);
            this.c = new ArrayList();
            this.i = -9223372036854775807L;
            this.j = -9223372036854775807L;
            this.m = F.a.a;
            this.n = D0.d.r();
        }
        
        @Override
        public void A(final boolean b) {
            if (!this.J()) {
                this.k = false;
                this.i = -9223372036854775807L;
                this.j = -9223372036854775807L;
                D0.d.this.w();
                if (b) {
                    D0.d.s(D0.d.this).m();
                }
                return;
            }
            throw null;
        }
        
        @Override
        public void B() {
            D0.d.s(D0.d.this).l();
        }
        
        @Override
        public void C(final List o) {
            if (this.c.equals(o)) {
                return;
            }
            this.o(o);
            this.n();
        }
        
        @Override
        public void D(final long f, final long g) {
            this.h |= (this.f != f || this.g != g);
            this.f = f;
            this.g = g;
        }
        
        @Override
        public boolean E() {
            return M.B0(this.a);
        }
        
        @Override
        public void F(final a m, final Executor n) {
            this.m = m;
            this.n = n;
        }
        
        @Override
        public void G(final int n, final d0.q d) {
            g0.a.f(this.J());
            boolean b = true;
            if (n != 1 && n != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported input type ");
                sb.append(n);
                throw new UnsupportedOperationException(sb.toString());
            }
            d.s(d.this).p(d.v);
            if (n == 1 && M.a < 21) {
                final int w = d.w;
                if (w != -1 && w != 0) {
                    D0.d.g.a((float)w);
                }
            }
            this.e = n;
            this.d = d;
            if (!this.k) {
                this.n();
                this.k = true;
                this.l = -9223372036854775807L;
                return;
            }
            if (this.j == -9223372036854775807L) {
                b = false;
            }
            g0.a.f(b);
            this.l = this.j;
        }
        
        @Override
        public void H(final d0.q q) {
            g0.a.f(this.J() ^ true);
            D0.d.t(D0.d.this, q);
        }
        
        @Override
        public void I(final Surface surface, final A a) {
            D0.d.this.H(surface, a);
        }
        
        @Override
        public boolean J() {
            return false;
        }
        
        @Override
        public void K(final boolean b) {
            D0.d.s(D0.d.this).h(b);
        }
        
        @Override
        public void L() {
            D0.d.s(D0.d.this).g();
        }
        
        @Override
        public void a(final d d) {
            this.n.execute(new D0.g(this, this.m));
        }
        
        @Override
        public void b(final d d, final P p2) {
            this.n.execute(new D0.f(this, this.m, p2));
        }
        
        @Override
        public boolean c() {
            if (this.J()) {
                final long i = this.i;
                if (i != -9223372036854775807L && D0.d.this.z(i)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public void d(final d d) {
            this.n.execute(new D0.h(this, this.m));
        }
        
        @Override
        public boolean e() {
            return this.J() && D0.d.this.C();
        }
        
        @Override
        public void f(final long n, final long n2) {
            try {
                D0.d.this.G(n, n2);
            }
            catch (u u) {
                d0.q q = this.d;
                if (q == null) {
                    q = new d0.q.b().K();
                }
                throw new F.b(u, q);
            }
        }
        
        @Override
        public void j() {
            D0.d.s(D0.d.this).a();
        }
        
        public final void n() {
            if (this.d == null) {
                return;
            }
            new ArrayList().addAll(this.c);
            final d0.q q = (d0.q)g0.a.e(this.d);
            android.support.v4.media.a.a(g0.a.h(null));
            new r.b(y(q.A), q.t, q.u).b(q.x).a();
            throw null;
        }
        
        public void o(final List c) {
            this.c.clear();
            this.c.addAll(c);
        }
        
        @Override
        public void release() {
            D0.d.this.F();
        }
        
        @Override
        public void u(final float n) {
            D0.d.this.I(n);
        }
        
        @Override
        public void v() {
            D0.d.this.v();
        }
        
        @Override
        public long w(long l, final boolean b) {
            g0.a.f(this.J());
            g0.a.f(this.b != -1);
            l = this.l;
            if (l != -9223372036854775807L) {
                if (!D0.d.this.z(l)) {
                    return -9223372036854775807L;
                }
                this.n();
                this.l = -9223372036854775807L;
            }
            android.support.v4.media.a.a(g0.a.h(null));
            throw null;
        }
        
        @Override
        public Surface x() {
            g0.a.f(this.J());
            android.support.v4.media.a.a(g0.a.h(null));
            throw null;
        }
        
        @Override
        public void y() {
            D0.d.s(D0.d.this).k();
        }
        
        @Override
        public void z(final p p) {
            D0.d.this.J(p);
        }
    }
}

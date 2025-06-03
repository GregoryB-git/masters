/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.util.Pair
 *  android.view.Surface
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  java.util.concurrent.CopyOnWriteArraySet
 *  java.util.concurrent.Executor
 */
package D0;

import D0.F;
import D0.G;
import D0.a;
import D0.p;
import D0.q;
import D0.t;
import W2.s;
import X2.v;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import d0.F;
import d0.N;
import d0.O;
import d0.P;
import d0.h;
import d0.n;
import d0.q;
import d0.r;
import g0.A;
import g0.M;
import g0.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import k0.u;

public final class d
implements G,
O {
    public static final Executor n = new D0.b();
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

    public d(b b8) {
        g0.c c8;
        q q8;
        Object object = b8.a;
        this.a = object;
        this.b = object = new h((Context)object);
        this.f = c8 = b8.e;
        this.c = q8 = b8.b;
        q8.o(c8);
        this.d = new t(new c(null), q8);
        this.e = (F.a)g0.a.h(b8.d);
        this.g = new CopyOnWriteArraySet();
        this.m = 0;
        this.u((d)object);
    }

    public /* synthetic */ d(b b8,  a8) {
        this(b8);
    }

    public static /* synthetic */ void D(Runnable runnable) {
    }

    public static /* synthetic */ void c(d d8) {
        d8.x();
    }

    public static /* synthetic */ void d(Runnable runnable) {
        d.D(runnable);
    }

    public static /* synthetic */ d0.F q(d d8) {
        d8.getClass();
        return null;
    }

    public static /* synthetic */ N t(d d8, d0.q q8) {
        d8.A(q8);
        return null;
    }

    public static d0.h y(d0.h h8) {
        if (h8 != null && h8.g()) {
            return h8;
        }
        return d0.h.h;
    }

    public final N A(d0.q q8) {
        d0.M m82;
        block6 : {
            block5 : {
                boolean bl = this.m == 0;
                g0.a.f(bl);
                Object object = d.y(q8.A);
                d0.h h8 = object;
                if (object.c == 7) {
                    h8 = object;
                    if (M.a < 34) {
                        h8 = object.a().e(6).a();
                    }
                }
                this.j = object = this.f.e((Looper)g0.a.h((Object)Looper.myLooper()), null);
                try {
                    F.a a8 = this.e;
                    Context context = this.a;
                    d0.k k8 = d0.k.a;
                    Objects.requireNonNull((Object)object);
                    a8.a(context, h8, k8, this, new a((k)object), v.Y(), 0L);
                    object = this.k;
                    if (object == null) break block5;
                }
                catch (d0.M m82) {
                    break block6;
                }
                h8 = (Surface)object.first;
                object = (A)object.second;
                this.E((Surface)h8, object.b(), object.a());
            }
            throw null;
        }
        throw new F.b((Throwable)m82, q8);
    }

    public final boolean B() {
        if (this.m == 1) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if (this.l == 0 && this.d.e()) {
            return true;
        }
        return false;
    }

    public final void E(Surface surface, int n8, int n9) {
    }

    public void F() {
        if (this.m == 2) {
            return;
        }
        k k8 = this.j;
        if (k8 != null) {
            k8.h(null);
        }
        this.k = null;
        this.m = 2;
    }

    public void G(long l8, long l9) {
        if (this.l == 0) {
            this.d.h(l8, l9);
        }
    }

    public void H(Surface surface, A a8) {
        Pair pair = this.k;
        if (pair != null && ((Surface)pair.first).equals((Object)surface) && ((A)this.k.second).equals(a8)) {
            return;
        }
        this.k = Pair.create((Object)surface, (Object)a8);
        this.E(surface, a8.b(), a8.a());
    }

    public final void I(float f8) {
        this.d.j(f8);
    }

    public final void J(p p8) {
        this.i = p8;
    }

    @Override
    public q a() {
        return this.c;
    }

    @Override
    public F b() {
        return this.b;
    }

    public void u(d d8) {
        this.g.add((Object)d8);
    }

    public void v() {
        A a8 = A.c;
        this.E(null, a8.b(), a8.a());
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
        int n8;
        this.l = n8 = this.l - 1;
        if (n8 > 0) {
            return;
        }
        if (n8 >= 0) {
            this.d.b();
            return;
        }
        throw new IllegalStateException(String.valueOf((int)this.l));
    }

    public final boolean z(long l8) {
        if (this.l == 0 && this.d.d(l8)) {
            return true;
        }
        return false;
    }

    public static final class b {
        public final Context a;
        public final q b;
        public N.a c;
        public F.a d;
        public g0.c e;
        public boolean f;

        public b(Context context, q q8) {
            this.a = context.getApplicationContext();
            this.b = q8;
            this.e = g0.c.a;
        }

        public d e() {
            g0.a.f(this.f ^ true);
            if (this.d == null) {
                if (this.c == null) {
                    this.c = new e(null);
                }
                this.d = new f(this.c);
            }
            d d8 = new d(this, null);
            this.f = true;
            return d8;
        }

        public b f(g0.c c8) {
            this.e = c8;
            return this;
        }
    }

    public final class c
    implements t.a {
        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }

        @Override
        public void b(P p8) {
            d.this.h = new q.b().v0(p8.a).Y(p8.b).o0("video/raw").K();
            Iterator iterator = d.this.g.iterator();
            while (iterator.hasNext()) {
                ((d)iterator.next()).b(d.this, p8);
            }
        }

        @Override
        public void c(long l8, long l9, long l10, boolean bl) {
            Object object;
            if (bl && d.this.k != null) {
                object = d.this.g.iterator();
                while (object.hasNext()) {
                    ((d)object.next()).d(d.this);
                }
            }
            if (d.this.i != null) {
                object = d.this.h == null ? new q.b().K() : d.this.h;
                d.this.i.k(l9, d.this.f.c(), (d0.q)object, null);
            }
            d.q(d.this);
            android.support.v4.media.a.a(g0.a.h(null));
            throw null;
        }

        @Override
        public void d() {
            Iterator iterator = d.this.g.iterator();
            while (iterator.hasNext()) {
                ((d)iterator.next()).a(d.this);
            }
            d.q(d.this);
            android.support.v4.media.a.a(g0.a.h(null));
            throw null;
        }
    }

    public static interface d {
        public void a(d var1);

        public void b(d var1, P var2);

        public void d(d var1);
    }

    public static final class e
    implements N.a {
        public static final s a = W2.t.a(new D0.e());

        public e() {
        }

        public /* synthetic */ e( a8) {
            this();
        }

        public static /* synthetic */ N.a a() {
            return e.b();
        }

        public static /* synthetic */ N.a b() {
            try {
                Object object = Class.forName((String)"androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object object2 = object.getConstructor(new Class[0]).newInstance(new Object[0]);
                object = (N.a)g0.a.e(object.getMethod("build", new Class[0]).invoke(object2, new Object[0]));
                return object;
            }
            catch (Exception exception) {
                throw new IllegalStateException((Throwable)exception);
            }
        }
    }

    public static final class f
    implements F.a {
        public final N.a a;

        public f(N.a a8) {
            this.a = a8;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public d0.F a(Context context, d0.h h8, d0.k k8, O o8, Executor executor, List list, long l8) {
            void var1_4;
            Constructor constructor = Class.forName((String)"androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(new Class[]{N.a.class});
            try {
                ((F.a)constructor.newInstance(new Object[]{this.a})).a(context, h8, k8, o8, executor, list, l8);
                return null;
            }
            catch (Exception exception) {
                throw d0.M.a((Exception)var1_4);
            }
            catch (Exception exception) {
                // empty catch block
            }
            throw d0.M.a((Exception)var1_4);
        }
    }

    public static final abstract class g {
        public static Constructor a;
        public static Method b;
        public static Method c;

        public static n a(float f8) {
            try {
                g.b();
                Object object = a.newInstance(new Object[0]);
                b.invoke(object, new Object[]{Float.valueOf((float)f8)});
                android.support.v4.media.a.a(g0.a.e(c.invoke(object, new Object[0])));
                return null;
            }
            catch (Exception exception) {
                throw new IllegalStateException((Throwable)exception);
            }
        }

        public static void b() {
            if (a == null || b == null || c == null) {
                Class class_ = Class.forName((String)"androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                a = class_.getConstructor(new Class[0]);
                b = class_.getMethod("setRotationDegrees", new Class[]{Float.TYPE});
                c = class_.getMethod("build", new Class[0]);
            }
        }
    }

    public final class h
    implements F,
    d {
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
        public F.a m;
        public Executor n;

        public h(Context context) {
            this.a = context;
            this.b = M.b0(context);
            this.c = new ArrayList();
            this.i = -9223372036854775807L;
            this.j = -9223372036854775807L;
            this.m = F.a.a;
            this.n = n;
        }

        public static /* synthetic */ void g(h h8, F.a a8) {
            h8.l(a8);
        }

        public static /* synthetic */ void h(h h8, F.a a8) {
            h8.k(a8);
        }

        public static /* synthetic */ void i(h h8, F.a a8, P p8) {
            h8.m(a8, p8);
        }

        @Override
        public void A(boolean bl) {
            if (!this.J()) {
                this.k = false;
                this.i = -9223372036854775807L;
                this.j = -9223372036854775807L;
                d.this.w();
                if (bl) {
                    d.this.c.m();
                }
                return;
            }
            throw null;
        }

        @Override
        public void B() {
            d.this.c.l();
        }

        @Override
        public void C(List list) {
            if (this.c.equals((Object)list)) {
                return;
            }
            this.o(list);
            this.n();
        }

        @Override
        public void D(long l8, long l9) {
            boolean bl = this.h;
            boolean bl2 = this.f != l8 || this.g != l9;
            this.h = bl | bl2;
            this.f = l8;
            this.g = l9;
        }

        @Override
        public boolean E() {
            return M.B0(this.a);
        }

        @Override
        public void F(F.a a8, Executor executor) {
            this.m = a8;
            this.n = executor;
        }

        @Override
        public void G(int n8, d0.q q8) {
            int n9;
            g0.a.f(this.J());
            boolean bl = true;
            if (n8 != 1 && n8 != 2) {
                q8 = new StringBuilder();
                q8.append("Unsupported input type ");
                q8.append(n8);
                throw new UnsupportedOperationException(q8.toString());
            }
            d.this.c.p(q8.v);
            if (n8 == 1 && M.a < 21 && (n9 = q8.w) != -1 && n9 != 0) {
                g.a(n9);
            }
            this.e = n8;
            this.d = q8;
            if (!this.k) {
                this.n();
                this.k = true;
                this.l = -9223372036854775807L;
                return;
            }
            if (this.j == -9223372036854775807L) {
                bl = false;
            }
            g0.a.f(bl);
            this.l = this.j;
        }

        @Override
        public void H(d0.q q8) {
            g0.a.f(this.J() ^ true);
            d.t(d.this, q8);
        }

        @Override
        public void I(Surface surface, A a8) {
            d.this.H(surface, a8);
        }

        @Override
        public boolean J() {
            return false;
        }

        @Override
        public void K(boolean bl) {
            d.this.c.h(bl);
        }

        @Override
        public void L() {
            d.this.c.g();
        }

        @Override
        public void a(d object) {
            object = this.m;
            this.n.execute((Runnable)new D0.g(this, (F.a)object));
        }

        @Override
        public void b(d object, P p8) {
            object = this.m;
            this.n.execute((Runnable)new D0.f(this, (F.a)object, p8));
        }

        @Override
        public boolean c() {
            long l8;
            if (this.J() && (l8 = this.i) != -9223372036854775807L && d.this.z(l8)) {
                return true;
            }
            return false;
        }

        @Override
        public void d(d object) {
            object = this.m;
            this.n.execute((Runnable)new D0.h(this, (F.a)object));
        }

        @Override
        public boolean e() {
            if (this.J() && d.this.C()) {
                return true;
            }
            return false;
        }

        @Override
        public void f(long l8, long l9) {
            try {
                d.this.G(l8, l9);
                return;
            }
            catch (u u8) {
                d0.q q8 = this.d;
                if (q8 == null) {
                    q8 = new q.b().K();
                }
                throw new F.b((Throwable)u8, q8);
            }
        }

        @Override
        public void j() {
            d.this.c.a();
        }

        public final /* synthetic */ void k(F.a a8) {
            a8.a(this);
        }

        public final /* synthetic */ void l(F.a a8) {
            a8.b((F)g0.a.h(this));
        }

        public final /* synthetic */ void m(F.a a8, P p8) {
            a8.c(this, p8);
        }

        public final void n() {
            if (this.d == null) {
                return;
            }
            new ArrayList().addAll((Collection)this.c);
            d0.q q8 = (d0.q)g0.a.e(this.d);
            android.support.v4.media.a.a(g0.a.h(null));
            new r.b(d.y(q8.A), q8.t, q8.u).b(q8.x).a();
            throw null;
        }

        public void o(List list) {
            this.c.clear();
            this.c.addAll((Collection)list);
        }

        @Override
        public void release() {
            d.this.F();
        }

        @Override
        public void u(float f8) {
            d.this.I(f8);
        }

        @Override
        public void v() {
            d.this.v();
        }

        @Override
        public long w(long l8, boolean bl) {
            g0.a.f(this.J());
            bl = this.b != -1;
            g0.a.f(bl);
            l8 = this.l;
            if (l8 != -9223372036854775807L) {
                if (!d.this.z(l8)) {
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
            d.this.c.k();
        }

        @Override
        public void z(p p8) {
            d.this.J(p8);
        }
    }

}


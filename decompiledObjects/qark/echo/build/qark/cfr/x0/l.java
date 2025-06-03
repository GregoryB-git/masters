/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.IdentityHashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package x0;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import d0.I;
import d0.u;
import g0.M;
import i0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x0.T;
import x0.a;
import x0.h;
import x0.k;
import x0.s;
import x0.t;
import x0.v;
import x0.x;

public final class l
extends h {
    public static final u w = new u.c().e(Uri.EMPTY).a();
    public final List k;
    public final Set l;
    public Handler m;
    public final List n;
    public final IdentityHashMap o;
    public final Map p;
    public final Set q;
    public final boolean r;
    public final boolean s;
    public boolean t;
    public Set u;
    public T v;

    public /* varargs */ l(boolean bl, T t8, x ... arrx) {
        this(bl, false, t8, arrx);
    }

    public /* varargs */ l(boolean bl, boolean bl2, T t8, x ... arrx) {
        int n8 = arrx.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            g0.a.e(arrx[i8]);
        }
        T t9 = t8;
        if (t8.a() > 0) {
            t9 = t8.h();
        }
        this.v = t9;
        this.o = new IdentityHashMap();
        this.p = new HashMap();
        this.k = new ArrayList();
        this.n = new ArrayList();
        this.u = new HashSet();
        this.l = new HashSet();
        this.q = new HashSet();
        this.r = bl;
        this.s = bl2;
        this.Q((Collection)Arrays.asList((Object[])arrx));
    }

    public /* varargs */ l(boolean bl, x ... arrx) {
        this(bl, new T.a(0), arrx);
    }

    public /* varargs */ l(x ... arrx) {
        this(false, arrx);
    }

    public static /* synthetic */ boolean M(l l8, Message message) {
        return l8.f0(message);
    }

    public static Object Y(Object object) {
        return k0.a.v(object);
    }

    public static Object a0(Object object) {
        return k0.a.w(object);
    }

    public static Object b0(e e8, Object object) {
        return k0.a.y(e8.b, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void B() {
        synchronized (this) {
            try {
                super.B();
                this.n.clear();
                this.q.clear();
                this.p.clear();
                this.v = this.v.h();
                Handler handler = this.m;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object)null);
                    this.m = null;
                }
                this.t = false;
                this.u.clear();
                this.W(this.l);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void O(int n8, e e8) {
        int n9;
        if (n8 > 0) {
            e e9 = (e)this.n.get(n8 - 1);
            I i8 = e9.a.Z();
            n9 = e9.e + i8.p();
        } else {
            n9 = 0;
        }
        e8.a(n8, n9);
        this.T(n8, 1, e8.a.Z().p());
        this.n.add(n8, (Object)e8);
        this.p.put(e8.b, (Object)e8);
        this.K(e8, e8.a);
        if (this.y() && this.o.isEmpty()) {
            this.q.add((Object)e8);
            return;
        }
        this.D(e8);
    }

    public void P(int n8, Collection collection, Handler handler, Runnable runnable) {
        synchronized (this) {
            this.S(n8, collection, handler, runnable);
            return;
        }
    }

    public void Q(Collection collection) {
        synchronized (this) {
            this.S(this.k.size(), collection, null, null);
            return;
        }
    }

    public final void R(int n8, Collection collection) {
        collection = collection.iterator();
        while (collection.hasNext()) {
            this.O(n8, (e)collection.next());
            ++n8;
        }
    }

    public final void S(int n8, Collection collection, Handler handler, Runnable runnable) {
        boolean bl = false;
        boolean bl2 = handler == null;
        boolean bl3 = runnable == null;
        if (bl2 == bl3) {
            bl = true;
        }
        g0.a.a(bl);
        Handler handler2 = this.m;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            g0.a.e((x)iterator.next());
        }
        iterator = new ArrayList(collection.size());
        Iterator iterator2 = collection.iterator();
        while (iterator2.hasNext()) {
            iterator.add((Object)new e((x)iterator2.next(), this.s));
        }
        this.k.addAll(n8, (Collection)iterator);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(1, (Object)new f(n8, (Object)iterator, this.U(handler, runnable))).sendToTarget();
            return;
        }
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    public final void T(int n8, int n9, int n10) {
        while (n8 < this.n.size()) {
            e e8 = (e)this.n.get(n8);
            e8.d += n9;
            e8.e += n10;
            ++n8;
        }
    }

    public final d U(Handler object, Runnable runnable) {
        if (object != null && runnable != null) {
            object = new d((Handler)object, runnable);
            this.l.add(object);
            return object;
        }
        return null;
    }

    public final void V() {
        Iterator iterator = this.q.iterator();
        while (iterator.hasNext()) {
            e e8 = (e)iterator.next();
            if (!e8.c.isEmpty()) continue;
            this.D(e8);
            iterator.remove();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void W(Set set) {
        synchronized (this) {
            try {
                Iterator iterator = set.iterator();
                do {
                    if (!iterator.hasNext()) {
                        this.l.removeAll((Collection)set);
                        return;
                    }
                    ((d)iterator.next()).a();
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void X(e e8) {
        this.q.add((Object)e8);
        this.E(e8);
    }

    public x.b Z(e e8, x.b b8) {
        for (int i8 = 0; i8 < e8.c.size(); ++i8) {
            if (((x.b)e8.c.get((int)i8)).d != b8.d) continue;
            return b8.a(l.b0(e8, b8.a));
        }
        return null;
    }

    @Override
    public u a() {
        return w;
    }

    public final Handler c0() {
        return (Handler)g0.a.e((Object)this.m);
    }

    public int d0() {
        synchronized (this) {
            int n8 = this.k.size();
            return n8;
        }
    }

    @Override
    public void e(v v8) {
        e e8 = (e)g0.a.e((e)this.o.remove((Object)v8));
        e8.a.e(v8);
        e8.c.remove((Object)((s)v8).o);
        if (!this.o.isEmpty()) {
            this.V();
        }
        this.g0(e8);
    }

    public int e0(e e8, int n8) {
        return n8 + e8.e;
    }

    @Override
    public v f(x.b object, B0.b object2, long l8) {
        Object object3 = l.a0(object.a);
        x.b b8 = object.a(l.Y(object.a));
        object = object3 = (e)this.p.get(object3);
        if (object3 == null) {
            object = new e(new c(null), this.s);
            object.f = true;
            this.K(object, object.a);
        }
        this.X((e)object);
        object.c.add((Object)b8);
        object2 = object.a.W(b8, (B0.b)object2, l8);
        this.o.put(object2, object);
        this.V();
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean f0(Message object) {
        block0 : switch (object.what) {
            default: {
                throw new IllegalStateException();
            }
            case 6: {
                this.W((Set)M.i(object.obj));
                return true;
            }
            case 5: {
                this.t0();
                return true;
            }
            case 4: {
                object = (f)M.i(object.obj);
                this.v = (T)object.b;
                break;
            }
            case 3: {
                object = (f)M.i(object.obj);
                T t8 = this.v;
                int n8 = object.a;
                this.v = t8 = t8.b(n8, n8 + 1);
                this.v = t8.d((Integer)object.b, 1);
                this.i0(object.a, (Integer)object.b);
                break;
            }
            case 2: {
                f f8 = (f)M.i(object.obj);
                int n9 = f8.a;
                int n10 = (Integer)f8.b;
                object = n9 == 0 && n10 == this.v.a() ? this.v.h() : this.v.b(n9, n10);
                this.v = object;
                --n10;
                do {
                    object = f8;
                    if (n10 < n9) break block0;
                    this.l0(n10);
                    --n10;
                } while (true);
            }
            case 1: {
                object = (f)M.i(object.obj);
                this.v = this.v.d(object.a, ((Collection)object.b).size());
                this.R(object.a, (Collection)object.b);
            }
        }
        this.p0(object.c);
        return true;
    }

    public final void g0(e e8) {
        if (e8.f && e8.c.isEmpty()) {
            this.q.remove((Object)e8);
            this.L(e8);
        }
    }

    public void h0(int n8, int n9, Handler handler, Runnable runnable) {
        synchronized (this) {
            this.j0(n8, n9, handler, runnable);
            return;
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    public final void i0(int n8, int n9) {
        int n10 = Math.min((int)n8, (int)n9);
        int n11 = Math.max((int)n8, (int)n9);
        int n12 = ((e)this.n.get((int)n10)).e;
        Object object = this.n;
        object.add(n9, (Object)((e)object.remove(n8)));
        n9 = n12;
        n8 = n10;
        while (n8 <= n11) {
            object = (e)this.n.get(n8);
            object.d = n8++;
            object.e = n9;
            n9 += object.a.Z().p();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public I j() {
        synchronized (this) {
            try {
                T t8 = this.v.a() != this.k.size() ? this.v.h().d(0, this.k.size()) : this.v;
                return new b((Collection)this.k, t8, this.r);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void j0(int n8, int n9, Handler handler, Runnable runnable) {
        boolean bl = false;
        boolean bl2 = handler == null;
        boolean bl3 = runnable == null;
        if (bl2 == bl3) {
            bl = true;
        }
        g0.a.a(bl);
        Handler handler2 = this.m;
        List list = this.k;
        list.add(n9, (Object)((e)list.remove(n8)));
        if (handler2 != null) {
            handler2.obtainMessage(3, (Object)new f(n8, n9, this.U(handler, runnable))).sendToTarget();
            return;
        }
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    public void k0(e e8, x x8, I i8) {
        this.s0(e8, i8);
    }

    public final void l0(int n8) {
        e e8 = (e)this.n.remove(n8);
        this.p.remove(e8.b);
        this.T(n8, -1, - e8.a.Z().p());
        e8.f = true;
        this.g0(e8);
    }

    public void m0(int n8, int n9, Handler handler, Runnable runnable) {
        synchronized (this) {
            this.n0(n8, n9, handler, runnable);
            return;
        }
    }

    public final void n0(int n8, int n9, Handler handler, Runnable runnable) {
        boolean bl = false;
        boolean bl2 = handler == null;
        boolean bl3 = runnable == null;
        if (bl2 == bl3) {
            bl = true;
        }
        g0.a.a(bl);
        Handler handler2 = this.m;
        M.U0(this.k, n8, n9);
        if (handler2 != null) {
            handler2.obtainMessage(2, (Object)new f(n8, n9, this.U(handler, runnable))).sendToTarget();
            return;
        }
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    public final void o0() {
        this.p0(null);
    }

    public final void p0(d d8) {
        if (!this.t) {
            this.c0().obtainMessage(5).sendToTarget();
            this.t = true;
        }
        if (d8 != null) {
            this.u.add((Object)d8);
        }
    }

    public final void q0(T t8, Handler handler, Runnable runnable) {
        boolean bl = true;
        int n8 = handler == null ? 1 : 0;
        int n9 = runnable == null ? 1 : 0;
        if (n8 != n9) {
            bl = false;
        }
        g0.a.a(bl);
        Handler handler2 = this.m;
        if (handler2 != null) {
            n8 = this.d0();
            T t9 = t8;
            if (t8.a() != n8) {
                t9 = t8.h().d(0, n8);
            }
            handler2.obtainMessage(4, (Object)new f(0, t9, this.U(handler, runnable))).sendToTarget();
            return;
        }
        T t10 = t8;
        if (t8.a() > 0) {
            t10 = t8.h();
        }
        this.v = t10;
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    public void r0(T t8) {
        synchronized (this) {
            this.q0(t8, null, null);
            return;
        }
    }

    public final void s0(e e8, I i8) {
        if (e8.d + 1 < this.n.size()) {
            e e9 = (e)this.n.get(e8.d + 1);
            int n8 = i8.p() - (e9.e - e8.e);
            if (n8 != 0) {
                this.T(e8.d + 1, 0, n8);
            }
        }
        this.o0();
    }

    public final void t0() {
        this.t = false;
        Set set = this.u;
        this.u = new HashSet();
        this.A(new b((Collection)this.n, this.v, this.r));
        this.c0().obtainMessage(6, (Object)set).sendToTarget();
    }

    @Override
    public void v() {
        super.v();
        this.q.clear();
    }

    @Override
    public void w() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void z(y y8) {
        synchronized (this) {
            try {
                super.z(y8);
                this.m = new Handler((Handler.Callback)new k(this));
                if (this.k.isEmpty()) {
                    this.t0();
                } else {
                    this.v = this.v.d(0, this.k.size());
                    this.R(0, (Collection)this.k);
                    this.o0();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static final class b
    extends k0.a {
        public final int h;
        public final int i;
        public final int[] j;
        public final int[] k;
        public final I[] l;
        public final Object[] m;
        public final HashMap n;

        public b(Collection collection, T arrobject, boolean bl) {
            super(bl, (T)arrobject);
            int n8 = collection.size();
            this.j = new int[n8];
            this.k = new int[n8];
            this.l = new I[n8];
            this.m = new Object[n8];
            this.n = new HashMap();
            collection = collection.iterator();
            int n9 = 0;
            int n10 = n8 = 0;
            while (collection.hasNext()) {
                Object object = (e)collection.next();
                this.l[n10] = object.a.Z();
                this.k[n10] = n9;
                this.j[n10] = n8;
                n9 += this.l[n10].p();
                n8 += this.l[n10].i();
                arrobject = this.m;
                arrobject[n10] = object = object.b;
                this.n.put(object, (Object)n10);
                ++n10;
            }
            this.h = n9;
            this.i = n8;
        }

        @Override
        public int A(int n8) {
            return this.k[n8];
        }

        @Override
        public I D(int n8) {
            return this.l[n8];
        }

        @Override
        public int i() {
            return this.i;
        }

        @Override
        public int p() {
            return this.h;
        }

        @Override
        public int s(Object object) {
            if ((object = (Integer)this.n.get(object)) == null) {
                return -1;
            }
            return object.intValue();
        }

        @Override
        public int t(int n8) {
            return M.g(this.j, n8 + 1, false, false);
        }

        @Override
        public int u(int n8) {
            return M.g(this.k, n8 + 1, false, false);
        }

        @Override
        public Object x(int n8) {
            return this.m[n8];
        }

        @Override
        public int z(int n8) {
            return this.j[n8];
        }
    }

    public static final class c
    extends a {
        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }

        @Override
        public void B() {
        }

        @Override
        public u a() {
            return w;
        }

        @Override
        public void e(v v8) {
        }

        @Override
        public v f(x.b b8, B0.b b9, long l8) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void h() {
        }

        @Override
        public void z(y y8) {
        }
    }

    public static final class d {
        public final Handler a;
        public final Runnable b;

        public d(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        public void a() {
            this.a.post(this.b);
        }
    }

    public static final class e {
        public final t a;
        public final Object b;
        public final List c;
        public int d;
        public int e;
        public boolean f;

        public e(x x8, boolean bl) {
            this.a = new t(x8, bl);
            this.c = new ArrayList();
            this.b = new Object();
        }

        public void a(int n8, int n9) {
            this.d = n8;
            this.e = n9;
            this.f = false;
            this.c.clear();
        }
    }

    public static final class f {
        public final int a;
        public final Object b;
        public final d c;

        public f(int n8, Object object, d d8) {
            this.a = n8;
            this.b = object;
            this.c = d8;
        }
    }

}


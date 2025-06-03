// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import android.os.Handler$Callback;
import i0.y;
import g0.M;
import B0.b;
import java.util.Iterator;
import d0.I;
import android.os.Message;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import g0.a;
import android.net.Uri;
import java.util.Map;
import java.util.IdentityHashMap;
import android.os.Handler;
import java.util.Set;
import java.util.List;
import d0.u;

public final class l extends h
{
    public static final u w;
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
    
    static {
        w = new u.c().e(Uri.EMPTY).a();
    }
    
    public l(final boolean b, final T t, final x... array) {
        this(b, false, t, array);
    }
    
    public l(final boolean r, final boolean s, final T t, final x... a) {
        for (int length = a.length, i = 0; i < length; ++i) {
            g0.a.e(a[i]);
        }
        T h = t;
        if (t.a() > 0) {
            h = t.h();
        }
        this.v = h;
        this.o = new IdentityHashMap();
        this.p = new HashMap();
        this.k = new ArrayList();
        this.n = new ArrayList();
        this.u = new HashSet();
        this.l = new HashSet();
        this.q = new HashSet();
        this.r = r;
        this.s = s;
        this.Q(Arrays.asList(a));
    }
    
    public l(final boolean b, final x... array) {
        this(b, new T.a(0), array);
    }
    
    public l(final x... array) {
        this(false, array);
    }
    
    public static /* synthetic */ u N() {
        return l.w;
    }
    
    public static Object Y(final Object o) {
        return k0.a.v(o);
    }
    
    public static Object a0(final Object o) {
        return k0.a.w(o);
    }
    
    public static Object b0(final e e, final Object o) {
        return k0.a.y(e.b, o);
    }
    
    @Override
    public void B() {
        // monitorenter(this)
        while (true) {
            try {
                super.B();
                this.n.clear();
                this.q.clear();
                this.p.clear();
                this.v = this.v.h();
                final Handler m = this.m;
                if (m != null) {
                    m.removeCallbacksAndMessages((Object)null);
                    this.m = null;
                }
                this.t = false;
                this.u.clear();
                this.W(this.l);
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void O(final int n, final e e) {
        int n2;
        if (n > 0) {
            final e e2 = this.n.get(n - 1);
            n2 = e2.e + e2.a.Z().p();
        }
        else {
            n2 = 0;
        }
        e.a(n, n2);
        this.T(n, 1, e.a.Z().p());
        this.n.add(n, e);
        this.p.put(e.b, e);
        this.K(e, e.a);
        if (this.y() && this.o.isEmpty()) {
            this.q.add(e);
            return;
        }
        this.D(e);
    }
    
    public void P(final int n, final Collection collection, final Handler handler, final Runnable runnable) {
        synchronized (this) {
            this.S(n, collection, handler, runnable);
        }
    }
    
    public void Q(final Collection collection) {
        synchronized (this) {
            this.S(this.k.size(), collection, null, null);
        }
    }
    
    public final void R(int n, final Collection collection) {
        final Iterator<e> iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.O(n, iterator.next());
            ++n;
        }
    }
    
    public final void S(final int n, final Collection collection, final Handler handler, final Runnable runnable) {
        boolean b = false;
        if (handler == null == (runnable == null)) {
            b = true;
        }
        g0.a.a(b);
        final Handler m = this.m;
        final Iterator<x> iterator = collection.iterator();
        while (iterator.hasNext()) {
            g0.a.e(iterator.next());
        }
        final ArrayList<e> list = new ArrayList<e>(collection.size());
        final Iterator<x> iterator2 = collection.iterator();
        while (iterator2.hasNext()) {
            list.add(new e(iterator2.next(), this.s));
        }
        this.k.addAll(n, list);
        if (m != null && !collection.isEmpty()) {
            m.obtainMessage(1, (Object)new f(n, list, this.U(handler, runnable))).sendToTarget();
            return;
        }
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }
    
    public final void T(int i, final int n, final int n2) {
        while (i < this.n.size()) {
            final e e = this.n.get(i);
            e.d += n;
            e.e += n2;
            ++i;
        }
    }
    
    public final d U(final Handler handler, final Runnable runnable) {
        if (handler != null && runnable != null) {
            final d d = new d(handler, runnable);
            this.l.add(d);
            return d;
        }
        return null;
    }
    
    public final void V() {
        final Iterator<e> iterator = (Iterator<e>)this.q.iterator();
        while (iterator.hasNext()) {
            final e e = iterator.next();
            if (e.c.isEmpty()) {
                this.D(e);
                iterator.remove();
            }
        }
    }
    
    public final void W(final Set set) {
        // monitorenter(this)
        while (true) {
            try {
                final Iterator<d> iterator = set.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a();
                }
                this.l.removeAll(set);
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void X(final e e) {
        this.q.add(e);
        this.E(e);
    }
    
    public x.b Z(final e e, final x.b b) {
        for (int i = 0; i < e.c.size(); ++i) {
            if (((x.b)e.c.get(i)).d == b.d) {
                return b.a(b0(e, b.a));
            }
        }
        return null;
    }
    
    @Override
    public u a() {
        return x0.l.w;
    }
    
    public final Handler c0() {
        return (Handler)g0.a.e(this.m);
    }
    
    public int d0() {
        synchronized (this) {
            return this.k.size();
        }
    }
    
    @Override
    public void e(final v key) {
        final e e = (e)g0.a.e(this.o.remove(key));
        e.a.e(key);
        e.c.remove(((s)key).o);
        if (!this.o.isEmpty()) {
            this.V();
        }
        this.g0(e);
    }
    
    public int e0(final e e, final int n) {
        return n + e.e;
    }
    
    @Override
    public v f(final x.b b, final B0.b b2, final long n) {
        final Object a0 = a0(b.a);
        final x.b a2 = b.a(Y(b.a));
        e value;
        if ((value = this.p.get(a0)) == null) {
            value = new e(new c(null), this.s);
            value.f = true;
            this.K(value, value.a);
        }
        this.X(value);
        value.c.add(a2);
        final s w = value.a.W(a2, b2, n);
        this.o.put(w, value);
        this.V();
        return w;
    }
    
    public final boolean f0(final Message message) {
        f f = null;
        Label_0096: {
            switch (message.what) {
                default: {
                    throw new IllegalStateException();
                }
                case 6: {
                    this.W((Set)M.i(message.obj));
                    return true;
                }
                case 5: {
                    this.t0();
                    return true;
                }
                case 4: {
                    f = (f)M.i(message.obj);
                    this.v = (T)f.b;
                    break;
                }
                case 3: {
                    f = (f)M.i(message.obj);
                    final T v = this.v;
                    final int a = f.a;
                    final T b = v.b(a, a + 1);
                    this.v = b;
                    this.v = b.d((int)f.b, 1);
                    this.i0(f.a, (int)f.b);
                    break;
                }
                case 2: {
                    final f f2 = (f)M.i(message.obj);
                    final int a2 = f2.a;
                    final int intValue = (int)f2.b;
                    T v2;
                    if (a2 == 0 && intValue == this.v.a()) {
                        v2 = this.v.h();
                    }
                    else {
                        v2 = this.v.b(a2, intValue);
                    }
                    this.v = v2;
                    int n = intValue - 1;
                    while (true) {
                        f = f2;
                        if (n < a2) {
                            break Label_0096;
                        }
                        this.l0(n);
                        --n;
                    }
                    break;
                }
                case 1: {
                    f = (f)M.i(message.obj);
                    this.v = this.v.d(f.a, ((Collection)f.b).size());
                    this.R(f.a, (Collection)f.b);
                    break;
                }
            }
        }
        this.p0(f.c);
        return true;
    }
    
    public final void g0(final e e) {
        if (e.f && e.c.isEmpty()) {
            this.q.remove(e);
            this.L(e);
        }
    }
    
    public void h0(final int n, final int n2, final Handler handler, final Runnable runnable) {
        synchronized (this) {
            this.j0(n, n2, handler, runnable);
        }
    }
    
    @Override
    public boolean i() {
        return false;
    }
    
    public final void i0(int i, int e) {
        final int min = Math.min(i, e);
        final int max = Math.max(i, e);
        final int e2 = this.n.get(min).e;
        final List n = this.n;
        n.add(e, n.remove(i));
        e = e2;
        e e3;
        for (i = min; i <= max; ++i) {
            e3 = this.n.get(i);
            e3.d = i;
            e3.e = e;
            e += e3.a.Z().p();
        }
    }
    
    @Override
    public I j() {
        // monitorenter(this)
        while (true) {
            try {
                T t;
                if (this.v.a() != this.k.size()) {
                    t = this.v.h().d(0, this.k.size());
                }
                else {
                    t = this.v;
                }
                // monitorexit(this)
                return new b(this.k, t, this.r);
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void j0(final int n, final int i, final Handler handler, final Runnable runnable) {
        boolean b = false;
        if (handler == null == (runnable == null)) {
            b = true;
        }
        g0.a.a(b);
        final Handler m = this.m;
        final List k = this.k;
        k.add(i, k.remove(n));
        if (m != null) {
            m.obtainMessage(3, (Object)new f(n, i, this.U(handler, runnable))).sendToTarget();
            return;
        }
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }
    
    public void k0(final e e, final x x, final I i) {
        this.s0(e, i);
    }
    
    public final void l0(final int n) {
        final e e = this.n.remove(n);
        this.p.remove(e.b);
        this.T(n, -1, -e.a.Z().p());
        e.f = true;
        this.g0(e);
    }
    
    public void m0(final int n, final int n2, final Handler handler, final Runnable runnable) {
        synchronized (this) {
            this.n0(n, n2, handler, runnable);
        }
    }
    
    public final void n0(final int n, final int i, final Handler handler, final Runnable runnable) {
        boolean b = false;
        if (handler == null == (runnable == null)) {
            b = true;
        }
        g0.a.a(b);
        final Handler m = this.m;
        M.U0(this.k, n, i);
        if (m != null) {
            m.obtainMessage(2, (Object)new f(n, i, this.U(handler, runnable))).sendToTarget();
            return;
        }
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }
    
    public final void o0() {
        this.p0(null);
    }
    
    public final void p0(final d d) {
        if (!this.t) {
            this.c0().obtainMessage(5).sendToTarget();
            this.t = true;
        }
        if (d != null) {
            this.u.add(d);
        }
    }
    
    public final void q0(final T t, final Handler handler, final Runnable runnable) {
        boolean b = true;
        if (handler == null != (runnable == null)) {
            b = false;
        }
        g0.a.a(b);
        final Handler m = this.m;
        if (m != null) {
            final int d0 = this.d0();
            T d2 = t;
            if (t.a() != d0) {
                d2 = t.h().d(0, d0);
            }
            m.obtainMessage(4, (Object)new f(0, d2, this.U(handler, runnable))).sendToTarget();
            return;
        }
        T h = t;
        if (t.a() > 0) {
            h = t.h();
        }
        this.v = h;
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }
    
    public void r0(final T t) {
        synchronized (this) {
            this.q0(t, null, null);
        }
    }
    
    public final void s0(final e e, final I i) {
        if (e.d + 1 < this.n.size()) {
            final int n = i.p() - (this.n.get(e.d + 1).e - e.e);
            if (n != 0) {
                this.T(e.d + 1, 0, n);
            }
        }
        this.o0();
    }
    
    public final void t0() {
        this.t = false;
        final Set u = this.u;
        this.u = new HashSet();
        this.A(new b(this.n, this.v, this.r));
        this.c0().obtainMessage(6, (Object)u).sendToTarget();
    }
    
    @Override
    public void v() {
        super.v();
        this.q.clear();
    }
    
    @Override
    public void w() {
    }
    
    @Override
    public void z(final y y) {
        // monitorenter(this)
        while (true) {
            try {
                super.z(y);
                this.m = new Handler((Handler$Callback)new k(this));
                if (this.k.isEmpty()) {
                    this.t0();
                }
                else {
                    this.v = this.v.d(0, this.k.size());
                    this.R(0, this.k);
                    this.o0();
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final class b extends k0.a
    {
        public final int h;
        public final int i;
        public final int[] j;
        public final int[] k;
        public final I[] l;
        public final Object[] m;
        public final HashMap n;
        
        public b(final Collection collection, final T t, final boolean b) {
            super(b, t);
            final int size = collection.size();
            this.j = new int[size];
            this.k = new int[size];
            this.l = new I[size];
            this.m = new Object[size];
            this.n = new HashMap();
            final Iterator<e> iterator = collection.iterator();
            int h = 0;
            int j;
            int i = j = 0;
            while (iterator.hasNext()) {
                final e e = iterator.next();
                this.l[j] = e.a.Z();
                this.k[j] = h;
                this.j[j] = i;
                h += this.l[j].p();
                i += this.l[j].i();
                final Object[] m = this.m;
                final Object b2 = e.b;
                m[j] = b2;
                this.n.put(b2, j);
                ++j;
            }
            this.h = h;
            this.i = i;
        }
        
        @Override
        public int A(final int n) {
            return this.k[n];
        }
        
        @Override
        public I D(final int n) {
            return this.l[n];
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
        public int s(final Object key) {
            final Integer n = this.n.get(key);
            if (n == null) {
                return -1;
            }
            return n;
        }
        
        @Override
        public int t(final int n) {
            return M.g(this.j, n + 1, false, false);
        }
        
        @Override
        public int u(final int n) {
            return M.g(this.k, n + 1, false, false);
        }
        
        @Override
        public Object x(final int n) {
            return this.m[n];
        }
        
        @Override
        public int z(final int n) {
            return this.j[n];
        }
    }
    
    public static final class c extends a
    {
        @Override
        public void B() {
        }
        
        @Override
        public u a() {
            return x0.l.N();
        }
        
        @Override
        public void e(final v v) {
        }
        
        @Override
        public v f(final x.b b, final b b2, final long n) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void h() {
        }
        
        @Override
        public void z(final y y) {
        }
    }
    
    public static final class d
    {
        public final Handler a;
        public final Runnable b;
        
        public d(final Handler a, final Runnable b) {
            this.a = a;
            this.b = b;
        }
        
        public void a() {
            this.a.post(this.b);
        }
    }
    
    public static final class e
    {
        public final t a;
        public final Object b;
        public final List c;
        public int d;
        public int e;
        public boolean f;
        
        public e(final x x, final boolean b) {
            this.a = new t(x, b);
            this.c = new ArrayList();
            this.b = new Object();
        }
        
        public void a(final int d, final int e) {
            this.d = d;
            this.e = e;
            this.f = false;
            this.c.clear();
        }
    }
    
    public static final class f
    {
        public final int a;
        public final Object b;
        public final d c;
        
        public f(final int a, final Object b, final d c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}

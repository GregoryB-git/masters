package x0;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import d0.AbstractC1170I;
import d0.C1198u;
import g0.AbstractC1297a;
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
import k0.AbstractC1399a;
import x0.InterfaceC2142x;
import x0.T;

/* renamed from: x0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2131l extends AbstractC2127h {

    /* renamed from: w, reason: collision with root package name */
    public static final C1198u f20762w = new C1198u.c().e(Uri.EMPTY).a();

    /* renamed from: k, reason: collision with root package name */
    public final List f20763k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f20764l;

    /* renamed from: m, reason: collision with root package name */
    public Handler f20765m;

    /* renamed from: n, reason: collision with root package name */
    public final List f20766n;

    /* renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f20767o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f20768p;

    /* renamed from: q, reason: collision with root package name */
    public final Set f20769q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f20770r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20771s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20772t;

    /* renamed from: u, reason: collision with root package name */
    public Set f20773u;

    /* renamed from: v, reason: collision with root package name */
    public T f20774v;

    /* renamed from: x0.l$b */
    public static final class b extends AbstractC1399a {

        /* renamed from: h, reason: collision with root package name */
        public final int f20775h;

        /* renamed from: i, reason: collision with root package name */
        public final int f20776i;

        /* renamed from: j, reason: collision with root package name */
        public final int[] f20777j;

        /* renamed from: k, reason: collision with root package name */
        public final int[] f20778k;

        /* renamed from: l, reason: collision with root package name */
        public final AbstractC1170I[] f20779l;

        /* renamed from: m, reason: collision with root package name */
        public final Object[] f20780m;

        /* renamed from: n, reason: collision with root package name */
        public final HashMap f20781n;

        public b(Collection collection, T t7, boolean z7) {
            super(z7, t7);
            int size = collection.size();
            this.f20777j = new int[size];
            this.f20778k = new int[size];
            this.f20779l = new AbstractC1170I[size];
            this.f20780m = new Object[size];
            this.f20781n = new HashMap();
            Iterator it = collection.iterator();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.f20779l[i9] = eVar.f20784a.Z();
                this.f20778k[i9] = i7;
                this.f20777j[i9] = i8;
                i7 += this.f20779l[i9].p();
                i8 += this.f20779l[i9].i();
                Object[] objArr = this.f20780m;
                Object obj = eVar.f20785b;
                objArr[i9] = obj;
                this.f20781n.put(obj, Integer.valueOf(i9));
                i9++;
            }
            this.f20775h = i7;
            this.f20776i = i8;
        }

        @Override // k0.AbstractC1399a
        public int A(int i7) {
            return this.f20778k[i7];
        }

        @Override // k0.AbstractC1399a
        public AbstractC1170I D(int i7) {
            return this.f20779l[i7];
        }

        @Override // d0.AbstractC1170I
        public int i() {
            return this.f20776i;
        }

        @Override // d0.AbstractC1170I
        public int p() {
            return this.f20775h;
        }

        @Override // k0.AbstractC1399a
        public int s(Object obj) {
            Integer num = (Integer) this.f20781n.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // k0.AbstractC1399a
        public int t(int i7) {
            return g0.M.g(this.f20777j, i7 + 1, false, false);
        }

        @Override // k0.AbstractC1399a
        public int u(int i7) {
            return g0.M.g(this.f20778k, i7 + 1, false, false);
        }

        @Override // k0.AbstractC1399a
        public Object x(int i7) {
            return this.f20780m[i7];
        }

        @Override // k0.AbstractC1399a
        public int z(int i7) {
            return this.f20777j[i7];
        }
    }

    /* renamed from: x0.l$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f20782a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f20783b;

        public d(Handler handler, Runnable runnable) {
            this.f20782a = handler;
            this.f20783b = runnable;
        }

        public void a() {
            this.f20782a.post(this.f20783b);
        }
    }

    /* renamed from: x0.l$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final C2138t f20784a;

        /* renamed from: d, reason: collision with root package name */
        public int f20787d;

        /* renamed from: e, reason: collision with root package name */
        public int f20788e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f20789f;

        /* renamed from: c, reason: collision with root package name */
        public final List f20786c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f20785b = new Object();

        public e(InterfaceC2142x interfaceC2142x, boolean z7) {
            this.f20784a = new C2138t(interfaceC2142x, z7);
        }

        public void a(int i7, int i8) {
            this.f20787d = i7;
            this.f20788e = i8;
            this.f20789f = false;
            this.f20786c.clear();
        }
    }

    /* renamed from: x0.l$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f20790a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f20791b;

        /* renamed from: c, reason: collision with root package name */
        public final d f20792c;

        public f(int i7, Object obj, d dVar) {
            this.f20790a = i7;
            this.f20791b = obj;
            this.f20792c = dVar;
        }
    }

    public C2131l(boolean z7, T t7, InterfaceC2142x... interfaceC2142xArr) {
        this(z7, false, t7, interfaceC2142xArr);
    }

    public static Object Y(Object obj) {
        return AbstractC1399a.v(obj);
    }

    public static Object a0(Object obj) {
        return AbstractC1399a.w(obj);
    }

    public static Object b0(e eVar, Object obj) {
        return AbstractC1399a.y(eVar.f20785b, obj);
    }

    @Override // x0.AbstractC2127h, x0.AbstractC2120a
    public synchronized void B() {
        try {
            super.B();
            this.f20766n.clear();
            this.f20769q.clear();
            this.f20768p.clear();
            this.f20774v = this.f20774v.h();
            Handler handler = this.f20765m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f20765m = null;
            }
            this.f20772t = false;
            this.f20773u.clear();
            W(this.f20764l);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void O(int i7, e eVar) {
        int i8;
        if (i7 > 0) {
            e eVar2 = (e) this.f20766n.get(i7 - 1);
            i8 = eVar2.f20788e + eVar2.f20784a.Z().p();
        } else {
            i8 = 0;
        }
        eVar.a(i7, i8);
        T(i7, 1, eVar.f20784a.Z().p());
        this.f20766n.add(i7, eVar);
        this.f20768p.put(eVar.f20785b, eVar);
        K(eVar, eVar.f20784a);
        if (y() && this.f20767o.isEmpty()) {
            this.f20769q.add(eVar);
        } else {
            D(eVar);
        }
    }

    public synchronized void P(int i7, Collection collection, Handler handler, Runnable runnable) {
        S(i7, collection, handler, runnable);
    }

    public synchronized void Q(Collection collection) {
        S(this.f20763k.size(), collection, null, null);
    }

    public final void R(int i7, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            O(i7, (e) it.next());
            i7++;
        }
    }

    public final void S(int i7, Collection collection, Handler handler, Runnable runnable) {
        AbstractC1297a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f20765m;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC1297a.e((InterfaceC2142x) it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e((InterfaceC2142x) it2.next(), this.f20771s));
        }
        this.f20763k.addAll(i7, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(1, new f(i7, arrayList, U(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public final void T(int i7, int i8, int i9) {
        while (i7 < this.f20766n.size()) {
            e eVar = (e) this.f20766n.get(i7);
            eVar.f20787d += i8;
            eVar.f20788e += i9;
            i7++;
        }
    }

    public final d U(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.f20764l.add(dVar);
        return dVar;
    }

    public final void V() {
        Iterator it = this.f20769q.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f20786c.isEmpty()) {
                D(eVar);
                it.remove();
            }
        }
    }

    public final synchronized void W(Set set) {
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a();
            }
            this.f20764l.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void X(e eVar) {
        this.f20769q.add(eVar);
        E(eVar);
    }

    @Override // x0.AbstractC2127h
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public InterfaceC2142x.b F(e eVar, InterfaceC2142x.b bVar) {
        for (int i7 = 0; i7 < eVar.f20786c.size(); i7++) {
            if (((InterfaceC2142x.b) eVar.f20786c.get(i7)).f20851d == bVar.f20851d) {
                return bVar.a(b0(eVar, bVar.f20848a));
            }
        }
        return null;
    }

    @Override // x0.InterfaceC2142x
    public C1198u a() {
        return f20762w;
    }

    public final Handler c0() {
        return (Handler) AbstractC1297a.e(this.f20765m);
    }

    public synchronized int d0() {
        return this.f20763k.size();
    }

    @Override // x0.InterfaceC2142x
    public void e(InterfaceC2140v interfaceC2140v) {
        e eVar = (e) AbstractC1297a.e((e) this.f20767o.remove(interfaceC2140v));
        eVar.f20784a.e(interfaceC2140v);
        eVar.f20786c.remove(((C2137s) interfaceC2140v).f20822o);
        if (!this.f20767o.isEmpty()) {
            V();
        }
        g0(eVar);
    }

    @Override // x0.AbstractC2127h
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int H(e eVar, int i7) {
        return i7 + eVar.f20788e;
    }

    @Override // x0.InterfaceC2142x
    public InterfaceC2140v f(InterfaceC2142x.b bVar, B0.b bVar2, long j7) {
        Object a02 = a0(bVar.f20848a);
        InterfaceC2142x.b a7 = bVar.a(Y(bVar.f20848a));
        e eVar = (e) this.f20768p.get(a02);
        if (eVar == null) {
            eVar = new e(new c(), this.f20771s);
            eVar.f20789f = true;
            K(eVar, eVar.f20784a);
        }
        X(eVar);
        eVar.f20786c.add(a7);
        C2137s f7 = eVar.f20784a.f(a7, bVar2, j7);
        this.f20767o.put(f7, eVar);
        V();
        return f7;
    }

    public final boolean f0(Message message) {
        f fVar;
        switch (message.what) {
            case 1:
                fVar = (f) g0.M.i(message.obj);
                this.f20774v = this.f20774v.d(fVar.f20790a, ((Collection) fVar.f20791b).size());
                R(fVar.f20790a, (Collection) fVar.f20791b);
                p0(fVar.f20792c);
                return true;
            case 2:
                fVar = (f) g0.M.i(message.obj);
                int i7 = fVar.f20790a;
                int intValue = ((Integer) fVar.f20791b).intValue();
                this.f20774v = (i7 == 0 && intValue == this.f20774v.a()) ? this.f20774v.h() : this.f20774v.b(i7, intValue);
                for (int i8 = intValue - 1; i8 >= i7; i8--) {
                    l0(i8);
                }
                p0(fVar.f20792c);
                return true;
            case 3:
                fVar = (f) g0.M.i(message.obj);
                T t7 = this.f20774v;
                int i9 = fVar.f20790a;
                T b7 = t7.b(i9, i9 + 1);
                this.f20774v = b7;
                this.f20774v = b7.d(((Integer) fVar.f20791b).intValue(), 1);
                i0(fVar.f20790a, ((Integer) fVar.f20791b).intValue());
                p0(fVar.f20792c);
                return true;
            case 4:
                fVar = (f) g0.M.i(message.obj);
                this.f20774v = (T) fVar.f20791b;
                p0(fVar.f20792c);
                return true;
            case 5:
                t0();
                return true;
            case 6:
                W((Set) g0.M.i(message.obj));
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    public final void g0(e eVar) {
        if (eVar.f20789f && eVar.f20786c.isEmpty()) {
            this.f20769q.remove(eVar);
            L(eVar);
        }
    }

    public synchronized void h0(int i7, int i8, Handler handler, Runnable runnable) {
        j0(i7, i8, handler, runnable);
    }

    @Override // x0.AbstractC2120a, x0.InterfaceC2142x
    public boolean i() {
        return false;
    }

    public final void i0(int i7, int i8) {
        int min = Math.min(i7, i8);
        int max = Math.max(i7, i8);
        int i9 = ((e) this.f20766n.get(min)).f20788e;
        List list = this.f20766n;
        list.add(i8, (e) list.remove(i7));
        while (min <= max) {
            e eVar = (e) this.f20766n.get(min);
            eVar.f20787d = min;
            eVar.f20788e = i9;
            i9 += eVar.f20784a.Z().p();
            min++;
        }
    }

    @Override // x0.AbstractC2120a, x0.InterfaceC2142x
    public synchronized AbstractC1170I j() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new b(this.f20763k, this.f20774v.a() != this.f20763k.size() ? this.f20774v.h().d(0, this.f20763k.size()) : this.f20774v, this.f20770r);
    }

    public final void j0(int i7, int i8, Handler handler, Runnable runnable) {
        AbstractC1297a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f20765m;
        List list = this.f20763k;
        list.add(i8, (e) list.remove(i7));
        if (handler2 != null) {
            handler2.obtainMessage(3, new f(i7, Integer.valueOf(i8), U(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    @Override // x0.AbstractC2127h
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void I(e eVar, InterfaceC2142x interfaceC2142x, AbstractC1170I abstractC1170I) {
        s0(eVar, abstractC1170I);
    }

    public final void l0(int i7) {
        e eVar = (e) this.f20766n.remove(i7);
        this.f20768p.remove(eVar.f20785b);
        T(i7, -1, -eVar.f20784a.Z().p());
        eVar.f20789f = true;
        g0(eVar);
    }

    public synchronized void m0(int i7, int i8, Handler handler, Runnable runnable) {
        n0(i7, i8, handler, runnable);
    }

    public final void n0(int i7, int i8, Handler handler, Runnable runnable) {
        AbstractC1297a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f20765m;
        g0.M.U0(this.f20763k, i7, i8);
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(i7, Integer.valueOf(i8), U(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public final void o0() {
        p0(null);
    }

    public final void p0(d dVar) {
        if (!this.f20772t) {
            c0().obtainMessage(5).sendToTarget();
            this.f20772t = true;
        }
        if (dVar != null) {
            this.f20773u.add(dVar);
        }
    }

    public final void q0(T t7, Handler handler, Runnable runnable) {
        AbstractC1297a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f20765m;
        if (handler2 != null) {
            int d02 = d0();
            if (t7.a() != d02) {
                t7 = t7.h().d(0, d02);
            }
            handler2.obtainMessage(4, new f(0, t7, U(handler, runnable))).sendToTarget();
            return;
        }
        if (t7.a() > 0) {
            t7 = t7.h();
        }
        this.f20774v = t7;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    public synchronized void r0(T t7) {
        q0(t7, null, null);
    }

    public final void s0(e eVar, AbstractC1170I abstractC1170I) {
        if (eVar.f20787d + 1 < this.f20766n.size()) {
            int p7 = abstractC1170I.p() - (((e) this.f20766n.get(eVar.f20787d + 1)).f20788e - eVar.f20788e);
            if (p7 != 0) {
                T(eVar.f20787d + 1, 0, p7);
            }
        }
        o0();
    }

    public final void t0() {
        this.f20772t = false;
        Set set = this.f20773u;
        this.f20773u = new HashSet();
        A(new b(this.f20766n, this.f20774v, this.f20770r));
        c0().obtainMessage(6, set).sendToTarget();
    }

    @Override // x0.AbstractC2127h, x0.AbstractC2120a
    public void v() {
        super.v();
        this.f20769q.clear();
    }

    @Override // x0.AbstractC2127h, x0.AbstractC2120a
    public synchronized void z(i0.y yVar) {
        try {
            super.z(yVar);
            this.f20765m = new Handler(new Handler.Callback() { // from class: x0.k
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    boolean f02;
                    f02 = C2131l.this.f0(message);
                    return f02;
                }
            });
            if (this.f20763k.isEmpty()) {
                t0();
            } else {
                this.f20774v = this.f20774v.d(0, this.f20763k.size());
                R(0, this.f20763k);
                o0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C2131l(boolean z7, boolean z8, T t7, InterfaceC2142x... interfaceC2142xArr) {
        for (InterfaceC2142x interfaceC2142x : interfaceC2142xArr) {
            AbstractC1297a.e(interfaceC2142x);
        }
        this.f20774v = t7.a() > 0 ? t7.h() : t7;
        this.f20767o = new IdentityHashMap();
        this.f20768p = new HashMap();
        this.f20763k = new ArrayList();
        this.f20766n = new ArrayList();
        this.f20773u = new HashSet();
        this.f20764l = new HashSet();
        this.f20769q = new HashSet();
        this.f20770r = z7;
        this.f20771s = z8;
        Q(Arrays.asList(interfaceC2142xArr));
    }

    public C2131l(boolean z7, InterfaceC2142x... interfaceC2142xArr) {
        this(z7, new T.a(0), interfaceC2142xArr);
    }

    public C2131l(InterfaceC2142x... interfaceC2142xArr) {
        this(false, interfaceC2142xArr);
    }

    /* renamed from: x0.l$c */
    public static final class c extends AbstractC2120a {
        public c() {
        }

        @Override // x0.InterfaceC2142x
        public C1198u a() {
            return C2131l.f20762w;
        }

        @Override // x0.InterfaceC2142x
        public InterfaceC2140v f(InterfaceC2142x.b bVar, B0.b bVar2, long j7) {
            throw new UnsupportedOperationException();
        }

        @Override // x0.AbstractC2120a
        public void B() {
        }

        @Override // x0.InterfaceC2142x
        public void h() {
        }

        @Override // x0.InterfaceC2142x
        public void e(InterfaceC2140v interfaceC2140v) {
        }

        @Override // x0.AbstractC2120a
        public void z(i0.y yVar) {
        }
    }

    @Override // x0.AbstractC2127h, x0.AbstractC2120a
    public void w() {
    }
}

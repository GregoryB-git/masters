package z4;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v3.o0;
import v3.r1;
import z4.e0;
import z4.f;
import z4.h;
import z4.p;
import z4.t;

/* loaded from: classes.dex */
public final class h extends f<d> {
    public static final o0 E;
    public final boolean A;
    public boolean B;
    public HashSet C;
    public e0 D;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f17656s;
    public final HashSet t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f17657u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f17658v;

    /* renamed from: w, reason: collision with root package name */
    public final IdentityHashMap<r, d> f17659w;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f17660x;

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f17661y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f17662z;

    public static final class a extends v3.a {
        public final int f;

        /* renamed from: o, reason: collision with root package name */
        public final int f17663o;

        /* renamed from: p, reason: collision with root package name */
        public final int[] f17664p;

        /* renamed from: q, reason: collision with root package name */
        public final int[] f17665q;

        /* renamed from: r, reason: collision with root package name */
        public final r1[] f17666r;

        /* renamed from: s, reason: collision with root package name */
        public final Object[] f17667s;
        public final HashMap<Object, Integer> t;

        public a(List list, e0 e0Var, boolean z10) {
            super(z10, e0Var);
            int size = list.size();
            this.f17664p = new int[size];
            this.f17665q = new int[size];
            this.f17666r = new r1[size];
            this.f17667s = new Object[size];
            this.t = new HashMap<>();
            Iterator it = list.iterator();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                d dVar = (d) it.next();
                r1[] r1VarArr = this.f17666r;
                p.a aVar = dVar.f17670a.f17711w;
                r1VarArr[i12] = aVar;
                this.f17665q[i12] = i10;
                this.f17664p[i12] = i11;
                i10 += aVar.o();
                i11 += this.f17666r[i12].h();
                Object[] objArr = this.f17667s;
                Object obj = dVar.f17671b;
                objArr[i12] = obj;
                this.t.put(obj, Integer.valueOf(i12));
                i12++;
            }
            this.f = i10;
            this.f17663o = i11;
        }

        @Override // v3.r1
        public final int h() {
            return this.f17663o;
        }

        @Override // v3.r1
        public final int o() {
            return this.f;
        }

        @Override // v3.a
        public final int q(Object obj) {
            Integer num = this.t.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // v3.a
        public final int r(int i10) {
            return v5.e0.e(this.f17664p, i10 + 1, false, false);
        }

        @Override // v3.a
        public final int s(int i10) {
            return v5.e0.e(this.f17665q, i10 + 1, false, false);
        }

        @Override // v3.a
        public final Object t(int i10) {
            return this.f17667s[i10];
        }

        @Override // v3.a
        public final int u(int i10) {
            return this.f17664p[i10];
        }

        @Override // v3.a
        public final int v(int i10) {
            return this.f17665q[i10];
        }

        @Override // v3.a
        public final r1 x(int i10) {
            return this.f17666r[i10];
        }
    }

    public static final class b extends z4.a {
        @Override // z4.t
        public final o0 f() {
            return h.E;
        }

        @Override // z4.t
        public final void g(r rVar) {
        }

        @Override // z4.t
        public final void h() {
        }

        @Override // z4.t
        public final r o(t.b bVar, t5.b bVar2, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // z4.a
        public final void t(t5.l0 l0Var) {
        }

        @Override // z4.a
        public final void w() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f17668a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f17669b;

        public c(Handler handler, Runnable runnable) {
            this.f17668a = handler;
            this.f17669b = runnable;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final p f17670a;

        /* renamed from: d, reason: collision with root package name */
        public int f17673d;

        /* renamed from: e, reason: collision with root package name */
        public int f17674e;
        public boolean f;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f17672c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f17671b = new Object();

        public d(t tVar, boolean z10) {
            this.f17670a = new p(tVar, z10);
        }
    }

    public static final class e<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f17675a;

        /* renamed from: b, reason: collision with root package name */
        public final T f17676b;

        /* renamed from: c, reason: collision with root package name */
        public final c f17677c;

        public e(int i10, T t, c cVar) {
            this.f17675a = i10;
            this.f17676b = t;
            this.f17677c = cVar;
        }
    }

    static {
        o0.a aVar = new o0.a();
        aVar.f15540b = Uri.EMPTY;
        E = aVar.a();
    }

    public h(boolean z10, e0.a aVar, t... tVarArr) {
        for (t tVar : tVarArr) {
            tVar.getClass();
        }
        this.D = aVar.f17621b.length > 0 ? aVar.g() : aVar;
        this.f17659w = new IdentityHashMap<>();
        this.f17660x = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f17656s = arrayList;
        this.f17658v = new ArrayList();
        this.C = new HashSet();
        this.t = new HashSet();
        this.f17661y = new HashSet();
        this.f17662z = false;
        this.A = z10;
        List asList = Arrays.asList(tVarArr);
        synchronized (this) {
            E(arrayList.size(), asList, null, null);
        }
    }

    @Override // z4.f
    public final void A(Object obj, r1 r1Var) {
        d dVar = (d) obj;
        if (dVar.f17673d + 1 < this.f17658v.size()) {
            int o10 = r1Var.o() - (((d) this.f17658v.get(dVar.f17673d + 1)).f17674e - dVar.f17674e);
            if (o10 != 0) {
                F(dVar.f17673d + 1, 0, o10);
            }
        }
        N(null);
    }

    public final synchronized void C(int i10, ArrayList arrayList, Handler handler, ta.c cVar) {
        E(i10, arrayList, handler, cVar);
    }

    public final void D(int i10, Collection<d> collection) {
        for (d dVar : collection) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                d dVar2 = (d) this.f17658v.get(i10 - 1);
                int o10 = dVar2.f17670a.f17711w.o() + dVar2.f17674e;
                dVar.f17673d = i10;
                dVar.f17674e = o10;
            } else {
                dVar.f17673d = i10;
                dVar.f17674e = 0;
            }
            dVar.f = false;
            dVar.f17672c.clear();
            F(i10, 1, dVar.f17670a.f17711w.o());
            this.f17658v.add(i10, dVar);
            this.f17660x.put(dVar.f17671b, dVar);
            B(dVar, dVar.f17670a);
            if ((!this.f17556b.isEmpty()) && this.f17659w.isEmpty()) {
                this.f17661y.add(dVar);
            } else {
                f.b bVar = (f.b) this.f17623p.get(dVar);
                bVar.getClass();
                bVar.f17630a.l(bVar.f17631b);
            }
            i10 = i11;
        }
    }

    public final void E(int i10, List list, Handler handler, ta.c cVar) {
        x6.b.q((handler == null) == (cVar == null));
        Handler handler2 = this.f17657u;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((t) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new d((t) it2.next(), this.A));
        }
        this.f17656s.addAll(i10, arrayList);
        if (handler2 != null && !list.isEmpty()) {
            handler2.obtainMessage(0, new e(i10, arrayList, G(handler, cVar))).sendToTarget();
        } else {
            if (cVar == null || handler == null) {
                return;
            }
            handler.post(cVar);
        }
    }

    public final void F(int i10, int i11, int i12) {
        while (i10 < this.f17658v.size()) {
            d dVar = (d) this.f17658v.get(i10);
            dVar.f17673d += i11;
            dVar.f17674e += i12;
            i10++;
        }
    }

    public final c G(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        c cVar = new c(handler, runnable);
        this.t.add(cVar);
        return cVar;
    }

    public final void H() {
        Iterator it = this.f17661y.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f17672c.isEmpty()) {
                f.b bVar = (f.b) this.f17623p.get(dVar);
                bVar.getClass();
                bVar.f17630a.l(bVar.f17631b);
                it.remove();
            }
        }
    }

    public final synchronized void I(Set<c> set) {
        for (c cVar : set) {
            cVar.f17668a.post(cVar.f17669b);
        }
        this.t.removeAll(set);
    }

    public final void J(d dVar) {
        if (dVar.f && dVar.f17672c.isEmpty()) {
            this.f17661y.remove(dVar);
            f.b bVar = (f.b) this.f17623p.remove(dVar);
            bVar.getClass();
            bVar.f17630a.a(bVar.f17631b);
            bVar.f17630a.m(bVar.f17632c);
            bVar.f17630a.c(bVar.f17632c);
        }
    }

    public final synchronized void K(int i10, int i11, Handler handler, ta.d dVar) {
        L(i10, i11, handler, dVar);
    }

    public final void L(int i10, int i11, Handler handler, ta.d dVar) {
        x6.b.q(true ^ (handler == null));
        Handler handler2 = this.f17657u;
        ArrayList arrayList = this.f17656s;
        arrayList.add(i11, (d) arrayList.remove(i10));
        if (handler2 != null) {
            handler2.obtainMessage(2, new e(i10, Integer.valueOf(i11), G(handler, dVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(dVar);
        }
    }

    public final synchronized void M(int i10, int i11, Handler handler, u.a aVar) {
        x6.b.q(!(handler == null));
        Handler handler2 = this.f17657u;
        v5.e0.N(i10, i11, this.f17656s);
        if (handler2 != null) {
            handler2.obtainMessage(1, new e(i10, Integer.valueOf(i11), G(handler, aVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(aVar);
        }
    }

    public final void N(c cVar) {
        if (!this.B) {
            Handler handler = this.f17657u;
            handler.getClass();
            handler.obtainMessage(4).sendToTarget();
            this.B = true;
        }
        if (cVar != null) {
            this.C.add(cVar);
        }
    }

    public final void O(e0.a aVar) {
        int size;
        Handler handler = this.f17657u;
        if (handler == null) {
            if (aVar.f17621b.length > 0) {
                aVar = aVar.g();
            }
            this.D = aVar;
        } else {
            synchronized (this) {
                size = this.f17656s.size();
            }
            if (aVar.f17621b.length != size) {
                aVar = aVar.g().e(0, size);
            }
            handler.obtainMessage(3, new e(0, aVar, G(null, null))).sendToTarget();
        }
    }

    public final synchronized void P(e0.a aVar) {
        O(aVar);
    }

    public final void Q() {
        this.B = false;
        HashSet hashSet = this.C;
        this.C = new HashSet();
        v(new a(this.f17658v, this.D, this.f17662z));
        Handler handler = this.f17657u;
        handler.getClass();
        handler.obtainMessage(5, hashSet).sendToTarget();
    }

    @Override // z4.t
    public final o0 f() {
        return E;
    }

    @Override // z4.t
    public final void g(r rVar) {
        d remove = this.f17659w.remove(rVar);
        remove.getClass();
        remove.f17670a.g(rVar);
        remove.f17672c.remove(((o) rVar).f17703a);
        if (!this.f17659w.isEmpty()) {
            H();
        }
        J(remove);
    }

    @Override // z4.a, z4.t
    public final boolean i() {
        return false;
    }

    @Override // z4.a, z4.t
    public final synchronized r1 j() {
        return new a(this.f17656s, this.D.getLength() != this.f17656s.size() ? this.D.g().e(0, this.f17656s.size()) : this.D, this.f17662z);
    }

    @Override // z4.t
    public final r o(t.b bVar, t5.b bVar2, long j10) {
        Object obj = bVar.f17725a;
        int i10 = v3.a.f15231e;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        t.b b10 = bVar.b(pair.second);
        d dVar = (d) this.f17660x.get(obj2);
        if (dVar == null) {
            dVar = new d(new b(), this.A);
            dVar.f = true;
            B(dVar, dVar.f17670a);
        }
        this.f17661y.add(dVar);
        f.b bVar3 = (f.b) this.f17623p.get(dVar);
        bVar3.getClass();
        bVar3.f17630a.b(bVar3.f17631b);
        dVar.f17672c.add(b10);
        o o10 = dVar.f17670a.o(b10, bVar2, j10);
        this.f17659w.put(o10, dVar);
        H();
        return o10;
    }

    @Override // z4.f, z4.a
    public final void r() {
        super.r();
        this.f17661y.clear();
    }

    @Override // z4.f, z4.a
    public final void s() {
    }

    @Override // z4.a
    public final synchronized void t(t5.l0 l0Var) {
        this.f17625r = l0Var;
        this.f17624q = v5.e0.l(null);
        this.f17657u = new Handler(new Handler.Callback() { // from class: z4.g
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                h.e eVar;
                h hVar = h.this;
                hVar.getClass();
                int i10 = message.what;
                if (i10 == 0) {
                    Object obj = message.obj;
                    int i11 = v5.e0.f15881a;
                    eVar = (h.e) obj;
                    hVar.D = hVar.D.e(eVar.f17675a, ((Collection) eVar.f17676b).size());
                    hVar.D(eVar.f17675a, (Collection) eVar.f17676b);
                } else if (i10 == 1) {
                    Object obj2 = message.obj;
                    int i12 = v5.e0.f15881a;
                    eVar = (h.e) obj2;
                    int i13 = eVar.f17675a;
                    int intValue = ((Integer) eVar.f17676b).intValue();
                    hVar.D = (i13 == 0 && intValue == hVar.D.getLength()) ? hVar.D.g() : hVar.D.a(i13, intValue);
                    for (int i14 = intValue - 1; i14 >= i13; i14--) {
                        h.d dVar = (h.d) hVar.f17658v.remove(i14);
                        hVar.f17660x.remove(dVar.f17671b);
                        hVar.F(i14, -1, -dVar.f17670a.f17711w.o());
                        dVar.f = true;
                        hVar.J(dVar);
                    }
                } else if (i10 == 2) {
                    Object obj3 = message.obj;
                    int i15 = v5.e0.f15881a;
                    eVar = (h.e) obj3;
                    e0 e0Var = hVar.D;
                    int i16 = eVar.f17675a;
                    e0.a a10 = e0Var.a(i16, i16 + 1);
                    hVar.D = a10;
                    hVar.D = a10.e(((Integer) eVar.f17676b).intValue(), 1);
                    int i17 = eVar.f17675a;
                    int intValue2 = ((Integer) eVar.f17676b).intValue();
                    int min = Math.min(i17, intValue2);
                    int max = Math.max(i17, intValue2);
                    int i18 = ((h.d) hVar.f17658v.get(min)).f17674e;
                    ArrayList arrayList = hVar.f17658v;
                    arrayList.add(intValue2, (h.d) arrayList.remove(i17));
                    while (min <= max) {
                        h.d dVar2 = (h.d) hVar.f17658v.get(min);
                        dVar2.f17673d = min;
                        dVar2.f17674e = i18;
                        i18 += dVar2.f17670a.f17711w.o();
                        min++;
                    }
                } else {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            hVar.Q();
                        } else {
                            if (i10 != 5) {
                                throw new IllegalStateException();
                            }
                            Object obj4 = message.obj;
                            int i19 = v5.e0.f15881a;
                            hVar.I((Set) obj4);
                        }
                        return true;
                    }
                    Object obj5 = message.obj;
                    int i20 = v5.e0.f15881a;
                    eVar = (h.e) obj5;
                    hVar.D = (e0) eVar.f17676b;
                }
                hVar.N(eVar.f17677c);
                return true;
            }
        });
        if (this.f17656s.isEmpty()) {
            Q();
        } else {
            this.D = this.D.e(0, this.f17656s.size());
            D(0, this.f17656s);
            N(null);
        }
    }

    @Override // z4.f, z4.a
    public final synchronized void w() {
        super.w();
        this.f17658v.clear();
        this.f17661y.clear();
        this.f17660x.clear();
        this.D = this.D.g();
        Handler handler = this.f17657u;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f17657u = null;
        }
        this.B = false;
        this.C.clear();
        I(this.t);
    }

    @Override // z4.f
    public final t.b x(d dVar, t.b bVar) {
        d dVar2 = dVar;
        for (int i10 = 0; i10 < dVar2.f17672c.size(); i10++) {
            if (((t.b) dVar2.f17672c.get(i10)).f17728d == bVar.f17728d) {
                Object obj = bVar.f17725a;
                Object obj2 = dVar2.f17671b;
                int i11 = v3.a.f15231e;
                return bVar.b(Pair.create(obj2, obj));
            }
        }
        return null;
    }

    @Override // z4.f
    public final int z(int i10, Object obj) {
        return i10 + ((d) obj).f17674e;
    }
}

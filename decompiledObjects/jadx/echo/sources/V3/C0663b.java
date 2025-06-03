package V3;

import Y3.d;
import d4.C1227b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: V3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663b implements Iterable {

    /* renamed from: p, reason: collision with root package name */
    public static final C0663b f6502p = new C0663b(new Y3.d(null));

    /* renamed from: o, reason: collision with root package name */
    public final Y3.d f6503o;

    /* renamed from: V3.b$a */
    public class a implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f6504a;

        public a(k kVar) {
            this.f6504a = kVar;
        }

        @Override // Y3.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0663b a(k kVar, d4.n nVar, C0663b c0663b) {
            return c0663b.a(this.f6504a.T(kVar), nVar);
        }
    }

    /* renamed from: V3.b$b, reason: collision with other inner class name */
    public class C0110b implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f6506a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f6507b;

        public C0110b(Map map, boolean z7) {
            this.f6506a = map;
            this.f6507b = z7;
        }

        @Override // Y3.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(k kVar, d4.n nVar, Void r42) {
            this.f6506a.put(kVar.d0(), nVar.L(this.f6507b));
            return null;
        }
    }

    public C0663b(Y3.d dVar) {
        this.f6503o = dVar;
    }

    public static C0663b D(Map map) {
        Y3.d d7 = Y3.d.d();
        for (Map.Entry entry : map.entrySet()) {
            d7 = d7.X((k) entry.getKey(), new Y3.d((d4.n) entry.getValue()));
        }
        return new C0663b(d7);
    }

    public static C0663b M(Map map) {
        Y3.d d7 = Y3.d.d();
        for (Map.Entry entry : map.entrySet()) {
            d7 = d7.X(new k((String) entry.getKey()), new Y3.d(d4.o.a(entry.getValue())));
        }
        return new C0663b(d7);
    }

    public static C0663b s() {
        return f6502p;
    }

    public List S() {
        ArrayList arrayList = new ArrayList();
        if (this.f6503o.getValue() != null) {
            for (d4.m mVar : (d4.n) this.f6503o.getValue()) {
                arrayList.add(new d4.m(mVar.c(), mVar.d()));
            }
        } else {
            Iterator it = this.f6503o.M().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Y3.d dVar = (Y3.d) entry.getValue();
                if (dVar.getValue() != null) {
                    arrayList.add(new d4.m((C1227b) entry.getKey(), (d4.n) dVar.getValue()));
                }
            }
        }
        return arrayList;
    }

    public d4.n T(k kVar) {
        k g7 = this.f6503o.g(kVar);
        if (g7 != null) {
            return ((d4.n) this.f6503o.s(g7)).A(k.b0(g7, kVar));
        }
        return null;
    }

    public Map U(boolean z7) {
        HashMap hashMap = new HashMap();
        this.f6503o.q(new C0110b(hashMap, z7));
        return hashMap;
    }

    public boolean V(k kVar) {
        return T(kVar) != null;
    }

    public C0663b W(k kVar) {
        return kVar.isEmpty() ? f6502p : new C0663b(this.f6503o.X(kVar, Y3.d.d()));
    }

    public d4.n X() {
        return (d4.n) this.f6503o.getValue();
    }

    public C0663b a(k kVar, d4.n nVar) {
        if (kVar.isEmpty()) {
            return new C0663b(new Y3.d(nVar));
        }
        k g7 = this.f6503o.g(kVar);
        if (g7 == null) {
            return new C0663b(this.f6503o.X(kVar, new Y3.d(nVar)));
        }
        k b02 = k.b0(g7, kVar);
        d4.n nVar2 = (d4.n) this.f6503o.s(g7);
        C1227b X6 = b02.X();
        if (X6 != null && X6.s() && nVar2.A(b02.a0()).isEmpty()) {
            return this;
        }
        return new C0663b(this.f6503o.W(g7, nVar2.y(b02, nVar)));
    }

    public C0663b d(C1227b c1227b, d4.n nVar) {
        return a(new k(c1227b), nVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C0663b.class) {
            return false;
        }
        return ((C0663b) obj).U(true).equals(U(true));
    }

    public C0663b f(k kVar, C0663b c0663b) {
        return (C0663b) c0663b.f6503o.k(this, new a(kVar));
    }

    public d4.n g(d4.n nVar) {
        return i(k.Y(), this.f6503o, nVar);
    }

    public int hashCode() {
        return U(true).hashCode();
    }

    public final d4.n i(k kVar, Y3.d dVar, d4.n nVar) {
        if (dVar.getValue() != null) {
            return nVar.y(kVar, (d4.n) dVar.getValue());
        }
        Iterator it = dVar.M().iterator();
        d4.n nVar2 = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Y3.d dVar2 = (Y3.d) entry.getValue();
            C1227b c1227b = (C1227b) entry.getKey();
            if (c1227b.s()) {
                Y3.m.g(dVar2.getValue() != null, "Priority writes must always be leaf nodes");
                nVar2 = (d4.n) dVar2.getValue();
            } else {
                nVar = i(kVar.U(c1227b), dVar2, nVar);
            }
        }
        return (nVar.A(kVar).isEmpty() || nVar2 == null) ? nVar : nVar.y(kVar.U(C1227b.o()), nVar2);
    }

    public boolean isEmpty() {
        return this.f6503o.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f6503o.iterator();
    }

    public C0663b k(k kVar) {
        if (kVar.isEmpty()) {
            return this;
        }
        d4.n T6 = T(kVar);
        return T6 != null ? new C0663b(new Y3.d(T6)) : new C0663b(this.f6503o.Y(kVar));
    }

    public Map q() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f6503o.M().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            hashMap.put((C1227b) entry.getKey(), new C0663b((Y3.d) entry.getValue()));
        }
        return hashMap;
    }

    public String toString() {
        return "CompoundWrite{" + U(true).toString() + "}";
    }
}

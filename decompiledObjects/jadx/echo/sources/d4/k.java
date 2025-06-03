package d4;

import d4.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class k implements n {

    /* renamed from: o, reason: collision with root package name */
    public final n f13303o;

    /* renamed from: p, reason: collision with root package name */
    public String f13304p;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13305a;

        static {
            int[] iArr = new int[n.b.values().length];
            f13305a = iArr;
            try {
                iArr[n.b.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13305a[n.b.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    public k(n nVar) {
        this.f13303o = nVar;
    }

    public static int D(l lVar, f fVar) {
        return Double.valueOf(((Long) lVar.getValue()).longValue()).compareTo((Double) fVar.getValue());
    }

    @Override // d4.n
    public n A(V3.k kVar) {
        return kVar.isEmpty() ? this : kVar.Z().s() ? this.f13303o : g.W();
    }

    @Override // d4.n
    public boolean B() {
        return true;
    }

    @Override // d4.n
    public int E() {
        return 0;
    }

    @Override // d4.n
    public C1227b I(C1227b c1227b) {
        return null;
    }

    @Override // d4.n
    public Object L(boolean z7) {
        if (!z7 || this.f13303o.isEmpty()) {
            return getValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(".value", getValue());
        hashMap.put(".priority", this.f13303o.getValue());
        return hashMap;
    }

    @Override // java.lang.Comparable
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        if (nVar.isEmpty()) {
            return 1;
        }
        if (nVar instanceof c) {
            return -1;
        }
        Y3.m.g(nVar.B(), "Node is not leaf node!");
        return ((this instanceof l) && (nVar instanceof f)) ? D((l) this, (f) nVar) : ((this instanceof f) && (nVar instanceof l)) ? D((l) nVar, (f) this) * (-1) : U((k) nVar);
    }

    @Override // d4.n
    public n N(C1227b c1227b, n nVar) {
        return c1227b.s() ? J(nVar) : nVar.isEmpty() ? this : g.W().N(c1227b, nVar).J(this.f13303o);
    }

    @Override // d4.n
    public Iterator P() {
        return Collections.emptyList().iterator();
    }

    @Override // d4.n
    public boolean Q(C1227b c1227b) {
        return false;
    }

    @Override // d4.n
    public String R() {
        if (this.f13304p == null) {
            this.f13304p = Y3.m.i(O(n.b.V1));
        }
        return this.f13304p;
    }

    public abstract b S();

    public String T(n.b bVar) {
        int i7 = a.f13305a[bVar.ordinal()];
        if (i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("Unknown hash version: " + bVar);
        }
        if (this.f13303o.isEmpty()) {
            return "";
        }
        return "priority:" + this.f13303o.O(bVar) + ":";
    }

    public int U(k kVar) {
        b S6 = S();
        b S7 = kVar.S();
        return S6.equals(S7) ? s(kVar) : S6.compareTo(S7);
    }

    @Override // d4.n
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    public abstract int s(k kVar);

    @Override // d4.n
    public n t() {
        return this.f13303o;
    }

    public String toString() {
        String obj = L(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }

    @Override // d4.n
    public n v(C1227b c1227b) {
        return c1227b.s() ? this.f13303o : g.W();
    }

    @Override // d4.n
    public n y(V3.k kVar, n nVar) {
        C1227b Z6 = kVar.Z();
        if (Z6 == null) {
            return nVar;
        }
        if (nVar.isEmpty() && !Z6.s()) {
            return this;
        }
        boolean z7 = true;
        if (kVar.Z().s() && kVar.size() != 1) {
            z7 = false;
        }
        Y3.m.f(z7);
        return N(Z6, g.W().y(kVar.c0(), nVar));
    }
}

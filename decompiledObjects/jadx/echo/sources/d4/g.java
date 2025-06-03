package d4;

import d4.n;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends c implements n {

    /* renamed from: s, reason: collision with root package name */
    public static final g f13297s = new g();

    public static g W() {
        return f13297s;
    }

    @Override // d4.c, d4.n
    public boolean B() {
        return false;
    }

    @Override // d4.c, java.lang.Comparable
    /* renamed from: D */
    public int compareTo(n nVar) {
        return nVar.isEmpty() ? 0 : -1;
    }

    @Override // d4.c, d4.n
    public int E() {
        return 0;
    }

    @Override // d4.c, d4.n
    public C1227b I(C1227b c1227b) {
        return null;
    }

    @Override // d4.c, d4.n
    public Object L(boolean z7) {
        return null;
    }

    @Override // d4.c, d4.n
    public n N(C1227b c1227b, n nVar) {
        return nVar.isEmpty() ? this : c1227b.s() ? this : new c().N(c1227b, nVar);
    }

    @Override // d4.c, d4.n
    public String O(n.b bVar) {
        return "";
    }

    @Override // d4.c, d4.n
    public Iterator P() {
        return Collections.emptyList().iterator();
    }

    @Override // d4.c, d4.n
    public boolean Q(C1227b c1227b) {
        return false;
    }

    @Override // d4.c, d4.n
    public String R() {
        return "";
    }

    @Override // d4.c
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.isEmpty() && t().equals(nVar.t())) {
                return true;
            }
        }
        return false;
    }

    @Override // d4.c, d4.n
    public Object getValue() {
        return null;
    }

    @Override // d4.c
    public int hashCode() {
        return 0;
    }

    @Override // d4.c, d4.n
    public boolean isEmpty() {
        return true;
    }

    @Override // d4.c, java.lang.Iterable
    public Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // d4.c
    public String toString() {
        return "<Empty Node>";
    }

    @Override // d4.c, d4.n
    public n y(V3.k kVar, n nVar) {
        if (kVar.isEmpty()) {
            return nVar;
        }
        C1227b Z6 = kVar.Z();
        return N(Z6, v(Z6).y(kVar.c0(), nVar));
    }

    @Override // d4.c, d4.n
    public n t() {
        return this;
    }

    @Override // d4.c, d4.n
    public n A(V3.k kVar) {
        return this;
    }

    @Override // d4.c, d4.n
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public g J(n nVar) {
        return this;
    }

    @Override // d4.c, d4.n
    public n v(C1227b c1227b) {
        return this;
    }
}

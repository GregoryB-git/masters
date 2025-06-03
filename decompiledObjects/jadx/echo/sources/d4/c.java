package d4;

import S3.c;
import S3.h;
import d4.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements n {

    /* renamed from: r, reason: collision with root package name */
    public static Comparator f13275r = new a();

    /* renamed from: o, reason: collision with root package name */
    public final S3.c f13276o;

    /* renamed from: p, reason: collision with root package name */
    public final n f13277p;

    /* renamed from: q, reason: collision with root package name */
    public String f13278q;

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C1227b c1227b, C1227b c1227b2) {
            return c1227b.compareTo(c1227b2);
        }
    }

    public class b extends h.b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f13279a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC0192c f13280b;

        public b(AbstractC0192c abstractC0192c) {
            this.f13280b = abstractC0192c;
        }

        @Override // S3.h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C1227b c1227b, n nVar) {
            if (!this.f13279a && c1227b.compareTo(C1227b.o()) > 0) {
                this.f13279a = true;
                this.f13280b.b(C1227b.o(), c.this.t());
            }
            this.f13280b.b(c1227b, nVar);
        }
    }

    /* renamed from: d4.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0192c extends h.b {
        public abstract void b(C1227b c1227b, n nVar);

        @Override // S3.h.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(C1227b c1227b, n nVar) {
            b(c1227b, nVar);
        }
    }

    public static class d implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        public final Iterator f13282o;

        public d(Iterator it) {
            this.f13282o = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m next() {
            Map.Entry entry = (Map.Entry) this.f13282o.next();
            return new m((C1227b) entry.getKey(), (n) entry.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13282o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f13282o.remove();
        }
    }

    public c() {
        this.f13278q = null;
        this.f13276o = c.a.c(f13275r);
        this.f13277p = r.a();
    }

    public static void s(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append(" ");
        }
    }

    @Override // d4.n
    public n A(V3.k kVar) {
        C1227b Z6 = kVar.Z();
        return Z6 == null ? this : v(Z6).A(kVar.c0());
    }

    @Override // d4.n
    public boolean B() {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: D */
    public int compareTo(n nVar) {
        if (isEmpty()) {
            return nVar.isEmpty() ? 0 : -1;
        }
        if (nVar.B() || nVar.isEmpty()) {
            return 1;
        }
        return nVar == n.f13316l ? -1 : 0;
    }

    @Override // d4.n
    public int E() {
        return this.f13276o.size();
    }

    @Override // d4.n
    public C1227b I(C1227b c1227b) {
        return (C1227b) this.f13276o.k(c1227b);
    }

    @Override // d4.n
    public n J(n nVar) {
        return this.f13276o.isEmpty() ? g.W() : new c(this.f13276o, nVar);
    }

    @Override // d4.n
    public Object L(boolean z7) {
        Integer k7;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = this.f13276o.iterator();
        boolean z8 = true;
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String e7 = ((C1227b) entry.getKey()).e();
            hashMap.put(e7, ((n) entry.getValue()).L(z7));
            i7++;
            if (z8) {
                if ((e7.length() > 1 && e7.charAt(0) == '0') || (k7 = Y3.m.k(e7)) == null || k7.intValue() < 0) {
                    z8 = false;
                } else if (k7.intValue() > i8) {
                    i8 = k7.intValue();
                }
            }
        }
        if (z7 || !z8 || i8 >= i7 * 2) {
            if (z7 && !this.f13277p.isEmpty()) {
                hashMap.put(".priority", this.f13277p.getValue());
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i8 + 1);
        for (int i9 = 0; i9 <= i8; i9++) {
            arrayList.add(hashMap.get("" + i9));
        }
        return arrayList;
    }

    public void M(AbstractC0192c abstractC0192c) {
        S(abstractC0192c, false);
    }

    @Override // d4.n
    public n N(C1227b c1227b, n nVar) {
        if (c1227b.s()) {
            return J(nVar);
        }
        S3.c cVar = this.f13276o;
        if (cVar.a(c1227b)) {
            cVar = cVar.D(c1227b);
        }
        if (!nVar.isEmpty()) {
            cVar = cVar.s(c1227b, nVar);
        }
        return cVar.isEmpty() ? g.W() : new c(cVar, this.f13277p);
    }

    @Override // d4.n
    public String O(n.b bVar) {
        boolean z7;
        n.b bVar2 = n.b.V1;
        if (bVar != bVar2) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f13277p.isEmpty()) {
            sb.append("priority:");
            sb.append(this.f13277p.O(bVar2));
            sb.append(":");
        }
        ArrayList<m> arrayList = new ArrayList();
        Iterator it = iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                m mVar = (m) it.next();
                arrayList.add(mVar);
                z7 = z7 || !mVar.d().t().isEmpty();
            }
        }
        if (z7) {
            Collections.sort(arrayList, q.j());
        }
        for (m mVar2 : arrayList) {
            String R6 = mVar2.d().R();
            if (!R6.equals("")) {
                sb.append(":");
                sb.append(mVar2.c().e());
                sb.append(":");
                sb.append(R6);
            }
        }
        return sb.toString();
    }

    @Override // d4.n
    public Iterator P() {
        return new d(this.f13276o.P());
    }

    @Override // d4.n
    public boolean Q(C1227b c1227b) {
        return !v(c1227b).isEmpty();
    }

    @Override // d4.n
    public String R() {
        if (this.f13278q == null) {
            String O6 = O(n.b.V1);
            this.f13278q = O6.isEmpty() ? "" : Y3.m.i(O6);
        }
        return this.f13278q;
    }

    public void S(AbstractC0192c abstractC0192c, boolean z7) {
        if (!z7 || t().isEmpty()) {
            this.f13276o.q(abstractC0192c);
        } else {
            this.f13276o.q(new b(abstractC0192c));
        }
    }

    public C1227b T() {
        return (C1227b) this.f13276o.i();
    }

    public C1227b U() {
        return (C1227b) this.f13276o.g();
    }

    public final void V(StringBuilder sb, int i7) {
        String str;
        if (this.f13276o.isEmpty() && this.f13277p.isEmpty()) {
            str = "{ }";
        } else {
            sb.append("{\n");
            Iterator it = this.f13276o.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int i8 = i7 + 2;
                s(sb, i8);
                sb.append(((C1227b) entry.getKey()).e());
                sb.append("=");
                boolean z7 = entry.getValue() instanceof c;
                Object value = entry.getValue();
                if (z7) {
                    ((c) value).V(sb, i8);
                } else {
                    sb.append(((n) value).toString());
                }
                sb.append("\n");
            }
            if (!this.f13277p.isEmpty()) {
                s(sb, i7 + 2);
                sb.append(".priority=");
                sb.append(this.f13277p.toString());
                sb.append("\n");
            }
            s(sb, i7);
            str = "}";
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!t().equals(cVar.t()) || this.f13276o.size() != cVar.f13276o.size()) {
            return false;
        }
        Iterator it = this.f13276o.iterator();
        Iterator it2 = cVar.f13276o.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!((C1227b) entry.getKey()).equals(entry2.getKey()) || !((n) entry.getValue()).equals(entry2.getValue())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            throw new IllegalStateException("Something went wrong internally.");
        }
        return true;
    }

    @Override // d4.n
    public Object getValue() {
        return L(false);
    }

    public int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            i7 = (((i7 * 31) + mVar.c().hashCode()) * 17) + mVar.d().hashCode();
        }
        return i7;
    }

    @Override // d4.n
    public boolean isEmpty() {
        return this.f13276o.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new d(this.f13276o.iterator());
    }

    @Override // d4.n
    public n t() {
        return this.f13277p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        V(sb, 0);
        return sb.toString();
    }

    @Override // d4.n
    public n v(C1227b c1227b) {
        return (!c1227b.s() || this.f13277p.isEmpty()) ? this.f13276o.a(c1227b) ? (n) this.f13276o.d(c1227b) : g.W() : this.f13277p;
    }

    @Override // d4.n
    public n y(V3.k kVar, n nVar) {
        C1227b Z6 = kVar.Z();
        if (Z6 == null) {
            return nVar;
        }
        if (!Z6.s()) {
            return N(Z6, v(Z6).y(kVar.c0(), nVar));
        }
        Y3.m.f(r.b(nVar));
        return J(nVar);
    }

    public c(S3.c cVar, n nVar) {
        this.f13278q = null;
        if (cVar.isEmpty() && !nVar.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f13277p = nVar;
        this.f13276o = cVar;
    }
}

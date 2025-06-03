package Y3;

import S3.c;
import d4.C1227b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements Iterable {

    /* renamed from: q, reason: collision with root package name */
    public static final S3.c f7540q;

    /* renamed from: r, reason: collision with root package name */
    public static final d f7541r;

    /* renamed from: o, reason: collision with root package name */
    public final Object f7542o;

    /* renamed from: p, reason: collision with root package name */
    public final S3.c f7543p;

    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7544a;

        public a(ArrayList arrayList) {
            this.f7544a = arrayList;
        }

        @Override // Y3.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(V3.k kVar, Object obj, Void r32) {
            this.f7544a.add(obj);
            return null;
        }
    }

    public class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f7546a;

        public b(List list) {
            this.f7546a = list;
        }

        @Override // Y3.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(V3.k kVar, Object obj, Void r42) {
            this.f7546a.add(new AbstractMap.SimpleImmutableEntry(kVar, obj));
            return null;
        }
    }

    public interface c {
        Object a(V3.k kVar, Object obj, Object obj2);
    }

    static {
        S3.c c7 = c.a.c(S3.l.b(C1227b.class));
        f7540q = c7;
        f7541r = new d(null, c7);
    }

    public d(Object obj) {
        this(obj, f7540q);
    }

    public static d d() {
        return f7541r;
    }

    public d D(C1227b c1227b) {
        d dVar = (d) this.f7543p.d(c1227b);
        return dVar != null ? dVar : d();
    }

    public S3.c M() {
        return this.f7543p;
    }

    public Object S(V3.k kVar) {
        return T(kVar, i.f7554a);
    }

    public Object T(V3.k kVar, i iVar) {
        Object obj = this.f7542o;
        Object obj2 = (obj == null || !iVar.a(obj)) ? null : this.f7542o;
        Iterator it = kVar.iterator();
        d dVar = this;
        while (it.hasNext()) {
            dVar = (d) dVar.f7543p.d((C1227b) it.next());
            if (dVar == null) {
                return obj2;
            }
            Object obj3 = dVar.f7542o;
            if (obj3 != null && iVar.a(obj3)) {
                obj2 = dVar.f7542o;
            }
        }
        return obj2;
    }

    public d U(V3.k kVar) {
        if (kVar.isEmpty()) {
            return this.f7543p.isEmpty() ? d() : new d(null, this.f7543p);
        }
        C1227b Z6 = kVar.Z();
        d dVar = (d) this.f7543p.d(Z6);
        if (dVar == null) {
            return this;
        }
        d U6 = dVar.U(kVar.c0());
        S3.c D7 = U6.isEmpty() ? this.f7543p.D(Z6) : this.f7543p.s(Z6, U6);
        return (this.f7542o == null && D7.isEmpty()) ? d() : new d(this.f7542o, D7);
    }

    public Object V(V3.k kVar, i iVar) {
        Object obj = this.f7542o;
        if (obj != null && iVar.a(obj)) {
            return this.f7542o;
        }
        Iterator it = kVar.iterator();
        d dVar = this;
        while (it.hasNext()) {
            dVar = (d) dVar.f7543p.d((C1227b) it.next());
            if (dVar == null) {
                return null;
            }
            Object obj2 = dVar.f7542o;
            if (obj2 != null && iVar.a(obj2)) {
                return dVar.f7542o;
            }
        }
        return null;
    }

    public d W(V3.k kVar, Object obj) {
        if (kVar.isEmpty()) {
            return new d(obj, this.f7543p);
        }
        C1227b Z6 = kVar.Z();
        d dVar = (d) this.f7543p.d(Z6);
        if (dVar == null) {
            dVar = d();
        }
        return new d(this.f7542o, this.f7543p.s(Z6, dVar.W(kVar.c0(), obj)));
    }

    public d X(V3.k kVar, d dVar) {
        if (kVar.isEmpty()) {
            return dVar;
        }
        C1227b Z6 = kVar.Z();
        d dVar2 = (d) this.f7543p.d(Z6);
        if (dVar2 == null) {
            dVar2 = d();
        }
        d X6 = dVar2.X(kVar.c0(), dVar);
        return new d(this.f7542o, X6.isEmpty() ? this.f7543p.D(Z6) : this.f7543p.s(Z6, X6));
    }

    public d Y(V3.k kVar) {
        if (kVar.isEmpty()) {
            return this;
        }
        d dVar = (d) this.f7543p.d(kVar.Z());
        return dVar != null ? dVar.Y(kVar.c0()) : d();
    }

    public Collection Z() {
        ArrayList arrayList = new ArrayList();
        q(new a(arrayList));
        return arrayList;
    }

    public boolean a(i iVar) {
        Object obj = this.f7542o;
        if (obj != null && iVar.a(obj)) {
            return true;
        }
        Iterator it = this.f7543p.iterator();
        while (it.hasNext()) {
            if (((d) ((Map.Entry) it.next()).getValue()).a(iVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        S3.c cVar = this.f7543p;
        if (cVar == null ? dVar.f7543p != null : !cVar.equals(dVar.f7543p)) {
            return false;
        }
        Object obj2 = this.f7542o;
        Object obj3 = dVar.f7542o;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public V3.k f(V3.k kVar, i iVar) {
        V3.k f7;
        Object obj = this.f7542o;
        if (obj != null && iVar.a(obj)) {
            return V3.k.Y();
        }
        if (kVar.isEmpty()) {
            return null;
        }
        C1227b Z6 = kVar.Z();
        d dVar = (d) this.f7543p.d(Z6);
        if (dVar == null || (f7 = dVar.f(kVar.c0(), iVar)) == null) {
            return null;
        }
        return new V3.k(Z6).T(f7);
    }

    public V3.k g(V3.k kVar) {
        return f(kVar, i.f7554a);
    }

    public Object getValue() {
        return this.f7542o;
    }

    public int hashCode() {
        Object obj = this.f7542o;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        S3.c cVar = this.f7543p;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final Object i(V3.k kVar, c cVar, Object obj) {
        Iterator it = this.f7543p.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            obj = ((d) entry.getValue()).i(kVar.U((C1227b) entry.getKey()), cVar, obj);
        }
        Object obj2 = this.f7542o;
        return obj2 != null ? cVar.a(kVar, obj2, obj) : obj;
    }

    public boolean isEmpty() {
        return this.f7542o == null && this.f7543p.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        q(new b(arrayList));
        return arrayList.iterator();
    }

    public Object k(Object obj, c cVar) {
        return i(V3.k.Y(), cVar, obj);
    }

    public void q(c cVar) {
        i(V3.k.Y(), cVar, null);
    }

    public Object s(V3.k kVar) {
        if (kVar.isEmpty()) {
            return this.f7542o;
        }
        d dVar = (d) this.f7543p.d(kVar.Z());
        if (dVar != null) {
            return dVar.s(kVar.c0());
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImmutableTree { value=");
        sb.append(getValue());
        sb.append(", children={");
        Iterator it = this.f7543p.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(((C1227b) entry.getKey()).e());
            sb.append("=");
            sb.append(entry.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    public d(Object obj, S3.c cVar) {
        this.f7542o = obj;
        this.f7543p = cVar;
    }
}

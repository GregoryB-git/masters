package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    public c f17834o;

    /* renamed from: p, reason: collision with root package name */
    public c f17835p;

    /* renamed from: q, reason: collision with root package name */
    public WeakHashMap f17836q = new WeakHashMap();

    /* renamed from: r, reason: collision with root package name */
    public int f17837r = 0;

    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public c d(c cVar) {
            return cVar.f17841r;
        }

        @Override // n.b.e
        public c e(c cVar) {
            return cVar.f17840q;
        }
    }

    /* renamed from: n.b$b, reason: collision with other inner class name */
    public static class C0238b extends e {
        public C0238b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public c d(c cVar) {
            return cVar.f17840q;
        }

        @Override // n.b.e
        public c e(c cVar) {
            return cVar.f17841r;
        }
    }

    public static class c implements Map.Entry {

        /* renamed from: o, reason: collision with root package name */
        public final Object f17838o;

        /* renamed from: p, reason: collision with root package name */
        public final Object f17839p;

        /* renamed from: q, reason: collision with root package name */
        public c f17840q;

        /* renamed from: r, reason: collision with root package name */
        public c f17841r;

        public c(Object obj, Object obj2) {
            this.f17838o = obj;
            this.f17839p = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f17838o.equals(cVar.f17838o) && this.f17839p.equals(cVar.f17839p);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f17838o;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f17839p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f17838o.hashCode() ^ this.f17839p.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f17838o + "=" + this.f17839p;
        }
    }

    public class d implements Iterator, f {

        /* renamed from: o, reason: collision with root package name */
        public c f17842o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f17843p = true;

        public d() {
        }

        @Override // n.b.f
        public void b(c cVar) {
            c cVar2 = this.f17842o;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f17841r;
                this.f17842o = cVar3;
                this.f17843p = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar;
            if (this.f17843p) {
                this.f17843p = false;
                cVar = b.this.f17834o;
            } else {
                c cVar2 = this.f17842o;
                cVar = cVar2 != null ? cVar2.f17840q : null;
            }
            this.f17842o = cVar;
            return this.f17842o;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f17843p) {
                return b.this.f17834o != null;
            }
            c cVar = this.f17842o;
            return (cVar == null || cVar.f17840q == null) ? false : true;
        }
    }

    public static abstract class e implements Iterator, f {

        /* renamed from: o, reason: collision with root package name */
        public c f17845o;

        /* renamed from: p, reason: collision with root package name */
        public c f17846p;

        public e(c cVar, c cVar2) {
            this.f17845o = cVar2;
            this.f17846p = cVar;
        }

        @Override // n.b.f
        public void b(c cVar) {
            if (this.f17845o == cVar && cVar == this.f17846p) {
                this.f17846p = null;
                this.f17845o = null;
            }
            c cVar2 = this.f17845o;
            if (cVar2 == cVar) {
                this.f17845o = d(cVar2);
            }
            if (this.f17846p == cVar) {
                this.f17846p = g();
            }
        }

        public abstract c d(c cVar);

        public abstract c e(c cVar);

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f17846p;
            this.f17846p = g();
            return cVar;
        }

        public final c g() {
            c cVar = this.f17846p;
            c cVar2 = this.f17845o;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return e(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17846p != null;
        }
    }

    public interface f {
        void b(c cVar);
    }

    public Map.Entry a() {
        return this.f17834o;
    }

    public c d(Object obj) {
        c cVar = this.f17834o;
        while (cVar != null && !cVar.f17838o.equals(obj)) {
            cVar = cVar.f17840q;
        }
        return cVar;
    }

    public Iterator descendingIterator() {
        C0238b c0238b = new C0238b(this.f17835p, this.f17834o);
        this.f17836q.put(c0238b, Boolean.FALSE);
        return c0238b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public d f() {
        d dVar = new d();
        this.f17836q.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry g() {
        return this.f17835p;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((Map.Entry) it.next()).hashCode();
        }
        return i7;
    }

    public c i(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f17837r++;
        c cVar2 = this.f17835p;
        if (cVar2 == null) {
            this.f17834o = cVar;
        } else {
            cVar2.f17840q = cVar;
            cVar.f17841r = cVar2;
        }
        this.f17835p = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f17834o, this.f17835p);
        this.f17836q.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object k(Object obj, Object obj2) {
        c d7 = d(obj);
        if (d7 != null) {
            return d7.f17839p;
        }
        i(obj, obj2);
        return null;
    }

    public Object q(Object obj) {
        c d7 = d(obj);
        if (d7 == null) {
            return null;
        }
        this.f17837r--;
        if (!this.f17836q.isEmpty()) {
            Iterator it = this.f17836q.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(d7);
            }
        }
        c cVar = d7.f17841r;
        c cVar2 = d7.f17840q;
        if (cVar != null) {
            cVar.f17840q = cVar2;
        } else {
            this.f17834o = cVar2;
        }
        c cVar3 = d7.f17840q;
        if (cVar3 != null) {
            cVar3.f17841r = cVar;
        } else {
            this.f17835p = cVar;
        }
        d7.f17840q = null;
        d7.f17841r = null;
        return d7.f17839p;
    }

    public int size() {
        return this.f17837r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

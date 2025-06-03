package X2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0688f implements H {

    /* renamed from: o, reason: collision with root package name */
    public transient Set f7145o;

    /* renamed from: p, reason: collision with root package name */
    public transient Collection f7146p;

    /* renamed from: q, reason: collision with root package name */
    public transient Map f7147q;

    /* renamed from: X2.f$a */
    public class a extends AbstractCollection {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC0688f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0688f.this.b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC0688f.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC0688f.this.size();
        }
    }

    @Override // X2.H
    public Map a() {
        Map map = this.f7147q;
        if (map != null) {
            return map;
        }
        Map c7 = c();
        this.f7147q = c7;
        return c7;
    }

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map c();

    public abstract Set d();

    public abstract Collection e();

    public boolean equals(Object obj) {
        return K.a(this, obj);
    }

    public Set f() {
        Set set = this.f7145o;
        if (set != null) {
            return set;
        }
        Set d7 = d();
        this.f7145o = d7;
        return d7;
    }

    public abstract Iterator g();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    @Override // X2.H
    public Collection values() {
        Collection collection = this.f7146p;
        if (collection != null) {
            return collection;
        }
        Collection e7 = e();
        this.f7146p = e7;
        return e7;
    }
}

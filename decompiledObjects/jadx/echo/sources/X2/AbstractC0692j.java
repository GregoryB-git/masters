package X2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0692j {

    /* renamed from: X2.j$a */
    public static class a extends AbstractCollection {

        /* renamed from: o, reason: collision with root package name */
        public final Collection f7151o;

        /* renamed from: p, reason: collision with root package name */
        public final W2.n f7152p;

        public a(Collection collection, W2.n nVar) {
            this.f7151o = collection;
            this.f7152p = nVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            W2.m.d(this.f7152p.apply(obj));
            return this.f7151o.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                W2.m.d(this.f7152p.apply(it.next()));
            }
            return this.f7151o.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            B.h(this.f7151o, this.f7152p);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (AbstractC0692j.c(this.f7151o, obj)) {
                return this.f7152p.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            return AbstractC0692j.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !B.a(this.f7151o, this.f7152p);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C.i(this.f7151o.iterator(), this.f7152p);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f7151o.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it = this.f7151o.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f7152p.apply(next) && collection.contains(next)) {
                    it.remove();
                    z7 = true;
                }
            }
            return z7;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it = this.f7151o.iterator();
            boolean z7 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f7152p.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z7 = true;
                }
            }
            return z7;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator it = this.f7151o.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                if (this.f7152p.apply(it.next())) {
                    i7++;
                }
            }
            return i7;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return E.i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return E.i(iterator()).toArray(objArr);
        }
    }

    public static boolean a(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder b(int i7) {
        AbstractC0691i.b(i7, "size");
        return new StringBuilder((int) Math.min(i7 * 8, 1073741824L));
    }

    public static boolean c(Collection collection, Object obj) {
        W2.m.j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}

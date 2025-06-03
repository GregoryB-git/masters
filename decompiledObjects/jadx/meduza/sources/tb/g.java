package tb;

import ec.i;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import tb.c;

/* loaded from: classes.dex */
public final class g<E> extends sb.g<E> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final g f14740b;

    /* renamed from: a, reason: collision with root package name */
    public final c<E, ?> f14741a;

    static {
        c cVar = c.f14718v;
        f14740b = new g(c.f14718v);
    }

    public g() {
        this(new c());
    }

    public g(c<E, ?> cVar) {
        i.e(cVar, "backing");
        this.f14741a = cVar;
    }

    @Override // sb.g
    public final int a() {
        return this.f14741a.f14726q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        return this.f14741a.b(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        i.e(collection, "elements");
        this.f14741a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f14741a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14741a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f14741a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        c<E, ?> cVar = this.f14741a;
        cVar.getClass();
        return new c.e(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        c<E, ?> cVar = this.f14741a;
        cVar.c();
        int h10 = cVar.h(obj);
        if (h10 < 0) {
            return false;
        }
        cVar.k(h10);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.f14741a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        i.e(collection, "elements");
        this.f14741a.c();
        return super.retainAll(collection);
    }
}

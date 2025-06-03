package t8;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<j<K, V>> f14650a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14651b = false;

    public d(h hVar, Object obj, Comparator comparator) {
        while (!hVar.isEmpty()) {
            int compare = obj != null ? comparator.compare(hVar.getKey(), obj) : 1;
            if (compare < 0) {
                hVar = hVar.f();
            } else if (compare == 0) {
                this.f14650a.push((j) hVar);
                return;
            } else {
                this.f14650a.push((j) hVar);
                hVar = hVar.a();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14650a.size() > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            j<K, V> pop = this.f14650a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.f14659a, pop.f14660b);
            if (this.f14651b) {
                for (h<K, V> hVar = pop.f14661c; !hVar.isEmpty(); hVar = hVar.f()) {
                    this.f14650a.push((j) hVar);
                }
            } else {
                for (h<K, V> hVar2 = pop.f14662d; !hVar2.isEmpty(); hVar2 = hVar2.a()) {
                    this.f14650a.push((j) hVar2);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}

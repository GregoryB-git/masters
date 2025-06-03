package S3;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class d implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f5861o = new ArrayDeque();

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5862p;

    public d(h hVar, Object obj, Comparator comparator, boolean z7) {
        int i7;
        this.f5862p = z7;
        while (!hVar.isEmpty()) {
            if (obj != null) {
                Object key = hVar.getKey();
                i7 = z7 ? comparator.compare(obj, key) : comparator.compare(key, obj);
            } else {
                i7 = 1;
            }
            if (i7 < 0) {
                hVar = z7 ? hVar.a() : hVar.f();
            } else if (i7 == 0) {
                this.f5861o.push((j) hVar);
                return;
            } else {
                this.f5861o.push((j) hVar);
                if (z7) {
                }
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        try {
            j jVar = (j) this.f5861o.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(jVar.getKey(), jVar.getValue());
            if (this.f5862p) {
                for (h a7 = jVar.a(); !a7.isEmpty(); a7 = a7.f()) {
                    this.f5861o.push((j) a7);
                }
            } else {
                for (h f7 = jVar.f(); !f7.isEmpty(); f7 = f7.a()) {
                    this.f5861o.push((j) f7);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5861o.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}

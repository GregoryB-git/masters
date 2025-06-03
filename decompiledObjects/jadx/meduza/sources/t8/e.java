package t8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t8.k;

/* loaded from: classes.dex */
public final class e<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    public final c<T, Void> f14652a;

    public static class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<T, Void>> f14653a;

        public a(Iterator<Map.Entry<T, Void>> it) {
            this.f14653a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f14653a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return this.f14653a.next().getKey();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f14653a.remove();
        }
    }

    public e(List<T> list, Comparator<T> comparator) {
        c<T, Void> b10;
        Map emptyMap = Collections.emptyMap();
        if (list.size() < 25) {
            Collections.sort(list, comparator);
            int size = list.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int i10 = 0;
            for (T t : list) {
                objArr[i10] = t;
                objArr2[i10] = emptyMap.get(t);
                i10++;
            }
            b10 = new b<>(comparator, objArr, objArr2);
        } else {
            b10 = k.a.b(list, emptyMap, comparator);
        }
        this.f14652a = b10;
    }

    public e(c<T, Void> cVar) {
        this.f14652a = cVar;
    }

    public final e<T> a(T t) {
        return new e<>(this.f14652a.n(t, null));
    }

    public final boolean contains(T t) {
        return this.f14652a.a(t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f14652a.equals(((e) obj).f14652a);
        }
        return false;
    }

    public final a h(i9.c cVar) {
        return new a(this.f14652a.o(cVar));
    }

    public final int hashCode() {
        return this.f14652a.hashCode();
    }

    public final e<T> i(T t) {
        c<T, Void> p10 = this.f14652a.p(t);
        return p10 == this.f14652a ? this : new e<>(p10);
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this.f14652a.iterator());
    }

    public final int size() {
        return this.f14652a.size();
    }
}

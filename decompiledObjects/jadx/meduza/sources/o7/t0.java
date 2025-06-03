package o7;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import o7.u0;

/* loaded from: classes.dex */
public final class t0 extends u0.d<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f12055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f12056b;

    public t0(x xVar, x xVar2) {
        this.f12055a = xVar;
        this.f12056b = xVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12055a.contains(obj) && this.f12056b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f12055a.containsAll(collection) && this.f12056b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f12056b, this.f12055a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new s0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f12055a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f12056b.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}

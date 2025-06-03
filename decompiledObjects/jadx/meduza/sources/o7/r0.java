package o7;

import java.util.Iterator;
import java.util.Set;
import o7.u0;

/* loaded from: classes.dex */
public final class r0 extends u0.d<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f12044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f12045b;

    public r0(Set set, Set set2) {
        this.f12044a = set;
        this.f12045b = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12044a.contains(obj) || this.f12045b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12044a.isEmpty() && this.f12045b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new q0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int size = this.f12044a.size();
        Iterator it = this.f12045b.iterator();
        while (it.hasNext()) {
            if (!this.f12044a.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}

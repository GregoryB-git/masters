package v5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class f<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15895a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15896b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Set<E> f15897c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public List<E> f15898d = Collections.emptyList();

    public final int a(E e10) {
        int intValue;
        synchronized (this.f15895a) {
            intValue = this.f15896b.containsKey(e10) ? ((Integer) this.f15896b.get(e10)).intValue() : 0;
        }
        return intValue;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f15895a) {
            it = this.f15898d.iterator();
        }
        return it;
    }
}

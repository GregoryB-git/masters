package d8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class p<T> implements t9.b<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    public volatile Set<T> f3621b = null;

    /* renamed from: a, reason: collision with root package name */
    public volatile Set<t9.b<T>> f3620a = Collections.newSetFromMap(new ConcurrentHashMap());

    public p(Collection<t9.b<T>> collection) {
        this.f3620a.addAll(collection);
    }

    @Override // t9.b
    public final Object get() {
        if (this.f3621b == null) {
            synchronized (this) {
                if (this.f3621b == null) {
                    this.f3621b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        Iterator<t9.b<T>> it = this.f3620a.iterator();
                        while (it.hasNext()) {
                            this.f3621b.add(it.next().get());
                        }
                        this.f3620a = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.f3621b);
    }
}

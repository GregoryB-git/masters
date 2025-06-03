package d8;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements c9.d, c9.c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3614a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f3615b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f3616c;

    public m(Executor executor) {
        this.f3616c = executor;
    }

    @Override // c9.d
    public final void a(aa.m mVar) {
        d(this.f3616c, mVar);
    }

    @Override // c9.c
    public final void b(c9.a<?> aVar) {
        Set<Map.Entry> emptySet;
        aVar.getClass();
        synchronized (this) {
            ArrayDeque arrayDeque = this.f3615b;
            if (arrayDeque != null) {
                arrayDeque.add(aVar);
                return;
            }
            synchronized (this) {
                Map map = (Map) this.f3614a.get(aVar.f2548a);
                emptySet = map == null ? Collections.emptySet() : map.entrySet();
            }
            for (Map.Entry entry : emptySet) {
                ((Executor) entry.getValue()).execute(new g.q(11, entry, aVar));
            }
        }
    }

    @Override // c9.d
    public final synchronized void c(c9.b bVar) {
        bVar.getClass();
        if (this.f3614a.containsKey(u7.b.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f3614a.get(u7.b.class);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f3614a.remove(u7.b.class);
            }
        }
    }

    @Override // c9.d
    public final synchronized void d(Executor executor, c9.b bVar) {
        executor.getClass();
        if (!this.f3614a.containsKey(u7.b.class)) {
            this.f3614a.put(u7.b.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f3614a.get(u7.b.class)).put(bVar, executor);
    }
}

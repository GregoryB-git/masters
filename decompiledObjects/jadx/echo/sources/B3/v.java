package B3;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n4.C1728a;
import n4.InterfaceC1729b;
import n4.InterfaceC1730c;
import n4.InterfaceC1731d;

/* loaded from: classes.dex */
public class v implements InterfaceC1731d, InterfaceC1730c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f800a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Queue f801b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f802c;

    public v(Executor executor) {
        this.f802c = executor;
    }

    public static /* synthetic */ void h(Map.Entry entry, C1728a c1728a) {
        ((InterfaceC1729b) entry.getKey()).a(c1728a);
    }

    @Override // n4.InterfaceC1730c
    public void a(final C1728a c1728a) {
        E.b(c1728a);
        synchronized (this) {
            try {
                Queue queue = this.f801b;
                if (queue != null) {
                    queue.add(c1728a);
                    return;
                }
                for (final Map.Entry entry : g(c1728a)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: B3.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.h(entry, c1728a);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n4.InterfaceC1731d
    public synchronized void b(Class cls, Executor executor, InterfaceC1729b interfaceC1729b) {
        try {
            E.b(cls);
            E.b(interfaceC1729b);
            E.b(executor);
            if (!this.f800a.containsKey(cls)) {
                this.f800a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f800a.get(cls)).put(interfaceC1729b, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // n4.InterfaceC1731d
    public void c(Class cls, InterfaceC1729b interfaceC1729b) {
        b(cls, this.f802c, interfaceC1729b);
    }

    @Override // n4.InterfaceC1731d
    public synchronized void d(Class cls, InterfaceC1729b interfaceC1729b) {
        E.b(cls);
        E.b(interfaceC1729b);
        if (this.f800a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f800a.get(cls);
            concurrentHashMap.remove(interfaceC1729b);
            if (concurrentHashMap.isEmpty()) {
                this.f800a.remove(cls);
            }
        }
    }

    public void f() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f801b;
                if (queue != null) {
                    this.f801b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                a((C1728a) it.next());
            }
        }
    }

    public final synchronized Set g(C1728a c1728a) {
        Map map;
        try {
            map = (Map) this.f800a.get(c1728a.b());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }
}

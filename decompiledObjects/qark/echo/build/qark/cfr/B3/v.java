/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 */
package B3;

import B3.E;
import B3.u;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n4.a;
import n4.b;
import n4.c;
import n4.d;

public class v
implements d,
c {
    public final Map a = new HashMap();
    public Queue b = new ArrayDeque();
    public final Executor c;

    public v(Executor executor) {
        this.c = executor;
    }

    public static /* synthetic */ void e(Map.Entry entry, a a8) {
        v.h(entry, a8);
    }

    public static /* synthetic */ void h(Map.Entry entry, a a8) {
        ((b)entry.getKey()).a(a8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void a(a a8) {
        E.b(a8);
        // MONITORENTER : this
        Queue queue = this.b;
        if (queue != null) {
            queue.add((Object)a8);
            // MONITOREXIT : this
            return;
        }
        // MONITOREXIT : this
        queue = this.g(a8).iterator();
        while (queue.hasNext()) {
            Map.Entry entry = (Map.Entry)queue.next();
            ((Executor)entry.getValue()).execute((Runnable)new u(entry, a8));
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(Class class_, Executor executor, b b8) {
        synchronized (this) {
            try {
                E.b((Object)class_);
                E.b(b8);
                E.b((Object)executor);
                if (!this.a.containsKey((Object)class_)) {
                    this.a.put((Object)class_, (Object)new ConcurrentHashMap());
                }
                ((ConcurrentHashMap)this.a.get((Object)class_)).put((Object)b8, (Object)executor);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void c(Class class_, b b8) {
        this.b(class_, this.c, b8);
    }

    @Override
    public void d(Class class_, b b8) {
        synchronized (this) {
            Throwable throwable2;
            block6 : {
                block5 : {
                    block4 : {
                        try {
                            E.b((Object)class_);
                            E.b(b8);
                            boolean bl = this.a.containsKey((Object)class_);
                            if (bl) break block4;
                        }
                        catch (Throwable throwable2) {}
                        return;
                    }
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)this.a.get((Object)class_);
                    concurrentHashMap.remove((Object)b8);
                    if (!concurrentHashMap.isEmpty()) break block5;
                    this.a.remove((Object)class_);
                    break block5;
                    break block6;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void f() {
        // MONITORENTER : this
        Queue queue = this.b;
        if (queue == null) return;
        this.b = null;
        // MONITOREXIT : this
        if (queue == null) return;
        queue = queue.iterator();
        while (queue.hasNext()) {
            this.a((a)queue.next());
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Set g(a a8) {
        synchronized (this) {
            try {
                a8 = (Map)this.a.get((Object)a8.b());
                if (a8 != null) return a8.entrySet();
                return Collections.emptySet();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}


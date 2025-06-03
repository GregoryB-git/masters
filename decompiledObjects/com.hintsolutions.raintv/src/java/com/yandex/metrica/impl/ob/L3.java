/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.ym
 *  java.lang.Class
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.WeakHashMap
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.LinkedBlockingQueue
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.n3;
import com.yandex.metrica.impl.ob.p3;
import com.yandex.metrica.impl.ob.ym;
import com.yandex.metrica.impl.ob.zm;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class l3 {
    private final ym a;
    private final BlockingQueue<b> b = new LinkedBlockingQueue();
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<p3<? extends n3>>> c = new ConcurrentHashMap();
    private WeakHashMap<Object, CopyOnWriteArrayList<d>> d = new WeakHashMap();
    private ConcurrentHashMap<Class, n3> e = new ConcurrentHashMap();

    @VisibleForTesting
    public l3() {
        ym ym2;
        this.a = ym2 = zm.a("YMM-BD", new Runnable(this){
            public final l3 a;
            {
                this.a = l32;
            }

            public void run() {
                while (true) {
                    this.a.getClass();
                    try {
                        ((b)this.a.b.take()).a();
                    }
                    catch (InterruptedException interruptedException) {
                    }
                }
            }
        });
        ym2.start();
    }

    public static final l3 a() {
        return com.yandex.metrica.impl.ob.l3$c.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(n3 n32) {
        l3 l32 = this;
        // MONITORENTER : l32
        l32 = this;
        // MONITORENTER : l32
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList)this.c.get((Object)n32.getClass());
        if (copyOnWriteArrayList != null) {
            for (p3 p32 : copyOnWriteArrayList) {
                BlockingQueue<b> blockingQueue = this.b;
                b b2 = new b(n32, p32, null);
                blockingQueue.add((Object)b2);
            }
        }
        // MONITOREXIT : l32
        this.e.put((Object)n32.getClass(), (Object)n32);
        // MONITOREXIT : l32
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Object object) {
        l3 l32 = this;
        synchronized (l32) {
            object = (List)this.d.remove(object);
            if (object != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    d d4 = (d)object.next();
                    d4.a.remove(d4.b);
                }
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Object object, Class object2, p3<? extends n3> p32) {
        l3 l32 = this;
        synchronized (l32) {
            void var2_2;
            BlockingQueue<b> blockingQueue;
            BlockingQueue<b> blockingQueue2 = blockingQueue = (BlockingQueue<b>)this.c.get((Object)var2_2);
            if (blockingQueue == null) {
                blockingQueue2 = new BlockingQueue<b>();
                this.c.put((Object)var2_2, (Object)blockingQueue2);
            }
            blockingQueue2.add(p32);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList)this.d.get(object);
            blockingQueue = copyOnWriteArrayList;
            if (copyOnWriteArrayList == null) {
                blockingQueue = new BlockingQueue<b>();
                this.d.put(object, (Object)blockingQueue);
            }
            object = new d((CopyOnWriteArrayList)blockingQueue2, p32, null);
            blockingQueue.add(object);
            object = (n3)this.e.get((Object)var2_2);
            if (object != null) {
                blockingQueue2 = this.b;
                object2 = new b((n3)object, p32, null);
                blockingQueue2.add(object2);
            }
            return;
        }
    }

    public static class b {
        private final n3 a;
        private final p3<? extends n3> b;

        private b(n3 n32, p3<? extends n3> p32) {
            this.a = n32;
            this.b = p32;
        }

        public /* synthetic */ b(n3 n32, p3 p32, a a2) {
            this(n32, p32);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void a() {
            try {
                if (!this.b.a(this.a)) {
                    this.b.b(this.a);
                }
                return;
            }
            catch (Throwable throwable) {
                return;
            }
        }
    }

    public static final class c {
        private static final l3 a = new l3();
    }

    public static class d {
        public final CopyOnWriteArrayList<p3<? extends n3>> a;
        public final p3<? extends n3> b;

        private d(CopyOnWriteArrayList<p3<? extends n3>> copyOnWriteArrayList, p3<? extends n3> p32) {
            this.a = copyOnWriteArrayList;
            this.b = p32;
        }

        public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, p3 p32, a a2) {
            this((CopyOnWriteArrayList<p3<? extends n3>>)copyOnWriteArrayList, p32);
        }

        public void finalize() throws Throwable {
            super.finalize();
            this.a.remove(this.b);
        }
    }
}


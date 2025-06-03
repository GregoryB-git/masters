/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.LinkedBlockingQueue
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.api.c;
import com.yandex.metrica.networktasks.impl.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class NetworkCore
extends com.yandex.metrica.networktasks.impl.c {
    private final BlockingQueue b = new LinkedBlockingQueue();
    private final Object c = new Object();
    private final Object d = new Object();
    private volatile c e;
    private final e f;

    public NetworkCore() {
        this(new e());
    }

    public NetworkCore(e e4) {
        this.f = e4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDestroy() {
        Object object;
        Object object2 = object = this.d;
        synchronized (object2) {
            c c9 = this.e;
            if (c9 != null) {
                c9.a.onTaskRemoved();
            }
            c9 = new ArrayList(this.b.size());
            this.b.drainTo((Collection)c9);
            c9 = c9.iterator();
            while (c9.hasNext()) {
                ((c)c9.next()).a.onTaskRemoved();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void run() {
        Object object = null;
        while (this.isRunning()) {
            Object object2;
            Object object3 = object;
            Object object4 = object;
            try {
                Object object5 = this.d;
                object3 = object;
                object4 = object;
                Object object6 = object5;
                // MONITORENTER : object6
                // MONITOREXIT : object6
                object3 = object;
                object4 = object;
                this.e = (c)this.b.take();
                object3 = object;
                object4 = object;
                object3 = object = this.e.a;
                object4 = object;
                ((NetworkTask)object).getExecutor().execute((Runnable)this.f.a((NetworkTask)object, this));
                Object object7 = object3 = this.d;
            }
            catch (Throwable throwable) {
                object2 = object = this.d;
                // MONITORENTER : object2
                this.e = null;
                if (object3 != null) {
                    ((NetworkTask)object3).onTaskFinished();
                    ((NetworkTask)object3).onTaskRemoved();
                }
                // MONITOREXIT : object2
                throw throwable;
            }
            catch (InterruptedException interruptedException) {
                object2 = object = this.d;
                // MONITORENTER : object2
                this.e = null;
                if (object4 != null) {
                    ((NetworkTask)object4).onTaskFinished();
                    ((NetworkTask)object4).onTaskRemoved();
                }
                // MONITOREXIT : object2
                object = object4;
                continue;
            }
            // MONITORENTER : object7
            this.e = null;
            ((NetworkTask)object).onTaskFinished();
            ((NetworkTask)object).onTaskRemoved();
            // MONITOREXIT : object7
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startTask(NetworkTask networkTask) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            c c9 = new c(networkTask, null);
            if (!this.isRunning()) return;
            if (this.b.contains((Object)c9)) return;
            if (c9.equals(this.e)) {
                return;
            }
            boolean bl2 = false;
            if (bl2) return;
            if (!c9.a.onTaskAdded()) return;
            this.b.offer((Object)c9);
            return;
        }
    }
}


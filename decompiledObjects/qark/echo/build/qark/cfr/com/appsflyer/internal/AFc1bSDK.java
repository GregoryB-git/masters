/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InterruptedIOException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.NavigableSet
 *  java.util.Set
 *  java.util.Timer
 *  java.util.TimerTask
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentSkipListSet
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.CopyOnWriteArraySet
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1cSDK;
import com.appsflyer.internal.AFd1jSDK;
import com.appsflyer.internal.AFd1uSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class AFc1bSDK
implements Runnable {
    final ExecutorService AFInAppEventParameterName;
    final Set<AFd1vSDK> AFInAppEventType = new CopyOnWriteArraySet();
    public Executor AFKeystoreWrapper = Executors.newSingleThreadExecutor();
    final NavigableSet<AFd1zSDK<?>> AFLogger = new ConcurrentSkipListSet();
    final List<AFd1zSDK<?>> afDebugLog = new ArrayList();
    final Set<AFd1zSDK<?>> afErrorLog = Collections.newSetFromMap((Map)new ConcurrentHashMap());
    final NavigableSet<AFd1zSDK<?>> afInfoLog = new ConcurrentSkipListSet();
    private Timer afRDLog = new Timer(true);
    final Set<AFd1vSDK> valueOf = Collections.newSetFromMap((Map)new ConcurrentHashMap());
    public final List<AFc1cSDK> values = new CopyOnWriteArrayList();

    public AFc1bSDK(ExecutorService executorService) {
        this.AFInAppEventParameterName = executorService;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void AFInAppEventParameterName(AFc1bSDK aFc1bSDK) {
        NavigableSet navigableSet = aFc1bSDK.AFLogger;
        synchronized (navigableSet) {
            try {
                Iterator iterator = aFc1bSDK.afInfoLog.iterator();
                boolean bl = false;
                while (iterator.hasNext()) {
                    AFd1zSDK aFd1zSDK = (AFd1zSDK)iterator.next();
                    if (!aFc1bSDK.values(aFd1zSDK)) continue;
                    iterator.remove();
                    aFc1bSDK.AFLogger.add((Object)aFd1zSDK);
                    bl = true;
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static boolean valueOf(AFd1zSDK<?> aFd1zSDK) {
        if (aFd1zSDK instanceof AFd1jSDK && aFd1zSDK.values == AFd1vSDK.AppsFlyer2dXConversionCallback) {
            return false;
        }
        return true;
    }

    private boolean values(AFd1zSDK<?> aFd1zSDK) {
        return this.AFInAppEventType.containsAll(aFd1zSDK.AFInAppEventParameterName);
    }

    public final void AFInAppEventParameterName(NavigableSet<AFd1zSDK<?>> object) {
        object = (AFd1zSDK)object.pollFirst();
        this.AFInAppEventType.add((Object)object.values);
        Iterator iterator = this.values.iterator();
        while (iterator.hasNext()) {
            ((AFc1cSDK)iterator.next()).AFInAppEventParameterName(object);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        var3_1 = this.AFLogger;
        // MONITORENTER : var3_1
        var4_3 = (AFd1zSDK)this.AFLogger.pollFirst();
        if (var4_3 == null) {
            // MONITOREXIT : var3_1
            return;
        }
        this.afErrorLog.add(var4_3);
        // MONITOREXIT : var3_1
        var1_5 = var4_3.AFInAppEventType();
        var3_1 = new AFd1uSDK(Thread.currentThread());
        if (var1_5 > 0L) {
            this.afRDLog.schedule((TimerTask)var3_1, var1_5);
        }
        this.AFKeystoreWrapper.execute(new Runnable(this, (AFd1zSDK)var4_3){
            private /* synthetic */ AFd1zSDK valueOf;
            private /* synthetic */ AFc1bSDK values;
            {
                this.values = aFc1bSDK;
                this.valueOf = aFd1zSDK;
            }

            public final void run() {
                Iterator iterator = this.values.values.iterator();
                while (iterator.hasNext()) {
                    ((AFc1cSDK)iterator.next()).values(this.valueOf);
                }
            }
        });
        if (!this.AFLogger.isEmpty()) {
            this.AFInAppEventParameterName.submit((Runnable)this);
        }
        try {
            AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(String.valueOf((Object)var4_3)));
            var5_6 = var4_3.afErrorLog();
            var3_1.cancel();
            this.AFKeystoreWrapper.execute(new Runnable(this, (AFd1zSDK)var4_3, var5_6){
                private /* synthetic */ AFd1ySDK AFInAppEventParameterName;
                private /* synthetic */ AFd1zSDK valueOf;
                private /* synthetic */ AFc1bSDK values;
                {
                    this.values = aFc1bSDK;
                    this.valueOf = aFd1zSDK;
                    this.AFInAppEventParameterName = aFd1ySDK;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Converted monitor instructions to comments
                 * Lifted jumps to return sites
                 */
                public final void run() {
                    NavigableSet navigableSet = new NavigableSet("QUEUE: execution finished for ");
                    navigableSet.append((Object)this.valueOf);
                    navigableSet.append(", result: ");
                    navigableSet.append((Object)this.AFInAppEventParameterName);
                    AFLogger.afDebugLog(navigableSet.toString());
                    this.values.afErrorLog.remove((Object)this.valueOf);
                    navigableSet = this.values.values.iterator();
                    while (navigableSet.hasNext()) {
                        ((AFc1cSDK)navigableSet.next()).AFInAppEventType(this.valueOf, this.AFInAppEventParameterName);
                    }
                    if (this.AFInAppEventParameterName == AFd1ySDK.AFInAppEventParameterName) {
                        this.values.AFInAppEventType.add((Object)this.valueOf.values);
                        AFc1bSDK.AFInAppEventParameterName(this.values);
                        return;
                    }
                    if (!this.valueOf.AFInAppEventParameterName()) {
                        this.values.AFInAppEventType.add((Object)this.valueOf.values);
                        AFc1bSDK.AFInAppEventParameterName(this.values);
                        return;
                    }
                    if (!AFc1bSDK.valueOf(this.valueOf)) return;
                    navigableSet = this.values.AFLogger;
                    // MONITORENTER : navigableSet
                    this.values.afDebugLog.add((Object)this.valueOf);
                    Iterator iterator = this.values.values.iterator();
                    do {
                        if (!iterator.hasNext()) {
                            // MONITOREXIT : navigableSet
                            return;
                        }
                        AFc1cSDK aFc1cSDK = (AFc1cSDK)iterator.next();
                    } while (true);
                }
            });
            return;
        }
        catch (InterruptedIOException | InterruptedException var3_2) {}
        ** finally { 
lbl27: // 1 sources:
        AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(String.valueOf((Object)var4_3)));
        var4_3.valueOf = var5_9 = AFd1ySDK.AFInAppEventType;
        var3_1 = this.AFKeystoreWrapper;
        var4_3 = new ;
        var3_1.execute((Runnable)var4_3);
    }

}


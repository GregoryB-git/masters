// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.io.InterruptedIOException;
import com.appsflyer.AFLogger;
import java.util.TimerTask;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.Timer;
import java.util.List;
import java.util.NavigableSet;
import java.util.concurrent.Executor;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class AFc1bSDK implements Runnable
{
    final ExecutorService AFInAppEventParameterName;
    final Set<AFd1vSDK> AFInAppEventType;
    public Executor AFKeystoreWrapper;
    final NavigableSet<AFd1zSDK<?>> AFLogger;
    final List<AFd1zSDK<?>> afDebugLog;
    final Set<AFd1zSDK<?>> afErrorLog;
    final NavigableSet<AFd1zSDK<?>> afInfoLog;
    private Timer afRDLog;
    final Set<AFd1vSDK> valueOf;
    public final List<AFc1cSDK> values;
    
    public AFc1bSDK(final ExecutorService afInAppEventParameterName) {
        this.AFKeystoreWrapper = Executors.newSingleThreadExecutor();
        this.afRDLog = new Timer(true);
        this.values = new CopyOnWriteArrayList<AFc1cSDK>();
        this.AFInAppEventType = new CopyOnWriteArraySet<AFd1vSDK>();
        this.valueOf = Collections.newSetFromMap(new ConcurrentHashMap<AFd1vSDK, Boolean>());
        this.AFLogger = new ConcurrentSkipListSet<AFd1zSDK<?>>();
        this.afInfoLog = new ConcurrentSkipListSet<AFd1zSDK<?>>();
        this.afDebugLog = new ArrayList<AFd1zSDK<?>>();
        this.afErrorLog = Collections.newSetFromMap(new ConcurrentHashMap<AFd1zSDK<?>, Boolean>());
        this.AFInAppEventParameterName = afInAppEventParameterName;
    }
    
    public static /* synthetic */ void AFInAppEventParameterName(final AFc1bSDK aFc1bSDK) {
        final NavigableSet<AFd1zSDK<?>> afLogger = aFc1bSDK.AFLogger;
        // monitorenter(afLogger)
        while (true) {
            try {
                final Iterator<AFd1zSDK<?>> iterator = aFc1bSDK.afInfoLog.iterator();
                boolean b = false;
                while (iterator.hasNext()) {
                    final AFd1zSDK<?> aFd1zSDK = iterator.next();
                    if (aFc1bSDK.values(aFd1zSDK)) {
                        iterator.remove();
                        aFc1bSDK.AFLogger.add(aFd1zSDK);
                        b = true;
                    }
                }
                if (b) {
                    aFc1bSDK.AFInAppEventParameterName.submit(aFc1bSDK);
                }
                // monitorexit(afLogger)
                return;
                // monitorexit(afLogger)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean valueOf(final AFd1zSDK<?> aFd1zSDK) {
        return !(aFd1zSDK instanceof AFd1jSDK) || aFd1zSDK.values != AFd1vSDK.AppsFlyer2dXConversionCallback;
    }
    
    private boolean values(final AFd1zSDK<?> aFd1zSDK) {
        return this.AFInAppEventType.containsAll(aFd1zSDK.AFInAppEventParameterName);
    }
    
    public final void AFInAppEventParameterName(final NavigableSet<AFd1zSDK<?>> set) {
        final AFd1zSDK<?> aFd1zSDK = set.pollFirst();
        this.AFInAppEventType.add(aFd1zSDK.values);
        final Iterator<AFc1cSDK> iterator = this.values.iterator();
        while (iterator.hasNext()) {
            iterator.next().AFInAppEventParameterName(aFd1zSDK);
        }
    }
    
    @Override
    public final void run() {
        Object task = this.AFLogger;
        // monitorenter(task)
        while (true) {
            try {
                Object o = this.AFLogger.pollFirst();
                if (o == null) {
                    // monitorexit(task)
                    return;
                }
                this.afErrorLog.add((AFd1zSDK<?>)o);
                // monitorexit(task)
                final long afInAppEventType = ((AFd1zSDK)o).AFInAppEventType();
                task = new AFd1uSDK(Thread.currentThread());
                if (afInAppEventType > 0L) {
                    this.afRDLog.schedule((TimerTask)task, afInAppEventType);
                }
                this.AFKeystoreWrapper.execute(new Runnable() {
                    private /* synthetic */ AFd1zSDK valueOf = (AFd1zSDK)o;
                    
                    @Override
                    public final void run() {
                        final Iterator<AFc1cSDK> iterator = AFc1bSDK.this.values.iterator();
                        while (iterator.hasNext()) {
                            iterator.next().values(this.valueOf);
                        }
                    }
                });
                if (!this.AFLogger.isEmpty()) {
                    this.AFInAppEventParameterName.submit(this);
                }
                AFd1ySDK afErrorLog;
                AFd1ySDK afInAppEventType2;
                AFd1ySDK valueOf;
                Label_0193_Outer:Label_0202_Outer:Label_0164_Outer:
                while (true) {
                    while (true) {
                        while (true) {
                            try {
                                com.appsflyer.AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(String.valueOf(o)));
                                afErrorLog = ((AFd1zSDK)o).afErrorLog();
                                ((TimerTask)task).cancel();
                                this.AFKeystoreWrapper.execute(new Runnable() {
                                    private /* synthetic */ AFd1ySDK AFInAppEventParameterName;
                                    private /* synthetic */ AFd1zSDK valueOf;
                                    
                                    @Override
                                    public final void run() {
                                        final StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                                        sb.append(this.valueOf);
                                        sb.append(", result: ");
                                        sb.append(this.AFInAppEventParameterName);
                                        com.appsflyer.AFLogger.afDebugLog(sb.toString());
                                        AFc1bSDK.this.afErrorLog.remove(this.valueOf);
                                        Object o = AFc1bSDK.this.values.iterator();
                                        while (((Iterator)o).hasNext()) {
                                            ((Iterator<AFc1cSDK>)o).next().AFInAppEventType(this.valueOf, this.AFInAppEventParameterName);
                                        }
                                        if (this.AFInAppEventParameterName == AFd1ySDK.AFInAppEventParameterName) {
                                            AFc1bSDK.this.AFInAppEventType.add(this.valueOf.values);
                                            AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                                            return;
                                        }
                                        // monitorenter(o)
                                        while (true) {
                                            Label_0233: {
                                                if (!this.valueOf.AFInAppEventParameterName()) {
                                                    break Label_0233;
                                                }
                                                if (!AFc1bSDK.valueOf(this.valueOf)) {
                                                    return;
                                                }
                                                o = AFc1bSDK.this.AFLogger;
                                                try {
                                                    AFc1bSDK.this.afDebugLog.add(this.valueOf);
                                                    for (AFc1cSDK aFc1cSDK : AFc1bSDK.this.values) {}
                                                    // monitorexit(o)
                                                    return;
                                                    AFc1bSDK.this.AFInAppEventType.add(this.valueOf.values);
                                                    AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                                                    return;
                                                }
                                                // monitorexit(o)
                                                finally {}
                                            }
                                            continue Label_0193_Outer;
                                        }
                                    }
                                });
                                return;
                                // monitorexit(task)
                                while (true) {
                                    ((Executor)task).execute((Runnable)o);
                                    return;
                                    com.appsflyer.AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(String.valueOf(o)));
                                    afInAppEventType2 = AFd1ySDK.AFInAppEventType;
                                    ((AFd1zSDK)o).valueOf = afInAppEventType2;
                                    task = this.AFKeystoreWrapper;
                                    o = new Runnable(afInAppEventType2) {
                                        private /* synthetic */ AFd1ySDK AFInAppEventParameterName;
                                        private /* synthetic */ AFd1zSDK valueOf;
                                        
                                        @Override
                                        public final void run() {
                                            final StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                                            sb.append(this.valueOf);
                                            sb.append(", result: ");
                                            sb.append(this.AFInAppEventParameterName);
                                            com.appsflyer.AFLogger.afDebugLog(sb.toString());
                                            AFc1bSDK.this.afErrorLog.remove(this.valueOf);
                                            Object o = AFc1bSDK.this.values.iterator();
                                            while (((Iterator)o).hasNext()) {
                                                ((Iterator<AFc1cSDK>)o).next().AFInAppEventType(this.valueOf, this.AFInAppEventParameterName);
                                            }
                                            if (this.AFInAppEventParameterName == AFd1ySDK.AFInAppEventParameterName) {
                                                AFc1bSDK.this.AFInAppEventType.add(this.valueOf.values);
                                                AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                                                return;
                                            }
                                            // monitorenter(o)
                                            while (true) {
                                                Label_0233: {
                                                    if (!this.valueOf.AFInAppEventParameterName()) {
                                                        break Label_0233;
                                                    }
                                                    if (!AFc1bSDK.valueOf(this.valueOf)) {
                                                        return;
                                                    }
                                                    o = AFc1bSDK.this.AFLogger;
                                                    try {
                                                        AFc1bSDK.this.afDebugLog.add(this.valueOf);
                                                        for (AFc1cSDK aFc1cSDK : AFc1bSDK.this.values) {}
                                                        // monitorexit(o)
                                                        return;
                                                        AFc1bSDK.this.AFInAppEventType.add(this.valueOf.values);
                                                        AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                                                        return;
                                                    }
                                                    // monitorexit(o)
                                                    finally {}
                                                }
                                                continue Label_0193_Outer;
                                            }
                                        }
                                    };
                                    continue Label_0202_Outer;
                                    ((TimerTask)task).cancel();
                                    valueOf = AFd1ySDK.valueOf;
                                    task = this.AFKeystoreWrapper;
                                    o = new Runnable(valueOf) {
                                        private /* synthetic */ AFd1ySDK AFInAppEventParameterName;
                                        private /* synthetic */ AFd1zSDK valueOf = (AFd1zSDK)o;
                                        
                                        @Override
                                        public final void run() {
                                            final StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                                            sb.append(this.valueOf);
                                            sb.append(", result: ");
                                            sb.append(afErrorLog);
                                            com.appsflyer.AFLogger.afDebugLog(sb.toString());
                                            AFc1bSDK.this.afErrorLog.remove(this.valueOf);
                                            Object o = AFc1bSDK.this.values.iterator();
                                            while (((Iterator)o).hasNext()) {
                                                ((Iterator<AFc1cSDK>)o).next().AFInAppEventType(this.valueOf, afErrorLog);
                                            }
                                            if (afErrorLog == AFd1ySDK.AFInAppEventParameterName) {
                                                AFc1bSDK.this.AFInAppEventType.add(this.valueOf.values);
                                                AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                                                return;
                                            }
                                            // monitorenter(o)
                                            while (true) {
                                                Label_0233: {
                                                    if (!this.valueOf.AFInAppEventParameterName()) {
                                                        break Label_0233;
                                                    }
                                                    if (!AFc1bSDK.valueOf(this.valueOf)) {
                                                        return;
                                                    }
                                                    o = AFc1bSDK.this.AFLogger;
                                                    try {
                                                        AFc1bSDK.this.afDebugLog.add(this.valueOf);
                                                        for (AFc1cSDK aFc1cSDK : AFc1bSDK.this.values) {}
                                                        // monitorexit(o)
                                                        return;
                                                        AFc1bSDK.this.AFInAppEventType.add(this.valueOf.values);
                                                        AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                                                        return;
                                                    }
                                                    // monitorexit(o)
                                                    finally {}
                                                }
                                                continue Label_0193_Outer;
                                            }
                                        }
                                    };
                                    continue Label_0202_Outer;
                                }
                            }
                            catch (InterruptedException ex) {}
                            catch (InterruptedIOException task) {
                                continue Label_0164_Outer;
                            }
                            break;
                        }
                        continue;
                    }
                }
            }
            finally {}
            final AFd1zSDK aFd1zSDK;
            Object o = aFd1zSDK;
            continue;
        }
    }
}

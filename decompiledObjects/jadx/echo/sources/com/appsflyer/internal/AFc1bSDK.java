package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class AFc1bSDK implements Runnable {
    final ExecutorService AFInAppEventParameterName;
    public Executor AFKeystoreWrapper = Executors.newSingleThreadExecutor();
    private Timer afRDLog = new Timer(true);
    public final List<AFc1cSDK> values = new CopyOnWriteArrayList();
    final Set<AFd1vSDK> AFInAppEventType = new CopyOnWriteArraySet();
    final Set<AFd1vSDK> valueOf = Collections.newSetFromMap(new ConcurrentHashMap());
    final NavigableSet<AFd1zSDK<?>> AFLogger = new ConcurrentSkipListSet();
    final NavigableSet<AFd1zSDK<?>> afInfoLog = new ConcurrentSkipListSet();
    final List<AFd1zSDK<?>> afDebugLog = new ArrayList();
    final Set<AFd1zSDK<?>> afErrorLog = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: com.appsflyer.internal.AFc1bSDK$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        private /* synthetic */ AFd1zSDK AFInAppEventType;

        public AnonymousClass4(AFd1zSDK aFd1zSDK) {
            this.AFInAppEventType = aFd1zSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean add;
            NavigableSet<AFd1zSDK<?>> navigableSet;
            synchronized (AFc1bSDK.this.AFLogger) {
                try {
                    if (AFc1bSDK.this.afErrorLog.contains(this.AFInAppEventType)) {
                        StringBuilder sb = new StringBuilder("QUEUE: tried to add already running task: ");
                        sb.append(this.AFInAppEventType);
                        AFLogger.afDebugLog(sb.toString());
                        return;
                    }
                    if (!AFc1bSDK.this.AFLogger.contains(this.AFInAppEventType) && !AFc1bSDK.this.afInfoLog.contains(this.AFInAppEventType)) {
                        AFc1bSDK aFc1bSDK = AFc1bSDK.this;
                        AFd1zSDK aFd1zSDK = this.AFInAppEventType;
                        for (AFd1vSDK aFd1vSDK : aFd1zSDK.AFKeystoreWrapper) {
                            if (aFc1bSDK.valueOf.contains(aFd1vSDK)) {
                                aFd1zSDK.AFInAppEventParameterName.add(aFd1vSDK);
                            }
                        }
                        if (AFc1bSDK.this.values(this.AFInAppEventType)) {
                            add = AFc1bSDK.this.AFLogger.add(this.AFInAppEventType);
                        } else {
                            add = AFc1bSDK.this.afInfoLog.add(this.AFInAppEventType);
                            if (add) {
                                StringBuilder sb2 = new StringBuilder("QUEUE: new task was blocked: ");
                                sb2.append(this.AFInAppEventType);
                                AFLogger.afDebugLog(sb2.toString());
                                this.AFInAppEventType.AFKeystoreWrapper();
                            }
                        }
                        if (add) {
                            AFc1bSDK aFc1bSDK2 = AFc1bSDK.this;
                            aFc1bSDK2.AFLogger.addAll(aFc1bSDK2.afDebugLog);
                            AFc1bSDK.this.afDebugLog.clear();
                        } else {
                            StringBuilder sb3 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            sb3.append(this.AFInAppEventType);
                            AFLogger.afDebugLog(sb3.toString());
                        }
                        if (!add) {
                            StringBuilder sb4 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb4.append(this.AFInAppEventType);
                            AFLogger.afWarnLog(sb4.toString());
                            return;
                        }
                        AFc1bSDK.this.valueOf.add(this.AFInAppEventType.values);
                        StringBuilder sb5 = new StringBuilder("QUEUE: new task added: ");
                        sb5.append(this.AFInAppEventType);
                        AFLogger.afDebugLog(sb5.toString());
                        for (AFc1cSDK aFc1cSDK : AFc1bSDK.this.values) {
                        }
                        AFc1bSDK aFc1bSDK3 = AFc1bSDK.this;
                        aFc1bSDK3.AFInAppEventParameterName.submit(aFc1bSDK3);
                        AFc1bSDK aFc1bSDK4 = AFc1bSDK.this;
                        synchronized (aFc1bSDK4.AFLogger) {
                            try {
                                for (int size = (aFc1bSDK4.AFLogger.size() + aFc1bSDK4.afInfoLog.size()) - 40; size > 0; size--) {
                                    boolean z7 = !aFc1bSDK4.afInfoLog.isEmpty();
                                    boolean z8 = !aFc1bSDK4.AFLogger.isEmpty();
                                    if (z8 && z7) {
                                        navigableSet = aFc1bSDK4.AFLogger.first().compareTo(aFc1bSDK4.afInfoLog.first()) > 0 ? aFc1bSDK4.AFLogger : aFc1bSDK4.afInfoLog;
                                    } else if (z8) {
                                        navigableSet = aFc1bSDK4.AFLogger;
                                    } else if (z7) {
                                        navigableSet = aFc1bSDK4.afInfoLog;
                                    }
                                    aFc1bSDK4.AFInAppEventParameterName(navigableSet);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder("QUEUE: tried to add already scheduled task: ");
                    sb6.append(this.AFInAppEventType);
                    AFLogger.afDebugLog(sb6.toString());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public AFc1bSDK(ExecutorService executorService) {
        this.AFInAppEventParameterName = executorService;
    }

    public static /* synthetic */ void AFInAppEventParameterName(AFc1bSDK aFc1bSDK) {
        synchronized (aFc1bSDK.AFLogger) {
            try {
                Iterator<AFd1zSDK<?>> it = aFc1bSDK.afInfoLog.iterator();
                boolean z7 = false;
                while (it.hasNext()) {
                    AFd1zSDK<?> next = it.next();
                    if (aFc1bSDK.values(next)) {
                        it.remove();
                        aFc1bSDK.AFLogger.add(next);
                        z7 = true;
                    }
                }
                if (z7) {
                    aFc1bSDK.AFInAppEventParameterName.submit(aFc1bSDK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean valueOf(AFd1zSDK<?> aFd1zSDK) {
        return ((aFd1zSDK instanceof AFd1jSDK) && aFd1zSDK.values == AFd1vSDK.ARS_VALIDATE) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Runnable runnable;
        synchronized (this.AFLogger) {
            try {
                final AFd1zSDK<?> pollFirst = this.AFLogger.pollFirst();
                if (pollFirst == null) {
                    return;
                }
                this.afErrorLog.add(pollFirst);
                long AFInAppEventType = pollFirst.AFInAppEventType();
                AFd1uSDK aFd1uSDK = new AFd1uSDK(Thread.currentThread());
                if (AFInAppEventType > 0) {
                    this.afRDLog.schedule(aFd1uSDK, AFInAppEventType);
                }
                this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1bSDK.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator<AFc1cSDK> it = AFc1bSDK.this.values.iterator();
                        while (it.hasNext()) {
                            it.next().values(pollFirst);
                        }
                    }
                });
                if (!this.AFLogger.isEmpty()) {
                    this.AFInAppEventParameterName.submit(this);
                }
                try {
                    AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(String.valueOf(pollFirst)));
                    final AFd1ySDK call = pollFirst.call();
                    aFd1uSDK.cancel();
                    this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.AFc1bSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(call);
                            AFLogger.afDebugLog(sb.toString());
                            AFc1bSDK.this.afErrorLog.remove(pollFirst);
                            Iterator<AFc1cSDK> it = AFc1bSDK.this.values.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(pollFirst, call);
                            }
                            if (call == AFd1ySDK.SUCCESS) {
                                AFc1bSDK.this.AFInAppEventType.add(pollFirst.values);
                                AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                                return;
                            }
                            if (!pollFirst.AFInAppEventParameterName()) {
                                AFc1bSDK.this.AFInAppEventType.add(pollFirst.values);
                                AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                            } else if (AFc1bSDK.valueOf(pollFirst)) {
                                synchronized (AFc1bSDK.this.AFLogger) {
                                    try {
                                        AFc1bSDK.this.afDebugLog.add(pollFirst);
                                        for (AFc1cSDK aFc1cSDK : AFc1bSDK.this.values) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(String.valueOf(pollFirst)));
                    final AFd1ySDK aFd1ySDK = AFd1ySDK.TIMEOUT;
                    pollFirst.valueOf = aFd1ySDK;
                    executor = this.AFKeystoreWrapper;
                    runnable = new Runnable() { // from class: com.appsflyer.internal.AFc1bSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFd1ySDK);
                            AFLogger.afDebugLog(sb.toString());
                            AFc1bSDK.this.afErrorLog.remove(pollFirst);
                            Iterator<AFc1cSDK> it = AFc1bSDK.this.values.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(pollFirst, aFd1ySDK);
                            }
                            if (aFd1ySDK == AFd1ySDK.SUCCESS) {
                                AFc1bSDK.this.AFInAppEventType.add(pollFirst.values);
                                AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                                return;
                            }
                            if (!pollFirst.AFInAppEventParameterName()) {
                                AFc1bSDK.this.AFInAppEventType.add(pollFirst.values);
                                AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                            } else if (AFc1bSDK.valueOf(pollFirst)) {
                                synchronized (AFc1bSDK.this.AFLogger) {
                                    try {
                                        AFc1bSDK.this.afDebugLog.add(pollFirst);
                                        for (AFc1cSDK aFc1cSDK : AFc1bSDK.this.values) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    };
                    executor.execute(runnable);
                } catch (Throwable unused2) {
                    aFd1uSDK.cancel();
                    final AFd1ySDK aFd1ySDK2 = AFd1ySDK.FAILURE;
                    executor = this.AFKeystoreWrapper;
                    runnable = new Runnable() { // from class: com.appsflyer.internal.AFc1bSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("QUEUE: execution finished for ");
                            sb.append(pollFirst);
                            sb.append(", result: ");
                            sb.append(aFd1ySDK2);
                            AFLogger.afDebugLog(sb.toString());
                            AFc1bSDK.this.afErrorLog.remove(pollFirst);
                            Iterator<AFc1cSDK> it = AFc1bSDK.this.values.iterator();
                            while (it.hasNext()) {
                                it.next().AFInAppEventType(pollFirst, aFd1ySDK2);
                            }
                            if (aFd1ySDK2 == AFd1ySDK.SUCCESS) {
                                AFc1bSDK.this.AFInAppEventType.add(pollFirst.values);
                                AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                                return;
                            }
                            if (!pollFirst.AFInAppEventParameterName()) {
                                AFc1bSDK.this.AFInAppEventType.add(pollFirst.values);
                                AFc1bSDK.AFInAppEventParameterName(AFc1bSDK.this);
                            } else if (AFc1bSDK.valueOf(pollFirst)) {
                                synchronized (AFc1bSDK.this.AFLogger) {
                                    try {
                                        AFc1bSDK.this.afDebugLog.add(pollFirst);
                                        for (AFc1cSDK aFc1cSDK : AFc1bSDK.this.values) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    };
                    executor.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean values(AFd1zSDK<?> aFd1zSDK) {
        return this.AFInAppEventType.containsAll(aFd1zSDK.AFInAppEventParameterName);
    }

    public final void AFInAppEventParameterName(NavigableSet<AFd1zSDK<?>> navigableSet) {
        AFd1zSDK<?> pollFirst = navigableSet.pollFirst();
        this.AFInAppEventType.add(pollFirst.values);
        Iterator<AFc1cSDK> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().AFInAppEventParameterName(pollFirst);
        }
    }
}

/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.URLEncoder
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1ySDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1cSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFd1bSDK;
import com.appsflyer.internal.AFd1cSDK;
import com.appsflyer.internal.AFd1dSDK;
import com.appsflyer.internal.AFd1gSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFe1zSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class AFb1wSDK
implements AFc1cSDK {
    private final AFd1cSDK AFInAppEventParameterName;
    public final AFb1ySDK AFInAppEventType;
    private final AFb1gSDK AFKeystoreWrapper;
    private final AFc1oSDK AFLogger;
    private final AFe1zSDK afDebugLog;
    private AFd1dSDK afErrorLog;
    private final AFc1bSDK afInfoLog;
    private AFf1zSDK afRDLog;
    private final AFe1wSDK valueOf;
    private final Object values;

    public AFb1wSDK() {
    }

    public AFb1wSDK(AFd1cSDK aFd1cSDK, AFb1gSDK aFb1gSDK, AFe1wSDK aFe1wSDK, AFb1ySDK aFb1ySDK, AFc1oSDK aFc1oSDK, AFe1zSDK aFe1zSDK, AFc1bSDK aFc1bSDK) {
        this.values = new Object();
        this.AFInAppEventParameterName = aFd1cSDK;
        this.AFKeystoreWrapper = aFb1gSDK;
        this.valueOf = aFe1wSDK;
        this.AFInAppEventType = aFb1ySDK;
        this.AFLogger = aFc1oSDK;
        this.afDebugLog = aFe1zSDK;
        this.afInfoLog = aFc1bSDK;
        aFc1bSDK.values.add((Object)this);
    }

    public static Map<String, String> AFKeystoreWrapper(Map<String, String> iterator) {
        HashMap hashMap = new HashMap();
        iterator = iterator.entrySet().iterator();
        while (iterator.hasNext()) {
            Object object = (Map.Entry)iterator.next();
            String string2 = (String)object.getKey();
            object = (String)object.getValue();
            try {
                hashMap.put((Object)URLEncoder.encode((String)string2, (String)"utf-8"), (Object)URLEncoder.encode((String)object, (String)"utf-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", (Throwable)unsupportedEncodingException);
            }
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void AFKeystoreWrapper(AFd1dSDK aFd1dSDK, AFd1bSDK aFd1bSDK) {
        void var2_2;
        Object object = this.values;
        // MONITORENTER : object
        this.afErrorLog = aFd1dSDK;
        // MONITOREXIT : object
        if (var2_2 == null) return;
        var2_2.onRemoteConfigUpdateFinished(aFd1dSDK);
    }

    public final void AFInAppEventParameterName(AFd1bSDK object) {
        object = new AFd1gSDK(this.AFInAppEventParameterName, this.AFKeystoreWrapper, this.valueOf, this.AFInAppEventType, this.AFLogger, this.afDebugLog, "v1", (AFd1bSDK)object);
        AFc1bSDK aFc1bSDK = this.afInfoLog;
        aFc1bSDK.AFKeystoreWrapper.execute(new Runnable(aFc1bSDK, (AFd1zSDK)object){
            private /* synthetic */ AFd1zSDK AFInAppEventType;
            private /* synthetic */ AFc1bSDK AFKeystoreWrapper;
            {
                this.AFKeystoreWrapper = aFc1bSDK;
                this.AFInAppEventType = aFd1zSDK;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public final void run() {
                java.util.NavigableSet navigableSet;
                int n8;
                Object object;
                block20 : {
                    block21 : {
                        boolean bl;
                        navigableSet = this.AFKeystoreWrapper.AFLogger;
                        // MONITORENTER : navigableSet
                        if (this.AFKeystoreWrapper.afErrorLog.contains((Object)this.AFInAppEventType)) {
                            java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder("QUEUE: tried to add already running task: ");
                            stringBuilder.append((Object)this.AFInAppEventType);
                            AFLogger.afDebugLog(stringBuilder.toString());
                            // MONITOREXIT : navigableSet
                            return;
                        }
                        if (this.AFKeystoreWrapper.AFLogger.contains((Object)this.AFInAppEventType) || this.AFKeystoreWrapper.afInfoLog.contains((Object)this.AFInAppEventType)) break block20;
                        java.util.NavigableSet navigableSet22 = this.AFKeystoreWrapper;
                        object = this.AFInAppEventType;
                        for (com.appsflyer.internal.AFd1vSDK aFd1vSDK : object.AFKeystoreWrapper) {
                            if (!navigableSet22.valueOf.contains((Object)aFd1vSDK)) continue;
                            object.AFInAppEventParameterName.add((Object)aFd1vSDK);
                        }
                        if (this.AFKeystoreWrapper.values(this.AFInAppEventType)) {
                            bl = this.AFKeystoreWrapper.AFLogger.add((Object)this.AFInAppEventType);
                        } else {
                            boolean bl2;
                            bl = bl2 = this.AFKeystoreWrapper.afInfoLog.add((Object)this.AFInAppEventType);
                            if (bl2) {
                                navigableSet22 = new java.lang.StringBuilder("QUEUE: new task was blocked: ");
                                navigableSet22.append((Object)this.AFInAppEventType);
                                AFLogger.afDebugLog(navigableSet22.toString());
                                this.AFInAppEventType.AFKeystoreWrapper();
                                bl = bl2;
                            }
                        }
                        if (bl) {
                            navigableSet22 = this.AFKeystoreWrapper;
                            navigableSet22.AFLogger.addAll(navigableSet22.afDebugLog);
                            this.AFKeystoreWrapper.afDebugLog.clear();
                        } else {
                            navigableSet22 = new java.lang.StringBuilder("QUEUE: task not added, it's already in the queue: ");
                            navigableSet22.append((Object)this.AFInAppEventType);
                            AFLogger.afDebugLog(navigableSet22.toString());
                        }
                        // MONITOREXIT : navigableSet
                        if (!bl) break block21;
                        this.AFKeystoreWrapper.valueOf.add((Object)this.AFInAppEventType.values);
                        navigableSet = new java.lang.StringBuilder("QUEUE: new task added: ");
                        navigableSet.append((Object)this.AFInAppEventType);
                        AFLogger.afDebugLog(navigableSet.toString());
                        for (java.util.NavigableSet navigableSet22 : this.AFKeystoreWrapper.values) {
                        }
                        navigableSet = this.AFKeystoreWrapper;
                        navigableSet.AFInAppEventParameterName.submit((Runnable)navigableSet);
                        object = this.AFKeystoreWrapper;
                        navigableSet22 = object.AFLogger;
                        // MONITORENTER : navigableSet22
                        n8 = object.AFLogger.size() + object.afInfoLog.size() - 40;
                    }
                    navigableSet = new java.lang.StringBuilder("QUEUE: tried to add already pending task: ");
                    navigableSet.append((Object)this.AFInAppEventType);
                    AFLogger.afWarnLog(navigableSet.toString());
                    return;
                }
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder("QUEUE: tried to add already scheduled task: ");
                stringBuilder.append((Object)this.AFInAppEventType);
                AFLogger.afDebugLog(stringBuilder.toString());
                // MONITOREXIT : navigableSet
                return;
                do {
                    block25 : {
                        block23 : {
                            boolean bl;
                            block24 : {
                                boolean bl3;
                                block22 : {
                                    if (n8 <= 0) {
                                        // MONITOREXIT : navigableSet22
                                        return;
                                    }
                                    bl = object.afInfoLog.isEmpty() ^ true;
                                    bl3 = object.AFLogger.isEmpty() ^ true;
                                    if (!bl3 || !bl) break block22;
                                    navigableSet = ((AFd1zSDK)object.AFLogger.first()).AFKeystoreWrapper((AFd1zSDK)object.afInfoLog.first()) > 0 ? object.AFLogger : object.afInfoLog;
                                    break block23;
                                }
                                if (!bl3) break block24;
                                navigableSet = object.AFLogger;
                                break block23;
                            }
                            if (!bl) break block25;
                            navigableSet = object.afInfoLog;
                        }
                        object.AFInAppEventParameterName(navigableSet);
                    }
                    --n8;
                } while (true);
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void AFInAppEventParameterName(AFd1zSDK<?> object) {
        if (object instanceof AFd1gSDK) {
            AFd1gSDK aFd1gSDK = (AFd1gSDK)object;
            object = this.values;
            synchronized (object) {
                this.afRDLog = null;
            }
            this.AFKeystoreWrapper(AFd1dSDK.AFInAppEventParameterName, aFd1gSDK.afInfoLog);
            return;
        }
    }

    @Override
    public final void AFInAppEventType(AFd1zSDK<?> object, AFd1ySDK object2) {
        if (object instanceof AFd1gSDK) {
            AFd1gSDK aFd1gSDK = (AFd1gSDK)object;
            object = object2 = aFd1gSDK.AFLogger;
            if (object2 == null) {
                AFLogger.afWarnLog("CFG: update RC returned null result, something went wrong!");
                object = AFd1dSDK.AFInAppEventParameterName;
            }
            if (object != AFd1dSDK.AFKeystoreWrapper) {
                AFf1zSDK aFf1zSDK = aFd1gSDK.afRDLog;
                object2 = this.values;
                synchronized (object2) {
                    this.afRDLog = aFf1zSDK;
                }
            }
            this.AFKeystoreWrapper((AFd1dSDK)((Object)object), aFd1gSDK.afInfoLog);
        }
    }

    public final AFf1zSDK AFKeystoreWrapper() {
        Object object = this.values;
        synchronized (object) {
            AFf1zSDK aFf1zSDK = this.afRDLog;
            this.afRDLog = null;
            return aFf1zSDK;
        }
    }

    @Override
    public final void values(AFd1zSDK<?> aFd1zSDK) {
    }
}


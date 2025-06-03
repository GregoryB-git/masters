/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1bSDK;
import com.appsflyer.internal.AFa1rSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1jSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1fSDK;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class AFd1lSDK
extends AFd1zSDK<Boolean> {
    private static volatile boolean afInfoLog = false;
    private Boolean AFLogger;
    private final AFc1xSDK afDebugLog;
    private final AFc1bSDK afErrorLog;
    private final AFa1bSDK afRDLog;

    public AFd1lSDK(@NonNull AFc1xSDK aFc1xSDK) {
        super(AFd1vSDK.AFInAppEventType, new AFd1vSDK[0], "LoadCachedRequests");
        this.afRDLog = aFc1xSDK.onAppOpenAttributionNative();
        this.afErrorLog = aFc1xSDK.AFVersionDeclaration();
        this.afDebugLog = aFc1xSDK;
    }

    public static boolean afInfoLog() {
        return afInfoLog;
    }

    private static String valueOf(AFa1rSDK object) {
        long l8 = System.currentTimeMillis();
        long l9 = Long.parseLong((String)object.AFInAppEventParameterName, (int)10);
        object = object.valueOf;
        try {
            String string2 = Uri.parse((String)object).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((long)((l8 - l9) / 1000L))).toString();
            return string2;
        }
        catch (Exception exception) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", (Throwable)exception);
            return object;
        }
    }

    @Override
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override
    public final long AFInAppEventType() {
        return 30000L;
    }

    @NonNull
    @Override
    public final AFd1ySDK valueOf() {
        Iterator iterator = this.afRDLog.values().iterator();
        while (iterator.hasNext()) {
            Object object = (AFa1rSDK)iterator.next();
            Object object2 = new StringBuilder("CACHE: resending request: ");
            object2.append(object.valueOf);
            AFLogger.afInfoLog(object2.toString());
            try {
                object2 = new AFe1fSDK(AFd1lSDK.valueOf((AFa1rSDK)object), object.AFInAppEventType(), object.AFInAppEventParameterName, object.AFInAppEventType);
                object = this.afErrorLog;
                object2 = new AFd1jSDK((AFe1fSDK)object2, this.afDebugLog);
                object.AFKeystoreWrapper.execute(new Runnable((AFc1bSDK)object, (AFd1zSDK)object2){
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
                                    StringBuilder stringBuilder = new StringBuilder("QUEUE: tried to add already running task: ");
                                    stringBuilder.append((Object)this.AFInAppEventType);
                                    AFLogger.afDebugLog(stringBuilder.toString());
                                    // MONITOREXIT : navigableSet
                                    return;
                                }
                                if (this.AFKeystoreWrapper.AFLogger.contains((Object)this.AFInAppEventType) || this.AFKeystoreWrapper.afInfoLog.contains((Object)this.AFInAppEventType)) break block20;
                                java.util.NavigableSet navigableSet22 = this.AFKeystoreWrapper;
                                object = this.AFInAppEventType;
                                for (AFd1vSDK aFd1vSDK : object.AFKeystoreWrapper) {
                                    if (!navigableSet22.valueOf.contains((Object)aFd1vSDK)) continue;
                                    object.AFInAppEventParameterName.add((Object)aFd1vSDK);
                                }
                                if (this.AFKeystoreWrapper.values(this.AFInAppEventType)) {
                                    bl = this.AFKeystoreWrapper.AFLogger.add((Object)this.AFInAppEventType);
                                } else {
                                    boolean bl2;
                                    bl = bl2 = this.AFKeystoreWrapper.afInfoLog.add((Object)this.AFInAppEventType);
                                    if (bl2) {
                                        navigableSet22 = new StringBuilder("QUEUE: new task was blocked: ");
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
                                    navigableSet22 = new StringBuilder("QUEUE: task not added, it's already in the queue: ");
                                    navigableSet22.append((Object)this.AFInAppEventType);
                                    AFLogger.afDebugLog(navigableSet22.toString());
                                }
                                // MONITOREXIT : navigableSet
                                if (!bl) break block21;
                                this.AFKeystoreWrapper.valueOf.add((Object)this.AFInAppEventType.values);
                                navigableSet = new StringBuilder("QUEUE: new task added: ");
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
                            navigableSet = new StringBuilder("QUEUE: tried to add already pending task: ");
                            navigableSet.append((Object)this.AFInAppEventType);
                            AFLogger.afWarnLog(navigableSet.toString());
                            return;
                        }
                        StringBuilder stringBuilder = new StringBuilder("QUEUE: tried to add already scheduled task: ");
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
            catch (Exception exception) {
                AFLogger.afErrorLog("QUEUE: Failed to resend cached request", (Throwable)exception);
            }
        }
        this.AFLogger = Boolean.TRUE;
        afInfoLog = true;
        return AFd1ySDK.AFInAppEventParameterName;
    }
}


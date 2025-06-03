/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.TrafficStats
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.concurrent.Callable
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AFd1zSDK<Result>
implements Comparable<AFd1zSDK<?>>,
Callable<AFd1ySDK> {
    private static final AtomicInteger afRDLog = new AtomicInteger();
    @NonNull
    public final Set<AFd1vSDK> AFInAppEventParameterName;
    public volatile int AFInAppEventType;
    @NonNull
    public final Set<AFd1vSDK> AFKeystoreWrapper;
    private long AFLogger;
    private boolean AFLogger$LogLevel;
    private final int afDebugLog;
    private Throwable afErrorLog;
    private final String afInfoLog;
    public AFd1ySDK valueOf;
    @NonNull
    public final AFd1vSDK values;

    public AFd1zSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] arraFd1vSDK, String string2) {
        HashSet hashSet;
        int n8;
        this.AFInAppEventParameterName = hashSet = new HashSet();
        this.AFKeystoreWrapper = new HashSet();
        this.afDebugLog = n8 = afRDLog.incrementAndGet();
        this.AFLogger$LogLevel = false;
        this.AFInAppEventType = 0;
        this.values = aFd1vSDK;
        Collections.addAll((Collection)hashSet, (Object[])arraFd1vSDK);
        if (string2 != null) {
            this.afInfoLog = string2;
            return;
        }
        this.afInfoLog = String.valueOf((int)n8);
    }

    public void AFInAppEventParameterName(Throwable throwable) {
    }

    public abstract boolean AFInAppEventParameterName();

    public abstract long AFInAppEventType();

    public final int AFKeystoreWrapper(AFd1zSDK<?> aFd1zSDK) {
        int n8;
        int n9 = n8 = this.values.onDeepLinkingNative - aFd1zSDK.values.onDeepLinkingNative;
        if (n8 == 0) {
            if (this.afInfoLog.equals((Object)aFd1zSDK.afInfoLog)) {
                return 0;
            }
            n9 = this.afDebugLog - aFd1zSDK.afDebugLog;
        }
        return n9;
    }

    public void AFKeystoreWrapper() {
        this.AFLogger$LogLevel = true;
    }

    public final boolean AFLogger() {
        return this.AFLogger$LogLevel;
    }

    public final Throwable afDebugLog() {
        return this.afErrorLog;
    }

    public final AFd1ySDK afErrorLog() {
        AFd1ySDK aFd1ySDK;
        TrafficStats.setThreadStatsTag((int)"AppsFlyer".hashCode());
        this.valueOf = null;
        this.afErrorLog = null;
        long l8 = System.currentTimeMillis();
        ++this.AFInAppEventType;
        try {
            this.valueOf = aFd1ySDK = this.valueOf();
        }
        catch (Throwable throwable) {
            try {
                this.afErrorLog = throwable;
                this.valueOf = AFd1ySDK.valueOf;
                this.AFInAppEventParameterName(throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                this.AFLogger = System.currentTimeMillis() - l8;
                this.values();
                throw throwable2;
            }
        }
        this.AFLogger = System.currentTimeMillis() - l8;
        this.values();
        return aFd1ySDK;
    }

    public /* synthetic */ Object call() {
        return this.afErrorLog();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.AFKeystoreWrapper((AFd1zSDK)object);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            object = (AFd1zSDK)object;
            if (this.values != object.values) {
                return false;
            }
            return this.afInfoLog.equals((Object)object.afInfoLog);
        }
        return false;
    }

    public final int hashCode() {
        return this.values.hashCode() * 31 + this.afInfoLog.hashCode();
    }

    public String toString() {
        Object object = new StringBuilder();
        object.append((Object)((Object)this.values));
        object.append("-");
        object.append(this.afInfoLog);
        String string2 = object.toString();
        object = string2;
        if (!String.valueOf((int)this.afDebugLog).equals((Object)this.afInfoLog)) {
            object = new StringBuilder();
            object.append(string2);
            object.append("-");
            object.append(this.afDebugLog);
            object = object.toString();
        }
        return object;
    }

    @NonNull
    public abstract AFd1ySDK valueOf();

    public void values() {
    }
}


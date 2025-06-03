// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import androidx.annotation.NonNull;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Callable;

public abstract class AFd1zSDK<Result> implements Comparable<AFd1zSDK<?>>, Callable<AFd1ySDK>
{
    private static final AtomicInteger afRDLog;
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
    
    static {
        afRDLog = new AtomicInteger();
    }
    
    public AFd1zSDK(@NonNull final AFd1vSDK values, @NonNull final AFd1vSDK[] elements, final String afInfoLog) {
        final HashSet<Object> set = new HashSet<Object>();
        this.AFInAppEventParameterName = (Set<AFd1vSDK>)set;
        this.AFKeystoreWrapper = new HashSet<AFd1vSDK>();
        final int incrementAndGet = AFd1zSDK.afRDLog.incrementAndGet();
        this.afDebugLog = incrementAndGet;
        this.AFLogger$LogLevel = false;
        this.AFInAppEventType = 0;
        this.values = values;
        Collections.addAll(set, elements);
        if (afInfoLog != null) {
            this.afInfoLog = afInfoLog;
            return;
        }
        this.afInfoLog = String.valueOf(incrementAndGet);
    }
    
    public void AFInAppEventParameterName(final Throwable t) {
    }
    
    public abstract boolean AFInAppEventParameterName();
    
    public abstract long AFInAppEventType();
    
    public final int AFKeystoreWrapper(final AFd1zSDK<?> aFd1zSDK) {
        int n;
        if ((n = this.values.onDeepLinkingNative - aFd1zSDK.values.onDeepLinkingNative) == 0) {
            if (this.afInfoLog.equals(aFd1zSDK.afInfoLog)) {
                return 0;
            }
            n = this.afDebugLog - aFd1zSDK.afDebugLog;
        }
        return n;
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
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.valueOf = null;
        this.afErrorLog = null;
        final long currentTimeMillis = System.currentTimeMillis();
        ++this.AFInAppEventType;
        try {
            final AFd1ySDK value = this.valueOf();
            this.valueOf = value;
            this.AFLogger = System.currentTimeMillis() - currentTimeMillis;
            this.values();
            return value;
        }
        finally {
            try {
                final Throwable afErrorLog;
                this.afErrorLog = afErrorLog;
                this.valueOf = AFd1ySDK.valueOf;
                this.AFInAppEventParameterName(afErrorLog);
            }
            finally {
                this.AFLogger = System.currentTimeMillis() - currentTimeMillis;
                this.values();
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final AFd1zSDK aFd1zSDK = (AFd1zSDK)o;
        return this.values == aFd1zSDK.values && this.afInfoLog.equals(aFd1zSDK.afInfoLog);
    }
    
    @Override
    public final int hashCode() {
        return this.values.hashCode() * 31 + this.afInfoLog.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.values);
        sb.append("-");
        sb.append(this.afInfoLog);
        String str = sb.toString();
        if (!String.valueOf(this.afDebugLog).equals(this.afInfoLog)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("-");
            sb2.append(this.afDebugLog);
            str = sb2.toString();
        }
        return str;
    }
    
    @NonNull
    public abstract AFd1ySDK valueOf();
    
    public void values() {
    }
}

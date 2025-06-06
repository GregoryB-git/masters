package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class AFd1zSDK<Result> implements Comparable<AFd1zSDK<?>>, Callable<AFd1ySDK> {
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

    public AFd1zSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventParameterName = hashSet;
        this.AFKeystoreWrapper = new HashSet();
        int incrementAndGet = afRDLog.incrementAndGet();
        this.afDebugLog = incrementAndGet;
        this.AFLogger$LogLevel = false;
        this.AFInAppEventType = 0;
        this.values = aFd1vSDK;
        Collections.addAll(hashSet, aFd1vSDKArr);
        if (str != null) {
            this.afInfoLog = str;
        } else {
            this.afInfoLog = String.valueOf(incrementAndGet);
        }
    }

    public void AFInAppEventParameterName(Throwable th) {
    }

    public abstract boolean AFInAppEventParameterName();

    public abstract long AFInAppEventType();

    @Override // java.lang.Comparable
    /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFd1zSDK<?> aFd1zSDK) {
        int i7 = this.values.onDeepLinkingNative - aFd1zSDK.values.onDeepLinkingNative;
        if (i7 != 0) {
            return i7;
        }
        if (this.afInfoLog.equals(aFd1zSDK.afInfoLog)) {
            return 0;
        }
        return this.afDebugLog - aFd1zSDK.afDebugLog;
    }

    public final boolean AFLogger() {
        return this.AFLogger$LogLevel;
    }

    public final Throwable afDebugLog() {
        return this.afErrorLog;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: afErrorLog, reason: merged with bridge method [inline-methods] */
    public final AFd1ySDK call() {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.valueOf = null;
        this.afErrorLog = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFInAppEventType++;
        try {
            AFd1ySDK valueOf = valueOf();
            this.valueOf = valueOf;
            return valueOf;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1zSDK aFd1zSDK = (AFd1zSDK) obj;
        if (this.values != aFd1zSDK.values) {
            return false;
        }
        return this.afInfoLog.equals(aFd1zSDK.afInfoLog);
    }

    public final int hashCode() {
        return (this.values.hashCode() * 31) + this.afInfoLog.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.values);
        sb.append("-");
        sb.append(this.afInfoLog);
        String obj = sb.toString();
        if (String.valueOf(this.afDebugLog).equals(this.afInfoLog)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("-");
        sb2.append(this.afDebugLog);
        return sb2.toString();
    }

    @NonNull
    public abstract AFd1ySDK valueOf();

    public void values() {
    }

    public void AFKeystoreWrapper() {
        this.AFLogger$LogLevel = true;
    }
}

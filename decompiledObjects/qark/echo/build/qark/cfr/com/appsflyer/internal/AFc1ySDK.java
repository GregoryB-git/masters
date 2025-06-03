/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.RejectedExecutionHandler
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.AFa1bSDK;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFa1hSDK;
import com.appsflyer.internal.AFa1iSDK;
import com.appsflyer.internal.AFa1jSDK;
import com.appsflyer.internal.AFa1kSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1eSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1kSDK;
import com.appsflyer.internal.AFb1nSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFb1xSDK;
import com.appsflyer.internal.AFb1ySDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFc1lSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1sSDK;
import com.appsflyer.internal.AFc1wSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1cSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1vSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFe1xSDK;
import com.appsflyer.internal.AFe1zSDK;
import com.appsflyer.internal.AFf1hSDK;
import com.appsflyer.internal.AFf1iSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1sSDK;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFf1vSDK;
import com.appsflyer.internal.AFf1ySDK;
import com.appsflyer.internal.s;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class AFc1ySDK
implements AFc1xSDK {
    private static final int AFKeystoreWrapper = (int)TimeUnit.SECONDS.toMillis(30L);
    private ExecutorService AFInAppEventParameterName;
    private ExecutorService AFInAppEventType;
    private AFc1nSDK AFLogger;
    private AFb1tSDK AFLogger$LogLevel;
    private AFe1vSDK AFVersionDeclaration;
    private AFe1wSDK AppsFlyer2dXConversionCallback;
    private AFb1wSDK afDebugLog;
    private AFb1gSDK afErrorLog;
    private AFc1bSDK afErrorLogForExcManagerOnly;
    private AFe1mSDK afInfoLog;
    private PurchaseHandler afRDLog;
    private AFf1iSDK afWarnLog;
    private AFf1oSDK getLevel;
    private AFc1dSDK init;
    private AFb1vSDK onAppOpenAttribution;
    private AFa1bSDK onAppOpenAttributionNative;
    private AFb1iSDK onAttributionFailureNative;
    private AFa1iSDK onConversionDataSuccess;
    private AFa1kSDK onDeepLinkingNative;
    private AFc1sSDK onInstallConversionDataLoadedNative;
    private AFf1tSDK onInstallConversionFailureNative;
    private AFf1vSDK onResponse;
    private AFb1eSDK onResponseErrorNative;
    private AFb1sSDK onResponseNative;
    public final AFb1bSDK valueOf = new AFb1bSDK();
    private ScheduledExecutorService values;

    private static /* synthetic */ void AFInAppEventParameterName(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put((Object)runnable);
            return;
        }
        catch (InterruptedException interruptedException) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", (Throwable)interruptedException);
            Thread.currentThread().interrupt();
            return;
        }
    }

    public static /* synthetic */ void a(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AFc1ySDK.AFInAppEventParameterName(runnable, threadPoolExecutor);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    private ExecutorService onAppOpenAttribution() {
        synchronized (this) {
            try {
                if (this.AFInAppEventParameterName != null) return this.AFInAppEventParameterName;
                this.AFInAppEventParameterName = Executors.newSingleThreadExecutor();
                return this.AFInAppEventParameterName;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    private AFc1nSDK onAttributionFailureNative() {
        synchronized (this) {
            try {
                if (this.AFLogger != null) return this.AFLogger;
                this.AFLogger = new AFc1nSDK(new AFc1lSDK(AFKeystoreWrapper), this.AFInAppEventType());
                return this.AFLogger;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    private AFc1sSDK onDeepLinking() {
        synchronized (this) {
            try {
                if (this.onInstallConversionDataLoadedNative != null) return this.onInstallConversionDataLoadedNative;
                this.onInstallConversionDataLoadedNative = new AFc1sSDK(this);
                return this.onInstallConversionDataLoadedNative;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFb1gSDK AFInAppEventParameterName() {
        synchronized (this) {
            try {
                if (this.afErrorLog != null) return this.afErrorLog;
                AFb1bSDK aFb1bSDK = this.init();
                Context context = this.valueOf.AFInAppEventType;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.afErrorLog = new AFb1gSDK(aFb1bSDK, new AFb1cSDK(AFa1eSDK.valueOf(context)));
                return this.afErrorLog;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final ExecutorService AFInAppEventType() {
        synchronized (this) {
            try {
                if (this.AFInAppEventType != null) return this.AFInAppEventType;
                this.AFInAppEventType = Executors.newCachedThreadPool();
                return this.AFInAppEventType;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @NonNull
    @Override
    public final AFc1oSDK AFKeystoreWrapper() {
        return new AFc1oSDK(this.onAttributionFailureNative(), this.AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), this.onInstallConversionFailureNative());
    }

    @NonNull
    @Override
    public final AFe1vSDK AFLogger() {
        if (this.AFVersionDeclaration == null) {
            Context context = this.valueOf.AFInAppEventType;
            if (context != null) {
                AFf1iSDK aFf1iSDK;
                if (this.onInstallConversionFailureNative == null) {
                    this.onInstallConversionFailureNative = new AFf1sSDK();
                }
                AFf1tSDK aFf1tSDK = this.onInstallConversionFailureNative;
                if (this.onResponseErrorNative == null) {
                    this.onResponseErrorNative = new com.appsflyer.internal.AFa1wSDK();
                }
                AFb1eSDK aFb1eSDK = this.onResponseErrorNative;
                if (this.afWarnLog == null) {
                    aFf1iSDK = this.valueOf.AFInAppEventType;
                    if (aFf1iSDK != null) {
                        this.afWarnLog = new AFf1hSDK((Context)aFf1iSDK);
                    } else {
                        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                    }
                }
                aFf1iSDK = this.afWarnLog;
                if (this.onConversionDataSuccess == null) {
                    this.onConversionDataSuccess = new AFa1jSDK();
                }
                AFa1iSDK aFa1iSDK = this.onConversionDataSuccess;
                AFe1mSDK aFe1mSDK = this.afDebugLog();
                AFb1dSDK aFb1dSDK = this.values();
                AFb1gSDK aFb1gSDK = this.AFInAppEventParameterName();
                if (this.onDeepLinkingNative == null) {
                    this.onDeepLinkingNative = new AFa1kSDK();
                }
                this.AFVersionDeclaration = new AFb1nSDK(context, aFf1tSDK, aFb1eSDK, aFf1iSDK, aFa1iSDK, aFe1mSDK, aFb1dSDK, aFb1gSDK, this.onDeepLinkingNative, this.afWarnLog(), new AFb1xSDK());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.AFVersionDeclaration;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFf1oSDK AFLogger$LogLevel() {
        synchronized (this) {
            try {
                if (this.getLevel != null) return this.getLevel;
                this.getLevel = new AFf1oSDK();
                return this.getLevel;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFc1bSDK AFVersionDeclaration() {
        synchronized (this) {
            try {
                if (this.afErrorLogForExcManagerOnly != null) return this.afErrorLogForExcManagerOnly;
                AFc1bSDK aFc1bSDK = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue<Runnable>(){

                    private boolean values(Runnable runnable) {
                        if (this.isEmpty()) {
                            return super.offer((Object)runnable);
                        }
                        return false;
                    }

                    public final /* synthetic */ boolean offer(Object object) {
                        return this.values((Runnable)object);
                    }
                }, (ThreadFactory)new AFa1wSDK());
                aFc1bSDK.setRejectedExecutionHandler((RejectedExecutionHandler)new s());
                this.afErrorLogForExcManagerOnly = new AFc1bSDK((ExecutorService)aFc1bSDK);
                return this.afErrorLogForExcManagerOnly;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFb1sSDK AppsFlyer2dXConversionCallback() {
        synchronized (this) {
            try {
                if (this.onResponseNative != null) return this.onResponseNative;
                this.onResponseNative = new AFb1sSDK(this);
                return this.onResponseNative;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFe1mSDK afDebugLog() {
        synchronized (this) {
            try {
                if (this.afInfoLog != null) return this.afInfoLog;
                this.afInfoLog = new AFe1mSDK(this.values());
                return this.afInfoLog;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final PurchaseHandler afErrorLog() {
        synchronized (this) {
            try {
                if (this.afRDLog != null) return this.afRDLog;
                this.afRDLog = new PurchaseHandler(this);
                return this.afRDLog;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFb1tSDK afErrorLogForExcManagerOnly() {
        synchronized (this) {
            try {
                if (this.AFLogger$LogLevel != null) return this.AFLogger$LogLevel;
                this.AFLogger$LogLevel = new AFb1rSDK();
                return this.AFLogger$LogLevel;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public final AFb1vSDK afInfoLog() {
        synchronized (this) {
            try {
                if (this.onAppOpenAttribution != null) return this.onAppOpenAttribution;
                this.onAppOpenAttribution = new AFb1vSDK(this.init(), this.AFInAppEventParameterName());
                return this.onAppOpenAttribution;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFb1wSDK afRDLog() {
        synchronized (this) {
            try {
                if (this.afDebugLog != null) return this.afDebugLog;
                AFb1ySDK aFb1ySDK = new AFb1ySDK(this.values());
                AFe1zSDK aFe1zSDK = new AFe1zSDK(this.AFInAppEventParameterName(), aFb1ySDK);
                this.afDebugLog = new AFb1wSDK(new AFd1cSDK(), this.AFInAppEventParameterName(), this.afWarnLog(), aFb1ySDK, new AFc1oSDK(this.onAttributionFailureNative(), this.AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), this.onInstallConversionFailureNative()), aFe1zSDK, this.AFVersionDeclaration());
                return this.afDebugLog;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFe1wSDK afWarnLog() {
        synchronized (this) {
            try {
                if (this.AppsFlyer2dXConversionCallback != null) return this.AppsFlyer2dXConversionCallback;
                this.AppsFlyer2dXConversionCallback = new AFe1wSDK(this.init(), new AFe1xSDK());
                return this.AppsFlyer2dXConversionCallback;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @NonNull
    @Override
    public final AFf1iSDK getLevel() {
        if (this.afWarnLog == null) {
            Context context = this.valueOf.AFInAppEventType;
            if (context != null) {
                this.afWarnLog = new AFf1hSDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afWarnLog;
    }

    @NonNull
    @Override
    public final AFb1bSDK init() {
        synchronized (this) {
            AFb1bSDK aFb1bSDK = this.valueOf;
            return aFb1bSDK;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFa1bSDK onAppOpenAttributionNative() {
        synchronized (this) {
            try {
                if (this.onAppOpenAttributionNative != null) return this.onAppOpenAttributionNative;
                this.onAppOpenAttributionNative = new AFa1hSDK(this.init());
                return this.onAppOpenAttributionNative;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @NonNull
    @Override
    public final /* synthetic */ AFc1wSDK onConversionDataSuccess() {
        return this.onDeepLinking();
    }

    @NonNull
    @Override
    public final AFb1eSDK onDeepLinkingNative() {
        if (this.onResponseErrorNative == null) {
            this.onResponseErrorNative = new com.appsflyer.internal.AFa1wSDK();
        }
        return this.onResponseErrorNative;
    }

    @NonNull
    @Override
    public final AFf1tSDK onInstallConversionDataLoadedNative() {
        if (this.onInstallConversionFailureNative == null) {
            this.onInstallConversionFailureNative = new AFf1sSDK();
        }
        return this.onInstallConversionFailureNative;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final AFc1dSDK onInstallConversionFailureNative() {
        synchronized (this) {
            try {
                if (this.init != null) return this.init;
                this.init = new AFc1dSDK(this.AFInAppEventParameterName(), this.values());
                return this.init;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @NonNull
    @Override
    public final AFf1vSDK onResponseErrorNative() {
        if (this.onResponse == null) {
            this.onResponse = new AFf1ySDK();
        }
        return this.onResponse;
    }

    @NonNull
    @Override
    public final AFb1iSDK onResponseNative() {
        if (this.onAttributionFailureNative == null) {
            ExecutorService executorService = this.onAppOpenAttribution();
            AFb1sSDK aFb1sSDK = this.AppsFlyer2dXConversionCallback();
            if (this.onResponse == null) {
                this.onResponse = new AFf1ySDK();
            }
            this.onAttributionFailureNative = new AFb1kSDK((Executor)executorService, aFb1sSDK, this.onResponse);
        }
        return this.onAttributionFailureNative;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    @Override
    public final ScheduledExecutorService valueOf() {
        synchronized (this) {
            try {
                if (this.values != null) return this.values;
                this.values = Executors.newScheduledThreadPool((int)2);
                return this.values;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @NonNull
    @Override
    public final AFb1dSDK values() {
        Context context = this.valueOf.AFInAppEventType;
        if (context != null) {
            return new AFb1cSDK(AFa1eSDK.valueOf(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    public static final class AFa1wSDK
    implements ThreadFactory {
        private static final AtomicInteger AFInAppEventParameterName = new AtomicInteger();
        private final AtomicInteger valueOf = new AtomicInteger();

        public AFa1wSDK() {
            AFInAppEventParameterName.incrementAndGet();
        }

        public final Thread newThread(Runnable runnable) {
            int n8 = AFInAppEventParameterName.get();
            int n9 = this.valueOf.incrementAndGet();
            StringBuilder stringBuilder = new StringBuilder("queue-");
            stringBuilder.append(n8);
            stringBuilder.append("-");
            stringBuilder.append(n9);
            return new Thread(runnable, stringBuilder.toString());
        }
    }

}


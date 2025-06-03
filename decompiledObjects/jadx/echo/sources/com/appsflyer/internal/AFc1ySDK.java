package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class AFc1ySDK implements AFc1xSDK {
    private static final int AFKeystoreWrapper = (int) TimeUnit.SECONDS.toMillis(30);
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

    public static class AFa1wSDK implements ThreadFactory {
        private static final AtomicInteger AFInAppEventParameterName = new AtomicInteger();
        private final AtomicInteger valueOf = new AtomicInteger();

        public AFa1wSDK() {
            AFInAppEventParameterName.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i7 = AFInAppEventParameterName.get();
            int incrementAndGet = this.valueOf.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i7);
            sb.append("-");
            sb.append(incrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    @NonNull
    private synchronized ExecutorService onAppOpenAttribution() {
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventParameterName;
    }

    @NonNull
    private synchronized AFc1nSDK onAttributionFailureNative() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFc1nSDK(new AFc1lSDK(AFKeystoreWrapper), AFInAppEventType());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    /* renamed from: onDeepLinking, reason: merged with bridge method [inline-methods] */
    public synchronized AFc1sSDK onConversionDataSuccess() {
        try {
            if (this.onInstallConversionDataLoadedNative == null) {
                this.onInstallConversionDataLoadedNative = new AFc1sSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.onInstallConversionDataLoadedNative;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFb1gSDK AFInAppEventParameterName() {
        try {
            if (this.afErrorLog == null) {
                AFb1bSDK init = init();
                Context context = this.valueOf.AFInAppEventType;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.afErrorLog = new AFb1gSDK(init, new AFb1cSDK(AFa1eSDK.valueOf(context)));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized ExecutorService AFInAppEventType() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = Executors.newCachedThreadPool();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final AFc1oSDK AFKeystoreWrapper() {
        return new AFc1oSDK(onAttributionFailureNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), onInstallConversionFailureNative());
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final AFe1vSDK AFLogger() {
        if (this.AFVersionDeclaration == null) {
            Context context = this.valueOf.AFInAppEventType;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.onInstallConversionFailureNative == null) {
                this.onInstallConversionFailureNative = new AFf1sSDK();
            }
            AFf1tSDK aFf1tSDK = this.onInstallConversionFailureNative;
            if (this.onResponseErrorNative == null) {
                this.onResponseErrorNative = new com.appsflyer.internal.AFa1wSDK();
            }
            AFb1eSDK aFb1eSDK = this.onResponseErrorNative;
            if (this.afWarnLog == null) {
                Context context2 = this.valueOf.AFInAppEventType;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.afWarnLog = new AFf1hSDK(context2);
            }
            AFf1iSDK aFf1iSDK = this.afWarnLog;
            if (this.onConversionDataSuccess == null) {
                this.onConversionDataSuccess = new AFa1jSDK();
            }
            AFa1iSDK aFa1iSDK = this.onConversionDataSuccess;
            AFe1mSDK afDebugLog = afDebugLog();
            AFb1dSDK values = values();
            AFb1gSDK AFInAppEventParameterName = AFInAppEventParameterName();
            if (this.onDeepLinkingNative == null) {
                this.onDeepLinkingNative = new AFa1kSDK();
            }
            this.AFVersionDeclaration = new AFb1nSDK(context, aFf1tSDK, aFb1eSDK, aFf1iSDK, aFa1iSDK, afDebugLog, values, AFInAppEventParameterName, this.onDeepLinkingNative, afWarnLog(), new AFb1xSDK());
        }
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFf1oSDK AFLogger$LogLevel() {
        try {
            if (this.getLevel == null) {
                this.getLevel = new AFf1oSDK();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFc1bSDK AFVersionDeclaration() {
        try {
            if (this.afErrorLogForExcManagerOnly == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1ySDK.4
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* renamed from: values, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1wSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.s
                    @Override // java.util.concurrent.RejectedExecutionHandler
                    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                        AFc1ySDK.AFInAppEventParameterName(runnable, threadPoolExecutor2);
                    }
                });
                this.afErrorLogForExcManagerOnly = new AFc1bSDK(threadPoolExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFb1sSDK AppsFlyer2dXConversionCallback() {
        try {
            if (this.onResponseNative == null) {
                this.onResponseNative = new AFb1sSDK(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.onResponseNative;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFe1mSDK afDebugLog() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFe1mSDK(values());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized PurchaseHandler afErrorLog() {
        try {
            if (this.afRDLog == null) {
                this.afRDLog = new PurchaseHandler(this);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFb1tSDK afErrorLogForExcManagerOnly() {
        try {
            if (this.AFLogger$LogLevel == null) {
                this.AFLogger$LogLevel = new AFb1rSDK();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AFLogger$LogLevel;
    }

    @NonNull
    public final synchronized AFb1vSDK afInfoLog() {
        try {
            if (this.onAppOpenAttribution == null) {
                this.onAppOpenAttribution = new AFb1vSDK(init(), AFInAppEventParameterName());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.onAppOpenAttribution;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFb1wSDK afRDLog() {
        try {
            if (this.afDebugLog == null) {
                AFb1ySDK aFb1ySDK = new AFb1ySDK(values());
                this.afDebugLog = new AFb1wSDK(new AFd1cSDK(), AFInAppEventParameterName(), afWarnLog(), aFb1ySDK, new AFc1oSDK(onAttributionFailureNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), onInstallConversionFailureNative()), new AFe1zSDK(AFInAppEventParameterName(), aFb1ySDK), AFVersionDeclaration());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFe1wSDK afWarnLog() {
        try {
            if (this.AppsFlyer2dXConversionCallback == null) {
                this.AppsFlyer2dXConversionCallback = new AFe1wSDK(init(), new AFe1xSDK());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final AFf1iSDK getLevel() {
        if (this.afWarnLog == null) {
            Context context = this.valueOf.AFInAppEventType;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.afWarnLog = new AFf1hSDK(context);
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFb1bSDK init() {
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFa1bSDK onAppOpenAttributionNative() {
        try {
            if (this.onAppOpenAttributionNative == null) {
                this.onAppOpenAttributionNative = new AFa1hSDK(init());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.onAppOpenAttributionNative;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final AFb1eSDK onDeepLinkingNative() {
        if (this.onResponseErrorNative == null) {
            this.onResponseErrorNative = new com.appsflyer.internal.AFa1wSDK();
        }
        return this.onResponseErrorNative;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final AFf1tSDK onInstallConversionDataLoadedNative() {
        if (this.onInstallConversionFailureNative == null) {
            this.onInstallConversionFailureNative = new AFf1sSDK();
        }
        return this.onInstallConversionFailureNative;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized AFc1dSDK onInstallConversionFailureNative() {
        try {
            if (this.init == null) {
                this.init = new AFc1dSDK(AFInAppEventParameterName(), values());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.init;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final AFf1vSDK onResponseErrorNative() {
        if (this.onResponse == null) {
            this.onResponse = new AFf1ySDK();
        }
        return this.onResponse;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final AFb1iSDK onResponseNative() {
        if (this.onAttributionFailureNative == null) {
            ExecutorService onAppOpenAttribution = onAppOpenAttribution();
            AFb1sSDK AppsFlyer2dXConversionCallback = AppsFlyer2dXConversionCallback();
            if (this.onResponse == null) {
                this.onResponse = new AFf1ySDK();
            }
            this.onAttributionFailureNative = new AFb1kSDK(onAppOpenAttribution, AppsFlyer2dXConversionCallback, this.onResponse);
        }
        return this.onAttributionFailureNative;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final synchronized ScheduledExecutorService valueOf() {
        try {
            if (this.values == null) {
                this.values = Executors.newScheduledThreadPool(2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1xSDK
    @NonNull
    public final AFb1dSDK values() {
        Context context = this.valueOf.AFInAppEventType;
        if (context != null) {
            return new AFb1cSDK(AFa1eSDK.valueOf(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventParameterName(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e7) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e7);
            Thread.currentThread().interrupt();
        }
    }
}

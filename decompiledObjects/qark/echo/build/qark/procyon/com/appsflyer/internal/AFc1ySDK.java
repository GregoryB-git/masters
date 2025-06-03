// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import com.appsflyer.AppsFlyerProperties;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import com.appsflyer.AFLogger;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;

public final class AFc1ySDK implements AFc1xSDK
{
    private static final int AFKeystoreWrapper;
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
    public final AFb1bSDK valueOf;
    private ScheduledExecutorService values;
    
    static {
        AFKeystoreWrapper = (int)TimeUnit.SECONDS.toMillis(30L);
    }
    
    public AFc1ySDK() {
        this.valueOf = new AFb1bSDK();
    }
    
    @NonNull
    private ExecutorService onAppOpenAttribution() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.AFInAppEventParameterName == null) {
                    this.AFInAppEventParameterName = Executors.newSingleThreadExecutor();
                }
                // monitorexit(this)
                return this.AFInAppEventParameterName;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    private AFc1nSDK onAttributionFailureNative() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.AFLogger == null) {
                    this.AFLogger = new AFc1nSDK(new AFc1lSDK(AFc1ySDK.AFKeystoreWrapper), this.AFInAppEventType());
                }
                // monitorexit(this)
                return this.AFLogger;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    private AFc1sSDK onDeepLinking() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.onInstallConversionDataLoadedNative == null) {
                    this.onInstallConversionDataLoadedNative = new AFc1sSDK(this);
                }
                // monitorexit(this)
                return this.onInstallConversionDataLoadedNative;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final AFb1gSDK AFInAppEventParameterName() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.afErrorLog == null) {
                    final AFb1bSDK init = this.init();
                    final Context afInAppEventType = this.valueOf.AFInAppEventType;
                    if (afInAppEventType == null) {
                        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                    }
                    this.afErrorLog = new AFb1gSDK(init, new AFb1cSDK(AFa1eSDK.valueOf(afInAppEventType)));
                }
                // monitorexit(this)
                return this.afErrorLog;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final ExecutorService AFInAppEventType() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.AFInAppEventType == null) {
                    this.AFInAppEventType = Executors.newCachedThreadPool();
                }
                // monitorexit(this)
                return this.AFInAppEventType;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
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
            final Context afInAppEventType = this.valueOf.AFInAppEventType;
            if (afInAppEventType == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.onInstallConversionFailureNative == null) {
                this.onInstallConversionFailureNative = new AFf1sSDK();
            }
            final AFf1tSDK onInstallConversionFailureNative = this.onInstallConversionFailureNative;
            if (this.onResponseErrorNative == null) {
                this.onResponseErrorNative = new com.appsflyer.internal.AFa1wSDK();
            }
            final AFb1eSDK onResponseErrorNative = this.onResponseErrorNative;
            if (this.afWarnLog == null) {
                final Context afInAppEventType2 = this.valueOf.AFInAppEventType;
                if (afInAppEventType2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.afWarnLog = new AFf1hSDK(afInAppEventType2);
            }
            final AFf1iSDK afWarnLog = this.afWarnLog;
            if (this.onConversionDataSuccess == null) {
                this.onConversionDataSuccess = new AFa1jSDK();
            }
            final AFa1iSDK onConversionDataSuccess = this.onConversionDataSuccess;
            final AFe1mSDK afDebugLog = this.afDebugLog();
            final AFb1dSDK values = this.values();
            final AFb1gSDK afInAppEventParameterName = this.AFInAppEventParameterName();
            if (this.onDeepLinkingNative == null) {
                this.onDeepLinkingNative = new AFa1kSDK();
            }
            this.AFVersionDeclaration = new AFb1nSDK(afInAppEventType, onInstallConversionFailureNative, onResponseErrorNative, afWarnLog, onConversionDataSuccess, afDebugLog, values, afInAppEventParameterName, this.onDeepLinkingNative, this.afWarnLog(), new AFb1xSDK());
        }
        return this.AFVersionDeclaration;
    }
    
    @NonNull
    @Override
    public final AFf1oSDK AFLogger$LogLevel() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.getLevel == null) {
                    this.getLevel = new AFf1oSDK();
                }
                // monitorexit(this)
                return this.getLevel;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final AFc1bSDK AFVersionDeclaration() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.afErrorLogForExcManagerOnly == null) {
                    final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() {
                        private boolean values(final Runnable e) {
                            return this.isEmpty() && super.offer(e);
                        }
                    }, new AFa1wSDK());
                    threadPoolExecutor.setRejectedExecutionHandler(new s());
                    this.afErrorLogForExcManagerOnly = new AFc1bSDK(threadPoolExecutor);
                }
                // monitorexit(this)
                return this.afErrorLogForExcManagerOnly;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final AFb1sSDK AppsFlyer2dXConversionCallback() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.onResponseNative == null) {
                    this.onResponseNative = new AFb1sSDK(this);
                }
                // monitorexit(this)
                return this.onResponseNative;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final AFe1mSDK afDebugLog() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.afInfoLog == null) {
                    this.afInfoLog = new AFe1mSDK(this.values());
                }
                // monitorexit(this)
                return this.afInfoLog;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final PurchaseHandler afErrorLog() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.afRDLog == null) {
                    this.afRDLog = new PurchaseHandler(this);
                }
                // monitorexit(this)
                return this.afRDLog;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final AFb1tSDK afErrorLogForExcManagerOnly() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.AFLogger$LogLevel == null) {
                    this.AFLogger$LogLevel = new AFb1rSDK();
                }
                // monitorexit(this)
                return this.AFLogger$LogLevel;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    public final AFb1vSDK afInfoLog() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.onAppOpenAttribution == null) {
                    this.onAppOpenAttribution = new AFb1vSDK(this.init(), this.AFInAppEventParameterName());
                }
                // monitorexit(this)
                return this.onAppOpenAttribution;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final AFb1wSDK afRDLog() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.afDebugLog == null) {
                    final AFb1ySDK aFb1ySDK = new AFb1ySDK(this.values());
                    this.afDebugLog = new AFb1wSDK(new AFd1cSDK(), this.AFInAppEventParameterName(), this.afWarnLog(), aFb1ySDK, new AFc1oSDK(this.onAttributionFailureNative(), this.AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), this.onInstallConversionFailureNative()), new AFe1zSDK(this.AFInAppEventParameterName(), aFb1ySDK), this.AFVersionDeclaration());
                }
                // monitorexit(this)
                return this.afDebugLog;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final AFe1wSDK afWarnLog() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.AppsFlyer2dXConversionCallback == null) {
                    this.AppsFlyer2dXConversionCallback = new AFe1wSDK(this.init(), new AFe1xSDK());
                }
                // monitorexit(this)
                return this.AppsFlyer2dXConversionCallback;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final AFf1iSDK getLevel() {
        if (this.afWarnLog == null) {
            final Context afInAppEventType = this.valueOf.AFInAppEventType;
            if (afInAppEventType == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.afWarnLog = new AFf1hSDK(afInAppEventType);
        }
        return this.afWarnLog;
    }
    
    @NonNull
    @Override
    public final AFb1bSDK init() {
        synchronized (this) {
            return this.valueOf;
        }
    }
    
    @NonNull
    @Override
    public final AFa1bSDK onAppOpenAttributionNative() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.onAppOpenAttributionNative == null) {
                    this.onAppOpenAttributionNative = new AFa1hSDK(this.init());
                }
                // monitorexit(this)
                return this.onAppOpenAttributionNative;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
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
    
    @NonNull
    @Override
    public final AFc1dSDK onInstallConversionFailureNative() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.init == null) {
                    this.init = new AFc1dSDK(this.AFInAppEventParameterName(), this.values());
                }
                // monitorexit(this)
                return this.init;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
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
            final ExecutorService onAppOpenAttribution = this.onAppOpenAttribution();
            final AFb1sSDK appsFlyer2dXConversionCallback = this.AppsFlyer2dXConversionCallback();
            if (this.onResponse == null) {
                this.onResponse = new AFf1ySDK();
            }
            this.onAttributionFailureNative = new AFb1kSDK(onAppOpenAttribution, appsFlyer2dXConversionCallback, this.onResponse);
        }
        return this.onAttributionFailureNative;
    }
    
    @NonNull
    @Override
    public final ScheduledExecutorService valueOf() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.values == null) {
                    this.values = Executors.newScheduledThreadPool(2);
                }
                // monitorexit(this)
                return this.values;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    @Override
    public final AFb1dSDK values() {
        final Context afInAppEventType = this.valueOf.AFInAppEventType;
        if (afInAppEventType != null) {
            return new AFb1cSDK(AFa1eSDK.valueOf(afInAppEventType));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }
    
    public static final class AFa1wSDK implements ThreadFactory
    {
        private static final AtomicInteger AFInAppEventParameterName;
        private final AtomicInteger valueOf;
        
        static {
            AFInAppEventParameterName = new AtomicInteger();
        }
        
        public AFa1wSDK() {
            this.valueOf = new AtomicInteger();
            AFa1wSDK.AFInAppEventParameterName.incrementAndGet();
        }
        
        @Override
        public final Thread newThread(final Runnable target) {
            final int value = AFa1wSDK.AFInAppEventParameterName.get();
            final int incrementAndGet = this.valueOf.incrementAndGet();
            final StringBuilder sb = new StringBuilder("queue-");
            sb.append(value);
            sb.append("-");
            sb.append(incrementAndGet);
            return new Thread(target, sb.toString());
        }
    }
}

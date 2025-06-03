/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.ScheduledExecutorService
 */
package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.AFa1bSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1eSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1sSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFb1wSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1wSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1vSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFf1iSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFf1vSDK;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public interface AFc1xSDK {
    @NonNull
    public AFb1gSDK AFInAppEventParameterName();

    @NonNull
    public ExecutorService AFInAppEventType();

    @NonNull
    public AFc1oSDK AFKeystoreWrapper();

    @NonNull
    public AFe1vSDK AFLogger();

    @NonNull
    public AFf1oSDK AFLogger$LogLevel();

    @NonNull
    public AFc1bSDK AFVersionDeclaration();

    @NonNull
    public AFb1sSDK AppsFlyer2dXConversionCallback();

    @NonNull
    public AFe1mSDK afDebugLog();

    @NonNull
    public PurchaseHandler afErrorLog();

    @NonNull
    public AFb1tSDK afErrorLogForExcManagerOnly();

    @NonNull
    public AFb1wSDK afRDLog();

    @NonNull
    public AFe1wSDK afWarnLog();

    @NonNull
    public AFf1iSDK getLevel();

    @NonNull
    public AFb1bSDK init();

    @NonNull
    public AFa1bSDK onAppOpenAttributionNative();

    @NonNull
    public AFc1wSDK onConversionDataSuccess();

    @NonNull
    public AFb1eSDK onDeepLinkingNative();

    @NonNull
    public AFf1tSDK onInstallConversionDataLoadedNative();

    @NonNull
    public AFc1dSDK onInstallConversionFailureNative();

    @NonNull
    public AFf1vSDK onResponseErrorNative();

    @NonNull
    public AFb1iSDK onResponseNative();

    @NonNull
    public ScheduledExecutorService valueOf();

    @NonNull
    public AFb1dSDK values();
}


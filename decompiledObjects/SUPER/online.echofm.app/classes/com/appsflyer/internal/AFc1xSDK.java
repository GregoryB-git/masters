package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public abstract interface AFc1xSDK
{
  @NonNull
  public abstract AFb1gSDK AFInAppEventParameterName();
  
  @NonNull
  public abstract ExecutorService AFInAppEventType();
  
  @NonNull
  public abstract AFc1oSDK AFKeystoreWrapper();
  
  @NonNull
  public abstract AFe1vSDK AFLogger();
  
  @NonNull
  public abstract AFf1oSDK AFLogger$LogLevel();
  
  @NonNull
  public abstract AFc1bSDK AFVersionDeclaration();
  
  @NonNull
  public abstract AFb1sSDK AppsFlyer2dXConversionCallback();
  
  @NonNull
  public abstract AFe1mSDK afDebugLog();
  
  @NonNull
  public abstract PurchaseHandler afErrorLog();
  
  @NonNull
  public abstract AFb1tSDK afErrorLogForExcManagerOnly();
  
  @NonNull
  public abstract AFb1wSDK afRDLog();
  
  @NonNull
  public abstract AFe1wSDK afWarnLog();
  
  @NonNull
  public abstract AFf1iSDK getLevel();
  
  @NonNull
  public abstract AFb1bSDK init();
  
  @NonNull
  public abstract AFa1bSDK onAppOpenAttributionNative();
  
  @NonNull
  public abstract AFc1wSDK onConversionDataSuccess();
  
  @NonNull
  public abstract AFb1eSDK onDeepLinkingNative();
  
  @NonNull
  public abstract AFf1tSDK onInstallConversionDataLoadedNative();
  
  @NonNull
  public abstract AFc1dSDK onInstallConversionFailureNative();
  
  @NonNull
  public abstract AFf1vSDK onResponseErrorNative();
  
  @NonNull
  public abstract AFb1iSDK onResponseNative();
  
  @NonNull
  public abstract ScheduledExecutorService valueOf();
  
  @NonNull
  public abstract AFb1dSDK values();
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1xSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
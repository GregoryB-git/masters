package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public abstract interface zzdl
  extends IInterface
{
  public abstract void beginAdUnitExposure(String paramString, long paramLong);
  
  public abstract void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle);
  
  public abstract void clearMeasurementEnabled(long paramLong);
  
  public abstract void endAdUnitExposure(String paramString, long paramLong);
  
  public abstract void generateEventId(zzdq paramzzdq);
  
  public abstract void getAppInstanceId(zzdq paramzzdq);
  
  public abstract void getCachedAppInstanceId(zzdq paramzzdq);
  
  public abstract void getConditionalUserProperties(String paramString1, String paramString2, zzdq paramzzdq);
  
  public abstract void getCurrentScreenClass(zzdq paramzzdq);
  
  public abstract void getCurrentScreenName(zzdq paramzzdq);
  
  public abstract void getGmpAppId(zzdq paramzzdq);
  
  public abstract void getMaxUserProperties(String paramString, zzdq paramzzdq);
  
  public abstract void getSessionId(zzdq paramzzdq);
  
  public abstract void getTestFlag(zzdq paramzzdq, int paramInt);
  
  public abstract void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, zzdq paramzzdq);
  
  public abstract void initForTests(Map paramMap);
  
  public abstract void initialize(IObjectWrapper paramIObjectWrapper, zzdz paramzzdz, long paramLong);
  
  public abstract void isDataCollectionEnabled(zzdq paramzzdq);
  
  public abstract void logEvent(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong);
  
  public abstract void logEventAndBundle(String paramString1, String paramString2, Bundle paramBundle, zzdq paramzzdq, long paramLong);
  
  public abstract void logHealthData(int paramInt, String paramString, IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3);
  
  public abstract void onActivityCreated(IObjectWrapper paramIObjectWrapper, Bundle paramBundle, long paramLong);
  
  public abstract void onActivityCreatedByScionActivityInfo(zzeb paramzzeb, Bundle paramBundle, long paramLong);
  
  public abstract void onActivityDestroyed(IObjectWrapper paramIObjectWrapper, long paramLong);
  
  public abstract void onActivityDestroyedByScionActivityInfo(zzeb paramzzeb, long paramLong);
  
  public abstract void onActivityPaused(IObjectWrapper paramIObjectWrapper, long paramLong);
  
  public abstract void onActivityPausedByScionActivityInfo(zzeb paramzzeb, long paramLong);
  
  public abstract void onActivityResumed(IObjectWrapper paramIObjectWrapper, long paramLong);
  
  public abstract void onActivityResumedByScionActivityInfo(zzeb paramzzeb, long paramLong);
  
  public abstract void onActivitySaveInstanceState(IObjectWrapper paramIObjectWrapper, zzdq paramzzdq, long paramLong);
  
  public abstract void onActivitySaveInstanceStateByScionActivityInfo(zzeb paramzzeb, zzdq paramzzdq, long paramLong);
  
  public abstract void onActivityStarted(IObjectWrapper paramIObjectWrapper, long paramLong);
  
  public abstract void onActivityStartedByScionActivityInfo(zzeb paramzzeb, long paramLong);
  
  public abstract void onActivityStopped(IObjectWrapper paramIObjectWrapper, long paramLong);
  
  public abstract void onActivityStoppedByScionActivityInfo(zzeb paramzzeb, long paramLong);
  
  public abstract void performAction(Bundle paramBundle, zzdq paramzzdq, long paramLong);
  
  public abstract void registerOnMeasurementEventListener(zzdw paramzzdw);
  
  public abstract void resetAnalyticsData(long paramLong);
  
  public abstract void retrieveAndUploadBatches(zzdr paramzzdr);
  
  public abstract void setConditionalUserProperty(Bundle paramBundle, long paramLong);
  
  public abstract void setConsent(Bundle paramBundle, long paramLong);
  
  public abstract void setConsentThirdParty(Bundle paramBundle, long paramLong);
  
  public abstract void setCurrentScreen(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2, long paramLong);
  
  public abstract void setCurrentScreenByScionActivityInfo(zzeb paramzzeb, String paramString1, String paramString2, long paramLong);
  
  public abstract void setDataCollectionEnabled(boolean paramBoolean);
  
  public abstract void setDefaultEventParameters(Bundle paramBundle);
  
  public abstract void setEventInterceptor(zzdw paramzzdw);
  
  public abstract void setInstanceIdProvider(zzdx paramzzdx);
  
  public abstract void setMeasurementEnabled(boolean paramBoolean, long paramLong);
  
  public abstract void setMinimumSessionDuration(long paramLong);
  
  public abstract void setSessionTimeoutDuration(long paramLong);
  
  public abstract void setSgtmDebugInfo(Intent paramIntent);
  
  public abstract void setUserId(String paramString, long paramLong);
  
  public abstract void setUserProperty(String paramString1, String paramString2, IObjectWrapper paramIObjectWrapper, boolean paramBoolean, long paramLong);
  
  public abstract void unregisterOnMeasurementEventListener(zzdw paramzzdw);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzdl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
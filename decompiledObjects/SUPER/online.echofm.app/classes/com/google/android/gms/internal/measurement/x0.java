package com.google.android.gms.internal.measurement;

import H2.a;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

public abstract interface x0
  extends IInterface
{
  public abstract void beginAdUnitExposure(String paramString, long paramLong);
  
  public abstract void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle);
  
  public abstract void clearMeasurementEnabled(long paramLong);
  
  public abstract void endAdUnitExposure(String paramString, long paramLong);
  
  public abstract void generateEventId(y0 paramy0);
  
  public abstract void getAppInstanceId(y0 paramy0);
  
  public abstract void getCachedAppInstanceId(y0 paramy0);
  
  public abstract void getConditionalUserProperties(String paramString1, String paramString2, y0 paramy0);
  
  public abstract void getCurrentScreenClass(y0 paramy0);
  
  public abstract void getCurrentScreenName(y0 paramy0);
  
  public abstract void getGmpAppId(y0 paramy0);
  
  public abstract void getMaxUserProperties(String paramString, y0 paramy0);
  
  public abstract void getSessionId(y0 paramy0);
  
  public abstract void getTestFlag(y0 paramy0, int paramInt);
  
  public abstract void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, y0 paramy0);
  
  public abstract void initForTests(Map paramMap);
  
  public abstract void initialize(a parama, H0 paramH0, long paramLong);
  
  public abstract void isDataCollectionEnabled(y0 paramy0);
  
  public abstract void logEvent(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong);
  
  public abstract void logEventAndBundle(String paramString1, String paramString2, Bundle paramBundle, y0 paramy0, long paramLong);
  
  public abstract void logHealthData(int paramInt, String paramString, a parama1, a parama2, a parama3);
  
  public abstract void onActivityCreated(a parama, Bundle paramBundle, long paramLong);
  
  public abstract void onActivityDestroyed(a parama, long paramLong);
  
  public abstract void onActivityPaused(a parama, long paramLong);
  
  public abstract void onActivityResumed(a parama, long paramLong);
  
  public abstract void onActivitySaveInstanceState(a parama, y0 paramy0, long paramLong);
  
  public abstract void onActivityStarted(a parama, long paramLong);
  
  public abstract void onActivityStopped(a parama, long paramLong);
  
  public abstract void performAction(Bundle paramBundle, y0 paramy0, long paramLong);
  
  public abstract void registerOnMeasurementEventListener(E0 paramE0);
  
  public abstract void resetAnalyticsData(long paramLong);
  
  public abstract void setConditionalUserProperty(Bundle paramBundle, long paramLong);
  
  public abstract void setConsent(Bundle paramBundle, long paramLong);
  
  public abstract void setConsentThirdParty(Bundle paramBundle, long paramLong);
  
  public abstract void setCurrentScreen(a parama, String paramString1, String paramString2, long paramLong);
  
  public abstract void setDataCollectionEnabled(boolean paramBoolean);
  
  public abstract void setDefaultEventParameters(Bundle paramBundle);
  
  public abstract void setEventInterceptor(E0 paramE0);
  
  public abstract void setInstanceIdProvider(F0 paramF0);
  
  public abstract void setMeasurementEnabled(boolean paramBoolean, long paramLong);
  
  public abstract void setMinimumSessionDuration(long paramLong);
  
  public abstract void setSessionTimeoutDuration(long paramLong);
  
  public abstract void setUserId(String paramString, long paramLong);
  
  public abstract void setUserProperty(String paramString1, String paramString2, a parama, boolean paramBoolean, long paramLong);
  
  public abstract void unregisterOnMeasurementEventListener(E0 paramE0);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.x0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
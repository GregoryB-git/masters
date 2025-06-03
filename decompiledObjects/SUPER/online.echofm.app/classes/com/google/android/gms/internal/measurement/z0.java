package com.google.android.gms.internal.measurement;

import H2.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class z0
  extends Y
  implements x0
{
  public z0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
  }
  
  public final void beginAdUnitExposure(String paramString, long paramLong)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString);
    localParcel.writeLong(paramLong);
    v(23, localParcel);
  }
  
  public final void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    a0.d(localParcel, paramBundle);
    v(9, localParcel);
  }
  
  public final void clearMeasurementEnabled(long paramLong)
  {
    Parcel localParcel = n();
    localParcel.writeLong(paramLong);
    v(43, localParcel);
  }
  
  public final void endAdUnitExposure(String paramString, long paramLong)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString);
    localParcel.writeLong(paramLong);
    v(24, localParcel);
  }
  
  public final void generateEventId(y0 paramy0)
  {
    Parcel localParcel = n();
    a0.c(localParcel, paramy0);
    v(22, localParcel);
  }
  
  public final void getAppInstanceId(y0 paramy0)
  {
    Parcel localParcel = n();
    a0.c(localParcel, paramy0);
    v(20, localParcel);
  }
  
  public final void getCachedAppInstanceId(y0 paramy0)
  {
    Parcel localParcel = n();
    a0.c(localParcel, paramy0);
    v(19, localParcel);
  }
  
  public final void getConditionalUserProperties(String paramString1, String paramString2, y0 paramy0)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    a0.c(localParcel, paramy0);
    v(10, localParcel);
  }
  
  public final void getCurrentScreenClass(y0 paramy0)
  {
    Parcel localParcel = n();
    a0.c(localParcel, paramy0);
    v(17, localParcel);
  }
  
  public final void getCurrentScreenName(y0 paramy0)
  {
    Parcel localParcel = n();
    a0.c(localParcel, paramy0);
    v(16, localParcel);
  }
  
  public final void getGmpAppId(y0 paramy0)
  {
    Parcel localParcel = n();
    a0.c(localParcel, paramy0);
    v(21, localParcel);
  }
  
  public final void getMaxUserProperties(String paramString, y0 paramy0)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString);
    a0.c(localParcel, paramy0);
    v(6, localParcel);
  }
  
  public final void getSessionId(y0 paramy0)
  {
    Parcel localParcel = n();
    a0.c(localParcel, paramy0);
    v(46, localParcel);
  }
  
  public final void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, y0 paramy0)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    a0.e(localParcel, paramBoolean);
    a0.c(localParcel, paramy0);
    v(5, localParcel);
  }
  
  public final void initialize(a parama, H0 paramH0, long paramLong)
  {
    Parcel localParcel = n();
    a0.c(localParcel, parama);
    a0.d(localParcel, paramH0);
    localParcel.writeLong(paramLong);
    v(1, localParcel);
  }
  
  public final void logEvent(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    a0.d(localParcel, paramBundle);
    a0.e(localParcel, paramBoolean1);
    a0.e(localParcel, paramBoolean2);
    localParcel.writeLong(paramLong);
    v(2, localParcel);
  }
  
  public final void logHealthData(int paramInt, String paramString, a parama1, a parama2, a parama3)
  {
    Parcel localParcel = n();
    localParcel.writeInt(paramInt);
    localParcel.writeString(paramString);
    a0.c(localParcel, parama1);
    a0.c(localParcel, parama2);
    a0.c(localParcel, parama3);
    v(33, localParcel);
  }
  
  public final void onActivityCreated(a parama, Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = n();
    a0.c(localParcel, parama);
    a0.d(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    v(27, localParcel);
  }
  
  public final void onActivityDestroyed(a parama, long paramLong)
  {
    Parcel localParcel = n();
    a0.c(localParcel, parama);
    localParcel.writeLong(paramLong);
    v(28, localParcel);
  }
  
  public final void onActivityPaused(a parama, long paramLong)
  {
    Parcel localParcel = n();
    a0.c(localParcel, parama);
    localParcel.writeLong(paramLong);
    v(29, localParcel);
  }
  
  public final void onActivityResumed(a parama, long paramLong)
  {
    Parcel localParcel = n();
    a0.c(localParcel, parama);
    localParcel.writeLong(paramLong);
    v(30, localParcel);
  }
  
  public final void onActivitySaveInstanceState(a parama, y0 paramy0, long paramLong)
  {
    Parcel localParcel = n();
    a0.c(localParcel, parama);
    a0.c(localParcel, paramy0);
    localParcel.writeLong(paramLong);
    v(31, localParcel);
  }
  
  public final void onActivityStarted(a parama, long paramLong)
  {
    Parcel localParcel = n();
    a0.c(localParcel, parama);
    localParcel.writeLong(paramLong);
    v(25, localParcel);
  }
  
  public final void onActivityStopped(a parama, long paramLong)
  {
    Parcel localParcel = n();
    a0.c(localParcel, parama);
    localParcel.writeLong(paramLong);
    v(26, localParcel);
  }
  
  public final void registerOnMeasurementEventListener(E0 paramE0)
  {
    Parcel localParcel = n();
    a0.c(localParcel, paramE0);
    v(35, localParcel);
  }
  
  public final void resetAnalyticsData(long paramLong)
  {
    Parcel localParcel = n();
    localParcel.writeLong(paramLong);
    v(12, localParcel);
  }
  
  public final void setConditionalUserProperty(Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    v(8, localParcel);
  }
  
  public final void setConsentThirdParty(Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    v(45, localParcel);
  }
  
  public final void setCurrentScreen(a parama, String paramString1, String paramString2, long paramLong)
  {
    Parcel localParcel = n();
    a0.c(localParcel, parama);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeLong(paramLong);
    v(15, localParcel);
  }
  
  public final void setDataCollectionEnabled(boolean paramBoolean)
  {
    Parcel localParcel = n();
    a0.e(localParcel, paramBoolean);
    v(39, localParcel);
  }
  
  public final void setDefaultEventParameters(Bundle paramBundle)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramBundle);
    v(42, localParcel);
  }
  
  public final void setMeasurementEnabled(boolean paramBoolean, long paramLong)
  {
    Parcel localParcel = n();
    a0.e(localParcel, paramBoolean);
    localParcel.writeLong(paramLong);
    v(11, localParcel);
  }
  
  public final void setSessionTimeoutDuration(long paramLong)
  {
    Parcel localParcel = n();
    localParcel.writeLong(paramLong);
    v(14, localParcel);
  }
  
  public final void setUserId(String paramString, long paramLong)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString);
    localParcel.writeLong(paramLong);
    v(7, localParcel);
  }
  
  public final void setUserProperty(String paramString1, String paramString2, a parama, boolean paramBoolean, long paramLong)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    a0.c(localParcel, parama);
    a0.e(localParcel, paramBoolean);
    localParcel.writeLong(paramLong);
    v(4, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.z0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
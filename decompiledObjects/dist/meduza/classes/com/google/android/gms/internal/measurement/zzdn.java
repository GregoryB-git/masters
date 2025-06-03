package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public final class zzdn
  extends zzbu
  implements zzdl
{
  public zzdn(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
  }
  
  public final void beginAdUnitExposure(String paramString, long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString);
    localParcel.writeLong(paramLong);
    zzb(23, localParcel);
  }
  
  public final void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbw.zza(localParcel, paramBundle);
    zzb(9, localParcel);
  }
  
  public final void clearMeasurementEnabled(long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeLong(paramLong);
    zzb(43, localParcel);
  }
  
  public final void endAdUnitExposure(String paramString, long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString);
    localParcel.writeLong(paramLong);
    zzb(24, localParcel);
  }
  
  public final void generateEventId(zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdq);
    zzb(22, localParcel);
  }
  
  public final void getAppInstanceId(zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdq);
    zzb(20, localParcel);
  }
  
  public final void getCachedAppInstanceId(zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdq);
    zzb(19, localParcel);
  }
  
  public final void getConditionalUserProperties(String paramString1, String paramString2, zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbw.zza(localParcel, paramzzdq);
    zzb(10, localParcel);
  }
  
  public final void getCurrentScreenClass(zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdq);
    zzb(17, localParcel);
  }
  
  public final void getCurrentScreenName(zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdq);
    zzb(16, localParcel);
  }
  
  public final void getGmpAppId(zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdq);
    zzb(21, localParcel);
  }
  
  public final void getMaxUserProperties(String paramString, zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString);
    zzbw.zza(localParcel, paramzzdq);
    zzb(6, localParcel);
  }
  
  public final void getSessionId(zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdq);
    zzb(46, localParcel);
  }
  
  public final void getTestFlag(zzdq paramzzdq, int paramInt)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdq);
    localParcel.writeInt(paramInt);
    zzb(38, localParcel);
  }
  
  public final void getUserProperties(String paramString1, String paramString2, boolean paramBoolean, zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbw.zza(localParcel, paramBoolean);
    zzbw.zza(localParcel, paramzzdq);
    zzb(5, localParcel);
  }
  
  public final void initForTests(Map paramMap)
  {
    Parcel localParcel = b_();
    localParcel.writeMap(paramMap);
    zzb(37, localParcel);
  }
  
  public final void initialize(IObjectWrapper paramIObjectWrapper, zzdz paramzzdz, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIObjectWrapper);
    zzbw.zza(localParcel, paramzzdz);
    localParcel.writeLong(paramLong);
    zzb(1, localParcel);
  }
  
  public final void isDataCollectionEnabled(zzdq paramzzdq)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdq);
    zzb(40, localParcel);
  }
  
  public final void logEvent(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbw.zza(localParcel, paramBundle);
    zzbw.zza(localParcel, paramBoolean1);
    zzbw.zza(localParcel, paramBoolean2);
    localParcel.writeLong(paramLong);
    zzb(2, localParcel);
  }
  
  public final void logEventAndBundle(String paramString1, String paramString2, Bundle paramBundle, zzdq paramzzdq, long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbw.zza(localParcel, paramBundle);
    zzbw.zza(localParcel, paramzzdq);
    localParcel.writeLong(paramLong);
    zzb(3, localParcel);
  }
  
  public final void logHealthData(int paramInt, String paramString, IObjectWrapper paramIObjectWrapper1, IObjectWrapper paramIObjectWrapper2, IObjectWrapper paramIObjectWrapper3)
  {
    Parcel localParcel = b_();
    localParcel.writeInt(paramInt);
    localParcel.writeString(paramString);
    zzbw.zza(localParcel, paramIObjectWrapper1);
    zzbw.zza(localParcel, paramIObjectWrapper2);
    zzbw.zza(localParcel, paramIObjectWrapper3);
    zzb(33, localParcel);
  }
  
  public final void onActivityCreated(IObjectWrapper paramIObjectWrapper, Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIObjectWrapper);
    zzbw.zza(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzb(27, localParcel);
  }
  
  public final void onActivityCreatedByScionActivityInfo(zzeb paramzzeb, Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzeb);
    zzbw.zza(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzb(53, localParcel);
  }
  
  public final void onActivityDestroyed(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzb(28, localParcel);
  }
  
  public final void onActivityDestroyedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzeb);
    localParcel.writeLong(paramLong);
    zzb(54, localParcel);
  }
  
  public final void onActivityPaused(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzb(29, localParcel);
  }
  
  public final void onActivityPausedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzeb);
    localParcel.writeLong(paramLong);
    zzb(55, localParcel);
  }
  
  public final void onActivityResumed(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzb(30, localParcel);
  }
  
  public final void onActivityResumedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzeb);
    localParcel.writeLong(paramLong);
    zzb(56, localParcel);
  }
  
  public final void onActivitySaveInstanceState(IObjectWrapper paramIObjectWrapper, zzdq paramzzdq, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIObjectWrapper);
    zzbw.zza(localParcel, paramzzdq);
    localParcel.writeLong(paramLong);
    zzb(31, localParcel);
  }
  
  public final void onActivitySaveInstanceStateByScionActivityInfo(zzeb paramzzeb, zzdq paramzzdq, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzeb);
    zzbw.zza(localParcel, paramzzdq);
    localParcel.writeLong(paramLong);
    zzb(57, localParcel);
  }
  
  public final void onActivityStarted(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzb(25, localParcel);
  }
  
  public final void onActivityStartedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzeb);
    localParcel.writeLong(paramLong);
    zzb(51, localParcel);
  }
  
  public final void onActivityStopped(IObjectWrapper paramIObjectWrapper, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIObjectWrapper);
    localParcel.writeLong(paramLong);
    zzb(26, localParcel);
  }
  
  public final void onActivityStoppedByScionActivityInfo(zzeb paramzzeb, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzeb);
    localParcel.writeLong(paramLong);
    zzb(52, localParcel);
  }
  
  public final void performAction(Bundle paramBundle, zzdq paramzzdq, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramBundle);
    zzbw.zza(localParcel, paramzzdq);
    localParcel.writeLong(paramLong);
    zzb(32, localParcel);
  }
  
  public final void registerOnMeasurementEventListener(zzdw paramzzdw)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdw);
    zzb(35, localParcel);
  }
  
  public final void resetAnalyticsData(long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeLong(paramLong);
    zzb(12, localParcel);
  }
  
  public final void retrieveAndUploadBatches(zzdr paramzzdr)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdr);
    zzb(58, localParcel);
  }
  
  public final void setConditionalUserProperty(Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzb(8, localParcel);
  }
  
  public final void setConsent(Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzb(44, localParcel);
  }
  
  public final void setConsentThirdParty(Bundle paramBundle, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramBundle);
    localParcel.writeLong(paramLong);
    zzb(45, localParcel);
  }
  
  public final void setCurrentScreen(IObjectWrapper paramIObjectWrapper, String paramString1, String paramString2, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeLong(paramLong);
    zzb(15, localParcel);
  }
  
  public final void setCurrentScreenByScionActivityInfo(zzeb paramzzeb, String paramString1, String paramString2, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzeb);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeLong(paramLong);
    zzb(50, localParcel);
  }
  
  public final void setDataCollectionEnabled(boolean paramBoolean)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramBoolean);
    zzb(39, localParcel);
  }
  
  public final void setDefaultEventParameters(Bundle paramBundle)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramBundle);
    zzb(42, localParcel);
  }
  
  public final void setEventInterceptor(zzdw paramzzdw)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdw);
    zzb(34, localParcel);
  }
  
  public final void setInstanceIdProvider(zzdx paramzzdx)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdx);
    zzb(18, localParcel);
  }
  
  public final void setMeasurementEnabled(boolean paramBoolean, long paramLong)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramBoolean);
    localParcel.writeLong(paramLong);
    zzb(11, localParcel);
  }
  
  public final void setMinimumSessionDuration(long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeLong(paramLong);
    zzb(13, localParcel);
  }
  
  public final void setSessionTimeoutDuration(long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeLong(paramLong);
    zzb(14, localParcel);
  }
  
  public final void setSgtmDebugInfo(Intent paramIntent)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramIntent);
    zzb(48, localParcel);
  }
  
  public final void setUserId(String paramString, long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString);
    localParcel.writeLong(paramLong);
    zzb(7, localParcel);
  }
  
  public final void setUserProperty(String paramString1, String paramString2, IObjectWrapper paramIObjectWrapper, boolean paramBoolean, long paramLong)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbw.zza(localParcel, paramIObjectWrapper);
    zzbw.zza(localParcel, paramBoolean);
    localParcel.writeLong(paramLong);
    zzb(4, localParcel);
  }
  
  public final void unregisterOnMeasurementEventListener(zzdw paramzzdw)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramzzdw);
    zzb(36, localParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzdn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
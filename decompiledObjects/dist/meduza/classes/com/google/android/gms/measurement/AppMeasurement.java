package com.google.android.gms.measurement;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.firebase.analytics.FirebaseAnalytics;
import e7.j2;
import e7.j4;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m6.j;
import p2.m0;

@Deprecated
public class AppMeasurement
{
  public static volatile AppMeasurement b;
  public final a a;
  
  public AppMeasurement(j2 paramj2)
  {
    a = new b(paramj2);
  }
  
  public AppMeasurement(j4 paramj4)
  {
    a = new a(paramj4);
  }
  
  @Deprecated
  public static AppMeasurement getInstance(Context paramContext)
  {
    if (b == null) {
      try
      {
        Object localObject1 = b;
        if (localObject1 == null)
        {
          Object localObject2;
          try
          {
            localObject1 = (j4)FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", new Class[] { Context.class, Bundle.class }).invoke(null, new Object[] { paramContext, null });
          }
          catch (Exception localException)
          {
            localObject2 = null;
          }
          if (localObject2 != null)
          {
            paramContext = new com/google/android/gms/measurement/AppMeasurement;
            paramContext.<init>((j4)localObject2);
            b = paramContext;
          }
          else
          {
            localObject2 = new com/google/android/gms/internal/measurement/zzdz;
            ((zzdz)localObject2).<init>(0L, 0L, true, null, null, null, null, null);
            localObject2 = j2.a(paramContext, (zzdz)localObject2, null);
            paramContext = new com/google/android/gms/measurement/AppMeasurement;
            paramContext.<init>((j2)localObject2);
            b = paramContext;
          }
        }
      }
      finally {}
    }
    return b;
  }
  
  public void beginAdUnitExposure(String paramString)
  {
    a.zzb(paramString);
  }
  
  public void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    a.a(paramString1, paramString2, paramBundle);
  }
  
  public void endAdUnitExposure(String paramString)
  {
    a.zzc(paramString);
  }
  
  public long generateEventId()
  {
    return a.zzf();
  }
  
  public String getAppInstanceId()
  {
    return a.zzg();
  }
  
  public List<ConditionalUserProperty> getConditionalUserProperties(String paramString1, String paramString2)
  {
    paramString2 = a.b(paramString1, paramString2);
    int i;
    if (paramString2 == null) {
      i = 0;
    } else {
      i = paramString2.size();
    }
    paramString1 = new ArrayList(i);
    paramString2 = paramString2.iterator();
    while (paramString2.hasNext()) {
      paramString1.add(new ConditionalUserProperty((Bundle)paramString2.next()));
    }
    return paramString1;
  }
  
  public String getCurrentScreenClass()
  {
    return a.zzh();
  }
  
  public String getCurrentScreenName()
  {
    return a.zzi();
  }
  
  public String getGmpAppId()
  {
    return a.zzj();
  }
  
  public int getMaxUserProperties(String paramString)
  {
    return a.zza(paramString);
  }
  
  public Map<String, Object> getUserProperties(String paramString1, String paramString2, boolean paramBoolean)
  {
    return a.c(paramString1, paramString2, paramBoolean);
  }
  
  public void logEventInternal(String paramString1, String paramString2, Bundle paramBundle)
  {
    a.d(paramString1, paramString2, paramBundle);
  }
  
  public void setConditionalUserProperty(ConditionalUserProperty paramConditionalUserProperty)
  {
    j.i(paramConditionalUserProperty);
    a locala = a;
    Bundle localBundle = new Bundle();
    Object localObject = mAppId;
    if (localObject != null) {
      localBundle.putString("app_id", (String)localObject);
    }
    localObject = mOrigin;
    if (localObject != null) {
      localBundle.putString("origin", (String)localObject);
    }
    localObject = mName;
    if (localObject != null) {
      localBundle.putString("name", (String)localObject);
    }
    localObject = mValue;
    if (localObject != null) {
      m0.j0(localBundle, localObject);
    }
    localObject = mTriggerEventName;
    if (localObject != null) {
      localBundle.putString("trigger_event_name", (String)localObject);
    }
    localBundle.putLong("trigger_timeout", mTriggerTimeout);
    localObject = mTimedOutEventName;
    if (localObject != null) {
      localBundle.putString("timed_out_event_name", (String)localObject);
    }
    localObject = mTimedOutEventParams;
    if (localObject != null) {
      localBundle.putBundle("timed_out_event_params", (Bundle)localObject);
    }
    localObject = mTriggeredEventName;
    if (localObject != null) {
      localBundle.putString("triggered_event_name", (String)localObject);
    }
    localObject = mTriggeredEventParams;
    if (localObject != null) {
      localBundle.putBundle("triggered_event_params", (Bundle)localObject);
    }
    localBundle.putLong("time_to_live", mTimeToLive);
    localObject = mExpiredEventName;
    if (localObject != null) {
      localBundle.putString("expired_event_name", (String)localObject);
    }
    localObject = mExpiredEventParams;
    if (localObject != null) {
      localBundle.putBundle("expired_event_params", (Bundle)localObject);
    }
    localBundle.putLong("creation_timestamp", mCreationTimestamp);
    localBundle.putBoolean("active", mActive);
    localBundle.putLong("triggered_timestamp", mTriggeredTimestamp);
    locala.zza(localBundle);
  }
  
  public static class ConditionalUserProperty
  {
    public boolean mActive;
    public String mAppId;
    public long mCreationTimestamp;
    public String mExpiredEventName;
    public Bundle mExpiredEventParams;
    public String mName;
    public String mOrigin;
    public long mTimeToLive;
    public String mTimedOutEventName;
    public Bundle mTimedOutEventParams;
    public String mTriggerEventName;
    public long mTriggerTimeout;
    public String mTriggeredEventName;
    public Bundle mTriggeredEventParams;
    public long mTriggeredTimestamp;
    public Object mValue;
    
    public ConditionalUserProperty() {}
    
    public ConditionalUserProperty(Bundle paramBundle)
    {
      j.i(paramBundle);
      mAppId = ((String)m0.i0(paramBundle, "app_id", String.class, null));
      mOrigin = ((String)m0.i0(paramBundle, "origin", String.class, null));
      mName = ((String)m0.i0(paramBundle, "name", String.class, null));
      mValue = m0.i0(paramBundle, "value", Object.class, null);
      mTriggerEventName = ((String)m0.i0(paramBundle, "trigger_event_name", String.class, null));
      Long localLong = Long.valueOf(0L);
      mTriggerTimeout = ((Long)m0.i0(paramBundle, "trigger_timeout", Long.class, localLong)).longValue();
      mTimedOutEventName = ((String)m0.i0(paramBundle, "timed_out_event_name", String.class, null));
      mTimedOutEventParams = ((Bundle)m0.i0(paramBundle, "timed_out_event_params", Bundle.class, null));
      mTriggeredEventName = ((String)m0.i0(paramBundle, "triggered_event_name", String.class, null));
      mTriggeredEventParams = ((Bundle)m0.i0(paramBundle, "triggered_event_params", Bundle.class, null));
      mTimeToLive = ((Long)m0.i0(paramBundle, "time_to_live", Long.class, localLong)).longValue();
      mExpiredEventName = ((String)m0.i0(paramBundle, "expired_event_name", String.class, null));
      mExpiredEventParams = ((Bundle)m0.i0(paramBundle, "expired_event_params", Bundle.class, null));
      mActive = ((Boolean)m0.i0(paramBundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
      mCreationTimestamp = ((Long)m0.i0(paramBundle, "creation_timestamp", Long.class, localLong)).longValue();
      mTriggeredTimestamp = ((Long)m0.i0(paramBundle, "triggered_timestamp", Long.class, localLong)).longValue();
    }
  }
  
  public static abstract class a
    implements j4
  {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
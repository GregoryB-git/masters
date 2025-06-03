package com.google.android.gms.measurement;

import A2.n;
import R2.N2;
import R2.m4;
import R2.n3;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.H0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement
{
  public static volatile AppMeasurement b;
  public final a a;
  
  public AppMeasurement(N2 paramN2)
  {
    a = new a(paramN2);
  }
  
  public AppMeasurement(m4 paramm4)
  {
    a = new b(paramm4);
  }
  
  public static m4 a(Context paramContext, Bundle paramBundle)
  {
    try
    {
      paramContext = (m4)FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", new Class[] { Context.class, Bundle.class }).invoke(null, new Object[] { paramContext, null });
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static AppMeasurement b(Context paramContext, String paramString1, String paramString2)
  {
    if (b == null)
    {
      try
      {
        if (b != null) {
          break label81;
        }
        paramString1 = a(paramContext, null);
        if (paramString1 != null)
        {
          paramContext = new com/google/android/gms/measurement/AppMeasurement;
          paramContext.<init>(paramString1);
          b = paramContext;
        }
      }
      finally
      {
        break label87;
      }
      paramString1 = new com/google/android/gms/internal/measurement/H0;
      paramString1.<init>(0L, 0L, true, null, null, null, null, null);
      paramString1 = N2.c(paramContext, paramString1, null);
      paramContext = new com/google/android/gms/measurement/AppMeasurement;
      paramContext.<init>(paramString1);
      b = paramContext;
      label81:
      break label92;
      label87:
      throw paramContext;
    }
    label92:
    return b;
  }
  
  @Deprecated
  @Keep
  @NonNull
  public static AppMeasurement getInstance(@NonNull Context paramContext)
  {
    return b(paramContext, null, null);
  }
  
  @Keep
  public void beginAdUnitExposure(@NonNull String paramString)
  {
    a.s(paramString);
  }
  
  @Keep
  public void clearConditionalUserProperty(@NonNull String paramString1, @NonNull String paramString2, @NonNull Bundle paramBundle)
  {
    a.r(paramString1, paramString2, paramBundle);
  }
  
  @Keep
  public void endAdUnitExposure(@NonNull String paramString)
  {
    a.q(paramString);
  }
  
  @Keep
  public long generateEventId()
  {
    return a.a();
  }
  
  @Keep
  @NonNull
  public String getAppInstanceId()
  {
    return a.g();
  }
  
  @Keep
  @NonNull
  public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String paramString1, @NonNull String paramString2)
  {
    paramString2 = a.c(paramString1, paramString2);
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
  
  @Keep
  @NonNull
  public String getCurrentScreenClass()
  {
    return a.m();
  }
  
  @Keep
  @NonNull
  public String getCurrentScreenName()
  {
    return a.k();
  }
  
  @Keep
  @NonNull
  public String getGmpAppId()
  {
    return a.h();
  }
  
  @Keep
  public int getMaxUserProperties(@NonNull String paramString)
  {
    return a.i(paramString);
  }
  
  @Keep
  @NonNull
  public Map<String, Object> getUserProperties(@NonNull String paramString1, @NonNull String paramString2, boolean paramBoolean)
  {
    return a.t(paramString1, paramString2, paramBoolean);
  }
  
  @Keep
  public void logEventInternal(@NonNull String paramString1, @NonNull String paramString2, @NonNull Bundle paramBundle)
  {
    a.u(paramString1, paramString2, paramBundle);
  }
  
  @Keep
  public void setConditionalUserProperty(@NonNull ConditionalUserProperty paramConditionalUserProperty)
  {
    n.i(paramConditionalUserProperty);
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
      n3.b(localBundle, localObject);
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
    locala.l(localBundle);
  }
  
  public static class ConditionalUserProperty
  {
    @Keep
    public boolean mActive;
    @Keep
    @NonNull
    public String mAppId;
    @Keep
    public long mCreationTimestamp;
    @Keep
    @NonNull
    public String mExpiredEventName;
    @Keep
    @NonNull
    public Bundle mExpiredEventParams;
    @Keep
    @NonNull
    public String mName;
    @Keep
    @NonNull
    public String mOrigin;
    @Keep
    public long mTimeToLive;
    @Keep
    @NonNull
    public String mTimedOutEventName;
    @Keep
    @NonNull
    public Bundle mTimedOutEventParams;
    @Keep
    @NonNull
    public String mTriggerEventName;
    @Keep
    public long mTriggerTimeout;
    @Keep
    @NonNull
    public String mTriggeredEventName;
    @Keep
    @NonNull
    public Bundle mTriggeredEventParams;
    @Keep
    public long mTriggeredTimestamp;
    @Keep
    @NonNull
    public Object mValue;
    
    public ConditionalUserProperty(Bundle paramBundle)
    {
      n.i(paramBundle);
      mAppId = ((String)n3.a(paramBundle, "app_id", String.class, null));
      mOrigin = ((String)n3.a(paramBundle, "origin", String.class, null));
      mName = ((String)n3.a(paramBundle, "name", String.class, null));
      mValue = n3.a(paramBundle, "value", Object.class, null);
      mTriggerEventName = ((String)n3.a(paramBundle, "trigger_event_name", String.class, null));
      Long localLong = Long.valueOf(0L);
      mTriggerTimeout = ((Long)n3.a(paramBundle, "trigger_timeout", Long.class, localLong)).longValue();
      mTimedOutEventName = ((String)n3.a(paramBundle, "timed_out_event_name", String.class, null));
      mTimedOutEventParams = ((Bundle)n3.a(paramBundle, "timed_out_event_params", Bundle.class, null));
      mTriggeredEventName = ((String)n3.a(paramBundle, "triggered_event_name", String.class, null));
      mTriggeredEventParams = ((Bundle)n3.a(paramBundle, "triggered_event_params", Bundle.class, null));
      mTimeToLive = ((Long)n3.a(paramBundle, "time_to_live", Long.class, localLong)).longValue();
      mExpiredEventName = ((String)n3.a(paramBundle, "expired_event_name", String.class, null));
      mExpiredEventParams = ((Bundle)n3.a(paramBundle, "expired_event_params", Bundle.class, null));
      mActive = ((Boolean)n3.a(paramBundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
      mCreationTimestamp = ((Long)n3.a(paramBundle, "creation_timestamp", Long.class, localLong)).longValue();
      mTriggeredTimestamp = ((Long)n3.a(paramBundle, "triggered_timestamp", Long.class, localLong)).longValue();
    }
  }
  
  public static abstract class a
    implements m4
  {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
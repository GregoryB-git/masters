package com.google.android.gms.measurement;

import A2.n;
import R2.n3;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

public class AppMeasurement$ConditionalUserProperty
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
  
  public AppMeasurement$ConditionalUserProperty(Bundle paramBundle)
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

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
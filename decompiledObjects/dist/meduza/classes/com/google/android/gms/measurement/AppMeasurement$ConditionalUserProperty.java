package com.google.android.gms.measurement;

import android.os.Bundle;
import m6.j;
import p2.m0;

public class AppMeasurement$ConditionalUserProperty
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
  
  public AppMeasurement$ConditionalUserProperty() {}
  
  public AppMeasurement$ConditionalUserProperty(Bundle paramBundle)
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

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
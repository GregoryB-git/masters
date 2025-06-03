package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Iterator;
import java.util.Set;

public class BoltsMeasurementEventListener
  extends BroadcastReceiver
{
  private static final String BOLTS_MEASUREMENT_EVENT_PREFIX = "bf_";
  private static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
  private static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
  private static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
  private static BoltsMeasurementEventListener _instance;
  private Context applicationContext;
  
  private BoltsMeasurementEventListener(Context paramContext)
  {
    applicationContext = paramContext.getApplicationContext();
  }
  
  private void close()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LocalBroadcastManager.getInstance(applicationContext).unregisterReceiver(this);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public static BoltsMeasurementEventListener getInstance(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(BoltsMeasurementEventListener.class)) {
      return null;
    }
    try
    {
      BoltsMeasurementEventListener localBoltsMeasurementEventListener = _instance;
      if (localBoltsMeasurementEventListener != null) {
        return localBoltsMeasurementEventListener;
      }
      localBoltsMeasurementEventListener = new com/facebook/internal/BoltsMeasurementEventListener;
      localBoltsMeasurementEventListener.<init>(paramContext);
      _instance = localBoltsMeasurementEventListener;
      localBoltsMeasurementEventListener.open();
      paramContext = _instance;
      return paramContext;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, BoltsMeasurementEventListener.class);
    }
    return null;
  }
  
  private void open()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      LocalBroadcastManager localLocalBroadcastManager = LocalBroadcastManager.getInstance(applicationContext);
      IntentFilter localIntentFilter = new android/content/IntentFilter;
      localIntentFilter.<init>("com.parse.bolts.measurement_event");
      localLocalBroadcastManager.registerReceiver(this, localIntentFilter);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void finalize()
    throws Throwable
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      close();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      InternalAppEventsLogger localInternalAppEventsLogger = new com/facebook/appevents/InternalAppEventsLogger;
      localInternalAppEventsLogger.<init>(paramContext);
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>();
      paramContext.append("bf_");
      paramContext.append(paramIntent.getStringExtra("event_name"));
      paramContext = paramContext.toString();
      Bundle localBundle = paramIntent.getBundleExtra("event_args");
      paramIntent = new android/os/Bundle;
      paramIntent.<init>();
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramIntent.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String)localBundle.get(str));
      }
      localInternalAppEventsLogger.logEvent(paramContext, paramIntent);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.BoltsMeasurementEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.facebook.appevents;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

final class AnalyticsUserIDStore$2
  implements Runnable
{
  public AnalyticsUserIDStore$2(String paramString) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      AnalyticsUserIDStore.access$100().writeLock().lock();
      try
      {
        AnalyticsUserIDStore.access$202(val$id);
        SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        localEditor.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", AnalyticsUserIDStore.access$200());
        localEditor.apply();
        return;
      }
      finally
      {
        AnalyticsUserIDStore.access$100().writeLock().unlock();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AnalyticsUserIDStore.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
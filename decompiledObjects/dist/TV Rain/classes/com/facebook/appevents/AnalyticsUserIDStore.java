package com.facebook.appevents;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

class AnalyticsUserIDStore
{
  private static final String ANALYTICS_USER_ID_KEY = "com.facebook.appevents.AnalyticsUserIDStore.userID";
  private static final String TAG = "AnalyticsUserIDStore";
  private static volatile boolean initialized = false;
  private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
  private static String userID;
  
  public static String getUserID()
  {
    if (!initialized)
    {
      Log.w(TAG, "initStore should have been called before calling setUserID");
      initAndWait();
    }
    lock.readLock().lock();
    try
    {
      String str = userID;
      return str;
    }
    finally
    {
      lock.readLock().unlock();
    }
  }
  
  private static void initAndWait()
  {
    if (initialized) {
      return;
    }
    lock.writeLock().lock();
    try
    {
      boolean bool = initialized;
      if (bool) {
        return;
      }
      userID = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
      initialized = true;
      return;
    }
    finally
    {
      lock.writeLock().unlock();
    }
  }
  
  public static void initStore()
  {
    if (initialized) {
      return;
    }
    InternalAppEventsLogger.getAnalyticsExecutor().execute(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          AnalyticsUserIDStore.access$000();
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    });
  }
  
  public static void setUserID(String paramString)
  {
    
    if (!initialized)
    {
      Log.w(TAG, "initStore should have been called before calling setUserID");
      initAndWait();
    }
    InternalAppEventsLogger.getAnalyticsExecutor().execute(new Runnable()
    {
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
    });
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AnalyticsUserIDStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
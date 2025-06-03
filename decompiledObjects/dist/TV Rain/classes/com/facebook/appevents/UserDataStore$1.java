package com.facebook.appevents;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;

final class UserDataStore$1
  implements Runnable
{
  public UserDataStore$1(String paramString1, String paramString2) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (!UserDataStore.access$000().get()) {
        UserDataStore.access$100();
      }
      UserDataStore.access$200().edit().putString(val$key, val$value).apply();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.UserDataStore.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
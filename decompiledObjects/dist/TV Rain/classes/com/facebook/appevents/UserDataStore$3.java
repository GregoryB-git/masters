package com.facebook.appevents;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

final class UserDataStore$3
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (!UserDataStore.access$000().get())
      {
        Log.w(UserDataStore.access$300(), "initStore should have been called before calling setUserData");
        UserDataStore.access$100();
      }
      UserDataStore.access$500().clear();
      UserDataStore.access$200().edit().putString("com.facebook.appevents.UserDataStore.userData", null).apply();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.UserDataStore.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
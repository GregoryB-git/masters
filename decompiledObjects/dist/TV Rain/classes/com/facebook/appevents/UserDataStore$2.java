package com.facebook.appevents;

import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;

final class UserDataStore$2
  implements Runnable
{
  public UserDataStore$2(Bundle paramBundle) {}
  
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
      UserDataStore.access$400(val$ud);
      UserDataStore.access$600("com.facebook.appevents.UserDataStore.userData", Utility.mapToJsonStr(UserDataStore.access$500()));
      UserDataStore.access$600("com.facebook.appevents.UserDataStore.internalUserData", Utility.mapToJsonStr(UserDataStore.access$700()));
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.UserDataStore.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
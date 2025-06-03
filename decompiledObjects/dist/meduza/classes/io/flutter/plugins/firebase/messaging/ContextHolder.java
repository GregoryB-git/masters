package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.util.Log;

public class ContextHolder
{
  private static Context applicationContext;
  
  public static Context getApplicationContext()
  {
    return applicationContext;
  }
  
  public static void setApplicationContext(Context paramContext)
  {
    Log.d("FLTFireContextHolder", "received application context.");
    applicationContext = paramContext;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.ContextHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
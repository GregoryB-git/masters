package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public abstract class S
{
  public static SharedPreferences a(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {
      paramContext = localContext;
    }
    return paramContext.getSharedPreferences("com.google.firebase.messaging", 0);
  }
  
  public static boolean b(Context paramContext)
  {
    return a(paramContext).getBoolean("proxy_notification_initialized", false);
  }
  
  public static void c(Context paramContext, boolean paramBoolean)
  {
    paramContext = a(paramContext).edit();
    paramContext.putBoolean("proxy_notification_initialized", paramBoolean);
    paramContext.apply();
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.S
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
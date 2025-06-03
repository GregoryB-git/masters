package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public class h0$a
  extends BroadcastReceiver
{
  public h0 a;
  
  public h0$a(h0 paramh01, h0 paramh02)
  {
    a = paramh02;
  }
  
  public void a()
  {
    if (h0.b()) {
      Log.d("FirebaseMessaging", "Connectivity change received registered");
    }
    h0.d(b).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramIntent = a;
      if (paramIntent == null) {
        return;
      }
      boolean bool = h0.a(paramIntent);
      if (!bool) {
        return;
      }
      if (h0.b()) {
        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
      }
    }
    finally
    {
      break label75;
    }
    h0.c(a).m(a, 0L);
    paramContext.unregisterReceiver(this);
    a = null;
    return;
    label75:
    throw paramContext;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.h0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
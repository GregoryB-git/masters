package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public class c0$a
  extends BroadcastReceiver
{
  public c0 a;
  
  public c0$a(c0 paramc0)
  {
    a = paramc0;
  }
  
  public void a()
  {
    if (c0.c()) {
      Log.d("FirebaseMessaging", "Connectivity change received registered");
    }
    IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    a.b().registerReceiver(this, localIntentFilter);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = a;
    if (paramContext == null) {
      return;
    }
    if (!paramContext.d()) {
      return;
    }
    if (c0.c()) {
      Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
    }
    c0.a(a).p(a, 0L);
    a.b().unregisterReceiver(this);
    a = null;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.c0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public class c$a
  extends BroadcastReceiver
{
  public c a;
  
  public c$a(c paramc)
  {
    a = paramc;
  }
  
  public void a()
  {
    if (FirebaseInstanceId.r()) {
      Log.d("FirebaseInstanceId", "Connectivity change received registered");
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
    if (!paramContext.c()) {
      return;
    }
    if (FirebaseInstanceId.r()) {
      Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
    }
    c.a(a).g(a, 0L);
    a.b().unregisterReceiver(this);
    a = null;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
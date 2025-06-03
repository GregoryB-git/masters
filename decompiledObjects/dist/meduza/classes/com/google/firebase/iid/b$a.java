package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.util.Log;

public final class b$a
  extends BroadcastReceiver
{
  public b a;
  
  public b$a(b paramb)
  {
    a = paramb;
  }
  
  public final void a()
  {
    Object localObject = FirebaseInstanceId.j;
    boolean bool = Log.isLoggable("FirebaseInstanceId", 3);
    int i = 0;
    int j;
    if (!bool)
    {
      j = i;
      if (Build.VERSION.SDK_INT == 23)
      {
        j = i;
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {}
      }
    }
    else
    {
      j = 1;
    }
    if (j != 0) {
      Log.d("FirebaseInstanceId", "Connectivity change received registered");
    }
    localObject = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    a.a().registerReceiver(this, (IntentFilter)localObject);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = a;
    if (paramContext == null) {
      return;
    }
    if (!paramContext.b()) {
      return;
    }
    boolean bool = Log.isLoggable("FirebaseInstanceId", 3);
    int i = 0;
    int j;
    if (!bool)
    {
      j = i;
      if (Build.VERSION.SDK_INT == 23)
      {
        j = i;
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {}
      }
    }
    else
    {
      j = 1;
    }
    if (j != 0) {
      Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
    }
    paramContext = a;
    c.getClass();
    FirebaseInstanceId.e(paramContext, 0L);
    a.a().unregisterReceiver(this);
    a = null;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.firebase.messaging;

import E2.l;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Executor;

public class n
{
  public static final Object c = new Object();
  public static o0 d;
  public final Context a;
  public final Executor b;
  
  public n(Context paramContext)
  {
    a = paramContext;
    b = new r1.m();
  }
  
  public static V2.j e(Context paramContext, Intent paramIntent, boolean paramBoolean)
  {
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      Log.d("FirebaseMessaging", "Binding to service");
    }
    o0 localo0 = f(paramContext, "com.google.firebase.MESSAGING_EVENT");
    if (paramBoolean)
    {
      if (Y.b().e(paramContext)) {
        j0.f(paramContext, localo0, paramIntent);
      } else {
        localo0.c(paramIntent);
      }
      return V2.m.e(Integer.valueOf(-1));
    }
    return localo0.c(paramIntent).g(new r1.m(), new m());
  }
  
  public static o0 f(Context paramContext, String paramString)
  {
    synchronized (c)
    {
      if (d == null)
      {
        o0 localo0 = new com/google/firebase/messaging/o0;
        localo0.<init>(paramContext, paramString);
        d = localo0;
      }
    }
    paramContext = d;
    return paramContext;
  }
  
  public V2.j k(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("gcm.rawData64");
    if (str != null)
    {
      paramIntent.putExtra("rawData", Base64.decode(str, 0));
      paramIntent.removeExtra("gcm.rawData64");
    }
    return l(a, paramIntent);
  }
  
  public V2.j l(Context paramContext, Intent paramIntent)
  {
    boolean bool1 = l.h();
    boolean bool2 = false;
    int i;
    if ((bool1) && (getApplicationInfotargetSdkVersion >= 26)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((paramIntent.getFlags() & 0x10000000) != 0) {
      bool2 = true;
    }
    if ((i != 0) && (!bool2)) {
      return e(paramContext, paramIntent, bool2);
    }
    return V2.m.c(b, new j(paramContext, paramIntent)).h(b, new k(paramContext, paramIntent, bool2));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
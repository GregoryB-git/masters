package com.google.firebase.messaging;

import E2.l;
import V2.j;
import V2.k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Binder;
import java.util.concurrent.Executor;

public abstract class Q
{
  public static boolean b(Context paramContext)
  {
    boolean bool;
    if (Binder.getCallingUid() == getApplicationInfouid) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void c(Context paramContext)
  {
    if (S.b(paramContext)) {
      return;
    }
    e(new r1.m(), paramContext, f(paramContext));
  }
  
  public static j e(Executor paramExecutor, Context paramContext, boolean paramBoolean)
  {
    if (!l.j()) {
      return V2.m.e(null);
    }
    k localk = new k();
    paramExecutor.execute(new P(paramContext, paramBoolean, localk));
    return localk.a();
  }
  
  public static boolean f(Context paramContext)
  {
    try
    {
      Object localObject = paramContext.getApplicationContext();
      paramContext = ((Context)localObject).getPackageManager();
      if (paramContext != null)
      {
        paramContext = paramContext.getApplicationInfo(((Context)localObject).getPackageName(), 128);
        if (paramContext != null)
        {
          localObject = metaData;
          if ((localObject != null) && (((BaseBundle)localObject).containsKey("firebase_messaging_notification_delegation_enabled")))
          {
            boolean bool = metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            return bool;
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.Q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
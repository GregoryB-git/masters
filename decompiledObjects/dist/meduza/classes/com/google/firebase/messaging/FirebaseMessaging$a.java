package com.google.firebase.messaging;

import aa.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import c9.d;
import u7.f;

public final class FirebaseMessaging$a
{
  public final d a;
  public boolean b;
  public m c;
  public Boolean d;
  
  public FirebaseMessaging$a(FirebaseMessaging paramFirebaseMessaging, d paramd)
  {
    a = paramd;
  }
  
  public final void a()
  {
    try
    {
      boolean bool = b;
      if (bool) {
        return;
      }
      Object localObject1 = b();
      d = ((Boolean)localObject1);
      if (localObject1 == null)
      {
        localObject1 = new aa/m;
        ((m)localObject1).<init>(this);
        c = ((m)localObject1);
        a.a((m)localObject1);
      }
      b = true;
      return;
    }
    finally {}
  }
  
  public final Boolean b()
  {
    Object localObject1 = e.a;
    ((f)localObject1).a();
    localObject1 = a;
    Object localObject2 = ((Context)localObject1).getSharedPreferences("com.google.firebase.messaging", 0);
    if (((SharedPreferences)localObject2).contains("auto_init")) {
      return Boolean.valueOf(((SharedPreferences)localObject2).getBoolean("auto_init", false));
    }
    try
    {
      localObject2 = ((Context)localObject1).getPackageManager();
      if (localObject2 != null)
      {
        localObject1 = ((PackageManager)localObject2).getApplicationInfo(((Context)localObject1).getPackageName(), 128);
        if (localObject1 != null)
        {
          localObject2 = metaData;
          if ((localObject2 != null) && (((BaseBundle)localObject2).containsKey("firebase_messaging_auto_init_enabled")))
          {
            boolean bool = metaData.getBoolean("firebase_messaging_auto_init_enabled");
            return Boolean.valueOf(bool);
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.FirebaseMessaging.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import n4.d;
import s3.e;

public class FirebaseMessaging$a
{
  public final d a;
  public boolean b;
  public n4.b c;
  public Boolean d;
  
  public FirebaseMessaging$a(FirebaseMessaging paramFirebaseMessaging, d paramd)
  {
    a = paramd;
  }
  
  public void b()
  {
    try
    {
      boolean bool = b;
      if (bool) {
        return;
      }
      Object localObject1 = e();
      d = ((Boolean)localObject1);
      if (localObject1 == null)
      {
        localObject1 = new com/google/firebase/messaging/C;
        ((C)localObject1).<init>(this);
        c = ((n4.b)localObject1);
        a.c(s3.b.class, (n4.b)localObject1);
      }
    }
    finally
    {
      break label69;
    }
    b = true;
    return;
    label69:
    throw ((Throwable)localObject2);
  }
  
  public boolean c()
  {
    try
    {
      b();
      Boolean localBoolean = d;
      if (localBoolean != null) {
        bool = localBoolean.booleanValue();
      }
    }
    finally
    {
      break label42;
    }
    boolean bool = FirebaseMessaging.l(e).x();
    return bool;
    label42:
    throw ((Throwable)localObject);
  }
  
  public final Boolean e()
  {
    Object localObject1 = FirebaseMessaging.l(e).m();
    Object localObject2 = ((Context)localObject1).getSharedPreferences("com.google.firebase.messaging", 0);
    if (((SharedPreferences)localObject2).contains("auto_init")) {
      return Boolean.valueOf(((SharedPreferences)localObject2).getBoolean("auto_init", false));
    }
    try
    {
      localObject2 = ((Context)localObject1).getPackageManager();
      if (localObject2 != null)
      {
        localObject2 = ((PackageManager)localObject2).getApplicationInfo(((Context)localObject1).getPackageName(), 128);
        if (localObject2 != null)
        {
          localObject1 = metaData;
          if ((localObject1 != null) && (((BaseBundle)localObject1).containsKey("firebase_messaging_auto_init_enabled")))
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
  
  public void f(boolean paramBoolean)
  {
    try
    {
      b();
      n4.b localb = c;
      if (localb != null)
      {
        a.d(s3.b.class, localb);
        c = null;
      }
    }
    finally
    {
      break label99;
    }
    SharedPreferences.Editor localEditor = FirebaseMessaging.l(e).m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
    localEditor.putBoolean("auto_init", paramBoolean);
    localEditor.apply();
    if (paramBoolean) {
      FirebaseMessaging.m(e);
    }
    d = Boolean.valueOf(paramBoolean);
    return;
    label99:
    throw localEditor;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.FirebaseMessaging.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
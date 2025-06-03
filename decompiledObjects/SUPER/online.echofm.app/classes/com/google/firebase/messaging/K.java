package com.google.firebase.messaging;

import E2.l;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.List;
import s3.e;
import s3.m;

public class K
{
  public final Context a;
  public String b;
  public String c;
  public int d;
  public int e = 0;
  
  public K(Context paramContext)
  {
    a = paramContext;
  }
  
  public static String c(e parame)
  {
    String str = parame.r().f();
    if (str != null) {
      return str;
    }
    parame = parame.r().c();
    if (!parame.startsWith("1:")) {
      return parame;
    }
    parame = parame.split(":");
    if (parame.length < 2) {
      return null;
    }
    parame = parame[1];
    if (parame.isEmpty()) {
      return null;
    }
    return parame;
  }
  
  public String a()
  {
    try
    {
      if (b == null) {
        h();
      }
    }
    finally
    {
      break label29;
    }
    String str = b;
    return str;
    label29:
    throw str;
  }
  
  public String b()
  {
    try
    {
      if (c == null) {
        h();
      }
    }
    finally
    {
      break label29;
    }
    String str = c;
    return str;
    label29:
    throw str;
  }
  
  public int d()
  {
    try
    {
      if (d == 0)
      {
        PackageInfo localPackageInfo = f("com.google.android.gms");
        if (localPackageInfo != null) {
          d = versionCode;
        }
      }
    }
    finally
    {
      break label44;
    }
    int i = d;
    return i;
    label44:
    throw ((Throwable)localObject);
  }
  
  public int e()
  {
    List localList;
    label185:
    try
    {
      i = e;
      if (i != 0) {
        return i;
      }
      PackageManager localPackageManager = a.getPackageManager();
      if (localPackageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1)
      {
        Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
        return 0;
      }
    }
    finally
    {
      break label185;
      if (!l.h())
      {
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>("com.google.android.c2dm.intent.REGISTER");
        ((Intent)localObject2).setPackage("com.google.android.gms");
        localObject2 = ((PackageManager)localObject1).queryIntentServices((Intent)localObject2, 0);
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          e = 1;
          return 1;
        }
      }
      Object localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>("com.google.iid.TOKEN_REQUEST");
      ((Intent)localObject2).setPackage("com.google.android.gms");
      localList = ((PackageManager)localObject1).queryBroadcastReceivers((Intent)localObject2, 0);
      if ((localList != null) && (localList.size() > 0))
      {
        e = 2;
        return 2;
      }
      Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
      if (l.h()) {
        e = 2;
      } else {
        e = 1;
      }
      int i = e;
      return i;
    }
  }
  
  public final PackageInfo f(String paramString)
  {
    try
    {
      paramString = a.getPackageManager().getPackageInfo(paramString, 0);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to find package ");
      localStringBuilder.append(paramString);
      Log.w("FirebaseMessaging", localStringBuilder.toString());
    }
    return null;
  }
  
  public boolean g()
  {
    boolean bool;
    if (e() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void h()
  {
    try
    {
      PackageInfo localPackageInfo = f(a.getPackageName());
      if (localPackageInfo != null)
      {
        b = Integer.toString(versionCode);
        c = versionName;
      }
    }
    finally
    {
      break label47;
    }
    return;
    label47:
    throw ((Throwable)localObject);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
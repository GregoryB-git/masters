package com.google.android.gms.internal.measurement;

import W2.l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.util.Log;

public abstract class Q2
{
  public static volatile l a = ;
  public static final Object b = new Object();
  
  public static boolean a(Context paramContext)
  {
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getApplicationInfo("com.google.android.gms", 0);
      if ((flags & 0x81) != 0) {
        return true;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static boolean b(Context paramContext, Uri arg1)
  {
    ??? = ???.getAuthority();
    boolean bool1 = "com.google.android.gms.phenotype".equals(???);
    boolean bool2 = false;
    if (!bool1)
    {
      paramContext = new StringBuilder();
      paramContext.append(???);
      paramContext.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
      Log.e("PhenotypeClientHelper", paramContext.toString());
      return false;
    }
    if (a.c()) {
      return ((Boolean)a.b()).booleanValue();
    }
    Object localObject;
    int i;
    synchronized (b)
    {
      if (a.c())
      {
        bool1 = ((Boolean)a.b()).booleanValue();
        return bool1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Q2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
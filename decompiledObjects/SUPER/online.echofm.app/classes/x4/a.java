package x4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import n4.c;

public class a
{
  public final Context a;
  public final SharedPreferences b;
  public final c c;
  public boolean d;
  
  public a(Context paramContext, String paramString, c paramc)
  {
    paramContext = a(paramContext);
    a = paramContext;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("com.google.firebase.common.prefs:");
    localStringBuilder.append(paramString);
    b = paramContext.getSharedPreferences(localStringBuilder.toString(), 0);
    c = paramc;
    d = c();
  }
  
  public static Context a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 24) {
      return paramContext;
    }
    return x.a.b(paramContext);
  }
  
  public boolean b()
  {
    try
    {
      boolean bool = d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean c()
  {
    if (b.contains("firebase_data_collection_default_enabled")) {
      return b.getBoolean("firebase_data_collection_default_enabled", true);
    }
    return d();
  }
  
  public final boolean d()
  {
    try
    {
      Object localObject = a.getPackageManager();
      if (localObject != null)
      {
        localObject = ((PackageManager)localObject).getApplicationInfo(a.getPackageName(), 128);
        if (localObject != null)
        {
          Bundle localBundle = metaData;
          if ((localBundle != null) && (localBundle.containsKey("firebase_data_collection_default_enabled")))
          {
            boolean bool = metaData.getBoolean("firebase_data_collection_default_enabled");
            return bool;
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return true;
  }
  
  public void e(Boolean paramBoolean)
  {
    if (paramBoolean == null) {}
    for (;;)
    {
      try
      {
        b.edit().remove("firebase_data_collection_default_enabled").apply();
        bool = d();
        f(bool);
      }
      finally
      {
        break label80;
      }
      boolean bool = Boolean.TRUE.equals(paramBoolean);
      b.edit().putBoolean("firebase_data_collection_default_enabled", bool).apply();
    }
    return;
    label80:
    throw paramBoolean;
  }
  
  /* Error */
  public final void f(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 50	x4/a:d	Z
    //   6: iload_1
    //   7: if_icmpeq +50 -> 57
    //   10: aload_0
    //   11: iload_1
    //   12: putfield 50	x4/a:d	Z
    //   15: aload_0
    //   16: getfield 45	x4/a:c	Ln4/c;
    //   19: astore_2
    //   20: new 138	n4/a
    //   23: astore_3
    //   24: new 140	s3/b
    //   27: astore 4
    //   29: aload 4
    //   31: iload_1
    //   32: invokespecial 142	s3/b:<init>	(Z)V
    //   35: aload_3
    //   36: ldc -116
    //   38: aload 4
    //   40: invokespecial 145	n4/a:<init>	(Ljava/lang/Class;Ljava/lang/Object;)V
    //   43: aload_2
    //   44: aload_3
    //   45: invokeinterface 150 2 0
    //   50: goto +7 -> 57
    //   53: astore_3
    //   54: goto +6 -> 60
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_3
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	a
    //   0	64	1	paramBoolean	boolean
    //   19	25	2	localc	c
    //   23	22	3	locala	n4.a
    //   53	10	3	localObject	Object
    //   27	12	4	localb	s3.b
    // Exception table:
    //   from	to	target	type
    //   2	50	53	finally
  }
}

/* Location:
 * Qualified Name:     x4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
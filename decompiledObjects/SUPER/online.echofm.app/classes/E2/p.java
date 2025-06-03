package E2;

import G2.c;
import G2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public abstract class p
{
  public static final int a = ;
  public static final Method b;
  public static final Method c;
  public static final Method d;
  public static final Method e;
  public static final Method f;
  public static final Method g;
  public static final Method h;
  public static final Method i;
  
  static
  {
    Method localMethod1 = null;
    Object localObject1 = null;
    try
    {
      Method localMethod2 = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE });
    }
    catch (Exception localException2)
    {
      localMethod3 = null;
    }
    b = localMethod3;
    if (l.c()) {}
    try
    {
      localMethod3 = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE, String.class });
    }
    catch (Exception localException7)
    {
      Method localMethod4;
      Method localMethod5;
      for (;;) {}
    }
    Method localMethod3 = null;
    c = localMethod3;
    try
    {
      localMethod3 = WorkSource.class.getMethod("size", new Class[0]);
    }
    catch (Exception localException3)
    {
      localMethod4 = null;
    }
    d = localMethod4;
    try
    {
      localMethod4 = WorkSource.class.getMethod("get", new Class[] { Integer.TYPE });
    }
    catch (Exception localException4)
    {
      localMethod5 = null;
    }
    e = localMethod5;
    if (l.c()) {}
    try
    {
      localMethod5 = WorkSource.class.getMethod("getName", new Class[] { Integer.TYPE });
    }
    catch (Exception localException8)
    {
      Method localMethod6;
      Object localObject2;
      for (;;) {}
    }
    localMethod5 = null;
    f = localMethod5;
    if (l.i()) {
      try
      {
        localMethod5 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
      }
      catch (Exception localException5)
      {
        Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", localException5);
      }
    } else {
      localMethod6 = null;
    }
    g = localMethod6;
    if (l.i()) {
      try
      {
        localMethod6 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] { Integer.TYPE, String.class });
      }
      catch (Exception localException6)
      {
        Log.w("WorkSourceUtil", "Missing WorkChain class", localException6);
      }
    } else {
      localObject2 = null;
    }
    h = (Method)localObject2;
    localObject2 = localObject1;
    if (l.i()) {
      localObject2 = localMethod1;
    }
    try
    {
      localMethod1 = WorkSource.class.getMethod("isEmpty", new Class[0]);
      localObject2 = localMethod1;
      localMethod1.setAccessible(true);
      localObject2 = localMethod1;
    }
    catch (Exception localException1)
    {
      for (;;) {}
    }
    i = (Method)localObject2;
  }
  
  public static void a(WorkSource paramWorkSource, int paramInt, String paramString)
  {
    Method localMethod = c;
    if (localMethod != null)
    {
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      try
      {
        localMethod.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt), str });
        return;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
        return;
      }
    }
    paramString = b;
    if (paramString != null) {
      try
      {
        paramString.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
        return;
      }
      catch (Exception paramWorkSource)
      {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", paramWorkSource);
      }
    }
  }
  
  public static WorkSource b(Context paramContext, String paramString)
  {
    if ((paramContext != null) && (paramContext.getPackageManager() != null) && (paramString != null))
    {
      try
      {
        paramContext = d.a(paramContext).c(paramString, 0);
        if (paramContext != null) {
          break label45;
        }
        paramContext = "Could not get applicationInfo from package: ";
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        for (;;)
        {
          label45:
          int j;
          paramContext = "Could not find package: ";
        }
      }
      Log.e("WorkSourceUtil", paramContext.concat(paramString));
      return null;
      j = uid;
      paramContext = new WorkSource();
      a(paramContext, j, paramString);
      return paramContext;
    }
    return null;
  }
  
  public static boolean c(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    if (paramContext.getPackageManager() == null) {
      return false;
    }
    return d.a(paramContext).b("android.permission.UPDATE_DEVICE_STATS", paramContext.getPackageName()) == 0;
  }
}

/* Location:
 * Qualified Name:     E2.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
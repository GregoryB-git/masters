package j6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class j
{
  @Deprecated
  public static final AtomicBoolean a = new AtomicBoolean();
  public static boolean b = false;
  public static boolean c = false;
  public static final AtomicBoolean d = new AtomicBoolean();
  
  @Deprecated
  public static void a(Context paramContext, int paramInt)
  {
    Object localObject = f.b;
    paramInt = ((f)localObject).c(paramContext, paramInt);
    if (paramInt != 0)
    {
      paramContext = ((f)localObject).a(paramContext, "e", paramInt);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("GooglePlayServices not available due to error ");
      ((StringBuilder)localObject).append(paramInt);
      Log.e("GooglePlayServicesUtil", ((StringBuilder)localObject).toString());
      if (paramContext == null) {
        throw new g(paramInt);
      }
      throw new h(paramInt, paramContext);
    }
  }
  
  /* Error */
  public static boolean b(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 77	j6/j:c	Z
    //   3: ifne +81 -> 84
    //   6: aload_0
    //   7: invokestatic 82	x6/d:a	(Landroid/content/Context;)Lx6/c;
    //   10: bipush 64
    //   12: ldc 84
    //   14: invokevirtual 89	x6/c:b	(ILjava/lang/String;)Landroid/content/pm/PackageInfo;
    //   17: astore_1
    //   18: aload_0
    //   19: invokestatic 94	j6/k:a	(Landroid/content/Context;)Lj6/k;
    //   22: pop
    //   23: aload_1
    //   24: ifnull +26 -> 50
    //   27: aload_1
    //   28: iconst_0
    //   29: invokestatic 97	j6/k:d	(Landroid/content/pm/PackageInfo;Z)Z
    //   32: ifne +18 -> 50
    //   35: aload_1
    //   36: iconst_1
    //   37: invokestatic 97	j6/k:d	(Landroid/content/pm/PackageInfo;Z)Z
    //   40: ifeq +10 -> 50
    //   43: iconst_1
    //   44: putstatic 99	j6/j:b	Z
    //   47: goto +24 -> 71
    //   50: iconst_0
    //   51: putstatic 99	j6/j:b	Z
    //   54: goto +17 -> 71
    //   57: astore_0
    //   58: goto +20 -> 78
    //   61: astore_0
    //   62: ldc 52
    //   64: ldc 101
    //   66: aload_0
    //   67: invokestatic 105	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   70: pop
    //   71: iconst_1
    //   72: putstatic 77	j6/j:c	Z
    //   75: goto +9 -> 84
    //   78: iconst_1
    //   79: putstatic 77	j6/j:c	Z
    //   82: aload_0
    //   83: athrow
    //   84: getstatic 99	j6/j:b	Z
    //   87: ifne +19 -> 106
    //   90: ldc 107
    //   92: getstatic 113	android/os/Build:TYPE	Ljava/lang/String;
    //   95: invokevirtual 119	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   98: ifne +6 -> 104
    //   101: goto +5 -> 106
    //   104: iconst_0
    //   105: ireturn
    //   106: iconst_1
    //   107: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	paramContext	Context
    //   17	19	1	localPackageInfo	android.content.pm.PackageInfo
    // Exception table:
    //   from	to	target	type
    //   6	23	57	finally
    //   27	47	57	finally
    //   50	54	57	finally
    //   62	71	57	finally
    //   6	23	61	android/content/pm/PackageManager$NameNotFoundException
    //   27	47	61	android/content/pm/PackageManager$NameNotFoundException
    //   50	54	61	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public static boolean c(Context paramContext)
  {
    try
    {
      Object localObject = paramContext.getPackageManager().getPackageInstaller().getAllSessions();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if ("com.google.android.gms".equals(((PackageInstaller.SessionInfo)((Iterator)localObject).next()).getAppPackageName())) {
          return true;
        }
      }
      paramContext = paramContext.getPackageManager();
      boolean bool = getApplicationInfo"com.google.android.gms"8192enabled;
      return bool;
    }
    catch (Exception|PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     j6.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
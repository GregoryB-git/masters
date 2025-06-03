package G1;

import O1.C;
import O1.C.a;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import x1.N;
import y1.F;
import y1.F.a;
import y1.p.b;

public final class n
{
  public static final n a = new n();
  public static final String b = n.class.getCanonicalName();
  public static final long[] c = { 300000L, 900000L, 1800000L, 3600000L, 21600000L, 43200000L, 86400000L, 172800000L, 259200000L, 604800000L, 1209600000L, 1814400000L, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L };
  
  /* Error */
  public static final int b(long paramLong)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 74	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: iconst_0
    //   11: istore_2
    //   12: getstatic 65	G1/n:c	[J
    //   15: astore_3
    //   16: iload_2
    //   17: aload_3
    //   18: arraylength
    //   19: if_icmpge +25 -> 44
    //   22: aload_3
    //   23: iload_2
    //   24: laload
    //   25: lstore 4
    //   27: lload 4
    //   29: lload_0
    //   30: lcmp
    //   31: ifge +13 -> 44
    //   34: iinc 2 1
    //   37: goto -25 -> 12
    //   40: astore_3
    //   41: goto +5 -> 46
    //   44: iload_2
    //   45: ireturn
    //   46: aload_3
    //   47: ldc 2
    //   49: invokestatic 77	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   52: iconst_0
    //   53: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	paramLong	long
    //   11	34	2	i	int
    //   15	8	3	arrayOfLong	long[]
    //   40	7	3	localThrowable	Throwable
    //   25	3	4	l	long
    // Exception table:
    //   from	to	target	type
    //   12	22	40	finally
  }
  
  public static final void c(String paramString1, o paramo, String paramString2, Context paramContext)
  {
    if (T1.a.d(n.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString1, "activityName");
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Object localObject = "Unclassified";
      if (paramo == null)
      {
        paramo = (o)localObject;
      }
      else
      {
        paramo = paramo.toString();
        if (paramo == null) {
          paramo = (o)localObject;
        }
      }
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      ((BaseBundle)localObject).putString("fb_mobile_launch_source", paramo);
      ((BaseBundle)localObject).putString("fb_mobile_pckg_fp", a.a(paramContext));
      ((BaseBundle)localObject).putString("fb_mobile_app_cert_hash", X1.a.a(paramContext));
      paramo = F.b;
      paramString1 = paramo.a(paramString1, paramString2, null);
      paramString1.d("fb_mobile_activate_app", (Bundle)localObject);
      if (paramo.c() != p.b.p) {
        paramString1.a();
      }
    }
    finally
    {
      break label135;
    }
    return;
    label135:
    T1.a.b(paramString1, n.class);
  }
  
  public static final void e(String paramString1, m paramm, String paramString2)
  {
    if (T1.a.d(n.class)) {
      return;
    }
    long l1;
    try
    {
      Intrinsics.checkNotNullParameter(paramString1, "activityName");
      if (paramm == null) {
        return;
      }
      localObject1 = paramm.b();
      l1 = 0L;
      if (localObject1 == null)
      {
        localObject1 = paramm.e();
        if (localObject1 == null) {
          l2 = 0L;
        } else {
          l2 = ((Long)localObject1).longValue();
        }
        l2 = 0L - l2;
      }
    }
    finally
    {
      break label289;
    }
    long l2 = ((Long)localObject1).longValue();
    long l3 = l2;
    if (l2 < 0L)
    {
      a.d();
      l3 = 0L;
    }
    long l4 = paramm.f();
    l2 = l4;
    if (l4 < 0L)
    {
      a.d();
      l2 = 0L;
    }
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putInt("fb_mobile_app_interruptions", paramm.c());
    Object localObject1 = x.a;
    localObject1 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[] { Integer.valueOf(b(l3)) }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject1, "java.lang.String.format(locale, format, *args)");
    localBundle.putString("fb_mobile_time_between_sessions", (String)localObject1);
    Object localObject2 = paramm.g();
    localObject1 = "Unclassified";
    if (localObject2 != null)
    {
      localObject2 = ((o)localObject2).toString();
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    localBundle.putString("fb_mobile_launch_source", (String)localObject1);
    paramm = paramm.e();
    if (paramm == null) {
      l3 = l1;
    } else {
      l3 = paramm.longValue();
    }
    localBundle.putLong("_logTime", l3 / 'Ϩ');
    F.b.a(paramString1, paramString2, null).c("fb_mobile_deactivate_app", l2 / 1000L, localBundle);
    return;
    label289:
    T1.a.b(paramString1, n.class);
  }
  
  /* Error */
  public final String a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 74	T1/a:d	(Ljava/lang/Object;)Z
    //   4: istore_2
    //   5: aconst_null
    //   6: astore_3
    //   7: iload_2
    //   8: ifeq +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: aload_1
    //   14: invokevirtual 236	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   17: astore 4
    //   19: ldc -18
    //   21: aload 4
    //   23: aload_1
    //   24: invokevirtual 241	android/content/Context:getPackageName	()Ljava/lang/String;
    //   27: iconst_0
    //   28: invokevirtual 247	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   31: getfield 252	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   34: invokestatic 256	kotlin/jvm/internal/Intrinsics:i	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   37: astore 5
    //   39: aload_1
    //   40: ldc_w 258
    //   43: iconst_0
    //   44: invokevirtual 262	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   47: astore 6
    //   49: aload 6
    //   51: aload 5
    //   53: aconst_null
    //   54: invokeinterface 268 3 0
    //   59: astore 7
    //   61: aload 7
    //   63: ifnull +20 -> 83
    //   66: aload 7
    //   68: invokevirtual 271	java/lang/String:length	()I
    //   71: bipush 32
    //   73: if_icmpne +10 -> 83
    //   76: aload 7
    //   78: areturn
    //   79: astore_1
    //   80: goto +70 -> 150
    //   83: aload_1
    //   84: aconst_null
    //   85: invokestatic 276	G1/l:c	(Landroid/content/Context;Ljava/lang/Long;)Ljava/lang/String;
    //   88: astore 7
    //   90: aload 7
    //   92: ifnull +9 -> 101
    //   95: aload 7
    //   97: astore_1
    //   98: goto +29 -> 127
    //   101: aload 4
    //   103: aload_1
    //   104: invokevirtual 241	android/content/Context:getPackageName	()Ljava/lang/String;
    //   107: iconst_0
    //   108: invokevirtual 280	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   111: astore_1
    //   112: aload_1
    //   113: ldc_w 282
    //   116: invokestatic 209	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   119: aload_1
    //   120: getfield 287	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   123: invokestatic 290	G1/l:b	(Ljava/lang/String;)Ljava/lang/String;
    //   126: astore_1
    //   127: aload 6
    //   129: invokeinterface 294 1 0
    //   134: aload 5
    //   136: aload_1
    //   137: invokeinterface 299 3 0
    //   142: invokeinterface 302 1 0
    //   147: goto +10 -> 157
    //   150: aload_1
    //   151: aload_0
    //   152: invokestatic 77	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   155: aload_3
    //   156: astore_1
    //   157: aload_1
    //   158: areturn
    //   159: astore_1
    //   160: aload_3
    //   161: astore_1
    //   162: goto -5 -> 157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	n
    //   0	165	1	paramContext	Context
    //   4	4	2	bool	boolean
    //   6	155	3	localObject	Object
    //   17	85	4	localPackageManager	android.content.pm.PackageManager
    //   37	98	5	str1	String
    //   47	81	6	localSharedPreferences	android.content.SharedPreferences
    //   59	37	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   13	61	79	finally
    //   66	76	79	finally
    //   83	90	79	finally
    //   101	127	79	finally
    //   127	147	79	finally
    //   13	61	159	java/lang/Exception
    //   66	76	159	java/lang/Exception
    //   83	90	159	java/lang/Exception
    //   101	127	159	java/lang/Exception
    //   127	147	159	java/lang/Exception
  }
  
  public final void d()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      C.a locala = C.e;
      N localN = N.s;
      String str = b;
      Intrinsics.b(str);
      locala.b(localN, str, "Clock skew detected");
      return;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     G1.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
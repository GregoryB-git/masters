package x2;

import E2.l;
import E2.o;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.UserManager;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class n
{
  public static final int a = 12451000;
  public static final AtomicBoolean b = new AtomicBoolean();
  public static boolean c = false;
  public static boolean d = false;
  public static final AtomicBoolean e = new AtomicBoolean();
  
  public static int a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return versionCode;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
    }
    return 0;
  }
  
  public static String b(int paramInt)
  {
    return b.k(paramInt);
  }
  
  public static Resources c(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  /* Error */
  public static boolean d(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 72	x2/n:d	Z
    //   3: ifne +84 -> 87
    //   6: aload_0
    //   7: invokestatic 77	G2/d:a	(Landroid/content/Context;)LG2/c;
    //   10: ldc 37
    //   12: bipush 64
    //   14: invokevirtual 81	G2/c:e	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   17: astore_1
    //   18: aload_0
    //   19: invokestatic 86	x2/o:a	(Landroid/content/Context;)Lx2/o;
    //   22: pop
    //   23: aload_1
    //   24: ifnull +34 -> 58
    //   27: aload_1
    //   28: iconst_0
    //   29: invokestatic 89	x2/o:e	(Landroid/content/pm/PackageInfo;Z)Z
    //   32: ifne +26 -> 58
    //   35: aload_1
    //   36: iconst_1
    //   37: invokestatic 89	x2/o:e	(Landroid/content/pm/PackageInfo;Z)Z
    //   40: ifeq +18 -> 58
    //   43: iconst_1
    //   44: putstatic 91	x2/n:c	Z
    //   47: goto +15 -> 62
    //   50: astore_0
    //   51: goto +30 -> 81
    //   54: astore_0
    //   55: goto +14 -> 69
    //   58: iconst_0
    //   59: putstatic 91	x2/n:c	Z
    //   62: iconst_1
    //   63: putstatic 72	x2/n:d	Z
    //   66: goto +21 -> 87
    //   69: ldc 50
    //   71: ldc 93
    //   73: aload_0
    //   74: invokestatic 96	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   77: pop
    //   78: goto -16 -> 62
    //   81: iconst_1
    //   82: putstatic 72	x2/n:d	Z
    //   85: aload_0
    //   86: athrow
    //   87: getstatic 91	x2/n:c	Z
    //   90: ifne +14 -> 104
    //   93: invokestatic 101	E2/i:b	()Z
    //   96: ifne +6 -> 102
    //   99: goto +5 -> 104
    //   102: iconst_0
    //   103: ireturn
    //   104: iconst_1
    //   105: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	paramContext	Context
    //   17	19	1	localPackageInfo	PackageInfo
    // Exception table:
    //   from	to	target	type
    //   6	23	50	finally
    //   27	47	50	finally
    //   58	62	50	finally
    //   69	78	50	finally
    //   6	23	54	android/content/pm/PackageManager$NameNotFoundException
    //   27	47	54	android/content/pm/PackageManager$NameNotFoundException
    //   58	62	54	android/content/pm/PackageManager$NameNotFoundException
  }
  
  /* Error */
  public static int e(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 106	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   4: getstatic 110	x2/p:a	I
    //   7: invokevirtual 115	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   10: pop
    //   11: goto +12 -> 23
    //   14: astore_2
    //   15: ldc 50
    //   17: ldc 117
    //   19: invokestatic 119	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   22: pop
    //   23: ldc 37
    //   25: aload_0
    //   26: invokevirtual 123	android/content/Context:getPackageName	()Ljava/lang/String;
    //   29: invokevirtual 129	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   32: ifne +51 -> 83
    //   35: getstatic 25	x2/n:e	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   38: invokevirtual 132	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   41: ifeq +6 -> 47
    //   44: goto +39 -> 83
    //   47: aload_0
    //   48: invokestatic 136	A2/Q:a	(Landroid/content/Context;)I
    //   51: istore_3
    //   52: iload_3
    //   53: ifeq +22 -> 75
    //   56: iload_3
    //   57: getstatic 137	x2/n:a	I
    //   60: if_icmpne +6 -> 66
    //   63: goto +20 -> 83
    //   66: new 139	com/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException
    //   69: dup
    //   70: iload_3
    //   71: invokespecial 142	com/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException:<init>	(I)V
    //   74: athrow
    //   75: new 144	com/google/android/gms/common/GooglePlayServicesMissingManifestValueException
    //   78: dup
    //   79: invokespecial 145	com/google/android/gms/common/GooglePlayServicesMissingManifestValueException:<init>	()V
    //   82: athrow
    //   83: aload_0
    //   84: invokestatic 147	E2/i:d	(Landroid/content/Context;)Z
    //   87: istore 4
    //   89: iconst_1
    //   90: istore 5
    //   92: iload 4
    //   94: ifne +15 -> 109
    //   97: aload_0
    //   98: invokestatic 150	E2/i:f	(Landroid/content/Context;)Z
    //   101: ifne +8 -> 109
    //   104: iconst_1
    //   105: istore_3
    //   106: goto +5 -> 111
    //   109: iconst_0
    //   110: istore_3
    //   111: iload_1
    //   112: iflt +9 -> 121
    //   115: iconst_1
    //   116: istore 4
    //   118: goto +6 -> 124
    //   121: iconst_0
    //   122: istore 4
    //   124: iload 4
    //   126: invokestatic 155	A2/n:a	(Z)V
    //   129: aload_0
    //   130: invokevirtual 123	android/content/Context:getPackageName	()Ljava/lang/String;
    //   133: astore 6
    //   135: aload_0
    //   136: invokevirtual 35	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   139: astore 7
    //   141: iload_3
    //   142: ifeq +44 -> 186
    //   145: aload 7
    //   147: ldc -99
    //   149: sipush 8256
    //   152: invokevirtual 43	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   155: astore_2
    //   156: goto +32 -> 188
    //   159: astore_0
    //   160: aload 6
    //   162: invokestatic 161	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   165: astore_0
    //   166: ldc -93
    //   168: astore_2
    //   169: ldc 50
    //   171: aload_0
    //   172: aload_2
    //   173: invokevirtual 167	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   176: invokestatic 58	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   179: pop
    //   180: bipush 9
    //   182: istore_1
    //   183: goto +276 -> 459
    //   186: aconst_null
    //   187: astore_2
    //   188: aload 7
    //   190: ldc 37
    //   192: bipush 64
    //   194: invokevirtual 43	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   197: astore 8
    //   199: aload_0
    //   200: invokestatic 86	x2/o:a	(Landroid/content/Context;)Lx2/o;
    //   203: pop
    //   204: aload 8
    //   206: iconst_1
    //   207: invokestatic 89	x2/o:e	(Landroid/content/pm/PackageInfo;Z)Z
    //   210: ifne +15 -> 225
    //   213: aload 6
    //   215: invokestatic 161	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   218: astore_0
    //   219: ldc -87
    //   221: astore_2
    //   222: goto -53 -> 169
    //   225: iload_3
    //   226: ifeq +28 -> 254
    //   229: aload_2
    //   230: invokestatic 173	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   233: pop
    //   234: aload_2
    //   235: iconst_1
    //   236: invokestatic 89	x2/o:e	(Landroid/content/pm/PackageInfo;Z)Z
    //   239: ifne +15 -> 254
    //   242: aload 6
    //   244: invokestatic 161	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   247: astore_0
    //   248: ldc -81
    //   250: astore_2
    //   251: goto -82 -> 169
    //   254: iload_3
    //   255: ifeq +38 -> 293
    //   258: aload_2
    //   259: ifnull +34 -> 293
    //   262: aload_2
    //   263: getfield 179	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   266: iconst_0
    //   267: aaload
    //   268: aload 8
    //   270: getfield 179	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   273: iconst_0
    //   274: aaload
    //   275: invokevirtual 182	android/content/pm/Signature:equals	(Ljava/lang/Object;)Z
    //   278: ifne +15 -> 293
    //   281: aload 6
    //   283: invokestatic 161	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   286: astore_0
    //   287: ldc -72
    //   289: astore_2
    //   290: goto -121 -> 169
    //   293: aload 8
    //   295: getfield 48	android/content/pm/PackageInfo:versionCode	I
    //   298: invokestatic 189	E2/q:a	(I)I
    //   301: iload_1
    //   302: invokestatic 189	E2/q:a	(I)I
    //   305: if_icmpge +72 -> 377
    //   308: aload 8
    //   310: getfield 48	android/content/pm/PackageInfo:versionCode	I
    //   313: istore_3
    //   314: new 191	java/lang/StringBuilder
    //   317: dup
    //   318: invokespecial 192	java/lang/StringBuilder:<init>	()V
    //   321: astore_0
    //   322: aload_0
    //   323: ldc -62
    //   325: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload_0
    //   330: aload 6
    //   332: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: pop
    //   336: aload_0
    //   337: ldc -56
    //   339: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: pop
    //   343: aload_0
    //   344: iload_1
    //   345: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   348: pop
    //   349: aload_0
    //   350: ldc -51
    //   352: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: aload_0
    //   357: iload_3
    //   358: invokevirtual 203	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   361: pop
    //   362: ldc 50
    //   364: aload_0
    //   365: invokevirtual 208	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   368: invokestatic 58	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   371: pop
    //   372: iconst_2
    //   373: istore_1
    //   374: goto +85 -> 459
    //   377: aload 8
    //   379: getfield 212	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   382: astore_2
    //   383: aload_2
    //   384: astore_0
    //   385: aload_2
    //   386: ifnonnull +39 -> 425
    //   389: aload 7
    //   391: ldc 37
    //   393: iconst_0
    //   394: invokevirtual 216	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   397: astore_0
    //   398: goto +27 -> 425
    //   401: astore_0
    //   402: ldc 50
    //   404: aload 6
    //   406: invokestatic 161	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   409: ldc -38
    //   411: invokevirtual 167	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   414: aload_0
    //   415: invokestatic 221	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   418: pop
    //   419: iload 5
    //   421: istore_1
    //   422: goto +37 -> 459
    //   425: aload_0
    //   426: getfield 226	android/content/pm/ApplicationInfo:enabled	Z
    //   429: ifne +8 -> 437
    //   432: iconst_3
    //   433: istore_1
    //   434: goto +25 -> 459
    //   437: iconst_0
    //   438: ireturn
    //   439: astore_0
    //   440: ldc 50
    //   442: aload 6
    //   444: invokestatic 161	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   447: ldc -28
    //   449: invokevirtual 167	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   452: invokestatic 58	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   455: pop
    //   456: iload 5
    //   458: istore_1
    //   459: iload_1
    //   460: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	461	0	paramContext	Context
    //   0	461	1	paramInt	int
    //   14	1	2	localObject1	Object
    //   155	231	2	localObject2	Object
    //   51	307	3	i	int
    //   87	38	4	bool	boolean
    //   90	367	5	j	int
    //   133	310	6	str	String
    //   139	251	7	localPackageManager	PackageManager
    //   197	181	8	localPackageInfo	PackageInfo
    // Exception table:
    //   from	to	target	type
    //   0	11	14	finally
    //   145	156	159	android/content/pm/PackageManager$NameNotFoundException
    //   389	398	401	android/content/pm/PackageManager$NameNotFoundException
    //   188	199	439	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public static boolean f(Context paramContext, int paramInt)
  {
    if (paramInt == 18) {
      return true;
    }
    if (paramInt == 1) {
      return j(paramContext, "com.google.android.gms");
    }
    return false;
  }
  
  public static boolean g(Context paramContext)
  {
    if (l.c())
    {
      Object localObject = paramContext.getSystemService("user");
      A2.n.i(localObject);
      paramContext = ((UserManager)localObject).getApplicationRestrictions(paramContext.getPackageName());
      if ((paramContext != null) && ("true".equals(paramContext.getString("restricted_profile")))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean h(int paramInt)
  {
    return (paramInt == 1) || (paramInt == 2) || (paramInt == 3) || (paramInt == 9);
  }
  
  public static boolean i(Context paramContext, int paramInt, String paramString)
  {
    return o.b(paramContext, paramInt, paramString);
  }
  
  public static boolean j(Context paramContext, String paramString)
  {
    boolean bool = paramString.equals("com.google.android.gms");
    if (l.f()) {
      try
      {
        localObject = paramContext.getPackageManager().getPackageInstaller().getAllSessions();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          if (paramString.equals(((PackageInstaller.SessionInfo)((Iterator)localObject).next()).getAppPackageName())) {
            return true;
          }
        }
      }
      catch (Exception paramContext)
      {
        return false;
      }
    }
    Object localObject = paramContext.getPackageManager();
    try
    {
      paramString = ((PackageManager)localObject).getApplicationInfo(paramString, 8192);
      if (bool) {
        return enabled;
      }
      if (enabled)
      {
        bool = g(paramContext);
        if (!bool) {
          return true;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     x2.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
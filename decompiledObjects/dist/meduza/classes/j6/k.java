package j6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import m6.j;

public final class k
{
  public static k c;
  public final Context a;
  public volatile String b;
  
  public k(Context paramContext)
  {
    a = paramContext.getApplicationContext();
  }
  
  public static k a(Context paramContext)
  {
    j.i(paramContext);
    try
    {
      if (c == null)
      {
        Object localObject = y.a;
        try
        {
          if (y.e == null) {
            y.e = paramContext.getApplicationContext();
          } else {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
          }
          localObject = new j6/k;
          ((k)localObject).<init>(paramContext);
          c = (k)localObject;
        }
        finally {}
      }
      return c;
    }
    finally {}
  }
  
  public static final u c(PackageInfo paramPackageInfo, u... paramVarArgs)
  {
    Signature[] arrayOfSignature = signatures;
    if (arrayOfSignature != null)
    {
      if (arrayOfSignature.length != 1)
      {
        Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        return null;
      }
      paramPackageInfo = signatures;
      int i = 0;
      paramPackageInfo = new v(paramPackageInfo[0].toByteArray());
      while (i < paramVarArgs.length)
      {
        if (paramVarArgs[i].equals(paramPackageInfo)) {
          return paramVarArgs[i];
        }
        i++;
      }
    }
    return null;
  }
  
  public static final boolean d(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    if (paramBoolean) {
      if (paramPackageInfo != null)
      {
        if (!"com.android.vending".equals(packageName))
        {
          bool = paramBoolean;
          if (!"com.google.android.gms".equals(packageName)) {}
        }
        else
        {
          localObject = applicationInfo;
          if (localObject == null) {}
          while ((flags & 0x81) == 0)
          {
            bool = false;
            break;
          }
          bool = true;
        }
      }
      else
      {
        localObject = null;
        break label75;
      }
    }
    Object localObject = paramPackageInfo;
    paramBoolean = bool;
    label75:
    if ((paramPackageInfo != null) && (signatures != null))
    {
      if (paramBoolean) {
        paramPackageInfo = c((PackageInfo)localObject, x.a);
      } else {
        paramPackageInfo = c((PackageInfo)localObject, new u[] { x.a[0] });
      }
      if (paramPackageInfo != null) {
        return true;
      }
    }
    return false;
  }
  
  /* Error */
  public final boolean b(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	j6/k:a	Landroid/content/Context;
    //   4: invokevirtual 121	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   7: iload_1
    //   8: invokevirtual 127	android/content/pm/PackageManager:getPackagesForUid	(I)[Ljava/lang/String;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull +682 -> 695
    //   16: aload_2
    //   17: arraylength
    //   18: istore_3
    //   19: iload_3
    //   20: ifne +6 -> 26
    //   23: goto +672 -> 695
    //   26: aconst_null
    //   27: astore 4
    //   29: iconst_0
    //   30: istore_1
    //   31: iload_1
    //   32: iload_3
    //   33: if_icmpge +654 -> 687
    //   36: aload_2
    //   37: iload_1
    //   38: aaload
    //   39: astore 5
    //   41: aload 5
    //   43: ifnonnull +19 -> 62
    //   46: new 129	j6/g0
    //   49: dup
    //   50: iconst_0
    //   51: ldc -125
    //   53: aconst_null
    //   54: invokespecial 134	j6/g0:<init>	(ZLjava/lang/String;Ljava/lang/Exception;)V
    //   57: astore 4
    //   59: goto +611 -> 670
    //   62: aload 5
    //   64: aload_0
    //   65: getfield 136	j6/k:b	Ljava/lang/String;
    //   68: invokevirtual 91	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   71: ifne +594 -> 665
    //   74: getstatic 38	j6/y:a	Lj6/s;
    //   77: astore 4
    //   79: invokestatic 142	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   82: astore 6
    //   84: invokestatic 144	j6/y:b	()V
    //   87: getstatic 147	j6/y:c	Lm6/e0;
    //   90: invokeinterface 153 1 0
    //   95: istore 7
    //   97: goto +28 -> 125
    //   100: astore 4
    //   102: goto +555 -> 657
    //   105: astore 4
    //   107: goto +5 -> 112
    //   110: astore 4
    //   112: ldc 43
    //   114: ldc -101
    //   116: aload 4
    //   118: invokestatic 158	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   121: pop
    //   122: iconst_0
    //   123: istore 7
    //   125: aload 6
    //   127: invokestatic 162	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   130: iload 7
    //   132: ifeq +254 -> 386
    //   135: aload_0
    //   136: getfield 23	j6/k:a	Landroid/content/Context;
    //   139: invokestatic 167	j6/j:b	(Landroid/content/Context;)Z
    //   142: istore 7
    //   144: invokestatic 142	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   147: astore 8
    //   149: getstatic 41	j6/y:e	Landroid/content/Context;
    //   152: invokestatic 31	m6/j:i	(Ljava/lang/Object;)V
    //   155: invokestatic 144	j6/y:b	()V
    //   158: new 169	j6/z
    //   161: astore 4
    //   163: aload 4
    //   165: aload 5
    //   167: iload 7
    //   169: iconst_0
    //   170: getstatic 41	j6/y:e	Landroid/content/Context;
    //   173: invokestatic 175	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   176: iconst_0
    //   177: iconst_1
    //   178: invokespecial 178	j6/z:<init>	(Ljava/lang/String;ZZLandroid/os/IBinder;ZZ)V
    //   181: getstatic 147	j6/y:c	Lm6/e0;
    //   184: aload 4
    //   186: invokeinterface 182 2 0
    //   191: astore 9
    //   193: aload 9
    //   195: getfield 187	j6/b0:a	Z
    //   198: ifeq +27 -> 225
    //   201: aload 9
    //   203: getfield 189	j6/b0:d	I
    //   206: invokestatic 195	x6/b:E0	(I)I
    //   209: pop
    //   210: new 129	j6/g0
    //   213: dup
    //   214: iconst_1
    //   215: aconst_null
    //   216: aconst_null
    //   217: invokespecial 134	j6/g0:<init>	(ZLjava/lang/String;Ljava/lang/Exception;)V
    //   220: astore 6
    //   222: goto +146 -> 368
    //   225: aload 9
    //   227: getfield 196	j6/b0:b	Ljava/lang/String;
    //   230: astore 10
    //   232: aload 9
    //   234: getfield 198	j6/b0:c	I
    //   237: invokestatic 203	va/a:h	(I)I
    //   240: iconst_4
    //   241: if_icmpne +16 -> 257
    //   244: new 117	android/content/pm/PackageManager$NameNotFoundException
    //   247: astore 4
    //   249: aload 4
    //   251: invokespecial 204	android/content/pm/PackageManager$NameNotFoundException:<init>	()V
    //   254: goto +6 -> 260
    //   257: aconst_null
    //   258: astore 4
    //   260: aload 10
    //   262: astore 6
    //   264: aload 10
    //   266: ifnonnull +7 -> 273
    //   269: ldc -50
    //   271: astore 6
    //   273: aload 9
    //   275: getfield 189	j6/b0:d	I
    //   278: invokestatic 195	x6/b:E0	(I)I
    //   281: pop
    //   282: aload 9
    //   284: getfield 198	j6/b0:c	I
    //   287: invokestatic 203	va/a:h	(I)I
    //   290: pop
    //   291: new 129	j6/g0
    //   294: dup
    //   295: iconst_0
    //   296: aload 6
    //   298: aload 4
    //   300: invokespecial 134	j6/g0:<init>	(ZLjava/lang/String;Ljava/lang/Exception;)V
    //   303: astore 6
    //   305: goto +63 -> 368
    //   308: astore 4
    //   310: ldc 43
    //   312: ldc -101
    //   314: aload 4
    //   316: invokestatic 158	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   319: pop
    //   320: ldc -48
    //   322: astore 6
    //   324: goto +30 -> 354
    //   327: astore 4
    //   329: ldc 43
    //   331: ldc -101
    //   333: aload 4
    //   335: invokestatic 158	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   338: pop
    //   339: ldc -46
    //   341: aload 4
    //   343: invokevirtual 216	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   346: invokestatic 220	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   349: invokevirtual 224	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   352: astore 6
    //   354: new 129	j6/g0
    //   357: dup
    //   358: iconst_0
    //   359: aload 6
    //   361: aload 4
    //   363: invokespecial 134	j6/g0:<init>	(ZLjava/lang/String;Ljava/lang/Exception;)V
    //   366: astore 6
    //   368: aload 8
    //   370: invokestatic 162	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   373: goto +235 -> 608
    //   376: astore 4
    //   378: aload 8
    //   380: invokestatic 162	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   383: aload 4
    //   385: athrow
    //   386: aload_0
    //   387: getfield 23	j6/k:a	Landroid/content/Context;
    //   390: invokevirtual 121	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   393: aload 5
    //   395: bipush 64
    //   397: invokevirtual 228	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   400: astore 8
    //   402: aload_0
    //   403: getfield 23	j6/k:a	Landroid/content/Context;
    //   406: invokestatic 167	j6/j:b	(Landroid/content/Context;)Z
    //   409: istore 7
    //   411: aload 8
    //   413: ifnonnull +19 -> 432
    //   416: new 129	j6/g0
    //   419: dup
    //   420: iconst_0
    //   421: ldc -125
    //   423: aconst_null
    //   424: invokespecial 134	j6/g0:<init>	(ZLjava/lang/String;Ljava/lang/Exception;)V
    //   427: astore 6
    //   429: goto +179 -> 608
    //   432: aload 8
    //   434: getfield 60	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   437: astore 4
    //   439: aload 4
    //   441: ifnull +150 -> 591
    //   444: aload 4
    //   446: arraylength
    //   447: iconst_1
    //   448: if_icmpeq +6 -> 454
    //   451: goto +140 -> 591
    //   454: new 66	j6/v
    //   457: dup
    //   458: aload 8
    //   460: getfield 60	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   463: iconst_0
    //   464: aaload
    //   465: invokevirtual 72	android/content/pm/Signature:toByteArray	()[B
    //   468: invokespecial 75	j6/v:<init>	([B)V
    //   471: astore 4
    //   473: aload 8
    //   475: getfield 88	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   478: astore 10
    //   480: invokestatic 142	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   483: astore 9
    //   485: aload 10
    //   487: aload 4
    //   489: iload 7
    //   491: iconst_0
    //   492: invokestatic 231	j6/y:a	(Ljava/lang/String;Lj6/u;ZZ)Lj6/g0;
    //   495: astore 6
    //   497: aload 9
    //   499: invokestatic 162	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   502: aload 6
    //   504: getfield 232	j6/g0:a	Z
    //   507: ifeq +71 -> 578
    //   510: aload 8
    //   512: getfield 97	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   515: astore 8
    //   517: aload 8
    //   519: ifnull +59 -> 578
    //   522: aload 8
    //   524: getfield 103	android/content/pm/ApplicationInfo:flags	I
    //   527: iconst_2
    //   528: iand
    //   529: ifeq +49 -> 578
    //   532: invokestatic 142	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   535: astore 8
    //   537: aload 10
    //   539: aload 4
    //   541: iconst_0
    //   542: iconst_1
    //   543: invokestatic 231	j6/y:a	(Ljava/lang/String;Lj6/u;ZZ)Lj6/g0;
    //   546: astore 4
    //   548: aload 8
    //   550: invokestatic 162	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   553: aload 4
    //   555: getfield 232	j6/g0:a	Z
    //   558: ifeq +20 -> 578
    //   561: ldc -22
    //   563: astore 4
    //   565: goto +30 -> 595
    //   568: astore 4
    //   570: aload 8
    //   572: invokestatic 162	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   575: aload 4
    //   577: athrow
    //   578: goto +30 -> 608
    //   581: astore 4
    //   583: aload 9
    //   585: invokestatic 162	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   588: aload 4
    //   590: athrow
    //   591: ldc -20
    //   593: astore 4
    //   595: new 129	j6/g0
    //   598: dup
    //   599: iconst_0
    //   600: aload 4
    //   602: aconst_null
    //   603: invokespecial 134	j6/g0:<init>	(ZLjava/lang/String;Ljava/lang/Exception;)V
    //   606: astore 6
    //   608: aload 6
    //   610: astore 4
    //   612: aload 6
    //   614: getfield 232	j6/g0:a	Z
    //   617: ifeq +53 -> 670
    //   620: aload_0
    //   621: aload 5
    //   623: putfield 136	j6/k:b	Ljava/lang/String;
    //   626: aload 6
    //   628: astore 4
    //   630: goto +40 -> 670
    //   633: astore 4
    //   635: new 129	j6/g0
    //   638: dup
    //   639: iconst_0
    //   640: ldc -18
    //   642: aload 5
    //   644: invokevirtual 224	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   647: aload 4
    //   649: invokespecial 134	j6/g0:<init>	(ZLjava/lang/String;Ljava/lang/Exception;)V
    //   652: astore 4
    //   654: goto +16 -> 670
    //   657: aload 6
    //   659: invokestatic 162	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   662: aload 4
    //   664: athrow
    //   665: getstatic 241	j6/g0:d	Lj6/g0;
    //   668: astore 4
    //   670: aload 4
    //   672: getfield 232	j6/g0:a	Z
    //   675: ifeq +6 -> 681
    //   678: goto +30 -> 708
    //   681: iinc 1 1
    //   684: goto -653 -> 31
    //   687: aload 4
    //   689: invokestatic 31	m6/j:i	(Ljava/lang/Object;)V
    //   692: goto +16 -> 708
    //   695: new 129	j6/g0
    //   698: dup
    //   699: iconst_0
    //   700: ldc -13
    //   702: aconst_null
    //   703: invokespecial 134	j6/g0:<init>	(ZLjava/lang/String;Ljava/lang/Exception;)V
    //   706: astore 4
    //   708: aload 4
    //   710: getfield 232	j6/g0:a	Z
    //   713: ifne +50 -> 763
    //   716: ldc -11
    //   718: iconst_3
    //   719: invokestatic 249	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   722: ifeq +41 -> 763
    //   725: aload 4
    //   727: getfield 252	j6/g0:c	Ljava/lang/Throwable;
    //   730: ifnull +22 -> 752
    //   733: ldc -11
    //   735: aload 4
    //   737: invokevirtual 254	j6/g0:a	()Ljava/lang/String;
    //   740: aload 4
    //   742: getfield 252	j6/g0:c	Ljava/lang/Throwable;
    //   745: invokestatic 256	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   748: pop
    //   749: goto +14 -> 763
    //   752: ldc -11
    //   754: aload 4
    //   756: invokevirtual 254	j6/g0:a	()Ljava/lang/String;
    //   759: invokestatic 258	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   762: pop
    //   763: aload 4
    //   765: getfield 232	j6/g0:a	Z
    //   768: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	769	0	this	k
    //   0	769	1	paramInt	int
    //   11	26	2	arrayOfString	String[]
    //   18	16	3	i	int
    //   27	51	4	localObject1	Object
    //   100	1	4	localObject2	Object
    //   105	1	4	localRemoteException1	android.os.RemoteException
    //   110	7	4	locala1	com.google.android.gms.dynamite.DynamiteModule.a
    //   161	138	4	localObject3	Object
    //   308	7	4	localRemoteException2	android.os.RemoteException
    //   327	35	4	locala2	com.google.android.gms.dynamite.DynamiteModule.a
    //   376	8	4	localObject4	Object
    //   437	127	4	localObject5	Object
    //   568	8	4	localObject6	Object
    //   581	8	4	localObject7	Object
    //   593	36	4	localObject8	Object
    //   633	15	4	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   652	112	4	localg0	g0
    //   39	604	5	str1	String
    //   82	576	6	localObject9	Object
    //   95	395	7	bool	boolean
    //   147	424	8	localObject10	Object
    //   191	393	9	localObject11	Object
    //   230	308	10	str2	String
    // Exception table:
    //   from	to	target	type
    //   84	97	100	finally
    //   112	122	100	finally
    //   84	97	105	android/os/RemoteException
    //   84	97	110	com/google/android/gms/dynamite/DynamiteModule$a
    //   181	193	308	android/os/RemoteException
    //   155	158	327	com/google/android/gms/dynamite/DynamiteModule$a
    //   149	155	376	finally
    //   155	158	376	finally
    //   158	181	376	finally
    //   181	193	376	finally
    //   193	222	376	finally
    //   225	254	376	finally
    //   273	305	376	finally
    //   310	320	376	finally
    //   329	354	376	finally
    //   354	368	376	finally
    //   537	548	568	finally
    //   485	497	581	finally
    //   386	402	633	android/content/pm/PackageManager$NameNotFoundException
  }
}

/* Location:
 * Qualified Name:     j6.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
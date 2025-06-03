package j6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import m6.u0;
import x6.b;
import x6.c;
import x6.d;

public class f
{
  public static final int a = 12451000;
  public static final f b = new f();
  
  static
  {
    AtomicBoolean localAtomicBoolean = j.a;
  }
  
  public Intent a(Context paramContext, String paramString, int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 2))
    {
      if (paramInt != 3) {
        return null;
      }
      paramInt = u0.a;
      paramContext = Uri.fromParts("package", "com.google.android.gms", null);
      paramString = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
      paramString.setData(paramContext);
      return paramString;
    }
    if ((paramContext != null) && (b.f0(paramContext)))
    {
      paramInt = u0.a;
      paramContext = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
      paramContext.setPackage("com.google.android.wearable.app");
      return paramContext;
    }
    Object localObject = f.l("gcore_");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append("-");
    if (!TextUtils.isEmpty(paramString)) {
      ((StringBuilder)localObject).append(paramString);
    }
    ((StringBuilder)localObject).append("-");
    if (paramContext != null) {
      ((StringBuilder)localObject).append(paramContext.getPackageName());
    }
    ((StringBuilder)localObject).append("-");
    if (paramContext != null) {}
    try
    {
      ((StringBuilder)localObject).append(ab0getPackageNameversionCode);
      paramString = ((StringBuilder)localObject).toString();
      paramInt = u0.a;
      localObject = new Intent("android.intent.action.VIEW");
      paramContext = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
      if (!TextUtils.isEmpty(paramString)) {
        paramContext.appendQueryParameter("pcampaignid", paramString);
      }
      ((Intent)localObject).setData(paramContext.build());
      ((Intent)localObject).setPackage("com.android.vending");
      ((Intent)localObject).addFlags(524288);
      return (Intent)localObject;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public int b(Context paramContext)
  {
    return c(paramContext, a);
  }
  
  /* Error */
  public int c(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: getstatic 15	j6/j:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual 156	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   8: ldc -99
    //   10: invokevirtual 163	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   13: pop
    //   14: goto +12 -> 26
    //   17: astore_3
    //   18: ldc -91
    //   20: ldc -89
    //   22: invokestatic 173	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   25: pop
    //   26: ldc 35
    //   28: aload_1
    //   29: invokevirtual 96	android/content/Context:getPackageName	()Ljava/lang/String;
    //   32: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   35: istore 4
    //   37: iconst_1
    //   38: istore 5
    //   40: iload 4
    //   42: ifne +147 -> 189
    //   45: getstatic 182	j6/j:d	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   48: invokevirtual 188	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   51: ifeq +6 -> 57
    //   54: goto +135 -> 189
    //   57: getstatic 193	m6/f0:a	Ljava/lang/Object;
    //   60: astore_3
    //   61: aload_3
    //   62: monitorenter
    //   63: getstatic 196	m6/f0:b	Z
    //   66: ifeq +6 -> 72
    //   69: goto +75 -> 144
    //   72: iconst_1
    //   73: putstatic 196	m6/f0:b	Z
    //   76: aload_1
    //   77: invokevirtual 96	android/content/Context:getPackageName	()Ljava/lang/String;
    //   80: astore 6
    //   82: aload_1
    //   83: invokestatic 101	x6/d:a	(Landroid/content/Context;)Lx6/c;
    //   86: astore 7
    //   88: aload 7
    //   90: sipush 128
    //   93: aload 6
    //   95: invokevirtual 199	x6/c:a	(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;
    //   98: getfield 205	android/content/pm/ApplicationInfo:metaData	Landroid/os/Bundle;
    //   101: astore 7
    //   103: aload 7
    //   105: ifnonnull +6 -> 111
    //   108: goto +36 -> 144
    //   111: aload 7
    //   113: ldc -49
    //   115: invokevirtual 212	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   118: pop
    //   119: aload 7
    //   121: ldc -42
    //   123: invokevirtual 218	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   126: putstatic 220	m6/f0:c	I
    //   129: goto +15 -> 144
    //   132: astore 7
    //   134: ldc -34
    //   136: ldc -32
    //   138: aload 7
    //   140: invokestatic 228	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   143: pop
    //   144: aload_3
    //   145: monitorexit
    //   146: getstatic 220	m6/f0:c	I
    //   149: istore 8
    //   151: iload 8
    //   153: ifeq +23 -> 176
    //   156: iload 8
    //   158: ldc 16
    //   160: if_icmpne +6 -> 166
    //   163: goto +26 -> 189
    //   166: new 230	com/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException
    //   169: dup
    //   170: iload 8
    //   172: invokespecial 233	com/google/android/gms/common/GooglePlayServicesIncorrectManifestValueException:<init>	(I)V
    //   175: athrow
    //   176: new 235	com/google/android/gms/common/GooglePlayServicesMissingManifestValueException
    //   179: dup
    //   180: invokespecial 236	com/google/android/gms/common/GooglePlayServicesMissingManifestValueException:<init>	()V
    //   183: athrow
    //   184: astore_1
    //   185: aload_3
    //   186: monitorexit
    //   187: aload_1
    //   188: athrow
    //   189: aload_1
    //   190: invokestatic 58	x6/b:f0	(Landroid/content/Context;)Z
    //   193: ifne +68 -> 261
    //   196: getstatic 240	x6/b:g	Ljava/lang/Boolean;
    //   199: ifnonnull +47 -> 246
    //   202: aload_1
    //   203: invokevirtual 244	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   206: ldc -10
    //   208: invokevirtual 252	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   211: ifne +24 -> 235
    //   214: aload_1
    //   215: invokevirtual 244	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   218: ldc -2
    //   220: invokevirtual 252	android/content/pm/PackageManager:hasSystemFeature	(Ljava/lang/String;)Z
    //   223: ifeq +6 -> 229
    //   226: goto +9 -> 235
    //   229: iconst_0
    //   230: istore 4
    //   232: goto +6 -> 238
    //   235: iconst_1
    //   236: istore 4
    //   238: iload 4
    //   240: invokestatic 260	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   243: putstatic 240	x6/b:g	Ljava/lang/Boolean;
    //   246: getstatic 240	x6/b:g	Ljava/lang/Boolean;
    //   249: invokevirtual 263	java/lang/Boolean:booleanValue	()Z
    //   252: ifne +9 -> 261
    //   255: iconst_1
    //   256: istore 8
    //   258: goto +6 -> 264
    //   261: iconst_0
    //   262: istore 8
    //   264: iload_2
    //   265: iflt +9 -> 274
    //   268: iconst_1
    //   269: istore 4
    //   271: goto +6 -> 277
    //   274: iconst_0
    //   275: istore 4
    //   277: iload 4
    //   279: invokestatic 268	m6/j:b	(Z)V
    //   282: aload_1
    //   283: invokevirtual 96	android/content/Context:getPackageName	()Ljava/lang/String;
    //   286: astore 6
    //   288: aload_1
    //   289: invokevirtual 244	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   292: astore 9
    //   294: bipush 9
    //   296: istore 10
    //   298: iload 8
    //   300: ifeq +32 -> 332
    //   303: aload 9
    //   305: ldc -114
    //   307: sipush 8256
    //   310: invokevirtual 272	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   313: astore_3
    //   314: goto +20 -> 334
    //   317: astore_3
    //   318: aload 6
    //   320: invokestatic 275	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   323: astore 7
    //   325: ldc_w 277
    //   328: astore_3
    //   329: goto +114 -> 443
    //   332: aconst_null
    //   333: astore_3
    //   334: aload 9
    //   336: ldc 35
    //   338: bipush 64
    //   340: invokevirtual 272	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   343: astore 7
    //   345: aload_1
    //   346: invokestatic 282	j6/k:a	(Landroid/content/Context;)Lj6/k;
    //   349: pop
    //   350: aload 7
    //   352: iconst_1
    //   353: invokestatic 285	j6/k:d	(Landroid/content/pm/PackageInfo;Z)Z
    //   356: ifne +17 -> 373
    //   359: aload 6
    //   361: invokestatic 275	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   364: astore 7
    //   366: ldc_w 287
    //   369: astore_3
    //   370: goto +73 -> 443
    //   373: iload 8
    //   375: ifeq +29 -> 404
    //   378: aload_3
    //   379: invokestatic 291	m6/j:i	(Ljava/lang/Object;)V
    //   382: aload_3
    //   383: iconst_1
    //   384: invokestatic 285	j6/k:d	(Landroid/content/pm/PackageInfo;Z)Z
    //   387: ifne +17 -> 404
    //   390: aload 6
    //   392: invokestatic 275	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   395: astore 7
    //   397: ldc_w 293
    //   400: astore_3
    //   401: goto +42 -> 443
    //   404: iload 8
    //   406: ifeq +55 -> 461
    //   409: aload_3
    //   410: ifnull +51 -> 461
    //   413: aload_3
    //   414: getfield 297	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   417: iconst_0
    //   418: aaload
    //   419: aload 7
    //   421: getfield 297	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   424: iconst_0
    //   425: aaload
    //   426: invokevirtual 300	android/content/pm/Signature:equals	(Ljava/lang/Object;)Z
    //   429: ifne +32 -> 461
    //   432: aload 6
    //   434: invokestatic 275	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   437: astore 7
    //   439: ldc_w 302
    //   442: astore_3
    //   443: ldc -91
    //   445: aload 7
    //   447: aload_3
    //   448: invokevirtual 305	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   451: invokestatic 308	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   454: pop
    //   455: iload 10
    //   457: istore_2
    //   458: goto +208 -> 666
    //   461: aload 7
    //   463: getfield 111	android/content/pm/PackageInfo:versionCode	I
    //   466: istore 11
    //   468: iconst_m1
    //   469: istore 10
    //   471: iload 11
    //   473: iconst_m1
    //   474: if_icmpne +9 -> 483
    //   477: iconst_m1
    //   478: istore 8
    //   480: goto +11 -> 491
    //   483: iload 11
    //   485: sipush 1000
    //   488: idiv
    //   489: istore 8
    //   491: iload_2
    //   492: iconst_m1
    //   493: if_icmpne +6 -> 499
    //   496: goto +10 -> 506
    //   499: iload_2
    //   500: sipush 1000
    //   503: idiv
    //   504: istore 10
    //   506: iload 8
    //   508: iload 10
    //   510: if_icmpge +70 -> 580
    //   513: new 76	java/lang/StringBuilder
    //   516: dup
    //   517: invokespecial 309	java/lang/StringBuilder:<init>	()V
    //   520: astore_3
    //   521: aload_3
    //   522: ldc_w 311
    //   525: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   528: pop
    //   529: aload_3
    //   530: aload 6
    //   532: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: pop
    //   536: aload_3
    //   537: ldc_w 313
    //   540: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   543: pop
    //   544: aload_3
    //   545: iload_2
    //   546: invokevirtual 80	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   549: pop
    //   550: aload_3
    //   551: ldc_w 315
    //   554: invokevirtual 84	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   557: pop
    //   558: aload_3
    //   559: iload 11
    //   561: invokevirtual 80	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   564: pop
    //   565: ldc -91
    //   567: aload_3
    //   568: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   571: invokestatic 308	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   574: pop
    //   575: iconst_2
    //   576: istore_2
    //   577: goto +89 -> 666
    //   580: aload 7
    //   582: getfield 319	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   585: astore 7
    //   587: aload 7
    //   589: astore_3
    //   590: aload 7
    //   592: ifnonnull +37 -> 629
    //   595: aload 9
    //   597: ldc 35
    //   599: iconst_0
    //   600: invokevirtual 323	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   603: astore_3
    //   604: goto +25 -> 629
    //   607: astore_3
    //   608: ldc -91
    //   610: aload 6
    //   612: invokestatic 275	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   615: ldc_w 325
    //   618: invokevirtual 305	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   621: aload_3
    //   622: invokestatic 228	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   625: pop
    //   626: goto +38 -> 664
    //   629: aload_3
    //   630: getfield 328	android/content/pm/ApplicationInfo:enabled	Z
    //   633: ifne +8 -> 641
    //   636: iconst_3
    //   637: istore_2
    //   638: goto +28 -> 666
    //   641: iconst_0
    //   642: istore_2
    //   643: goto +23 -> 666
    //   646: astore_3
    //   647: ldc -91
    //   649: aload 6
    //   651: invokestatic 275	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   654: ldc_w 330
    //   657: invokevirtual 305	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   660: invokestatic 308	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   663: pop
    //   664: iconst_1
    //   665: istore_2
    //   666: iload_2
    //   667: bipush 18
    //   669: if_icmpne +10 -> 679
    //   672: iload 5
    //   674: istore 4
    //   676: goto +20 -> 696
    //   679: iload_2
    //   680: iconst_1
    //   681: if_icmpne +12 -> 693
    //   684: aload_1
    //   685: invokestatic 332	j6/j:c	(Landroid/content/Context;)Z
    //   688: istore 4
    //   690: goto +6 -> 696
    //   693: iconst_0
    //   694: istore 4
    //   696: iload 4
    //   698: ifeq +6 -> 704
    //   701: bipush 18
    //   703: ireturn
    //   704: iload_2
    //   705: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	706	0	this	f
    //   0	706	1	paramContext	Context
    //   0	706	2	paramInt	int
    //   3	1	3	localAtomicBoolean	AtomicBoolean
    //   17	1	3	localObject1	Object
    //   317	1	3	localNameNotFoundException1	PackageManager.NameNotFoundException
    //   328	276	3	localObject3	Object
    //   607	23	3	localNameNotFoundException2	PackageManager.NameNotFoundException
    //   646	1	3	localNameNotFoundException3	PackageManager.NameNotFoundException
    //   35	662	4	bool1	boolean
    //   38	635	5	bool2	boolean
    //   80	570	6	str	String
    //   86	34	7	localObject4	Object
    //   132	7	7	localNameNotFoundException4	PackageManager.NameNotFoundException
    //   323	268	7	localObject5	Object
    //   149	362	8	i	int
    //   292	304	9	localPackageManager	android.content.pm.PackageManager
    //   296	215	10	j	int
    //   466	94	11	k	int
    // Exception table:
    //   from	to	target	type
    //   4	14	17	finally
    //   88	103	132	android/content/pm/PackageManager$NameNotFoundException
    //   111	129	132	android/content/pm/PackageManager$NameNotFoundException
    //   63	69	184	finally
    //   72	88	184	finally
    //   88	103	184	finally
    //   111	129	184	finally
    //   134	144	184	finally
    //   144	146	184	finally
    //   185	187	184	finally
    //   303	314	317	android/content/pm/PackageManager$NameNotFoundException
    //   595	604	607	android/content/pm/PackageManager$NameNotFoundException
    //   334	345	646	android/content/pm/PackageManager$NameNotFoundException
  }
}

/* Location:
 * Qualified Name:     j6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
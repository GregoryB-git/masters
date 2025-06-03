package y5;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterJNI.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import t5.a;

public class f
{
  public boolean a = false;
  public c b;
  public long c;
  public b d;
  public FlutterJNI e;
  public ExecutorService f;
  public Future g;
  
  public f()
  {
    this(a.e().d().a());
  }
  
  public f(FlutterJNI paramFlutterJNI)
  {
    this(paramFlutterJNI, a.e().b());
  }
  
  public f(FlutterJNI paramFlutterJNI, ExecutorService paramExecutorService)
  {
    e = paramFlutterJNI;
    f = paramExecutorService;
  }
  
  public static boolean m(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return true;
    }
    return paramBundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
  }
  
  public boolean g()
  {
    return d.g;
  }
  
  /* Error */
  public void h(Context paramContext, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 53	y5/f:a	Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: invokestatic 100	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   11: invokestatic 103	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   14: if_acmpne +893 -> 907
    //   17: aload_0
    //   18: getfield 105	y5/f:b	Ly5/f$c;
    //   21: ifnull +875 -> 896
    //   24: ldc 107
    //   26: invokestatic 113	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   29: astore_3
    //   30: aload_0
    //   31: getfield 115	y5/f:g	Ljava/util/concurrent/Future;
    //   34: invokeinterface 121 1 0
    //   39: checkcast 8	y5/f$b
    //   42: astore 4
    //   44: new 123	java/util/ArrayList
    //   47: astore 5
    //   49: aload 5
    //   51: invokespecial 124	java/util/ArrayList:<init>	()V
    //   54: aload 5
    //   56: ldc 126
    //   58: invokeinterface 132 2 0
    //   63: pop
    //   64: new 134	java/lang/StringBuilder
    //   67: astore 6
    //   69: aload 6
    //   71: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   74: aload 6
    //   76: ldc -119
    //   78: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload 6
    //   84: aload_0
    //   85: getfield 74	y5/f:d	Ly5/b;
    //   88: getfield 144	y5/b:f	Ljava/lang/String;
    //   91: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: getstatic 149	java/io/File:separator	Ljava/lang/String;
    //   98: astore 7
    //   100: aload 6
    //   102: aload 7
    //   104: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload 6
    //   110: ldc -105
    //   112: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload 5
    //   118: aload 6
    //   120: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokeinterface 132 2 0
    //   128: pop
    //   129: aload_2
    //   130: ifnull +17 -> 147
    //   133: aload 5
    //   135: aload_2
    //   136: invokestatic 161	java/util/Collections:addAll	(Ljava/util/Collection;[Ljava/lang/Object;)Z
    //   139: pop
    //   140: goto +7 -> 147
    //   143: astore_1
    //   144: goto +714 -> 858
    //   147: new 134	java/lang/StringBuilder
    //   150: astore_2
    //   151: aload_2
    //   152: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   155: aload_2
    //   156: ldc -93
    //   158: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload_2
    //   163: aload_0
    //   164: getfield 74	y5/f:d	Ly5/b;
    //   167: getfield 165	y5/b:a	Ljava/lang/String;
    //   170: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload 5
    //   176: aload_2
    //   177: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   180: invokeinterface 132 2 0
    //   185: pop
    //   186: new 134	java/lang/StringBuilder
    //   189: astore_2
    //   190: aload_2
    //   191: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   194: aload_2
    //   195: ldc -93
    //   197: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload_2
    //   202: aload_0
    //   203: getfield 74	y5/f:d	Ly5/b;
    //   206: getfield 144	y5/b:f	Ljava/lang/String;
    //   209: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload_2
    //   214: aload 7
    //   216: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload_2
    //   221: aload_0
    //   222: getfield 74	y5/f:d	Ly5/b;
    //   225: getfield 165	y5/b:a	Ljava/lang/String;
    //   228: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: pop
    //   232: aload 5
    //   234: aload_2
    //   235: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   238: invokeinterface 132 2 0
    //   243: pop
    //   244: new 134	java/lang/StringBuilder
    //   247: astore_2
    //   248: aload_2
    //   249: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   252: aload_2
    //   253: ldc -89
    //   255: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: pop
    //   259: aload_2
    //   260: aload 4
    //   262: getfield 169	y5/f$b:b	Ljava/lang/String;
    //   265: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: pop
    //   269: aload 5
    //   271: aload_2
    //   272: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: invokeinterface 132 2 0
    //   280: pop
    //   281: aload_0
    //   282: getfield 74	y5/f:d	Ly5/b;
    //   285: getfield 171	y5/b:e	Ljava/lang/String;
    //   288: ifnull +42 -> 330
    //   291: new 134	java/lang/StringBuilder
    //   294: astore_2
    //   295: aload_2
    //   296: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   299: aload_2
    //   300: ldc -83
    //   302: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: pop
    //   306: aload_2
    //   307: aload_0
    //   308: getfield 74	y5/f:d	Ly5/b;
    //   311: getfield 171	y5/b:e	Ljava/lang/String;
    //   314: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: pop
    //   318: aload 5
    //   320: aload_2
    //   321: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   324: invokeinterface 132 2 0
    //   329: pop
    //   330: aload_0
    //   331: getfield 105	y5/f:b	Ly5/f$c;
    //   334: invokevirtual 175	y5/f$c:a	()Ljava/lang/String;
    //   337: ifnull +42 -> 379
    //   340: new 134	java/lang/StringBuilder
    //   343: astore_2
    //   344: aload_2
    //   345: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   348: aload_2
    //   349: ldc -79
    //   351: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload_2
    //   356: aload_0
    //   357: getfield 105	y5/f:b	Ly5/f$c;
    //   360: invokevirtual 175	y5/f$c:a	()Ljava/lang/String;
    //   363: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: pop
    //   367: aload 5
    //   369: aload_2
    //   370: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   373: invokeinterface 132 2 0
    //   378: pop
    //   379: aload_1
    //   380: invokevirtual 183	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   383: aload_1
    //   384: invokevirtual 186	android/content/Context:getPackageName	()Ljava/lang/String;
    //   387: sipush 128
    //   390: invokevirtual 192	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   393: getfield 198	android/content/pm/ApplicationInfo:metaData	Landroid/os/Bundle;
    //   396: astore_2
    //   397: aload_2
    //   398: ifnull +14 -> 412
    //   401: aload_2
    //   402: ldc -56
    //   404: invokevirtual 204	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   407: istore 8
    //   409: goto +6 -> 415
    //   412: iconst_0
    //   413: istore 8
    //   415: iload 8
    //   417: ifne +51 -> 468
    //   420: aload_1
    //   421: ldc -50
    //   423: invokevirtual 210	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   426: checkcast 212	android/app/ActivityManager
    //   429: astore 6
    //   431: new 214	android/app/ActivityManager$MemoryInfo
    //   434: astore 7
    //   436: aload 7
    //   438: invokespecial 215	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   441: aload 6
    //   443: aload 7
    //   445: invokevirtual 219	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   448: aload 7
    //   450: getfield 222	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   453: l2d
    //   454: ldc2_w 223
    //   457: ddiv
    //   458: ldc2_w 225
    //   461: ddiv
    //   462: d2i
    //   463: istore 8
    //   465: goto +3 -> 468
    //   468: new 134	java/lang/StringBuilder
    //   471: astore 7
    //   473: aload 7
    //   475: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   478: aload 7
    //   480: ldc -28
    //   482: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   485: pop
    //   486: aload 7
    //   488: iload 8
    //   490: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   493: pop
    //   494: aload 5
    //   496: aload 7
    //   498: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   501: invokeinterface 132 2 0
    //   506: pop
    //   507: aload_1
    //   508: invokevirtual 235	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   511: invokevirtual 241	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   514: astore 7
    //   516: aload 7
    //   518: getfield 247	android/util/DisplayMetrics:widthPixels	I
    //   521: istore 9
    //   523: aload 7
    //   525: getfield 250	android/util/DisplayMetrics:heightPixels	I
    //   528: istore 8
    //   530: new 134	java/lang/StringBuilder
    //   533: astore 7
    //   535: aload 7
    //   537: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   540: aload 7
    //   542: ldc -4
    //   544: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   547: pop
    //   548: aload 7
    //   550: iload 9
    //   552: iload 8
    //   554: imul
    //   555: bipush 48
    //   557: imul
    //   558: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   561: pop
    //   562: aload 5
    //   564: aload 7
    //   566: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   569: invokeinterface 132 2 0
    //   574: pop
    //   575: aload 5
    //   577: ldc -2
    //   579: invokeinterface 132 2 0
    //   584: pop
    //   585: aload_2
    //   586: ifnull +145 -> 731
    //   589: aload_2
    //   590: ldc_w 256
    //   593: iconst_0
    //   594: invokevirtual 85	android/os/BaseBundle:getBoolean	(Ljava/lang/String;Z)Z
    //   597: ifeq +14 -> 611
    //   600: aload 5
    //   602: ldc_w 258
    //   605: invokeinterface 132 2 0
    //   610: pop
    //   611: aload_2
    //   612: ldc_w 260
    //   615: iconst_0
    //   616: invokevirtual 85	android/os/BaseBundle:getBoolean	(Ljava/lang/String;Z)Z
    //   619: ifeq +14 -> 633
    //   622: aload 5
    //   624: ldc_w 262
    //   627: invokeinterface 132 2 0
    //   632: pop
    //   633: aload_2
    //   634: ldc_w 264
    //   637: iconst_0
    //   638: invokevirtual 85	android/os/BaseBundle:getBoolean	(Ljava/lang/String;Z)Z
    //   641: ifeq +14 -> 655
    //   644: aload 5
    //   646: ldc_w 266
    //   649: invokeinterface 132 2 0
    //   654: pop
    //   655: aload_2
    //   656: ldc_w 268
    //   659: iconst_0
    //   660: invokevirtual 85	android/os/BaseBundle:getBoolean	(Ljava/lang/String;Z)Z
    //   663: ifeq +14 -> 677
    //   666: aload 5
    //   668: ldc_w 270
    //   671: invokeinterface 132 2 0
    //   676: pop
    //   677: aload_2
    //   678: ldc_w 272
    //   681: invokevirtual 276	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   684: astore 6
    //   686: aload 6
    //   688: ifnull +43 -> 731
    //   691: new 134	java/lang/StringBuilder
    //   694: astore 7
    //   696: aload 7
    //   698: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   701: aload 7
    //   703: ldc_w 278
    //   706: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   709: pop
    //   710: aload 7
    //   712: aload 6
    //   714: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   717: pop
    //   718: aload 5
    //   720: aload 7
    //   722: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   725: invokeinterface 132 2 0
    //   730: pop
    //   731: aload_2
    //   732: invokestatic 280	y5/f:m	(Landroid/os/Bundle;)Z
    //   735: ifeq +10 -> 745
    //   738: ldc_w 282
    //   741: astore_2
    //   742: goto +7 -> 749
    //   745: ldc_w 284
    //   748: astore_2
    //   749: new 134	java/lang/StringBuilder
    //   752: astore 7
    //   754: aload 7
    //   756: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   759: aload 7
    //   761: ldc_w 286
    //   764: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   767: pop
    //   768: aload 7
    //   770: aload_2
    //   771: invokevirtual 141	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   774: pop
    //   775: aload 5
    //   777: aload 7
    //   779: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   782: invokeinterface 132 2 0
    //   787: pop
    //   788: invokestatic 292	android/os/SystemClock:uptimeMillis	()J
    //   791: lstore 10
    //   793: aload_0
    //   794: getfield 294	y5/f:c	J
    //   797: lstore 12
    //   799: aload_0
    //   800: getfield 55	y5/f:e	Lio/flutter/embedding/engine/FlutterJNI;
    //   803: aload_1
    //   804: aload 5
    //   806: iconst_0
    //   807: anewarray 296	java/lang/String
    //   810: invokeinterface 300 2 0
    //   815: checkcast 302	[Ljava/lang/String;
    //   818: aconst_null
    //   819: aload 4
    //   821: getfield 303	y5/f$b:a	Ljava/lang/String;
    //   824: aload 4
    //   826: getfield 169	y5/f$b:b	Ljava/lang/String;
    //   829: lload 10
    //   831: lload 12
    //   833: lsub
    //   834: invokevirtual 309	io/flutter/embedding/engine/FlutterJNI:init	(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    //   837: aload_0
    //   838: iconst_1
    //   839: putfield 53	y5/f:a	Z
    //   842: aload_3
    //   843: ifnull +14 -> 857
    //   846: aload_3
    //   847: invokevirtual 312	T5/f:close	()V
    //   850: goto +7 -> 857
    //   853: astore_1
    //   854: goto +23 -> 877
    //   857: return
    //   858: aload_3
    //   859: ifnull +16 -> 875
    //   862: aload_3
    //   863: invokevirtual 312	T5/f:close	()V
    //   866: goto +9 -> 875
    //   869: astore_2
    //   870: aload_1
    //   871: aload_2
    //   872: invokevirtual 318	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   875: aload_1
    //   876: athrow
    //   877: ldc_w 320
    //   880: ldc_w 322
    //   883: aload_1
    //   884: invokestatic 327	t5/b:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   887: new 329	java/lang/RuntimeException
    //   890: dup
    //   891: aload_1
    //   892: invokespecial 331	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   895: athrow
    //   896: new 333	java/lang/IllegalStateException
    //   899: dup
    //   900: ldc_w 335
    //   903: invokespecial 338	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   906: athrow
    //   907: new 333	java/lang/IllegalStateException
    //   910: dup
    //   911: ldc_w 340
    //   914: invokespecial 338	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   917: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	918	0	this	f
    //   0	918	1	paramContext	Context
    //   0	918	2	paramArrayOfString	String[]
    //   29	834	3	localf	T5.f
    //   42	783	4	localb	b
    //   47	758	5	localArrayList	java.util.ArrayList
    //   67	646	6	localObject1	Object
    //   98	680	7	localObject2	Object
    //   407	148	8	i	int
    //   521	34	9	j	int
    //   791	39	10	l1	long
    //   797	35	12	l2	long
    // Exception table:
    //   from	to	target	type
    //   30	129	143	finally
    //   133	140	143	finally
    //   147	330	143	finally
    //   330	379	143	finally
    //   379	397	143	finally
    //   401	409	143	finally
    //   420	465	143	finally
    //   468	585	143	finally
    //   589	611	143	finally
    //   611	633	143	finally
    //   633	655	143	finally
    //   655	677	143	finally
    //   677	686	143	finally
    //   691	731	143	finally
    //   731	738	143	finally
    //   749	842	143	finally
    //   24	30	853	java/lang/Exception
    //   846	850	853	java/lang/Exception
    //   870	875	853	java/lang/Exception
    //   875	877	853	java/lang/Exception
    //   862	866	869	finally
  }
  
  public void i(Context paramContext, String[] paramArrayOfString, Handler paramHandler, Runnable paramRunnable)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      if (b != null)
      {
        if (a)
        {
          paramHandler.post(paramRunnable);
          return;
        }
        f.execute(new c(this, paramContext, paramArrayOfString, paramHandler, paramRunnable));
        return;
      }
      throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
    }
    throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
  }
  
  public String j()
  {
    return d.d;
  }
  
  public final g k(Context paramContext)
  {
    return null;
  }
  
  public boolean l()
  {
    return a;
  }
  
  public void p(Context paramContext)
  {
    q(paramContext, new c());
  }
  
  /* Error */
  public void q(Context paramContext, c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 105	y5/f:b	Ly5/f$c;
    //   4: ifnull +4 -> 8
    //   7: return
    //   8: invokestatic 100	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   11: invokestatic 103	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   14: if_acmpne +108 -> 122
    //   17: ldc_w 383
    //   20: invokestatic 113	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   23: astore_3
    //   24: aload_1
    //   25: invokevirtual 364	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   28: astore_1
    //   29: aload_0
    //   30: aload_2
    //   31: putfield 105	y5/f:b	Ly5/f$c;
    //   34: aload_0
    //   35: invokestatic 292	android/os/SystemClock:uptimeMillis	()J
    //   38: putfield 294	y5/f:c	J
    //   41: aload_0
    //   42: aload_1
    //   43: invokestatic 388	y5/a:e	(Landroid/content/Context;)Ly5/b;
    //   46: putfield 74	y5/f:d	Ly5/b;
    //   49: aload_1
    //   50: ldc_w 390
    //   53: invokevirtual 210	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   56: checkcast 392	android/hardware/display/DisplayManager
    //   59: aload_0
    //   60: getfield 55	y5/f:e	Lio/flutter/embedding/engine/FlutterJNI;
    //   63: invokestatic 397	io/flutter/view/s:f	(Landroid/hardware/display/DisplayManager;Lio/flutter/embedding/engine/FlutterJNI;)Lio/flutter/view/s;
    //   66: invokevirtual 399	io/flutter/view/s:g	()V
    //   69: new 6	y5/f$a
    //   72: astore_2
    //   73: aload_2
    //   74: aload_0
    //   75: aload_1
    //   76: invokespecial 402	y5/f$a:<init>	(Ly5/f;Landroid/content/Context;)V
    //   79: aload_0
    //   80: aload_0
    //   81: getfield 57	y5/f:f	Ljava/util/concurrent/ExecutorService;
    //   84: aload_2
    //   85: invokeinterface 408 2 0
    //   90: putfield 115	y5/f:g	Ljava/util/concurrent/Future;
    //   93: aload_3
    //   94: ifnull +7 -> 101
    //   97: aload_3
    //   98: invokevirtual 312	T5/f:close	()V
    //   101: return
    //   102: astore_1
    //   103: aload_3
    //   104: ifnull +16 -> 120
    //   107: aload_3
    //   108: invokevirtual 312	T5/f:close	()V
    //   111: goto +9 -> 120
    //   114: astore_2
    //   115: aload_1
    //   116: aload_2
    //   117: invokevirtual 318	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   120: aload_1
    //   121: athrow
    //   122: new 333	java/lang/IllegalStateException
    //   125: dup
    //   126: ldc_w 410
    //   129: invokespecial 338	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	f
    //   0	133	1	paramContext	Context
    //   0	133	2	paramc	c
    //   23	85	3	localf	T5.f
    // Exception table:
    //   from	to	target	type
    //   24	93	102	finally
    //   107	111	114	finally
  }
  
  public class a
    implements Callable
  {
    public a(Context paramContext) {}
    
    /* Error */
    public f.b b()
    {
      // Byte code:
      //   0: ldc 36
      //   2: invokestatic 42	T5/f:i	(Ljava/lang/String;)LT5/f;
      //   5: astore_1
      //   6: aload_0
      //   7: getfield 19	y5/f$a:p	Ly5/f;
      //   10: aload_0
      //   11: getfield 21	y5/f$a:o	Landroid/content/Context;
      //   14: invokestatic 45	y5/f:c	(Ly5/f;Landroid/content/Context;)Ly5/g;
      //   17: pop
      //   18: aload_0
      //   19: getfield 19	y5/f$a:p	Ly5/f;
      //   22: invokestatic 49	y5/f:d	(Ly5/f;)Lio/flutter/embedding/engine/FlutterJNI;
      //   25: invokevirtual 54	io/flutter/embedding/engine/FlutterJNI:loadLibrary	()V
      //   28: aload_0
      //   29: getfield 19	y5/f$a:p	Ly5/f;
      //   32: invokestatic 49	y5/f:d	(Ly5/f;)Lio/flutter/embedding/engine/FlutterJNI;
      //   35: invokevirtual 57	io/flutter/embedding/engine/FlutterJNI:updateRefreshRate	()V
      //   38: aload_0
      //   39: getfield 19	y5/f$a:p	Ly5/f;
      //   42: invokestatic 61	y5/f:f	(Ly5/f;)Ljava/util/concurrent/ExecutorService;
      //   45: astore_2
      //   46: new 63	y5/e
      //   49: astore_3
      //   50: aload_3
      //   51: aload_0
      //   52: invokespecial 65	y5/e:<init>	(Ly5/f$a;)V
      //   55: aload_2
      //   56: aload_3
      //   57: invokeinterface 71 2 0
      //   62: new 73	y5/f$b
      //   65: dup
      //   66: aload_0
      //   67: getfield 21	y5/f$a:o	Landroid/content/Context;
      //   70: invokestatic 78	T5/c:d	(Landroid/content/Context;)Ljava/lang/String;
      //   73: aload_0
      //   74: getfield 21	y5/f$a:o	Landroid/content/Context;
      //   77: invokestatic 80	T5/c:a	(Landroid/content/Context;)Ljava/lang/String;
      //   80: aload_0
      //   81: getfield 21	y5/f$a:o	Landroid/content/Context;
      //   84: invokestatic 82	T5/c:c	(Landroid/content/Context;)Ljava/lang/String;
      //   87: aconst_null
      //   88: invokespecial 85	y5/f$b:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly5/f$a;)V
      //   91: astore_2
      //   92: aload_1
      //   93: ifnull +7 -> 100
      //   96: aload_1
      //   97: invokevirtual 88	T5/f:close	()V
      //   100: aload_2
      //   101: areturn
      //   102: astore_2
      //   103: goto +146 -> 249
      //   106: astore_3
      //   107: aload_3
      //   108: invokevirtual 92	java/lang/Object:toString	()Ljava/lang/String;
      //   111: ldc 94
      //   113: invokevirtual 100	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   116: ifne +20 -> 136
      //   119: aload_3
      //   120: invokevirtual 92	java/lang/Object:toString	()Ljava/lang/String;
      //   123: ldc 102
      //   125: invokevirtual 100	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
      //   128: ifeq +6 -> 134
      //   131: goto +5 -> 136
      //   134: aload_3
      //   135: athrow
      //   136: ldc 104
      //   138: invokestatic 110	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
      //   141: astore 4
      //   143: new 112	java/io/File
      //   146: astore_2
      //   147: aload_2
      //   148: aload_0
      //   149: getfield 19	y5/f$a:p	Ly5/f;
      //   152: invokestatic 116	y5/f:e	(Ly5/f;)Ly5/b;
      //   155: getfield 121	y5/b:f	Ljava/lang/String;
      //   158: invokespecial 124	java/io/File:<init>	(Ljava/lang/String;)V
      //   161: aload_2
      //   162: invokevirtual 128	java/io/File:list	()[Ljava/lang/String;
      //   165: astore 5
      //   167: new 130	java/lang/UnsupportedOperationException
      //   170: astore 6
      //   172: new 132	java/lang/StringBuilder
      //   175: astore 7
      //   177: aload 7
      //   179: invokespecial 133	java/lang/StringBuilder:<init>	()V
      //   182: aload 7
      //   184: ldc -121
      //   186: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   189: pop
      //   190: aload 7
      //   192: aload 4
      //   194: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   197: pop
      //   198: aload 7
      //   200: ldc -115
      //   202: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   205: pop
      //   206: aload 7
      //   208: aload_2
      //   209: invokevirtual 144	java/io/File:getAbsolutePath	()Ljava/lang/String;
      //   212: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   215: pop
      //   216: aload 7
      //   218: ldc -110
      //   220: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   223: pop
      //   224: aload 7
      //   226: aload 5
      //   228: invokestatic 151	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
      //   231: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   234: pop
      //   235: aload 6
      //   237: aload 7
      //   239: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   242: aload_3
      //   243: invokespecial 155	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   246: aload 6
      //   248: athrow
      //   249: aload_1
      //   250: ifnull +16 -> 266
      //   253: aload_1
      //   254: invokevirtual 88	T5/f:close	()V
      //   257: goto +9 -> 266
      //   260: astore_1
      //   261: aload_2
      //   262: aload_1
      //   263: invokevirtual 161	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   266: aload_2
      //   267: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	268	0	this	a
      //   5	249	1	localf	T5.f
      //   260	3	1	localThrowable	Throwable
      //   45	56	2	localObject1	Object
      //   102	1	2	localObject2	Object
      //   146	121	2	localFile	java.io.File
      //   49	8	3	locale	e
      //   106	137	3	localUnsatisfiedLinkError	UnsatisfiedLinkError
      //   141	52	4	str	String
      //   165	62	5	arrayOfString	String[]
      //   170	77	6	localUnsupportedOperationException	UnsupportedOperationException
      //   175	63	7	localStringBuilder	StringBuilder
      // Exception table:
      //   from	to	target	type
      //   6	18	102	finally
      //   18	28	102	finally
      //   28	92	102	finally
      //   107	131	102	finally
      //   134	136	102	finally
      //   136	249	102	finally
      //   18	28	106	java/lang/UnsatisfiedLinkError
      //   253	257	260	finally
    }
  }
  
  public static class b
  {
    public final String a;
    public final String b;
    public final String c;
    
    public b(String paramString1, String paramString2, String paramString3)
    {
      a = paramString1;
      b = paramString2;
      c = paramString3;
    }
  }
  
  public static class c
  {
    public String a;
    
    public String a()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     y5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.gms.dynamite;

import A2.m;
import A2.n;
import I2.j;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule
{
  public static final b b = new b();
  public static final b c = new c();
  public static final b d = new d();
  public static final b e = new e();
  public static final b f = new f();
  public static final b g = new g();
  public static Boolean h;
  public static String i;
  public static boolean j = false;
  public static int k = -1;
  public static Boolean l;
  public static final ThreadLocal m = new ThreadLocal();
  public static final ThreadLocal n = new I2.f();
  public static final DynamiteModule.b.a o = new a();
  public static final b p = new h();
  public static j q;
  public static I2.k r;
  public final Context a;
  
  public DynamiteModule(Context paramContext)
  {
    n.i(paramContext);
    a = paramContext;
  }
  
  public static int a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getApplicationContext().getClassLoader();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("com.google.android.gms.dynamite.descriptors.");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(".ModuleDescriptor");
      localObject = paramContext.loadClass(((StringBuilder)localObject).toString());
      paramContext = ((Class)localObject).getDeclaredField("MODULE_ID");
      localObject = ((Class)localObject).getDeclaredField("MODULE_VERSION");
      if (!m.a(paramContext.get(null), paramString))
      {
        localObject = String.valueOf(paramContext.get(null));
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext.append("Module descriptor id '");
        paramContext.append((String)localObject);
        paramContext.append("' didn't match expected id '");
        paramContext.append(paramString);
        paramContext.append("'");
        Log.e("DynamiteModule", paramContext.toString());
        return 0;
      }
    }
    catch (Exception paramContext)
    {
      Object localObject;
      break label145;
      int i1 = ((Field)localObject).getInt(null);
      return i1;
      Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(paramContext.getMessage())));
    }
    catch (ClassNotFoundException paramContext)
    {
      label145:
      paramContext = new StringBuilder();
      paramContext.append("Local module descriptor class for ");
      paramContext.append(paramString);
      paramContext.append(" not found.");
      Log.w("DynamiteModule", paramContext.toString());
    }
    return 0;
  }
  
  public static int b(Context paramContext, String paramString)
  {
    return e(paramContext, paramString, false);
  }
  
  /* Error */
  public static DynamiteModule d(Context paramContext, b paramb, String paramString)
  {
    // Byte code:
    //   0: getstatic 54	com/google/android/gms/dynamite/DynamiteModule:m	Ljava/lang/ThreadLocal;
    //   3: astore_3
    //   4: aload_3
    //   5: invokevirtual 215	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   8: checkcast 217	I2/h
    //   11: astore 4
    //   13: new 217	I2/h
    //   16: dup
    //   17: aconst_null
    //   18: invokespecial 220	I2/h:<init>	(LI2/g;)V
    //   21: astore 5
    //   23: aload_3
    //   24: aload 5
    //   26: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   29: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:n	Ljava/lang/ThreadLocal;
    //   32: astore 6
    //   34: aload 6
    //   36: invokevirtual 215	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   39: checkcast 226	java/lang/Long
    //   42: astore 7
    //   44: aload 7
    //   46: invokevirtual 230	java/lang/Long:longValue	()J
    //   49: lstore 8
    //   51: aload 6
    //   53: invokestatic 235	android/os/SystemClock:elapsedRealtime	()J
    //   56: invokestatic 238	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   59: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   62: aload_1
    //   63: aload_0
    //   64: aload_2
    //   65: getstatic 64	com/google/android/gms/dynamite/DynamiteModule:o	Lcom/google/android/gms/dynamite/DynamiteModule$b$a;
    //   68: invokeinterface 241 4 0
    //   73: astore 10
    //   75: aload 10
    //   77: getfield 243	com/google/android/gms/dynamite/DynamiteModule$b$b:a	I
    //   80: istore 11
    //   82: aload 10
    //   84: getfield 245	com/google/android/gms/dynamite/DynamiteModule$b$b:b	I
    //   87: istore 12
    //   89: new 126	java/lang/StringBuilder
    //   92: astore 13
    //   94: aload 13
    //   96: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   99: aload 13
    //   101: ldc -9
    //   103: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload 13
    //   109: aload_2
    //   110: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload 13
    //   116: ldc -7
    //   118: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload 13
    //   124: iload 11
    //   126: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload 13
    //   132: ldc -2
    //   134: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload 13
    //   140: aload_2
    //   141: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload 13
    //   147: ldc -7
    //   149: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: aload 13
    //   155: iload 12
    //   157: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: ldc -77
    //   163: aload 13
    //   165: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokestatic 256	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   171: pop
    //   172: aload 10
    //   174: getfield 258	com/google/android/gms/dynamite/DynamiteModule$b$b:c	I
    //   177: istore 12
    //   179: iload 12
    //   181: ifeq +1044 -> 1225
    //   184: iload 12
    //   186: istore 11
    //   188: iload 12
    //   190: iconst_m1
    //   191: if_icmpne +21 -> 212
    //   194: aload 10
    //   196: getfield 243	com/google/android/gms/dynamite/DynamiteModule$b$b:a	I
    //   199: ifeq +1026 -> 1225
    //   202: iconst_m1
    //   203: istore 11
    //   205: goto +7 -> 212
    //   208: astore_0
    //   209: goto +1105 -> 1314
    //   212: iload 11
    //   214: iconst_1
    //   215: if_icmpne +11 -> 226
    //   218: aload 10
    //   220: getfield 245	com/google/android/gms/dynamite/DynamiteModule$b$b:b	I
    //   223: ifeq +1002 -> 1225
    //   226: iload 11
    //   228: iconst_m1
    //   229: if_icmpne +55 -> 284
    //   232: aload_0
    //   233: aload_2
    //   234: invokestatic 261	com/google/android/gms/dynamite/DynamiteModule:g	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   237: astore_0
    //   238: lload 8
    //   240: lconst_0
    //   241: lcmp
    //   242: ifne +11 -> 253
    //   245: aload 6
    //   247: invokevirtual 264	java/lang/ThreadLocal:remove	()V
    //   250: goto +10 -> 260
    //   253: aload 6
    //   255: aload 7
    //   257: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   260: aload 5
    //   262: getfield 267	I2/h:a	Landroid/database/Cursor;
    //   265: astore_1
    //   266: aload_1
    //   267: ifnull +9 -> 276
    //   270: aload_1
    //   271: invokeinterface 272 1 0
    //   276: aload_3
    //   277: aload 4
    //   279: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   282: aload_0
    //   283: areturn
    //   284: iload 11
    //   286: iconst_1
    //   287: if_icmpne +900 -> 1187
    //   290: aload 10
    //   292: getfield 245	com/google/android/gms/dynamite/DynamiteModule$b$b:b	I
    //   295: istore 12
    //   297: ldc 2
    //   299: monitorenter
    //   300: aload_0
    //   301: invokestatic 275	com/google/android/gms/dynamite/DynamiteModule:j	(Landroid/content/Context;)Z
    //   304: ifeq +658 -> 962
    //   307: getstatic 277	com/google/android/gms/dynamite/DynamiteModule:h	Ljava/lang/Boolean;
    //   310: astore 13
    //   312: ldc 2
    //   314: monitorexit
    //   315: aload 13
    //   317: ifnull +623 -> 940
    //   320: aload 13
    //   322: invokevirtual 283	java/lang/Boolean:booleanValue	()Z
    //   325: ifeq +314 -> 639
    //   328: new 126	java/lang/StringBuilder
    //   331: astore 13
    //   333: aload 13
    //   335: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   338: aload 13
    //   340: ldc_w 285
    //   343: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: aload 13
    //   349: aload_2
    //   350: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: pop
    //   354: aload 13
    //   356: ldc_w 287
    //   359: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: pop
    //   363: aload 13
    //   365: iload 12
    //   367: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   370: pop
    //   371: ldc -77
    //   373: aload 13
    //   375: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   378: invokestatic 256	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   381: pop
    //   382: ldc 2
    //   384: monitorenter
    //   385: getstatic 289	com/google/android/gms/dynamite/DynamiteModule:r	LI2/k;
    //   388: astore 14
    //   390: ldc 2
    //   392: monitorexit
    //   393: aload 14
    //   395: ifnull +219 -> 614
    //   398: aload_3
    //   399: invokevirtual 215	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   402: checkcast 217	I2/h
    //   405: astore 15
    //   407: aload 15
    //   409: ifnull +188 -> 597
    //   412: aload 15
    //   414: getfield 267	I2/h:a	Landroid/database/Cursor;
    //   417: ifnull +180 -> 597
    //   420: aload_0
    //   421: invokevirtual 120	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   424: astore 13
    //   426: aload 15
    //   428: getfield 267	I2/h:a	Landroid/database/Cursor;
    //   431: astore 15
    //   433: aconst_null
    //   434: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   437: pop
    //   438: ldc 2
    //   440: monitorenter
    //   441: getstatic 297	com/google/android/gms/dynamite/DynamiteModule:k	I
    //   444: iconst_2
    //   445: if_icmplt +9 -> 454
    //   448: iconst_1
    //   449: istore 11
    //   451: goto +6 -> 457
    //   454: iconst_0
    //   455: istore 11
    //   457: ldc 2
    //   459: monitorexit
    //   460: iload 11
    //   462: ifeq +49 -> 511
    //   465: ldc -77
    //   467: ldc_w 299
    //   470: invokestatic 302	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   473: pop
    //   474: aload 14
    //   476: aload 13
    //   478: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   481: aload_2
    //   482: iload 12
    //   484: aload 15
    //   486: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   489: invokevirtual 307	I2/k:Z0	(LH2/a;Ljava/lang/String;ILH2/a;)LH2/a;
    //   492: astore 13
    //   494: goto +46 -> 540
    //   497: astore_3
    //   498: goto +487 -> 985
    //   501: astore 13
    //   503: goto +511 -> 1014
    //   506: astore 13
    //   508: goto +509 -> 1017
    //   511: ldc -77
    //   513: ldc_w 309
    //   516: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   519: pop
    //   520: aload 14
    //   522: aload 13
    //   524: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   527: aload_2
    //   528: iload 12
    //   530: aload 15
    //   532: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   535: invokevirtual 311	I2/k:v	(LH2/a;Ljava/lang/String;ILH2/a;)LH2/a;
    //   538: astore 13
    //   540: aload 13
    //   542: invokestatic 314	H2/b:v	(LH2/a;)Ljava/lang/Object;
    //   545: checkcast 116	android/content/Context
    //   548: astore 13
    //   550: aload 13
    //   552: ifnull +20 -> 572
    //   555: new 2	com/google/android/gms/dynamite/DynamiteModule
    //   558: dup
    //   559: aload 13
    //   561: invokespecial 316	com/google/android/gms/dynamite/DynamiteModule:<init>	(Landroid/content/Context;)V
    //   564: astore 13
    //   566: aload 13
    //   568: astore_0
    //   569: goto +291 -> 860
    //   572: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   575: astore 13
    //   577: aload 13
    //   579: ldc_w 318
    //   582: aconst_null
    //   583: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   586: aload 13
    //   588: athrow
    //   589: astore 13
    //   591: ldc 2
    //   593: monitorexit
    //   594: aload 13
    //   596: athrow
    //   597: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   600: astore 13
    //   602: aload 13
    //   604: ldc_w 323
    //   607: aconst_null
    //   608: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   611: aload 13
    //   613: athrow
    //   614: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   617: astore 13
    //   619: aload 13
    //   621: ldc_w 325
    //   624: aconst_null
    //   625: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   628: aload 13
    //   630: athrow
    //   631: astore 13
    //   633: ldc 2
    //   635: monitorexit
    //   636: aload 13
    //   638: athrow
    //   639: new 126	java/lang/StringBuilder
    //   642: astore 13
    //   644: aload 13
    //   646: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   649: aload 13
    //   651: ldc_w 285
    //   654: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   657: pop
    //   658: aload 13
    //   660: aload_2
    //   661: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   664: pop
    //   665: aload 13
    //   667: ldc_w 287
    //   670: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   673: pop
    //   674: aload 13
    //   676: iload 12
    //   678: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   681: pop
    //   682: ldc -77
    //   684: aload 13
    //   686: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   689: invokestatic 256	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   692: pop
    //   693: aload_0
    //   694: invokestatic 328	com/google/android/gms/dynamite/DynamiteModule:k	(Landroid/content/Context;)LI2/j;
    //   697: astore 14
    //   699: aload 14
    //   701: ifnull +222 -> 923
    //   704: aload 14
    //   706: invokevirtual 333	I2/j:v	()I
    //   709: istore 11
    //   711: iload 11
    //   713: iconst_3
    //   714: if_icmplt +59 -> 773
    //   717: aload_3
    //   718: invokevirtual 215	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   721: checkcast 217	I2/h
    //   724: astore 13
    //   726: aload 13
    //   728: ifnull +28 -> 756
    //   731: aload 14
    //   733: aload_0
    //   734: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   737: aload_2
    //   738: iload 12
    //   740: aload 13
    //   742: getfield 267	I2/h:a	Landroid/database/Cursor;
    //   745: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   748: invokevirtual 336	I2/j:c1	(LH2/a;Ljava/lang/String;ILH2/a;)LH2/a;
    //   751: astore 13
    //   753: goto +75 -> 828
    //   756: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   759: astore 13
    //   761: aload 13
    //   763: ldc_w 338
    //   766: aconst_null
    //   767: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   770: aload 13
    //   772: athrow
    //   773: iload 11
    //   775: iconst_2
    //   776: if_icmpne +29 -> 805
    //   779: ldc -77
    //   781: ldc_w 340
    //   784: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   787: pop
    //   788: aload 14
    //   790: aload_0
    //   791: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   794: aload_2
    //   795: iload 12
    //   797: invokevirtual 344	I2/j:d1	(LH2/a;Ljava/lang/String;I)LH2/a;
    //   800: astore 13
    //   802: goto +26 -> 828
    //   805: ldc -77
    //   807: ldc_w 346
    //   810: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   813: pop
    //   814: aload 14
    //   816: aload_0
    //   817: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   820: aload_2
    //   821: iload 12
    //   823: invokevirtual 349	I2/j:b1	(LH2/a;Ljava/lang/String;I)LH2/a;
    //   826: astore 13
    //   828: aload 13
    //   830: invokestatic 314	H2/b:v	(LH2/a;)Ljava/lang/Object;
    //   833: astore 13
    //   835: aload 13
    //   837: ifnull +69 -> 906
    //   840: new 2	com/google/android/gms/dynamite/DynamiteModule
    //   843: dup
    //   844: aload 13
    //   846: checkcast 116	android/content/Context
    //   849: invokespecial 316	com/google/android/gms/dynamite/DynamiteModule:<init>	(Landroid/content/Context;)V
    //   852: astore 13
    //   854: aload 13
    //   856: astore_0
    //   857: goto -288 -> 569
    //   860: lload 8
    //   862: lconst_0
    //   863: lcmp
    //   864: ifne +11 -> 875
    //   867: aload 6
    //   869: invokevirtual 264	java/lang/ThreadLocal:remove	()V
    //   872: goto +10 -> 882
    //   875: aload 6
    //   877: aload 7
    //   879: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   882: aload 5
    //   884: getfield 267	I2/h:a	Landroid/database/Cursor;
    //   887: astore_1
    //   888: aload_1
    //   889: ifnull +9 -> 898
    //   892: aload_1
    //   893: invokeinterface 272 1 0
    //   898: aload_3
    //   899: aload 4
    //   901: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   904: aload_0
    //   905: areturn
    //   906: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   909: astore 13
    //   911: aload 13
    //   913: ldc_w 351
    //   916: aconst_null
    //   917: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   920: aload 13
    //   922: athrow
    //   923: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   926: astore 13
    //   928: aload 13
    //   930: ldc_w 353
    //   933: aconst_null
    //   934: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   937: aload 13
    //   939: athrow
    //   940: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   943: astore 13
    //   945: aload 13
    //   947: ldc_w 355
    //   950: aconst_null
    //   951: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   954: aload 13
    //   956: athrow
    //   957: astore 13
    //   959: goto +20 -> 979
    //   962: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   965: astore 13
    //   967: aload 13
    //   969: ldc_w 357
    //   972: aconst_null
    //   973: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   976: aload 13
    //   978: athrow
    //   979: ldc 2
    //   981: monitorexit
    //   982: aload 13
    //   984: athrow
    //   985: aload_0
    //   986: aload_3
    //   987: invokestatic 362	E2/g:a	(Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   990: pop
    //   991: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   994: astore 13
    //   996: aload 13
    //   998: ldc_w 351
    //   1001: aload_3
    //   1002: aconst_null
    //   1003: invokespecial 365	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;LI2/i;)V
    //   1006: aload 13
    //   1008: athrow
    //   1009: astore 13
    //   1011: goto +22 -> 1033
    //   1014: aload 13
    //   1016: athrow
    //   1017: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   1020: astore_3
    //   1021: aload_3
    //   1022: ldc_w 351
    //   1025: aload 13
    //   1027: aconst_null
    //   1028: invokespecial 365	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;LI2/i;)V
    //   1031: aload_3
    //   1032: athrow
    //   1033: aload 13
    //   1035: invokevirtual 195	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1038: astore 6
    //   1040: new 126	java/lang/StringBuilder
    //   1043: astore_3
    //   1044: aload_3
    //   1045: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   1048: aload_3
    //   1049: ldc_w 367
    //   1052: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1055: pop
    //   1056: aload_3
    //   1057: aload 6
    //   1059: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1062: pop
    //   1063: ldc -77
    //   1065: aload_3
    //   1066: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1069: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   1072: pop
    //   1073: aload 10
    //   1075: getfield 243	com/google/android/gms/dynamite/DynamiteModule$b$b:a	I
    //   1078: istore 11
    //   1080: iload 11
    //   1082: ifeq +89 -> 1171
    //   1085: new 369	com/google/android/gms/dynamite/i
    //   1088: astore 10
    //   1090: aload 10
    //   1092: iload 11
    //   1094: iconst_0
    //   1095: invokespecial 372	com/google/android/gms/dynamite/i:<init>	(II)V
    //   1098: aload_1
    //   1099: aload_0
    //   1100: aload_2
    //   1101: aload 10
    //   1103: invokeinterface 241 4 0
    //   1108: getfield 258	com/google/android/gms/dynamite/DynamiteModule$b$b:c	I
    //   1111: iconst_m1
    //   1112: if_icmpne +59 -> 1171
    //   1115: aload_0
    //   1116: aload_2
    //   1117: invokestatic 261	com/google/android/gms/dynamite/DynamiteModule:g	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   1120: astore_0
    //   1121: lload 8
    //   1123: lconst_0
    //   1124: lcmp
    //   1125: ifne +12 -> 1137
    //   1128: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:n	Ljava/lang/ThreadLocal;
    //   1131: invokevirtual 264	java/lang/ThreadLocal:remove	()V
    //   1134: goto +11 -> 1145
    //   1137: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:n	Ljava/lang/ThreadLocal;
    //   1140: aload 7
    //   1142: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1145: aload 5
    //   1147: getfield 267	I2/h:a	Landroid/database/Cursor;
    //   1150: astore_1
    //   1151: aload_1
    //   1152: ifnull +9 -> 1161
    //   1155: aload_1
    //   1156: invokeinterface 272 1 0
    //   1161: getstatic 54	com/google/android/gms/dynamite/DynamiteModule:m	Ljava/lang/ThreadLocal;
    //   1164: aload 4
    //   1166: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1169: aload_0
    //   1170: areturn
    //   1171: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   1174: astore_0
    //   1175: aload_0
    //   1176: ldc_w 374
    //   1179: aload 13
    //   1181: aconst_null
    //   1182: invokespecial 365	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;LI2/i;)V
    //   1185: aload_0
    //   1186: athrow
    //   1187: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   1190: astore_0
    //   1191: new 126	java/lang/StringBuilder
    //   1194: astore_1
    //   1195: aload_1
    //   1196: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   1199: aload_1
    //   1200: ldc_w 376
    //   1203: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1206: pop
    //   1207: aload_1
    //   1208: iload 11
    //   1210: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1213: pop
    //   1214: aload_0
    //   1215: aload_1
    //   1216: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1219: aconst_null
    //   1220: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   1223: aload_0
    //   1224: athrow
    //   1225: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   1228: astore_0
    //   1229: aload 10
    //   1231: getfield 243	com/google/android/gms/dynamite/DynamiteModule$b$b:a	I
    //   1234: istore 11
    //   1236: aload 10
    //   1238: getfield 245	com/google/android/gms/dynamite/DynamiteModule$b$b:b	I
    //   1241: istore 12
    //   1243: new 126	java/lang/StringBuilder
    //   1246: astore_1
    //   1247: aload_1
    //   1248: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   1251: aload_1
    //   1252: ldc_w 378
    //   1255: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1258: pop
    //   1259: aload_1
    //   1260: aload_2
    //   1261: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1264: pop
    //   1265: aload_1
    //   1266: ldc_w 380
    //   1269: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1272: pop
    //   1273: aload_1
    //   1274: iload 11
    //   1276: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1279: pop
    //   1280: aload_1
    //   1281: ldc_w 382
    //   1284: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1287: pop
    //   1288: aload_1
    //   1289: iload 12
    //   1291: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1294: pop
    //   1295: aload_1
    //   1296: ldc_w 384
    //   1299: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1302: pop
    //   1303: aload_0
    //   1304: aload_1
    //   1305: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1308: aconst_null
    //   1309: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   1312: aload_0
    //   1313: athrow
    //   1314: lload 8
    //   1316: lconst_0
    //   1317: lcmp
    //   1318: ifne +12 -> 1330
    //   1321: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:n	Ljava/lang/ThreadLocal;
    //   1324: invokevirtual 264	java/lang/ThreadLocal:remove	()V
    //   1327: goto +11 -> 1338
    //   1330: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:n	Ljava/lang/ThreadLocal;
    //   1333: aload 7
    //   1335: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1338: aload 5
    //   1340: getfield 267	I2/h:a	Landroid/database/Cursor;
    //   1343: astore_1
    //   1344: aload_1
    //   1345: ifnull +9 -> 1354
    //   1348: aload_1
    //   1349: invokeinterface 272 1 0
    //   1354: getstatic 54	com/google/android/gms/dynamite/DynamiteModule:m	Ljava/lang/ThreadLocal;
    //   1357: aload 4
    //   1359: invokevirtual 224	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1362: aload_0
    //   1363: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1364	0	paramContext	Context
    //   0	1364	1	paramb	b
    //   0	1364	2	paramString	String
    //   3	396	3	localThreadLocal	ThreadLocal
    //   497	505	3	localThrowable	Throwable
    //   1020	46	3	localObject1	Object
    //   11	1347	4	localh1	I2.h
    //   21	1318	5	localh2	I2.h
    //   32	1026	6	localObject2	Object
    //   42	1292	7	localLong	Long
    //   49	1266	8	l1	long
    //   73	1164	10	localObject3	Object
    //   80	1195	11	i1	int
    //   87	1203	12	i2	int
    //   92	401	13	localObject4	Object
    //   501	1	13	locala1	a
    //   506	17	13	localRemoteException	android.os.RemoteException
    //   538	49	13	localObject5	Object
    //   589	6	13	localObject6	Object
    //   600	29	13	locala2	a
    //   631	6	13	localObject7	Object
    //   642	313	13	localObject8	Object
    //   957	1	13	localObject9	Object
    //   965	42	13	locala3	a
    //   1009	171	13	locala4	a
    //   388	427	14	localObject10	Object
    //   405	126	15	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   51	179	208	finally
    //   194	202	208	finally
    //   218	226	208	finally
    //   232	238	208	finally
    //   290	297	208	finally
    //   985	1009	208	finally
    //   1014	1017	208	finally
    //   1017	1033	208	finally
    //   1033	1080	208	finally
    //   1085	1121	208	finally
    //   1171	1187	208	finally
    //   1187	1225	208	finally
    //   1225	1314	208	finally
    //   297	300	497	finally
    //   320	385	497	finally
    //   398	407	497	finally
    //   412	441	497	finally
    //   465	494	497	finally
    //   511	540	497	finally
    //   540	550	497	finally
    //   555	566	497	finally
    //   572	589	497	finally
    //   594	597	497	finally
    //   597	614	497	finally
    //   614	631	497	finally
    //   636	639	497	finally
    //   639	699	497	finally
    //   704	711	497	finally
    //   717	726	497	finally
    //   731	753	497	finally
    //   756	773	497	finally
    //   779	802	497	finally
    //   805	828	497	finally
    //   828	835	497	finally
    //   840	854	497	finally
    //   906	923	497	finally
    //   923	940	497	finally
    //   940	957	497	finally
    //   982	985	497	finally
    //   297	300	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   320	385	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   398	407	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   412	441	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   465	494	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   511	540	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   540	550	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   555	566	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   572	589	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   594	597	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   597	614	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   614	631	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   636	639	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   639	699	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   704	711	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   717	726	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   731	753	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   756	773	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   779	802	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   805	828	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   828	835	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   840	854	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   906	923	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   923	940	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   940	957	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   982	985	501	com/google/android/gms/dynamite/DynamiteModule$a
    //   297	300	506	android/os/RemoteException
    //   320	385	506	android/os/RemoteException
    //   398	407	506	android/os/RemoteException
    //   412	441	506	android/os/RemoteException
    //   465	494	506	android/os/RemoteException
    //   511	540	506	android/os/RemoteException
    //   540	550	506	android/os/RemoteException
    //   555	566	506	android/os/RemoteException
    //   572	589	506	android/os/RemoteException
    //   594	597	506	android/os/RemoteException
    //   597	614	506	android/os/RemoteException
    //   614	631	506	android/os/RemoteException
    //   636	639	506	android/os/RemoteException
    //   639	699	506	android/os/RemoteException
    //   704	711	506	android/os/RemoteException
    //   717	726	506	android/os/RemoteException
    //   731	753	506	android/os/RemoteException
    //   756	773	506	android/os/RemoteException
    //   779	802	506	android/os/RemoteException
    //   805	828	506	android/os/RemoteException
    //   828	835	506	android/os/RemoteException
    //   840	854	506	android/os/RemoteException
    //   906	923	506	android/os/RemoteException
    //   923	940	506	android/os/RemoteException
    //   940	957	506	android/os/RemoteException
    //   982	985	506	android/os/RemoteException
    //   441	448	589	finally
    //   457	460	589	finally
    //   591	594	589	finally
    //   385	393	631	finally
    //   633	636	631	finally
    //   300	315	957	finally
    //   962	979	957	finally
    //   979	982	957	finally
    //   290	297	1009	com/google/android/gms/dynamite/DynamiteModule$a
    //   985	1009	1009	com/google/android/gms/dynamite/DynamiteModule$a
    //   1014	1017	1009	com/google/android/gms/dynamite/DynamiteModule$a
    //   1017	1033	1009	com/google/android/gms/dynamite/DynamiteModule$a
  }
  
  /* Error */
  public static int e(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 277	com/google/android/gms/dynamite/DynamiteModule:h	Ljava/lang/Boolean;
    //   6: astore_3
    //   7: aconst_null
    //   8: astore 4
    //   10: aconst_null
    //   11: astore 5
    //   13: aconst_null
    //   14: astore 6
    //   16: iconst_0
    //   17: istore 7
    //   19: aload_3
    //   20: astore 8
    //   22: aload_3
    //   23: ifnonnull +367 -> 390
    //   26: aload_0
    //   27: invokevirtual 120	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   30: invokevirtual 124	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   33: ldc 6
    //   35: invokevirtual 391	java/lang/Class:getName	()Ljava/lang/String;
    //   38: invokevirtual 145	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   41: ldc_w 393
    //   44: invokevirtual 153	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   47: astore 9
    //   49: aload 9
    //   51: invokevirtual 397	java/lang/reflect/Field:getDeclaringClass	()Ljava/lang/Class;
    //   54: astore_3
    //   55: aload_3
    //   56: monitorenter
    //   57: aload 9
    //   59: aconst_null
    //   60: invokevirtual 160	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast 141	java/lang/ClassLoader
    //   66: astore 8
    //   68: aload 8
    //   70: invokestatic 400	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   73: if_acmpne +16 -> 89
    //   76: getstatic 403	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   79: astore 8
    //   81: goto +234 -> 315
    //   84: astore 8
    //   86: goto +234 -> 320
    //   89: aload 8
    //   91: ifnull +16 -> 107
    //   94: aload 8
    //   96: invokestatic 406	com/google/android/gms/dynamite/DynamiteModule:h	(Ljava/lang/ClassLoader;)V
    //   99: getstatic 409	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   102: astore 8
    //   104: goto +211 -> 315
    //   107: aload_0
    //   108: invokestatic 275	com/google/android/gms/dynamite/DynamiteModule:j	(Landroid/content/Context;)Z
    //   111: ifne +14 -> 125
    //   114: aload_3
    //   115: monitorexit
    //   116: ldc 2
    //   118: monitorexit
    //   119: iconst_0
    //   120: ireturn
    //   121: astore_1
    //   122: goto +760 -> 882
    //   125: getstatic 411	com/google/android/gms/dynamite/DynamiteModule:j	Z
    //   128: ifne +175 -> 303
    //   131: getstatic 409	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   134: astore 10
    //   136: aload 10
    //   138: aconst_null
    //   139: invokevirtual 415	java/lang/Boolean:equals	(Ljava/lang/Object;)Z
    //   142: istore 11
    //   144: iload 11
    //   146: ifeq +6 -> 152
    //   149: goto +154 -> 303
    //   152: aload_0
    //   153: aload_1
    //   154: iload_2
    //   155: iconst_1
    //   156: invokestatic 418	com/google/android/gms/dynamite/DynamiteModule:f	(Landroid/content/Context;Ljava/lang/String;ZZ)I
    //   159: istore 12
    //   161: getstatic 420	com/google/android/gms/dynamite/DynamiteModule:i	Ljava/lang/String;
    //   164: astore 8
    //   166: aload 8
    //   168: ifnull +113 -> 281
    //   171: aload 8
    //   173: invokevirtual 423	java/lang/String:isEmpty	()Z
    //   176: ifeq +6 -> 182
    //   179: goto +102 -> 281
    //   182: invokestatic 427	I2/d:a	()Ljava/lang/ClassLoader;
    //   185: astore 8
    //   187: aload 8
    //   189: ifnull +6 -> 195
    //   192: goto +63 -> 255
    //   195: getstatic 432	android/os/Build$VERSION:SDK_INT	I
    //   198: bipush 29
    //   200: if_icmplt +30 -> 230
    //   203: invokestatic 436	I2/b:a	()V
    //   206: getstatic 420	com/google/android/gms/dynamite/DynamiteModule:i	Ljava/lang/String;
    //   209: astore 8
    //   211: aload 8
    //   213: invokestatic 107	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   216: pop
    //   217: aload 8
    //   219: invokestatic 400	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   222: invokestatic 441	I2/a:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)Ldalvik/system/DelegateLastClassLoader;
    //   225: astore 8
    //   227: goto +28 -> 255
    //   230: getstatic 420	com/google/android/gms/dynamite/DynamiteModule:i	Ljava/lang/String;
    //   233: astore 8
    //   235: aload 8
    //   237: invokestatic 107	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   240: pop
    //   241: new 443	I2/e
    //   244: dup
    //   245: aload 8
    //   247: invokestatic 400	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   250: invokespecial 446	I2/e:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   253: astore 8
    //   255: aload 8
    //   257: invokestatic 406	com/google/android/gms/dynamite/DynamiteModule:h	(Ljava/lang/ClassLoader;)V
    //   260: aload 9
    //   262: aconst_null
    //   263: aload 8
    //   265: invokevirtual 449	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   268: aload 10
    //   270: putstatic 277	com/google/android/gms/dynamite/DynamiteModule:h	Ljava/lang/Boolean;
    //   273: aload_3
    //   274: monitorexit
    //   275: ldc 2
    //   277: monitorexit
    //   278: iload 12
    //   280: ireturn
    //   281: aload_3
    //   282: monitorexit
    //   283: ldc 2
    //   285: monitorexit
    //   286: iload 12
    //   288: ireturn
    //   289: astore 8
    //   291: aload 9
    //   293: aconst_null
    //   294: invokestatic 400	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   297: invokevirtual 449	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   300: goto -224 -> 76
    //   303: aload 9
    //   305: aconst_null
    //   306: invokestatic 400	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   309: invokevirtual 449	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   312: goto -236 -> 76
    //   315: aload_3
    //   316: monitorexit
    //   317: goto +68 -> 385
    //   320: aload_3
    //   321: monitorexit
    //   322: aload 8
    //   324: athrow
    //   325: astore 8
    //   327: goto +10 -> 337
    //   330: astore 8
    //   332: goto +5 -> 337
    //   335: astore 8
    //   337: aload 8
    //   339: invokevirtual 450	java/lang/Object:toString	()Ljava/lang/String;
    //   342: astore_3
    //   343: new 126	java/lang/StringBuilder
    //   346: astore 8
    //   348: aload 8
    //   350: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   353: aload 8
    //   355: ldc_w 452
    //   358: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: pop
    //   362: aload 8
    //   364: aload_3
    //   365: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: pop
    //   369: ldc -77
    //   371: aload 8
    //   373: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   376: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   379: pop
    //   380: getstatic 403	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   383: astore 8
    //   385: aload 8
    //   387: putstatic 277	com/google/android/gms/dynamite/DynamiteModule:h	Ljava/lang/Boolean;
    //   390: ldc 2
    //   392: monitorexit
    //   393: aload 8
    //   395: invokevirtual 283	java/lang/Boolean:booleanValue	()Z
    //   398: istore 11
    //   400: iload 11
    //   402: ifeq +64 -> 466
    //   405: aload_0
    //   406: aload_1
    //   407: iload_2
    //   408: iconst_0
    //   409: invokestatic 418	com/google/android/gms/dynamite/DynamiteModule:f	(Landroid/content/Context;Ljava/lang/String;ZZ)I
    //   412: istore 12
    //   414: iload 12
    //   416: ireturn
    //   417: astore_1
    //   418: goto +469 -> 887
    //   421: astore_1
    //   422: aload_1
    //   423: invokevirtual 195	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   426: astore_1
    //   427: new 126	java/lang/StringBuilder
    //   430: astore 8
    //   432: aload 8
    //   434: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   437: aload 8
    //   439: ldc_w 454
    //   442: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: pop
    //   446: aload 8
    //   448: aload_1
    //   449: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: pop
    //   453: ldc -77
    //   455: aload 8
    //   457: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   460: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   463: pop
    //   464: iconst_0
    //   465: ireturn
    //   466: aload_0
    //   467: invokestatic 328	com/google/android/gms/dynamite/DynamiteModule:k	(Landroid/content/Context;)LI2/j;
    //   470: astore_3
    //   471: aload_3
    //   472: ifnonnull +10 -> 482
    //   475: iload 7
    //   477: istore 12
    //   479: goto +382 -> 861
    //   482: aload 5
    //   484: astore 8
    //   486: aload_3
    //   487: invokevirtual 333	I2/j:v	()I
    //   490: istore 12
    //   492: iload 12
    //   494: iconst_3
    //   495: if_icmplt +202 -> 697
    //   498: aload 5
    //   500: astore 8
    //   502: getstatic 54	com/google/android/gms/dynamite/DynamiteModule:m	Ljava/lang/ThreadLocal;
    //   505: invokevirtual 215	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   508: checkcast 217	I2/h
    //   511: astore 9
    //   513: aload 9
    //   515: ifnull +41 -> 556
    //   518: aload 5
    //   520: astore 8
    //   522: aload 9
    //   524: getfield 267	I2/h:a	Landroid/database/Cursor;
    //   527: astore 9
    //   529: aload 9
    //   531: ifnull +25 -> 556
    //   534: aload 5
    //   536: astore 8
    //   538: aload 9
    //   540: iconst_0
    //   541: invokeinterface 457 2 0
    //   546: istore 12
    //   548: goto +313 -> 861
    //   551: astore 6
    //   553: goto +224 -> 777
    //   556: aload 5
    //   558: astore 8
    //   560: aload_3
    //   561: aload_0
    //   562: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   565: aload_1
    //   566: iload_2
    //   567: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:n	Ljava/lang/ThreadLocal;
    //   570: invokevirtual 215	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   573: checkcast 226	java/lang/Long
    //   576: invokevirtual 230	java/lang/Long:longValue	()J
    //   579: invokevirtual 461	I2/j:e1	(LH2/a;Ljava/lang/String;ZJ)LH2/a;
    //   582: invokestatic 314	H2/b:v	(LH2/a;)Ljava/lang/Object;
    //   585: checkcast 269	android/database/Cursor
    //   588: astore_1
    //   589: aload_1
    //   590: ifnull +67 -> 657
    //   593: aload_1
    //   594: invokeinterface 464 1 0
    //   599: ifne +6 -> 605
    //   602: goto +55 -> 657
    //   605: aload_1
    //   606: iconst_0
    //   607: invokeinterface 457 2 0
    //   612: istore 12
    //   614: iload 12
    //   616: ifle +28 -> 644
    //   619: aload_1
    //   620: invokestatic 467	com/google/android/gms/dynamite/DynamiteModule:i	(Landroid/database/Cursor;)Z
    //   623: istore_2
    //   624: iload_2
    //   625: ifeq +19 -> 644
    //   628: aload 6
    //   630: astore_1
    //   631: goto +13 -> 644
    //   634: astore 8
    //   636: goto +51 -> 687
    //   639: astore 8
    //   641: goto +49 -> 690
    //   644: aload_1
    //   645: ifnull +9 -> 654
    //   648: aload_1
    //   649: invokeinterface 272 1 0
    //   654: goto +207 -> 861
    //   657: ldc -77
    //   659: ldc_w 469
    //   662: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   665: pop
    //   666: iload 7
    //   668: istore 12
    //   670: aload_1
    //   671: ifnull +190 -> 861
    //   674: aload_1
    //   675: invokeinterface 272 1 0
    //   680: iload 7
    //   682: istore 12
    //   684: goto +177 -> 861
    //   687: goto +182 -> 869
    //   690: aload 8
    //   692: astore 6
    //   694: goto +86 -> 780
    //   697: iload 12
    //   699: iconst_2
    //   700: if_icmpne +35 -> 735
    //   703: aload 5
    //   705: astore 8
    //   707: ldc -77
    //   709: ldc_w 471
    //   712: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   715: pop
    //   716: aload 5
    //   718: astore 8
    //   720: aload_3
    //   721: aload_0
    //   722: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   725: aload_1
    //   726: iload_2
    //   727: invokevirtual 475	I2/j:a1	(LH2/a;Ljava/lang/String;Z)I
    //   730: istore 12
    //   732: goto +129 -> 861
    //   735: aload 5
    //   737: astore 8
    //   739: ldc -77
    //   741: ldc_w 477
    //   744: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   747: pop
    //   748: aload 5
    //   750: astore 8
    //   752: aload_3
    //   753: aload_0
    //   754: invokestatic 295	H2/b:Z0	(Ljava/lang/Object;)LH2/a;
    //   757: aload_1
    //   758: iload_2
    //   759: invokevirtual 479	I2/j:Z0	(LH2/a;Ljava/lang/String;Z)I
    //   762: istore 12
    //   764: goto +97 -> 861
    //   767: aload 8
    //   769: astore_1
    //   770: aload 6
    //   772: astore 8
    //   774: goto +95 -> 869
    //   777: aload 4
    //   779: astore_1
    //   780: aload_1
    //   781: astore 8
    //   783: aload 6
    //   785: invokevirtual 195	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   788: astore 6
    //   790: aload_1
    //   791: astore 8
    //   793: new 126	java/lang/StringBuilder
    //   796: astore 4
    //   798: aload_1
    //   799: astore 8
    //   801: aload 4
    //   803: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   806: aload_1
    //   807: astore 8
    //   809: aload 4
    //   811: ldc_w 454
    //   814: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   817: pop
    //   818: aload_1
    //   819: astore 8
    //   821: aload 4
    //   823: aload 6
    //   825: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   828: pop
    //   829: aload_1
    //   830: astore 8
    //   832: ldc -77
    //   834: aload 4
    //   836: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   839: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   842: pop
    //   843: iload 7
    //   845: istore 12
    //   847: aload_1
    //   848: ifnull +13 -> 861
    //   851: aload_1
    //   852: invokeinterface 272 1 0
    //   857: iload 7
    //   859: istore 12
    //   861: iload 12
    //   863: ireturn
    //   864: astore 6
    //   866: goto -99 -> 767
    //   869: aload_1
    //   870: ifnull +9 -> 879
    //   873: aload_1
    //   874: invokeinterface 272 1 0
    //   879: aload 8
    //   881: athrow
    //   882: ldc 2
    //   884: monitorexit
    //   885: aload_1
    //   886: athrow
    //   887: aload_0
    //   888: aload_1
    //   889: invokestatic 362	E2/g:a	(Landroid/content/Context;Ljava/lang/Throwable;)Z
    //   892: pop
    //   893: aload_1
    //   894: athrow
    //   895: astore 8
    //   897: goto -798 -> 99
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	900	0	paramContext	Context
    //   0	900	1	paramString	String
    //   0	900	2	paramBoolean	boolean
    //   6	747	3	localObject1	Object
    //   8	827	4	localStringBuilder	StringBuilder
    //   11	738	5	localObject2	Object
    //   14	1	6	localObject3	Object
    //   551	78	6	localRemoteException1	android.os.RemoteException
    //   692	132	6	localObject4	Object
    //   864	1	6	localObject5	Object
    //   17	841	7	i1	int
    //   20	60	8	localObject6	Object
    //   84	11	8	localClassLoader	ClassLoader
    //   102	162	8	localObject7	Object
    //   289	34	8	locala1	a
    //   325	1	8	localNoSuchFieldException	NoSuchFieldException
    //   330	1	8	localIllegalAccessException	IllegalAccessException
    //   335	3	8	localClassNotFoundException	ClassNotFoundException
    //   346	213	8	localObject8	Object
    //   634	1	8	localObject9	Object
    //   639	52	8	localRemoteException2	android.os.RemoteException
    //   705	175	8	localObject10	Object
    //   895	1	8	locala2	a
    //   47	492	9	localObject11	Object
    //   134	135	10	localBoolean	Boolean
    //   142	259	11	bool	boolean
    //   159	703	12	i2	int
    // Exception table:
    //   from	to	target	type
    //   57	76	84	finally
    //   76	81	84	finally
    //   94	99	84	finally
    //   99	104	84	finally
    //   107	116	84	finally
    //   125	144	84	finally
    //   152	166	84	finally
    //   171	179	84	finally
    //   182	187	84	finally
    //   195	227	84	finally
    //   230	255	84	finally
    //   255	273	84	finally
    //   273	275	84	finally
    //   281	283	84	finally
    //   291	300	84	finally
    //   303	312	84	finally
    //   315	317	84	finally
    //   320	322	84	finally
    //   3	7	121	finally
    //   26	57	121	finally
    //   116	119	121	finally
    //   275	278	121	finally
    //   283	286	121	finally
    //   322	325	121	finally
    //   337	385	121	finally
    //   385	390	121	finally
    //   390	393	121	finally
    //   882	885	121	finally
    //   152	166	289	com/google/android/gms/dynamite/DynamiteModule$a
    //   171	179	289	com/google/android/gms/dynamite/DynamiteModule$a
    //   182	187	289	com/google/android/gms/dynamite/DynamiteModule$a
    //   195	227	289	com/google/android/gms/dynamite/DynamiteModule$a
    //   230	255	289	com/google/android/gms/dynamite/DynamiteModule$a
    //   255	273	289	com/google/android/gms/dynamite/DynamiteModule$a
    //   26	57	325	java/lang/NoSuchFieldException
    //   322	325	325	java/lang/NoSuchFieldException
    //   26	57	330	java/lang/IllegalAccessException
    //   322	325	330	java/lang/IllegalAccessException
    //   26	57	335	java/lang/ClassNotFoundException
    //   322	325	335	java/lang/ClassNotFoundException
    //   0	3	417	finally
    //   393	400	417	finally
    //   405	414	417	finally
    //   422	464	417	finally
    //   466	471	417	finally
    //   648	654	417	finally
    //   674	680	417	finally
    //   851	857	417	finally
    //   873	879	417	finally
    //   879	882	417	finally
    //   885	887	417	finally
    //   405	414	421	com/google/android/gms/dynamite/DynamiteModule$a
    //   486	492	551	android/os/RemoteException
    //   502	513	551	android/os/RemoteException
    //   522	529	551	android/os/RemoteException
    //   538	548	551	android/os/RemoteException
    //   560	589	551	android/os/RemoteException
    //   707	716	551	android/os/RemoteException
    //   720	732	551	android/os/RemoteException
    //   739	748	551	android/os/RemoteException
    //   752	764	551	android/os/RemoteException
    //   593	602	634	finally
    //   605	614	634	finally
    //   619	624	634	finally
    //   657	666	634	finally
    //   593	602	639	android/os/RemoteException
    //   605	614	639	android/os/RemoteException
    //   619	624	639	android/os/RemoteException
    //   657	666	639	android/os/RemoteException
    //   486	492	864	finally
    //   502	513	864	finally
    //   522	529	864	finally
    //   538	548	864	finally
    //   560	589	864	finally
    //   707	716	864	finally
    //   720	732	864	finally
    //   739	748	864	finally
    //   752	764	864	finally
    //   783	790	864	finally
    //   793	798	864	finally
    //   801	806	864	finally
    //   809	818	864	finally
    //   821	829	864	finally
    //   832	843	864	finally
    //   94	99	895	com/google/android/gms/dynamite/DynamiteModule$a
  }
  
  /* Error */
  public static int f(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: getstatic 59	com/google/android/gms/dynamite/DynamiteModule:n	Ljava/lang/ThreadLocal;
    //   6: invokevirtual 215	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   9: checkcast 226	java/lang/Long
    //   12: invokevirtual 230	java/lang/Long:longValue	()J
    //   15: lstore 5
    //   17: aload_0
    //   18: invokevirtual 483	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   21: astore 7
    //   23: ldc_w 485
    //   26: astore_0
    //   27: iconst_1
    //   28: istore 8
    //   30: iconst_1
    //   31: iload_2
    //   32: if_icmpeq +7 -> 39
    //   35: ldc_w 487
    //   38: astore_0
    //   39: new 489	android/net/Uri$Builder
    //   42: astore 9
    //   44: aload 9
    //   46: invokespecial 490	android/net/Uri$Builder:<init>	()V
    //   49: aload 7
    //   51: aload 9
    //   53: ldc_w 492
    //   56: invokevirtual 496	android/net/Uri$Builder:scheme	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   59: ldc_w 498
    //   62: invokevirtual 501	android/net/Uri$Builder:authority	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   65: aload_0
    //   66: invokevirtual 504	android/net/Uri$Builder:path	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   69: aload_1
    //   70: invokevirtual 507	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   73: ldc_w 509
    //   76: lload 5
    //   78: invokestatic 512	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   81: invokevirtual 516	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   84: invokevirtual 520	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   87: aconst_null
    //   88: aconst_null
    //   89: aconst_null
    //   90: aconst_null
    //   91: invokevirtual 526	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   94: astore 7
    //   96: aload 7
    //   98: ifnull +264 -> 362
    //   101: aload 7
    //   103: astore_0
    //   104: aload 7
    //   106: astore 4
    //   108: aload 7
    //   110: invokeinterface 464 1 0
    //   115: ifeq +247 -> 362
    //   118: iconst_0
    //   119: istore 10
    //   121: iconst_0
    //   122: istore_2
    //   123: aload 7
    //   125: astore_0
    //   126: aload 7
    //   128: astore 4
    //   130: aload 7
    //   132: iconst_0
    //   133: invokeinterface 457 2 0
    //   138: istore 11
    //   140: aload 7
    //   142: astore_1
    //   143: iload 11
    //   145: ifle +149 -> 294
    //   148: aload 7
    //   150: astore_0
    //   151: aload 7
    //   153: astore 4
    //   155: ldc 2
    //   157: monitorenter
    //   158: aload 7
    //   160: iconst_2
    //   161: invokeinterface 530 2 0
    //   166: putstatic 420	com/google/android/gms/dynamite/DynamiteModule:i	Ljava/lang/String;
    //   169: aload 7
    //   171: ldc_w 532
    //   174: invokeinterface 536 2 0
    //   179: istore 12
    //   181: iload 12
    //   183: iflt +22 -> 205
    //   186: aload 7
    //   188: iload 12
    //   190: invokeinterface 457 2 0
    //   195: putstatic 297	com/google/android/gms/dynamite/DynamiteModule:k	I
    //   198: goto +7 -> 205
    //   201: astore_1
    //   202: goto +80 -> 282
    //   205: aload 7
    //   207: ldc_w 538
    //   210: invokeinterface 536 2 0
    //   215: istore 12
    //   217: iload 12
    //   219: iflt +27 -> 246
    //   222: aload 7
    //   224: iload 12
    //   226: invokeinterface 457 2 0
    //   231: ifeq +9 -> 240
    //   234: iload 8
    //   236: istore_2
    //   237: goto +5 -> 242
    //   240: iconst_0
    //   241: istore_2
    //   242: iload_2
    //   243: putstatic 411	com/google/android/gms/dynamite/DynamiteModule:j	Z
    //   246: ldc 2
    //   248: monitorexit
    //   249: aload 7
    //   251: astore_0
    //   252: aload 7
    //   254: astore 4
    //   256: aload 7
    //   258: invokestatic 467	com/google/android/gms/dynamite/DynamiteModule:i	(Landroid/database/Cursor;)Z
    //   261: istore 8
    //   263: aload 7
    //   265: astore_1
    //   266: iload_2
    //   267: istore 10
    //   269: iload 8
    //   271: ifeq +23 -> 294
    //   274: aconst_null
    //   275: astore_1
    //   276: iload_2
    //   277: istore 10
    //   279: goto +15 -> 294
    //   282: ldc 2
    //   284: monitorexit
    //   285: aload 7
    //   287: astore_0
    //   288: aload 7
    //   290: astore 4
    //   292: aload_1
    //   293: athrow
    //   294: iload_3
    //   295: ifeq +54 -> 349
    //   298: iload 10
    //   300: ifne +6 -> 306
    //   303: goto +46 -> 349
    //   306: aload_1
    //   307: astore_0
    //   308: aload_1
    //   309: astore 4
    //   311: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   314: astore 7
    //   316: aload_1
    //   317: astore_0
    //   318: aload_1
    //   319: astore 4
    //   321: aload 7
    //   323: ldc_w 540
    //   326: aconst_null
    //   327: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   330: aload_1
    //   331: astore_0
    //   332: aload_1
    //   333: astore 4
    //   335: aload 7
    //   337: athrow
    //   338: astore_1
    //   339: goto +7 -> 346
    //   342: astore_1
    //   343: goto +81 -> 424
    //   346: goto +120 -> 466
    //   349: aload_1
    //   350: ifnull +9 -> 359
    //   353: aload_1
    //   354: invokeinterface 272 1 0
    //   359: iload 11
    //   361: ireturn
    //   362: aload 7
    //   364: astore_0
    //   365: aload 7
    //   367: astore 4
    //   369: ldc -77
    //   371: ldc_w 469
    //   374: invokestatic 206	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   377: pop
    //   378: aload 7
    //   380: astore_0
    //   381: aload 7
    //   383: astore 4
    //   385: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   388: astore_1
    //   389: aload 7
    //   391: astore_0
    //   392: aload 7
    //   394: astore 4
    //   396: aload_1
    //   397: ldc_w 542
    //   400: aconst_null
    //   401: invokespecial 321	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;LI2/i;)V
    //   404: aload 7
    //   406: astore_0
    //   407: aload 7
    //   409: astore 4
    //   411: aload_1
    //   412: athrow
    //   413: astore_1
    //   414: aload 4
    //   416: astore_0
    //   417: goto +49 -> 466
    //   420: astore_1
    //   421: aconst_null
    //   422: astore 4
    //   424: aload 4
    //   426: astore_0
    //   427: aload_1
    //   428: instanceof 9
    //   431: ifeq +8 -> 439
    //   434: aload 4
    //   436: astore_0
    //   437: aload_1
    //   438: athrow
    //   439: aload 4
    //   441: astore_0
    //   442: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   445: astore 7
    //   447: aload 4
    //   449: astore_0
    //   450: aload 7
    //   452: ldc_w 544
    //   455: aload_1
    //   456: aconst_null
    //   457: invokespecial 365	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;LI2/i;)V
    //   460: aload 4
    //   462: astore_0
    //   463: aload 7
    //   465: athrow
    //   466: aload_0
    //   467: ifnull +9 -> 476
    //   470: aload_0
    //   471: invokeinterface 272 1 0
    //   476: aload_1
    //   477: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	478	0	paramContext	Context
    //   0	478	1	paramString	String
    //   0	478	2	paramBoolean1	boolean
    //   0	478	3	paramBoolean2	boolean
    //   1	460	4	localObject1	Object
    //   15	62	5	l1	long
    //   21	443	7	localObject2	Object
    //   28	242	8	bool1	boolean
    //   42	10	9	localBuilder	android.net.Uri.Builder
    //   119	180	10	bool2	boolean
    //   138	222	11	i1	int
    //   179	46	12	i2	int
    // Exception table:
    //   from	to	target	type
    //   158	181	201	finally
    //   186	198	201	finally
    //   205	217	201	finally
    //   222	234	201	finally
    //   242	246	201	finally
    //   246	249	201	finally
    //   282	285	201	finally
    //   108	118	338	finally
    //   130	140	338	finally
    //   155	158	338	finally
    //   256	263	338	finally
    //   292	294	338	finally
    //   311	316	338	finally
    //   321	330	338	finally
    //   335	338	338	finally
    //   369	378	338	finally
    //   385	389	338	finally
    //   396	404	338	finally
    //   411	413	338	finally
    //   427	434	338	finally
    //   437	439	338	finally
    //   442	447	338	finally
    //   450	460	338	finally
    //   463	466	338	finally
    //   108	118	342	java/lang/Exception
    //   130	140	342	java/lang/Exception
    //   155	158	342	java/lang/Exception
    //   256	263	342	java/lang/Exception
    //   292	294	342	java/lang/Exception
    //   311	316	342	java/lang/Exception
    //   321	330	342	java/lang/Exception
    //   335	338	342	java/lang/Exception
    //   369	378	342	java/lang/Exception
    //   385	389	342	java/lang/Exception
    //   396	404	342	java/lang/Exception
    //   411	413	342	java/lang/Exception
    //   3	23	413	finally
    //   39	96	413	finally
    //   3	23	420	java/lang/Exception
    //   39	96	420	java/lang/Exception
  }
  
  public static DynamiteModule g(Context paramContext, String paramString)
  {
    Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(paramString)));
    return new DynamiteModule(paramContext.getApplicationContext());
  }
  
  public static void h(ClassLoader paramClassLoader)
  {
    IBinder localIBinder;
    try
    {
      localIBinder = (IBinder)paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
      if (localIBinder == null)
      {
        paramClassLoader = null;
      }
      else
      {
        paramClassLoader = localIBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if ((paramClassLoader instanceof I2.k)) {
          paramClassLoader = (I2.k)paramClassLoader;
        }
      }
    }
    catch (NoSuchMethodException paramClassLoader)
    {
      break label93;
    }
    catch (InvocationTargetException paramClassLoader)
    {
      break label93;
    }
    catch (InstantiationException paramClassLoader)
    {
      break label93;
    }
    catch (IllegalAccessException paramClassLoader)
    {
      break label93;
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      break label93;
    }
    paramClassLoader = new I2.k(localIBinder);
    r = paramClassLoader;
    return;
    label93:
    throw new a("Failed to instantiate dynamite loader", paramClassLoader, null);
  }
  
  public static boolean i(Cursor paramCursor)
  {
    I2.h localh = (I2.h)m.get();
    if ((localh != null) && (a == null))
    {
      a = paramCursor;
      return true;
    }
    return false;
  }
  
  public static boolean j(Context paramContext)
  {
    Object localObject = Boolean.TRUE;
    if (((Boolean)localObject).equals(null)) {
      return true;
    }
    if (((Boolean)localObject).equals(l)) {
      return true;
    }
    localObject = l;
    boolean bool1 = false;
    boolean bool2 = false;
    if (localObject == null)
    {
      localObject = paramContext.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
      boolean bool3 = bool2;
      if (x2.k.f().h(paramContext, 10000000) == 0)
      {
        bool3 = bool2;
        if (localObject != null)
        {
          bool3 = bool2;
          if ("com.google.android.gms".equals(packageName)) {
            bool3 = true;
          }
        }
      }
      l = Boolean.valueOf(bool3);
      bool1 = bool3;
      if (bool3)
      {
        bool1 = bool3;
        if (localObject != null)
        {
          paramContext = applicationInfo;
          bool1 = bool3;
          if (paramContext != null)
          {
            bool1 = bool3;
            if ((flags & 0x81) == 0)
            {
              Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
              j = true;
              bool1 = bool3;
            }
          }
        }
      }
    }
    if (!bool1) {
      Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
    }
    return bool1;
  }
  
  public static j k(Context paramContext)
  {
    label104:
    label146:
    try
    {
      localObject = q;
      if (localObject != null) {
        return (j)localObject;
      }
    }
    finally
    {
      Object localObject;
      break label146;
      try
      {
        localObject = (IBinder)paramContext.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
        if (localObject == null)
        {
          paramContext = null;
        }
        else
        {
          paramContext = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
          if ((paramContext instanceof j)) {
            paramContext = (j)paramContext;
          }
        }
      }
      catch (Exception paramContext)
      {
        break label104;
      }
      paramContext = new j((IBinder)localObject);
      if (paramContext != null)
      {
        q = paramContext;
        return paramContext;
        localObject = paramContext.getMessage();
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext.append("Failed to load IDynamiteLoader from GmsCore: ");
        paramContext.append((String)localObject);
        Log.e("DynamiteModule", paramContext.toString());
      }
      return null;
    }
  }
  
  public IBinder c(String paramString)
  {
    try
    {
      IBinder localIBinder = (IBinder)a.getClassLoader().loadClass(paramString).newInstance();
      return localIBinder;
    }
    catch (IllegalAccessException localIllegalAccessException) {}catch (InstantiationException localInstantiationException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    throw new a("Failed to instantiate module class: ".concat(String.valueOf(paramString)), localClassNotFoundException, null);
  }
  
  @DynamiteApi
  public static class DynamiteLoaderClassLoader
  {
    public static ClassLoader sClassLoader;
  }
  
  public static class a
    extends Exception
  {}
  
  public static abstract interface b
  {
    public abstract b a(Context paramContext, String paramString, a parama);
    
    public static abstract interface a
    {
      public abstract int a(Context paramContext, String paramString);
      
      public abstract int b(Context paramContext, String paramString, boolean paramBoolean);
    }
    
    public static class b
    {
      public int a = 0;
      public int b = 0;
      public int c = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamite.DynamiteModule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
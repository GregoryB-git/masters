package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import l6.f1;
import m6.h;
import y6.e;

public final class DynamiteModule
{
  public static final b b = new b();
  public static final c c = new c();
  public static Boolean d;
  public static String e;
  public static boolean f = false;
  public static int g = -1;
  public static Boolean h;
  public static final ThreadLocal i = new ThreadLocal();
  public static final f1 j = new f1(1);
  public static final a k = new a();
  public static e l;
  public static y6.f m;
  public final Context a;
  
  public DynamiteModule(Context paramContext)
  {
    a = paramContext;
  }
  
  public static int a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getApplicationContext().getClassLoader();
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("com.google.android.gms.dynamite.descriptors.");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(".ModuleDescriptor");
      localObject = paramContext.loadClass(((StringBuilder)localObject).toString());
      paramContext = ((Class)localObject).getDeclaredField("MODULE_ID");
      localObject = ((Class)localObject).getDeclaredField("MODULE_VERSION");
      if (!h.a(paramContext.get(null), paramString))
      {
        paramContext = String.valueOf(paramContext.get(null));
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Module descriptor id '");
        ((StringBuilder)localObject).append(paramContext);
        ((StringBuilder)localObject).append("' didn't match expected id '");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("'");
        Log.e("DynamiteModule", ((StringBuilder)localObject).toString());
        return 0;
      }
      int n = ((Field)localObject).getInt(null);
      return n;
    }
    catch (Exception paramContext)
    {
      Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(paramContext.getMessage())));
    }
    catch (ClassNotFoundException paramContext)
    {
      paramContext = new StringBuilder();
      paramContext.append("Local module descriptor class for ");
      paramContext.append(paramString);
      paramContext.append(" not found.");
      Log.w("DynamiteModule", paramContext.toString());
    }
    return 0;
  }
  
  /* Error */
  public static DynamiteModule c(Context paramContext, b paramb, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 89	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull +1276 -> 1282
    //   9: getstatic 51	com/google/android/gms/dynamite/DynamiteModule:i	Ljava/lang/ThreadLocal;
    //   12: astore 4
    //   14: aload 4
    //   16: invokevirtual 182	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   19: checkcast 184	y6/d
    //   22: astore 5
    //   24: new 184	y6/d
    //   27: dup
    //   28: iconst_0
    //   29: invokespecial 185	y6/d:<init>	(I)V
    //   32: astore 6
    //   34: aload 4
    //   36: aload 6
    //   38: invokevirtual 189	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   41: getstatic 58	com/google/android/gms/dynamite/DynamiteModule:j	Ll6/f1;
    //   44: astore 7
    //   46: aload 7
    //   48: invokevirtual 182	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   51: checkcast 191	java/lang/Long
    //   54: invokevirtual 195	java/lang/Long:longValue	()J
    //   57: lstore 8
    //   59: aload 7
    //   61: invokestatic 200	android/os/SystemClock:uptimeMillis	()J
    //   64: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   67: invokevirtual 189	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   70: aload_1
    //   71: aload_0
    //   72: aload_2
    //   73: getstatic 63	com/google/android/gms/dynamite/DynamiteModule:k	Lcom/google/android/gms/dynamite/a;
    //   76: invokeinterface 206 4 0
    //   81: astore 7
    //   83: aload 7
    //   85: getfield 208	com/google/android/gms/dynamite/DynamiteModule$b$b:a	I
    //   88: istore 10
    //   90: aload 7
    //   92: getfield 210	com/google/android/gms/dynamite/DynamiteModule$b$b:b	I
    //   95: istore 11
    //   97: new 95	java/lang/StringBuilder
    //   100: astore 12
    //   102: aload 12
    //   104: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   107: aload 12
    //   109: ldc -44
    //   111: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: aload 12
    //   117: aload_2
    //   118: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload 12
    //   124: ldc -42
    //   126: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload 12
    //   132: iload 10
    //   134: invokevirtual 217	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload 12
    //   140: ldc -37
    //   142: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload 12
    //   148: aload_2
    //   149: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: aload 12
    //   155: ldc -42
    //   157: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: aload 12
    //   163: iload 11
    //   165: invokevirtual 217	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   168: pop
    //   169: ldc -107
    //   171: aload 12
    //   173: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokestatic 221	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   179: pop
    //   180: aload 7
    //   182: getfield 223	com/google/android/gms/dynamite/DynamiteModule$b$b:c	I
    //   185: istore 10
    //   187: iload 10
    //   189: ifeq +951 -> 1140
    //   192: iload 10
    //   194: istore 11
    //   196: iload 10
    //   198: iconst_m1
    //   199: if_icmpne +14 -> 213
    //   202: aload 7
    //   204: getfield 208	com/google/android/gms/dynamite/DynamiteModule$b$b:a	I
    //   207: ifeq +933 -> 1140
    //   210: iconst_m1
    //   211: istore 11
    //   213: iload 11
    //   215: iconst_1
    //   216: if_icmpne +15 -> 231
    //   219: aload 7
    //   221: getfield 210	com/google/android/gms/dynamite/DynamiteModule$b$b:b	I
    //   224: istore 10
    //   226: iload 10
    //   228: ifeq +912 -> 1140
    //   231: iload 11
    //   233: iconst_m1
    //   234: if_icmpne +6 -> 240
    //   237: goto +792 -> 1029
    //   240: iload 11
    //   242: iconst_1
    //   243: if_icmpne +860 -> 1103
    //   246: aload 7
    //   248: getfield 210	com/google/android/gms/dynamite/DynamiteModule$b$b:b	I
    //   251: istore 11
    //   253: ldc 2
    //   255: monitorenter
    //   256: aload_0
    //   257: invokestatic 226	com/google/android/gms/dynamite/DynamiteModule:h	(Landroid/content/Context;)Z
    //   260: ifeq +614 -> 874
    //   263: getstatic 228	com/google/android/gms/dynamite/DynamiteModule:d	Ljava/lang/Boolean;
    //   266: astore 12
    //   268: ldc 2
    //   270: monitorexit
    //   271: aload 12
    //   273: ifnull +585 -> 858
    //   276: aload 12
    //   278: invokevirtual 234	java/lang/Boolean:booleanValue	()Z
    //   281: ifeq +302 -> 583
    //   284: new 95	java/lang/StringBuilder
    //   287: astore 12
    //   289: aload 12
    //   291: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   294: aload 12
    //   296: ldc -20
    //   298: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: pop
    //   302: aload 12
    //   304: aload_2
    //   305: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: pop
    //   309: aload 12
    //   311: ldc -18
    //   313: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: aload 12
    //   319: iload 11
    //   321: invokevirtual 217	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   324: pop
    //   325: ldc -107
    //   327: aload 12
    //   329: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: invokestatic 221	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   335: pop
    //   336: ldc 2
    //   338: monitorenter
    //   339: getstatic 240	com/google/android/gms/dynamite/DynamiteModule:m	Ly6/f;
    //   342: astore 12
    //   344: ldc 2
    //   346: monitorexit
    //   347: aload 12
    //   349: ifnull +210 -> 559
    //   352: aload 4
    //   354: invokevirtual 182	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   357: checkcast 184	y6/d
    //   360: astore 13
    //   362: aload 13
    //   364: ifnull +179 -> 543
    //   367: aload 13
    //   369: getfield 243	y6/d:a	Landroid/database/Cursor;
    //   372: ifnull +171 -> 543
    //   375: aload_0
    //   376: invokevirtual 89	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   379: astore 4
    //   381: aload 13
    //   383: getfield 243	y6/d:a	Landroid/database/Cursor;
    //   386: astore 13
    //   388: aconst_null
    //   389: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   392: pop
    //   393: ldc 2
    //   395: monitorenter
    //   396: getstatic 251	com/google/android/gms/dynamite/DynamiteModule:g	I
    //   399: iconst_2
    //   400: if_icmplt +9 -> 409
    //   403: iconst_1
    //   404: istore 14
    //   406: goto +6 -> 412
    //   409: iconst_0
    //   410: istore 14
    //   412: ldc 2
    //   414: monitorexit
    //   415: iload 14
    //   417: invokestatic 254	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   420: invokevirtual 234	java/lang/Boolean:booleanValue	()Z
    //   423: ifeq +35 -> 458
    //   426: ldc -107
    //   428: ldc_w 256
    //   431: invokestatic 259	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   434: pop
    //   435: aload 12
    //   437: aload 4
    //   439: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   442: aload_2
    //   443: iload 11
    //   445: aload 13
    //   447: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   450: invokevirtual 265	y6/f:r	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;ILcom/google/android/gms/dynamic/IObjectWrapper;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   453: astore 4
    //   455: goto +32 -> 487
    //   458: ldc -107
    //   460: ldc_w 267
    //   463: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   466: pop
    //   467: aload 12
    //   469: aload 4
    //   471: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   474: aload_2
    //   475: iload 11
    //   477: aload 13
    //   479: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   482: invokevirtual 269	y6/f:g	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;ILcom/google/android/gms/dynamic/IObjectWrapper;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   485: astore 4
    //   487: aload 4
    //   489: invokestatic 273	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   492: checkcast 85	android/content/Context
    //   495: astore 4
    //   497: aload 4
    //   499: ifnull +20 -> 519
    //   502: new 2	com/google/android/gms/dynamite/DynamiteModule
    //   505: dup
    //   506: aload 4
    //   508: invokespecial 275	com/google/android/gms/dynamite/DynamiteModule:<init>	(Landroid/content/Context;)V
    //   511: astore 4
    //   513: aload 4
    //   515: astore_0
    //   516: goto +519 -> 1035
    //   519: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   522: astore 4
    //   524: aload 4
    //   526: ldc_w 277
    //   529: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   532: aload 4
    //   534: athrow
    //   535: astore 4
    //   537: ldc 2
    //   539: monitorexit
    //   540: aload 4
    //   542: athrow
    //   543: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   546: astore 4
    //   548: aload 4
    //   550: ldc_w 282
    //   553: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   556: aload 4
    //   558: athrow
    //   559: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   562: astore 4
    //   564: aload 4
    //   566: ldc_w 284
    //   569: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   572: aload 4
    //   574: athrow
    //   575: astore 4
    //   577: ldc 2
    //   579: monitorexit
    //   580: aload 4
    //   582: athrow
    //   583: new 95	java/lang/StringBuilder
    //   586: astore 12
    //   588: aload 12
    //   590: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   593: aload 12
    //   595: ldc -20
    //   597: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   600: pop
    //   601: aload 12
    //   603: aload_2
    //   604: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   607: pop
    //   608: aload 12
    //   610: ldc -18
    //   612: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   615: pop
    //   616: aload 12
    //   618: iload 11
    //   620: invokevirtual 217	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   623: pop
    //   624: ldc -107
    //   626: aload 12
    //   628: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   631: invokestatic 221	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   634: pop
    //   635: aload_0
    //   636: invokestatic 287	com/google/android/gms/dynamite/DynamiteModule:i	(Landroid/content/Context;)Ly6/e;
    //   639: astore 12
    //   641: aload 12
    //   643: ifnull +199 -> 842
    //   646: aload 12
    //   648: bipush 6
    //   650: aload 12
    //   652: invokevirtual 293	com/google/android/gms/internal/common/zza:zza	()Landroid/os/Parcel;
    //   655: invokevirtual 297	com/google/android/gms/internal/common/zza:zzB	(ILandroid/os/Parcel;)Landroid/os/Parcel;
    //   658: astore 13
    //   660: aload 13
    //   662: invokevirtual 303	android/os/Parcel:readInt	()I
    //   665: istore 10
    //   667: aload 13
    //   669: invokevirtual 306	android/os/Parcel:recycle	()V
    //   672: iload 10
    //   674: iconst_3
    //   675: if_icmplt +59 -> 734
    //   678: aload 4
    //   680: invokevirtual 182	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   683: checkcast 184	y6/d
    //   686: astore 4
    //   688: aload 4
    //   690: ifnull +28 -> 718
    //   693: aload 12
    //   695: aload_0
    //   696: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   699: aload_2
    //   700: iload 11
    //   702: aload 4
    //   704: getfield 243	y6/d:a	Landroid/database/Cursor;
    //   707: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   710: invokevirtual 309	y6/e:r	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;ILcom/google/android/gms/dynamic/IObjectWrapper;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   713: astore 4
    //   715: goto +74 -> 789
    //   718: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   721: astore 4
    //   723: aload 4
    //   725: ldc_w 311
    //   728: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   731: aload 4
    //   733: athrow
    //   734: iload 10
    //   736: iconst_2
    //   737: if_icmpne +29 -> 766
    //   740: ldc -107
    //   742: ldc_w 313
    //   745: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   748: pop
    //   749: aload 12
    //   751: aload_0
    //   752: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   755: aload_2
    //   756: iload 11
    //   758: invokevirtual 317	y6/e:d3	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;I)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   761: astore 4
    //   763: goto +26 -> 789
    //   766: ldc -107
    //   768: ldc_w 319
    //   771: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   774: pop
    //   775: aload 12
    //   777: aload_0
    //   778: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   781: aload_2
    //   782: iload 11
    //   784: invokevirtual 321	y6/e:g	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;I)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   787: astore 4
    //   789: aload 4
    //   791: invokestatic 273	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   794: astore 4
    //   796: aload 4
    //   798: ifnull +23 -> 821
    //   801: new 2	com/google/android/gms/dynamite/DynamiteModule
    //   804: dup
    //   805: aload 4
    //   807: checkcast 85	android/content/Context
    //   810: invokespecial 275	com/google/android/gms/dynamite/DynamiteModule:<init>	(Landroid/content/Context;)V
    //   813: astore 4
    //   815: aload 4
    //   817: astore_0
    //   818: goto +217 -> 1035
    //   821: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   824: astore 4
    //   826: aload 4
    //   828: ldc_w 323
    //   831: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   834: aload 4
    //   836: athrow
    //   837: astore 4
    //   839: goto +59 -> 898
    //   842: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   845: astore 4
    //   847: aload 4
    //   849: ldc_w 325
    //   852: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   855: aload 4
    //   857: athrow
    //   858: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   861: astore 4
    //   863: aload 4
    //   865: ldc_w 327
    //   868: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   871: aload 4
    //   873: athrow
    //   874: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   877: astore 4
    //   879: aload 4
    //   881: ldc_w 329
    //   884: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   887: aload 4
    //   889: athrow
    //   890: astore 4
    //   892: ldc 2
    //   894: monitorexit
    //   895: aload 4
    //   897: athrow
    //   898: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   901: astore 12
    //   903: aload 12
    //   905: ldc_w 323
    //   908: aload 4
    //   910: invokespecial 332	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   913: aload 12
    //   915: athrow
    //   916: astore 4
    //   918: aload 4
    //   920: athrow
    //   921: astore 4
    //   923: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   926: astore 12
    //   928: aload 12
    //   930: ldc_w 323
    //   933: aload 4
    //   935: invokespecial 332	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   938: aload 12
    //   940: athrow
    //   941: astore 4
    //   943: aload 4
    //   945: invokevirtual 165	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   948: astore 13
    //   950: new 95	java/lang/StringBuilder
    //   953: astore 12
    //   955: aload 12
    //   957: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   960: aload 12
    //   962: ldc_w 334
    //   965: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   968: pop
    //   969: aload 12
    //   971: aload 13
    //   973: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   976: pop
    //   977: ldc -107
    //   979: aload 12
    //   981: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   984: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   987: pop
    //   988: aload 7
    //   990: getfield 208	com/google/android/gms/dynamite/DynamiteModule$b$b:a	I
    //   993: istore 11
    //   995: iload 11
    //   997: ifeq +91 -> 1088
    //   1000: new 336	com/google/android/gms/dynamite/d
    //   1003: astore 7
    //   1005: aload 7
    //   1007: iload 11
    //   1009: invokespecial 337	com/google/android/gms/dynamite/d:<init>	(I)V
    //   1012: aload_1
    //   1013: aload_0
    //   1014: aload_2
    //   1015: aload 7
    //   1017: invokeinterface 206 4 0
    //   1022: getfield 223	com/google/android/gms/dynamite/DynamiteModule$b$b:c	I
    //   1025: iconst_m1
    //   1026: if_icmpne +62 -> 1088
    //   1029: aload_3
    //   1030: aload_2
    //   1031: invokestatic 340	com/google/android/gms/dynamite/DynamiteModule:f	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;
    //   1034: astore_0
    //   1035: lload 8
    //   1037: lconst_0
    //   1038: lcmp
    //   1039: ifne +12 -> 1051
    //   1042: getstatic 58	com/google/android/gms/dynamite/DynamiteModule:j	Ll6/f1;
    //   1045: invokevirtual 343	java/lang/ThreadLocal:remove	()V
    //   1048: goto +14 -> 1062
    //   1051: getstatic 58	com/google/android/gms/dynamite/DynamiteModule:j	Ll6/f1;
    //   1054: lload 8
    //   1056: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1059: invokevirtual 189	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1062: aload 6
    //   1064: getfield 243	y6/d:a	Landroid/database/Cursor;
    //   1067: astore_1
    //   1068: aload_1
    //   1069: ifnull +9 -> 1078
    //   1072: aload_1
    //   1073: invokeinterface 348 1 0
    //   1078: getstatic 51	com/google/android/gms/dynamite/DynamiteModule:i	Ljava/lang/ThreadLocal;
    //   1081: aload 5
    //   1083: invokevirtual 189	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1086: aload_0
    //   1087: areturn
    //   1088: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   1091: astore_0
    //   1092: aload_0
    //   1093: ldc_w 350
    //   1096: aload 4
    //   1098: invokespecial 332	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1101: aload_0
    //   1102: athrow
    //   1103: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   1106: astore_0
    //   1107: new 95	java/lang/StringBuilder
    //   1110: astore_1
    //   1111: aload_1
    //   1112: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   1115: aload_1
    //   1116: ldc_w 352
    //   1119: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1122: pop
    //   1123: aload_1
    //   1124: iload 11
    //   1126: invokevirtual 217	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1129: pop
    //   1130: aload_0
    //   1131: aload_1
    //   1132: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1135: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   1138: aload_0
    //   1139: athrow
    //   1140: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   1143: astore_0
    //   1144: aload 7
    //   1146: getfield 208	com/google/android/gms/dynamite/DynamiteModule$b$b:a	I
    //   1149: istore 10
    //   1151: aload 7
    //   1153: getfield 210	com/google/android/gms/dynamite/DynamiteModule$b$b:b	I
    //   1156: istore 11
    //   1158: new 95	java/lang/StringBuilder
    //   1161: astore_1
    //   1162: aload_1
    //   1163: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   1166: aload_1
    //   1167: ldc_w 354
    //   1170: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1173: pop
    //   1174: aload_1
    //   1175: aload_2
    //   1176: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1179: pop
    //   1180: aload_1
    //   1181: ldc_w 356
    //   1184: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1187: pop
    //   1188: aload_1
    //   1189: iload 10
    //   1191: invokevirtual 217	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1194: pop
    //   1195: aload_1
    //   1196: ldc_w 358
    //   1199: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1202: pop
    //   1203: aload_1
    //   1204: iload 11
    //   1206: invokevirtual 217	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1209: pop
    //   1210: aload_1
    //   1211: ldc_w 360
    //   1214: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1217: pop
    //   1218: aload_0
    //   1219: aload_1
    //   1220: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1223: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   1226: aload_0
    //   1227: athrow
    //   1228: astore_0
    //   1229: lload 8
    //   1231: lconst_0
    //   1232: lcmp
    //   1233: ifne +12 -> 1245
    //   1236: getstatic 58	com/google/android/gms/dynamite/DynamiteModule:j	Ll6/f1;
    //   1239: invokevirtual 343	java/lang/ThreadLocal:remove	()V
    //   1242: goto +14 -> 1256
    //   1245: getstatic 58	com/google/android/gms/dynamite/DynamiteModule:j	Ll6/f1;
    //   1248: lload 8
    //   1250: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1253: invokevirtual 189	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1256: aload 6
    //   1258: getfield 243	y6/d:a	Landroid/database/Cursor;
    //   1261: astore_1
    //   1262: aload_1
    //   1263: ifnull +9 -> 1272
    //   1266: aload_1
    //   1267: invokeinterface 348 1 0
    //   1272: getstatic 51	com/google/android/gms/dynamite/DynamiteModule:i	Ljava/lang/ThreadLocal;
    //   1275: aload 5
    //   1277: invokevirtual 189	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   1280: aload_0
    //   1281: athrow
    //   1282: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   1285: dup
    //   1286: ldc_w 362
    //   1289: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   1292: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1293	0	paramContext	Context
    //   0	1293	1	paramb	b
    //   0	1293	2	paramString	String
    //   4	1026	3	localContext	Context
    //   12	521	4	localObject1	Object
    //   535	6	4	localObject2	Object
    //   546	27	4	locala1	a
    //   575	104	4	localObject3	Object
    //   686	149	4	localObject4	Object
    //   837	1	4	localObject5	Object
    //   845	43	4	locala2	a
    //   890	19	4	localThrowable	Throwable
    //   916	3	4	locala3	a
    //   921	13	4	localRemoteException	android.os.RemoteException
    //   941	156	4	locala4	a
    //   22	1254	5	locald1	y6.d
    //   32	1225	6	locald2	y6.d
    //   44	1108	7	localObject6	Object
    //   57	1192	8	l1	long
    //   88	1102	10	n	int
    //   95	1110	11	i1	int
    //   100	880	12	localObject7	Object
    //   360	612	13	localObject8	Object
    //   404	12	14	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   396	403	535	finally
    //   412	415	535	finally
    //   537	540	535	finally
    //   339	347	575	finally
    //   577	580	575	finally
    //   253	256	837	finally
    //   276	339	837	finally
    //   352	362	837	finally
    //   367	396	837	finally
    //   415	455	837	finally
    //   458	487	837	finally
    //   487	497	837	finally
    //   502	513	837	finally
    //   519	535	837	finally
    //   540	543	837	finally
    //   543	559	837	finally
    //   559	575	837	finally
    //   580	583	837	finally
    //   583	641	837	finally
    //   646	672	837	finally
    //   678	688	837	finally
    //   693	715	837	finally
    //   718	734	837	finally
    //   740	763	837	finally
    //   766	789	837	finally
    //   789	796	837	finally
    //   801	815	837	finally
    //   821	837	837	finally
    //   842	858	837	finally
    //   858	874	837	finally
    //   895	898	837	finally
    //   256	271	890	finally
    //   874	890	890	finally
    //   892	895	890	finally
    //   253	256	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   276	339	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   352	362	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   367	396	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   415	455	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   458	487	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   487	497	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   502	513	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   519	535	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   540	543	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   543	559	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   559	575	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   580	583	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   583	641	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   646	672	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   678	688	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   693	715	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   718	734	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   740	763	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   766	789	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   789	796	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   801	815	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   821	837	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   842	858	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   858	874	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   895	898	916	com/google/android/gms/dynamite/DynamiteModule$a
    //   253	256	921	android/os/RemoteException
    //   276	339	921	android/os/RemoteException
    //   352	362	921	android/os/RemoteException
    //   367	396	921	android/os/RemoteException
    //   415	455	921	android/os/RemoteException
    //   458	487	921	android/os/RemoteException
    //   487	497	921	android/os/RemoteException
    //   502	513	921	android/os/RemoteException
    //   519	535	921	android/os/RemoteException
    //   540	543	921	android/os/RemoteException
    //   543	559	921	android/os/RemoteException
    //   559	575	921	android/os/RemoteException
    //   580	583	921	android/os/RemoteException
    //   583	641	921	android/os/RemoteException
    //   646	672	921	android/os/RemoteException
    //   678	688	921	android/os/RemoteException
    //   693	715	921	android/os/RemoteException
    //   718	734	921	android/os/RemoteException
    //   740	763	921	android/os/RemoteException
    //   766	789	921	android/os/RemoteException
    //   789	796	921	android/os/RemoteException
    //   801	815	921	android/os/RemoteException
    //   821	837	921	android/os/RemoteException
    //   842	858	921	android/os/RemoteException
    //   858	874	921	android/os/RemoteException
    //   895	898	921	android/os/RemoteException
    //   246	253	941	com/google/android/gms/dynamite/DynamiteModule$a
    //   898	916	941	com/google/android/gms/dynamite/DynamiteModule$a
    //   918	921	941	com/google/android/gms/dynamite/DynamiteModule$a
    //   923	941	941	com/google/android/gms/dynamite/DynamiteModule$a
    //   59	187	1228	finally
    //   202	210	1228	finally
    //   219	226	1228	finally
    //   246	253	1228	finally
    //   898	916	1228	finally
    //   918	921	1228	finally
    //   923	941	1228	finally
    //   943	995	1228	finally
    //   1000	1029	1228	finally
    //   1029	1035	1228	finally
    //   1088	1103	1228	finally
    //   1103	1140	1228	finally
    //   1140	1228	1228	finally
  }
  
  /* Error */
  public static int d(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 228	com/google/android/gms/dynamite/DynamiteModule:d	Ljava/lang/Boolean;
    //   6: astore_3
    //   7: aconst_null
    //   8: astore 4
    //   10: aconst_null
    //   11: astore 5
    //   13: aconst_null
    //   14: astore 6
    //   16: iconst_1
    //   17: istore 7
    //   19: iconst_0
    //   20: istore 8
    //   22: aload_3
    //   23: astore 9
    //   25: aload_3
    //   26: ifnonnull +363 -> 389
    //   29: aload_0
    //   30: invokevirtual 89	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   33: invokevirtual 93	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   36: ldc 6
    //   38: invokevirtual 370	java/lang/Class:getName	()Ljava/lang/String;
    //   41: invokevirtual 114	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   44: ldc_w 372
    //   47: invokevirtual 122	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   50: astore 10
    //   52: aload 10
    //   54: invokevirtual 376	java/lang/reflect/Field:getDeclaringClass	()Ljava/lang/Class;
    //   57: astore_3
    //   58: aload_3
    //   59: monitorenter
    //   60: aload 10
    //   62: aconst_null
    //   63: invokevirtual 130	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   66: checkcast 110	java/lang/ClassLoader
    //   69: astore 9
    //   71: invokestatic 379	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   74: astore 11
    //   76: aload 9
    //   78: aload 11
    //   80: if_acmpne +6 -> 86
    //   83: goto +224 -> 307
    //   86: aload 9
    //   88: ifnull +16 -> 104
    //   91: aload 9
    //   93: invokestatic 382	com/google/android/gms/dynamite/DynamiteModule:g	(Ljava/lang/ClassLoader;)V
    //   96: getstatic 385	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   99: astore 9
    //   101: goto +211 -> 312
    //   104: aload_0
    //   105: invokestatic 226	com/google/android/gms/dynamite/DynamiteModule:h	(Landroid/content/Context;)Z
    //   108: ifne +10 -> 118
    //   111: aload_3
    //   112: monitorexit
    //   113: ldc 2
    //   115: monitorexit
    //   116: iconst_0
    //   117: ireturn
    //   118: getstatic 387	com/google/android/gms/dynamite/DynamiteModule:f	Z
    //   121: ifne +178 -> 299
    //   124: getstatic 385	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   127: astore 11
    //   129: aload 11
    //   131: aconst_null
    //   132: invokevirtual 391	java/lang/Boolean:equals	(Ljava/lang/Object;)Z
    //   135: istore 12
    //   137: iload 12
    //   139: ifeq +6 -> 145
    //   142: goto +157 -> 299
    //   145: aload_0
    //   146: aload_1
    //   147: iload_2
    //   148: iconst_1
    //   149: invokestatic 394	com/google/android/gms/dynamite/DynamiteModule:e	(Landroid/content/Context;Ljava/lang/String;ZZ)I
    //   152: istore 13
    //   154: getstatic 396	com/google/android/gms/dynamite/DynamiteModule:e	Ljava/lang/String;
    //   157: astore 9
    //   159: aload 9
    //   161: ifnull +112 -> 273
    //   164: aload 9
    //   166: invokevirtual 399	java/lang/String:isEmpty	()Z
    //   169: ifeq +6 -> 175
    //   172: goto +101 -> 273
    //   175: invokestatic 403	y6/b:a	()Ljava/lang/ClassLoader;
    //   178: astore 9
    //   180: aload 9
    //   182: ifnull +6 -> 188
    //   185: goto +62 -> 247
    //   188: getstatic 408	android/os/Build$VERSION:SDK_INT	I
    //   191: bipush 29
    //   193: if_icmplt +30 -> 223
    //   196: getstatic 396	com/google/android/gms/dynamite/DynamiteModule:e	Ljava/lang/String;
    //   199: astore 9
    //   201: aload 9
    //   203: invokestatic 412	m6/j:i	(Ljava/lang/Object;)V
    //   206: new 414	dalvik/system/DelegateLastClassLoader
    //   209: dup
    //   210: aload 9
    //   212: invokestatic 379	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   215: invokespecial 417	dalvik/system/DelegateLastClassLoader:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   218: astore 9
    //   220: goto +27 -> 247
    //   223: getstatic 396	com/google/android/gms/dynamite/DynamiteModule:e	Ljava/lang/String;
    //   226: astore 9
    //   228: aload 9
    //   230: invokestatic 412	m6/j:i	(Ljava/lang/Object;)V
    //   233: new 419	y6/c
    //   236: dup
    //   237: invokestatic 379	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   240: aload 9
    //   242: invokespecial 422	y6/c:<init>	(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    //   245: astore 9
    //   247: aload 9
    //   249: invokestatic 382	com/google/android/gms/dynamite/DynamiteModule:g	(Ljava/lang/ClassLoader;)V
    //   252: aload 10
    //   254: aconst_null
    //   255: aload 9
    //   257: invokevirtual 425	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   260: aload 11
    //   262: putstatic 228	com/google/android/gms/dynamite/DynamiteModule:d	Ljava/lang/Boolean;
    //   265: aload_3
    //   266: monitorexit
    //   267: ldc 2
    //   269: monitorexit
    //   270: iload 13
    //   272: ireturn
    //   273: aload_3
    //   274: monitorexit
    //   275: ldc 2
    //   277: monitorexit
    //   278: iload 13
    //   280: ireturn
    //   281: astore 9
    //   283: invokestatic 379	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   286: astore 9
    //   288: aload 10
    //   290: aconst_null
    //   291: aload 9
    //   293: invokevirtual 425	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   296: goto +11 -> 307
    //   299: invokestatic 379	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   302: astore 9
    //   304: goto -16 -> 288
    //   307: getstatic 428	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   310: astore 9
    //   312: aload_3
    //   313: monitorexit
    //   314: goto +70 -> 384
    //   317: astore 9
    //   319: aload_3
    //   320: monitorexit
    //   321: aload 9
    //   323: athrow
    //   324: astore 9
    //   326: goto +10 -> 336
    //   329: astore 9
    //   331: goto +5 -> 336
    //   334: astore 9
    //   336: aload 9
    //   338: invokevirtual 429	java/lang/Object:toString	()Ljava/lang/String;
    //   341: astore_3
    //   342: new 95	java/lang/StringBuilder
    //   345: astore 9
    //   347: aload 9
    //   349: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   352: aload 9
    //   354: ldc_w 431
    //   357: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: pop
    //   361: aload 9
    //   363: aload_3
    //   364: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: pop
    //   368: ldc -107
    //   370: aload 9
    //   372: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   375: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   378: pop
    //   379: getstatic 428	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   382: astore 9
    //   384: aload 9
    //   386: putstatic 228	com/google/android/gms/dynamite/DynamiteModule:d	Ljava/lang/Boolean;
    //   389: ldc 2
    //   391: monitorexit
    //   392: aload 9
    //   394: invokevirtual 234	java/lang/Boolean:booleanValue	()Z
    //   397: istore 12
    //   399: iload 12
    //   401: ifeq +55 -> 456
    //   404: aload_0
    //   405: aload_1
    //   406: iload_2
    //   407: iconst_0
    //   408: invokestatic 394	com/google/android/gms/dynamite/DynamiteModule:e	(Landroid/content/Context;Ljava/lang/String;ZZ)I
    //   411: istore_2
    //   412: iload_2
    //   413: ireturn
    //   414: astore_1
    //   415: aload_1
    //   416: invokevirtual 165	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   419: astore 9
    //   421: new 95	java/lang/StringBuilder
    //   424: astore_1
    //   425: aload_1
    //   426: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   429: aload_1
    //   430: ldc_w 433
    //   433: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: pop
    //   437: aload_1
    //   438: aload 9
    //   440: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   443: pop
    //   444: ldc -107
    //   446: aload_1
    //   447: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   450: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   453: pop
    //   454: iconst_0
    //   455: ireturn
    //   456: aload_0
    //   457: invokestatic 287	com/google/android/gms/dynamite/DynamiteModule:i	(Landroid/content/Context;)Ly6/e;
    //   460: astore_3
    //   461: aload_3
    //   462: ifnonnull +9 -> 471
    //   465: iload 8
    //   467: istore_2
    //   468: goto +569 -> 1037
    //   471: aload 4
    //   473: astore 9
    //   475: aload_3
    //   476: bipush 6
    //   478: aload_3
    //   479: invokevirtual 293	com/google/android/gms/internal/common/zza:zza	()Landroid/os/Parcel;
    //   482: invokevirtual 297	com/google/android/gms/internal/common/zza:zzB	(ILandroid/os/Parcel;)Landroid/os/Parcel;
    //   485: astore 10
    //   487: aload 4
    //   489: astore 9
    //   491: aload 10
    //   493: invokevirtual 303	android/os/Parcel:readInt	()I
    //   496: istore 13
    //   498: aload 4
    //   500: astore 9
    //   502: aload 10
    //   504: invokevirtual 306	android/os/Parcel:recycle	()V
    //   507: iload 13
    //   509: iconst_3
    //   510: if_icmplt +243 -> 753
    //   513: aload 4
    //   515: astore 9
    //   517: getstatic 51	com/google/android/gms/dynamite/DynamiteModule:i	Ljava/lang/ThreadLocal;
    //   520: astore 10
    //   522: aload 4
    //   524: astore 9
    //   526: aload 10
    //   528: invokevirtual 182	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   531: checkcast 184	y6/d
    //   534: astore 11
    //   536: aload 11
    //   538: ifnull +35 -> 573
    //   541: aload 4
    //   543: astore 9
    //   545: aload 11
    //   547: getfield 243	y6/d:a	Landroid/database/Cursor;
    //   550: astore 11
    //   552: aload 11
    //   554: ifnull +19 -> 573
    //   557: aload 4
    //   559: astore 9
    //   561: aload 11
    //   563: iconst_0
    //   564: invokeinterface 436 2 0
    //   569: istore_2
    //   570: goto +467 -> 1037
    //   573: aload 4
    //   575: astore 9
    //   577: aload_3
    //   578: aload_0
    //   579: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   582: aload_1
    //   583: iload_2
    //   584: getstatic 58	com/google/android/gms/dynamite/DynamiteModule:j	Ll6/f1;
    //   587: invokevirtual 182	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   590: checkcast 191	java/lang/Long
    //   593: invokevirtual 195	java/lang/Long:longValue	()J
    //   596: invokevirtual 440	y6/e:e3	(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;ZJ)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   599: invokestatic 273	com/google/android/gms/dynamic/ObjectWrapper:unwrap	(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;
    //   602: checkcast 345	android/database/Cursor
    //   605: astore_1
    //   606: aload_1
    //   607: ifnull +104 -> 711
    //   610: aload_1
    //   611: invokeinterface 443 1 0
    //   616: ifne +6 -> 622
    //   619: goto +92 -> 711
    //   622: aload_1
    //   623: iconst_0
    //   624: invokeinterface 436 2 0
    //   629: istore 13
    //   631: iload 13
    //   633: ifle +59 -> 692
    //   636: aload 10
    //   638: invokevirtual 182	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   641: checkcast 184	y6/d
    //   644: astore 9
    //   646: aload 9
    //   648: ifnull +32 -> 680
    //   651: aload 9
    //   653: getfield 243	y6/d:a	Landroid/database/Cursor;
    //   656: ifnonnull +24 -> 680
    //   659: aload 9
    //   661: aload_1
    //   662: putfield 243	y6/d:a	Landroid/database/Cursor;
    //   665: iload 7
    //   667: istore_2
    //   668: goto +14 -> 682
    //   671: astore 9
    //   673: aload 9
    //   675: astore 4
    //   677: goto +368 -> 1045
    //   680: iconst_0
    //   681: istore_2
    //   682: iload_2
    //   683: ifeq +9 -> 692
    //   686: aload 6
    //   688: astore_1
    //   689: goto +3 -> 692
    //   692: iload 13
    //   694: istore_2
    //   695: aload_1
    //   696: ifnull +252 -> 948
    //   699: aload_1
    //   700: invokeinterface 348 1 0
    //   705: iload 13
    //   707: istore_2
    //   708: goto +240 -> 948
    //   711: ldc -107
    //   713: ldc_w 445
    //   716: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   719: pop
    //   720: iload 8
    //   722: istore_2
    //   723: aload_1
    //   724: ifnull +313 -> 1037
    //   727: aload_1
    //   728: invokeinterface 348 1 0
    //   733: iload 8
    //   735: istore_2
    //   736: goto +301 -> 1037
    //   739: astore 9
    //   741: aload 9
    //   743: astore 4
    //   745: goto +213 -> 958
    //   748: astore 4
    //   750: goto +205 -> 955
    //   753: iload 13
    //   755: iconst_2
    //   756: if_icmpne +99 -> 855
    //   759: aload 4
    //   761: astore 9
    //   763: ldc -107
    //   765: ldc_w 447
    //   768: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   771: pop
    //   772: aload 4
    //   774: astore 9
    //   776: aload_0
    //   777: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   780: astore 10
    //   782: aload 4
    //   784: astore 9
    //   786: aload_3
    //   787: invokevirtual 293	com/google/android/gms/internal/common/zza:zza	()Landroid/os/Parcel;
    //   790: astore 6
    //   792: aload 4
    //   794: astore 9
    //   796: aload 6
    //   798: aload 10
    //   800: invokestatic 453	com/google/android/gms/internal/common/zzc:zze	(Landroid/os/Parcel;Landroid/os/IInterface;)V
    //   803: aload 4
    //   805: astore 9
    //   807: aload 6
    //   809: aload_1
    //   810: invokevirtual 456	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   813: aload 4
    //   815: astore 9
    //   817: aload 6
    //   819: iload_2
    //   820: invokevirtual 459	android/os/Parcel:writeInt	(I)V
    //   823: aload 4
    //   825: astore 9
    //   827: aload_3
    //   828: iconst_5
    //   829: aload 6
    //   831: invokevirtual 297	com/google/android/gms/internal/common/zza:zzB	(ILandroid/os/Parcel;)Landroid/os/Parcel;
    //   834: astore_1
    //   835: aload 4
    //   837: astore 9
    //   839: aload_1
    //   840: invokevirtual 303	android/os/Parcel:readInt	()I
    //   843: istore_2
    //   844: aload 4
    //   846: astore 9
    //   848: aload_1
    //   849: invokevirtual 306	android/os/Parcel:recycle	()V
    //   852: goto +96 -> 948
    //   855: aload 4
    //   857: astore 9
    //   859: ldc -107
    //   861: ldc_w 461
    //   864: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   867: pop
    //   868: aload 4
    //   870: astore 9
    //   872: aload_0
    //   873: invokestatic 249	com/google/android/gms/dynamic/ObjectWrapper:wrap	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;
    //   876: astore 6
    //   878: aload 4
    //   880: astore 9
    //   882: aload_3
    //   883: invokevirtual 293	com/google/android/gms/internal/common/zza:zza	()Landroid/os/Parcel;
    //   886: astore 10
    //   888: aload 4
    //   890: astore 9
    //   892: aload 10
    //   894: aload 6
    //   896: invokestatic 453	com/google/android/gms/internal/common/zzc:zze	(Landroid/os/Parcel;Landroid/os/IInterface;)V
    //   899: aload 4
    //   901: astore 9
    //   903: aload 10
    //   905: aload_1
    //   906: invokevirtual 456	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   909: aload 4
    //   911: astore 9
    //   913: aload 10
    //   915: iload_2
    //   916: invokevirtual 459	android/os/Parcel:writeInt	(I)V
    //   919: aload 4
    //   921: astore 9
    //   923: aload_3
    //   924: iconst_3
    //   925: aload 10
    //   927: invokevirtual 297	com/google/android/gms/internal/common/zza:zzB	(ILandroid/os/Parcel;)Landroid/os/Parcel;
    //   930: astore_1
    //   931: aload 4
    //   933: astore 9
    //   935: aload_1
    //   936: invokevirtual 303	android/os/Parcel:readInt	()I
    //   939: istore_2
    //   940: aload 4
    //   942: astore 9
    //   944: aload_1
    //   945: invokevirtual 306	android/os/Parcel:recycle	()V
    //   948: goto +89 -> 1037
    //   951: astore_1
    //   952: goto +87 -> 1039
    //   955: aload 5
    //   957: astore_1
    //   958: aload_1
    //   959: astore 9
    //   961: aload 4
    //   963: invokevirtual 165	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   966: astore 4
    //   968: aload_1
    //   969: astore 9
    //   971: new 95	java/lang/StringBuilder
    //   974: astore 5
    //   976: aload_1
    //   977: astore 9
    //   979: aload 5
    //   981: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   984: aload_1
    //   985: astore 9
    //   987: aload 5
    //   989: ldc_w 433
    //   992: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   995: pop
    //   996: aload_1
    //   997: astore 9
    //   999: aload 5
    //   1001: aload 4
    //   1003: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1006: pop
    //   1007: aload_1
    //   1008: astore 9
    //   1010: ldc -107
    //   1012: aload 5
    //   1014: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1017: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   1020: pop
    //   1021: iload 8
    //   1023: istore_2
    //   1024: aload_1
    //   1025: ifnull +12 -> 1037
    //   1028: aload_1
    //   1029: invokeinterface 348 1 0
    //   1034: iload 8
    //   1036: istore_2
    //   1037: iload_2
    //   1038: ireturn
    //   1039: aload_1
    //   1040: astore 4
    //   1042: aload 9
    //   1044: astore_1
    //   1045: aload_1
    //   1046: ifnull +9 -> 1055
    //   1049: aload_1
    //   1050: invokeinterface 348 1 0
    //   1055: aload 4
    //   1057: athrow
    //   1058: astore_1
    //   1059: ldc 2
    //   1061: monitorexit
    //   1062: aload_1
    //   1063: athrow
    //   1064: astore_1
    //   1065: aload_0
    //   1066: invokestatic 412	m6/j:i	(Ljava/lang/Object;)V
    //   1069: goto +15 -> 1084
    //   1072: astore_0
    //   1073: ldc_w 463
    //   1076: ldc_w 465
    //   1079: aload_0
    //   1080: invokestatic 468	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1083: pop
    //   1084: aload_1
    //   1085: athrow
    //   1086: astore 9
    //   1088: goto -992 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1091	0	paramContext	Context
    //   0	1091	1	paramString	String
    //   0	1091	2	paramBoolean	boolean
    //   6	918	3	localObject1	Object
    //   8	736	4	localObject2	Object
    //   748	214	4	localRemoteException1	android.os.RemoteException
    //   966	90	4	str	String
    //   11	1002	5	localStringBuilder	StringBuilder
    //   14	881	6	localObject3	Object
    //   17	649	7	bool1	boolean
    //   20	1015	8	bool2	boolean
    //   23	233	9	localObject4	Object
    //   281	1	9	locala1	a
    //   286	25	9	localObject5	Object
    //   317	5	9	localObject6	Object
    //   324	1	9	localNoSuchFieldException	NoSuchFieldException
    //   329	1	9	localIllegalAccessException	IllegalAccessException
    //   334	3	9	localClassNotFoundException	ClassNotFoundException
    //   345	315	9	localObject7	Object
    //   671	3	9	localObject8	Object
    //   739	3	9	localRemoteException2	android.os.RemoteException
    //   761	282	9	localObject9	Object
    //   1086	1	9	locala2	a
    //   50	876	10	localObject10	Object
    //   74	488	11	localObject11	Object
    //   135	265	12	bool3	boolean
    //   152	605	13	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   145	159	281	com/google/android/gms/dynamite/DynamiteModule$a
    //   164	172	281	com/google/android/gms/dynamite/DynamiteModule$a
    //   175	180	281	com/google/android/gms/dynamite/DynamiteModule$a
    //   188	220	281	com/google/android/gms/dynamite/DynamiteModule$a
    //   223	247	281	com/google/android/gms/dynamite/DynamiteModule$a
    //   247	265	281	com/google/android/gms/dynamite/DynamiteModule$a
    //   60	76	317	finally
    //   91	96	317	finally
    //   96	101	317	finally
    //   104	113	317	finally
    //   118	137	317	finally
    //   145	159	317	finally
    //   164	172	317	finally
    //   175	180	317	finally
    //   188	220	317	finally
    //   223	247	317	finally
    //   247	265	317	finally
    //   265	267	317	finally
    //   273	275	317	finally
    //   283	288	317	finally
    //   288	296	317	finally
    //   299	304	317	finally
    //   307	312	317	finally
    //   312	314	317	finally
    //   319	321	317	finally
    //   29	60	324	java/lang/NoSuchFieldException
    //   321	324	324	java/lang/NoSuchFieldException
    //   29	60	329	java/lang/IllegalAccessException
    //   321	324	329	java/lang/IllegalAccessException
    //   29	60	334	java/lang/ClassNotFoundException
    //   321	324	334	java/lang/ClassNotFoundException
    //   404	412	414	com/google/android/gms/dynamite/DynamiteModule$a
    //   610	619	671	finally
    //   622	631	671	finally
    //   636	646	671	finally
    //   651	665	671	finally
    //   711	720	671	finally
    //   610	619	739	android/os/RemoteException
    //   622	631	739	android/os/RemoteException
    //   636	646	739	android/os/RemoteException
    //   651	665	739	android/os/RemoteException
    //   711	720	739	android/os/RemoteException
    //   475	487	748	android/os/RemoteException
    //   491	498	748	android/os/RemoteException
    //   502	507	748	android/os/RemoteException
    //   517	522	748	android/os/RemoteException
    //   526	536	748	android/os/RemoteException
    //   545	552	748	android/os/RemoteException
    //   561	570	748	android/os/RemoteException
    //   577	606	748	android/os/RemoteException
    //   763	772	748	android/os/RemoteException
    //   776	782	748	android/os/RemoteException
    //   786	792	748	android/os/RemoteException
    //   796	803	748	android/os/RemoteException
    //   807	813	748	android/os/RemoteException
    //   817	823	748	android/os/RemoteException
    //   827	835	748	android/os/RemoteException
    //   839	844	748	android/os/RemoteException
    //   848	852	748	android/os/RemoteException
    //   859	868	748	android/os/RemoteException
    //   872	878	748	android/os/RemoteException
    //   882	888	748	android/os/RemoteException
    //   892	899	748	android/os/RemoteException
    //   903	909	748	android/os/RemoteException
    //   913	919	748	android/os/RemoteException
    //   923	931	748	android/os/RemoteException
    //   935	940	748	android/os/RemoteException
    //   944	948	748	android/os/RemoteException
    //   475	487	951	finally
    //   491	498	951	finally
    //   502	507	951	finally
    //   517	522	951	finally
    //   526	536	951	finally
    //   545	552	951	finally
    //   561	570	951	finally
    //   577	606	951	finally
    //   763	772	951	finally
    //   776	782	951	finally
    //   786	792	951	finally
    //   796	803	951	finally
    //   807	813	951	finally
    //   817	823	951	finally
    //   827	835	951	finally
    //   839	844	951	finally
    //   848	852	951	finally
    //   859	868	951	finally
    //   872	878	951	finally
    //   882	888	951	finally
    //   892	899	951	finally
    //   903	909	951	finally
    //   913	919	951	finally
    //   923	931	951	finally
    //   935	940	951	finally
    //   944	948	951	finally
    //   961	968	951	finally
    //   971	976	951	finally
    //   979	984	951	finally
    //   987	996	951	finally
    //   999	1007	951	finally
    //   1010	1021	951	finally
    //   3	7	1058	finally
    //   29	60	1058	finally
    //   113	116	1058	finally
    //   267	270	1058	finally
    //   275	278	1058	finally
    //   321	324	1058	finally
    //   336	384	1058	finally
    //   384	389	1058	finally
    //   389	392	1058	finally
    //   1059	1062	1058	finally
    //   0	3	1064	finally
    //   392	399	1064	finally
    //   404	412	1064	finally
    //   415	454	1064	finally
    //   456	461	1064	finally
    //   699	705	1064	finally
    //   727	733	1064	finally
    //   1028	1034	1064	finally
    //   1049	1055	1064	finally
    //   1055	1058	1064	finally
    //   1062	1064	1064	finally
    //   1065	1069	1072	java/lang/Exception
    //   91	96	1086	com/google/android/gms/dynamite/DynamiteModule$a
  }
  
  /* Error */
  public static int e(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: aload 4
    //   11: astore 7
    //   13: aload 5
    //   15: astore 8
    //   17: getstatic 58	com/google/android/gms/dynamite/DynamiteModule:j	Ll6/f1;
    //   20: invokevirtual 182	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   23: checkcast 191	java/lang/Long
    //   26: invokevirtual 195	java/lang/Long:longValue	()J
    //   29: lstore 9
    //   31: ldc_w 470
    //   34: astore 11
    //   36: iconst_1
    //   37: istore 12
    //   39: iconst_1
    //   40: iload_2
    //   41: if_icmpeq +8 -> 49
    //   44: ldc_w 472
    //   47: astore 11
    //   49: aload 4
    //   51: astore 7
    //   53: aload 5
    //   55: astore 8
    //   57: new 474	android/net/Uri$Builder
    //   60: astore 13
    //   62: aload 4
    //   64: astore 7
    //   66: aload 5
    //   68: astore 8
    //   70: aload 13
    //   72: invokespecial 475	android/net/Uri$Builder:<init>	()V
    //   75: aload 4
    //   77: astore 7
    //   79: aload 5
    //   81: astore 8
    //   83: aload 13
    //   85: ldc_w 477
    //   88: invokevirtual 481	android/net/Uri$Builder:scheme	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   91: ldc_w 483
    //   94: invokevirtual 486	android/net/Uri$Builder:authority	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   97: aload 11
    //   99: invokevirtual 489	android/net/Uri$Builder:path	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   102: aload_1
    //   103: invokevirtual 492	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   106: ldc_w 494
    //   109: lload 9
    //   111: invokestatic 497	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   114: invokevirtual 501	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   117: invokevirtual 505	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   120: astore 11
    //   122: aload 4
    //   124: astore 7
    //   126: aload 5
    //   128: astore 8
    //   130: aload_0
    //   131: invokevirtual 509	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   134: aload 11
    //   136: invokevirtual 515	android/content/ContentResolver:acquireUnstableContentProviderClient	(Landroid/net/Uri;)Landroid/content/ContentProviderClient;
    //   139: astore_1
    //   140: iconst_0
    //   141: istore_2
    //   142: aload_1
    //   143: ifnonnull +6 -> 149
    //   146: goto +342 -> 488
    //   149: aload_1
    //   150: aload 11
    //   152: aconst_null
    //   153: aconst_null
    //   154: aconst_null
    //   155: aconst_null
    //   156: invokevirtual 521	android/content/ContentProviderClient:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   159: astore 8
    //   161: aload 8
    //   163: ifnonnull +6 -> 169
    //   166: goto +309 -> 475
    //   169: aload 8
    //   171: invokeinterface 524 1 0
    //   176: istore 14
    //   178: aload 8
    //   180: invokeinterface 527 1 0
    //   185: istore 15
    //   187: new 529	android/database/MatrixCursor
    //   190: astore_0
    //   191: aload_0
    //   192: aload 8
    //   194: invokeinterface 533 1 0
    //   199: iload 14
    //   201: invokespecial 536	android/database/MatrixCursor:<init>	([Ljava/lang/String;I)V
    //   204: iconst_0
    //   205: istore 16
    //   207: iload 16
    //   209: iload 14
    //   211: if_icmpge +196 -> 407
    //   214: aload 8
    //   216: iload 16
    //   218: invokeinterface 540 2 0
    //   223: ifeq +171 -> 394
    //   226: iload 15
    //   228: anewarray 4	java/lang/Object
    //   231: astore 7
    //   233: iconst_0
    //   234: istore 17
    //   236: iload 17
    //   238: iload 15
    //   240: if_icmpge +142 -> 382
    //   243: aload 8
    //   245: iload 17
    //   247: invokeinterface 543 2 0
    //   252: istore 18
    //   254: iload 18
    //   256: ifeq +114 -> 370
    //   259: iload 18
    //   261: iconst_1
    //   262: if_icmpeq +88 -> 350
    //   265: iload 18
    //   267: iconst_2
    //   268: if_icmpeq +62 -> 330
    //   271: iload 18
    //   273: iconst_3
    //   274: if_icmpeq +39 -> 313
    //   277: iload 18
    //   279: iconst_4
    //   280: if_icmpne +20 -> 300
    //   283: aload 7
    //   285: iload 17
    //   287: aload 8
    //   289: iload 17
    //   291: invokeinterface 547 2 0
    //   296: aastore
    //   297: goto +79 -> 376
    //   300: new 179	android/os/RemoteException
    //   303: astore_0
    //   304: aload_0
    //   305: ldc_w 549
    //   308: invokespecial 550	android/os/RemoteException:<init>	(Ljava/lang/String;)V
    //   311: aload_0
    //   312: athrow
    //   313: aload 7
    //   315: iload 17
    //   317: aload 8
    //   319: iload 17
    //   321: invokeinterface 554 2 0
    //   326: aastore
    //   327: goto +49 -> 376
    //   330: aload 7
    //   332: iload 17
    //   334: aload 8
    //   336: iload 17
    //   338: invokeinterface 558 2 0
    //   343: invokestatic 563	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   346: aastore
    //   347: goto +29 -> 376
    //   350: aload 7
    //   352: iload 17
    //   354: aload 8
    //   356: iload 17
    //   358: invokeinterface 567 2 0
    //   363: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   366: aastore
    //   367: goto +9 -> 376
    //   370: aload 7
    //   372: iload 17
    //   374: aconst_null
    //   375: aastore
    //   376: iinc 17 1
    //   379: goto -143 -> 236
    //   382: aload_0
    //   383: aload 7
    //   385: invokevirtual 571	android/database/MatrixCursor:addRow	([Ljava/lang/Object;)V
    //   388: iinc 16 1
    //   391: goto -184 -> 207
    //   394: new 179	android/os/RemoteException
    //   397: astore_0
    //   398: aload_0
    //   399: ldc_w 573
    //   402: invokespecial 550	android/os/RemoteException:<init>	(Ljava/lang/String;)V
    //   405: aload_0
    //   406: athrow
    //   407: aload 8
    //   409: invokeinterface 348 1 0
    //   414: aload 4
    //   416: astore 7
    //   418: aload 5
    //   420: astore 8
    //   422: aload_1
    //   423: invokevirtual 576	android/content/ContentProviderClient:release	()Z
    //   426: pop
    //   427: goto +63 -> 490
    //   430: astore_0
    //   431: aload 8
    //   433: invokeinterface 348 1 0
    //   438: goto +11 -> 449
    //   441: astore 8
    //   443: aload_0
    //   444: aload 8
    //   446: invokevirtual 580	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   449: aload_0
    //   450: athrow
    //   451: astore_0
    //   452: aload 4
    //   454: astore 7
    //   456: aload 5
    //   458: astore 8
    //   460: aload_1
    //   461: invokevirtual 576	android/content/ContentProviderClient:release	()Z
    //   464: pop
    //   465: aload 4
    //   467: astore 7
    //   469: aload 5
    //   471: astore 8
    //   473: aload_0
    //   474: athrow
    //   475: aload 4
    //   477: astore 7
    //   479: aload 5
    //   481: astore 8
    //   483: aload_1
    //   484: invokevirtual 576	android/content/ContentProviderClient:release	()Z
    //   487: pop
    //   488: aconst_null
    //   489: astore_0
    //   490: aload_0
    //   491: ifnull +233 -> 724
    //   494: aload_0
    //   495: invokeinterface 443 1 0
    //   500: ifeq +224 -> 724
    //   503: aload_0
    //   504: iconst_0
    //   505: invokeinterface 436 2 0
    //   510: istore 17
    //   512: iload 17
    //   514: ifle +151 -> 665
    //   517: ldc 2
    //   519: monitorenter
    //   520: aload_0
    //   521: iconst_2
    //   522: invokeinterface 554 2 0
    //   527: putstatic 396	com/google/android/gms/dynamite/DynamiteModule:e	Ljava/lang/String;
    //   530: aload_0
    //   531: ldc_w 582
    //   534: invokeinterface 586 2 0
    //   539: istore 16
    //   541: iload 16
    //   543: iflt +14 -> 557
    //   546: aload_0
    //   547: iload 16
    //   549: invokeinterface 436 2 0
    //   554: putstatic 251	com/google/android/gms/dynamite/DynamiteModule:g	I
    //   557: aload_0
    //   558: ldc_w 588
    //   561: invokeinterface 586 2 0
    //   566: istore 16
    //   568: iload 16
    //   570: iflt +28 -> 598
    //   573: aload_0
    //   574: iload 16
    //   576: invokeinterface 436 2 0
    //   581: ifeq +8 -> 589
    //   584: iconst_1
    //   585: istore_2
    //   586: goto +5 -> 591
    //   589: iconst_0
    //   590: istore_2
    //   591: iload_2
    //   592: putstatic 387	com/google/android/gms/dynamite/DynamiteModule:f	Z
    //   595: goto +5 -> 600
    //   598: iconst_0
    //   599: istore_2
    //   600: ldc 2
    //   602: monitorexit
    //   603: getstatic 51	com/google/android/gms/dynamite/DynamiteModule:i	Ljava/lang/ThreadLocal;
    //   606: invokevirtual 182	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   609: checkcast 184	y6/d
    //   612: astore_1
    //   613: aload_1
    //   614: ifnull +22 -> 636
    //   617: aload_1
    //   618: getfield 243	y6/d:a	Landroid/database/Cursor;
    //   621: ifnonnull +15 -> 636
    //   624: aload_1
    //   625: aload_0
    //   626: putfield 243	y6/d:a	Landroid/database/Cursor;
    //   629: iload 12
    //   631: istore 16
    //   633: goto +6 -> 639
    //   636: iconst_0
    //   637: istore 16
    //   639: iload_2
    //   640: istore 19
    //   642: iload 19
    //   644: istore_2
    //   645: iload 16
    //   647: ifeq +18 -> 665
    //   650: aload 6
    //   652: astore_0
    //   653: iload 19
    //   655: istore_2
    //   656: goto +9 -> 665
    //   659: astore_1
    //   660: ldc 2
    //   662: monitorexit
    //   663: aload_1
    //   664: athrow
    //   665: iload_3
    //   666: ifeq +45 -> 711
    //   669: iload_2
    //   670: ifne +6 -> 676
    //   673: goto +38 -> 711
    //   676: aload_0
    //   677: astore 7
    //   679: aload_0
    //   680: astore 8
    //   682: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   685: astore_1
    //   686: aload_0
    //   687: astore 7
    //   689: aload_0
    //   690: astore 8
    //   692: aload_1
    //   693: ldc_w 590
    //   696: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   699: aload_0
    //   700: astore 7
    //   702: aload_0
    //   703: astore 8
    //   705: aload_1
    //   706: athrow
    //   707: astore_0
    //   708: goto +60 -> 768
    //   711: aload_0
    //   712: ifnull +9 -> 721
    //   715: aload_0
    //   716: invokeinterface 348 1 0
    //   721: iload 17
    //   723: ireturn
    //   724: ldc -107
    //   726: ldc_w 445
    //   729: invokestatic 176	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   732: pop
    //   733: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   736: astore_1
    //   737: aload_1
    //   738: ldc_w 592
    //   741: invokespecial 280	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;)V
    //   744: aload_1
    //   745: athrow
    //   746: astore_1
    //   747: aload_0
    //   748: astore 8
    //   750: aload_1
    //   751: astore_0
    //   752: goto +112 -> 864
    //   755: astore_1
    //   756: aload_0
    //   757: astore 7
    //   759: aload_1
    //   760: astore_0
    //   761: goto +7 -> 768
    //   764: astore_0
    //   765: goto +99 -> 864
    //   768: aload 7
    //   770: astore 8
    //   772: aload_0
    //   773: instanceof 9
    //   776: ifeq +9 -> 785
    //   779: aload 7
    //   781: astore 8
    //   783: aload_0
    //   784: athrow
    //   785: aload 7
    //   787: astore 8
    //   789: new 9	com/google/android/gms/dynamite/DynamiteModule$a
    //   792: astore 11
    //   794: aload 7
    //   796: astore 8
    //   798: aload_0
    //   799: invokevirtual 165	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   802: astore 6
    //   804: aload 7
    //   806: astore 8
    //   808: new 95	java/lang/StringBuilder
    //   811: astore_1
    //   812: aload 7
    //   814: astore 8
    //   816: aload_1
    //   817: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   820: aload 7
    //   822: astore 8
    //   824: aload_1
    //   825: ldc_w 594
    //   828: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   831: pop
    //   832: aload 7
    //   834: astore 8
    //   836: aload_1
    //   837: aload 6
    //   839: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   842: pop
    //   843: aload 7
    //   845: astore 8
    //   847: aload 11
    //   849: aload_1
    //   850: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   853: aload_0
    //   854: invokespecial 332	com/google/android/gms/dynamite/DynamiteModule$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   857: aload 7
    //   859: astore 8
    //   861: aload 11
    //   863: athrow
    //   864: aload 8
    //   866: ifnull +10 -> 876
    //   869: aload 8
    //   871: invokeinterface 348 1 0
    //   876: aload_0
    //   877: athrow
    //   878: astore_0
    //   879: goto -404 -> 475
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	882	0	paramContext	Context
    //   0	882	1	paramString	String
    //   0	882	2	paramBoolean1	boolean
    //   0	882	3	paramBoolean2	boolean
    //   1	475	4	localObject1	Object
    //   4	476	5	localObject2	Object
    //   7	831	6	str	String
    //   11	847	7	localObject3	Object
    //   15	417	8	localObject4	Object
    //   441	4	8	localThrowable	Throwable
    //   458	412	8	localObject5	Object
    //   29	81	9	l1	long
    //   34	828	11	localObject6	Object
    //   37	593	12	n	int
    //   60	24	13	localBuilder	android.net.Uri.Builder
    //   176	36	14	i1	int
    //   185	56	15	i2	int
    //   205	441	16	i3	int
    //   234	488	17	i4	int
    //   252	29	18	i5	int
    //   640	14	19	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   169	204	430	finally
    //   214	233	430	finally
    //   243	254	430	finally
    //   283	297	430	finally
    //   300	313	430	finally
    //   313	327	430	finally
    //   330	347	430	finally
    //   350	367	430	finally
    //   382	388	430	finally
    //   394	407	430	finally
    //   431	438	441	finally
    //   149	161	451	finally
    //   407	414	451	finally
    //   443	449	451	finally
    //   449	451	451	finally
    //   520	541	659	finally
    //   546	557	659	finally
    //   557	568	659	finally
    //   573	584	659	finally
    //   591	595	659	finally
    //   600	603	659	finally
    //   660	663	659	finally
    //   17	31	707	java/lang/Exception
    //   57	62	707	java/lang/Exception
    //   70	75	707	java/lang/Exception
    //   83	122	707	java/lang/Exception
    //   130	140	707	java/lang/Exception
    //   422	427	707	java/lang/Exception
    //   460	465	707	java/lang/Exception
    //   473	475	707	java/lang/Exception
    //   483	488	707	java/lang/Exception
    //   682	686	707	java/lang/Exception
    //   692	699	707	java/lang/Exception
    //   705	707	707	java/lang/Exception
    //   494	512	746	finally
    //   517	520	746	finally
    //   603	613	746	finally
    //   617	629	746	finally
    //   663	665	746	finally
    //   724	746	746	finally
    //   494	512	755	java/lang/Exception
    //   517	520	755	java/lang/Exception
    //   603	613	755	java/lang/Exception
    //   617	629	755	java/lang/Exception
    //   663	665	755	java/lang/Exception
    //   724	746	755	java/lang/Exception
    //   17	31	764	finally
    //   57	62	764	finally
    //   70	75	764	finally
    //   83	122	764	finally
    //   130	140	764	finally
    //   422	427	764	finally
    //   460	465	764	finally
    //   473	475	764	finally
    //   483	488	764	finally
    //   682	686	764	finally
    //   692	699	764	finally
    //   705	707	764	finally
    //   772	779	764	finally
    //   783	785	764	finally
    //   789	794	764	finally
    //   798	804	764	finally
    //   808	812	764	finally
    //   816	820	764	finally
    //   824	832	764	finally
    //   836	843	764	finally
    //   847	857	764	finally
    //   861	864	764	finally
    //   149	161	878	android/os/RemoteException
    //   407	414	878	android/os/RemoteException
    //   443	449	878	android/os/RemoteException
    //   449	451	878	android/os/RemoteException
  }
  
  public static DynamiteModule f(Context paramContext, String paramString)
  {
    Log.i("DynamiteModule", "Selected local version of ".concat(paramString));
    return new DynamiteModule(paramContext);
  }
  
  public static void g(ClassLoader paramClassLoader)
  {
    try
    {
      paramClassLoader = (IBinder)paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramClassLoader == null)
      {
        paramClassLoader = null;
      }
      else
      {
        IInterface localIInterface = paramClassLoader.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if ((localIInterface instanceof y6.f)) {
          paramClassLoader = (y6.f)localIInterface;
        } else {
          paramClassLoader = new y6.f(paramClassLoader);
        }
      }
      m = paramClassLoader;
      return;
    }
    catch (NoSuchMethodException paramClassLoader) {}catch (InvocationTargetException paramClassLoader) {}catch (InstantiationException paramClassLoader) {}catch (IllegalAccessException paramClassLoader) {}catch (ClassNotFoundException paramClassLoader) {}
    throw new a("Failed to instantiate dynamite loader", paramClassLoader);
  }
  
  public static boolean h(Context paramContext)
  {
    Object localObject = Boolean.TRUE;
    if (((Boolean)localObject).equals(null)) {
      return true;
    }
    if (((Boolean)localObject).equals(h)) {
      return true;
    }
    localObject = h;
    boolean bool1 = false;
    boolean bool2 = false;
    if (localObject == null)
    {
      localObject = paramContext.getPackageManager();
      int n;
      if (Build.VERSION.SDK_INT >= 29) {
        n = 1;
      } else {
        n = 0;
      }
      if (1 != n) {
        n = 0;
      } else {
        n = 268435456;
      }
      localObject = ((PackageManager)localObject).resolveContentProvider("com.google.android.gms.chimera", n);
      bool1 = bool2;
      if (j6.f.b.c(paramContext, 10000000) == 0)
      {
        bool1 = bool2;
        if (localObject != null)
        {
          bool1 = bool2;
          if ("com.google.android.gms".equals(packageName)) {
            bool1 = true;
          }
        }
      }
      paramContext = Boolean.valueOf(bool1);
      h = paramContext;
      bool2 = paramContext.booleanValue();
      bool1 = bool2;
      if (bool2)
      {
        paramContext = applicationInfo;
        bool1 = bool2;
        if (paramContext != null)
        {
          bool1 = bool2;
          if ((flags & 0x81) == 0)
          {
            Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
            f = true;
            bool1 = bool2;
          }
        }
      }
    }
    if (!bool1) {
      Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
    }
    return bool1;
  }
  
  /* Error */
  public static e i(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 672	com/google/android/gms/dynamite/DynamiteModule:l	Ly6/e;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +8 -> 16
    //   11: ldc 2
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: aload_0
    //   17: ldc_w 651
    //   20: iconst_3
    //   21: invokevirtual 676	android/content/Context:createPackageContext	(Ljava/lang/String;I)Landroid/content/Context;
    //   24: invokevirtual 93	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   27: ldc_w 678
    //   30: invokevirtual 114	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   33: invokevirtual 680	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   36: checkcast 616	android/os/IBinder
    //   39: astore_1
    //   40: aload_1
    //   41: ifnonnull +8 -> 49
    //   44: aconst_null
    //   45: astore_0
    //   46: goto +37 -> 83
    //   49: aload_1
    //   50: ldc_w 682
    //   53: invokeinterface 622 2 0
    //   58: astore_0
    //   59: aload_0
    //   60: instanceof 308
    //   63: ifeq +11 -> 74
    //   66: aload_0
    //   67: checkcast 308	y6/e
    //   70: astore_0
    //   71: goto +12 -> 83
    //   74: new 308	y6/e
    //   77: dup
    //   78: aload_1
    //   79: invokespecial 683	y6/e:<init>	(Landroid/os/IBinder;)V
    //   82: astore_0
    //   83: aload_0
    //   84: ifnull +50 -> 134
    //   87: aload_0
    //   88: putstatic 672	com/google/android/gms/dynamite/DynamiteModule:l	Ly6/e;
    //   91: ldc 2
    //   93: monitorexit
    //   94: aload_0
    //   95: areturn
    //   96: astore_0
    //   97: aload_0
    //   98: invokevirtual 165	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   101: astore_1
    //   102: new 95	java/lang/StringBuilder
    //   105: astore_0
    //   106: aload_0
    //   107: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   110: aload_0
    //   111: ldc_w 685
    //   114: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: pop
    //   118: aload_0
    //   119: aload_1
    //   120: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: ldc -107
    //   126: aload_0
    //   127: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokestatic 154	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   133: pop
    //   134: ldc 2
    //   136: monitorexit
    //   137: aconst_null
    //   138: areturn
    //   139: astore_0
    //   140: ldc 2
    //   142: monitorexit
    //   143: aload_0
    //   144: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	paramContext	Context
    //   6	114	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   16	40	96	java/lang/Exception
    //   49	71	96	java/lang/Exception
    //   74	83	96	java/lang/Exception
    //   87	91	96	java/lang/Exception
    //   3	7	139	finally
    //   11	14	139	finally
    //   16	40	139	finally
    //   49	71	139	finally
    //   74	83	139	finally
    //   87	91	139	finally
    //   91	94	139	finally
    //   97	134	139	finally
    //   134	137	139	finally
    //   140	143	139	finally
  }
  
  public final IBinder b(String paramString)
  {
    try
    {
      IBinder localIBinder = (IBinder)a.getClassLoader().loadClass(paramString).newInstance();
      return localIBinder;
    }
    catch (IllegalAccessException localIllegalAccessException) {}catch (InstantiationException localInstantiationException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    throw new a("Failed to instantiate module class: ".concat(paramString), localClassNotFoundException);
  }
  
  public static class DynamiteLoaderClassLoader
  {
    public static ClassLoader sClassLoader;
  }
  
  public static final class a
    extends Exception
  {}
  
  public static abstract interface b
  {
    public abstract b a(Context paramContext, String paramString, a parama);
    
    public static abstract interface a
    {
      public abstract int a(Context paramContext, String paramString, boolean paramBoolean);
      
      public abstract int b(Context paramContext, String paramString);
    }
    
    public static final class b
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
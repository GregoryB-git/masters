package vn.hunghd.flutterdownloader;

import ad.a;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Media;
import d5.n;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import o2.j;
import o2.l.a;
import o2.q.a;
import rb.h;
import sb.u;
import x2.s;

public final class b
  implements MethodChannel.MethodCallHandler, FlutterPlugin
{
  public MethodChannel a;
  public n b;
  public Context c;
  public long d;
  public int e;
  public int f;
  public int o;
  public final Object p = new Object();
  
  public static Object c(MethodCall paramMethodCall, String paramString)
  {
    paramMethodCall = paramMethodCall.argument(paramString);
    if (paramMethodCall != null) {
      return paramMethodCall;
    }
    throw new IllegalArgumentException(g.e("Required key '", paramString, "' was null").toString());
  }
  
  public final o2.q a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, int paramInt, boolean paramBoolean6, String paramString5)
  {
    l.a locala = new l.a(DownloadWorker.class);
    Object localObject = new LinkedHashSet();
    int i;
    if (paramBoolean6) {
      i = 2;
    } else {
      i = 3;
    }
    if (Build.VERSION.SDK_INT >= 24) {
      localObject = sb.q.x((Iterable)localObject);
    } else {
      localObject = u.a;
    }
    localObject = new o2.c(i, false, false, false, paramBoolean4, -1L, -1L, (Set)localObject);
    c.j = ((o2.c)localObject);
    d.add("flutter_download_task");
    localObject = TimeUnit.SECONDS;
    i.e(localObject, "timeUnit");
    paramBoolean4 = true;
    a = true;
    s locals = c;
    l = 1;
    long l = ((TimeUnit)localObject).toMillis(10L);
    if (l > 18000000L) {
      j.d().g(s.x, "Backoff delay duration exceeds maximum value");
    }
    if (l < 10000L) {
      j.d().g(s.x, "Backoff delay duration less than minimum value");
    }
    m = ic.g.N(l, 10000L, 18000000L);
    localObject = new HashMap();
    ((HashMap)localObject).put("url", paramString1);
    ((HashMap)localObject).put("saved_file", paramString2);
    ((HashMap)localObject).put("file_name", paramString3);
    ((HashMap)localObject).put("headers", paramString4);
    ((HashMap)localObject).put("show_notification", Boolean.valueOf(paramBoolean1));
    ((HashMap)localObject).put("open_file_from_notification", Boolean.valueOf(paramBoolean2));
    ((HashMap)localObject).put("is_resume", Boolean.valueOf(paramBoolean3));
    ((HashMap)localObject).put("callback_handle", Long.valueOf(d));
    ((HashMap)localObject).put("step", Integer.valueOf(e));
    if (f == 1) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    ((HashMap)localObject).put("debug", Boolean.valueOf(paramBoolean1));
    if (o == 1) {
      paramBoolean1 = paramBoolean4;
    } else {
      paramBoolean1 = false;
    }
    ((HashMap)localObject).put("ignoreSsl", Boolean.valueOf(paramBoolean1));
    ((HashMap)localObject).put("save_in_public_storage", Boolean.valueOf(paramBoolean5));
    ((HashMap)localObject).put("timeout", Integer.valueOf(paramInt));
    ((HashMap)localObject).put("proxy", paramString5);
    paramString1 = new androidx.work.c((HashMap)localObject);
    androidx.work.c.e(paramString1);
    c.e = paramString1;
    return locala.a();
  }
  
  public final void b(File paramFile)
  {
    Object localObject1 = new String[1];
    localObject1[0] = "_id";
    Object localObject2 = new String[1];
    localObject2[0] = paramFile.getAbsolutePath();
    Uri localUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    i.d(localUri, "EXTERNAL_CONTENT_URI");
    paramFile = d().getContentResolver();
    i.d(paramFile, "getContentResolver(...)");
    Cursor localCursor = paramFile.query(localUri, (String[])localObject1, "_data = ?", (String[])localObject2, null);
    long l;
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      l = localCursor.getLong(localCursor.getColumnIndexOrThrow("_id"));
      localObject2 = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, l);
      i.d(localObject2, "withAppendedId(...)");
      paramFile.delete((Uri)localObject2, null, null);
    }
    else
    {
      localObject2 = paramFile.query(localUri, (String[])localObject1, "_data = ?", (String[])localObject2, null);
      if ((localObject2 != null) && (((Cursor)localObject2).moveToFirst()))
      {
        l = ((Cursor)localObject2).getLong(((Cursor)localObject2).getColumnIndexOrThrow("_id"));
        localObject1 = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, l);
        i.d(localObject1, "withAppendedId(...)");
        paramFile.delete((Uri)localObject1, null, null);
      }
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
  }
  
  public final Context d()
  {
    Context localContext = c;
    if (localContext != null) {
      return localContext;
    }
    throw new IllegalArgumentException("Required value was null.".toString());
  }
  
  public final void e(String paramString, a parama, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("task_id", paramString);
    localHashMap.put("status", Integer.valueOf(parama.ordinal()));
    localHashMap.put("progress", Integer.valueOf(paramInt));
    paramString = a;
    if (paramString != null) {
      paramString.invokeMethod("updateProgress", localHashMap);
    }
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding arg1)
  {
    i.e(???, "binding");
    Object localObject1 = ???.getApplicationContext();
    Object localObject3 = ???.getBinaryMessenger();
    i.d(localObject3, "getBinaryMessenger(...)");
    synchronized (p)
    {
      if (a == null)
      {
        c = ((Context)localObject1);
        localObject1 = new io/flutter/plugin/common/MethodChannel;
        ((MethodChannel)localObject1).<init>((BinaryMessenger)localObject3, "vn.hunghd/downloader");
        a = ((MethodChannel)localObject1);
        ((MethodChannel)localObject1).setMethodCallHandler(this);
        localObject1 = c.a;
        localObject1 = c.a.a(c);
        localObject3 = new d5/n;
        ((n)localObject3).<init>((c)localObject1);
        b = ((n)localObject3);
        localObject1 = h.a;
      }
      return;
    }
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "binding");
    c = null;
    paramFlutterPluginBinding = a;
    if (paramFlutterPluginBinding != null) {
      paramFlutterPluginBinding.setMethodCallHandler(null);
    }
    a = null;
  }
  
  /* Error */
  public final void onMethodCall(MethodCall paramMethodCall, io.flutter.plugin.common.MethodChannel.Result paramResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: astore_3
    //   2: aload_1
    //   3: ldc_w 385
    //   6: invokestatic 123	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   9: aload_2
    //   10: ldc_w 387
    //   13: invokestatic 123	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_1
    //   17: getfield 390	io/flutter/plugin/common/MethodCall:method	Ljava/lang/String;
    //   20: astore 4
    //   22: aload 4
    //   24: ifnull +2787 -> 2811
    //   27: aload 4
    //   29: invokevirtual 393	java/lang/String:hashCode	()I
    //   32: istore 5
    //   34: ldc_w 312
    //   37: astore 6
    //   39: ldc_w 395
    //   42: astore 7
    //   44: iload 5
    //   46: lookupswitch	default:+106->152, -1594257912:+2326->2372, -1367724422:+2276->2322, -934610812:+1923->1969, -934426579:+1528->1574, -403218424:+1453->1499, 3417674:+1222->1268, 106440182:+1157->1203, 108405416:+880->926, 230377166:+595->641, 476547271:+537->583, 871091088:+387->433, 1378870856:+109->155
    //   152: goto +2659 -> 2811
    //   155: aload 4
    //   157: ldc_w 397
    //   160: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   163: ifne +6 -> 169
    //   166: goto +2645 -> 2811
    //   169: aload_3
    //   170: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   173: astore_1
    //   174: aload_1
    //   175: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   178: aload_1
    //   179: getfield 405	d5/n:b	Ljava/lang/Object;
    //   182: checkcast 356	vn/hunghd/flutterdownloader/c
    //   185: invokevirtual 411	android/database/sqlite/SQLiteOpenHelper:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   188: ldc_w 413
    //   191: aload_1
    //   192: getfield 415	d5/n:c	Ljava/lang/Object;
    //   195: checkcast 417	[Ljava/lang/String;
    //   198: aconst_null
    //   199: aconst_null
    //   200: aconst_null
    //   201: aconst_null
    //   202: aconst_null
    //   203: invokevirtual 422	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   206: astore_3
    //   207: new 424	java/util/ArrayList
    //   210: dup
    //   211: invokespecial 425	java/util/ArrayList:<init>	()V
    //   214: astore_1
    //   215: aload_3
    //   216: invokeinterface 428 1 0
    //   221: ifeq +15 -> 236
    //   224: aload_1
    //   225: aload_3
    //   226: invokestatic 431	d5/n:f	(Landroid/database/Cursor;)Lad/b;
    //   229: invokevirtual 432	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   232: pop
    //   233: goto -18 -> 215
    //   236: aload_3
    //   237: invokeinterface 303 1 0
    //   242: new 424	java/util/ArrayList
    //   245: dup
    //   246: invokespecial 425	java/util/ArrayList:<init>	()V
    //   249: astore_3
    //   250: aload_1
    //   251: invokevirtual 436	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   254: astore 6
    //   256: aload 7
    //   258: astore_1
    //   259: aload 6
    //   261: invokeinterface 441 1 0
    //   266: ifeq +157 -> 423
    //   269: aload 6
    //   271: invokeinterface 445 1 0
    //   276: checkcast 447	ad/b
    //   279: astore 4
    //   281: new 165	java/util/HashMap
    //   284: dup
    //   285: invokespecial 166	java/util/HashMap:<init>	()V
    //   288: astore 7
    //   290: aload 7
    //   292: ldc_w 310
    //   295: aload 4
    //   297: getfield 449	ad/b:b	Ljava/lang/String;
    //   300: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   303: pop
    //   304: aload 7
    //   306: ldc_w 312
    //   309: aload 4
    //   311: getfield 452	ad/b:c	Lad/a;
    //   314: invokevirtual 318	java/lang/Enum:ordinal	()I
    //   317: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   320: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   323: pop
    //   324: aload 7
    //   326: ldc_w 320
    //   329: aload 4
    //   331: getfield 454	ad/b:d	I
    //   334: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   337: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   340: pop
    //   341: aload 7
    //   343: ldc -88
    //   345: aload 4
    //   347: getfield 456	ad/b:e	Ljava/lang/String;
    //   350: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   353: pop
    //   354: aload 7
    //   356: ldc -80
    //   358: aload 4
    //   360: getfield 458	ad/b:f	Ljava/lang/String;
    //   363: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   366: pop
    //   367: aload 7
    //   369: aload_1
    //   370: aload 4
    //   372: getfield 460	ad/b:g	Ljava/lang/String;
    //   375: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   378: pop
    //   379: aload 7
    //   381: ldc_w 462
    //   384: aload 4
    //   386: getfield 463	ad/b:m	J
    //   389: invokestatic 199	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   392: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   395: pop
    //   396: aload 7
    //   398: ldc_w 465
    //   401: aload 4
    //   403: getfield 467	ad/b:o	Z
    //   406: invokestatic 186	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   409: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   412: pop
    //   413: aload_3
    //   414: aload 7
    //   416: invokevirtual 432	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   419: pop
    //   420: goto -161 -> 259
    //   423: aload_2
    //   424: aload_3
    //   425: invokeinterface 472 2 0
    //   430: goto +1939 -> 2369
    //   433: aload 4
    //   435: ldc_w 474
    //   438: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   441: ifne +6 -> 447
    //   444: goto +2367 -> 2811
    //   447: aload_1
    //   448: getfield 477	io/flutter/plugin/common/MethodCall:arguments	Ljava/lang/Object;
    //   451: astore_1
    //   452: aload_1
    //   453: ldc_w 479
    //   456: invokestatic 481	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   459: aload_1
    //   460: checkcast 483	java/util/List
    //   463: astore_1
    //   464: aload_1
    //   465: iconst_0
    //   466: invokeinterface 487 2 0
    //   471: invokestatic 490	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   474: invokestatic 494	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   477: lstore 8
    //   479: aload_3
    //   480: aload_1
    //   481: iconst_1
    //   482: invokeinterface 487 2 0
    //   487: invokestatic 490	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   490: invokestatic 497	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   493: putfield 210	vn/hunghd/flutterdownloader/b:f	I
    //   496: aload_3
    //   497: aload_1
    //   498: iconst_2
    //   499: invokeinterface 487 2 0
    //   504: invokestatic 490	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   507: invokestatic 497	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   510: putfield 214	vn/hunghd/flutterdownloader/b:o	I
    //   513: aload_3
    //   514: getfield 305	vn/hunghd/flutterdownloader/b:c	Landroid/content/Context;
    //   517: astore_1
    //   518: aload_1
    //   519: ifnull +15 -> 534
    //   522: aload_1
    //   523: ldc_w 499
    //   526: iconst_0
    //   527: invokevirtual 503	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   530: astore_1
    //   531: goto +5 -> 536
    //   534: aconst_null
    //   535: astore_1
    //   536: aload_1
    //   537: ifnull +36 -> 573
    //   540: aload_1
    //   541: invokeinterface 509 1 0
    //   546: astore_1
    //   547: aload_1
    //   548: ifnull +25 -> 573
    //   551: aload_1
    //   552: ldc_w 511
    //   555: lload 8
    //   557: invokeinterface 517 4 0
    //   562: astore_1
    //   563: aload_1
    //   564: ifnull +9 -> 573
    //   567: aload_1
    //   568: invokeinterface 520 1 0
    //   573: aload_2
    //   574: aconst_null
    //   575: invokeinterface 472 2 0
    //   580: goto +1789 -> 2369
    //   583: aload 4
    //   585: ldc_w 522
    //   588: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   591: ifne +6 -> 597
    //   594: goto +2217 -> 2811
    //   597: aload_0
    //   598: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   601: invokestatic 527	p2/k0:d	(Landroid/content/Context;)Lp2/k0;
    //   604: astore_3
    //   605: aload_3
    //   606: invokevirtual 531	java/lang/Object:getClass	()Ljava/lang/Class;
    //   609: pop
    //   610: new 533	y2/c
    //   613: dup
    //   614: aload_3
    //   615: ldc 104
    //   617: invokespecial 536	y2/c:<init>	(Lp2/k0;Ljava/lang/String;)V
    //   620: astore_1
    //   621: aload_3
    //   622: getfield 539	p2/k0:d	La3/b;
    //   625: aload_1
    //   626: invokeinterface 544 2 0
    //   631: aload_2
    //   632: aconst_null
    //   633: invokeinterface 472 2 0
    //   638: goto +1731 -> 2369
    //   641: ldc_w 395
    //   644: astore 7
    //   646: aload 4
    //   648: ldc_w 546
    //   651: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   654: ifne +6 -> 660
    //   657: goto +2154 -> 2811
    //   660: aload_1
    //   661: ldc_w 547
    //   664: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   667: checkcast 239	java/lang/String
    //   670: astore_1
    //   671: aload_3
    //   672: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   675: astore_3
    //   676: aload_3
    //   677: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   680: aload_3
    //   681: getfield 405	d5/n:b	Ljava/lang/Object;
    //   684: checkcast 356	vn/hunghd/flutterdownloader/c
    //   687: invokevirtual 411	android/database/sqlite/SQLiteOpenHelper:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   690: aload_1
    //   691: aconst_null
    //   692: invokevirtual 553	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   695: astore_3
    //   696: new 424	java/util/ArrayList
    //   699: dup
    //   700: invokespecial 425	java/util/ArrayList:<init>	()V
    //   703: astore_1
    //   704: aload_3
    //   705: invokeinterface 428 1 0
    //   710: ifeq +15 -> 725
    //   713: aload_1
    //   714: aload_3
    //   715: invokestatic 431	d5/n:f	(Landroid/database/Cursor;)Lad/b;
    //   718: invokevirtual 432	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   721: pop
    //   722: goto -18 -> 704
    //   725: aload_3
    //   726: invokeinterface 303 1 0
    //   731: new 424	java/util/ArrayList
    //   734: dup
    //   735: invokespecial 425	java/util/ArrayList:<init>	()V
    //   738: astore 4
    //   740: aload_1
    //   741: invokevirtual 436	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   744: astore 10
    //   746: aload 7
    //   748: astore_1
    //   749: aload 6
    //   751: astore_3
    //   752: aload 10
    //   754: invokeinterface 441 1 0
    //   759: ifeq +156 -> 915
    //   762: aload 10
    //   764: invokeinterface 445 1 0
    //   769: checkcast 447	ad/b
    //   772: astore 7
    //   774: new 165	java/util/HashMap
    //   777: dup
    //   778: invokespecial 166	java/util/HashMap:<init>	()V
    //   781: astore 6
    //   783: aload 6
    //   785: ldc_w 310
    //   788: aload 7
    //   790: getfield 449	ad/b:b	Ljava/lang/String;
    //   793: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   796: pop
    //   797: aload 6
    //   799: aload_3
    //   800: aload 7
    //   802: getfield 452	ad/b:c	Lad/a;
    //   805: invokevirtual 318	java/lang/Enum:ordinal	()I
    //   808: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   811: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   814: pop
    //   815: aload 6
    //   817: ldc_w 320
    //   820: aload 7
    //   822: getfield 454	ad/b:d	I
    //   825: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   828: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   831: pop
    //   832: aload 6
    //   834: ldc -88
    //   836: aload 7
    //   838: getfield 456	ad/b:e	Ljava/lang/String;
    //   841: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   844: pop
    //   845: aload 6
    //   847: ldc -80
    //   849: aload 7
    //   851: getfield 458	ad/b:f	Ljava/lang/String;
    //   854: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   857: pop
    //   858: aload 6
    //   860: aload_1
    //   861: aload 7
    //   863: getfield 460	ad/b:g	Ljava/lang/String;
    //   866: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   869: pop
    //   870: aload 6
    //   872: ldc_w 462
    //   875: aload 7
    //   877: getfield 463	ad/b:m	J
    //   880: invokestatic 199	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   883: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   886: pop
    //   887: aload 6
    //   889: ldc_w 465
    //   892: aload 7
    //   894: getfield 467	ad/b:o	Z
    //   897: invokestatic 186	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   900: invokevirtual 172	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   903: pop
    //   904: aload 4
    //   906: aload 6
    //   908: invokevirtual 432	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   911: pop
    //   912: goto -160 -> 752
    //   915: aload_2
    //   916: aload 4
    //   918: invokeinterface 472 2 0
    //   923: goto +1446 -> 2369
    //   926: aload 4
    //   928: ldc_w 555
    //   931: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   934: ifne +6 -> 940
    //   937: goto +1874 -> 2811
    //   940: aload_1
    //   941: ldc_w 310
    //   944: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   947: checkcast 239	java/lang/String
    //   950: astore 6
    //   952: aload_3
    //   953: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   956: astore 7
    //   958: aload 7
    //   960: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   963: aload 7
    //   965: aload 6
    //   967: invokevirtual 558	d5/n:e	(Ljava/lang/String;)Lad/b;
    //   970: astore 7
    //   972: aload_1
    //   973: ldc_w 560
    //   976: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   979: checkcast 182	java/lang/Boolean
    //   982: invokevirtual 563	java/lang/Boolean:booleanValue	()Z
    //   985: istore 11
    //   987: aload_1
    //   988: ldc -36
    //   990: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   993: checkcast 565	java/lang/Number
    //   996: invokevirtual 568	java/lang/Number:intValue	()I
    //   999: istore 5
    //   1001: aload_1
    //   1002: ldc -34
    //   1004: invokevirtual 36	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1007: checkcast 239	java/lang/String
    //   1010: astore_1
    //   1011: aload 7
    //   1013: ifnull +170 -> 1183
    //   1016: aload 7
    //   1018: getfield 452	ad/b:c	Lad/a;
    //   1021: astore 4
    //   1023: aload 4
    //   1025: getstatic 572	ad/a:d	Lad/a;
    //   1028: if_acmpeq +25 -> 1053
    //   1031: aload 4
    //   1033: getstatic 574	ad/a:e	Lad/a;
    //   1036: if_acmpne +6 -> 1042
    //   1039: goto +14 -> 1053
    //   1042: ldc_w 576
    //   1045: astore_1
    //   1046: ldc_w 578
    //   1049: astore_3
    //   1050: goto +141 -> 1191
    //   1053: aload_0
    //   1054: aload 7
    //   1056: getfield 456	ad/b:e	Ljava/lang/String;
    //   1059: aload 7
    //   1061: getfield 460	ad/b:g	Ljava/lang/String;
    //   1064: aload 7
    //   1066: getfield 458	ad/b:f	Ljava/lang/String;
    //   1069: aload 7
    //   1071: getfield 581	ad/b:h	Ljava/lang/String;
    //   1074: aload 7
    //   1076: getfield 584	ad/b:k	Z
    //   1079: aload 7
    //   1081: getfield 586	ad/b:l	Z
    //   1084: iconst_0
    //   1085: iload 11
    //   1087: aload 7
    //   1089: getfield 589	ad/b:n	Z
    //   1092: iload 5
    //   1094: aload 7
    //   1096: getfield 467	ad/b:o	Z
    //   1099: aload_1
    //   1100: invokevirtual 591	vn/hunghd/flutterdownloader/b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZLjava/lang/String;)Lo2/q;
    //   1103: astore 4
    //   1105: aload 4
    //   1107: getfield 596	o2/q:a	Ljava/util/UUID;
    //   1110: invokevirtual 599	java/util/UUID:toString	()Ljava/lang/String;
    //   1113: astore_1
    //   1114: aload_1
    //   1115: ldc_w 601
    //   1118: invokestatic 255	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1121: aload_2
    //   1122: aload_1
    //   1123: invokeinterface 472 2 0
    //   1128: getstatic 603	ad/a:a	Lad/a;
    //   1131: astore_2
    //   1132: aload_3
    //   1133: aload_1
    //   1134: aload_2
    //   1135: aload 7
    //   1137: getfield 454	ad/b:d	I
    //   1140: invokevirtual 605	vn/hunghd/flutterdownloader/b:e	(Ljava/lang/String;Lad/a;I)V
    //   1143: aload_3
    //   1144: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   1147: astore_3
    //   1148: aload_3
    //   1149: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   1152: aload_3
    //   1153: aload 6
    //   1155: aload_1
    //   1156: aload_2
    //   1157: aload 7
    //   1159: getfield 454	ad/b:d	I
    //   1162: invokevirtual 608	d5/n:h	(Ljava/lang/String;Ljava/lang/String;Lad/a;I)V
    //   1165: aload_0
    //   1166: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   1169: invokestatic 527	p2/k0:d	(Landroid/content/Context;)Lp2/k0;
    //   1172: aload 4
    //   1174: invokevirtual 613	o2/p:a	(Lo2/q;)Lo2/m;
    //   1177: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   1180: goto +1189 -> 2369
    //   1183: ldc_w 615
    //   1186: astore_1
    //   1187: ldc_w 617
    //   1190: astore_3
    //   1191: aload_2
    //   1192: aload_3
    //   1193: aload_1
    //   1194: aconst_null
    //   1195: invokeinterface 621 4 0
    //   1200: goto +1169 -> 2369
    //   1203: aload 4
    //   1205: ldc_w 623
    //   1208: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1211: ifne +6 -> 1217
    //   1214: goto +1597 -> 2811
    //   1217: aload_1
    //   1218: ldc_w 310
    //   1221: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   1224: checkcast 239	java/lang/String
    //   1227: astore_1
    //   1228: aload_3
    //   1229: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   1232: astore_3
    //   1233: aload_3
    //   1234: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   1237: aload_3
    //   1238: aload_1
    //   1239: iconst_1
    //   1240: invokevirtual 626	d5/n:j	(Ljava/lang/String;Z)V
    //   1243: aload_0
    //   1244: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   1247: invokestatic 527	p2/k0:d	(Landroid/content/Context;)Lp2/k0;
    //   1250: aload_1
    //   1251: invokestatic 630	java/util/UUID:fromString	(Ljava/lang/String;)Ljava/util/UUID;
    //   1254: invokevirtual 633	p2/k0:c	(Ljava/util/UUID;)Lp2/o;
    //   1257: pop
    //   1258: aload_2
    //   1259: aconst_null
    //   1260: invokeinterface 472 2 0
    //   1265: goto +1104 -> 2369
    //   1268: aload 4
    //   1270: ldc_w 635
    //   1273: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1276: ifne +6 -> 1282
    //   1279: goto +1532 -> 2811
    //   1282: aload_1
    //   1283: ldc_w 310
    //   1286: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   1289: checkcast 239	java/lang/String
    //   1292: astore_1
    //   1293: aload_3
    //   1294: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   1297: astore_3
    //   1298: aload_3
    //   1299: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   1302: aload_3
    //   1303: aload_1
    //   1304: invokevirtual 558	d5/n:e	(Ljava/lang/String;)Lad/b;
    //   1307: astore 6
    //   1309: aload 6
    //   1311: ifnonnull +42 -> 1353
    //   1314: new 637	java/lang/StringBuilder
    //   1317: dup
    //   1318: invokespecial 638	java/lang/StringBuilder:<init>	()V
    //   1321: astore_3
    //   1322: aload_3
    //   1323: ldc_w 640
    //   1326: invokevirtual 644	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1329: pop
    //   1330: aload_3
    //   1331: aload_1
    //   1332: invokevirtual 644	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1335: pop
    //   1336: aload_2
    //   1337: ldc_w 617
    //   1340: aload_3
    //   1341: invokevirtual 645	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1344: aconst_null
    //   1345: invokeinterface 621 4 0
    //   1350: goto +1019 -> 2369
    //   1353: aload 6
    //   1355: getfield 452	ad/b:c	Lad/a;
    //   1358: getstatic 646	ad/a:c	Lad/a;
    //   1361: if_acmpeq +19 -> 1380
    //   1364: aload_2
    //   1365: ldc_w 578
    //   1368: ldc_w 648
    //   1371: aconst_null
    //   1372: invokeinterface 621 4 0
    //   1377: goto +992 -> 2369
    //   1380: aload 6
    //   1382: getfield 456	ad/b:e	Ljava/lang/String;
    //   1385: astore 4
    //   1387: aload 6
    //   1389: getfield 460	ad/b:g	Ljava/lang/String;
    //   1392: astore 7
    //   1394: aload 6
    //   1396: getfield 458	ad/b:f	Ljava/lang/String;
    //   1399: astore_3
    //   1400: aload_3
    //   1401: astore_1
    //   1402: aload_3
    //   1403: ifnonnull +33 -> 1436
    //   1406: aload 4
    //   1408: aload 4
    //   1410: ldc_w 650
    //   1413: bipush 6
    //   1415: invokestatic 656	lc/k:u0	(Ljava/lang/String;Ljava/lang/String;I)I
    //   1418: iconst_1
    //   1419: iadd
    //   1420: aload 4
    //   1422: invokevirtual 659	java/lang/String:length	()I
    //   1425: invokevirtual 663	java/lang/String:substring	(II)Ljava/lang/String;
    //   1428: astore_1
    //   1429: aload_1
    //   1430: ldc_w 665
    //   1433: invokestatic 255	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1436: aload 7
    //   1438: invokestatic 668	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1441: getstatic 671	java/io/File:separator	Ljava/lang/String;
    //   1444: aload_1
    //   1445: invokestatic 674	g:f	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1448: astore_1
    //   1449: getstatic 679	ad/d:a	Lad/d;
    //   1452: aload_0
    //   1453: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   1456: aload_1
    //   1457: aload 6
    //   1459: getfield 682	ad/b:i	Ljava/lang/String;
    //   1462: invokevirtual 685	ad/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1465: astore_1
    //   1466: aload_1
    //   1467: ifnull +18 -> 1485
    //   1470: aload_0
    //   1471: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   1474: aload_1
    //   1475: invokevirtual 689	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   1478: getstatic 693	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   1481: astore_1
    //   1482: goto +7 -> 1489
    //   1485: getstatic 696	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1488: astore_1
    //   1489: aload_2
    //   1490: aload_1
    //   1491: invokeinterface 472 2 0
    //   1496: goto +873 -> 2369
    //   1499: aload 4
    //   1501: ldc_w 698
    //   1504: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1507: ifne +6 -> 1513
    //   1510: goto +1301 -> 2811
    //   1513: aload_1
    //   1514: getfield 477	io/flutter/plugin/common/MethodCall:arguments	Ljava/lang/Object;
    //   1517: astore_1
    //   1518: aload_1
    //   1519: ldc_w 479
    //   1522: invokestatic 481	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1525: aload_1
    //   1526: checkcast 483	java/util/List
    //   1529: astore_1
    //   1530: aload_3
    //   1531: aload_1
    //   1532: iconst_0
    //   1533: invokeinterface 487 2 0
    //   1538: invokestatic 490	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1541: invokestatic 494	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   1544: putfield 194	vn/hunghd/flutterdownloader/b:d	J
    //   1547: aload_3
    //   1548: aload_1
    //   1549: iconst_1
    //   1550: invokeinterface 487 2 0
    //   1555: invokestatic 490	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1558: invokestatic 497	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   1561: putfield 203	vn/hunghd/flutterdownloader/b:e	I
    //   1564: aload_2
    //   1565: aconst_null
    //   1566: invokeinterface 472 2 0
    //   1571: goto +798 -> 2369
    //   1574: ldc_w 617
    //   1577: astore 6
    //   1579: aload 4
    //   1581: ldc_w 700
    //   1584: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1587: ifne +6 -> 1593
    //   1590: goto +1221 -> 2811
    //   1593: aload_1
    //   1594: ldc_w 310
    //   1597: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   1600: checkcast 239	java/lang/String
    //   1603: astore 7
    //   1605: aload_3
    //   1606: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   1609: astore 4
    //   1611: aload 4
    //   1613: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   1616: aload 4
    //   1618: aload 7
    //   1620: invokevirtual 558	d5/n:e	(Ljava/lang/String;)Lad/b;
    //   1623: astore 4
    //   1625: aload_1
    //   1626: ldc_w 560
    //   1629: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   1632: checkcast 182	java/lang/Boolean
    //   1635: invokevirtual 563	java/lang/Boolean:booleanValue	()Z
    //   1638: istore 11
    //   1640: aload_1
    //   1641: ldc -36
    //   1643: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   1646: checkcast 565	java/lang/Number
    //   1649: invokevirtual 568	java/lang/Number:intValue	()I
    //   1652: istore 5
    //   1654: aload_1
    //   1655: ldc -34
    //   1657: invokevirtual 36	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1660: checkcast 239	java/lang/String
    //   1663: astore 10
    //   1665: aload 4
    //   1667: ifnull +283 -> 1950
    //   1670: aload 4
    //   1672: getfield 452	ad/b:c	Lad/a;
    //   1675: getstatic 702	ad/a:f	Lad/a;
    //   1678: if_acmpne +261 -> 1939
    //   1681: aload 4
    //   1683: getfield 458	ad/b:f	Ljava/lang/String;
    //   1686: astore 6
    //   1688: aload 6
    //   1690: astore_1
    //   1691: aload 6
    //   1693: ifnonnull +40 -> 1733
    //   1696: aload 4
    //   1698: getfield 456	ad/b:e	Ljava/lang/String;
    //   1701: astore_1
    //   1702: aload_1
    //   1703: aload_1
    //   1704: ldc_w 650
    //   1707: bipush 6
    //   1709: invokestatic 656	lc/k:u0	(Ljava/lang/String;Ljava/lang/String;I)I
    //   1712: iconst_1
    //   1713: iadd
    //   1714: aload 4
    //   1716: getfield 456	ad/b:e	Ljava/lang/String;
    //   1719: invokevirtual 659	java/lang/String:length	()I
    //   1722: invokevirtual 663	java/lang/String:substring	(II)Ljava/lang/String;
    //   1725: astore_1
    //   1726: aload_1
    //   1727: ldc_w 665
    //   1730: invokestatic 255	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1733: new 637	java/lang/StringBuilder
    //   1736: dup
    //   1737: invokespecial 638	java/lang/StringBuilder:<init>	()V
    //   1740: astore 6
    //   1742: aload 6
    //   1744: aload 4
    //   1746: getfield 460	ad/b:g	Ljava/lang/String;
    //   1749: invokevirtual 644	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1752: pop
    //   1753: new 243	java/io/File
    //   1756: dup
    //   1757: aload 6
    //   1759: getstatic 671	java/io/File:separator	Ljava/lang/String;
    //   1762: aload_1
    //   1763: invokestatic 674	g:f	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1766: invokespecial 703	java/io/File:<init>	(Ljava/lang/String;)V
    //   1769: invokevirtual 706	java/io/File:exists	()Z
    //   1772: ifeq +140 -> 1912
    //   1775: aload_0
    //   1776: aload 4
    //   1778: getfield 456	ad/b:e	Ljava/lang/String;
    //   1781: aload 4
    //   1783: getfield 460	ad/b:g	Ljava/lang/String;
    //   1786: aload 4
    //   1788: getfield 458	ad/b:f	Ljava/lang/String;
    //   1791: aload 4
    //   1793: getfield 581	ad/b:h	Ljava/lang/String;
    //   1796: aload 4
    //   1798: getfield 584	ad/b:k	Z
    //   1801: aload 4
    //   1803: getfield 586	ad/b:l	Z
    //   1806: iconst_1
    //   1807: iload 11
    //   1809: aload 4
    //   1811: getfield 589	ad/b:n	Z
    //   1814: iload 5
    //   1816: aload 4
    //   1818: getfield 467	ad/b:o	Z
    //   1821: aload 10
    //   1823: invokevirtual 591	vn/hunghd/flutterdownloader/b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZLjava/lang/String;)Lo2/q;
    //   1826: astore 6
    //   1828: aload 6
    //   1830: getfield 596	o2/q:a	Ljava/util/UUID;
    //   1833: invokevirtual 599	java/util/UUID:toString	()Ljava/lang/String;
    //   1836: astore_3
    //   1837: aload_3
    //   1838: ldc_w 601
    //   1841: invokestatic 255	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   1844: aload_2
    //   1845: aload_3
    //   1846: invokeinterface 472 2 0
    //   1851: getstatic 708	ad/a:b	Lad/a;
    //   1854: astore_2
    //   1855: aload 4
    //   1857: getfield 454	ad/b:d	I
    //   1860: istore 5
    //   1862: aload_0
    //   1863: astore_1
    //   1864: aload_1
    //   1865: aload_3
    //   1866: aload_2
    //   1867: iload 5
    //   1869: invokevirtual 605	vn/hunghd/flutterdownloader/b:e	(Ljava/lang/String;Lad/a;I)V
    //   1872: aload_1
    //   1873: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   1876: astore_1
    //   1877: aload_1
    //   1878: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   1881: aload_1
    //   1882: aload 7
    //   1884: aload_3
    //   1885: aload_2
    //   1886: aload 4
    //   1888: getfield 454	ad/b:d	I
    //   1891: invokevirtual 608	d5/n:h	(Ljava/lang/String;Ljava/lang/String;Lad/a;I)V
    //   1894: aload_0
    //   1895: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   1898: invokestatic 527	p2/k0:d	(Landroid/content/Context;)Lp2/k0;
    //   1901: aload 6
    //   1903: invokevirtual 613	o2/p:a	(Lo2/q;)Lo2/m;
    //   1906: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   1909: goto +460 -> 2369
    //   1912: aload_3
    //   1913: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   1916: astore_1
    //   1917: aload_1
    //   1918: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   1921: aload_1
    //   1922: aload 7
    //   1924: iconst_0
    //   1925: invokevirtual 626	d5/n:j	(Ljava/lang/String;Z)V
    //   1928: ldc_w 710
    //   1931: astore_1
    //   1932: ldc_w 712
    //   1935: astore_3
    //   1936: goto +21 -> 1957
    //   1939: ldc_w 714
    //   1942: astore_3
    //   1943: ldc_w 578
    //   1946: astore_1
    //   1947: goto +10 -> 1957
    //   1950: ldc_w 615
    //   1953: astore_3
    //   1954: aload 6
    //   1956: astore_1
    //   1957: aload_2
    //   1958: aload_1
    //   1959: aload_3
    //   1960: aconst_null
    //   1961: invokeinterface 621 4 0
    //   1966: goto +403 -> 2369
    //   1969: aload 4
    //   1971: ldc_w 716
    //   1974: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1977: ifne +6 -> 1983
    //   1980: goto +831 -> 2811
    //   1983: aload_1
    //   1984: ldc_w 310
    //   1987: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   1990: checkcast 239	java/lang/String
    //   1993: astore 7
    //   1995: aload_1
    //   1996: ldc_w 718
    //   1999: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2002: checkcast 182	java/lang/Boolean
    //   2005: invokevirtual 563	java/lang/Boolean:booleanValue	()Z
    //   2008: istore 11
    //   2010: aload_3
    //   2011: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   2014: astore_1
    //   2015: aload_1
    //   2016: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   2019: aload_1
    //   2020: aload 7
    //   2022: invokevirtual 558	d5/n:e	(Ljava/lang/String;)Lad/b;
    //   2025: astore 4
    //   2027: aload 4
    //   2029: ifnull +277 -> 2306
    //   2032: aload 4
    //   2034: getfield 452	ad/b:c	Lad/a;
    //   2037: astore_1
    //   2038: aload_1
    //   2039: getstatic 603	ad/a:a	Lad/a;
    //   2042: if_acmpeq +10 -> 2052
    //   2045: aload_1
    //   2046: getstatic 708	ad/a:b	Lad/a;
    //   2049: if_acmpne +19 -> 2068
    //   2052: aload_0
    //   2053: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   2056: invokestatic 527	p2/k0:d	(Landroid/content/Context;)Lp2/k0;
    //   2059: aload 7
    //   2061: invokestatic 630	java/util/UUID:fromString	(Ljava/lang/String;)Ljava/util/UUID;
    //   2064: invokevirtual 633	p2/k0:c	(Ljava/util/UUID;)Lp2/o;
    //   2067: pop
    //   2068: iload 11
    //   2070: ifeq +127 -> 2197
    //   2073: aload 4
    //   2075: getfield 458	ad/b:f	Ljava/lang/String;
    //   2078: astore 6
    //   2080: aload 6
    //   2082: astore_1
    //   2083: aload 6
    //   2085: ifnonnull +40 -> 2125
    //   2088: aload 4
    //   2090: getfield 456	ad/b:e	Ljava/lang/String;
    //   2093: astore_1
    //   2094: aload_1
    //   2095: aload_1
    //   2096: ldc_w 650
    //   2099: bipush 6
    //   2101: invokestatic 656	lc/k:u0	(Ljava/lang/String;Ljava/lang/String;I)I
    //   2104: iconst_1
    //   2105: iadd
    //   2106: aload 4
    //   2108: getfield 456	ad/b:e	Ljava/lang/String;
    //   2111: invokevirtual 659	java/lang/String:length	()I
    //   2114: invokevirtual 663	java/lang/String:substring	(II)Ljava/lang/String;
    //   2117: astore_1
    //   2118: aload_1
    //   2119: ldc_w 665
    //   2122: invokestatic 255	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   2125: new 637	java/lang/StringBuilder
    //   2128: dup
    //   2129: invokespecial 638	java/lang/StringBuilder:<init>	()V
    //   2132: astore 6
    //   2134: aload 6
    //   2136: aload 4
    //   2138: getfield 460	ad/b:g	Ljava/lang/String;
    //   2141: invokevirtual 644	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2144: pop
    //   2145: new 243	java/io/File
    //   2148: dup
    //   2149: aload 6
    //   2151: getstatic 671	java/io/File:separator	Ljava/lang/String;
    //   2154: aload_1
    //   2155: invokestatic 674	g:f	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2158: invokespecial 703	java/io/File:<init>	(Ljava/lang/String;)V
    //   2161: astore 6
    //   2163: aload 6
    //   2165: invokevirtual 706	java/io/File:exists	()Z
    //   2168: ifeq +29 -> 2197
    //   2171: aload_3
    //   2172: aload 6
    //   2174: invokevirtual 720	vn/hunghd/flutterdownloader/b:b	(Ljava/io/File;)V
    //   2177: goto +14 -> 2191
    //   2180: astore_1
    //   2181: ldc_w 722
    //   2184: ldc_w 724
    //   2187: invokestatic 729	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   2190: pop
    //   2191: aload 6
    //   2193: invokevirtual 731	java/io/File:delete	()Z
    //   2196: pop
    //   2197: aload_3
    //   2198: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   2201: astore_1
    //   2202: aload_1
    //   2203: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   2206: aload_1
    //   2207: getfield 405	d5/n:b	Ljava/lang/Object;
    //   2210: checkcast 356	vn/hunghd/flutterdownloader/c
    //   2213: invokevirtual 734	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   2216: astore_1
    //   2217: aload_1
    //   2218: invokevirtual 737	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   2221: aload_1
    //   2222: ldc_w 413
    //   2225: ldc_w 739
    //   2228: iconst_1
    //   2229: anewarray 239	java/lang/String
    //   2232: dup
    //   2233: iconst_0
    //   2234: aload 7
    //   2236: aastore
    //   2237: invokevirtual 742	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   2240: pop
    //   2241: aload_1
    //   2242: invokevirtual 745	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   2245: goto +12 -> 2257
    //   2248: astore_2
    //   2249: goto +51 -> 2300
    //   2252: astore_3
    //   2253: aload_3
    //   2254: invokevirtual 750	java/lang/Throwable:printStackTrace	()V
    //   2257: aload_1
    //   2258: invokevirtual 753	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   2261: new 755	u/u
    //   2264: dup
    //   2265: aload_0
    //   2266: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   2269: invokespecial 758	u/u:<init>	(Landroid/content/Context;)V
    //   2272: astore_1
    //   2273: aload 4
    //   2275: getfield 760	ad/b:a	I
    //   2278: istore 5
    //   2280: aload_1
    //   2281: getfield 763	u/u:b	Landroid/app/NotificationManager;
    //   2284: aconst_null
    //   2285: iload 5
    //   2287: invokevirtual 769	android/app/NotificationManager:cancel	(Ljava/lang/String;I)V
    //   2290: aload_2
    //   2291: aconst_null
    //   2292: invokeinterface 472 2 0
    //   2297: goto +72 -> 2369
    //   2300: aload_1
    //   2301: invokevirtual 753	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   2304: aload_2
    //   2305: athrow
    //   2306: aload_2
    //   2307: ldc_w 617
    //   2310: ldc_w 615
    //   2313: aconst_null
    //   2314: invokeinterface 621 4 0
    //   2319: goto +50 -> 2369
    //   2322: aload 4
    //   2324: ldc_w 770
    //   2327: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2330: ifne +6 -> 2336
    //   2333: goto +478 -> 2811
    //   2336: aload_1
    //   2337: ldc_w 310
    //   2340: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2343: checkcast 239	java/lang/String
    //   2346: astore_1
    //   2347: aload_0
    //   2348: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   2351: invokestatic 527	p2/k0:d	(Landroid/content/Context;)Lp2/k0;
    //   2354: aload_1
    //   2355: invokestatic 630	java/util/UUID:fromString	(Ljava/lang/String;)Ljava/util/UUID;
    //   2358: invokevirtual 633	p2/k0:c	(Ljava/util/UUID;)Lp2/o;
    //   2361: pop
    //   2362: aload_2
    //   2363: aconst_null
    //   2364: invokeinterface 472 2 0
    //   2369: goto +448 -> 2817
    //   2372: aload 4
    //   2374: ldc_w 772
    //   2377: invokevirtual 400	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2380: ifne +6 -> 2386
    //   2383: goto +428 -> 2811
    //   2386: aload_1
    //   2387: ldc -88
    //   2389: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2392: checkcast 239	java/lang/String
    //   2395: astore 6
    //   2397: aload_1
    //   2398: ldc_w 395
    //   2401: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2404: checkcast 239	java/lang/String
    //   2407: astore_3
    //   2408: aload_1
    //   2409: ldc -80
    //   2411: invokevirtual 36	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   2414: checkcast 239	java/lang/String
    //   2417: astore 4
    //   2419: aload_1
    //   2420: ldc -78
    //   2422: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2425: checkcast 239	java/lang/String
    //   2428: astore 7
    //   2430: aload_1
    //   2431: ldc -36
    //   2433: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2436: checkcast 565	java/lang/Number
    //   2439: invokevirtual 568	java/lang/Number:intValue	()I
    //   2442: istore 12
    //   2444: aload_1
    //   2445: ldc -76
    //   2447: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2450: checkcast 182	java/lang/Boolean
    //   2453: invokevirtual 563	java/lang/Boolean:booleanValue	()Z
    //   2456: istore 13
    //   2458: aload_1
    //   2459: ldc -68
    //   2461: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2464: checkcast 182	java/lang/Boolean
    //   2467: invokevirtual 563	java/lang/Boolean:booleanValue	()Z
    //   2470: istore 5
    //   2472: aload_1
    //   2473: ldc_w 560
    //   2476: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2479: checkcast 182	java/lang/Boolean
    //   2482: invokevirtual 563	java/lang/Boolean:booleanValue	()Z
    //   2485: istore 11
    //   2487: aload_1
    //   2488: ldc -38
    //   2490: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2493: checkcast 182	java/lang/Boolean
    //   2496: invokevirtual 563	java/lang/Boolean:booleanValue	()Z
    //   2499: istore 14
    //   2501: aload_1
    //   2502: ldc_w 465
    //   2505: invokestatic 549	vn/hunghd/flutterdownloader/b:c	(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    //   2508: checkcast 182	java/lang/Boolean
    //   2511: invokevirtual 563	java/lang/Boolean:booleanValue	()Z
    //   2514: istore 15
    //   2516: aload_0
    //   2517: aload 6
    //   2519: aload_3
    //   2520: aload 4
    //   2522: aload 7
    //   2524: iload 13
    //   2526: iload 5
    //   2528: iconst_0
    //   2529: iload 11
    //   2531: iload 14
    //   2533: iload 12
    //   2535: iload 15
    //   2537: aload_1
    //   2538: ldc -34
    //   2540: invokevirtual 36	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   2543: checkcast 239	java/lang/String
    //   2546: invokevirtual 591	vn/hunghd/flutterdownloader/b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZLjava/lang/String;)Lo2/q;
    //   2549: astore_1
    //   2550: aload_0
    //   2551: invokevirtual 258	vn/hunghd/flutterdownloader/b:d	()Landroid/content/Context;
    //   2554: invokestatic 527	p2/k0:d	(Landroid/content/Context;)Lp2/k0;
    //   2557: aload_1
    //   2558: invokevirtual 613	o2/p:a	(Lo2/q;)Lo2/m;
    //   2561: pop
    //   2562: aload_1
    //   2563: getfield 596	o2/q:a	Ljava/util/UUID;
    //   2566: invokevirtual 599	java/util/UUID:toString	()Ljava/lang/String;
    //   2569: astore 10
    //   2571: aload 10
    //   2573: ldc_w 601
    //   2576: invokestatic 255	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   2579: aload_2
    //   2580: aload 10
    //   2582: invokeinterface 472 2 0
    //   2587: aload_0
    //   2588: aload 10
    //   2590: getstatic 603	ad/a:a	Lad/a;
    //   2593: iconst_0
    //   2594: invokevirtual 605	vn/hunghd/flutterdownloader/b:e	(Ljava/lang/String;Lad/a;I)V
    //   2597: aload_0
    //   2598: getfield 371	vn/hunghd/flutterdownloader/b:b	Ld5/n;
    //   2601: astore_1
    //   2602: aload_1
    //   2603: invokestatic 403	ec/i:b	(Ljava/lang/Object;)V
    //   2606: aload_1
    //   2607: getfield 405	d5/n:b	Ljava/lang/Object;
    //   2610: checkcast 356	vn/hunghd/flutterdownloader/c
    //   2613: invokevirtual 734	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   2616: astore_1
    //   2617: new 774	android/content/ContentValues
    //   2620: dup
    //   2621: invokespecial 775	android/content/ContentValues:<init>	()V
    //   2624: astore_2
    //   2625: aload_2
    //   2626: ldc_w 310
    //   2629: aload 10
    //   2631: invokevirtual 777	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   2634: aload_2
    //   2635: ldc -88
    //   2637: aload 6
    //   2639: invokevirtual 777	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   2642: aload_2
    //   2643: ldc_w 312
    //   2646: iconst_1
    //   2647: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2650: invokevirtual 780	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   2653: aload_2
    //   2654: ldc_w 320
    //   2657: iconst_0
    //   2658: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2661: invokevirtual 780	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   2664: aload_2
    //   2665: ldc -80
    //   2667: aload 4
    //   2669: invokevirtual 777	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   2672: aload_2
    //   2673: ldc_w 395
    //   2676: aload_3
    //   2677: invokevirtual 777	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   2680: aload_2
    //   2681: ldc -78
    //   2683: aload 7
    //   2685: invokevirtual 777	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   2688: aload_2
    //   2689: ldc_w 782
    //   2692: ldc_w 784
    //   2695: invokevirtual 777	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   2698: aload_2
    //   2699: ldc -76
    //   2701: iload 13
    //   2703: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2706: invokevirtual 780	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   2709: aload_2
    //   2710: ldc -68
    //   2712: iload 5
    //   2714: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2717: invokevirtual 780	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   2720: aload_2
    //   2721: ldc_w 786
    //   2724: iconst_0
    //   2725: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2728: invokevirtual 780	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   2731: aload_2
    //   2732: ldc_w 462
    //   2735: invokestatic 792	java/lang/System:currentTimeMillis	()J
    //   2738: invokestatic 199	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2741: invokevirtual 795	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   2744: aload_2
    //   2745: ldc -38
    //   2747: iload 14
    //   2749: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2752: invokevirtual 780	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   2755: aload_2
    //   2756: ldc_w 465
    //   2759: iload 15
    //   2761: invokestatic 208	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2764: invokevirtual 780	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   2767: aload_1
    //   2768: invokevirtual 737	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   2771: aload_1
    //   2772: ldc_w 413
    //   2775: aconst_null
    //   2776: aload_2
    //   2777: iconst_5
    //   2778: invokevirtual 799	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   2781: pop2
    //   2782: aload_1
    //   2783: invokevirtual 745	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   2786: goto +12 -> 2798
    //   2789: astore_2
    //   2790: goto +15 -> 2805
    //   2793: astore_2
    //   2794: aload_2
    //   2795: invokevirtual 750	java/lang/Throwable:printStackTrace	()V
    //   2798: aload_1
    //   2799: invokevirtual 753	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   2802: goto +15 -> 2817
    //   2805: aload_1
    //   2806: invokevirtual 753	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   2809: aload_2
    //   2810: athrow
    //   2811: aload_2
    //   2812: invokeinterface 802 1 0
    //   2817: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2818	0	this	b
    //   0	2818	1	paramMethodCall	MethodCall
    //   0	2818	2	paramResult	io.flutter.plugin.common.MethodChannel.Result
    //   1	2197	3	localObject1	Object
    //   2252	2	3	localException	Exception
    //   2407	270	3	str	String
    //   20	2648	4	localObject2	Object
    //   32	2254	5	i	int
    //   2470	243	5	j	int
    //   37	2601	6	localObject3	Object
    //   42	2642	7	localObject4	Object
    //   477	79	8	l	long
    //   744	1886	10	localObject5	Object
    //   985	1545	11	bool	boolean
    //   2442	92	12	k	int
    //   2456	246	13	m	int
    //   2499	249	14	n	int
    //   2514	246	15	i1	int
    // Exception table:
    //   from	to	target	type
    //   2171	2177	2180	java/lang/SecurityException
    //   2221	2245	2248	finally
    //   2253	2257	2248	finally
    //   2221	2245	2252	java/lang/Exception
    //   2771	2786	2789	finally
    //   2794	2798	2789	finally
    //   2771	2786	2793	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     vn.hunghd.flutterdownloader.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
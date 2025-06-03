package bb;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import b.z;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import ec.i;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.k;
import rb.g;

public final class d
{
  public final Context a;
  public Activity b;
  public final f c;
  public final g d;
  public final g e;
  
  public d(Context paramContext, f paramf)
  {
    a = paramContext;
    b = null;
    c = paramf;
    d = z.n(new b(this));
    e = z.n(new c(0));
  }
  
  public static String b(String paramString)
  {
    if ((paramString != null) && (k.o0(paramString, "/")))
    {
      paramString = paramString.substring(0, k.s0(paramString, "/", 0, false, 6));
      i.d(paramString, "this as java.lang.String…ing(startIndex, endIndex)");
    }
    else
    {
      paramString = "*";
    }
    return paramString;
  }
  
  public final Context a()
  {
    Object localObject = b;
    if (localObject != null) {
      i.b(localObject);
    } else {
      localObject = a;
    }
    return (Context)localObject;
  }
  
  public final File c()
  {
    return new File(a().getCacheDir(), "share_plus");
  }
  
  public final void d(String paramString1, String paramString2)
  {
    i.e(paramString1, "text");
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.SEND");
    localIntent.setType("text/plain");
    localIntent.putExtra("android.intent.extra.TEXT", paramString1);
    if (paramString2 != null) {
      localIntent.putExtra("android.intent.extra.SUBJECT", paramString2);
    }
    paramString1 = Intent.createChooser(localIntent, null, PendingIntent.getBroadcast(a, 0, new Intent(a, SharePlusPendingIntent.class), 0x8000000 | ((Number)e.getValue()).intValue()).getIntentSender());
    i.b(paramString1);
    f(paramString1);
  }
  
  /* Error */
  public final void e(java.util.List paramList1, java.util.List paramList2, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 160	bb/d:c	()Ljava/io/File;
    //   4: astore 5
    //   6: aload 5
    //   8: invokevirtual 164	java/io/File:listFiles	()[Ljava/io/File;
    //   11: astore 6
    //   13: aload 5
    //   15: invokevirtual 168	java/io/File:exists	()Z
    //   18: ifeq +81 -> 99
    //   21: aload 6
    //   23: ifnull +32 -> 55
    //   26: aload 6
    //   28: arraylength
    //   29: ifne +9 -> 38
    //   32: iconst_1
    //   33: istore 7
    //   35: goto +6 -> 41
    //   38: iconst_0
    //   39: istore 7
    //   41: iload 7
    //   43: ifeq +6 -> 49
    //   46: goto +9 -> 55
    //   49: iconst_0
    //   50: istore 7
    //   52: goto +6 -> 58
    //   55: iconst_1
    //   56: istore 7
    //   58: iload 7
    //   60: ifne +39 -> 99
    //   63: aload 6
    //   65: arraylength
    //   66: istore 8
    //   68: iconst_0
    //   69: istore 7
    //   71: iload 7
    //   73: iload 8
    //   75: if_icmpge +18 -> 93
    //   78: aload 6
    //   80: iload 7
    //   82: aaload
    //   83: invokevirtual 171	java/io/File:delete	()Z
    //   86: pop
    //   87: iinc 7 1
    //   90: goto -19 -> 71
    //   93: aload 5
    //   95: invokevirtual 171	java/io/File:delete	()Z
    //   98: pop
    //   99: new 173	java/util/ArrayList
    //   102: dup
    //   103: aload_1
    //   104: invokeinterface 178 1 0
    //   109: invokespecial 179	java/util/ArrayList:<init>	(I)V
    //   112: astore 9
    //   114: aload_1
    //   115: invokeinterface 185 1 0
    //   120: astore_1
    //   121: aload_1
    //   122: invokeinterface 190 1 0
    //   127: ifeq +331 -> 458
    //   130: new 80	java/io/File
    //   133: dup
    //   134: aload_1
    //   135: invokeinterface 193 1 0
    //   140: checkcast 60	java/lang/String
    //   143: invokespecial 196	java/io/File:<init>	(Ljava/lang/String;)V
    //   146: astore 6
    //   148: aload 6
    //   150: invokevirtual 200	java/io/File:getCanonicalPath	()Ljava/lang/String;
    //   153: astore 10
    //   155: aload 10
    //   157: invokestatic 77	ec/i:b	(Ljava/lang/Object;)V
    //   160: aload_0
    //   161: invokevirtual 160	bb/d:c	()Ljava/io/File;
    //   164: invokevirtual 200	java/io/File:getCanonicalPath	()Ljava/lang/String;
    //   167: astore 5
    //   169: aload 5
    //   171: ldc -54
    //   173: invokestatic 71	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   176: aload 10
    //   178: aload 5
    //   180: invokestatic 208	lc/h:n0	(Ljava/lang/String;Ljava/lang/String;)Z
    //   183: istore 11
    //   185: goto +8 -> 193
    //   188: astore 5
    //   190: iconst_0
    //   191: istore 11
    //   193: iload 11
    //   195: ifne +239 -> 434
    //   198: aload_0
    //   199: invokevirtual 160	bb/d:c	()Ljava/io/File;
    //   202: astore 5
    //   204: aload 5
    //   206: invokevirtual 168	java/io/File:exists	()Z
    //   209: ifne +9 -> 218
    //   212: aload 5
    //   214: invokevirtual 211	java/io/File:mkdirs	()Z
    //   217: pop
    //   218: new 80	java/io/File
    //   221: dup
    //   222: aload 5
    //   224: aload 6
    //   226: invokevirtual 214	java/io/File:getName	()Ljava/lang/String;
    //   229: invokespecial 92	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   232: astore 5
    //   234: aload 6
    //   236: invokevirtual 168	java/io/File:exists	()Z
    //   239: ifeq +185 -> 424
    //   242: aload 5
    //   244: invokevirtual 168	java/io/File:exists	()Z
    //   247: ifeq +28 -> 275
    //   250: aload 5
    //   252: invokevirtual 171	java/io/File:delete	()Z
    //   255: ifeq +6 -> 261
    //   258: goto +17 -> 275
    //   261: new 216	bc/b
    //   264: dup
    //   265: aload 6
    //   267: aload 5
    //   269: ldc -38
    //   271: invokespecial 221	bc/b:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    //   274: athrow
    //   275: aload 6
    //   277: invokevirtual 224	java/io/File:isDirectory	()Z
    //   280: ifeq +28 -> 308
    //   283: aload 5
    //   285: invokevirtual 211	java/io/File:mkdirs	()Z
    //   288: ifeq +6 -> 294
    //   291: goto +81 -> 372
    //   294: new 226	bc/c
    //   297: dup
    //   298: aload 6
    //   300: aload 5
    //   302: ldc -28
    //   304: invokespecial 229	bc/c:<init>	(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    //   307: athrow
    //   308: aload 5
    //   310: invokevirtual 232	java/io/File:getParentFile	()Ljava/io/File;
    //   313: astore 10
    //   315: aload 10
    //   317: ifnull +9 -> 326
    //   320: aload 10
    //   322: invokevirtual 211	java/io/File:mkdirs	()Z
    //   325: pop
    //   326: new 234	java/io/FileInputStream
    //   329: dup
    //   330: aload 6
    //   332: invokespecial 237	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   335: astore 6
    //   337: new 239	java/io/FileOutputStream
    //   340: astore 10
    //   342: aload 10
    //   344: aload 5
    //   346: invokespecial 240	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   349: aload 6
    //   351: aload 10
    //   353: sipush 8192
    //   356: invokestatic 246	x6/b:N	(Ljava/io/InputStream;Ljava/io/OutputStream;I)J
    //   359: pop2
    //   360: aload 10
    //   362: aconst_null
    //   363: invokestatic 250	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   366: aload 6
    //   368: aconst_null
    //   369: invokestatic 250	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   372: aload 9
    //   374: aload_0
    //   375: invokevirtual 82	bb/d:a	()Landroid/content/Context;
    //   378: aload_0
    //   379: getfield 37	bb/d:d	Lrb/g;
    //   382: invokevirtual 131	rb/g:getValue	()Ljava/lang/Object;
    //   385: checkcast 60	java/lang/String
    //   388: aload 5
    //   390: invokestatic 256	v/b:getUriForFile	(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;
    //   393: invokevirtual 260	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   396: pop
    //   397: goto -276 -> 121
    //   400: astore_1
    //   401: aload_1
    //   402: athrow
    //   403: astore_2
    //   404: aload 10
    //   406: aload_1
    //   407: invokestatic 250	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   410: aload_2
    //   411: athrow
    //   412: astore_1
    //   413: aload_1
    //   414: athrow
    //   415: astore_2
    //   416: aload 6
    //   418: aload_1
    //   419: invokestatic 250	x6/b:L	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   422: aload_2
    //   423: athrow
    //   424: new 216	bc/b
    //   427: dup
    //   428: aload 6
    //   430: invokespecial 261	bc/b:<init>	(Ljava/io/File;)V
    //   433: athrow
    //   434: new 158	java/io/IOException
    //   437: dup
    //   438: ldc_w 263
    //   441: aload_0
    //   442: invokevirtual 160	bb/d:c	()Ljava/io/File;
    //   445: invokevirtual 200	java/io/File:getCanonicalPath	()Ljava/lang/String;
    //   448: ldc_w 265
    //   451: invokestatic 270	g:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   454: invokespecial 271	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   457: athrow
    //   458: new 99	android/content/Intent
    //   461: dup
    //   462: invokespecial 100	android/content/Intent:<init>	()V
    //   465: astore 12
    //   467: aload 9
    //   469: invokevirtual 274	java/util/ArrayList:isEmpty	()Z
    //   472: ifeq +39 -> 511
    //   475: aload_3
    //   476: ifnull +19 -> 495
    //   479: aload_3
    //   480: invokestatic 278	lc/k:t0	(Ljava/lang/CharSequence;)Z
    //   483: ifeq +6 -> 489
    //   486: goto +9 -> 495
    //   489: iconst_0
    //   490: istore 7
    //   492: goto +6 -> 498
    //   495: iconst_1
    //   496: istore 7
    //   498: iload 7
    //   500: ifne +11 -> 511
    //   503: aload_0
    //   504: aload_3
    //   505: aload 4
    //   507: invokevirtual 280	bb/d:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   510: return
    //   511: aload 9
    //   513: invokevirtual 281	java/util/ArrayList:size	()I
    //   516: istore 7
    //   518: ldc_w 283
    //   521: astore 5
    //   523: iload 7
    //   525: iconst_1
    //   526: if_icmpne +78 -> 604
    //   529: aload_2
    //   530: ifnull +21 -> 551
    //   533: aload_2
    //   534: invokeinterface 286 1 0
    //   539: ifeq +6 -> 545
    //   542: goto +9 -> 551
    //   545: iconst_0
    //   546: istore 7
    //   548: goto +6 -> 554
    //   551: iconst_1
    //   552: istore 7
    //   554: iload 7
    //   556: ifne +12 -> 568
    //   559: aload_2
    //   560: invokestatic 291	sb/q:n	(Ljava/util/List;)Ljava/lang/Object;
    //   563: checkcast 60	java/lang/String
    //   566: astore 5
    //   568: aload 12
    //   570: ldc 102
    //   572: invokevirtual 106	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   575: pop
    //   576: aload 12
    //   578: aload 5
    //   580: invokevirtual 111	android/content/Intent:setType	(Ljava/lang/String;)Landroid/content/Intent;
    //   583: pop
    //   584: aload 12
    //   586: ldc_w 293
    //   589: aload 9
    //   591: invokestatic 291	sb/q:n	(Ljava/util/List;)Ljava/lang/Object;
    //   594: checkcast 295	android/os/Parcelable
    //   597: invokevirtual 298	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   600: pop
    //   601: goto +201 -> 802
    //   604: aload 12
    //   606: ldc_w 300
    //   609: invokevirtual 106	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   612: pop
    //   613: aload_2
    //   614: ifnull +18 -> 632
    //   617: aload_2
    //   618: invokeinterface 301 1 0
    //   623: ifne +9 -> 632
    //   626: iconst_1
    //   627: istore 7
    //   629: goto +6 -> 635
    //   632: iconst_0
    //   633: istore 7
    //   635: iload 7
    //   637: ifne +9 -> 646
    //   640: aload 5
    //   642: astore_1
    //   643: goto +141 -> 784
    //   646: aload_2
    //   647: invokeinterface 178 1 0
    //   652: iconst_1
    //   653: if_icmpne +14 -> 667
    //   656: aload_2
    //   657: invokestatic 291	sb/q:n	(Ljava/util/List;)Ljava/lang/Object;
    //   660: checkcast 60	java/lang/String
    //   663: astore_1
    //   664: goto +120 -> 784
    //   667: aload_2
    //   668: invokestatic 291	sb/q:n	(Ljava/util/List;)Ljava/lang/Object;
    //   671: checkcast 60	java/lang/String
    //   674: astore 10
    //   676: aload_2
    //   677: invokestatic 306	va/a:d	(Ljava/util/List;)I
    //   680: istore 8
    //   682: aload 10
    //   684: astore_1
    //   685: iconst_1
    //   686: iload 8
    //   688: if_icmpgt +96 -> 784
    //   691: iconst_1
    //   692: istore 7
    //   694: aload 10
    //   696: astore 6
    //   698: aload 10
    //   700: aload_2
    //   701: iload 7
    //   703: invokeinterface 310 2 0
    //   708: invokestatic 313	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   711: ifne +53 -> 764
    //   714: aload 5
    //   716: astore_1
    //   717: aload 10
    //   719: invokestatic 315	bb/d:b	(Ljava/lang/String;)Ljava/lang/String;
    //   722: aload_2
    //   723: iload 7
    //   725: invokeinterface 310 2 0
    //   730: checkcast 60	java/lang/String
    //   733: invokestatic 315	bb/d:b	(Ljava/lang/String;)Ljava/lang/String;
    //   736: invokestatic 313	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   739: ifeq +45 -> 784
    //   742: aload_2
    //   743: iload 7
    //   745: invokeinterface 310 2 0
    //   750: checkcast 60	java/lang/String
    //   753: invokestatic 315	bb/d:b	(Ljava/lang/String;)Ljava/lang/String;
    //   756: ldc_w 317
    //   759: invokestatic 320	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   762: astore 6
    //   764: aload 6
    //   766: astore_1
    //   767: iload 7
    //   769: iload 8
    //   771: if_icmpeq +13 -> 784
    //   774: iinc 7 1
    //   777: aload 6
    //   779: astore 10
    //   781: goto -87 -> 694
    //   784: aload 12
    //   786: aload_1
    //   787: invokevirtual 111	android/content/Intent:setType	(Ljava/lang/String;)Landroid/content/Intent;
    //   790: pop
    //   791: aload 12
    //   793: ldc_w 293
    //   796: aload 9
    //   798: invokevirtual 324	android/content/Intent:putParcelableArrayListExtra	(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
    //   801: pop
    //   802: aload_3
    //   803: ifnull +12 -> 815
    //   806: aload 12
    //   808: ldc 113
    //   810: aload_3
    //   811: invokevirtual 117	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   814: pop
    //   815: aload 4
    //   817: ifnull +13 -> 830
    //   820: aload 12
    //   822: ldc 119
    //   824: aload 4
    //   826: invokevirtual 117	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   829: pop
    //   830: aload 12
    //   832: iconst_1
    //   833: invokevirtual 328	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   836: pop
    //   837: aload 12
    //   839: aconst_null
    //   840: aload_0
    //   841: getfield 20	bb/d:a	Landroid/content/Context;
    //   844: iconst_0
    //   845: new 99	android/content/Intent
    //   848: dup
    //   849: aload_0
    //   850: getfield 20	bb/d:a	Landroid/content/Context;
    //   853: ldc 121
    //   855: invokespecial 124	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   858: ldc 125
    //   860: aload_0
    //   861: getfield 44	bb/d:e	Lrb/g;
    //   864: invokevirtual 131	rb/g:getValue	()Ljava/lang/Object;
    //   867: checkcast 133	java/lang/Number
    //   870: invokevirtual 137	java/lang/Number:intValue	()I
    //   873: ior
    //   874: invokestatic 143	android/app/PendingIntent:getBroadcast	(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   877: invokevirtual 147	android/app/PendingIntent:getIntentSender	()Landroid/content/IntentSender;
    //   880: invokestatic 151	android/content/Intent:createChooser	(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;
    //   883: astore_1
    //   884: aload_0
    //   885: invokevirtual 82	bb/d:a	()Landroid/content/Context;
    //   888: invokevirtual 332	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   891: aload_1
    //   892: ldc_w 333
    //   895: invokevirtual 339	android/content/pm/PackageManager:queryIntentActivities	(Landroid/content/Intent;I)Ljava/util/List;
    //   898: astore_2
    //   899: aload_2
    //   900: ldc_w 341
    //   903: invokestatic 71	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   906: aload_2
    //   907: invokeinterface 185 1 0
    //   912: astore_2
    //   913: aload_2
    //   914: invokeinterface 190 1 0
    //   919: ifeq +62 -> 981
    //   922: aload_2
    //   923: invokeinterface 193 1 0
    //   928: checkcast 343	android/content/pm/ResolveInfo
    //   931: getfield 347	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   934: getfield 353	android/content/pm/ActivityInfo:packageName	Ljava/lang/String;
    //   937: astore_3
    //   938: aload 9
    //   940: invokevirtual 354	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   943: astore 4
    //   945: aload 4
    //   947: invokeinterface 190 1 0
    //   952: ifeq -39 -> 913
    //   955: aload 4
    //   957: invokeinterface 193 1 0
    //   962: checkcast 356	android/net/Uri
    //   965: astore 6
    //   967: aload_0
    //   968: invokevirtual 82	bb/d:a	()Landroid/content/Context;
    //   971: aload_3
    //   972: aload 6
    //   974: iconst_3
    //   975: invokevirtual 360	android/content/Context:grantUriPermission	(Ljava/lang/String;Landroid/net/Uri;I)V
    //   978: goto -33 -> 945
    //   981: aload_1
    //   982: invokestatic 77	ec/i:b	(Ljava/lang/Object;)V
    //   985: aload_0
    //   986: aload_1
    //   987: invokevirtual 155	bb/d:f	(Landroid/content/Intent;)V
    //   990: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	991	0	this	d
    //   0	991	1	paramList1	java.util.List
    //   0	991	2	paramList2	java.util.List
    //   0	991	3	paramString1	String
    //   0	991	4	paramString2	String
    //   4	175	5	localObject1	Object
    //   188	1	5	localIOException	java.io.IOException
    //   202	513	5	localObject2	Object
    //   11	962	6	localObject3	Object
    //   33	742	7	i	int
    //   66	706	8	j	int
    //   112	827	9	localArrayList	java.util.ArrayList
    //   153	627	10	localObject4	Object
    //   183	11	11	bool	boolean
    //   465	373	12	localIntent	Intent
    // Exception table:
    //   from	to	target	type
    //   148	185	188	java/io/IOException
    //   349	360	400	finally
    //   401	403	403	finally
    //   337	349	412	finally
    //   360	366	412	finally
    //   404	412	412	finally
    //   413	415	415	finally
  }
  
  public final void f(Intent paramIntent)
  {
    Object localObject = b;
    if (localObject != null)
    {
      ((Activity)localObject).startActivityForResult(paramIntent, 22643);
    }
    else
    {
      paramIntent.addFlags(268435456);
      f localf = c;
      if (b.compareAndSet(false, true))
      {
        localObject = a;
        if (localObject != null)
        {
          ((MethodChannel.Result)localObject).success("dev.fluttercommunity.plus/share/unavailable");
          a = null;
        }
      }
      a.startActivity(paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     bb.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
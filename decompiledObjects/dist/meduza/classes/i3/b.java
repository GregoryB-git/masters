package i3;

import a9.d;
import a9.e;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import g;
import j3.w.a;
import j3.w.b;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import k3.h;
import k3.h.a;
import k3.n.a;
import l3.m;

public final class b
  implements m
{
  public final d a;
  public final ConnectivityManager b;
  public final Context c;
  public final URL d;
  public final t3.a e;
  public final t3.a f;
  public final int g;
  
  public b(Context paramContext, t3.a parama1, t3.a parama2)
  {
    e locale = new e();
    j3.b.a.a(locale);
    d = true;
    a = new d(locale);
    c = paramContext;
    b = ((ConnectivityManager)paramContext.getSystemService("connectivity"));
    d = c(a.c);
    e = parama2;
    f = parama1;
    g = 130000;
  }
  
  public static URL c(String paramString)
  {
    try
    {
      URL localURL = new URL(paramString);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new IllegalArgumentException(g.d("Invalid url: ", paramString), localMalformedURLException);
    }
  }
  
  public final h a(k3.n paramn)
  {
    NetworkInfo localNetworkInfo = b.getActiveNetworkInfo();
    h.a locala = paramn.m();
    int i = Build.VERSION.SDK_INT;
    paramn = f;
    if (paramn != null)
    {
      paramn.put("sdk-version", String.valueOf(i));
      locala.a("model", Build.MODEL);
      locala.a("hardware", Build.HARDWARE);
      locala.a("device", Build.DEVICE);
      locala.a("product", Build.PRODUCT);
      locala.a("os-uild", Build.ID);
      locala.a("manufacturer", Build.MANUFACTURER);
      locala.a("fingerprint", Build.FINGERPRINT);
      Calendar.getInstance();
      long l = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
      paramn = f;
      if (paramn != null)
      {
        paramn.put("tz-offset", String.valueOf(l));
        int j = -1;
        if (localNetworkInfo == null)
        {
          paramn = w.b.a;
          i = -1;
        }
        else
        {
          i = localNetworkInfo.getType();
        }
        paramn = f;
        if (paramn != null)
        {
          paramn.put("net-type", String.valueOf(i));
          if (localNetworkInfo == null)
          {
            paramn = w.a.a;
          }
          else
          {
            i = localNetworkInfo.getSubtype();
            if (i == -1)
            {
              paramn = w.a.a;
              i = 100;
            }
            else if ((w.a)w.a.a.get(i) != null) {}
          }
          i = 0;
          paramn = f;
          if (paramn != null)
          {
            paramn.put("mobile-subtype", String.valueOf(i));
            locala.a("country", Locale.getDefault().getCountry());
            locala.a("locale", Locale.getDefault().getLanguage());
            paramn = ((TelephonyManager)c.getSystemService("phone")).getSimOperator();
            if (paramn == null) {
              paramn = "";
            }
            locala.a("mcc_mnc", paramn);
            paramn = c;
            try
            {
              i = getPackageManagergetPackageInfogetPackageName0versionCode;
            }
            catch (PackageManager.NameNotFoundException paramn)
            {
              o3.a.b("CctTransportBackend", "Unable to find version code for package", paramn);
              i = j;
            }
            locala.a("application_build", Integer.toString(i));
            return locala.b();
          }
          throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
      }
      throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
  }
  
  /* Error */
  public final l3.b b(l3.a parama)
  {
    // Byte code:
    //   0: new 312	java/util/HashMap
    //   3: dup
    //   4: invokespecial 313	java/util/HashMap:<init>	()V
    //   7: astore_2
    //   8: aload_1
    //   9: getfield 318	l3/a:a	Ljava/lang/Iterable;
    //   12: invokeinterface 324 1 0
    //   17: astore_3
    //   18: aload_3
    //   19: invokeinterface 330 1 0
    //   24: ifeq +79 -> 103
    //   27: aload_3
    //   28: invokeinterface 334 1 0
    //   33: checkcast 108	k3/n
    //   36: astore 4
    //   38: aload 4
    //   40: invokevirtual 337	k3/n:k	()Ljava/lang/String;
    //   43: astore 5
    //   45: aload_2
    //   46: aload 5
    //   48: invokevirtual 341	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   51: ifne +32 -> 83
    //   54: new 343	java/util/ArrayList
    //   57: dup
    //   58: invokespecial 344	java/util/ArrayList:<init>	()V
    //   61: astore 6
    //   63: aload 6
    //   65: aload 4
    //   67: invokevirtual 347	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   70: pop
    //   71: aload_2
    //   72: aload 5
    //   74: aload 6
    //   76: invokevirtual 348	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   79: pop
    //   80: goto -62 -> 18
    //   83: aload_2
    //   84: aload 5
    //   86: invokevirtual 351	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   89: checkcast 353	java/util/List
    //   92: aload 4
    //   94: invokeinterface 354 2 0
    //   99: pop
    //   100: goto -82 -> 18
    //   103: new 343	java/util/ArrayList
    //   106: dup
    //   107: invokespecial 344	java/util/ArrayList:<init>	()V
    //   110: astore 7
    //   112: aload_2
    //   113: invokevirtual 358	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   116: invokeinterface 361 1 0
    //   121: astore_2
    //   122: aload_2
    //   123: invokeinterface 330 1 0
    //   128: ifeq +975 -> 1103
    //   131: aload_2
    //   132: invokeinterface 334 1 0
    //   137: checkcast 363	java/util/Map$Entry
    //   140: astore 5
    //   142: aload 5
    //   144: invokeinterface 366 1 0
    //   149: checkcast 353	java/util/List
    //   152: iconst_0
    //   153: invokeinterface 367 2 0
    //   158: checkcast 108	k3/n
    //   161: astore 8
    //   163: getstatic 372	j3/x:a	Lj3/x;
    //   166: astore 9
    //   168: aload_0
    //   169: getfield 77	i3/b:f	Lt3/a;
    //   172: invokeinterface 376 1 0
    //   177: invokestatic 381	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   180: astore 10
    //   182: aload_0
    //   183: getfield 75	i3/b:e	Lt3/a;
    //   186: invokeinterface 376 1 0
    //   191: invokestatic 381	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   194: astore 11
    //   196: getstatic 386	j3/o$a:a	Lj3/o$a;
    //   199: astore 12
    //   201: aload 8
    //   203: ldc 124
    //   205: invokevirtual 390	k3/n:h	(Ljava/lang/String;)I
    //   208: istore 13
    //   210: aload 8
    //   212: ldc -118
    //   214: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   217: astore 14
    //   219: aload 8
    //   221: ldc -106
    //   223: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   226: astore 6
    //   228: aload 8
    //   230: ldc -101
    //   232: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   235: astore 15
    //   237: aload 8
    //   239: ldc -96
    //   241: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   244: astore 4
    //   246: aload 8
    //   248: ldc -91
    //   250: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   253: astore 16
    //   255: aload 8
    //   257: ldc -86
    //   259: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   262: astore 17
    //   264: aload 8
    //   266: ldc -81
    //   268: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   271: astore 18
    //   273: aload 8
    //   275: ldc -24
    //   277: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   280: astore_3
    //   281: new 395	j3/e
    //   284: dup
    //   285: aload 12
    //   287: new 397	j3/c
    //   290: dup
    //   291: iload 13
    //   293: invokestatic 400	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   296: aload 14
    //   298: aload 6
    //   300: aload 15
    //   302: aload 4
    //   304: aload 16
    //   306: aload 17
    //   308: aload 18
    //   310: aload 8
    //   312: ldc -13
    //   314: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   317: aload_3
    //   318: aload 8
    //   320: ldc_w 257
    //   323: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   326: aload 8
    //   328: ldc_w 286
    //   331: invokevirtual 393	k3/n:a	(Ljava/lang/String;)Ljava/lang/String;
    //   334: invokespecial 403	j3/c:<init>	(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   337: invokespecial 406	j3/e:<init>	(Lj3/o$a;Lj3/a;)V
    //   340: astore 12
    //   342: aload 5
    //   344: invokeinterface 409 1 0
    //   349: checkcast 126	java/lang/String
    //   352: invokestatic 412	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   355: istore 13
    //   357: iload 13
    //   359: invokestatic 400	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   362: astore 4
    //   364: aconst_null
    //   365: astore_3
    //   366: goto +19 -> 385
    //   369: astore 6
    //   371: aload 5
    //   373: invokeinterface 409 1 0
    //   378: checkcast 126	java/lang/String
    //   381: astore_3
    //   382: aconst_null
    //   383: astore 4
    //   385: new 343	java/util/ArrayList
    //   388: dup
    //   389: invokespecial 344	java/util/ArrayList:<init>	()V
    //   392: astore 17
    //   394: aload 5
    //   396: invokeinterface 366 1 0
    //   401: checkcast 353	java/util/List
    //   404: invokeinterface 413 1 0
    //   409: astore 15
    //   411: aload 15
    //   413: invokeinterface 330 1 0
    //   418: ifeq +590 -> 1008
    //   421: aload 15
    //   423: invokeinterface 334 1 0
    //   428: checkcast 108	k3/n
    //   431: astore 6
    //   433: aload 6
    //   435: invokevirtual 416	k3/n:d	()Lk3/m;
    //   438: astore 18
    //   440: aload 18
    //   442: getfield 421	k3/m:a	Lh3/c;
    //   445: astore 5
    //   447: aload 5
    //   449: new 423	h3/c
    //   452: dup
    //   453: ldc_w 425
    //   456: invokespecial 426	h3/c:<init>	(Ljava/lang/String;)V
    //   459: invokevirtual 429	h3/c:equals	(Ljava/lang/Object;)Z
    //   462: ifeq +29 -> 491
    //   465: aload 18
    //   467: getfield 432	k3/m:b	[B
    //   470: astore 5
    //   472: new 434	j3/j$a
    //   475: dup
    //   476: invokespecial 435	j3/j$a:<init>	()V
    //   479: astore 18
    //   481: aload 18
    //   483: aload 5
    //   485: putfield 437	j3/j$a:e	[B
    //   488: goto +57 -> 545
    //   491: aload 5
    //   493: new 423	h3/c
    //   496: dup
    //   497: ldc_w 439
    //   500: invokespecial 426	h3/c:<init>	(Ljava/lang/String;)V
    //   503: invokevirtual 429	h3/c:equals	(Ljava/lang/Object;)Z
    //   506: ifeq +461 -> 967
    //   509: new 126	java/lang/String
    //   512: dup
    //   513: aload 18
    //   515: getfield 432	k3/m:b	[B
    //   518: ldc_w 441
    //   521: invokestatic 447	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   524: invokespecial 450	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   527: astore 5
    //   529: new 434	j3/j$a
    //   532: dup
    //   533: invokespecial 435	j3/j$a:<init>	()V
    //   536: astore 18
    //   538: aload 18
    //   540: aload 5
    //   542: putfield 452	j3/j$a:f	Ljava/lang/String;
    //   545: aload 18
    //   547: aload 6
    //   549: invokevirtual 454	k3/n:e	()J
    //   552: invokestatic 381	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   555: putfield 457	j3/j$a:a	Ljava/lang/Long;
    //   558: aload 18
    //   560: aload 6
    //   562: invokevirtual 460	k3/n:l	()J
    //   565: invokestatic 381	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   568: putfield 462	j3/j$a:d	Ljava/lang/Long;
    //   571: aload 6
    //   573: invokevirtual 465	k3/n:b	()Ljava/util/Map;
    //   576: ldc -56
    //   578: invokeinterface 466 2 0
    //   583: checkcast 126	java/lang/String
    //   586: astore 5
    //   588: aload 5
    //   590: ifnonnull +9 -> 599
    //   593: lconst_0
    //   594: lstore 19
    //   596: goto +13 -> 609
    //   599: aload 5
    //   601: invokestatic 469	java/lang/Long:valueOf	(Ljava/lang/String;)Ljava/lang/Long;
    //   604: invokevirtual 472	java/lang/Long:longValue	()J
    //   607: lstore 19
    //   609: aload 18
    //   611: lload 19
    //   613: invokestatic 381	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   616: putfield 474	j3/j$a:g	Ljava/lang/Long;
    //   619: aload 6
    //   621: ldc -40
    //   623: invokevirtual 390	k3/n:h	(Ljava/lang/String;)I
    //   626: istore 13
    //   628: getstatic 208	j3/w$b:a	Landroid/util/SparseArray;
    //   631: iload 13
    //   633: invokevirtual 228	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   636: checkcast 205	j3/w$b
    //   639: astore 5
    //   641: aload 6
    //   643: ldc -26
    //   645: invokevirtual 390	k3/n:h	(Ljava/lang/String;)I
    //   648: istore 13
    //   650: aload 18
    //   652: new 476	j3/m
    //   655: dup
    //   656: aload 5
    //   658: getstatic 219	j3/w$a:a	Landroid/util/SparseArray;
    //   661: iload 13
    //   663: invokevirtual 228	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   666: checkcast 218	j3/w$a
    //   669: invokespecial 479	j3/m:<init>	(Lj3/w$b;Lj3/w$a;)V
    //   672: putfield 482	j3/j$a:h	Lj3/w;
    //   675: aload 6
    //   677: invokevirtual 485	k3/n:c	()Ljava/lang/Integer;
    //   680: ifnull +13 -> 693
    //   683: aload 18
    //   685: aload 6
    //   687: invokevirtual 485	k3/n:c	()Ljava/lang/Integer;
    //   690: putfield 488	j3/j$a:b	Ljava/lang/Integer;
    //   693: aload 6
    //   695: invokevirtual 491	k3/n:i	()Ljava/lang/Integer;
    //   698: ifnull +37 -> 735
    //   701: aload 18
    //   703: new 493	j3/f
    //   706: dup
    //   707: new 495	j3/i
    //   710: dup
    //   711: new 497	j3/h
    //   714: dup
    //   715: aload 6
    //   717: invokevirtual 491	k3/n:i	()Ljava/lang/Integer;
    //   720: invokespecial 500	j3/h:<init>	(Ljava/lang/Integer;)V
    //   723: invokespecial 503	j3/i:<init>	(Lj3/r;)V
    //   726: getstatic 508	j3/p$a:a	Lj3/p$a;
    //   729: invokespecial 511	j3/f:<init>	(Lj3/s;Lj3/p$a;)V
    //   732: putfield 514	j3/j$a:c	Lj3/p;
    //   735: aload 6
    //   737: invokevirtual 517	k3/n:f	()[B
    //   740: ifnonnull +11 -> 751
    //   743: aload 6
    //   745: invokevirtual 519	k3/n:g	()[B
    //   748: ifnull +61 -> 809
    //   751: aload 6
    //   753: invokevirtual 517	k3/n:f	()[B
    //   756: ifnull +13 -> 769
    //   759: aload 6
    //   761: invokevirtual 517	k3/n:f	()[B
    //   764: astore 5
    //   766: goto +6 -> 772
    //   769: aconst_null
    //   770: astore 5
    //   772: aload 6
    //   774: invokevirtual 519	k3/n:g	()[B
    //   777: ifnull +13 -> 790
    //   780: aload 6
    //   782: invokevirtual 519	k3/n:g	()[B
    //   785: astore 6
    //   787: goto +6 -> 793
    //   790: aconst_null
    //   791: astore 6
    //   793: aload 18
    //   795: new 521	j3/g
    //   798: dup
    //   799: aload 5
    //   801: aload 6
    //   803: invokespecial 524	j3/g:<init>	([B[B)V
    //   806: putfield 527	j3/j$a:i	Lj3/q;
    //   809: aload 18
    //   811: getfield 457	j3/j$a:a	Ljava/lang/Long;
    //   814: ifnonnull +11 -> 825
    //   817: ldc_w 529
    //   820: astore 6
    //   822: goto +7 -> 829
    //   825: ldc -1
    //   827: astore 6
    //   829: aload 6
    //   831: astore 5
    //   833: aload 18
    //   835: getfield 462	j3/j$a:d	Ljava/lang/Long;
    //   838: ifnonnull +13 -> 851
    //   841: aload 6
    //   843: ldc_w 531
    //   846: invokestatic 96	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   849: astore 5
    //   851: aload 5
    //   853: astore 6
    //   855: aload 18
    //   857: getfield 474	j3/j$a:g	Ljava/lang/Long;
    //   860: ifnonnull +13 -> 873
    //   863: aload 5
    //   865: ldc_w 533
    //   868: invokestatic 96	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   871: astore 6
    //   873: aload 6
    //   875: invokevirtual 536	java/lang/String:isEmpty	()Z
    //   878: ifeq +73 -> 951
    //   881: aload 17
    //   883: new 538	j3/j
    //   886: dup
    //   887: aload 18
    //   889: getfield 457	j3/j$a:a	Ljava/lang/Long;
    //   892: invokevirtual 472	java/lang/Long:longValue	()J
    //   895: aload 18
    //   897: getfield 488	j3/j$a:b	Ljava/lang/Integer;
    //   900: aload 18
    //   902: getfield 514	j3/j$a:c	Lj3/p;
    //   905: aload 18
    //   907: getfield 462	j3/j$a:d	Ljava/lang/Long;
    //   910: invokevirtual 472	java/lang/Long:longValue	()J
    //   913: aload 18
    //   915: getfield 437	j3/j$a:e	[B
    //   918: aload 18
    //   920: getfield 452	j3/j$a:f	Ljava/lang/String;
    //   923: aload 18
    //   925: getfield 474	j3/j$a:g	Ljava/lang/Long;
    //   928: invokevirtual 472	java/lang/Long:longValue	()J
    //   931: aload 18
    //   933: getfield 482	j3/j$a:h	Lj3/w;
    //   936: aload 18
    //   938: getfield 527	j3/j$a:i	Lj3/q;
    //   941: invokespecial 541	j3/j:<init>	(JLjava/lang/Integer;Lj3/p;J[BLjava/lang/String;JLj3/w;Lj3/q;)V
    //   944: invokevirtual 347	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   947: pop
    //   948: goto +57 -> 1005
    //   951: new 296	java/lang/IllegalStateException
    //   954: dup
    //   955: ldc_w 543
    //   958: aload 6
    //   960: invokestatic 96	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   963: invokespecial 299	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   966: athrow
    //   967: ldc_w 277
    //   970: invokestatic 545	o3/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   973: astore 6
    //   975: aload 6
    //   977: iconst_5
    //   978: invokestatic 551	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   981: ifeq +24 -> 1005
    //   984: aload 6
    //   986: ldc_w 553
    //   989: iconst_1
    //   990: anewarray 4	java/lang/Object
    //   993: dup
    //   994: iconst_0
    //   995: aload 5
    //   997: aastore
    //   998: invokestatic 557	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1001: invokestatic 561	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   1004: pop
    //   1005: goto -594 -> 411
    //   1008: aload 10
    //   1010: ifnonnull +11 -> 1021
    //   1013: ldc_w 563
    //   1016: astore 5
    //   1018: goto +7 -> 1025
    //   1021: ldc -1
    //   1023: astore 5
    //   1025: aload 5
    //   1027: astore 6
    //   1029: aload 11
    //   1031: ifnonnull +13 -> 1044
    //   1034: aload 5
    //   1036: ldc_w 565
    //   1039: invokestatic 96	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1042: astore 6
    //   1044: aload 6
    //   1046: invokevirtual 536	java/lang/String:isEmpty	()Z
    //   1049: ifeq +38 -> 1087
    //   1052: aload 7
    //   1054: new 567	j3/k
    //   1057: dup
    //   1058: aload 10
    //   1060: invokevirtual 472	java/lang/Long:longValue	()J
    //   1063: aload 11
    //   1065: invokevirtual 472	java/lang/Long:longValue	()J
    //   1068: aload 12
    //   1070: aload 4
    //   1072: aload_3
    //   1073: aload 17
    //   1075: aload 9
    //   1077: invokespecial 570	j3/k:<init>	(JJLj3/o;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lj3/x;)V
    //   1080: invokevirtual 347	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1083: pop
    //   1084: goto -962 -> 122
    //   1087: new 296	java/lang/IllegalStateException
    //   1090: dup
    //   1091: ldc_w 543
    //   1094: aload 6
    //   1096: invokestatic 96	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1099: invokespecial 299	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   1102: athrow
    //   1103: new 572	j3/d
    //   1106: dup
    //   1107: aload 7
    //   1109: invokespecial 575	j3/d:<init>	(Ljava/util/ArrayList;)V
    //   1112: astore 6
    //   1114: aload_0
    //   1115: getfield 73	i3/b:d	Ljava/net/URL;
    //   1118: astore 5
    //   1120: aload_1
    //   1121: getfield 576	l3/a:b	[B
    //   1124: astore_1
    //   1125: aload_1
    //   1126: ifnull +57 -> 1183
    //   1129: aload_1
    //   1130: invokestatic 579	i3/a:a	([B)Li3/a;
    //   1133: astore_2
    //   1134: aload_2
    //   1135: getfield 581	i3/a:b	Ljava/lang/String;
    //   1138: astore_1
    //   1139: aload_1
    //   1140: ifnull +6 -> 1146
    //   1143: goto +5 -> 1148
    //   1146: aconst_null
    //   1147: astore_1
    //   1148: aload_2
    //   1149: getfield 583	i3/a:a	Ljava/lang/String;
    //   1152: astore_3
    //   1153: aload_1
    //   1154: astore_2
    //   1155: aload_3
    //   1156: ifnull +29 -> 1185
    //   1159: aload_3
    //   1160: invokestatic 71	i3/b:c	(Ljava/lang/String;)Ljava/net/URL;
    //   1163: astore 5
    //   1165: aload_1
    //   1166: astore_2
    //   1167: goto +18 -> 1185
    //   1170: astore_1
    //   1171: new 585	l3/b
    //   1174: dup
    //   1175: iconst_3
    //   1176: ldc2_w 586
    //   1179: invokespecial 590	l3/b:<init>	(IJ)V
    //   1182: areturn
    //   1183: aconst_null
    //   1184: astore_2
    //   1185: new 8	i3/b$a
    //   1188: astore_1
    //   1189: aload_1
    //   1190: aload 5
    //   1192: aload 6
    //   1194: aload_2
    //   1195: invokespecial 593	i3/b$a:<init>	(Ljava/net/URL;Lj3/n;Ljava/lang/String;)V
    //   1198: iconst_5
    //   1199: istore 13
    //   1201: aload_1
    //   1202: astore_2
    //   1203: aload_2
    //   1204: getfield 595	i3/b$a:a	Ljava/net/URL;
    //   1207: astore_1
    //   1208: ldc_w 277
    //   1211: invokestatic 545	o3/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1214: astore 5
    //   1216: aload 5
    //   1218: iconst_4
    //   1219: invokestatic 551	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1222: ifeq +23 -> 1245
    //   1225: aload 5
    //   1227: ldc_w 597
    //   1230: iconst_1
    //   1231: anewarray 4	java/lang/Object
    //   1234: dup
    //   1235: iconst_0
    //   1236: aload_1
    //   1237: aastore
    //   1238: invokestatic 557	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1241: invokestatic 599	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   1244: pop
    //   1245: aload_2
    //   1246: getfield 595	i3/b$a:a	Ljava/net/URL;
    //   1249: invokevirtual 603	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   1252: checkcast 605	java/net/HttpURLConnection
    //   1255: astore 6
    //   1257: aload 6
    //   1259: sipush 30000
    //   1262: invokevirtual 611	java/net/URLConnection:setConnectTimeout	(I)V
    //   1265: aload 6
    //   1267: aload_0
    //   1268: getfield 80	i3/b:g	I
    //   1271: invokevirtual 614	java/net/URLConnection:setReadTimeout	(I)V
    //   1274: aload 6
    //   1276: iconst_1
    //   1277: invokevirtual 618	java/net/URLConnection:setDoOutput	(Z)V
    //   1280: aload 6
    //   1282: iconst_0
    //   1283: invokevirtual 621	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   1286: aload 6
    //   1288: ldc_w 623
    //   1291: invokevirtual 626	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   1294: aload 6
    //   1296: ldc_w 628
    //   1299: ldc_w 630
    //   1302: iconst_1
    //   1303: anewarray 4	java/lang/Object
    //   1306: dup
    //   1307: iconst_0
    //   1308: ldc_w 632
    //   1311: aastore
    //   1312: invokestatic 557	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1315: invokevirtual 635	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1318: aload 6
    //   1320: ldc_w 637
    //   1323: ldc_w 639
    //   1326: invokevirtual 635	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1329: aload 6
    //   1331: ldc_w 641
    //   1334: ldc_w 643
    //   1337: invokevirtual 635	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1340: aload 6
    //   1342: ldc_w 645
    //   1345: ldc_w 639
    //   1348: invokevirtual 635	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1351: aload_2
    //   1352: getfield 646	i3/b$a:c	Ljava/lang/String;
    //   1355: astore_1
    //   1356: aload_1
    //   1357: ifnull +12 -> 1369
    //   1360: aload 6
    //   1362: ldc_w 648
    //   1365: aload_1
    //   1366: invokevirtual 635	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1369: aload 6
    //   1371: invokevirtual 652	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   1374: astore_1
    //   1375: new 654	java/util/zip/GZIPOutputStream
    //   1378: astore 5
    //   1380: aload 5
    //   1382: aload_1
    //   1383: invokespecial 657	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   1386: aload_0
    //   1387: getfield 49	i3/b:a	La9/d;
    //   1390: astore_3
    //   1391: aload_2
    //   1392: getfield 660	i3/b$a:b	Lj3/n;
    //   1395: astore 18
    //   1397: new 662	java/io/BufferedWriter
    //   1400: astore 4
    //   1402: new 664	java/io/OutputStreamWriter
    //   1405: astore 15
    //   1407: aload 15
    //   1409: aload 5
    //   1411: invokespecial 665	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   1414: aload 4
    //   1416: aload 15
    //   1418: invokespecial 668	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   1421: aload_3
    //   1422: aload 18
    //   1424: aload 4
    //   1426: invokevirtual 671	a9/d:b	(Ljava/lang/Object;Ljava/io/Writer;)V
    //   1429: aload 5
    //   1431: invokevirtual 676	java/io/OutputStream:close	()V
    //   1434: aload_1
    //   1435: ifnull +7 -> 1442
    //   1438: aload_1
    //   1439: invokevirtual 676	java/io/OutputStream:close	()V
    //   1442: aload 6
    //   1444: invokevirtual 679	java/net/HttpURLConnection:getResponseCode	()I
    //   1447: istore 21
    //   1449: ldc_w 277
    //   1452: invokestatic 545	o3/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   1455: astore_1
    //   1456: aload_1
    //   1457: iconst_4
    //   1458: invokestatic 551	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1461: ifeq +26 -> 1487
    //   1464: aload_1
    //   1465: ldc_w 681
    //   1468: iconst_1
    //   1469: anewarray 4	java/lang/Object
    //   1472: dup
    //   1473: iconst_0
    //   1474: iload 21
    //   1476: invokestatic 400	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1479: aastore
    //   1480: invokestatic 557	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1483: invokestatic 599	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   1486: pop
    //   1487: ldc_w 277
    //   1490: ldc_w 683
    //   1493: aload 6
    //   1495: ldc_w 641
    //   1498: invokevirtual 686	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   1501: invokestatic 689	o3/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   1504: ldc_w 277
    //   1507: ldc_w 691
    //   1510: aload 6
    //   1512: ldc_w 637
    //   1515: invokevirtual 686	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   1518: invokestatic 689	o3/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   1521: iload 21
    //   1523: sipush 302
    //   1526: if_icmpeq +199 -> 1725
    //   1529: iload 21
    //   1531: sipush 301
    //   1534: if_icmpeq +191 -> 1725
    //   1537: iload 21
    //   1539: sipush 307
    //   1542: if_icmpne +6 -> 1548
    //   1545: goto +180 -> 1725
    //   1548: iload 21
    //   1550: sipush 200
    //   1553: if_icmpeq +18 -> 1571
    //   1556: new 11	i3/b$b
    //   1559: dup
    //   1560: iload 21
    //   1562: aconst_null
    //   1563: lconst_0
    //   1564: invokespecial 694	i3/b$b:<init>	(ILjava/net/URL;J)V
    //   1567: astore_1
    //   1568: goto +279 -> 1847
    //   1571: aload 6
    //   1573: invokevirtual 698	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   1576: astore 5
    //   1578: ldc_w 639
    //   1581: aload 6
    //   1583: ldc_w 637
    //   1586: invokevirtual 686	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   1589: invokevirtual 699	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1592: ifeq +16 -> 1608
    //   1595: new 701	java/util/zip/GZIPInputStream
    //   1598: astore_1
    //   1599: aload_1
    //   1600: aload 5
    //   1602: invokespecial 704	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   1605: goto +6 -> 1611
    //   1608: aload 5
    //   1610: astore_1
    //   1611: new 706	java/io/BufferedReader
    //   1614: astore_3
    //   1615: new 708	java/io/InputStreamReader
    //   1618: astore 6
    //   1620: aload 6
    //   1622: aload_1
    //   1623: invokespecial 709	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   1626: aload_3
    //   1627: aload 6
    //   1629: invokespecial 712	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   1632: aload_3
    //   1633: invokestatic 717	j3/v:a	(Ljava/io/BufferedReader;)Lj3/l;
    //   1636: getfield 722	j3/l:a	J
    //   1639: lstore 19
    //   1641: new 11	i3/b$b
    //   1644: astore 6
    //   1646: aload 6
    //   1648: iload 21
    //   1650: aconst_null
    //   1651: lload 19
    //   1653: invokespecial 694	i3/b$b:<init>	(ILjava/net/URL;J)V
    //   1656: aload_1
    //   1657: ifnull +7 -> 1664
    //   1660: aload_1
    //   1661: invokevirtual 725	java/io/InputStream:close	()V
    //   1664: aload 6
    //   1666: astore_1
    //   1667: aload 5
    //   1669: ifnull +178 -> 1847
    //   1672: aload 5
    //   1674: invokevirtual 725	java/io/InputStream:close	()V
    //   1677: aload 6
    //   1679: astore_1
    //   1680: goto +167 -> 1847
    //   1683: astore_2
    //   1684: aload_1
    //   1685: ifnull +16 -> 1701
    //   1688: aload_1
    //   1689: invokevirtual 725	java/io/InputStream:close	()V
    //   1692: goto +9 -> 1701
    //   1695: astore_1
    //   1696: aload_2
    //   1697: aload_1
    //   1698: invokevirtual 731	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1701: aload_2
    //   1702: athrow
    //   1703: astore_1
    //   1704: aload 5
    //   1706: ifnull +17 -> 1723
    //   1709: aload 5
    //   1711: invokevirtual 725	java/io/InputStream:close	()V
    //   1714: goto +9 -> 1723
    //   1717: astore_2
    //   1718: aload_1
    //   1719: aload_2
    //   1720: invokevirtual 731	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1723: aload_1
    //   1724: athrow
    //   1725: aload 6
    //   1727: ldc_w 733
    //   1730: invokevirtual 686	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   1733: astore 5
    //   1735: new 11	i3/b$b
    //   1738: astore_1
    //   1739: new 85	java/net/URL
    //   1742: astore 6
    //   1744: aload 6
    //   1746: aload 5
    //   1748: invokespecial 88	java/net/URL:<init>	(Ljava/lang/String;)V
    //   1751: aload_1
    //   1752: iload 21
    //   1754: aload 6
    //   1756: lconst_0
    //   1757: invokespecial 694	i3/b$b:<init>	(ILjava/net/URL;J)V
    //   1760: goto +87 -> 1847
    //   1763: astore 6
    //   1765: aload 5
    //   1767: invokevirtual 676	java/io/OutputStream:close	()V
    //   1770: goto +12 -> 1782
    //   1773: astore 5
    //   1775: aload 6
    //   1777: aload 5
    //   1779: invokevirtual 731	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1782: aload 6
    //   1784: athrow
    //   1785: astore 5
    //   1787: aload_1
    //   1788: ifnull +17 -> 1805
    //   1791: aload_1
    //   1792: invokevirtual 676	java/io/OutputStream:close	()V
    //   1795: goto +10 -> 1805
    //   1798: astore_1
    //   1799: aload 5
    //   1801: aload_1
    //   1802: invokevirtual 731	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1805: aload 5
    //   1807: athrow
    //   1808: astore_1
    //   1809: goto +15 -> 1824
    //   1812: astore_1
    //   1813: goto +11 -> 1824
    //   1816: astore_1
    //   1817: goto +36 -> 1853
    //   1820: astore_1
    //   1821: goto +32 -> 1853
    //   1824: ldc_w 277
    //   1827: ldc_w 735
    //   1830: aload_1
    //   1831: invokestatic 284	o3/a:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   1834: new 11	i3/b$b
    //   1837: dup
    //   1838: sipush 400
    //   1841: aconst_null
    //   1842: lconst_0
    //   1843: invokespecial 694	i3/b$b:<init>	(ILjava/net/URL;J)V
    //   1846: astore_1
    //   1847: aload_1
    //   1848: astore 5
    //   1850: goto +27 -> 1877
    //   1853: ldc_w 277
    //   1856: ldc_w 737
    //   1859: aload_1
    //   1860: invokestatic 284	o3/a:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   1863: new 11	i3/b$b
    //   1866: dup
    //   1867: sipush 500
    //   1870: aconst_null
    //   1871: lconst_0
    //   1872: invokespecial 694	i3/b$b:<init>	(ILjava/net/URL;J)V
    //   1875: astore 5
    //   1877: aload 5
    //   1879: getfield 739	i3/b$b:b	Ljava/net/URL;
    //   1882: astore_1
    //   1883: aload_1
    //   1884: ifnull +41 -> 1925
    //   1887: ldc_w 277
    //   1890: ldc_w 741
    //   1893: aload_1
    //   1894: invokestatic 689	o3/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   1897: aload 5
    //   1899: getfield 739	i3/b$b:b	Ljava/net/URL;
    //   1902: astore 6
    //   1904: new 8	i3/b$a
    //   1907: astore_1
    //   1908: aload_1
    //   1909: aload 6
    //   1911: aload_2
    //   1912: getfield 660	i3/b$a:b	Lj3/n;
    //   1915: aload_2
    //   1916: getfield 646	i3/b$a:c	Ljava/lang/String;
    //   1919: invokespecial 593	i3/b$a:<init>	(Ljava/net/URL;Lj3/n;Ljava/lang/String;)V
    //   1922: goto +5 -> 1927
    //   1925: aconst_null
    //   1926: astore_1
    //   1927: aload_1
    //   1928: ifnull +21 -> 1949
    //   1931: iload 13
    //   1933: iconst_1
    //   1934: isub
    //   1935: istore 21
    //   1937: iload 21
    //   1939: istore 13
    //   1941: aload_1
    //   1942: astore_2
    //   1943: iload 21
    //   1945: iconst_1
    //   1946: if_icmpge -743 -> 1203
    //   1949: aload 5
    //   1951: getfield 743	i3/b$b:a	I
    //   1954: istore 13
    //   1956: iload 13
    //   1958: sipush 200
    //   1961: if_icmpne +17 -> 1978
    //   1964: new 585	l3/b
    //   1967: dup
    //   1968: iconst_1
    //   1969: aload 5
    //   1971: getfield 745	i3/b$b:c	J
    //   1974: invokespecial 590	l3/b:<init>	(IJ)V
    //   1977: areturn
    //   1978: iload 13
    //   1980: sipush 500
    //   1983: if_icmpge +46 -> 2029
    //   1986: iload 13
    //   1988: sipush 404
    //   1991: if_icmpne +6 -> 1997
    //   1994: goto +35 -> 2029
    //   1997: iload 13
    //   1999: sipush 400
    //   2002: if_icmpne +15 -> 2017
    //   2005: new 585	l3/b
    //   2008: dup
    //   2009: iconst_4
    //   2010: ldc2_w 586
    //   2013: invokespecial 590	l3/b:<init>	(IJ)V
    //   2016: areturn
    //   2017: new 585	l3/b
    //   2020: dup
    //   2021: iconst_3
    //   2022: ldc2_w 586
    //   2025: invokespecial 590	l3/b:<init>	(IJ)V
    //   2028: areturn
    //   2029: new 585	l3/b
    //   2032: dup
    //   2033: iconst_2
    //   2034: ldc2_w 586
    //   2037: invokespecial 590	l3/b:<init>	(IJ)V
    //   2040: astore_1
    //   2041: aload_1
    //   2042: areturn
    //   2043: astore_1
    //   2044: ldc_w 277
    //   2047: ldc_w 747
    //   2050: aload_1
    //   2051: invokestatic 284	o3/a:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   2054: new 585	l3/b
    //   2057: dup
    //   2058: iconst_2
    //   2059: ldc2_w 586
    //   2062: invokespecial 590	l3/b:<init>	(IJ)V
    //   2065: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2066	0	this	b
    //   0	2066	1	parama	l3.a
    //   7	1385	2	localObject1	Object
    //   1683	19	2	localObject2	Object
    //   1717	199	2	localThrowable1	Throwable
    //   1942	1	2	locala	l3.a
    //   17	1616	3	localObject3	Object
    //   36	1389	4	localObject4	Object
    //   43	1723	5	localObject5	Object
    //   1773	5	5	localThrowable2	Throwable
    //   1785	21	5	localObject6	Object
    //   1848	122	5	localObject7	Object
    //   61	238	6	localObject8	Object
    //   369	1	6	localNumberFormatException	NumberFormatException
    //   431	1324	6	localObject9	Object
    //   1763	20	6	localObject10	Object
    //   1902	8	6	localURL	URL
    //   110	998	7	localArrayList	java.util.ArrayList
    //   161	166	8	localn	k3.n
    //   166	910	9	localx	j3.x
    //   180	879	10	localLong1	Long
    //   194	870	11	localLong2	Long
    //   199	870	12	localObject11	Object
    //   208	1795	13	i	int
    //   217	80	14	str1	String
    //   235	1182	15	localObject12	Object
    //   253	52	16	str2	String
    //   262	812	17	localObject13	Object
    //   271	1152	18	localObject14	Object
    //   594	1058	19	l	long
    //   1447	500	21	j	int
    // Exception table:
    //   from	to	target	type
    //   342	357	369	java/lang/NumberFormatException
    //   1129	1139	1170	java/lang/IllegalArgumentException
    //   1148	1153	1170	java/lang/IllegalArgumentException
    //   1159	1165	1170	java/lang/IllegalArgumentException
    //   1611	1656	1683	finally
    //   1688	1692	1695	finally
    //   1578	1605	1703	finally
    //   1660	1664	1703	finally
    //   1696	1701	1703	finally
    //   1701	1703	1703	finally
    //   1709	1714	1717	finally
    //   1386	1429	1763	finally
    //   1765	1770	1773	finally
    //   1375	1386	1785	finally
    //   1429	1434	1785	finally
    //   1775	1782	1785	finally
    //   1782	1785	1785	finally
    //   1791	1795	1798	finally
    //   1369	1375	1808	java/io/IOException
    //   1438	1442	1808	java/io/IOException
    //   1799	1805	1808	java/io/IOException
    //   1805	1808	1808	java/io/IOException
    //   1369	1375	1812	y8/b
    //   1438	1442	1812	y8/b
    //   1799	1805	1812	y8/b
    //   1805	1808	1812	y8/b
    //   1369	1375	1816	java/net/UnknownHostException
    //   1438	1442	1816	java/net/UnknownHostException
    //   1799	1805	1816	java/net/UnknownHostException
    //   1805	1808	1816	java/net/UnknownHostException
    //   1369	1375	1820	java/net/ConnectException
    //   1438	1442	1820	java/net/ConnectException
    //   1799	1805	1820	java/net/ConnectException
    //   1805	1808	1820	java/net/ConnectException
    //   1185	1198	2043	java/io/IOException
    //   1203	1245	2043	java/io/IOException
    //   1245	1356	2043	java/io/IOException
    //   1360	1369	2043	java/io/IOException
    //   1442	1487	2043	java/io/IOException
    //   1487	1521	2043	java/io/IOException
    //   1556	1568	2043	java/io/IOException
    //   1571	1578	2043	java/io/IOException
    //   1672	1677	2043	java/io/IOException
    //   1718	1723	2043	java/io/IOException
    //   1723	1725	2043	java/io/IOException
    //   1725	1760	2043	java/io/IOException
    //   1824	1847	2043	java/io/IOException
    //   1853	1877	2043	java/io/IOException
    //   1877	1883	2043	java/io/IOException
    //   1887	1922	2043	java/io/IOException
    //   1949	1956	2043	java/io/IOException
    //   1964	1978	2043	java/io/IOException
    //   2005	2017	2043	java/io/IOException
    //   2017	2029	2043	java/io/IOException
    //   2029	2041	2043	java/io/IOException
  }
  
  public static final class a
  {
    public final URL a;
    public final j3.n b;
    public final String c;
    
    public a(URL paramURL, j3.n paramn, String paramString)
    {
      a = paramURL;
      b = paramn;
      c = paramString;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final URL b;
    public final long c;
    
    public b(int paramInt, URL paramURL, long paramLong)
    {
      a = paramInt;
      b = paramURL;
      c = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     i3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
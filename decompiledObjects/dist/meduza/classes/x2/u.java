package x2;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import ec.i;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import n7.w;
import o2.c.a;
import o2.o.b;
import p1.e;
import p1.n;
import p1.p;
import p2.m0;
import rb.h;
import x6.b;

public final class u
  implements t
{
  public final p1.j a;
  public final i b;
  public final k c;
  public final l d;
  public final m e;
  public final n f;
  public final o g;
  public final p h;
  public final q i;
  public final a j;
  public final c k;
  public final d l;
  public final e m;
  public final h n;
  
  public u(p1.j paramj)
  {
    a = paramj;
    b = new i(paramj);
    new j(paramj);
    c = new k(paramj);
    d = new l(paramj);
    e = new m(paramj);
    f = new n(paramj);
    g = new o(paramj);
    h = new p(paramj);
    i = new q(paramj);
    j = new a(paramj);
    new b(paramj);
    k = new c(paramj);
    l = new d(paramj);
    m = new e(paramj);
    new f(paramj);
    new g(paramj);
    n = new h(paramj);
  }
  
  public final int A()
  {
    int i1 = 0;
    p1.l locall = p1.l.C(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
    a.b();
    Cursor localCursor = b.z.o(a, locall, false);
    try
    {
      if (localCursor.moveToFirst()) {
        i1 = localCursor.getInt(0);
      }
      return i1;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  public final int B()
  {
    a.b();
    t1.f localf = m.a();
    a.c();
    try
    {
      int i1 = localf.p();
      a.n();
      return i1;
    }
    finally
    {
      a.j();
      m.d(localf);
    }
  }
  
  public final void C(HashMap<String, ArrayList<androidx.work.c>> paramHashMap)
  {
    Object localObject1 = paramHashMap.keySet();
    if (((Set)localObject1).isEmpty()) {
      return;
    }
    Object localObject3;
    if (paramHashMap.size() > 999)
    {
      localObject2 = new HashMap(999);
      localObject1 = ((Set)localObject1).iterator();
      for (;;)
      {
        i1 = 0;
        int i2;
        do
        {
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject3 = (String)((Iterator)localObject1).next();
          ((HashMap)localObject2).put(localObject3, (ArrayList)paramHashMap.get(localObject3));
          i2 = i1 + 1;
          i1 = i2;
        } while (i2 != 999);
        C((HashMap)localObject2);
        localObject2 = new HashMap(999);
      }
      if (i1 > 0) {
        C((HashMap)localObject2);
      }
      return;
    }
    Object localObject2 = f.l("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
    int i1 = ((Set)localObject1).size();
    b.f(i1, (StringBuilder)localObject2);
    ((StringBuilder)localObject2).append(")");
    localObject2 = p1.l.C(i1 + 0, ((StringBuilder)localObject2).toString());
    localObject1 = ((Set)localObject1).iterator();
    for (i1 = 1; ((Iterator)localObject1).hasNext(); i1++)
    {
      localObject3 = (String)((Iterator)localObject1).next();
      if (localObject3 == null) {
        ((p1.l)localObject2).d0(i1);
      } else {
        ((p1.l)localObject2).n(i1, (String)localObject3);
      }
    }
    localObject1 = b.z.o(a, (p1.l)localObject2, false);
    try
    {
      i1 = m0.I((Cursor)localObject1, "work_spec_id");
      if (i1 == -1) {
        return;
      }
      while (((Cursor)localObject1).moveToNext())
      {
        localObject3 = (ArrayList)paramHashMap.get(((Cursor)localObject1).getString(i1));
        if (localObject3 != null)
        {
          if (((Cursor)localObject1).isNull(0)) {
            localObject2 = null;
          } else {
            localObject2 = ((Cursor)localObject1).getBlob(0);
          }
          ((ArrayList)localObject3).add(androidx.work.c.a((byte[])localObject2));
        }
      }
      return;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
  }
  
  public final void D(HashMap<String, ArrayList<String>> paramHashMap)
  {
    Object localObject1 = paramHashMap.keySet();
    if (((Set)localObject1).isEmpty()) {
      return;
    }
    Object localObject3;
    if (paramHashMap.size() > 999)
    {
      localObject2 = new HashMap(999);
      localObject1 = ((Set)localObject1).iterator();
      for (;;)
      {
        i1 = 0;
        int i2;
        do
        {
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject3 = (String)((Iterator)localObject1).next();
          ((HashMap)localObject2).put(localObject3, (ArrayList)paramHashMap.get(localObject3));
          i2 = i1 + 1;
          i1 = i2;
        } while (i2 != 999);
        D((HashMap)localObject2);
        localObject2 = new HashMap(999);
      }
      if (i1 > 0) {
        D((HashMap)localObject2);
      }
      return;
    }
    Object localObject2 = f.l("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
    int i1 = ((Set)localObject1).size();
    b.f(i1, (StringBuilder)localObject2);
    ((StringBuilder)localObject2).append(")");
    localObject2 = p1.l.C(i1 + 0, ((StringBuilder)localObject2).toString());
    localObject1 = ((Set)localObject1).iterator();
    for (i1 = 1; ((Iterator)localObject1).hasNext(); i1++)
    {
      localObject3 = (String)((Iterator)localObject1).next();
      if (localObject3 == null) {
        ((p1.l)localObject2).d0(i1);
      } else {
        ((p1.l)localObject2).n(i1, (String)localObject3);
      }
    }
    localObject1 = b.z.o(a, (p1.l)localObject2, false);
    try
    {
      i1 = m0.I((Cursor)localObject1, "work_spec_id");
      if (i1 == -1) {
        return;
      }
      while (((Cursor)localObject1).moveToNext())
      {
        localObject3 = (ArrayList)paramHashMap.get(((Cursor)localObject1).getString(i1));
        if (localObject3 != null)
        {
          if (((Cursor)localObject1).isNull(0)) {
            localObject2 = null;
          } else {
            localObject2 = ((Cursor)localObject1).getString(0);
          }
          ((ArrayList)localObject3).add(localObject2);
        }
      }
      return;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
  }
  
  public final void a(String paramString)
  {
    a.b();
    t1.f localf = c.a();
    if (paramString == null) {
      localf.d0(1);
    } else {
      localf.n(1, paramString);
    }
    a.c();
    try
    {
      localf.p();
      a.n();
      return;
    }
    finally
    {
      a.j();
      c.d(localf);
    }
  }
  
  public final void b(s params)
  {
    a.b();
    a.c();
    try
    {
      b.f(params);
      a.n();
      return;
    }
    finally
    {
      a.j();
    }
  }
  
  /* Error */
  public final ArrayList c()
  {
    // Byte code:
    //   0: iconst_1
    //   1: ldc_w 304
    //   4: invokestatic 130	p1/l:C	(ILjava/lang/String;)Lp1/l;
    //   7: astore_1
    //   8: aload_1
    //   9: iconst_1
    //   10: sipush 200
    //   13: i2l
    //   14: invokevirtual 308	p1/l:F	(IJ)V
    //   17: aload_0
    //   18: getfield 75	x2/u:a	Lp1/j;
    //   21: invokevirtual 134	p1/j:b	()V
    //   24: aload_0
    //   25: getfield 75	x2/u:a	Lp1/j;
    //   28: aload_1
    //   29: iconst_0
    //   30: invokestatic 140	b/z:o	(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;
    //   33: astore_2
    //   34: aload_2
    //   35: ldc_w 310
    //   38: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   41: istore_3
    //   42: aload_2
    //   43: ldc_w 315
    //   46: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   49: istore 4
    //   51: aload_2
    //   52: ldc_w 317
    //   55: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   58: istore 5
    //   60: aload_2
    //   61: ldc_w 319
    //   64: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 6
    //   69: aload_2
    //   70: ldc_w 321
    //   73: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   76: istore 7
    //   78: aload_2
    //   79: ldc_w 323
    //   82: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 8
    //   87: aload_2
    //   88: ldc_w 325
    //   91: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   94: istore 9
    //   96: aload_2
    //   97: ldc_w 327
    //   100: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   103: istore 10
    //   105: aload_2
    //   106: ldc_w 329
    //   109: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   112: istore 11
    //   114: aload_2
    //   115: ldc_w 331
    //   118: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   121: istore 12
    //   123: aload_2
    //   124: ldc_w 333
    //   127: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   130: istore 13
    //   132: aload_2
    //   133: ldc_w 335
    //   136: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   139: istore 14
    //   141: aload_2
    //   142: ldc_w 337
    //   145: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   148: istore 15
    //   150: aload_2
    //   151: ldc_w 339
    //   154: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   157: istore 16
    //   159: aload_2
    //   160: ldc_w 341
    //   163: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   166: istore 17
    //   168: aload_2
    //   169: ldc_w 343
    //   172: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   175: istore 18
    //   177: aload_2
    //   178: ldc_w 345
    //   181: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   184: istore 19
    //   186: aload_2
    //   187: ldc_w 347
    //   190: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   193: istore 20
    //   195: aload_2
    //   196: ldc_w 349
    //   199: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   202: istore 21
    //   204: aload_2
    //   205: ldc_w 351
    //   208: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   211: istore 22
    //   213: aload_2
    //   214: ldc_w 353
    //   217: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   220: istore 23
    //   222: aload_2
    //   223: ldc_w 355
    //   226: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   229: istore 24
    //   231: aload_2
    //   232: ldc_w 357
    //   235: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   238: istore 25
    //   240: aload_2
    //   241: ldc_w 359
    //   244: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   247: istore 26
    //   249: aload_2
    //   250: ldc_w 361
    //   253: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   256: istore 27
    //   258: aload_2
    //   259: ldc_w 363
    //   262: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   265: istore 28
    //   267: aload_2
    //   268: ldc_w 365
    //   271: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   274: istore 29
    //   276: aload_2
    //   277: ldc_w 367
    //   280: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   283: istore 30
    //   285: aload_2
    //   286: ldc_w 369
    //   289: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   292: istore 31
    //   294: aload_2
    //   295: ldc_w 371
    //   298: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   301: istore 32
    //   303: new 215	java/util/ArrayList
    //   306: astore 33
    //   308: aload 33
    //   310: aload_2
    //   311: invokeinterface 374 1 0
    //   316: invokespecial 375	java/util/ArrayList:<init>	(I)V
    //   319: aload_2
    //   320: invokeinterface 261 1 0
    //   325: ifeq +587 -> 912
    //   328: aload_2
    //   329: iload_3
    //   330: invokeinterface 269 2 0
    //   335: istore 34
    //   337: aconst_null
    //   338: astore 35
    //   340: iload 34
    //   342: ifeq +9 -> 351
    //   345: aconst_null
    //   346: astore 36
    //   348: goto +12 -> 360
    //   351: aload_2
    //   352: iload_3
    //   353: invokeinterface 265 2 0
    //   358: astore 36
    //   360: aload_2
    //   361: iload 4
    //   363: invokeinterface 150 2 0
    //   368: invokestatic 380	x2/z:e	(I)Lo2/o$b;
    //   371: astore 37
    //   373: aload_2
    //   374: iload 5
    //   376: invokeinterface 269 2 0
    //   381: ifeq +9 -> 390
    //   384: aconst_null
    //   385: astore 38
    //   387: goto +13 -> 400
    //   390: aload_2
    //   391: iload 5
    //   393: invokeinterface 265 2 0
    //   398: astore 38
    //   400: aload_2
    //   401: iload 6
    //   403: invokeinterface 269 2 0
    //   408: ifeq +9 -> 417
    //   411: aconst_null
    //   412: astore 39
    //   414: goto +13 -> 427
    //   417: aload_2
    //   418: iload 6
    //   420: invokeinterface 265 2 0
    //   425: astore 39
    //   427: aload_2
    //   428: iload 7
    //   430: invokeinterface 269 2 0
    //   435: ifeq +9 -> 444
    //   438: aconst_null
    //   439: astore 40
    //   441: goto +13 -> 454
    //   444: aload_2
    //   445: iload 7
    //   447: invokeinterface 273 2 0
    //   452: astore 40
    //   454: aload 40
    //   456: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   459: astore 41
    //   461: aload_2
    //   462: iload 8
    //   464: invokeinterface 269 2 0
    //   469: ifeq +9 -> 478
    //   472: aconst_null
    //   473: astore 40
    //   475: goto +13 -> 488
    //   478: aload_2
    //   479: iload 8
    //   481: invokeinterface 273 2 0
    //   486: astore 40
    //   488: aload 40
    //   490: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   493: astore 42
    //   495: aload_2
    //   496: iload 9
    //   498: invokeinterface 384 2 0
    //   503: lstore 43
    //   505: aload_2
    //   506: iload 10
    //   508: invokeinterface 384 2 0
    //   513: lstore 45
    //   515: aload_2
    //   516: iload 11
    //   518: invokeinterface 384 2 0
    //   523: lstore 47
    //   525: aload_2
    //   526: iload 12
    //   528: invokeinterface 150 2 0
    //   533: istore 49
    //   535: aload_2
    //   536: iload 13
    //   538: invokeinterface 150 2 0
    //   543: invokestatic 386	x2/z:b	(I)I
    //   546: istore 50
    //   548: aload_2
    //   549: iload 14
    //   551: invokeinterface 384 2 0
    //   556: lstore 51
    //   558: aload_2
    //   559: iload 15
    //   561: invokeinterface 384 2 0
    //   566: lstore 53
    //   568: aload_2
    //   569: iload 16
    //   571: invokeinterface 384 2 0
    //   576: lstore 55
    //   578: aload_2
    //   579: iload 17
    //   581: invokeinterface 384 2 0
    //   586: lstore 57
    //   588: aload_2
    //   589: iload 18
    //   591: invokeinterface 150 2 0
    //   596: ifeq +9 -> 605
    //   599: iconst_1
    //   600: istore 34
    //   602: goto +6 -> 608
    //   605: iconst_0
    //   606: istore 34
    //   608: aload_2
    //   609: iload 19
    //   611: invokeinterface 150 2 0
    //   616: invokestatic 388	x2/z:d	(I)I
    //   619: istore 59
    //   621: aload_2
    //   622: iload 20
    //   624: invokeinterface 150 2 0
    //   629: istore 60
    //   631: aload_2
    //   632: iload 21
    //   634: invokeinterface 150 2 0
    //   639: istore 61
    //   641: aload_2
    //   642: iload 22
    //   644: invokeinterface 384 2 0
    //   649: lstore 62
    //   651: aload_2
    //   652: iload 23
    //   654: invokeinterface 150 2 0
    //   659: istore 64
    //   661: aload_2
    //   662: iload 24
    //   664: invokeinterface 150 2 0
    //   669: istore 65
    //   671: aload_2
    //   672: iload 25
    //   674: invokeinterface 150 2 0
    //   679: invokestatic 390	x2/z:c	(I)I
    //   682: istore 66
    //   684: aload_2
    //   685: iload 26
    //   687: invokeinterface 150 2 0
    //   692: ifeq +9 -> 701
    //   695: iconst_1
    //   696: istore 67
    //   698: goto +6 -> 704
    //   701: iconst_0
    //   702: istore 67
    //   704: aload_2
    //   705: iload 27
    //   707: invokeinterface 150 2 0
    //   712: ifeq +9 -> 721
    //   715: iconst_1
    //   716: istore 68
    //   718: goto +6 -> 724
    //   721: iconst_0
    //   722: istore 68
    //   724: aload_2
    //   725: iload 28
    //   727: invokeinterface 150 2 0
    //   732: ifeq +9 -> 741
    //   735: iconst_1
    //   736: istore 69
    //   738: goto +6 -> 744
    //   741: iconst_0
    //   742: istore 69
    //   744: aload_2
    //   745: iload 29
    //   747: invokeinterface 150 2 0
    //   752: ifeq +9 -> 761
    //   755: iconst_1
    //   756: istore 70
    //   758: goto +6 -> 764
    //   761: iconst_0
    //   762: istore 70
    //   764: aload_2
    //   765: iload 30
    //   767: invokeinterface 384 2 0
    //   772: lstore 71
    //   774: aload_2
    //   775: iload 31
    //   777: invokeinterface 384 2 0
    //   782: lstore 73
    //   784: aload_2
    //   785: iload 32
    //   787: invokeinterface 269 2 0
    //   792: ifeq +10 -> 802
    //   795: aload 35
    //   797: astore 40
    //   799: goto +13 -> 812
    //   802: aload_2
    //   803: iload 32
    //   805: invokeinterface 273 2 0
    //   810: astore 40
    //   812: aload 40
    //   814: invokestatic 393	x2/z:a	([B)Ljava/util/LinkedHashSet;
    //   817: astore 35
    //   819: new 395	o2/c
    //   822: astore 40
    //   824: aload 40
    //   826: iload 66
    //   828: iload 67
    //   830: iload 68
    //   832: iload 69
    //   834: iload 70
    //   836: lload 71
    //   838: lload 73
    //   840: aload 35
    //   842: invokespecial 398	o2/c:<init>	(IZZZZJJLjava/util/Set;)V
    //   845: new 400	x2/s
    //   848: astore 35
    //   850: aload 35
    //   852: aload 36
    //   854: aload 37
    //   856: aload 38
    //   858: aload 39
    //   860: aload 41
    //   862: aload 42
    //   864: lload 43
    //   866: lload 45
    //   868: lload 47
    //   870: aload 40
    //   872: iload 49
    //   874: iload 50
    //   876: lload 51
    //   878: lload 53
    //   880: lload 55
    //   882: lload 57
    //   884: iload 34
    //   886: iload 59
    //   888: iload 60
    //   890: iload 61
    //   892: lload 62
    //   894: iload 64
    //   896: iload 65
    //   898: invokespecial 403	x2/s:<init>	(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIIJII)V
    //   901: aload 33
    //   903: aload 35
    //   905: invokevirtual 282	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   908: pop
    //   909: goto -590 -> 319
    //   912: aload_2
    //   913: invokeinterface 153 1 0
    //   918: aload_1
    //   919: invokevirtual 156	p1/l:H	()V
    //   922: aload 33
    //   924: areturn
    //   925: astore 36
    //   927: goto +5 -> 932
    //   930: astore 36
    //   932: aload_2
    //   933: invokeinterface 153 1 0
    //   938: aload_1
    //   939: invokevirtual 156	p1/l:H	()V
    //   942: aload 36
    //   944: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	945	0	this	u
    //   7	932	1	locall	p1.l
    //   33	900	2	localCursor	Cursor
    //   41	312	3	i1	int
    //   49	313	4	i2	int
    //   58	334	5	i3	int
    //   67	352	6	i4	int
    //   76	370	7	i5	int
    //   85	395	8	i6	int
    //   94	403	9	i7	int
    //   103	404	10	i8	int
    //   112	405	11	i9	int
    //   121	406	12	i10	int
    //   130	407	13	i11	int
    //   139	411	14	i12	int
    //   148	412	15	i13	int
    //   157	413	16	i14	int
    //   166	414	17	i15	int
    //   175	415	18	i16	int
    //   184	426	19	i17	int
    //   193	430	20	i18	int
    //   202	431	21	i19	int
    //   211	432	22	i20	int
    //   220	433	23	i21	int
    //   229	434	24	i22	int
    //   238	435	25	i23	int
    //   247	439	26	i24	int
    //   256	450	27	i25	int
    //   265	461	28	i26	int
    //   274	472	29	i27	int
    //   283	483	30	i28	int
    //   292	484	31	i29	int
    //   301	503	32	i30	int
    //   306	617	33	localArrayList	ArrayList
    //   335	550	34	bool1	boolean
    //   338	566	35	localObject1	Object
    //   346	507	36	str1	String
    //   925	1	36	localObject2	Object
    //   930	13	36	localObject3	Object
    //   371	484	37	localb	o.b
    //   385	472	38	str2	String
    //   412	447	39	str3	String
    //   439	432	40	localObject4	Object
    //   459	402	41	localc1	androidx.work.c
    //   493	370	42	localc2	androidx.work.c
    //   503	362	43	l1	long
    //   513	354	45	l2	long
    //   523	346	47	l3	long
    //   533	340	49	i31	int
    //   546	329	50	i32	int
    //   556	321	51	l4	long
    //   566	313	53	l5	long
    //   576	305	55	l6	long
    //   586	297	57	l7	long
    //   619	268	59	i33	int
    //   629	260	60	i34	int
    //   639	252	61	i35	int
    //   649	244	62	l8	long
    //   659	236	64	i36	int
    //   669	228	65	i37	int
    //   682	145	66	i38	int
    //   696	133	67	bool2	boolean
    //   716	115	68	bool3	boolean
    //   736	97	69	bool4	boolean
    //   756	79	70	bool5	boolean
    //   772	65	71	l9	long
    //   782	57	73	l10	long
    // Exception table:
    //   from	to	target	type
    //   159	308	925	finally
    //   308	319	925	finally
    //   319	337	925	finally
    //   351	360	925	finally
    //   360	384	925	finally
    //   390	400	925	finally
    //   400	411	925	finally
    //   417	427	925	finally
    //   427	438	925	finally
    //   444	454	925	finally
    //   454	472	925	finally
    //   478	488	925	finally
    //   488	588	925	finally
    //   588	599	925	finally
    //   608	621	925	finally
    //   621	631	925	finally
    //   631	641	925	finally
    //   641	651	925	finally
    //   651	661	925	finally
    //   661	671	925	finally
    //   671	684	925	finally
    //   684	695	925	finally
    //   704	715	925	finally
    //   724	735	925	finally
    //   744	755	925	finally
    //   764	774	925	finally
    //   774	784	925	finally
    //   784	795	925	finally
    //   802	812	925	finally
    //   812	845	925	finally
    //   845	909	925	finally
    //   34	159	930	finally
  }
  
  public final void d(String paramString)
  {
    a.b();
    t1.f localf = f.a();
    if (paramString == null) {
      localf.d0(1);
    } else {
      localf.n(1, paramString);
    }
    a.c();
    try
    {
      localf.p();
      a.n();
      return;
    }
    finally
    {
      a.j();
      f.d(localf);
    }
  }
  
  public final int e(o.b paramb, String paramString)
  {
    a.b();
    t1.f localf = d.a();
    localf.F(1, z.f(paramb));
    if (paramString == null) {
      localf.d0(2);
    } else {
      localf.n(2, paramString);
    }
    a.c();
    try
    {
      int i1 = localf.p();
      a.n();
      return i1;
    }
    finally
    {
      a.j();
      d.d(localf);
    }
  }
  
  public final int f(String paramString, long paramLong)
  {
    a.b();
    t1.f localf = l.a();
    localf.F(1, paramLong);
    if (paramString == null) {
      localf.d0(2);
    } else {
      localf.n(2, paramString);
    }
    a.c();
    try
    {
      int i1 = localf.p();
      a.n();
      return i1;
    }
    finally
    {
      a.j();
      l.d(localf);
    }
  }
  
  public final ArrayList g(String paramString)
  {
    p1.l locall = p1.l.C(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
    if (paramString == null) {
      locall.d0(1);
    } else {
      locall.n(1, paramString);
    }
    a.b();
    Cursor localCursor = b.z.o(a, locall, false);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext())
      {
        if (localCursor.isNull(0)) {
          paramString = null;
        } else {
          paramString = localCursor.getString(0);
        }
        o.b localb = z.e(localCursor.getInt(1));
        s.b localb1 = new x2/s$b;
        localb1.<init>(localb, paramString);
        localArrayList.add(localb1);
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  /* Error */
  public final ArrayList h(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: ldc_w 420
    //   4: invokestatic 130	p1/l:C	(ILjava/lang/String;)Lp1/l;
    //   7: astore_3
    //   8: aload_3
    //   9: iconst_1
    //   10: lload_1
    //   11: invokevirtual 308	p1/l:F	(IJ)V
    //   14: aload_0
    //   15: getfield 75	x2/u:a	Lp1/j;
    //   18: invokevirtual 134	p1/j:b	()V
    //   21: aload_0
    //   22: getfield 75	x2/u:a	Lp1/j;
    //   25: aload_3
    //   26: iconst_0
    //   27: invokestatic 140	b/z:o	(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;
    //   30: astore 4
    //   32: aload 4
    //   34: ldc_w 310
    //   37: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   40: istore 5
    //   42: aload 4
    //   44: ldc_w 315
    //   47: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   50: istore 6
    //   52: aload 4
    //   54: ldc_w 317
    //   57: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   60: istore 7
    //   62: aload 4
    //   64: ldc_w 319
    //   67: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   70: istore 8
    //   72: aload 4
    //   74: ldc_w 321
    //   77: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   80: istore 9
    //   82: aload 4
    //   84: ldc_w 323
    //   87: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   90: istore 10
    //   92: aload 4
    //   94: ldc_w 325
    //   97: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   100: istore 11
    //   102: aload 4
    //   104: ldc_w 327
    //   107: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   110: istore 12
    //   112: aload 4
    //   114: ldc_w 329
    //   117: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   120: istore 13
    //   122: aload 4
    //   124: ldc_w 331
    //   127: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   130: istore 14
    //   132: aload 4
    //   134: ldc_w 333
    //   137: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   140: istore 15
    //   142: aload 4
    //   144: ldc_w 335
    //   147: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   150: istore 16
    //   152: aload 4
    //   154: ldc_w 337
    //   157: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   160: istore 17
    //   162: aload 4
    //   164: ldc_w 339
    //   167: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   170: istore 18
    //   172: aload 4
    //   174: ldc_w 341
    //   177: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   180: istore 19
    //   182: aload 4
    //   184: ldc_w 343
    //   187: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   190: istore 20
    //   192: aload 4
    //   194: ldc_w 345
    //   197: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   200: istore 21
    //   202: aload 4
    //   204: ldc_w 347
    //   207: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   210: istore 22
    //   212: aload 4
    //   214: ldc_w 349
    //   217: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   220: istore 23
    //   222: aload 4
    //   224: ldc_w 351
    //   227: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   230: istore 24
    //   232: aload 4
    //   234: ldc_w 353
    //   237: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   240: istore 25
    //   242: aload 4
    //   244: ldc_w 355
    //   247: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   250: istore 26
    //   252: aload 4
    //   254: ldc_w 357
    //   257: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   260: istore 27
    //   262: aload 4
    //   264: ldc_w 359
    //   267: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   270: istore 28
    //   272: aload 4
    //   274: ldc_w 361
    //   277: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   280: istore 29
    //   282: aload 4
    //   284: ldc_w 363
    //   287: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   290: istore 30
    //   292: aload 4
    //   294: ldc_w 365
    //   297: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   300: istore 31
    //   302: aload 4
    //   304: ldc_w 367
    //   307: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   310: istore 32
    //   312: aload 4
    //   314: ldc_w 369
    //   317: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   320: istore 33
    //   322: aload 4
    //   324: ldc_w 371
    //   327: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   330: istore 34
    //   332: new 215	java/util/ArrayList
    //   335: astore 35
    //   337: aload 35
    //   339: aload 4
    //   341: invokeinterface 374 1 0
    //   346: invokespecial 375	java/util/ArrayList:<init>	(I)V
    //   349: aload 4
    //   351: invokeinterface 261 1 0
    //   356: ifeq +623 -> 979
    //   359: aload 4
    //   361: iload 5
    //   363: invokeinterface 269 2 0
    //   368: istore 36
    //   370: aconst_null
    //   371: astore 37
    //   373: iload 36
    //   375: ifeq +9 -> 384
    //   378: aconst_null
    //   379: astore 38
    //   381: goto +14 -> 395
    //   384: aload 4
    //   386: iload 5
    //   388: invokeinterface 265 2 0
    //   393: astore 38
    //   395: aload 4
    //   397: iload 6
    //   399: invokeinterface 150 2 0
    //   404: invokestatic 380	x2/z:e	(I)Lo2/o$b;
    //   407: astore 39
    //   409: aload 4
    //   411: iload 7
    //   413: invokeinterface 269 2 0
    //   418: ifeq +9 -> 427
    //   421: aconst_null
    //   422: astore 40
    //   424: goto +14 -> 438
    //   427: aload 4
    //   429: iload 7
    //   431: invokeinterface 265 2 0
    //   436: astore 40
    //   438: aload 4
    //   440: iload 8
    //   442: invokeinterface 269 2 0
    //   447: ifeq +9 -> 456
    //   450: aconst_null
    //   451: astore 41
    //   453: goto +14 -> 467
    //   456: aload 4
    //   458: iload 8
    //   460: invokeinterface 265 2 0
    //   465: astore 41
    //   467: aload 4
    //   469: iload 9
    //   471: invokeinterface 269 2 0
    //   476: ifeq +9 -> 485
    //   479: aconst_null
    //   480: astore 42
    //   482: goto +14 -> 496
    //   485: aload 4
    //   487: iload 9
    //   489: invokeinterface 273 2 0
    //   494: astore 42
    //   496: aload 42
    //   498: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   501: astore 43
    //   503: aload 4
    //   505: iload 10
    //   507: invokeinterface 269 2 0
    //   512: ifeq +9 -> 521
    //   515: aconst_null
    //   516: astore 42
    //   518: goto +14 -> 532
    //   521: aload 4
    //   523: iload 10
    //   525: invokeinterface 273 2 0
    //   530: astore 42
    //   532: aload 42
    //   534: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   537: astore 44
    //   539: aload 4
    //   541: iload 11
    //   543: invokeinterface 384 2 0
    //   548: lstore 45
    //   550: aload 4
    //   552: iload 12
    //   554: invokeinterface 384 2 0
    //   559: lstore 47
    //   561: aload 4
    //   563: iload 13
    //   565: invokeinterface 384 2 0
    //   570: lstore_1
    //   571: aload 4
    //   573: iload 14
    //   575: invokeinterface 150 2 0
    //   580: istore 49
    //   582: aload 4
    //   584: iload 15
    //   586: invokeinterface 150 2 0
    //   591: invokestatic 386	x2/z:b	(I)I
    //   594: istore 50
    //   596: aload 4
    //   598: iload 16
    //   600: invokeinterface 384 2 0
    //   605: lstore 51
    //   607: aload 4
    //   609: iload 17
    //   611: invokeinterface 384 2 0
    //   616: lstore 53
    //   618: aload 4
    //   620: iload 18
    //   622: invokeinterface 384 2 0
    //   627: lstore 55
    //   629: aload 4
    //   631: iload 19
    //   633: invokeinterface 384 2 0
    //   638: lstore 57
    //   640: aload 4
    //   642: iload 20
    //   644: invokeinterface 150 2 0
    //   649: ifeq +9 -> 658
    //   652: iconst_1
    //   653: istore 36
    //   655: goto +6 -> 661
    //   658: iconst_0
    //   659: istore 36
    //   661: aload 4
    //   663: iload 21
    //   665: invokeinterface 150 2 0
    //   670: invokestatic 388	x2/z:d	(I)I
    //   673: istore 59
    //   675: aload 4
    //   677: iload 22
    //   679: invokeinterface 150 2 0
    //   684: istore 60
    //   686: aload 4
    //   688: iload 23
    //   690: invokeinterface 150 2 0
    //   695: istore 61
    //   697: aload 4
    //   699: iload 24
    //   701: invokeinterface 384 2 0
    //   706: lstore 62
    //   708: aload 4
    //   710: iload 25
    //   712: invokeinterface 150 2 0
    //   717: istore 64
    //   719: aload 4
    //   721: iload 26
    //   723: invokeinterface 150 2 0
    //   728: istore 65
    //   730: aload 4
    //   732: iload 27
    //   734: invokeinterface 150 2 0
    //   739: invokestatic 390	x2/z:c	(I)I
    //   742: istore 66
    //   744: aload 4
    //   746: iload 28
    //   748: invokeinterface 150 2 0
    //   753: ifeq +9 -> 762
    //   756: iconst_1
    //   757: istore 67
    //   759: goto +6 -> 765
    //   762: iconst_0
    //   763: istore 67
    //   765: aload 4
    //   767: iload 29
    //   769: invokeinterface 150 2 0
    //   774: ifeq +9 -> 783
    //   777: iconst_1
    //   778: istore 68
    //   780: goto +6 -> 786
    //   783: iconst_0
    //   784: istore 68
    //   786: aload 4
    //   788: iload 30
    //   790: invokeinterface 150 2 0
    //   795: ifeq +9 -> 804
    //   798: iconst_1
    //   799: istore 69
    //   801: goto +6 -> 807
    //   804: iconst_0
    //   805: istore 69
    //   807: aload 4
    //   809: iload 31
    //   811: invokeinterface 150 2 0
    //   816: ifeq +9 -> 825
    //   819: iconst_1
    //   820: istore 70
    //   822: goto +6 -> 828
    //   825: iconst_0
    //   826: istore 70
    //   828: aload 4
    //   830: iload 32
    //   832: invokeinterface 384 2 0
    //   837: lstore 71
    //   839: aload 4
    //   841: iload 33
    //   843: invokeinterface 384 2 0
    //   848: lstore 73
    //   850: aload 4
    //   852: iload 34
    //   854: invokeinterface 269 2 0
    //   859: ifeq +10 -> 869
    //   862: aload 37
    //   864: astore 42
    //   866: goto +14 -> 880
    //   869: aload 4
    //   871: iload 34
    //   873: invokeinterface 273 2 0
    //   878: astore 42
    //   880: aload 42
    //   882: invokestatic 393	x2/z:a	([B)Ljava/util/LinkedHashSet;
    //   885: astore 37
    //   887: new 395	o2/c
    //   890: astore 42
    //   892: aload 42
    //   894: iload 66
    //   896: iload 67
    //   898: iload 68
    //   900: iload 69
    //   902: iload 70
    //   904: lload 71
    //   906: lload 73
    //   908: aload 37
    //   910: invokespecial 398	o2/c:<init>	(IZZZZJJLjava/util/Set;)V
    //   913: new 400	x2/s
    //   916: astore 37
    //   918: aload 37
    //   920: aload 38
    //   922: aload 39
    //   924: aload 40
    //   926: aload 41
    //   928: aload 43
    //   930: aload 44
    //   932: lload 45
    //   934: lload 47
    //   936: lload_1
    //   937: aload 42
    //   939: iload 49
    //   941: iload 50
    //   943: lload 51
    //   945: lload 53
    //   947: lload 55
    //   949: lload 57
    //   951: iload 36
    //   953: iload 59
    //   955: iload 60
    //   957: iload 61
    //   959: lload 62
    //   961: iload 64
    //   963: iload 65
    //   965: invokespecial 403	x2/s:<init>	(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIIJII)V
    //   968: aload 35
    //   970: aload 37
    //   972: invokevirtual 282	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   975: pop
    //   976: goto -627 -> 349
    //   979: aload 4
    //   981: invokeinterface 153 1 0
    //   986: aload_3
    //   987: invokevirtual 156	p1/l:H	()V
    //   990: aload 35
    //   992: areturn
    //   993: astore 38
    //   995: goto +5 -> 1000
    //   998: astore 38
    //   1000: aload 4
    //   1002: invokeinterface 153 1 0
    //   1007: aload_3
    //   1008: invokevirtual 156	p1/l:H	()V
    //   1011: aload 38
    //   1013: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1014	0	this	u
    //   0	1014	1	paramLong	long
    //   7	1001	3	locall	p1.l
    //   30	971	4	localCursor	Cursor
    //   40	347	5	i1	int
    //   50	348	6	i2	int
    //   60	370	7	i3	int
    //   70	389	8	i4	int
    //   80	408	9	i5	int
    //   90	434	10	i6	int
    //   100	442	11	i7	int
    //   110	443	12	i8	int
    //   120	444	13	i9	int
    //   130	444	14	i10	int
    //   140	445	15	i11	int
    //   150	449	16	i12	int
    //   160	450	17	i13	int
    //   170	451	18	i14	int
    //   180	452	19	i15	int
    //   190	453	20	i16	int
    //   200	464	21	i17	int
    //   210	468	22	i18	int
    //   220	469	23	i19	int
    //   230	470	24	i20	int
    //   240	471	25	i21	int
    //   250	472	26	i22	int
    //   260	473	27	i23	int
    //   270	477	28	i24	int
    //   280	488	29	i25	int
    //   290	499	30	i26	int
    //   300	510	31	i27	int
    //   310	521	32	i28	int
    //   320	522	33	i29	int
    //   330	542	34	i30	int
    //   335	656	35	localArrayList	ArrayList
    //   368	584	36	bool1	boolean
    //   371	600	37	localObject1	Object
    //   379	542	38	str1	String
    //   993	1	38	localObject2	Object
    //   998	14	38	localObject3	Object
    //   407	516	39	localb	o.b
    //   422	503	40	str2	String
    //   451	476	41	str3	String
    //   480	458	42	localObject4	Object
    //   501	428	43	localc1	androidx.work.c
    //   537	394	44	localc2	androidx.work.c
    //   548	385	45	l1	long
    //   559	376	47	l2	long
    //   580	360	49	i31	int
    //   594	348	50	i32	int
    //   605	339	51	l3	long
    //   616	330	53	l4	long
    //   627	321	55	l5	long
    //   638	312	57	l6	long
    //   673	281	59	i33	int
    //   684	272	60	i34	int
    //   695	263	61	i35	int
    //   706	254	62	l7	long
    //   717	245	64	i36	int
    //   728	236	65	i37	int
    //   742	153	66	i38	int
    //   757	140	67	bool2	boolean
    //   778	121	68	bool3	boolean
    //   799	102	69	bool4	boolean
    //   820	83	70	bool5	boolean
    //   837	68	71	l8	long
    //   848	59	73	l9	long
    // Exception table:
    //   from	to	target	type
    //   172	337	993	finally
    //   337	349	993	finally
    //   349	370	993	finally
    //   384	395	993	finally
    //   395	421	993	finally
    //   427	438	993	finally
    //   438	450	993	finally
    //   456	467	993	finally
    //   467	479	993	finally
    //   485	496	993	finally
    //   496	515	993	finally
    //   521	532	993	finally
    //   532	640	993	finally
    //   640	652	993	finally
    //   661	675	993	finally
    //   675	686	993	finally
    //   686	697	993	finally
    //   697	708	993	finally
    //   708	719	993	finally
    //   719	730	993	finally
    //   730	744	993	finally
    //   744	756	993	finally
    //   765	777	993	finally
    //   786	798	993	finally
    //   807	819	993	finally
    //   828	839	993	finally
    //   839	850	993	finally
    //   850	862	993	finally
    //   869	880	993	finally
    //   880	913	993	finally
    //   913	976	993	finally
    //   32	172	998	finally
  }
  
  /* Error */
  public final ArrayList i(int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: ldc_w 423
    //   4: invokestatic 130	p1/l:C	(ILjava/lang/String;)Lp1/l;
    //   7: astore_2
    //   8: aload_2
    //   9: iconst_1
    //   10: iload_1
    //   11: i2l
    //   12: invokevirtual 308	p1/l:F	(IJ)V
    //   15: aload_0
    //   16: getfield 75	x2/u:a	Lp1/j;
    //   19: invokevirtual 134	p1/j:b	()V
    //   22: aload_0
    //   23: getfield 75	x2/u:a	Lp1/j;
    //   26: aload_2
    //   27: iconst_0
    //   28: invokestatic 140	b/z:o	(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;
    //   31: astore_3
    //   32: aload_3
    //   33: ldc_w 310
    //   36: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   39: istore 4
    //   41: aload_3
    //   42: ldc_w 315
    //   45: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   48: istore 5
    //   50: aload_3
    //   51: ldc_w 317
    //   54: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   57: istore 6
    //   59: aload_3
    //   60: ldc_w 319
    //   63: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   66: istore 7
    //   68: aload_3
    //   69: ldc_w 321
    //   72: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   75: istore 8
    //   77: aload_3
    //   78: ldc_w 323
    //   81: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   84: istore 9
    //   86: aload_3
    //   87: ldc_w 325
    //   90: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   93: istore 10
    //   95: aload_3
    //   96: ldc_w 327
    //   99: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   102: istore 11
    //   104: aload_3
    //   105: ldc_w 329
    //   108: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   111: istore 12
    //   113: aload_3
    //   114: ldc_w 331
    //   117: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   120: istore 13
    //   122: aload_3
    //   123: ldc_w 333
    //   126: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   129: istore 14
    //   131: aload_3
    //   132: ldc_w 335
    //   135: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   138: istore 15
    //   140: aload_3
    //   141: ldc_w 337
    //   144: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   147: istore 16
    //   149: aload_3
    //   150: ldc_w 339
    //   153: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   156: istore 17
    //   158: aload_3
    //   159: ldc_w 341
    //   162: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   165: istore 18
    //   167: aload_3
    //   168: ldc_w 343
    //   171: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   174: istore 19
    //   176: aload_3
    //   177: ldc_w 345
    //   180: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   183: istore 20
    //   185: aload_3
    //   186: ldc_w 347
    //   189: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   192: istore 21
    //   194: aload_3
    //   195: ldc_w 349
    //   198: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   201: istore 22
    //   203: aload_3
    //   204: ldc_w 351
    //   207: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   210: istore 23
    //   212: aload_3
    //   213: ldc_w 353
    //   216: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   219: istore 24
    //   221: aload_3
    //   222: ldc_w 355
    //   225: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   228: istore 25
    //   230: aload_3
    //   231: ldc_w 357
    //   234: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   237: istore 26
    //   239: aload_3
    //   240: ldc_w 359
    //   243: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   246: istore 27
    //   248: aload_3
    //   249: ldc_w 361
    //   252: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   255: istore 28
    //   257: aload_3
    //   258: ldc_w 363
    //   261: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   264: istore 29
    //   266: aload_3
    //   267: ldc_w 365
    //   270: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   273: istore 30
    //   275: aload_3
    //   276: ldc_w 367
    //   279: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   282: istore_1
    //   283: aload_3
    //   284: ldc_w 369
    //   287: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   290: istore 31
    //   292: aload_3
    //   293: ldc_w 371
    //   296: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   299: istore 32
    //   301: new 215	java/util/ArrayList
    //   304: astore 33
    //   306: aload 33
    //   308: aload_3
    //   309: invokeinterface 374 1 0
    //   314: invokespecial 375	java/util/ArrayList:<init>	(I)V
    //   317: aload_3
    //   318: invokeinterface 261 1 0
    //   323: ifeq +588 -> 911
    //   326: aload_3
    //   327: iload 4
    //   329: invokeinterface 269 2 0
    //   334: istore 34
    //   336: aconst_null
    //   337: astore 35
    //   339: iload 34
    //   341: ifeq +9 -> 350
    //   344: aconst_null
    //   345: astore 36
    //   347: goto +13 -> 360
    //   350: aload_3
    //   351: iload 4
    //   353: invokeinterface 265 2 0
    //   358: astore 36
    //   360: aload_3
    //   361: iload 5
    //   363: invokeinterface 150 2 0
    //   368: invokestatic 380	x2/z:e	(I)Lo2/o$b;
    //   371: astore 37
    //   373: aload_3
    //   374: iload 6
    //   376: invokeinterface 269 2 0
    //   381: ifeq +9 -> 390
    //   384: aconst_null
    //   385: astore 38
    //   387: goto +13 -> 400
    //   390: aload_3
    //   391: iload 6
    //   393: invokeinterface 265 2 0
    //   398: astore 38
    //   400: aload_3
    //   401: iload 7
    //   403: invokeinterface 269 2 0
    //   408: ifeq +9 -> 417
    //   411: aconst_null
    //   412: astore 39
    //   414: goto +13 -> 427
    //   417: aload_3
    //   418: iload 7
    //   420: invokeinterface 265 2 0
    //   425: astore 39
    //   427: aload_3
    //   428: iload 8
    //   430: invokeinterface 269 2 0
    //   435: ifeq +9 -> 444
    //   438: aconst_null
    //   439: astore 40
    //   441: goto +13 -> 454
    //   444: aload_3
    //   445: iload 8
    //   447: invokeinterface 273 2 0
    //   452: astore 40
    //   454: aload 40
    //   456: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   459: astore 41
    //   461: aload_3
    //   462: iload 9
    //   464: invokeinterface 269 2 0
    //   469: ifeq +9 -> 478
    //   472: aconst_null
    //   473: astore 40
    //   475: goto +13 -> 488
    //   478: aload_3
    //   479: iload 9
    //   481: invokeinterface 273 2 0
    //   486: astore 40
    //   488: aload 40
    //   490: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   493: astore 42
    //   495: aload_3
    //   496: iload 10
    //   498: invokeinterface 384 2 0
    //   503: lstore 43
    //   505: aload_3
    //   506: iload 11
    //   508: invokeinterface 384 2 0
    //   513: lstore 45
    //   515: aload_3
    //   516: iload 12
    //   518: invokeinterface 384 2 0
    //   523: lstore 47
    //   525: aload_3
    //   526: iload 13
    //   528: invokeinterface 150 2 0
    //   533: istore 49
    //   535: aload_3
    //   536: iload 14
    //   538: invokeinterface 150 2 0
    //   543: invokestatic 386	x2/z:b	(I)I
    //   546: istore 50
    //   548: aload_3
    //   549: iload 15
    //   551: invokeinterface 384 2 0
    //   556: lstore 51
    //   558: aload_3
    //   559: iload 16
    //   561: invokeinterface 384 2 0
    //   566: lstore 53
    //   568: aload_3
    //   569: iload 17
    //   571: invokeinterface 384 2 0
    //   576: lstore 55
    //   578: aload_3
    //   579: iload 18
    //   581: invokeinterface 384 2 0
    //   586: lstore 57
    //   588: aload_3
    //   589: iload 19
    //   591: invokeinterface 150 2 0
    //   596: ifeq +9 -> 605
    //   599: iconst_1
    //   600: istore 34
    //   602: goto +6 -> 608
    //   605: iconst_0
    //   606: istore 34
    //   608: aload_3
    //   609: iload 20
    //   611: invokeinterface 150 2 0
    //   616: invokestatic 388	x2/z:d	(I)I
    //   619: istore 59
    //   621: aload_3
    //   622: iload 21
    //   624: invokeinterface 150 2 0
    //   629: istore 60
    //   631: aload_3
    //   632: iload 22
    //   634: invokeinterface 150 2 0
    //   639: istore 61
    //   641: aload_3
    //   642: iload 23
    //   644: invokeinterface 384 2 0
    //   649: lstore 62
    //   651: aload_3
    //   652: iload 24
    //   654: invokeinterface 150 2 0
    //   659: istore 64
    //   661: aload_3
    //   662: iload 25
    //   664: invokeinterface 150 2 0
    //   669: istore 65
    //   671: aload_3
    //   672: iload 26
    //   674: invokeinterface 150 2 0
    //   679: invokestatic 390	x2/z:c	(I)I
    //   682: istore 66
    //   684: aload_3
    //   685: iload 27
    //   687: invokeinterface 150 2 0
    //   692: ifeq +9 -> 701
    //   695: iconst_1
    //   696: istore 67
    //   698: goto +6 -> 704
    //   701: iconst_0
    //   702: istore 67
    //   704: aload_3
    //   705: iload 28
    //   707: invokeinterface 150 2 0
    //   712: ifeq +9 -> 721
    //   715: iconst_1
    //   716: istore 68
    //   718: goto +6 -> 724
    //   721: iconst_0
    //   722: istore 68
    //   724: aload_3
    //   725: iload 29
    //   727: invokeinterface 150 2 0
    //   732: ifeq +9 -> 741
    //   735: iconst_1
    //   736: istore 69
    //   738: goto +6 -> 744
    //   741: iconst_0
    //   742: istore 69
    //   744: aload_3
    //   745: iload 30
    //   747: invokeinterface 150 2 0
    //   752: ifeq +9 -> 761
    //   755: iconst_1
    //   756: istore 70
    //   758: goto +6 -> 764
    //   761: iconst_0
    //   762: istore 70
    //   764: aload_3
    //   765: iload_1
    //   766: invokeinterface 384 2 0
    //   771: lstore 71
    //   773: aload_3
    //   774: iload 31
    //   776: invokeinterface 384 2 0
    //   781: lstore 73
    //   783: aload_3
    //   784: iload 32
    //   786: invokeinterface 269 2 0
    //   791: ifeq +10 -> 801
    //   794: aload 35
    //   796: astore 40
    //   798: goto +13 -> 811
    //   801: aload_3
    //   802: iload 32
    //   804: invokeinterface 273 2 0
    //   809: astore 40
    //   811: aload 40
    //   813: invokestatic 393	x2/z:a	([B)Ljava/util/LinkedHashSet;
    //   816: astore 35
    //   818: new 395	o2/c
    //   821: astore 40
    //   823: aload 40
    //   825: iload 66
    //   827: iload 67
    //   829: iload 68
    //   831: iload 69
    //   833: iload 70
    //   835: lload 71
    //   837: lload 73
    //   839: aload 35
    //   841: invokespecial 398	o2/c:<init>	(IZZZZJJLjava/util/Set;)V
    //   844: new 400	x2/s
    //   847: astore 35
    //   849: aload 35
    //   851: aload 36
    //   853: aload 37
    //   855: aload 38
    //   857: aload 39
    //   859: aload 41
    //   861: aload 42
    //   863: lload 43
    //   865: lload 45
    //   867: lload 47
    //   869: aload 40
    //   871: iload 49
    //   873: iload 50
    //   875: lload 51
    //   877: lload 53
    //   879: lload 55
    //   881: lload 57
    //   883: iload 34
    //   885: iload 59
    //   887: iload 60
    //   889: iload 61
    //   891: lload 62
    //   893: iload 64
    //   895: iload 65
    //   897: invokespecial 403	x2/s:<init>	(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIIJII)V
    //   900: aload 33
    //   902: aload 35
    //   904: invokevirtual 282	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   907: pop
    //   908: goto -591 -> 317
    //   911: aload_3
    //   912: invokeinterface 153 1 0
    //   917: aload_2
    //   918: invokevirtual 156	p1/l:H	()V
    //   921: aload 33
    //   923: areturn
    //   924: astore 36
    //   926: goto +5 -> 931
    //   929: astore 36
    //   931: aload_3
    //   932: invokeinterface 153 1 0
    //   937: aload_2
    //   938: invokevirtual 156	p1/l:H	()V
    //   941: aload 36
    //   943: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	944	0	this	u
    //   0	944	1	paramInt	int
    //   7	931	2	locall	p1.l
    //   31	901	3	localCursor	Cursor
    //   39	313	4	i1	int
    //   48	314	5	i2	int
    //   57	335	6	i3	int
    //   66	353	7	i4	int
    //   75	371	8	i5	int
    //   84	396	9	i6	int
    //   93	404	10	i7	int
    //   102	405	11	i8	int
    //   111	406	12	i9	int
    //   120	407	13	i10	int
    //   129	408	14	i11	int
    //   138	412	15	i12	int
    //   147	413	16	i13	int
    //   156	414	17	i14	int
    //   165	415	18	i15	int
    //   174	416	19	i16	int
    //   183	427	20	i17	int
    //   192	431	21	i18	int
    //   201	432	22	i19	int
    //   210	433	23	i20	int
    //   219	434	24	i21	int
    //   228	435	25	i22	int
    //   237	436	26	i23	int
    //   246	440	27	i24	int
    //   255	451	28	i25	int
    //   264	462	29	i26	int
    //   273	473	30	i27	int
    //   290	485	31	i28	int
    //   299	504	32	i29	int
    //   304	618	33	localArrayList	ArrayList
    //   334	550	34	bool1	boolean
    //   337	566	35	localObject1	Object
    //   345	507	36	str1	String
    //   924	1	36	localObject2	Object
    //   929	13	36	localObject3	Object
    //   371	483	37	localb	o.b
    //   385	471	38	str2	String
    //   412	446	39	str3	String
    //   439	431	40	localObject4	Object
    //   459	401	41	localc1	androidx.work.c
    //   493	369	42	localc2	androidx.work.c
    //   503	361	43	l1	long
    //   513	353	45	l2	long
    //   523	345	47	l3	long
    //   533	339	49	i30	int
    //   546	328	50	i31	int
    //   556	320	51	l4	long
    //   566	312	53	l5	long
    //   576	304	55	l6	long
    //   586	296	57	l7	long
    //   619	267	59	i32	int
    //   629	259	60	i33	int
    //   639	251	61	i34	int
    //   649	243	62	l8	long
    //   659	235	64	i35	int
    //   669	227	65	i36	int
    //   682	144	66	i37	int
    //   696	132	67	bool2	boolean
    //   716	114	68	bool3	boolean
    //   736	96	69	bool4	boolean
    //   756	78	70	bool5	boolean
    //   771	65	71	l9	long
    //   781	57	73	l10	long
    // Exception table:
    //   from	to	target	type
    //   158	306	924	finally
    //   306	317	924	finally
    //   317	336	924	finally
    //   350	360	924	finally
    //   360	384	924	finally
    //   390	400	924	finally
    //   400	411	924	finally
    //   417	427	924	finally
    //   427	438	924	finally
    //   444	454	924	finally
    //   454	472	924	finally
    //   478	488	924	finally
    //   488	588	924	finally
    //   588	599	924	finally
    //   608	621	924	finally
    //   621	631	924	finally
    //   631	641	924	finally
    //   641	651	924	finally
    //   651	661	924	finally
    //   661	671	924	finally
    //   671	684	924	finally
    //   684	695	924	finally
    //   704	715	924	finally
    //   724	735	924	finally
    //   744	755	924	finally
    //   764	773	924	finally
    //   773	783	924	finally
    //   783	794	924	finally
    //   801	811	924	finally
    //   811	844	924	finally
    //   844	908	924	finally
    //   32	158	929	finally
  }
  
  public final void j(int paramInt, String paramString)
  {
    a.b();
    t1.f localf = k.a();
    if (paramString == null) {
      localf.d0(1);
    } else {
      localf.n(1, paramString);
    }
    localf.F(2, paramInt);
    a.c();
    try
    {
      localf.p();
      a.n();
      return;
    }
    finally
    {
      a.j();
      k.d(localf);
    }
  }
  
  /* Error */
  public final ArrayList k()
  {
    // Byte code:
    //   0: iconst_0
    //   1: ldc_w 425
    //   4: invokestatic 130	p1/l:C	(ILjava/lang/String;)Lp1/l;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 75	x2/u:a	Lp1/j;
    //   12: invokevirtual 134	p1/j:b	()V
    //   15: aload_0
    //   16: getfield 75	x2/u:a	Lp1/j;
    //   19: aload_1
    //   20: iconst_0
    //   21: invokestatic 140	b/z:o	(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;
    //   24: astore_2
    //   25: aload_2
    //   26: ldc_w 310
    //   29: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   32: istore_3
    //   33: aload_2
    //   34: ldc_w 315
    //   37: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   40: istore 4
    //   42: aload_2
    //   43: ldc_w 317
    //   46: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   49: istore 5
    //   51: aload_2
    //   52: ldc_w 319
    //   55: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   58: istore 6
    //   60: aload_2
    //   61: ldc_w 321
    //   64: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 7
    //   69: aload_2
    //   70: ldc_w 323
    //   73: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   76: istore 8
    //   78: aload_2
    //   79: ldc_w 325
    //   82: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 9
    //   87: aload_2
    //   88: ldc_w 327
    //   91: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   94: istore 10
    //   96: aload_2
    //   97: ldc_w 329
    //   100: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   103: istore 11
    //   105: aload_2
    //   106: ldc_w 331
    //   109: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   112: istore 12
    //   114: aload_2
    //   115: ldc_w 333
    //   118: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   121: istore 13
    //   123: aload_2
    //   124: ldc_w 335
    //   127: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   130: istore 14
    //   132: aload_2
    //   133: ldc_w 337
    //   136: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   139: istore 15
    //   141: aload_2
    //   142: ldc_w 339
    //   145: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   148: istore 16
    //   150: aload_2
    //   151: ldc_w 341
    //   154: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   157: istore 17
    //   159: aload_2
    //   160: ldc_w 343
    //   163: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   166: istore 18
    //   168: aload_2
    //   169: ldc_w 345
    //   172: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   175: istore 19
    //   177: aload_2
    //   178: ldc_w 347
    //   181: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   184: istore 20
    //   186: aload_2
    //   187: ldc_w 349
    //   190: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   193: istore 21
    //   195: aload_2
    //   196: ldc_w 351
    //   199: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   202: istore 22
    //   204: aload_2
    //   205: ldc_w 353
    //   208: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   211: istore 23
    //   213: aload_2
    //   214: ldc_w 355
    //   217: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   220: istore 24
    //   222: aload_2
    //   223: ldc_w 357
    //   226: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   229: istore 25
    //   231: aload_2
    //   232: ldc_w 359
    //   235: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   238: istore 26
    //   240: aload_2
    //   241: ldc_w 361
    //   244: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   247: istore 27
    //   249: aload_2
    //   250: ldc_w 363
    //   253: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   256: istore 28
    //   258: aload_2
    //   259: ldc_w 365
    //   262: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   265: istore 29
    //   267: aload_2
    //   268: ldc_w 367
    //   271: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   274: istore 30
    //   276: aload_2
    //   277: ldc_w 369
    //   280: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   283: istore 31
    //   285: aload_2
    //   286: ldc_w 371
    //   289: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   292: istore 32
    //   294: new 215	java/util/ArrayList
    //   297: astore 33
    //   299: aload 33
    //   301: aload_2
    //   302: invokeinterface 374 1 0
    //   307: invokespecial 375	java/util/ArrayList:<init>	(I)V
    //   310: aload_2
    //   311: invokeinterface 261 1 0
    //   316: ifeq +587 -> 903
    //   319: aload_2
    //   320: iload_3
    //   321: invokeinterface 269 2 0
    //   326: istore 34
    //   328: aconst_null
    //   329: astore 35
    //   331: iload 34
    //   333: ifeq +9 -> 342
    //   336: aconst_null
    //   337: astore 36
    //   339: goto +12 -> 351
    //   342: aload_2
    //   343: iload_3
    //   344: invokeinterface 265 2 0
    //   349: astore 36
    //   351: aload_2
    //   352: iload 4
    //   354: invokeinterface 150 2 0
    //   359: invokestatic 380	x2/z:e	(I)Lo2/o$b;
    //   362: astore 37
    //   364: aload_2
    //   365: iload 5
    //   367: invokeinterface 269 2 0
    //   372: ifeq +9 -> 381
    //   375: aconst_null
    //   376: astore 38
    //   378: goto +13 -> 391
    //   381: aload_2
    //   382: iload 5
    //   384: invokeinterface 265 2 0
    //   389: astore 38
    //   391: aload_2
    //   392: iload 6
    //   394: invokeinterface 269 2 0
    //   399: ifeq +9 -> 408
    //   402: aconst_null
    //   403: astore 39
    //   405: goto +13 -> 418
    //   408: aload_2
    //   409: iload 6
    //   411: invokeinterface 265 2 0
    //   416: astore 39
    //   418: aload_2
    //   419: iload 7
    //   421: invokeinterface 269 2 0
    //   426: ifeq +9 -> 435
    //   429: aconst_null
    //   430: astore 40
    //   432: goto +13 -> 445
    //   435: aload_2
    //   436: iload 7
    //   438: invokeinterface 273 2 0
    //   443: astore 40
    //   445: aload 40
    //   447: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   450: astore 41
    //   452: aload_2
    //   453: iload 8
    //   455: invokeinterface 269 2 0
    //   460: ifeq +9 -> 469
    //   463: aconst_null
    //   464: astore 40
    //   466: goto +13 -> 479
    //   469: aload_2
    //   470: iload 8
    //   472: invokeinterface 273 2 0
    //   477: astore 40
    //   479: aload 40
    //   481: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   484: astore 42
    //   486: aload_2
    //   487: iload 9
    //   489: invokeinterface 384 2 0
    //   494: lstore 43
    //   496: aload_2
    //   497: iload 10
    //   499: invokeinterface 384 2 0
    //   504: lstore 45
    //   506: aload_2
    //   507: iload 11
    //   509: invokeinterface 384 2 0
    //   514: lstore 47
    //   516: aload_2
    //   517: iload 12
    //   519: invokeinterface 150 2 0
    //   524: istore 49
    //   526: aload_2
    //   527: iload 13
    //   529: invokeinterface 150 2 0
    //   534: invokestatic 386	x2/z:b	(I)I
    //   537: istore 50
    //   539: aload_2
    //   540: iload 14
    //   542: invokeinterface 384 2 0
    //   547: lstore 51
    //   549: aload_2
    //   550: iload 15
    //   552: invokeinterface 384 2 0
    //   557: lstore 53
    //   559: aload_2
    //   560: iload 16
    //   562: invokeinterface 384 2 0
    //   567: lstore 55
    //   569: aload_2
    //   570: iload 17
    //   572: invokeinterface 384 2 0
    //   577: lstore 57
    //   579: aload_2
    //   580: iload 18
    //   582: invokeinterface 150 2 0
    //   587: ifeq +9 -> 596
    //   590: iconst_1
    //   591: istore 34
    //   593: goto +6 -> 599
    //   596: iconst_0
    //   597: istore 34
    //   599: aload_2
    //   600: iload 19
    //   602: invokeinterface 150 2 0
    //   607: invokestatic 388	x2/z:d	(I)I
    //   610: istore 59
    //   612: aload_2
    //   613: iload 20
    //   615: invokeinterface 150 2 0
    //   620: istore 60
    //   622: aload_2
    //   623: iload 21
    //   625: invokeinterface 150 2 0
    //   630: istore 61
    //   632: aload_2
    //   633: iload 22
    //   635: invokeinterface 384 2 0
    //   640: lstore 62
    //   642: aload_2
    //   643: iload 23
    //   645: invokeinterface 150 2 0
    //   650: istore 64
    //   652: aload_2
    //   653: iload 24
    //   655: invokeinterface 150 2 0
    //   660: istore 65
    //   662: aload_2
    //   663: iload 25
    //   665: invokeinterface 150 2 0
    //   670: invokestatic 390	x2/z:c	(I)I
    //   673: istore 66
    //   675: aload_2
    //   676: iload 26
    //   678: invokeinterface 150 2 0
    //   683: ifeq +9 -> 692
    //   686: iconst_1
    //   687: istore 67
    //   689: goto +6 -> 695
    //   692: iconst_0
    //   693: istore 67
    //   695: aload_2
    //   696: iload 27
    //   698: invokeinterface 150 2 0
    //   703: ifeq +9 -> 712
    //   706: iconst_1
    //   707: istore 68
    //   709: goto +6 -> 715
    //   712: iconst_0
    //   713: istore 68
    //   715: aload_2
    //   716: iload 28
    //   718: invokeinterface 150 2 0
    //   723: ifeq +9 -> 732
    //   726: iconst_1
    //   727: istore 69
    //   729: goto +6 -> 735
    //   732: iconst_0
    //   733: istore 69
    //   735: aload_2
    //   736: iload 29
    //   738: invokeinterface 150 2 0
    //   743: ifeq +9 -> 752
    //   746: iconst_1
    //   747: istore 70
    //   749: goto +6 -> 755
    //   752: iconst_0
    //   753: istore 70
    //   755: aload_2
    //   756: iload 30
    //   758: invokeinterface 384 2 0
    //   763: lstore 71
    //   765: aload_2
    //   766: iload 31
    //   768: invokeinterface 384 2 0
    //   773: lstore 73
    //   775: aload_2
    //   776: iload 32
    //   778: invokeinterface 269 2 0
    //   783: ifeq +10 -> 793
    //   786: aload 35
    //   788: astore 40
    //   790: goto +13 -> 803
    //   793: aload_2
    //   794: iload 32
    //   796: invokeinterface 273 2 0
    //   801: astore 40
    //   803: aload 40
    //   805: invokestatic 393	x2/z:a	([B)Ljava/util/LinkedHashSet;
    //   808: astore 35
    //   810: new 395	o2/c
    //   813: astore 40
    //   815: aload 40
    //   817: iload 66
    //   819: iload 67
    //   821: iload 68
    //   823: iload 69
    //   825: iload 70
    //   827: lload 71
    //   829: lload 73
    //   831: aload 35
    //   833: invokespecial 398	o2/c:<init>	(IZZZZJJLjava/util/Set;)V
    //   836: new 400	x2/s
    //   839: astore 35
    //   841: aload 35
    //   843: aload 36
    //   845: aload 37
    //   847: aload 38
    //   849: aload 39
    //   851: aload 41
    //   853: aload 42
    //   855: lload 43
    //   857: lload 45
    //   859: lload 47
    //   861: aload 40
    //   863: iload 49
    //   865: iload 50
    //   867: lload 51
    //   869: lload 53
    //   871: lload 55
    //   873: lload 57
    //   875: iload 34
    //   877: iload 59
    //   879: iload 60
    //   881: iload 61
    //   883: lload 62
    //   885: iload 64
    //   887: iload 65
    //   889: invokespecial 403	x2/s:<init>	(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIIJII)V
    //   892: aload 33
    //   894: aload 35
    //   896: invokevirtual 282	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   899: pop
    //   900: goto -590 -> 310
    //   903: aload_2
    //   904: invokeinterface 153 1 0
    //   909: aload_1
    //   910: invokevirtual 156	p1/l:H	()V
    //   913: aload 33
    //   915: areturn
    //   916: astore 36
    //   918: goto +5 -> 923
    //   921: astore 36
    //   923: aload_2
    //   924: invokeinterface 153 1 0
    //   929: aload_1
    //   930: invokevirtual 156	p1/l:H	()V
    //   933: aload 36
    //   935: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	936	0	this	u
    //   7	923	1	locall	p1.l
    //   24	900	2	localCursor	Cursor
    //   32	312	3	i1	int
    //   40	313	4	i2	int
    //   49	334	5	i3	int
    //   58	352	6	i4	int
    //   67	370	7	i5	int
    //   76	395	8	i6	int
    //   85	403	9	i7	int
    //   94	404	10	i8	int
    //   103	405	11	i9	int
    //   112	406	12	i10	int
    //   121	407	13	i11	int
    //   130	411	14	i12	int
    //   139	412	15	i13	int
    //   148	413	16	i14	int
    //   157	414	17	i15	int
    //   166	415	18	i16	int
    //   175	426	19	i17	int
    //   184	430	20	i18	int
    //   193	431	21	i19	int
    //   202	432	22	i20	int
    //   211	433	23	i21	int
    //   220	434	24	i22	int
    //   229	435	25	i23	int
    //   238	439	26	i24	int
    //   247	450	27	i25	int
    //   256	461	28	i26	int
    //   265	472	29	i27	int
    //   274	483	30	i28	int
    //   283	484	31	i29	int
    //   292	503	32	i30	int
    //   297	617	33	localArrayList	ArrayList
    //   326	550	34	bool1	boolean
    //   329	566	35	localObject1	Object
    //   337	507	36	str1	String
    //   916	1	36	localObject2	Object
    //   921	13	36	localObject3	Object
    //   362	484	37	localb	o.b
    //   376	472	38	str2	String
    //   403	447	39	str3	String
    //   430	432	40	localObject4	Object
    //   450	402	41	localc1	androidx.work.c
    //   484	370	42	localc2	androidx.work.c
    //   494	362	43	l1	long
    //   504	354	45	l2	long
    //   514	346	47	l3	long
    //   524	340	49	i31	int
    //   537	329	50	i32	int
    //   547	321	51	l4	long
    //   557	313	53	l5	long
    //   567	305	55	l6	long
    //   577	297	57	l7	long
    //   610	268	59	i33	int
    //   620	260	60	i34	int
    //   630	252	61	i35	int
    //   640	244	62	l8	long
    //   650	236	64	i36	int
    //   660	228	65	i37	int
    //   673	145	66	i38	int
    //   687	133	67	bool2	boolean
    //   707	115	68	bool3	boolean
    //   727	97	69	bool4	boolean
    //   747	79	70	bool5	boolean
    //   763	65	71	l9	long
    //   773	57	73	l10	long
    // Exception table:
    //   from	to	target	type
    //   150	299	916	finally
    //   299	310	916	finally
    //   310	328	916	finally
    //   342	351	916	finally
    //   351	375	916	finally
    //   381	391	916	finally
    //   391	402	916	finally
    //   408	418	916	finally
    //   418	429	916	finally
    //   435	445	916	finally
    //   445	463	916	finally
    //   469	479	916	finally
    //   479	579	916	finally
    //   579	590	916	finally
    //   599	612	916	finally
    //   612	622	916	finally
    //   622	632	916	finally
    //   632	642	916	finally
    //   642	652	916	finally
    //   652	662	916	finally
    //   662	675	916	finally
    //   675	686	916	finally
    //   695	706	916	finally
    //   715	726	916	finally
    //   735	746	916	finally
    //   755	765	916	finally
    //   765	775	916	finally
    //   775	786	916	finally
    //   793	803	916	finally
    //   803	836	916	finally
    //   836	900	916	finally
    //   25	150	921	finally
  }
  
  public final void l(String paramString, androidx.work.c paramc)
  {
    a.b();
    t1.f localf = g.a();
    paramc = androidx.work.c.e(paramc);
    if (paramc == null) {
      localf.d0(1);
    } else {
      localf.T(paramc, 1);
    }
    if (paramString == null) {
      localf.d0(2);
    } else {
      localf.n(2, paramString);
    }
    a.c();
    try
    {
      localf.p();
      a.n();
      return;
    }
    finally
    {
      a.j();
      g.d(localf);
    }
  }
  
  public final void m(String paramString, long paramLong)
  {
    a.b();
    t1.f localf = h.a();
    localf.F(1, paramLong);
    if (paramString == null) {
      localf.d0(2);
    } else {
      localf.n(2, paramString);
    }
    a.c();
    try
    {
      localf.p();
      a.n();
      return;
    }
    finally
    {
      a.j();
      h.d(localf);
    }
  }
  
  /* Error */
  public final ArrayList n()
  {
    // Byte code:
    //   0: iconst_0
    //   1: ldc_w 436
    //   4: invokestatic 130	p1/l:C	(ILjava/lang/String;)Lp1/l;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 75	x2/u:a	Lp1/j;
    //   12: invokevirtual 134	p1/j:b	()V
    //   15: aload_0
    //   16: getfield 75	x2/u:a	Lp1/j;
    //   19: aload_1
    //   20: iconst_0
    //   21: invokestatic 140	b/z:o	(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;
    //   24: astore_2
    //   25: aload_2
    //   26: ldc_w 310
    //   29: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   32: istore_3
    //   33: aload_2
    //   34: ldc_w 315
    //   37: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   40: istore 4
    //   42: aload_2
    //   43: ldc_w 317
    //   46: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   49: istore 5
    //   51: aload_2
    //   52: ldc_w 319
    //   55: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   58: istore 6
    //   60: aload_2
    //   61: ldc_w 321
    //   64: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 7
    //   69: aload_2
    //   70: ldc_w 323
    //   73: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   76: istore 8
    //   78: aload_2
    //   79: ldc_w 325
    //   82: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 9
    //   87: aload_2
    //   88: ldc_w 327
    //   91: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   94: istore 10
    //   96: aload_2
    //   97: ldc_w 329
    //   100: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   103: istore 11
    //   105: aload_2
    //   106: ldc_w 331
    //   109: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   112: istore 12
    //   114: aload_2
    //   115: ldc_w 333
    //   118: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   121: istore 13
    //   123: aload_2
    //   124: ldc_w 335
    //   127: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   130: istore 14
    //   132: aload_2
    //   133: ldc_w 337
    //   136: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   139: istore 15
    //   141: aload_2
    //   142: ldc_w 339
    //   145: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   148: istore 16
    //   150: aload_2
    //   151: ldc_w 341
    //   154: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   157: istore 17
    //   159: aload_2
    //   160: ldc_w 343
    //   163: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   166: istore 18
    //   168: aload_2
    //   169: ldc_w 345
    //   172: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   175: istore 19
    //   177: aload_2
    //   178: ldc_w 347
    //   181: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   184: istore 20
    //   186: aload_2
    //   187: ldc_w 349
    //   190: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   193: istore 21
    //   195: aload_2
    //   196: ldc_w 351
    //   199: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   202: istore 22
    //   204: aload_2
    //   205: ldc_w 353
    //   208: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   211: istore 23
    //   213: aload_2
    //   214: ldc_w 355
    //   217: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   220: istore 24
    //   222: aload_2
    //   223: ldc_w 357
    //   226: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   229: istore 25
    //   231: aload_2
    //   232: ldc_w 359
    //   235: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   238: istore 26
    //   240: aload_2
    //   241: ldc_w 361
    //   244: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   247: istore 27
    //   249: aload_2
    //   250: ldc_w 363
    //   253: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   256: istore 28
    //   258: aload_2
    //   259: ldc_w 365
    //   262: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   265: istore 29
    //   267: aload_2
    //   268: ldc_w 367
    //   271: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   274: istore 30
    //   276: aload_2
    //   277: ldc_w 369
    //   280: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   283: istore 31
    //   285: aload_2
    //   286: ldc_w 371
    //   289: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   292: istore 32
    //   294: new 215	java/util/ArrayList
    //   297: astore 33
    //   299: aload 33
    //   301: aload_2
    //   302: invokeinterface 374 1 0
    //   307: invokespecial 375	java/util/ArrayList:<init>	(I)V
    //   310: aload_2
    //   311: invokeinterface 261 1 0
    //   316: ifeq +587 -> 903
    //   319: aload_2
    //   320: iload_3
    //   321: invokeinterface 269 2 0
    //   326: istore 34
    //   328: aconst_null
    //   329: astore 35
    //   331: iload 34
    //   333: ifeq +9 -> 342
    //   336: aconst_null
    //   337: astore 36
    //   339: goto +12 -> 351
    //   342: aload_2
    //   343: iload_3
    //   344: invokeinterface 265 2 0
    //   349: astore 36
    //   351: aload_2
    //   352: iload 4
    //   354: invokeinterface 150 2 0
    //   359: invokestatic 380	x2/z:e	(I)Lo2/o$b;
    //   362: astore 37
    //   364: aload_2
    //   365: iload 5
    //   367: invokeinterface 269 2 0
    //   372: ifeq +9 -> 381
    //   375: aconst_null
    //   376: astore 38
    //   378: goto +13 -> 391
    //   381: aload_2
    //   382: iload 5
    //   384: invokeinterface 265 2 0
    //   389: astore 38
    //   391: aload_2
    //   392: iload 6
    //   394: invokeinterface 269 2 0
    //   399: ifeq +9 -> 408
    //   402: aconst_null
    //   403: astore 39
    //   405: goto +13 -> 418
    //   408: aload_2
    //   409: iload 6
    //   411: invokeinterface 265 2 0
    //   416: astore 39
    //   418: aload_2
    //   419: iload 7
    //   421: invokeinterface 269 2 0
    //   426: ifeq +9 -> 435
    //   429: aconst_null
    //   430: astore 40
    //   432: goto +13 -> 445
    //   435: aload_2
    //   436: iload 7
    //   438: invokeinterface 273 2 0
    //   443: astore 40
    //   445: aload 40
    //   447: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   450: astore 41
    //   452: aload_2
    //   453: iload 8
    //   455: invokeinterface 269 2 0
    //   460: ifeq +9 -> 469
    //   463: aconst_null
    //   464: astore 40
    //   466: goto +13 -> 479
    //   469: aload_2
    //   470: iload 8
    //   472: invokeinterface 273 2 0
    //   477: astore 40
    //   479: aload 40
    //   481: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   484: astore 42
    //   486: aload_2
    //   487: iload 9
    //   489: invokeinterface 384 2 0
    //   494: lstore 43
    //   496: aload_2
    //   497: iload 10
    //   499: invokeinterface 384 2 0
    //   504: lstore 45
    //   506: aload_2
    //   507: iload 11
    //   509: invokeinterface 384 2 0
    //   514: lstore 47
    //   516: aload_2
    //   517: iload 12
    //   519: invokeinterface 150 2 0
    //   524: istore 49
    //   526: aload_2
    //   527: iload 13
    //   529: invokeinterface 150 2 0
    //   534: invokestatic 386	x2/z:b	(I)I
    //   537: istore 50
    //   539: aload_2
    //   540: iload 14
    //   542: invokeinterface 384 2 0
    //   547: lstore 51
    //   549: aload_2
    //   550: iload 15
    //   552: invokeinterface 384 2 0
    //   557: lstore 53
    //   559: aload_2
    //   560: iload 16
    //   562: invokeinterface 384 2 0
    //   567: lstore 55
    //   569: aload_2
    //   570: iload 17
    //   572: invokeinterface 384 2 0
    //   577: lstore 57
    //   579: aload_2
    //   580: iload 18
    //   582: invokeinterface 150 2 0
    //   587: ifeq +9 -> 596
    //   590: iconst_1
    //   591: istore 34
    //   593: goto +6 -> 599
    //   596: iconst_0
    //   597: istore 34
    //   599: aload_2
    //   600: iload 19
    //   602: invokeinterface 150 2 0
    //   607: invokestatic 388	x2/z:d	(I)I
    //   610: istore 59
    //   612: aload_2
    //   613: iload 20
    //   615: invokeinterface 150 2 0
    //   620: istore 60
    //   622: aload_2
    //   623: iload 21
    //   625: invokeinterface 150 2 0
    //   630: istore 61
    //   632: aload_2
    //   633: iload 22
    //   635: invokeinterface 384 2 0
    //   640: lstore 62
    //   642: aload_2
    //   643: iload 23
    //   645: invokeinterface 150 2 0
    //   650: istore 64
    //   652: aload_2
    //   653: iload 24
    //   655: invokeinterface 150 2 0
    //   660: istore 65
    //   662: aload_2
    //   663: iload 25
    //   665: invokeinterface 150 2 0
    //   670: invokestatic 390	x2/z:c	(I)I
    //   673: istore 66
    //   675: aload_2
    //   676: iload 26
    //   678: invokeinterface 150 2 0
    //   683: ifeq +9 -> 692
    //   686: iconst_1
    //   687: istore 67
    //   689: goto +6 -> 695
    //   692: iconst_0
    //   693: istore 67
    //   695: aload_2
    //   696: iload 27
    //   698: invokeinterface 150 2 0
    //   703: ifeq +9 -> 712
    //   706: iconst_1
    //   707: istore 68
    //   709: goto +6 -> 715
    //   712: iconst_0
    //   713: istore 68
    //   715: aload_2
    //   716: iload 28
    //   718: invokeinterface 150 2 0
    //   723: ifeq +9 -> 732
    //   726: iconst_1
    //   727: istore 69
    //   729: goto +6 -> 735
    //   732: iconst_0
    //   733: istore 69
    //   735: aload_2
    //   736: iload 29
    //   738: invokeinterface 150 2 0
    //   743: ifeq +9 -> 752
    //   746: iconst_1
    //   747: istore 70
    //   749: goto +6 -> 755
    //   752: iconst_0
    //   753: istore 70
    //   755: aload_2
    //   756: iload 30
    //   758: invokeinterface 384 2 0
    //   763: lstore 71
    //   765: aload_2
    //   766: iload 31
    //   768: invokeinterface 384 2 0
    //   773: lstore 73
    //   775: aload_2
    //   776: iload 32
    //   778: invokeinterface 269 2 0
    //   783: ifeq +10 -> 793
    //   786: aload 35
    //   788: astore 40
    //   790: goto +13 -> 803
    //   793: aload_2
    //   794: iload 32
    //   796: invokeinterface 273 2 0
    //   801: astore 40
    //   803: aload 40
    //   805: invokestatic 393	x2/z:a	([B)Ljava/util/LinkedHashSet;
    //   808: astore 35
    //   810: new 395	o2/c
    //   813: astore 40
    //   815: aload 40
    //   817: iload 66
    //   819: iload 67
    //   821: iload 68
    //   823: iload 69
    //   825: iload 70
    //   827: lload 71
    //   829: lload 73
    //   831: aload 35
    //   833: invokespecial 398	o2/c:<init>	(IZZZZJJLjava/util/Set;)V
    //   836: new 400	x2/s
    //   839: astore 35
    //   841: aload 35
    //   843: aload 36
    //   845: aload 37
    //   847: aload 38
    //   849: aload 39
    //   851: aload 41
    //   853: aload 42
    //   855: lload 43
    //   857: lload 45
    //   859: lload 47
    //   861: aload 40
    //   863: iload 49
    //   865: iload 50
    //   867: lload 51
    //   869: lload 53
    //   871: lload 55
    //   873: lload 57
    //   875: iload 34
    //   877: iload 59
    //   879: iload 60
    //   881: iload 61
    //   883: lload 62
    //   885: iload 64
    //   887: iload 65
    //   889: invokespecial 403	x2/s:<init>	(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIIJII)V
    //   892: aload 33
    //   894: aload 35
    //   896: invokevirtual 282	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   899: pop
    //   900: goto -590 -> 310
    //   903: aload_2
    //   904: invokeinterface 153 1 0
    //   909: aload_1
    //   910: invokevirtual 156	p1/l:H	()V
    //   913: aload 33
    //   915: areturn
    //   916: astore 36
    //   918: goto +5 -> 923
    //   921: astore 36
    //   923: aload_2
    //   924: invokeinterface 153 1 0
    //   929: aload_1
    //   930: invokevirtual 156	p1/l:H	()V
    //   933: aload 36
    //   935: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	936	0	this	u
    //   7	923	1	locall	p1.l
    //   24	900	2	localCursor	Cursor
    //   32	312	3	i1	int
    //   40	313	4	i2	int
    //   49	334	5	i3	int
    //   58	352	6	i4	int
    //   67	370	7	i5	int
    //   76	395	8	i6	int
    //   85	403	9	i7	int
    //   94	404	10	i8	int
    //   103	405	11	i9	int
    //   112	406	12	i10	int
    //   121	407	13	i11	int
    //   130	411	14	i12	int
    //   139	412	15	i13	int
    //   148	413	16	i14	int
    //   157	414	17	i15	int
    //   166	415	18	i16	int
    //   175	426	19	i17	int
    //   184	430	20	i18	int
    //   193	431	21	i19	int
    //   202	432	22	i20	int
    //   211	433	23	i21	int
    //   220	434	24	i22	int
    //   229	435	25	i23	int
    //   238	439	26	i24	int
    //   247	450	27	i25	int
    //   256	461	28	i26	int
    //   265	472	29	i27	int
    //   274	483	30	i28	int
    //   283	484	31	i29	int
    //   292	503	32	i30	int
    //   297	617	33	localArrayList	ArrayList
    //   326	550	34	bool1	boolean
    //   329	566	35	localObject1	Object
    //   337	507	36	str1	String
    //   916	1	36	localObject2	Object
    //   921	13	36	localObject3	Object
    //   362	484	37	localb	o.b
    //   376	472	38	str2	String
    //   403	447	39	str3	String
    //   430	432	40	localObject4	Object
    //   450	402	41	localc1	androidx.work.c
    //   484	370	42	localc2	androidx.work.c
    //   494	362	43	l1	long
    //   504	354	45	l2	long
    //   514	346	47	l3	long
    //   524	340	49	i31	int
    //   537	329	50	i32	int
    //   547	321	51	l4	long
    //   557	313	53	l5	long
    //   567	305	55	l6	long
    //   577	297	57	l7	long
    //   610	268	59	i33	int
    //   620	260	60	i34	int
    //   630	252	61	i35	int
    //   640	244	62	l8	long
    //   650	236	64	i36	int
    //   660	228	65	i37	int
    //   673	145	66	i38	int
    //   687	133	67	bool2	boolean
    //   707	115	68	bool3	boolean
    //   727	97	69	bool4	boolean
    //   747	79	70	bool5	boolean
    //   763	65	71	l9	long
    //   773	57	73	l10	long
    // Exception table:
    //   from	to	target	type
    //   150	299	916	finally
    //   299	310	916	finally
    //   310	328	916	finally
    //   342	351	916	finally
    //   351	375	916	finally
    //   381	391	916	finally
    //   391	402	916	finally
    //   408	418	916	finally
    //   418	429	916	finally
    //   435	445	916	finally
    //   445	463	916	finally
    //   469	479	916	finally
    //   479	579	916	finally
    //   579	590	916	finally
    //   599	612	916	finally
    //   612	622	916	finally
    //   622	632	916	finally
    //   632	642	916	finally
    //   642	652	916	finally
    //   652	662	916	finally
    //   662	675	916	finally
    //   675	686	916	finally
    //   695	706	916	finally
    //   715	726	916	finally
    //   735	746	916	finally
    //   755	765	916	finally
    //   765	775	916	finally
    //   775	786	916	finally
    //   793	803	916	finally
    //   803	836	916	finally
    //   836	900	916	finally
    //   25	150	921	finally
  }
  
  public final void o(int paramInt, String paramString)
  {
    a.b();
    t1.f localf = n.a();
    localf.F(1, paramInt);
    if (paramString == null) {
      localf.d0(2);
    } else {
      localf.n(2, paramString);
    }
    a.c();
    try
    {
      localf.p();
      a.n();
      return;
    }
    finally
    {
      a.j();
      n.d(localf);
    }
  }
  
  public final boolean p()
  {
    boolean bool1 = false;
    p1.l locall = p1.l.C(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
    a.b();
    Cursor localCursor = b.z.o(a, locall, false);
    boolean bool2 = bool1;
    try
    {
      if (localCursor.moveToFirst())
      {
        int i1 = localCursor.getInt(0);
        bool2 = bool1;
        if (i1 != 0) {
          bool2 = true;
        }
      }
      return bool2;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  public final ArrayList q(String paramString)
  {
    p1.l locall = p1.l.C(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
    if (paramString == null) {
      locall.d0(1);
    } else {
      locall.n(1, paramString);
    }
    a.b();
    Cursor localCursor = b.z.o(a, locall, false);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext())
      {
        if (localCursor.isNull(0)) {
          paramString = null;
        } else {
          paramString = localCursor.getString(0);
        }
        localArrayList.add(paramString);
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  /* Error */
  public final ArrayList r()
  {
    // Byte code:
    //   0: iconst_0
    //   1: ldc_w 444
    //   4: invokestatic 130	p1/l:C	(ILjava/lang/String;)Lp1/l;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 75	x2/u:a	Lp1/j;
    //   12: invokevirtual 134	p1/j:b	()V
    //   15: aload_0
    //   16: getfield 75	x2/u:a	Lp1/j;
    //   19: aload_1
    //   20: iconst_0
    //   21: invokestatic 140	b/z:o	(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;
    //   24: astore_2
    //   25: aload_2
    //   26: ldc_w 310
    //   29: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   32: istore_3
    //   33: aload_2
    //   34: ldc_w 315
    //   37: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   40: istore 4
    //   42: aload_2
    //   43: ldc_w 317
    //   46: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   49: istore 5
    //   51: aload_2
    //   52: ldc_w 319
    //   55: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   58: istore 6
    //   60: aload_2
    //   61: ldc_w 321
    //   64: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 7
    //   69: aload_2
    //   70: ldc_w 323
    //   73: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   76: istore 8
    //   78: aload_2
    //   79: ldc_w 325
    //   82: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 9
    //   87: aload_2
    //   88: ldc_w 327
    //   91: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   94: istore 10
    //   96: aload_2
    //   97: ldc_w 329
    //   100: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   103: istore 11
    //   105: aload_2
    //   106: ldc_w 331
    //   109: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   112: istore 12
    //   114: aload_2
    //   115: ldc_w 333
    //   118: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   121: istore 13
    //   123: aload_2
    //   124: ldc_w 335
    //   127: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   130: istore 14
    //   132: aload_2
    //   133: ldc_w 337
    //   136: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   139: istore 15
    //   141: aload_2
    //   142: ldc_w 339
    //   145: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   148: istore 16
    //   150: aload_2
    //   151: ldc_w 341
    //   154: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   157: istore 17
    //   159: aload_2
    //   160: ldc_w 343
    //   163: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   166: istore 18
    //   168: aload_2
    //   169: ldc_w 345
    //   172: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   175: istore 19
    //   177: aload_2
    //   178: ldc_w 347
    //   181: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   184: istore 20
    //   186: aload_2
    //   187: ldc_w 349
    //   190: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   193: istore 21
    //   195: aload_2
    //   196: ldc_w 351
    //   199: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   202: istore 22
    //   204: aload_2
    //   205: ldc_w 353
    //   208: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   211: istore 23
    //   213: aload_2
    //   214: ldc_w 355
    //   217: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   220: istore 24
    //   222: aload_2
    //   223: ldc_w 357
    //   226: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   229: istore 25
    //   231: aload_2
    //   232: ldc_w 359
    //   235: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   238: istore 26
    //   240: aload_2
    //   241: ldc_w 361
    //   244: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   247: istore 27
    //   249: aload_2
    //   250: ldc_w 363
    //   253: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   256: istore 28
    //   258: aload_2
    //   259: ldc_w 365
    //   262: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   265: istore 29
    //   267: aload_2
    //   268: ldc_w 367
    //   271: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   274: istore 30
    //   276: aload_2
    //   277: ldc_w 369
    //   280: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   283: istore 31
    //   285: aload_2
    //   286: ldc_w 371
    //   289: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   292: istore 32
    //   294: new 215	java/util/ArrayList
    //   297: astore 33
    //   299: aload 33
    //   301: aload_2
    //   302: invokeinterface 374 1 0
    //   307: invokespecial 375	java/util/ArrayList:<init>	(I)V
    //   310: aload_2
    //   311: invokeinterface 261 1 0
    //   316: ifeq +587 -> 903
    //   319: aload_2
    //   320: iload_3
    //   321: invokeinterface 269 2 0
    //   326: istore 34
    //   328: aconst_null
    //   329: astore 35
    //   331: iload 34
    //   333: ifeq +9 -> 342
    //   336: aconst_null
    //   337: astore 36
    //   339: goto +12 -> 351
    //   342: aload_2
    //   343: iload_3
    //   344: invokeinterface 265 2 0
    //   349: astore 36
    //   351: aload_2
    //   352: iload 4
    //   354: invokeinterface 150 2 0
    //   359: invokestatic 380	x2/z:e	(I)Lo2/o$b;
    //   362: astore 37
    //   364: aload_2
    //   365: iload 5
    //   367: invokeinterface 269 2 0
    //   372: ifeq +9 -> 381
    //   375: aconst_null
    //   376: astore 38
    //   378: goto +13 -> 391
    //   381: aload_2
    //   382: iload 5
    //   384: invokeinterface 265 2 0
    //   389: astore 38
    //   391: aload_2
    //   392: iload 6
    //   394: invokeinterface 269 2 0
    //   399: ifeq +9 -> 408
    //   402: aconst_null
    //   403: astore 39
    //   405: goto +13 -> 418
    //   408: aload_2
    //   409: iload 6
    //   411: invokeinterface 265 2 0
    //   416: astore 39
    //   418: aload_2
    //   419: iload 7
    //   421: invokeinterface 269 2 0
    //   426: ifeq +9 -> 435
    //   429: aconst_null
    //   430: astore 40
    //   432: goto +13 -> 445
    //   435: aload_2
    //   436: iload 7
    //   438: invokeinterface 273 2 0
    //   443: astore 40
    //   445: aload 40
    //   447: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   450: astore 41
    //   452: aload_2
    //   453: iload 8
    //   455: invokeinterface 269 2 0
    //   460: ifeq +9 -> 469
    //   463: aconst_null
    //   464: astore 40
    //   466: goto +13 -> 479
    //   469: aload_2
    //   470: iload 8
    //   472: invokeinterface 273 2 0
    //   477: astore 40
    //   479: aload 40
    //   481: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   484: astore 42
    //   486: aload_2
    //   487: iload 9
    //   489: invokeinterface 384 2 0
    //   494: lstore 43
    //   496: aload_2
    //   497: iload 10
    //   499: invokeinterface 384 2 0
    //   504: lstore 45
    //   506: aload_2
    //   507: iload 11
    //   509: invokeinterface 384 2 0
    //   514: lstore 47
    //   516: aload_2
    //   517: iload 12
    //   519: invokeinterface 150 2 0
    //   524: istore 49
    //   526: aload_2
    //   527: iload 13
    //   529: invokeinterface 150 2 0
    //   534: invokestatic 386	x2/z:b	(I)I
    //   537: istore 50
    //   539: aload_2
    //   540: iload 14
    //   542: invokeinterface 384 2 0
    //   547: lstore 51
    //   549: aload_2
    //   550: iload 15
    //   552: invokeinterface 384 2 0
    //   557: lstore 53
    //   559: aload_2
    //   560: iload 16
    //   562: invokeinterface 384 2 0
    //   567: lstore 55
    //   569: aload_2
    //   570: iload 17
    //   572: invokeinterface 384 2 0
    //   577: lstore 57
    //   579: aload_2
    //   580: iload 18
    //   582: invokeinterface 150 2 0
    //   587: ifeq +9 -> 596
    //   590: iconst_1
    //   591: istore 34
    //   593: goto +6 -> 599
    //   596: iconst_0
    //   597: istore 34
    //   599: aload_2
    //   600: iload 19
    //   602: invokeinterface 150 2 0
    //   607: invokestatic 388	x2/z:d	(I)I
    //   610: istore 59
    //   612: aload_2
    //   613: iload 20
    //   615: invokeinterface 150 2 0
    //   620: istore 60
    //   622: aload_2
    //   623: iload 21
    //   625: invokeinterface 150 2 0
    //   630: istore 61
    //   632: aload_2
    //   633: iload 22
    //   635: invokeinterface 384 2 0
    //   640: lstore 62
    //   642: aload_2
    //   643: iload 23
    //   645: invokeinterface 150 2 0
    //   650: istore 64
    //   652: aload_2
    //   653: iload 24
    //   655: invokeinterface 150 2 0
    //   660: istore 65
    //   662: aload_2
    //   663: iload 25
    //   665: invokeinterface 150 2 0
    //   670: invokestatic 390	x2/z:c	(I)I
    //   673: istore 66
    //   675: aload_2
    //   676: iload 26
    //   678: invokeinterface 150 2 0
    //   683: ifeq +9 -> 692
    //   686: iconst_1
    //   687: istore 67
    //   689: goto +6 -> 695
    //   692: iconst_0
    //   693: istore 67
    //   695: aload_2
    //   696: iload 27
    //   698: invokeinterface 150 2 0
    //   703: ifeq +9 -> 712
    //   706: iconst_1
    //   707: istore 68
    //   709: goto +6 -> 715
    //   712: iconst_0
    //   713: istore 68
    //   715: aload_2
    //   716: iload 28
    //   718: invokeinterface 150 2 0
    //   723: ifeq +9 -> 732
    //   726: iconst_1
    //   727: istore 69
    //   729: goto +6 -> 735
    //   732: iconst_0
    //   733: istore 69
    //   735: aload_2
    //   736: iload 29
    //   738: invokeinterface 150 2 0
    //   743: ifeq +9 -> 752
    //   746: iconst_1
    //   747: istore 70
    //   749: goto +6 -> 755
    //   752: iconst_0
    //   753: istore 70
    //   755: aload_2
    //   756: iload 30
    //   758: invokeinterface 384 2 0
    //   763: lstore 71
    //   765: aload_2
    //   766: iload 31
    //   768: invokeinterface 384 2 0
    //   773: lstore 73
    //   775: aload_2
    //   776: iload 32
    //   778: invokeinterface 269 2 0
    //   783: ifeq +10 -> 793
    //   786: aload 35
    //   788: astore 40
    //   790: goto +13 -> 803
    //   793: aload_2
    //   794: iload 32
    //   796: invokeinterface 273 2 0
    //   801: astore 40
    //   803: aload 40
    //   805: invokestatic 393	x2/z:a	([B)Ljava/util/LinkedHashSet;
    //   808: astore 35
    //   810: new 395	o2/c
    //   813: astore 40
    //   815: aload 40
    //   817: iload 66
    //   819: iload 67
    //   821: iload 68
    //   823: iload 69
    //   825: iload 70
    //   827: lload 71
    //   829: lload 73
    //   831: aload 35
    //   833: invokespecial 398	o2/c:<init>	(IZZZZJJLjava/util/Set;)V
    //   836: new 400	x2/s
    //   839: astore 35
    //   841: aload 35
    //   843: aload 36
    //   845: aload 37
    //   847: aload 38
    //   849: aload 39
    //   851: aload 41
    //   853: aload 42
    //   855: lload 43
    //   857: lload 45
    //   859: lload 47
    //   861: aload 40
    //   863: iload 49
    //   865: iload 50
    //   867: lload 51
    //   869: lload 53
    //   871: lload 55
    //   873: lload 57
    //   875: iload 34
    //   877: iload 59
    //   879: iload 60
    //   881: iload 61
    //   883: lload 62
    //   885: iload 64
    //   887: iload 65
    //   889: invokespecial 403	x2/s:<init>	(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIIJII)V
    //   892: aload 33
    //   894: aload 35
    //   896: invokevirtual 282	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   899: pop
    //   900: goto -590 -> 310
    //   903: aload_2
    //   904: invokeinterface 153 1 0
    //   909: aload_1
    //   910: invokevirtual 156	p1/l:H	()V
    //   913: aload 33
    //   915: areturn
    //   916: astore 36
    //   918: goto +5 -> 923
    //   921: astore 36
    //   923: aload_2
    //   924: invokeinterface 153 1 0
    //   929: aload_1
    //   930: invokevirtual 156	p1/l:H	()V
    //   933: aload 36
    //   935: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	936	0	this	u
    //   7	923	1	locall	p1.l
    //   24	900	2	localCursor	Cursor
    //   32	312	3	i1	int
    //   40	313	4	i2	int
    //   49	334	5	i3	int
    //   58	352	6	i4	int
    //   67	370	7	i5	int
    //   76	395	8	i6	int
    //   85	403	9	i7	int
    //   94	404	10	i8	int
    //   103	405	11	i9	int
    //   112	406	12	i10	int
    //   121	407	13	i11	int
    //   130	411	14	i12	int
    //   139	412	15	i13	int
    //   148	413	16	i14	int
    //   157	414	17	i15	int
    //   166	415	18	i16	int
    //   175	426	19	i17	int
    //   184	430	20	i18	int
    //   193	431	21	i19	int
    //   202	432	22	i20	int
    //   211	433	23	i21	int
    //   220	434	24	i22	int
    //   229	435	25	i23	int
    //   238	439	26	i24	int
    //   247	450	27	i25	int
    //   256	461	28	i26	int
    //   265	472	29	i27	int
    //   274	483	30	i28	int
    //   283	484	31	i29	int
    //   292	503	32	i30	int
    //   297	617	33	localArrayList	ArrayList
    //   326	550	34	bool1	boolean
    //   329	566	35	localObject1	Object
    //   337	507	36	str1	String
    //   916	1	36	localObject2	Object
    //   921	13	36	localObject3	Object
    //   362	484	37	localb	o.b
    //   376	472	38	str2	String
    //   403	447	39	str3	String
    //   430	432	40	localObject4	Object
    //   450	402	41	localc1	androidx.work.c
    //   484	370	42	localc2	androidx.work.c
    //   494	362	43	l1	long
    //   504	354	45	l2	long
    //   514	346	47	l3	long
    //   524	340	49	i31	int
    //   537	329	50	i32	int
    //   547	321	51	l4	long
    //   557	313	53	l5	long
    //   567	305	55	l6	long
    //   577	297	57	l7	long
    //   610	268	59	i33	int
    //   620	260	60	i34	int
    //   630	252	61	i35	int
    //   640	244	62	l8	long
    //   650	236	64	i36	int
    //   660	228	65	i37	int
    //   673	145	66	i38	int
    //   687	133	67	bool2	boolean
    //   707	115	68	bool3	boolean
    //   727	97	69	bool4	boolean
    //   747	79	70	bool5	boolean
    //   763	65	71	l9	long
    //   773	57	73	l10	long
    // Exception table:
    //   from	to	target	type
    //   150	299	916	finally
    //   299	310	916	finally
    //   310	328	916	finally
    //   342	351	916	finally
    //   351	375	916	finally
    //   381	391	916	finally
    //   391	402	916	finally
    //   408	418	916	finally
    //   418	429	916	finally
    //   435	445	916	finally
    //   445	463	916	finally
    //   469	479	916	finally
    //   479	579	916	finally
    //   579	590	916	finally
    //   599	612	916	finally
    //   612	622	916	finally
    //   622	632	916	finally
    //   632	642	916	finally
    //   642	652	916	finally
    //   652	662	916	finally
    //   662	675	916	finally
    //   675	686	916	finally
    //   695	706	916	finally
    //   715	726	916	finally
    //   735	746	916	finally
    //   755	765	916	finally
    //   765	775	916	finally
    //   775	786	916	finally
    //   793	803	916	finally
    //   803	836	916	finally
    //   836	900	916	finally
    //   25	150	921	finally
  }
  
  public final o.b s(String paramString)
  {
    p1.l locall = p1.l.C(1, "SELECT state FROM workspec WHERE id=?");
    if (paramString == null) {
      locall.d0(1);
    } else {
      locall.n(1, paramString);
    }
    a.b();
    paramString = a;
    Object localObject = null;
    Cursor localCursor = b.z.o(paramString, locall, false);
    paramString = (String)localObject;
    try
    {
      if (localCursor.moveToFirst())
      {
        if (localCursor.isNull(0)) {
          paramString = null;
        } else {
          paramString = Integer.valueOf(localCursor.getInt(0));
        }
        if (paramString == null) {
          paramString = (String)localObject;
        } else {
          paramString = z.e(paramString.intValue());
        }
      }
      return paramString;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  /* Error */
  public final s t(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: ldc_w 461
    //   4: invokestatic 130	p1/l:C	(ILjava/lang/String;)Lp1/l;
    //   7: astore_2
    //   8: aload_1
    //   9: ifnonnull +11 -> 20
    //   12: aload_2
    //   13: iconst_1
    //   14: invokevirtual 247	p1/l:d0	(I)V
    //   17: goto +9 -> 26
    //   20: aload_2
    //   21: iconst_1
    //   22: aload_1
    //   23: invokevirtual 250	p1/l:n	(ILjava/lang/String;)V
    //   26: aload_0
    //   27: getfield 75	x2/u:a	Lp1/j;
    //   30: invokevirtual 134	p1/j:b	()V
    //   33: aload_0
    //   34: getfield 75	x2/u:a	Lp1/j;
    //   37: aload_2
    //   38: iconst_0
    //   39: invokestatic 140	b/z:o	(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;
    //   42: astore_3
    //   43: aload_3
    //   44: ldc_w 310
    //   47: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   50: istore 4
    //   52: aload_3
    //   53: ldc_w 315
    //   56: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   59: istore 5
    //   61: aload_3
    //   62: ldc_w 317
    //   65: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   68: istore 6
    //   70: aload_3
    //   71: ldc_w 319
    //   74: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   77: istore 7
    //   79: aload_3
    //   80: ldc_w 321
    //   83: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   86: istore 8
    //   88: aload_3
    //   89: ldc_w 323
    //   92: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   95: istore 9
    //   97: aload_3
    //   98: ldc_w 325
    //   101: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   104: istore 10
    //   106: aload_3
    //   107: ldc_w 327
    //   110: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   113: istore 11
    //   115: aload_3
    //   116: ldc_w 329
    //   119: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   122: istore 12
    //   124: aload_3
    //   125: ldc_w 331
    //   128: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   131: istore 13
    //   133: aload_3
    //   134: ldc_w 333
    //   137: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   140: istore 14
    //   142: aload_3
    //   143: ldc_w 335
    //   146: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   149: istore 15
    //   151: aload_3
    //   152: ldc_w 337
    //   155: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   158: istore 16
    //   160: aload_3
    //   161: ldc_w 339
    //   164: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   167: istore 17
    //   169: aload_3
    //   170: ldc_w 341
    //   173: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   176: istore 18
    //   178: aload_3
    //   179: ldc_w 343
    //   182: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   185: istore 19
    //   187: aload_3
    //   188: ldc_w 345
    //   191: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   194: istore 20
    //   196: aload_3
    //   197: ldc_w 347
    //   200: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   203: istore 21
    //   205: aload_3
    //   206: ldc_w 349
    //   209: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   212: istore 22
    //   214: aload_3
    //   215: ldc_w 351
    //   218: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   221: istore 23
    //   223: aload_3
    //   224: ldc_w 353
    //   227: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   230: istore 24
    //   232: aload_3
    //   233: ldc_w 355
    //   236: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   239: istore 25
    //   241: aload_3
    //   242: ldc_w 357
    //   245: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   248: istore 26
    //   250: aload_3
    //   251: ldc_w 359
    //   254: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   257: istore 27
    //   259: aload_3
    //   260: ldc_w 361
    //   263: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   266: istore 28
    //   268: aload_3
    //   269: ldc_w 363
    //   272: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   275: istore 29
    //   277: aload_3
    //   278: ldc_w 365
    //   281: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   284: istore 30
    //   286: aload_3
    //   287: ldc_w 367
    //   290: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   293: istore 31
    //   295: aload_3
    //   296: ldc_w 369
    //   299: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   302: istore 32
    //   304: aload_3
    //   305: ldc_w 371
    //   308: invokestatic 313	p2/m0:J	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   311: istore 33
    //   313: aload_3
    //   314: invokeinterface 146 1 0
    //   319: istore 34
    //   321: aconst_null
    //   322: astore_1
    //   323: aconst_null
    //   324: astore 35
    //   326: iload 34
    //   328: ifeq +566 -> 894
    //   331: aload_3
    //   332: iload 4
    //   334: invokeinterface 269 2 0
    //   339: ifeq +8 -> 347
    //   342: aconst_null
    //   343: astore_1
    //   344: goto +12 -> 356
    //   347: aload_3
    //   348: iload 4
    //   350: invokeinterface 265 2 0
    //   355: astore_1
    //   356: aload_3
    //   357: iload 5
    //   359: invokeinterface 150 2 0
    //   364: invokestatic 380	x2/z:e	(I)Lo2/o$b;
    //   367: astore 36
    //   369: aload_3
    //   370: iload 6
    //   372: invokeinterface 269 2 0
    //   377: ifeq +9 -> 386
    //   380: aconst_null
    //   381: astore 37
    //   383: goto +13 -> 396
    //   386: aload_3
    //   387: iload 6
    //   389: invokeinterface 265 2 0
    //   394: astore 37
    //   396: aload_3
    //   397: iload 7
    //   399: invokeinterface 269 2 0
    //   404: ifeq +9 -> 413
    //   407: aconst_null
    //   408: astore 38
    //   410: goto +13 -> 423
    //   413: aload_3
    //   414: iload 7
    //   416: invokeinterface 265 2 0
    //   421: astore 38
    //   423: aload_3
    //   424: iload 8
    //   426: invokeinterface 269 2 0
    //   431: ifeq +9 -> 440
    //   434: aconst_null
    //   435: astore 39
    //   437: goto +13 -> 450
    //   440: aload_3
    //   441: iload 8
    //   443: invokeinterface 273 2 0
    //   448: astore 39
    //   450: aload 39
    //   452: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   455: astore 40
    //   457: aload_3
    //   458: iload 9
    //   460: invokeinterface 269 2 0
    //   465: ifeq +9 -> 474
    //   468: aconst_null
    //   469: astore 39
    //   471: goto +13 -> 484
    //   474: aload_3
    //   475: iload 9
    //   477: invokeinterface 273 2 0
    //   482: astore 39
    //   484: aload 39
    //   486: invokestatic 278	androidx/work/c:a	([B)Landroidx/work/c;
    //   489: astore 41
    //   491: aload_3
    //   492: iload 10
    //   494: invokeinterface 384 2 0
    //   499: lstore 42
    //   501: aload_3
    //   502: iload 11
    //   504: invokeinterface 384 2 0
    //   509: lstore 44
    //   511: aload_3
    //   512: iload 12
    //   514: invokeinterface 384 2 0
    //   519: lstore 46
    //   521: aload_3
    //   522: iload 13
    //   524: invokeinterface 150 2 0
    //   529: istore 9
    //   531: aload_3
    //   532: iload 14
    //   534: invokeinterface 150 2 0
    //   539: invokestatic 386	x2/z:b	(I)I
    //   542: istore 14
    //   544: aload_3
    //   545: iload 15
    //   547: invokeinterface 384 2 0
    //   552: lstore 48
    //   554: aload_3
    //   555: iload 16
    //   557: invokeinterface 384 2 0
    //   562: lstore 50
    //   564: aload_3
    //   565: iload 17
    //   567: invokeinterface 384 2 0
    //   572: lstore 52
    //   574: aload_3
    //   575: iload 18
    //   577: invokeinterface 384 2 0
    //   582: lstore 54
    //   584: aload_3
    //   585: iload 19
    //   587: invokeinterface 150 2 0
    //   592: ifeq +9 -> 601
    //   595: iconst_1
    //   596: istore 34
    //   598: goto +6 -> 604
    //   601: iconst_0
    //   602: istore 34
    //   604: aload_3
    //   605: iload 20
    //   607: invokeinterface 150 2 0
    //   612: invokestatic 388	x2/z:d	(I)I
    //   615: istore 15
    //   617: aload_3
    //   618: iload 21
    //   620: invokeinterface 150 2 0
    //   625: istore 21
    //   627: aload_3
    //   628: iload 22
    //   630: invokeinterface 150 2 0
    //   635: istore 22
    //   637: aload_3
    //   638: iload 23
    //   640: invokeinterface 384 2 0
    //   645: lstore 56
    //   647: aload_3
    //   648: iload 24
    //   650: invokeinterface 150 2 0
    //   655: istore 24
    //   657: aload_3
    //   658: iload 25
    //   660: invokeinterface 150 2 0
    //   665: istore 25
    //   667: aload_3
    //   668: iload 26
    //   670: invokeinterface 150 2 0
    //   675: invokestatic 390	x2/z:c	(I)I
    //   678: istore 26
    //   680: aload_3
    //   681: iload 27
    //   683: invokeinterface 150 2 0
    //   688: ifeq +9 -> 697
    //   691: iconst_1
    //   692: istore 58
    //   694: goto +6 -> 700
    //   697: iconst_0
    //   698: istore 58
    //   700: aload_3
    //   701: iload 28
    //   703: invokeinterface 150 2 0
    //   708: ifeq +9 -> 717
    //   711: iconst_1
    //   712: istore 59
    //   714: goto +6 -> 720
    //   717: iconst_0
    //   718: istore 59
    //   720: aload_3
    //   721: iload 29
    //   723: invokeinterface 150 2 0
    //   728: ifeq +9 -> 737
    //   731: iconst_1
    //   732: istore 60
    //   734: goto +6 -> 740
    //   737: iconst_0
    //   738: istore 60
    //   740: aload_3
    //   741: iload 30
    //   743: invokeinterface 150 2 0
    //   748: ifeq +9 -> 757
    //   751: iconst_1
    //   752: istore 61
    //   754: goto +6 -> 760
    //   757: iconst_0
    //   758: istore 61
    //   760: aload_3
    //   761: iload 31
    //   763: invokeinterface 384 2 0
    //   768: lstore 62
    //   770: aload_3
    //   771: iload 32
    //   773: invokeinterface 384 2 0
    //   778: lstore 64
    //   780: aload_3
    //   781: iload 33
    //   783: invokeinterface 269 2 0
    //   788: ifeq +10 -> 798
    //   791: aload 35
    //   793: astore 39
    //   795: goto +13 -> 808
    //   798: aload_3
    //   799: iload 33
    //   801: invokeinterface 273 2 0
    //   806: astore 39
    //   808: aload 39
    //   810: invokestatic 393	x2/z:a	([B)Ljava/util/LinkedHashSet;
    //   813: astore 39
    //   815: new 395	o2/c
    //   818: astore 35
    //   820: aload 35
    //   822: iload 26
    //   824: iload 58
    //   826: iload 59
    //   828: iload 60
    //   830: iload 61
    //   832: lload 62
    //   834: lload 64
    //   836: aload 39
    //   838: invokespecial 398	o2/c:<init>	(IZZZZJJLjava/util/Set;)V
    //   841: new 400	x2/s
    //   844: dup
    //   845: aload_1
    //   846: aload 36
    //   848: aload 37
    //   850: aload 38
    //   852: aload 40
    //   854: aload 41
    //   856: lload 42
    //   858: lload 44
    //   860: lload 46
    //   862: aload 35
    //   864: iload 9
    //   866: iload 14
    //   868: lload 48
    //   870: lload 50
    //   872: lload 52
    //   874: lload 54
    //   876: iload 34
    //   878: iload 15
    //   880: iload 21
    //   882: iload 22
    //   884: lload 56
    //   886: iload 24
    //   888: iload 25
    //   890: invokespecial 403	x2/s:<init>	(Ljava/lang/String;Lo2/o$b;Ljava/lang/String;Ljava/lang/String;Landroidx/work/c;Landroidx/work/c;JJJLo2/c;IIJJJJZIIIJII)V
    //   893: astore_1
    //   894: aload_3
    //   895: invokeinterface 153 1 0
    //   900: aload_2
    //   901: invokevirtual 156	p1/l:H	()V
    //   904: aload_1
    //   905: areturn
    //   906: astore_1
    //   907: goto +4 -> 911
    //   910: astore_1
    //   911: aload_3
    //   912: invokeinterface 153 1 0
    //   917: aload_2
    //   918: invokevirtual 156	p1/l:H	()V
    //   921: aload_1
    //   922: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	923	0	this	u
    //   0	923	1	paramString	String
    //   7	911	2	locall	p1.l
    //   42	870	3	localCursor	Cursor
    //   50	299	4	i1	int
    //   59	299	5	i2	int
    //   68	320	6	i3	int
    //   77	338	7	i4	int
    //   86	356	8	i5	int
    //   95	770	9	i6	int
    //   104	389	10	i7	int
    //   113	390	11	i8	int
    //   122	391	12	i9	int
    //   131	392	13	i10	int
    //   140	727	14	i11	int
    //   149	730	15	i12	int
    //   158	398	16	i13	int
    //   167	399	17	i14	int
    //   176	400	18	i15	int
    //   185	401	19	i16	int
    //   194	412	20	i17	int
    //   203	678	21	i18	int
    //   212	671	22	i19	int
    //   221	418	23	i20	int
    //   230	657	24	i21	int
    //   239	650	25	i22	int
    //   248	575	26	i23	int
    //   257	425	27	i24	int
    //   266	436	28	i25	int
    //   275	447	29	i26	int
    //   284	458	30	i27	int
    //   293	469	31	i28	int
    //   302	470	32	i29	int
    //   311	489	33	i30	int
    //   319	558	34	bool1	boolean
    //   324	539	35	localc	o2.c
    //   367	480	36	localb	o.b
    //   381	468	37	str1	String
    //   408	443	38	str2	String
    //   435	402	39	localObject	Object
    //   455	398	40	localc1	androidx.work.c
    //   489	366	41	localc2	androidx.work.c
    //   499	358	42	l1	long
    //   509	350	44	l2	long
    //   519	342	46	l3	long
    //   552	317	48	l4	long
    //   562	309	50	l5	long
    //   572	301	52	l6	long
    //   582	293	54	l7	long
    //   645	240	56	l8	long
    //   692	133	58	bool2	boolean
    //   712	115	59	bool3	boolean
    //   732	97	60	bool4	boolean
    //   752	79	61	bool5	boolean
    //   768	65	62	l9	long
    //   778	57	64	l10	long
    // Exception table:
    //   from	to	target	type
    //   169	321	906	finally
    //   331	342	906	finally
    //   347	356	906	finally
    //   356	380	906	finally
    //   386	396	906	finally
    //   396	407	906	finally
    //   413	423	906	finally
    //   423	434	906	finally
    //   440	450	906	finally
    //   450	468	906	finally
    //   474	484	906	finally
    //   484	595	906	finally
    //   604	691	906	finally
    //   700	711	906	finally
    //   720	731	906	finally
    //   740	751	906	finally
    //   760	791	906	finally
    //   798	808	906	finally
    //   808	894	906	finally
    //   43	169	910	finally
  }
  
  public final int u(String paramString)
  {
    a.b();
    t1.f localf = j.a();
    if (paramString == null) {
      localf.d0(1);
    } else {
      localf.n(1, paramString);
    }
    a.c();
    try
    {
      int i1 = localf.p();
      a.n();
      return i1;
    }
    finally
    {
      a.j();
      j.d(localf);
    }
  }
  
  public final n v(List paramList)
  {
    Object localObject1 = f.l("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
    int i1 = paramList.size();
    b.f(i1, (StringBuilder)localObject1);
    ((StringBuilder)localObject1).append(")");
    localObject1 = ((StringBuilder)localObject1).toString();
    int i2 = 0;
    localObject1 = p1.l.C(i1 + 0, (String)localObject1);
    Object localObject2 = paramList.iterator();
    for (i1 = 1; ((Iterator)localObject2).hasNext(); i1++)
    {
      paramList = (String)((Iterator)localObject2).next();
      if (paramList == null) {
        ((p1.l)localObject1).d0(i1);
      } else {
        ((p1.l)localObject1).n(i1, paramList);
      }
    }
    paramList = a.e;
    localObject2 = new v(this, (p1.l)localObject1);
    paramList.getClass();
    l.l locall = j;
    localObject1 = paramList.d(new String[] { "WorkTag", "WorkProgress", "workspec" });
    int i3 = localObject1.length;
    i1 = i2;
    while (i1 < i3)
    {
      String str = localObject1[i1];
      LinkedHashMap localLinkedHashMap = d;
      Object localObject3 = Locale.US;
      i.d(localObject3, "US");
      localObject3 = str.toLowerCase((Locale)localObject3);
      i.d(localObject3, "this as java.lang.String).toLowerCase(locale)");
      if (localLinkedHashMap.containsKey(localObject3)) {
        i1++;
      } else {
        throw new IllegalArgumentException(g.d("There is no table with name ", str).toString());
      }
    }
    locall.getClass();
    return new n((p1.j)b, locall, (v)localObject2, (String[])localObject1);
  }
  
  public final int w(String paramString)
  {
    a.b();
    t1.f localf = e.a();
    if (paramString == null) {
      localf.d0(1);
    } else {
      localf.n(1, paramString);
    }
    a.c();
    try
    {
      int i1 = localf.p();
      a.n();
      return i1;
    }
    finally
    {
      a.j();
      e.d(localf);
    }
  }
  
  public final ArrayList x(String paramString)
  {
    p1.l locall = p1.l.C(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
    if (paramString == null) {
      locall.d0(1);
    } else {
      locall.n(1, paramString);
    }
    a.b();
    Cursor localCursor = b.z.o(a, locall, false);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext())
      {
        if (localCursor.isNull(0)) {
          paramString = null;
        } else {
          paramString = localCursor.getString(0);
        }
        localArrayList.add(paramString);
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  public final ArrayList y(String paramString)
  {
    p1.l locall = p1.l.C(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
    if (paramString == null) {
      locall.d0(1);
    } else {
      locall.n(1, paramString);
    }
    a.b();
    Cursor localCursor = b.z.o(a, locall, false);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext())
      {
        if (localCursor.isNull(0)) {
          paramString = null;
        } else {
          paramString = localCursor.getBlob(0);
        }
        localArrayList.add(androidx.work.c.a(paramString));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      locall.H();
    }
  }
  
  public final int z(String paramString)
  {
    a.b();
    t1.f localf = i.a();
    if (paramString == null) {
      localf.d0(1);
    } else {
      localf.n(1, paramString);
    }
    a.c();
    try
    {
      int i1 = localf.p();
      a.n();
      return i1;
    }
    finally
    {
      a.j();
      i.d(localf);
    }
  }
  
  public final class a
    extends p
  {
    public a()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
  }
  
  public final class b
    extends p
  {
    public b()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
  }
  
  public final class c
    extends p
  {
    public c()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
  }
  
  public final class d
    extends p
  {
    public d()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
  }
  
  public final class e
    extends p
  {
    public e()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
  }
  
  public final class f
    extends p
  {
    public f()
    {
      super();
    }
    
    public final String c()
    {
      return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
  }
  
  public final class g
    extends p
  {
    public g()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
  }
  
  public final class h
    extends p
  {
    public h()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET stop_reason=? WHERE id=?";
    }
  }
  
  public final class i
    extends p1.d
  {
    public i()
    {
      super(1);
    }
    
    public final String c()
    {
      return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
    
    public final void e(t1.f paramf, Object paramObject)
    {
      paramObject = (s)paramObject;
      Object localObject1 = a;
      int i = 1;
      if (localObject1 == null) {
        paramf.d0(1);
      } else {
        paramf.n(1, (String)localObject1);
      }
      paramf.F(2, z.f(b));
      localObject1 = c;
      if (localObject1 == null) {
        paramf.d0(3);
      } else {
        paramf.n(3, (String)localObject1);
      }
      localObject1 = d;
      if (localObject1 == null) {
        paramf.d0(4);
      } else {
        paramf.n(4, (String)localObject1);
      }
      localObject1 = androidx.work.c.e(e);
      if (localObject1 == null) {
        paramf.d0(5);
      } else {
        paramf.T((byte[])localObject1, 5);
      }
      localObject1 = androidx.work.c.e(f);
      if (localObject1 == null) {
        paramf.d0(6);
      } else {
        paramf.T((byte[])localObject1, 6);
      }
      paramf.F(7, g);
      paramf.F(8, h);
      paramf.F(9, i);
      paramf.F(10, k);
      int j = l;
      a0.j.p(j, "backoffPolicy");
      j = q0.g.c(j);
      if (j != 0)
      {
        if (j == 1) {
          j = 1;
        } else {
          throw new w();
        }
      }
      else {
        j = 0;
      }
      paramf.F(11, j);
      paramf.F(12, m);
      paramf.F(13, n);
      paramf.F(14, o);
      paramf.F(15, p);
      paramf.F(16, q);
      j = r;
      a0.j.p(j, "policy");
      j = q0.g.c(j);
      if (j != 0)
      {
        if (j == 1) {
          j = 1;
        } else {
          throw new w();
        }
      }
      else {
        j = 0;
      }
      paramf.F(17, j);
      paramf.F(18, s);
      paramf.F(19, t);
      paramf.F(20, u);
      paramf.F(21, v);
      paramf.F(22, w);
      paramObject = j;
      if (paramObject != null)
      {
        int k = a;
        a0.j.p(k, "networkType");
        int m = q0.g.c(k);
        if (m != 0)
        {
          j = i;
          if (m != 1) {
            if (m != 2)
            {
              if (m != 3)
              {
                if (m != 4)
                {
                  if ((Build.VERSION.SDK_INT >= 30) && (k == 6))
                  {
                    j = 5;
                  }
                  else
                  {
                    paramf = f.l("Could not convert ");
                    paramf.append(a0.j.x(k));
                    paramf.append(" to int");
                    throw new IllegalArgumentException(paramf.toString());
                  }
                }
                else {
                  j = 4;
                }
              }
              else {
                j = 3;
              }
            }
            else {
              j = 2;
            }
          }
        }
        else
        {
          j = 0;
        }
        paramf.F(23, j);
        paramf.F(24, b);
        paramf.F(25, c);
        paramf.F(26, d);
        paramf.F(27, e);
        paramf.F(28, f);
        paramf.F(29, g);
        Object localObject3 = h;
        i.e(localObject3, "triggers");
        if (((Set)localObject3).isEmpty()) {
          paramObject = new byte[0];
        } else {
          paramObject = new ByteArrayOutputStream();
        }
        try
        {
          localObject1 = new java/io/ObjectOutputStream;
          ((ObjectOutputStream)localObject1).<init>((OutputStream)paramObject);
          try
          {
            ((ObjectOutputStream)localObject1).writeInt(((Set)localObject3).size());
            localObject3 = ((Set)localObject3).iterator();
            while (((Iterator)localObject3).hasNext())
            {
              c.a locala = (c.a)((Iterator)localObject3).next();
              ((ObjectOutputStream)localObject1).writeUTF(a.toString());
              ((ObjectOutputStream)localObject1).writeBoolean(b);
            }
            localObject3 = h.a;
            b.L((Closeable)localObject1, null);
            b.L((Closeable)paramObject, null);
            paramObject = ((ByteArrayOutputStream)paramObject).toByteArray();
            i.d(paramObject, "outputStream.toByteArray()");
            paramf.T((byte[])paramObject, 30);
          }
          finally {}
          paramf.d0(23);
        }
        finally
        {
          try
          {
            throw paramf;
          }
          finally
          {
            b.L((Closeable)paramObject, paramf);
          }
        }
      }
      paramf.d0(24);
      paramf.d0(25);
      paramf.d0(26);
      paramf.d0(27);
      paramf.d0(28);
      paramf.d0(29);
      paramf.d0(30);
    }
  }
  
  public final class j
    extends p1.d
  {
    public j()
    {
      super(0);
    }
    
    public final String c()
    {
      return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
    }
  }
  
  public final class k
    extends p
  {
    public k()
    {
      super();
    }
    
    public final String c()
    {
      return "DELETE FROM workspec WHERE id=?";
    }
  }
  
  public final class l
    extends p
  {
    public l()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET state=? WHERE id=?";
    }
  }
  
  public final class m
    extends p
  {
    public m()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
  }
  
  public final class n
    extends p
  {
    public n()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
  }
  
  public final class o
    extends p
  {
    public o()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET output=? WHERE id=?";
    }
  }
  
  public final class p
    extends p
  {
    public p()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
    }
  }
  
  public final class q
    extends p
  {
    public q()
    {
      super();
    }
    
    public final String c()
    {
      return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
  }
}

/* Location:
 * Qualified Name:     x2.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
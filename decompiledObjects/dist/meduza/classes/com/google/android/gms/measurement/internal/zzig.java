package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.internal.measurement.zzgf.zzj;
import com.google.android.gms.internal.measurement.zzgf.zzj.zzb;
import com.google.android.gms.internal.measurement.zzgf.zzk.zza;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg.zza;
import com.google.android.gms.internal.measurement.zzkp;
import d2.q;
import e7.a1;
import e7.a3;
import e7.b1;
import e7.b3;
import e7.b6;
import e7.d6;
import e7.e;
import e7.e2;
import e7.f;
import e7.f0;
import e7.f6;
import e7.h0;
import e7.h6;
import e7.i6;
import e7.j2;
import e7.k2;
import e7.k6;
import e7.l2;
import e7.m0;
import e7.m2;
import e7.n;
import e7.n2;
import e7.n6;
import e7.o;
import e7.o2;
import e7.o6;
import e7.p0;
import e7.p2;
import e7.q2;
import e7.q6;
import e7.r2;
import e7.r6;
import e7.s0;
import e7.s6;
import e7.t2;
import e7.u2;
import e7.v1;
import e7.v2;
import e7.w2;
import e7.x0;
import e7.x2;
import e7.y;
import e7.y2;
import e7.z2;
import e7.z5;
import g;
import j6.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzig
  extends zzfy
{
  public final i6 a;
  public Boolean b;
  public String c;
  
  public zzig(i6 parami6)
  {
    m6.j.i(parami6);
    a = parami6;
    c = null;
  }
  
  public static void zza(zzig paramzzig, Bundle paramBundle, String paramString, k6 paramk6)
  {
    boolean bool1 = a.R().x(null, h0.Y0);
    boolean bool2 = a.R().x(null, h0.a1);
    if ((paramBundle.isEmpty()) && (bool1))
    {
      paramzzig = a.c;
      i6.q(paramzzig);
      paramzzig.l();
      paramzzig.p();
      try
      {
        paramzzig.s().execSQL("delete from default_event_params where app_id=?", new String[] { paramString });
        return;
      }
      catch (SQLiteException paramBundle)
      {
        zzjo.c("Error clearing default event params", paramBundle);
        return;
      }
    }
    o localo1 = a.c;
    i6.q(localo1);
    localo1.l();
    localo1.p();
    Object localObject = new y((j2)b, "", paramString, "dep", 0L, 0L, paramBundle);
    localObject = localo1.m().x((y)localObject).zzce();
    zzjw.d("Saving default event parameters, appId, data size", localo1.i().c(paramString), Integer.valueOf(localObject.length));
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("app_id", paramString);
    localContentValues.put("parameters", (byte[])localObject);
    try
    {
      if (localo1.s().insertWithOnConflict("default_event_params", null, localContentValues, 5) == -1L) {
        zzjo.c("Failed to insert default event parameters (got -1). appId", a1.p(paramString));
      }
    }
    catch (SQLiteException localSQLiteException2)
    {
      zzjo.d("Error storing default event parameters. appId", a1.p(paramString), localSQLiteException2);
    }
    o localo2 = a.c;
    i6.q(localo2);
    long l = N;
    if (!localo2.h().x(null, h0.a1))
    {
      ((z)localo2.zzb()).getClass();
      if (System.currentTimeMillis() > 15000L + l) {}
    }
    else
    {
      try
      {
        if (localo2.w("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[] { paramString, String.valueOf(l) }, 0L) <= 0L)
        {
          l = localo2.w("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[] { paramString, String.valueOf(l) }, 0L);
          if (l > 0L) {
            i = 1;
          }
        }
      }
      catch (SQLiteException localSQLiteException1)
      {
        zzjo.c("Error checking backfill conditions", localSQLiteException1);
      }
    }
    int i = 0;
    if (i != 0)
    {
      paramzzig = a;
      if (bool2)
      {
        paramzzig = c;
        i6.q(paramzzig);
        paramzzig.P(paramString, Long.valueOf(N), null, paramBundle);
        return;
      }
      paramzzig = c;
      i6.q(paramzzig);
      paramzzig.P(paramString, null, null, paramBundle);
    }
  }
  
  public static void zza(zzig paramzzig, k6 paramk6, Bundle paramBundle, p0 paramp0, String paramString)
  {
    a.c0();
    paramk6 = a.j(paramBundle, paramk6);
    try
    {
      paramp0.zza(paramk6);
      return;
    }
    catch (RemoteException paramk6)
    {
      a.zzj().o.d("Failed to return trigger URIs for app", paramString, paramk6);
    }
  }
  
  /* Error */
  public static void zza(zzig paramzzig, k6 paramk6, e parame)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	com/google/android/gms/measurement/internal/zzig:a	Le7/i6;
    //   4: invokevirtual 244	e7/i6:c0	()V
    //   7: aload_0
    //   8: getfield 23	com/google/android/gms/measurement/internal/zzig:a	Le7/i6;
    //   11: astore_3
    //   12: aload_1
    //   13: getfield 266	e7/k6:a	Ljava/lang/String;
    //   16: astore 4
    //   18: aload 4
    //   20: invokestatic 21	m6/j:i	(Ljava/lang/Object;)V
    //   23: aload_3
    //   24: invokevirtual 36	e7/i6:R	()Le7/h;
    //   27: astore_1
    //   28: getstatic 269	e7/h0:K0	Le7/m0;
    //   31: astore_0
    //   32: aload_1
    //   33: aconst_null
    //   34: aload_0
    //   35: invokevirtual 48	e7/h:x	(Ljava/lang/String;Le7/m0;)Z
    //   38: ifne +6 -> 44
    //   41: goto +723 -> 764
    //   44: aload_3
    //   45: invokestatic 273	a0/j:q	(Le7/i6;)V
    //   48: aload_3
    //   49: getfield 60	e7/i6:c	Le7/o;
    //   52: astore 5
    //   54: aload 5
    //   56: invokestatic 64	e7/i6:q	(Le7/h6;)V
    //   59: aload_2
    //   60: getfield 277	e7/e:a	J
    //   63: lstore 6
    //   65: aload 5
    //   67: invokevirtual 199	d2/q:h	()Le7/h;
    //   70: aconst_null
    //   71: aload_0
    //   72: invokevirtual 48	e7/h:x	(Ljava/lang/String;Le7/m0;)Z
    //   75: ifne +6 -> 81
    //   78: goto +132 -> 210
    //   81: aload 5
    //   83: invokevirtual 69	d2/q:l	()V
    //   86: aload 5
    //   88: invokevirtual 74	e7/h6:p	()V
    //   91: aload 5
    //   93: invokevirtual 80	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   96: ldc_w 279
    //   99: bipush 9
    //   101: anewarray 84	java/lang/String
    //   104: dup
    //   105: iconst_0
    //   106: ldc_w 281
    //   109: aastore
    //   110: dup
    //   111: iconst_1
    //   112: ldc -90
    //   114: aastore
    //   115: dup
    //   116: iconst_2
    //   117: ldc_w 283
    //   120: aastore
    //   121: dup
    //   122: iconst_3
    //   123: ldc_w 285
    //   126: aastore
    //   127: dup
    //   128: iconst_4
    //   129: ldc_w 287
    //   132: aastore
    //   133: dup
    //   134: iconst_5
    //   135: ldc_w 289
    //   138: aastore
    //   139: dup
    //   140: bipush 6
    //   142: ldc_w 291
    //   145: aastore
    //   146: dup
    //   147: bipush 7
    //   149: ldc_w 293
    //   152: aastore
    //   153: dup
    //   154: bipush 8
    //   156: ldc_w 295
    //   159: aastore
    //   160: ldc_w 297
    //   163: iconst_1
    //   164: anewarray 84	java/lang/String
    //   167: dup
    //   168: iconst_0
    //   169: lload 6
    //   171: invokestatic 224	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   174: aastore
    //   175: aconst_null
    //   176: aconst_null
    //   177: aconst_null
    //   178: ldc_w 299
    //   181: invokevirtual 303	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   184: astore 8
    //   186: aload 8
    //   188: astore_0
    //   189: aload 8
    //   191: invokeinterface 308 1 0
    //   196: istore 9
    //   198: iload 9
    //   200: ifne +13 -> 213
    //   203: aload 8
    //   205: invokeinterface 311 1 0
    //   210: goto +208 -> 418
    //   213: aload 8
    //   215: astore_0
    //   216: aload 8
    //   218: iconst_1
    //   219: invokeinterface 315 2 0
    //   224: astore 10
    //   226: aload 8
    //   228: astore_0
    //   229: aload 10
    //   231: invokestatic 21	m6/j:i	(Ljava/lang/Object;)V
    //   234: aload 8
    //   236: astore_0
    //   237: aload 8
    //   239: iconst_2
    //   240: invokeinterface 319 2 0
    //   245: astore 11
    //   247: aload 8
    //   249: astore_0
    //   250: aload 8
    //   252: iconst_3
    //   253: invokeinterface 315 2 0
    //   258: astore_1
    //   259: aload 8
    //   261: astore_0
    //   262: aload 8
    //   264: iconst_4
    //   265: invokeinterface 315 2 0
    //   270: astore 12
    //   272: aload 8
    //   274: astore_0
    //   275: aload 8
    //   277: iconst_5
    //   278: invokeinterface 323 2 0
    //   283: istore 13
    //   285: aload 8
    //   287: astore_0
    //   288: aload 8
    //   290: bipush 6
    //   292: invokeinterface 323 2 0
    //   297: istore 14
    //   299: aload 8
    //   301: astore_0
    //   302: aload 8
    //   304: bipush 7
    //   306: invokeinterface 327 2 0
    //   311: lstore 15
    //   313: aload 8
    //   315: astore_0
    //   316: aload 8
    //   318: bipush 8
    //   320: invokeinterface 327 2 0
    //   325: lstore 17
    //   327: aload 8
    //   329: astore_0
    //   330: aload 5
    //   332: aload 10
    //   334: lload 6
    //   336: aload 11
    //   338: aload_1
    //   339: aload 12
    //   341: iload 13
    //   343: iload 14
    //   345: lload 15
    //   347: lload 17
    //   349: invokevirtual 331	e7/o:z	(Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;IIJJ)Le7/n6;
    //   352: astore_1
    //   353: aload 8
    //   355: invokeinterface 311 1 0
    //   360: aload_1
    //   361: astore_0
    //   362: goto +58 -> 420
    //   365: astore_1
    //   366: goto +17 -> 383
    //   369: astore_1
    //   370: goto +13 -> 383
    //   373: astore_1
    //   374: aconst_null
    //   375: astore_0
    //   376: goto +390 -> 766
    //   379: astore_1
    //   380: aconst_null
    //   381: astore 8
    //   383: aload 8
    //   385: astore_0
    //   386: aload 5
    //   388: invokevirtual 94	d2/q:zzj	()Le7/a1;
    //   391: getfield 100	e7/a1:o	Le7/b1;
    //   394: ldc_w 333
    //   397: lload 6
    //   399: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   402: aload_1
    //   403: invokevirtual 161	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   406: aload 8
    //   408: ifnull +10 -> 418
    //   411: aload 8
    //   413: invokeinterface 311 1 0
    //   418: aconst_null
    //   419: astore_0
    //   420: aload_0
    //   421: ifnonnull +28 -> 449
    //   424: aload_3
    //   425: invokevirtual 261	e7/i6:zzj	()Le7/a1;
    //   428: getfield 336	e7/a1:r	Le7/b1;
    //   431: ldc_w 338
    //   434: aload 4
    //   436: aload_2
    //   437: getfield 277	e7/e:a	J
    //   440: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   443: invokevirtual 161	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   446: goto +318 -> 764
    //   449: aload_0
    //   450: getfield 341	e7/n6:c	Ljava/lang/String;
    //   453: astore_0
    //   454: aload_2
    //   455: getfield 344	e7/e:b	I
    //   458: iconst_1
    //   459: if_icmpne +231 -> 690
    //   462: aload_3
    //   463: getfield 348	e7/i6:M	Ljava/util/HashMap;
    //   466: aload_0
    //   467: invokevirtual 354	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   470: ifeq +12 -> 482
    //   473: aload_3
    //   474: getfield 348	e7/i6:M	Ljava/util/HashMap;
    //   477: aload_0
    //   478: invokevirtual 358	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   481: pop
    //   482: aload_3
    //   483: getfield 60	e7/i6:c	Le7/o;
    //   486: astore_0
    //   487: aload_0
    //   488: invokestatic 64	e7/i6:q	(Le7/h6;)V
    //   491: aload_0
    //   492: aload_2
    //   493: getfield 277	e7/e:a	J
    //   496: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   499: invokevirtual 362	e7/o:K	(Ljava/lang/Long;)V
    //   502: aload_2
    //   503: getfield 364	e7/e:c	J
    //   506: lconst_0
    //   507: lcmp
    //   508: ifle +256 -> 764
    //   511: aload_3
    //   512: getfield 60	e7/i6:c	Le7/o;
    //   515: astore_0
    //   516: aload_0
    //   517: invokestatic 64	e7/i6:q	(Le7/h6;)V
    //   520: aload_2
    //   521: getfield 364	e7/e:c	J
    //   524: lstore 17
    //   526: aload_0
    //   527: invokevirtual 199	d2/q:h	()Le7/h;
    //   530: aconst_null
    //   531: getstatic 269	e7/h0:K0	Le7/m0;
    //   534: invokevirtual 48	e7/h:x	(Ljava/lang/String;Le7/m0;)Z
    //   537: ifeq +227 -> 764
    //   540: aload_0
    //   541: invokevirtual 69	d2/q:l	()V
    //   544: aload_0
    //   545: invokevirtual 74	e7/h6:p	()V
    //   548: lload 17
    //   550: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   553: invokestatic 21	m6/j:i	(Ljava/lang/Object;)V
    //   556: new 163	android/content/ContentValues
    //   559: dup
    //   560: invokespecial 164	android/content/ContentValues:<init>	()V
    //   563: astore_1
    //   564: aload_1
    //   565: ldc_w 289
    //   568: iconst_1
    //   569: invokestatic 157	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   572: invokevirtual 367	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   575: aload_0
    //   576: invokevirtual 203	d2/q:zzb	()Lv6/b;
    //   579: checkcast 205	b/z
    //   582: invokevirtual 211	java/lang/Object:getClass	()Ljava/lang/Class;
    //   585: pop
    //   586: aload_1
    //   587: ldc_w 293
    //   590: invokestatic 217	java/lang/System:currentTimeMillis	()J
    //   593: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   596: invokevirtual 370	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   599: aload_0
    //   600: invokevirtual 80	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   603: ldc_w 279
    //   606: aload_1
    //   607: ldc_w 372
    //   610: iconst_3
    //   611: anewarray 84	java/lang/String
    //   614: dup
    //   615: iconst_0
    //   616: lload 17
    //   618: invokestatic 224	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   621: aastore
    //   622: dup
    //   623: iconst_1
    //   624: aload 4
    //   626: aastore
    //   627: dup
    //   628: iconst_2
    //   629: iconst_4
    //   630: invokestatic 374	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   633: aastore
    //   634: invokevirtual 378	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   637: i2l
    //   638: lconst_1
    //   639: lcmp
    //   640: ifeq +124 -> 764
    //   643: aload_0
    //   644: invokevirtual 94	d2/q:zzj	()Le7/a1;
    //   647: getfield 336	e7/a1:r	Le7/b1;
    //   650: ldc_w 380
    //   653: aload 4
    //   655: lload 17
    //   657: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   660: invokevirtual 161	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   663: goto +101 -> 764
    //   666: astore_1
    //   667: aload_0
    //   668: invokevirtual 94	d2/q:zzj	()Le7/a1;
    //   671: getfield 100	e7/a1:o	Le7/b1;
    //   674: aload 4
    //   676: lload 17
    //   678: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   681: aload_1
    //   682: ldc_w 382
    //   685: invokevirtual 385	e7/b1:a	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   688: aload_1
    //   689: athrow
    //   690: aload_3
    //   691: getfield 348	e7/i6:M	Ljava/util/HashMap;
    //   694: aload_0
    //   695: invokevirtual 388	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   698: checkcast 390	e7/i6$b
    //   701: astore_1
    //   702: aload_1
    //   703: ifnonnull +23 -> 726
    //   706: aload_3
    //   707: getfield 348	e7/i6:M	Ljava/util/HashMap;
    //   710: aload_0
    //   711: new 390	e7/i6$b
    //   714: dup
    //   715: aload_3
    //   716: invokespecial 392	e7/i6$b:<init>	(Le7/i6;)V
    //   719: invokevirtual 395	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   722: pop
    //   723: goto +21 -> 744
    //   726: aload_1
    //   727: aload_1
    //   728: getfield 396	e7/i6$b:b	I
    //   731: iconst_1
    //   732: iadd
    //   733: putfield 396	e7/i6$b:b	I
    //   736: aload_1
    //   737: aload_1
    //   738: invokevirtual 398	e7/i6$b:a	()J
    //   741: putfield 399	e7/i6$b:c	J
    //   744: aload_3
    //   745: getfield 60	e7/i6:c	Le7/o;
    //   748: astore_0
    //   749: aload_0
    //   750: invokestatic 64	e7/i6:q	(Le7/h6;)V
    //   753: aload_0
    //   754: aload_2
    //   755: getfield 277	e7/e:a	J
    //   758: invokestatic 236	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   761: invokevirtual 402	e7/o:e0	(Ljava/lang/Long;)V
    //   764: return
    //   765: astore_1
    //   766: aload_0
    //   767: ifnull +9 -> 776
    //   770: aload_0
    //   771: invokeinterface 311 1 0
    //   776: aload_1
    //   777: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	778	0	paramzzig	zzig
    //   0	778	1	paramk6	k6
    //   0	778	2	parame	e
    //   11	734	3	locali6	i6
    //   16	659	4	str1	String
    //   52	335	5	localo	o
    //   63	335	6	l1	long
    //   184	228	8	localCursor	android.database.Cursor
    //   196	3	9	bool	boolean
    //   224	109	10	str2	String
    //   245	92	11	arrayOfByte	byte[]
    //   270	70	12	str3	String
    //   283	59	13	i	int
    //   297	47	14	j	int
    //   311	35	15	l2	long
    //   325	352	17	l3	long
    // Exception table:
    //   from	to	target	type
    //   330	353	365	android/database/sqlite/SQLiteException
    //   189	198	369	android/database/sqlite/SQLiteException
    //   216	226	369	android/database/sqlite/SQLiteException
    //   229	234	369	android/database/sqlite/SQLiteException
    //   237	247	369	android/database/sqlite/SQLiteException
    //   250	259	369	android/database/sqlite/SQLiteException
    //   262	272	369	android/database/sqlite/SQLiteException
    //   275	285	369	android/database/sqlite/SQLiteException
    //   288	299	369	android/database/sqlite/SQLiteException
    //   302	313	369	android/database/sqlite/SQLiteException
    //   316	327	369	android/database/sqlite/SQLiteException
    //   91	186	373	finally
    //   91	186	379	android/database/sqlite/SQLiteException
    //   599	663	666	android/database/sqlite/SQLiteException
    //   189	198	765	finally
    //   216	226	765	finally
    //   229	234	765	finally
    //   237	247	765	finally
    //   250	259	765	finally
    //   262	272	765	finally
    //   275	285	765	finally
    //   288	299	765	finally
    //   302	313	765	finally
    //   316	327	765	finally
    //   330	353	765	finally
    //   386	406	765	finally
  }
  
  public static void zza(zzig paramzzig, String paramString, d6 paramd6, s0 params0)
  {
    a.c0();
    i6 locali6 = a;
    if (!locali6.R().x(null, h0.K0))
    {
      paramd6 = new f6(Collections.emptyList());
    }
    else
    {
      a0.j.q(locali6);
      Object localObject1 = c;
      i6.q((h6)localObject1);
      localObject1 = ((o)localObject1).C(paramString, paramd6, ((Integer)h0.x.a(null)).intValue());
      paramd6 = new ArrayList();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (n6)((Iterator)localObject1).next();
        if (locali6.V(c))
        {
          Bundle localBundle = new Bundle();
          Object localObject3 = d.entrySet().iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject4 = (Map.Entry)((Iterator)localObject3).next();
            localBundle.putString((String)((Map.Entry)localObject4).getKey(), (String)((Map.Entry)localObject4).getValue());
          }
          Object localObject4 = new b6(a, b.zzce(), c, localBundle, g.a(e), f, "");
          try
          {
            localObject3 = (zzgf.zzj.zzb)o6.z(zzgf.zzj.zzb(), b);
            for (int i = 0; i < ((zzgf.zzj.zzb)localObject3).zza(); i++)
            {
              localObject2 = (zzgf.zzk.zza)((zzgf.zzj.zzb)localObject3).zza(i).zzch();
              ((z)locali6.zzb()).getClass();
              ((zzgf.zzj.zzb)localObject3).zza(i, ((zzgf.zzk.zza)localObject2).zzl(System.currentTimeMillis()));
            }
            b = ((zzgf.zzj)((zzkg.zza)localObject3).zzaj()).zzce();
            if (locali6.zzj().u(2))
            {
              localObject2 = o;
              i6.q((h6)localObject2);
              o = ((o6)localObject2).C((zzgf.zzj)((zzkg.zza)localObject3).zzaj());
            }
            paramd6.add(localObject4);
          }
          catch (zzkp localzzkp)
          {
            zzjr.c("Failed to parse queued batch. appId", paramString);
          }
        }
      }
      paramd6 = new f6(paramd6);
    }
    try
    {
      params0.E(paramd6);
      return;
    }
    catch (RemoteException paramd6)
    {
      a.zzj().o.d("[sgtm] Failed to return upload batches for app", paramString, paramd6);
    }
  }
  
  public final void C(k6 paramk6)
  {
    m6.j.e(a);
    m6.j.i(C);
    r(new r2(this, paramk6, 1));
  }
  
  public final void E0(k6 paramk6)
  {
    e3(paramk6);
    f3(new l2(this, paramk6, 1));
  }
  
  public final void F(f paramf, k6 paramk6)
  {
    m6.j.i(paramf);
    m6.j.i(c);
    e3(paramk6);
    paramf = new f(paramf);
    a = a;
    f3(new k2(this, paramf, paramk6));
  }
  
  public final void M1(k6 paramk6, e parame)
  {
    if (!a.R().x(null, h0.K0)) {
      return;
    }
    e3(paramk6);
    f3(new k2(this, paramk6, parame));
  }
  
  public final void M2(k6 paramk6)
  {
    m6.j.e(a);
    d3(a, false);
    f3(new l2(this, paramk6, 2));
  }
  
  public final void N1(k6 paramk6, d6 paramd6, s0 params0)
  {
    if (!a.R().x(null, h0.K0)) {
      return;
    }
    e3(paramk6);
    paramk6 = a;
    m6.j.i(paramk6);
    a.zzl().u(new o2(this, paramk6, paramd6, params0, 0));
  }
  
  public final List<q6> O2(String paramString1, String paramString2, boolean paramBoolean, k6 paramk6)
  {
    e3(paramk6);
    Object localObject = a;
    m6.j.i(localObject);
    paramString1 = a.zzl().p(new u2(this, (String)localObject, paramString1, paramString2));
    try
    {
      paramString2 = (List)paramString1.get();
      paramString1 = new java/util/ArrayList;
      paramString1.<init>(paramString2.size());
      localObject = paramString2.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramString2 = (s6)((Iterator)localObject).next();
        if ((paramBoolean) || (!r6.r0(c)))
        {
          q6 localq6 = new e7/q6;
          localq6.<init>(paramString2);
          paramString1.add(localq6);
        }
      }
      return paramString1;
    }
    catch (ExecutionException paramString1) {}catch (InterruptedException paramString1) {}
    a.zzj().o.d("Failed to query user properties. appId", a1.p(a), paramString1);
    return Collections.emptyList();
  }
  
  public final List<f> T2(String paramString1, String paramString2, k6 paramk6)
  {
    e3(paramk6);
    paramk6 = a;
    m6.j.i(paramk6);
    paramString1 = a.zzl().p(new w2(this, paramk6, paramString1, paramString2));
    try
    {
      paramString1 = (List)paramString1.get();
      return paramString1;
    }
    catch (ExecutionException paramString1) {}catch (InterruptedException paramString1) {}
    a.zzj().o.c("Failed to get conditional user properties", paramString1);
    return Collections.emptyList();
  }
  
  public final void V(f0 paramf0, k6 paramk6)
  {
    m6.j.i(paramf0);
    e3(paramk6);
    f3(new x2(this, paramf0, paramk6, 0));
  }
  
  public final String V1(k6 paramk6)
  {
    e3(paramk6);
    i6 locali6 = a;
    Object localObject = locali6.zzl().p(new y2(locali6, paramk6, 1));
    try
    {
      localObject = (String)((FutureTask)localObject).get(30000L, TimeUnit.MILLISECONDS);
      paramk6 = (k6)localObject;
    }
    catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}catch (TimeoutException localTimeoutException) {}
    zzjo.d("Failed to get app instance id. appId", a1.p(a), localTimeoutException);
    paramk6 = null;
    return paramk6;
  }
  
  public final byte[] V2(f0 paramf0, String paramString)
  {
    m6.j.e(paramString);
    m6.j.i(paramf0);
    d3(paramString, true);
    a.zzj().v.c("Log and bundle. event", a.t.u.c(a));
    ((z)a.zzb()).getClass();
    long l1 = System.nanoTime() / 1000000L;
    Object localObject = a.zzl().t(new z2(this, paramf0, paramString));
    try
    {
      byte[] arrayOfByte = (byte[])((FutureTask)localObject).get();
      localObject = arrayOfByte;
      if (arrayOfByte == null)
      {
        a.zzj().o.c("Log and bundle returned null. appId", a1.p(paramString));
        localObject = new byte[0];
      }
      ((z)a.zzb()).getClass();
      long l2 = System.nanoTime() / 1000000L;
      a.zzj().v.a(a.t.u.c(a), Integer.valueOf(localObject.length), Long.valueOf(l2 - l1), "Log and bundle processed. event, size, time_ms");
      return (byte[])localObject;
    }
    catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}
    a.zzj().o.a(a1.p(paramString), a.t.u.c(a), localInterruptedException, "Failed to log and bundle. appId, event, error");
    return null;
  }
  
  public final void Y1(k6 paramk6)
  {
    e3(paramk6);
    f3(new r2(this, paramk6, 0));
  }
  
  public final void d1(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    f3(new q2(this, paramString2, paramString3, paramString1, paramLong));
  }
  
  public final void d3(String paramString, boolean paramBoolean)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramBoolean) {}
      try
      {
        if (b == null)
        {
          if ((!"com.google.android.gms".equals(c)) && (!v6.h.a(a.t.a, Binder.getCallingUid())) && (!k.a(a.t.a).b(Binder.getCallingUid()))) {
            paramBoolean = false;
          } else {
            paramBoolean = true;
          }
          b = Boolean.valueOf(paramBoolean);
        }
        if (!b.booleanValue())
        {
          if (c == null)
          {
            localObject = a.t.a;
            int i = Binder.getCallingUid();
            AtomicBoolean localAtomicBoolean = j6.j.a;
            if (v6.h.b((Context)localObject, paramString, i)) {
              c = paramString;
            }
          }
          if (!paramString.equals(c)) {}
        }
        else
        {
          return;
        }
        Object localObject = new java/lang/SecurityException;
        ((SecurityException)localObject).<init>(String.format("Unknown calling package name '%s'.", new Object[] { paramString }));
        throw ((Throwable)localObject);
      }
      catch (SecurityException localSecurityException)
      {
        a.zzj().o.c("Measurement Service called with invalid calling package. appId", a1.p(paramString));
        throw localSecurityException;
      }
    }
    a.zzj().o.b("Measurement Service called without app package");
    throw new SecurityException("Measurement Service called without app package");
  }
  
  public final void e3(k6 paramk6)
  {
    m6.j.i(paramk6);
    m6.j.e(a);
    d3(a, false);
    a.b0().V(b, x);
  }
  
  public final void f3(Runnable paramRunnable)
  {
    if (a.zzl().w())
    {
      paramRunnable.run();
      return;
    }
    a.zzl().u(paramRunnable);
  }
  
  public final void g(f0 paramf0, String paramString1, String paramString2)
  {
    m6.j.i(paramf0);
    m6.j.e(paramString1);
    d3(paramString1, true);
    f3(new x2(this, paramf0, paramString1, 1));
  }
  
  public final void g0(q6 paramq6, k6 paramk6)
  {
    m6.j.i(paramq6);
    e3(paramk6);
    f3(new v1(this, paramq6, paramk6, 1));
  }
  
  public final List<q6> h0(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    d3(paramString1, true);
    paramString2 = a.zzl().p(new t2(this, paramString1, paramString2, paramString3));
    try
    {
      paramString3 = (List)paramString2.get();
      paramString2 = new java/util/ArrayList;
      paramString2.<init>(paramString3.size());
      paramString3 = paramString3.iterator();
      while (paramString3.hasNext())
      {
        s6 locals6 = (s6)paramString3.next();
        if ((paramBoolean) || (!r6.r0(c)))
        {
          q6 localq6 = new e7/q6;
          localq6.<init>(locals6);
          paramString2.add(localq6);
        }
      }
      return paramString2;
    }
    catch (ExecutionException paramString2) {}catch (InterruptedException paramString2) {}
    a.zzj().o.d("Failed to get user properties as. appId", a1.p(paramString1), paramString2);
    return Collections.emptyList();
  }
  
  public final List<f> h1(String paramString1, String paramString2, String paramString3)
  {
    d3(paramString1, true);
    paramString1 = a.zzl().p(new v2(this, paramString1, paramString2, paramString3));
    try
    {
      paramString1 = (List)paramString1.get();
      return paramString1;
    }
    catch (ExecutionException paramString1) {}catch (InterruptedException paramString1) {}
    a.zzj().o.c("Failed to get conditional user properties as", paramString1);
    return Collections.emptyList();
  }
  
  public final void h2(k6 paramk6, Bundle paramBundle, p0 paramp0)
  {
    e3(paramk6);
    String str = a;
    m6.j.i(str);
    a.zzl().u(new m2(this, paramk6, paramBundle, paramp0, str));
  }
  
  public final void k0(k6 paramk6)
  {
    m6.j.e(a);
    m6.j.i(C);
    r(new n2(this, paramk6, 0));
  }
  
  public final void l1(k6 paramk6)
  {
    m6.j.e(a);
    m6.j.i(C);
    r(new l2(this, paramk6, 0));
  }
  
  public final List m(Bundle paramBundle, k6 paramk6)
  {
    e3(paramk6);
    m6.j.i(a);
    if (a.R().x(null, h0.d1)) {
      paramBundle = a.zzl().t(new a3(this, paramk6, paramBundle));
    }
    try
    {
      paramBundle = (List)paramBundle.get(10000L, TimeUnit.MILLISECONDS);
      return paramBundle;
    }
    catch (TimeoutException paramBundle)
    {
      break label106;
      paramBundle = a.zzl().p(new b3(this, paramk6, paramBundle));
      paramBundle = (List)paramBundle.get();
      return paramBundle;
    }
    catch (ExecutionException paramBundle) {}catch (InterruptedException paramBundle) {}
    label106:
    a.zzj().o.d("Failed to get trigger URIs. appId", a1.p(a), paramBundle);
    return Collections.emptyList();
  }
  
  public final void m(Bundle paramBundle, k6 paramk6)
  {
    e3(paramk6);
    String str = a;
    m6.j.i(str);
    f3(new p2(this, paramBundle, str, paramk6));
  }
  
  public final void r(Runnable paramRunnable)
  {
    if (a.zzl().w())
    {
      paramRunnable.run();
      return;
    }
    a.zzl().v(paramRunnable);
  }
  
  public final void r2(k6 paramk6)
  {
    e3(paramk6);
    f3(new n2(this, paramk6, 1));
  }
  
  public final n v1(k6 paramk6)
  {
    e3(paramk6);
    m6.j.e(a);
    Object localObject = a.zzl().t(new y2(this, paramk6, 0));
    try
    {
      localObject = (n)((FutureTask)localObject).get(10000L, TimeUnit.MILLISECONDS);
      return (n)localObject;
    }
    catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}catch (TimeoutException localTimeoutException) {}
    a.zzj().o.d("Failed to get consent. appId", a1.p(a), localTimeoutException);
    return new n(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package e7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import b.a0;
import b.z;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfw.zza;
import com.google.android.gms.internal.measurement.zzfw.zza.zza;
import com.google.android.gms.internal.measurement.zzfw.zzb;
import com.google.android.gms.internal.measurement.zzfw.zzb.zza;
import com.google.android.gms.internal.measurement.zzfw.zzc;
import com.google.android.gms.internal.measurement.zzfw.zzc.zza;
import com.google.android.gms.internal.measurement.zzfw.zze;
import com.google.android.gms.internal.measurement.zzfw.zze.zza;
import com.google.android.gms.internal.measurement.zzgc.zza;
import com.google.android.gms.internal.measurement.zzgc.zza.zzb;
import com.google.android.gms.internal.measurement.zzgc.zza.zzd;
import com.google.android.gms.internal.measurement.zzgc.zza.zze;
import com.google.android.gms.internal.measurement.zzgc.zzb;
import com.google.android.gms.internal.measurement.zzgc.zzc.zza;
import com.google.android.gms.internal.measurement.zzgc.zzd;
import com.google.android.gms.internal.measurement.zzgc.zzd.zza;
import com.google.android.gms.internal.measurement.zzgc.zzh;
import com.google.android.gms.internal.measurement.zzgr.zza;
import com.google.android.gms.internal.measurement.zzgr.zzb;
import com.google.android.gms.internal.measurement.zzgr.zzc;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg.zza;
import com.google.android.gms.internal.measurement.zzkp;
import d2.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p2.m0;
import r.b;
import r.f;
import r.h;
import va.a;

public final class w1
  extends h6
  implements j
{
  public final b e = new b();
  public final b f = new b();
  public final b o = new b();
  public final b p = new b();
  public final b q = new b();
  public final b r = new b();
  public final b2 s = new b2(this);
  public final q t = new q(this, 3);
  public final b u = new b();
  public final b v = new b();
  public final b w = new b();
  
  public w1(i6 parami6)
  {
    super(parami6);
  }
  
  public static e3.a u(zzgc.zza.zze paramzze)
  {
    int i = c2.b[paramzze.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            return null;
          }
          return e3.a.e;
        }
        return e3.a.d;
      }
      return e3.a.c;
    }
    return e3.a.b;
  }
  
  public static b w(zzgc.zzd paramzzd)
  {
    b localb = new b();
    if (paramzzd != null)
    {
      Iterator localIterator = paramzzd.zzn().iterator();
      while (localIterator.hasNext())
      {
        paramzzd = (zzgc.zzh)localIterator.next();
        localb.put(paramzzd.zzb(), paramzzd.zzc());
      }
    }
    return localb;
  }
  
  public final int A(String paramString1, String paramString2)
  {
    l();
    L(paramString1);
    paramString1 = (Map)r.getOrDefault(paramString1, null);
    if (paramString1 != null)
    {
      paramString1 = (Integer)paramString1.get(paramString2);
      if (paramString1 == null) {
        return 1;
      }
      return paramString1.intValue();
    }
    return 1;
  }
  
  public final zzgc.zza B(String paramString)
  {
    l();
    L(paramString);
    paramString = C(paramString);
    if ((paramString != null) && (paramString.zzo())) {
      return paramString.zzd();
    }
    return null;
  }
  
  public final zzgc.zzd C(String paramString)
  {
    p();
    l();
    m6.j.e(paramString);
    L(paramString);
    return (zzgc.zzd)q.getOrDefault(paramString, null);
  }
  
  public final boolean D(String paramString, e3.a parama)
  {
    l();
    L(paramString);
    paramString = B(paramString);
    if (paramString == null) {
      return false;
    }
    Iterator localIterator = paramString.zzd().iterator();
    while (localIterator.hasNext())
    {
      paramString = (zzgc.zza.zzb)localIterator.next();
      if (parama == u(paramString.zzc())) {
        if (paramString.zzb() == zzgc.zza.zzd.zzb) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean E(String paramString1, String paramString2)
  {
    l();
    L(paramString1);
    if ("ecommerce_purchase".equals(paramString2)) {
      return true;
    }
    if ((!"purchase".equals(paramString2)) && (!"refund".equals(paramString2)))
    {
      paramString1 = (Map)p.getOrDefault(paramString1, null);
      if (paramString1 != null)
      {
        paramString1 = (Boolean)paramString1.get(paramString2);
        if (paramString1 == null) {
          return false;
        }
        return paramString1.booleanValue();
      }
      return false;
    }
    return true;
  }
  
  public final boolean F(String paramString1, String paramString2)
  {
    l();
    L(paramString1);
    if (("1".equals(b(paramString1, "measurement.upload.blacklist_internal"))) && (r6.r0(paramString2))) {
      return true;
    }
    if (("1".equals(b(paramString1, "measurement.upload.blacklist_public"))) && (r6.t0(paramString2))) {
      return true;
    }
    paramString1 = (Map)o.getOrDefault(paramString1, null);
    if (paramString1 != null)
    {
      paramString1 = (Boolean)paramString1.get(paramString2);
      if (paramString1 == null) {
        return false;
      }
      return paramString1.booleanValue();
    }
    return false;
  }
  
  public final String G(String paramString)
  {
    l();
    L(paramString);
    return (String)u.getOrDefault(paramString, null);
  }
  
  public final boolean H(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    paramString = (zzgc.zzd)q.getOrDefault(paramString, null);
    if (paramString == null) {
      return false;
    }
    return paramString.zza() != 0;
  }
  
  public final boolean I(String paramString)
  {
    l();
    L(paramString);
    paramString = B(paramString);
    if (paramString == null) {
      return true;
    }
    return (!paramString.zzh()) || (paramString.zzg());
  }
  
  public final boolean J(String paramString)
  {
    l();
    L(paramString);
    return (f.getOrDefault(paramString, null) != null) && (((Set)f.getOrDefault(paramString, null)).contains("app_instance_id"));
  }
  
  public final boolean K(String paramString)
  {
    l();
    L(paramString);
    return (f.getOrDefault(paramString, null) != null) && ((((Set)f.getOrDefault(paramString, null)).contains("os_version")) || (((Set)f.getOrDefault(paramString, null)).contains("device_info")));
  }
  
  /* Error */
  public final void L(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 164	e7/h6:p	()V
    //   4: aload_0
    //   5: invokevirtual 131	d2/q:l	()V
    //   8: aload_1
    //   9: invokestatic 168	m6/j:e	(Ljava/lang/String;)V
    //   12: aload_0
    //   13: getfield 39	e7/w1:q	Lr/b;
    //   16: astore_2
    //   17: aconst_null
    //   18: astore_3
    //   19: aload_2
    //   20: aload_1
    //   21: aconst_null
    //   22: invokevirtual 138	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   25: ifnonnull +470 -> 495
    //   28: aload_0
    //   29: invokevirtual 269	e7/z5:n	()Le7/o;
    //   32: astore 4
    //   34: aload_1
    //   35: invokestatic 168	m6/j:e	(Ljava/lang/String;)V
    //   38: aload 4
    //   40: invokevirtual 131	d2/q:l	()V
    //   43: aload 4
    //   45: invokevirtual 164	e7/h6:p	()V
    //   48: aload 4
    //   50: invokevirtual 274	e7/o:s	()Landroid/database/sqlite/SQLiteDatabase;
    //   53: ldc_w 276
    //   56: iconst_3
    //   57: anewarray 197	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: ldc_w 278
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: ldc_w 280
    //   71: aastore
    //   72: dup
    //   73: iconst_2
    //   74: ldc_w 282
    //   77: aastore
    //   78: ldc_w 284
    //   81: iconst_1
    //   82: anewarray 197	java/lang/String
    //   85: dup
    //   86: iconst_0
    //   87: aload_1
    //   88: aastore
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: invokevirtual 290	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   95: astore_2
    //   96: aload_2
    //   97: astore_3
    //   98: aload_2
    //   99: invokeinterface 295 1 0
    //   104: ifne +6 -> 110
    //   107: goto +143 -> 250
    //   110: aload_2
    //   111: astore_3
    //   112: aload_2
    //   113: iconst_0
    //   114: invokeinterface 299 2 0
    //   119: astore 5
    //   121: aload_2
    //   122: astore_3
    //   123: aload_2
    //   124: iconst_1
    //   125: invokeinterface 303 2 0
    //   130: astore 6
    //   132: aload_2
    //   133: astore_3
    //   134: aload_2
    //   135: iconst_2
    //   136: invokeinterface 303 2 0
    //   141: astore 7
    //   143: aload_2
    //   144: astore_3
    //   145: aload_2
    //   146: invokeinterface 306 1 0
    //   151: ifeq +23 -> 174
    //   154: aload_2
    //   155: astore_3
    //   156: aload 4
    //   158: invokevirtual 310	d2/q:zzj	()Le7/a1;
    //   161: getfield 315	e7/a1:o	Le7/b1;
    //   164: ldc_w 317
    //   167: aload_1
    //   168: invokestatic 320	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   171: invokevirtual 325	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   174: aload 5
    //   176: ifnonnull +6 -> 182
    //   179: goto +71 -> 250
    //   182: aload_2
    //   183: astore_3
    //   184: new 327	r3/a0
    //   187: dup
    //   188: aload 5
    //   190: aload 6
    //   192: aload 7
    //   194: invokespecial 330	r3/a0:<init>	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   197: astore 5
    //   199: aload_2
    //   200: invokeinterface 333 1 0
    //   205: aload 5
    //   207: astore_2
    //   208: goto +50 -> 258
    //   211: astore 5
    //   213: goto +11 -> 224
    //   216: astore_1
    //   217: goto +266 -> 483
    //   220: astore 5
    //   222: aconst_null
    //   223: astore_2
    //   224: aload_2
    //   225: astore_3
    //   226: aload 4
    //   228: invokevirtual 310	d2/q:zzj	()Le7/a1;
    //   231: getfield 315	e7/a1:o	Le7/b1;
    //   234: ldc_w 335
    //   237: aload_1
    //   238: invokestatic 320	e7/a1:p	(Ljava/lang/String;)Le7/e1;
    //   241: aload 5
    //   243: invokevirtual 338	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   246: aload_2
    //   247: ifnull +9 -> 256
    //   250: aload_2
    //   251: invokeinterface 333 1 0
    //   256: aconst_null
    //   257: astore_2
    //   258: aload_2
    //   259: ifnonnull +94 -> 353
    //   262: aload_0
    //   263: getfield 31	e7/w1:e	Lr/b;
    //   266: aload_1
    //   267: aconst_null
    //   268: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   271: pop
    //   272: aload_0
    //   273: getfield 35	e7/w1:o	Lr/b;
    //   276: aload_1
    //   277: aconst_null
    //   278: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   281: pop
    //   282: aload_0
    //   283: getfield 33	e7/w1:f	Lr/b;
    //   286: aload_1
    //   287: aconst_null
    //   288: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   291: pop
    //   292: aload_0
    //   293: getfield 37	e7/w1:p	Lr/b;
    //   296: aload_1
    //   297: aconst_null
    //   298: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   301: pop
    //   302: aload_0
    //   303: getfield 39	e7/w1:q	Lr/b;
    //   306: aload_1
    //   307: aconst_null
    //   308: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   311: pop
    //   312: aload_0
    //   313: getfield 41	e7/w1:u	Lr/b;
    //   316: aload_1
    //   317: aconst_null
    //   318: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   321: pop
    //   322: aload_0
    //   323: getfield 43	e7/w1:v	Lr/b;
    //   326: aload_1
    //   327: aconst_null
    //   328: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   331: pop
    //   332: aload_0
    //   333: getfield 45	e7/w1:w	Lr/b;
    //   336: aload_1
    //   337: aconst_null
    //   338: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   341: pop
    //   342: aload_0
    //   343: getfield 47	e7/w1:r	Lr/b;
    //   346: aload_1
    //   347: aconst_null
    //   348: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   351: pop
    //   352: return
    //   353: aload_0
    //   354: aload_1
    //   355: aload_2
    //   356: getfield 342	r3/a0:a	Ljava/lang/Object;
    //   359: checkcast 344	[B
    //   362: invokevirtual 347	e7/w1:t	(Ljava/lang/String;[B)Lcom/google/android/gms/internal/measurement/zzgc$zzd;
    //   365: invokevirtual 353	com/google/android/gms/internal/measurement/zzkg:zzch	()Lcom/google/android/gms/internal/measurement/zzkg$zza;
    //   368: checkcast 355	com/google/android/gms/internal/measurement/zzgc$zzd$zza
    //   371: astore_3
    //   372: aload_0
    //   373: aload_1
    //   374: aload_3
    //   375: invokevirtual 359	e7/w1:x	(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzgc$zzd$zza;)V
    //   378: aload_0
    //   379: getfield 31	e7/w1:e	Lr/b;
    //   382: aload_1
    //   383: aload_3
    //   384: invokevirtual 365	com/google/android/gms/internal/measurement/zzkg$zza:zzaj	()Lcom/google/android/gms/internal/measurement/zzlm;
    //   387: checkcast 349	com/google/android/gms/internal/measurement/zzkg
    //   390: checkcast 91	com/google/android/gms/internal/measurement/zzgc$zzd
    //   393: invokestatic 367	e7/w1:w	(Lcom/google/android/gms/internal/measurement/zzgc$zzd;)Lr/b;
    //   396: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   399: pop
    //   400: aload_0
    //   401: getfield 39	e7/w1:q	Lr/b;
    //   404: aload_1
    //   405: aload_3
    //   406: invokevirtual 365	com/google/android/gms/internal/measurement/zzkg$zza:zzaj	()Lcom/google/android/gms/internal/measurement/zzlm;
    //   409: checkcast 349	com/google/android/gms/internal/measurement/zzkg
    //   412: checkcast 91	com/google/android/gms/internal/measurement/zzgc$zzd
    //   415: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   418: pop
    //   419: aload_0
    //   420: aload_1
    //   421: aload_3
    //   422: invokevirtual 365	com/google/android/gms/internal/measurement/zzkg$zza:zzaj	()Lcom/google/android/gms/internal/measurement/zzlm;
    //   425: checkcast 349	com/google/android/gms/internal/measurement/zzkg
    //   428: checkcast 91	com/google/android/gms/internal/measurement/zzgc$zzd
    //   431: invokevirtual 371	e7/w1:y	(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzgc$zzd;)V
    //   434: aload_0
    //   435: getfield 41	e7/w1:u	Lr/b;
    //   438: aload_1
    //   439: aload_3
    //   440: invokevirtual 372	com/google/android/gms/internal/measurement/zzgc$zzd$zza:zzc	()Ljava/lang/String;
    //   443: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   446: pop
    //   447: aload_0
    //   448: getfield 43	e7/w1:v	Lr/b;
    //   451: aload_1
    //   452: aload_2
    //   453: getfield 374	r3/a0:b	Ljava/lang/Object;
    //   456: checkcast 197	java/lang/String
    //   459: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   462: pop
    //   463: aload_0
    //   464: getfield 45	e7/w1:w	Lr/b;
    //   467: aload_1
    //   468: aload_2
    //   469: getfield 376	r3/a0:c	Ljava/lang/Object;
    //   472: checkcast 197	java/lang/String
    //   475: invokevirtual 126	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   478: pop
    //   479: goto +16 -> 495
    //   482: astore_1
    //   483: aload_3
    //   484: ifnull +9 -> 493
    //   487: aload_3
    //   488: invokeinterface 333 1 0
    //   493: aload_1
    //   494: athrow
    //   495: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	496	0	this	w1
    //   0	496	1	paramString	String
    //   16	453	2	localObject1	Object
    //   18	470	3	localObject2	Object
    //   32	195	4	localo	o
    //   119	87	5	localObject3	Object
    //   211	1	5	localSQLiteException1	SQLiteException
    //   220	22	5	localSQLiteException2	SQLiteException
    //   130	61	6	str1	String
    //   141	52	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   98	107	211	android/database/sqlite/SQLiteException
    //   112	121	211	android/database/sqlite/SQLiteException
    //   123	132	211	android/database/sqlite/SQLiteException
    //   134	143	211	android/database/sqlite/SQLiteException
    //   145	154	211	android/database/sqlite/SQLiteException
    //   156	174	211	android/database/sqlite/SQLiteException
    //   184	199	211	android/database/sqlite/SQLiteException
    //   48	96	216	finally
    //   48	96	220	android/database/sqlite/SQLiteException
    //   98	107	482	finally
    //   112	121	482	finally
    //   123	132	482	finally
    //   134	143	482	finally
    //   145	154	482	finally
    //   156	174	482	finally
    //   184	199	482	finally
    //   226	246	482	finally
  }
  
  public final String b(String paramString1, String paramString2)
  {
    l();
    L(paramString1);
    paramString1 = (Map)e.getOrDefault(paramString1, null);
    if (paramString1 != null) {
      return (String)paramString1.get(paramString2);
    }
    return null;
  }
  
  public final boolean r()
  {
    return false;
  }
  
  public final long s(String paramString)
  {
    String str = b(paramString, "measurement.account.time_zone_offset_minutes");
    if (!TextUtils.isEmpty(str)) {
      try
      {
        long l = Long.parseLong(str);
        return l;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        zzjr.d("Unable to parse timezone offset. appId", a1.p(paramString), localNumberFormatException);
      }
    }
    return 0L;
  }
  
  public final zzgc.zzd t(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return zzgc.zzd.zzg();
    }
    try
    {
      zzgc.zzd localzzd = (zzgc.zzd)((zzgc.zzd.zza)o6.z(zzgc.zzd.zze(), paramArrayOfByte)).zzaj();
      b1 localb1 = zzjw;
      boolean bool = localzzd.zzr();
      String str = null;
      if (bool) {
        paramArrayOfByte = Long.valueOf(localzzd.zzc());
      } else {
        paramArrayOfByte = null;
      }
      if (localzzd.zzp()) {
        str = localzzd.zzi();
      }
      localb1.d("Parsed config. version, gmp_app_id", paramArrayOfByte, str);
      return localzzd;
    }
    catch (RuntimeException paramArrayOfByte) {}catch (zzkp paramArrayOfByte) {}
    zzjr.d("Unable to merge remote config. appId", a1.p(paramString), paramArrayOfByte);
    return zzgc.zzd.zzg();
  }
  
  public final g3 v(String paramString, e3.a parama)
  {
    g3 localg3 = g3.b;
    l();
    L(paramString);
    paramString = B(paramString);
    if (paramString == null) {
      return localg3;
    }
    Iterator localIterator = paramString.zzf().iterator();
    while (localIterator.hasNext())
    {
      paramString = (zzgc.zza.zzb)localIterator.next();
      if (u(paramString.zzc()) == parama)
      {
        int i = c2.c[paramString.zzb().ordinal()];
        if (i != 1)
        {
          if (i != 2) {
            return localg3;
          }
          return g3.e;
        }
        return g3.d;
      }
    }
    return localg3;
  }
  
  public final void x(String paramString, zzgc.zzd.zza paramzza)
  {
    HashSet localHashSet = new HashSet();
    b localb1 = new b();
    b localb2 = new b();
    b localb3 = new b();
    if (paramzza != null)
    {
      Object localObject = paramzza.zze().iterator();
      while (((Iterator)localObject).hasNext()) {
        localHashSet.add(((zzgc.zzb)((Iterator)localObject).next()).zzb());
      }
      for (int i = 0; i < paramzza.zza(); i++)
      {
        zzgc.zzc.zza localzza = (zzgc.zzc.zza)paramzza.zza(i).zzch();
        if (localzza.zzb().isEmpty())
        {
          zzjr.b("EventConfig contained null event name");
        }
        else
        {
          String str1 = localzza.zzb();
          String str2 = a.i(localzza.zzb(), a0.b, a0.d);
          localObject = localzza;
          if (!TextUtils.isEmpty(str2))
          {
            localObject = localzza.zza(str2);
            paramzza.zza(i, (zzgc.zzc.zza)localObject);
          }
          if ((((zzgc.zzc.zza)localObject).zze()) && (((zzgc.zzc.zza)localObject).zzc())) {
            localb1.put(str1, Boolean.TRUE);
          }
          if ((((zzgc.zzc.zza)localObject).zzf()) && (((zzgc.zzc.zza)localObject).zzd())) {
            localb2.put(((zzgc.zzc.zza)localObject).zzb(), Boolean.TRUE);
          }
          if (((zzgc.zzc.zza)localObject).zzg()) {
            if ((((zzgc.zzc.zza)localObject).zza() >= 2) && (((zzgc.zzc.zza)localObject).zza() <= 65535)) {
              localb3.put(((zzgc.zzc.zza)localObject).zzb(), Integer.valueOf(((zzgc.zzc.zza)localObject).zza()));
            } else {
              zzjr.d("Invalid sampling rate. Event name, sample rate", ((zzgc.zzc.zza)localObject).zzb(), Integer.valueOf(((zzgc.zzc.zza)localObject).zza()));
            }
          }
        }
      }
    }
    f.put(paramString, localHashSet);
    o.put(paramString, localb1);
    p.put(paramString, localb2);
    r.put(paramString, localb3);
  }
  
  public final void y(String paramString, zzgc.zzd paramzzd)
  {
    if (paramzzd.zza() == 0)
    {
      s.remove(paramString);
      return;
    }
    zzjw.c("EES programs found", Integer.valueOf(paramzzd.zza()));
    paramzzd = (zzgr.zzc)paramzzd.zzm().get(0);
    try
    {
      Object localObject1 = new com/google/android/gms/internal/measurement/zzb;
      ((zzb)localObject1).<init>();
      Object localObject2 = new e7/y1;
      ((y1)localObject2).<init>(this, paramString);
      ((zzb)localObject1).zza("internal.remoteConfig", (Callable)localObject2);
      localObject2 = new e7/x1;
      ((x1)localObject2).<init>(this, paramString);
      ((zzb)localObject1).zza("internal.appMetadata", (Callable)localObject2);
      localObject2 = new e7/a2;
      ((a2)localObject2).<init>(this);
      ((zzb)localObject1).zza("internal.logger", (Callable)localObject2);
      ((zzb)localObject1).zza(paramzzd);
      s.put(paramString, localObject1);
      zzjw.d("EES program loaded for appId, activities", paramString, Integer.valueOf(paramzzd.zza().zza()));
      paramzzd = paramzzd.zza().zzd().iterator();
      while (paramzzd.hasNext())
      {
        localObject1 = (zzgr.zzb)paramzzd.next();
        zzjw.c("EES program activity", ((zzgr.zzb)localObject1).zzb());
      }
      return;
    }
    catch (zzc paramzzd)
    {
      zzjo.c("Failed to load EES program. appId", paramString);
    }
  }
  
  public final boolean z(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    p();
    l();
    m6.j.e(paramString1);
    Object localObject1 = (zzgc.zzd.zza)t(paramString1, paramArrayOfByte).zzch();
    if (localObject1 == null) {
      return false;
    }
    x(paramString1, (zzgc.zzd.zza)localObject1);
    y(paramString1, (zzgc.zzd)((zzkg.zza)localObject1).zzaj());
    q.put(paramString1, (zzgc.zzd)((zzkg.zza)localObject1).zzaj());
    u.put(paramString1, ((zzgc.zzd.zza)localObject1).zzc());
    v.put(paramString1, paramString2);
    w.put(paramString1, paramString3);
    e.put(paramString1, w((zzgc.zzd)((zzkg.zza)localObject1).zzaj()));
    o localo1 = n();
    ArrayList localArrayList = new ArrayList(((zzgc.zzd.zza)localObject1).zzd());
    Object localObject2 = "app_id=? and audience_id=?";
    int i = 0;
    int j;
    Object localObject3;
    Object localObject5;
    Object localObject6;
    int k;
    Object localObject7;
    for (;;)
    {
      j = 0;
      if (i >= localArrayList.size()) {
        break;
      }
      localObject3 = (zzfw.zza.zza)((zzfw.zza)localArrayList.get(i)).zzch();
      localObject4 = localObject1;
      localObject5 = localObject2;
      localObject6 = localObject3;
      if (((zzfw.zza.zza)localObject3).zza() != 0) {
        for (;;)
        {
          localObject4 = localObject1;
          localObject5 = localObject2;
          localObject6 = localObject3;
          if (j >= ((zzfw.zza.zza)localObject3).zza()) {
            break;
          }
          localObject5 = (zzfw.zzb.zza)((zzfw.zza.zza)localObject3).zza(j).zzch();
          localObject4 = (zzfw.zzb.zza)((zzkg.zza)localObject5).clone();
          localObject6 = a.i(((zzfw.zzb.zza)localObject5).zzb(), a0.b, a0.d);
          if (localObject6 != null)
          {
            ((zzfw.zzb.zza)localObject4).zza((String)localObject6);
            k = 1;
          }
          else
          {
            k = 0;
          }
          int m = 0;
          int n = k;
          for (k = m; k < ((zzfw.zzb.zza)localObject5).zza(); k++)
          {
            localObject7 = ((zzfw.zzb.zza)localObject5).zza(k);
            localObject6 = a.i(((zzfw.zzc)localObject7).zze(), z.a, z.b);
            if (localObject6 != null)
            {
              ((zzfw.zzb.zza)localObject4).zza(k, (zzfw.zzc)((zzfw.zzc.zza)((zzkg)localObject7).zzch()).zza((String)localObject6).zzaj());
              n = 1;
            }
          }
          localObject5 = localObject3;
          if (n != 0)
          {
            localObject5 = ((zzfw.zza.zza)localObject3).zza(j, (zzfw.zzb.zza)localObject4);
            localArrayList.set(i, (zzfw.zza)((zzkg.zza)localObject5).zzaj());
          }
          j++;
          localObject3 = localObject5;
        }
      }
      if (((zzfw.zza.zza)localObject6).zzb() != 0)
      {
        k = 0;
        while (k < ((zzfw.zza.zza)localObject6).zzb())
        {
          localObject3 = ((zzfw.zza.zza)localObject6).zzb(k);
          localObject1 = a.i(((zzfw.zze)localObject3).zze(), m0.a, m0.b);
          localObject2 = localObject6;
          if (localObject1 != null)
          {
            localObject2 = ((zzfw.zza.zza)localObject6).zza(k, ((zzfw.zze.zza)((zzkg)localObject3).zzch()).zza((String)localObject1));
            localArrayList.set(i, (zzfw.zza)((zzkg.zza)localObject2).zzaj());
          }
          k++;
          localObject6 = localObject2;
        }
      }
      i++;
      localObject1 = localObject4;
      localObject2 = localObject5;
    }
    localo1.p();
    localo1.l();
    m6.j.e(paramString1);
    Object localObject4 = localo1.s();
    ((SQLiteDatabase)localObject4).beginTransaction();
    try
    {
      localo1.p();
      localo1.l();
      m6.j.e(paramString1);
      localObject3 = localo1.s();
      ((SQLiteDatabase)localObject3).delete("property_filters", "app_id=?", new String[] { paramString1 });
      ((SQLiteDatabase)localObject3).delete("event_filters", "app_id=?", new String[] { paramString1 });
      localObject6 = localArrayList.iterator();
      while (((Iterator)localObject6).hasNext())
      {
        localObject3 = (zzfw.zza)((Iterator)localObject6).next();
        localo1.p();
        localo1.l();
        m6.j.e(paramString1);
        m6.j.i(localObject3);
        if (!((zzfw.zza)localObject3).zzg())
        {
          zzjr.c("Audience with no ID. appId", a1.p(paramString1));
        }
        else
        {
          j = ((zzfw.zza)localObject3).zza();
          localObject5 = ((zzfw.zza)localObject3).zze().iterator();
          while (((Iterator)localObject5).hasNext()) {
            if (!((zzfw.zzb)((Iterator)localObject5).next()).zzl()) {
              localObject5 = zzjr;
            }
          }
          for (localObject3 = "Event filter with no ID. Audience definition ignored. appId, audienceId";; localObject3 = "Property filter with no ID. Audience definition ignored. appId, audienceId")
          {
            localObject7 = a1.p(paramString1);
            break;
            localObject5 = ((zzfw.zza)localObject3).zzf().iterator();
            do
            {
              if (!((Iterator)localObject5).hasNext()) {
                break;
              }
            } while (((zzfw.zze)((Iterator)localObject5).next()).zzi());
            localObject5 = zzjr;
          }
          ((b1)localObject5).d((String)localObject3, localObject7, Integer.valueOf(j));
          continue;
          localObject5 = ((zzfw.zza)localObject3).zze().iterator();
          while (((Iterator)localObject5).hasNext()) {
            if (!localo1.V(paramString1, j, (zzfw.zzb)((Iterator)localObject5).next()))
            {
              k = 0;
              break label918;
            }
          }
          k = 1;
          label918:
          i = k;
          if (k != 0)
          {
            localObject3 = ((zzfw.zza)localObject3).zzf().iterator();
            do
            {
              i = k;
              if (!((Iterator)localObject3).hasNext()) {
                break;
              }
            } while (localo1.W(paramString1, j, (zzfw.zze)((Iterator)localObject3).next()));
            i = 0;
          }
          if (i == 0)
          {
            localo1.p();
            localo1.l();
            m6.j.e(paramString1);
            localObject3 = localo1.s();
            ((SQLiteDatabase)localObject3).delete("property_filters", (String)localObject2, new String[] { paramString1, String.valueOf(j) });
            ((SQLiteDatabase)localObject3).delete("event_filters", (String)localObject2, new String[] { paramString1, String.valueOf(j) });
          }
        }
      }
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      localObject5 = localArrayList.iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject2 = (zzfw.zza)((Iterator)localObject5).next();
        if (((zzfw.zza)localObject2).zzg()) {
          localObject2 = Integer.valueOf(((zzfw.zza)localObject2).zza());
        } else {
          localObject2 = null;
        }
        ((ArrayList)localObject3).add(localObject2);
      }
      localo1.g0(paramString1, (ArrayList)localObject3);
      ((SQLiteDatabase)localObject4).setTransactionSuccessful();
      ((SQLiteDatabase)localObject4).endTransaction();
      try
      {
        ((zzgc.zzd.zza)localObject1).zzb();
        localObject2 = ((zzgc.zzd)((zzkg.zza)localObject1).zzaj()).zzce();
        paramArrayOfByte = (byte[])localObject2;
      }
      catch (RuntimeException localRuntimeException)
      {
        zzjr.d("Unable to serialize reduced-size config. Storing full config instead. appId", a1.p(paramString1), localRuntimeException);
      }
      o localo2 = n();
      m6.j.e(paramString1);
      localo2.l();
      localo2.p();
      localObject3 = new ContentValues();
      ((ContentValues)localObject3).put("remote_config", paramArrayOfByte);
      ((ContentValues)localObject3).put("config_last_modified_time", paramString2);
      ((ContentValues)localObject3).put("e_tag", paramString3);
      try
      {
        if (localo2.s().update("apps", (ContentValues)localObject3, "app_id = ?", new String[] { paramString1 }) == 0L) {
          zzjo.c("Failed to update remote config (got 0). appId", a1.p(paramString1));
        }
      }
      catch (SQLiteException paramString2)
      {
        zzjo.d("Error storing remote config. appId", a1.p(paramString1), paramString2);
      }
      q.put(paramString1, (zzgc.zzd)((zzkg.zza)localObject1).zzaj());
      return true;
    }
    finally
    {
      ((SQLiteDatabase)localObject4).endTransaction();
    }
  }
}

/* Location:
 * Qualified Name:     e7.w1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
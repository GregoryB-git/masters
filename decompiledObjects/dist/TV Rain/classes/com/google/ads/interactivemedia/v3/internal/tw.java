package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class tw
  implements tm, vc
{
  public static final Map<String, int[]> a;
  public static final long[] b = { 5400000L, 3400000L, 1900000L, 1100000L, 400000L };
  public static final long[] c = { 170000L, 139000L, 122000L, 107000L, 90000L };
  public static final long[] d = { 2100000L, 1300000L, 960000L, 770000L, 450000L };
  public static final long[] e = { 6000000L, 3400000L, 2100000L, 1400000L, 570000L };
  private static tw f;
  private final Context g;
  private final SparseArray<Long> h;
  private final vk<tp> i;
  private final wd j;
  private final vh k;
  private int l;
  private long m;
  private long n;
  private int o;
  private long p;
  private long q;
  private long r;
  private long s;
  
  static
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("AD", new int[] { 1, 0, 0, 1 });
    localHashMap.put("AE", new int[] { 1, 4, 4, 4 });
    localHashMap.put("AF", new int[] { 4, 4, 3, 3 });
    localHashMap.put("AG", new int[] { 3, 2, 1, 1 });
    localHashMap.put("AI", new int[] { 1, 0, 1, 3 });
    localHashMap.put("AL", new int[] { 1, 2, 1, 1 });
    localHashMap.put("AM", new int[] { 2, 2, 3, 2 });
    localHashMap.put("AO", new int[] { 3, 4, 2, 0 });
    localHashMap.put("AQ", new int[] { 4, 2, 2, 2 });
    localHashMap.put("AR", new int[] { 2, 3, 2, 2 });
    localHashMap.put("AS", new int[] { 3, 3, 4, 1 });
    localHashMap.put("AT", new int[] { 0, 2, 0, 0 });
    localHashMap.put("AU", new int[] { 0, 1, 1, 1 });
    localHashMap.put("AW", new int[] { 1, 1, 0, 2 });
    localHashMap.put("AX", new int[] { 0, 2, 1, 0 });
    localHashMap.put("AZ", new int[] { 3, 3, 2, 2 });
    localHashMap.put("BA", new int[] { 1, 1, 1, 2 });
    localHashMap.put("BB", new int[] { 0, 1, 0, 0 });
    localHashMap.put("BD", new int[] { 2, 2, 3, 2 });
    localHashMap.put("BE", new int[] { 0, 0, 0, 1 });
    localHashMap.put("BF", new int[] { 4, 4, 3, 1 });
    localHashMap.put("BG", new int[] { 0, 1, 0, 0 });
    localHashMap.put("BH", new int[] { 2, 1, 3, 4 });
    localHashMap.put("BI", new int[] { 4, 3, 4, 4 });
    localHashMap.put("BJ", new int[] { 4, 3, 4, 4 });
    localHashMap.put("BL", new int[] { 1, 0, 2, 3 });
    localHashMap.put("BM", new int[] { 1, 0, 0, 0 });
    localHashMap.put("BN", new int[] { 4, 2, 3, 3 });
    localHashMap.put("BO", new int[] { 2, 2, 3, 2 });
    localHashMap.put("BQ", new int[] { 1, 0, 3, 4 });
    localHashMap.put("BR", new int[] { 2, 3, 3, 2 });
    localHashMap.put("BS", new int[] { 2, 0, 1, 4 });
    localHashMap.put("BT", new int[] { 3, 0, 2, 1 });
    localHashMap.put("BW", new int[] { 4, 4, 1, 2 });
    localHashMap.put("BY", new int[] { 0, 1, 1, 2 });
    localHashMap.put("BZ", new int[] { 2, 2, 3, 1 });
    localHashMap.put("CA", new int[] { 0, 3, 3, 3 });
    localHashMap.put("CD", new int[] { 4, 4, 3, 2 });
    localHashMap.put("CF", new int[] { 4, 3, 3, 4 });
    localHashMap.put("CG", new int[] { 4, 4, 4, 4 });
    localHashMap.put("CH", new int[] { 0, 0, 1, 1 });
    localHashMap.put("CI", new int[] { 3, 4, 3, 3 });
    localHashMap.put("CK", new int[] { 2, 4, 1, 0 });
    localHashMap.put("CL", new int[] { 2, 2, 2, 3 });
    localHashMap.put("CM", new int[] { 3, 4, 2, 1 });
    localHashMap.put("CN", new int[] { 2, 2, 2, 3 });
    localHashMap.put("CO", new int[] { 2, 3, 2, 2 });
    localHashMap.put("CR", new int[] { 2, 2, 4, 4 });
    localHashMap.put("CU", new int[] { 4, 4, 3, 1 });
    localHashMap.put("CV", new int[] { 2, 3, 2, 4 });
    localHashMap.put("CW", new int[] { 1, 0, 0, 0 });
    localHashMap.put("CX", new int[] { 2, 2, 2, 2 });
    localHashMap.put("CY", new int[] { 1, 1, 1, 1 });
    localHashMap.put("CZ", new int[] { 0, 1, 0, 0 });
    localHashMap.put("DE", new int[] { 0, 2, 2, 2 });
    localHashMap.put("DJ", new int[] { 3, 3, 4, 0 });
    localHashMap.put("DK", new int[] { 0, 0, 0, 0 });
    localHashMap.put("DM", new int[] { 1, 0, 0, 3 });
    localHashMap.put("DO", new int[] { 3, 3, 4, 4 });
    localHashMap.put("DZ", new int[] { 3, 3, 4, 4 });
    localHashMap.put("EC", new int[] { 2, 4, 4, 2 });
    localHashMap.put("EE", new int[] { 0, 0, 0, 0 });
    localHashMap.put("EG", new int[] { 3, 4, 2, 2 });
    localHashMap.put("EH", new int[] { 2, 0, 3, 3 });
    localHashMap.put("ER", new int[] { 4, 2, 2, 2 });
    localHashMap.put("ES", new int[] { 0, 1, 1, 1 });
    localHashMap.put("ET", new int[] { 4, 4, 4, 0 });
    localHashMap.put("FI", new int[] { 0, 0, 1, 0 });
    localHashMap.put("FJ", new int[] { 3, 1, 3, 3 });
    localHashMap.put("FK", new int[] { 4, 2, 2, 3 });
    localHashMap.put("FM", new int[] { 4, 2, 4, 0 });
    localHashMap.put("FO", new int[] { 0, 0, 0, 0 });
    localHashMap.put("FR", new int[] { 1, 0, 3, 1 });
    localHashMap.put("GA", new int[] { 3, 3, 2, 1 });
    localHashMap.put("GB", new int[] { 0, 1, 3, 3 });
    localHashMap.put("GD", new int[] { 2, 0, 4, 4 });
    localHashMap.put("GE", new int[] { 1, 1, 0, 3 });
    localHashMap.put("GF", new int[] { 1, 2, 4, 4 });
    localHashMap.put("GG", new int[] { 0, 0, 0, 0 });
    localHashMap.put("GH", new int[] { 3, 3, 3, 2 });
    localHashMap.put("GI", new int[] { 0, 0, 0, 1 });
    localHashMap.put("GL", new int[] { 2, 2, 3, 4 });
    localHashMap.put("GM", new int[] { 4, 3, 3, 2 });
    localHashMap.put("GN", new int[] { 4, 4, 4, 0 });
    localHashMap.put("GP", new int[] { 2, 2, 1, 3 });
    localHashMap.put("GQ", new int[] { 4, 3, 3, 0 });
    localHashMap.put("GR", new int[] { 1, 1, 0, 1 });
    localHashMap.put("GT", new int[] { 3, 3, 3, 4 });
    localHashMap.put("GU", new int[] { 1, 2, 4, 4 });
    localHashMap.put("GW", new int[] { 4, 4, 4, 0 });
    localHashMap.put("GY", new int[] { 3, 4, 1, 0 });
    localHashMap.put("HK", new int[] { 0, 1, 4, 4 });
    localHashMap.put("HN", new int[] { 3, 3, 2, 2 });
    localHashMap.put("HR", new int[] { 1, 0, 0, 2 });
    localHashMap.put("HT", new int[] { 3, 4, 4, 3 });
    localHashMap.put("HU", new int[] { 0, 0, 1, 0 });
    localHashMap.put("ID", new int[] { 3, 2, 3, 4 });
    localHashMap.put("IE", new int[] { 0, 0, 3, 2 });
    localHashMap.put("IL", new int[] { 0, 1, 2, 3 });
    localHashMap.put("IM", new int[] { 0, 0, 0, 1 });
    localHashMap.put("IN", new int[] { 2, 2, 4, 4 });
    localHashMap.put("IO", new int[] { 4, 4, 2, 2 });
    localHashMap.put("IQ", new int[] { 3, 3, 4, 4 });
    localHashMap.put("IR", new int[] { 1, 0, 1, 0 });
    localHashMap.put("IS", new int[] { 0, 0, 0, 0 });
    localHashMap.put("IT", new int[] { 1, 0, 1, 1 });
    localHashMap.put("JE", new int[] { 1, 0, 0, 1 });
    localHashMap.put("JM", new int[] { 3, 2, 2, 1 });
    localHashMap.put("JO", new int[] { 1, 1, 1, 2 });
    localHashMap.put("JP", new int[] { 0, 2, 2, 2 });
    localHashMap.put("KE", new int[] { 3, 3, 3, 3 });
    localHashMap.put("KG", new int[] { 1, 1, 2, 3 });
    localHashMap.put("KH", new int[] { 2, 0, 4, 4 });
    localHashMap.put("KI", new int[] { 4, 4, 4, 4 });
    localHashMap.put("KM", new int[] { 4, 4, 3, 3 });
    localHashMap.put("KN", new int[] { 1, 0, 1, 4 });
    localHashMap.put("KP", new int[] { 1, 2, 0, 2 });
    localHashMap.put("KR", new int[] { 0, 3, 0, 2 });
    localHashMap.put("KW", new int[] { 2, 2, 1, 2 });
    localHashMap.put("KY", new int[] { 1, 1, 0, 2 });
    localHashMap.put("KZ", new int[] { 1, 2, 2, 2 });
    localHashMap.put("LA", new int[] { 2, 1, 1, 0 });
    localHashMap.put("LB", new int[] { 3, 2, 0, 0 });
    localHashMap.put("LC", new int[] { 2, 1, 0, 0 });
    localHashMap.put("LI", new int[] { 0, 0, 2, 2 });
    localHashMap.put("LK", new int[] { 1, 1, 2, 2 });
    localHashMap.put("LR", new int[] { 3, 4, 4, 1 });
    localHashMap.put("LS", new int[] { 3, 3, 2, 0 });
    localHashMap.put("LT", new int[] { 0, 0, 0, 0 });
    localHashMap.put("LU", new int[] { 0, 1, 0, 0 });
    localHashMap.put("LV", new int[] { 0, 0, 0, 0 });
    localHashMap.put("LY", new int[] { 4, 3, 4, 4 });
    localHashMap.put("MA", new int[] { 2, 1, 2, 2 });
    localHashMap.put("MC", new int[] { 1, 0, 1, 0 });
    localHashMap.put("MD", new int[] { 1, 1, 0, 0 });
    localHashMap.put("ME", new int[] { 1, 2, 2, 3 });
    localHashMap.put("MF", new int[] { 1, 4, 2, 1 });
    localHashMap.put("MG", new int[] { 3, 4, 1, 3 });
    localHashMap.put("MH", new int[] { 4, 0, 2, 3 });
    localHashMap.put("MK", new int[] { 1, 0, 0, 0 });
    localHashMap.put("ML", new int[] { 4, 4, 4, 3 });
    localHashMap.put("MM", new int[] { 2, 3, 1, 2 });
    localHashMap.put("MN", new int[] { 2, 3, 2, 4 });
    localHashMap.put("MO", new int[] { 0, 0, 4, 4 });
    localHashMap.put("MP", new int[] { 0, 2, 4, 4 });
    localHashMap.put("MQ", new int[] { 1, 1, 1, 3 });
    localHashMap.put("MR", new int[] { 4, 4, 4, 4 });
    localHashMap.put("MS", new int[] { 1, 4, 0, 3 });
    localHashMap.put("MT", new int[] { 0, 1, 0, 0 });
    localHashMap.put("MU", new int[] { 2, 2, 3, 4 });
    localHashMap.put("MV", new int[] { 3, 2, 1, 1 });
    localHashMap.put("MW", new int[] { 4, 2, 1, 1 });
    localHashMap.put("MX", new int[] { 2, 4, 3, 2 });
    localHashMap.put("MY", new int[] { 2, 2, 2, 3 });
    localHashMap.put("MZ", new int[] { 3, 4, 2, 2 });
    localHashMap.put("NA", new int[] { 3, 2, 2, 1 });
    localHashMap.put("NC", new int[] { 2, 1, 3, 2 });
    localHashMap.put("NE", new int[] { 4, 4, 4, 3 });
    localHashMap.put("NF", new int[] { 1, 2, 2, 2 });
    localHashMap.put("NG", new int[] { 3, 4, 3, 2 });
    localHashMap.put("NI", new int[] { 3, 3, 3, 4 });
    localHashMap.put("NL", new int[] { 0, 2, 4, 3 });
    localHashMap.put("NO", new int[] { 0, 1, 0, 0 });
    localHashMap.put("NP", new int[] { 3, 3, 2, 2 });
    localHashMap.put("NR", new int[] { 4, 0, 4, 0 });
    localHashMap.put("NU", new int[] { 2, 2, 2, 1 });
    localHashMap.put("NZ", new int[] { 0, 0, 0, 1 });
    localHashMap.put("OM", new int[] { 2, 2, 1, 3 });
    localHashMap.put("PA", new int[] { 1, 3, 3, 4 });
    localHashMap.put("PE", new int[] { 2, 3, 4, 4 });
    localHashMap.put("PF", new int[] { 3, 1, 0, 1 });
    localHashMap.put("PG", new int[] { 4, 3, 1, 1 });
    localHashMap.put("PH", new int[] { 3, 0, 4, 4 });
    localHashMap.put("PK", new int[] { 3, 3, 3, 3 });
    localHashMap.put("PL", new int[] { 1, 1, 1, 3 });
    localHashMap.put("PM", new int[] { 0, 2, 0, 0 });
    localHashMap.put("PR", new int[] { 2, 1, 3, 3 });
    localHashMap.put("PS", new int[] { 3, 3, 1, 4 });
    localHashMap.put("PT", new int[] { 1, 1, 0, 1 });
    localHashMap.put("PW", new int[] { 2, 2, 1, 1 });
    localHashMap.put("PY", new int[] { 3, 1, 3, 3 });
    localHashMap.put("QA", new int[] { 2, 3, 0, 1 });
    localHashMap.put("RE", new int[] { 1, 0, 2, 2 });
    localHashMap.put("RO", new int[] { 0, 1, 1, 2 });
    localHashMap.put("RS", new int[] { 1, 2, 0, 0 });
    localHashMap.put("RU", new int[] { 0, 1, 1, 1 });
    localHashMap.put("RW", new int[] { 3, 4, 2, 4 });
    localHashMap.put("SA", new int[] { 2, 2, 1, 2 });
    localHashMap.put("SB", new int[] { 4, 4, 3, 0 });
    localHashMap.put("SC", new int[] { 4, 2, 0, 1 });
    localHashMap.put("SD", new int[] { 4, 4, 4, 2 });
    localHashMap.put("SE", new int[] { 0, 1, 0, 0 });
    localHashMap.put("SG", new int[] { 1, 2, 3, 3 });
    localHashMap.put("SH", new int[] { 4, 4, 2, 3 });
    localHashMap.put("SI", new int[] { 0, 1, 0, 1 });
    localHashMap.put("SJ", new int[] { 0, 0, 2, 0 });
    localHashMap.put("SK", new int[] { 0, 1, 0, 1 });
    localHashMap.put("SL", new int[] { 4, 3, 2, 4 });
    localHashMap.put("SM", new int[] { 0, 0, 1, 3 });
    localHashMap.put("SN", new int[] { 4, 4, 4, 3 });
    localHashMap.put("SO", new int[] { 4, 4, 4, 4 });
    localHashMap.put("SR", new int[] { 3, 2, 2, 4 });
    localHashMap.put("SS", new int[] { 4, 2, 4, 2 });
    localHashMap.put("ST", new int[] { 3, 4, 2, 2 });
    localHashMap.put("SV", new int[] { 2, 3, 3, 4 });
    localHashMap.put("SX", new int[] { 2, 4, 1, 0 });
    localHashMap.put("SY", new int[] { 4, 4, 1, 0 });
    localHashMap.put("SZ", new int[] { 3, 4, 2, 3 });
    localHashMap.put("TC", new int[] { 1, 1, 3, 1 });
    localHashMap.put("TD", new int[] { 4, 4, 4, 3 });
    localHashMap.put("TG", new int[] { 3, 3, 1, 0 });
    localHashMap.put("TH", new int[] { 1, 3, 4, 4 });
    localHashMap.put("TJ", new int[] { 4, 4, 4, 4 });
    localHashMap.put("TL", new int[] { 4, 2, 4, 4 });
    localHashMap.put("TM", new int[] { 4, 1, 2, 3 });
    localHashMap.put("TN", new int[] { 2, 1, 1, 1 });
    localHashMap.put("TO", new int[] { 3, 3, 3, 1 });
    localHashMap.put("TR", new int[] { 1, 2, 0, 1 });
    localHashMap.put("TT", new int[] { 2, 3, 1, 2 });
    localHashMap.put("TV", new int[] { 4, 2, 2, 4 });
    localHashMap.put("TW", new int[] { 0, 0, 0, 1 });
    localHashMap.put("TZ", new int[] { 3, 3, 4, 3 });
    localHashMap.put("UA", new int[] { 0, 2, 1, 2 });
    localHashMap.put("UG", new int[] { 4, 3, 2, 3 });
    localHashMap.put("US", new int[] { 0, 1, 3, 3 });
    localHashMap.put("UY", new int[] { 2, 2, 2, 2 });
    localHashMap.put("UZ", new int[] { 3, 2, 2, 2 });
    localHashMap.put("VA", new int[] { 1, 2, 2, 2 });
    localHashMap.put("VC", new int[] { 2, 1, 0, 0 });
    localHashMap.put("VE", new int[] { 4, 4, 4, 3 });
    localHashMap.put("VG", new int[] { 2, 1, 1, 2 });
    localHashMap.put("VI", new int[] { 1, 0, 2, 4 });
    localHashMap.put("VN", new int[] { 0, 2, 4, 4 });
    localHashMap.put("VU", new int[] { 4, 1, 3, 1 });
    localHashMap.put("WS", new int[] { 3, 2, 3, 1 });
    localHashMap.put("XK", new int[] { 1, 2, 1, 0 });
    localHashMap.put("YE", new int[] { 4, 4, 4, 2 });
    localHashMap.put("YT", new int[] { 2, 0, 2, 3 });
    localHashMap.put("ZA", new int[] { 2, 3, 2, 2 });
    localHashMap.put("ZM", new int[] { 3, 3, 2, 1 });
    localHashMap.put("ZW", new int[] { 3, 3, 3, 1 });
    a = Collections.unmodifiableMap(localHashMap);
  }
  
  @Deprecated
  public tw()
  {
    this(null, new SparseArray(), 2000, vh.a, false);
  }
  
  private tw(Context paramContext, SparseArray<Long> paramSparseArray, int paramInt, vh paramvh, boolean paramBoolean)
  {
    Context localContext;
    if (paramContext == null) {
      localContext = null;
    } else {
      localContext = paramContext.getApplicationContext();
    }
    g = localContext;
    h = paramSparseArray;
    i = new vk();
    j = new wd(paramInt);
    k = paramvh;
    if (paramContext == null) {
      paramInt = 0;
    } else {
      paramInt = wl.a(paramContext);
    }
    o = paramInt;
    r = a(paramInt);
    if ((paramContext != null) && (paramBoolean)) {
      ty.a(paramContext).a(this);
    }
  }
  
  private final long a(int paramInt)
  {
    Object localObject1 = (Long)h.get(paramInt);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = (Long)h.get(0);
    }
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = Long.valueOf(1000000L);
    }
    return ((Long)localObject1).longValue();
  }
  
  public static tw a(Context paramContext)
  {
    try
    {
      if (f == null)
      {
        tz localtz = new com/google/ads/interactivemedia/v3/internal/tz;
        localtz.<init>(paramContext);
        f = localtz.a();
      }
      paramContext = f;
      return paramContext;
    }
    finally {}
  }
  
  private final void a(int paramInt, long paramLong1, long paramLong2)
  {
    if ((paramInt == 0) && (paramLong1 == 0L) && (paramLong2 == s)) {
      return;
    }
    s = paramLong2;
    i.a(new up(paramInt, paramLong1, paramLong2));
  }
  
  private final void d()
  {
    try
    {
      Context localContext = g;
      int i1 = 0;
      int i2;
      if (localContext == null) {
        i2 = 0;
      } else {
        i2 = wl.a(localContext);
      }
      int i3 = o;
      if (i3 == i2) {
        return;
      }
      o = i2;
      if ((i2 != 1) && (i2 != 0) && (i2 != 8))
      {
        r = a(i2);
        long l1 = k.a();
        i2 = i1;
        if (l > 0) {
          i2 = (int)(l1 - m);
        }
        a(i2, n, r);
        m = l1;
        n = 0L;
        q = 0L;
        p = 0L;
        j.a();
        return;
      }
      return;
    }
    finally {}
  }
  
  public final long a()
  {
    try
    {
      long l1 = r;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(Handler paramHandler, tp paramtp)
  {
    i.a(paramHandler, paramtp);
  }
  
  public final void a(tp paramtp)
  {
    i.a(paramtp);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    try
    {
      if (l == 0) {
        m = k.a();
      }
      l += 1;
      return;
    }
    finally {}
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    if (!paramBoolean) {
      return;
    }
    try
    {
      n += paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final vc b()
  {
    return this;
  }
  
  public final void b(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    try
    {
      if (l > 0) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      rp.c(paramBoolean);
      long l1 = k.a();
      int i1 = (int)(l1 - m);
      p += i1;
      long l2 = q;
      long l3 = n;
      q = (l2 + l3);
      if (i1 > 0)
      {
        float f1 = (float)l3 * 8000.0F / i1;
        j.a((int)Math.sqrt(l3), f1);
        if ((p >= 2000L) || (q >= 524288L)) {
          r = (j.a(0.5F));
        }
        a(i1, n, r);
        m = l1;
        n = 0L;
      }
      l -= 1;
      return;
    }
    finally {}
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package E1;

import T1.a;
import W5.C;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x1.B;

public final class j
{
  public static final j a = new j();
  public static SharedPreferences b;
  public static final Set c = new CopyOnWriteArraySet();
  public static final Map d = new ConcurrentHashMap();
  
  public static final boolean d()
  {
    if (a.d(j.class)) {
      return false;
    }
    try
    {
      a.g();
      long l1 = System.currentTimeMillis() / 1000L;
      SharedPreferences localSharedPreferences = b;
      if (localSharedPreferences != null)
      {
        long l2 = localSharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
        if ((l2 != 0L) && (l1 - l2 < 86400)) {
          return false;
        }
        localSharedPreferences = b;
        if (localSharedPreferences != null)
        {
          localSharedPreferences.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", l1).apply();
          return true;
        }
      }
    }
    finally
    {
      break label107;
      Intrinsics.n("sharedPreferences");
      throw null;
      Intrinsics.n("sharedPreferences");
      throw null;
      label107:
      a.b(localThrowable, j.class);
    }
    return false;
  }
  
  public static final void e(Map paramMap1, Map paramMap2)
  {
    if (a.d(j.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramMap1, "purchaseDetailsMap");
      Intrinsics.checkNotNullParameter(paramMap2, "skuDetailsMap");
      j localj = a;
      localj.g();
      localj.f(localj.c(localj.a(paramMap1), paramMap2));
      return;
    }
    finally
    {
      a.b(paramMap1, j.class);
    }
  }
  
  /* Error */
  public final Map a(Map paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 37	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: aload_1
    //   10: ldc 87
    //   12: invokestatic 91	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: invokestatic 46	java/lang/System:currentTimeMillis	()J
    //   18: ldc2_w 47
    //   21: ldiv
    //   22: lstore_2
    //   23: aload_1
    //   24: invokestatic 110	W5/C:m	(Ljava/util/Map;)Ljava/util/Map;
    //   27: invokeinterface 116 1 0
    //   32: invokeinterface 122 1 0
    //   37: astore 4
    //   39: aload 4
    //   41: invokeinterface 127 1 0
    //   46: ifeq +141 -> 187
    //   49: aload 4
    //   51: invokeinterface 131 1 0
    //   56: checkcast 133	java/util/Map$Entry
    //   59: astore 5
    //   61: aload 5
    //   63: invokeinterface 136 1 0
    //   68: checkcast 138	java/lang/String
    //   71: astore 6
    //   73: aload 5
    //   75: invokeinterface 141 1 0
    //   80: checkcast 143	org/json/JSONObject
    //   83: astore 5
    //   85: aload 5
    //   87: ldc -111
    //   89: invokevirtual 149	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   92: ifeq -53 -> 39
    //   95: aload 5
    //   97: ldc -111
    //   99: invokevirtual 153	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   102: astore 5
    //   104: getstatic 29	E1/j:d	Ljava/util/Map;
    //   107: aload 5
    //   109: invokeinterface 156 2 0
    //   114: ifeq +19 -> 133
    //   117: aload_1
    //   118: aload 6
    //   120: invokeinterface 160 2 0
    //   125: pop
    //   126: goto -87 -> 39
    //   129: astore_1
    //   130: goto +105 -> 235
    //   133: getstatic 24	E1/j:c	Ljava/util/Set;
    //   136: astore 6
    //   138: new 162	java/lang/StringBuilder
    //   141: astore 7
    //   143: aload 7
    //   145: invokespecial 163	java/lang/StringBuilder:<init>	()V
    //   148: aload 7
    //   150: aload 5
    //   152: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload 7
    //   158: bipush 59
    //   160: invokevirtual 170	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload 7
    //   166: lload_2
    //   167: invokevirtual 173	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload 6
    //   173: aload 7
    //   175: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokeinterface 180 2 0
    //   183: pop
    //   184: goto -145 -> 39
    //   187: getstatic 50	E1/j:b	Landroid/content/SharedPreferences;
    //   190: astore 4
    //   192: aload 4
    //   194: ifnull +34 -> 228
    //   197: aload 4
    //   199: invokeinterface 63 1 0
    //   204: ldc -74
    //   206: getstatic 24	E1/j:c	Ljava/util/Set;
    //   209: invokeinterface 186 3 0
    //   214: invokeinterface 72 1 0
    //   219: new 188	java/util/HashMap
    //   222: dup
    //   223: aload_1
    //   224: invokespecial 190	java/util/HashMap:<init>	(Ljava/util/Map;)V
    //   227: areturn
    //   228: ldc 74
    //   230: invokestatic 80	kotlin/jvm/internal/Intrinsics:n	(Ljava/lang/String;)V
    //   233: aconst_null
    //   234: athrow
    //   235: aload_1
    //   236: aload_0
    //   237: invokestatic 83	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   240: aconst_null
    //   241: areturn
    //   242: astore 5
    //   244: goto -205 -> 39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	this	j
    //   0	247	1	paramMap	Map
    //   22	145	2	l	long
    //   37	161	4	localObject1	Object
    //   59	92	5	localObject2	Object
    //   242	1	5	localException	Exception
    //   71	101	6	localObject3	Object
    //   141	33	7	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   9	39	129	finally
    //   39	85	129	finally
    //   85	126	129	finally
    //   133	184	129	finally
    //   187	192	129	finally
    //   197	228	129	finally
    //   228	235	129	finally
    //   85	126	242	java/lang/Exception
    //   133	184	242	java/lang/Exception
  }
  
  public final void b()
  {
    if (a.d(this)) {
      return;
    }
    label85:
    Object localObject3;
    for (;;)
    {
      long l1;
      long l2;
      try
      {
        l1 = System.currentTimeMillis() / 1000L;
        Object localObject1 = b;
        if (localObject1 == null) {
          break label281;
        }
        l2 = ((SharedPreferences)localObject1).getLong("LAST_CLEARED_TIME", 0L);
        if (l2 != 0L) {
          break label85;
        }
        localObject1 = b;
        if (localObject1 != null)
        {
          localObject1 = ((SharedPreferences)localObject1).edit().putLong("LAST_CLEARED_TIME", l1);
          ((SharedPreferences.Editor)localObject1).apply();
        }
      }
      finally
      {
        break label288;
      }
      Intrinsics.n("sharedPreferences");
      throw null;
      if (l1 - l2 <= 604800L) {
        break label280;
      }
      Iterator localIterator = C.m(d).entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject4 = (Map.Entry)localIterator.next();
        localObject3 = (String)((Map.Entry)localObject4).getKey();
        l2 = ((Number)((Map.Entry)localObject4).getValue()).longValue();
        if (l1 - l2 > 86400L)
        {
          localObject4 = c;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append((String)localObject3);
          localStringBuilder.append(';');
          localStringBuilder.append(l2);
          ((Set)localObject4).remove(localStringBuilder.toString());
          d.remove(localObject3);
        }
      }
      localObject3 = b;
      if (localObject3 == null) {
        break;
      }
      localObject3 = ((SharedPreferences)localObject3).edit().putStringSet("PURCHASE_DETAILS_SET", c).putLong("LAST_CLEARED_TIME", l1);
    }
    Intrinsics.n("sharedPreferences");
    throw null;
    label280:
    return;
    label281:
    Intrinsics.n("sharedPreferences");
    throw null;
    label288:
    a.b((Throwable)localObject3, this);
  }
  
  public final Map c(Map paramMap1, Map paramMap2)
  {
    if (a.d(this)) {
      return null;
    }
    for (;;)
    {
      try
      {
        Intrinsics.checkNotNullParameter(paramMap1, "purchaseDetailsMap");
        Intrinsics.checkNotNullParameter(paramMap2, "skuDetailsMap");
        l = System.currentTimeMillis() / 1000L;
        localLinkedHashMap = new java/util/LinkedHashMap;
        localLinkedHashMap.<init>();
        paramMap1 = paramMap1.entrySet().iterator();
        if (paramMap1.hasNext())
        {
          localObject1 = (Map.Entry)paramMap1.next();
          localObject2 = (String)((Map.Entry)localObject1).getKey();
          localObject1 = (JSONObject)((Map.Entry)localObject1).getValue();
          localObject2 = (JSONObject)paramMap2.get(localObject2);
          if (localObject1 == null) {
            continue;
          }
          boolean bool = ((JSONObject)localObject1).has("purchaseTime");
          if (!bool) {
            continue;
          }
        }
      }
      finally
      {
        LinkedHashMap localLinkedHashMap;
        try
        {
          long l;
          if ((l - ((JSONObject)localObject1).getLong("purchaseTime") / 1000L > 86400L) || (localObject2 == null)) {
            continue;
          }
          Object localObject1 = ((JSONObject)localObject1).toString();
          Intrinsics.checkNotNullExpressionValue(localObject1, "purchaseDetail.toString()");
          Object localObject2 = ((JSONObject)localObject2).toString();
          Intrinsics.checkNotNullExpressionValue(localObject2, "skuDetail.toString()");
          localLinkedHashMap.put(localObject1, localObject2);
        }
        catch (Exception localException) {}
        paramMap1 = finally;
        continue;
        return localLinkedHashMap;
        a.b(paramMap1, this);
        return null;
      }
    }
  }
  
  public final void f(Map paramMap)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        paramMap = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        if ((paramMap != null) && (localObject != null)) {
          G1.i.f(paramMap, (String)localObject, false);
        }
      }
      label81:
      return;
    }
    finally
    {
      break label81;
      return;
      a.b(paramMap, this);
    }
  }
  
  public final void g()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      SharedPreferences localSharedPreferences = B.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
      localObject3 = B.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
      if (localSharedPreferences.contains("LAST_CLEARED_TIME"))
      {
        localSharedPreferences.edit().clear().apply();
        ((SharedPreferences)localObject3).edit().clear().apply();
      }
    }
    finally
    {
      break label238;
    }
    Object localObject3 = B.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
    Intrinsics.checkNotNullExpressionValue(localObject3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
    b = (SharedPreferences)localObject3;
    Set localSet = c;
    Object localObject2;
    if (localObject3 != null)
    {
      localObject2 = new java/util/HashSet;
      ((HashSet)localObject2).<init>();
      localObject3 = ((SharedPreferences)localObject3).getStringSet("PURCHASE_DETAILS_SET", (Set)localObject2);
      localObject2 = localObject3;
      if (localObject3 == null)
      {
        localObject2 = new java/util/HashSet;
        ((HashSet)localObject2).<init>();
      }
      localSet.addAll((Collection)localObject2);
      localObject2 = localSet.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = kotlin.text.i.V((String)((Iterator)localObject2).next(), new String[] { ";" }, false, 2, 2, null);
        d.put(((List)localObject3).get(0), Long.valueOf(Long.parseLong((String)((List)localObject3).get(1))));
      }
      b();
      return;
    }
    Intrinsics.n("sharedPreferences");
    throw null;
    label238:
    a.b((Throwable)localObject2, this);
  }
}

/* Location:
 * Qualified Name:     E1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
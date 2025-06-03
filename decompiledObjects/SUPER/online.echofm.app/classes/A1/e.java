package A1;

import O1.C.a;
import O1.P;
import V5.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.N;

public final class e
{
  public static final e a = new e();
  public static final Map b;
  public static final Map c;
  public static final Map d = W5.C.f(new V5.m[] { q.a("fb_mobile_achievement_unlocked", j.p), q.a("fb_mobile_activate_app", j.q), q.a("fb_mobile_add_payment_info", j.r), q.a("fb_mobile_add_to_cart", j.s), q.a("fb_mobile_add_to_wishlist", j.t), q.a("fb_mobile_complete_registration", j.u), q.a("fb_mobile_content_view", j.v), q.a("fb_mobile_initiated_checkout", j.w), q.a("fb_mobile_level_achieved", j.x), q.a("fb_mobile_purchase", j.y), q.a("fb_mobile_rate", j.z), q.a("fb_mobile_search", j.A), q.a("fb_mobile_spent_credits", j.B), q.a("fb_mobile_tutorial_completion", j.C) });
  
  static
  {
    Object localObject1 = b.q;
    Object localObject2 = k.p;
    localObject1 = q.a(localObject1, new c((k)localObject2, l.p));
    Object localObject3 = q.a(b.r, new c((k)localObject2, l.q));
    V5.m localm1 = q.a(b.s, new c((k)localObject2, l.r));
    V5.m localm2 = q.a(b.t, new c((k)localObject2, l.s));
    V5.m localm3 = q.a(b.u, new c((k)localObject2, l.t));
    b localb = b.w;
    k localk = k.q;
    b = W5.C.f(new V5.m[] { localObject1, localObject3, localm1, localm2, localm3, q.a(localb, new c(localk, l.v)), q.a(b.x, new c(localk, l.w)), q.a(b.y, new c(localk, l.x)), q.a(b.z, new c(localk, l.y)), q.a(b.A, new c(localk, l.z)), q.a(b.B, new c(localk, l.A)), q.a(b.C, new c(localk, l.B)), q.a(b.D, new c(localk, l.C)), q.a(b.E, new c(localk, l.D)), q.a(b.F, new c(localk, l.E)), q.a(b.G, new c(localk, l.F)), q.a(b.v, new c((k)localObject2, null)) });
    localm3 = q.a(m.q, new b(null, i.q));
    localObject2 = q.a(m.r, new b(null, i.r));
    localObject1 = m.s;
    localObject3 = k.r;
    c = W5.C.f(new V5.m[] { localm3, localObject2, q.a(localObject1, new b((k)localObject3, i.p)), q.a(m.t, new b((k)localObject3, i.s)), q.a(m.u, new b((k)localObject3, i.t)), q.a(m.v, new b((k)localObject3, i.u)), q.a(m.G, new b((k)localObject3, i.F)), q.a(m.w, new b((k)localObject3, i.v)), q.a(m.x, new b((k)localObject3, i.w)), q.a(m.y, new b((k)localObject3, i.x)), q.a(m.z, new b((k)localObject3, i.y)), q.a(m.A, new b((k)localObject3, i.z)), q.a(m.B, new b((k)localObject3, i.A)), q.a(m.C, new b((k)localObject3, i.B)), q.a(m.D, new b((k)localObject3, i.C)), q.a(m.E, new b((k)localObject3, i.D)), q.a(m.F, new b((k)localObject3, i.E)) });
  }
  
  public static final ArrayList k(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "appEvents");
    Object localObject1 = new ArrayList();
    try
    {
      Object localObject2 = P.a;
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>(paramString);
      localObject2 = ((Iterable)P.m((JSONArray)localObject2)).iterator();
      Object localObject3;
      Object localObject4;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        localObject4 = P.a;
        localObject4 = new org/json/JSONObject;
        ((JSONObject)localObject4).<init>((String)localObject3);
        ((ArrayList)localObject1).add(P.n((JSONObject)localObject4));
      }
      ArrayList localArrayList;
      LinkedHashMap localLinkedHashMap;
      Iterator localIterator;
      Object localObject5;
      b localb;
      Object localObject6;
      label485:
      label552:
      return null;
    }
    catch (JSONException localJSONException)
    {
      break label552;
      if (((ArrayList)localObject1).isEmpty()) {
        return null;
      }
      localArrayList = new ArrayList();
      localObject3 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (Map)((Iterator)localObject3).next();
        localObject1 = new LinkedHashMap();
        localLinkedHashMap = new LinkedHashMap();
        localIterator = ((Map)localObject4).keySet().iterator();
        while (localIterator.hasNext())
        {
          paramString = (String)localIterator.next();
          localObject5 = m.p.a(paramString);
          localb = (b)c.get(localObject5);
          if ((localObject5 != null) && (localb != null))
          {
            localObject6 = localb.b();
            if (localObject6 != null)
            {
              if (localObject6 == k.r)
              {
                localObject6 = localb.a().e();
                localObject5 = ((Map)localObject4).get(paramString);
                if (localObject5 != null)
                {
                  paramString = l(paramString, localObject5);
                  if (paramString != null) {
                    ((Map)localObject1).put(localObject6, paramString);
                  } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                  }
                }
                else
                {
                  throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
              }
            }
            else {
              try
              {
                localObject6 = localb.a().e();
                if ((localObject5 == m.r) && ((String)((Map)localObject4).get(paramString) != null))
                {
                  localObject5 = a;
                  paramString = ((Map)localObject4).get(paramString);
                  if (paramString != null)
                  {
                    paramString = ((e)localObject5).j((String)paramString);
                    localLinkedHashMap.put(localObject6, paramString);
                  }
                }
              }
              catch (ClassCastException paramString)
              {
                for (;;)
                {
                  break label485;
                  paramString = new java/lang/NullPointerException;
                  paramString.<init>("null cannot be cast to non-null type kotlin.String");
                  throw paramString;
                  if ((localObject5 != m.q) || ((Integer)((Map)localObject4).get(paramString) == null)) {
                    break;
                  }
                  localObject5 = ((Map)localObject4).get(paramString);
                  if (localObject5 != null)
                  {
                    paramString = l(paramString, localObject5);
                    if (paramString == null)
                    {
                      paramString = new java/lang/NullPointerException;
                      paramString.<init>("null cannot be cast to non-null type kotlin.Any");
                      throw paramString;
                    }
                  }
                  else
                  {
                    paramString = new java/lang/NullPointerException;
                    paramString.<init>("null cannot be cast to non-null type kotlin.Any");
                    throw paramString;
                  }
                }
                O1.C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", new Object[] { V5.a.b(paramString) });
              }
            }
          }
        }
        if ((((Map)localObject1).isEmpty() ^ true)) {
          localLinkedHashMap.put(k.r.e(), localObject1);
        }
        localArrayList.add(localLinkedHashMap);
      }
      return localArrayList;
      O1.C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", new Object[] { paramString, localArrayList });
    }
  }
  
  /* Error */
  public static final Object l(String paramString, Object paramObject)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: ldc_w 435
    //   6: invokestatic 305	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   9: aload_1
    //   10: ldc_w 437
    //   13: invokestatic 305	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: getstatic 441	A1/e$d:o	LA1/e$d$a;
    //   19: aload_0
    //   20: invokevirtual 444	A1/e$d$a:a	(Ljava/lang/String;)LA1/e$d;
    //   23: astore_3
    //   24: aload_1
    //   25: instanceof 340
    //   28: istore 4
    //   30: aconst_null
    //   31: astore 5
    //   33: iload 4
    //   35: ifeq +11 -> 46
    //   38: aload_1
    //   39: checkcast 340	java/lang/String
    //   42: astore_0
    //   43: goto +5 -> 48
    //   46: aconst_null
    //   47: astore_0
    //   48: aload_3
    //   49: ifnull +247 -> 296
    //   52: aload_0
    //   53: ifnonnull +6 -> 59
    //   56: goto +240 -> 296
    //   59: getstatic 447	A1/e$e:a	[I
    //   62: aload_3
    //   63: invokevirtual 453	java/lang/Enum:ordinal	()I
    //   66: iaload
    //   67: istore 6
    //   69: iload 6
    //   71: iconst_1
    //   72: if_icmpeq +59 -> 131
    //   75: iload 6
    //   77: iconst_2
    //   78: if_icmpeq +25 -> 103
    //   81: iload 6
    //   83: iconst_3
    //   84: if_icmpne +11 -> 95
    //   87: aload_1
    //   88: invokevirtual 456	java/lang/Object:toString	()Ljava/lang/String;
    //   91: invokestatic 461	kotlin/text/i:f	(Ljava/lang/String;)Ljava/lang/Integer;
    //   94: areturn
    //   95: new 463	V5/l
    //   98: dup
    //   99: invokespecial 464	V5/l:<init>	()V
    //   102: athrow
    //   103: aload_0
    //   104: invokestatic 461	kotlin/text/i:f	(Ljava/lang/String;)Ljava/lang/Integer;
    //   107: astore_1
    //   108: aload 5
    //   110: astore_0
    //   111: aload_1
    //   112: ifnull +17 -> 129
    //   115: aload_1
    //   116: invokevirtual 467	java/lang/Integer:intValue	()I
    //   119: ifeq +5 -> 124
    //   122: iconst_1
    //   123: istore_2
    //   124: iload_2
    //   125: invokestatic 473	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   128: astore_0
    //   129: aload_0
    //   130: areturn
    //   131: getstatic 313	O1/P:a	LO1/P;
    //   134: astore 5
    //   136: new 315	org/json/JSONArray
    //   139: astore 5
    //   141: aload 5
    //   143: aload_0
    //   144: invokespecial 318	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   147: aload 5
    //   149: invokestatic 322	O1/P:m	(Lorg/json/JSONArray;)Ljava/util/List;
    //   152: astore_0
    //   153: new 307	java/util/ArrayList
    //   156: astore_3
    //   157: aload_3
    //   158: invokespecial 308	java/util/ArrayList:<init>	()V
    //   161: aload_0
    //   162: checkcast 324	java/lang/Iterable
    //   165: invokeinterface 328 1 0
    //   170: astore 7
    //   172: aload 7
    //   174: invokeinterface 334 1 0
    //   179: ifeq +84 -> 263
    //   182: aload 7
    //   184: invokeinterface 338 1 0
    //   189: checkcast 340	java/lang/String
    //   192: astore_0
    //   193: getstatic 313	O1/P:a	LO1/P;
    //   196: astore 5
    //   198: new 342	org/json/JSONObject
    //   201: astore 5
    //   203: aload 5
    //   205: aload_0
    //   206: invokespecial 343	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   209: aload 5
    //   211: invokestatic 347	O1/P:n	(Lorg/json/JSONObject;)Ljava/util/Map;
    //   214: astore 5
    //   216: aload 5
    //   218: astore_0
    //   219: goto +31 -> 250
    //   222: astore 5
    //   224: getstatic 313	O1/P:a	LO1/P;
    //   227: astore 5
    //   229: new 315	org/json/JSONArray
    //   232: astore 5
    //   234: aload 5
    //   236: aload_0
    //   237: invokespecial 318	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   240: aload 5
    //   242: invokestatic 322	O1/P:m	(Lorg/json/JSONArray;)Ljava/util/List;
    //   245: astore 5
    //   247: aload 5
    //   249: astore_0
    //   250: aload_3
    //   251: aload_0
    //   252: invokevirtual 351	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   255: pop
    //   256: goto -84 -> 172
    //   259: astore_0
    //   260: goto +5 -> 265
    //   263: aload_3
    //   264: areturn
    //   265: getstatic 410	O1/C:e	LO1/C$a;
    //   268: getstatic 415	x1/N:s	Lx1/N;
    //   271: ldc_w 417
    //   274: ldc_w 433
    //   277: iconst_2
    //   278: anewarray 4	java/lang/Object
    //   281: dup
    //   282: iconst_0
    //   283: aload_1
    //   284: aastore
    //   285: dup
    //   286: iconst_1
    //   287: aload_0
    //   288: aastore
    //   289: invokevirtual 429	O1/C$a:c	(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   292: getstatic 478	V5/t:a	LV5/t;
    //   295: areturn
    //   296: aload_1
    //   297: areturn
    //   298: astore 5
    //   300: goto -50 -> 250
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	303	0	paramString	String
    //   0	303	1	paramObject	Object
    //   1	124	2	bool1	boolean
    //   23	241	3	localObject1	Object
    //   28	6	4	bool2	boolean
    //   31	186	5	localObject2	Object
    //   222	1	5	localJSONException1	JSONException
    //   227	21	5	localObject3	Object
    //   298	1	5	localJSONException2	JSONException
    //   67	18	6	i	int
    //   170	13	7	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   193	216	222	org/json/JSONException
    //   131	172	259	org/json/JSONException
    //   172	193	259	org/json/JSONException
    //   250	256	259	org/json/JSONException
    //   224	247	298	org/json/JSONException
  }
  
  public final List a(a parama, Map paramMap1, Map paramMap2, Map paramMap3, List paramList, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(parama, "eventType");
    Intrinsics.checkNotNullParameter(paramMap1, "userData");
    Intrinsics.checkNotNullParameter(paramMap2, "appData");
    Intrinsics.checkNotNullParameter(paramMap3, "restOfData");
    Intrinsics.checkNotNullParameter(paramList, "customEvents");
    paramMap1 = d(paramMap1, paramMap2, paramMap3);
    int i = e.c[parama.ordinal()];
    if (i != 1)
    {
      if (i != 2) {
        parama = null;
      } else {
        parama = b(paramMap1, paramList);
      }
    }
    else {
      parama = c(paramMap1, paramObject);
    }
    return parama;
  }
  
  public final List b(Map paramMap, List paramList)
  {
    if (paramList.isEmpty()) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((Iterable)paramList).iterator();
    while (localIterator.hasNext())
    {
      Map localMap = (Map)localIterator.next();
      paramList = new LinkedHashMap();
      paramList.putAll(paramMap);
      paramList.putAll(localMap);
      localArrayList.add(paramList);
    }
    return localArrayList;
  }
  
  public final List c(Map paramMap, Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.putAll(paramMap);
    localLinkedHashMap.put(i.r.e(), n.s.e());
    localLinkedHashMap.put(i.q.e(), paramObject);
    return W5.m.b(localLinkedHashMap);
  }
  
  public final Map d(Map paramMap1, Map paramMap2, Map paramMap3)
  {
    Intrinsics.checkNotNullParameter(paramMap1, "userData");
    Intrinsics.checkNotNullParameter(paramMap2, "appData");
    Intrinsics.checkNotNullParameter(paramMap3, "restOfData");
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    localLinkedHashMap.put(n.q.e(), n.r.e());
    localLinkedHashMap.put(k.p.e(), paramMap1);
    localLinkedHashMap.put(k.q.e(), paramMap2);
    localLinkedHashMap.putAll(paramMap3);
    return localLinkedHashMap;
  }
  
  public final List e(Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "parameters");
    LinkedHashMap localLinkedHashMap1 = new LinkedHashMap();
    LinkedHashMap localLinkedHashMap2 = new LinkedHashMap();
    ArrayList localArrayList = new ArrayList();
    LinkedHashMap localLinkedHashMap3 = new LinkedHashMap();
    a locala = f(paramMap, localLinkedHashMap1, localLinkedHashMap2, localArrayList, localLinkedHashMap3);
    if (locala == a.r) {
      return null;
    }
    return a(locala, localLinkedHashMap1, localLinkedHashMap2, localLinkedHashMap3, localArrayList, paramMap.get(n.t.e()));
  }
  
  public final a f(Map paramMap1, Map paramMap2, Map paramMap3, ArrayList paramArrayList, Map paramMap4)
  {
    Object localObject1 = paramMap1.get(n.p.e());
    Object localObject2 = a.o;
    if (localObject1 != null)
    {
      localObject2 = ((a.a)localObject2).a((String)localObject1);
      if (localObject2 == a.r) {
        return (a)localObject2;
      }
      paramMap1 = paramMap1.entrySet().iterator();
      while (paramMap1.hasNext())
      {
        Object localObject3 = (Map.Entry)paramMap1.next();
        localObject1 = (String)((Map.Entry)localObject3).getKey();
        localObject3 = ((Map.Entry)localObject3).getValue();
        b localb = b.p.a((String)localObject1);
        if (localb != null)
        {
          a.g(paramMap2, paramMap3, localb, localObject3);
        }
        else
        {
          boolean bool1 = Intrinsics.a(localObject1, k.s.e());
          boolean bool2 = localObject3 instanceof String;
          if ((localObject2 == a.q) && (bool1) && (bool2))
          {
            localObject1 = k((String)localObject3);
            if (localObject1 != null) {
              paramArrayList.addAll((Collection)localObject1);
            }
          }
          else if (a.p.a((String)localObject1) != null)
          {
            paramMap4.put(localObject1, localObject3);
          }
        }
      }
      return (a)localObject2;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
  }
  
  public final void g(Map paramMap1, Map paramMap2, b paramb, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramMap1, "userData");
    Intrinsics.checkNotNullParameter(paramMap2, "appData");
    Intrinsics.checkNotNullParameter(paramb, "field");
    Intrinsics.checkNotNullParameter(paramObject, "value");
    Object localObject = (c)b.get(paramb);
    if (localObject == null) {
      return;
    }
    localObject = ((c)localObject).b();
    int i = e.b[localObject.ordinal()];
    if (i != 1)
    {
      if (i != 2) {
        return;
      }
      i(paramMap1, paramb, paramObject);
    }
    else
    {
      h(paramMap2, paramb, paramObject);
    }
  }
  
  public final void h(Map paramMap, b paramb, Object paramObject)
  {
    paramb = (c)b.get(paramb);
    if (paramb == null) {
      paramb = null;
    } else {
      paramb = paramb.a();
    }
    if (paramb == null) {
      return;
    }
    paramMap.put(paramb.e(), paramObject);
  }
  
  public final void i(Map paramMap, b paramb, Object paramObject)
  {
    if (paramb == b.v)
    {
      try
      {
        paramb = P.a;
        paramb = new org/json/JSONObject;
        paramb.<init>((String)paramObject);
        paramMap.putAll(P.n(paramb));
      }
      catch (JSONException paramMap)
      {
        O1.C.e.c(N.s, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", new Object[] { paramObject, paramMap });
      }
    }
    else
    {
      paramb = (c)b.get(paramb);
      if (paramb == null) {
        paramb = null;
      } else {
        paramb = paramb.a();
      }
      if (paramb == null) {
        return;
      }
      paramMap.put(paramb.e(), paramObject);
    }
  }
  
  public final String j(String paramString)
  {
    Map localMap = d;
    String str = paramString;
    if (localMap.containsKey(paramString))
    {
      paramString = (j)localMap.get(paramString);
      if (paramString == null) {
        str = "";
      } else {
        str = paramString.e();
      }
    }
    return str;
  }
  
  public static enum a
  {
    public static final a p = new a(null);
    public final String o;
    
    public a(String paramString1)
    {
      o = paramString1;
    }
    
    public final String e()
    {
      return o;
    }
    
    public static final class a
    {
      public final e.a a(String paramString)
      {
        Intrinsics.checkNotNullParameter(paramString, "rawValue");
        for (e.a locala : e.a.values()) {
          if (Intrinsics.a(locala.e(), paramString)) {
            return locala;
          }
        }
        paramString = null;
        return paramString;
      }
    }
  }
  
  public static final class b
  {
    public k a;
    public i b;
    
    public b(k paramk, i parami)
    {
      a = paramk;
      b = parami;
    }
    
    public final i a()
    {
      return b;
    }
    
    public final k b()
    {
      return a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof b)) {
        return false;
      }
      paramObject = (b)paramObject;
      if (a != a) {
        return false;
      }
      return b == b;
    }
    
    public int hashCode()
    {
      k localk = a;
      int i;
      if (localk == null) {
        i = 0;
      } else {
        i = localk.hashCode();
      }
      return i * 31 + b.hashCode();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SectionCustomEventFieldMapping(section=");
      localStringBuilder.append(a);
      localStringBuilder.append(", field=");
      localStringBuilder.append(b);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
  
  public static final class c
  {
    public k a;
    public l b;
    
    public c(k paramk, l paraml)
    {
      a = paramk;
      b = paraml;
    }
    
    public final l a()
    {
      return b;
    }
    
    public final k b()
    {
      return a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof c)) {
        return false;
      }
      paramObject = (c)paramObject;
      if (a != a) {
        return false;
      }
      return b == b;
    }
    
    public int hashCode()
    {
      int i = a.hashCode();
      l locall = b;
      int j;
      if (locall == null) {
        j = 0;
      } else {
        j = locall.hashCode();
      }
      return i * 31 + j;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SectionFieldMapping(section=");
      localStringBuilder.append(a);
      localStringBuilder.append(", field=");
      localStringBuilder.append(b);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
  
  public static enum d
  {
    public static final a o = new a(null);
    
    public static final class a
    {
      public final e.d a(String paramString)
      {
        Intrinsics.checkNotNullParameter(paramString, "rawValue");
        if (Intrinsics.a(paramString, b.A.e())) {}
        while ((Intrinsics.a(paramString, b.G.e())) || (Intrinsics.a(paramString, m.t.e())) || (Intrinsics.a(paramString, m.u.e())) || (Intrinsics.a(paramString, e.a.q.e())))
        {
          paramString = e.d.p;
          break;
        }
        if (Intrinsics.a(paramString, b.w.e())) {}
        while (Intrinsics.a(paramString, b.x.e()))
        {
          paramString = e.d.q;
          break;
        }
        if (Intrinsics.a(paramString, m.q.e())) {
          paramString = e.d.r;
        } else {
          paramString = null;
        }
        return paramString;
      }
    }
  }
}

/* Location:
 * Qualified Name:     A1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
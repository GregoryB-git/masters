package D1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import y1.e;

public final class a
{
  public static final a a = new a();
  public static boolean b;
  public static final List c = new ArrayList();
  public static final Set d = new HashSet();
  
  public static final void a()
  {
    if (T1.a.d(a.class)) {
      return;
    }
    try
    {
      b = true;
      a.b();
      return;
    }
    finally
    {
      T1.a.b(localThrowable, a.class);
    }
  }
  
  public static final void c(Map paramMap, String paramString)
  {
    if (T1.a.d(a.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramMap, "parameters");
      Intrinsics.checkNotNullParameter(paramString, "eventName");
      if (!b) {
        return;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramMap.keySet());
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>((Collection)c);
      Iterator localIterator1 = ((List)localObject).iterator();
      while (localIterator1.hasNext())
      {
        a locala = (a)localIterator1.next();
        if (Intrinsics.a(locala.b(), paramString))
        {
          Iterator localIterator2 = localArrayList.iterator();
          while (localIterator2.hasNext())
          {
            localObject = (String)localIterator2.next();
            if (locala.a().contains(localObject)) {
              paramMap.remove(localObject);
            }
          }
        }
      }
      label160:
      return;
    }
    finally
    {
      break label160;
      return;
      T1.a.b(paramMap, a.class);
    }
  }
  
  public static final void d(List paramList)
  {
    if (T1.a.d(a.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramList, "events");
      if (!b) {
        return;
      }
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (e)localIterator.next();
        if (d.contains(paramList.f())) {
          localIterator.remove();
        }
      }
      label77:
      return;
    }
    finally
    {
      break label77;
      return;
      T1.a.b(paramList, a.class);
    }
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokestatic 38	T1/a:d	(Ljava/lang/Object;)Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: getstatic 121	O1/v:a	LO1/v;
    //   17: astore_2
    //   18: invokestatic 126	x1/B:m	()Ljava/lang/String;
    //   21: iconst_0
    //   22: invokestatic 130	O1/v:q	(Ljava/lang/String;Z)LO1/r;
    //   25: astore_2
    //   26: aload_2
    //   27: ifnonnull +6 -> 33
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: aload_2
    //   34: invokevirtual 135	O1/r:i	()Ljava/lang/String;
    //   37: astore_3
    //   38: aload_3
    //   39: ifnull +184 -> 223
    //   42: aload_3
    //   43: invokeinterface 141 1 0
    //   48: ifle +175 -> 223
    //   51: new 143	org/json/JSONObject
    //   54: astore_2
    //   55: aload_2
    //   56: aload_3
    //   57: invokespecial 146	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   60: getstatic 26	D1/a:c	Ljava/util/List;
    //   63: invokeinterface 149 1 0
    //   68: aload_2
    //   69: invokevirtual 152	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   72: astore 4
    //   74: aload 4
    //   76: invokeinterface 79 1 0
    //   81: ifeq +142 -> 223
    //   84: aload 4
    //   86: invokeinterface 83 1 0
    //   91: checkcast 91	java/lang/String
    //   94: astore_3
    //   95: aload_2
    //   96: aload_3
    //   97: invokevirtual 156	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   100: astore 5
    //   102: aload 5
    //   104: ifnull -30 -> 74
    //   107: aload 5
    //   109: ldc -98
    //   111: invokevirtual 162	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   114: ifeq +30 -> 144
    //   117: getstatic 31	D1/a:d	Ljava/util/Set;
    //   120: astore 5
    //   122: aload_3
    //   123: ldc -92
    //   125: invokestatic 167	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   128: aload 5
    //   130: aload_3
    //   131: invokeinterface 170 2 0
    //   136: pop
    //   137: goto -63 -> 74
    //   140: astore_2
    //   141: goto +70 -> 211
    //   144: aload 5
    //   146: ldc -84
    //   148: invokevirtual 176	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   151: astore 6
    //   153: new 6	D1/a$a
    //   156: astore 5
    //   158: aload_3
    //   159: ldc -92
    //   161: invokestatic 167	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   164: new 23	java/util/ArrayList
    //   167: astore 7
    //   169: aload 7
    //   171: invokespecial 24	java/util/ArrayList:<init>	()V
    //   174: aload 5
    //   176: aload_3
    //   177: aload 7
    //   179: invokespecial 179	D1/a$a:<init>	(Ljava/lang/String;Ljava/util/List;)V
    //   182: aload 6
    //   184: ifnull +13 -> 197
    //   187: aload 5
    //   189: aload 6
    //   191: invokestatic 184	O1/P:m	(Lorg/json/JSONArray;)Ljava/util/List;
    //   194: invokevirtual 186	D1/a$a:c	(Ljava/util/List;)V
    //   197: getstatic 26	D1/a:c	Ljava/util/List;
    //   200: aload 5
    //   202: invokeinterface 187 2 0
    //   207: pop
    //   208: goto -134 -> 74
    //   211: aload_2
    //   212: aload_0
    //   213: invokestatic 45	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   216: aload_0
    //   217: monitorexit
    //   218: return
    //   219: astore_2
    //   220: goto +6 -> 226
    //   223: aload_0
    //   224: monitorexit
    //   225: return
    //   226: aload_0
    //   227: monitorexit
    //   228: aload_2
    //   229: athrow
    //   230: astore_2
    //   231: goto -8 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	a
    //   6	2	1	bool	boolean
    //   17	79	2	localObject1	Object
    //   140	72	2	localThrowable	Throwable
    //   219	10	2	localObject2	Object
    //   230	1	2	localException	Exception
    //   37	140	3	str	String
    //   72	13	4	localIterator	Iterator
    //   100	101	5	localObject3	Object
    //   151	39	6	localJSONArray	org.json.JSONArray
    //   167	11	7	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   14	26	140	finally
    //   33	38	140	finally
    //   42	74	140	finally
    //   74	102	140	finally
    //   107	137	140	finally
    //   144	182	140	finally
    //   187	197	140	finally
    //   197	208	140	finally
    //   2	7	219	finally
    //   211	216	219	finally
    //   14	26	230	java/lang/Exception
    //   33	38	230	java/lang/Exception
    //   42	74	230	java/lang/Exception
    //   74	102	230	java/lang/Exception
    //   107	137	230	java/lang/Exception
    //   144	182	230	java/lang/Exception
    //   187	197	230	java/lang/Exception
    //   197	208	230	java/lang/Exception
  }
  
  public static final class a
  {
    public String a;
    public List b;
    
    public a(String paramString, List paramList)
    {
      a = paramString;
      b = paramList;
    }
    
    public final List a()
    {
      return b;
    }
    
    public final String b()
    {
      return a;
    }
    
    public final void c(List paramList)
    {
      Intrinsics.checkNotNullParameter(paramList, "<set-?>");
      b = paramList;
    }
  }
}

/* Location:
 * Qualified Name:     D1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
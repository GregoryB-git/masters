package J1;

import O1.P;
import O1.r;
import O1.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;

public final class a
{
  public static final a a = new a();
  public static boolean b;
  public static final String c = a.class.getCanonicalName();
  public static final List d = new ArrayList();
  public static final Set e = new CopyOnWriteArraySet();
  
  public static final void a()
  {
    if (T1.a.d(a.class)) {
      return;
    }
    try
    {
      b = true;
      a.c();
      return;
    }
    finally
    {
      T1.a.b(localThrowable, a.class);
    }
  }
  
  public static final String e(String paramString)
  {
    if (T1.a.d(a.class)) {
      return null;
    }
    String str;
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "eventName");
      str = paramString;
      if (b)
      {
        str = paramString;
        if (a.d(paramString)) {
          str = "_removed_";
        }
      }
    }
    finally
    {
      break label48;
    }
    return str;
    label48:
    T1.a.b(paramString, a.class);
    return null;
  }
  
  public static final void f(Map paramMap, String paramString)
  {
    if (T1.a.d(a.class)) {
      return;
    }
    Object localObject1;
    Object localObject2;
    try
    {
      Intrinsics.checkNotNullParameter(paramMap, "parameters");
      Intrinsics.checkNotNullParameter(paramString, "eventName");
      if (!b) {
        return;
      }
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(paramMap.keySet());
      Iterator localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localObject2 = a.b(paramString, str);
        if (localObject2 != null)
        {
          ((Map)localObject1).put(str, localObject2);
          paramMap.remove(str);
        }
      }
      bool = ((Map)localObject1).isEmpty();
    }
    finally
    {
      break label214;
    }
    boolean bool;
    if ((bool ^ true)) {}
    try
    {
      paramString = new org/json/JSONObject;
      paramString.<init>();
      localObject2 = ((Map)localObject1).entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)localObject2).next();
        paramString.put((String)((Map.Entry)localObject1).getKey(), (String)((Map.Entry)localObject1).getValue());
      }
      paramMap.put("_restrictedParams", paramString.toString());
      return;
    }
    catch (JSONException paramMap)
    {
      label214:
      for (;;) {}
    }
    T1.a.b(paramMap, a.class);
  }
  
  /* Error */
  public final String b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 48	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 33	java/util/ArrayList
    //   12: astore_3
    //   13: aload_3
    //   14: getstatic 36	J1/a:d	Ljava/util/List;
    //   17: checkcast 148	java/util/Collection
    //   20: invokespecial 87	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   23: aload_3
    //   24: invokeinterface 93 1 0
    //   29: astore_3
    //   30: aload_3
    //   31: invokeinterface 99 1 0
    //   36: ifeq +115 -> 151
    //   39: aload_3
    //   40: invokeinterface 103 1 0
    //   45: checkcast 6	J1/a$a
    //   48: astore 4
    //   50: aload 4
    //   52: ifnonnull +6 -> 58
    //   55: goto -25 -> 30
    //   58: aload_1
    //   59: aload 4
    //   61: invokevirtual 150	J1/a$a:a	()Ljava/lang/String;
    //   64: invokestatic 153	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   67: ifeq -37 -> 30
    //   70: aload 4
    //   72: invokevirtual 156	J1/a$a:b	()Ljava/util/Map;
    //   75: invokeinterface 84 1 0
    //   80: invokeinterface 128 1 0
    //   85: astore 5
    //   87: aload 5
    //   89: invokeinterface 99 1 0
    //   94: ifeq -64 -> 30
    //   97: aload 5
    //   99: invokeinterface 103 1 0
    //   104: checkcast 105	java/lang/String
    //   107: astore 6
    //   109: aload_2
    //   110: aload 6
    //   112: invokestatic 153	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   115: ifeq -28 -> 87
    //   118: aload 4
    //   120: invokevirtual 156	J1/a$a:b	()Ljava/util/Map;
    //   123: aload 6
    //   125: invokeinterface 159 2 0
    //   130: checkcast 105	java/lang/String
    //   133: astore_1
    //   134: aload_1
    //   135: areturn
    //   136: astore_1
    //   137: goto +16 -> 153
    //   140: astore_1
    //   141: getstatic 31	J1/a:c	Ljava/lang/String;
    //   144: ldc -95
    //   146: aload_1
    //   147: invokestatic 167	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   150: pop
    //   151: aconst_null
    //   152: areturn
    //   153: aload_1
    //   154: aload_0
    //   155: invokestatic 55	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   158: aconst_null
    //   159: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	a
    //   0	160	1	paramString1	String
    //   0	160	2	paramString2	String
    //   12	28	3	localObject	Object
    //   48	71	4	locala	a
    //   85	13	5	localIterator	Iterator
    //   107	17	6	str	String
    // Exception table:
    //   from	to	target	type
    //   9	30	136	finally
    //   30	50	136	finally
    //   58	87	136	finally
    //   87	134	136	finally
    //   141	151	136	finally
    //   9	30	140	java/lang/Exception
    //   30	50	140	java/lang/Exception
    //   58	87	140	java/lang/Exception
    //   87	134	140	java/lang/Exception
  }
  
  public final void c()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      for (;;)
      {
        JSONObject localJSONObject1;
        a locala;
        try
        {
          Object localObject = v.a;
          localObject = v.q(B.m(), false);
          if (localObject == null) {
            return;
          }
          String str = ((r)localObject).i();
          if ((str == null) || (str.length() == 0)) {
            break;
          }
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(str);
          d.clear();
          e.clear();
          Iterator localIterator = ((JSONObject)localObject).keys();
          if (!localIterator.hasNext()) {
            break label211;
          }
          str = (String)localIterator.next();
          localJSONObject1 = ((JSONObject)localObject).getJSONObject(str);
          if (localJSONObject1 == null) {
            continue;
          }
          JSONObject localJSONObject2 = localJSONObject1.optJSONObject("restrictive_param");
          locala = new J1/a$a;
          Intrinsics.checkNotNullExpressionValue(str, "key");
          HashMap localHashMap = new java/util/HashMap;
          localHashMap.<init>();
          locala.<init>(str, localHashMap);
          if (localJSONObject2 != null)
          {
            locala.c(P.o(localJSONObject2));
            d.add(locala);
          }
        }
        finally
        {
          break label206;
        }
        if (localJSONObject1.has("process_event_name")) {
          e.add(locala.a());
        }
      }
      return;
    }
    catch (Exception localException)
    {
      label206:
      label211:
      for (;;) {}
    }
    T1.a.b(localThrowable, this);
  }
  
  public final boolean d(String paramString)
  {
    if (T1.a.d(this)) {
      return false;
    }
    try
    {
      boolean bool = e.contains(paramString);
      return bool;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
    return false;
  }
  
  public static final class a
  {
    public String a;
    public Map b;
    
    public a(String paramString, Map paramMap)
    {
      a = paramString;
      b = paramMap;
    }
    
    public final String a()
    {
      return a;
    }
    
    public final Map b()
    {
      return b;
    }
    
    public final void c(Map paramMap)
    {
      Intrinsics.checkNotNullParameter(paramMap, "<set-?>");
      b = paramMap;
    }
  }
}

/* Location:
 * Qualified Name:     J1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
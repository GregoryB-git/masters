package x1;

import O1.C;
import O1.C.a;
import O1.P;
import W5.m;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class K
{
  public static final a i = new a(null);
  public static final String j = K.class.getCanonicalName();
  public final F a;
  public final HttpURLConnection b;
  public final String c;
  public final JSONObject d;
  public final JSONArray e;
  public final r f;
  public final JSONObject g;
  public final JSONArray h;
  
  public K(F paramF, HttpURLConnection paramHttpURLConnection, String paramString, JSONArray paramJSONArray)
  {
    this(paramF, paramHttpURLConnection, paramString, null, paramJSONArray, null);
  }
  
  public K(F paramF, HttpURLConnection paramHttpURLConnection, String paramString, JSONObject paramJSONObject)
  {
    this(paramF, paramHttpURLConnection, paramString, paramJSONObject, null, null);
  }
  
  public K(F paramF, HttpURLConnection paramHttpURLConnection, String paramString, JSONObject paramJSONObject, JSONArray paramJSONArray, r paramr)
  {
    a = paramF;
    b = paramHttpURLConnection;
    c = paramString;
    d = paramJSONObject;
    e = paramJSONArray;
    f = paramr;
    g = paramJSONObject;
    h = paramJSONArray;
  }
  
  public K(F paramF, HttpURLConnection paramHttpURLConnection, r paramr)
  {
    this(paramF, paramHttpURLConnection, null, null, null, paramr);
  }
  
  public final r b()
  {
    return f;
  }
  
  public final JSONObject c()
  {
    return d;
  }
  
  public final JSONObject d()
  {
    return g;
  }
  
  public String toString()
  {
    try
    {
      Object localObject1 = x.a;
      localObject2 = Locale.US;
      localObject1 = b;
      int k;
      if (localObject1 == null) {
        k = 200;
      } else {
        k = ((HttpURLConnection)localObject1).getResponseCode();
      }
      localObject1 = String.format((Locale)localObject2, "%d", Arrays.copyOf(new Object[] { Integer.valueOf(k) }, 1));
      Intrinsics.checkNotNullExpressionValue(localObject1, "java.lang.String.format(locale, format, *args)");
    }
    catch (IOException localIOException)
    {
      str = "unknown";
    }
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("{Response: ");
    ((StringBuilder)localObject2).append(" responseCode: ");
    ((StringBuilder)localObject2).append(str);
    ((StringBuilder)localObject2).append(", graphObject: ");
    ((StringBuilder)localObject2).append(d);
    ((StringBuilder)localObject2).append(", error: ");
    ((StringBuilder)localObject2).append(f);
    ((StringBuilder)localObject2).append("}");
    String str = ((StringBuilder)localObject2).toString();
    Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
    return str;
  }
  
  public static final class a
  {
    public final List a(List paramList, HttpURLConnection paramHttpURLConnection, o paramo)
    {
      Intrinsics.checkNotNullParameter(paramList, "requests");
      Object localObject = (Iterable)paramList;
      paramList = new ArrayList(m.l((Iterable)localObject, 10));
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramList.add(new K((F)((Iterator)localObject).next(), paramHttpURLConnection, new r(paramHttpURLConnection, paramo)));
      }
      return paramList;
    }
    
    public final K b(F paramF, HttpURLConnection paramHttpURLConnection, Object paramObject1, Object paramObject2)
    {
      boolean bool = paramObject1 instanceof JSONObject;
      Object localObject1 = null;
      Object localObject2 = paramObject1;
      if (bool)
      {
        localObject2 = r.C;
        paramObject1 = (JSONObject)paramObject1;
        paramObject2 = ((r.c)localObject2).a((JSONObject)paramObject1, paramObject2, paramHttpURLConnection);
        if (paramObject2 != null)
        {
          Log.e(K.a(), ((r)paramObject2).toString());
          if (((r)paramObject2).b() == 190)
          {
            paramObject1 = P.a;
            if (P.Y(paramF.m())) {
              if (((r)paramObject2).g() != 493)
              {
                a.z.h(null);
              }
              else
              {
                localObject2 = a.z;
                paramObject1 = ((a.c)localObject2).e();
                if (paramObject1 == null) {
                  paramObject1 = localObject1;
                } else {
                  paramObject1 = Boolean.valueOf(((a)paramObject1).n());
                }
                if (Intrinsics.a(paramObject1, Boolean.FALSE)) {
                  ((a.c)localObject2).d();
                }
              }
            }
          }
          return new K(paramF, paramHttpURLConnection, (r)paramObject2);
        }
        paramObject1 = P.O((JSONObject)paramObject1, "body", "FACEBOOK_NON_JSON_RESULT");
        if ((paramObject1 instanceof JSONObject))
        {
          paramObject1 = (JSONObject)paramObject1;
          return new K(paramF, paramHttpURLConnection, ((JSONObject)paramObject1).toString(), (JSONObject)paramObject1);
        }
        if ((paramObject1 instanceof JSONArray))
        {
          paramObject1 = (JSONArray)paramObject1;
          return new K(paramF, paramHttpURLConnection, ((JSONArray)paramObject1).toString(), (JSONArray)paramObject1);
        }
        localObject2 = JSONObject.NULL;
        Intrinsics.checkNotNullExpressionValue(localObject2, "NULL");
      }
      if (localObject2 == JSONObject.NULL) {
        return new K(paramF, paramHttpURLConnection, localObject2.toString(), null);
      }
      throw new o(Intrinsics.i("Got unexpected object type in response, class: ", localObject2.getClass().getSimpleName()));
    }
    
    public final List c(HttpURLConnection paramHttpURLConnection, List paramList, Object paramObject)
    {
      int i = paramList.size();
      ArrayList localArrayList = new ArrayList(i);
      int j = 0;
      Object localObject1;
      Object localObject2;
      int k;
      if (i == 1)
      {
        localObject1 = (F)paramList.get(0);
        try
        {
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>();
          ((JSONObject)localObject2).put("body", paramObject);
          if (paramHttpURLConnection == null) {
            k = 200;
          } else {
            k = paramHttpURLConnection.getResponseCode();
          }
          ((JSONObject)localObject2).put("code", k);
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>();
          localJSONArray.put(localObject2);
        }
        catch (IOException localIOException) {}catch (JSONException localJSONException2) {}
        for (localObject3 = new K((F)localObject1, paramHttpURLConnection, new r(paramHttpURLConnection, localJSONException2));; localObject3 = new K((F)localObject1, paramHttpURLConnection, new r(paramHttpURLConnection, (Exception)localObject3)))
        {
          localArrayList.add(localObject3);
          break;
        }
      }
      Object localObject3 = paramObject;
      if ((localObject3 instanceof JSONArray))
      {
        localObject1 = (JSONArray)localObject3;
        if (((JSONArray)localObject1).length() == i)
        {
          i = ((JSONArray)localObject1).length();
          if (i > 0) {
            for (k = j;; k = j)
            {
              j = k + 1;
              localObject1 = (F)paramList.get(k);
              try
              {
                localObject2 = ((JSONArray)localObject3).get(k);
                Intrinsics.checkNotNullExpressionValue(localObject2, "obj");
                localArrayList.add(b((F)localObject1, paramHttpURLConnection, localObject2, paramObject));
              }
              catch (o localo) {}catch (JSONException localJSONException1) {}
              for (localObject1 = new K((F)localObject1, paramHttpURLConnection, new r(paramHttpURLConnection, localJSONException1));; localObject1 = new K((F)localObject1, paramHttpURLConnection, new r(paramHttpURLConnection, localJSONException1)))
              {
                localArrayList.add(localObject1);
                break;
              }
              if (j >= i) {
                break;
              }
            }
          }
          return localArrayList;
        }
      }
      throw new o("Unexpected number of results");
    }
    
    public final List d(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection, J paramJ)
    {
      Intrinsics.checkNotNullParameter(paramJ, "requests");
      paramInputStream = P.s0(paramInputStream);
      C.e.c(N.q, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", new Object[] { Integer.valueOf(paramInputStream.length()), paramInputStream });
      return e(paramInputStream, paramHttpURLConnection, paramJ);
    }
    
    public final List e(String paramString, HttpURLConnection paramHttpURLConnection, J paramJ)
    {
      Intrinsics.checkNotNullParameter(paramString, "responseString");
      Intrinsics.checkNotNullParameter(paramJ, "requests");
      Object localObject = new JSONTokener(paramString).nextValue();
      Intrinsics.checkNotNullExpressionValue(localObject, "resultObject");
      paramHttpURLConnection = c(paramHttpURLConnection, paramJ, localObject);
      C.e.c(N.o, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[] { paramJ.U(), Integer.valueOf(paramString.length()), paramHttpURLConnection });
      return paramHttpURLConnection;
    }
    
    /* Error */
    public final List f(HttpURLConnection paramHttpURLConnection, J paramJ)
    {
      // Byte code:
      //   0: aload_1
      //   1: ldc_w 299
      //   4: invokestatic 23	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
      //   7: aload_2
      //   8: ldc 17
      //   10: invokestatic 23	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
      //   13: aconst_null
      //   14: astore_3
      //   15: aconst_null
      //   16: astore 4
      //   18: aconst_null
      //   19: astore 5
      //   21: aload 5
      //   23: astore 6
      //   25: aload_3
      //   26: astore 7
      //   28: aload 4
      //   30: astore 8
      //   32: invokestatic 304	x1/B:E	()Z
      //   35: ifeq +106 -> 141
      //   38: aload 5
      //   40: astore 6
      //   42: aload_3
      //   43: astore 7
      //   45: aload 4
      //   47: astore 8
      //   49: aload_1
      //   50: invokevirtual 215	java/net/HttpURLConnection:getResponseCode	()I
      //   53: sipush 400
      //   56: if_icmplt +37 -> 93
      //   59: aload 5
      //   61: astore 6
      //   63: aload_3
      //   64: astore 7
      //   66: aload 4
      //   68: astore 8
      //   70: aload_1
      //   71: invokevirtual 308	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
      //   74: astore 5
      //   76: goto +34 -> 110
      //   79: astore_1
      //   80: goto +247 -> 327
      //   83: astore 8
      //   85: goto +126 -> 211
      //   88: astore 5
      //   90: goto +188 -> 278
      //   93: aload 5
      //   95: astore 6
      //   97: aload_3
      //   98: astore 7
      //   100: aload 4
      //   102: astore 8
      //   104: aload_1
      //   105: invokevirtual 313	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
      //   108: astore 5
      //   110: aload 5
      //   112: astore 6
      //   114: aload 5
      //   116: astore 7
      //   118: aload 5
      //   120: astore 8
      //   122: aload_0
      //   123: aload 5
      //   125: aload_1
      //   126: aload_2
      //   127: invokevirtual 315	x1/K$a:d	(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lx1/J;)Ljava/util/List;
      //   130: astore_3
      //   131: aload_3
      //   132: astore_1
      //   133: aload 5
      //   135: invokestatic 319	O1/P:j	(Ljava/io/Closeable;)V
      //   138: goto +187 -> 325
      //   141: aload 5
      //   143: astore 6
      //   145: aload_3
      //   146: astore 7
      //   148: aload 4
      //   150: astore 8
      //   152: invokestatic 82	x1/K:a	()Ljava/lang/String;
      //   155: ldc_w 321
      //   158: invokestatic 91	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
      //   161: pop
      //   162: aload 5
      //   164: astore 6
      //   166: aload_3
      //   167: astore 7
      //   169: aload 4
      //   171: astore 8
      //   173: new 172	x1/o
      //   176: astore 9
      //   178: aload 5
      //   180: astore 6
      //   182: aload_3
      //   183: astore 7
      //   185: aload 4
      //   187: astore 8
      //   189: aload 9
      //   191: ldc_w 321
      //   194: invokespecial 190	x1/o:<init>	(Ljava/lang/String;)V
      //   197: aload 5
      //   199: astore 6
      //   201: aload_3
      //   202: astore 7
      //   204: aload 4
      //   206: astore 8
      //   208: aload 9
      //   210: athrow
      //   211: aload 7
      //   213: astore 6
      //   215: getstatic 245	O1/C:e	LO1/C$a;
      //   218: getstatic 286	x1/N:o	Lx1/N;
      //   221: ldc -3
      //   223: ldc_w 323
      //   226: iconst_1
      //   227: anewarray 4	java/lang/Object
      //   230: dup
      //   231: iconst_0
      //   232: aload 8
      //   234: aastore
      //   235: invokevirtual 268	O1/C$a:c	(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   238: aload 7
      //   240: astore 6
      //   242: new 172	x1/o
      //   245: astore 5
      //   247: aload 7
      //   249: astore 6
      //   251: aload 5
      //   253: aload 8
      //   255: invokespecial 326	x1/o:<init>	(Ljava/lang/Throwable;)V
      //   258: aload 7
      //   260: astore 6
      //   262: aload_0
      //   263: aload_2
      //   264: aload_1
      //   265: aload 5
      //   267: invokevirtual 328	x1/K$a:a	(Ljava/util/List;Ljava/net/HttpURLConnection;Lx1/o;)Ljava/util/List;
      //   270: astore_1
      //   271: aload 7
      //   273: astore 5
      //   275: goto -142 -> 133
      //   278: aload 8
      //   280: astore 6
      //   282: getstatic 245	O1/C:e	LO1/C$a;
      //   285: getstatic 286	x1/N:o	Lx1/N;
      //   288: ldc -3
      //   290: ldc_w 323
      //   293: iconst_1
      //   294: anewarray 4	java/lang/Object
      //   297: dup
      //   298: iconst_0
      //   299: aload 5
      //   301: aastore
      //   302: invokevirtual 268	O1/C$a:c	(Lx1/N;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   305: aload 8
      //   307: astore 6
      //   309: aload_0
      //   310: aload_2
      //   311: aload_1
      //   312: aload 5
      //   314: invokevirtual 328	x1/K$a:a	(Ljava/util/List;Ljava/net/HttpURLConnection;Lx1/o;)Ljava/util/List;
      //   317: astore_1
      //   318: aload 8
      //   320: astore 5
      //   322: goto -189 -> 133
      //   325: aload_1
      //   326: areturn
      //   327: aload 6
      //   329: invokestatic 319	O1/P:j	(Ljava/io/Closeable;)V
      //   332: aload_1
      //   333: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	334	0	this	a
      //   0	334	1	paramHttpURLConnection	HttpURLConnection
      //   0	334	2	paramJ	J
      //   14	188	3	localList	List
      //   16	189	4	localObject1	Object
      //   19	56	5	localInputStream	InputStream
      //   88	6	5	localo1	o
      //   108	213	5	localObject2	Object
      //   23	305	6	localObject3	Object
      //   26	246	7	localObject4	Object
      //   30	39	8	localObject5	Object
      //   83	1	8	localException	Exception
      //   102	217	8	localObject6	Object
      //   176	33	9	localo2	o
      // Exception table:
      //   from	to	target	type
      //   32	38	79	finally
      //   49	59	79	finally
      //   70	76	79	finally
      //   104	110	79	finally
      //   122	131	79	finally
      //   152	162	79	finally
      //   173	178	79	finally
      //   189	197	79	finally
      //   208	211	79	finally
      //   215	238	79	finally
      //   242	247	79	finally
      //   251	258	79	finally
      //   262	271	79	finally
      //   282	305	79	finally
      //   309	318	79	finally
      //   32	38	83	java/lang/Exception
      //   49	59	83	java/lang/Exception
      //   70	76	83	java/lang/Exception
      //   104	110	83	java/lang/Exception
      //   122	131	83	java/lang/Exception
      //   152	162	83	java/lang/Exception
      //   173	178	83	java/lang/Exception
      //   189	197	83	java/lang/Exception
      //   208	211	83	java/lang/Exception
      //   32	38	88	x1/o
      //   49	59	88	x1/o
      //   70	76	88	x1/o
      //   104	110	88	x1/o
      //   122	131	88	x1/o
      //   152	162	88	x1/o
      //   173	178	88	x1/o
      //   189	197	88	x1/o
      //   208	211	88	x1/o
    }
  }
}

/* Location:
 * Qualified Name:     x1.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
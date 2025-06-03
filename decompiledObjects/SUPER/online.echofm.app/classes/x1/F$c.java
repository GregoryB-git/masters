package x1;

import O1.C;
import O1.C.a;
import O1.P;
import O1.Q;
import O1.z;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class F$c
{
  public static final void H(ArrayList paramArrayList, J paramJ)
  {
    Intrinsics.checkNotNullParameter(paramArrayList, "$callbacks");
    Intrinsics.checkNotNullParameter(paramJ, "$requests");
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Pair)localIterator.next();
      paramArrayList = (F.b)first;
      localObject = second;
      Intrinsics.checkNotNullExpressionValue(localObject, "pair.second");
      paramArrayList.a((K)localObject);
    }
    paramArrayList = paramJ.T().iterator();
    while (paramArrayList.hasNext()) {
      ((J.a)paramArrayList.next()).a(paramJ);
    }
  }
  
  public static final void z(F.d paramd, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramK, "response");
    if (paramd != null) {
      paramd.a(paramK.c(), paramK);
    }
  }
  
  public final F A(a parama, String paramString, JSONObject paramJSONObject, F.b paramb)
  {
    parama = new F(parama, paramString, null, L.p, paramb, null, 32, null);
    parama.E(paramJSONObject);
    return parama;
  }
  
  public final F B(a parama, String paramString, Bundle paramBundle, F.b paramb)
  {
    return new F(parama, paramString, paramBundle, L.p, paramb, null, 32, null);
  }
  
  public final String C(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((!(paramObject instanceof Boolean)) && (!(paramObject instanceof Number)))
    {
      if ((paramObject instanceof Date))
      {
        paramObject = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)paramObject);
        Intrinsics.checkNotNullExpressionValue(paramObject, "iso8601DateFormat.format(value)");
        return (String)paramObject;
      }
      throw new IllegalArgumentException("Unsupported parameter type.");
    }
    return paramObject.toString();
  }
  
  public final void D(JSONObject paramJSONObject, String paramString, F.e parame)
  {
    if (u(paramString))
    {
      i = i.D(paramString, ":", 0, false, 6, null);
      int j = i.D(paramString, "?", 0, false, 6, null);
      if ((i > 3) && ((j == -1) || (i < j)))
      {
        i = 1;
        break label62;
      }
    }
    int i = 0;
    label62:
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramString = paramJSONObject.opt(str);
      boolean bool;
      if ((i != 0) && (i.l(str, "image", true))) {
        bool = true;
      } else {
        bool = false;
      }
      Intrinsics.checkNotNullExpressionValue(str, "key");
      Intrinsics.checkNotNullExpressionValue(paramString, "value");
      E(str, paramString, parame, bool);
    }
  }
  
  public final void E(String paramString, Object paramObject, F.e parame, boolean paramBoolean)
  {
    Object localObject1 = paramObject.getClass();
    Object localObject3;
    if (JSONObject.class.isAssignableFrom((Class)localObject1))
    {
      localObject1 = (JSONObject)paramObject;
      if (paramBoolean)
      {
        paramObject = ((JSONObject)localObject1).keys();
        while (((Iterator)paramObject).hasNext())
        {
          Object localObject2 = (String)((Iterator)paramObject).next();
          localObject3 = x.a;
          localObject3 = String.format("%s[%s]", Arrays.copyOf(new Object[] { paramString, localObject2 }, 2));
          Intrinsics.checkNotNullExpressionValue(localObject3, "java.lang.String.format(format, *args)");
          localObject2 = ((JSONObject)localObject1).opt((String)localObject2);
          Intrinsics.checkNotNullExpressionValue(localObject2, "jsonObject.opt(propertyName)");
          E((String)localObject3, localObject2, parame, paramBoolean);
        }
      }
      if (((JSONObject)localObject1).has("id"))
      {
        localObject1 = ((JSONObject)localObject1).optString("id");
        paramObject = "jsonObject.optString(\"id\")";
      }
      for (;;)
      {
        Intrinsics.checkNotNullExpressionValue(localObject1, (String)paramObject);
        E(paramString, localObject1, parame, paramBoolean);
        break;
        if (((JSONObject)localObject1).has("url"))
        {
          localObject1 = ((JSONObject)localObject1).optString("url");
          paramObject = "jsonObject.optString(\"url\")";
        }
        else
        {
          if (!((JSONObject)localObject1).has("fbsdk:create_object")) {
            break;
          }
          localObject1 = ((JSONObject)localObject1).toString();
          paramObject = "jsonObject.toString()";
        }
      }
    }
    if (JSONArray.class.isAssignableFrom((Class)localObject1))
    {
      paramObject = (JSONArray)paramObject;
      int i = ((JSONArray)paramObject).length();
      if (i > 0)
      {
        int j = 0;
        for (;;)
        {
          int k = j + 1;
          localObject1 = x.a;
          localObject1 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[] { paramString, Integer.valueOf(j) }, 2));
          Intrinsics.checkNotNullExpressionValue(localObject1, "java.lang.String.format(locale, format, *args)");
          localObject3 = ((JSONArray)paramObject).opt(j);
          Intrinsics.checkNotNullExpressionValue(localObject3, "jsonArray.opt(i)");
          try
          {
            E((String)localObject1, localObject3, parame, paramBoolean);
            if (k >= i) {
              return;
            }
            j = k;
          }
          finally {}
        }
      }
    }
    else
    {
      if ((!String.class.isAssignableFrom((Class)localObject1)) && (!Number.class.isAssignableFrom((Class)localObject1)) && (!Boolean.class.isAssignableFrom((Class)localObject1))) {
        if (Date.class.isAssignableFrom((Class)localObject1))
        {
          paramObject = (Date)paramObject;
          paramObject = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)paramObject);
          Intrinsics.checkNotNullExpressionValue(paramObject, "iso8601DateFormat.format(date)");
        }
      }
      for (;;)
      {
        parame.a(paramString, (String)paramObject);
        break;
        paramObject = P.a;
        parame = F.o;
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("The type of property ");
        ((StringBuilder)paramObject).append(paramString);
        ((StringBuilder)paramObject).append(" in the graph object is unknown. It won't be sent in the request.");
        P.j0(parame, ((StringBuilder)paramObject).toString());
        break;
        paramObject = paramObject.toString();
      }
    }
  }
  
  public final void F(J paramJ, C paramC, int paramInt, URL paramURL, OutputStream paramOutputStream, boolean paramBoolean)
  {
    paramOutputStream = new F.g(paramOutputStream, paramC, paramBoolean);
    if (paramInt == 1)
    {
      F localF = paramJ.D(0);
      HashMap localHashMap = new HashMap();
      paramJ = localF.u().keySet().iterator();
      while (paramJ.hasNext())
      {
        String str = (String)paramJ.next();
        Object localObject = localF.u().get(str);
        if (v(localObject))
        {
          Intrinsics.checkNotNullExpressionValue(str, "key");
          localHashMap.put(str, new F.a(localF, localObject));
        }
      }
      if (paramC != null) {
        paramC.b("  Parameters:\n");
      }
      J(localF.u(), paramOutputStream, localF);
      if (paramC != null) {
        paramC.b("  Attachments:\n");
      }
      I(localHashMap, paramOutputStream);
      paramJ = localF.q();
      if (paramJ != null)
      {
        paramC = paramURL.getPath();
        Intrinsics.checkNotNullExpressionValue(paramC, "url.path");
        D(paramJ, paramC, paramOutputStream);
      }
    }
    else
    {
      paramURL = p(paramJ);
      if (paramURL.length() == 0) {
        break label272;
      }
      paramOutputStream.a("batch_app_id", paramURL);
      paramURL = new HashMap();
      K(paramOutputStream, paramJ, paramURL);
      if (paramC != null) {
        paramC.b("  Attachments:\n");
      }
      I(paramURL, paramOutputStream);
    }
    return;
    label272:
    throw new o("App ID was not specified at the request or Settings.");
  }
  
  public final void G(J paramJ, List paramList)
  {
    Intrinsics.checkNotNullParameter(paramJ, "requests");
    Intrinsics.checkNotNullParameter(paramList, "responses");
    int i = paramJ.size();
    ArrayList localArrayList = new ArrayList();
    if (i > 0)
    {
      int k;
      for (int j = 0;; j = k)
      {
        k = j + 1;
        F localF = paramJ.D(j);
        if (localF.o() != null) {
          localArrayList.add(new Pair(localF.o(), paramList.get(j)));
        }
        if (k >= i) {
          break;
        }
      }
    }
    if (localArrayList.size() > 0)
    {
      paramList = new H(localArrayList, paramJ);
      paramJ = paramJ.S();
      if (paramJ == null) {
        paramJ = null;
      } else {
        paramJ = Boolean.valueOf(paramJ.post(paramList));
      }
      if (paramJ == null) {
        paramList.run();
      }
    }
  }
  
  public final void I(Map paramMap, F.g paramg)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      if (F.n.v(((F.a)paramMap.getValue()).b())) {
        paramg.j((String)paramMap.getKey(), ((F.a)paramMap.getValue()).b(), ((F.a)paramMap.getValue()).a());
      }
    }
  }
  
  public final void J(Bundle paramBundle, F.g paramg, F paramF)
  {
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramBundle.get(str);
      if (w(localObject))
      {
        Intrinsics.checkNotNullExpressionValue(str, "key");
        paramg.j(str, localObject, paramF);
      }
    }
  }
  
  public final void K(F.g paramg, Collection paramCollection, Map paramMap)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      F.g((F)localIterator.next(), localJSONArray, paramMap);
    }
    paramg.l("batch", localJSONArray, paramCollection);
  }
  
  /* Error */
  public final void L(J paramJ, HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 403
    //   4: invokestatic 24	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload_2
    //   8: ldc_w 484
    //   11: invokestatic 24	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   14: new 359	O1/C
    //   17: dup
    //   18: getstatic 489	x1/N:o	Lx1/N;
    //   21: ldc_w 491
    //   24: invokespecial 494	O1/C:<init>	(Lx1/N;Ljava/lang/String;)V
    //   27: astore_3
    //   28: aload_1
    //   29: invokevirtual 408	x1/J:size	()I
    //   32: istore 4
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual 498	x1/F$c:t	(Lx1/J;)Z
    //   39: istore 5
    //   41: aconst_null
    //   42: astore 6
    //   44: iload 4
    //   46: iconst_1
    //   47: if_icmpne +16 -> 63
    //   50: aload_1
    //   51: iconst_0
    //   52: invokevirtual 326	x1/J:D	(I)Lx1/F;
    //   55: invokevirtual 501	x1/F:t	()Lx1/L;
    //   58: astore 7
    //   60: goto +6 -> 66
    //   63: aconst_null
    //   64: astore 7
    //   66: aload 7
    //   68: astore 8
    //   70: aload 7
    //   72: ifnonnull +8 -> 80
    //   75: getstatic 124	x1/L:p	Lx1/L;
    //   78: astore 8
    //   80: aload_2
    //   81: aload 8
    //   83: invokevirtual 506	java/lang/Enum:name	()Ljava/lang/String;
    //   86: invokevirtual 511	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   89: aload_0
    //   90: aload_2
    //   91: iload 5
    //   93: invokevirtual 515	x1/F$c:M	(Ljava/net/HttpURLConnection;Z)V
    //   96: aload_2
    //   97: invokevirtual 521	java/net/URLConnection:getURL	()Ljava/net/URL;
    //   100: astore 9
    //   102: aload_3
    //   103: ldc_w 523
    //   106: invokevirtual 361	O1/C:b	(Ljava/lang/String;)V
    //   109: aload_3
    //   110: ldc_w 525
    //   113: aload_1
    //   114: invokevirtual 528	x1/J:U	()Ljava/lang/String;
    //   117: invokevirtual 531	O1/C:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   120: aload 9
    //   122: ldc -5
    //   124: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   127: aload_3
    //   128: ldc_w 533
    //   131: aload 9
    //   133: invokevirtual 531	O1/C:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   136: aload_2
    //   137: invokevirtual 536	java/net/HttpURLConnection:getRequestMethod	()Ljava/lang/String;
    //   140: astore 7
    //   142: aload 7
    //   144: ldc_w 538
    //   147: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   150: aload_3
    //   151: ldc_w 540
    //   154: aload 7
    //   156: invokevirtual 531	O1/C:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   159: aload_2
    //   160: ldc_w 542
    //   163: invokevirtual 545	java/net/URLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   166: astore 7
    //   168: aload 7
    //   170: ldc_w 547
    //   173: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   176: aload_3
    //   177: ldc_w 542
    //   180: aload 7
    //   182: invokevirtual 531	O1/C:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   185: aload_2
    //   186: ldc_w 549
    //   189: invokevirtual 545	java/net/URLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   192: astore 7
    //   194: aload 7
    //   196: ldc_w 551
    //   199: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   202: aload_3
    //   203: ldc_w 549
    //   206: aload 7
    //   208: invokevirtual 531	O1/C:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   211: aload_2
    //   212: aload_1
    //   213: invokevirtual 554	x1/J:X	()I
    //   216: invokevirtual 558	java/net/URLConnection:setConnectTimeout	(I)V
    //   219: aload_2
    //   220: aload_1
    //   221: invokevirtual 554	x1/J:X	()I
    //   224: invokevirtual 561	java/net/URLConnection:setReadTimeout	(I)V
    //   227: aload 8
    //   229: getstatic 124	x1/L:p	Lx1/L;
    //   232: if_acmpne +201 -> 433
    //   235: aload_2
    //   236: iconst_1
    //   237: invokevirtual 565	java/net/URLConnection:setDoOutput	(Z)V
    //   240: aload 6
    //   242: astore 7
    //   244: new 567	java/io/BufferedOutputStream
    //   247: astore 8
    //   249: aload 6
    //   251: astore 7
    //   253: aload 8
    //   255: aload_2
    //   256: invokevirtual 571	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   259: invokespecial 574	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   262: iload 5
    //   264: ifeq +24 -> 288
    //   267: new 576	java/util/zip/GZIPOutputStream
    //   270: astore_2
    //   271: aload_2
    //   272: aload 8
    //   274: invokespecial 577	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   277: goto +14 -> 291
    //   280: astore_1
    //   281: aload 8
    //   283: astore 7
    //   285: goto +133 -> 418
    //   288: aload 8
    //   290: astore_2
    //   291: aload_2
    //   292: astore 7
    //   294: aload_0
    //   295: aload_1
    //   296: invokevirtual 580	x1/F$c:s	(Lx1/J;)Z
    //   299: ifeq +93 -> 392
    //   302: aload_2
    //   303: astore 7
    //   305: new 582	x1/S
    //   308: astore 8
    //   310: aload_2
    //   311: astore 7
    //   313: aload 8
    //   315: aload_1
    //   316: invokevirtual 429	x1/J:S	()Landroid/os/Handler;
    //   319: invokespecial 585	x1/S:<init>	(Landroid/os/Handler;)V
    //   322: aload_2
    //   323: astore 7
    //   325: aload_0
    //   326: aload_1
    //   327: aconst_null
    //   328: iload 4
    //   330: aload 9
    //   332: aload 8
    //   334: iload 5
    //   336: invokevirtual 587	x1/F$c:F	(Lx1/J;LO1/C;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   339: aload_2
    //   340: astore 7
    //   342: aload 8
    //   344: invokevirtual 589	x1/S:c	()I
    //   347: istore 10
    //   349: aload_2
    //   350: astore 7
    //   352: aload 8
    //   354: invokevirtual 592	x1/S:e	()Ljava/util/Map;
    //   357: astore 6
    //   359: aload_2
    //   360: astore 7
    //   362: new 594	x1/T
    //   365: astore 8
    //   367: aload_2
    //   368: astore 7
    //   370: aload 8
    //   372: aload_2
    //   373: aload_1
    //   374: aload 6
    //   376: iload 10
    //   378: i2l
    //   379: invokespecial 597	x1/T:<init>	(Ljava/io/OutputStream;Lx1/J;Ljava/util/Map;J)V
    //   382: aload 8
    //   384: astore_2
    //   385: goto +7 -> 392
    //   388: astore_1
    //   389: goto +29 -> 418
    //   392: aload_0
    //   393: aload_1
    //   394: aload_3
    //   395: iload 4
    //   397: aload 9
    //   399: aload_2
    //   400: iload 5
    //   402: invokevirtual 587	x1/F$c:F	(Lx1/J;LO1/C;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    //   405: aload_2
    //   406: invokevirtual 602	java/io/OutputStream:close	()V
    //   409: aload_3
    //   410: invokevirtual 604	O1/C:e	()V
    //   413: return
    //   414: astore_1
    //   415: aload_2
    //   416: astore 7
    //   418: aload 7
    //   420: ifnonnull +6 -> 426
    //   423: goto +8 -> 431
    //   426: aload 7
    //   428: invokevirtual 602	java/io/OutputStream:close	()V
    //   431: aload_1
    //   432: athrow
    //   433: aload_3
    //   434: invokevirtual 604	O1/C:e	()V
    //   437: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	438	0	this	c
    //   0	438	1	paramJ	J
    //   0	438	2	paramHttpURLConnection	HttpURLConnection
    //   27	407	3	localC	C
    //   32	364	4	i	int
    //   39	362	5	bool	boolean
    //   42	333	6	localMap	Map
    //   58	369	7	localObject1	Object
    //   68	315	8	localObject2	Object
    //   100	298	9	localURL	URL
    //   347	30	10	j	int
    // Exception table:
    //   from	to	target	type
    //   267	277	280	finally
    //   244	249	388	finally
    //   253	262	388	finally
    //   294	302	388	finally
    //   305	310	388	finally
    //   313	322	388	finally
    //   325	339	388	finally
    //   342	349	388	finally
    //   352	359	388	finally
    //   362	367	388	finally
    //   370	382	388	finally
    //   392	405	414	finally
  }
  
  public final void M(HttpURLConnection paramHttpURLConnection, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      paramHttpURLConnection.setRequestProperty("Content-Encoding", "gzip");
    }
    else
    {
      paramHttpURLConnection.setRequestProperty("Content-Type", q());
    }
  }
  
  public final HttpURLConnection N(J paramJ)
  {
    Intrinsics.checkNotNullParameter(paramJ, "requests");
    O(paramJ);
    try
    {
      if (paramJ.size() == 1) {
        localObject1 = new URL(paramJ.D(0).x());
      }
    }
    catch (MalformedURLException paramJ)
    {
      break label119;
    }
    Object localObject1 = new URL(O1.H.h());
    Object localObject2 = null;
    Object localObject3 = null;
    try
    {
      localObject1 = g((URL)localObject1);
      localObject3 = localObject1;
      localObject2 = localObject1;
      L(paramJ, (HttpURLConnection)localObject1);
      return (HttpURLConnection)localObject1;
    }
    catch (JSONException paramJ) {}catch (IOException paramJ) {}
    P.q((URLConnection)localObject3);
    throw new o("could not construct request body", paramJ);
    P.q((URLConnection)localObject2);
    throw new o("could not construct request body", paramJ);
    label119:
    throw new o("could not construct URL for request", paramJ);
  }
  
  public final void O(J paramJ)
  {
    Intrinsics.checkNotNullParameter(paramJ, "requests");
    Iterator localIterator = paramJ.iterator();
    while (localIterator.hasNext())
    {
      paramJ = (F)localIterator.next();
      if (L.o == paramJ.t())
      {
        Object localObject = P.a;
        if (P.c0(paramJ.u().getString("fields")))
        {
          C.a locala = C.e;
          N localN = N.t;
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("GET requests for /");
          localObject = paramJ.r();
          paramJ = (J)localObject;
          if (localObject == null) {
            paramJ = "";
          }
          localStringBuilder.append(paramJ);
          localStringBuilder.append(" should contain an explicit \"fields\" parameter.");
          locala.a(localN, 5, "Request", localStringBuilder.toString());
        }
      }
    }
  }
  
  public final HttpURLConnection g(URL paramURL)
  {
    paramURL = (URLConnection)FirebasePerfUrlConnection.instrument(paramURL.openConnection());
    if (paramURL != null)
    {
      paramURL = (HttpURLConnection)paramURL;
      paramURL.setRequestProperty("User-Agent", r());
      paramURL.setRequestProperty("Accept-Language", Locale.getDefault().toString());
      paramURL.setChunkedStreamingMode(0);
      return paramURL;
    }
    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
  }
  
  public final K h(F paramF)
  {
    Intrinsics.checkNotNullParameter(paramF, "request");
    paramF = k(new F[] { paramF });
    if (paramF.size() == 1) {
      return (K)paramF.get(0);
    }
    throw new o("invalid state: expected a single response");
  }
  
  public final List i(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "requests");
    return j(new J(paramCollection));
  }
  
  /* Error */
  public final List j(J paramJ)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 403
    //   4: invokestatic 24	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload_1
    //   8: ldc_w 403
    //   11: invokestatic 733	O1/Q:i	(Ljava/util/Collection;Ljava/lang/String;)V
    //   14: aconst_null
    //   15: astore_2
    //   16: aload_0
    //   17: aload_1
    //   18: invokevirtual 735	x1/F$c:N	(Lx1/J;)Ljava/net/HttpURLConnection;
    //   21: astore_3
    //   22: aconst_null
    //   23: astore_2
    //   24: goto +12 -> 36
    //   27: astore_3
    //   28: aload_2
    //   29: astore_1
    //   30: goto +75 -> 105
    //   33: astore_2
    //   34: aconst_null
    //   35: astore_3
    //   36: aload_3
    //   37: ifnull +21 -> 58
    //   40: aload_0
    //   41: aload_3
    //   42: aload_1
    //   43: invokevirtual 738	x1/F$c:o	(Ljava/net/HttpURLConnection;Lx1/J;)Ljava/util/List;
    //   46: astore_1
    //   47: goto +52 -> 99
    //   50: astore_2
    //   51: aload_3
    //   52: astore_1
    //   53: aload_2
    //   54: astore_3
    //   55: goto +50 -> 105
    //   58: getstatic 741	x1/K:i	Lx1/K$a;
    //   61: astore 4
    //   63: aload_1
    //   64: invokevirtual 744	x1/J:V	()Ljava/util/List;
    //   67: astore 5
    //   69: new 396	x1/o
    //   72: astore 6
    //   74: aload 6
    //   76: aload_2
    //   77: invokespecial 747	x1/o:<init>	(Ljava/lang/Throwable;)V
    //   80: aload 4
    //   82: aload 5
    //   84: aconst_null
    //   85: aload 6
    //   87: invokevirtual 752	x1/K$a:a	(Ljava/util/List;Ljava/net/HttpURLConnection;Lx1/o;)Ljava/util/List;
    //   90: astore_2
    //   91: aload_0
    //   92: aload_1
    //   93: aload_2
    //   94: invokevirtual 754	x1/F$c:G	(Lx1/J;Ljava/util/List;)V
    //   97: aload_2
    //   98: astore_1
    //   99: aload_3
    //   100: invokestatic 643	O1/P:q	(Ljava/net/URLConnection;)V
    //   103: aload_1
    //   104: areturn
    //   105: aload_1
    //   106: invokestatic 643	O1/P:q	(Ljava/net/URLConnection;)V
    //   109: aload_3
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	c
    //   0	111	1	paramJ	J
    //   15	14	2	localObject1	Object
    //   33	1	2	localException	Exception
    //   50	27	2	localThrowable	Throwable
    //   90	8	2	localList1	List
    //   21	1	3	localHttpURLConnection	HttpURLConnection
    //   27	1	3	localObject2	Object
    //   35	75	3	localObject3	Object
    //   61	20	4	locala	K.a
    //   67	16	5	localList2	List
    //   72	14	6	localo	o
    // Exception table:
    //   from	to	target	type
    //   16	22	27	finally
    //   16	22	33	java/lang/Exception
    //   40	47	50	finally
    //   58	97	50	finally
  }
  
  public final List k(F... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "requests");
    return i((Collection)W5.g.u(paramVarArgs));
  }
  
  public final I l(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "requests");
    return m(new J(paramCollection));
  }
  
  public final I m(J paramJ)
  {
    Intrinsics.checkNotNullParameter(paramJ, "requests");
    Q.i(paramJ, "requests");
    paramJ = new I(paramJ);
    paramJ.executeOnExecutor(B.t(), new Void[0]);
    return paramJ;
  }
  
  public final I n(F... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "requests");
    return l((Collection)W5.g.u(paramVarArgs));
  }
  
  public final List o(HttpURLConnection paramHttpURLConnection, J paramJ)
  {
    Intrinsics.checkNotNullParameter(paramHttpURLConnection, "connection");
    Intrinsics.checkNotNullParameter(paramJ, "requests");
    List localList = K.i.f(paramHttpURLConnection, paramJ);
    P.q(paramHttpURLConnection);
    int i = paramJ.size();
    if (i == localList.size())
    {
      G(paramJ, localList);
      g.f.e().h();
      return localList;
    }
    paramHttpURLConnection = x.a;
    paramHttpURLConnection = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[] { Integer.valueOf(localList.size()), Integer.valueOf(i) }, 2));
    Intrinsics.checkNotNullExpressionValue(paramHttpURLConnection, "java.lang.String.format(locale, format, *args)");
    throw new o(paramHttpURLConnection);
  }
  
  public final String p(J paramJ)
  {
    Object localObject = paramJ.M();
    if ((localObject != null) && ((paramJ.isEmpty() ^ true))) {
      return (String)localObject;
    }
    localObject = paramJ.iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramJ = ((F)((Iterator)localObject).next()).m();
      if (paramJ != null) {
        return paramJ.c();
      }
    }
    paramJ = F.c();
    if ((paramJ == null) || (paramJ.length() <= 0)) {
      paramJ = B.m();
    }
    return paramJ;
  }
  
  public final String q()
  {
    Object localObject = x.a;
    localObject = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[] { F.d() }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
    return (String)localObject;
  }
  
  public final String r()
  {
    if (F.e() == null)
    {
      Object localObject = x.a;
      localObject = String.format("%s.%s", Arrays.copyOf(new Object[] { "FBAndroidSDK", "16.3.0" }, 2));
      Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
      F.h((String)localObject);
      localObject = z.a();
      if (!P.c0((String)localObject))
      {
        localObject = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[] { F.e(), localObject }, 2));
        Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(locale, format, *args)");
        F.h((String)localObject);
      }
    }
    return F.e();
  }
  
  public final boolean s(J paramJ)
  {
    Iterator localIterator = paramJ.T().iterator();
    while (localIterator.hasNext()) {
      J.a locala = (J.a)localIterator.next();
    }
    paramJ = paramJ.iterator();
    while (paramJ.hasNext()) {
      ((F)paramJ.next()).o();
    }
    return false;
  }
  
  public final boolean t(J paramJ)
  {
    String str;
    do
    {
      Iterator localIterator1 = paramJ.iterator();
      Iterator localIterator2;
      while (!localIterator2.hasNext())
      {
        if (!localIterator1.hasNext()) {
          break;
        }
        paramJ = (F)localIterator1.next();
        localIterator2 = paramJ.u().keySet().iterator();
      }
      str = (String)localIterator2.next();
    } while (!v(paramJ.u().get(str)));
    return false;
    return true;
  }
  
  public final boolean u(String paramString)
  {
    Matcher localMatcher = F.f().matcher(paramString);
    boolean bool1 = localMatcher.matches();
    boolean bool2 = true;
    if (bool1)
    {
      paramString = localMatcher.group(1);
      Intrinsics.checkNotNullExpressionValue(paramString, "matcher.group(1)");
    }
    bool1 = bool2;
    if (!i.s(paramString, "me/", false, 2, null)) {
      if (i.s(paramString, "/me/", false, 2, null)) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    return bool1;
  }
  
  public final boolean v(Object paramObject)
  {
    boolean bool;
    if ((!(paramObject instanceof Bitmap)) && (!(paramObject instanceof byte[])) && (!(paramObject instanceof Uri)) && (!(paramObject instanceof ParcelFileDescriptor)) && (!(paramObject instanceof F.f))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean w(Object paramObject)
  {
    boolean bool;
    if ((!(paramObject instanceof String)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Number)) && (!(paramObject instanceof Date))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final F x(a parama, String paramString, F.b paramb)
  {
    return new F(parama, paramString, null, null, paramb, null, 32, null);
  }
  
  public final F y(a parama, F.d paramd)
  {
    return new F(parama, "me", null, null, new G(paramd), null, 32, null);
  }
}

/* Location:
 * Qualified Name:     x1.F.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
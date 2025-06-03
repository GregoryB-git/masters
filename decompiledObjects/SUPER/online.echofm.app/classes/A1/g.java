package A1;

import O1.C.a;
import O1.P;
import V5.q;
import V5.s;
import V5.t;
import W5.I;
import W5.m;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import e6.b;
import g6.p;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.text.i;
import l6.c;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.F;
import x1.N;

public final class g
{
  public static final g a = new g();
  public static final HashSet b = I.c(new Integer[] { Integer.valueOf(200), Integer.valueOf(202) });
  public static final HashSet c = I.c(new Integer[] { Integer.valueOf(503), Integer.valueOf(504), Integer.valueOf(429) });
  public static a d;
  public static List e;
  public static int f;
  
  public static final void d(String paramString1, String paramString2, String paramString3)
  {
    Intrinsics.checkNotNullParameter(paramString1, "datasetID");
    Intrinsics.checkNotNullParameter(paramString2, "url");
    Intrinsics.checkNotNullParameter(paramString3, "accessKey");
    O1.C.e.c(N.s, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", new Object[] { paramString1, paramString2, paramString3 });
    g localg = a;
    localg.i(new a(paramString1, paramString2, paramString3));
    localg.j(new ArrayList());
  }
  
  public static final void l(F paramF)
  {
    Intrinsics.checkNotNullParameter(paramF, "request");
    P localP = P.a;
    P.B0(new f(paramF));
  }
  
  public static final void m(F paramF)
  {
    Intrinsics.checkNotNullParameter(paramF, "$request");
    Object localObject1 = paramF.r();
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = i.V((CharSequence)localObject1, new String[] { "/" }, false, 0, 6, null);
    }
    if ((localObject1 != null) && (((List)localObject1).size() == 2)) {
      try
      {
        localObject1 = a;
        String str1 = ((g)localObject1).e().b();
        Object localObject2 = ((g)localObject1).e().c();
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append(str1);
        ((StringBuilder)localObject3).append("/capi/");
        ((StringBuilder)localObject3).append((String)localObject2);
        ((StringBuilder)localObject3).append("/events");
        str1 = ((StringBuilder)localObject3).toString();
        localObject3 = ((g)localObject1).k(paramF);
        if (localObject3 == null) {
          return;
        }
        ((g)localObject1).c((List)localObject3);
        int i = Math.min(((Collection)((g)localObject1).f()).size(), 10);
        localObject3 = m.D(((g)localObject1).f(), new c(0, i - 1));
        ((g)localObject1).f().subList(0, i).clear();
        localObject2 = new JSONArray((Collection)localObject3);
        Object localObject4 = new LinkedHashMap();
        ((Map)localObject4).put("data", localObject2);
        ((Map)localObject4).put("accessKey", ((g)localObject1).e().a());
        localObject2 = new JSONObject((Map)localObject4);
        localObject4 = O1.C.e;
        N localN = N.s;
        String str2 = ((JSONObject)localObject2).toString(2);
        Intrinsics.checkNotNullExpressionValue(str2, "jsonBodyStr.toString(2)");
        ((C.a)localObject4).c(localN, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", new Object[] { str1, paramF, str2 });
        ((g)localObject1).h(str1, "POST", ((JSONObject)localObject2).toString(), W5.C.b(q.a("Content-Type", "application/json")), 60000, new b((List)localObject3));
        return;
      }
      catch (s paramF)
      {
        O1.C.e.c(N.t, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", new Object[] { paramF });
        return;
      }
    }
    O1.C.e.c(N.t, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", new Object[] { paramF });
  }
  
  public final void c(List paramList)
  {
    if (paramList != null) {
      f().addAll((Collection)paramList);
    }
    int i = Math.max(0, ((Collection)f()).size() - 1000);
    if (i > 0) {
      j(y.a(m.p((Iterable)f(), i)));
    }
  }
  
  public final a e()
  {
    a locala = d;
    if (locala != null) {
      return locala;
    }
    Intrinsics.n("credentials");
    throw null;
  }
  
  public final List f()
  {
    List localList = e;
    if (localList != null) {
      return localList;
    }
    Intrinsics.n("transformedEvents");
    throw null;
  }
  
  public final void g(Integer paramInteger, List paramList, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramList, "processedEvents");
    if (m.o(c, paramInteger)) {
      if (f >= paramInt)
      {
        f().clear();
        f = 0;
      }
      else
      {
        f().addAll(0, (Collection)paramList);
        f += 1;
      }
    }
  }
  
  public final void h(String paramString1, String paramString2, String paramString3, Map paramMap, int paramInt, p paramp)
  {
    Intrinsics.checkNotNullParameter(paramString1, "urlStr");
    Intrinsics.checkNotNullParameter(paramString2, "requestMethod");
    try
    {
      localObject = new java/net/URL;
      ((URL)localObject).<init>(paramString1);
      paramString1 = (URLConnection)FirebasePerfUrlConnection.instrument(((URL)localObject).openConnection());
      if (paramString1 == null) {
        break label405;
      }
      paramString1 = (HttpURLConnection)paramString1;
      paramString1.setRequestMethod(paramString2);
      if (paramMap != null)
      {
        paramString2 = paramMap.keySet();
        if (paramString2 != null)
        {
          localObject = paramString2.iterator();
          while (((Iterator)localObject).hasNext())
          {
            paramString2 = (String)((Iterator)localObject).next();
            paramString1.setRequestProperty(paramString2, (String)paramMap.get(paramString2));
          }
        }
      }
      if (paramString1.getRequestMethod().equals("POST")) {
        break label164;
      }
    }
    catch (IOException paramString1)
    {
      break label418;
    }
    catch (UnknownHostException paramString1) {}
    boolean bool;
    if (!paramString1.getRequestMethod().equals("PUT")) {
      bool = false;
    } else {
      label164:
      bool = true;
    }
    paramString1.setDoOutput(bool);
    paramString1.setConnectTimeout(paramInt);
    Object localObject = new java/io/BufferedOutputStream;
    ((BufferedOutputStream)localObject).<init>(paramString1.getOutputStream());
    paramMap = new java/io/BufferedWriter;
    paramString2 = new java/io/OutputStreamWriter;
    paramString2.<init>((OutputStream)localObject, "UTF-8");
    paramMap.<init>(paramString2);
    paramMap.write(paramString3);
    paramMap.flush();
    paramMap.close();
    ((OutputStream)localObject).close();
    paramString3 = new java/lang/StringBuilder;
    paramString3.<init>();
    if (b.contains(Integer.valueOf(paramString1.getResponseCode())))
    {
      paramString2 = new java/io/BufferedReader;
      paramMap = new java/io/InputStreamReader;
      paramMap.<init>(paramString1.getInputStream(), "UTF-8");
      paramString2.<init>(paramMap);
      try
      {
        for (;;)
        {
          paramMap = paramString2.readLine();
          if (paramMap == null) {
            break;
          }
          paramString3.append(paramMap);
        }
        label327:
        paramString2 = paramString3.toString();
      }
      finally
      {
        break label327;
        paramMap = t.a;
        b.a(paramString2, null);
        break label337;
        try
        {
          throw paramString3;
        }
        finally
        {
          b.a(paramString2, paramString3);
        }
      }
    }
    label337:
    Intrinsics.checkNotNullExpressionValue(paramString2, "connResponseSB.toString()");
    O1.C.e.c(N.s, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", new Object[] { paramString2, Integer.valueOf(paramString1.getResponseCode()) });
    if (paramp != null)
    {
      paramp.invoke(paramString2, Integer.valueOf(paramString1.getResponseCode()));
      return;
      label405:
      paramString1 = new java/lang/NullPointerException;
      paramString1.<init>("null cannot be cast to non-null type java.net.HttpURLConnection");
      throw paramString1;
      label418:
      O1.C.e.c(N.t, "CAPITransformerWebRequests", "Send to server failed: \n%s", new Object[] { paramString1.toString() });
      return;
      O1.C.e.c(N.s, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", new Object[] { paramString1.toString() });
      if (paramp != null) {
        paramp.invoke(null, Integer.valueOf(503));
      }
    }
  }
  
  public final void i(a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "<set-?>");
    d = parama;
  }
  
  public final void j(List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "<set-?>");
    e = paramList;
  }
  
  public final List k(F paramF)
  {
    Object localObject = paramF.q();
    if (localObject != null)
    {
      localObject = W5.C.o(P.n((JSONObject)localObject));
      paramF = paramF.w();
      if (paramF != null)
      {
        ((Map)localObject).put("custom_events", paramF);
        paramF = new StringBuilder();
        Iterator localIterator = ((Map)localObject).keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          paramF.append(str);
          paramF.append(" : ");
          paramF.append(((Map)localObject).get(str));
          paramF.append(System.getProperty("line.separator"));
        }
        O1.C.e.c(N.s, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", new Object[] { paramF });
        return e.a.e((Map)localObject);
      }
      throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }
    return null;
  }
  
  public static final class a
  {
    public final String a;
    public final String b;
    public final String c;
    
    public a(String paramString1, String paramString2, String paramString3)
    {
      a = paramString1;
      b = paramString2;
      c = paramString3;
    }
    
    public final String a()
    {
      return c;
    }
    
    public final String b()
    {
      return b;
    }
    
    public final String c()
    {
      return a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      if (!Intrinsics.a(a, a)) {
        return false;
      }
      if (!Intrinsics.a(b, b)) {
        return false;
      }
      return Intrinsics.a(c, c);
    }
    
    public int hashCode()
    {
      return (a.hashCode() * 31 + b.hashCode()) * 31 + c.hashCode();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("CloudBridgeCredentials(datasetID=");
      localStringBuilder.append(a);
      localStringBuilder.append(", cloudBridgeURL=");
      localStringBuilder.append(b);
      localStringBuilder.append(", accessKey=");
      localStringBuilder.append(c);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends l
    implements p
  {
    public b(List paramList)
    {
      super();
    }
    
    public static final void d(Integer paramInteger, List paramList)
    {
      Intrinsics.checkNotNullParameter(paramList, "$processedEvents");
      if (!m.o(g.b(), paramInteger)) {
        g.a.g(paramInteger, paramList, 5);
      }
    }
    
    public final void b(String paramString, Integer paramInteger)
    {
      paramString = P.a;
      P.B0(new h(paramInteger, o));
    }
  }
}

/* Location:
 * Qualified Name:     A1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
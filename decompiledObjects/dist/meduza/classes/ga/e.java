package ga;

import dc.p;
import ec.s;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import nc.d0;
import org.json.JSONObject;
import rb.h;
import vb.a;

@wb.e(c="com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f="RemoteSettingsFetcher.kt", l={68, 70, 73}, m="invokeSuspend")
public final class e
  extends wb.i
  implements p<d0, ub.e<? super h>, Object>
{
  public int a;
  
  public e(f paramf, Map<String, String> paramMap, p<? super JSONObject, ? super ub.e<? super h>, ? extends Object> paramp, p<? super String, ? super ub.e<? super h>, ? extends Object> paramp1, ub.e<? super e> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new e(b, c, d, e, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((e)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = a;
    String str;
    if (i != 0)
    {
      if ((i != 1) && (i != 2))
      {
        if (i == 3)
        {
          rb.f.b(paramObject);
          break label408;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      try
      {
        rb.f.b(paramObject);
      }
      catch (Exception localException)
      {
        break label361;
      }
    }
    else
    {
      rb.f.b(paramObject);
      paramObject = f.b(b).openConnection();
      ec.i.c(paramObject, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
      localObject1 = (HttpsURLConnection)paramObject;
      ((HttpURLConnection)localObject1).setRequestMethod("GET");
      ((URLConnection)localObject1).setRequestProperty("Accept", "application/json");
      localObject2 = c.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramObject = (Map.Entry)((Iterator)localObject2).next();
        ((URLConnection)localObject1).setRequestProperty((String)((Map.Entry)paramObject).getKey(), (String)((Map.Entry)paramObject).getValue());
      }
      i = ((HttpURLConnection)localObject1).getResponseCode();
      if (i == 200)
      {
        localObject1 = ((URLConnection)localObject1).getInputStream();
        paramObject = new java/io/BufferedReader;
        localObject2 = new java/io/InputStreamReader;
        ((InputStreamReader)localObject2).<init>((InputStream)localObject1);
        ((BufferedReader)paramObject).<init>((Reader)localObject2);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        s locals = new ec/s;
        locals.<init>();
        for (;;)
        {
          str = ((BufferedReader)paramObject).readLine();
          a = str;
          if (str == null) {
            break;
          }
          ((StringBuilder)localObject2).append(str);
        }
        ((BufferedReader)paramObject).close();
        ((InputStream)localObject1).close();
        paramObject = new org/json/JSONObject;
        ((JSONObject)paramObject).<init>(((StringBuilder)localObject2).toString());
        localObject2 = d;
        a = 1;
        if (((p)localObject2).invoke(paramObject, this) != locala) {
          break label408;
        }
        return locala;
      }
      paramObject = e;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Bad response code: ");
      ((StringBuilder)localObject2).append(i);
      localObject2 = ((StringBuilder)localObject2).toString();
      a = 2;
      paramObject = ((p)paramObject).invoke(localObject2, this);
      if (paramObject != locala) {
        break label408;
      }
      return locala;
    }
    label361:
    Object localObject1 = e;
    Object localObject2 = str.getMessage();
    paramObject = localObject2;
    if (localObject2 == null) {
      paramObject = str.toString();
    }
    a = 3;
    if (((p)localObject1).invoke(paramObject, this) == locala) {
      return locala;
    }
    label408:
    return h.a;
  }
}

/* Location:
 * Qualified Name:     ga.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
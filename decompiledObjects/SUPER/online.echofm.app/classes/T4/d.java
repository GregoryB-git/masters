package T4;

import V5.o;
import V5.t;
import Z5.k;
import android.net.Uri;
import android.net.Uri.Builder;
import g6.p;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import p6.I;

public final class d
  implements a
{
  public static final a d = new a(null);
  public final R4.b a;
  public final X5.g b;
  public final String c;
  
  public d(R4.b paramb, X5.g paramg, String paramString)
  {
    a = paramb;
    b = paramg;
    c = paramString;
  }
  
  public Object a(final Map paramMap, final p paramp1, final p paramp2, X5.d paramd)
  {
    paramMap = p6.g.g(b, new b(this, paramMap, paramp1, paramp2, null), paramd);
    if (paramMap == Y5.b.c()) {
      return paramMap;
    }
    return t.a;
  }
  
  public final URL c()
  {
    return new URL(new Uri.Builder().scheme("https").authority(c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(a.b()).appendPath("settings").appendQueryParameter("build_version", a.a().a()).appendQueryParameter("display_version", a.a().d()).build().toString());
  }
  
  public static final class a {}
  
  public static final class b
    extends k
    implements p
  {
    public int o;
    
    public b(d paramd, Map paramMap, p paramp1, p paramp2, X5.d paramd1)
    {
      super(paramd1);
    }
    
    public final X5.d create(Object paramObject, X5.d paramd)
    {
      return new b(p, paramMap, paramp1, paramp2, paramd);
    }
    
    public final Object invoke(I paramI, X5.d paramd)
    {
      return ((b)create(paramI, paramd)).invokeSuspend(t.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject1 = Y5.b.c();
      int i = o;
      u localu;
      if (i != 0)
      {
        if ((i != 1) && (i != 2))
        {
          if (i == 3)
          {
            o.b(paramObject);
            break label409;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try
        {
          o.b(paramObject);
        }
        catch (Exception localException)
        {
          break label362;
        }
      }
      else
      {
        o.b(paramObject);
        paramObject = d.b(p).openConnection();
        Intrinsics.c(paramObject, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        localObject2 = (HttpsURLConnection)paramObject;
        ((HttpURLConnection)localObject2).setRequestMethod("GET");
        ((URLConnection)localObject2).setRequestProperty("Accept", "application/json");
        paramObject = paramMap.entrySet().iterator();
        while (((Iterator)paramObject).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)paramObject).next();
          ((URLConnection)localObject2).setRequestProperty((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
        }
        i = ((HttpURLConnection)localObject2).getResponseCode();
        if (i == 200)
        {
          paramObject = ((URLConnection)localObject2).getInputStream();
          localObject2 = new java/io/BufferedReader;
          localObject3 = new java/io/InputStreamReader;
          ((InputStreamReader)localObject3).<init>((InputStream)paramObject);
          ((BufferedReader)localObject2).<init>((Reader)localObject3);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localu = new kotlin/jvm/internal/u;
          localu.<init>();
          for (;;)
          {
            String str = ((BufferedReader)localObject2).readLine();
            o = str;
            if (str == null) {
              break;
            }
            ((StringBuilder)localObject3).append(str);
          }
          ((BufferedReader)localObject2).close();
          ((InputStream)paramObject).close();
          paramObject = new org/json/JSONObject;
          ((JSONObject)paramObject).<init>(((StringBuilder)localObject3).toString());
          localObject2 = paramp1;
          o = 1;
          if (((p)localObject2).invoke(paramObject, this) != localObject1) {
            break label409;
          }
          return localObject1;
        }
        paramObject = paramp2;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Bad response code: ");
        ((StringBuilder)localObject2).append(i);
        localObject2 = ((StringBuilder)localObject2).toString();
        o = 2;
        paramObject = ((p)paramObject).invoke(localObject2, this);
        if (paramObject != localObject1) {
          break label409;
        }
        return localObject1;
      }
      label362:
      Object localObject3 = paramp2;
      Object localObject2 = localu.getMessage();
      paramObject = localObject2;
      if (localObject2 == null) {
        paramObject = localu.toString();
      }
      o = 3;
      if (((p)localObject3).invoke(paramObject, this) == localObject1) {
        return localObject1;
      }
      label409:
      return t.a;
    }
  }
}

/* Location:
 * Qualified Name:     T4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
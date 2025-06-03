package o8;

import android.util.Log;
import g;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import k8.e;
import k8.f;
import k8.i;
import k8.i.a;

public final class a
{
  public final String a;
  public final Map<String, String> b;
  public final HashMap c;
  
  public a(String paramString, HashMap paramHashMap)
  {
    a = paramString;
    b = paramHashMap;
    c = new HashMap();
  }
  
  public static String a(String paramString, Map paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.entrySet().iterator();
    Object localObject1 = (Map.Entry)localIterator.next();
    localStringBuilder.append((String)((Map.Entry)localObject1).getKey());
    localStringBuilder.append("=");
    Object localObject2 = ((Map.Entry)localObject1).getValue();
    Object localObject3 = "";
    paramMap = (Map)localObject3;
    if (localObject2 != null) {
      paramMap = (Map)localObject3;
    }
    for (;;)
    {
      localObject1 = paramMap;
      localObject3 = paramMap;
      paramMap = (Map)localObject1;
      for (;;)
      {
        localStringBuilder.append((String)localObject3);
        if (!localIterator.hasNext()) {
          break label178;
        }
        localObject1 = (Map.Entry)localIterator.next();
        localStringBuilder.append("&");
        localStringBuilder.append((String)((Map.Entry)localObject1).getKey());
        localStringBuilder.append("=");
        if (((Map.Entry)localObject1).getValue() == null) {
          break;
        }
        localObject3 = URLEncoder.encode((String)((Map.Entry)localObject1).getValue(), "UTF-8");
      }
    }
    label178:
    localObject3 = localStringBuilder.toString();
    if (((String)localObject3).isEmpty()) {
      return paramString;
    }
    if (paramString.contains("?"))
    {
      paramMap = (Map)localObject3;
      if (!paramString.endsWith("&")) {
        paramMap = g.d("&", (String)localObject3);
      }
      return g.d(paramString, paramMap);
    }
    return g.e(paramString, "?", (String)localObject3);
  }
  
  public final b b()
  {
    Object localObject1 = i.d;
    localObject1.getClass();
    i.a.a(new e((i.a)localObject1), f.a);
    Object localObject4 = null;
    localObject1 = null;
    Object localObject5;
    try
    {
      localObject5 = a(a, b);
      Object localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      ((StringBuilder)localObject6).append("GET Request URL: ");
      ((StringBuilder)localObject6).append((String)localObject5);
      localObject6 = ((StringBuilder)localObject6).toString();
      if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        Log.v("FirebaseCrashlytics", (String)localObject6, null);
      }
      localObject6 = new java/net/URL;
      ((URL)localObject6).<init>((String)localObject5);
      localObject5 = (HttpsURLConnection)((URL)localObject6).openConnection();
      try
      {
        ((URLConnection)localObject5).setReadTimeout(10000);
        ((URLConnection)localObject5).setConnectTimeout(10000);
        ((HttpURLConnection)localObject5).setRequestMethod("GET");
        Object localObject7 = c.entrySet().iterator();
        while (((Iterator)localObject7).hasNext())
        {
          localObject6 = (Map.Entry)((Iterator)localObject7).next();
          ((URLConnection)localObject5).addRequestProperty((String)((Map.Entry)localObject6).getKey(), (String)((Map.Entry)localObject6).getValue());
        }
        ((URLConnection)localObject5).connect();
        int i = ((HttpURLConnection)localObject5).getResponseCode();
        localObject6 = ((URLConnection)localObject5).getInputStream();
        if (localObject6 != null) {
          try
          {
            localObject1 = new java/io/BufferedReader;
            localObject4 = new java/io/InputStreamReader;
            ((InputStreamReader)localObject4).<init>((InputStream)localObject6, "UTF-8");
            ((BufferedReader)localObject1).<init>((Reader)localObject4);
            localObject4 = new char[' '];
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>();
            for (;;)
            {
              int j = ((Reader)localObject1).read((char[])localObject4);
              if (j == -1) {
                break;
              }
              ((StringBuilder)localObject7).append((char[])localObject4, 0, j);
            }
            localObject1 = ((StringBuilder)localObject7).toString();
          }
          finally
          {
            localObject4 = localObject6;
          }
        }
        if (localObject6 != null) {
          ((InputStream)localObject6).close();
        }
        ((HttpURLConnection)localObject5).disconnect();
        return new b(i, str);
      }
      finally {}
      if (localObject4 == null) {
        break label332;
      }
    }
    finally
    {
      localObject5 = null;
    }
    ((InputStream)localObject4).close();
    label332:
    if (localObject5 != null) {
      ((HttpURLConnection)localObject5).disconnect();
    }
    throw ((Throwable)localObject3);
  }
}

/* Location:
 * Qualified Name:     o8.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
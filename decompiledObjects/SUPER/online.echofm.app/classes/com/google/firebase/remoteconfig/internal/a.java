package com.google.firebase.remoteconfig.internal;

import P4.n;
import P4.o;
import P4.o.a;
import P4.r;
import Q4.e;
import V2.j;
import V2.m;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{
  public final Set a;
  public final HttpURLConnection b;
  public final c c;
  public final e d;
  public final P4.c e;
  public final ScheduledExecutorService f;
  public final Random g;
  
  public a(HttpURLConnection paramHttpURLConnection, c paramc, e parame, Set paramSet, P4.c paramc1, ScheduledExecutorService paramScheduledExecutorService)
  {
    b = paramHttpURLConnection;
    c = paramc;
    d = parame;
    a = paramSet;
    e = paramc1;
    f = paramScheduledExecutorService;
    g = new Random();
  }
  
  public static Boolean e(c.a parama, long paramLong)
  {
    b localb = parama.d();
    boolean bool1 = false;
    boolean bool2 = false;
    if (localb != null)
    {
      if (parama.d().i() >= paramLong) {
        bool2 = true;
      }
      return Boolean.valueOf(bool2);
    }
    bool2 = bool1;
    if (parama.f() == 1) {
      bool2 = true;
    }
    return Boolean.valueOf(bool2);
  }
  
  public final void b(final int paramInt, final long paramLong)
  {
    if (paramInt == 0)
    {
      k(new r("Unable to fetch the latest version of the template.", o.a.s));
      return;
    }
    int i = g.nextInt(4);
    f.schedule(new a(paramInt, paramLong), i, TimeUnit.SECONDS);
  }
  
  /* Error */
  public final void c(P4.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	com/google/firebase/remoteconfig/internal/a:a	Ljava/util/Set;
    //   6: invokeinterface 113 1 0
    //   11: astore_2
    //   12: aload_2
    //   13: invokeinterface 119 1 0
    //   18: ifeq +25 -> 43
    //   21: aload_2
    //   22: invokeinterface 123 1 0
    //   27: checkcast 125	P4/c
    //   30: aload_1
    //   31: invokeinterface 127 2 0
    //   36: goto -24 -> 12
    //   39: astore_1
    //   40: goto +6 -> 46
    //   43: aload_0
    //   44: monitorexit
    //   45: return
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	a
    //   0	50	1	paramb	P4.b
    //   11	11	2	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   2	12	39	finally
    //   12	36	39	finally
  }
  
  public j d(int paramInt, long paramLong)
  {
    paramInt--;
    try
    {
      j localj1 = c.n(c.b.q, 3 - paramInt);
      j localj2 = d.e();
      j localj3 = m.i(new j[] { localj1, localj2 });
      ScheduledExecutorService localScheduledExecutorService = f;
      Q4.a locala = new Q4/a;
      locala.<init>(this, localj1, localj2, paramLong, paramInt);
      localj2 = localj3.h(localScheduledExecutorService, locala);
      return localj2;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void f(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream, "utf-8"));
    for (;;)
    {
      Object localObject1 = "";
      Object localObject2;
      do
      {
        String str;
        do
        {
          str = localBufferedReader.readLine();
          if (str == null) {
            break;
          }
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append(str);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject1 = localObject2;
        } while (!str.contains("}"));
        localObject1 = j((String)localObject2);
      } while (((String)localObject1).isEmpty());
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        if ((((JSONObject)localObject2).has("featureDisabled")) && (((JSONObject)localObject2).getBoolean("featureDisabled")))
        {
          localObject2 = e;
          localObject1 = new P4/r;
          ((r)localObject1).<init>("The server is temporarily unavailable. Try again in a few minutes.", o.a.t);
          ((P4.c)localObject2).a((o)localObject1);
        }
      }
      catch (JSONException localJSONException)
      {
        break label214;
        if (g()) {
          break;
        }
        if (((JSONObject)localObject2).has("latestTemplateVersionNumber"))
        {
          long l1 = c.r();
          long l2 = ((JSONObject)localObject2).getLong("latestTemplateVersionNumber");
          if (l2 > l1)
          {
            b(3, l2);
            continue;
            label214:
            k(new n("Unable to parse config update message.", localJSONException.getCause(), o.a.r));
            Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", localJSONException);
          }
        }
      }
    }
    localBufferedReader.close();
    paramInputStream.close();
  }
  
  public final boolean g()
  {
    try
    {
      boolean bool = a.isEmpty();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void i()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	com/google/firebase/remoteconfig/internal/a:b	Ljava/net/HttpURLConnection;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +4 -> 10
    //   9: return
    //   10: aload_1
    //   11: invokevirtual 330	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   14: astore_1
    //   15: aload_0
    //   16: aload_1
    //   17: invokevirtual 332	com/google/firebase/remoteconfig/internal/a:f	(Ljava/io/InputStream;)V
    //   20: aload_1
    //   21: invokevirtual 270	java/io/InputStream:close	()V
    //   24: aload_0
    //   25: getfield 27	com/google/firebase/remoteconfig/internal/a:b	Ljava/net/HttpURLConnection;
    //   28: invokevirtual 337	java/net/HttpURLConnection:disconnect	()V
    //   31: goto +22 -> 53
    //   34: astore_1
    //   35: goto +19 -> 54
    //   38: astore_1
    //   39: ldc_w 257
    //   42: ldc_w 339
    //   45: aload_1
    //   46: invokestatic 341	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   49: pop
    //   50: goto -26 -> 24
    //   53: return
    //   54: aload_0
    //   55: getfield 27	com/google/firebase/remoteconfig/internal/a:b	Ljava/net/HttpURLConnection;
    //   58: invokevirtual 337	java/net/HttpURLConnection:disconnect	()V
    //   61: aload_1
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	a
    //   4	17	1	localObject1	Object
    //   34	1	1	localObject2	Object
    //   38	24	1	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   10	24	34	finally
    //   39	50	34	finally
    //   10	24	38	java/io/IOException
  }
  
  public final String j(String paramString)
  {
    int i = paramString.indexOf('{');
    int j = paramString.lastIndexOf('}');
    String str1 = "";
    String str2 = str1;
    if (i >= 0) {
      if (j < 0) {
        str2 = str1;
      } else if (i >= j) {
        str2 = str1;
      } else {
        str2 = paramString.substring(i, j + 1);
      }
    }
    return str2;
  }
  
  /* Error */
  public final void k(o paramo)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	com/google/firebase/remoteconfig/internal/a:a	Ljava/util/Set;
    //   6: invokeinterface 113 1 0
    //   11: astore_2
    //   12: aload_2
    //   13: invokeinterface 119 1 0
    //   18: ifeq +25 -> 43
    //   21: aload_2
    //   22: invokeinterface 123 1 0
    //   27: checkcast 125	P4/c
    //   30: aload_1
    //   31: invokeinterface 227 2 0
    //   36: goto -24 -> 12
    //   39: astore_1
    //   40: goto +6 -> 46
    //   43: aload_0
    //   44: monitorexit
    //   45: return
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	a
    //   0	50	1	paramo	o
    //   11	11	2	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   2	12	39	finally
    //   12	36	39	finally
  }
  
  public class a
    implements Runnable
  {
    public a(int paramInt, long paramLong) {}
    
    public void run()
    {
      d(paramInt, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
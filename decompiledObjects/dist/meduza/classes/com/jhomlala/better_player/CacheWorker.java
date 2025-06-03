package com.jhomlala.better_player;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d.a;
import androidx.work.d.a.a;
import androidx.work.d.a.c;
import ec.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import lc.k;
import t5.n;
import t5.s.a;
import t5.x;

public final class CacheWorker
  extends Worker
{
  public final Context f;
  public u5.h o;
  public int p;
  
  public CacheWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
    f = paramContext;
  }
  
  public final void g()
  {
    try
    {
      u5.h localh = o;
      if (localh != null) {
        j = true;
      }
    }
    catch (Exception localException)
    {
      Log.e("CacheWorker", localException.toString());
    }
  }
  
  public final d.a j()
  {
    try
    {
      Object localObject1 = b.b;
      i.d(localObject1, "getInputData(...)");
      String str = ((androidx.work.c)localObject1).d("url");
      Object localObject2 = ((androidx.work.c)localObject1).d("cacheKey");
      long l1 = ((androidx.work.c)localObject1).c("preCacheSize");
      long l2 = ((androidx.work.c)localObject1).c("maxCacheSize");
      long l3 = ((androidx.work.c)localObject1).c("maxCacheFileSize");
      Object localObject3 = new java/util/HashMap;
      ((HashMap)localObject3).<init>();
      Object localObject4 = Collections.unmodifiableMap(a).keySet().iterator();
      int i;
      Object localObject6;
      for (;;)
      {
        boolean bool = ((Iterator)localObject4).hasNext();
        i = 0;
        if (!bool) {
          break;
        }
        localObject6 = (String)((Iterator)localObject4).next();
        i.b(localObject6);
        if (k.o0((CharSequence)localObject6, "header_"))
        {
          localObject7 = new lc/d;
          ((lc.d)localObject7).<init>("header_");
          localObject7 = ((String[])localObject7.a(localObject6).toArray(new String[0]))[0];
          localObject6 = Collections.unmodifiableMap(a).get(localObject6);
          Objects.requireNonNull(localObject6);
          ((HashMap)localObject3).put(localObject7, (String)localObject6);
        }
      }
      Object localObject7 = Uri.parse(str);
      if (pa.j.b((Uri)localObject7))
      {
        localObject1 = System.getProperty("http.agent");
        localObject4 = localObject1;
        if (((HashMap)localObject3).containsKey("User-Agent"))
        {
          localObject6 = (String)((HashMap)localObject3).get("User-Agent");
          localObject4 = localObject1;
          if (localObject6 != null) {
            localObject4 = localObject6;
          }
        }
        localObject1 = pa.j.a((String)localObject4, (Map)localObject3);
        localObject4 = new t5/n;
        ((n)localObject4).<init>((Uri)localObject7, 0L, l1);
        if (localObject2 != null)
        {
          if (((String)localObject2).length() > 0) {
            i = 1;
          }
          if (i != 0)
          {
            localObject3 = a;
            long l4 = b;
            int j = c;
            localObject7 = d;
            localObject6 = e;
            long l5 = f;
            long l6 = g;
            i = i;
            Object localObject8 = j;
            if (localObject3 != null)
            {
              localObject4 = new t5/n;
              ((n)localObject4).<init>((Uri)localObject3, l4, j, (byte[])localObject7, (Map)localObject6, l5, l6, (String)localObject2, i, localObject8);
            }
            else
            {
              localObject4 = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject4).<init>("The uri must be set.");
              throw ((Throwable)localObject4);
            }
          }
        }
        localObject6 = new pa/h;
        ((pa.h)localObject6).<init>(f, l2, l3, (s.a)localObject1);
        localObject1 = new u5/h;
        localObject6 = ((pa.h)localObject6).b();
        localObject2 = new q3/j;
        ((q3.j)localObject2).<init>(l1, this, str);
        ((u5.h)localObject1).<init>((u5.c)localObject6, (n)localObject4, (q3.j)localObject2);
        o = ((u5.h)localObject1);
        ((u5.h)localObject1).a();
        return new d.a.c();
      }
      Log.e("CacheWorker", "Preloading only possible for remote data sources");
      localObject4 = new d.a.a();
      return (d.a)localObject4;
    }
    catch (Exception localException)
    {
      Log.e("CacheWorker", localException.toString());
      Object localObject5;
      if ((localException instanceof x)) {
        localObject5 = new d.a.c();
      } else {
        localObject5 = new d.a.a();
      }
      return (d.a)localObject5;
    }
  }
}

/* Location:
 * Qualified Name:     com.jhomlala.better_player.CacheWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
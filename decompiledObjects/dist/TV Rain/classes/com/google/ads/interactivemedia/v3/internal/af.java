package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class af
  implements s
{
  private static af a = new af();
  private static Handler b = new Handler(Looper.getMainLooper());
  private static Handler c = null;
  private static final Runnable j = new ah();
  private static final Runnable k = new ag();
  private List<ai> d = new ArrayList();
  private int e;
  private v f = new v();
  private ac g = new ac();
  private ap h = new ap(new am());
  private long i;
  
  public static af a()
  {
    return a;
  }
  
  private final void a(View paramView, t paramt, JSONObject paramJSONObject, al paramal)
  {
    boolean bool;
    if (paramal == al.a) {
      bool = true;
    } else {
      bool = false;
    }
    paramt.a(paramView, paramJSONObject, this, bool);
  }
  
  private final void h()
  {
    e = 0;
    i = h.f();
    g.c();
    long l1 = h.f();
    Object localObject1 = f.a();
    Object localObject2;
    if (g.b().size() > 0)
    {
      localObject2 = ((t)localObject1).a(null);
      h.b((JSONObject)localObject2, g.b(), l1);
    }
    if (g.a().size() > 0)
    {
      localObject2 = ((t)localObject1).a(null);
      a(null, (t)localObject1, (JSONObject)localObject2, al.a);
      aa.a((JSONObject)localObject2);
      h.a((JSONObject)localObject2, g.a(), l1);
    }
    else
    {
      h.b();
    }
    g.d();
    long l2 = h.f();
    l1 = i;
    if (d.size() > 0)
    {
      localObject2 = d.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (ai)((Iterator)localObject2).next();
        TimeUnit.NANOSECONDS.toMillis(l2 - l1);
        ((ai)localObject1).a();
        if ((localObject1 instanceof aj)) {
          ((aj)localObject1).b();
        }
      }
    }
  }
  
  public final void a(View paramView, t paramt, JSONObject paramJSONObject)
  {
    if (!h.d(paramView)) {
      return;
    }
    al localal = g.c(paramView);
    if (localal == al.c) {
      return;
    }
    JSONObject localJSONObject = paramt.a(paramView);
    aa.a(paramJSONObject, localJSONObject);
    paramJSONObject = g.a(paramView);
    int m;
    if (paramJSONObject != null)
    {
      aa.a(localJSONObject, paramJSONObject);
      g.e();
      m = 1;
    }
    else
    {
      m = 0;
    }
    if (m == 0)
    {
      paramJSONObject = g.b(paramView);
      if (paramJSONObject != null) {
        aa.a(localJSONObject, paramJSONObject);
      }
      a(paramView, paramt, localJSONObject, localal);
    }
    e += 1;
  }
  
  public final void b()
  {
    if (c == null)
    {
      Handler localHandler = new Handler(Looper.getMainLooper());
      c = localHandler;
      localHandler.post(j);
      c.postDelayed(k, 200L);
    }
  }
  
  public final void c()
  {
    Handler localHandler = c;
    if (localHandler != null)
    {
      localHandler.removeCallbacks(k);
      c = null;
    }
    d.clear();
    b.post(new ae(this));
  }
  
  public final void d()
  {
    Handler localHandler = c;
    if (localHandler != null)
    {
      localHandler.removeCallbacks(k);
      c = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
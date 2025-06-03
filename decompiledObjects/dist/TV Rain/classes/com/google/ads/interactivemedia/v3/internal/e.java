package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

public class e
{
  private final hu a;
  private final List<as> b;
  private as c;
  private w d;
  private boolean e;
  private boolean f;
  private String g;
  
  public e() {}
  
  public e(fc paramfc, hu paramhu)
  {
    this();
    b = new ArrayList();
    e = false;
    f = false;
    a = paramhu;
    g = UUID.randomUUID().toString();
    e(null);
    if (paramhu.f() == d.a) {
      d = new w(paramhu.c());
    } else {
      d = new y(paramhu.b(), paramhu.e());
    }
    d.a();
    k.a().a(this);
    paramhu = d;
    r.a().a(paramhu.c(), paramfc.a());
  }
  
  public static e a(fc paramfc, hu paramhu)
  {
    h.g();
    h.a(paramfc, "AdSessionConfiguration is null");
    h.a(paramhu, "AdSessionContext is null");
    return new e(paramfc, paramhu);
  }
  
  private as c(View paramView)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      as localas = (as)localIterator.next();
      if (localas.get() == paramView) {
        return localas;
      }
    }
    return null;
  }
  
  private static void d(View paramView)
  {
    if (paramView != null) {
      return;
    }
    throw new IllegalArgumentException("FriendlyObstruction is null");
  }
  
  private void e(View paramView)
  {
    c = new as(paramView);
  }
  
  private void f(View paramView)
  {
    Object localObject = k.a().b();
    if ((localObject != null) && (((Collection)localObject).size() > 0))
    {
      Iterator localIterator = ((Collection)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (e)localIterator.next();
        if ((localObject != this) && (((e)localObject).g() == paramView)) {
          c.clear();
        }
      }
    }
  }
  
  public void a()
  {
    if (e) {
      return;
    }
    e = true;
    k.a().b(this);
    float f1 = j.a().d();
    d.a(f1);
    w localw = d;
    Object localObject1 = a;
    Object localObject2 = f();
    JSONObject localJSONObject = new JSONObject();
    aa.a(localJSONObject, "environment", "app");
    aa.a(localJSONObject, "adSessionType", ((hu)localObject1).f());
    aa.a(localJSONObject, "deviceInfo", h.d());
    Object localObject3 = new JSONArray();
    ((JSONArray)localObject3).put("clid");
    ((JSONArray)localObject3).put("vlid");
    aa.a(localJSONObject, "supports", localObject3);
    localObject3 = new JSONObject();
    aa.a((JSONObject)localObject3, "partnerName", ((hu)localObject1).a().a());
    aa.a((JSONObject)localObject3, "partnerVersion", ((hu)localObject1).a().b());
    aa.a(localJSONObject, "omidNativeInfo", localObject3);
    localObject3 = new JSONObject();
    aa.a((JSONObject)localObject3, "libraryVersion", "1.2.17-google_20190723");
    aa.a((JSONObject)localObject3, "appId", o.a().b().getApplicationContext().getPackageName());
    aa.a(localJSONObject, "app", localObject3);
    if (((hu)localObject1).d() != null) {
      aa.a(localJSONObject, "customReferenceData", ((hu)localObject1).d());
    }
    localObject3 = new JSONObject();
    localObject1 = ((hu)localObject1).b().iterator();
    if (!((Iterator)localObject1).hasNext())
    {
      r.a().a(localw.c(), (String)localObject2, localJSONObject, (JSONObject)localObject3);
      return;
    }
    localObject2 = (e)((Iterator)localObject1).next();
    throw new NoSuchMethodError();
  }
  
  public void a(View paramView)
  {
    if (f) {
      return;
    }
    h.a(paramView, "AdView is null");
    if (g() == paramView) {
      return;
    }
    e(paramView);
    e().e();
    f(paramView);
  }
  
  public void b()
  {
    if (f) {
      return;
    }
    c.clear();
    c();
    f = true;
    w localw = e();
    r.a().a(localw.c());
    k.a().c(this);
    e().b();
    d = null;
  }
  
  public void b(View paramView)
  {
    if (f) {
      return;
    }
    d(paramView);
    if (c(paramView) == null) {
      b.add(new as(paramView));
    }
  }
  
  public void c()
  {
    if (f) {
      return;
    }
    b.clear();
  }
  
  public List<as> d()
  {
    return b;
  }
  
  public w e()
  {
    return d;
  }
  
  public String f()
  {
    return g;
  }
  
  public View g()
  {
    return (View)c.get();
  }
  
  public boolean h()
  {
    return (e) && (!f);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
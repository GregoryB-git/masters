package d0;

import X2.v;
import android.net.Uri;
import g0.a;
import java.util.Collections;
import java.util.List;

public final class u$c
{
  public String a;
  public Uri b;
  public String c;
  public u.d.a d = new u.d.a();
  public u.f.a e = new u.f.a(null);
  public List f = Collections.emptyList();
  public String g;
  public v h = v.Y();
  public Object i;
  public long j = -9223372036854775807L;
  public w k;
  public u.g.a l = new u.g.a();
  public u.i m = u.i.d;
  
  public u$c() {}
  
  public u$c(u paramu)
  {
    this();
    a = a;
    k = e;
    l = d.a();
    m = h;
    u.h localh = b;
    if (localh != null)
    {
      g = e;
      c = b;
      b = a;
      f = d;
      h = f;
      i = h;
      paramu = c;
      if (paramu != null) {
        paramu = paramu.b();
      } else {
        paramu = new u.f.a(null);
      }
      e = paramu;
      j = i;
    }
  }
  
  public u a()
  {
    boolean bool;
    if ((u.f.a.e(e) != null) && (u.f.a.f(e) == null)) {
      bool = false;
    } else {
      bool = true;
    }
    a.f(bool);
    Object localObject1 = b;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      localObject3 = c;
      if (u.f.a.f(e) != null) {
        localObject2 = e.i();
      }
      localObject2 = new u.h((Uri)localObject1, (String)localObject3, (u.f)localObject2, null, f, g, h, i, j, null);
    }
    else
    {
      localObject2 = null;
    }
    localObject1 = a;
    if (localObject1 == null) {
      for (;;)
      {
        localObject1 = "";
      }
    }
    u.e locale = d.g();
    u.g localg = l.f();
    Object localObject3 = k;
    if (localObject3 == null) {
      for (;;)
      {
        localObject3 = w.H;
      }
    }
    return new u((String)localObject1, locale, (u.h)localObject2, localg, (w)localObject3, m, null);
  }
  
  public c b(String paramString)
  {
    a = ((String)a.e(paramString));
    return this;
  }
  
  public c c(String paramString)
  {
    c = paramString;
    return this;
  }
  
  public c d(Object paramObject)
  {
    i = paramObject;
    return this;
  }
  
  public c e(Uri paramUri)
  {
    b = paramUri;
    return this;
  }
}

/* Location:
 * Qualified Name:     d0.u.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
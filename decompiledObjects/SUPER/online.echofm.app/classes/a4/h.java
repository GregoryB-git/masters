package a4;

import Y3.m;
import b4.c;
import b4.d;
import b4.e;
import d4.a;
import d4.f;
import d4.g;
import d4.l;
import d4.n;
import d4.o;
import d4.q;
import d4.r;
import d4.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class h
{
  public static final h i = new h();
  public Integer a;
  public b b;
  public n c = null;
  public d4.b d = null;
  public n e = null;
  public d4.b f = null;
  public d4.h g = q.j();
  public String h = null;
  
  public static h c(Map paramMap)
  {
    h localh = new h();
    a = ((Integer)paramMap.get("l"));
    if (paramMap.containsKey("sp"))
    {
      c = v(o.a(paramMap.get("sp")));
      localObject = (String)paramMap.get("sn");
      if (localObject != null) {
        d = d4.b.j((String)localObject);
      }
    }
    if (paramMap.containsKey("ep"))
    {
      e = v(o.a(paramMap.get("ep")));
      localObject = (String)paramMap.get("en");
      if (localObject != null) {
        f = d4.b.j((String)localObject);
      }
    }
    Object localObject = (String)paramMap.get("vf");
    if (localObject != null)
    {
      if (((String)localObject).equals("l")) {
        localObject = b.o;
      } else {
        localObject = b.p;
      }
      b = ((b)localObject);
    }
    paramMap = (String)paramMap.get("i");
    if (paramMap != null) {
      g = d4.h.b(paramMap);
    }
    return localh;
  }
  
  public static n v(n paramn)
  {
    if ((!(paramn instanceof t)) && (!(paramn instanceof a)) && (!(paramn instanceof f)) && (!(paramn instanceof g)))
    {
      if ((paramn instanceof l)) {
        return new f(Double.valueOf(((Long)paramn.getValue()).doubleValue()), r.a());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unexpected value passed to normalizeValue: ");
      localStringBuilder.append(paramn.getValue());
      throw new IllegalStateException(localStringBuilder.toString());
    }
    return paramn;
  }
  
  public final h a()
  {
    h localh = new h();
    a = a;
    c = c;
    d = d;
    e = e;
    f = f;
    b = b;
    g = g;
    return localh;
  }
  
  public h b(n paramn, d4.b paramb)
  {
    boolean bool;
    if ((!paramn.B()) && (!paramn.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    m.f(bool);
    m.f(paramn instanceof l ^ true);
    h localh = a();
    e = paramn;
    f = paramb;
    return localh;
  }
  
  public d4.h d()
  {
    return g;
  }
  
  public d4.b e()
  {
    if (m())
    {
      d4.b localb = f;
      if (localb != null) {
        return localb;
      }
      return d4.b.m();
    }
    throw new IllegalArgumentException("Cannot get index end name if start has not been set");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (h.class == paramObject.getClass()))
    {
      paramObject = (h)paramObject;
      Object localObject = a;
      if (localObject != null ? !((Integer)localObject).equals(a) : a != null) {
        return false;
      }
      localObject = g;
      if (localObject != null ? !localObject.equals(g) : g != null) {
        return false;
      }
      localObject = f;
      if (localObject != null ? !((d4.b)localObject).equals(f) : f != null) {
        return false;
      }
      localObject = e;
      if (localObject != null ? !localObject.equals(e) : e != null) {
        return false;
      }
      localObject = d;
      if (localObject != null ? !((d4.b)localObject).equals(d) : d != null) {
        return false;
      }
      localObject = c;
      if (localObject != null ? !localObject.equals(c) : c != null) {
        return false;
      }
      return r() == ((h)paramObject).r();
    }
    return false;
  }
  
  public n f()
  {
    if (m()) {
      return e;
    }
    throw new IllegalArgumentException("Cannot get index end value if start has not been set");
  }
  
  public d4.b g()
  {
    if (o())
    {
      d4.b localb = d;
      if (localb != null) {
        return localb;
      }
      return d4.b.n();
    }
    throw new IllegalArgumentException("Cannot get index start name if start has not been set");
  }
  
  public n h()
  {
    if (o()) {
      return c;
    }
    throw new IllegalArgumentException("Cannot get index start value if start has not been set");
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int j = 0;
    int k;
    if (localObject != null) {
      k = ((Integer)localObject).intValue();
    } else {
      k = 0;
    }
    int m;
    if (r()) {
      m = 1231;
    } else {
      m = 1237;
    }
    localObject = c;
    int n;
    if (localObject != null) {
      n = localObject.hashCode();
    } else {
      n = 0;
    }
    localObject = d;
    int i1;
    if (localObject != null) {
      i1 = ((d4.b)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = e;
    int i2;
    if (localObject != null) {
      i2 = localObject.hashCode();
    } else {
      i2 = 0;
    }
    localObject = f;
    int i3;
    if (localObject != null) {
      i3 = ((d4.b)localObject).hashCode();
    } else {
      i3 = 0;
    }
    localObject = g;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return (((((k * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + j;
  }
  
  public int i()
  {
    if (n()) {
      return a.intValue();
    }
    throw new IllegalArgumentException("Cannot get limit if limit has not been set");
  }
  
  public d j()
  {
    if (u()) {
      return new b4.b(d());
    }
    if (n()) {
      return new c(this);
    }
    return new e(this);
  }
  
  public Map k()
  {
    HashMap localHashMap = new HashMap();
    if (o())
    {
      localHashMap.put("sp", c.getValue());
      localObject = d;
      if (localObject != null) {
        localHashMap.put("sn", ((d4.b)localObject).e());
      }
    }
    if (m())
    {
      localHashMap.put("ep", e.getValue());
      localObject = f;
      if (localObject != null) {
        localHashMap.put("en", ((d4.b)localObject).e());
      }
    }
    Object localObject = a;
    if (localObject != null)
    {
      localHashMap.put("l", localObject);
      b localb = b;
      localObject = localb;
      if (localb == null) {
        if (o()) {
          localObject = b.o;
        } else {
          localObject = b.p;
        }
      }
      int j = a.a[localObject.ordinal()];
      if (j != 1)
      {
        if (j == 2) {
          localHashMap.put("vf", "r");
        }
      }
      else {
        localHashMap.put("vf", "l");
      }
    }
    if (!g.equals(q.j())) {
      localHashMap.put("i", g.c());
    }
    return localHashMap;
  }
  
  public boolean l()
  {
    boolean bool;
    if ((n()) && (b != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean m()
  {
    boolean bool;
    if (e != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean n()
  {
    boolean bool;
    if (a != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean o()
  {
    boolean bool;
    if (c != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean p()
  {
    boolean bool;
    if ((u()) && (g.equals(q.j()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean q()
  {
    boolean bool;
    if ((o()) && (m()) && (n()) && (!l())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean r()
  {
    b localb = b;
    boolean bool;
    if (localb != null)
    {
      if (localb == b.o) {
        bool = true;
      } else {
        bool = false;
      }
    }
    else {
      bool = o();
    }
    return bool;
  }
  
  public h s(int paramInt)
  {
    h localh = a();
    a = Integer.valueOf(paramInt);
    b = b.o;
    return localh;
  }
  
  public h t(int paramInt)
  {
    h localh = a();
    a = Integer.valueOf(paramInt);
    b = b.p;
    return localh;
  }
  
  public String toString()
  {
    return k().toString();
  }
  
  public boolean u()
  {
    boolean bool;
    if ((!o()) && (!m()) && (!n())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public h w(d4.h paramh)
  {
    h localh = a();
    g = paramh;
    return localh;
  }
  
  public h x(n paramn, d4.b paramb)
  {
    boolean bool;
    if ((!paramn.B()) && (!paramn.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    m.f(bool);
    m.f(paramn instanceof l ^ true);
    h localh = a();
    c = paramn;
    d = paramb;
    return localh;
  }
  
  public String y()
  {
    if (h == null) {
      try
      {
        h = f4.b.c(k());
      }
      catch (IOException localIOException)
      {
        throw new RuntimeException(localIOException);
      }
    }
    return h;
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("LEFT", 0);
      o = localb1;
      b localb2 = new b("RIGHT", 1);
      p = localb2;
      q = new b[] { localb1, localb2 };
    }
  }
}

/* Location:
 * Qualified Name:     a4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
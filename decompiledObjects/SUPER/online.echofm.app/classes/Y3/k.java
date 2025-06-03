package Y3;

import d4.b;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class k
{
  public b a;
  public k b;
  public l c;
  
  public k()
  {
    this(null, null, new l());
  }
  
  public k(b paramb, k paramk, l paraml)
  {
    a = paramb;
    b = paramk;
    c = paraml;
  }
  
  public boolean a(b paramb)
  {
    return b(paramb, false);
  }
  
  public boolean b(b paramb, boolean paramBoolean)
  {
    if (paramBoolean) {
      localk = this;
    }
    for (k localk = b; localk != null; localk = b) {
      if (paramb.a(localk)) {
        return true;
      }
    }
    return false;
  }
  
  public void c(c paramc)
  {
    Object[] arrayOfObject = c.a.entrySet().toArray();
    for (int i = 0; i < arrayOfObject.length; i++)
    {
      Map.Entry localEntry = (Map.Entry)arrayOfObject[i];
      paramc.a(new k((b)localEntry.getKey(), this, (l)localEntry.getValue()));
    }
  }
  
  public void d(c paramc)
  {
    e(paramc, false, false);
  }
  
  public void e(final c paramc, boolean paramBoolean1, final boolean paramBoolean2)
  {
    if ((paramBoolean1) && (!paramBoolean2)) {
      paramc.a(this);
    }
    c(new a(paramc, paramBoolean2));
    if ((paramBoolean1) && (paramBoolean2)) {
      paramc.a(this);
    }
  }
  
  public V3.k f()
  {
    boolean bool = false;
    if (b != null)
    {
      if (a != null) {
        bool = true;
      }
      m.f(bool);
      return b.f().U(a);
    }
    V3.k localk;
    if (a != null) {
      localk = new V3.k(new b[] { a });
    } else {
      localk = V3.k.Y();
    }
    return localk;
  }
  
  public Object g()
  {
    return c.b;
  }
  
  public boolean h()
  {
    return c.a.isEmpty() ^ true;
  }
  
  public boolean i()
  {
    l locall = c;
    boolean bool;
    if ((b == null) && (a.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void j(Object paramObject)
  {
    c.b = paramObject;
    n();
  }
  
  public k k(V3.k paramk)
  {
    b localb = paramk.Z();
    k localk = this;
    while (localb != null)
    {
      l locall;
      if (c.a.containsKey(localb)) {
        locall = (l)c.a.get(localb);
      } else {
        locall = new l();
      }
      localk = new k(localb, localk, locall);
      paramk = paramk.c0();
      localb = paramk.Z();
    }
    return localk;
  }
  
  public String l(String paramString)
  {
    Object localObject = a;
    if (localObject == null) {
      localObject = "<anon>";
    } else {
      localObject = ((b)localObject).e();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("\n");
    l locall = c;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("\t");
    localStringBuilder.append(locall.a(((StringBuilder)localObject).toString()));
    return localStringBuilder.toString();
  }
  
  public final void m(b paramb, k paramk)
  {
    boolean bool1 = paramk.i();
    boolean bool2 = c.a.containsKey(paramb);
    if ((bool1) && (bool2)) {
      c.a.remove(paramb);
    }
    for (;;)
    {
      n();
      break;
      if ((bool1) || (bool2)) {
        break;
      }
      c.a.put(paramb, c);
    }
  }
  
  public final void n()
  {
    k localk = b;
    if (localk != null) {
      localk.m(a, this);
    }
  }
  
  public String toString()
  {
    return l("");
  }
  
  public class a
    implements k.c
  {
    public a(k.c paramc, boolean paramBoolean) {}
    
    public void a(k paramk)
    {
      paramk.e(paramc, true, paramBoolean2);
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean a(k paramk);
  }
  
  public static abstract interface c
  {
    public abstract void a(k paramk);
  }
}

/* Location:
 * Qualified Name:     Y3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
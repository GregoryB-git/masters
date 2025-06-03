package k3;

import c3.g;
import c3.y;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import r3.a;

public final class r
{
  public final Map a;
  public final Map b;
  public final Map c;
  public final Map d;
  
  public r(b paramb)
  {
    a = new HashMap(b.b(paramb));
    b = new HashMap(b.c(paramb));
    c = new HashMap(b.d(paramb));
    d = new HashMap(b.a(paramb));
  }
  
  public boolean e(q paramq)
  {
    paramq = new c(paramq.getClass(), paramq.a(), null);
    return b.containsKey(paramq);
  }
  
  public g f(q paramq, y paramy)
  {
    c localc = new c(paramq.getClass(), paramq.a(), null);
    if (b.containsKey(localc)) {
      return ((b)b.get(localc)).d(paramq, paramy);
    }
    paramq = new StringBuilder();
    paramq.append("No Key Parser for requested key type ");
    paramq.append(localc);
    paramq.append(" available");
    throw new GeneralSecurityException(paramq.toString());
  }
  
  public static final class b
  {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    
    public b()
    {
      a = new HashMap();
      b = new HashMap();
      c = new HashMap();
      d = new HashMap();
    }
    
    public b(r paramr)
    {
      a = new HashMap(r.a(paramr));
      b = new HashMap(r.b(paramr));
      c = new HashMap(r.c(paramr));
      d = new HashMap(r.d(paramr));
    }
    
    public r e()
    {
      return new r(this, null);
    }
    
    public b f(b paramb)
    {
      r.c localc = new r.c(paramb.c(), paramb.b(), null);
      if (b.containsKey(localc))
      {
        b localb = (b)b.get(localc);
        if ((!localb.equals(paramb)) || (!paramb.equals(localb)))
        {
          paramb = new StringBuilder();
          paramb.append("Attempt to register non-equal parser for already existing object of type: ");
          paramb.append(localc);
          throw new GeneralSecurityException(paramb.toString());
        }
      }
      else
      {
        b.put(localc, paramb);
      }
      return this;
    }
    
    public b g(c paramc)
    {
      r.d locald = new r.d(paramc.b(), paramc.c(), null);
      if (a.containsKey(locald))
      {
        c localc = (c)a.get(locald);
        if ((!localc.equals(paramc)) || (!paramc.equals(localc)))
        {
          paramc = new StringBuilder();
          paramc.append("Attempt to register non-equal serializer for already existing object of type: ");
          paramc.append(locald);
          throw new GeneralSecurityException(paramc.toString());
        }
      }
      else
      {
        a.put(locald, paramc);
      }
      return this;
    }
    
    public b h(j paramj)
    {
      r.c localc = new r.c(paramj.c(), paramj.b(), null);
      if (d.containsKey(localc))
      {
        j localj = (j)d.get(localc);
        if ((!localj.equals(paramj)) || (!paramj.equals(localj)))
        {
          paramj = new StringBuilder();
          paramj.append("Attempt to register non-equal parser for already existing object of type: ");
          paramj.append(localc);
          throw new GeneralSecurityException(paramj.toString());
        }
      }
      else
      {
        d.put(localc, paramj);
      }
      return this;
    }
    
    public b i(k paramk)
    {
      r.d locald = new r.d(paramk.b(), paramk.c(), null);
      if (c.containsKey(locald))
      {
        k localk = (k)c.get(locald);
        if ((!localk.equals(paramk)) || (!paramk.equals(localk)))
        {
          paramk = new StringBuilder();
          paramk.append("Attempt to register non-equal serializer for already existing object of type: ");
          paramk.append(locald);
          throw new GeneralSecurityException(paramk.toString());
        }
      }
      else
      {
        c.put(locald, paramk);
      }
      return this;
    }
  }
  
  public static class c
  {
    public final Class a;
    public final a b;
    
    public c(Class paramClass, a parama)
    {
      a = paramClass;
      b = parama;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof c;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (c)paramObject;
      bool1 = bool2;
      if (a.equals(a))
      {
        bool1 = bool2;
        if (b.equals(b)) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      return Objects.hash(new Object[] { a, b });
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a.getSimpleName());
      localStringBuilder.append(", object identifier: ");
      localStringBuilder.append(b);
      return localStringBuilder.toString();
    }
  }
  
  public static class d
  {
    public final Class a;
    public final Class b;
    
    public d(Class paramClass1, Class paramClass2)
    {
      a = paramClass1;
      b = paramClass2;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof d;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (d)paramObject;
      bool1 = bool2;
      if (a.equals(a))
      {
        bool1 = bool2;
        if (b.equals(b)) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      return Objects.hash(new Object[] { a, b });
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a.getSimpleName());
      localStringBuilder.append(" with serialization type: ");
      localStringBuilder.append(b.getSimpleName());
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     k3.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
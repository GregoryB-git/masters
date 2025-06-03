package k3;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class r$b
{
  public final Map a;
  public final Map b;
  public final Map c;
  public final Map d;
  
  public r$b()
  {
    a = new HashMap();
    b = new HashMap();
    c = new HashMap();
    d = new HashMap();
  }
  
  public r$b(r paramr)
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

/* Location:
 * Qualified Name:     k3.r.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
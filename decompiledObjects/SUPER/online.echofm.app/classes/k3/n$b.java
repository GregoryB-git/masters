package k3;

import c3.w;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

public final class n$b
{
  public final Map a;
  public final Map b;
  
  public n$b()
  {
    a = new HashMap();
    b = new HashMap();
  }
  
  public n$b(n paramn)
  {
    a = new HashMap(n.a(paramn));
    b = new HashMap(n.b(paramn));
  }
  
  public n c()
  {
    return new n(this, null);
  }
  
  public b d(l paraml)
  {
    if (paraml != null)
    {
      n.c localc = new n.c(paraml.c(), paraml.d(), null);
      if (a.containsKey(localc))
      {
        l locall = (l)a.get(localc);
        if ((!locall.equals(paraml)) || (!paraml.equals(locall)))
        {
          paraml = new StringBuilder();
          paraml.append("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
          paraml.append(localc);
          throw new GeneralSecurityException(paraml.toString());
        }
      }
      else
      {
        a.put(localc, paraml);
      }
      return this;
    }
    throw new NullPointerException("primitive constructor must be non-null");
  }
  
  public b e(w paramw)
  {
    if (paramw != null)
    {
      Class localClass = paramw.c();
      if (b.containsKey(localClass))
      {
        w localw = (w)b.get(localClass);
        if ((!localw.equals(paramw)) || (!paramw.equals(localw)))
        {
          paramw = new StringBuilder();
          paramw.append("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
          paramw.append(localClass);
          throw new GeneralSecurityException(paramw.toString());
        }
      }
      else
      {
        b.put(localClass, paramw);
      }
      return this;
    }
    throw new NullPointerException("wrapper must be non-null");
  }
}

/* Location:
 * Qualified Name:     k3.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
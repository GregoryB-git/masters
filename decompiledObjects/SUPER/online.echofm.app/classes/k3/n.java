package k3;

import c3.g;
import c3.v;
import c3.w;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class n
{
  public final Map a;
  public final Map b;
  
  public n(b paramb)
  {
    a = new HashMap(b.a(paramb));
    b = new HashMap(b.b(paramb));
  }
  
  public Class c(Class paramClass)
  {
    if (b.containsKey(paramClass)) {
      return ((w)b.get(paramClass)).a();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("No input primitive class for ");
    localStringBuilder.append(paramClass);
    localStringBuilder.append(" available");
    throw new GeneralSecurityException(localStringBuilder.toString());
  }
  
  public Object d(g paramg, Class paramClass)
  {
    paramClass = new c(paramg.getClass(), paramClass, null);
    if (a.containsKey(paramClass)) {
      return ((l)a.get(paramClass)).a(paramg);
    }
    paramg = new StringBuilder();
    paramg.append("No PrimitiveConstructor for ");
    paramg.append(paramClass);
    paramg.append(" available");
    throw new GeneralSecurityException(paramg.toString());
  }
  
  public Object e(v paramv, Class paramClass)
  {
    if (b.containsKey(paramClass))
    {
      paramClass = (w)b.get(paramClass);
      if ((paramv.g().equals(paramClass.a())) && (paramClass.a().equals(paramv.g()))) {
        return paramClass.b(paramv);
      }
      throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
    paramv = new StringBuilder();
    paramv.append("No wrapper found for ");
    paramv.append(paramClass);
    throw new GeneralSecurityException(paramv.toString());
  }
  
  public static final class b
  {
    public final Map a;
    public final Map b;
    
    public b()
    {
      a = new HashMap();
      b = new HashMap();
    }
    
    public b(n paramn)
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
  
  public static final class c
  {
    public final Class a;
    public final Class b;
    
    public c(Class paramClass1, Class paramClass2)
    {
      a = paramClass1;
      b = paramClass2;
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
      localStringBuilder.append(" with primitive type: ");
      localStringBuilder.append(b.getSimpleName());
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     k3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
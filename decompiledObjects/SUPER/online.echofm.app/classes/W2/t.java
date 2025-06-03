package W2;

import java.io.Serializable;

public abstract class t
{
  public static s a(s params)
  {
    if ((!(params instanceof b)) && (!(params instanceof a)))
    {
      if ((params instanceof Serializable)) {
        params = new a(params);
      } else {
        params = new b(params);
      }
      return params;
    }
    return params;
  }
  
  public static s b(Object paramObject)
  {
    return new c(paramObject);
  }
  
  public static class a
    implements s, Serializable
  {
    private static final long serialVersionUID = 0L;
    public final s o;
    public volatile transient boolean p;
    public transient Object q;
    
    public a(s params)
    {
      o = ((s)m.j(params));
    }
    
    public Object get()
    {
      if (!p) {
        label49:
        try
        {
          if (!p)
          {
            Object localObject1 = o.get();
            q = localObject1;
            p = true;
            return localObject1;
          }
        }
        finally
        {
          break label49;
        }
      }
      return j.a(q);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Suppliers.memoize(");
      Object localObject;
      if (p)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("<supplier that returned ");
        ((StringBuilder)localObject).append(q);
        ((StringBuilder)localObject).append(">");
        localObject = ((StringBuilder)localObject).toString();
      }
      else
      {
        localObject = o;
      }
      localStringBuilder.append(localObject);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static class b
    implements s
  {
    public static final s q = new u();
    public volatile s o;
    public Object p;
    
    public b(s params)
    {
      o = ((s)m.j(params));
    }
    
    public Object get()
    {
      Object localObject1 = o;
      s locals = q;
      if (localObject1 != locals) {
        label57:
        try
        {
          if (o != locals)
          {
            localObject1 = o.get();
            p = localObject1;
            o = locals;
            return localObject1;
          }
        }
        finally
        {
          break label57;
        }
      }
      return j.a(p);
    }
    
    public String toString()
    {
      s locals = o;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Suppliers.memoize(");
      Object localObject = locals;
      if (locals == q)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("<supplier that returned ");
        ((StringBuilder)localObject).append(p);
        ((StringBuilder)localObject).append(">");
        localObject = ((StringBuilder)localObject).toString();
      }
      localStringBuilder.append(localObject);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static class c
    implements s, Serializable
  {
    private static final long serialVersionUID = 0L;
    public final Object o;
    
    public c(Object paramObject)
    {
      o = paramObject;
    }
    
    public boolean equals(Object paramObject)
    {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        return k.a(o, o);
      }
      return false;
    }
    
    public Object get()
    {
      return o;
    }
    
    public int hashCode()
    {
      return k.b(new Object[] { o });
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Suppliers.ofInstance(");
      localStringBuilder.append(o);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     W2.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
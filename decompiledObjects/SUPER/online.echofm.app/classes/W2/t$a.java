package W2;

import java.io.Serializable;

public class t$a
  implements s, Serializable
{
  private static final long serialVersionUID = 0L;
  public final s o;
  public volatile transient boolean p;
  public transient Object q;
  
  public t$a(s params)
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

/* Location:
 * Qualified Name:     W2.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
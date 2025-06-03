package W2;

import java.io.Serializable;

public class t$c
  implements s, Serializable
{
  private static final long serialVersionUID = 0L;
  public final Object o;
  
  public t$c(Object paramObject)
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

/* Location:
 * Qualified Name:     W2.t.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package X2;

import java.io.Serializable;

public class u
  extends e
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final Object o;
  public final Object p;
  
  public u(Object paramObject1, Object paramObject2)
  {
    o = paramObject1;
    p = paramObject2;
  }
  
  public final Object getKey()
  {
    return o;
  }
  
  public final Object getValue()
  {
    return p;
  }
  
  public final Object setValue(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     X2.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
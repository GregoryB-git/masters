package X2;

import java.io.Serializable;

public class v$d
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final Object[] o;
  
  public v$d(Object[] paramArrayOfObject)
  {
    o = paramArrayOfObject;
  }
  
  public Object readResolve()
  {
    return v.V(o);
  }
}

/* Location:
 * Qualified Name:     X2.v.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
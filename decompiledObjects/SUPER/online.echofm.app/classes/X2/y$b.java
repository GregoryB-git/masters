package X2;

import java.io.Serializable;

public class y$b
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final Object[] o;
  
  public y$b(Object[] paramArrayOfObject)
  {
    o = paramArrayOfObject;
  }
  
  public Object readResolve()
  {
    return y.U(o);
  }
}

/* Location:
 * Qualified Name:     X2.y.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
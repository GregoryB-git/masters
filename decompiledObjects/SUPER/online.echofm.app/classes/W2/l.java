package W2;

import java.io.Serializable;

public abstract class l
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  
  public static l a()
  {
    return a.e();
  }
  
  public static l d(Object paramObject)
  {
    return new p(m.j(paramObject));
  }
  
  public abstract Object b();
  
  public abstract boolean c();
}

/* Location:
 * Qualified Name:     W2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
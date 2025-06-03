package ec;

import java.io.Serializable;

public abstract class j<R>
  implements f<R>, Serializable
{
  private final int arity;
  
  public j(int paramInt)
  {
    arity = paramInt;
  }
  
  public int getArity()
  {
    return arity;
  }
  
  public String toString()
  {
    t.a.getClass();
    String str = u.a(this);
    i.d(str, "renderLambdaToString(...)");
    return str;
  }
}

/* Location:
 * Qualified Name:     ec.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
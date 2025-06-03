package wb;

import ec.f;
import ec.t;
import ec.u;
import ub.e;

public abstract class i
  extends c
  implements f<Object>
{
  private final int arity;
  
  public i(int paramInt)
  {
    this(paramInt, null);
  }
  
  public i(int paramInt, e<Object> parame)
  {
    super(parame);
    arity = paramInt;
  }
  
  public int getArity()
  {
    return arity;
  }
  
  public String toString()
  {
    String str;
    if (getCompletion() == null)
    {
      t.a.getClass();
      str = u.a(this);
      ec.i.d(str, "renderLambdaToString(...)");
    }
    else
    {
      str = super.toString();
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     wb.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package wb;

import ec.f;
import ec.i;
import ec.t;
import ec.u;
import ub.e;

public abstract class h
  extends g
  implements f<Object>
{
  public final int a = 2;
  
  public h(e parame)
  {
    super(parame);
  }
  
  public final int getArity()
  {
    return a;
  }
  
  public final String toString()
  {
    String str;
    if (getCompletion() == null)
    {
      t.a.getClass();
      str = u.a(this);
      i.d(str, "renderLambdaToString(...)");
    }
    else
    {
      str = super.toString();
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     wb.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
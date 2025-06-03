package N0;

import F0.D;
import F0.M;
import F0.M.a;
import F0.N;
import F0.T;
import F0.t;

public final class e
  implements t
{
  public final long o;
  public final t p;
  
  public e(long paramLong, t paramt)
  {
    o = paramLong;
    p = paramt;
  }
  
  public T a(int paramInt1, int paramInt2)
  {
    return p.a(paramInt1, paramInt2);
  }
  
  public void e(final M paramM)
  {
    p.e(new a(paramM, paramM));
  }
  
  public void j()
  {
    p.j();
  }
  
  public class a
    extends D
  {
    public a(M paramM1, M paramM2)
    {
      super();
    }
    
    public M.a j(long paramLong)
    {
      Object localObject = paramM.j(paramLong);
      N localN = a;
      localN = new N(a, b + e.b(e.this));
      localObject = b;
      return new M.a(localN, new N(a, b + e.b(e.this)));
    }
  }
}

/* Location:
 * Qualified Name:     N0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
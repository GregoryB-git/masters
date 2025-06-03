package I0;

import F0.L;
import F0.O;
import F0.r;
import F0.s;
import F0.t;
import g0.z;

public final class a
  implements r
{
  public final z a = new z(4);
  public final O b = new O(-1, -1, "image/avif");
  
  public void a(long paramLong1, long paramLong2)
  {
    b.a(paramLong1, paramLong2);
  }
  
  public void b(t paramt)
  {
    b.b(paramt);
  }
  
  public final boolean c(s params, int paramInt)
  {
    a.P(4);
    byte[] arrayOfByte = a.e();
    boolean bool = false;
    params.n(arrayOfByte, 0, 4);
    if (a.I() == paramInt) {
      bool = true;
    }
    return bool;
  }
  
  public boolean e(s params)
  {
    params.o(4);
    boolean bool;
    if ((c(params, 1718909296)) && (c(params, 1635150182))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int i(s params, L paramL)
  {
    return b.i(params, paramL);
  }
  
  public void release() {}
}

/* Location:
 * Qualified Name:     I0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
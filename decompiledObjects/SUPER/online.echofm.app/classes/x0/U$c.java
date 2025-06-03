package x0;

import A0.y;
import d0.J;
import d0.q;
import g0.M;
import java.util.ArrayList;
import k0.d1;
import k0.y0;

public final class U$c
  implements v
{
  public static final Z q = new Z(new J[] { new J(new q[] { U.D() }) });
  public final long o;
  public final ArrayList p;
  
  public U$c(long paramLong)
  {
    o = paramLong;
    p = new ArrayList();
  }
  
  public final long a(long paramLong)
  {
    return M.q(paramLong, 0L, o);
  }
  
  public boolean b()
  {
    return false;
  }
  
  public long c()
  {
    return Long.MIN_VALUE;
  }
  
  public long d(long paramLong, d1 paramd1)
  {
    return a(paramLong);
  }
  
  public long f()
  {
    return Long.MIN_VALUE;
  }
  
  public boolean g(y0 paramy0)
  {
    return false;
  }
  
  public void h(long paramLong) {}
  
  public long i(y[] paramArrayOfy, boolean[] paramArrayOfBoolean1, Q[] paramArrayOfQ, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    paramLong = a(paramLong);
    for (int i = 0; i < paramArrayOfy.length; i++)
    {
      Object localObject = paramArrayOfQ[i];
      if ((localObject != null) && ((paramArrayOfy[i] == null) || (paramArrayOfBoolean1[i] == 0)))
      {
        p.remove(localObject);
        paramArrayOfQ[i] = null;
      }
      if ((paramArrayOfQ[i] == null) && (paramArrayOfy[i] != null))
      {
        localObject = new U.d(o);
        ((U.d)localObject).b(paramLong);
        p.add(localObject);
        paramArrayOfQ[i] = localObject;
        paramArrayOfBoolean2[i] = true;
      }
    }
    return paramLong;
  }
  
  public long l()
  {
    return -9223372036854775807L;
  }
  
  public Z n()
  {
    return q;
  }
  
  public void p() {}
  
  public void q(long paramLong, boolean paramBoolean) {}
  
  public long s(long paramLong)
  {
    paramLong = a(paramLong);
    for (int i = 0; i < p.size(); i++) {
      ((U.d)p.get(i)).b(paramLong);
    }
    return paramLong;
  }
  
  public void u(v.a parama, long paramLong)
  {
    parama.k(this);
  }
}

/* Location:
 * Qualified Name:     x0.U.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
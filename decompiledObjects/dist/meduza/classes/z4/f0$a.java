package z4;

import java.util.ArrayList;
import r5.h;
import v3.n1;
import v5.e0;

public final class f0$a
  implements r
{
  public static final j0 c = new j0(new i0[] { new i0("", new v3.i0[] { f0.r }) });
  public final long a;
  public final ArrayList<c0> b;
  
  public f0$a(long paramLong)
  {
    a = paramLong;
    b = new ArrayList();
  }
  
  public final long c()
  {
    return Long.MIN_VALUE;
  }
  
  public final boolean d(long paramLong)
  {
    return false;
  }
  
  public final long e(long paramLong, n1 paramn1)
  {
    return e0.j(paramLong, 0L, a);
  }
  
  public final long g()
  {
    return Long.MIN_VALUE;
  }
  
  public final void h(long paramLong) {}
  
  public final long i(h[] paramArrayOfh, boolean[] paramArrayOfBoolean1, c0[] paramArrayOfc0, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    paramLong = e0.j(paramLong, 0L, a);
    for (int i = 0; i < paramArrayOfh.length; i++)
    {
      Object localObject = paramArrayOfc0[i];
      if ((localObject != null) && ((paramArrayOfh[i] == null) || (paramArrayOfBoolean1[i] == 0)))
      {
        b.remove(localObject);
        paramArrayOfc0[i] = null;
      }
      if ((paramArrayOfc0[i] == null) && (paramArrayOfh[i] != null))
      {
        localObject = new f0.b(a);
        ((f0.b)localObject).c(paramLong);
        b.add(localObject);
        paramArrayOfc0[i] = localObject;
        paramArrayOfBoolean2[i] = true;
      }
    }
    return paramLong;
  }
  
  public final boolean isLoading()
  {
    return false;
  }
  
  public final void j() {}
  
  public final long l(long paramLong)
  {
    paramLong = e0.j(paramLong, 0L, a);
    for (int i = 0; i < b.size(); i++) {
      ((f0.b)b.get(i)).c(paramLong);
    }
    return paramLong;
  }
  
  public final void n(r.a parama, long paramLong)
  {
    parama.b(this);
  }
  
  public final long o()
  {
    return -9223372036854775807L;
  }
  
  public final j0 q()
  {
    return c;
  }
  
  public final void s(long paramLong, boolean paramBoolean) {}
}

/* Location:
 * Qualified Name:     z4.f0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
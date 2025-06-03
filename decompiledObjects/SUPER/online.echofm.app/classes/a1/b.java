package a1;

import F0.A;
import F0.B;
import F0.B.a;
import F0.M;
import F0.s;
import F0.y;
import g0.a;
import java.util.Arrays;

public final class b
  extends i
{
  public B n;
  public a o;
  
  public static boolean o(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    if (paramArrayOfByte[0] == -1) {
      bool = true;
    }
    return bool;
  }
  
  public static boolean p(g0.z paramz)
  {
    boolean bool;
    if ((paramz.a() >= 5) && (paramz.G() == 127) && (paramz.I() == 1179402563L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public long f(g0.z paramz)
  {
    if (!o(paramz.e())) {
      return -1L;
    }
    return n(paramz);
  }
  
  public boolean i(g0.z paramz, long paramLong, i.b paramb)
  {
    byte[] arrayOfByte = paramz.e();
    B localB = n;
    if (localB == null)
    {
      localB = new B(arrayOfByte, 17);
      n = localB;
      a = localB.g(Arrays.copyOfRange(arrayOfByte, 9, paramz.g()), null);
      return true;
    }
    if ((arrayOfByte[0] & 0x7F) == 3)
    {
      paramz = F0.z.g(paramz);
      paramb = localB.b(paramz);
      n = paramb;
      o = new a(paramb, paramz);
      return true;
    }
    if (o(arrayOfByte))
    {
      paramz = o;
      if (paramz != null)
      {
        paramz.d(paramLong);
        b = o;
      }
      a.e(a);
      return false;
    }
    return true;
  }
  
  public void l(boolean paramBoolean)
  {
    super.l(paramBoolean);
    if (paramBoolean)
    {
      n = null;
      o = null;
    }
  }
  
  public final int n(g0.z paramz)
  {
    int i = (paramz.e()[2] & 0xFF) >> 4;
    if ((i == 6) || (i == 7))
    {
      paramz.U(4);
      paramz.N();
    }
    i = y.j(paramz, i);
    paramz.T(0);
    return i;
  }
  
  public static final class a
    implements g
  {
    public B a;
    public B.a b;
    public long c;
    public long d;
    
    public a(B paramB, B.a parama)
    {
      a = paramB;
      b = parama;
      c = -1L;
      d = -1L;
    }
    
    public M a()
    {
      boolean bool;
      if (c != -1L) {
        bool = true;
      } else {
        bool = false;
      }
      a.f(bool);
      return new A(a, c);
    }
    
    public void b(long paramLong)
    {
      long[] arrayOfLong = b.a;
      d = arrayOfLong[g0.M.h(arrayOfLong, paramLong, true, true)];
    }
    
    public long c(s params)
    {
      long l = d;
      if (l >= 0L)
      {
        l = -(l + 2L);
        d = -1L;
        return l;
      }
      return -1L;
    }
    
    public void d(long paramLong)
    {
      c = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     a1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
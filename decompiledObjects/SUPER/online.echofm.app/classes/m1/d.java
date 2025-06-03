package m1;

import F0.s;
import android.util.Pair;
import d0.A;
import g0.M;
import g0.a;
import g0.o;
import g0.z;

public abstract class d
{
  public static boolean a(s params)
  {
    z localz = new z(8);
    int i = aa;
    if ((i != 1380533830) && (i != 1380333108)) {
      return false;
    }
    params.n(localz.e(), 0, 4);
    localz.T(0);
    i = localz.p();
    if (i != 1463899717)
    {
      params = new StringBuilder();
      params.append("Unsupported form type: ");
      params.append(i);
      o.c("WavHeaderReader", params.toString());
      return false;
    }
    return true;
  }
  
  public static c b(s params)
  {
    z localz = new z(16);
    Object localObject = d(1718449184, params, localz);
    boolean bool;
    if (b >= 16L) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    params.n(localz.e(), 0, 16);
    localz.T(0);
    int i = localz.y();
    int j = localz.y();
    int k = localz.x();
    int m = localz.x();
    int n = localz.y();
    int i1 = localz.y();
    int i2 = (int)b - 16;
    if (i2 > 0)
    {
      localObject = new byte[i2];
      params.n((byte[])localObject, 0, i2);
    }
    else
    {
      localObject = M.f;
    }
    params.i((int)(params.m() - params.p()));
    return new c(i, j, k, m, n, i1, (byte[])localObject);
  }
  
  public static long c(s params)
  {
    z localz = new z(8);
    a locala = a.a(params, localz);
    if (a != 1685272116)
    {
      params.h();
      return -1L;
    }
    params.o(8);
    localz.T(0);
    params.n(localz.e(), 0, 8);
    long l = localz.u();
    params.i((int)b + 8);
    return l;
  }
  
  public static a d(int paramInt, s params, z paramz)
  {
    a locala;
    for (;;)
    {
      locala = a.a(params, paramz);
      if (a == paramInt) {
        return locala;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Ignoring unknown WAV chunk: ");
      localStringBuilder.append(a);
      o.h("WavHeaderReader", localStringBuilder.toString());
      long l1 = b;
      long l2 = 8L + l1;
      if (l1 % 2L != 0L) {
        l2 = 9L + l1;
      }
      if (l2 > 2147483647L) {
        break;
      }
      params.i((int)l2);
    }
    params = new StringBuilder();
    params.append("Chunk is too large (~2GB+) to skip; id: ");
    params.append(a);
    throw A.d(params.toString());
    return locala;
  }
  
  public static Pair e(s params)
  {
    params.h();
    a locala = d(1684108385, params, new z(8));
    params.i(8);
    return Pair.create(Long.valueOf(params.p()), Long.valueOf(b));
  }
  
  public static final class a
  {
    public final int a;
    public final long b;
    
    public a(int paramInt, long paramLong)
    {
      a = paramInt;
      b = paramLong;
    }
    
    public static a a(s params, z paramz)
    {
      params.n(paramz.e(), 0, 8);
      paramz.T(0);
      return new a(paramz.p(), paramz.w());
    }
  }
}

/* Location:
 * Qualified Name:     m1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
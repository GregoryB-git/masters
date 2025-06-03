package F0;

import R0.a;
import T0.h;
import T0.h.a;
import X2.v;
import d0.A;
import d0.x;
import g0.y;
import java.util.Arrays;
import java.util.List;

public abstract class z
{
  public static boolean a(s params)
  {
    g0.z localz = new g0.z(4);
    byte[] arrayOfByte = localz.e();
    boolean bool = false;
    params.n(arrayOfByte, 0, 4);
    if (localz.I() == 1716281667L) {
      bool = true;
    }
    return bool;
  }
  
  public static int b(s params)
  {
    params.h();
    g0.z localz = new g0.z(2);
    params.n(localz.e(), 0, 2);
    int i = localz.M();
    params.h();
    if (i >> 2 == 16382) {
      return i;
    }
    throw A.a("First frame does not start with sync code.", null);
  }
  
  public static x c(s params, boolean paramBoolean)
  {
    Object localObject1 = null;
    if (paramBoolean) {
      localObject2 = null;
    } else {
      localObject2 = h.b;
    }
    Object localObject2 = new G().a(params, (h.a)localObject2);
    params = (s)localObject1;
    if (localObject2 != null) {
      if (((x)localObject2).e() == 0) {
        params = (s)localObject1;
      } else {
        params = (s)localObject2;
      }
    }
    return params;
  }
  
  public static x d(s params, boolean paramBoolean)
  {
    params.h();
    long l = params.m();
    x localx = c(params, paramBoolean);
    params.i((int)(params.m() - l));
    return localx;
  }
  
  public static boolean e(s params, a parama)
  {
    params.h();
    Object localObject = new y(new byte[4]);
    params.n(a, 0, 4);
    boolean bool = ((y)localObject).g();
    int i = ((y)localObject).h(7);
    int j = ((y)localObject).h(24) + 4;
    if (i == 0) {
      params = h(params);
    }
    for (;;)
    {
      a = params;
      break label182;
      B localB = a;
      if (localB == null) {
        break label184;
      }
      if (i == 3)
      {
        params = localB.b(f(params, j));
      }
      else if (i == 4)
      {
        params = localB.c(j(params, j));
      }
      else
      {
        if (i != 6) {
          break;
        }
        localObject = new g0.z(j);
        params.readFully(((g0.z)localObject).e(), 0, j);
        ((g0.z)localObject).U(4);
        params = localB.a(v.Z(a.a((g0.z)localObject)));
      }
    }
    params.i(j);
    label182:
    return bool;
    label184:
    throw new IllegalArgumentException();
  }
  
  public static B.a f(s params, int paramInt)
  {
    g0.z localz = new g0.z(paramInt);
    params.readFully(localz.e(), 0, paramInt);
    return g(localz);
  }
  
  public static B.a g(g0.z paramz)
  {
    paramz.U(1);
    int i = paramz.J();
    long l1 = paramz.f();
    long l2 = i;
    int j = i / 18;
    long[] arrayOfLong1 = new long[j];
    long[] arrayOfLong2 = new long[j];
    long[] arrayOfLong3;
    long[] arrayOfLong4;
    for (i = 0;; i++)
    {
      arrayOfLong3 = arrayOfLong1;
      arrayOfLong4 = arrayOfLong2;
      if (i >= j) {
        break;
      }
      long l3 = paramz.z();
      if (l3 == -1L)
      {
        arrayOfLong3 = Arrays.copyOf(arrayOfLong1, i);
        arrayOfLong4 = Arrays.copyOf(arrayOfLong2, i);
        break;
      }
      arrayOfLong1[i] = l3;
      arrayOfLong2[i] = paramz.z();
      paramz.U(2);
    }
    paramz.U((int)(l1 + l2 - paramz.f()));
    return new B.a(arrayOfLong3, arrayOfLong4);
  }
  
  public static B h(s params)
  {
    byte[] arrayOfByte = new byte[38];
    params.readFully(arrayOfByte, 0, 38);
    return new B(arrayOfByte, 4);
  }
  
  public static void i(s params)
  {
    g0.z localz = new g0.z(4);
    params.readFully(localz.e(), 0, 4);
    if (localz.I() == 1716281667L) {
      return;
    }
    throw A.a("Failed to read FLAC stream marker.", null);
  }
  
  public static List j(s params, int paramInt)
  {
    g0.z localz = new g0.z(paramInt);
    params.readFully(localz.e(), 0, paramInt);
    localz.U(4);
    return Arrays.asList(kb);
  }
  
  public static final class a
  {
    public B a;
    
    public a(B paramB)
    {
      a = paramB;
    }
  }
}

/* Location:
 * Qualified Name:     F0.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
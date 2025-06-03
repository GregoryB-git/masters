package G0;

import F0.L;
import F0.M.b;
import F0.T;
import F0.i;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import d0.A;
import d0.q.b;
import java.io.EOFException;
import java.util.Arrays;

public final class b
  implements r
{
  public static final x p = new a();
  public static final int[] q = { 13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1 };
  public static final int[] r;
  public static final byte[] s = g0.M.r0("#!AMR\n");
  public static final byte[] t = g0.M.r0("#!AMR-WB\n");
  public static final int u = arrayOfInt[8];
  public final byte[] a;
  public final int b;
  public boolean c;
  public long d;
  public int e;
  public int f;
  public boolean g;
  public long h;
  public int i;
  public int j;
  public long k;
  public t l;
  public T m;
  public F0.M n;
  public boolean o;
  
  static
  {
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = 18;
    arrayOfInt[1] = 24;
    arrayOfInt[2] = 33;
    arrayOfInt[3] = 37;
    arrayOfInt[4] = 41;
    arrayOfInt[5] = 47;
    arrayOfInt[6] = 51;
    arrayOfInt[7] = 59;
    arrayOfInt[8] = 61;
    arrayOfInt[9] = 6;
    arrayOfInt[10] = 1;
    arrayOfInt[11] = 1;
    arrayOfInt[12] = 1;
    arrayOfInt[13] = 1;
    arrayOfInt[14] = 1;
    arrayOfInt[15] = 1;
    arrayOfInt;
    r = arrayOfInt;
  }
  
  public b()
  {
    this(0);
  }
  
  public b(int paramInt)
  {
    int i1 = paramInt;
    if ((paramInt & 0x2) != 0) {
      i1 = paramInt | 0x1;
    }
    b = i1;
    a = new byte[1];
    i = -1;
  }
  
  public static int h(int paramInt, long paramLong)
  {
    return (int)(paramInt * 8000000L / paramLong);
  }
  
  public static boolean r(s params, byte[] paramArrayOfByte)
  {
    params.h();
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    params.n(arrayOfByte, 0, paramArrayOfByte.length);
    return Arrays.equals(arrayOfByte, paramArrayOfByte);
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    d = 0L;
    e = 0;
    f = 0;
    if (paramLong1 != 0L)
    {
      F0.M localM = n;
      if ((localM instanceof i))
      {
        k = ((i)localM).b(paramLong1);
        return;
      }
    }
    k = 0L;
  }
  
  public void b(t paramt)
  {
    l = paramt;
    m = paramt.a(0, 1);
    paramt.j();
  }
  
  public boolean e(s params)
  {
    return t(params);
  }
  
  public final void f()
  {
    g0.a.h(m);
    g0.M.i(l);
  }
  
  public int i(s params, L paramL)
  {
    f();
    if ((params.p() == 0L) && (!t(params))) {
      throw A.a("Could not find AMR header.", null);
    }
    p();
    int i1 = u(params);
    q(params.a(), i1);
    return i1;
  }
  
  public final F0.M j(long paramLong, boolean paramBoolean)
  {
    int i1 = h(i, 20000L);
    return new i(paramLong, h, i1, i, paramBoolean);
  }
  
  public final int k(int paramInt)
  {
    if (!m(paramInt))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Illegal AMR ");
      String str;
      if (c) {
        str = "WB";
      } else {
        str = "NB";
      }
      localStringBuilder.append(str);
      localStringBuilder.append(" frame type ");
      localStringBuilder.append(paramInt);
      throw A.a(localStringBuilder.toString(), null);
    }
    if (c) {
      paramInt = r[paramInt];
    } else {
      paramInt = q[paramInt];
    }
    return paramInt;
  }
  
  public final boolean l(int paramInt)
  {
    boolean bool;
    if ((!c) && ((paramInt < 12) || (paramInt > 14))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean m(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= 15) && ((n(paramInt)) || (l(paramInt)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean n(int paramInt)
  {
    boolean bool;
    if ((c) && ((paramInt < 10) || (paramInt > 13))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void p()
  {
    if (!o)
    {
      o = true;
      boolean bool = c;
      String str;
      if (bool) {
        str = "audio/amr-wb";
      } else {
        str = "audio/3gpp";
      }
      int i1;
      if (bool) {
        i1 = 16000;
      } else {
        i1 = 8000;
      }
      m.d(new q.b().o0(str).f0(u).N(1).p0(i1).K());
    }
  }
  
  public final void q(long paramLong, int paramInt)
  {
    if (g) {
      return;
    }
    int i1 = b;
    boolean bool;
    if (((i1 & 0x1) != 0) && (paramLong != -1L))
    {
      int i2 = i;
      if ((i2 == -1) || (i2 == e))
      {
        if ((j < 20) && (paramInt != -1)) {
          return;
        }
        if ((i1 & 0x2) != 0) {
          bool = true;
        } else {
          bool = false;
        }
      }
    }
    for (Object localObject = j(paramLong, bool);; localObject = new M.b(-9223372036854775807L))
    {
      n = ((F0.M)localObject);
      l.e((F0.M)localObject);
      g = true;
      break;
    }
  }
  
  public void release() {}
  
  public final int s(s params)
  {
    params.h();
    params.n(a, 0, 1);
    int i1 = a[0];
    if ((i1 & 0x83) <= 0) {
      return k(i1 >> 3 & 0xF);
    }
    params = new StringBuilder();
    params.append("Invalid padding bits for frame header ");
    params.append(i1);
    throw A.a(params.toString(), null);
  }
  
  public final boolean t(s params)
  {
    byte[] arrayOfByte = s;
    if (r(params, arrayOfByte)) {
      c = false;
    }
    for (int i1 = arrayOfByte.length;; i1 = arrayOfByte.length)
    {
      params.i(i1);
      return true;
      arrayOfByte = t;
      if (!r(params, arrayOfByte)) {
        break;
      }
      c = true;
    }
    return false;
  }
  
  public final int u(s params)
  {
    if (f == 0) {
      try
      {
        i1 = s(params);
        e = i1;
        f = i1;
        if (i == -1)
        {
          h = params.p();
          i = e;
        }
        if (i == e) {
          j += 1;
        }
      }
      catch (EOFException params)
      {
        return -1;
      }
    }
    int i1 = m.f(params, f, true);
    if (i1 == -1) {
      return -1;
    }
    i1 = f - i1;
    f = i1;
    if (i1 > 0) {
      return 0;
    }
    m.b(k + d, 1, e, 0, null);
    d += 20000L;
    return 0;
  }
}

/* Location:
 * Qualified Name:     G0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package l1;

import F0.T;
import F0.t;
import android.util.Pair;
import d0.q;
import d0.q.b;
import g0.a;
import g0.z;
import h0.d;
import java.util.Arrays;
import java.util.Collections;

public final class n
  implements m
{
  public static final double[] q = { 23.976023976023978D, 24.0D, 25.0D, 29.97002997002997D, 30.0D, 50.0D, 59.94005994005994D, 60.0D };
  public String a;
  public T b;
  public final M c;
  public final z d;
  public final w e;
  public final boolean[] f;
  public final a g;
  public long h;
  public boolean i;
  public boolean j;
  public long k;
  public long l;
  public long m;
  public long n;
  public boolean o;
  public boolean p;
  
  public n()
  {
    this(null);
  }
  
  public n(M paramM)
  {
    c = paramM;
    f = new boolean[4];
    g = new a(128);
    if (paramM != null)
    {
      e = new w(178, 128);
      paramM = new z();
    }
    for (;;)
    {
      d = paramM;
      break;
      paramM = null;
      e = null;
    }
    l = -9223372036854775807L;
    n = -9223372036854775807L;
  }
  
  public static Pair f(a parama, String paramString)
  {
    byte[] arrayOfByte = Arrays.copyOf(d, b);
    int i1 = arrayOfByte[4];
    int i2 = arrayOfByte[5];
    int i3 = arrayOfByte[6];
    i1 = (i1 & 0xFF) << 4 | (i2 & 0xFF) >> 4;
    i2 = (i2 & 0xF) << 8 | i3 & 0xFF;
    i3 = (arrayOfByte[7] & 0xF0) >> 4;
    float f1;
    if (i3 != 2) {
      if (i3 != 3)
      {
        if (i3 != 4)
        {
          f1 = 1.0F;
          break label154;
        }
        f1 = i2 * 121;
        i3 = i1 * 100;
      }
    }
    for (;;)
    {
      f1 /= i3;
      break;
      f1 = i2 * 16;
      i3 = i1 * 9;
      continue;
      f1 = i2 * 4;
      i3 = i1 * 3;
    }
    label154:
    q localq = new q.b().a0(paramString).o0("video/mpeg2").v0(i1).Y(i2).k0(f1).b0(Collections.singletonList(arrayOfByte)).K();
    i3 = (arrayOfByte[7] & 0xF) - 1;
    if (i3 >= 0)
    {
      paramString = q;
      if (i3 < paramString.length)
      {
        double d1 = paramString[i3];
        i1 = arrayOfByte[(c + 9)];
        i3 = (i1 & 0x60) >> 5;
        i1 &= 0x1F;
        double d2 = d1;
        if (i3 != i1) {
          d2 = d1 * ((i3 + 1.0D) / (i1 + 1));
        }
        l1 = (1000000.0D / d2);
        break label292;
      }
    }
    long l1 = 0L;
    label292:
    return Pair.create(localq, Long.valueOf(l1));
  }
  
  public void a(z paramz)
  {
    a.h(b);
    int i1 = paramz.f();
    int i2 = paramz.g();
    byte[] arrayOfByte = paramz.e();
    h += paramz.a();
    b.e(paramz, paramz.a());
    for (;;)
    {
      int i3 = d.c(arrayOfByte, i1, i2, f);
      if (i3 == i2)
      {
        if (!j) {
          g.a(arrayOfByte, i1, i2);
        }
        paramz = e;
        if (paramz != null) {
          paramz.a(arrayOfByte, i1, i2);
        }
        return;
      }
      Object localObject = paramz.e();
      int i5 = i3 + 3;
      int i6 = localObject[i5] & 0xFF;
      int i7 = i3 - i1;
      boolean bool1 = j;
      boolean bool2 = false;
      int i8;
      if (!bool1)
      {
        if (i7 > 0) {
          g.a(arrayOfByte, i1, i3);
        }
        if (i7 < 0) {
          i8 = -i7;
        } else {
          i8 = 0;
        }
        if (g.b(i6, i8))
        {
          localObject = f(g, (String)a.e(a));
          b.d((q)first);
          k = ((Long)second).longValue();
          j = true;
        }
      }
      localObject = e;
      if (localObject != null)
      {
        if (i7 > 0)
        {
          ((w)localObject).a(arrayOfByte, i1, i3);
          i1 = 0;
        }
        else
        {
          i1 = -i7;
        }
        if (e.b(i1))
        {
          localObject = e;
          i1 = d.r(d, e);
          ((z)g0.M.i(d)).R(e.d, i1);
          ((M)g0.M.i(c)).a(n, d);
        }
        if ((i6 == 178) && (paramz.e()[(i3 + 2)] == 1)) {
          e.e(i6);
        }
      }
      if ((i6 != 0) && (i6 != 179))
      {
        if (i6 == 184) {
          o = true;
        }
      }
      else
      {
        i1 = i2 - i3;
        if ((p) && (j))
        {
          l1 = n;
          if (l1 != -9223372036854775807L)
          {
            int i4 = o;
            i8 = (int)(h - m);
            b.b(l1, i4, i8 - i1, i1, null);
          }
        }
        if ((i) && (!p)) {
          break label601;
        }
        m = (h - i1);
        long l1 = l;
        if (l1 == -9223372036854775807L)
        {
          l1 = n;
          if (l1 != -9223372036854775807L) {
            l1 += k;
          } else {
            l1 = -9223372036854775807L;
          }
        }
        n = l1;
        o = false;
        l = -9223372036854775807L;
        i = true;
        label601:
        if (i6 == 0) {
          bool2 = true;
        }
        p = bool2;
      }
      i1 = i5;
    }
  }
  
  public void b()
  {
    d.a(f);
    g.c();
    w localw = e;
    if (localw != null) {
      localw.d();
    }
    h = 0L;
    i = false;
    l = -9223372036854775807L;
    n = -9223372036854775807L;
  }
  
  public void c(boolean paramBoolean)
  {
    a.h(b);
    if (paramBoolean)
    {
      int i1 = o;
      int i2 = (int)(h - m);
      b.b(n, i1, i2, 0, null);
    }
  }
  
  public void d(long paramLong, int paramInt)
  {
    l = paramLong;
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    a = paramd.b();
    b = paramt.a(paramd.c(), 2);
    M localM = c;
    if (localM != null) {
      localM.b(paramt, paramd);
    }
  }
  
  public static final class a
  {
    public static final byte[] e = { 0, 0, 1 };
    public boolean a;
    public int b;
    public int c;
    public byte[] d;
    
    public a(int paramInt)
    {
      d = new byte[paramInt];
    }
    
    public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (!a) {
        return;
      }
      paramInt2 -= paramInt1;
      byte[] arrayOfByte = d;
      int i = arrayOfByte.length;
      int j = b;
      if (i < j + paramInt2) {
        d = Arrays.copyOf(arrayOfByte, (j + paramInt2) * 2);
      }
      System.arraycopy(paramArrayOfByte, paramInt1, d, b, paramInt2);
      b += paramInt2;
    }
    
    public boolean b(int paramInt1, int paramInt2)
    {
      if (a)
      {
        paramInt2 = b - paramInt2;
        b = paramInt2;
        if ((c == 0) && (paramInt1 == 181))
        {
          c = paramInt2;
        }
        else
        {
          a = false;
          return true;
        }
      }
      else if (paramInt1 == 179)
      {
        a = true;
      }
      byte[] arrayOfByte = e;
      a(arrayOfByte, 0, arrayOfByte.length);
      return false;
    }
    
    public void c()
    {
      a = false;
      b = 0;
      c = 0;
    }
  }
}

/* Location:
 * Qualified Name:     l1.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package l1;

import F0.T;
import F0.t;
import d0.q;
import d0.q.b;
import g0.a;
import g0.y;
import g0.z;
import h0.d;
import java.util.Arrays;
import java.util.Collections;

public final class o
  implements m
{
  public static final float[] l = { 1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 1.0F };
  public final M a;
  public final z b;
  public final boolean[] c;
  public final a d;
  public final w e;
  public b f;
  public long g;
  public String h;
  public T i;
  public boolean j;
  public long k;
  
  public o(M paramM)
  {
    a = paramM;
    c = new boolean[4];
    d = new a(128);
    k = -9223372036854775807L;
    if (paramM != null)
    {
      e = new w(178, 128);
      paramM = new z();
    }
    for (;;)
    {
      b = paramM;
      break;
      paramM = null;
      e = null;
    }
  }
  
  public static q f(a parama, int paramInt, String paramString)
  {
    byte[] arrayOfByte = Arrays.copyOf(e, c);
    y localy = new y(arrayOfByte);
    localy.s(paramInt);
    localy.s(4);
    localy.q();
    localy.r(8);
    if (localy.g())
    {
      localy.r(4);
      localy.r(3);
    }
    paramInt = localy.h(4);
    float f1 = 1.0F;
    if (paramInt == 15)
    {
      m = localy.h(8);
      paramInt = localy.h(8);
      if (paramInt != 0)
      {
        f1 = m / paramInt;
        break label142;
      }
    }
    else
    {
      parama = l;
      if (paramInt < parama.length)
      {
        f1 = parama[paramInt];
        break label142;
      }
    }
    g0.o.h("H263Reader", "Invalid aspect ratio");
    label142:
    if (localy.g())
    {
      localy.r(2);
      localy.r(1);
      if (localy.g())
      {
        localy.r(15);
        localy.q();
        localy.r(15);
        localy.q();
        localy.r(15);
        localy.q();
        localy.r(3);
        localy.r(11);
        localy.q();
        localy.r(15);
        localy.q();
      }
    }
    if (localy.h(2) != 0) {
      g0.o.h("H263Reader", "Unhandled video object layer shape");
    }
    localy.q();
    paramInt = localy.h(16);
    localy.q();
    if (localy.g()) {
      if (paramInt == 0)
      {
        g0.o.h("H263Reader", "Invalid vop_increment_time_resolution");
      }
      else
      {
        paramInt--;
        m = 0;
        while (paramInt > 0)
        {
          m++;
          paramInt >>= 1;
        }
        localy.r(m);
      }
    }
    localy.q();
    int m = localy.h(13);
    localy.q();
    paramInt = localy.h(13);
    localy.q();
    localy.q();
    return new q.b().a0(paramString).o0("video/mp4v-es").v0(m).Y(paramInt).k0(f1).b0(Collections.singletonList(arrayOfByte)).K();
  }
  
  public void a(z paramz)
  {
    a.h(f);
    a.h(i);
    int m = paramz.f();
    int n = paramz.g();
    byte[] arrayOfByte = paramz.e();
    g += paramz.a();
    i.e(paramz, paramz.a());
    for (;;)
    {
      int i1 = d.c(arrayOfByte, m, n, c);
      if (i1 == n)
      {
        if (!j) {
          d.a(arrayOfByte, m, n);
        }
        f.a(arrayOfByte, m, n);
        paramz = e;
        if (paramz != null) {
          paramz.a(arrayOfByte, m, n);
        }
        return;
      }
      Object localObject = paramz.e();
      int i2 = i1 + 3;
      int i3 = localObject[i2] & 0xFF;
      int i4 = i1 - m;
      boolean bool = j;
      int i5 = 0;
      if (!bool)
      {
        if (i4 > 0) {
          d.a(arrayOfByte, m, i1);
        }
        int i6;
        if (i4 < 0) {
          i6 = -i4;
        } else {
          i6 = 0;
        }
        if (d.b(i3, i6))
        {
          localObject = i;
          a locala = d;
          ((T)localObject).d(f(locala, d, (String)a.e(h)));
          j = true;
        }
      }
      f.a(arrayOfByte, m, i1);
      localObject = e;
      if (localObject != null)
      {
        if (i4 > 0)
        {
          ((w)localObject).a(arrayOfByte, m, i1);
          m = i5;
        }
        else
        {
          m = -i4;
        }
        if (e.b(m))
        {
          localObject = e;
          m = d.r(d, e);
          ((z)g0.M.i(b)).R(e.d, m);
          ((M)g0.M.i(a)).a(k, b);
        }
        if ((i3 == 178) && (paramz.e()[(i1 + 2)] == 1)) {
          e.e(i3);
        }
      }
      m = n - i1;
      long l1 = g;
      long l2 = m;
      f.b(l1 - l2, m, j);
      f.c(i3, k);
      m = i2;
    }
  }
  
  public void b()
  {
    d.a(c);
    d.c();
    Object localObject = f;
    if (localObject != null) {
      ((b)localObject).d();
    }
    localObject = e;
    if (localObject != null) {
      ((w)localObject).d();
    }
    g = 0L;
    k = -9223372036854775807L;
  }
  
  public void c(boolean paramBoolean)
  {
    a.h(f);
    if (paramBoolean)
    {
      f.b(g, 0, j);
      f.d();
    }
  }
  
  public void d(long paramLong, int paramInt)
  {
    k = paramLong;
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    h = paramd.b();
    Object localObject = paramt.a(paramd.c(), 2);
    i = ((T)localObject);
    f = new b((T)localObject);
    localObject = a;
    if (localObject != null) {
      ((M)localObject).b(paramt, paramd);
    }
  }
  
  public static final class a
  {
    public static final byte[] f = { 0, 0, 1 };
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e;
    
    public a(int paramInt)
    {
      e = new byte[paramInt];
    }
    
    public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (!a) {
        return;
      }
      paramInt2 -= paramInt1;
      byte[] arrayOfByte = e;
      int i = arrayOfByte.length;
      int j = c;
      if (i < j + paramInt2) {
        e = Arrays.copyOf(arrayOfByte, (j + paramInt2) * 2);
      }
      System.arraycopy(paramArrayOfByte, paramInt1, e, c, paramInt2);
      c += paramInt2;
    }
    
    public boolean b(int paramInt1, int paramInt2)
    {
      int i = b;
      if (i != 0)
      {
        int j = 2;
        if (i != 1) {
          if (i != 2)
          {
            j = 4;
            if (i != 3)
            {
              if (i == 4)
              {
                if ((paramInt1 != 179) && (paramInt1 != 181)) {
                  break label164;
                }
                c -= paramInt2;
                a = false;
                return true;
              }
              throw new IllegalStateException();
            }
            if ((paramInt1 & 0xF0) == 32) {}
          }
        }
        for (;;)
        {
          g0.o.h("H263Reader", "Unexpected start code value");
          c();
          break;
          d = c;
          paramInt2 = j;
          do
          {
            b = paramInt2;
            break label164;
            if (paramInt1 > 31) {
              break;
            }
            b = 3;
            break label164;
            paramInt2 = j;
          } while (paramInt1 == 181);
        }
      }
      else if (paramInt1 == 176)
      {
        b = 1;
        a = true;
      }
      label164:
      byte[] arrayOfByte = f;
      a(arrayOfByte, 0, arrayOfByte.length);
      return false;
    }
    
    public void c()
    {
      a = false;
      c = 0;
      b = 0;
    }
  }
  
  public static final class b
  {
    public final T a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;
    
    public b(T paramT)
    {
      a = paramT;
    }
    
    public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (c)
      {
        int i = f;
        int j = paramInt1 + 1 - i;
        if (j < paramInt2)
        {
          boolean bool;
          if ((paramArrayOfByte[j] & 0xC0) >> 6 == 0) {
            bool = true;
          } else {
            bool = false;
          }
          d = bool;
          c = false;
        }
        else
        {
          f = (i + (paramInt2 - paramInt1));
        }
      }
    }
    
    public void b(long paramLong, int paramInt, boolean paramBoolean)
    {
      boolean bool;
      if (h != -9223372036854775807L) {
        bool = true;
      } else {
        bool = false;
      }
      a.f(bool);
      if ((e == 182) && (paramBoolean) && (b))
      {
        int i = (int)(paramLong - g);
        int j = d;
        a.b(h, j, i, paramInt, null);
      }
      if (e != 179) {
        g = paramLong;
      }
    }
    
    public void c(int paramInt, long paramLong)
    {
      e = paramInt;
      d = false;
      boolean bool1 = true;
      boolean bool2;
      if ((paramInt != 182) && (paramInt != 179)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      b = bool2;
      if (paramInt == 182) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      c = bool2;
      f = 0;
      h = paramLong;
    }
    
    public void d()
    {
      b = false;
      c = false;
      d = false;
      e = -1;
    }
  }
}

/* Location:
 * Qualified Name:     l1.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
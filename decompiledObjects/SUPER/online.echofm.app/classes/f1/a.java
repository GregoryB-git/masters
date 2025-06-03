package f1;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import c1.e;
import c1.t;
import c1.t.b;
import f0.a.b;
import g0.M;
import g0.g;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

public final class a
  implements t
{
  public final z a = new z();
  public final z b = new z();
  public final a c = new a();
  public Inflater d;
  
  public static f0.a f(z paramz, a parama)
  {
    int i = paramz.g();
    int j = paramz.G();
    int k = paramz.M();
    int m = paramz.f() + k;
    f0.a locala = null;
    if (m > i)
    {
      paramz.T(i);
      return null;
    }
    if (j != 128)
    {
      switch (j)
      {
      default: 
        parama = locala;
        break;
      case 22: 
        a.c(parama, paramz, k);
        parama = locala;
        break;
      case 21: 
        a.b(parama, paramz, k);
        parama = locala;
        break;
      case 20: 
        a.a(parama, paramz, k);
        parama = locala;
        break;
      }
    }
    else
    {
      locala = parama.d();
      parama.h();
      parama = locala;
    }
    paramz.T(m);
    return parama;
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, t.b paramb, g paramg)
  {
    a.R(paramArrayOfByte, paramInt2 + paramInt1);
    a.T(paramInt1);
    e(a);
    c.h();
    paramArrayOfByte = new ArrayList();
    while (a.a() >= 3)
    {
      paramb = f(a, c);
      if (paramb != null) {
        paramArrayOfByte.add(paramb);
      }
    }
    paramg.accept(new e(paramArrayOfByte, -9223372036854775807L, -9223372036854775807L));
  }
  
  public int d()
  {
    return 2;
  }
  
  public final void e(z paramz)
  {
    if ((paramz.a() > 0) && (paramz.j() == 120))
    {
      if (d == null) {
        d = new Inflater();
      }
      if (M.v0(paramz, b, d)) {
        paramz.R(b.e(), b.g());
      }
    }
  }
  
  public static final class a
  {
    public final z a = new z();
    public final int[] b = new int['Ā'];
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    
    public f0.a d()
    {
      if ((d != 0) && (e != 0) && (h != 0) && (i != 0) && (a.g() != 0) && (a.f() == a.g()) && (c))
      {
        a.T(0);
        int j = h * i;
        Object localObject = new int[j];
        int k = 0;
        if (k < j)
        {
          int m = a.G();
          int n;
          if (m != 0)
          {
            n = k + 1;
            localObject[k] = b[m];
          }
          for (k = n;; k = n)
          {
            break;
            m = a.G();
            if (m == 0) {
              break;
            }
            if ((m & 0x40) == 0) {
              n = m & 0x3F;
            } else {
              n = (m & 0x3F) << 8 | a.G();
            }
            if ((m & 0x80) == 0) {
              m = b[0];
            } else {
              m = b[a.G()];
            }
            n += k;
            Arrays.fill((int[])localObject, k, n, m);
          }
        }
        localObject = Bitmap.createBitmap((int[])localObject, h, i, Bitmap.Config.ARGB_8888);
        return new a.b().f((Bitmap)localObject).k(f / d).l(0).h(g / e, 0).i(0).n(h / d).g(i / e).a();
      }
      return null;
    }
    
    public final void e(z paramz, int paramInt)
    {
      if (paramInt < 4) {
        return;
      }
      paramz.U(3);
      if ((paramz.G() & 0x80) != 0) {
        j = 1;
      } else {
        j = 0;
      }
      int k = paramInt - 4;
      int m = k;
      if (j != 0)
      {
        if (k < 7) {
          return;
        }
        m = paramz.J();
        if (m < 4) {
          return;
        }
        h = paramz.M();
        i = paramz.M();
        a.P(m - 4);
        m = paramInt - 11;
      }
      paramInt = a.f();
      int j = a.g();
      if ((paramInt < j) && (m > 0))
      {
        m = Math.min(m, j - paramInt);
        paramz.l(a.e(), paramInt, m);
        a.T(paramInt + m);
      }
    }
    
    public final void f(z paramz, int paramInt)
    {
      if (paramInt < 19) {
        return;
      }
      d = paramz.M();
      e = paramz.M();
      paramz.U(11);
      f = paramz.M();
      g = paramz.M();
    }
    
    public final void g(z paramz, int paramInt)
    {
      if (paramInt % 5 != 2) {
        return;
      }
      paramz.U(2);
      Arrays.fill(b, 0);
      int j = paramInt / 5;
      for (paramInt = 0; paramInt < j; paramInt++)
      {
        int k = paramz.G();
        int m = paramz.G();
        int n = paramz.G();
        int i1 = paramz.G();
        int i2 = paramz.G();
        double d1 = m;
        double d2 = n - 128;
        n = (int)(1.402D * d2 + d1);
        double d3 = i1 - 128;
        i1 = (int)(d1 - 0.34414D * d3 - d2 * 0.71414D);
        m = (int)(d1 + d3 * 1.772D);
        int[] arrayOfInt = b;
        n = M.p(n, 0, 255);
        arrayOfInt[k] = (M.p(i1, 0, 255) << 8 | i2 << 24 | n << 16 | M.p(m, 0, 255));
      }
      c = true;
    }
    
    public void h()
    {
      d = 0;
      e = 0;
      f = 0;
      g = 0;
      h = 0;
      i = 0;
      a.P(0);
      c = false;
    }
  }
}

/* Location:
 * Qualified Name:     f1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
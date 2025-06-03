package hb;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import jb.c;

public final class p
{
  public final c a;
  public final c b;
  public int c;
  public final b d;
  
  public p(c paramc, b paramb)
  {
    x6.b.y(paramc, "transport");
    a = paramc;
    b = paramb;
    c = 65535;
    d = new b(0, 65535, null);
  }
  
  public final void a(boolean paramBoolean1, b paramb, xc.f paramf, boolean paramBoolean2)
  {
    x6.b.y(paramf, "source");
    int i = paramb.b();
    int j;
    if (a.b > 0L) {
      j = 1;
    } else {
      j = 0;
    }
    int k = (int)b;
    if ((j == 0) && (i >= k))
    {
      paramb.c(k, paramf, paramBoolean1);
    }
    else
    {
      if ((j == 0) && (i > 0)) {
        paramb.c(i, paramf, false);
      }
      j = (int)b;
      a.g0(paramf, j);
      f = (paramBoolean1 | f);
    }
    if (paramBoolean2) {
      try
      {
        b.flush();
      }
      catch (IOException paramb)
      {
        throw new RuntimeException(paramb);
      }
    }
  }
  
  public final boolean b(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = paramInt - c;
      c = paramInt;
      b[] arrayOfb = a.b();
      int j = arrayOfb.length;
      boolean bool = false;
      for (paramInt = 0; paramInt < j; paramInt++) {
        arrayOfb[paramInt].a(i);
      }
      if (i > 0) {
        bool = true;
      }
      return bool;
    }
    throw new IllegalArgumentException(f.h("Invalid initial window size: ", paramInt));
  }
  
  public final void c(b paramb, int paramInt)
  {
    if (paramb == null)
    {
      d.a(paramInt);
      d();
    }
    else
    {
      paramb.a(paramInt);
      int i = paramb.b();
      int j = Math.min(i, paramb.b());
      int k = 0;
      paramInt = 0;
      int m = paramInt;
      for (;;)
      {
        xc.f localf = a;
        long l = b;
        int n;
        if (l > 0L) {
          n = 1;
        } else {
          n = 0;
        }
        if ((n == 0) || (j <= 0)) {
          break;
        }
        if (j >= l)
        {
          j = (int)l;
          paramInt += j;
          paramb.c(j, localf, f);
        }
        else
        {
          paramInt += j;
          paramb.c(j, localf, false);
        }
        m++;
        j = Math.min(i - paramInt, paramb.b());
      }
      paramInt = k;
      if (m > 0) {
        paramInt = 1;
      }
      if (paramInt != 0) {
        try
        {
          b.flush();
        }
        catch (IOException paramb)
        {
          throw new RuntimeException(paramb);
        }
      }
    }
  }
  
  public final void d()
  {
    b[] arrayOfb1 = a.b();
    Collections.shuffle(Arrays.asList(arrayOfb1));
    int i = d.c;
    int k;
    Object localObject;
    int i2;
    for (int j = arrayOfb1.length;; j = n)
    {
      k = 0;
      if ((j <= 0) || (i <= 0)) {
        break;
      }
      m = (int)Math.ceil(i / j);
      n = 0;
      i1 = n;
      while ((i1 < j) && (i > 0))
      {
        localObject = arrayOfb1[i1];
        k = Math.min(i, Math.min(Math.max(0, Math.min(c, (int)a.b)) - d, m));
        i2 = i;
        if (k > 0)
        {
          d += k;
          i2 = i - k;
        }
        k = n;
        if (Math.max(0, Math.min(c, (int)a.b)) - d > 0)
        {
          arrayOfb1[n] = localObject;
          k = n + 1;
        }
        i1++;
        i = i2;
        n = k;
      }
    }
    b[] arrayOfb2 = a.b();
    int m = arrayOfb2.length;
    j = 0;
    int i1 = j;
    while (j < m)
    {
      arrayOfb1 = arrayOfb2[j];
      int i3 = d;
      i = Math.min(i3, arrayOfb1.b());
      n = 0;
      for (;;)
      {
        localObject = a;
        long l = b;
        if (l > 0L) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if ((i2 == 0) || (i <= 0)) {
          break;
        }
        if (i >= l)
        {
          i = (int)l;
          n += i;
          arrayOfb1.c(i, (xc.f)localObject, f);
        }
        else
        {
          n += i;
          arrayOfb1.c(i, (xc.f)localObject, false);
        }
        i1++;
        i = Math.min(i3 - n, arrayOfb1.b());
      }
      d = 0;
      j++;
    }
    int n = k;
    if (i1 > 0) {
      n = 1;
    }
    if (n != 0) {
      try
      {
        b.flush();
      }
      catch (IOException localIOException)
      {
        throw new RuntimeException(localIOException);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(int paramInt);
  }
  
  public final class b
  {
    public final xc.f a = new xc.f();
    public final int b;
    public int c;
    public int d;
    public final p.a e;
    public boolean f = false;
    
    public b(int paramInt1, int paramInt2, h.b paramb)
    {
      b = paramInt1;
      c = paramInt2;
      e = paramb;
    }
    
    public final int a(int paramInt)
    {
      if ((paramInt > 0) && (Integer.MAX_VALUE - paramInt < c))
      {
        StringBuilder localStringBuilder = f.l("Window size overflow for stream: ");
        localStringBuilder.append(b);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      paramInt = c + paramInt;
      c = paramInt;
      return paramInt;
    }
    
    public final int b()
    {
      return Math.min(c, d.c);
    }
    
    public final void c(int paramInt, xc.f paramf, boolean paramBoolean)
    {
      for (;;)
      {
        int i = Math.min(paramInt, b.t0());
        b localb = d;
        int j = -i;
        localb.a(j);
        a(j);
        try
        {
          boolean bool;
          if ((b == i) && (paramBoolean)) {
            bool = true;
          } else {
            bool = false;
          }
          b.u(bool, b, paramf, i);
          e.b(i);
          i = paramInt - i;
          paramInt = i;
          if (i > 0) {
            continue;
          }
          return;
        }
        catch (IOException paramf)
        {
          throw new RuntimeException(paramf);
        }
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract p.b[] b();
  }
}

/* Location:
 * Qualified Name:     hb.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package m4;

import c4.j;
import v5.c0;
import v5.e0;
import v5.u;

public final class y
  implements d0
{
  public final x a;
  public final u b;
  public int c;
  public int d;
  public boolean e;
  public boolean f;
  
  public y(x paramx)
  {
    a = paramx;
    b = new u(32);
  }
  
  public final void a(int paramInt, u paramu)
  {
    if ((paramInt & 0x1) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    int i;
    if (paramInt != 0)
    {
      i = paramu.v();
      i = b + i;
    }
    else
    {
      i = -1;
    }
    if (f)
    {
      if (paramInt == 0) {
        return;
      }
      f = false;
      paramu.G(i);
    }
    for (;;)
    {
      d = 0;
      int j;
      byte[] arrayOfByte;
      do
      {
        for (;;)
        {
          paramInt = c;
          i = b;
          if (paramInt - i <= 0) {
            return;
          }
          j = d;
          if (j >= 3) {
            break;
          }
          if (j == 0)
          {
            paramInt = paramu.v();
            paramu.G(b - 1);
            if (paramInt == 255)
            {
              f = true;
              return;
            }
          }
          paramInt = Math.min(c - b, 3 - d);
          paramu.d(b.a, d, paramInt);
          paramInt = d + paramInt;
          d = paramInt;
          if (paramInt == 3)
          {
            b.G(0);
            b.F(3);
            b.H(1);
            i = b.v();
            paramInt = b.v();
            boolean bool;
            if ((i & 0x80) != 0) {
              bool = true;
            } else {
              bool = false;
            }
            e = bool;
            paramInt = ((i & 0xF) << 8 | paramInt) + 3;
            c = paramInt;
            arrayOfByte = b.a;
            if (arrayOfByte.length < paramInt)
            {
              paramInt = Math.min(4098, Math.max(paramInt, arrayOfByte.length * 2));
              b.a(paramInt);
            }
          }
        }
        paramInt = Math.min(paramInt - i, c - j);
        paramu.d(b.a, d, paramInt);
        paramInt = d + paramInt;
        d = paramInt;
        j = c;
      } while (paramInt != j);
      if (e)
      {
        arrayOfByte = b.a;
        i = 0;
        paramInt = -1;
        while (i < j)
        {
          paramInt = e0.n[((paramInt >>> 24 ^ arrayOfByte[i] & 0xFF) & 0xFF)] ^ paramInt << 8;
          i++;
        }
        i = e0.a;
        if (paramInt != 0)
        {
          f = true;
          return;
        }
        b.F(c - 4);
      }
      else
      {
        b.F(j);
      }
      b.G(0);
      a.a(b);
    }
  }
  
  public final void b()
  {
    f = true;
  }
  
  public final void c(c0 paramc0, j paramj, d0.d paramd)
  {
    a.c(paramc0, paramj, paramd);
    f = true;
  }
}

/* Location:
 * Qualified Name:     m4.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
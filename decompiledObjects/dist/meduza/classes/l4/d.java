package l4;

import c4.i;
import java.io.EOFException;
import v5.u;

public final class d
{
  public final e a = new e();
  public final u b = new u(new byte[65025], 0);
  public int c = -1;
  public int d;
  public boolean e;
  
  public final boolean a(i parami)
  {
    if (e)
    {
      e = false;
      b.D(0);
    }
    for (;;)
    {
      boolean bool1 = e;
      boolean bool2 = true;
      if (bool1) {
        break;
      }
      int k;
      int m;
      int n;
      if (c < 0) {
        if ((a.b(parami, -1L)) && (a.a(parami, true)))
        {
          Object localObject1 = a;
          i = d;
          if (((a & 0x1) == 1) && (b.c == 0))
          {
            d = 0;
            j = 0;
            do
            {
              k = d;
              m = 0 + k;
              localObject1 = a;
              n = j;
              if (m >= c) {
                break;
              }
              localObject1 = f;
              d = (k + 1);
              k = localObject1[m];
              n = j + k;
              j = n;
            } while (k == 255);
            n = i + n;
            j = d + 0;
          }
          else
          {
            j = 0;
            n = i;
          }
          try
          {
            parami.j(n);
            n = 1;
          }
          catch (EOFException localEOFException1)
          {
            n = 0;
          }
          if (n == 0) {
            return false;
          }
          c = j;
        }
        else
        {
          return false;
        }
      }
      int i = c;
      d = 0;
      int j = 0;
      Object localObject2;
      do
      {
        m = d;
        k = i + m;
        localObject2 = a;
        n = j;
        if (k >= c) {
          break;
        }
        localObject2 = f;
        d = (m + 1);
        k = localObject2[k];
        n = j + k;
        j = n;
      } while (k == 255);
      i = c + d;
      if (n > 0)
      {
        localObject2 = b;
        ((u)localObject2).a(c + n);
        u localu2 = b;
        localObject2 = a;
        j = c;
        try
        {
          parami.readFully((byte[])localObject2, j, n);
          j = 1;
        }
        catch (EOFException localEOFException2)
        {
          j = 0;
        }
        if (j == 0) {
          return false;
        }
        u localu1 = b;
        localu1.F(c + n);
        if (a.f[(i - 1)] == 255) {
          bool2 = false;
        }
        e = bool2;
      }
      j = i;
      if (i == a.c) {
        j = -1;
      }
      c = j;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     l4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
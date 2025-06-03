package l4;

import c4.i;
import java.io.EOFException;
import v3.a1;
import v5.u;
import x6.b;

public final class e
{
  public int a;
  public long b;
  public int c;
  public int d;
  public int e;
  public final int[] f = new int['ÿ'];
  public final u g = new u(255);
  
  public final boolean a(i parami, boolean paramBoolean)
  {
    int i = 0;
    a = 0;
    b = 0L;
    c = 0;
    d = 0;
    e = 0;
    g.D(27);
    byte[] arrayOfByte1 = g.a;
    try
    {
      bool = parami.c(arrayOfByte1, 0, 27, paramBoolean);
    }
    catch (EOFException localEOFException)
    {
      if (!paramBoolean) {
        break label290;
      }
    }
    boolean bool = false;
    byte[] arrayOfByte2;
    if ((bool) && (g.w() == 1332176723L))
    {
      if (g.v() != 0)
      {
        if (paramBoolean) {
          return false;
        }
        throw a1.c("unsupported bit stream revision");
      }
      a = g.v();
      b = g.j();
      g.l();
      g.l();
      g.l();
      int j = g.v();
      c = j;
      d = (j + 27);
      g.D(j);
      arrayOfByte2 = g.a;
      j = c;
      try
      {
        bool = parami.c(arrayOfByte2, 0, j, paramBoolean);
        paramBoolean = bool;
      }
      catch (EOFException parami)
      {
        if (!paramBoolean) {
          break label286;
        }
      }
      paramBoolean = false;
      if (!paramBoolean) {
        return false;
      }
      while (i < c)
      {
        f[i] = g.v();
        e += f[i];
        i++;
      }
      return true;
      label286:
      throw parami;
    }
    return false;
    label290:
    throw arrayOfByte2;
  }
  
  public final boolean b(i parami, long paramLong)
  {
    boolean bool1;
    if (parami.getPosition() == parami.d()) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    b.q(bool1);
    g.D(4);
    boolean bool2;
    for (;;)
    {
      bool2 = paramLong < -1L;
      if ((bool2) && (parami.getPosition() + 4L >= paramLong)) {
        break;
      }
      byte[] arrayOfByte = g.a;
      try
      {
        bool1 = parami.c(arrayOfByte, 0, 4, true);
      }
      catch (EOFException localEOFException)
      {
        bool1 = false;
      }
      if (!bool1) {
        break;
      }
      g.G(0);
      if (g.w() == 1332176723L)
      {
        parami.i();
        return true;
      }
      parami.j(1);
    }
    while (((!bool2) || (parami.getPosition() < paramLong)) && (parami.n() != -1)) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     l4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
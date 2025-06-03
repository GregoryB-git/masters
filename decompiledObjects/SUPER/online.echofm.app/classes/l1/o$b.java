package l1;

import F0.T;
import g0.a;

public final class o$b
{
  public final T a;
  public boolean b;
  public boolean c;
  public boolean d;
  public int e;
  public int f;
  public long g;
  public long h;
  
  public o$b(T paramT)
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

/* Location:
 * Qualified Name:     l1.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
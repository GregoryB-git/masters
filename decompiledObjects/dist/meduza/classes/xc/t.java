package xc;

import ec.i;
import sb.j;

public final class t
{
  public final byte[] a;
  public int b;
  public int c;
  public boolean d;
  public boolean e;
  public t f;
  public t g;
  
  public t()
  {
    a = new byte[' '];
    e = true;
    d = false;
  }
  
  public t(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramArrayOfByte;
    b = paramInt1;
    c = paramInt2;
    d = paramBoolean1;
    e = paramBoolean2;
  }
  
  public final t a()
  {
    t localt1 = f;
    if (localt1 == this) {
      localt1 = null;
    }
    t localt2 = g;
    i.b(localt2);
    f = f;
    localt2 = f;
    i.b(localt2);
    g = g;
    f = null;
    g = null;
    return localt1;
  }
  
  public final void b(t paramt)
  {
    g = this;
    f = f;
    t localt = f;
    i.b(localt);
    g = paramt;
    f = paramt;
  }
  
  public final t c()
  {
    d = true;
    return new t(a, b, c, true, false);
  }
  
  public final void d(t paramt, int paramInt)
  {
    if (e)
    {
      int i = c;
      int j = i + paramInt;
      if (j > 8192) {
        if (!d)
        {
          k = b;
          if (j - k <= 8192)
          {
            arrayOfByte1 = a;
            j.k(arrayOfByte1, 0, arrayOfByte1, k, i);
            c -= b;
            b = 0;
          }
          else
          {
            throw new IllegalArgumentException();
          }
        }
        else
        {
          throw new IllegalArgumentException();
        }
      }
      byte[] arrayOfByte1 = a;
      byte[] arrayOfByte2 = a;
      j = c;
      int k = b;
      j.k(arrayOfByte1, j, arrayOfByte2, k, k + paramInt);
      c += paramInt;
      b += paramInt;
      return;
    }
    throw new IllegalStateException("only owner can write".toString());
  }
}

/* Location:
 * Qualified Name:     xc.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
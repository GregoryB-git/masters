package c4;

public final class w
{
  public final byte[] a = new byte[10];
  public boolean b;
  public int c;
  public long d;
  public int e;
  public int f;
  public int g;
  
  public final void a(v paramv, v.a parama)
  {
    if (c > 0)
    {
      paramv.c(d, e, f, g, parama);
      c = 0;
    }
  }
  
  public final void b(v paramv, long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama)
  {
    int i;
    if (g <= paramInt2 + paramInt3) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (!b) {
        return;
      }
      int j = c;
      i = j + 1;
      c = i;
      if (j == 0)
      {
        d = paramLong;
        e = paramInt1;
        f = 0;
      }
      f += paramInt2;
      g = paramInt3;
      if (i >= 16) {
        a(paramv, parama);
      }
      return;
    }
    throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
  }
  
  public final void c(i parami)
  {
    if (b) {
      return;
    }
    byte[] arrayOfByte = a;
    int i = 0;
    int j = 0;
    parami.m(arrayOfByte, 0, 10);
    parami.i();
    parami = a;
    int k = i;
    if (parami[4] == -8)
    {
      k = i;
      if (parami[5] == 114)
      {
        k = i;
        if (parami[6] == 111)
        {
          int m = parami[7];
          if ((m & 0xFE) != 186)
          {
            k = i;
          }
          else
          {
            k = j;
            if ((m & 0xFF) == 187) {
              k = 1;
            }
            if (k != 0) {
              k = 9;
            } else {
              k = 8;
            }
            k = 40 << (parami[k] >> 4 & 0x7);
          }
        }
      }
    }
    if (k == 0) {
      return;
    }
    b = true;
  }
}

/* Location:
 * Qualified Name:     c4.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
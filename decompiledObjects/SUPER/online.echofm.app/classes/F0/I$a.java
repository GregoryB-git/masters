package F0;

public final class I$a
{
  public int a;
  public String b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  
  public I$a() {}
  
  public I$a(a parama)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    f = f;
    g = g;
  }
  
  public boolean a(int paramInt)
  {
    if (!I.a(paramInt)) {
      return false;
    }
    int i = paramInt >>> 19 & 0x3;
    if (i == 1) {
      return false;
    }
    int j = paramInt >>> 17 & 0x3;
    if (j == 0) {
      return false;
    }
    int k = paramInt >>> 12 & 0xF;
    if ((k != 0) && (k != 15))
    {
      int m = paramInt >>> 10 & 0x3;
      if (m == 3) {
        return false;
      }
      a = i;
      b = I.b()[(3 - j)];
      m = I.c()[m];
      d = m;
      int n = 2;
      if (i == 2) {
        m /= 2;
      }
      for (;;)
      {
        d = m;
        break;
        if (i != 0) {
          break;
        }
        m /= 4;
      }
      int i1 = paramInt >>> 9 & 0x1;
      g = I.d(i, j);
      if (j == 3)
      {
        if (i == 3) {
          m = I.e()[(k - 1)];
        } else {
          m = I.f()[(k - 1)];
        }
        f = m;
      }
      for (m = (m * 12 / d + i1) * 4;; m = m * 144 / d + i1)
      {
        c = m;
        break label326;
        m = 144;
        if (i != 3) {
          break;
        }
        if (j == 2) {
          m = I.g()[(k - 1)];
        } else {
          m = I.h()[(k - 1)];
        }
        f = m;
      }
      i = I.i()[(k - 1)];
      f = i;
      if (j == 1) {
        m = 72;
      }
      c = (m * i / d + i1);
      label326:
      m = n;
      if ((paramInt >> 6 & 0x3) == 3) {
        m = 1;
      }
      e = m;
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     F0.I.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
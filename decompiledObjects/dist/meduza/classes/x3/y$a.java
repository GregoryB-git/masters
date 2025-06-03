package x3;

public final class y$a
{
  public int a;
  public String b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  
  public final boolean a(int paramInt)
  {
    int i;
    if ((paramInt & 0xFFE00000) == -2097152) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return false;
    }
    int j = paramInt >>> 19 & 0x3;
    if (j == 1) {
      return false;
    }
    int k = paramInt >>> 17 & 0x3;
    if (k == 0) {
      return false;
    }
    int m = paramInt >>> 12 & 0xF;
    if ((m != 0) && (m != 15))
    {
      i = paramInt >>> 10 & 0x3;
      if (i == 3) {
        return false;
      }
      a = j;
      b = y.a[(3 - k)];
      i = y.b[i];
      d = i;
      int n = 2;
      if (j == 2)
      {
        i /= 2;
      }
      else
      {
        if (j != 0) {
          break label145;
        }
        i /= 4;
      }
      d = i;
      label145:
      int i1 = paramInt >>> 9 & 0x1;
      i = 1152;
      if (k != 1)
      {
        if (k != 2) {
          if (k == 3) {
            i = 384;
          } else {
            throw new IllegalArgumentException();
          }
        }
      }
      else if (j != 3) {
        i = 576;
      }
      g = i;
      if (k == 3)
      {
        if (j == 3) {
          i = y.c[(m - 1)];
        } else {
          i = y.d[(m - 1)];
        }
        f = i;
        i = (i * 12 / d + i1) * 4;
      }
      else
      {
        i = 144;
        if (j != 3) {
          break label325;
        }
        if (k == 2) {
          i = y.e[(m - 1)];
        } else {
          i = y.f[(m - 1)];
        }
        f = i;
        i = i * 144 / d + i1;
      }
      c = i;
      break label366;
      label325:
      m = y.g[(m - 1)];
      f = m;
      if (k == 1) {
        i = 72;
      }
      c = (i * m / d + i1);
      label366:
      i = n;
      if ((paramInt >> 6 & 0x3) == 3) {
        i = 1;
      }
      e = i;
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     x3.y.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
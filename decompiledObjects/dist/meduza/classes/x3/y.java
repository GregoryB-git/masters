package x3;

import a0.j;

public final class y
{
  public static final String[] a = { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
  public static final int[] b = { 44100, 48000, 32000 };
  public static final int[] c = { 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000 };
  public static final int[] d = { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000 };
  public static final int[] e = { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000 };
  public static final int[] f = { 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000 };
  public static final int[] g = { 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000 };
  
  public static int a(int paramInt)
  {
    int i;
    if ((paramInt & 0xFFE00000) == -2097152) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return -1;
    }
    int j = paramInt >>> 19 & 0x3;
    if (j == 1) {
      return -1;
    }
    int k = paramInt >>> 17 & 0x3;
    if (k == 0) {
      return -1;
    }
    int m = paramInt >>> 12 & 0xF;
    if ((m != 0) && (m != 15))
    {
      i = paramInt >>> 10 & 0x3;
      if (i == 3) {
        return -1;
      }
      int n = b[i];
      if (j == 2)
      {
        i = n / 2;
      }
      else
      {
        i = n;
        if (j == 0) {
          i = n / 4;
        }
      }
      int i1 = paramInt >>> 9 & 0x1;
      if (k == 3)
      {
        if (j == 3) {
          paramInt = c[(m - 1)];
        } else {
          paramInt = d[(m - 1)];
        }
        return (paramInt * 12 / i + i1) * 4;
      }
      if (j == 3)
      {
        if (k == 2) {
          paramInt = e[(m - 1)];
        } else {
          paramInt = f[(m - 1)];
        }
      }
      else {
        paramInt = g[(m - 1)];
      }
      n = 144;
      if (j == 3) {
        return j.d(paramInt, 144, i, i1);
      }
      if (k == 1) {
        n = 72;
      }
      return j.d(n, paramInt, i, i1);
    }
    return -1;
  }
  
  public static int b(int paramInt)
  {
    if ((paramInt & 0xFFE00000) == -2097152) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return -1;
    }
    int j = paramInt >>> 19 & 0x3;
    if (j == 1) {
      return -1;
    }
    int i = paramInt >>> 17 & 0x3;
    if (i == 0) {
      return -1;
    }
    int k = paramInt >>> 12 & 0xF;
    if ((k != 0) && (k != 15) && ((paramInt >>> 10 & 0x3) != 3))
    {
      paramInt = 1152;
      if (i != 1)
      {
        if (i != 2) {
          if (i == 3) {
            paramInt = 384;
          } else {
            throw new IllegalArgumentException();
          }
        }
      }
      else if (j != 3) {
        paramInt = 576;
      }
      return paramInt;
    }
    return -1;
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     x3.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
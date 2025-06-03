package F0;

public abstract class I
{
  public static final String[] a = { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
  public static final int[] b = { 44100, 48000, 32000 };
  public static final int[] c = { 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000 };
  public static final int[] d = { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000 };
  public static final int[] e = { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000 };
  public static final int[] f = { 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000 };
  public static final int[] g = { 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000 };
  
  public static int j(int paramInt)
  {
    if (!l(paramInt)) {
      return -1;
    }
    int i = paramInt >>> 19 & 0x3;
    if (i == 1) {
      return -1;
    }
    int j = paramInt >>> 17 & 0x3;
    if (j == 0) {
      return -1;
    }
    int k = paramInt >>> 12 & 0xF;
    if ((k != 0) && (k != 15))
    {
      int m = paramInt >>> 10 & 0x3;
      if (m == 3) {
        return -1;
      }
      int n = b[m];
      if (i == 2)
      {
        m = n / 2;
      }
      else
      {
        m = n;
        if (i == 0) {
          m = n / 4;
        }
      }
      int i1 = paramInt >>> 9 & 0x1;
      if (j == 3)
      {
        if (i == 3) {
          paramInt = c[(k - 1)];
        } else {
          paramInt = d[(k - 1)];
        }
        return (paramInt * 12 / m + i1) * 4;
      }
      if (i == 3)
      {
        if (j == 2) {
          paramInt = e[(k - 1)];
        } else {
          paramInt = f[(k - 1)];
        }
      }
      else {
        paramInt = g[(k - 1)];
      }
      n = 144;
      if (i == 3) {
        return paramInt * 144 / m + i1;
      }
      if (j == 1) {
        n = 72;
      }
      return n * paramInt / m + i1;
    }
    return -1;
  }
  
  public static int k(int paramInt1, int paramInt2)
  {
    int i = 1152;
    if (paramInt2 != 1)
    {
      if (paramInt2 != 2)
      {
        if (paramInt2 == 3) {
          return 384;
        }
        throw new IllegalArgumentException();
      }
      return 1152;
    }
    if (paramInt1 == 3) {
      paramInt1 = i;
    } else {
      paramInt1 = 576;
    }
    return paramInt1;
  }
  
  public static boolean l(int paramInt)
  {
    boolean bool;
    if ((paramInt & 0xFFE00000) == -2097152) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int m(int paramInt)
  {
    if (!l(paramInt)) {
      return -1;
    }
    int i = paramInt >>> 19 & 0x3;
    if (i == 1) {
      return -1;
    }
    int j = paramInt >>> 17 & 0x3;
    if (j == 0) {
      return -1;
    }
    int k = paramInt >>> 12 & 0xF;
    if ((k != 0) && (k != 15) && ((paramInt >>> 10 & 0x3) != 3)) {
      return k(i, j);
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
    
    public a() {}
    
    public a(a parama)
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
}

/* Location:
 * Qualified Name:     F0.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
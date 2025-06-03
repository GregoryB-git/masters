package b5;

import V4.b;

public class k
{
  public static final k[] i;
  public static k[] j;
  public final boolean a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  
  static
  {
    k localk1 = new k(false, 3, 5, 8, 8, 1);
    k localk2 = new k(false, 5, 7, 10, 10, 1);
    k localk3 = new k(true, 5, 7, 16, 6, 1);
    k localk4 = new k(false, 8, 10, 12, 12, 1);
    k localk5 = new k(true, 10, 11, 14, 6, 2);
    k localk6 = new k(false, 12, 12, 14, 14, 1);
    k localk7 = new k(true, 16, 14, 24, 10, 1);
    k localk8 = new k(false, 18, 14, 16, 16, 1);
    k localk9 = new k(false, 22, 18, 18, 18, 1);
    k localk10 = new k(true, 22, 18, 16, 10, 2);
    k localk11 = new k(false, 30, 20, 20, 20, 1);
    k localk12 = new k(true, 32, 24, 16, 14, 2);
    k localk13 = new k(false, 36, 24, 22, 22, 1);
    k localk14 = new k(false, 44, 28, 24, 24, 1);
    k localk15 = new k(true, 49, 28, 22, 14, 2);
    k localk16 = new k(false, 62, 36, 14, 14, 4);
    k localk17 = new k(false, 86, 42, 16, 16, 4);
    k localk18 = new k(false, 114, 48, 18, 18, 4);
    k localk19 = new k(false, 144, 56, 20, 20, 4);
    k localk20 = new k(false, 174, 68, 22, 22, 4);
    k localk21 = new k(false, 204, 84, 24, 24, 4, 102, 42);
    k localk22 = new k(false, 280, 112, 14, 14, 16, 140, 56);
    k localk23 = new k(false, 368, 144, 16, 16, 16, 92, 36);
    k localk24 = new k(false, 456, 192, 18, 18, 16, 114, 48);
    k localk25 = new k(false, 576, 224, 20, 20, 16, 144, 56);
    k localk26 = new k(false, 696, 272, 22, 22, 16, 174, 68);
    k localk27 = new k(false, 816, 336, 24, 24, 16, 136, 56);
    k localk28 = new k(false, 1050, 408, 18, 18, 36, 175, 68);
    k localk29 = new k(false, 1304, 496, 20, 20, 36, 163, 62);
    d locald = new d();
    k[] arrayOfk = new k[30];
    arrayOfk[0] = localk1;
    arrayOfk[1] = localk2;
    arrayOfk[2] = localk3;
    arrayOfk[3] = localk4;
    arrayOfk[4] = localk5;
    arrayOfk[5] = localk6;
    arrayOfk[6] = localk7;
    arrayOfk[7] = localk8;
    arrayOfk[8] = localk9;
    arrayOfk[9] = localk10;
    arrayOfk[10] = localk11;
    arrayOfk[11] = localk12;
    arrayOfk[12] = localk13;
    arrayOfk[13] = localk14;
    arrayOfk[14] = localk15;
    arrayOfk[15] = localk16;
    arrayOfk[16] = localk17;
    arrayOfk[17] = localk18;
    arrayOfk[18] = localk19;
    arrayOfk[19] = localk20;
    arrayOfk[20] = localk21;
    arrayOfk[21] = localk22;
    arrayOfk[22] = localk23;
    arrayOfk[23] = localk24;
    arrayOfk[24] = localk25;
    arrayOfk[25] = localk26;
    arrayOfk[26] = localk27;
    arrayOfk[27] = localk28;
    arrayOfk[28] = localk29;
    arrayOfk[29] = locald;
    i = arrayOfk;
    j = arrayOfk;
  }
  
  public k(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt1, paramInt2);
  }
  
  public k(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    a = paramBoolean;
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    e = paramInt4;
    f = paramInt5;
    g = paramInt6;
    h = paramInt7;
  }
  
  public static k l(int paramInt, l paraml, b paramb1, b paramb2, boolean paramBoolean)
  {
    for (paramb1 : j) {
      if (((paraml != l.p) || (!a)) && ((paraml != l.q) || (a)) && (paramInt <= b)) {
        return paramb1;
      }
    }
    if (!paramBoolean) {
      return null;
    }
    throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(paramInt)));
  }
  
  public final int a()
  {
    return b;
  }
  
  public int b(int paramInt)
  {
    return g;
  }
  
  public final int c()
  {
    return c;
  }
  
  public final int d(int paramInt)
  {
    return h;
  }
  
  public final int e()
  {
    int k = f;
    int m = 1;
    if (k != 1)
    {
      int n = 2;
      m = n;
      if (k != 2)
      {
        m = n;
        if (k != 4)
        {
          if (k != 16)
          {
            if (k == 36) {
              return 6;
            }
            throw new IllegalStateException("Cannot handle this number of data regions");
          }
          return 4;
        }
      }
    }
    return m;
  }
  
  public int f()
  {
    return b / g;
  }
  
  public final int g()
  {
    return k() * e;
  }
  
  public final int h()
  {
    return e() * d;
  }
  
  public final int i()
  {
    return g() + (k() << 1);
  }
  
  public final int j()
  {
    return h() + (e() << 1);
  }
  
  public final int k()
  {
    int k = f;
    if ((k != 1) && (k != 2))
    {
      if (k != 4)
      {
        if (k != 16)
        {
          if (k == 36) {
            return 6;
          }
          throw new IllegalStateException("Cannot handle this number of data regions");
        }
        return 4;
      }
      return 2;
    }
    return 1;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str;
    if (a) {
      str = "Rectangular Symbol:";
    } else {
      str = "Square Symbol:";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(" data region ");
    localStringBuilder.append(d);
    localStringBuilder.append('x');
    localStringBuilder.append(e);
    localStringBuilder.append(", symbol size ");
    localStringBuilder.append(j());
    localStringBuilder.append('x');
    localStringBuilder.append(i());
    localStringBuilder.append(", symbol data size ");
    localStringBuilder.append(h());
    localStringBuilder.append('x');
    localStringBuilder.append(g());
    localStringBuilder.append(", codewords ");
    localStringBuilder.append(b);
    localStringBuilder.append('+');
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     b5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package h5;

import V4.h;
import g5.c;

public abstract class e
{
  public static final int[][] a;
  public static final int[][] b;
  public static final int[][] c;
  public static final int[][] d = { { 8, 0 }, { 8, 1 }, { 8, 2 }, { 8, 3 }, { 8, 4 }, { 8, 5 }, { 8, 7 }, { 8, 8 }, { 7, 8 }, { 5, 8 }, { 4, 8 }, { 3, 8 }, { 2, 8 }, { 1, 8 }, { 0, 8 } };
  
  static
  {
    int[] arrayOfInt1 = { 1, 0, 0, 0, 0, 0, 1 };
    a = new int[][] { { 1, 1, 1, 1, 1, 1, 1 }, arrayOfInt1, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1 } };
    b = new int[][] { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
    arrayOfInt1 = new int[] { -1, -1, -1, -1, -1, -1, -1 };
    int[] arrayOfInt2 = { 6, 30, -1, -1, -1, -1, -1 };
    int[] arrayOfInt3 = { 6, 24, 42, -1, -1, -1, -1 };
    int[] arrayOfInt4 = { 6, 32, 58, -1, -1, -1, -1 };
    int[] arrayOfInt5 = { 6, 30, 56, 82, -1, -1, -1 };
    int[] arrayOfInt6 = { 6, 30, 58, 86, -1, -1, -1 };
    int[] arrayOfInt7 = { 6, 34, 62, 90, -1, -1, -1 };
    int[] arrayOfInt8 = { 6, 26, 50, 74, 98, 122, -1 };
    int[] arrayOfInt9 = { 6, 30, 54, 78, 102, 126, -1 };
    int[] arrayOfInt10 = { 6, 34, 62, 90, 118, 146, -1 };
    int[] arrayOfInt11 = { 6, 30, 54, 78, 102, 126, 150 };
    c = new int[][] { arrayOfInt1, { 6, 18, -1, -1, -1, -1, -1 }, { 6, 22, -1, -1, -1, -1, -1 }, { 6, 26, -1, -1, -1, -1, -1 }, arrayOfInt2, { 6, 34, -1, -1, -1, -1, -1 }, { 6, 22, 38, -1, -1, -1, -1 }, arrayOfInt3, { 6, 26, 46, -1, -1, -1, -1 }, { 6, 28, 50, -1, -1, -1, -1 }, { 6, 30, 54, -1, -1, -1, -1 }, arrayOfInt4, { 6, 34, 62, -1, -1, -1, -1 }, { 6, 26, 46, 66, -1, -1, -1 }, { 6, 26, 48, 70, -1, -1, -1 }, { 6, 26, 50, 74, -1, -1, -1 }, { 6, 30, 54, 78, -1, -1, -1 }, arrayOfInt5, arrayOfInt6, arrayOfInt7, { 6, 28, 50, 72, 94, -1, -1 }, { 6, 26, 50, 74, 98, -1, -1 }, { 6, 30, 54, 78, 102, -1, -1 }, { 6, 28, 54, 80, 106, -1, -1 }, { 6, 32, 58, 84, 110, -1, -1 }, { 6, 30, 58, 86, 114, -1, -1 }, { 6, 34, 62, 90, 118, -1, -1 }, arrayOfInt8, arrayOfInt9, { 6, 26, 52, 78, 104, 130, -1 }, { 6, 30, 56, 82, 108, 134, -1 }, { 6, 34, 60, 86, 112, 138, -1 }, { 6, 30, 58, 86, 114, 142, -1 }, arrayOfInt10, arrayOfInt11, { 6, 24, 50, 76, 102, 128, 154 }, { 6, 28, 54, 80, 106, 132, 158 }, { 6, 32, 58, 84, 110, 136, 162 }, { 6, 26, 54, 82, 110, 138, 166 }, { 6, 30, 58, 86, 114, 142, 170 } };
  }
  
  public static void a(Y4.a parama, g5.a parama1, c paramc, int paramInt, b paramb)
  {
    c(paramb);
    d(paramc, paramb);
    l(parama1, paramInt, paramb);
    s(paramc, paramb);
    f(parama, paramInt, paramb);
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      int i = n(paramInt2);
      paramInt1 <<= i - 1;
      while (n(paramInt1) >= i) {
        paramInt1 ^= paramInt2 << n(paramInt1) - i;
      }
      return paramInt1;
    }
    throw new IllegalArgumentException("0 polynomial");
  }
  
  public static void c(b paramb)
  {
    paramb.a((byte)-1);
  }
  
  public static void d(c paramc, b paramb)
  {
    j(paramb);
    e(paramb);
    r(paramc, paramb);
    k(paramb);
  }
  
  public static void e(b paramb)
  {
    if (paramb.b(8, paramb.d() - 8) != 0)
    {
      paramb.f(8, paramb.d() - 8, 1);
      return;
    }
    throw new h();
  }
  
  public static void f(Y4.a parama, int paramInt, b paramb)
  {
    int i = paramb.e() - 1;
    int j = paramb.d() - 1;
    int k = 0;
    int m = -1;
    while (i > 0)
    {
      int n = i;
      int i1 = j;
      int i2 = k;
      if (i == 6)
      {
        n = i - 1;
        i2 = k;
        i1 = j;
      }
      while ((i1 >= 0) && (i1 < paramb.d()))
      {
        i = 0;
        for (j = i2; i < 2; j = i2)
        {
          k = n - i;
          i2 = j;
          if (o(paramb.b(k, i1)))
          {
            boolean bool1;
            if (j < parama.l())
            {
              bool1 = parama.j(j);
              j++;
            }
            else
            {
              bool1 = false;
            }
            boolean bool2 = bool1;
            if (paramInt != -1)
            {
              bool2 = bool1;
              if (d.f(paramInt, k, i1)) {
                bool2 = bool1 ^ true;
              }
            }
            paramb.g(k, i1, bool2);
            i2 = j;
          }
          i++;
        }
        i1 += m;
        i2 = j;
      }
      m = -m;
      j = i1 + m;
      i = n - 2;
      k = i2;
    }
    if (k == parama.l()) {
      return;
    }
    paramb = new StringBuilder("Not all bits consumed: ");
    paramb.append(k);
    paramb.append('/');
    paramb.append(parama.l());
    throw new h(paramb.toString());
  }
  
  public static void g(int paramInt1, int paramInt2, b paramb)
  {
    int i = 0;
    while (i < 8)
    {
      int j = paramInt1 + i;
      if (o(paramb.b(j, paramInt2)))
      {
        paramb.f(j, paramInt2, 0);
        i++;
      }
      else
      {
        throw new h();
      }
    }
  }
  
  public static void h(int paramInt1, int paramInt2, b paramb)
  {
    for (int i = 0; i < 5; i++)
    {
      int[] arrayOfInt = b[i];
      for (int j = 0; j < 5; j++) {
        paramb.f(paramInt1 + j, paramInt2 + i, arrayOfInt[j]);
      }
    }
  }
  
  public static void i(int paramInt1, int paramInt2, b paramb)
  {
    for (int i = 0; i < 7; i++)
    {
      int[] arrayOfInt = a[i];
      for (int j = 0; j < 7; j++) {
        paramb.f(paramInt1 + j, paramInt2 + i, arrayOfInt[j]);
      }
    }
  }
  
  public static void j(b paramb)
  {
    int i = a[0].length;
    i(0, 0, paramb);
    i(paramb.e() - i, 0, paramb);
    i(0, paramb.e() - i, paramb);
    g(0, 7, paramb);
    g(paramb.e() - 8, 7, paramb);
    g(0, paramb.e() - 8, paramb);
    m(7, 0, paramb);
    m(paramb.d() - 8, 0, paramb);
    m(7, paramb.d() - 7, paramb);
  }
  
  public static void k(b paramb)
  {
    int j;
    for (int i = 8; i < paramb.e() - 8; i = j)
    {
      j = i + 1;
      int k = j % 2;
      if (o(paramb.b(i, 6))) {
        paramb.f(i, 6, k);
      }
      if (o(paramb.b(6, i))) {
        paramb.f(6, i, k);
      }
    }
  }
  
  public static void l(g5.a parama, int paramInt, b paramb)
  {
    Y4.a locala = new Y4.a();
    p(parama, paramInt, locala);
    for (paramInt = 0; paramInt < locala.l(); paramInt++)
    {
      boolean bool = locala.j(locala.l() - 1 - paramInt);
      parama = d[paramInt];
      paramb.g(parama[0], parama[1], bool);
      if (paramInt < 8) {
        paramb.g(paramb.e() - paramInt - 1, 8, bool);
      } else {
        paramb.g(8, paramb.d() - 7 + (paramInt - 8), bool);
      }
    }
  }
  
  public static void m(int paramInt1, int paramInt2, b paramb)
  {
    int i = 0;
    while (i < 7)
    {
      int j = paramInt2 + i;
      if (o(paramb.b(paramInt1, j)))
      {
        paramb.f(paramInt1, j, 0);
        i++;
      }
      else
      {
        throw new h();
      }
    }
  }
  
  public static int n(int paramInt)
  {
    return 32 - Integer.numberOfLeadingZeros(paramInt);
  }
  
  public static boolean o(int paramInt)
  {
    return paramInt == -1;
  }
  
  public static void p(g5.a parama, int paramInt, Y4.a parama1)
  {
    if (f.b(paramInt))
    {
      paramInt = parama.c() << 3 | paramInt;
      parama1.d(paramInt, 5);
      parama1.d(b(paramInt, 1335), 10);
      parama = new Y4.a();
      parama.d(21522, 15);
      parama1.s(parama);
      if (parama1.l() == 15) {
        return;
      }
      parama = new StringBuilder("should not happen but we got: ");
      parama.append(parama1.l());
      throw new h(parama.toString());
    }
    throw new h("Invalid mask pattern");
  }
  
  public static void q(c paramc, Y4.a parama)
  {
    parama.d(paramc.f(), 6);
    parama.d(b(paramc.f(), 7973), 12);
    if (parama.l() == 18) {
      return;
    }
    paramc = new StringBuilder("should not happen but we got: ");
    paramc.append(parama.l());
    throw new h(paramc.toString());
  }
  
  public static void r(c paramc, b paramb)
  {
    if (paramc.f() < 2) {
      return;
    }
    int i = paramc.f();
    for (int k : c[(i - 1)]) {
      if (k >= 0)
      {
        int m = paramc.length;
        for (int n = 0; n < m; n++)
        {
          int i1 = paramc[n];
          if ((i1 >= 0) && (o(paramb.b(i1, k)))) {
            h(i1 - 2, k - 2, paramb);
          }
        }
      }
    }
  }
  
  public static void s(c paramc, b paramb)
  {
    if (paramc.f() < 7) {
      return;
    }
    Y4.a locala = new Y4.a();
    q(paramc, locala);
    int i = 17;
    for (int j = 0; j < 6; j++) {
      for (int k = 0; k < 3; k++)
      {
        boolean bool = locala.j(i);
        i--;
        paramb.g(j, paramb.d() - 11 + k, bool);
        paramb.g(paramb.d() - 11 + k, j, bool);
      }
    }
  }
}

/* Location:
 * Qualified Name:     h5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
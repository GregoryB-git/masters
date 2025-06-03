package Z4;

public final class a
{
  public static final a h = new a(4201, 4096, 1);
  public static final a i = new a(1033, 1024, 1);
  public static final a j;
  public static final a k;
  public static final a l;
  public static final a m;
  public static final a n;
  public static final a o;
  public final int[] a;
  public final int[] b;
  public final b c;
  public final b d;
  public final int e;
  public final int f;
  public final int g;
  
  static
  {
    a locala1 = new a(67, 64, 1);
    j = locala1;
    k = new a(19, 16, 1);
    l = new a(285, 256, 0);
    a locala2 = new a(301, 256, 1);
    m = locala2;
    n = locala2;
    o = locala1;
  }
  
  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    f = paramInt1;
    e = paramInt2;
    g = paramInt3;
    a = new int[paramInt2];
    b = new int[paramInt2];
    paramInt3 = 1;
    for (int i1 = 0; i1 < paramInt2; i1++)
    {
      a[i1] = paramInt3;
      int i2 = paramInt3 << 1;
      paramInt3 = i2;
      if (i2 >= paramInt2) {
        paramInt3 = (i2 ^ paramInt1) & paramInt2 - 1;
      }
    }
    for (paramInt1 = 0; paramInt1 < paramInt2 - 1; paramInt1++) {
      b[a[paramInt1]] = paramInt1;
    }
    c = new b(this, new int[] { 0 });
    d = new b(this, new int[] { 1 });
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 ^ paramInt2;
  }
  
  public b b(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      if (paramInt2 == 0) {
        return c;
      }
      int[] arrayOfInt = new int[paramInt1 + 1];
      arrayOfInt[0] = paramInt2;
      return new b(this, arrayOfInt);
    }
    throw new IllegalArgumentException();
  }
  
  public int c(int paramInt)
  {
    return a[paramInt];
  }
  
  public int d()
  {
    return g;
  }
  
  public b e()
  {
    return c;
  }
  
  public int f(int paramInt)
  {
    if (paramInt != 0) {
      return a[(e - b[paramInt] - 1)];
    }
    throw new ArithmeticException();
  }
  
  public int g(int paramInt)
  {
    if (paramInt != 0) {
      return b[paramInt];
    }
    throw new IllegalArgumentException();
  }
  
  public int h(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      int[] arrayOfInt1 = a;
      int[] arrayOfInt2 = b;
      return arrayOfInt1[((arrayOfInt2[paramInt1] + arrayOfInt2[paramInt2]) % (e - 1))];
    }
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("GF(0x");
    localStringBuilder.append(Integer.toHexString(f));
    localStringBuilder.append(',');
    localStringBuilder.append(e);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     Z4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
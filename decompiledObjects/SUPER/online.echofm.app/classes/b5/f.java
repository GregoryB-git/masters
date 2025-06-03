package b5;

public final class f
  implements g
{
  public static void b(char paramChar, StringBuilder paramStringBuilder)
  {
    if ((paramChar >= ' ') && (paramChar <= '?'))
    {
      paramStringBuilder.append(paramChar);
      return;
    }
    if ((paramChar >= '@') && (paramChar <= '^'))
    {
      paramStringBuilder.append((char)(paramChar - '@'));
      return;
    }
    j.e(paramChar);
  }
  
  private static String c(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length() - paramInt;
    if (i != 0)
    {
      int j = paramCharSequence.charAt(paramInt);
      int k = 0;
      int m;
      if (i >= 2) {
        m = paramCharSequence.charAt(paramInt + 1);
      } else {
        m = 0;
      }
      int n;
      if (i >= 3) {
        n = paramCharSequence.charAt(paramInt + 2);
      } else {
        n = 0;
      }
      if (i >= 4) {
        k = paramCharSequence.charAt(paramInt + 3);
      }
      paramInt = (j << 18) + (m << 12) + (n << 6) + k;
      char c1 = (char)(paramInt >> 16 & 0xFF);
      char c2 = (char)(paramInt >> 8 & 0xFF);
      char c3 = (char)(paramInt & 0xFF);
      paramCharSequence = new StringBuilder(3);
      paramCharSequence.append(c1);
      if (i >= 2) {
        paramCharSequence.append(c2);
      }
      if (i >= 3) {
        paramCharSequence.append(c3);
      }
      return paramCharSequence.toString();
    }
    throw new IllegalStateException("StringBuilder must not be empty");
  }
  
  public static void e(h paramh, CharSequence paramCharSequence)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    try
    {
      i = paramCharSequence.length();
      if (i == 0)
      {
        paramh.o(0);
        return;
      }
      j = 1;
      if (i != 1) {
        break label117;
      }
      paramh.p();
      k = paramh.g().a() - paramh.a();
      m = paramh.f();
      n = k;
      if (m > k)
      {
        paramh.q(paramh.a() + 1);
        k = paramh.g().a();
        n = paramh.a();
        n = k - n;
      }
    }
    finally
    {
      break label252;
    }
    if ((m <= n) && (n <= 2))
    {
      paramh.o(0);
      return;
    }
    label117:
    if (i <= 4)
    {
      k = i - 1;
      paramCharSequence = c(paramCharSequence, 0);
      if (((paramh.i() ^ true)) && (k <= 2)) {
        n = j;
      } else {
        n = 0;
      }
      if (k <= 2)
      {
        paramh.q(paramh.a() + k);
        if (paramh.g().a() - paramh.a() >= 3)
        {
          paramh.q(paramh.a() + paramCharSequence.length());
          break label229;
        }
      }
      if (n != 0)
      {
        paramh.k();
        d -= k;
      }
      else
      {
        label229:
        paramh.s(paramCharSequence);
      }
      paramh.o(0);
      return;
    }
    paramCharSequence = new java/lang/IllegalStateException;
    paramCharSequence.<init>("Count must not exceed 4");
    throw paramCharSequence;
    label252:
    paramh.o(0);
    throw paramCharSequence;
  }
  
  public void a(h paramh)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    while (paramh.i())
    {
      b(paramh.c(), localStringBuilder);
      d += 1;
      if (localStringBuilder.length() >= 4)
      {
        paramh.s(c(localStringBuilder, 0));
        localStringBuilder.delete(0, 4);
        if (j.n(paramh.d(), d, d()) != d()) {
          paramh.o(0);
        }
      }
    }
    localStringBuilder.append('\037');
    e(paramh, localStringBuilder);
  }
  
  public int d()
  {
    return 4;
  }
}

/* Location:
 * Qualified Name:     b5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package b5;

public final class b
  implements g
{
  public static char c(char paramChar, int paramInt)
  {
    paramChar += paramInt * 149 % 255 + 1;
    if (paramChar <= 'ÿ') {
      return (char)paramChar;
    }
    return (char)(paramChar - 'Ā');
  }
  
  public void a(h paramh)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    localStringBuilder.append('\000');
    while (paramh.i())
    {
      localStringBuilder.append(paramh.c());
      d += 1;
      if (j.n(paramh.d(), d, b()) != b()) {
        paramh.o(0);
      }
    }
    int j = localStringBuilder.length() - 1;
    int k = paramh.a() + j + 1;
    paramh.q(k);
    if (paramh.g().a() - k > 0) {
      k = 1;
    } else {
      k = 0;
    }
    if ((paramh.i()) || (k != 0)) {
      if (j <= 249)
      {
        localStringBuilder.setCharAt(0, (char)j);
      }
      else
      {
        if (j > 1555) {
          break label226;
        }
        localStringBuilder.setCharAt(0, (char)(j / 250 + 249));
        localStringBuilder.insert(1, (char)(j % 250));
      }
    }
    j = localStringBuilder.length();
    for (k = i; k < j; k++) {
      paramh.r(c(localStringBuilder.charAt(k), paramh.a() + 1));
    }
    return;
    label226:
    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(j)));
  }
  
  public int b()
  {
    return 5;
  }
}

/* Location:
 * Qualified Name:     b5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
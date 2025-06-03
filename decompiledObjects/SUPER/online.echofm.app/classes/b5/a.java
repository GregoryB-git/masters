package b5;

public final class a
  implements g
{
  public static char b(char paramChar1, char paramChar2)
  {
    if ((j.f(paramChar1)) && (j.f(paramChar2))) {
      return (char)((paramChar1 - '0') * 10 + (paramChar2 - '0') + 130);
    }
    StringBuilder localStringBuilder = new StringBuilder("not digits: ");
    localStringBuilder.append(paramChar1);
    localStringBuilder.append(paramChar2);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void a(h paramh)
  {
    if (j.a(paramh.d(), d) >= 2)
    {
      paramh.r(b(paramh.d().charAt(d), paramh.d().charAt(d + 1)));
      d += 2;
      return;
    }
    char c = paramh.c();
    int i = j.n(paramh.d(), d, c());
    if (i != c())
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i == 5)
              {
                paramh.r('ç');
                paramh.o(5);
                return;
              }
              throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(i)));
            }
            paramh.r('ð');
            paramh.o(4);
            return;
          }
          paramh.r('î');
          paramh.o(3);
          return;
        }
        paramh.r('ï');
        paramh.o(2);
        return;
      }
      paramh.r('æ');
      paramh.o(1);
      return;
    }
    if (j.g(c))
    {
      paramh.r('ë');
      paramh.r((char)(c - ''));
      d += 1;
      return;
    }
    paramh.r((char)(c + '\001'));
    d += 1;
  }
  
  public int c()
  {
    return 0;
  }
}

/* Location:
 * Qualified Name:     b5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package b5;

public final class n
  extends c
{
  public void a(h paramh)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    while (paramh.i())
    {
      char c = paramh.c();
      d += 1;
      c(c, localStringBuilder);
      if (localStringBuilder.length() % 3 == 0)
      {
        c.g(paramh, localStringBuilder);
        if (j.n(paramh.d(), d, e()) != e()) {
          paramh.o(0);
        }
      }
    }
    f(paramh, localStringBuilder);
  }
  
  public int c(char paramChar, StringBuilder paramStringBuilder)
  {
    char c;
    if (paramChar != '\r') {
      if (paramChar != ' ') {
        if (paramChar != '*') {
          if (paramChar != '>') {
            if ((paramChar >= '0') && (paramChar <= '9'))
            {
              c = paramChar - ',';
              c = (char)c;
              paramChar = c;
            }
          }
        }
      }
    }
    for (;;)
    {
      paramStringBuilder.append(paramChar);
      break label112;
      if ((paramChar >= 'A') && (paramChar <= 'Z'))
      {
        c = paramChar - '3';
        break;
      }
      j.e(paramChar);
      break label112;
      c = '\002';
      paramChar = c;
      continue;
      paramStringBuilder.append('\001');
      break label112;
      c = '\003';
      paramChar = c;
      continue;
      c = '\000';
      paramChar = c;
    }
    label112:
    return 1;
  }
  
  public int e()
  {
    return 3;
  }
  
  public void f(h paramh, StringBuilder paramStringBuilder)
  {
    paramh.p();
    int i = paramh.g().a() - paramh.a();
    int j = paramStringBuilder.length();
    d -= j;
    if ((paramh.f() > 1) || (i > 1) || (paramh.f() != i)) {
      paramh.r('þ');
    }
    if (paramh.e() < 0) {
      paramh.o(0);
    }
  }
}

/* Location:
 * Qualified Name:     b5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
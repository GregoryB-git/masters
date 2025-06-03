package b5;

public class c
  implements g
{
  public static String d(CharSequence paramCharSequence, int paramInt)
  {
    paramInt = paramCharSequence.charAt(paramInt) * 'ـ' + paramCharSequence.charAt(paramInt + 1) * '(' + paramCharSequence.charAt(paramInt + 2) + 1;
    return new String(new char[] { (char)(paramInt / 256), (char)(paramInt % 256) });
  }
  
  public static void g(h paramh, StringBuilder paramStringBuilder)
  {
    paramh.s(d(paramStringBuilder, 0));
    paramStringBuilder.delete(0, 3);
  }
  
  public void a(h paramh)
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    while (paramh.i())
    {
      char c = paramh.c();
      d += 1;
      int i = c(c, localStringBuilder1);
      int j = localStringBuilder1.length() / 3;
      j = paramh.a() + (j << 1);
      paramh.q(j);
      int k = paramh.g().a() - j;
      if (!paramh.i())
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        j = i;
        int m;
        if (localStringBuilder1.length() % 3 == 2)
        {
          m = i;
          if (k >= 2)
          {
            j = i;
            if (k <= 2) {
              break label141;
            }
            m = i;
          }
        }
        for (;;)
        {
          j = b(paramh, localStringBuilder1, localStringBuilder2, m);
          label141:
          if (localStringBuilder1.length() % 3 != 1) {
            break;
          }
          if (j <= 3)
          {
            m = j;
            if (k != 1) {}
          }
          else
          {
            if (j <= 3) {
              break;
            }
            m = j;
          }
        }
      }
      if ((localStringBuilder1.length() % 3 == 0) && (j.n(paramh.d(), d, e()) != e())) {
        paramh.o(0);
      }
    }
    f(paramh, localStringBuilder1);
  }
  
  public final int b(h paramh, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2, int paramInt)
  {
    int i = paramStringBuilder1.length();
    paramStringBuilder1.delete(i - paramInt, i);
    d -= 1;
    paramInt = c(paramh.c(), paramStringBuilder2);
    paramh.k();
    return paramInt;
  }
  
  public int c(char paramChar, StringBuilder paramStringBuilder)
  {
    char c;
    if (paramChar == ' ')
    {
      paramChar = '\003';
      c = paramChar;
      paramStringBuilder.append(c);
      return 1;
    }
    if ((paramChar >= '0') && (paramChar <= '9')) {
      paramChar -= 44;
    }
    for (;;)
    {
      paramChar = (char)paramChar;
      c = paramChar;
      break;
      if ((paramChar < 'A') || (paramChar > 'Z')) {
        break label59;
      }
      paramChar -= 51;
    }
    label59:
    if (paramChar < ' ')
    {
      paramStringBuilder.append('\000');
      c = paramChar;
      paramStringBuilder.append(c);
      return 2;
    }
    if ((paramChar >= '!') && (paramChar <= '/'))
    {
      paramStringBuilder.append('\001');
      paramChar -= 33;
    }
    for (;;)
    {
      paramChar = (char)paramChar;
      c = paramChar;
      break;
      if ((paramChar >= ':') && (paramChar <= '@'))
      {
        paramStringBuilder.append('\001');
        paramChar -= 43;
      }
      else if ((paramChar >= '[') && (paramChar <= '_'))
      {
        paramStringBuilder.append('\001');
        paramChar -= 69;
      }
      else
      {
        if ((paramChar < '`') || (paramChar > '')) {
          break label182;
        }
        paramStringBuilder.append('\002');
        paramChar -= 96;
      }
    }
    label182:
    paramStringBuilder.append("\001\036");
    return c((char)(paramChar - ''), paramStringBuilder) + 2;
  }
  
  public int e()
  {
    return 1;
  }
  
  public void f(h paramh, StringBuilder paramStringBuilder)
  {
    int i = paramStringBuilder.length() / 3;
    int j = paramStringBuilder.length() % 3;
    i = paramh.a() + (i << 1);
    paramh.q(i);
    i = paramh.g().a() - i;
    if (j == 2)
    {
      paramStringBuilder.append('\000');
      while (paramStringBuilder.length() >= 3) {
        g(paramh, paramStringBuilder);
      }
      if (!paramh.i()) {}
    }
    else
    {
      do
      {
        paramh.r('þ');
        break;
        if ((i == 1) && (j == 1))
        {
          while (paramStringBuilder.length() >= 3) {
            g(paramh, paramStringBuilder);
          }
          if (paramh.i()) {
            paramh.r('þ');
          }
          d -= 1;
          break;
        }
        if (j != 0) {
          break label179;
        }
        while (paramStringBuilder.length() >= 3) {
          g(paramh, paramStringBuilder);
        }
      } while ((i > 0) || (paramh.i()));
    }
    paramh.o(0);
    return;
    label179:
    throw new IllegalStateException("Unexpected case. Please report!");
  }
}

/* Location:
 * Qualified Name:     b5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
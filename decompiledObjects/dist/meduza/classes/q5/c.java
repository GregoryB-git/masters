package q5;

import f;
import java.util.regex.Pattern;
import v5.u;

public final class c
{
  public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
  public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
  public final u a = new u();
  public final StringBuilder b = new StringBuilder();
  
  public static String a(u paramu, StringBuilder paramStringBuilder)
  {
    int i = 0;
    paramStringBuilder.setLength(0);
    int j = b;
    int k = c;
    while ((j < k) && (i == 0))
    {
      char c1 = (char)a[j];
      if (((c1 < 'A') || (c1 > 'Z')) && ((c1 < 'a') || (c1 > 'z')) && ((c1 < '0') || (c1 > '9')) && (c1 != '#') && (c1 != '-') && (c1 != '.') && (c1 != '_'))
      {
        i = 1;
      }
      else
      {
        j++;
        paramStringBuilder.append(c1);
      }
    }
    paramu.H(j - b);
    return paramStringBuilder.toString();
  }
  
  public static String b(u paramu, StringBuilder paramStringBuilder)
  {
    c(paramu);
    if (c - b == 0) {
      return null;
    }
    paramStringBuilder = a(paramu, paramStringBuilder);
    if (!"".equals(paramStringBuilder)) {
      return paramStringBuilder;
    }
    paramStringBuilder = f.l("");
    paramStringBuilder.append((char)paramu.v());
    return paramStringBuilder.toString();
  }
  
  public static void c(u paramu)
  {
    for (int i = 1;; i = 0)
    {
      int j = c;
      int k = b;
      if ((j - k <= 0) || (i == 0)) {
        return;
      }
      i = (char)a[k];
      if ((i != 9) && (i != 10) && (i != 12) && (i != 13) && (i != 32))
      {
        i = 0;
      }
      else
      {
        paramu.H(1);
        i = 1;
      }
      if (i != 0) {
        break;
      }
      i = b;
      k = c;
      byte[] arrayOfByte = a;
      if (i + 2 <= k)
      {
        j = i + 1;
        if (arrayOfByte[i] == 47)
        {
          i = j + 1;
          if (arrayOfByte[j] == 42)
          {
            for (;;)
            {
              j = i + 1;
              if (j >= k) {
                break;
              }
              if (((char)arrayOfByte[i] == '*') && ((char)arrayOfByte[j] == '/'))
              {
                k = j + 1;
                i = k;
              }
              else
              {
                i = j;
              }
            }
            paramu.H(k - b);
            i = 1;
            break label185;
          }
        }
      }
      i = 0;
      label185:
      if (i != 0) {
        break;
      }
    }
  }
}

/* Location:
 * Qualified Name:     q5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
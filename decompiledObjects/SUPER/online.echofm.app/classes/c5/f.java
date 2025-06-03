package c5;

import V4.a;
import Y4.b;
import java.util.Map;

public final class f
  extends n
{
  public static void f(int paramInt, int[] paramArrayOfInt)
  {
    for (int i = 0; i < 9; i++)
    {
      int j = 1;
      if ((1 << 8 - i & paramInt) != 0) {
        j = 2;
      }
      paramArrayOfInt[i] = j;
    }
  }
  
  public static String g(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder();
    for (int j = 0; j < i; j++)
    {
      char c1 = paramString.charAt(j);
      label115:
      Object localObject;
      if (c1 != 0)
      {
        char c2 = c1;
        if (c1 != ' ')
        {
          if (c1 == '@') {
            break label329;
          }
          if (c1 == '`') {
            break label315;
          }
          c2 = c1;
          if (c1 != '-')
          {
            c2 = c1;
            if (c1 != '.')
            {
              if (c1 > '\032') {
                break label115;
              }
              localStringBuilder.append('$');
              c1 += 64;
            }
          }
        }
        for (;;)
        {
          c1 = (char)c1;
          c2 = c1;
          localStringBuilder.append(c2);
          break;
          if (c1 < ' ')
          {
            localStringBuilder.append('%');
            c1 += 38;
          }
          else if ((c1 > ',') && (c1 != '/') && (c1 != ':'))
          {
            if (c1 > '9')
            {
              do
              {
                if (c1 <= '?')
                {
                  localStringBuilder.append('%');
                  c1 += 11;
                  break;
                }
              } while (c1 <= 'Z');
              if (c1 <= '_')
              {
                localStringBuilder.append('%');
                c1 -= 16;
              }
              else if (c1 <= 'z')
              {
                localStringBuilder.append('+');
                c1 -= 32;
              }
              else if (c1 <= '')
              {
                localStringBuilder.append('%');
                c1 -= 43;
              }
              else
              {
                localObject = new StringBuilder("Requested content contains a non-encodable character: '");
                ((StringBuilder)localObject).append(paramString.charAt(j));
                ((StringBuilder)localObject).append("'");
                throw new IllegalArgumentException(((StringBuilder)localObject).toString());
              }
            }
          }
          else
          {
            localStringBuilder.append('/');
            c1 += 32;
          }
        }
        label315:
        localObject = "%W";
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject);
        break;
        label329:
        localObject = "%V";
        continue;
        localObject = "%U";
      }
    }
    return localStringBuilder.toString();
  }
  
  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama == a.q) {
      return super.a(paramString, parama, paramInt1, paramInt2, paramMap);
    }
    throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(parama)));
  }
  
  public boolean[] c(String paramString)
  {
    int i = paramString.length();
    if (i <= 80)
    {
      int k;
      String str;
      for (int j = 0;; j++)
      {
        k = i;
        str = paramString;
        if (j >= i) {
          break;
        }
        if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(paramString.charAt(j)) < 0)
        {
          str = g(paramString);
          k = str.length();
          if (k <= 80) {
            break;
          }
          paramString = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
          paramString.append(k);
          paramString.append(" (extended full ASCII mode)");
          throw new IllegalArgumentException(paramString.toString());
        }
      }
      int[] arrayOfInt1 = new int[9];
      i = k + 25;
      int m;
      for (j = 0; j < k; j++)
      {
        m = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(j));
        f(e.a[m], arrayOfInt1);
        for (m = 0; m < 9; m++) {
          i += arrayOfInt1[m];
        }
      }
      paramString = new boolean[i];
      f(148, arrayOfInt1);
      j = n.b(paramString, 0, arrayOfInt1, true);
      int[] arrayOfInt2 = new int[1];
      arrayOfInt2[0] = 1;
      i = j + n.b(paramString, j, arrayOfInt2, false);
      for (j = 0; j < k; j++)
      {
        m = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(j));
        f(e.a[m], arrayOfInt1);
        i += n.b(paramString, i, arrayOfInt1, true);
        i += n.b(paramString, i, arrayOfInt2, false);
      }
      f(148, arrayOfInt1);
      n.b(paramString, i, arrayOfInt1, true);
      return paramString;
    }
    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(i)));
  }
}

/* Location:
 * Qualified Name:     c5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package ib;

import f;
import javax.security.auth.x500.X500Principal;

public final class c
{
  public final String a;
  public final int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public char[] g;
  
  public c(X500Principal paramX500Principal)
  {
    paramX500Principal = paramX500Principal.getName("RFC2253");
    a = paramX500Principal;
    b = paramX500Principal.length();
  }
  
  public final int a(int paramInt)
  {
    int i = paramInt + 1;
    if (i < b)
    {
      localObject = g;
      paramInt = localObject[paramInt];
      if ((paramInt >= 48) && (paramInt <= 57))
      {
        paramInt -= 48;
      }
      else if ((paramInt >= 97) && (paramInt <= 102))
      {
        paramInt -= 87;
      }
      else
      {
        if ((paramInt < 65) || (paramInt > 70)) {
          break label160;
        }
        paramInt -= 55;
      }
      i = localObject[i];
      if ((i >= 48) && (i <= 57))
      {
        i -= 48;
      }
      else if ((i >= 97) && (i <= 102))
      {
        i -= 87;
      }
      else
      {
        if ((i < 65) || (i > 70)) {
          break label133;
        }
        i -= 55;
      }
      return (paramInt << 4) + i;
      label133:
      localObject = f.l("Malformed DN: ");
      ((StringBuilder)localObject).append(a);
      throw new IllegalStateException(((StringBuilder)localObject).toString());
      label160:
      localObject = f.l("Malformed DN: ");
      ((StringBuilder)localObject).append(a);
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    Object localObject = f.l("Malformed DN: ");
    ((StringBuilder)localObject).append(a);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final char b()
  {
    int i = c + 1;
    c = i;
    if (i != b)
    {
      char c1 = g[i];
      if ((c1 != ' ') && (c1 != '%') && (c1 != '\\') && (c1 != '_') && (c1 != '"') && (c1 != '#')) {
        switch (c1)
        {
        default: 
          switch (c1)
          {
          default: 
            int j = a(i);
            c += 1;
            char c2 = '?';
            if (j >= 128)
            {
              c1 = c2;
              if (j >= 192)
              {
                c1 = c2;
                if (j <= 247)
                {
                  int k;
                  if (j <= 223)
                  {
                    i = j & 0x1F;
                    k = 1;
                  }
                  else if (j <= 239)
                  {
                    k = 2;
                    i = j & 0xF;
                  }
                  else
                  {
                    k = 3;
                    i = j & 0x7;
                  }
                  for (int m = 0;; m++)
                  {
                    j = i;
                    if (m >= k) {
                      break;
                    }
                    j = c + 1;
                    c = j;
                    c1 = c2;
                    if (j == b) {
                      break label332;
                    }
                    if (g[j] != '\\')
                    {
                      c1 = c2;
                      break label332;
                    }
                    j++;
                    c = j;
                    j = a(j);
                    c += 1;
                    if ((j & 0xC0) != 128)
                    {
                      c1 = c2;
                      break label332;
                    }
                    i = (i << 6) + (j & 0x3F);
                  }
                }
              }
            }
            else
            {
              i = (char)j;
              c1 = i;
            }
            label332:
            return c1;
          }
          break;
        }
      }
      return c1;
    }
    StringBuilder localStringBuilder = f.l("Unexpected end of DN: ");
    localStringBuilder.append(a);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final String c()
  {
    int i;
    int j;
    for (;;)
    {
      i = c;
      j = b;
      if ((i >= j) || (g[i] != ' ')) {
        break;
      }
      c = (i + 1);
    }
    if (i == j) {
      return null;
    }
    d = i;
    int k;
    do
    {
      c = (i + 1);
      i = c;
      j = b;
      if (i >= j) {
        break;
      }
      k = g[i];
    } while ((k != 61) && (k != 32));
    if (i < j)
    {
      e = i;
      if (g[i] == ' ')
      {
        for (;;)
        {
          i = c;
          k = b;
          if (i >= k) {
            break;
          }
          j = g[i];
          if ((j == 61) || (j != 32)) {
            break;
          }
          c = (i + 1);
        }
        if ((g[i] != '=') || (i == k))
        {
          localObject = f.l("Unexpected end of DN: ");
          ((StringBuilder)localObject).append(a);
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
      }
      i = c;
      do
      {
        c = (i + 1);
        i = c;
      } while ((i < b) && (g[i] == ' '));
      i = e;
      k = d;
      if (i - k > 4)
      {
        localObject = g;
        if (localObject[(k + 3)] == '.')
        {
          j = localObject[k];
          if (((j == 79) || (j == 111)) && ((localObject[(k + 1)] == 'I') || (localObject[(k + 1)] == 'i')) && ((localObject[(k + 2)] == 'D') || (localObject[(k + 2)] == 'd'))) {
            d = (k + 4);
          }
        }
      }
      localObject = g;
      j = d;
      return new String((char[])localObject, j, i - j);
    }
    Object localObject = f.l("Unexpected end of DN: ");
    ((StringBuilder)localObject).append(a);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     ib.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package la;

import f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public final class a
  implements Closeable
{
  public final Reader a;
  public final char[] b = new char['Ѐ'];
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public int f = 0;
  public int o = 0;
  public long p;
  public int q;
  public String r;
  public int[] s;
  public int t;
  public String[] u;
  public int[] v;
  
  public a(StringReader paramStringReader)
  {
    int[] arrayOfInt = new int[32];
    s = arrayOfInt;
    t = 1;
    arrayOfInt[0] = 6;
    u = new String[32];
    v = new int[32];
    a = paramStringReader;
  }
  
  public final boolean C(int paramInt)
  {
    char[] arrayOfChar = b;
    int i = f;
    int j = c;
    f = (i - j);
    i = d;
    if (i != j)
    {
      i -= j;
      d = i;
      System.arraycopy(arrayOfChar, j, arrayOfChar, 0, i);
    }
    else
    {
      d = 0;
    }
    c = 0;
    do
    {
      Reader localReader = a;
      j = d;
      j = localReader.read(arrayOfChar, j, arrayOfChar.length - j);
      if (j == -1) {
        break;
      }
      i = d + j;
      d = i;
      j = paramInt;
      if (e == 0)
      {
        int k = f;
        j = paramInt;
        if (k == 0)
        {
          j = paramInt;
          if (i > 0)
          {
            j = paramInt;
            if (arrayOfChar[0] == 65279)
            {
              c += 1;
              f = (k + 1);
              j = paramInt + 1;
            }
          }
        }
      }
      paramInt = j;
    } while (i < j);
    return true;
    return false;
  }
  
  public final String H()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('$');
    for (int i = 0; i < t; i++)
    {
      int j = s[i];
      if ((j != 1) && (j != 2))
      {
        if ((j == 3) || (j == 4) || (j == 5))
        {
          localStringBuilder.append('.');
          String str = u[i];
          if (str != null) {
            localStringBuilder.append(str);
          }
        }
      }
      else
      {
        j = v[i];
        localStringBuilder.append('[');
        localStringBuilder.append(j);
        localStringBuilder.append(']');
      }
    }
    return localStringBuilder.toString();
  }
  
  public final boolean I()
  {
    int i = o;
    int j = i;
    if (i == 0) {
      j = g();
    }
    boolean bool;
    if ((j != 2) && (j != 4) && (j != 17)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean M(char paramChar)
  {
    if ((paramChar != '\t') && (paramChar != '\n') && (paramChar != '\f') && (paramChar != '\r') && (paramChar != ' '))
    {
      if (paramChar != '#')
      {
        if (paramChar == ',') {
          break label112;
        }
        if ((paramChar != '/') && (paramChar != '='))
        {
          if ((paramChar == '{') || (paramChar == '}') || (paramChar == ':')) {
            break label112;
          }
          if (paramChar == ';') {}
        }
      }
      switch (paramChar)
      {
      default: 
        return true;
      case '\\': 
        f();
        throw null;
      }
    }
    label112:
    return false;
  }
  
  public final String Q()
  {
    int i = e;
    int j = c;
    int k = f;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" at line ");
    localStringBuilder.append(i + 1);
    localStringBuilder.append(" column ");
    localStringBuilder.append(j - k + 1);
    localStringBuilder.append(" path ");
    localStringBuilder.append(H());
    return localStringBuilder.toString();
  }
  
  public final int b0(boolean paramBoolean)
  {
    Object localObject = b;
    int i = c;
    int m;
    for (int j = d;; j = m)
    {
      int k = i;
      m = j;
      if (i == j)
      {
        c = i;
        if (!C(1))
        {
          if (!paramBoolean) {
            return -1;
          }
          localObject = f.l("End of input");
          ((StringBuilder)localObject).append(Q());
          throw new EOFException(((StringBuilder)localObject).toString());
        }
        k = c;
        m = d;
      }
      i = k + 1;
      k = localObject[k];
      if (k == 10)
      {
        e += 1;
        f = i;
      }
      else if ((k != 32) && (k != 13) && (k != 9))
      {
        if (k == 47)
        {
          c = i;
          if (i == m)
          {
            c = (i - 1);
            paramBoolean = C(2);
            c += 1;
            if (!paramBoolean) {
              return k;
            }
          }
          f();
          throw null;
        }
        c = i;
        if (k != 35) {
          return k;
        }
        f();
        throw null;
      }
    }
  }
  
  public final String c0(char paramChar)
  {
    char[] arrayOfChar = b;
    Object localObject1 = null;
    for (;;)
    {
      char c1 = c;
      int i = d;
      char c3;
      for (char c2 = c1;; c2 = c3)
      {
        if (c2 >= i) {
          break label638;
        }
        c3 = c2 + '\001';
        c2 = arrayOfChar[c2];
        if (c2 == paramChar)
        {
          c = c3;
          paramChar = c3 - c1 - 1;
          if (localObject1 == null) {
            return new String(arrayOfChar, c1, paramChar);
          }
          ((StringBuilder)localObject1).append(arrayOfChar, c1, paramChar);
          return ((StringBuilder)localObject1).toString();
        }
        char c4 = '\n';
        if (c2 == '\\')
        {
          c = c3;
          c2 = c3 - c1 - 1;
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new StringBuilder(Math.max((c2 + '\001') * 2, 16));
          }
          ((StringBuilder)localObject2).append(arrayOfChar, c1, c2);
          if ((c == d) && (!C(1)))
          {
            l0("Unterminated escape sequence");
            throw null;
          }
          localObject1 = b;
          c2 = c;
          c3 = c2 + '\001';
          c = c3;
          c1 = localObject1[c2];
          if (c1 != '\n')
          {
            c2 = c1;
            if (c1 != '"')
            {
              c2 = c1;
              if (c1 != '\'')
              {
                c2 = c1;
                if (c1 != '/')
                {
                  c2 = c1;
                  if (c1 != '\\') {
                    if (c1 != 'b')
                    {
                      if (c1 != 'f')
                      {
                        c5 = c4;
                        if (c1 == 'n') {
                          break label594;
                        }
                        if (c1 != 'r')
                        {
                          if (c1 != 't')
                          {
                            if (c1 == 'u')
                            {
                              if ((c3 + '\004' > d) && (!C(4)))
                              {
                                l0("Unterminated escape sequence");
                                throw null;
                              }
                              c2 = '\000';
                              c3 = c;
                              c1 = c3;
                              while (c1 < c3 + '\004')
                              {
                                i = b[c1];
                                c4 = (char)(c2 << '\004');
                                if ((i >= 48) && (i <= 57))
                                {
                                  c2 = i - 48;
                                }
                                else
                                {
                                  if ((i >= 97) && (i <= 102))
                                  {
                                    c2 = i - 97;
                                  }
                                  else
                                  {
                                    if ((i < 65) || (i > 70)) {
                                      break label466;
                                    }
                                    c2 = i - 65;
                                  }
                                  c2 += 10;
                                }
                                c2 = (char)(c2 + c4);
                                c1++;
                                continue;
                                label466:
                                localObject1 = f.l("\\u");
                                ((StringBuilder)localObject1).append(new String(b, c, 4));
                                throw new NumberFormatException(((StringBuilder)localObject1).toString());
                              }
                              c += 4;
                            }
                            else
                            {
                              l0("Invalid escape sequence");
                              throw null;
                            }
                          }
                          else
                          {
                            c2 = '\t';
                            c5 = c2;
                            break label594;
                          }
                        }
                        else
                        {
                          c2 = '\r';
                          c5 = c2;
                          break label594;
                        }
                      }
                      else
                      {
                        c2 = '\f';
                        c5 = c2;
                        break label594;
                      }
                    }
                    else
                    {
                      c2 = '\b';
                      c5 = c2;
                      break label594;
                    }
                  }
                }
              }
            }
          }
          else
          {
            e += 1;
            f = c3;
            c2 = c1;
          }
          char c5 = c2;
          label594:
          ((StringBuilder)localObject2).append(c5);
          localObject1 = localObject2;
          break;
        }
        if (c2 == '\n')
        {
          e += 1;
          f = c3;
        }
      }
      label638:
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new StringBuilder(Math.max((c2 - c1) * 2, 16));
      }
      ((StringBuilder)localObject2).append(arrayOfChar, c1, c2 - c1);
      c = c2;
      if (!C(1)) {
        break;
      }
      localObject1 = localObject2;
    }
    l0("Unterminated string");
    throw null;
  }
  
  public final void close()
  {
    o = 0;
    s[0] = 8;
    t = 1;
    a.close();
  }
  
  public final void f()
  {
    l0("Use JsonReader.setLenient(true) to accept malformed JSON");
    throw null;
  }
  
  public final int g()
  {
    Object localObject = s;
    int i = t;
    int j = localObject[(i - 1)];
    if (j == 1)
    {
      localObject[(i - 1)] = 2;
    }
    else if (j == 2)
    {
      i = b0(true);
      if (i != 44)
      {
        if (i != 59)
        {
          if (i == 93)
          {
            o = 4;
            return 4;
          }
          l0("Unterminated array");
          throw null;
        }
        f();
        throw null;
      }
    }
    else
    {
      if ((j == 3) || (j == 5)) {
        break label1103;
      }
      if (j == 4)
      {
        localObject[(i - 1)] = 5;
        i = b0(true);
        if (i != 58)
        {
          if (i != 61)
          {
            l0("Expected ':'");
            throw null;
          }
          f();
          throw null;
        }
      }
      else if (j == 6)
      {
        localObject[(i - 1)] = 7;
      }
      else
      {
        if (j == 7)
        {
          if (b0(false) == -1)
          {
            j = 17;
            break label1218;
          }
          f();
          throw null;
        }
        if (j == 8) {
          break label1093;
        }
      }
    }
    i = b0(true);
    label456:
    int m;
    if (i != 34)
    {
      if (i != 39)
      {
        if ((i != 44) && (i != 59)) {
          if (i != 91)
          {
            if (i != 93)
            {
              if (i != 123)
              {
                j = c - 1;
                c = j;
                j = b[j];
                String str;
                if ((j != 116) && (j != 84))
                {
                  if ((j != 102) && (j != 70))
                  {
                    if ((j != 110) && (j != 78)) {
                      break label456;
                    }
                    localObject = "null";
                    str = "NULL";
                    j = 7;
                  }
                  else
                  {
                    localObject = "false";
                    str = "FALSE";
                    j = 6;
                  }
                }
                else
                {
                  localObject = "true";
                  str = "TRUE";
                  j = 5;
                }
                int n = ((String)localObject).length();
                for (i = 1; i < n; i++)
                {
                  if ((c + i >= d) && (!C(i + 1))) {
                    break label456;
                  }
                  i2 = b[(c + i)];
                  if ((i2 != ((String)localObject).charAt(i)) && (i2 != str.charAt(i))) {
                    break label456;
                  }
                }
                if (((c + n < d) || (C(n + 1))) && (M(b[(c + n)])))
                {
                  j = 0;
                }
                else
                {
                  c += n;
                  o = j;
                }
                if (j != 0) {
                  return j;
                }
                localObject = b;
                int i3 = c;
                int i2 = d;
                i = 1;
                long l1 = 0L;
                int i4 = 0;
                int i1 = 0;
                int i5 = 0;
                for (;;)
                {
                  int i6 = i3;
                  int i7 = i2;
                  if (i3 + i4 == i2)
                  {
                    if (i4 == localObject.length) {
                      break;
                    }
                    if (C(i4 + 1))
                    {
                      i6 = c;
                      i7 = d;
                    }
                  }
                  else
                  {
                    char c1 = localObject[(i6 + i4)];
                    if (c1 == '+') {
                      break label966;
                    }
                    if ((c1 == 'E') || (c1 == 'e')) {
                      break label949;
                    }
                    if (c1 == '-') {
                      break label927;
                    }
                    if (c1 == '.') {
                      break label916;
                    }
                    if ((c1 >= '0') && (c1 <= '9'))
                    {
                      long l2;
                      if ((i1 != 1) && (i1 != 0))
                      {
                        if (i1 == 2)
                        {
                          if (l1 == 0L) {
                            break;
                          }
                          l2 = 10L * l1 - (c1 - '0');
                          int k = l1 < -922337203685477580L;
                          if ((k <= 0) && ((k != 0) || (l2 >= l1))) {
                            k = 0;
                          } else {
                            k = 1;
                          }
                          i &= k;
                          l1 = l2;
                          k = i1;
                        }
                        else
                        {
                          if (i1 != 3) {
                            break label739;
                          }
                          m = 4;
                        }
                        l2 = l1;
                        i2 = i;
                        break label789;
                        label739:
                        if (i1 != 5)
                        {
                          l2 = l1;
                          m = i1;
                          i2 = i;
                          if (i1 != 6) {}
                        }
                        else
                        {
                          m = 7;
                          l2 = l1;
                          i2 = i;
                        }
                      }
                      else
                      {
                        l2 = -(c1 - '0');
                        m = 2;
                        i2 = i;
                      }
                      label789:
                      l1 = l2;
                      i = i2;
                      break label975;
                    }
                    if (M(c1)) {
                      break;
                    }
                  }
                  if ((i1 == 2) && (i != 0) && ((l1 != Long.MIN_VALUE) || (i5 != 0)) && ((l1 != 0L) || (i5 == 0)))
                  {
                    if (i5 == 0) {
                      l1 = -l1;
                    }
                    p = l1;
                    c += i4;
                    m = 15;
                  }
                  else
                  {
                    if ((i1 != 2) && (i1 != 4) && (i1 != 7)) {
                      break;
                    }
                    q = i4;
                    m = 16;
                  }
                  o = m;
                  break label994;
                  label916:
                  if (i1 != 2) {
                    break;
                  }
                  m = 3;
                  break label975;
                  label927:
                  if (i1 == 0)
                  {
                    m = 1;
                    i5 = m;
                  }
                  else
                  {
                    if (i1 != 5) {
                      break;
                    }
                    break label972;
                    label949:
                    if ((i1 != 2) && (i1 != 4)) {
                      break;
                    }
                    m = 5;
                    break label975;
                    label966:
                    if (i1 != 5) {
                      break;
                    }
                    label972:
                    m = 6;
                  }
                  label975:
                  i4++;
                  i3 = i6;
                  i2 = i7;
                  i1 = m;
                }
                m = 0;
                label994:
                if (m != 0) {
                  return m;
                }
                if (!M(b[c]))
                {
                  l0("Expected value");
                  throw null;
                }
                f();
                throw null;
              }
              o = 1;
              return 1;
            }
            if (m == 1)
            {
              m = 4;
              break label1218;
            }
          }
          else
          {
            o = 3;
            return 3;
          }
        }
        if ((m != 1) && (m != 2))
        {
          l0("Unexpected value");
          throw null;
        }
        f();
        throw null;
      }
      else
      {
        f();
        throw null;
      }
    }
    else
    {
      m = 9;
      break label1218;
      label1093:
      throw new IllegalStateException("JsonReader is closed");
      label1103:
      localObject[(i - 1)] = 4;
      if (m == 5)
      {
        i = b0(true);
        if (i != 44)
        {
          if (i != 59)
          {
            if (i == 125)
            {
              o = 2;
              return 2;
            }
            l0("Unterminated object");
            throw null;
          }
          f();
          throw null;
        }
      }
      i = b0(true);
      if (i != 34)
      {
        if (i != 39)
        {
          if (i == 125)
          {
            if (m != 5)
            {
              o = 2;
              return 2;
            }
            l0("Expected name");
            throw null;
          }
          f();
          throw null;
        }
        f();
        throw null;
      }
      m = 13;
    }
    label1218:
    o = m;
    return m;
  }
  
  public final String h0()
  {
    int i = 0;
    int j = 0;
    Object localObject1 = null;
    for (;;)
    {
      int k = c;
      if (k + j < d)
      {
        k = b[(k + j)];
        if ((k == 9) || (k == 10) || (k == 12) || (k == 13) || (k == 32)) {
          break label186;
        }
        if (k != 35)
        {
          if (k == 44) {
            break label186;
          }
          if ((k != 47) && (k != 61))
          {
            if ((k == 123) || (k == 125) || (k == 58)) {
              break label186;
            }
            if (k == 59) {}
          }
        }
      }
      switch (k)
      {
      default: 
        j++;
        break;
      case 92: 
        f();
        throw null;
        if (j >= b.length) {
          break label192;
        }
        if (C(j + 1)) {
          continue;
        }
      }
      label186:
      Object localObject2 = localObject1;
      break label249;
      label192:
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new StringBuilder(Math.max(j, 16));
      }
      ((StringBuilder)localObject2).append(b, c, j);
      c += j;
      if (!C(1))
      {
        j = i;
        label249:
        if (localObject2 == null)
        {
          localObject2 = new String(b, c, j);
        }
        else
        {
          ((StringBuilder)localObject2).append(b, c, j);
          localObject2 = ((StringBuilder)localObject2).toString();
        }
        c += j;
        return (String)localObject2;
      }
      j = 0;
      localObject1 = localObject2;
    }
  }
  
  public final int i0()
  {
    int i = o;
    int j = i;
    if (i == 0) {
      j = g();
    }
    switch (j)
    {
    default: 
      throw new AssertionError();
    case 17: 
      return 10;
    case 15: 
    case 16: 
      return 7;
    case 12: 
    case 13: 
    case 14: 
      return 5;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      return 6;
    case 7: 
      return 9;
    case 5: 
    case 6: 
      return 8;
    case 4: 
      return 2;
    case 3: 
      return 1;
    case 2: 
      return 4;
    }
    return 3;
  }
  
  public final void k0(int paramInt)
  {
    int i = t;
    int[] arrayOfInt = s;
    if (i == arrayOfInt.length)
    {
      i *= 2;
      s = Arrays.copyOf(arrayOfInt, i);
      v = Arrays.copyOf(v, i);
      u = ((String[])Arrays.copyOf(u, i));
    }
    arrayOfInt = s;
    i = t;
    t = (i + 1);
    arrayOfInt[i] = paramInt;
  }
  
  public final void l0(String paramString)
  {
    paramString = f.l(paramString);
    paramString.append(Q());
    throw new y3.a(paramString.toString());
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.class.getSimpleName());
    localStringBuilder.append(Q());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     la.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
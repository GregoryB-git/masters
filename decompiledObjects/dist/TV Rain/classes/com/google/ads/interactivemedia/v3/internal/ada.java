package com.google.ads.interactivemedia.v3.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import z2;

public class ada
  implements Closeable
{
  private static final char[] b = ")]}'\n".toCharArray();
  public int a = 0;
  private final Reader c;
  private boolean d = false;
  private final char[] e = new char['Ѐ'];
  private int f = 0;
  private int g = 0;
  private int h = 0;
  private int i = 0;
  private long j;
  private int k;
  private String l;
  private int[] m;
  private int n;
  private String[] o;
  private int[] p;
  
  static
  {
    zs.a = new acz();
  }
  
  public ada(Reader paramReader)
  {
    int[] arrayOfInt = new int[32];
    m = arrayOfInt;
    n = (0 + 1);
    arrayOfInt[0] = 6;
    o = new String[32];
    p = new int[32];
    if (paramReader != null)
    {
      c = paramReader;
      return;
    }
    throw new NullPointerException("in == null");
  }
  
  private final IOException a(String paramString)
    throws IOException
  {
    paramString = z2.t(paramString);
    paramString.append(s());
    throw new ade(paramString.toString());
  }
  
  private final void a(int paramInt)
  {
    int i1 = n;
    int[] arrayOfInt1 = m;
    if (i1 == arrayOfInt1.length)
    {
      int[] arrayOfInt2 = new int[i1 << 1];
      arrayOfInt3 = new int[i1 << 1];
      String[] arrayOfString = new String[i1 << 1];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, i1);
      System.arraycopy(p, 0, arrayOfInt3, 0, n);
      System.arraycopy(o, 0, arrayOfString, 0, n);
      m = arrayOfInt2;
      p = arrayOfInt3;
      o = arrayOfString;
    }
    int[] arrayOfInt3 = m;
    i1 = n;
    n = (i1 + 1);
    arrayOfInt3[i1] = paramInt;
  }
  
  private final boolean a(char paramChar)
    throws IOException
  {
    if ((paramChar != '\t') && (paramChar != '\n') && (paramChar != '\f') && (paramChar != '\r') && (paramChar != ' '))
    {
      if (paramChar != '#')
      {
        if (paramChar == ',') {
          break label110;
        }
        if ((paramChar != '/') && (paramChar != '='))
        {
          if ((paramChar == '{') || (paramChar == '}') || (paramChar == ':')) {
            break label110;
          }
          if (paramChar == ';') {}
        }
      }
      switch (paramChar)
      {
      default: 
        return true;
      case '\\': 
        t();
      }
    }
    label110:
    return false;
  }
  
  private final int b(boolean paramBoolean)
    throws IOException
  {
    Object localObject = e;
    int i1 = f;
    int i2 = g;
    for (;;)
    {
      int i3 = 1;
      int i4 = i1;
      int i5 = i2;
      if (i1 == i2)
      {
        f = i1;
        if (b(1))
        {
          i4 = f;
          i5 = g;
        }
        else
        {
          if (!paramBoolean) {
            return -1;
          }
          localObject = new StringBuilder("End of input");
          ((StringBuilder)localObject).append(s());
          throw new EOFException(((StringBuilder)localObject).toString());
        }
      }
      i1 = i4 + 1;
      i2 = localObject[i4];
      if (i2 == 10)
      {
        h += 1;
        i = i1;
      }
      else if ((i2 != 32) && (i2 != 13) && (i2 != 9))
      {
        if (i2 == 47)
        {
          f = i1;
          if (i1 == i5)
          {
            f = (i1 - 1);
            boolean bool = b(2);
            f += 1;
            if (!bool) {
              return i2;
            }
          }
          t();
          i5 = f;
          i1 = localObject[i5];
          if (i1 != 42)
          {
            if (i1 != 47) {
              return i2;
            }
            f = (i5 + 1);
            u();
            i1 = f;
            i2 = g;
            continue;
          }
          for (f = (i5 + 1);; f += 1)
          {
            i2 = f;
            i5 = g;
            i1 = 0;
            if ((i2 + 2 > i5) && (!b(2)))
            {
              i2 = 0;
              break;
            }
            char[] arrayOfChar = e;
            i2 = f;
            if (arrayOfChar[i2] == '\n')
            {
              h += 1;
              i = (i2 + 1);
            }
            else
            {
              for (;;)
              {
                i2 = i3;
                if (i1 >= 2) {
                  break label399;
                }
                if (e[(f + i1)] != "*/".charAt(i1)) {
                  break;
                }
                i1++;
              }
            }
          }
          label399:
          if (i2 != 0)
          {
            i1 = f + 2;
            i2 = g;
            continue;
          }
          throw a("Unterminated comment");
        }
        if (i2 == 35)
        {
          f = i1;
          t();
          u();
          i1 = f;
          i2 = g;
          continue;
        }
        f = i1;
        return i2;
      }
      i2 = i5;
    }
  }
  
  private final String b(char paramChar)
    throws IOException
  {
    char[] arrayOfChar = e;
    Object localObject2;
    for (Object localObject1 = null;; localObject1 = localObject2)
    {
      char c1 = f;
      char c2 = g;
      char c3 = c1;
      while (c1 < c2)
      {
        char c4 = c1 + '\001';
        c1 = arrayOfChar[c1];
        if (c1 == paramChar)
        {
          f = c4;
          paramChar = c4 - c3 - 1;
          if (localObject1 == null) {
            return new String(arrayOfChar, c3, paramChar);
          }
          ((StringBuilder)localObject1).append(arrayOfChar, c3, paramChar);
          return ((StringBuilder)localObject1).toString();
        }
        if (c1 == '\\')
        {
          f = c4;
          c1 = c4 - c3 - 1;
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new StringBuilder(Math.max(c1 + '\001' << 1, 16));
          }
          ((StringBuilder)localObject2).append(arrayOfChar, c3, c1);
          ((StringBuilder)localObject2).append(v());
          c3 = f;
          c2 = g;
          c1 = c3;
          localObject1 = localObject2;
        }
        else
        {
          if (c1 == '\n')
          {
            h += 1;
            i = c4;
          }
          c1 = c4;
        }
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new StringBuilder(Math.max(c1 - c3 << 1, 16));
      }
      ((StringBuilder)localObject2).append(arrayOfChar, c3, c1 - c3);
      f = c1;
      if (!b(1)) {
        break;
      }
    }
    throw a("Unterminated string");
  }
  
  private final boolean b(int paramInt)
    throws IOException
  {
    char[] arrayOfChar = e;
    int i1 = i;
    int i2 = f;
    i = (i1 - i2);
    i1 = g;
    if (i1 != i2)
    {
      i1 -= i2;
      g = i1;
      System.arraycopy(arrayOfChar, i2, arrayOfChar, 0, i1);
    }
    else
    {
      g = 0;
    }
    f = 0;
    do
    {
      Reader localReader = c;
      i2 = g;
      i2 = localReader.read(arrayOfChar, i2, arrayOfChar.length - i2);
      if (i2 == -1) {
        break;
      }
      i1 = g + i2;
      g = i1;
      i2 = paramInt;
      if (h == 0)
      {
        int i3 = i;
        i2 = paramInt;
        if (i3 == 0)
        {
          i2 = paramInt;
          if (i1 > 0)
          {
            i2 = paramInt;
            if (arrayOfChar[0] == 65279)
            {
              f += 1;
              i = (i3 + 1);
              i2 = paramInt + 1;
            }
          }
        }
      }
      paramInt = i2;
    } while (i1 < i2);
    return true;
    return false;
  }
  
  private final void c(char paramChar)
    throws IOException
  {
    char[] arrayOfChar = e;
    do
    {
      char c1 = f;
      char c2 = g;
      while (c1 < c2)
      {
        char c3 = c1 + '\001';
        c1 = arrayOfChar[c1];
        if (c1 == paramChar)
        {
          f = c3;
          return;
        }
        if (c1 == '\\')
        {
          f = c3;
          v();
          c1 = f;
          c2 = g;
        }
        else
        {
          if (c1 == '\n')
          {
            h += 1;
            i = c3;
          }
          c1 = c3;
        }
      }
      f = c1;
    } while (b(1));
    throw a("Unterminated string");
  }
  
  private final String o()
    throws IOException
  {
    int i1 = 0;
    Object localObject1 = null;
    label165:
    label187:
    label190:
    Object localObject2;
    do
    {
      i2 = 0;
      do
      {
        for (;;)
        {
          int i3 = f;
          if (i3 + i2 >= g) {
            break label165;
          }
          i3 = e[(i3 + i2)];
          if ((i3 == 9) || (i3 == 10) || (i3 == 12) || (i3 == 13) || (i3 == 32)) {
            break label187;
          }
          if (i3 == 35) {
            break;
          }
          if (i3 == 44) {
            break label187;
          }
          if ((i3 == 47) || (i3 == 61)) {
            break;
          }
          if ((i3 == 123) || (i3 == 125) || (i3 == 58)) {
            break label187;
          }
          if (i3 == 59) {
            break;
          }
          switch (i3)
          {
          default: 
            i2++;
          }
        }
        t();
        break;
        if (i2 >= e.length) {
          break label190;
        }
      } while (b(i2 + 1));
      break;
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new StringBuilder(Math.max(i2, 16));
      }
      ((StringBuilder)localObject2).append(e, f, i2);
      f += i2;
      localObject1 = localObject2;
    } while (b(1));
    localObject1 = localObject2;
    int i2 = i1;
    if (localObject1 == null)
    {
      localObject1 = new String(e, f, i2);
    }
    else
    {
      ((StringBuilder)localObject1).append(e, f, i2);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    f += i2;
    return (String)localObject1;
  }
  
  private final void t()
    throws IOException
  {
    if (d) {
      return;
    }
    throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
  }
  
  private final void u()
    throws IOException
  {
    int i1;
    do
    {
      if ((f >= g) && (!b(1))) {
        break;
      }
      char[] arrayOfChar = e;
      i1 = f;
      int i2 = i1 + 1;
      f = i2;
      i1 = arrayOfChar[i1];
      if (i1 == 10)
      {
        h += 1;
        i = i2;
        return;
      }
    } while (i1 != 13);
  }
  
  private final char v()
    throws IOException
  {
    if ((f == g) && (!b(1))) {
      throw a("Unterminated escape sequence");
    }
    Object localObject = e;
    int i1 = f;
    int i2 = i1 + 1;
    f = i2;
    char c1 = localObject[i1];
    if (c1 != '\n')
    {
      if ((c1 != '"') && (c1 != '\'') && (c1 != '/') && (c1 != '\\'))
      {
        if (c1 != 'b')
        {
          if (c1 != 'f')
          {
            if (c1 != 'n')
            {
              if (c1 != 'r')
              {
                if (c1 != 't')
                {
                  if (c1 == 'u')
                  {
                    if ((i2 + 4 > g) && (!b(4))) {
                      throw a("Unterminated escape sequence");
                    }
                    int i3 = 0;
                    i2 = f;
                    i1 = i2;
                    int i4;
                    for (c1 = i3;; c1 = i4)
                    {
                      i3 = i1;
                      if (i3 >= i2 + 4) {
                        break label317;
                      }
                      i1 = e[i3];
                      i4 = (char)(c1 << '\004');
                      if ((i1 >= 48) && (i1 <= 57))
                      {
                        i1 -= 48;
                        i4 = (char)(i1 + i4);
                      }
                      else
                      {
                        if ((i1 >= 97) && (i1 <= 102)) {
                          i1 -= 97;
                        }
                        for (;;)
                        {
                          i1 += 10;
                          break;
                          if ((i1 < 65) || (i1 > 70)) {
                            break label274;
                          }
                          i1 -= 65;
                        }
                      }
                      i1 = i3 + 1;
                    }
                    label274:
                    localObject = new StringBuilder("\\u");
                    ((StringBuilder)localObject).append(new String(e, f, 4));
                    throw new NumberFormatException(((StringBuilder)localObject).toString());
                    label317:
                    f += 4;
                    return c1;
                  }
                  throw a("Invalid escape sequence");
                }
                return '\t';
              }
              return '\r';
            }
            return '\n';
          }
          return '\f';
        }
        return '\b';
      }
    }
    else
    {
      h += 1;
      i = i2;
    }
    return c1;
  }
  
  public void a()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 3)
    {
      a(1);
      p[(n - 1)] = 0;
      a = 0;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected BEGIN_ARRAY but was ");
    localStringBuilder.append(f());
    localStringBuilder.append(s());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final void a(boolean paramBoolean)
  {
    d = paramBoolean;
  }
  
  public void b()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 4)
    {
      i2 = n - 1;
      n = i2;
      localObject = p;
      i2--;
      localObject[i2] += 1;
      a = 0;
      return;
    }
    Object localObject = new StringBuilder("Expected END_ARRAY but was ");
    ((StringBuilder)localObject).append(f());
    ((StringBuilder)localObject).append(s());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void c()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 1)
    {
      a(3);
      a = 0;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected BEGIN_OBJECT but was ");
    localStringBuilder.append(f());
    localStringBuilder.append(s());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public void close()
    throws IOException
  {
    a = 0;
    m[0] = 8;
    n = 1;
    c.close();
  }
  
  public void d()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 2)
    {
      i2 = n - 1;
      n = i2;
      o[i2] = null;
      localObject = p;
      i2--;
      localObject[i2] += 1;
      a = 0;
      return;
    }
    Object localObject = new StringBuilder("Expected END_OBJECT but was ");
    ((StringBuilder)localObject).append(f());
    ((StringBuilder)localObject).append(s());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public boolean e()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    return (i2 != 2) && (i2 != 4);
  }
  
  public adc f()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    switch (i2)
    {
    default: 
      throw new AssertionError();
    case 17: 
      return adc.j;
    case 15: 
    case 16: 
      return adc.g;
    case 12: 
    case 13: 
    case 14: 
      return adc.e;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      return adc.f;
    case 7: 
      return adc.i;
    case 5: 
    case 6: 
      return adc.h;
    case 4: 
      return adc.b;
    case 3: 
      return adc.a;
    case 2: 
      return adc.d;
    }
    return adc.c;
  }
  
  public String g()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 14)
    {
      localObject = o();
    }
    else if (i2 == 12)
    {
      localObject = b('\'');
    }
    else
    {
      if (i2 != 13) {
        break label78;
      }
      localObject = b('"');
    }
    a = 0;
    o[(n - 1)] = localObject;
    return (String)localObject;
    label78:
    Object localObject = new StringBuilder("Expected a name but was ");
    ((StringBuilder)localObject).append(f());
    ((StringBuilder)localObject).append(s());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public String h()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 10)
    {
      localObject = o();
    }
    else if (i2 == 8)
    {
      localObject = b('\'');
    }
    else if (i2 == 9)
    {
      localObject = b('"');
    }
    else if (i2 == 11)
    {
      localObject = l;
      l = null;
    }
    else if (i2 == 15)
    {
      localObject = Long.toString(j);
    }
    else
    {
      if (i2 != 16) {
        break label167;
      }
      localObject = new String(e, f, k);
      f += k;
    }
    a = 0;
    int[] arrayOfInt = p;
    i2 = n - 1;
    arrayOfInt[i2] += 1;
    return (String)localObject;
    label167:
    Object localObject = new StringBuilder("Expected a string but was ");
    ((StringBuilder)localObject).append(f());
    ((StringBuilder)localObject).append(s());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public boolean i()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 5)
    {
      a = 0;
      localObject = p;
      i2 = n - 1;
      localObject[i2] += 1;
      return true;
    }
    if (i2 == 6)
    {
      a = 0;
      localObject = p;
      i2 = n - 1;
      localObject[i2] += 1;
      return false;
    }
    Object localObject = new StringBuilder("Expected a boolean but was ");
    ((StringBuilder)localObject).append(f());
    ((StringBuilder)localObject).append(s());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void j()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 7)
    {
      a = 0;
      localObject = p;
      i2 = n - 1;
      localObject[i2] += 1;
      return;
    }
    Object localObject = new StringBuilder("Expected null but was ");
    ((StringBuilder)localObject).append(f());
    ((StringBuilder)localObject).append(s());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public double k()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 15)
    {
      a = 0;
      localObject = p;
      i2 = n - 1;
      localObject[i2] += 1;
      return j;
    }
    if (i2 == 16)
    {
      l = new String(e, f, k);
      f += k;
    }
    else if ((i2 != 8) && (i2 != 9))
    {
      if (i2 == 10)
      {
        l = o();
      }
      else if (i2 != 11)
      {
        localObject = new StringBuilder("Expected a double but was ");
        ((StringBuilder)localObject).append(f());
        ((StringBuilder)localObject).append(s());
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
    }
    else
    {
      int i3;
      if (i2 == 8)
      {
        i2 = 39;
        i3 = i2;
      }
      else
      {
        i2 = 34;
        i3 = i2;
      }
      l = b(i3);
    }
    a = 11;
    double d1 = Double.parseDouble(l);
    if ((!d) && ((Double.isNaN(d1)) || (Double.isInfinite(d1))))
    {
      localObject = new StringBuilder("JSON forbids NaN and infinities: ");
      ((StringBuilder)localObject).append(d1);
      ((StringBuilder)localObject).append(s());
      throw new ade(((StringBuilder)localObject).toString());
    }
    l = null;
    a = 0;
    Object localObject = p;
    i2 = n - 1;
    localObject[i2] += 1;
    return d1;
  }
  
  public long l()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 15)
    {
      a = 0;
      localObject = p;
      i2 = n - 1;
      localObject[i2] += 1;
      return j;
    }
    if (i2 == 16)
    {
      l = new String(e, f, k);
      f += k;
    }
    else
    {
      if ((i2 != 8) && (i2 != 9) && (i2 != 10))
      {
        localObject = new StringBuilder("Expected a long but was ");
        ((StringBuilder)localObject).append(f());
        ((StringBuilder)localObject).append(s());
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
      if (i2 == 10)
      {
        l = o();
      }
      else
      {
        int i3;
        if (i2 == 8)
        {
          i2 = 39;
          i3 = i2;
        }
        else
        {
          i2 = 34;
          i3 = i2;
        }
        l = b(i3);
      }
    }
    try
    {
      l1 = Long.parseLong(l);
      a = 0;
      localObject = p;
      i2 = n - 1;
      localObject[i2] += 1;
      return l1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      long l1;
      double d1;
      for (;;) {}
    }
    a = 11;
    d1 = Double.parseDouble(l);
    l1 = d1;
    if (l1 == d1)
    {
      l = null;
      a = 0;
      localObject = p;
      i2 = n - 1;
      localObject[i2] += 1;
      return l1;
    }
    Object localObject = new StringBuilder("Expected a long but was ");
    ((StringBuilder)localObject).append(l);
    ((StringBuilder)localObject).append(s());
    throw new NumberFormatException(((StringBuilder)localObject).toString());
  }
  
  public int m()
    throws IOException
  {
    int i1 = a;
    int i2 = i1;
    if (i1 == 0) {
      i2 = r();
    }
    if (i2 == 15)
    {
      long l1 = j;
      i2 = (int)l1;
      if (l1 == i2)
      {
        a = 0;
        localObject = p;
        i1 = n - 1;
        localObject[i1] += 1;
        return i2;
      }
      localObject = new StringBuilder("Expected an int but was ");
      ((StringBuilder)localObject).append(j);
      ((StringBuilder)localObject).append(s());
      throw new NumberFormatException(((StringBuilder)localObject).toString());
    }
    if (i2 == 16)
    {
      l = new String(e, f, k);
      f += k;
    }
    else
    {
      if ((i2 != 8) && (i2 != 9) && (i2 != 10))
      {
        localObject = new StringBuilder("Expected an int but was ");
        ((StringBuilder)localObject).append(f());
        ((StringBuilder)localObject).append(s());
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
      if (i2 == 10)
      {
        l = o();
      }
      else
      {
        int i3;
        if (i2 == 8)
        {
          i2 = 39;
          i3 = i2;
        }
        else
        {
          i2 = 34;
          i3 = i2;
        }
        l = b(i3);
      }
    }
    try
    {
      i2 = Integer.parseInt(l);
      a = 0;
      localObject = p;
      i1 = n - 1;
      localObject[i1] += 1;
      return i2;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      double d1;
      for (;;) {}
    }
    a = 11;
    d1 = Double.parseDouble(l);
    i1 = (int)d1;
    if (i1 == d1)
    {
      l = null;
      a = 0;
      localObject = p;
      i2 = n - 1;
      localObject[i2] += 1;
      return i1;
    }
    Object localObject = new StringBuilder("Expected an int but was ");
    ((StringBuilder)localObject).append(l);
    ((StringBuilder)localObject).append(s());
    throw new NumberFormatException(((StringBuilder)localObject).toString());
  }
  
  public void n()
    throws IOException
  {
    int i1 = 0;
    label322:
    label337:
    label354:
    do
    {
      i2 = a;
      int i3 = i2;
      if (i2 == 0) {
        i3 = r();
      }
      if (i3 == 3) {
        a(1);
      }
      for (;;)
      {
        i2 = i1 + 1;
        break label354;
        if (i3 != 1) {
          break;
        }
        a(3);
      }
      if (i3 == 4) {}
      for (n -= 1;; n -= 1)
      {
        i2 = i1 - 1;
        break label354;
        if (i3 != 2) {
          break;
        }
      }
      if ((i3 != 14) && (i3 != 10))
      {
        if ((i3 != 8) && (i3 != 12))
        {
          if ((i3 != 9) && (i3 != 13))
          {
            i2 = i1;
            if (i3 == 16)
            {
              f += k;
              i2 = i1;
            }
          }
          else
          {
            c('"');
            i2 = i1;
          }
        }
        else
        {
          c('\'');
          i2 = i1;
        }
      }
      else
      {
        do
        {
          for (i2 = 0;; i2++)
          {
            i3 = f;
            if (i3 + i2 >= g) {
              break label337;
            }
            i3 = e[(i3 + i2)];
            if ((i3 == 9) || (i3 == 10) || (i3 == 12) || (i3 == 13) || (i3 == 32)) {
              break label322;
            }
            if (i3 == 35) {
              break;
            }
            if (i3 == 44) {
              break label322;
            }
            if ((i3 == 47) || (i3 == 61)) {
              break;
            }
            if ((i3 == 123) || (i3 == 125) || (i3 == 58)) {
              break label322;
            }
            if (i3 == 59) {
              break;
            }
            switch (i3)
            {
            }
          }
          t();
          f += i2;
          i2 = i1;
          break;
          f = (i3 + i2);
        } while (b(1));
        i2 = i1;
      }
      a = 0;
      i1 = i2;
    } while (i2 != 0);
    int[] arrayOfInt = p;
    int i2 = n;
    i1 = i2 - 1;
    arrayOfInt[i1] += 1;
    o[(i2 - 1)] = "null";
  }
  
  public String p()
  {
    StringBuilder localStringBuilder = new StringBuilder("$");
    int i1 = n;
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = m[i2];
      if ((i3 != 1) && (i3 != 2))
      {
        if ((i3 == 3) || (i3 == 4) || (i3 == 5))
        {
          localStringBuilder.append('.');
          String str = o[i2];
          if (str != null) {
            localStringBuilder.append(str);
          }
        }
      }
      else
      {
        localStringBuilder.append('[');
        localStringBuilder.append(p[i2]);
        localStringBuilder.append(']');
      }
    }
    return localStringBuilder.toString();
  }
  
  public final boolean q()
  {
    return d;
  }
  
  public final int r()
    throws IOException
  {
    Object localObject = m;
    int i1 = n;
    int i4 = localObject[(i1 - 1)];
    if (i4 == 1)
    {
      localObject[(i1 - 1)] = 2;
    }
    else if (i4 == 2)
    {
      i1 = b(true);
      if (i1 != 44)
      {
        if (i1 != 59)
        {
          if (i1 == 93)
          {
            a = 4;
            return 4;
          }
          throw a("Unterminated array");
        }
        t();
      }
    }
    else
    {
      if ((i4 == 3) || (i4 == 5)) {
        break label1324;
      }
      if (i4 == 4)
      {
        localObject[(i1 - 1)] = 5;
        i1 = b(true);
        if (i1 != 58) {
          if (i1 == 61)
          {
            t();
            if ((f < g) || (b(1)))
            {
              localObject = e;
              i1 = f;
              if (localObject[i1] == '>') {
                f = (i1 + 1);
              }
            }
          }
          else
          {
            throw a("Expected ':'");
          }
        }
      }
      else if (i4 == 6)
      {
        if (d)
        {
          b(true);
          i1 = f - 1;
          f = i1;
          localObject = b;
          if ((i1 + localObject.length <= g) || (b(localObject.length)))
          {
            for (i1 = 0;; i1++)
            {
              localObject = b;
              if (i1 >= localObject.length) {
                break;
              }
              if (e[(f + i1)] != localObject[i1]) {
                break label283;
              }
            }
            f += localObject.length;
          }
        }
        label283:
        m[(n - 1)] = 7;
      }
      else if (i4 == 7)
      {
        if (b(false) == -1)
        {
          a = 17;
          return 17;
        }
        t();
        f -= 1;
      }
      else
      {
        if (i4 == 8) {
          break label1313;
        }
      }
    }
    i1 = b(true);
    if (i1 != 34)
    {
      if (i1 != 39)
      {
        if ((i1 != 44) && (i1 != 59)) {
          if (i1 != 91)
          {
            if (i1 != 93)
            {
              if (i1 != 123)
              {
                i1 = f - 1;
                f = i1;
                i1 = e[i1];
                String str;
                if ((i1 != 116) && (i1 != 84))
                {
                  if ((i1 != 102) && (i1 != 70))
                  {
                    if ((i1 != 110) && (i1 != 78)) {
                      break label623;
                    }
                    localObject = "null";
                    str = "NULL";
                    i1 = 7;
                  }
                  else
                  {
                    localObject = "false";
                    str = "FALSE";
                    i1 = 6;
                  }
                }
                else
                {
                  localObject = "true";
                  str = "TRUE";
                  i1 = 5;
                }
                int i5 = ((String)localObject).length();
                for (i4 = 1; i4 < i5; i4++)
                {
                  if ((f + i4 >= g) && (!b(i4 + 1))) {
                    break label623;
                  }
                  i7 = e[(f + i4)];
                  if ((i7 != ((String)localObject).charAt(i4)) && (i7 != str.charAt(i4))) {
                    break label623;
                  }
                }
                if (((f + i5 < g) || (b(i5 + 1))) && (a(e[(f + i5)])))
                {
                  label623:
                  i1 = 0;
                }
                else
                {
                  f += i5;
                  a = i1;
                }
                if (i1 != 0) {
                  return i1;
                }
                localObject = e;
                int i8 = f;
                int i7 = g;
                long l1 = 0L;
                int i6 = 0;
                i1 = i6;
                int i9 = i1;
                i4 = 1;
                long l2 = 0L;
                int i10 = i1;
                for (;;)
                {
                  int i11 = i8;
                  int i12 = i7;
                  if (i8 + i10 == i7)
                  {
                    if (i10 == localObject.length) {
                      break label1076;
                    }
                    if (b(i10 + 1))
                    {
                      i11 = f;
                      i12 = g;
                    }
                  }
                  else
                  {
                    char c1 = localObject[(i11 + i10)];
                    if (c1 == '+') {
                      break label1152;
                    }
                    if ((c1 == 'E') || (c1 == 'e')) {
                      break label1135;
                    }
                    if (c1 == '-') {
                      break label1110;
                    }
                    if (c1 == '.') {
                      break label1099;
                    }
                    if ((c1 >= '0') && (c1 <= '9'))
                    {
                      if ((i6 != 1) && (i6 != 0))
                      {
                        if (i6 == 2)
                        {
                          if (l2 == l1) {
                            break label1076;
                          }
                          l3 = 10L * l2 - (c1 - '0');
                          i2 = l2 < -922337203685477580L;
                          if ((i2 <= 0) && ((i2 != 0) || (l3 >= l2))) {
                            i2 = 0;
                          } else {
                            i2 = 1;
                          }
                          i7 = i4 & i2;
                          i2 = i6;
                        }
                        else if (i6 == 3)
                        {
                          i3 = 4;
                          i7 = i4;
                          l3 = l2;
                        }
                        else if (i6 != 5)
                        {
                          i3 = i6;
                          i7 = i4;
                          l3 = l2;
                          if (i6 != 6) {}
                        }
                        else
                        {
                          i3 = 7;
                          i7 = i4;
                          l3 = l2;
                        }
                      }
                      else
                      {
                        l3 = -(c1 - '0');
                        i3 = 2;
                        i7 = i4;
                      }
                      l1 = 0L;
                      i4 = i7;
                      l2 = l3;
                      break label1161;
                    }
                    else if (a(c1)) {}
                  }
                  if ((i6 == 2) && (i4 != 0) && ((l2 != Long.MIN_VALUE) || (i9 != 0)) && ((l2 != 0L) || (i9 == 0)))
                  {
                    if (i9 == 0) {
                      l2 = -l2;
                    }
                    j = l2;
                    f += i10;
                    i3 = 15;
                    a = 15;
                    break;
                  }
                  if ((i6 != 2) && (i6 != 4) && (i6 != 7)) {}
                  label1076:
                  label1099:
                  label1110:
                  label1135:
                  label1152:
                  while (i6 != 5)
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          long l3;
                          int i2;
                          i3 = 0;
                          break;
                          k = i10;
                          i3 = 16;
                          a = 16;
                          break;
                        } while (i6 != 2);
                        i3 = 3;
                        break;
                        if (i6 == 0)
                        {
                          i3 = 1;
                          i9 = 1;
                          break;
                        }
                      } while (i6 != 5);
                      i3 = 6;
                      break;
                    } while ((i6 != 2) && (i6 != 4));
                    i3 = 5;
                    break;
                  }
                  i3 = 6;
                  label1161:
                  i10++;
                  i8 = i11;
                  i7 = i12;
                  i6 = i3;
                }
                if (i3 != 0) {
                  return i3;
                }
                if (a(e[f]))
                {
                  t();
                  a = 10;
                  return 10;
                }
                throw a("Expected value");
              }
              a = 1;
              return 1;
            }
            if (i4 == 1)
            {
              a = 4;
              return 4;
            }
          }
          else
          {
            a = 3;
            return 3;
          }
        }
        if ((i4 != 1) && (i4 != 2)) {
          throw a("Unexpected value");
        }
        t();
        f -= 1;
        a = 7;
        return 7;
      }
      t();
      a = 8;
      return 8;
    }
    a = 9;
    return 9;
    label1313:
    throw new IllegalStateException("JsonReader is closed");
    label1324:
    localObject[(i3 - 1)] = 4;
    if (i4 == 5)
    {
      i3 = b(true);
      if (i3 != 44)
      {
        if (i3 != 59)
        {
          if (i3 == 125)
          {
            a = 2;
            return 2;
          }
          throw a("Unterminated object");
        }
        t();
      }
    }
    int i3 = b(true);
    if (i3 != 34)
    {
      if (i3 != 39)
      {
        if (i3 != 125)
        {
          t();
          f -= 1;
          if (a((char)i3))
          {
            a = 14;
            return 14;
          }
          throw a("Expected name");
        }
        if (i4 != 5)
        {
          a = 2;
          return 2;
        }
        throw a("Expected name");
      }
      t();
      a = 12;
      return 12;
    }
    a = 13;
    return 13;
  }
  
  public final String s()
  {
    int i1 = h;
    int i2 = f;
    int i3 = i;
    StringBuilder localStringBuilder = new StringBuilder(" at line ");
    localStringBuilder.append(i1 + 1);
    localStringBuilder.append(" column ");
    localStringBuilder.append(i2 - i3 + 1);
    localStringBuilder.append(" path ");
    localStringBuilder.append(p());
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append(s());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ada
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
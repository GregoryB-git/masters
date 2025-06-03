package mc;

import a0.j;
import ec.i;
import java.util.concurrent.TimeUnit;

public final class a
  implements Comparable<a>
{
  public static final long b = Long.MAX_VALUE;
  public static final long c = -9223372036854775805L;
  public final long a;
  
  static
  {
    int i = b.a;
  }
  
  public static final boolean f(long paramLong)
  {
    boolean bool;
    if ((paramLong != b) && (paramLong != c)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static final long g(long paramLong, c paramc)
  {
    i.e(paramc, "unit");
    if (paramLong == b)
    {
      paramLong = Long.MAX_VALUE;
    }
    else if (paramLong == c)
    {
      paramLong = Long.MIN_VALUE;
    }
    else
    {
      int i = 1;
      if (((int)paramLong & 0x1) != 0) {
        i = 0;
      }
      c localc;
      if (i != 0) {
        localc = c.b;
      } else {
        localc = c.c;
      }
      i.e(localc, "sourceUnit");
      paramLong = a.convert(paramLong >> 1, a);
    }
    return paramLong;
  }
  
  public final int compareTo(Object paramObject)
  {
    long l1 = a;
    long l2 = a;
    long l3 = l2 ^ l1;
    int i = 0;
    boolean bool = false;
    if ((l3 >= 0L) && (((int)l3 & 0x1) != 0))
    {
      int j = ((int)l2 & 0x1) - ((int)l1 & 0x1);
      if (l2 < 0L) {
        bool = true;
      }
      i = j;
      if (bool) {
        i = -j;
      }
    }
    else
    {
      bool = l2 < l1;
      if (bool) {
        i = -1;
      } else if (bool) {
        i = 1;
      }
    }
    return i;
  }
  
  public final boolean equals(Object paramObject)
  {
    long l = a;
    boolean bool1 = paramObject instanceof a;
    boolean bool2 = false;
    if ((bool1) && (l == a)) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    long l = a;
    return (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    long l1 = a;
    boolean bool = l1 < 0L;
    String str1;
    if (!bool)
    {
      str1 = "0s";
    }
    else if (l1 == b)
    {
      str1 = "Infinity";
    }
    else if (l1 == c)
    {
      str1 = "-Infinity";
    }
    else
    {
      int j;
      if (bool) {
        j = 1;
      } else {
        j = 0;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      if (j != 0) {
        localStringBuilder.append('-');
      }
      if (bool) {
        bool = true;
      } else {
        bool = false;
      }
      long l2 = l1;
      if (bool)
      {
        l2 = -(l1 >> 1);
        l2 = ((int)l1 & 0x1) + (l2 << 1);
        i = b.a;
      }
      l1 = g(l2, c.o);
      int k;
      if (f(l2)) {
        k = 0;
      } else {
        k = (int)(g(l2, c.f) % 24);
      }
      int m;
      if (f(l2)) {
        m = 0;
      } else {
        m = (int)(g(l2, c.e) % 60);
      }
      int n;
      if (f(l2)) {
        n = 0;
      } else {
        n = (int)(g(l2, c.d) % 60);
      }
      int i1;
      if (f(l2))
      {
        i1 = 0;
      }
      else
      {
        if (((int)l2 & 0x1) == 1) {
          i = 1;
        } else {
          i = 0;
        }
        l2 >>= 1;
        if (i != 0) {
          l2 = l2 % 'Ϩ' * 1000000;
        } else {
          l2 %= 1000000000;
        }
        i1 = (int)l2;
      }
      int i2;
      if (l1 != 0L) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      int i3;
      if (k != 0) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      int i4;
      if (m != 0) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      int i5;
      if ((n == 0) && (i1 == 0)) {
        i5 = 0;
      } else {
        i5 = 1;
      }
      if (i2 != 0)
      {
        localStringBuilder.append(l1);
        localStringBuilder.append('d');
        i = 1;
      }
      else
      {
        i = 0;
      }
      if (i3 == 0)
      {
        i6 = i;
        if (i2 == 0) {
          break label441;
        }
        if (i4 == 0)
        {
          i6 = i;
          if (i5 == 0) {
            break label441;
          }
        }
      }
      if (i > 0) {
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(k);
      localStringBuilder.append('h');
      int i6 = i + 1;
      label441:
      if (i4 == 0)
      {
        i = i6;
        if (i5 == 0) {
          break label501;
        }
        if (i3 == 0)
        {
          i = i6;
          if (i2 == 0) {
            break label501;
          }
        }
      }
      if (i6 > 0) {
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(m);
      localStringBuilder.append('m');
      int i = i6 + 1;
      label501:
      i6 = i;
      if (i5 != 0)
      {
        if (i > 0) {
          localStringBuilder.append(' ');
        }
        if ((n == 0) && (i2 == 0) && (i3 == 0) && (i4 == 0))
        {
          if (i1 >= 1000000)
          {
            i6 = i1 / 1000000;
            i1 %= 1000000;
            n = 6;
            str1 = "ms";
          }
          else if (i1 >= 1000)
          {
            i6 = i1 / 1000;
            i1 %= 1000;
            str1 = "us";
            n = 3;
          }
          else
          {
            localStringBuilder.append(i1);
            localStringBuilder.append("ns");
            break label921;
          }
        }
        else
        {
          m = 9;
          str1 = "s";
          i6 = n;
          n = m;
        }
        localStringBuilder.append(i6);
        if (i1 != 0)
        {
          localStringBuilder.append('.');
          String str2 = String.valueOf(i1);
          i.e(str2, "<this>");
          if (n >= 0)
          {
            if (n <= str2.length())
            {
              localObject = str2.subSequence(0, str2.length());
            }
            else
            {
              localObject = new StringBuilder(n);
              i1 = n - str2.length();
              if (1 <= i1) {
                for (n = 1;; n++)
                {
                  ((StringBuilder)localObject).append('0');
                  if (n == i1) {
                    break;
                  }
                }
              }
              ((StringBuilder)localObject).append(str2);
            }
            Object localObject = localObject.toString();
            n = ((String)localObject).length();
            i6 = -1;
            i1 = n - 1;
            n = i6;
            if (i1 >= 0) {
              for (n = i1;; n = m)
              {
                m = n - 1;
                if (((String)localObject).charAt(n) != '0') {
                  i1 = 1;
                } else {
                  i1 = 0;
                }
                if (i1 != 0) {
                  break;
                }
                if (m < 0)
                {
                  n = i6;
                  break;
                }
              }
            }
            n++;
            if (n >= 3) {
              n = (n + 2) / 3 * 3;
            }
            localStringBuilder.append((CharSequence)localObject, 0, n);
          }
          else
          {
            throw new IllegalArgumentException(j.h("Desired length ", n, " is less than zero."));
          }
        }
        localStringBuilder.append(str1);
        label921:
        i6 = i + 1;
      }
      if ((j != 0) && (i6 > 1)) {
        localStringBuilder.insert(1, '(').append(')');
      }
      str1 = localStringBuilder.toString();
    }
    return str1;
  }
}

/* Location:
 * Qualified Name:     mc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
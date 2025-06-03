package xc;

import g;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

public class i
  implements Serializable, Comparable<i>
{
  public static final i d = new i(new byte[0]);
  public final byte[] a;
  public transient int b;
  public transient String c;
  
  public i(byte[] paramArrayOfByte)
  {
    a = paramArrayOfByte;
  }
  
  public static final i g(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    if (i % 2 == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      int k = paramString.length() / 2;
      byte[] arrayOfByte = new byte[k];
      for (i = j; i < k; i++)
      {
        j = i * 2;
        int m = yc.b.a(paramString.charAt(j));
        arrayOfByte[i] = ((byte)(byte)(yc.b.a(paramString.charAt(j + 1)) + (m << 4)));
      }
      return new i(arrayOfByte);
    }
    throw new IllegalArgumentException(g.d("Unexpected hex string: ", paramString).toString());
  }
  
  public static final i o(byte... paramVarArgs)
  {
    ec.i.e(paramVarArgs, "data");
    paramVarArgs = Arrays.copyOf(paramVarArgs, paramVarArgs.length);
    ec.i.d(paramVarArgs, "copyOf(this, size)");
    return new i(paramVarArgs);
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (i)paramObject;
    ec.i.e(paramObject, "other");
    int i = i();
    int j = ((i)paramObject).i();
    int k = Math.min(i, j);
    int m = 0;
    int n = 0;
    while (n < k)
    {
      int i1 = n(n) & 0xFF;
      int i2 = ((i)paramObject).n(n) & 0xFF;
      if (i1 == i2)
      {
        n++;
      }
      else
      {
        if (i1 >= i2) {
          break label111;
        }
        break label105;
      }
    }
    if (i == j) {
      n = m;
    } else if (i < j) {
      label105:
      n = -1;
    } else {
      label111:
      n = 1;
    }
    return n;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject != this) {
      if ((paramObject instanceof i))
      {
        paramObject = (i)paramObject;
        int i = ((i)paramObject).i();
        byte[] arrayOfByte = a;
        if ((i == arrayOfByte.length) && (((i)paramObject).p(0, arrayOfByte, 0, arrayOfByte.length))) {}
      }
      else
      {
        bool = false;
      }
    }
    return bool;
  }
  
  public String f()
  {
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2 = a.a;
    ec.i.e(arrayOfByte1, "<this>");
    ec.i.e(arrayOfByte2, "map");
    byte[] arrayOfByte3 = new byte[(arrayOfByte1.length + 2) / 3 * 4];
    int i = arrayOfByte1.length - arrayOfByte1.length % 3;
    int j = 0;
    int k = 0;
    int m;
    while (j < i)
    {
      m = j + 1;
      int n = arrayOfByte1[j];
      j = m + 1;
      int i1 = arrayOfByte1[m];
      m = arrayOfByte1[j];
      int i2 = k + 1;
      arrayOfByte3[k] = ((byte)arrayOfByte2[((n & 0xFF) >> 2)]);
      k = i2 + 1;
      arrayOfByte3[i2] = ((byte)arrayOfByte2[((n & 0x3) << 4 | (i1 & 0xFF) >> 4)]);
      n = k + 1;
      arrayOfByte3[k] = ((byte)arrayOfByte2[((i1 & 0xF) << 2 | (m & 0xFF) >> 6)]);
      k = n + 1;
      arrayOfByte3[n] = ((byte)arrayOfByte2[(m & 0x3F)]);
      j++;
    }
    i = arrayOfByte1.length - i;
    if (i != 1)
    {
      if (i == 2)
      {
        i = arrayOfByte1[j];
        m = arrayOfByte1[(j + 1)];
        j = k + 1;
        arrayOfByte3[k] = ((byte)arrayOfByte2[((i & 0xFF) >> 2)]);
        k = j + 1;
        arrayOfByte3[j] = ((byte)arrayOfByte2[((i & 0x3) << 4 | (m & 0xFF) >> 4)]);
        arrayOfByte3[k] = ((byte)arrayOfByte2[((m & 0xF) << 2)]);
        arrayOfByte3[(k + 1)] = ((byte)61);
      }
    }
    else
    {
      j = arrayOfByte1[j];
      i = k + 1;
      arrayOfByte3[k] = ((byte)arrayOfByte2[((j & 0xFF) >> 2)]);
      k = i + 1;
      arrayOfByte3[i] = ((byte)arrayOfByte2[((j & 0x3) << 4)]);
      arrayOfByte3[k] = ((byte)61);
      arrayOfByte3[(k + 1)] = ((byte)61);
    }
    return new String(arrayOfByte3, lc.a.a);
  }
  
  public i h(String paramString)
  {
    paramString = MessageDigest.getInstance(paramString);
    paramString.update(a, 0, i());
    paramString = paramString.digest();
    ec.i.d(paramString, "digestBytes");
    return new i(paramString);
  }
  
  public int hashCode()
  {
    int i = b;
    if (i == 0)
    {
      i = Arrays.hashCode(a);
      b = i;
    }
    return i;
  }
  
  public int i()
  {
    return a.length;
  }
  
  public String l()
  {
    byte[] arrayOfByte = a;
    char[] arrayOfChar1 = new char[arrayOfByte.length * 2];
    int i = arrayOfByte.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      int m = arrayOfByte[j];
      int n = k + 1;
      char[] arrayOfChar2 = yc.b.a;
      arrayOfChar1[k] = ((char)arrayOfChar2[(m >> 4 & 0xF)]);
      k = n + 1;
      arrayOfChar1[n] = ((char)arrayOfChar2[(m & 0xF)]);
      j++;
    }
    return new String(arrayOfChar1);
  }
  
  public byte[] m()
  {
    return a;
  }
  
  public byte n(int paramInt)
  {
    return a[paramInt];
  }
  
  public boolean p(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    ec.i.e(paramArrayOfByte, "other");
    if (paramInt1 >= 0)
    {
      byte[] arrayOfByte = a;
      if ((paramInt1 <= arrayOfByte.length - paramInt3) && (paramInt2 >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt3) && (b.a(arrayOfByte, paramInt1, paramArrayOfByte, paramInt2, paramInt3)))
      {
        bool = true;
        break label61;
      }
    }
    boolean bool = false;
    label61:
    return bool;
  }
  
  public boolean q(i parami, int paramInt)
  {
    ec.i.e(parami, "other");
    return parami.p(0, a, 0, paramInt);
  }
  
  public i r()
  {
    for (int i = 0;; i++)
    {
      localObject = a;
      if (i >= localObject.length) {
        break;
      }
      int j = localObject[i];
      if ((j >= 65) && (j <= 90))
      {
        localObject = Arrays.copyOf((byte[])localObject, localObject.length);
        ec.i.d(localObject, "copyOf(this, size)");
        int k = i + 1;
        localObject[i] = ((byte)(byte)(j + 32));
        for (i = k; i < localObject.length; i++)
        {
          k = localObject[i];
          if ((k >= 65) && (k <= 90)) {
            localObject[i] = ((byte)(byte)(k + 32));
          }
        }
        return new i((byte[])localObject);
      }
    }
    Object localObject = this;
    return (i)localObject;
  }
  
  public byte[] s()
  {
    byte[] arrayOfByte = a;
    arrayOfByte = Arrays.copyOf(arrayOfByte, arrayOfByte.length);
    ec.i.d(arrayOfByte, "copyOf(this, size)");
    return arrayOfByte;
  }
  
  public final String t()
  {
    String str = c;
    Object localObject = str;
    if (str == null)
    {
      localObject = m();
      ec.i.e(localObject, "<this>");
      localObject = new String((byte[])localObject, lc.a.a);
      c = ((String)localObject);
    }
    return (String)localObject;
  }
  
  public String toString()
  {
    Object localObject1 = a;
    int i;
    if (localObject1.length == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject1 = "[size=0]";
    }
    else
    {
      int j = localObject1.length;
      int k = 0;
      int m = 0;
      i = 0;
      int n;
      label158:
      label342:
      label590:
      Object localObject2;
      for (;;)
      {
        n = i;
        if (k >= j) {
          break label1430;
        }
        int i1 = localObject1[k];
        int i2;
        int i3;
        if (i1 >= 0)
        {
          n = m + 1;
          if (m == 64)
          {
            n = i;
            break label1430;
          }
          if ((i1 != 10) && (i1 != 13))
          {
            if ((i1 >= 0) && (i1 < 32)) {
              m = 1;
            } else {
              m = 0;
            }
            if (m == 0)
            {
              if ((127 <= i1) && (i1 < 160)) {
                m = 1;
              } else {
                m = 0;
              }
              if (m == 0)
              {
                m = 0;
                break label158;
              }
            }
            m = 1;
            if (m != 0) {
              break label1427;
            }
          }
          if (i1 == 65533) {
            break label1427;
          }
          if (i1 < 65536) {
            m = 1;
          } else {
            m = 2;
          }
          m = i + m;
          i1 = k + 1;
          i = n;
          n = m;
          for (;;)
          {
            i2 = i;
            k = i1;
            m = i2;
            i = n;
            if (i1 >= j) {
              break;
            }
            i3 = localObject1[i1];
            k = i1;
            m = i2;
            i = n;
            if (i3 < 0) {
              break;
            }
            i1++;
            k = i2 + 1;
            if (i2 == 64) {
              break label1430;
            }
            if ((i3 != 10) && (i3 != 13))
            {
              if ((i3 >= 0) && (i3 < 32)) {
                i = 1;
              } else {
                i = 0;
              }
              if (i == 0)
              {
                if ((127 <= i3) && (i3 < 160)) {
                  i = 1;
                } else {
                  i = 0;
                }
                if (i == 0)
                {
                  i = 0;
                  break label342;
                }
              }
              i = 1;
              if (i != 0) {
                break label1427;
              }
            }
            if (i3 == 65533) {
              break label1427;
            }
            if (i3 < 65536) {
              i = 1;
            } else {
              i = 2;
            }
            n += i;
            i = k;
          }
        }
        if (i1 >> 5 == -2)
        {
          n = k + 1;
          if (j <= n)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          i2 = localObject1[n];
          if ((i2 & 0xC0) == 128) {
            n = 1;
          } else {
            n = 0;
          }
          if (n == 0)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          i1 = i1 << 6 ^ i2 ^ 0xF80;
          if (i1 < 128)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          if (m == 64)
          {
            n = i;
            break label1430;
          }
          if ((i1 != 10) && (i1 != 13))
          {
            if ((i1 >= 0) && (i1 < 32)) {
              n = 1;
            } else {
              n = 0;
            }
            if (n == 0)
            {
              if ((127 <= i1) && (i1 < 160)) {
                n = 1;
              } else {
                n = 0;
              }
              if (n == 0)
              {
                n = 0;
                break label590;
              }
            }
            n = 1;
            if (n != 0) {
              break label1427;
            }
          }
          if (i1 == 65533) {
            break label1427;
          }
          if (i1 < 65536) {
            n = 1;
          } else {
            n = 2;
          }
          i += n;
          localObject2 = rb.h.a;
          k += 2;
          m++;
        }
        else if (i1 >> 4 == -2)
        {
          i3 = k + 2;
          if (j <= i3)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          i2 = localObject1[(k + 1)];
          if ((i2 & 0xC0) == 128) {
            n = 1;
          } else {
            n = 0;
          }
          if (n == 0)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          i3 = localObject1[i3];
          if ((i3 & 0xC0) == 128) {
            n = 1;
          } else {
            n = 0;
          }
          if (n == 0)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          i1 = i1 << 12 ^ i3 ^ 0xFFFE1F80 ^ i2 << 6;
          if (i1 < 2048)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          if ((55296 <= i1) && (i1 < 57344)) {
            n = 1;
          } else {
            n = 0;
          }
          if (n != 0)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          if (m == 64)
          {
            n = i;
            break label1430;
          }
          if ((i1 != 10) && (i1 != 13))
          {
            if ((i1 >= 0) && (i1 < 32)) {
              n = 1;
            } else {
              n = 0;
            }
            if (n == 0)
            {
              if ((127 <= i1) && (i1 < 160)) {
                n = 1;
              } else {
                n = 0;
              }
              if (n == 0)
              {
                n = 0;
                break label941;
              }
            }
            n = 1;
            label941:
            if (n != 0) {
              break label1427;
            }
          }
          if (i1 == 65533) {
            break label1427;
          }
          if (i1 < 65536) {
            n = 1;
          } else {
            n = 2;
          }
          i += n;
          localObject2 = rb.h.a;
          k += 3;
          m++;
        }
        else
        {
          if (i1 >> 3 != -2) {
            break;
          }
          int i4 = k + 3;
          if (j <= i4)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          i2 = localObject1[(k + 1)];
          if ((i2 & 0xC0) == 128) {
            n = 1;
          } else {
            n = 0;
          }
          if (n == 0)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          i3 = localObject1[(k + 2)];
          if ((i3 & 0xC0) == 128) {
            n = 1;
          } else {
            n = 0;
          }
          if (n == 0)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          i4 = localObject1[i4];
          if ((i4 & 0xC0) == 128) {
            n = 1;
          } else {
            n = 0;
          }
          if (n == 0)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          i1 = i1 << 18 ^ i4 ^ 0x381F80 ^ i3 << 6 ^ i2 << 12;
          if (i1 > 1114111)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          if ((55296 <= i1) && (i1 < 57344)) {
            n = 1;
          } else {
            n = 0;
          }
          if (n != 0)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          if (i1 < 65536)
          {
            if (m != 64) {
              break label1427;
            }
            n = i;
            break label1430;
          }
          if (m == 64)
          {
            n = i;
            break label1430;
          }
          if ((i1 != 10) && (i1 != 13))
          {
            if ((i1 >= 0) && (i1 < 32)) {
              n = 1;
            } else {
              n = 0;
            }
            if (n == 0)
            {
              if ((127 <= i1) && (i1 < 160)) {
                n = 1;
              } else {
                n = 0;
              }
              if (n == 0)
              {
                n = 0;
                break label1364;
              }
            }
            n = 1;
            label1364:
            if (n != 0) {
              break label1427;
            }
          }
          if (i1 == 65533) {
            break label1427;
          }
          if (i1 < 65536) {
            n = 1;
          } else {
            n = 2;
          }
          i += n;
          localObject2 = rb.h.a;
          k += 4;
          m++;
        }
      }
      if (m == 64) {
        n = i;
      } else {
        label1427:
        n = -1;
      }
      label1430:
      if (n == -1)
      {
        if (a.length <= 64)
        {
          localObject1 = f.l("[hex=");
          ((StringBuilder)localObject1).append(l());
          break label1712;
        }
        localObject2 = f.l("[size=");
        ((StringBuilder)localObject2).append(a.length);
        ((StringBuilder)localObject2).append(" hex=");
        localObject1 = a;
        if (64 <= localObject1.length) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (64 == localObject1.length)
          {
            localObject1 = this;
          }
          else
          {
            va.a.b(64, localObject1.length);
            localObject1 = Arrays.copyOfRange((byte[])localObject1, 0, 64);
            ec.i.d(localObject1, "copyOfRange(...)");
            localObject1 = new i((byte[])localObject1);
          }
          ((StringBuilder)localObject2).append(((i)localObject1).l());
          localObject1 = localObject2;
        }
        else
        {
          localObject1 = f.l("endIndex > length(");
          ((StringBuilder)localObject1).append(a.length);
          ((StringBuilder)localObject1).append(')');
          throw new IllegalArgumentException(((StringBuilder)localObject1).toString().toString());
        }
      }
      else
      {
        localObject1 = t();
        localObject2 = ((String)localObject1).substring(0, n);
        ec.i.d(localObject2, "this as java.lang.String…ing(startIndex, endIndex)");
        localObject2 = lc.h.m0(lc.h.m0(lc.h.m0((String)localObject2, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (n >= ((String)localObject1).length()) {
          break label1704;
        }
        localObject1 = f.l("[size=");
        ((StringBuilder)localObject1).append(a.length);
        ((StringBuilder)localObject1).append(" text=");
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      ((StringBuilder)localObject1).append("…]");
      break label1719;
      label1704:
      localObject1 = g.g("[text=", (String)localObject2);
      label1712:
      ((StringBuilder)localObject1).append(']');
      label1719:
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    return (String)localObject1;
  }
  
  public void u(f paramf, int paramInt)
  {
    ec.i.e(paramf, "buffer");
    paramf.write(a, 0, paramInt);
  }
  
  public static final class a
  {
    public static i a(String paramString)
    {
      ec.i.e(paramString, "<this>");
      Object localObject = paramString.getBytes(lc.a.a);
      ec.i.d(localObject, "this as java.lang.String).getBytes(charset)");
      localObject = new i((byte[])localObject);
      c = paramString;
      return (i)localObject;
    }
  }
}

/* Location:
 * Qualified Name:     xc.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
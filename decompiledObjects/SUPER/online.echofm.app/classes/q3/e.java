package q3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public abstract class e
{
  public static final Charset a = Charset.forName("UTF-8");
  
  public static byte[] a(String paramString, int paramInt)
  {
    return b(paramString.getBytes(a), paramInt);
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    return c(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = new b(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (((b)localObject).a(paramArrayOfByte, paramInt1, paramInt2, true))
    {
      paramInt1 = b;
      paramArrayOfByte = a;
      if (paramInt1 == paramArrayOfByte.length) {
        return paramArrayOfByte;
      }
      localObject = new byte[paramInt1];
      System.arraycopy(paramArrayOfByte, 0, localObject, 0, paramInt1);
      return (byte[])localObject;
    }
    throw new IllegalArgumentException("bad base-64");
  }
  
  public static String d(byte[] paramArrayOfByte)
  {
    return g(paramArrayOfByte, 2);
  }
  
  public static byte[] e(byte[] paramArrayOfByte, int paramInt)
  {
    return f(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] f(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    c localc = new c(paramInt3, null);
    int i = paramInt2 / 3 * 4;
    boolean bool = f;
    int j = 2;
    if (bool)
    {
      paramInt3 = i;
      if (paramInt2 % 3 > 0) {
        paramInt3 = i + 4;
      }
    }
    else
    {
      paramInt3 = paramInt2 % 3;
      if (paramInt3 != 1)
      {
        if (paramInt3 != 2) {
          paramInt3 = i;
        } else {
          paramInt3 = i + 3;
        }
      }
      else {
        paramInt3 = i + 2;
      }
    }
    i = paramInt3;
    if (g)
    {
      i = paramInt3;
      if (paramInt2 > 0)
      {
        int k = (paramInt2 - 1) / 57;
        if (h) {
          i = j;
        } else {
          i = 1;
        }
        i = paramInt3 + (k + 1) * i;
      }
    }
    a = new byte[i];
    localc.a(paramArrayOfByte, paramInt1, paramInt2, true);
    return a;
  }
  
  public static String g(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new String(e(paramArrayOfByte, paramInt), "US-ASCII");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw new AssertionError(paramArrayOfByte);
    }
  }
  
  public static abstract class a
  {
    public byte[] a;
    public int b;
  }
  
  public static class b
    extends e.a
  {
    public static final int[] f = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    public static final int[] g = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    public int c;
    public int d;
    public final int[] e;
    
    public b(int paramInt, byte[] paramArrayOfByte)
    {
      a = paramArrayOfByte;
      if ((paramInt & 0x8) == 0) {
        paramArrayOfByte = f;
      } else {
        paramArrayOfByte = g;
      }
      e = paramArrayOfByte;
      c = 0;
      d = 0;
    }
    
    public boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      int i = c;
      if (i == 6) {
        return false;
      }
      int j = paramInt2 + paramInt1;
      int k = d;
      byte[] arrayOfByte = a;
      int[] arrayOfInt = e;
      paramInt2 = 0;
      int m = paramInt1;
      int n;
      for (paramInt1 = k;; paramInt1 = k)
      {
        n = paramInt1;
        k = paramInt2;
        if (m >= j) {
          break;
        }
        int i1 = m;
        k = paramInt1;
        n = paramInt2;
        if (i == 0)
        {
          for (;;)
          {
            n = m + 4;
            if (n > j) {
              break;
            }
            k = arrayOfInt[(paramArrayOfByte[m] & 0xFF)] << 18 | arrayOfInt[(paramArrayOfByte[(m + 1)] & 0xFF)] << 12 | arrayOfInt[(paramArrayOfByte[(m + 2)] & 0xFF)] << 6 | arrayOfInt[(paramArrayOfByte[(m + 3)] & 0xFF)];
            paramInt1 = k;
            if (k < 0) {
              break;
            }
            arrayOfByte[(paramInt2 + 2)] = ((byte)(byte)k);
            arrayOfByte[(paramInt2 + 1)] = ((byte)(byte)(k >> 8));
            arrayOfByte[paramInt2] = ((byte)(byte)(k >> 16));
            paramInt2 += 3;
            m = n;
            paramInt1 = k;
          }
          i1 = m;
          k = paramInt1;
          n = paramInt2;
          if (m >= j)
          {
            n = paramInt1;
            k = paramInt2;
            break;
          }
        }
        m = arrayOfInt[(paramArrayOfByte[i1] & 0xFF)];
        if (i != 0) {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3)
              {
                if (i != 4)
                {
                  if (i != 5)
                  {
                    paramInt1 = i;
                    paramInt2 = n;
                    break label608;
                  }
                  paramInt1 = i;
                  paramInt2 = n;
                  if (m == -1) {
                    break label608;
                  }
                  c = 6;
                  return false;
                }
                if (m == -2)
                {
                  paramInt1 = i + 1;
                  paramInt2 = n;
                  break label608;
                }
                paramInt1 = i;
                paramInt2 = n;
                if (m == -1) {
                  break label608;
                }
                c = 6;
                return false;
              }
              if (m >= 0)
              {
                k = m | k << 6;
                arrayOfByte[(n + 2)] = ((byte)(byte)k);
                arrayOfByte[(n + 1)] = ((byte)(byte)(k >> 8));
                arrayOfByte[n] = ((byte)(byte)(k >> 16));
                paramInt2 = n + 3;
                paramInt1 = 0;
                break label608;
              }
              if (m == -2)
              {
                arrayOfByte[(n + 1)] = ((byte)(byte)(k >> 2));
                arrayOfByte[n] = ((byte)(byte)(k >> 10));
                paramInt2 = n + 2;
                paramInt1 = 5;
                break label608;
              }
              paramInt1 = i;
              paramInt2 = n;
              if (m == -1) {
                break label608;
              }
              c = 6;
              return false;
            }
            if (m < 0) {}
          }
        }
        for (paramInt1 = m | k << 6;; paramInt1 = m)
        {
          paramInt2 = i + 1;
          k = paramInt1;
          paramInt1 = paramInt2;
          paramInt2 = n;
          break label608;
          if (m == -2)
          {
            arrayOfByte[n] = ((byte)(byte)(k >> 4));
            paramInt2 = n + 1;
            paramInt1 = 4;
            break label608;
          }
          paramInt1 = i;
          paramInt2 = n;
          if (m == -1) {
            break label608;
          }
          c = 6;
          return false;
          if (m >= 0) {
            break;
          }
          paramInt1 = i;
          paramInt2 = n;
          if (m == -1) {
            break label608;
          }
          c = 6;
          return false;
          if (m < 0) {
            break label588;
          }
        }
        label588:
        paramInt1 = i;
        paramInt2 = n;
        if (m != -1)
        {
          c = 6;
          return false;
        }
        label608:
        m = i1 + 1;
        i = paramInt1;
      }
      if (!paramBoolean)
      {
        c = i;
        d = n;
      }
      for (;;)
      {
        b = k;
        return true;
        if (i == 1) {
          break;
        }
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4)
            {
              c = 6;
              return false;
            }
          }
          else
          {
            arrayOfByte[k] = ((byte)(byte)(n >> 10));
            paramInt1 = k + 2;
            arrayOfByte[(k + 1)] = ((byte)(byte)(n >> 2));
            k = paramInt1;
          }
        }
        else
        {
          arrayOfByte[k] = ((byte)(byte)(n >> 4));
          k++;
        }
        c = i;
      }
      c = 6;
      return false;
    }
  }
  
  public static class c
    extends e.a
  {
    public static final byte[] j = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
    public static final byte[] k = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
    public final byte[] c;
    public int d;
    public int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final byte[] i;
    
    public c(int paramInt, byte[] paramArrayOfByte)
    {
      a = paramArrayOfByte;
      boolean bool1 = true;
      boolean bool2;
      if ((paramInt & 0x1) == 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      f = bool2;
      if ((paramInt & 0x2) == 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      g = bool2;
      if ((paramInt & 0x4) == 0) {
        bool1 = false;
      }
      h = bool1;
      if ((paramInt & 0x8) == 0) {
        paramArrayOfByte = j;
      } else {
        paramArrayOfByte = k;
      }
      i = paramArrayOfByte;
      c = new byte[2];
      d = 0;
      if (bool2) {
        paramInt = 19;
      } else {
        paramInt = -1;
      }
      e = paramInt;
    }
    
    public boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      byte[] arrayOfByte1 = i;
      byte[] arrayOfByte2 = a;
      int m = e;
      int n = paramInt2 + paramInt1;
      paramInt2 = d;
      int i1 = 0;
      int i2 = 0;
      int i4;
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2)
        {
          paramInt2 = paramInt1 + 1;
          if (paramInt2 <= n)
          {
            byte[] arrayOfByte3 = c;
            i3 = arrayOfByte3[0];
            paramInt1 = (arrayOfByte3[1] & 0xFF) << 8 | (i3 & 0xFF) << 16 | paramArrayOfByte[paramInt1] & 0xFF;
            d = 0;
            break label178;
          }
        }
      }
      else if (paramInt1 + 2 <= n)
      {
        i4 = c[0];
        i3 = paramArrayOfByte[paramInt1];
        paramInt2 = paramInt1 + 2;
        paramInt1 = paramArrayOfByte[(paramInt1 + 1)] & 0xFF | (i4 & 0xFF) << 16 | (i3 & 0xFF) << 8;
        d = 0;
        break label178;
      }
      int i3 = -1;
      paramInt2 = paramInt1;
      paramInt1 = i3;
      label178:
      if (paramInt1 != -1)
      {
        arrayOfByte2[0] = ((byte)arrayOfByte1[(paramInt1 >> 18 & 0x3F)]);
        arrayOfByte2[1] = ((byte)arrayOfByte1[(paramInt1 >> 12 & 0x3F)]);
        arrayOfByte2[2] = ((byte)arrayOfByte1[(paramInt1 >> 6 & 0x3F)]);
        arrayOfByte2[3] = ((byte)arrayOfByte1[(paramInt1 & 0x3F)]);
        m--;
        if (m == 0)
        {
          if (h)
          {
            arrayOfByte2[4] = ((byte)13);
            paramInt1 = 5;
          }
          else
          {
            paramInt1 = 4;
          }
          m = paramInt1 + 1;
          arrayOfByte2[paramInt1] = ((byte)10);
          paramInt1 = m;
          m = 19;
        }
        else
        {
          paramInt1 = 4;
        }
      }
      else
      {
        paramInt1 = 0;
      }
      for (;;)
      {
        i3 = paramInt2 + 3;
        if (i3 > n) {
          break label472;
        }
        i4 = paramArrayOfByte[paramInt2];
        paramInt2 = (paramArrayOfByte[(paramInt2 + 1)] & 0xFF) << 8 | (i4 & 0xFF) << 16 | paramArrayOfByte[(paramInt2 + 2)] & 0xFF;
        arrayOfByte2[paramInt1] = ((byte)arrayOfByte1[(paramInt2 >> 18 & 0x3F)]);
        arrayOfByte2[(paramInt1 + 1)] = ((byte)arrayOfByte1[(paramInt2 >> 12 & 0x3F)]);
        arrayOfByte2[(paramInt1 + 2)] = ((byte)arrayOfByte1[(paramInt2 >> 6 & 0x3F)]);
        arrayOfByte2[(paramInt1 + 3)] = ((byte)arrayOfByte1[(paramInt2 & 0x3F)]);
        paramInt2 = paramInt1 + 4;
        m--;
        if (m == 0)
        {
          m = paramInt2;
          if (h)
          {
            arrayOfByte2[paramInt2] = ((byte)13);
            m = paramInt1 + 5;
          }
          paramInt1 = m + 1;
          arrayOfByte2[m] = ((byte)10);
          paramInt2 = i3;
          break;
        }
        paramInt1 = paramInt2;
        paramInt2 = i3;
      }
      label472:
      if (paramBoolean)
      {
        i4 = d;
        if (paramInt2 - i4 == n - 1)
        {
          if (i4 > 0)
          {
            i3 = c[0];
            paramInt2 = 1;
          }
          else
          {
            i3 = paramArrayOfByte[paramInt2];
            paramInt2 = i2;
          }
          i2 = (i3 & 0xFF) << 4;
          d = (i4 - paramInt2);
          arrayOfByte2[paramInt1] = ((byte)arrayOfByte1[(i2 >> 6 & 0x3F)]);
          i3 = paramInt1 + 2;
          arrayOfByte2[(paramInt1 + 1)] = ((byte)arrayOfByte1[(i2 & 0x3F)]);
          paramInt2 = i3;
          if (f)
          {
            arrayOfByte2[i3] = ((byte)61);
            paramInt2 = paramInt1 + 4;
            arrayOfByte2[(paramInt1 + 3)] = ((byte)61);
          }
          if (g)
          {
            paramInt1 = paramInt2;
            if (h)
            {
              arrayOfByte2[paramInt2] = ((byte)13);
              paramInt1 = paramInt2 + 1;
            }
            paramInt2 = paramInt1 + 1;
            arrayOfByte2[paramInt1] = ((byte)10);
            paramInt1 = paramInt2;
          }
        }
        for (;;)
        {
          i3 = paramInt1;
          break;
          i3 = paramInt2;
          break;
          if (paramInt2 - i4 == n - 2)
          {
            if (i4 > 1)
            {
              i2 = c[0];
              i3 = 1;
            }
            else
            {
              i2 = paramArrayOfByte[paramInt2];
              paramInt2++;
              i3 = i1;
            }
            if (i4 > 0)
            {
              paramArrayOfByte = c;
              paramInt2 = i3 + 1;
              i3 = paramArrayOfByte[i3];
            }
            else
            {
              i1 = paramArrayOfByte[paramInt2];
              paramInt2 = i3;
              i3 = i1;
            }
            i2 = (i2 & 0xFF) << 10 | (i3 & 0xFF) << 2;
            d = (i4 - paramInt2);
            arrayOfByte2[paramInt1] = ((byte)arrayOfByte1[(i2 >> 12 & 0x3F)]);
            arrayOfByte2[(paramInt1 + 1)] = ((byte)arrayOfByte1[(i2 >> 6 & 0x3F)]);
            i3 = paramInt1 + 3;
            arrayOfByte2[(paramInt1 + 2)] = ((byte)arrayOfByte1[(i2 & 0x3F)]);
            paramInt2 = i3;
            if (f)
            {
              arrayOfByte2[i3] = ((byte)61);
              paramInt2 = paramInt1 + 4;
            }
            if (g)
            {
              paramInt1 = paramInt2;
              if (h)
              {
                arrayOfByte2[paramInt2] = ((byte)13);
                paramInt1 = paramInt2 + 1;
              }
              paramInt2 = paramInt1 + 1;
              arrayOfByte2[paramInt1] = ((byte)10);
              paramInt1 = paramInt2;
            }
            else
            {
              i3 = paramInt2;
              break;
            }
          }
          else
          {
            i3 = paramInt1;
            if (!g) {
              break;
            }
            i3 = paramInt1;
            if (paramInt1 <= 0) {
              break;
            }
            i3 = paramInt1;
            if (m == 19) {
              break;
            }
            paramInt2 = paramInt1;
            if (h)
            {
              arrayOfByte2[paramInt1] = ((byte)13);
              paramInt2 = paramInt1 + 1;
            }
            paramInt1 = paramInt2 + 1;
            arrayOfByte2[paramInt2] = ((byte)10);
          }
        }
      }
      if (paramInt2 == n - 1)
      {
        arrayOfByte1 = c;
        i3 = d;
        d = (i3 + 1);
        arrayOfByte1[i3] = ((byte)paramArrayOfByte[paramInt2]);
        i3 = paramInt1;
      }
      else
      {
        i3 = paramInt1;
        if (paramInt2 == n - 2)
        {
          arrayOfByte1 = c;
          i3 = d;
          arrayOfByte1[i3] = ((byte)paramArrayOfByte[paramInt2]);
          d = (i3 + 2);
          arrayOfByte1[(i3 + 1)] = ((byte)paramArrayOfByte[(paramInt2 + 1)]);
          i3 = paramInt1;
        }
      }
      b = i3;
      e = m;
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     q3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
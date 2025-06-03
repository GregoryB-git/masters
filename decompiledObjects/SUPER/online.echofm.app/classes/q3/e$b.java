package q3;

public class e$b
  extends e.a
{
  public static final int[] f = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  public static final int[] g = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  public int c;
  public int d;
  public final int[] e;
  
  public e$b(int paramInt, byte[] paramArrayOfByte)
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

/* Location:
 * Qualified Name:     q3.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
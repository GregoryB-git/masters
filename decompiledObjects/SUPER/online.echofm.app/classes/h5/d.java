package h5;

public abstract class d
{
  public static int a(b paramb)
  {
    return b(paramb, true) + b(paramb, false);
  }
  
  public static int b(b paramb, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = paramb.d();
    } else {
      i = paramb.e();
    }
    int j;
    if (paramBoolean) {
      j = paramb.e();
    } else {
      j = paramb.d();
    }
    paramb = paramb.c();
    int k = 0;
    int i3;
    for (int m = k; k < i; m = i3)
    {
      int n = -1;
      int i1 = 0;
      for (int i2 = i1; i1 < j; i2 = i3)
      {
        if (paramBoolean) {
          i3 = paramb[k][i1];
        } else {
          i3 = paramb[i1][k];
        }
        if (i3 == n)
        {
          i3 = i2 + 1;
          i2 = n;
        }
        else
        {
          n = m;
          if (i2 >= 5) {
            n = m + (i2 - 2);
          }
          m = 1;
          i2 = i3;
          i3 = m;
          m = n;
        }
        i1++;
        n = i2;
      }
      i3 = m;
      if (i2 >= 5) {
        i3 = m + (i2 - 2);
      }
      k++;
    }
    return m;
  }
  
  public static int c(b paramb)
  {
    byte[][] arrayOfByte = paramb.c();
    int i = paramb.e();
    int j = paramb.d();
    int k = 0;
    int m = k;
    while (k < j - 1)
    {
      byte[] arrayOfByte1 = arrayOfByte[k];
      int n = 0;
      while (n < i - 1)
      {
        int i1 = arrayOfByte1[n];
        int i2 = n + 1;
        int i3 = m;
        if (i1 == arrayOfByte1[i2])
        {
          paramb = arrayOfByte[(k + 1)];
          i3 = m;
          if (i1 == paramb[n])
          {
            i3 = m;
            if (i1 == paramb[i2]) {
              i3 = m + 1;
            }
          }
        }
        n = i2;
        m = i3;
      }
      k++;
    }
    return m * 3;
  }
  
  public static int d(b paramb)
  {
    byte[][] arrayOfByte = paramb.c();
    int i = paramb.e();
    int j = paramb.d();
    int k = 0;
    int m = k;
    while (k < j)
    {
      for (int n = 0; n < i; n++)
      {
        paramb = arrayOfByte[k];
        int i1 = n + 6;
        int i2 = m;
        if (i1 < i)
        {
          i2 = m;
          if (paramb[n] == 1)
          {
            i2 = m;
            if (paramb[(n + 1)] == 0)
            {
              i2 = m;
              if (paramb[(n + 2)] == 1)
              {
                i2 = m;
                if (paramb[(n + 3)] == 1)
                {
                  i2 = m;
                  if (paramb[(n + 4)] == 1)
                  {
                    i2 = m;
                    if (paramb[(n + 5)] == 0)
                    {
                      i2 = m;
                      if (paramb[i1] == 1) {
                        if (!g(paramb, n - 4, n))
                        {
                          i2 = m;
                          if (!g(paramb, n + 7, n + 11)) {}
                        }
                        else
                        {
                          i2 = m + 1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        i1 = k + 6;
        m = i2;
        if (i1 < j)
        {
          m = i2;
          if (arrayOfByte[k][n] == 1)
          {
            m = i2;
            if (arrayOfByte[(k + 1)][n] == 0)
            {
              m = i2;
              if (arrayOfByte[(k + 2)][n] == 1)
              {
                m = i2;
                if (arrayOfByte[(k + 3)][n] == 1)
                {
                  m = i2;
                  if (arrayOfByte[(k + 4)][n] == 1)
                  {
                    m = i2;
                    if (arrayOfByte[(k + 5)][n] == 0)
                    {
                      m = i2;
                      if (arrayOfByte[i1][n] == 1) {
                        if (!h(arrayOfByte, n, k - 4, k))
                        {
                          m = i2;
                          if (!h(arrayOfByte, n, k + 7, k + 11)) {}
                        }
                        else
                        {
                          m = i2 + 1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      k++;
    }
    return m * 40;
  }
  
  public static int e(b paramb)
  {
    byte[][] arrayOfByte = paramb.c();
    int i = paramb.e();
    int j = paramb.d();
    int k = 0;
    int m = k;
    while (k < j)
    {
      byte[] arrayOfByte1 = arrayOfByte[k];
      int n = 0;
      while (n < i)
      {
        int i1 = m;
        if (arrayOfByte1[n] == 1) {
          i1 = m + 1;
        }
        n++;
        m = i1;
      }
      k++;
    }
    k = paramb.d() * paramb.e();
    return Math.abs((m << 1) - k) * 10 / k * 10;
  }
  
  public static boolean f(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    int j = paramInt3;
    int k = paramInt3;
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(paramInt1)));
    case 7: 
    case 6: 
      for (paramInt1 = paramInt3 * paramInt2 % 3 + (paramInt3 + paramInt2 & 0x1);; paramInt1 = (paramInt1 & 0x1) + paramInt1 % 3)
      {
        paramInt1 &= 0x1;
        break;
        paramInt1 = paramInt3 * paramInt2;
      }
    case 5: 
      paramInt1 = paramInt3 * paramInt2;
      paramInt1 = (paramInt1 & 0x1) + paramInt1 % 3;
      break;
    case 4: 
      j = paramInt3 / 2;
      i = paramInt2 / 3;
    case 0: 
      k = j + i;
    case 1: 
      paramInt1 = k & 0x1;
      break;
    case 3: 
      paramInt1 = (paramInt3 + paramInt2) % 3;
      break;
    case 2: 
      paramInt1 = paramInt2 % 3;
    }
    return paramInt1 == 0;
  }
  
  public static boolean g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = Math.max(paramInt1, 0);
    paramInt2 = Math.min(paramInt2, paramArrayOfByte.length);
    while (paramInt1 < paramInt2)
    {
      if (paramArrayOfByte[paramInt1] == 1) {
        return false;
      }
      paramInt1++;
    }
    return true;
  }
  
  public static boolean h(byte[][] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = Math.max(paramInt2, 0);
    paramInt3 = Math.min(paramInt3, paramArrayOfByte.length);
    while (paramInt2 < paramInt3)
    {
      if (paramArrayOfByte[paramInt2][paramInt1] == 1) {
        return false;
      }
      paramInt2++;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     h5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
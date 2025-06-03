package Y4;

import java.util.Arrays;

public final class b
  implements Cloneable
{
  public final int o;
  public final int p;
  public final int q;
  public final int[] r;
  
  public b(int paramInt)
  {
    this(paramInt, paramInt);
  }
  
  public b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      o = paramInt1;
      p = paramInt2;
      paramInt1 = (paramInt1 + 31) / 32;
      q = paramInt1;
      r = new int[paramInt1 * paramInt2];
      return;
    }
    throw new IllegalArgumentException("Both dimensions must be greater than 0");
  }
  
  public b(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramInt3;
    r = paramArrayOfInt;
  }
  
  public final String a(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder(p * (o + 1));
    for (int i = 0; i < p; i++)
    {
      for (int j = 0; j < o; j++)
      {
        String str;
        if (f(j, i)) {
          str = paramString1;
        } else {
          str = paramString2;
        }
        localStringBuilder.append(str);
      }
      localStringBuilder.append(paramString3);
    }
    return localStringBuilder.toString();
  }
  
  public void b()
  {
    int i = r.length;
    for (int j = 0; j < i; j++) {
      r[j] = 0;
    }
  }
  
  public b d()
  {
    return new b(o, p, q, (int[])r.clone());
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return (o == o) && (p == p) && (q == q) && (Arrays.equals(r, r));
  }
  
  public boolean f(int paramInt1, int paramInt2)
  {
    int i = q;
    int j = paramInt1 / 32;
    return (r[(paramInt2 * i + j)] >>> (paramInt1 & 0x1F) & 0x1) != 0;
  }
  
  public int g()
  {
    return p;
  }
  
  public int hashCode()
  {
    int i = o;
    return (((i * 31 + i) * 31 + p) * 31 + q) * 31 + Arrays.hashCode(r);
  }
  
  public int j()
  {
    return o;
  }
  
  public void l(int paramInt1, int paramInt2)
  {
    paramInt2 = paramInt2 * q + paramInt1 / 32;
    int[] arrayOfInt = r;
    arrayOfInt[paramInt2] = (1 << (paramInt1 & 0x1F) | arrayOfInt[paramInt2]);
  }
  
  public void n(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 >= 0) && (paramInt1 >= 0))
    {
      if ((paramInt4 > 0) && (paramInt3 > 0))
      {
        int i = paramInt3 + paramInt1;
        paramInt4 += paramInt2;
        if ((paramInt4 <= p) && (i <= o))
        {
          while (paramInt2 < paramInt4)
          {
            int j = q;
            for (paramInt3 = paramInt1; paramInt3 < i; paramInt3++)
            {
              int[] arrayOfInt = r;
              int k = paramInt3 / 32 + j * paramInt2;
              arrayOfInt[k] |= 1 << (paramInt3 & 0x1F);
            }
            paramInt2++;
          }
          return;
        }
        throw new IllegalArgumentException("The region must fit inside the matrix");
      }
      throw new IllegalArgumentException("Height and width must be at least 1");
    }
    throw new IllegalArgumentException("Left and top must be nonnegative");
  }
  
  public String o(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, "\n");
  }
  
  public String toString()
  {
    return o("X ", "  ");
  }
}

/* Location:
 * Qualified Name:     Y4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
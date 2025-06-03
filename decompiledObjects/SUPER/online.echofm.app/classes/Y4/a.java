package Y4;

import java.util.Arrays;

public final class a
  implements Cloneable
{
  public int[] o;
  public int p;
  
  public a()
  {
    p = 0;
    o = new int[1];
  }
  
  public a(int[] paramArrayOfInt, int paramInt)
  {
    o = paramArrayOfInt;
    p = paramInt;
  }
  
  public static int[] o(int paramInt)
  {
    return new int[(paramInt + 31) / 32];
  }
  
  public void a(boolean paramBoolean)
  {
    g(p + 1);
    if (paramBoolean)
    {
      int[] arrayOfInt = o;
      int i = p;
      int j = i / 32;
      arrayOfInt[j] = (1 << (i & 0x1F) | arrayOfInt[j]);
    }
    p += 1;
  }
  
  public void b(a parama)
  {
    int i = p;
    g(p + i);
    for (int j = 0; j < i; j++) {
      a(parama.j(j));
    }
  }
  
  public void d(int paramInt1, int paramInt2)
  {
    if ((paramInt2 >= 0) && (paramInt2 <= 32))
    {
      g(p + paramInt2);
      while (paramInt2 > 0)
      {
        boolean bool = true;
        if ((paramInt1 >> paramInt2 - 1 & 0x1) != 1) {
          bool = false;
        }
        a(bool);
        paramInt2--;
      }
      return;
    }
    throw new IllegalArgumentException("Num bits must be between 0 and 32");
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    return (p == p) && (Arrays.equals(o, o));
  }
  
  public a f()
  {
    return new a((int[])o.clone(), p);
  }
  
  public final void g(int paramInt)
  {
    if (paramInt > o.length << 5)
    {
      int[] arrayOfInt1 = o(paramInt);
      int[] arrayOfInt2 = o;
      System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, arrayOfInt2.length);
      o = arrayOfInt1;
    }
  }
  
  public int hashCode()
  {
    return p * 31 + Arrays.hashCode(o);
  }
  
  public boolean j(int paramInt)
  {
    return (1 << (paramInt & 0x1F) & o[(paramInt / 32)]) != 0;
  }
  
  public int l()
  {
    return p;
  }
  
  public int n()
  {
    return (p + 7) / 8;
  }
  
  public void p(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = paramInt1;
    for (paramInt1 = i; paramInt1 < paramInt3; paramInt1++)
    {
      int k = 0;
      int m;
      for (i = k; k < 8; i = m)
      {
        m = i;
        if (j(j)) {
          m = i | 1 << 7 - k;
        }
        j++;
        k++;
      }
      paramArrayOfByte[(paramInt2 + paramInt1)] = ((byte)(byte)i);
    }
  }
  
  public void s(a parama)
  {
    if (p == p)
    {
      for (int i = 0;; i++)
      {
        int[] arrayOfInt = o;
        if (i >= arrayOfInt.length) {
          break;
        }
        arrayOfInt[i] ^= o[i];
      }
      return;
    }
    throw new IllegalArgumentException("Sizes don't match");
  }
  
  public String toString()
  {
    int i = p;
    StringBuilder localStringBuilder = new StringBuilder(i + i / 8 + 1);
    for (i = 0; i < p; i++)
    {
      if ((i & 0x7) == 0) {
        localStringBuilder.append(' ');
      }
      char c1;
      char c2;
      if (j(i))
      {
        c1 = 'X';
        c2 = c1;
      }
      else
      {
        c1 = '.';
        c2 = c1;
      }
      localStringBuilder.append(c2);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     Y4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
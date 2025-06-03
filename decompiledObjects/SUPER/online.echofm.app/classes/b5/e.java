package b5;

import java.util.Arrays;

public class e
{
  public final CharSequence a;
  public final int b;
  public final int c;
  public final byte[] d;
  
  public e(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    a = paramCharSequence;
    c = paramInt1;
    b = paramInt2;
    paramCharSequence = new byte[paramInt1 * paramInt2];
    d = paramCharSequence;
    Arrays.fill(paramCharSequence, (byte)-1);
  }
  
  public final void a(int paramInt)
  {
    g(b - 1, 0, paramInt, 1);
    g(b - 1, 1, paramInt, 2);
    g(b - 1, 2, paramInt, 3);
    g(0, c - 2, paramInt, 4);
    g(0, c - 1, paramInt, 5);
    g(1, c - 1, paramInt, 6);
    g(2, c - 1, paramInt, 7);
    g(3, c - 1, paramInt, 8);
  }
  
  public final void b(int paramInt)
  {
    g(b - 3, 0, paramInt, 1);
    g(b - 2, 0, paramInt, 2);
    g(b - 1, 0, paramInt, 3);
    g(0, c - 4, paramInt, 4);
    g(0, c - 3, paramInt, 5);
    g(0, c - 2, paramInt, 6);
    g(0, c - 1, paramInt, 7);
    g(1, c - 1, paramInt, 8);
  }
  
  public final void c(int paramInt)
  {
    g(b - 3, 0, paramInt, 1);
    g(b - 2, 0, paramInt, 2);
    g(b - 1, 0, paramInt, 3);
    g(0, c - 2, paramInt, 4);
    g(0, c - 1, paramInt, 5);
    g(1, c - 1, paramInt, 6);
    g(2, c - 1, paramInt, 7);
    g(3, c - 1, paramInt, 8);
  }
  
  public final void d(int paramInt)
  {
    g(b - 1, 0, paramInt, 1);
    g(b - 1, c - 1, paramInt, 2);
    g(0, c - 3, paramInt, 3);
    g(0, c - 2, paramInt, 4);
    g(0, c - 1, paramInt, 5);
    g(1, c - 3, paramInt, 6);
    g(1, c - 2, paramInt, 7);
    g(1, c - 1, paramInt, 8);
  }
  
  public final boolean e(int paramInt1, int paramInt2)
  {
    return d[(paramInt2 * c + paramInt1)] == 1;
  }
  
  public final boolean f(int paramInt1, int paramInt2)
  {
    return d[(paramInt2 * c + paramInt1)] >= 0;
  }
  
  public final void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt1;
    int j = paramInt2;
    if (paramInt1 < 0)
    {
      j = b;
      i = paramInt1 + j;
      j = paramInt2 + (4 - (j + 4) % 8);
    }
    paramInt2 = i;
    paramInt1 = j;
    if (j < 0)
    {
      paramInt2 = c;
      paramInt1 = j + paramInt2;
      paramInt2 = i + (4 - (paramInt2 + 4) % 8);
    }
    paramInt3 = a.charAt(paramInt3);
    boolean bool = true;
    if ((paramInt3 & 1 << 8 - paramInt4) == 0) {
      bool = false;
    }
    i(paramInt1, paramInt2, bool);
  }
  
  public final void h()
  {
    int i = 0;
    int j = 0;
    int k = 4;
    int i1;
    int i2;
    int i3;
    do
    {
      int m;
      int n;
      do
      {
        m = j;
        if (k == b)
        {
          m = j;
          if (i == 0)
          {
            a(j);
            m = j + 1;
          }
        }
        n = m;
        if (k == b - 2)
        {
          n = m;
          if (i == 0)
          {
            n = m;
            if (c % 4 != 0)
            {
              b(m);
              n = m + 1;
            }
          }
        }
        j = n;
        if (k == b - 2)
        {
          j = n;
          if (i == 0)
          {
            j = n;
            if (c % 8 == 4)
            {
              c(n);
              j = n + 1;
            }
          }
        }
        m = i;
        n = j;
        i1 = k;
        if (k == b + 4)
        {
          m = i;
          n = j;
          i1 = k;
          if (i == 2)
          {
            m = i;
            n = j;
            i1 = k;
            if (c % 8 == 0)
            {
              d(j);
              n = j + 1;
              i1 = k;
              m = i;
            }
          }
        }
        for (;;)
        {
          k = n;
          if (i1 < b)
          {
            k = n;
            if (m >= 0)
            {
              k = n;
              if (!f(m, i1))
              {
                j(i1, m, n);
                k = n + 1;
              }
            }
          }
          n = i1 - 2;
          i = m + 2;
          if ((n < 0) || (i >= c)) {
            break;
          }
          i1 = n;
          m = i;
          n = k;
        }
        i = i1 - 1;
        n = m + 5;
        j = k;
        k = n;
        for (;;)
        {
          n = j;
          if (i >= 0)
          {
            n = j;
            if (k < c)
            {
              n = j;
              if (!f(k, i))
              {
                j(i, k, j);
                n = j + 1;
              }
            }
          }
          m = i + 2;
          j = k - 2;
          i2 = b;
          if ((m >= i2) || (j < 0)) {
            break;
          }
          i = m;
          k = j;
          j = n;
        }
        m = i + 5;
        i1 = k - 1;
        i = i1;
        j = n;
        k = m;
      } while (m < i2);
      i3 = c;
      i = i1;
      j = n;
      k = m;
    } while (i1 < i3);
    if (!f(i3 - 1, i2 - 1))
    {
      i(c - 1, b - 1, true);
      i(c - 2, b - 2, true);
    }
  }
  
  public final void i(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    d[(paramInt2 * c + paramInt1)] = ((byte)(byte)paramBoolean);
  }
  
  public final void j(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 - 2;
    int j = paramInt2 - 2;
    g(i, j, paramInt3, 1);
    int k = paramInt2 - 1;
    g(i, k, paramInt3, 2);
    i = paramInt1 - 1;
    g(i, j, paramInt3, 3);
    g(i, k, paramInt3, 4);
    g(i, paramInt2, paramInt3, 5);
    g(paramInt1, j, paramInt3, 6);
    g(paramInt1, k, paramInt3, 7);
    g(paramInt1, paramInt2, paramInt3, 8);
  }
}

/* Location:
 * Qualified Name:     b5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
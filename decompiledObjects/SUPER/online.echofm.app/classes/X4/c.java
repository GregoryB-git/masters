package X4;

import Y4.b;

public abstract class c
{
  public static final int[] a = { 4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12 };
  
  public static int[] a(Y4.a parama, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[paramInt2];
    int i = parama.l() / paramInt1;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++)
    {
      int j = 0;
      int k = j;
      while (j < paramInt1)
      {
        int m;
        if (parama.j(paramInt2 * paramInt1 + j)) {
          m = 1 << paramInt1 - j - 1;
        } else {
          m = 0;
        }
        k |= m;
        j++;
      }
      arrayOfInt[paramInt2] = k;
    }
    return arrayOfInt;
  }
  
  public static void b(b paramb, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt2; i += 2)
    {
      int j = paramInt1 - i;
      for (k = j;; k++)
      {
        int m = paramInt1 + i;
        if (k > m) {
          break;
        }
        paramb.l(k, j);
        paramb.l(k, m);
        paramb.l(j, k);
        paramb.l(m, k);
      }
    }
    i = paramInt1 - paramInt2;
    paramb.l(i, i);
    int k = i + 1;
    paramb.l(k, i);
    paramb.l(i, k);
    paramInt1 += paramInt2;
    paramb.l(paramInt1, i);
    paramb.l(paramInt1, k);
    paramb.l(paramInt1, paramInt1 - 1);
  }
  
  public static void c(b paramb, boolean paramBoolean, int paramInt, Y4.a parama)
  {
    int i = paramInt / 2;
    paramInt = 0;
    int j = 0;
    if (paramBoolean)
    {
      for (paramInt = j; paramInt < 7; paramInt++)
      {
        j = i - 3 + paramInt;
        if (parama.j(paramInt)) {
          paramb.l(j, i - 5);
        }
        if (parama.j(paramInt + 7)) {
          paramb.l(i + 5, j);
        }
        if (parama.j(20 - paramInt)) {
          paramb.l(j, i + 5);
        }
        if (parama.j(27 - paramInt)) {
          paramb.l(i - 5, j);
        }
      }
      return;
    }
    while (paramInt < 10)
    {
      j = i - 5 + paramInt + paramInt / 5;
      if (parama.j(paramInt)) {
        paramb.l(j, i - 7);
      }
      if (parama.j(paramInt + 10)) {
        paramb.l(i + 7, j);
      }
      if (parama.j(29 - paramInt)) {
        paramb.l(j, i + 7);
      }
      if (parama.j(39 - paramInt)) {
        paramb.l(i - 7, j);
      }
      paramInt++;
    }
  }
  
  public static a d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 2;
    Object localObject1 = new d(paramArrayOfByte).a();
    int k = ((Y4.a)localObject1).l() * paramInt1 / 100 + 11;
    int m = ((Y4.a)localObject1).l();
    paramInt1 = 32;
    int n = 1;
    int i1 = 1;
    int i3;
    int i4;
    Object localObject2;
    int i5;
    int i6;
    int i7;
    int i8;
    if (paramInt2 != 0)
    {
      if (paramInt2 < 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      m = Math.abs(paramInt2);
      if (i1 != 0) {
        paramInt1 = 4;
      }
      if (m <= paramInt1)
      {
        i3 = i(m, i1);
        i4 = a[m];
        localObject2 = h((Y4.a)localObject1, i4);
        if (((Y4.a)localObject2).l() + k <= i3 - i3 % i4)
        {
          paramInt2 = i;
          paramArrayOfByte = (byte[])localObject2;
          i5 = i1;
          i6 = i3;
          paramInt1 = n;
          i7 = m;
          i8 = i4;
          if (i1 != 0) {
            if (((Y4.a)localObject2).l() <= i4 << 6)
            {
              paramInt2 = i;
              paramArrayOfByte = (byte[])localObject2;
              i5 = i1;
              i6 = i3;
              paramInt1 = n;
              i7 = m;
              i8 = i4;
            }
            else
            {
              throw new IllegalArgumentException("Data to large for user specified layer");
            }
          }
        }
        else
        {
          throw new IllegalArgumentException("Data to large for user specified layer");
        }
      }
      else
      {
        throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[] { Integer.valueOf(paramInt2) }));
      }
    }
    else
    {
      paramArrayOfByte = null;
      i7 = 0;
      i5 = i7;
      paramInt1 = i1;
      i1 = i;
    }
    while (i7 <= 32)
    {
      if (i7 <= 3) {
        i = paramInt1;
      } else {
        i = 0;
      }
      if (i != 0) {
        i8 = i7 + 1;
      } else {
        i8 = i7;
      }
      n = i(i8, i);
      localObject2 = paramArrayOfByte;
      i6 = i5;
      if (m + k <= n)
      {
        if (paramArrayOfByte != null)
        {
          paramInt2 = i5;
          if (i5 == a[i8]) {}
        }
        else
        {
          paramInt2 = a[i8];
          paramArrayOfByte = h((Y4.a)localObject1, paramInt2);
        }
        if (i != 0)
        {
          localObject2 = paramArrayOfByte;
          i6 = paramInt2;
          if (paramArrayOfByte.l() > paramInt2 << 6) {}
        }
        else
        {
          if (paramArrayOfByte.l() + k <= n - n % paramInt2) {
            break label396;
          }
          i6 = paramInt2;
          localObject2 = paramArrayOfByte;
        }
      }
      break label1100;
      label396:
      i5 = i;
      i7 = i8;
      i6 = n;
      i8 = paramInt2;
      paramInt2 = i1;
      localObject2 = e(paramArrayOfByte, i6, i8);
      i6 = paramArrayOfByte.l() / i8;
      Y4.a locala = f(i5, i7, i6);
      int i2;
      if (i5 != 0) {
        i2 = 11;
      } else {
        i2 = 14;
      }
      i3 = i2 + (i7 << 2);
      localObject1 = new int[i3];
      if (i5 != 0)
      {
        i2 = 0;
        while (i2 < i3)
        {
          localObject1[i2] = i2;
          i2 += paramInt1;
        }
        i2 = i3;
      }
      else
      {
        n = i3 / 2;
        i8 = i3 + 1 + (n - 1) / 15 * paramInt2;
        m = i8 / 2;
        j = 0;
        for (;;)
        {
          i2 = i8;
          if (j >= n) {
            break;
          }
          i2 = j / 15 + j;
          localObject1[(n - j - 1)] = (m - i2 - 1);
          localObject1[(n + j)] = (i2 + m + paramInt1);
          j += paramInt1;
        }
      }
      paramArrayOfByte = new b(i2);
      int j = 0;
      i8 = j;
      n = paramInt1;
      paramInt1 = i6;
      for (;;)
      {
        m = 0;
        if (j >= i7) {
          break;
        }
        if (i5 != 0) {
          i6 = 9;
        } else {
          i6 = 12;
        }
        k = (i7 - j << paramInt2) + i6;
        i6 = m;
        while (i6 < k)
        {
          int i9 = i6 << 1;
          i4 = 0;
          m = paramInt2;
          paramInt2 = i4;
          while (paramInt2 < m)
          {
            if (((Y4.a)localObject2).j(i8 + i9 + paramInt2))
            {
              n = j << 1;
              paramArrayOfByte.l(localObject1[(n + paramInt2)], localObject1[(n + i6)]);
            }
            if (((Y4.a)localObject2).j((k << 1) + i8 + i9 + paramInt2))
            {
              n = j << 1;
              paramArrayOfByte.l(localObject1[(n + i6)], localObject1[(i3 - 1 - n - paramInt2)]);
            }
            for (;;)
            {
              break;
            }
            if (((Y4.a)localObject2).j((k << 2) + i8 + i9 + paramInt2))
            {
              n = i3 - 1 - (j << 1);
              paramArrayOfByte.l(localObject1[(n - paramInt2)], localObject1[(n - i6)]);
            }
            if (((Y4.a)localObject2).j(k * 6 + i8 + i9 + paramInt2))
            {
              n = j << 1;
              paramArrayOfByte.l(localObject1[(i3 - 1 - n - i6)], localObject1[(n + paramInt2)]);
            }
            paramInt2++;
            n = 1;
            m = 2;
          }
          i6 += n;
          paramInt2 = 2;
        }
        i8 += (k << 3);
        j += n;
        paramInt2 = 2;
      }
      c(paramArrayOfByte, i5, i2, locala);
      if (i5 != 0)
      {
        b(paramArrayOfByte, i2 / 2, 5);
      }
      else
      {
        i6 = i2 / 2;
        b(paramArrayOfByte, i6, 7);
        j = 0;
        for (paramInt2 = 0; j < i3 / 2 - 1; paramInt2 += 16)
        {
          for (i8 = i6 & 0x1; i8 < i2; i8 += 2)
          {
            m = i6 - paramInt2;
            paramArrayOfByte.l(m, i8);
            n = i6 + paramInt2;
            paramArrayOfByte.l(n, i8);
            paramArrayOfByte.l(i8, m);
            paramArrayOfByte.l(i8, n);
          }
          j += 15;
        }
      }
      localObject2 = new a();
      ((a)localObject2).c(i5);
      ((a)localObject2).f(i2);
      ((a)localObject2).d(i7);
      ((a)localObject2).b(paramInt1);
      ((a)localObject2).e(paramArrayOfByte);
      return (a)localObject2;
      label1100:
      i7 += paramInt1;
      paramArrayOfByte = (byte[])localObject2;
      i5 = i6;
    }
    throw new IllegalArgumentException("Data too large for an Aztec code");
  }
  
  public static Y4.a e(Y4.a parama, int paramInt1, int paramInt2)
  {
    int i = parama.l() / paramInt2;
    Object localObject = new Z4.c(g(paramInt2));
    int j = paramInt1 / paramInt2;
    parama = a(parama, paramInt2, j);
    ((Z4.c)localObject).b(parama, j - i);
    localObject = new Y4.a();
    j = 0;
    ((Y4.a)localObject).d(0, paramInt1 % paramInt2);
    i = parama.length;
    for (paramInt1 = j; paramInt1 < i; paramInt1++) {
      ((Y4.a)localObject).d(parama[paramInt1], paramInt2);
    }
    return (Y4.a)localObject;
  }
  
  public static Y4.a f(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    Y4.a locala = new Y4.a();
    paramInt1--;
    if (paramBoolean)
    {
      locala.d(paramInt1, 2);
      locala.d(paramInt2 - 1, 6);
    }
    for (paramInt1 = 28;; paramInt1 = 40)
    {
      locala = e(locala, paramInt1, 4);
      break;
      locala.d(paramInt1, 5);
      locala.d(paramInt2 - 1, 11);
    }
    return locala;
  }
  
  public static Z4.a g(int paramInt)
  {
    if (paramInt != 4)
    {
      if (paramInt != 6)
      {
        if (paramInt != 8)
        {
          if (paramInt != 10)
          {
            if (paramInt == 12) {
              return Z4.a.h;
            }
            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(paramInt)));
          }
          return Z4.a.i;
        }
        return Z4.a.n;
      }
      return Z4.a.j;
    }
    return Z4.a.k;
  }
  
  public static Y4.a h(Y4.a parama, int paramInt)
  {
    Y4.a locala = new Y4.a();
    int i = parama.l();
    int j = (1 << paramInt) - 2;
    int k = 0;
    while (k < i)
    {
      int m = 0;
      for (int n = m; m < paramInt; n = i2)
      {
        int i1 = k + m;
        if (i1 < i)
        {
          i2 = n;
          if (!parama.j(i1)) {}
        }
        else
        {
          i2 = n | 1 << paramInt - 1 - m;
        }
        m++;
      }
      int i2 = n & j;
      if (i2 == j) {
        n = i2;
      }
      for (;;)
      {
        locala.d(n, paramInt);
        k--;
        break label143;
        if (i2 != 0) {
          break;
        }
        n |= 0x1;
      }
      locala.d(n, paramInt);
      label143:
      k += paramInt;
    }
    return locala;
  }
  
  public static int i(int paramInt, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 88;
    } else {
      i = 112;
    }
    return (i + (paramInt << 4)) * paramInt;
  }
}

/* Location:
 * Qualified Name:     X4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
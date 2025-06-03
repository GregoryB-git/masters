package Z4;

public final class b
{
  public final a a;
  public final int[] b;
  
  public b(a parama, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length != 0)
    {
      a = parama;
      int i = paramArrayOfInt.length;
      int j = 1;
      if ((i > 1) && (paramArrayOfInt[0] == 0))
      {
        while ((j < i) && (paramArrayOfInt[j] == 0)) {
          j++;
        }
        if (j == i)
        {
          b = new int[] { 0 };
          return;
        }
        parama = new int[i - j];
        b = parama;
        System.arraycopy(paramArrayOfInt, j, parama, 0, parama.length);
        return;
      }
      b = paramArrayOfInt;
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public b a(b paramb)
  {
    if (a.equals(a))
    {
      if (f()) {
        return paramb;
      }
      if (paramb.f()) {
        return this;
      }
      Object localObject1 = b;
      paramb = b;
      if (localObject1.length <= paramb.length)
      {
        localObject2 = paramb;
        paramb = (b)localObject1;
        localObject1 = localObject2;
      }
      Object localObject2 = new int[localObject1.length];
      int i = localObject1.length - paramb.length;
      System.arraycopy(localObject1, 0, localObject2, 0, i);
      for (int j = i; j < localObject1.length; j++) {
        localObject2[j] = a.a(paramb[(j - i)], localObject1[j]);
      }
      return new b(a, (int[])localObject2);
    }
    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
  }
  
  public b[] b(b paramb)
  {
    if (a.equals(a))
    {
      if (!paramb.f())
      {
        b localb1 = a.e();
        int i = paramb.c(paramb.e());
        int j = a.f(i);
        b localb3;
        for (b localb2 = this; (localb2.e() >= paramb.e()) && (!localb2.f()); localb2 = localb2.a(localb3))
        {
          i = localb2.e() - paramb.e();
          int k = a.h(localb2.c(localb2.e()), j);
          localb3 = paramb.h(i, k);
          localb1 = localb1.a(a.b(i, k));
        }
        return new b[] { localb1, localb2 };
      }
      throw new IllegalArgumentException("Divide by 0");
    }
    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
  }
  
  public int c(int paramInt)
  {
    int[] arrayOfInt = b;
    return arrayOfInt[(arrayOfInt.length - 1 - paramInt)];
  }
  
  public int[] d()
  {
    return b;
  }
  
  public int e()
  {
    return b.length - 1;
  }
  
  public boolean f()
  {
    return b[0] == 0;
  }
  
  public b g(b paramb)
  {
    if (a.equals(a))
    {
      if ((!f()) && (!paramb.f()))
      {
        int[] arrayOfInt1 = b;
        int i = arrayOfInt1.length;
        paramb = b;
        int j = paramb.length;
        int[] arrayOfInt2 = new int[i + j - 1];
        for (int k = 0; k < i; k++)
        {
          int m = arrayOfInt1[k];
          for (int n = 0; n < j; n++)
          {
            int i1 = k + n;
            arrayOfInt2[i1] = a.a(arrayOfInt2[i1], a.h(m, paramb[n]));
          }
        }
        return new b(a, arrayOfInt2);
      }
      return a.e();
    }
    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
  }
  
  public b h(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      if (paramInt2 == 0) {
        return a.e();
      }
      int i = b.length;
      int[] arrayOfInt = new int[paramInt1 + i];
      for (paramInt1 = 0; paramInt1 < i; paramInt1++) {
        arrayOfInt[paramInt1] = a.h(b[paramInt1], paramInt2);
      }
      return new b(a, arrayOfInt);
    }
    throw new IllegalArgumentException();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(e() * 8);
    for (int i = e(); i >= 0; i--)
    {
      int j = c(i);
      if (j != 0)
      {
        int k;
        if (j < 0)
        {
          localStringBuilder.append(" - ");
          k = -j;
        }
        else
        {
          k = j;
          if (localStringBuilder.length() > 0)
          {
            localStringBuilder.append(" + ");
            k = j;
          }
        }
        if ((i == 0) || (k != 1))
        {
          k = a.g(k);
          if (k == 0) {
            k = 49;
          }
          for (int m = k;; m = k)
          {
            localStringBuilder.append(m);
            break label147;
            if (k != 1) {
              break;
            }
            k = 97;
          }
          localStringBuilder.append("a^");
          localStringBuilder.append(k);
        }
        label147:
        if (i != 0) {
          if (i == 1)
          {
            localStringBuilder.append('x');
          }
          else
          {
            localStringBuilder.append("x^");
            localStringBuilder.append(i);
          }
        }
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     Z4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package ma;

import java.util.Arrays;

public final class q1
{
  public static final q1 f = new q1(0, new int[0], new Object[0], false);
  public int a;
  public int[] b;
  public Object[] c;
  public int d = -1;
  public boolean e;
  
  public q1()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  public q1(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    a = paramInt;
    b = paramArrayOfInt;
    c = paramArrayOfObject;
    e = paramBoolean;
  }
  
  public final void a(int paramInt)
  {
    int[] arrayOfInt = b;
    if (paramInt > arrayOfInt.length)
    {
      int i = a;
      i = i / 2 + i;
      if (i >= paramInt) {
        paramInt = i;
      }
      i = paramInt;
      if (paramInt < 8) {
        i = 8;
      }
      b = Arrays.copyOf(arrayOfInt, i);
      c = Arrays.copyOf(c, i);
    }
  }
  
  public final int b()
  {
    int i = d;
    if (i != -1) {
      return i;
    }
    int j = 0;
    for (int k = 0; j < a; k = i)
    {
      int m = b[j];
      i = m >>> 3;
      m &= 0x7;
      if (m != 0)
      {
        if (m != 1)
        {
          if (m != 2)
          {
            if (m != 3)
            {
              if (m == 5)
              {
                ((Integer)c[j]).intValue();
                i = k.z(i);
              }
              else
              {
                i = b0.c;
                throw new IllegalStateException(new b0.a());
              }
            }
            else
            {
              i = k.N(i);
              i = ((q1)c[j]).b() + i * 2 + k;
              break label199;
            }
          }
          else {
            i = k.w(i, (h)c[j]);
          }
        }
        else
        {
          ((Long)c[j]).longValue();
          i = k.A(i);
        }
      }
      else {
        i = k.Q(i, ((Long)c[j]).longValue());
      }
      i += k;
      label199:
      j++;
    }
    d = k;
    return k;
  }
  
  public final void c(int paramInt, Object paramObject)
  {
    if (e)
    {
      a(a + 1);
      int[] arrayOfInt = b;
      int i = a;
      arrayOfInt[i] = paramInt;
      c[i] = paramObject;
      a = (i + 1);
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void d(l paraml)
  {
    if (a == 0) {
      return;
    }
    paraml.getClass();
    for (int i = 0; i < a; i++)
    {
      int j = b[i];
      Object localObject = c[i];
      int k = j >>> 3;
      j &= 0x7;
      if (j != 0)
      {
        if (j != 1)
        {
          if (j != 2)
          {
            if (j != 3)
            {
              if (j == 5)
              {
                paraml.e(k, ((Integer)localObject).intValue());
              }
              else
              {
                i = b0.c;
                throw new RuntimeException(new b0.a());
              }
            }
            else
            {
              a.k0(k, 3);
              ((q1)localObject).d(paraml);
              a.k0(k, 4);
            }
          }
          else {
            paraml.b(k, (h)localObject);
          }
        }
        else {
          paraml.f(k, ((Long)localObject).longValue());
        }
      }
      else {
        paraml.j(k, ((Long)localObject).longValue());
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof q1)) {
      return false;
    }
    paramObject = (q1)paramObject;
    int i = a;
    if (i == a)
    {
      Object localObject = b;
      int[] arrayOfInt = b;
      for (int j = 0; j < i; j++) {
        if (localObject[j] != arrayOfInt[j])
        {
          j = 0;
          break label87;
        }
      }
      j = 1;
      label87:
      if (j != 0)
      {
        localObject = c;
        paramObject = c;
        i = a;
        for (j = 0; j < i; j++) {
          if (!localObject[j].equals(paramObject[j]))
          {
            j = 0;
            break label145;
          }
        }
        j = 1;
        label145:
        if (j != 0) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    Object localObject = b;
    int j = 0;
    int k = 17;
    int m = 0;
    int n = 17;
    while (m < i)
    {
      n = n * 31 + localObject[m];
      m++;
    }
    localObject = c;
    int i1 = a;
    m = k;
    while (j < i1)
    {
      m = m * 31 + localObject[j].hashCode();
      j++;
    }
    return ((527 + i) * 31 + n) * 31 + m;
  }
}

/* Location:
 * Qualified Name:     ma.q1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
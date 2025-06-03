package s0;

import java.util.Arrays;

public final class i1
{
  public static final i1 f = new i1(0, new int[0], new Object[0], false);
  public int a;
  public int[] b;
  public Object[] c;
  public int d = -1;
  public boolean e;
  
  public i1()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  public i1(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    a = paramInt;
    b = paramArrayOfInt;
    c = paramArrayOfObject;
    e = paramBoolean;
  }
  
  public final int a()
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
                i = j.z(i);
              }
              else
              {
                i = y.a;
                throw new IllegalStateException(new y.a());
              }
            }
            else
            {
              i = j.N(i);
              i = ((i1)c[j]).a() + i * 2 + k;
              break label199;
            }
          }
          else {
            i = j.w(i, (g)c[j]);
          }
        }
        else
        {
          ((Long)c[j]).longValue();
          i = j.A(i);
        }
      }
      else {
        i = j.Q(i, ((Long)c[j]).longValue());
      }
      i += k;
      label199:
      j++;
    }
    d = k;
    return k;
  }
  
  public final void b(int paramInt, Object paramObject)
  {
    if (e)
    {
      int i = a;
      int[] arrayOfInt = b;
      if (i == arrayOfInt.length)
      {
        if (i < 4) {
          j = 8;
        } else {
          j = i >> 1;
        }
        j = i + j;
        b = Arrays.copyOf(arrayOfInt, j);
        c = Arrays.copyOf(c, j);
      }
      arrayOfInt = b;
      int j = a;
      arrayOfInt[j] = paramInt;
      c[j] = paramObject;
      a = (j + 1);
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void c(k paramk)
  {
    if (a == 0) {
      return;
    }
    paramk.getClass();
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
                paramk.e(k, ((Integer)localObject).intValue());
              }
              else
              {
                i = y.a;
                throw new RuntimeException(new y.a());
              }
            }
            else
            {
              a.k0(k, 3);
              ((i1)localObject).c(paramk);
              a.k0(k, 4);
            }
          }
          else {
            paramk.b(k, (g)localObject);
          }
        }
        else {
          paramk.f(k, ((Long)localObject).longValue());
        }
      }
      else {
        paramk.j(k, ((Long)localObject).longValue());
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
    if (!(paramObject instanceof i1)) {
      return false;
    }
    paramObject = (i1)paramObject;
    int i = a;
    if (i == a)
    {
      int[] arrayOfInt = b;
      Object localObject = b;
      for (int j = 0; j < i; j++) {
        if (arrayOfInt[j] != localObject[j])
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
            break label147;
          }
        }
        j = 1;
        label147:
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
 * Qualified Name:     s0.i1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
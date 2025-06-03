package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class v5
{
  public static final v5 f = new v5(0, new int[0], new Object[0], false);
  public int a;
  public int[] b;
  public Object[] c;
  public int d = -1;
  public boolean e;
  
  public v5()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  public v5(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    a = paramInt;
    b = paramArrayOfInt;
    c = paramArrayOfObject;
    e = paramBoolean;
  }
  
  public static v5 c(v5 paramv51, v5 paramv52)
  {
    int i = a + a;
    int[] arrayOfInt = Arrays.copyOf(b, i);
    System.arraycopy(b, 0, arrayOfInt, a, a);
    Object[] arrayOfObject = Arrays.copyOf(c, i);
    System.arraycopy(c, 0, arrayOfObject, a, a);
    return new v5(i, arrayOfInt, arrayOfObject, true);
  }
  
  public static void f(int paramInt, Object paramObject, T5 paramT5)
  {
    int i = paramInt >>> 3;
    paramInt &= 0x7;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 5)
            {
              paramT5.k(i, ((Integer)paramObject).intValue());
              return;
            }
            throw new RuntimeException(k4.a());
          }
          if (paramT5.a() == W5.a)
          {
            paramT5.l(i);
            ((v5)paramObject).j(paramT5);
            paramT5.e(i);
            return;
          }
          paramT5.e(i);
          ((v5)paramObject).j(paramT5);
          paramT5.l(i);
          return;
        }
        paramT5.f(i, (q3)paramObject);
        return;
      }
      paramT5.M(i, ((Long)paramObject).longValue());
      return;
    }
    paramT5.j(i, ((Long)paramObject).longValue());
  }
  
  public static v5 k()
  {
    return f;
  }
  
  public static v5 l()
  {
    return new v5();
  }
  
  public final int a()
  {
    int i = d;
    if (i != -1) {
      return i;
    }
    int j = 0;
    int k = 0;
    while (j < a)
    {
      int m = b[j];
      i = m >>> 3;
      m &= 0x7;
      if (m != 0) {
        if (m != 1) {
          if (m != 2) {
            if (m != 3) {
              if (m == 5) {
                i = J3.h0(i, ((Integer)c[j]).intValue());
              }
            }
          }
        }
      }
      for (;;)
      {
        k += i;
        break;
        throw new IllegalStateException(k4.a());
        i = (J3.s0(i) << 1) + ((v5)c[j]).a();
        continue;
        i = J3.Q(i, (q3)c[j]);
        continue;
        i = J3.P(i, ((Long)c[j]).longValue());
        continue;
        i = J3.m0(i, ((Long)c[j]).longValue());
      }
      j++;
    }
    d = k;
    return k;
  }
  
  public final v5 b(v5 paramv5)
  {
    if (paramv5.equals(f)) {
      return this;
    }
    n();
    int i = a + a;
    d(i);
    System.arraycopy(b, 0, b, a, a);
    System.arraycopy(c, 0, c, a, a);
    a = i;
    return this;
  }
  
  public final void d(int paramInt)
  {
    int[] arrayOfInt = b;
    if (paramInt > arrayOfInt.length)
    {
      int i = a;
      i += i / 2;
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
  
  public final void e(int paramInt, Object paramObject)
  {
    n();
    d(a + 1);
    int[] arrayOfInt = b;
    int i = a;
    arrayOfInt[i] = paramInt;
    c[i] = paramObject;
    a = (i + 1);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof v5)) {
      return false;
    }
    paramObject = (v5)paramObject;
    int i = a;
    if (i == a)
    {
      int[] arrayOfInt = b;
      Object localObject = b;
      for (int j = 0; j < i; j++) {
        if (arrayOfInt[j] != localObject[j]) {
          break label132;
        }
      }
      localObject = c;
      paramObject = c;
      i = a;
      for (j = 0; j < i; j++) {
        if (!localObject[j].equals(paramObject[j])) {
          break label132;
        }
      }
      return true;
    }
    label132:
    return false;
  }
  
  public final void g(T5 paramT5)
  {
    if (paramT5.a() == W5.b)
    {
      for (i = a - 1; i >= 0; i--) {
        paramT5.t(b[i] >>> 3, c[i]);
      }
      return;
    }
    for (int i = 0; i < a; i++) {
      paramT5.t(b[i] >>> 3, c[i]);
    }
  }
  
  public final void h(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < a; i++) {
      N4.d(paramStringBuilder, paramInt, String.valueOf(b[i] >>> 3), c[i]);
    }
  }
  
  public final int hashCode()
  {
    int i = a;
    Object localObject = b;
    int j = 17;
    int k = 0;
    int m = 17;
    for (int n = 0; n < i; n++) {
      m = m * 31 + localObject[n];
    }
    localObject = c;
    int i1 = a;
    for (n = k; n < i1; n++) {
      j = j * 31 + localObject[n].hashCode();
    }
    return ((i + 527) * 31 + m) * 31 + j;
  }
  
  public final int i()
  {
    int i = d;
    if (i != -1) {
      return i;
    }
    int j = 0;
    i = 0;
    while (j < a)
    {
      i += J3.Z(b[j] >>> 3, (q3)c[j]);
      j++;
    }
    d = i;
    return i;
  }
  
  public final void j(T5 paramT5)
  {
    if (a == 0) {
      return;
    }
    if (paramT5.a() == W5.a)
    {
      for (i = 0; i < a; i++) {
        f(b[i], c[i], paramT5);
      }
      return;
    }
    for (int i = a - 1; i >= 0; i--) {
      f(b[i], c[i], paramT5);
    }
  }
  
  public final void m()
  {
    if (e) {
      e = false;
    }
  }
  
  public final void n()
  {
    if (e) {
      return;
    }
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.v5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
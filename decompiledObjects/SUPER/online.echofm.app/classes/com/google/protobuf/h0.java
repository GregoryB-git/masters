package com.google.protobuf;

import java.util.Arrays;

public final class h0
{
  public static final h0 f = new h0(0, new int[0], new Object[0], false);
  public int a;
  public int[] b;
  public Object[] c;
  public int d = -1;
  public boolean e;
  
  public h0(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    a = paramInt;
    b = paramArrayOfInt;
    c = paramArrayOfObject;
    e = paramBoolean;
  }
  
  public static h0 c()
  {
    return f;
  }
  
  public static int f(int[] paramArrayOfInt, int paramInt)
  {
    int i = 17;
    for (int j = 0; j < paramInt; j++) {
      i = i * 31 + paramArrayOfInt[j];
    }
    return i;
  }
  
  public static int g(Object[] paramArrayOfObject, int paramInt)
  {
    int i = 17;
    for (int j = 0; j < paramInt; j++) {
      i = i * 31 + paramArrayOfObject[j].hashCode();
    }
    return i;
  }
  
  public static h0 j(h0 paramh01, h0 paramh02)
  {
    int i = a + a;
    int[] arrayOfInt = Arrays.copyOf(b, i);
    System.arraycopy(b, 0, arrayOfInt, a, a);
    Object[] arrayOfObject = Arrays.copyOf(c, i);
    System.arraycopy(c, 0, arrayOfObject, a, a);
    return new h0(i, arrayOfInt, arrayOfObject, true);
  }
  
  public static boolean k(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (!paramArrayOfObject1[i].equals(paramArrayOfObject2[i])) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean m(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (paramArrayOfInt1[i] != paramArrayOfInt2[i]) {
        return false;
      }
    }
    return true;
  }
  
  public static void o(int paramInt, Object paramObject, n0 paramn0)
  {
    int i = m0.a(paramInt);
    paramInt = m0.b(paramInt);
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 5) {
              paramn0.l(i, ((Integer)paramObject).intValue());
            } else {
              throw new RuntimeException(v.a());
            }
          }
          else if (paramn0.v() == n0.a.o)
          {
            paramn0.h(i);
            ((h0)paramObject).p(paramn0);
            paramn0.z(i);
          }
          else
          {
            paramn0.z(i);
            ((h0)paramObject).p(paramn0);
            paramn0.h(i);
          }
        }
        else {
          paramn0.M(i, (f)paramObject);
        }
      }
      else {
        paramn0.u(i, ((Long)paramObject).longValue());
      }
    }
    else {
      paramn0.c(i, ((Long)paramObject).longValue());
    }
  }
  
  public void a()
  {
    if (e) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void b(int paramInt)
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
  
  public int d()
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
      i = m0.a(m);
      m = m0.b(m);
      if (m != 0) {
        if (m != 1) {
          if (m != 2) {
            if (m != 3) {
              if (m == 5) {
                i = h.m(i, ((Integer)c[j]).intValue());
              }
            }
          }
        }
      }
      for (;;)
      {
        k += i;
        break;
        throw new IllegalStateException(v.a());
        i = h.O(i) * 2 + ((h0)c[j]).d();
        continue;
        i = h.g(i, (f)c[j]);
        continue;
        i = h.o(i, ((Long)c[j]).longValue());
        continue;
        i = h.R(i, ((Long)c[j]).longValue());
      }
      j++;
    }
    d = k;
    return k;
  }
  
  public int e()
  {
    int i = d;
    if (i != -1) {
      return i;
    }
    i = 0;
    int j = 0;
    while (i < a)
    {
      j += h.D(m0.a(b[i]), (f)c[i]);
      i++;
    }
    d = j;
    return j;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof h0)) {
      return false;
    }
    paramObject = (h0)paramObject;
    int i = a;
    return (i == a) && (m(b, b, i)) && (k(c, c, a));
  }
  
  public void h()
  {
    e = false;
  }
  
  public int hashCode()
  {
    int i = a;
    return ((527 + i) * 31 + f(b, i)) * 31 + g(c, a);
  }
  
  public h0 i(h0 paramh0)
  {
    if (paramh0.equals(c())) {
      return this;
    }
    a();
    int i = a + a;
    b(i);
    System.arraycopy(b, 0, b, a, a);
    System.arraycopy(c, 0, c, a, a);
    a = i;
    return this;
  }
  
  public final void l(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < a; i++) {
      M.d(paramStringBuilder, paramInt, String.valueOf(m0.a(b[i])), c[i]);
    }
  }
  
  public void n(n0 paramn0)
  {
    if (paramn0.v() == n0.a.p) {
      for (i = a - 1; i >= 0; i--) {
        paramn0.f(m0.a(b[i]), c[i]);
      }
    }
    for (int i = 0; i < a; i++) {
      paramn0.f(m0.a(b[i]), c[i]);
    }
  }
  
  public void p(n0 paramn0)
  {
    if (a == 0) {
      return;
    }
    if (paramn0.v() == n0.a.o) {
      for (i = 0; i < a; i++) {
        o(b[i], c[i], paramn0);
      }
    }
    for (int i = a - 1; i >= 0; i--) {
      o(b[i], c[i], paramn0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
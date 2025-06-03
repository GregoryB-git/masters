package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

public final class l0
{
  public static final l0 f = new l0(0, new int[0], new Object[0], false);
  public int a;
  public int[] b;
  public Object[] c;
  public int d = -1;
  public boolean e;
  
  public l0()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  public l0(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    a = paramInt;
    b = paramArrayOfInt;
    c = paramArrayOfObject;
    e = paramBoolean;
  }
  
  public static l0 c()
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
  
  public static l0 j(l0 paraml01, l0 paraml02)
  {
    int i = a + a;
    int[] arrayOfInt = Arrays.copyOf(b, i);
    System.arraycopy(b, 0, arrayOfInt, a, a);
    Object[] arrayOfObject = Arrays.copyOf(c, i);
    System.arraycopy(c, 0, arrayOfObject, a, a);
    return new l0(i, arrayOfInt, arrayOfObject, true);
  }
  
  public static l0 k()
  {
    return new l0();
  }
  
  public static boolean l(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (!paramArrayOfObject1[i].equals(paramArrayOfObject2[i])) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean o(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (paramArrayOfInt1[i] != paramArrayOfInt2[i]) {
        return false;
      }
    }
    return true;
  }
  
  public static void q(int paramInt, Object paramObject, r0 paramr0)
  {
    int i = q0.a(paramInt);
    paramInt = q0.b(paramInt);
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 5) {
              paramr0.l(i, ((Integer)paramObject).intValue());
            } else {
              throw new RuntimeException(A.e());
            }
          }
          else if (paramr0.v() == r0.a.o)
          {
            paramr0.h(i);
            ((l0)paramObject).r(paramr0);
            paramr0.z(i);
          }
          else
          {
            paramr0.z(i);
            ((l0)paramObject).r(paramr0);
            paramr0.h(i);
          }
        }
        else {
          paramr0.M(i, (h)paramObject);
        }
      }
      else {
        paramr0.u(i, ((Long)paramObject).longValue());
      }
    }
    else {
      paramr0.c(i, ((Long)paramObject).longValue());
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
      i = q0.a(m);
      m = q0.b(m);
      if (m != 0) {
        if (m != 1) {
          if (m != 2) {
            if (m != 3) {
              if (m == 5) {
                i = k.l(i, ((Integer)c[j]).intValue());
              }
            }
          }
        }
      }
      for (;;)
      {
        k += i;
        break;
        throw new IllegalStateException(A.e());
        i = k.L(i) * 2 + ((l0)c[j]).d();
        continue;
        i = k.f(i, (h)c[j]);
        continue;
        i = k.n(i, ((Long)c[j]).longValue());
        continue;
        i = k.O(i, ((Long)c[j]).longValue());
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
      j += k.A(q0.a(b[i]), (h)c[i]);
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
    if (!(paramObject instanceof l0)) {
      return false;
    }
    paramObject = (l0)paramObject;
    int i = a;
    return (i == a) && (o(b, b, i)) && (l(c, c, a));
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
  
  public l0 i(l0 paraml0)
  {
    if (paraml0.equals(c())) {
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
  
  public final void m(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < a; i++) {
      Q.d(paramStringBuilder, paramInt, String.valueOf(q0.a(b[i])), c[i]);
    }
  }
  
  public void n(int paramInt, Object paramObject)
  {
    a();
    b(a + 1);
    int[] arrayOfInt = b;
    int i = a;
    arrayOfInt[i] = paramInt;
    c[i] = paramObject;
    a = (i + 1);
  }
  
  public void p(r0 paramr0)
  {
    if (paramr0.v() == r0.a.p) {
      for (i = a - 1; i >= 0; i--) {
        paramr0.f(q0.a(b[i]), c[i]);
      }
    }
    for (int i = 0; i < a; i++) {
      paramr0.f(q0.a(b[i]), c[i]);
    }
  }
  
  public void r(r0 paramr0)
  {
    if (a == 0) {
      return;
    }
    if (paramr0.v() == r0.a.o) {
      for (i = 0; i < a; i++) {
        q(b[i], c[i], paramr0);
      }
    }
    for (int i = a - 1; i >= 0; i--) {
      q(b[i], c[i], paramr0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
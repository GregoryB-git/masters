package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

public final class m0
{
  public static final m0 f = new m0(0, new int[0], new Object[0], false);
  public int a;
  public int[] b;
  public Object[] c;
  public int d = -1;
  public boolean e;
  
  public m0()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  public m0(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    a = paramInt;
    b = paramArrayOfInt;
    c = paramArrayOfObject;
    e = paramBoolean;
  }
  
  public static boolean c(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (paramArrayOfInt1[i] != paramArrayOfInt2[i]) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean d(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (!paramArrayOfObject1[i].equals(paramArrayOfObject2[i])) {
        return false;
      }
    }
    return true;
  }
  
  public static m0 e()
  {
    return f;
  }
  
  public static int h(int[] paramArrayOfInt, int paramInt)
  {
    int i = 17;
    for (int j = 0; j < paramInt; j++) {
      i = i * 31 + paramArrayOfInt[j];
    }
    return i;
  }
  
  public static int i(Object[] paramArrayOfObject, int paramInt)
  {
    int i = 17;
    for (int j = 0; j < paramInt; j++) {
      i = i * 31 + paramArrayOfObject[j].hashCode();
    }
    return i;
  }
  
  public static m0 k(m0 paramm01, m0 paramm02)
  {
    int i = a + a;
    int[] arrayOfInt = Arrays.copyOf(b, i);
    System.arraycopy(b, 0, arrayOfInt, a, a);
    Object[] arrayOfObject = Arrays.copyOf(c, i);
    System.arraycopy(c, 0, arrayOfObject, a, a);
    return new m0(i, arrayOfInt, arrayOfObject, true);
  }
  
  public static m0 l()
  {
    return new m0();
  }
  
  public static void p(int paramInt, Object paramObject, s0 params0)
  {
    int i = r0.a(paramInt);
    paramInt = r0.b(paramInt);
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 5) {
              params0.l(i, ((Integer)paramObject).intValue());
            } else {
              throw new RuntimeException(z.d());
            }
          }
          else if (params0.v() == s0.a.o)
          {
            params0.h(i);
            ((m0)paramObject).q(params0);
            params0.z(i);
          }
          else
          {
            params0.z(i);
            ((m0)paramObject).q(params0);
            params0.h(i);
          }
        }
        else {
          params0.J(i, (g)paramObject);
        }
      }
      else {
        params0.u(i, ((Long)paramObject).longValue());
      }
    }
    else {
      params0.c(i, ((Long)paramObject).longValue());
    }
  }
  
  public void a()
  {
    if (e) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void b()
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
      int j = i + j;
      b = Arrays.copyOf(arrayOfInt, j);
      c = Arrays.copyOf(c, j);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof m0)) {
      return false;
    }
    paramObject = (m0)paramObject;
    int i = a;
    return (i == a) && (c(b, b, i)) && (d(c, c, a));
  }
  
  public int f()
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
      i = r0.a(m);
      m = r0.b(m);
      if (m != 0) {
        if (m != 1) {
          if (m != 2) {
            if (m != 3) {
              if (m == 5) {
                i = j.l(i, ((Integer)c[j]).intValue());
              }
            }
          }
        }
      }
      for (;;)
      {
        k += i;
        break;
        throw new IllegalStateException(z.d());
        i = j.P(i) * 2 + ((m0)c[j]).f();
        continue;
        i = j.f(i, (g)c[j]);
        continue;
        i = j.n(i, ((Long)c[j]).longValue());
        continue;
        i = j.S(i, ((Long)c[j]).longValue());
      }
      j++;
    }
    d = k;
    return k;
  }
  
  public int g()
  {
    int i = d;
    if (i != -1) {
      return i;
    }
    int j = 0;
    i = 0;
    while (j < a)
    {
      i += j.D(r0.a(b[j]), (g)c[j]);
      j++;
    }
    d = i;
    return i;
  }
  
  public int hashCode()
  {
    int i = a;
    return ((527 + i) * 31 + h(b, i)) * 31 + i(c, a);
  }
  
  public void j()
  {
    e = false;
  }
  
  public final void m(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < a; i++) {
      Q.c(paramStringBuilder, paramInt, String.valueOf(r0.a(b[i])), c[i]);
    }
  }
  
  public void n(int paramInt, Object paramObject)
  {
    a();
    b();
    int[] arrayOfInt = b;
    int i = a;
    arrayOfInt[i] = paramInt;
    c[i] = paramObject;
    a = (i + 1);
  }
  
  public void o(s0 params0)
  {
    if (params0.v() == s0.a.p) {
      for (i = a - 1; i >= 0; i--) {
        params0.f(r0.a(b[i]), c[i]);
      }
    }
    for (int i = 0; i < a; i++) {
      params0.f(r0.a(b[i]), c[i]);
    }
  }
  
  public void q(s0 params0)
  {
    if (a == 0) {
      return;
    }
    if (params0.v() == s0.a.o) {
      for (i = 0; i < a; i++) {
        p(b[i], c[i], params0);
      }
    }
    for (int i = a - 1; i >= 0; i--) {
      p(b[i], c[i], params0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
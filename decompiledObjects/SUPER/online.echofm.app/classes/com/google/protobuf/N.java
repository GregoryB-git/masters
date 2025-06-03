package com.google.protobuf;

import android.support.v4.media.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

public final class N
  implements Z
{
  public static final int[] r = new int[0];
  public static final Unsafe s = k0.D();
  public final int[] a;
  public final Object[] b;
  public final int c;
  public final int d;
  public final K e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  public final int[] j;
  public final int k;
  public final int l;
  public final P m;
  public final A n;
  public final g0 o;
  public final l p;
  public final F q;
  
  public N(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, K paramK, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt2, int paramInt3, int paramInt4, P paramP, A paramA, g0 paramg0, l paraml, F paramF)
  {
    a = paramArrayOfInt1;
    b = paramArrayOfObject;
    c = paramInt1;
    d = paramInt2;
    g = (paramK instanceof r);
    h = paramBoolean1;
    if ((paraml != null) && (paraml.d(paramK))) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    f = paramBoolean1;
    i = paramBoolean2;
    j = paramArrayOfInt2;
    k = paramInt3;
    l = paramInt4;
    m = paramP;
    n = paramA;
    o = paramg0;
    p = paraml;
    e = paramK;
    q = paramF;
  }
  
  public static boolean C(int paramInt)
  {
    boolean bool;
    if ((paramInt & 0x10000000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static List D(Object paramObject, long paramLong)
  {
    return (List)k0.C(paramObject, paramLong);
  }
  
  public static long E(Object paramObject, long paramLong)
  {
    return k0.A(paramObject, paramLong);
  }
  
  public static N I(Class paramClass, I paramI, P paramP, A paramA, g0 paramg0, l paraml, F paramF)
  {
    if ((paramI instanceof Y)) {
      return K((Y)paramI, paramP, paramA, paramg0, paraml, paramF);
    }
    a.a(paramI);
    return J(null, paramP, paramA, paramg0, paraml, paramF);
  }
  
  public static N J(d0 paramd0, P paramP, A paramA, g0 paramg0, l paraml, F paramF)
  {
    throw null;
  }
  
  public static N K(Y paramY, P paramP, A paramA, g0 paramg0, l paraml, F paramF)
  {
    boolean bool;
    if (paramY.b() == V.p) {
      bool = true;
    } else {
      bool = false;
    }
    String str = paramY.e();
    int i1 = str.length();
    if (str.charAt(0) >= 55296) {
      for (i2 = 1;; i2 = i3)
      {
        i3 = i2 + 1;
        i4 = i3;
        if (str.charAt(i2) < 55296) {
          break;
        }
      }
    }
    int i4 = 1;
    int i2 = i4 + 1;
    int i5 = str.charAt(i4);
    int i3 = i2;
    i4 = i5;
    if (i5 >= 55296)
    {
      i3 = i5 & 0x1FFF;
      i4 = 13;
      for (i5 = i2;; i5 = i2)
      {
        i2 = i5 + 1;
        i5 = str.charAt(i5);
        if (i5 < 55296) {
          break;
        }
        i3 |= (i5 & 0x1FFF) << i4;
        i4 += 13;
      }
      i4 = i3 | i5 << i4;
      i3 = i2;
    }
    int[] arrayOfInt1;
    int i6;
    int i8;
    int i9;
    if (i4 == 0)
    {
      arrayOfInt1 = r;
      i5 = 0;
      i6 = i5;
      i7 = i6;
      i2 = i7;
      i4 = i2;
      i8 = i4;
      i9 = i8;
      i10 = i2;
    }
    else
    {
      i4 = i3 + 1;
      i5 = str.charAt(i3);
      i2 = i5;
      i3 = i4;
      if (i5 >= 55296)
      {
        i2 = i5 & 0x1FFF;
        i3 = 13;
        i5 = i4;
        i4 = i2;
        for (;;)
        {
          i2 = i5 + 1;
          i5 = str.charAt(i5);
          if (i5 < 55296) {
            break;
          }
          i4 |= (i5 & 0x1FFF) << i3;
          i3 += 13;
          i5 = i2;
        }
        i4 |= i5 << i3;
        i3 = i2;
        i2 = i4;
      }
      i4 = i3 + 1;
      i5 = str.charAt(i3);
      i8 = i5;
      i3 = i4;
      if (i5 >= 55296)
      {
        i5 &= 0x1FFF;
        i3 = 13;
        for (i7 = i4;; i7 = i4)
        {
          i4 = i7 + 1;
          i7 = str.charAt(i7);
          if (i7 < 55296) {
            break;
          }
          i5 |= (i7 & 0x1FFF) << i3;
          i3 += 13;
        }
        i8 = i5 | i7 << i3;
        i3 = i4;
      }
      i4 = i3 + 1;
      i7 = str.charAt(i3);
      i3 = i7;
      i5 = i4;
      if (i7 >= 55296)
      {
        i5 = i7 & 0x1FFF;
        i3 = 13;
        for (i7 = i4;; i7 = i4)
        {
          i4 = i7 + 1;
          i7 = str.charAt(i7);
          if (i7 < 55296) {
            break;
          }
          i5 |= (i7 & 0x1FFF) << i3;
          i3 += 13;
        }
        i3 = i5 | i7 << i3;
        i5 = i4;
      }
      i4 = i5 + 1;
      i10 = str.charAt(i5);
      i5 = i10;
      i7 = i4;
      if (i10 >= 55296)
      {
        i7 = i10 & 0x1FFF;
        i5 = 13;
        for (i10 = i4;; i10 = i4)
        {
          i4 = i10 + 1;
          i10 = str.charAt(i10);
          if (i10 < 55296) {
            break;
          }
          i7 |= (i10 & 0x1FFF) << i5;
          i5 += 13;
        }
        i5 = i7 | i10 << i5;
        i7 = i4;
      }
      i4 = i7 + 1;
      i6 = str.charAt(i7);
      i7 = i6;
      i10 = i4;
      if (i6 >= 55296)
      {
        i10 = i6 & 0x1FFF;
        i7 = 13;
        for (i6 = i4;; i6 = i4)
        {
          i4 = i6 + 1;
          i6 = str.charAt(i6);
          if (i6 < 55296) {
            break;
          }
          i10 |= (i6 & 0x1FFF) << i7;
          i7 += 13;
        }
        i7 = i10 | i6 << i7;
        i10 = i4;
      }
      i4 = i10 + 1;
      i11 = str.charAt(i10);
      i10 = i11;
      i6 = i4;
      if (i11 >= 55296)
      {
        i6 = i11 & 0x1FFF;
        i10 = 13;
        for (i11 = i4;; i11 = i4)
        {
          i4 = i11 + 1;
          i11 = str.charAt(i11);
          if (i11 < 55296) {
            break;
          }
          i6 |= (i11 & 0x1FFF) << i10;
          i10 += 13;
        }
        i10 = i6 | i11 << i10;
        i6 = i4;
      }
      i4 = i6 + 1;
      i9 = str.charAt(i6);
      i11 = i9;
      i6 = i4;
      if (i9 >= 55296)
      {
        i11 = i9 & 0x1FFF;
        i6 = 13;
        for (i9 = i4;; i9 = i4)
        {
          i4 = i9 + 1;
          i9 = str.charAt(i9);
          if (i9 < 55296) {
            break;
          }
          i11 |= (i9 & 0x1FFF) << i6;
          i6 += 13;
        }
        i11 |= i9 << i6;
        i6 = i4;
      }
      i9 = i6 + 1;
      i12 = str.charAt(i6);
      i4 = i12;
      i6 = i9;
      if (i12 >= 55296)
      {
        i6 = i12 & 0x1FFF;
        i4 = 13;
        i12 = i9;
        i9 = i6;
        for (;;)
        {
          i6 = i12 + 1;
          i12 = str.charAt(i12);
          if (i12 < 55296) {
            break;
          }
          i9 |= (i12 & 0x1FFF) << i4;
          i4 += 13;
          i12 = i6;
        }
        i4 = i9 | i12 << i4;
      }
      arrayOfInt1 = new int[i4 + i10 + i11];
      i8 = i2 * 2 + i8;
      i11 = i6;
      i6 = i5;
      i5 = i3;
      i9 = i2;
      i3 = i11;
    }
    Unsafe localUnsafe = s;
    Object[] arrayOfObject1 = paramY.d();
    Class localClass = paramY.c().getClass();
    int[] arrayOfInt2 = new int[i7 * 3];
    Object[] arrayOfObject2 = new Object[i7 * 2];
    int i13 = i4 + i10;
    i2 = i4;
    int i14 = i13;
    int i10 = 0;
    int i11 = 0;
    int i7 = i8;
    int i15 = i4;
    int i12 = i6;
    int i16 = i5;
    i4 = i1;
    for (;;)
    {
      int i17 = i11;
      if (i3 >= i4) {
        break;
      }
      i8 = i3 + 1;
      i11 = str.charAt(i3);
      if (i11 >= 55296)
      {
        i6 = i11 & 0x1FFF;
        i5 = 13;
        for (;;)
        {
          i3 = i8 + 1;
          i8 = str.charAt(i8);
          if (i8 < 55296) {
            break;
          }
          i6 |= (i8 & 0x1FFF) << i5;
          i5 += 13;
          i8 = i3;
        }
        i11 = i6 | i8 << i5;
        i5 = i3;
      }
      else
      {
        i5 = i8;
      }
      i3 = i5 + 1;
      i1 = str.charAt(i5);
      if (i1 >= 55296)
      {
        i6 = i1 & 0x1FFF;
        i5 = 13;
        for (;;)
        {
          i8 = i3 + 1;
          i1 = str.charAt(i3);
          i3 = i4;
          if (i1 < 55296) {
            break;
          }
          i6 |= (i1 & 0x1FFF) << i5;
          i5 += 13;
          i4 = i3;
          i3 = i8;
        }
        i1 = i6 | i1 << i5;
        i6 = i8;
      }
      else
      {
        i6 = i3;
        i3 = i4;
      }
      int i18 = i1 & 0xFF;
      i5 = i10;
      if ((i1 & 0x400) != 0)
      {
        arrayOfInt1[i10] = i17;
        i5 = i10 + 1;
      }
      Object localObject;
      int i19;
      int i20;
      int i21;
      int i22;
      int i23;
      if (i18 >= 51)
      {
        i10 = i6 + 1;
        i8 = str.charAt(i6);
        i6 = i8;
        i4 = i10;
        if (i8 >= 55296)
        {
          i4 = i8 & 0x1FFF;
          i6 = 13;
          i8 = i10;
          i10 = i4;
          for (;;)
          {
            i4 = i8 + 1;
            i8 = str.charAt(i8);
            if (i8 < 55296) {
              break;
            }
            i10 |= (i8 & 0x1FFF) << i6;
            i6 += 13;
            i8 = i4;
          }
          i6 = i10 | i8 << i6;
        }
        i8 = i18 - 51;
        if ((i8 != 9) && (i8 != 17))
        {
          i10 = i7;
          if (i8 == 12)
          {
            i10 = i7;
            if (!bool)
            {
              i8 = i17 / 3;
              i10 = i7 + 1;
              arrayOfObject2[(i8 * 2 + 1)] = arrayOfObject1[i7];
            }
          }
        }
        else
        {
          for (i7 = i10;; i7 = i10)
          {
            i10 = i7;
            break;
            i8 = i17 / 3;
            i10 = i7 + 1;
            arrayOfObject2[(i8 * 2 + 1)] = arrayOfObject1[i7];
          }
        }
        i7 = i6 * 2;
        localObject = arrayOfObject1[i7];
        if ((localObject instanceof Field)) {
          localObject = (Field)localObject;
        }
        for (;;)
        {
          break;
          localObject = T(localClass, (String)localObject);
          arrayOfObject1[i7] = localObject;
        }
        i19 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        i7++;
        localObject = arrayOfObject1[i7];
        if ((localObject instanceof Field)) {
          localObject = (Field)localObject;
        }
        for (;;)
        {
          break;
          localObject = T(localClass, (String)localObject);
          arrayOfObject1[i7] = localObject;
        }
        i20 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        i21 = 0;
        i7 = i10;
        i22 = i2;
        i23 = i14;
      }
      else
      {
        i8 = i7 + 1;
        localObject = T(localClass, (String)arrayOfObject1[i7]);
        if ((i18 == 9) || (i18 != 17)) {
          if ((i18 == 27) || (i18 != 49)) {
            if ((i18 != 12) && (i18 != 30) && (i18 != 44))
            {
              i4 = i8;
              i10 = i2;
              if (i18 == 50)
              {
                i4 = i2 + 1;
                arrayOfInt1[i2] = i17;
                i24 = i17 / 3 * 2;
                i10 = i7 + 2;
                arrayOfObject2[i24] = arrayOfObject1[i8];
                if ((i1 & 0x800) != 0)
                {
                  i2 = i7 + 3;
                  arrayOfObject2[(i24 + 1)] = arrayOfObject1[i10];
                  i10 = i4;
                  i4 = i2;
                }
              }
              else
              {
                i2 = i10;
              }
            }
          }
        }
        for (;;)
        {
          break label2108;
          i2 = i4;
          i4 = i10;
          break label2108;
          i4 = i8;
          i10 = i2;
          if (bool) {
            break;
          }
          i10 = i17 / 3;
          i4 = i7 + 2;
          arrayOfObject2[(i10 * 2 + 1)] = arrayOfObject1[i8];
          for (;;)
          {
            break;
            i10 = i17 / 3;
            i4 = i7 + 2;
            arrayOfObject2[(i10 * 2 + 1)] = arrayOfObject1[i8];
          }
          arrayOfObject2[(i17 / 3 * 2 + 1)] = ((Field)localObject).getType();
          i4 = i8;
        }
        label2108:
        int i25 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        int i24 = i4;
        if (((i1 & 0x1000) == 4096) && (i18 <= 17))
        {
          i7 = i6 + 1;
          i4 = str.charAt(i6);
          if (i4 >= 55296)
          {
            i6 = i4 & 0x1FFF;
            i4 = 13;
            i10 = i7;
            i7 = i6;
            for (;;)
            {
              i8 = i10 + 1;
              i10 = str.charAt(i10);
              if (i10 < 55296) {
                break;
              }
              i7 |= (i10 & 0x1FFF) << i4;
              i4 += 13;
              i10 = i8;
            }
            i4 = i7 | i10 << i4;
          }
          else
          {
            i8 = i7;
          }
          i7 = i9 * 2 + i4 / 32;
          localObject = arrayOfObject1[i7];
          if ((localObject instanceof Field)) {
            localObject = (Field)localObject;
          }
          for (;;)
          {
            break;
            localObject = T(localClass, (String)localObject);
            arrayOfObject1[i7] = localObject;
          }
          i6 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i10 = i4 % 32;
        }
        else
        {
          i4 = 1048575;
          i10 = 0;
          i8 = i6;
          i6 = i4;
        }
        i21 = i10;
        i19 = i25;
        i20 = i6;
        i7 = i24;
        i22 = i2;
        i23 = i14;
        i4 = i8;
        if (i18 >= 18)
        {
          i21 = i10;
          i19 = i25;
          i20 = i6;
          i7 = i24;
          i22 = i2;
          i23 = i14;
          i4 = i8;
          if (i18 <= 49)
          {
            arrayOfInt1[i14] = i25;
            i23 = i14 + 1;
            i4 = i8;
            i22 = i2;
            i7 = i24;
            i20 = i6;
            i19 = i25;
            i21 = i10;
          }
        }
      }
      arrayOfInt2[i17] = i11;
      if ((i1 & 0x200) != 0) {
        i2 = 536870912;
      } else {
        i2 = 0;
      }
      if ((i1 & 0x100) != 0) {
        i10 = 268435456;
      } else {
        i10 = 0;
      }
      arrayOfInt2[(i17 + 1)] = (i10 | i2 | i18 << 20 | i19);
      i11 = i17 + 3;
      arrayOfInt2[(i17 + 2)] = (i21 << 20 | i20);
      i2 = i4;
      i4 = i3;
      i3 = i2;
      i10 = i5;
      i2 = i22;
      i14 = i23;
    }
    return new N(arrayOfInt2, arrayOfObject2, i16, i12, paramY.c(), bool, false, arrayOfInt1, i15, i13, paramP, paramA, paramg0, paraml, paramF);
  }
  
  public static long M(int paramInt)
  {
    return paramInt & 0xFFFFF;
  }
  
  public static boolean N(Object paramObject, long paramLong)
  {
    return ((Boolean)k0.C(paramObject, paramLong)).booleanValue();
  }
  
  public static double O(Object paramObject, long paramLong)
  {
    return ((Double)k0.C(paramObject, paramLong)).doubleValue();
  }
  
  public static float P(Object paramObject, long paramLong)
  {
    return ((Float)k0.C(paramObject, paramLong)).floatValue();
  }
  
  public static int Q(Object paramObject, long paramLong)
  {
    return ((Integer)k0.C(paramObject, paramLong)).intValue();
  }
  
  public static long R(Object paramObject, long paramLong)
  {
    return ((Long)k0.C(paramObject, paramLong)).longValue();
  }
  
  public static Field T(Class paramClass, String paramString)
  {
    try
    {
      Field localField = paramClass.getDeclaredField(paramString);
      return localField;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (localObject : paramClass.getDeclaredFields()) {
        if (paramString.equals(((Field)localObject).getName())) {
          return (Field)localObject;
        }
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Field ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(" for ");
      ((StringBuilder)localObject).append(paramClass.getName());
      ((StringBuilder)localObject).append(" not found. Known fields are ");
      ((StringBuilder)localObject).append(Arrays.toString(???));
      throw new RuntimeException(((StringBuilder)localObject).toString());
    }
  }
  
  public static int W(int paramInt)
  {
    return (paramInt & 0xFF00000) >>> 20;
  }
  
  public static boolean j(Object paramObject, long paramLong)
  {
    return k0.r(paramObject, paramLong);
  }
  
  public static void k(Object paramObject)
  {
    if (z(paramObject)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Mutating immutable message: ");
    localStringBuilder.append(paramObject);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static double l(Object paramObject, long paramLong)
  {
    return k0.x(paramObject, paramLong);
  }
  
  public static float n(Object paramObject, long paramLong)
  {
    return k0.y(paramObject, paramLong);
  }
  
  public static int t(Object paramObject, long paramLong)
  {
    return k0.z(paramObject, paramLong);
  }
  
  public static boolean w(Object paramObject, int paramInt, Z paramZ)
  {
    return paramZ.c(k0.C(paramObject, M(paramInt)));
  }
  
  public static boolean z(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramObject instanceof r)) {
      return ((r)paramObject).I();
    }
    return true;
  }
  
  public final boolean A(Object paramObject1, Object paramObject2, int paramInt)
  {
    long l1 = S(paramInt) & 0xFFFFF;
    boolean bool;
    if (k0.z(paramObject1, l1) == k0.z(paramObject2, l1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean B(Object paramObject, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (k0.z(paramObject, S(paramInt2) & 0xFFFFF) == paramInt1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void F(Object paramObject1, Object paramObject2, int paramInt)
  {
    if (!u(paramObject2, paramInt)) {
      return;
    }
    long l1 = M(X(paramInt));
    Unsafe localUnsafe = s;
    Object localObject1 = localUnsafe.getObject(paramObject2, l1);
    if (localObject1 != null)
    {
      Z localZ = p(paramInt);
      if (!u(paramObject1, paramInt))
      {
        if (!z(localObject1))
        {
          localUnsafe.putObject(paramObject1, l1, localObject1);
        }
        else
        {
          paramObject2 = localZ.f();
          localZ.a(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l1, paramObject2);
        }
        U(paramObject1, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l1);
      paramObject2 = localObject2;
      if (!z(localObject2))
      {
        paramObject2 = localZ.f();
        localZ.a(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l1, paramObject2);
      }
      localZ.a(paramObject2, localObject1);
      return;
    }
    paramObject1 = new StringBuilder();
    ((StringBuilder)paramObject1).append("Source subfield ");
    ((StringBuilder)paramObject1).append(L(paramInt));
    ((StringBuilder)paramObject1).append(" is present but null: ");
    ((StringBuilder)paramObject1).append(paramObject2);
    throw new IllegalStateException(((StringBuilder)paramObject1).toString());
  }
  
  public final void G(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = L(paramInt);
    if (!B(paramObject2, i1, paramInt)) {
      return;
    }
    long l1 = M(X(paramInt));
    Unsafe localUnsafe = s;
    Object localObject1 = localUnsafe.getObject(paramObject2, l1);
    if (localObject1 != null)
    {
      Z localZ = p(paramInt);
      if (!B(paramObject1, i1, paramInt))
      {
        if (!z(localObject1))
        {
          localUnsafe.putObject(paramObject1, l1, localObject1);
        }
        else
        {
          paramObject2 = localZ.f();
          localZ.a(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l1, paramObject2);
        }
        V(paramObject1, i1, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l1);
      paramObject2 = localObject2;
      if (!z(localObject2))
      {
        paramObject2 = localZ.f();
        localZ.a(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l1, paramObject2);
      }
      localZ.a(paramObject2, localObject1);
      return;
    }
    paramObject1 = new StringBuilder();
    ((StringBuilder)paramObject1).append("Source subfield ");
    ((StringBuilder)paramObject1).append(L(paramInt));
    ((StringBuilder)paramObject1).append(" is present but null: ");
    ((StringBuilder)paramObject1).append(paramObject2);
    throw new IllegalStateException(((StringBuilder)paramObject1).toString());
  }
  
  public final void H(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = X(paramInt);
    long l1 = M(i1);
    int i2 = L(paramInt);
    switch (W(i1))
    {
    default: 
      break;
    case 60: 
    case 68: 
      G(paramObject1, paramObject2, paramInt);
      break;
    case 61: 
    case 62: 
    case 63: 
    case 64: 
    case 65: 
    case 66: 
    case 67: 
      if (!B(paramObject2, i2, paramInt)) {
        break;
      }
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
    case 58: 
    case 59: 
      for (;;)
      {
        k0.R(paramObject1, l1, k0.C(paramObject2, l1));
        V(paramObject1, i2, paramInt);
        break;
        if (!B(paramObject2, i2, paramInt)) {
          break;
        }
      }
    case 50: 
      b0.D(q, paramObject1, paramObject2, l1);
      break;
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      n.d(paramObject1, paramObject2, l1);
      break;
    case 9: 
    case 17: 
      F(paramObject1, paramObject2, paramInt);
      break;
    case 16: 
      if (u(paramObject2, paramInt)) {
        k0.Q(paramObject1, l1, k0.A(paramObject2, l1));
      }
      break;
    case 15: 
    case 14: 
    case 13: 
    case 12: 
    case 11: 
    case 10: 
    case 8: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
    case 3: 
    case 2: 
    case 1: 
    case 0: 
      for (;;)
      {
        label436:
        U(paramObject1, paramInt);
        return;
        if (!u(paramObject2, paramInt)) {
          return;
        }
        for (;;)
        {
          k0.P(paramObject1, l1, k0.z(paramObject2, l1));
          break label436;
          if (!u(paramObject2, paramInt)) {
            return;
          }
          break;
          if (!u(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!u(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!u(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!u(paramObject2, paramInt)) {
            return;
          }
          for (;;)
          {
            k0.R(paramObject1, l1, k0.C(paramObject2, l1));
            break;
            if (!u(paramObject2, paramInt)) {
              return;
            }
          }
          if (!u(paramObject2, paramInt)) {
            return;
          }
          k0.H(paramObject1, l1, k0.r(paramObject2, l1));
          break label436;
          if (!u(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!u(paramObject2, paramInt)) {
            return;
          }
          break;
          if (!u(paramObject2, paramInt)) {
            return;
          }
        }
        if (!u(paramObject2, paramInt)) {
          return;
        }
        break;
        if (!u(paramObject2, paramInt)) {
          return;
        }
        break;
        if (!u(paramObject2, paramInt)) {
          return;
        }
        k0.O(paramObject1, l1, k0.y(paramObject2, l1));
        continue;
        if (!u(paramObject2, paramInt)) {
          return;
        }
        k0.N(paramObject1, l1, k0.x(paramObject2, l1));
      }
    }
  }
  
  public final int L(int paramInt)
  {
    return a[paramInt];
  }
  
  public final int S(int paramInt)
  {
    return a[(paramInt + 2)];
  }
  
  public final void U(Object paramObject, int paramInt)
  {
    paramInt = S(paramInt);
    long l1 = 0xFFFFF & paramInt;
    if (l1 == 1048575L) {
      return;
    }
    k0.P(paramObject, l1, 1 << (paramInt >>> 20) | k0.z(paramObject, l1));
  }
  
  public final void V(Object paramObject, int paramInt1, int paramInt2)
  {
    k0.P(paramObject, S(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  public final int X(int paramInt)
  {
    return a[(paramInt + 1)];
  }
  
  public final void Y(Object paramObject, n0 paramn0)
  {
    if (f)
    {
      localObject1 = p.b(paramObject);
      if (!((o)localObject1).j())
      {
        localIterator = ((o)localObject1).n();
        localObject1 = (Map.Entry)localIterator.next();
        break label48;
      }
    }
    Iterator localIterator = null;
    Object localObject1 = null;
    label48:
    int i1 = a.length;
    Unsafe localUnsafe = s;
    int i2 = 1048575;
    int i3 = 0;
    int i4 = 0;
    Object localObject2;
    for (;;)
    {
      localObject2 = localObject1;
      if (i3 >= i1) {
        break;
      }
      int i5 = X(i3);
      int i6 = L(i3);
      int i7 = W(i5);
      int i9;
      if (i7 <= 17)
      {
        int i8 = a[(i3 + 2)];
        i9 = i8 & 0xFFFFF;
        int i10 = i2;
        if (i9 != i2)
        {
          i4 = localUnsafe.getInt(paramObject, i9);
          i10 = i9;
        }
        i9 = 1 << (i8 >>> 20);
        i2 = i10;
      }
      else
      {
        i9 = 0;
      }
      while ((localObject1 != null) && (p.a((Map.Entry)localObject1) <= i6))
      {
        p.f(paramn0, (Map.Entry)localObject1);
        if (localIterator.hasNext()) {
          localObject1 = (Map.Entry)localIterator.next();
        } else {
          localObject1 = null;
        }
      }
      long l1 = M(i5);
      switch (i7)
      {
      }
      for (;;)
      {
        break;
        if (B(paramObject, i6, i3))
        {
          paramn0.L(i6, localUnsafe.getObject(paramObject, l1), p(i3));
          continue;
          if (B(paramObject, i6, i3))
          {
            paramn0.w(i6, R(paramObject, l1));
            continue;
            if (B(paramObject, i6, i3))
            {
              paramn0.H(i6, Q(paramObject, l1));
              continue;
              if (B(paramObject, i6, i3))
              {
                paramn0.n(i6, R(paramObject, l1));
                continue;
                if (B(paramObject, i6, i3))
                {
                  paramn0.g(i6, Q(paramObject, l1));
                  continue;
                  if (B(paramObject, i6, i3))
                  {
                    paramn0.D(i6, Q(paramObject, l1));
                    continue;
                    if (B(paramObject, i6, i3))
                    {
                      paramn0.e(i6, Q(paramObject, l1));
                      continue;
                      if (B(paramObject, i6, i3))
                      {
                        paramn0.M(i6, (f)localUnsafe.getObject(paramObject, l1));
                        continue;
                        if (B(paramObject, i6, i3))
                        {
                          paramn0.N(i6, localUnsafe.getObject(paramObject, l1), p(i3));
                          continue;
                          if (B(paramObject, i6, i3))
                          {
                            c0(i6, localUnsafe.getObject(paramObject, l1), paramn0);
                            continue;
                            if (B(paramObject, i6, i3))
                            {
                              paramn0.d(i6, N(paramObject, l1));
                              continue;
                              if (B(paramObject, i6, i3))
                              {
                                paramn0.l(i6, Q(paramObject, l1));
                                continue;
                                if (B(paramObject, i6, i3))
                                {
                                  paramn0.u(i6, R(paramObject, l1));
                                  continue;
                                  if (B(paramObject, i6, i3))
                                  {
                                    paramn0.i(i6, Q(paramObject, l1));
                                    continue;
                                    if (B(paramObject, i6, i3))
                                    {
                                      paramn0.C(i6, R(paramObject, l1));
                                      continue;
                                      if (B(paramObject, i6, i3))
                                      {
                                        paramn0.c(i6, R(paramObject, l1));
                                        continue;
                                        if (B(paramObject, i6, i3))
                                        {
                                          paramn0.x(i6, P(paramObject, l1));
                                          continue;
                                          if (B(paramObject, i6, i3))
                                          {
                                            paramn0.m(i6, O(paramObject, l1));
                                            continue;
                                            b0(paramn0, i6, localUnsafe.getObject(paramObject, l1), i3);
                                            continue;
                                            b0.R(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, p(i3));
                                            continue;
                                            b0.Y(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.X(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.W(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.V(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.N(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.a0(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.K(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.O(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.P(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.S(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.b0(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.T(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.Q(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.M(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, true);
                                            continue;
                                            b0.Y(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.X(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.W(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.V(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.N(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.a0(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.L(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0);
                                            continue;
                                            b0.U(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, p(i3));
                                            continue;
                                            b0.Z(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0);
                                            continue;
                                            b0.K(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.O(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.P(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.S(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.b0(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.T(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.Q(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            b0.M(L(i3), (List)localUnsafe.getObject(paramObject, l1), paramn0, false);
                                            break;
                                            if ((i9 & i4) != 0)
                                            {
                                              paramn0.L(i6, localUnsafe.getObject(paramObject, l1), p(i3));
                                              break;
                                              if ((i9 & i4) != 0)
                                              {
                                                paramn0.w(i6, localUnsafe.getLong(paramObject, l1));
                                                break;
                                                if ((i9 & i4) != 0)
                                                {
                                                  paramn0.H(i6, localUnsafe.getInt(paramObject, l1));
                                                  break;
                                                  if ((i9 & i4) != 0)
                                                  {
                                                    paramn0.n(i6, localUnsafe.getLong(paramObject, l1));
                                                    break;
                                                    if ((i9 & i4) != 0)
                                                    {
                                                      paramn0.g(i6, localUnsafe.getInt(paramObject, l1));
                                                      break;
                                                      if ((i9 & i4) != 0)
                                                      {
                                                        paramn0.D(i6, localUnsafe.getInt(paramObject, l1));
                                                        break;
                                                        if ((i9 & i4) != 0)
                                                        {
                                                          paramn0.e(i6, localUnsafe.getInt(paramObject, l1));
                                                          break;
                                                          if ((i9 & i4) != 0)
                                                          {
                                                            paramn0.M(i6, (f)localUnsafe.getObject(paramObject, l1));
                                                            break;
                                                            if ((i9 & i4) != 0)
                                                            {
                                                              paramn0.N(i6, localUnsafe.getObject(paramObject, l1), p(i3));
                                                              break;
                                                              if ((i9 & i4) != 0)
                                                              {
                                                                c0(i6, localUnsafe.getObject(paramObject, l1), paramn0);
                                                                break;
                                                                if ((i9 & i4) != 0)
                                                                {
                                                                  paramn0.d(i6, j(paramObject, l1));
                                                                  break;
                                                                  if ((i9 & i4) != 0)
                                                                  {
                                                                    paramn0.l(i6, localUnsafe.getInt(paramObject, l1));
                                                                    break;
                                                                    if ((i9 & i4) != 0)
                                                                    {
                                                                      paramn0.u(i6, localUnsafe.getLong(paramObject, l1));
                                                                      break;
                                                                      if ((i9 & i4) != 0)
                                                                      {
                                                                        paramn0.i(i6, localUnsafe.getInt(paramObject, l1));
                                                                        break;
                                                                        if ((i9 & i4) != 0)
                                                                        {
                                                                          paramn0.C(i6, localUnsafe.getLong(paramObject, l1));
                                                                          break;
                                                                          if ((i9 & i4) != 0)
                                                                          {
                                                                            paramn0.c(i6, localUnsafe.getLong(paramObject, l1));
                                                                            break;
                                                                            if ((i9 & i4) != 0)
                                                                            {
                                                                              paramn0.x(i6, n(paramObject, l1));
                                                                              break;
                                                                              if ((i9 & i4) != 0) {
                                                                                paramn0.m(i6, l(paramObject, l1));
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      i3 += 3;
    }
    while (localObject2 != null)
    {
      p.f(paramn0, (Map.Entry)localObject2);
      if (localIterator.hasNext()) {
        localObject2 = (Map.Entry)localIterator.next();
      } else {
        localObject2 = null;
      }
    }
    d0(o, paramObject, paramn0);
  }
  
  public final void Z(Object paramObject, n0 paramn0)
  {
    if (f)
    {
      localObject1 = p.b(paramObject);
      if (!((o)localObject1).j())
      {
        localIterator = ((o)localObject1).n();
        localObject1 = (Map.Entry)localIterator.next();
        break label49;
      }
    }
    Iterator localIterator = null;
    Object localObject1 = localIterator;
    label49:
    int i1 = a.length;
    int i2 = 0;
    Object localObject2 = localObject1;
    for (;;)
    {
      localObject1 = localObject2;
      if (i2 >= i1) {
        break;
      }
      int i3 = X(i2);
      int i4 = L(i2);
      while ((localObject2 != null) && (p.a((Map.Entry)localObject2) <= i4))
      {
        p.f(paramn0, (Map.Entry)localObject2);
        if (localIterator.hasNext()) {
          localObject2 = (Map.Entry)localIterator.next();
        } else {
          localObject2 = null;
        }
      }
      long l1;
      label508:
      label544:
      label580:
      label616:
      label652:
      label688:
      label713:
      label748:
      label786:
      boolean bool;
      label828:
      label864:
      label900:
      label936:
      label972:
      label1008:
      float f1;
      switch (W(i3))
      {
      default: 
        break;
      case 68: 
        if (B(paramObject, i4, i2)) {
          paramn0.L(i4, k0.C(paramObject, M(i3)), p(i2));
        }
        break;
      case 67: 
        if (B(paramObject, i4, i2))
        {
          l1 = R(paramObject, M(i3));
          paramn0.w(i4, l1);
        }
        break;
      case 66: 
        if (B(paramObject, i4, i2))
        {
          i3 = Q(paramObject, M(i3));
          paramn0.H(i4, i3);
        }
        break;
      case 65: 
        if (B(paramObject, i4, i2))
        {
          l1 = R(paramObject, M(i3));
          paramn0.n(i4, l1);
        }
        break;
      case 64: 
        if (B(paramObject, i4, i2))
        {
          i3 = Q(paramObject, M(i3));
          paramn0.g(i4, i3);
        }
        break;
      case 63: 
        if (B(paramObject, i4, i2))
        {
          i3 = Q(paramObject, M(i3));
          paramn0.D(i4, i3);
        }
        break;
      case 62: 
        if (B(paramObject, i4, i2))
        {
          i3 = Q(paramObject, M(i3));
          paramn0.e(i4, i3);
        }
        break;
      case 61: 
        if (B(paramObject, i4, i2)) {
          paramn0.M(i4, (f)k0.C(paramObject, M(i3)));
        }
        break;
      case 60: 
        if (B(paramObject, i4, i2)) {
          paramn0.N(i4, k0.C(paramObject, M(i3)), p(i2));
        }
        break;
      case 59: 
        if (B(paramObject, i4, i2)) {
          c0(i4, k0.C(paramObject, M(i3)), paramn0);
        }
        break;
      case 58: 
        if (B(paramObject, i4, i2))
        {
          bool = N(paramObject, M(i3));
          paramn0.d(i4, bool);
        }
        break;
      case 57: 
        if (B(paramObject, i4, i2))
        {
          i3 = Q(paramObject, M(i3));
          paramn0.l(i4, i3);
        }
        break;
      case 56: 
        if (B(paramObject, i4, i2))
        {
          l1 = R(paramObject, M(i3));
          paramn0.u(i4, l1);
        }
        break;
      case 55: 
        if (B(paramObject, i4, i2))
        {
          i3 = Q(paramObject, M(i3));
          paramn0.i(i4, i3);
        }
        break;
      case 54: 
        if (B(paramObject, i4, i2))
        {
          l1 = R(paramObject, M(i3));
          paramn0.C(i4, l1);
        }
        break;
      case 53: 
        if (B(paramObject, i4, i2))
        {
          l1 = R(paramObject, M(i3));
          paramn0.c(i4, l1);
        }
        break;
      case 52: 
        if (B(paramObject, i4, i2))
        {
          f1 = P(paramObject, M(i3));
          paramn0.x(i4, f1);
        }
        break;
      case 51: 
        if (!B(paramObject, i4, i2)) {
          break;
        }
      case 50: 
      case 49: 
      case 48: 
      case 47: 
      case 46: 
      case 45: 
      case 44: 
      case 43: 
      case 42: 
      case 41: 
      case 40: 
      case 39: 
      case 38: 
      case 37: 
      case 36: 
      case 35: 
      case 34: 
      case 33: 
      case 32: 
      case 31: 
      case 30: 
      case 29: 
      case 28: 
      case 27: 
      case 26: 
      case 25: 
      case 24: 
      case 23: 
      case 22: 
      case 21: 
      case 20: 
      case 19: 
      case 18: 
      case 17: 
      case 16: 
      case 15: 
      case 14: 
      case 13: 
      case 12: 
      case 11: 
      case 10: 
      case 9: 
      case 8: 
      case 7: 
      case 6: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
      case 1: 
      case 0: 
        label1044:
        for (double d1 = O(paramObject, M(i3));; d1 = l(paramObject, M(i3)))
        {
          paramn0.m(i4, d1);
          break label2342;
          b0(paramn0, i4, k0.C(paramObject, M(i3)), i2);
          break label2342;
          b0.R(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, p(i2));
          break label2342;
          b0.Y(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.X(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.W(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.V(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.N(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.a0(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.K(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.O(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.P(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.S(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.b0(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.T(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.Q(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.M(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, true);
          break label2342;
          b0.Y(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.X(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.W(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.V(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.N(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.a0(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.L(L(i2), (List)k0.C(paramObject, M(i3)), paramn0);
          break label2342;
          b0.U(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, p(i2));
          break label2342;
          b0.Z(L(i2), (List)k0.C(paramObject, M(i3)), paramn0);
          break label2342;
          b0.K(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.O(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.P(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.S(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.b0(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.T(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.Q(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          b0.M(L(i2), (List)k0.C(paramObject, M(i3)), paramn0, false);
          break label2342;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          break;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          l1 = E(paramObject, M(i3));
          break label508;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          i3 = t(paramObject, M(i3));
          break label544;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          l1 = E(paramObject, M(i3));
          break label580;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          i3 = t(paramObject, M(i3));
          break label616;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          i3 = t(paramObject, M(i3));
          break label652;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          i3 = t(paramObject, M(i3));
          break label688;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          break label713;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          break label748;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          break label786;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          bool = j(paramObject, M(i3));
          break label828;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          i3 = t(paramObject, M(i3));
          break label864;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          l1 = E(paramObject, M(i3));
          break label900;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          i3 = t(paramObject, M(i3));
          break label936;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          l1 = E(paramObject, M(i3));
          break label972;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          l1 = E(paramObject, M(i3));
          break label1008;
          if (!u(paramObject, i2)) {
            break label2342;
          }
          f1 = n(paramObject, M(i3));
          break label1044;
          if (!u(paramObject, i2)) {
            break label2342;
          }
        }
      }
      label2342:
      i2 += 3;
    }
    while (localObject1 != null)
    {
      p.f(paramn0, (Map.Entry)localObject1);
      if (localIterator.hasNext()) {
        localObject1 = (Map.Entry)localIterator.next();
      } else {
        localObject1 = null;
      }
    }
    d0(o, paramObject, paramn0);
  }
  
  public void a(Object paramObject1, Object paramObject2)
  {
    k(paramObject1);
    paramObject2.getClass();
    for (int i1 = 0; i1 < a.length; i1 += 3) {
      H(paramObject1, paramObject2, i1);
    }
    b0.E(o, paramObject1, paramObject2);
    if (f) {
      b0.C(p, paramObject1, paramObject2);
    }
  }
  
  public final void a0(Object paramObject, n0 paramn0)
  {
    d0(o, paramObject, paramn0);
    if (f)
    {
      localObject1 = p.b(paramObject);
      if (!((o)localObject1).j())
      {
        localIterator = ((o)localObject1).e();
        localObject1 = (Map.Entry)localIterator.next();
        break label59;
      }
    }
    Iterator localIterator = null;
    Object localObject1 = localIterator;
    label59:
    int i1 = a.length - 3;
    Object localObject2 = localObject1;
    for (;;)
    {
      localObject1 = localObject2;
      if (i1 < 0) {
        break;
      }
      int i2 = X(i1);
      int i3 = L(i1);
      while ((localObject2 != null) && (p.a((Map.Entry)localObject2) > i3))
      {
        p.f(paramn0, (Map.Entry)localObject2);
        if (localIterator.hasNext()) {
          localObject2 = (Map.Entry)localIterator.next();
        } else {
          localObject2 = null;
        }
      }
      long l1;
      label516:
      label552:
      label588:
      label624:
      label660:
      label696:
      label721:
      label756:
      label794:
      boolean bool;
      label836:
      label872:
      label908:
      label944:
      label980:
      label1016:
      float f1;
      switch (W(i2))
      {
      default: 
        break;
      case 68: 
        if (B(paramObject, i3, i1)) {
          paramn0.L(i3, k0.C(paramObject, M(i2)), p(i1));
        }
        break;
      case 67: 
        if (B(paramObject, i3, i1))
        {
          l1 = R(paramObject, M(i2));
          paramn0.w(i3, l1);
        }
        break;
      case 66: 
        if (B(paramObject, i3, i1))
        {
          i2 = Q(paramObject, M(i2));
          paramn0.H(i3, i2);
        }
        break;
      case 65: 
        if (B(paramObject, i3, i1))
        {
          l1 = R(paramObject, M(i2));
          paramn0.n(i3, l1);
        }
        break;
      case 64: 
        if (B(paramObject, i3, i1))
        {
          i2 = Q(paramObject, M(i2));
          paramn0.g(i3, i2);
        }
        break;
      case 63: 
        if (B(paramObject, i3, i1))
        {
          i2 = Q(paramObject, M(i2));
          paramn0.D(i3, i2);
        }
        break;
      case 62: 
        if (B(paramObject, i3, i1))
        {
          i2 = Q(paramObject, M(i2));
          paramn0.e(i3, i2);
        }
        break;
      case 61: 
        if (B(paramObject, i3, i1)) {
          paramn0.M(i3, (f)k0.C(paramObject, M(i2)));
        }
        break;
      case 60: 
        if (B(paramObject, i3, i1)) {
          paramn0.N(i3, k0.C(paramObject, M(i2)), p(i1));
        }
        break;
      case 59: 
        if (B(paramObject, i3, i1)) {
          c0(i3, k0.C(paramObject, M(i2)), paramn0);
        }
        break;
      case 58: 
        if (B(paramObject, i3, i1))
        {
          bool = N(paramObject, M(i2));
          paramn0.d(i3, bool);
        }
        break;
      case 57: 
        if (B(paramObject, i3, i1))
        {
          i2 = Q(paramObject, M(i2));
          paramn0.l(i3, i2);
        }
        break;
      case 56: 
        if (B(paramObject, i3, i1))
        {
          l1 = R(paramObject, M(i2));
          paramn0.u(i3, l1);
        }
        break;
      case 55: 
        if (B(paramObject, i3, i1))
        {
          i2 = Q(paramObject, M(i2));
          paramn0.i(i3, i2);
        }
        break;
      case 54: 
        if (B(paramObject, i3, i1))
        {
          l1 = R(paramObject, M(i2));
          paramn0.C(i3, l1);
        }
        break;
      case 53: 
        if (B(paramObject, i3, i1))
        {
          l1 = R(paramObject, M(i2));
          paramn0.c(i3, l1);
        }
        break;
      case 52: 
        if (B(paramObject, i3, i1))
        {
          f1 = P(paramObject, M(i2));
          paramn0.x(i3, f1);
        }
        break;
      case 51: 
        if (!B(paramObject, i3, i1)) {
          break;
        }
      case 50: 
      case 49: 
      case 48: 
      case 47: 
      case 46: 
      case 45: 
      case 44: 
      case 43: 
      case 42: 
      case 41: 
      case 40: 
      case 39: 
      case 38: 
      case 37: 
      case 36: 
      case 35: 
      case 34: 
      case 33: 
      case 32: 
      case 31: 
      case 30: 
      case 29: 
      case 28: 
      case 27: 
      case 26: 
      case 25: 
      case 24: 
      case 23: 
      case 22: 
      case 21: 
      case 20: 
      case 19: 
      case 18: 
      case 17: 
      case 16: 
      case 15: 
      case 14: 
      case 13: 
      case 12: 
      case 11: 
      case 10: 
      case 9: 
      case 8: 
      case 7: 
      case 6: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
      case 1: 
      case 0: 
        label1052:
        for (double d1 = O(paramObject, M(i2));; d1 = l(paramObject, M(i2)))
        {
          paramn0.m(i3, d1);
          break label2350;
          b0(paramn0, i3, k0.C(paramObject, M(i2)), i1);
          break label2350;
          b0.R(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, p(i1));
          break label2350;
          b0.Y(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.X(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.W(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.V(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.N(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.a0(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.K(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.O(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.P(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.S(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.b0(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.T(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.Q(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.M(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, true);
          break label2350;
          b0.Y(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.X(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.W(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.V(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.N(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.a0(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.L(L(i1), (List)k0.C(paramObject, M(i2)), paramn0);
          break label2350;
          b0.U(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, p(i1));
          break label2350;
          b0.Z(L(i1), (List)k0.C(paramObject, M(i2)), paramn0);
          break label2350;
          b0.K(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.O(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.P(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.S(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.b0(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.T(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.Q(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          b0.M(L(i1), (List)k0.C(paramObject, M(i2)), paramn0, false);
          break label2350;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          break;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          l1 = E(paramObject, M(i2));
          break label516;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          i2 = t(paramObject, M(i2));
          break label552;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          l1 = E(paramObject, M(i2));
          break label588;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          i2 = t(paramObject, M(i2));
          break label624;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          i2 = t(paramObject, M(i2));
          break label660;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          i2 = t(paramObject, M(i2));
          break label696;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          break label721;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          break label756;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          break label794;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          bool = j(paramObject, M(i2));
          break label836;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          i2 = t(paramObject, M(i2));
          break label872;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          l1 = E(paramObject, M(i2));
          break label908;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          i2 = t(paramObject, M(i2));
          break label944;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          l1 = E(paramObject, M(i2));
          break label980;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          l1 = E(paramObject, M(i2));
          break label1016;
          if (!u(paramObject, i1)) {
            break label2350;
          }
          f1 = n(paramObject, M(i2));
          break label1052;
          if (!u(paramObject, i1)) {
            break label2350;
          }
        }
      }
      label2350:
      i1 -= 3;
    }
    while (localObject1 != null)
    {
      p.f(paramn0, (Map.Entry)localObject1);
      if (localIterator.hasNext()) {
        localObject1 = (Map.Entry)localIterator.next();
      } else {
        localObject1 = null;
      }
    }
  }
  
  public void b(Object paramObject)
  {
    if (!z(paramObject)) {
      return;
    }
    Object localObject;
    if ((paramObject instanceof r))
    {
      localObject = (r)paramObject;
      ((r)localObject).r();
      ((r)localObject).q();
      ((r)localObject).K();
    }
    int i1 = a.length;
    for (int i2 = 0; i2 < i1; i2 += 3)
    {
      int i3 = X(i2);
      long l1 = M(i3);
      i3 = W(i3);
      if (i3 != 9) {
        switch (i3)
        {
        default: 
          break;
        case 50: 
          Unsafe localUnsafe = s;
          localObject = localUnsafe.getObject(paramObject, l1);
          if (localObject == null) {
            continue;
          }
          localUnsafe.putObject(paramObject, l1, q.c(localObject));
          break;
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
        case 30: 
        case 31: 
        case 32: 
        case 33: 
        case 34: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 39: 
        case 40: 
        case 41: 
        case 42: 
        case 43: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 48: 
        case 49: 
          n.c(paramObject, l1);
          break;
        }
      } else if (u(paramObject, i2)) {
        p(i2).b(s.getObject(paramObject, l1));
      }
    }
    o.d(paramObject);
    if (f) {
      p.e(paramObject);
    }
  }
  
  public final void b0(n0 paramn0, int paramInt1, Object paramObject, int paramInt2)
  {
    if (paramObject != null) {
      paramn0.O(paramInt1, q.d(o(paramInt2)), q.e(paramObject));
    }
  }
  
  public final boolean c(Object paramObject)
  {
    int i1 = 1048575;
    int i2 = 0;
    for (int i3 = i2; i3 < k; i3++)
    {
      int i4 = j[i3];
      int i5 = L(i4);
      int i6 = X(i4);
      int i7 = a[(i4 + 2)];
      int i8 = i7 & 0xFFFFF;
      i7 = 1 << (i7 >>> 20);
      if (i8 != i1)
      {
        if (i8 != 1048575) {
          i2 = s.getInt(paramObject, i8);
        }
        i1 = i8;
      }
      if ((C(i6)) && (!v(paramObject, i4, i1, i2, i7))) {
        return false;
      }
      i8 = W(i6);
      if ((i8 != 9) && (i8 != 17))
      {
        if (i8 != 27) {
          if ((i8 != 60) && (i8 != 68))
          {
            if (i8 != 49)
            {
              if ((i8 != 50) || (y(paramObject, i6, i4))) {
                continue;
              }
              return false;
            }
          }
          else
          {
            if ((!B(paramObject, i5, i4)) || (w(paramObject, i6, p(i4)))) {
              continue;
            }
            return false;
          }
        }
        if (!x(paramObject, i6, i4)) {
          return false;
        }
      }
      else if ((v(paramObject, i4, i1, i2, i7)) && (!w(paramObject, i6, p(i4))))
      {
        return false;
      }
    }
    return (!f) || (p.b(paramObject).k());
  }
  
  public final void c0(int paramInt, Object paramObject, n0 paramn0)
  {
    if ((paramObject instanceof String)) {
      paramn0.A(paramInt, (String)paramObject);
    } else {
      paramn0.M(paramInt, (f)paramObject);
    }
  }
  
  public boolean d(Object paramObject1, Object paramObject2)
  {
    int i1 = a.length;
    for (int i2 = 0; i2 < i1; i2 += 3) {
      if (!m(paramObject1, paramObject2, i2)) {
        return false;
      }
    }
    if (!o.a(paramObject1).equals(o.a(paramObject2))) {
      return false;
    }
    if (f) {
      return p.b(paramObject1).equals(p.b(paramObject2));
    }
    return true;
  }
  
  public final void d0(g0 paramg0, Object paramObject, n0 paramn0)
  {
    paramg0.h(paramg0.a(paramObject), paramn0);
  }
  
  public int e(Object paramObject)
  {
    int i1;
    if (h) {
      i1 = r(paramObject);
    } else {
      i1 = q(paramObject);
    }
    return i1;
  }
  
  public Object f()
  {
    return m.a(e);
  }
  
  public int g(Object paramObject)
  {
    int i1 = a.length;
    int i2 = 0;
    for (int i3 = 0; i2 < i1; i3 = i4)
    {
      i4 = X(i2);
      int i5 = L(i2);
      long l1 = M(i4);
      int i6 = W(i4);
      i4 = 37;
      Object localObject;
      label377:
      label384:
      label409:
      label424:
      boolean bool;
      label659:
      float f1;
      switch (i6)
      {
      default: 
        i4 = i3;
        break;
      case 68: 
        i4 = i3;
        if (B(paramObject, i5, i2))
        {
          localObject = k0.C(paramObject, l1);
          i4 = i3 * 53;
          i3 = localObject.hashCode();
        }
        break;
      case 67: 
      case 66: 
      case 65: 
      case 64: 
      case 63: 
      case 62: 
      case 61: 
      case 10: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
      case 50: 
      case 60: 
      case 59: 
      case 8: 
      case 58: 
      case 57: 
      case 56: 
      case 55: 
      case 54: 
      case 53: 
      case 52: 
        for (;;)
        {
          i4 += i3;
          break label978;
          i4 = i3;
          if (!B(paramObject, i5, i2)) {
            break label978;
          }
          for (;;)
          {
            i4 = i3 * 53;
            l1 = R(paramObject, l1);
            i3 = t.f(l1);
            break label384;
            i4 = i3;
            if (!B(paramObject, i5, i2)) {
              break label978;
            }
            for (;;)
            {
              i4 = i3 * 53;
              i3 = Q(paramObject, l1);
              break label384;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              break label409;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              i4 = i3 * 53;
              localObject = k0.C(paramObject, l1);
              break label377;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              break;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              i4 = i3 * 53;
              i3 = ((String)k0.C(paramObject, l1)).hashCode();
              break label384;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              i4 = i3 * 53;
              bool = N(paramObject, l1);
              i3 = t.c(bool);
              break label384;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
              break label409;
              i4 = i3;
              if (!B(paramObject, i5, i2)) {
                break label978;
              }
            }
            i4 = i3;
            if (!B(paramObject, i5, i2)) {
              break label978;
            }
            continue;
            i4 = i3;
            if (!B(paramObject, i5, i2)) {
              break label978;
            }
          }
          i4 = i3;
          if (!B(paramObject, i5, i2)) {
            break label978;
          }
          i4 = i3 * 53;
          f1 = P(paramObject, l1);
          i3 = Float.floatToIntBits(f1);
        }
      case 51: 
        i4 = i3;
        if (B(paramObject, i5, i2)) {
          i4 = i3 * 53;
        }
        break;
      case 17: 
      case 2: 
      case 3: 
      case 5: 
      case 14: 
      case 16: 
      case 4: 
      case 6: 
      case 11: 
      case 12: 
      case 13: 
      case 15: 
      case 9: 
      case 7: 
      case 1: 
      case 0: 
        label789:
        for (double d1 = O(paramObject, l1);; d1 = k0.x(paramObject, l1))
        {
          l1 = Double.doubleToLongBits(d1);
          break label424;
          localObject = k0.C(paramObject, l1);
          if (localObject != null) {}
          for (;;)
          {
            i4 = localObject.hashCode();
            do
            {
              i4 = i3 * 53 + i4;
              break label978;
              i4 = i3 * 53;
              l1 = k0.A(paramObject, l1);
              break label424;
              i4 = i3 * 53;
              i3 = k0.z(paramObject, l1);
              break;
              localObject = k0.C(paramObject, l1);
            } while (localObject == null);
          }
          i4 = i3 * 53;
          bool = k0.r(paramObject, l1);
          break label659;
          i4 = i3 * 53;
          f1 = k0.y(paramObject, l1);
          break label789;
          i4 = i3 * 53;
        }
      }
      label978:
      i2 += 3;
    }
    i3 = i3 * 53 + o.a(paramObject).hashCode();
    int i4 = i3;
    if (f) {
      i4 = i3 * 53 + p.b(paramObject).hashCode();
    }
    return i4;
  }
  
  public void h(Object paramObject, n0 paramn0)
  {
    if (paramn0.v() == n0.a.p) {
      a0(paramObject, paramn0);
    } else if (h) {
      Z(paramObject, paramn0);
    } else {
      Y(paramObject, paramn0);
    }
  }
  
  public final boolean i(Object paramObject1, Object paramObject2, int paramInt)
  {
    boolean bool;
    if (u(paramObject1, paramInt) == u(paramObject2, paramInt)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean m(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = X(paramInt);
    long l1 = M(i1);
    i1 = W(i1);
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool8 = false;
    boolean bool9 = false;
    boolean bool10 = false;
    boolean bool11 = false;
    boolean bool12 = false;
    boolean bool13 = false;
    boolean bool14 = false;
    boolean bool15 = false;
    boolean bool16 = false;
    boolean bool17 = false;
    boolean bool18 = false;
    boolean bool19 = false;
    switch (i1)
    {
    default: 
      return true;
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
    case 58: 
    case 59: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
    case 65: 
    case 66: 
    case 67: 
    case 68: 
      bool20 = bool19;
      if (A(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool19;
        if (b0.I(k0.C(paramObject1, l1), k0.C(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
    case 50: 
      return b0.I(k0.C(paramObject1, l1), k0.C(paramObject2, l1));
    case 17: 
      bool20 = bool1;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool1;
        if (b0.I(k0.C(paramObject1, l1), k0.C(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 16: 
      bool20 = bool2;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool2;
        if (k0.A(paramObject1, l1) == k0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 15: 
      bool20 = bool3;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool3;
        if (k0.z(paramObject1, l1) == k0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 14: 
      bool20 = bool4;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool4;
        if (k0.A(paramObject1, l1) == k0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 13: 
      bool20 = bool5;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool5;
        if (k0.z(paramObject1, l1) == k0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 12: 
      bool20 = bool6;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool6;
        if (k0.z(paramObject1, l1) == k0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 11: 
      bool20 = bool7;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool7;
        if (k0.z(paramObject1, l1) == k0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 10: 
      bool20 = bool8;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool8;
        if (b0.I(k0.C(paramObject1, l1), k0.C(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 9: 
      bool20 = bool9;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool9;
        if (b0.I(k0.C(paramObject1, l1), k0.C(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 8: 
      bool20 = bool10;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool10;
        if (b0.I(k0.C(paramObject1, l1), k0.C(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 7: 
      bool20 = bool11;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool11;
        if (k0.r(paramObject1, l1) == k0.r(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 6: 
      bool20 = bool12;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool12;
        if (k0.z(paramObject1, l1) == k0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 5: 
      bool20 = bool13;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool13;
        if (k0.A(paramObject1, l1) == k0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 4: 
      bool20 = bool14;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool14;
        if (k0.z(paramObject1, l1) == k0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 3: 
      bool20 = bool15;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool15;
        if (k0.A(paramObject1, l1) == k0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 2: 
      bool20 = bool16;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool16;
        if (k0.A(paramObject1, l1) == k0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 1: 
      bool20 = bool17;
      if (i(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool17;
        if (Float.floatToIntBits(k0.y(paramObject1, l1)) == Float.floatToIntBits(k0.y(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    }
    boolean bool20 = bool18;
    if (i(paramObject1, paramObject2, paramInt))
    {
      bool20 = bool18;
      if (Double.doubleToLongBits(k0.x(paramObject1, l1)) == Double.doubleToLongBits(k0.x(paramObject2, l1))) {
        bool20 = true;
      }
    }
    return bool20;
  }
  
  public final Object o(int paramInt)
  {
    return b[(paramInt / 3 * 2)];
  }
  
  public final Z p(int paramInt)
  {
    paramInt = paramInt / 3 * 2;
    Z localZ = (Z)b[paramInt];
    if (localZ != null) {
      return localZ;
    }
    localZ = W.a().c((Class)b[(paramInt + 1)]);
    b[paramInt] = localZ;
    return localZ;
  }
  
  public final int q(Object paramObject)
  {
    Unsafe localUnsafe = s;
    int i1 = 1048575;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    while (i2 < a.length)
    {
      int i5 = X(i2);
      int i6 = L(i2);
      int i7 = W(i5);
      int i11;
      int i12;
      int i13;
      if (i7 <= 17)
      {
        int i8 = a[(i2 + 2)];
        int i9 = i8 & 0xFFFFF;
        i10 = 1 << (i8 >>> 20);
        i11 = i1;
        i12 = i8;
        i13 = i10;
        if (i9 != i1)
        {
          i4 = localUnsafe.getInt(paramObject, i9);
          i11 = i9;
          i12 = i8;
          i13 = i10;
        }
      }
      else
      {
        if ((i) && (i7 >= p.c0.e()) && (i7 <= p.p0.e())) {}
        for (i10 = a[(i2 + 2)] & 0xFFFFF;; i10 = 0)
        {
          i13 = 0;
          i11 = i1;
          i12 = i10;
          break;
        }
      }
      long l1 = M(i5);
      switch (i7)
      {
      default: 
        i10 = i3;
        break;
      case 68: 
        i10 = i3;
        if (B(paramObject, i6, i2))
        {
          i10 = h.s(i6, (K)localUnsafe.getObject(paramObject, l1), p(i2));
          label534:
          i10 = i3 + i10;
        }
        break;
      }
      for (;;)
      {
        label541:
        break label2466;
        i10 = i3;
        if (B(paramObject, i6, i2))
        {
          l1 = R(paramObject, l1);
          label568:
          i10 = h.K(i6, l1);
          break label534;
          i10 = i3;
          if (B(paramObject, i6, i2))
          {
            i10 = Q(paramObject, l1);
            label604:
            i10 = h.I(i6, i10);
            break label534;
            i10 = i3;
            if (B(paramObject, i6, i2))
            {
              label632:
              i10 = h.G(i6, 0L);
              break label534;
              i10 = i3;
              if (B(paramObject, i6, i2))
              {
                label659:
                i10 = h.E(i6, 0);
                label667:
                i10 = i3 + i10;
                continue;
                i10 = i3;
                if (B(paramObject, i6, i2))
                {
                  i10 = Q(paramObject, l1);
                  label701:
                  i10 = h.k(i6, i10);
                  break label534;
                  i10 = i3;
                  if (B(paramObject, i6, i2))
                  {
                    i10 = Q(paramObject, l1);
                    label737:
                    i10 = h.P(i6, i10);
                    break label534;
                    i10 = i3;
                    if (B(paramObject, i6, i2))
                    {
                      label765:
                      i10 = h.g(i6, (f)localUnsafe.getObject(paramObject, l1));
                      break label534;
                      i10 = i3;
                      if (B(paramObject, i6, i2))
                      {
                        label801:
                        i10 = b0.o(i6, localUnsafe.getObject(paramObject, l1), p(i2));
                        break label534;
                        i10 = i3;
                        if (B(paramObject, i6, i2))
                        {
                          Object localObject = localUnsafe.getObject(paramObject, l1);
                          if ((localObject instanceof f))
                          {
                            i10 = h.g(i6, (f)localObject);
                            break label534;
                          }
                          i10 = h.M(i6, (String)localObject);
                          break label534;
                          i10 = i3;
                          if (B(paramObject, i6, i2))
                          {
                            for (;;)
                            {
                              i10 = h.d(i6, true);
                              break label534;
                              i10 = i3;
                              if (!B(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = h.m(i6, 0);
                              break label667;
                              i10 = i3;
                              if (!B(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = h.o(i6, 0L);
                              break label534;
                              i10 = i3;
                              if (!B(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = h.v(i6, Q(paramObject, l1));
                              break label534;
                              i10 = i3;
                              if (!B(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = h.R(i6, R(paramObject, l1));
                              break label534;
                              i10 = i3;
                              if (!B(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = h.x(i6, R(paramObject, l1));
                              break label534;
                              i10 = i3;
                              if (!B(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = h.q(i6, 0.0F);
                              break label534;
                              i10 = i3;
                              if (!B(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = h.i(i6, 0.0D);
                              break label534;
                              i10 = q.b(i6, localUnsafe.getObject(paramObject, l1), o(i2));
                              break label534;
                              i10 = b0.j(i6, (List)localUnsafe.getObject(paramObject, l1), p(i2));
                              break label534;
                              i1 = b0.t((List)localUnsafe.getObject(paramObject, l1));
                              i10 = i3;
                              if (i1 <= 0) {
                                break label541;
                              }
                              i10 = i1;
                              if (i) {
                                i10 = i1;
                              }
                              for (;;)
                              {
                                label1208:
                                localUnsafe.putInt(paramObject, i12, i10);
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          do
                                          {
                                            do
                                            {
                                              do
                                              {
                                                do
                                                {
                                                  do
                                                  {
                                                    do
                                                    {
                                                      do
                                                      {
                                                        do
                                                        {
                                                          i10 = h.O(i6) + h.Q(i10) + i10;
                                                          break label667;
                                                          i1 = b0.r((List)localUnsafe.getObject(paramObject, l1));
                                                          i10 = i3;
                                                          if (i1 <= 0) {
                                                            break;
                                                          }
                                                          i10 = i1;
                                                        } while (!i);
                                                        i10 = i1;
                                                        break label1208;
                                                        i1 = b0.i((List)localUnsafe.getObject(paramObject, l1));
                                                        i10 = i3;
                                                        if (i1 <= 0) {
                                                          break;
                                                        }
                                                        i10 = i1;
                                                      } while (!i);
                                                      i10 = i1;
                                                      break label1208;
                                                      i1 = b0.g((List)localUnsafe.getObject(paramObject, l1));
                                                      i10 = i3;
                                                      if (i1 <= 0) {
                                                        break;
                                                      }
                                                      i10 = i1;
                                                    } while (!i);
                                                    i10 = i1;
                                                    break label1208;
                                                    i1 = b0.e((List)localUnsafe.getObject(paramObject, l1));
                                                    i10 = i3;
                                                    if (i1 <= 0) {
                                                      break;
                                                    }
                                                    i10 = i1;
                                                  } while (!i);
                                                  i10 = i1;
                                                  break label1208;
                                                  i1 = b0.w((List)localUnsafe.getObject(paramObject, l1));
                                                  i10 = i3;
                                                  if (i1 <= 0) {
                                                    break;
                                                  }
                                                  i10 = i1;
                                                } while (!i);
                                                i10 = i1;
                                                break label1208;
                                                i1 = b0.b((List)localUnsafe.getObject(paramObject, l1));
                                                i10 = i3;
                                                if (i1 <= 0) {
                                                  break;
                                                }
                                                i10 = i1;
                                              } while (!i);
                                              i10 = i1;
                                              break label1208;
                                              i1 = b0.g((List)localUnsafe.getObject(paramObject, l1));
                                              i10 = i3;
                                              if (i1 <= 0) {
                                                break;
                                              }
                                              i10 = i1;
                                            } while (!i);
                                            i10 = i1;
                                            break label1208;
                                            i1 = b0.i((List)localUnsafe.getObject(paramObject, l1));
                                            i10 = i3;
                                            if (i1 <= 0) {
                                              break;
                                            }
                                            i10 = i1;
                                          } while (!i);
                                          i10 = i1;
                                          break label1208;
                                          i1 = b0.l((List)localUnsafe.getObject(paramObject, l1));
                                          i10 = i3;
                                          if (i1 <= 0) {
                                            break;
                                          }
                                          i10 = i1;
                                        } while (!i);
                                        i10 = i1;
                                        break label1208;
                                        i1 = b0.y((List)localUnsafe.getObject(paramObject, l1));
                                        i10 = i3;
                                        if (i1 <= 0) {
                                          break;
                                        }
                                        i10 = i1;
                                      } while (!i);
                                      i10 = i1;
                                      break label1208;
                                      i1 = b0.n((List)localUnsafe.getObject(paramObject, l1));
                                      i10 = i3;
                                      if (i1 <= 0) {
                                        break;
                                      }
                                      i10 = i1;
                                    } while (!i);
                                    i10 = i1;
                                    break label1208;
                                    i1 = b0.g((List)localUnsafe.getObject(paramObject, l1));
                                    i10 = i3;
                                    if (i1 <= 0) {
                                      break;
                                    }
                                    i10 = i1;
                                  } while (!i);
                                  i10 = i1;
                                  break label1208;
                                  i1 = b0.i((List)localUnsafe.getObject(paramObject, l1));
                                  i10 = i3;
                                  if (i1 <= 0) {
                                    break;
                                  }
                                  i10 = i1;
                                } while (!i);
                                i10 = i1;
                              }
                              i10 = b0.s(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                              for (;;)
                              {
                                i10 = i3 + i10;
                                break label2466;
                                i10 = b0.q(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = b0.h(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = b0.f(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = b0.d(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = b0.v(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                break;
                                i10 = b0.c(i6, (List)localUnsafe.getObject(paramObject, l1));
                                break;
                                i10 = b0.p(i6, (List)localUnsafe.getObject(paramObject, l1), p(i2));
                                break;
                                i10 = b0.u(i6, (List)localUnsafe.getObject(paramObject, l1));
                                break;
                                i10 = b0.a(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = b0.k(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = b0.x(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = b0.m(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                              }
                              i10 = b0.h(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                              break label534;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              break;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              l1 = localUnsafe.getLong(paramObject, l1);
                              break label568;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              i10 = localUnsafe.getInt(paramObject, l1);
                              break label604;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              break label632;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              break label659;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              i10 = localUnsafe.getInt(paramObject, l1);
                              break label701;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              i10 = localUnsafe.getInt(paramObject, l1);
                              break label737;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              break label765;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              break label801;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                              localObject = localUnsafe.getObject(paramObject, l1);
                              if ((localObject instanceof f))
                              {
                                i10 = h.g(i6, (f)localObject);
                                break label534;
                              }
                              i10 = h.M(i6, (String)localObject);
                              break label534;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                            }
                            i10 = i3;
                            if ((i4 & i13) != 0)
                            {
                              i10 = h.m(i6, 0);
                              for (;;)
                              {
                                i10 = i3 + i10;
                                break;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = h.o(i6, 0L);
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = h.v(i6, localUnsafe.getInt(paramObject, l1));
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = h.R(i6, localUnsafe.getLong(paramObject, l1));
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = h.x(i6, localUnsafe.getLong(paramObject, l1));
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = h.q(i6, 0.0F);
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = h.i(i6, 0.0D);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      label2466:
      i2 += 3;
      i3 = i10;
      i1 = i11;
    }
    i3 += s(o, paramObject);
    int i10 = i3;
    if (f) {
      i10 = i3 + p.b(paramObject).h();
    }
    return i10;
  }
  
  public final int r(Object paramObject)
  {
    Unsafe localUnsafe = s;
    int i1 = 0;
    int i4;
    for (int i2 = i1; i1 < a.length; i2 = i4)
    {
      int i3 = X(i1);
      i4 = W(i3);
      int i5 = L(i1);
      long l1 = M(i3);
      if ((i4 >= p.c0.e()) && (i4 <= p.p0.e())) {
        i3 = a[(i1 + 2)] & 0xFFFFF;
      } else {
        i3 = 0;
      }
      label423:
      label456:
      label491:
      label518:
      label544:
      label578:
      label613:
      label640:
      Object localObject1;
      label678:
      Object localObject2;
      switch (i4)
      {
      default: 
        i4 = i2;
        break;
      case 68: 
        i4 = i2;
        if (B(paramObject, i5, i1)) {
          i4 = h.s(i5, (K)k0.C(paramObject, l1), p(i1));
        }
        break;
      case 67: 
      case 66: 
      case 65: 
      case 64: 
      case 63: 
      case 62: 
      case 61: 
      case 60: 
      case 59: 
      case 58: 
      case 57: 
      case 56: 
      case 55: 
      case 54: 
      case 53: 
      case 52: 
        for (;;)
        {
          i4 = i2 + i4;
          break;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          l1 = R(paramObject, l1);
          i4 = h.K(i5, l1);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = Q(paramObject, l1);
          i4 = h.I(i5, i4);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = h.G(i5, 0L);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = h.E(i5, 0);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = Q(paramObject, l1);
          i4 = h.k(i5, i4);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = Q(paramObject, l1);
          i4 = h.P(i5, i4);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          for (localObject1 = k0.C(paramObject, l1);; localObject1 = localObject2)
          {
            i4 = h.g(i5, (f)localObject1);
            break;
            i4 = i2;
            if (!B(paramObject, i5, i1)) {
              break label2244;
            }
            i4 = b0.o(i5, k0.C(paramObject, l1), p(i1));
            break;
            i4 = i2;
            if (!B(paramObject, i5, i1)) {
              break label2244;
            }
            localObject2 = k0.C(paramObject, l1);
            localObject1 = localObject2;
            if (!(localObject2 instanceof f)) {
              break label741;
            }
          }
          i4 = h.M(i5, (String)localObject1);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = h.d(i5, true);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = h.m(i5, 0);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = h.o(i5, 0L);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = Q(paramObject, l1);
          i4 = h.v(i5, i4);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          l1 = R(paramObject, l1);
          i4 = h.R(i5, l1);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          l1 = R(paramObject, l1);
          i4 = h.x(i5, l1);
          continue;
          i4 = i2;
          if (!B(paramObject, i5, i1)) {
            break;
          }
          i4 = h.q(i5, 0.0F);
        }
      case 51: 
        i4 = i2;
        if (!B(paramObject, i5, i1)) {
          break;
        }
      case 50: 
      case 49: 
      case 48: 
      case 47: 
      case 46: 
      case 45: 
      case 44: 
      case 43: 
      case 42: 
      case 41: 
      case 40: 
      case 39: 
      case 38: 
      case 37: 
      case 36: 
      case 35: 
      case 34: 
      case 33: 
      case 18: 
      case 23: 
      case 32: 
      case 19: 
      case 24: 
      case 31: 
      case 30: 
      case 29: 
      case 28: 
      case 27: 
      case 26: 
      case 25: 
      case 22: 
      case 21: 
      case 20: 
      case 17: 
      case 16: 
      case 15: 
      case 14: 
      case 13: 
      case 12: 
      case 11: 
      case 10: 
      case 9: 
      case 8: 
      case 7: 
      case 6: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
      case 1: 
      case 0: 
        label738:
        label741:
        label771:
        label797:
        label823:
        label857:
        label892:
        label927:
        label954:
        label1078:
        do
        {
          i4 = h.i(i5, 0.0D);
          break label423;
          i4 = q.b(i5, k0.C(paramObject, l1), o(i1));
          break label423;
          i4 = b0.j(i5, D(paramObject, l1), p(i1));
          break label423;
          int i6 = b0.t((List)localUnsafe.getObject(paramObject, l1));
          i4 = i2;
          if (i6 <= 0) {
            break label2244;
          }
          i4 = i6;
          if (i) {
            i4 = i6;
          }
          for (;;)
          {
            localUnsafe.putInt(paramObject, i3, i4);
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      i4 = h.O(i5) + h.Q(i4) + i4;
                                      break;
                                      i6 = b0.r((List)localUnsafe.getObject(paramObject, l1));
                                      i4 = i2;
                                      if (i6 <= 0) {
                                        break label2244;
                                      }
                                      i4 = i6;
                                    } while (!i);
                                    i4 = i6;
                                    break label1078;
                                    i6 = b0.i((List)localUnsafe.getObject(paramObject, l1));
                                    i4 = i2;
                                    if (i6 <= 0) {
                                      break label2244;
                                    }
                                    i4 = i6;
                                  } while (!i);
                                  i4 = i6;
                                  break label1078;
                                  i6 = b0.g((List)localUnsafe.getObject(paramObject, l1));
                                  i4 = i2;
                                  if (i6 <= 0) {
                                    break label2244;
                                  }
                                  i4 = i6;
                                } while (!i);
                                i4 = i6;
                                break label1078;
                                i6 = b0.e((List)localUnsafe.getObject(paramObject, l1));
                                i4 = i2;
                                if (i6 <= 0) {
                                  break label2244;
                                }
                                i4 = i6;
                              } while (!i);
                              i4 = i6;
                              break label1078;
                              i6 = b0.w((List)localUnsafe.getObject(paramObject, l1));
                              i4 = i2;
                              if (i6 <= 0) {
                                break label2244;
                              }
                              i4 = i6;
                            } while (!i);
                            i4 = i6;
                            break label1078;
                            i6 = b0.b((List)localUnsafe.getObject(paramObject, l1));
                            i4 = i2;
                            if (i6 <= 0) {
                              break label2244;
                            }
                            i4 = i6;
                          } while (!i);
                          i4 = i6;
                          break label1078;
                          i6 = b0.g((List)localUnsafe.getObject(paramObject, l1));
                          i4 = i2;
                          if (i6 <= 0) {
                            break label2244;
                          }
                          i4 = i6;
                        } while (!i);
                        i4 = i6;
                        break label1078;
                        i6 = b0.i((List)localUnsafe.getObject(paramObject, l1));
                        i4 = i2;
                        if (i6 <= 0) {
                          break label2244;
                        }
                        i4 = i6;
                      } while (!i);
                      i4 = i6;
                      break label1078;
                      i6 = b0.l((List)localUnsafe.getObject(paramObject, l1));
                      i4 = i2;
                      if (i6 <= 0) {
                        break label2244;
                      }
                      i4 = i6;
                    } while (!i);
                    i4 = i6;
                    break label1078;
                    i6 = b0.y((List)localUnsafe.getObject(paramObject, l1));
                    i4 = i2;
                    if (i6 <= 0) {
                      break label2244;
                    }
                    i4 = i6;
                  } while (!i);
                  i4 = i6;
                  break label1078;
                  i6 = b0.n((List)localUnsafe.getObject(paramObject, l1));
                  i4 = i2;
                  if (i6 <= 0) {
                    break label2244;
                  }
                  i4 = i6;
                } while (!i);
                i4 = i6;
                break label1078;
                i6 = b0.g((List)localUnsafe.getObject(paramObject, l1));
                i4 = i2;
                if (i6 <= 0) {
                  break label2244;
                }
                i4 = i6;
              } while (!i);
              i4 = i6;
              break label1078;
              i6 = b0.i((List)localUnsafe.getObject(paramObject, l1));
              i4 = i2;
              if (i6 <= 0) {
                break label2244;
              }
              i4 = i6;
            } while (!i);
            i4 = i6;
          }
          i4 = b0.s(i5, D(paramObject, l1), false);
          break label423;
          i4 = b0.q(i5, D(paramObject, l1), false);
          break label423;
          i4 = b0.h(i5, D(paramObject, l1), false);
          break label423;
          i4 = b0.f(i5, D(paramObject, l1), false);
          break label423;
          i4 = b0.d(i5, D(paramObject, l1), false);
          break label423;
          i4 = b0.v(i5, D(paramObject, l1), false);
          break label423;
          i4 = b0.c(i5, D(paramObject, l1));
          break label423;
          i4 = b0.p(i5, D(paramObject, l1), p(i1));
          break label423;
          i4 = b0.u(i5, D(paramObject, l1));
          break label423;
          i4 = b0.a(i5, D(paramObject, l1), false);
          break label423;
          i4 = b0.k(i5, D(paramObject, l1), false);
          break label423;
          i4 = b0.x(i5, D(paramObject, l1), false);
          break label423;
          i4 = b0.m(i5, D(paramObject, l1), false);
          break label423;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          break;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          l1 = k0.A(paramObject, l1);
          break label456;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          i4 = k0.z(paramObject, l1);
          break label491;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          break label518;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          break label544;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          i4 = k0.z(paramObject, l1);
          break label578;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          i4 = k0.z(paramObject, l1);
          break label613;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          break label640;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          break label678;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          localObject2 = k0.C(paramObject, l1);
          localObject1 = localObject2;
          if (!(localObject2 instanceof f)) {
            break label741;
          }
          localObject1 = localObject2;
          break label738;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          break label771;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          break label797;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          break label823;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          i4 = k0.z(paramObject, l1);
          break label857;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          l1 = k0.A(paramObject, l1);
          break label892;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          l1 = k0.A(paramObject, l1);
          break label927;
          i4 = i2;
          if (!u(paramObject, i1)) {
            break label2244;
          }
          break label954;
          i4 = i2;
        } while (u(paramObject, i1));
      }
      label2244:
      i1 += 3;
    }
    return i2 + s(o, paramObject);
  }
  
  public final int s(g0 paramg0, Object paramObject)
  {
    return paramg0.b(paramg0.a(paramObject));
  }
  
  public final boolean u(Object paramObject, int paramInt)
  {
    int i1 = S(paramInt);
    long l1 = 0xFFFFF & i1;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool8 = false;
    boolean bool9 = false;
    boolean bool10 = false;
    boolean bool11 = false;
    boolean bool12 = false;
    boolean bool13 = false;
    boolean bool14 = false;
    boolean bool15 = false;
    boolean bool16 = false;
    if (l1 == 1048575L)
    {
      paramInt = X(paramInt);
      l1 = M(paramInt);
      switch (W(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        if (k0.C(paramObject, l1) != null) {
          bool16 = true;
        }
        return bool16;
      case 16: 
        bool16 = bool1;
        if (k0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 15: 
        bool16 = bool2;
        if (k0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 14: 
        bool16 = bool3;
        if (k0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 13: 
        bool16 = bool4;
        if (k0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 12: 
        bool16 = bool5;
        if (k0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 11: 
        bool16 = bool6;
        if (k0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 10: 
        return f.p.equals(k0.C(paramObject, l1)) ^ true;
      case 9: 
        bool16 = bool7;
        if (k0.C(paramObject, l1) != null) {
          bool16 = true;
        }
        return bool16;
      case 8: 
        paramObject = k0.C(paramObject, l1);
        if ((paramObject instanceof String)) {
          return ((String)paramObject).isEmpty() ^ true;
        }
        if ((paramObject instanceof f)) {
          return f.p.equals(paramObject) ^ true;
        }
        throw new IllegalArgumentException();
      case 7: 
        return k0.r(paramObject, l1);
      case 6: 
        bool16 = bool8;
        if (k0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 5: 
        bool16 = bool9;
        if (k0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 4: 
        bool16 = bool10;
        if (k0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 3: 
        bool16 = bool11;
        if (k0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 2: 
        bool16 = bool12;
        if (k0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 1: 
        bool16 = bool13;
        if (Float.floatToRawIntBits(k0.y(paramObject, l1)) != 0) {
          bool16 = true;
        }
        return bool16;
      }
      bool16 = bool14;
      if (Double.doubleToRawLongBits(k0.x(paramObject, l1)) != 0L) {
        bool16 = true;
      }
      return bool16;
    }
    bool16 = bool15;
    if ((k0.z(paramObject, l1) & 1 << (i1 >>> 20)) != 0) {
      bool16 = true;
    }
    return bool16;
  }
  
  public final boolean v(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 == 1048575) {
      return u(paramObject, paramInt1);
    }
    boolean bool;
    if ((paramInt3 & paramInt4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean x(Object paramObject, int paramInt1, int paramInt2)
  {
    List localList = (List)k0.C(paramObject, M(paramInt1));
    if (localList.isEmpty()) {
      return true;
    }
    paramObject = p(paramInt2);
    for (paramInt1 = 0; paramInt1 < localList.size(); paramInt1++) {
      if (!((Z)paramObject).c(localList.get(paramInt1))) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean y(Object paramObject, int paramInt1, int paramInt2)
  {
    paramObject = q.e(k0.C(paramObject, M(paramInt1)));
    if (((Map)paramObject).isEmpty()) {
      return true;
    }
    Object localObject1 = o(paramInt2);
    if (q.d(localObject1).c.e() != m0.c.x) {
      return true;
    }
    Iterator localIterator = ((Map)paramObject).values().iterator();
    localObject1 = null;
    while (localIterator.hasNext())
    {
      Object localObject2 = localIterator.next();
      paramObject = localObject1;
      if (localObject1 == null) {
        paramObject = W.a().c(localObject2.getClass());
      }
      localObject1 = paramObject;
      if (!((Z)paramObject).c(localObject2)) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
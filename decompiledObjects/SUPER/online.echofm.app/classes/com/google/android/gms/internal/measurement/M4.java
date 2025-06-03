package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import sun.misc.Unsafe;

public final class M4
  implements Z4
{
  public static final int[] r = new int[0];
  public static final Unsafe s = D5.p();
  public final int[] a;
  public final Object[] b;
  public final int c;
  public final int d;
  public final I4 e;
  public final boolean f;
  public final boolean g;
  public final V4 h;
  public final boolean i;
  public final int[] j;
  public final int k;
  public final int l;
  public final P4 m;
  public final q4 n;
  public final x5 o;
  public final O3 p;
  public final F4 q;
  
  public M4(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, I4 paramI4, V4 paramV4, boolean paramBoolean, int[] paramArrayOfInt2, int paramInt3, int paramInt4, P4 paramP4, q4 paramq4, x5 paramx5, O3 paramO3, F4 paramF4)
  {
    a = paramArrayOfInt1;
    b = paramArrayOfObject;
    c = paramInt1;
    d = paramInt2;
    g = (paramI4 instanceof Y3);
    h = paramV4;
    if ((paramO3 != null) && (paramO3.d(paramI4))) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    f = paramBoolean;
    i = false;
    j = paramArrayOfInt2;
    k = paramInt3;
    l = paramInt4;
    m = paramP4;
    n = paramq4;
    o = paramx5;
    p = paramO3;
    e = paramI4;
    q = paramF4;
  }
  
  public static boolean A(Object paramObject, int paramInt, Z4 paramZ4)
  {
    return paramZ4.c(D5.B(paramObject, paramInt & 0xFFFFF));
  }
  
  public static float B(Object paramObject, long paramLong)
  {
    return ((Float)D5.B(paramObject, paramLong)).floatValue();
  }
  
  public static int H(Object paramObject, long paramLong)
  {
    return ((Integer)D5.B(paramObject, paramLong)).intValue();
  }
  
  public static long L(Object paramObject, long paramLong)
  {
    return ((Long)D5.B(paramObject, paramLong)).longValue();
  }
  
  public static v5 O(Object paramObject)
  {
    Y3 localY3 = (Y3)paramObject;
    v5 localv5 = zzb;
    paramObject = localv5;
    if (localv5 == v5.k())
    {
      paramObject = v5.l();
      zzb = ((v5)paramObject);
    }
    return (v5)paramObject;
  }
  
  public static boolean P(Object paramObject, long paramLong)
  {
    return ((Boolean)D5.B(paramObject, paramLong)).booleanValue();
  }
  
  public static void R(Object paramObject)
  {
    if (T(paramObject)) {
      return;
    }
    String str = String.valueOf(paramObject);
    paramObject = new StringBuilder("Mutating immutable message: ");
    ((StringBuilder)paramObject).append(str);
    throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
  }
  
  public static boolean S(int paramInt)
  {
    return (paramInt & 0x20000000) != 0;
  }
  
  public static boolean T(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramObject instanceof Y3)) {
      return ((Y3)paramObject).F();
    }
    return true;
  }
  
  public static double j(Object paramObject, long paramLong)
  {
    return ((Double)D5.B(paramObject, paramLong)).doubleValue();
  }
  
  public static M4 n(Class paramClass, G4 paramG4, P4 paramP4, q4 paramq4, x5 paramx5, O3 paramO3, F4 paramF4)
  {
    if ((paramG4 instanceof W4))
    {
      W4 localW4 = (W4)paramG4;
      paramG4 = localW4.d();
      int i1 = paramG4.length();
      if (paramG4.charAt(0) >= 55296) {
        for (i2 = 1;; i2 = i3)
        {
          i3 = i2 + 1;
          i4 = i3;
          if (paramG4.charAt(i2) < 55296) {
            break;
          }
        }
      }
      int i4 = 1;
      int i3 = i4 + 1;
      int i5 = paramG4.charAt(i4);
      i4 = i3;
      int i2 = i5;
      if (i5 >= 55296)
      {
        i5 &= 0x1FFF;
        i2 = 13;
        for (;;)
        {
          i4 = i3 + 1;
          i3 = paramG4.charAt(i3);
          if (i3 < 55296) {
            break;
          }
          i5 |= (i3 & 0x1FFF) << i2;
          i2 += 13;
          i3 = i4;
        }
        i2 = i5 | i3 << i2;
      }
      int i8;
      if (i2 == 0)
      {
        paramClass = r;
        i6 = 0;
        i3 = i6;
        i7 = i3;
        i8 = i7;
        i9 = i8;
        i5 = i9;
        i2 = i5;
      }
      else
      {
        i3 = i4 + 1;
        i2 = paramG4.charAt(i4);
        i4 = i2;
        i5 = i3;
        if (i2 >= 55296)
        {
          i4 = i2 & 0x1FFF;
          i2 = 13;
          i5 = i3;
          i3 = i4;
          for (;;)
          {
            i4 = i5 + 1;
            i5 = paramG4.charAt(i5);
            if (i5 < 55296) {
              break;
            }
            i3 |= (i5 & 0x1FFF) << i2;
            i2 += 13;
            i5 = i4;
          }
          i3 |= i5 << i2;
          i5 = i4;
          i4 = i3;
        }
        i2 = i5 + 1;
        i5 = paramG4.charAt(i5);
        i8 = i5;
        i3 = i2;
        if (i5 >= 55296)
        {
          i5 &= 0x1FFF;
          i3 = 13;
          for (i6 = i2;; i6 = i2)
          {
            i2 = i6 + 1;
            i6 = paramG4.charAt(i6);
            if (i6 < 55296) {
              break;
            }
            i5 |= (i6 & 0x1FFF) << i3;
            i3 += 13;
          }
          i8 = i5 | i6 << i3;
          i3 = i2;
        }
        i2 = i3 + 1;
        i6 = paramG4.charAt(i3);
        i3 = i6;
        i5 = i2;
        if (i6 >= 55296)
        {
          i5 = i6 & 0x1FFF;
          i3 = 13;
          for (i6 = i2;; i6 = i2)
          {
            i2 = i6 + 1;
            i6 = paramG4.charAt(i6);
            if (i6 < 55296) {
              break;
            }
            i5 |= (i6 & 0x1FFF) << i3;
            i3 += 13;
          }
          i3 = i5 | i6 << i3;
          i5 = i2;
        }
        i6 = i5 + 1;
        i10 = paramG4.charAt(i5);
        i2 = i10;
        i5 = i6;
        if (i10 >= 55296)
        {
          i2 = i10 & 0x1FFF;
          i5 = 13;
          i10 = i6;
          i6 = i2;
          for (;;)
          {
            i2 = i10 + 1;
            i10 = paramG4.charAt(i10);
            if (i10 < 55296) {
              break;
            }
            i6 |= (i10 & 0x1FFF) << i5;
            i5 += 13;
            i10 = i2;
          }
          i6 |= i10 << i5;
          i5 = i2;
          i2 = i6;
        }
        i10 = i5 + 1;
        i7 = paramG4.charAt(i5);
        i6 = i7;
        i5 = i10;
        if (i7 >= 55296)
        {
          i6 = i7 & 0x1FFF;
          i5 = 13;
          i7 = i10;
          i10 = i6;
          for (;;)
          {
            i6 = i7 + 1;
            i7 = paramG4.charAt(i7);
            if (i7 < 55296) {
              break;
            }
            i10 |= (i7 & 0x1FFF) << i5;
            i5 += 13;
            i7 = i6;
          }
          i10 |= i7 << i5;
          i5 = i6;
          i6 = i10;
        }
        i7 = i5 + 1;
        i9 = paramG4.charAt(i5);
        i10 = i9;
        i5 = i7;
        if (i9 >= 55296)
        {
          i10 = i9 & 0x1FFF;
          i5 = 13;
          i9 = i7;
          i7 = i10;
          for (;;)
          {
            i10 = i9 + 1;
            i9 = paramG4.charAt(i9);
            if (i9 < 55296) {
              break;
            }
            i7 |= (i9 & 0x1FFF) << i5;
            i5 += 13;
            i9 = i10;
          }
          i7 |= i9 << i5;
          i5 = i10;
          i10 = i7;
        }
        i7 = i5 + 1;
        i11 = paramG4.charAt(i5);
        i9 = i11;
        i5 = i7;
        if (i11 >= 55296)
        {
          i9 = i11 & 0x1FFF;
          i5 = 13;
          for (i11 = i7;; i11 = i7)
          {
            i7 = i11 + 1;
            i11 = paramG4.charAt(i11);
            if (i11 < 55296) {
              break;
            }
            i9 |= (i11 & 0x1FFF) << i5;
            i5 += 13;
          }
          i9 |= i11 << i5;
          i5 = i7;
        }
        i11 = i5 + 1;
        i12 = paramG4.charAt(i5);
        i7 = i12;
        i5 = i11;
        if (i12 >= 55296)
        {
          i7 = i12 & 0x1FFF;
          i5 = 13;
          i12 = i11;
          i11 = i7;
          for (;;)
          {
            i7 = i12 + 1;
            i12 = paramG4.charAt(i12);
            if (i12 < 55296) {
              break;
            }
            i11 |= (i12 & 0x1FFF) << i5;
            i5 += 13;
            i12 = i7;
          }
          i11 |= i12 << i5;
          i5 = i7;
          i7 = i11;
        }
        paramClass = new int[i7 + i10 + i9];
        i9 = (i4 << 1) + i8;
        i11 = i5;
        i5 = i7;
        i8 = i2;
        i7 = i3;
        i3 = i10;
        i2 = i4;
        i4 = i11;
      }
      Unsafe localUnsafe = s;
      Object[] arrayOfObject1 = localW4.e();
      Class localClass = localW4.a().getClass();
      int[] arrayOfInt = new int[i6 * 3];
      Object[] arrayOfObject2 = new Object[i6 << 1];
      int i13 = i5 + i3;
      i3 = i5;
      int i6 = i13;
      int i12 = 0;
      int i14 = 0;
      int i10 = i9;
      int i11 = i8;
      int i9 = i7;
      int i7 = i12;
      i12 = i2;
      for (;;)
      {
        int i15 = i7;
        if (i4 >= i1) {
          break;
        }
        i2 = i4 + 1;
        int i16 = paramG4.charAt(i4);
        if (i16 >= 55296)
        {
          i7 = i16 & 0x1FFF;
          i8 = i2;
          i2 = 13;
          for (;;)
          {
            i4 = i8 + 1;
            i8 = paramG4.charAt(i8);
            if (i8 < 55296) {
              break;
            }
            i7 |= (i8 & 0x1FFF) << i2;
            i2 += 13;
            i8 = i4;
          }
          i16 = i7 | i8 << i2;
        }
        else
        {
          i4 = i2;
        }
        i8 = i4 + 1;
        int i17 = paramG4.charAt(i4);
        if (i17 >= 55296)
        {
          i7 = i17 & 0x1FFF;
          i2 = 13;
          for (;;)
          {
            i4 = i8 + 1;
            i8 = paramG4.charAt(i8);
            if (i8 < 55296) {
              break;
            }
            i7 |= (i8 & 0x1FFF) << i2;
            i2 += 13;
            i8 = i4;
          }
          i17 = i7 | i8 << i2;
          i7 = i4;
        }
        else
        {
          i7 = i8;
        }
        int i18 = i17 & 0xFF;
        int i19 = i14;
        if ((i17 & 0x400) != 0)
        {
          paramClass[i14] = i15;
          i19 = i14 + 1;
        }
        label1671:
        Object localObject;
        if (i18 >= 51)
        {
          i2 = i7 + 1;
          i8 = paramG4.charAt(i7);
          i4 = i2;
          i7 = i8;
          if (i8 >= 55296)
          {
            i8 &= 0x1FFF;
            i7 = 13;
            for (;;)
            {
              i4 = i2 + 1;
              i2 = paramG4.charAt(i2);
              if (i2 < 55296) {
                break;
              }
              i8 |= (i2 & 0x1FFF) << i7;
              i7 += 13;
              i2 = i4;
            }
            i7 = i8 | i2 << i7;
          }
          i2 = i18 - 51;
          if ((i2 == 9) || (i2 != 17))
          {
            if ((i2 != 12) || ((!localW4.b().equals(V4.o)) && ((i17 & 0x800) == 0))) {
              break label1671;
            }
            i8 = i15 / 3;
            i2 = i10 + 1;
            arrayOfObject2[((i8 << 1) + 1)] = arrayOfObject1[i10];
          }
          else
          {
            for (;;)
            {
              i10 = i2;
              break;
              i8 = i15 / 3;
              i2 = i10 + 1;
              arrayOfObject2[((i8 << 1) + 1)] = arrayOfObject1[i10];
            }
          }
          i2 = i7 << 1;
          localObject = arrayOfObject1[i2];
          if ((localObject instanceof Field)) {
            localObject = (Field)localObject;
          }
          for (;;)
          {
            break;
            localObject = s(localClass, (String)localObject);
            arrayOfObject1[i2] = localObject;
          }
          i14 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i2++;
          localObject = arrayOfObject1[i2];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = s(localClass, (String)localObject);
            arrayOfObject1[i2] = localObject;
          }
          i2 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          int i20 = i10;
          i7 = 0;
          i10 = i2;
          i2 = i4;
          i8 = i3;
          i4 = i20;
        }
        else
        {
          i8 = i10 + 1;
          localObject = s(localClass, (String)arrayOfObject1[i10]);
          if ((i18 == 9) || (i18 != 17))
          {
            if ((i18 == 27) || (i18 != 49))
            {
              if ((i18 != 12) && (i18 != 30) && (i18 != 44))
              {
                i4 = i8;
                i2 = i3;
                if (i18 == 50)
                {
                  i4 = i3 + 1;
                  paramClass[i3] = i15;
                  i2 = i15 / 3 << 1;
                  i3 = i10 + 2;
                  arrayOfObject2[i2] = arrayOfObject1[i8];
                  if ((i17 & 0x800) != 0)
                  {
                    i10 += 3;
                    arrayOfObject2[(i2 + 1)] = arrayOfObject1[i3];
                    i2 = i4;
                    i4 = i10;
                  }
                  else
                  {
                    i2 = i4;
                    i4 = i3;
                  }
                }
              }
              else if (localW4.b() != V4.o)
              {
                i4 = i8;
                i2 = i3;
                if ((i17 & 0x800) == 0) {}
              }
              else
              {
                i2 = i15 / 3;
                i4 = i10 + 2;
                arrayOfObject2[((i2 << 1) + 1)] = arrayOfObject1[i8];
              }
            }
            else {
              for (;;)
              {
                i2 = i3;
                break;
                i2 = i15 / 3;
                i4 = i10 + 2;
                arrayOfObject2[((i2 << 1) + 1)] = arrayOfObject1[i8];
              }
            }
          }
          else
          {
            arrayOfObject2[((i15 / 3 << 1) + 1)] = ((Field)localObject).getType();
            i2 = i3;
            i4 = i8;
          }
          i14 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          if (((i17 & 0x1000) != 0) && (i18 <= 17))
          {
            i3 = i7 + 1;
            i8 = paramG4.charAt(i7);
            i7 = i8;
            i10 = i3;
            if (i8 >= 55296)
            {
              i7 = i8 & 0x1FFF;
              i10 = 13;
              for (i8 = i3;; i8 = i3)
              {
                i3 = i8 + 1;
                i8 = paramG4.charAt(i8);
                if (i8 < 55296) {
                  break;
                }
                i7 |= (i8 & 0x1FFF) << i10;
                i10 += 13;
              }
              i7 |= i8 << i10;
              i10 = i3;
            }
            i3 = (i12 << 1) + i7 / 32;
            localObject = arrayOfObject1[i3];
            if ((localObject instanceof Field)) {
              localObject = (Field)localObject;
            }
            for (;;)
            {
              break;
              localObject = s(localClass, (String)localObject);
              arrayOfObject1[i3] = localObject;
            }
            i3 = (int)localUnsafe.objectFieldOffset((Field)localObject);
            i7 %= 32;
          }
          else
          {
            i3 = 1048575;
            i10 = i7;
            i7 = 0;
          }
          i8 = i6;
          if (i18 >= 18)
          {
            i8 = i6;
            if (i18 <= 49)
            {
              paramClass[i6] = i14;
              i8 = i6 + 1;
            }
          }
          i6 = i8;
          i8 = i2;
          i2 = i10;
          i10 = i3;
        }
        arrayOfInt[i15] = i16;
        if ((i17 & 0x200) != 0) {
          i3 = 536870912;
        } else {
          i3 = 0;
        }
        if ((i17 & 0x100) != 0) {
          i16 = 268435456;
        } else {
          i16 = 0;
        }
        if ((i17 & 0x800) != 0) {
          i17 = Integer.MIN_VALUE;
        } else {
          i17 = 0;
        }
        arrayOfInt[(i15 + 1)] = (i18 << 20 | i16 | i3 | i17 | i14);
        i3 = i15 + 3;
        arrayOfInt[(i15 + 2)] = (i7 << 20 | i10);
        i10 = i4;
        i4 = i2;
        i7 = i3;
        i14 = i19;
        i3 = i8;
      }
      return new M4(arrayOfInt, arrayOfObject2, i9, i11, localW4.a(), localW4.b(), false, paramClass, i5, i13, paramP4, paramq4, paramx5, paramO3, paramF4);
    }
    a.a(paramG4);
    throw new NoSuchMethodError();
  }
  
  public static Field s(Class paramClass, String paramString)
  {
    try
    {
      Field localField = paramClass.getDeclaredField(paramString);
      return localField;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (localObject2 : paramClass.getDeclaredFields()) {
        if (paramString.equals(((Field)localObject2).getName())) {
          return (Field)localObject2;
        }
      }
      paramClass = paramClass.getName();
      ??? = Arrays.toString((Object[])???);
      Object localObject2 = new StringBuilder("Field ");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" for ");
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append(" not found. Known fields are ");
      ((StringBuilder)localObject2).append((String)???);
      throw new RuntimeException(((StringBuilder)localObject2).toString());
    }
  }
  
  public static void t(int paramInt, Object paramObject, T5 paramT5)
  {
    if ((paramObject instanceof String))
    {
      paramT5.E(paramInt, (String)paramObject);
      return;
    }
    paramT5.f(paramInt, (q3)paramObject);
  }
  
  public static void u(x5 paramx5, Object paramObject, T5 paramT5)
  {
    paramx5.g(paramx5.k(paramObject), paramT5);
  }
  
  public final int C(int paramInt)
  {
    return a[(paramInt + 2)];
  }
  
  public final void D(Object paramObject, int paramInt)
  {
    paramInt = C(paramInt);
    long l1 = 0xFFFFF & paramInt;
    if (l1 == 1048575L) {
      return;
    }
    D5.h(paramObject, l1, 1 << (paramInt >>> 20) | D5.t(paramObject, l1));
  }
  
  public final void E(Object paramObject, int paramInt1, int paramInt2)
  {
    D5.h(paramObject, C(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  public final void F(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = a[paramInt];
    if (!J(paramObject2, i1, paramInt)) {
      return;
    }
    long l1 = G(paramInt) & 0xFFFFF;
    Unsafe localUnsafe = s;
    Object localObject1 = localUnsafe.getObject(paramObject2, l1);
    if (localObject1 != null)
    {
      Z4 localZ4 = N(paramInt);
      if (!J(paramObject1, i1, paramInt))
      {
        if (!T(localObject1))
        {
          localUnsafe.putObject(paramObject1, l1, localObject1);
        }
        else
        {
          paramObject2 = localZ4.a();
          localZ4.d(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l1, paramObject2);
        }
        E(paramObject1, i1, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l1);
      paramObject2 = localObject2;
      if (!T(localObject2))
      {
        paramObject2 = localZ4.a();
        localZ4.d(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l1, paramObject2);
      }
      localZ4.d(paramObject2, localObject1);
      return;
    }
    paramInt = a[paramInt];
    paramObject1 = String.valueOf(paramObject2);
    paramObject2 = new StringBuilder("Source subfield ");
    ((StringBuilder)paramObject2).append(paramInt);
    ((StringBuilder)paramObject2).append(" is present but null: ");
    ((StringBuilder)paramObject2).append((String)paramObject1);
    throw new IllegalStateException(((StringBuilder)paramObject2).toString());
  }
  
  public final int G(int paramInt)
  {
    return a[(paramInt + 1)];
  }
  
  public final boolean I(Object paramObject, int paramInt)
  {
    int i1 = C(paramInt);
    long l1 = i1 & 0xFFFFF;
    if (l1 == 1048575L)
    {
      paramInt = G(paramInt);
      l1 = paramInt & 0xFFFFF;
      switch ((paramInt & 0xFF00000) >>> 20)
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        return D5.B(paramObject, l1) != null;
      case 16: 
        return D5.x(paramObject, l1) != 0L;
      case 15: 
        return D5.t(paramObject, l1) != 0;
      case 14: 
        return D5.x(paramObject, l1) != 0L;
      case 13: 
        return D5.t(paramObject, l1) != 0;
      case 12: 
        return D5.t(paramObject, l1) != 0;
      case 11: 
        return D5.t(paramObject, l1) != 0;
      case 10: 
        return !q3.p.equals(D5.B(paramObject, l1));
      case 9: 
        return D5.B(paramObject, l1) != null;
      case 8: 
        paramObject = D5.B(paramObject, l1);
        if ((paramObject instanceof String)) {
          return !((String)paramObject).isEmpty();
        }
        if ((paramObject instanceof q3)) {
          return !q3.p.equals(paramObject);
        }
        throw new IllegalArgumentException();
      case 7: 
        return D5.F(paramObject, l1);
      case 6: 
        return D5.t(paramObject, l1) != 0;
      case 5: 
        return D5.x(paramObject, l1) != 0L;
      case 4: 
        return D5.t(paramObject, l1) != 0;
      case 3: 
        return D5.x(paramObject, l1) != 0L;
      case 2: 
        return D5.x(paramObject, l1) != 0L;
      case 1: 
        return Float.floatToRawIntBits(D5.n(paramObject, l1)) != 0;
      }
      return Double.doubleToRawLongBits(D5.a(paramObject, l1)) != 0L;
    }
    return (D5.t(paramObject, l1) & 1 << (i1 >>> 20)) != 0;
  }
  
  public final boolean J(Object paramObject, int paramInt1, int paramInt2)
  {
    return D5.t(paramObject, C(paramInt2) & 0xFFFFF) == paramInt1;
  }
  
  public final boolean K(Object paramObject1, Object paramObject2, int paramInt)
  {
    return I(paramObject1, paramInt) == I(paramObject2, paramInt);
  }
  
  public final g4 M(int paramInt)
  {
    return (g4)b[((paramInt / 3 << 1) + 1)];
  }
  
  public final Z4 N(int paramInt)
  {
    paramInt = paramInt / 3 << 1;
    Z4 localZ4 = (Z4)b[paramInt];
    if (localZ4 != null) {
      return localZ4;
    }
    localZ4 = U4.a().b((Class)b[(paramInt + 1)]);
    b[paramInt] = localZ4;
    return localZ4;
  }
  
  public final Object Q(int paramInt)
  {
    return b[(paramInt / 3 << 1)];
  }
  
  public final Object a()
  {
    return m.b(e);
  }
  
  public final int b(Object paramObject)
  {
    Unsafe localUnsafe = s;
    int i1 = 1048575;
    int i2 = 0;
    int i3 = 0;
    for (int i4 = 0; i3 < a.length; i4 = i10)
    {
      int i5 = G(i3);
      int i6 = (0xFF00000 & i5) >>> 20;
      localObject1 = a;
      int i7 = localObject1[i3];
      int i8 = localObject1[(i3 + 2)];
      int i9 = i8 & 0xFFFFF;
      if (i6 <= 17)
      {
        i10 = i1;
        if (i9 != i1)
        {
          if (i9 == 1048575) {
            i2 = 0;
          } else {
            i2 = localUnsafe.getInt(paramObject, i9);
          }
          i10 = i9;
        }
        i8 = 1 << (i8 >>> 20);
        i9 = i10;
      }
      else
      {
        i8 = 0;
        i9 = i1;
      }
      long l1 = i5 & 0xFFFFF;
      if (i6 >= T3.c0.a()) {
        T3.p0.a();
      }
      switch (i6)
      {
      default: 
        i1 = i4;
        break;
      case 68: 
        i1 = i4;
        if (J(paramObject, i7, i3))
        {
          localObject1 = localUnsafe.getObject(paramObject, l1);
          i1 = J3.x(i7, (I4)localObject1, N(i3));
          i1 = i4 + i1;
        }
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
      case 51: 
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
        label503:
        label508:
        label537:
        label570:
        label595:
        label620:
        label627:
        label657:
        label689:
        label723:
        label761:
        label818:
        label821:
        do
        {
          Object localObject2;
          do
          {
            do
            {
              do
              {
                do
                {
                  for (;;)
                  {
                    i10 = i1;
                    break label2371;
                    i1 = i4;
                    if (J(paramObject, i7, i3))
                    {
                      l1 = L(paramObject, l1);
                      i1 = J3.i0(i7, l1);
                      break;
                      i1 = i4;
                      if (J(paramObject, i7, i3))
                      {
                        i1 = H(paramObject, l1);
                        i1 = J3.t0(i7, i1);
                        break;
                        i1 = i4;
                        if (J(paramObject, i7, i3))
                        {
                          i1 = J3.e0(i7, 0L);
                          break;
                          i1 = i4;
                          if (J(paramObject, i7, i3))
                          {
                            i1 = J3.p0(i7, 0);
                            i1 = i4 + i1;
                          }
                        }
                      }
                    }
                  }
                  i1 = i4;
                } while (!J(paramObject, i7, i3));
                i1 = H(paramObject, l1);
                i1 = J3.d0(i7, i1);
                break;
                i1 = i4;
              } while (!J(paramObject, i7, i3));
              i1 = H(paramObject, l1);
              i1 = J3.w0(i7, i1);
              break;
              i1 = i4;
            } while (!J(paramObject, i7, i3));
            for (localObject1 = localUnsafe.getObject(paramObject, l1);; localObject1 = localObject2)
            {
              i1 = J3.Q(i7, (q3)localObject1);
              break;
              i1 = i4;
              if (!J(paramObject, i7, i3)) {
                break label508;
              }
              localObject1 = localUnsafe.getObject(paramObject, l1);
              i1 = a5.a(i7, localObject1, N(i3));
              break;
              i1 = i4;
              if (!J(paramObject, i7, i3)) {
                break label508;
              }
              localObject2 = localUnsafe.getObject(paramObject, l1);
              localObject1 = localObject2;
              if (!(localObject2 instanceof q3)) {
                break label821;
              }
            }
            i1 = J3.y(i7, (String)localObject1);
            break;
            i1 = i4;
          } while (!J(paramObject, i7, i3));
          for (;;)
          {
            i1 = J3.z(i7, true);
            break label503;
            i1 = i4;
            if (!J(paramObject, i7, i3)) {
              break label508;
            }
            i1 = J3.h0(i7, 0);
            break label627;
            i1 = i4;
            if (!J(paramObject, i7, i3)) {
              break label508;
            }
            i1 = J3.P(i7, 0L);
            break label503;
            i1 = i4;
            if (!J(paramObject, i7, i3)) {
              break label508;
            }
            i1 = J3.l0(i7, H(paramObject, l1));
            break label503;
            i1 = i4;
            if (!J(paramObject, i7, i3)) {
              break label508;
            }
            i1 = J3.m0(i7, L(paramObject, l1));
            break label503;
            i1 = i4;
            if (!J(paramObject, i7, i3)) {
              break label508;
            }
            i1 = J3.Y(i7, L(paramObject, l1));
            break label503;
            i1 = i4;
            if (!J(paramObject, i7, i3)) {
              break label508;
            }
            i1 = J3.f(i7, 0.0F);
            break label503;
            i1 = i4;
            if (!J(paramObject, i7, i3)) {
              break label508;
            }
            i1 = J3.e(i7, 0.0D);
            break label503;
            i1 = q.i(i7, localUnsafe.getObject(paramObject, l1), Q(i3));
            break label503;
            i1 = a5.c(i7, (List)localUnsafe.getObject(paramObject, l1), N(i3));
            break label503;
            i10 = a5.R((List)localUnsafe.getObject(paramObject, l1));
            i1 = i4;
            if (i10 <= 0) {
              break label508;
            }
            i1 = i10;
            for (;;)
            {
              i1 = J3.s0(i7) + J3.v0(i1) + i1;
              break label627;
              i10 = a5.O((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.D((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.z((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.t((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.U((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.e((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.z((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.D((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.H((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.X((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.L((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.z((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
              continue;
              i10 = a5.D((List)localUnsafe.getObject(paramObject, l1));
              i1 = i4;
              if (i10 <= 0) {
                break;
              }
              i1 = i10;
            }
            i1 = a5.Q(i7, (List)localUnsafe.getObject(paramObject, l1), false);
            for (;;)
            {
              i10 = i4 + i1;
              break label2371;
              i1 = a5.N(i7, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = a5.C(i7, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = a5.y(i7, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = a5.s(i7, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = a5.T(i7, (List)localUnsafe.getObject(paramObject, l1), false);
              break;
              i1 = a5.b(i7, (List)localUnsafe.getObject(paramObject, l1));
              break;
              i1 = a5.r(i7, (List)localUnsafe.getObject(paramObject, l1), N(i3));
              break;
              i1 = a5.q(i7, (List)localUnsafe.getObject(paramObject, l1));
              break;
              i1 = a5.d(i7, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = a5.G(i7, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = a5.W(i7, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = a5.K(i7, (List)localUnsafe.getObject(paramObject, l1), false);
            }
            i1 = a5.C(i7, (List)localUnsafe.getObject(paramObject, l1), false);
            break label503;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            localObject1 = localUnsafe.getObject(paramObject, l1);
            break;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            l1 = localUnsafe.getLong(paramObject, l1);
            break label537;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            i1 = localUnsafe.getInt(paramObject, l1);
            break label570;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            break label595;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            break label620;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            i1 = localUnsafe.getInt(paramObject, l1);
            break label657;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            i1 = localUnsafe.getInt(paramObject, l1);
            break label689;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            localObject1 = localUnsafe.getObject(paramObject, l1);
            break label723;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            localObject1 = localUnsafe.getObject(paramObject, l1);
            break label761;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
            localObject2 = localUnsafe.getObject(paramObject, l1);
            localObject1 = localObject2;
            if (!(localObject2 instanceof q3)) {
              break label821;
            }
            localObject1 = localObject2;
            break label818;
            i1 = i4;
            if (!z(paramObject, i3, i9, i2, i8)) {
              break label508;
            }
          }
          i1 = i4;
        } while (!z(paramObject, i3, i9, i2, i8));
        i1 = J3.h0(i7, 0);
      }
      for (;;)
      {
        i10 = i4 + i1;
        break;
        i10 = i4;
        if (!z(paramObject, i3, i9, i2, i8)) {
          break;
        }
        i1 = J3.P(i7, 0L);
        continue;
        i10 = i4;
        if (!z(paramObject, i3, i9, i2, i8)) {
          break;
        }
        i1 = J3.l0(i7, localUnsafe.getInt(paramObject, l1));
        continue;
        i10 = i4;
        if (!z(paramObject, i3, i9, i2, i8)) {
          break;
        }
        i1 = J3.m0(i7, localUnsafe.getLong(paramObject, l1));
        continue;
        i10 = i4;
        if (!z(paramObject, i3, i9, i2, i8)) {
          break;
        }
        i1 = J3.Y(i7, localUnsafe.getLong(paramObject, l1));
        continue;
        i10 = i4;
        if (!z(paramObject, i3, i9, i2, i8)) {
          break;
        }
        i1 = J3.f(i7, 0.0F);
        continue;
        i10 = i4;
        if (!z(paramObject, i3, i9, i2, i8)) {
          break;
        }
        i1 = J3.e(i7, 0.0D);
      }
      label2371:
      i3 += 3;
      i1 = i9;
    }
    i2 = 0;
    Object localObject1 = o;
    int i10 = i4 + ((x5)localObject1).a(((x5)localObject1).k(paramObject));
    i1 = i10;
    if (f)
    {
      paramObject = p.b(paramObject);
      i4 = 0;
      i1 = i2;
      for (i2 = i4; i2 < a.g(); i2++)
      {
        localObject1 = a.h(i2);
        a.a(((Map.Entry)localObject1).getKey());
        i1 += S3.b(null, ((Map.Entry)localObject1).getValue());
      }
      paramObject = a.j().iterator();
      while (((Iterator)paramObject).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)paramObject).next();
        a.a(((Map.Entry)localObject1).getKey());
        i1 += S3.b(null, ((Map.Entry)localObject1).getValue());
      }
      i1 = i10 + i1;
    }
    return i1;
  }
  
  public final boolean c(Object paramObject)
  {
    int i1 = 1048575;
    int i2 = 0;
    for (int i3 = i2; i3 < k; i3++)
    {
      int i4 = j[i3];
      int i5 = a[i4];
      int i6 = G(i4);
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
      if (((0x10000000 & i6) != 0) && (!z(paramObject, i4, i1, i2, i7))) {
        return false;
      }
      i8 = (0xFF00000 & i6) >>> 20;
      List localList;
      Z4 localZ4;
      if ((i8 != 9) && (i8 != 17))
      {
        if (i8 != 27) {
          if ((i8 != 60) && (i8 != 68))
          {
            if (i8 != 49)
            {
              if ((i8 != 50) || (q.c(D5.B(paramObject, i6 & 0xFFFFF)).isEmpty())) {
                continue;
              }
              paramObject = Q(i4);
              q.b(paramObject);
              throw null;
            }
          }
          else
          {
            if ((!J(paramObject, i5, i4)) || (A(paramObject, i6, N(i4)))) {
              continue;
            }
            return false;
          }
        }
        localList = (List)D5.B(paramObject, i6 & 0xFFFFF);
        if (!localList.isEmpty())
        {
          localZ4 = N(i4);
          i8 = 0;
        }
      }
      else
      {
        while (i8 < localList.size())
        {
          if (!localZ4.c(localList.get(i8))) {
            return false;
          }
          i8++;
          continue;
          if ((z(paramObject, i4, i1, i2, i7)) && (!A(paramObject, i6, N(i4)))) {
            return false;
          }
        }
      }
    }
    return (!f) || (p.b(paramObject).n());
  }
  
  public final void d(Object paramObject1, Object paramObject2)
  {
    R(paramObject1);
    paramObject2.getClass();
    label464:
    label713:
    for (int i1 = 0; i1 < a.length; i1 += 3)
    {
      int i2 = G(i1);
      long l1 = 0xFFFFF & i2;
      int i3 = a[i1];
      switch ((i2 & 0xFF00000) >>> 20)
      {
      default: 
        break;
      case 60: 
      case 68: 
        F(paramObject1, paramObject2, i1);
        break;
      case 61: 
      case 62: 
      case 63: 
      case 64: 
      case 65: 
      case 66: 
      case 67: 
        if (!J(paramObject2, i3, i1)) {
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
          D5.j(paramObject1, l1, D5.B(paramObject2, l1));
          E(paramObject1, i3, i1);
          break;
          if (!J(paramObject2, i3, i1)) {
            break;
          }
        }
      case 50: 
        a5.m(q, paramObject1, paramObject2, l1);
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
        n.b(paramObject1, paramObject2, l1);
        break;
      case 9: 
      case 17: 
        y(paramObject1, paramObject2, i1);
        break;
      case 16: 
        if (I(paramObject2, i1)) {
          D5.i(paramObject1, l1, D5.x(paramObject2, l1));
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
          D(paramObject1, i1);
          break label713;
          if (!I(paramObject2, i1)) {
            break label713;
          }
          for (;;)
          {
            D5.h(paramObject1, l1, D5.t(paramObject2, l1));
            break label464;
            if (!I(paramObject2, i1)) {
              break label713;
            }
            break;
            if (!I(paramObject2, i1)) {
              break label713;
            }
            continue;
            if (!I(paramObject2, i1)) {
              break label713;
            }
            continue;
            if (!I(paramObject2, i1)) {
              break label713;
            }
            continue;
            if (!I(paramObject2, i1)) {
              break label713;
            }
            for (;;)
            {
              D5.j(paramObject1, l1, D5.B(paramObject2, l1));
              break;
              if (!I(paramObject2, i1)) {
                break label713;
              }
            }
            if (!I(paramObject2, i1)) {
              break label713;
            }
            D5.v(paramObject1, l1, D5.F(paramObject2, l1));
            break label464;
            if (!I(paramObject2, i1)) {
              break label713;
            }
            continue;
            if (!I(paramObject2, i1)) {
              break label713;
            }
            break;
            if (!I(paramObject2, i1)) {
              break label713;
            }
          }
          if (!I(paramObject2, i1)) {
            break label713;
          }
          break;
          if (!I(paramObject2, i1)) {
            break label713;
          }
          break;
          if (!I(paramObject2, i1)) {
            break label713;
          }
          D5.g(paramObject1, l1, D5.n(paramObject2, l1));
          continue;
          if (!I(paramObject2, i1)) {
            break label713;
          }
          D5.f(paramObject1, l1, D5.a(paramObject2, l1));
        }
      }
    }
    a5.n(o, paramObject1, paramObject2);
    if (f) {
      a5.l(p, paramObject1, paramObject2);
    }
  }
  
  public final void e(Object paramObject)
  {
    if (!T(paramObject)) {
      return;
    }
    boolean bool = paramObject instanceof Y3;
    int i1 = 0;
    Object localObject;
    if (bool)
    {
      localObject = (Y3)paramObject;
      ((j3)localObject).j(Integer.MAX_VALUE);
      zza = 0;
      ((Y3)localObject).D();
    }
    int i2 = a.length;
    while (i1 < i2)
    {
      int i3 = G(i1);
      long l1 = 0xFFFFF & i3;
      i3 = (i3 & 0xFF00000) >>> 20;
      if (i3 != 9)
      {
        if ((i3 != 60) && (i3 != 68)) {}
        switch (i3)
        {
        default: 
          break;
        case 50: 
          localUnsafe = s;
          localObject = localUnsafe.getObject(paramObject, l1);
          if (localObject == null) {
            break;
          }
          localUnsafe.putObject(paramObject, l1, q.e(localObject));
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
          n.d(paramObject, l1);
          break;
          if (!J(paramObject, a[i1], i1)) {
            break;
          }
        }
      }
      else
      {
        while (I(paramObject, i1))
        {
          Unsafe localUnsafe;
          N(i1).e(s.getObject(paramObject, l1));
          break;
        }
      }
      i1 += 3;
    }
    o.l(paramObject);
    if (f) {
      p.f(paramObject);
    }
  }
  
  public final int f(Object paramObject)
  {
    int i1 = a.length;
    int i2 = 0;
    for (int i3 = 0; i2 < i1; i3 = i6)
    {
      int i4 = G(i2);
      int i5 = a[i2];
      long l1 = 0xFFFFF & i4;
      i6 = 37;
      Object localObject;
      label381:
      label388:
      label413:
      label428:
      boolean bool;
      label663:
      float f1;
      switch ((i4 & 0xFF00000) >>> 20)
      {
      default: 
        i6 = i3;
        break;
      case 68: 
        i6 = i3;
        if (J(paramObject, i5, i2))
        {
          localObject = D5.B(paramObject, l1);
          i6 = i3 * 53;
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
          i6 += i3;
          break label982;
          i6 = i3;
          if (!J(paramObject, i5, i2)) {
            break label982;
          }
          for (;;)
          {
            i6 = i3 * 53;
            l1 = L(paramObject, l1);
            i3 = a4.b(l1);
            break label388;
            i6 = i3;
            if (!J(paramObject, i5, i2)) {
              break label982;
            }
            for (;;)
            {
              i6 = i3 * 53;
              i3 = H(paramObject, l1);
              break label388;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              break label413;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              continue;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              continue;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              continue;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              i6 = i3 * 53;
              localObject = D5.B(paramObject, l1);
              break label381;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              break;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              i6 = i3 * 53;
              i3 = ((String)D5.B(paramObject, l1)).hashCode();
              break label388;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              i6 = i3 * 53;
              bool = P(paramObject, l1);
              i3 = a4.c(bool);
              break label388;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              continue;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
              break label413;
              i6 = i3;
              if (!J(paramObject, i5, i2)) {
                break label982;
              }
            }
            i6 = i3;
            if (!J(paramObject, i5, i2)) {
              break label982;
            }
            continue;
            i6 = i3;
            if (!J(paramObject, i5, i2)) {
              break label982;
            }
          }
          i6 = i3;
          if (!J(paramObject, i5, i2)) {
            break label982;
          }
          i6 = i3 * 53;
          f1 = B(paramObject, l1);
          i3 = Float.floatToIntBits(f1);
        }
      case 51: 
        i6 = i3;
        if (J(paramObject, i5, i2)) {
          i6 = i3 * 53;
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
        label793:
        for (double d1 = j(paramObject, l1);; d1 = D5.a(paramObject, l1))
        {
          l1 = Double.doubleToLongBits(d1);
          break label428;
          localObject = D5.B(paramObject, l1);
          if (localObject != null) {}
          for (;;)
          {
            i6 = localObject.hashCode();
            do
            {
              i6 = i3 * 53 + i6;
              break label982;
              i6 = i3 * 53;
              l1 = D5.x(paramObject, l1);
              break label428;
              i6 = i3 * 53;
              i3 = D5.t(paramObject, l1);
              break;
              localObject = D5.B(paramObject, l1);
            } while (localObject == null);
          }
          i6 = i3 * 53;
          bool = D5.F(paramObject, l1);
          break label663;
          i6 = i3 * 53;
          f1 = D5.n(paramObject, l1);
          break label793;
          i6 = i3 * 53;
        }
      }
      label982:
      i2 += 3;
    }
    i3 = i3 * 53 + o.k(paramObject).hashCode();
    int i6 = i3;
    if (f) {
      i6 = i3 * 53 + p.b(paramObject).hashCode();
    }
    return i6;
  }
  
  public final void g(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, p3 paramp3)
  {
    m(paramObject, paramArrayOfByte, paramInt1, paramInt2, 0, paramp3);
  }
  
  /* Error */
  public final boolean h(Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 55	com/google/android/gms/internal/measurement/M4:a	[I
    //   4: arraylength
    //   5: istore_3
    //   6: iconst_0
    //   7: istore 4
    //   9: iload 4
    //   11: iload_3
    //   12: if_icmpge +952 -> 964
    //   15: aload_0
    //   16: iload 4
    //   18: invokevirtual 324	com/google/android/gms/internal/measurement/M4:G	(I)I
    //   21: istore 5
    //   23: iload 5
    //   25: ldc 97
    //   27: iand
    //   28: i2l
    //   29: lstore 6
    //   31: iload 5
    //   33: ldc_w 355
    //   36: iand
    //   37: bipush 20
    //   39: iushr
    //   40: tableswitch	default:+292->332, 0:+880->920, 1:+845->885, 2:+815->855, 3:+785->825, 4:+756->796, 5:+726->766, 6:+697->737, 7:+668->708, 8:+636->676, 9:+604->644, 10:+572->612, 11:+543->583, 12:+514->554, 13:+485->525, 14:+455->495, 15:+426->466, 16:+396->436, 17:+364->404, 18:+343->383, 19:+343->383, 20:+343->383, 21:+343->383, 22:+343->383, 23:+343->383, 24:+343->383, 25:+343->383, 26:+343->383, 27:+343->383, 28:+343->383, 29:+343->383, 30:+343->383, 31:+343->383, 32:+343->383, 33:+343->383, 34:+343->383, 35:+343->383, 36:+343->383, 37:+343->383, 38:+343->383, 39:+343->383, 40:+343->383, 41:+343->383, 42:+343->383, 43:+343->383, 44:+343->383, 45:+343->383, 46:+343->383, 47:+343->383, 48:+343->383, 49:+343->383, 50:+343->383, 51:+295->335, 52:+295->335, 53:+295->335, 54:+295->335, 55:+295->335, 56:+295->335, 57:+295->335, 58:+295->335, 59:+295->335, 60:+295->335, 61:+295->335, 62:+295->335, 63:+295->335, 64:+295->335, 65:+295->335, 66:+295->335, 67:+295->335, 68:+295->335
    //   332: goto +624 -> 956
    //   335: aload_0
    //   336: iload 4
    //   338: invokevirtual 308	com/google/android/gms/internal/measurement/M4:C	(I)I
    //   341: ldc 97
    //   343: iand
    //   344: i2l
    //   345: lstore 8
    //   347: aload_1
    //   348: lload 8
    //   350: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   353: aload_2
    //   354: lload 8
    //   356: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   359: if_icmpne +603 -> 962
    //   362: aload_1
    //   363: lload 6
    //   365: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   368: aload_2
    //   369: lload 6
    //   371: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   374: invokestatic 715	com/google/android/gms/internal/measurement/a5:p	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   377: ifne +579 -> 956
    //   380: goto +582 -> 962
    //   383: aload_1
    //   384: lload 6
    //   386: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   389: aload_2
    //   390: lload 6
    //   392: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   395: invokestatic 715	com/google/android/gms/internal/measurement/a5:p	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   398: ifne +558 -> 956
    //   401: goto +561 -> 962
    //   404: aload_0
    //   405: aload_1
    //   406: aload_2
    //   407: iload 4
    //   409: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   412: ifeq +550 -> 962
    //   415: aload_1
    //   416: lload 6
    //   418: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   421: aload_2
    //   422: lload 6
    //   424: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   427: invokestatic 715	com/google/android/gms/internal/measurement/a5:p	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   430: ifne +526 -> 956
    //   433: goto +529 -> 962
    //   436: aload_0
    //   437: aload_1
    //   438: aload_2
    //   439: iload 4
    //   441: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   444: ifeq +518 -> 962
    //   447: aload_1
    //   448: lload 6
    //   450: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   453: aload_2
    //   454: lload 6
    //   456: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   459: lcmp
    //   460: ifeq +496 -> 956
    //   463: goto +499 -> 962
    //   466: aload_0
    //   467: aload_1
    //   468: aload_2
    //   469: iload 4
    //   471: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   474: ifeq +488 -> 962
    //   477: aload_1
    //   478: lload 6
    //   480: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   483: aload_2
    //   484: lload 6
    //   486: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   489: if_icmpeq +467 -> 956
    //   492: goto +470 -> 962
    //   495: aload_0
    //   496: aload_1
    //   497: aload_2
    //   498: iload 4
    //   500: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   503: ifeq +459 -> 962
    //   506: aload_1
    //   507: lload 6
    //   509: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   512: aload_2
    //   513: lload 6
    //   515: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   518: lcmp
    //   519: ifeq +437 -> 956
    //   522: goto +440 -> 962
    //   525: aload_0
    //   526: aload_1
    //   527: aload_2
    //   528: iload 4
    //   530: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   533: ifeq +429 -> 962
    //   536: aload_1
    //   537: lload 6
    //   539: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   542: aload_2
    //   543: lload 6
    //   545: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   548: if_icmpeq +408 -> 956
    //   551: goto +411 -> 962
    //   554: aload_0
    //   555: aload_1
    //   556: aload_2
    //   557: iload 4
    //   559: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   562: ifeq +400 -> 962
    //   565: aload_1
    //   566: lload 6
    //   568: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   571: aload_2
    //   572: lload 6
    //   574: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   577: if_icmpeq +379 -> 956
    //   580: goto +382 -> 962
    //   583: aload_0
    //   584: aload_1
    //   585: aload_2
    //   586: iload 4
    //   588: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   591: ifeq +371 -> 962
    //   594: aload_1
    //   595: lload 6
    //   597: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   600: aload_2
    //   601: lload 6
    //   603: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   606: if_icmpeq +350 -> 956
    //   609: goto +353 -> 962
    //   612: aload_0
    //   613: aload_1
    //   614: aload_2
    //   615: iload 4
    //   617: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   620: ifeq +342 -> 962
    //   623: aload_1
    //   624: lload 6
    //   626: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   629: aload_2
    //   630: lload 6
    //   632: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   635: invokestatic 715	com/google/android/gms/internal/measurement/a5:p	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   638: ifne +318 -> 956
    //   641: goto +321 -> 962
    //   644: aload_0
    //   645: aload_1
    //   646: aload_2
    //   647: iload 4
    //   649: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   652: ifeq +310 -> 962
    //   655: aload_1
    //   656: lload 6
    //   658: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   661: aload_2
    //   662: lload 6
    //   664: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   667: invokestatic 715	com/google/android/gms/internal/measurement/a5:p	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   670: ifne +286 -> 956
    //   673: goto +289 -> 962
    //   676: aload_0
    //   677: aload_1
    //   678: aload_2
    //   679: iload 4
    //   681: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   684: ifeq +278 -> 962
    //   687: aload_1
    //   688: lload 6
    //   690: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   693: aload_2
    //   694: lload 6
    //   696: invokestatic 101	com/google/android/gms/internal/measurement/D5:B	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   699: invokestatic 715	com/google/android/gms/internal/measurement/a5:p	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   702: ifne +254 -> 956
    //   705: goto +257 -> 962
    //   708: aload_0
    //   709: aload_1
    //   710: aload_2
    //   711: iload 4
    //   713: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   716: ifeq +246 -> 962
    //   719: aload_1
    //   720: lload 6
    //   722: invokestatic 368	com/google/android/gms/internal/measurement/D5:F	(Ljava/lang/Object;J)Z
    //   725: aload_2
    //   726: lload 6
    //   728: invokestatic 368	com/google/android/gms/internal/measurement/D5:F	(Ljava/lang/Object;J)Z
    //   731: if_icmpeq +225 -> 956
    //   734: goto +228 -> 962
    //   737: aload_0
    //   738: aload_1
    //   739: aload_2
    //   740: iload 4
    //   742: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   745: ifeq +217 -> 962
    //   748: aload_1
    //   749: lload 6
    //   751: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   754: aload_2
    //   755: lload 6
    //   757: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   760: if_icmpeq +196 -> 956
    //   763: goto +199 -> 962
    //   766: aload_0
    //   767: aload_1
    //   768: aload_2
    //   769: iload 4
    //   771: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   774: ifeq +188 -> 962
    //   777: aload_1
    //   778: lload 6
    //   780: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   783: aload_2
    //   784: lload 6
    //   786: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   789: lcmp
    //   790: ifeq +166 -> 956
    //   793: goto +169 -> 962
    //   796: aload_0
    //   797: aload_1
    //   798: aload_2
    //   799: iload 4
    //   801: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   804: ifeq +158 -> 962
    //   807: aload_1
    //   808: lload 6
    //   810: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   813: aload_2
    //   814: lload 6
    //   816: invokestatic 312	com/google/android/gms/internal/measurement/D5:t	(Ljava/lang/Object;J)I
    //   819: if_icmpeq +137 -> 956
    //   822: goto +140 -> 962
    //   825: aload_0
    //   826: aload_1
    //   827: aload_2
    //   828: iload 4
    //   830: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   833: ifeq +129 -> 962
    //   836: aload_1
    //   837: lload 6
    //   839: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   842: aload_2
    //   843: lload 6
    //   845: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   848: lcmp
    //   849: ifeq +107 -> 956
    //   852: goto +110 -> 962
    //   855: aload_0
    //   856: aload_1
    //   857: aload_2
    //   858: iload 4
    //   860: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   863: ifeq +99 -> 962
    //   866: aload_1
    //   867: lload 6
    //   869: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   872: aload_2
    //   873: lload 6
    //   875: invokestatic 359	com/google/android/gms/internal/measurement/D5:x	(Ljava/lang/Object;J)J
    //   878: lcmp
    //   879: ifeq +77 -> 956
    //   882: goto +80 -> 962
    //   885: aload_0
    //   886: aload_1
    //   887: aload_2
    //   888: iload 4
    //   890: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   893: ifeq +69 -> 962
    //   896: aload_1
    //   897: lload 6
    //   899: invokestatic 370	com/google/android/gms/internal/measurement/D5:n	(Ljava/lang/Object;J)F
    //   902: invokestatic 702	java/lang/Float:floatToIntBits	(F)I
    //   905: aload_2
    //   906: lload 6
    //   908: invokestatic 370	com/google/android/gms/internal/measurement/D5:n	(Ljava/lang/Object;J)F
    //   911: invokestatic 702	java/lang/Float:floatToIntBits	(F)I
    //   914: if_icmpeq +42 -> 956
    //   917: goto +45 -> 962
    //   920: aload_0
    //   921: aload_1
    //   922: aload_2
    //   923: iload 4
    //   925: invokevirtual 717	com/google/android/gms/internal/measurement/M4:K	(Ljava/lang/Object;Ljava/lang/Object;I)Z
    //   928: ifeq +34 -> 962
    //   931: aload_1
    //   932: lload 6
    //   934: invokestatic 376	com/google/android/gms/internal/measurement/D5:a	(Ljava/lang/Object;J)D
    //   937: invokestatic 707	java/lang/Double:doubleToLongBits	(D)J
    //   940: aload_2
    //   941: lload 6
    //   943: invokestatic 376	com/google/android/gms/internal/measurement/D5:a	(Ljava/lang/Object;J)D
    //   946: invokestatic 707	java/lang/Double:doubleToLongBits	(D)J
    //   949: lcmp
    //   950: ifeq +6 -> 956
    //   953: goto +9 -> 962
    //   956: iinc 4 3
    //   959: goto -950 -> 9
    //   962: iconst_0
    //   963: ireturn
    //   964: aload_0
    //   965: getfield 88	com/google/android/gms/internal/measurement/M4:o	Lcom/google/android/gms/internal/measurement/x5;
    //   968: aload_1
    //   969: invokevirtual 299	com/google/android/gms/internal/measurement/x5:k	(Ljava/lang/Object;)Ljava/lang/Object;
    //   972: aload_0
    //   973: getfield 88	com/google/android/gms/internal/measurement/M4:o	Lcom/google/android/gms/internal/measurement/x5;
    //   976: aload_2
    //   977: invokevirtual 299	com/google/android/gms/internal/measurement/x5:k	(Ljava/lang/Object;)Ljava/lang/Object;
    //   980: invokevirtual 223	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   983: ifne +5 -> 988
    //   986: iconst_0
    //   987: ireturn
    //   988: aload_0
    //   989: getfield 74	com/google/android/gms/internal/measurement/M4:f	Z
    //   992: ifeq +23 -> 1015
    //   995: aload_0
    //   996: getfield 90	com/google/android/gms/internal/measurement/M4:p	Lcom/google/android/gms/internal/measurement/O3;
    //   999: aload_1
    //   1000: invokevirtual 564	com/google/android/gms/internal/measurement/O3:b	(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/S3;
    //   1003: aload_0
    //   1004: getfield 90	com/google/android/gms/internal/measurement/M4:p	Lcom/google/android/gms/internal/measurement/O3;
    //   1007: aload_2
    //   1008: invokevirtual 564	com/google/android/gms/internal/measurement/O3:b	(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/S3;
    //   1011: invokevirtual 718	com/google/android/gms/internal/measurement/S3:equals	(Ljava/lang/Object;)Z
    //   1014: ireturn
    //   1015: iconst_1
    //   1016: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1017	0	this	M4
    //   0	1017	1	paramObject1	Object
    //   0	1017	2	paramObject2	Object
    //   5	8	3	i1	int
    //   7	950	4	i2	int
    //   21	16	5	i3	int
    //   29	913	6	l1	long
    //   345	10	8	l2	long
  }
  
  public final void i(Object paramObject, T5 paramT5)
  {
    Object localObject1 = paramT5;
    label74:
    long l1;
    label530:
    label567:
    label604:
    label641:
    label678:
    label715:
    label740:
    label776:
    label815:
    boolean bool1;
    if (paramT5.a() == W5.b)
    {
      u(o, paramObject, (T5)localObject1);
      if (f)
      {
        paramT5 = p.b(paramObject);
        if (!a.isEmpty())
        {
          localObject2 = paramT5.i();
          paramT5 = (Map.Entry)((Iterator)localObject2).next();
          break label74;
        }
      }
      localObject2 = null;
      paramT5 = null;
      label858:
      label895:
      label932:
      label969:
      label1006:
      label1043:
      label1080:
      label2458:
      for (i1 = a.length - 3;; i1 -= 3)
      {
        localObject3 = paramT5;
        if (i1 < 0) {
          break;
        }
        i2 = G(i1);
        i3 = a[i1];
        while ((paramT5 != null) && (p.a(paramT5) > i3))
        {
          p.c((T5)localObject1, paramT5);
          if (((Iterator)localObject2).hasNext()) {
            paramT5 = (Map.Entry)((Iterator)localObject2).next();
          } else {
            paramT5 = null;
          }
        }
        float f1;
        switch ((i2 & 0xFF00000) >>> 20)
        {
        default: 
          break;
        case 68: 
          if (J(paramObject, i3, i1)) {
            ((T5)localObject1).C(i3, D5.B(paramObject, i2 & 0xFFFFF), N(i1));
          }
          break;
        case 67: 
          if (J(paramObject, i3, i1))
          {
            l1 = L(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).A(i3, l1);
          }
          break;
        case 66: 
          if (J(paramObject, i3, i1))
          {
            i2 = H(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).G(i3, i2);
          }
          break;
        case 65: 
          if (J(paramObject, i3, i1))
          {
            l1 = L(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).s(i3, l1);
          }
          break;
        case 64: 
          if (J(paramObject, i3, i1))
          {
            i2 = H(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).x(i3, i2);
          }
          break;
        case 63: 
          if (J(paramObject, i3, i1))
          {
            i2 = H(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).K(i3, i2);
          }
          break;
        case 62: 
          if (J(paramObject, i3, i1))
          {
            i2 = H(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).h(i3, i2);
          }
          break;
        case 61: 
          if (J(paramObject, i3, i1)) {
            ((T5)localObject1).f(i3, (q3)D5.B(paramObject, i2 & 0xFFFFF));
          }
          break;
        case 60: 
          if (J(paramObject, i3, i1)) {
            ((T5)localObject1).d(i3, D5.B(paramObject, i2 & 0xFFFFF), N(i1));
          }
          break;
        case 59: 
          if (J(paramObject, i3, i1)) {
            t(i3, D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1);
          }
          break;
        case 58: 
          if (J(paramObject, i3, i1))
          {
            bool1 = P(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).c(i3, bool1);
          }
          break;
        case 57: 
          if (J(paramObject, i3, i1))
          {
            i2 = H(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).k(i3, i2);
          }
          break;
        case 56: 
          if (J(paramObject, i3, i1))
          {
            l1 = L(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).M(i3, l1);
          }
          break;
        case 55: 
          if (J(paramObject, i3, i1))
          {
            i2 = H(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).r(i3, i2);
          }
          break;
        case 54: 
          if (J(paramObject, i3, i1))
          {
            l1 = L(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).I(i3, l1);
          }
          break;
        case 53: 
          if (J(paramObject, i3, i1))
          {
            l1 = L(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).j(i3, l1);
          }
          break;
        case 52: 
          if (J(paramObject, i3, i1))
          {
            f1 = B(paramObject, i2 & 0xFFFFF);
            ((T5)localObject1).O(i3, f1);
          }
          break;
        case 51: 
          if (!J(paramObject, i3, i1)) {
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
          for (double d1 = j(paramObject, i2 & 0xFFFFF);; d1 = D5.a(paramObject, i2 & 0xFFFFF))
          {
            ((T5)localObject1).N(i3, d1);
            break label2458;
            v((T5)localObject1, i3, D5.B(paramObject, i2 & 0xFFFFF), i1);
            break label2458;
            a5.j(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, N(i1));
            break label2458;
            a5.a0(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.Z(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.Y(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.V(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.B(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.b0(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.k(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.F(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.J(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.P(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.c0(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.S(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.M(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.x(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, true);
            break label2458;
            a5.a0(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.Z(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.Y(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.V(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.B(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.b0(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.i(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1);
            break label2458;
            a5.w(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, N(i1));
            break label2458;
            a5.v(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1);
            break label2458;
            a5.k(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.F(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.J(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.P(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.c0(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.S(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.M(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            a5.x(a[i1], (List)D5.B(paramObject, i2 & 0xFFFFF), (T5)localObject1, false);
            break label2458;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            break;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            l1 = D5.x(paramObject, i2 & 0xFFFFF);
            break label530;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            i2 = D5.t(paramObject, i2 & 0xFFFFF);
            break label567;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            l1 = D5.x(paramObject, i2 & 0xFFFFF);
            break label604;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            i2 = D5.t(paramObject, i2 & 0xFFFFF);
            break label641;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            i2 = D5.t(paramObject, i2 & 0xFFFFF);
            break label678;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            i2 = D5.t(paramObject, i2 & 0xFFFFF);
            break label715;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            break label740;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            break label776;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            break label815;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            bool1 = D5.F(paramObject, i2 & 0xFFFFF);
            break label858;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            i2 = D5.t(paramObject, i2 & 0xFFFFF);
            break label895;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            l1 = D5.x(paramObject, i2 & 0xFFFFF);
            break label932;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            i2 = D5.t(paramObject, i2 & 0xFFFFF);
            break label969;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            l1 = D5.x(paramObject, i2 & 0xFFFFF);
            break label1006;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            l1 = D5.x(paramObject, i2 & 0xFFFFF);
            break label1043;
            if (!I(paramObject, i1)) {
              break label2458;
            }
            f1 = D5.n(paramObject, i2 & 0xFFFFF);
            break label1080;
            if (!I(paramObject, i1)) {
              break label2458;
            }
          }
        }
      }
      while (localObject3 != null)
      {
        p.c((T5)localObject1, (Map.Entry)localObject3);
        if (((Iterator)localObject2).hasNext()) {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
        } else {
          localObject3 = null;
        }
      }
      return;
    }
    if (f)
    {
      localObject3 = p.b(paramObject);
      if (!a.isEmpty())
      {
        localObject2 = ((S3)localObject3).l();
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        break label2567;
      }
    }
    Object localObject3 = null;
    Object localObject2 = null;
    label2567:
    int i4 = a.length;
    Unsafe localUnsafe = s;
    int i2 = 0;
    int i3 = i2;
    int i1 = 1048575;
    while (i3 < i4)
    {
      int i5 = G(i3);
      Object localObject4 = a;
      int i6 = localObject4[i3];
      int i7 = (i5 & 0xFF00000) >>> 20;
      int i9;
      int i10;
      if (i7 <= 17)
      {
        int i8 = localObject4[(i3 + 2)];
        i9 = i8 & 0xFFFFF;
        i10 = i1;
        if (i9 != i1)
        {
          if (i9 == 1048575) {
            i2 = 0;
          } else {
            i2 = localUnsafe.getInt(paramObject, i9);
          }
          i10 = i9;
        }
        i9 = 1 << (i8 >>> 20);
        i1 = i10;
        i10 = i9;
      }
      else
      {
        i10 = 0;
      }
      for (;;)
      {
        localObject4 = localObject2;
        if ((localObject3 == null) || (p.a((Map.Entry)localObject3) > i6)) {
          break;
        }
        p.c((T5)localObject1, (Map.Entry)localObject3);
        if (((Iterator)localObject4).hasNext()) {
          localObject3 = (Map.Entry)((Iterator)localObject4).next();
        } else {
          localObject3 = null;
        }
      }
      l1 = i5 & 0xFFFFF;
      label3083:
      boolean bool2;
      switch (i7)
      {
      default: 
      case 68: 
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
      case 51: 
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
        for (;;)
        {
          bool1 = false;
          localObject2 = localObject1;
          break;
          if (J(paramObject, i6, i3))
          {
            ((T5)localObject1).C(i6, localUnsafe.getObject(paramObject, l1), N(i3));
            continue;
            if (J(paramObject, i6, i3))
            {
              ((T5)localObject1).A(i6, L(paramObject, l1));
              continue;
              if (J(paramObject, i6, i3))
              {
                ((T5)localObject1).G(i6, H(paramObject, l1));
                continue;
                if (J(paramObject, i6, i3))
                {
                  ((T5)localObject1).s(i6, L(paramObject, l1));
                  continue;
                  if (J(paramObject, i6, i3))
                  {
                    ((T5)localObject1).x(i6, H(paramObject, l1));
                    continue;
                    if (J(paramObject, i6, i3))
                    {
                      ((T5)localObject1).K(i6, H(paramObject, l1));
                      continue;
                      if (J(paramObject, i6, i3))
                      {
                        ((T5)localObject1).h(i6, H(paramObject, l1));
                        continue;
                        if (J(paramObject, i6, i3))
                        {
                          ((T5)localObject1).f(i6, (q3)localUnsafe.getObject(paramObject, l1));
                          continue;
                          if (J(paramObject, i6, i3))
                          {
                            ((T5)localObject1).d(i6, localUnsafe.getObject(paramObject, l1), N(i3));
                            continue;
                            if (J(paramObject, i6, i3))
                            {
                              t(i6, localUnsafe.getObject(paramObject, l1), (T5)localObject1);
                              continue;
                              if (J(paramObject, i6, i3))
                              {
                                ((T5)localObject1).c(i6, P(paramObject, l1));
                                continue;
                                if (J(paramObject, i6, i3))
                                {
                                  ((T5)localObject1).k(i6, H(paramObject, l1));
                                  continue;
                                  if (J(paramObject, i6, i3))
                                  {
                                    ((T5)localObject1).M(i6, L(paramObject, l1));
                                    continue;
                                    if (J(paramObject, i6, i3))
                                    {
                                      ((T5)localObject1).r(i6, H(paramObject, l1));
                                      continue;
                                      if (J(paramObject, i6, i3))
                                      {
                                        ((T5)localObject1).I(i6, L(paramObject, l1));
                                        continue;
                                        if (J(paramObject, i6, i3))
                                        {
                                          ((T5)localObject1).j(i6, L(paramObject, l1));
                                          continue;
                                          if (J(paramObject, i6, i3))
                                          {
                                            ((T5)localObject1).O(i6, B(paramObject, l1));
                                            continue;
                                            if (J(paramObject, i6, i3))
                                            {
                                              ((T5)localObject1).N(i6, j(paramObject, l1));
                                              continue;
                                              v((T5)localObject1, i6, localUnsafe.getObject(paramObject, l1), i3);
                                              continue;
                                              a5.j(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, N(i3));
                                              continue;
                                              a5.a0(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.Z(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.Y(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.V(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.B(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.b0(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.k(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.F(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.J(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.P(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.c0(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.S(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.M(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
                                              continue;
                                              a5.x(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, true);
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
      case 34: 
        a5.a0(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
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
        for (;;)
        {
          bool1 = false;
          break label3083;
          a5.Z(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.Y(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.V(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.B(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.b0(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.i(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1);
          break;
          a5.w(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, N(i3));
          break;
          a5.v(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1);
          break;
          a5.k(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.F(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.J(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.P(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.c0(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.S(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.M(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
          continue;
          a5.x(a[i3], (List)localUnsafe.getObject(paramObject, l1), (T5)localObject1, false);
        }
      case 17: 
        bool1 = false;
        if (z(paramObject, i3, i1, i2, i10)) {
          paramT5.C(i6, localUnsafe.getObject(paramObject, l1), N(i3));
        }
        for (;;)
        {
          localObject2 = paramT5;
          break;
        }
      case 16: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).A(i6, localUnsafe.getLong(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 15: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).G(i6, localUnsafe.getInt(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 14: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).s(i6, localUnsafe.getLong(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 13: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).x(i6, localUnsafe.getInt(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 12: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).K(i6, localUnsafe.getInt(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 11: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).h(i6, localUnsafe.getInt(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 10: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).f(i6, (q3)localUnsafe.getObject(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 9: 
        bool2 = false;
        i9 = i3;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i9, i1, i2, i10))
        {
          ((T5)localObject1).d(i6, localUnsafe.getObject(paramObject, l1), N(i9));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 8: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          t(i6, localUnsafe.getObject(paramObject, l1), (T5)localObject1);
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 7: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).c(i6, D5.F(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 6: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).k(i6, localUnsafe.getInt(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 5: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).M(i6, localUnsafe.getLong(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 4: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).r(i6, localUnsafe.getInt(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 3: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).I(i6, localUnsafe.getLong(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 2: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).j(i6, localUnsafe.getLong(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 1: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).O(i6, D5.n(paramObject, l1));
          localObject2 = localObject1;
          bool1 = bool2;
        }
        break;
      case 0: 
        bool2 = false;
        localObject2 = localObject1;
        bool1 = bool2;
        if (z(paramObject, i3, i1, i2, i10))
        {
          ((T5)localObject1).N(i6, D5.a(paramObject, l1));
          bool1 = bool2;
          localObject2 = localObject1;
        }
        break;
      }
      i3 += 3;
      localObject1 = localObject2;
      localObject2 = localObject4;
    }
    while (localObject3 != null)
    {
      p.c((T5)localObject1, (Map.Entry)localObject3);
      if (((Iterator)localObject2).hasNext()) {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
      } else {
        localObject3 = null;
      }
    }
    u(o, paramObject, (T5)localObject1);
  }
  
  public final int k(int paramInt)
  {
    if ((paramInt >= c) && (paramInt <= d)) {
      return l(paramInt, 0);
    }
    return -1;
  }
  
  public final int l(int paramInt1, int paramInt2)
  {
    int i1 = a.length / 3 - 1;
    while (paramInt2 <= i1)
    {
      int i2 = i1 + paramInt2 >>> 1;
      int i3 = i2 * 3;
      int i4 = a[i3];
      if (paramInt1 == i4) {
        return i3;
      }
      if (paramInt1 < i4) {
        i1 = i2 - 1;
      } else {
        paramInt2 = i2 + 1;
      }
    }
    return -1;
  }
  
  public final int m(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, p3 paramp3)
  {
    Object localObject1 = paramObject;
    int i1 = paramInt2;
    int i2 = paramInt3;
    Object localObject2 = paramp3;
    R(paramObject);
    Object localObject3 = s;
    int i3 = 0;
    int i4 = i3;
    int i5 = i4;
    int i6 = -1;
    int i7 = 1048575;
    int i8;
    int i10;
    Object localObject4;
    label563:
    Object localObject6;
    for (;;)
    {
      if (paramInt1 < i1)
      {
        i8 = paramInt1 + 1;
        paramInt1 = paramArrayOfByte[paramInt1];
        if (paramInt1 < 0)
        {
          i8 = n3.d(paramInt1, paramArrayOfByte, i8, (p3)localObject2);
          paramInt1 = a;
        }
        i4 = paramInt1 >>> 3;
        int i9 = paramInt1 & 0x7;
        if (i4 > i6)
        {
          i6 = i3 / 3;
          if ((i4 >= c) && (i4 <= d)) {
            i6 = l(i4, i6);
          }
        }
        for (i6 = -1;; i6 = k(i4)) {
          break;
        }
        if (i6 == -1)
        {
          i3 = i7;
          i9 = 0;
          i10 = i2;
          i2 = i4;
          i6 = i1;
          i7 = i8;
          localObject4 = localObject2;
          i4 = i10;
          i8 = i9;
          i1 = i3;
          localObject2 = localObject3;
        }
        else
        {
          Object localObject5 = a;
          int i11 = localObject5[(i6 + 1)];
          int i12 = (i11 & 0xFF00000) >>> 20;
          long l1 = i11 & 0xFFFFF;
          label974:
          label1170:
          label1184:
          label1188:
          boolean bool;
          if (i12 <= 17)
          {
            i1 = localObject5[(i6 + 2)];
            int i13 = 1 << (i1 >>> 20);
            i1 &= 0xFFFFF;
            if (i1 != i7)
            {
              if (i7 != 1048575) {
                ((Unsafe)localObject3).putInt(localObject1, i7, i5);
              }
              if (i1 == 1048575) {
                i5 = 0;
              } else {
                i5 = ((Unsafe)localObject3).getInt(localObject1, i1);
              }
              i2 = i5;
            }
            else
            {
              i1 = i7;
              i2 = i5;
            }
            switch (i12)
            {
            default: 
            case 17: 
              for (;;)
              {
                i5 = paramInt3;
                i7 = paramInt1;
                break label1489;
                if (i9 == 3)
                {
                  localObject4 = p(localObject1, i6);
                  i8 = n3.h(localObject4, N(i6), paramArrayOfByte, i8, paramInt2, i4 << 3 | 0x4, paramp3);
                  x(localObject1, i6, localObject4);
                  i5 = i2 | i13;
                  i3 = i6;
                  i6 = i4;
                  i7 = i1;
                  i1 = paramInt2;
                  i4 = paramInt1;
                  paramInt1 = i8;
                  i2 = paramInt3;
                  break;
                }
              }
            case 16: 
              if (i9 == 0)
              {
                i5 = n3.p(paramArrayOfByte, i8, (p3)localObject2);
                ((Unsafe)localObject3).putLong(paramObject, l1, G3.b(b));
                i8 = i2 | i13;
                i7 = i1;
                i10 = paramInt1;
                i3 = i6;
                i2 = paramInt3;
                i1 = paramInt2;
                paramInt1 = i5;
                i6 = i4;
                i4 = i10;
                i5 = i8;
                continue;
              }
              i5 = paramInt3;
              i7 = paramInt1;
              break;
            case 15: 
              i5 = paramInt3;
              localObject4 = localObject2;
              i7 = paramInt1;
              if (i9 == 0)
              {
                i5 = n3.o(paramArrayOfByte, i8, (p3)localObject4);
                ((Unsafe)localObject3).putInt(localObject1, l1, G3.e(a));
              }
            case 12: 
            case 10: 
            case 9: 
            case 8: 
            case 7: 
            case 6: 
            case 13: 
            case 5: 
            case 14: 
            case 4: 
            case 11: 
            case 2: 
            case 3: 
            case 1: 
            case 0: 
              for (;;)
              {
                i8 = paramInt3;
                i7 = i2 | i13;
                i2 = i8;
                i8 = i7;
                for (;;)
                {
                  localObject4 = localObject3;
                  i7 = paramInt2;
                  for (;;)
                  {
                    i10 = i4;
                    i4 = paramInt1;
                    i3 = i6;
                    i6 = i10;
                    for (;;)
                    {
                      i10 = i1;
                      paramInt1 = i5;
                      i5 = i8;
                      localObject3 = localObject4;
                      i1 = i7;
                      i7 = i10;
                      break;
                      i5 = paramInt2;
                      i3 = paramInt3;
                      localObject6 = localObject2;
                      i12 = i6;
                      i10 = paramInt1;
                      i5 = i4;
                      localObject4 = localObject3;
                      i5 = i3;
                      i7 = i10;
                      if (i9 != 0) {
                        break label1489;
                      }
                      i9 = n3.o(paramArrayOfByte, i8, (p3)localObject6);
                      i5 = a;
                      localObject6 = M(i12);
                      if (((i11 & 0x80000000) == 0) || (localObject6 == null) || (!((g4)localObject6).e(i5))) {
                        O(paramObject).e(i10, Long.valueOf(i5));
                      }
                      for (i5 = i2;; i5 = i2 | i13)
                      {
                        i7 = i1;
                        i8 = paramInt1;
                        i10 = i6;
                        i1 = paramInt2;
                        paramInt1 = i9;
                        i2 = i3;
                        i6 = i4;
                        i3 = i10;
                        i4 = i8;
                        break;
                        ((Unsafe)localObject4).putInt(localObject1, l1, i5);
                      }
                      i3 = paramInt3;
                      localObject4 = localObject2;
                      localObject6 = localObject3;
                      if (i9 != 2) {
                        break label974;
                      }
                      i5 = n3.j(paramArrayOfByte, i8, (p3)localObject4);
                      ((Unsafe)localObject6).putObject(localObject1, l1, c);
                      i8 = i2 | i13;
                      i7 = paramInt2;
                      i10 = i6;
                      localObject2 = localObject4;
                      localObject4 = localObject6;
                      i2 = i3;
                      i6 = i4;
                      i3 = i10;
                      i4 = paramInt1;
                    }
                    do
                    {
                      i5 = paramInt3;
                      i7 = paramInt1;
                      break;
                      i7 = i6;
                    } while (i9 != 2);
                    localObject4 = p(localObject1, i7);
                    i5 = n3.i(localObject4, N(i7), paramArrayOfByte, i8, paramInt2, paramp3);
                    x(localObject1, i7, localObject4);
                    i8 = i2 | i13;
                    localObject4 = localObject3;
                    i7 = paramInt2;
                    i2 = paramInt3;
                  }
                  localObject4 = localObject2;
                  i5 = i8;
                  if (i9 != 2) {
                    break label1188;
                  }
                  if (S(i11))
                  {
                    i5 = n3.m(paramArrayOfByte, i5, (p3)localObject4);
                  }
                  else
                  {
                    i5 = n3.o(paramArrayOfByte, i5, (p3)localObject4);
                    i8 = a;
                    if (i8 < 0) {
                      break label1184;
                    }
                    if (i8 == 0)
                    {
                      c = "";
                    }
                    else
                    {
                      c = new String(paramArrayOfByte, i5, i8, a4.b);
                      i5 += i8;
                    }
                  }
                  ((Unsafe)localObject3).putObject(localObject1, l1, c);
                  i8 = i2 | i13;
                  i2 = paramInt3;
                }
                throw k4.d();
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
                          i5 = paramInt3;
                          i7 = paramInt1;
                          break;
                          localObject4 = localObject2;
                        } while (i9 != 0);
                        i5 = n3.p(paramArrayOfByte, i8, (p3)localObject4);
                        if (b != 0L) {
                          bool = true;
                        } else {
                          bool = false;
                        }
                        D5.v(localObject1, l1, bool);
                        break;
                        i5 = i8;
                      } while (i9 != 5);
                      ((Unsafe)localObject3).putInt(localObject1, l1, n3.n(paramArrayOfByte, i5));
                      i5 += 4;
                      break;
                      i5 = i8;
                      localObject4 = localObject3;
                    } while (i9 != 1);
                    ((Unsafe)localObject4).putLong(paramObject, l1, n3.q(paramArrayOfByte, i5));
                    i5 += 8;
                    i8 = i2 | i13;
                    i7 = paramInt2;
                    i2 = paramInt3;
                    break;
                    localObject4 = localObject2;
                  } while (i9 != 0);
                  i5 = n3.o(paramArrayOfByte, i8, (p3)localObject4);
                  ((Unsafe)localObject3).putInt(localObject1, l1, a);
                  break label1170;
                  localObject6 = localObject2;
                  localObject4 = localObject3;
                } while (i9 != 0);
                i5 = n3.p(paramArrayOfByte, i8, (p3)localObject6);
                ((Unsafe)localObject4).putLong(paramObject, l1, b);
                i8 = i2 | i13;
                break label563;
                i5 = paramInt3;
                i3 = i8;
                i7 = paramInt1;
                if (i9 != 5) {
                  break label1489;
                }
                D5.g(localObject1, l1, n3.l(paramArrayOfByte, i3));
                i5 = i3 + 4;
                continue;
                i5 = paramInt3;
                i3 = i8;
                i7 = paramInt1;
                if (i9 != 1) {
                  break label1489;
                }
                D5.f(localObject1, l1, n3.a(paramArrayOfByte, i3));
                i5 = i3 + 8;
              }
              label1489:
              i10 = i8;
              i8 = i6;
              i3 = i4;
              paramInt1 = i7;
              i4 = i5;
              i6 = paramInt2;
              i7 = i10;
              localObject4 = localObject2;
              i5 = i2;
              i2 = i3;
              localObject2 = localObject3;
              break;
            }
          }
          i2 = paramInt3;
          i3 = i7;
          localObject4 = localObject2;
          i7 = i8;
          i1 = 10;
          if (i12 == 27)
          {
            if (i9 == 2)
            {
              localObject6 = (h4)((Unsafe)localObject3).getObject(localObject1, l1);
              localObject2 = localObject6;
              if (!((h4)localObject6).c())
              {
                i8 = ((List)localObject6).size();
                if (i8 != 0) {
                  for (;;)
                  {
                    i1 = i8 << 1;
                  }
                }
                localObject2 = ((h4)localObject6).e(i1);
                ((Unsafe)localObject3).putObject(localObject1, l1, localObject2);
              }
              localObject6 = N(i6);
              i10 = n3.e((Z4)localObject6, paramInt1, paramArrayOfByte, i7, paramInt2, (h4)localObject2, paramp3);
              i1 = paramInt2;
              i8 = i6;
              i6 = i4;
              i4 = paramInt1;
              i7 = i3;
              localObject2 = localObject4;
              paramInt1 = i10;
              i3 = i8;
              continue;
            }
          }
          else
          {
            if (i12 <= 49)
            {
              l2 = i11;
              localObject5 = s;
              localObject7 = (h4)((Unsafe)localObject5).getObject(localObject1, l1);
              localObject6 = localObject7;
              if (!((h4)localObject7).c())
              {
                i2 = ((List)localObject7).size();
                if (i2 != 0) {
                  for (;;)
                  {
                    i1 = i2 << 1;
                  }
                }
                localObject6 = ((h4)localObject7).e(i1);
                ((Unsafe)localObject5).putObject(localObject1, l1, localObject6);
              }
              switch (i12)
              {
              default: 
                i8 = i6;
                i6 = paramInt1;
                paramInt1 = i7;
                localObject2 = localObject4;
                break;
              case 49: 
                if (i9 == 3)
                {
                  localObject2 = N(i6);
                  i2 = paramInt1;
                  i10 = i2 & 0xFFFFFFF8 | 0x4;
                  for (i1 = n3.f((Z4)localObject2, paramArrayOfByte, i7, paramInt2, i10, paramp3);; i1 = n3.f((Z4)localObject2, paramArrayOfByte, i9, paramInt2, i10, paramp3))
                  {
                    ((List)localObject6).add(c);
                    i8 = i1;
                    if (i1 >= paramInt2) {
                      break;
                    }
                    i9 = n3.o(paramArrayOfByte, i1, (p3)localObject4);
                    i8 = i1;
                    if (i2 != a) {
                      break;
                    }
                  }
                }
              case 34: 
              case 48: 
                do
                {
                  i1 = i6;
                  i6 = paramInt1;
                  paramInt1 = i8;
                  i8 = i1;
                  localObject2 = localObject4;
                  break label4107;
                  i8 = i6;
                  i6 = paramInt1;
                  paramInt1 = i7;
                  localObject2 = localObject4;
                  break label4098;
                  if (i9 != 2) {
                    break;
                  }
                  localObject2 = (w4)localObject6;
                  i8 = n3.o(paramArrayOfByte, i7, (p3)localObject4);
                  i1 = a + i8;
                  while (i8 < i1)
                  {
                    i8 = n3.p(paramArrayOfByte, i8, (p3)localObject4);
                    ((w4)localObject2).d(G3.b(b));
                  }
                } while (i8 == i1);
                throw k4.f();
                if (i9 == 0)
                {
                  localObject2 = (w4)localObject6;
                  for (i1 = n3.p(paramArrayOfByte, i7, (p3)localObject4);; i1 = n3.p(paramArrayOfByte, i2, (p3)localObject4))
                  {
                    ((w4)localObject2).d(G3.b(b));
                    i8 = i1;
                    if (i1 >= paramInt2) {
                      break;
                    }
                    i2 = n3.o(paramArrayOfByte, i1, (p3)localObject4);
                    i8 = i1;
                    if (paramInt1 != a) {
                      break;
                    }
                  }
                }
              case 33: 
              case 47: 
              case 30: 
              case 44: 
              case 28: 
              case 27: 
                do
                {
                  do
                  {
                    do
                    {
                      i8 = i6;
                      i6 = paramInt1;
                      paramInt1 = i7;
                      localObject2 = localObject4;
                      break label4098;
                      if (i9 == 2)
                      {
                        localObject2 = (c4)localObject6;
                        i8 = n3.o(paramArrayOfByte, i7, (p3)localObject4);
                        i1 = a + i8;
                        while (i8 < i1)
                        {
                          i8 = n3.o(paramArrayOfByte, i8, (p3)localObject4);
                          ((c4)localObject2).g(G3.e(a));
                        }
                        if (i8 == i1) {
                          break;
                        }
                        throw k4.f();
                      }
                    } while (i9 != 0);
                    localObject2 = (c4)localObject6;
                    for (i1 = n3.o(paramArrayOfByte, i7, (p3)localObject4);; i1 = n3.o(paramArrayOfByte, i2, (p3)localObject4))
                    {
                      ((c4)localObject2).g(G3.e(a));
                      i8 = i1;
                      if (i1 >= paramInt2) {
                        break;
                      }
                      i2 = n3.o(paramArrayOfByte, i1, (p3)localObject4);
                      i8 = i1;
                      if (paramInt1 != a) {
                        break;
                      }
                    }
                    if (i9 == 2) {}
                    for (i8 = n3.k(paramArrayOfByte, i7, (h4)localObject6, (p3)localObject4);; i8 = n3.b(paramInt1, paramArrayOfByte, i7, paramInt2, (h4)localObject6, paramp3))
                    {
                      break label2493;
                      if (i9 != 0) {
                        break;
                      }
                    }
                    a5.h(paramObject, i4, (List)localObject6, M(i6), null, o);
                    break;
                  } while (i9 != 2);
                  i2 = n3.o(paramArrayOfByte, i7, (p3)localObject4);
                  i10 = a;
                  if (i10 >= 0)
                  {
                    if (i10 <= paramArrayOfByte.length - i2)
                    {
                      i1 = i2;
                      i8 = i10;
                      if (i10 == 0) {}
                      for (i1 = i2;; i1 = i2)
                      {
                        ((List)localObject6).add(q3.p);
                        do
                        {
                          ((List)localObject6).add(q3.q(paramArrayOfByte, i1, i8));
                          i1 += i8;
                          i8 = i1;
                          if (i1 >= paramInt2) {
                            break;
                          }
                          i2 = n3.o(paramArrayOfByte, i1, (p3)localObject4);
                          i8 = i1;
                          if (paramInt1 != a) {
                            break;
                          }
                          i2 = n3.o(paramArrayOfByte, i2, (p3)localObject4);
                          i10 = a;
                          if (i10 < 0) {
                            break label2698;
                          }
                          if (i10 > paramArrayOfByte.length - i2) {
                            break label2694;
                          }
                          i1 = i2;
                          i8 = i10;
                        } while (i10 != 0);
                      }
                      throw k4.f();
                      throw k4.d();
                    }
                    throw k4.f();
                  }
                  throw k4.d();
                  i1 = paramInt1;
                } while (i9 != 2);
                i7 = n3.e(N(i6), i1, paramArrayOfByte, i7, paramInt2, (h4)localObject6, paramp3);
                i1 = i7;
                i7 = i8;
                i2 = paramInt1;
                i8 = i6;
                paramInt1 = i1;
                i6 = i2;
                break;
              case 26: 
                i2 = paramInt2;
                localObject1 = localObject4;
                i10 = paramInt1;
                if (i9 == 2)
                {
                  if ((l2 & 0x20000000) == 0L)
                  {
                    i1 = n3.o(paramArrayOfByte, i7, (p3)localObject1);
                    i7 = a;
                    if (i7 >= 0)
                    {
                      if (i7 == 0) {
                        ((List)localObject6).add("");
                      }
                      for (localObject4 = new String(paramArrayOfByte, i1, i7, a4.b);; localObject4 = new String(paramArrayOfByte, i1, i7, a4.b))
                      {
                        ((List)localObject6).add(localObject4);
                        i1 += i7;
                        i7 = i1;
                        if (i1 >= i2) {
                          break;
                        }
                        i9 = n3.o(paramArrayOfByte, i1, (p3)localObject1);
                        i7 = i1;
                        if (i10 != a) {
                          break;
                        }
                        i1 = n3.o(paramArrayOfByte, i9, (p3)localObject1);
                        i7 = a;
                        if (i7 < 0) {
                          break label2954;
                        }
                        if (i7 == 0) {
                          break label2821;
                        }
                      }
                      throw k4.d();
                    }
                    throw k4.d();
                  }
                  i1 = n3.o(paramArrayOfByte, i7, (p3)localObject1);
                  i9 = a;
                  if (i9 >= 0)
                  {
                    if (i9 == 0)
                    {
                      ((List)localObject6).add("");
                    }
                    else
                    {
                      i7 = i1 + i9;
                      if (!E5.f(paramArrayOfByte, i1, i7)) {
                        break label3163;
                      }
                    }
                    for (localObject4 = new String(paramArrayOfByte, i1, i9, a4.b);; localObject4 = new String(paramArrayOfByte, i1, i9, a4.b))
                    {
                      ((List)localObject6).add(localObject4);
                      i1 = i7;
                      i7 = i1;
                      if (i1 >= i2) {
                        break;
                      }
                      i9 = n3.o(paramArrayOfByte, i1, (p3)localObject1);
                      i7 = i1;
                      if (i10 != a) {
                        break;
                      }
                      i1 = n3.o(paramArrayOfByte, i9, (p3)localObject1);
                      i9 = a;
                      if (i9 < 0) {
                        break label3159;
                      }
                      if (i9 == 0) {
                        break label2989;
                      }
                      i7 = i1 + i9;
                      if (!E5.f(paramArrayOfByte, i1, i7)) {
                        break label3155;
                      }
                    }
                    throw k4.c();
                    throw k4.d();
                    throw k4.c();
                  }
                  throw k4.d();
                }
              case 25: 
              case 42: 
              case 24: 
              case 31: 
              case 41: 
              case 45: 
              case 23: 
              case 32: 
              case 40: 
              case 46: 
              case 22: 
              case 29: 
              case 39: 
              case 43: 
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        i7 = i8;
                        i8 = i6;
                        i6 = paramInt1;
                        paramInt1 = i7;
                        break label4098;
                        if (i9 == 2)
                        {
                          a.a(localObject6);
                          i7 = n3.o(paramArrayOfByte, i7, (p3)localObject4);
                          i1 = a + i7;
                          if (i7 >= i1)
                          {
                            if (i7 == i1) {
                              break;
                            }
                            throw k4.f();
                          }
                          n3.p(paramArrayOfByte, i7, (p3)localObject4);
                          throw null;
                        }
                      } while (i9 != 0);
                      a.a(localObject6);
                      n3.p(paramArrayOfByte, i7, (p3)localObject4);
                      l1 = b;
                      throw null;
                      if (i9 == 2)
                      {
                        localObject1 = (c4)localObject6;
                        i7 = n3.o(paramArrayOfByte, i7, (p3)localObject4);
                        i1 = a + i7;
                        while (i7 < i1)
                        {
                          ((c4)localObject1).g(n3.n(paramArrayOfByte, i7));
                          i7 += 4;
                        }
                        if (i7 == i1) {
                          break;
                        }
                        throw k4.f();
                      }
                    } while (i9 != 5);
                    localObject1 = (c4)localObject6;
                    ((c4)localObject1).g(n3.n(paramArrayOfByte, i7));
                    for (i1 = i7 + 4;; i1 = i2 + 4)
                    {
                      i7 = i1;
                      if (i1 >= paramInt2) {
                        break;
                      }
                      i2 = n3.o(paramArrayOfByte, i1, (p3)localObject4);
                      i7 = i1;
                      if (paramInt1 != a) {
                        break;
                      }
                      ((c4)localObject1).g(n3.n(paramArrayOfByte, i2));
                    }
                    i1 = i8;
                    i8 = paramInt1;
                    i2 = i6;
                    paramInt1 = i7;
                    i6 = i8;
                    i8 = i2;
                    i7 = i1;
                    break label4107;
                    if (i9 == 2)
                    {
                      localObject1 = (w4)localObject6;
                      i7 = n3.o(paramArrayOfByte, i7, (p3)localObject4);
                      i1 = a + i7;
                      while (i7 < i1)
                      {
                        ((w4)localObject1).d(n3.q(paramArrayOfByte, i7));
                        i7 += 8;
                      }
                      if (i7 == i1) {
                        break;
                      }
                      throw k4.f();
                    }
                  } while (i9 != 1);
                  localObject1 = (w4)localObject6;
                  ((w4)localObject1).d(n3.q(paramArrayOfByte, i7));
                  for (i1 = i7 + 8;; i1 = i2 + 8)
                  {
                    i7 = i1;
                    if (i1 >= paramInt2) {
                      break;
                    }
                    i2 = n3.o(paramArrayOfByte, i1, (p3)localObject4);
                    i7 = i1;
                    if (paramInt1 != a) {
                      break;
                    }
                    ((w4)localObject1).d(n3.q(paramArrayOfByte, i2));
                  }
                  i2 = i7;
                  i1 = paramInt1;
                  if (i9 == 2)
                  {
                    i7 = n3.k(paramArrayOfByte, i2, (h4)localObject6, (p3)localObject4);
                    break;
                  }
                } while (i9 != 0);
                localObject2 = localObject4;
                i7 = i2;
                i8 = i1;
                i10 = i6;
                paramInt1 = n3.b(i1, paramArrayOfByte, i2, paramInt2, (h4)localObject6, paramp3);
                i6 = i8;
                i8 = i10;
                break;
              case 20: 
              case 21: 
              case 37: 
              case 38: 
                i1 = i6;
                i2 = i7;
                i10 = paramInt1;
                if (i9 == 2)
                {
                  localObject2 = (w4)localObject6;
                  paramInt1 = n3.o(paramArrayOfByte, i2, (p3)localObject4);
                  i6 = a + paramInt1;
                  while (paramInt1 < i6)
                  {
                    paramInt1 = n3.p(paramArrayOfByte, paramInt1, (p3)localObject4);
                    ((w4)localObject2).d(b);
                  }
                  if (paramInt1 == i6)
                  {
                    i6 = i10;
                    i8 = i1;
                    i7 = i2;
                    localObject2 = localObject4;
                    break label4107;
                  }
                  throw k4.f();
                }
                i6 = i10;
                i8 = i1;
                paramInt1 = i2;
                localObject2 = localObject4;
                if (i9 != 0) {
                  break label4098;
                }
                localObject1 = (w4)localObject6;
                for (i9 = n3.p(paramArrayOfByte, i2, (p3)localObject4);; i9 = n3.p(paramArrayOfByte, i12, (p3)localObject4))
                {
                  ((w4)localObject1).d(b);
                  paramInt1 = i9;
                  i6 = i10;
                  i8 = i1;
                  i7 = i2;
                  localObject2 = localObject4;
                  if (i9 >= paramInt2) {
                    break;
                  }
                  i12 = n3.o(paramArrayOfByte, i9, (p3)localObject4);
                  paramInt1 = i9;
                  i6 = i10;
                  i8 = i1;
                  i7 = i2;
                  localObject2 = localObject4;
                  if (i10 != a) {
                    break;
                  }
                }
              case 19: 
              case 36: 
                label2493:
                label2694:
                label2698:
                label2821:
                label2954:
                label2989:
                label3155:
                label3159:
                label3163:
                i8 = i6;
                i6 = paramInt1;
                if (i9 == 2)
                {
                  a.a(localObject6);
                  paramInt1 = n3.o(paramArrayOfByte, i7, (p3)localObject4);
                  i1 = a + paramInt1;
                  if (paramInt1 >= i1)
                  {
                    if (paramInt1 == i1)
                    {
                      localObject2 = localObject4;
                      break label4107;
                    }
                    throw k4.f();
                  }
                  n3.l(paramArrayOfByte, paramInt1);
                  throw null;
                }
                if (i9 != 5)
                {
                  paramInt1 = i7;
                  localObject2 = localObject4;
                  break label4098;
                }
                a.a(localObject6);
                n3.l(paramArrayOfByte, i7);
                throw null;
              }
              i8 = i6;
              i6 = paramInt1;
              if (i9 == 2)
              {
                a.a(localObject6);
                paramInt1 = n3.o(paramArrayOfByte, i7, (p3)localObject4);
                i1 = a + paramInt1;
                if (paramInt1 >= i1)
                {
                  if (paramInt1 == i1) {
                    localObject2 = localObject4;
                  } else {
                    throw k4.f();
                  }
                }
                else
                {
                  n3.a(paramArrayOfByte, paramInt1);
                  throw null;
                }
              }
              else
              {
                if (i9 == 1) {
                  break label4189;
                }
                localObject2 = localObject4;
                paramInt1 = i7;
                label4098:
                i1 = paramInt1;
                i7 = paramInt1;
                paramInt1 = i1;
              }
              label4107:
              i1 = paramInt2;
              if (paramInt1 == i7)
              {
                i7 = paramInt1;
                paramInt1 = i6;
                i2 = i4;
                localObject1 = paramObject;
                i4 = paramInt3;
                localObject4 = localObject2;
                i6 = i1;
                i1 = i3;
                localObject2 = localObject3;
                break label5510;
              }
              i2 = paramInt3;
              i10 = i6;
              i6 = i4;
              i7 = i3;
              localObject1 = paramObject;
              i4 = i10;
              i3 = paramInt1;
              paramInt1 = i3;
              i3 = i8;
              continue;
              label4189:
              a.a(localObject6);
              n3.a(paramArrayOfByte, i7);
              throw null;
            }
            localObject6 = localObject3;
            i2 = i6;
            i10 = i7;
            i7 = paramInt1;
            if (i12 != 50) {
              break label4410;
            }
            if (i9 == 2)
            {
              localObject1 = s;
              localObject3 = Q(i2);
              localObject2 = ((Unsafe)localObject1).getObject(paramObject, l1);
              paramp3 = (p3)localObject2;
              if (q.g(localObject2))
              {
                paramp3 = q.f(localObject3);
                q.d(paramp3, localObject2);
                ((Unsafe)localObject1).putObject(paramObject, l1, paramp3);
              }
              q.b(localObject3);
              q.h(paramp3);
              paramInt1 = n3.o(paramArrayOfByte, i10, (p3)localObject4);
              paramInt3 = a;
              if ((paramInt3 >= 0) && (paramInt3 <= paramInt2 - paramInt1)) {
                throw null;
              }
              throw k4.f();
            }
            localObject1 = paramObject;
          }
          localObject2 = localObject3;
          i1 = paramInt3;
          i7 = i8;
          i2 = i4;
          i8 = i6;
          i6 = paramInt2;
          i4 = i1;
          i1 = i3;
          break label5510;
          label4410:
          localObject1 = paramObject;
          Object localObject7 = s;
          long l2 = localObject5[(i2 + 2)] & 0xFFFFF;
          switch (i12)
          {
          default: 
          case 68: 
            do
            {
              i1 = i7;
              i7 = i4;
              break;
            } while (i9 != 3);
            localObject4 = q(localObject1, i4, i2);
            paramInt1 = n3.h(localObject4, N(i2), paramArrayOfByte, i10, paramInt2, i7 & 0xFFFFFFF8 | 0x4, paramp3);
            w(localObject1, i4, i2, localObject4);
            i1 = i7;
          case 67: 
            for (i7 = i4;; i7 = i4)
            {
              localObject4 = localObject2;
              break label5462;
              if (i9 != 0) {
                break;
              }
              i7 = n3.p(paramArrayOfByte, i10, (p3)localObject4);
              ((Unsafe)localObject7).putObject(localObject1, l1, Long.valueOf(G3.b(b)));
              ((Unsafe)localObject7).putInt(localObject1, l2, i4);
              i1 = paramInt1;
              paramInt1 = i7;
            }
          case 66: 
          case 63: 
          case 61: 
          case 60: 
            do
            {
              do
              {
                localObject4 = localObject2;
                i7 = i4;
                i1 = paramInt1;
                break;
              } while (i9 != 0);
              i7 = n3.o(paramArrayOfByte, i10, (p3)localObject4);
              localObject4 = Integer.valueOf(G3.e(a));
              for (;;)
              {
                ((Unsafe)localObject7).putObject(localObject1, l1, localObject4);
                ((Unsafe)localObject7).putInt(localObject1, l2, i4);
                break;
                if (i9 != 0) {
                  break label4661;
                }
                i1 = n3.o(paramArrayOfByte, i10, (p3)localObject4);
                i10 = a;
                localObject4 = M(i2);
                if ((localObject4 != null) && (!((g4)localObject4).e(i10)))
                {
                  O(paramObject).e(i7, Long.valueOf(i10));
                  i7 = i1;
                  break;
                }
                localObject4 = Integer.valueOf(i10);
                i7 = i1;
                continue;
                if (i9 != 2) {
                  break label4661;
                }
                i7 = n3.j(paramArrayOfByte, i10, (p3)localObject4);
                localObject4 = c;
              }
              i1 = i4;
            } while (i9 != 2);
            localObject3 = q(localObject1, i1, i2);
            localObject2 = N(i2);
            i4 = i7;
            paramInt1 = n3.i(localObject3, (Z4)localObject2, paramArrayOfByte, i10, paramInt2, paramp3);
            w(localObject1, i1, i2, localObject3);
            i7 = i1;
            i1 = i4;
            break;
          case 59: 
            localObject2 = localObject4;
            i2 = i4;
            i4 = i7;
            localObject4 = localObject2;
            i7 = i2;
            i1 = i4;
            if (i9 == 2)
            {
              paramInt1 = n3.o(paramArrayOfByte, i10, (p3)localObject2);
              i7 = a;
              if (i7 == 0)
              {
                ((Unsafe)localObject7).putObject(localObject1, l1, "");
              }
              else
              {
                if (((i11 & 0x20000000) != 0) && (!E5.f(paramArrayOfByte, paramInt1, paramInt1 + i7))) {
                  throw k4.c();
                }
                ((Unsafe)localObject7).putObject(localObject1, l1, new String(paramArrayOfByte, paramInt1, i7, a4.b));
                paramInt1 += i7;
              }
              ((Unsafe)localObject7).putInt(localObject1, l2, i2);
              localObject4 = localObject2;
              i7 = i2;
              i1 = i4;
            }
            break;
          case 58: 
            localObject3 = localObject4;
            i1 = i4;
            i2 = i7;
            localObject4 = localObject3;
            i7 = i1;
            i1 = i2;
            if (i9 == 0)
            {
              i7 = n3.p(paramArrayOfByte, i10, (p3)localObject3);
              if (b != 0L) {
                bool = true;
              } else {
                bool = false;
              }
              localObject4 = Boolean.valueOf(bool);
              i1 = paramInt1;
              ((Unsafe)localObject7).putObject(localObject1, l1, localObject4);
              ((Unsafe)localObject7).putInt(localObject1, l2, i4);
              paramInt1 = i7;
              localObject4 = localObject2;
              i7 = i4;
            }
            break;
          case 57: 
          case 64: 
            i2 = i4;
            i1 = i7;
            i7 = i2;
            if (i9 == 5)
            {
              localObject4 = Integer.valueOf(n3.n(paramArrayOfByte, i10));
              ((Unsafe)localObject7).putObject(localObject1, l1, localObject4);
              i7 = i8 + 4;
              i1 = paramInt1;
              ((Unsafe)localObject7).putInt(localObject1, l2, i4);
              paramInt1 = i7;
              localObject4 = localObject2;
              i7 = i4;
            }
            break;
          case 56: 
          case 65: 
            i1 = i4;
            i2 = i7;
            i7 = i1;
            i1 = i2;
            if (i9 != 1) {
              break;
            }
          case 55: 
          case 62: 
          case 53: 
          case 54: 
          case 52: 
          case 51: 
            label4661:
            label5192:
            label5209:
            for (localObject4 = Long.valueOf(n3.q(paramArrayOfByte, i10));; localObject4 = Double.valueOf(n3.a(paramArrayOfByte, i10)))
            {
              ((Unsafe)localObject7).putObject(localObject1, l1, localObject4);
              i7 = i8 + 8;
              break label5209;
              localObject3 = localObject4;
              i1 = i4;
              i2 = i7;
              localObject4 = localObject3;
              i7 = i1;
              i1 = i2;
              if (i9 != 0) {
                break label5459;
              }
              i7 = n3.o(paramArrayOfByte, i10, (p3)localObject3);
              localObject4 = Integer.valueOf(a);
              break;
              localObject3 = localObject4;
              i1 = i4;
              i2 = i7;
              localObject4 = localObject3;
              i7 = i1;
              i1 = i2;
              if (i9 != 0) {
                break label5459;
              }
              i7 = n3.p(paramArrayOfByte, i10, (p3)localObject3);
              localObject4 = Long.valueOf(b);
              break;
              i2 = i4;
              i1 = i7;
              i7 = i2;
              if (i9 != 5) {
                break label5459;
              }
              localObject4 = Float.valueOf(n3.l(paramArrayOfByte, i10));
              break label5192;
              i2 = i4;
              i1 = i7;
              i7 = i2;
              if (i9 != 1) {
                break label5459;
              }
            }
          }
          label5459:
          paramInt1 = i8;
          label5462:
          i4 = i6;
          i6 = paramInt2;
          if (paramInt1 != i8) {
            break label5652;
          }
          i9 = paramInt3;
          i10 = paramInt1;
          paramInt1 = i1;
          localObject2 = localObject6;
          i1 = i3;
          i2 = i7;
          i8 = i4;
          i4 = i9;
          i7 = i10;
        }
        label5510:
        if ((paramInt1 == i4) && (i4 != 0))
        {
          paramInt3 = i7;
          i7 = i1;
          paramInt2 = i4;
        }
      }
    }
    for (;;)
    {
      break label5708;
      if (f)
      {
        localObject4 = d;
        if (localObject4 != M3.c) {
          ((M3)localObject4).b(e, i2);
        }
      }
      for (i3 = n3.c(paramInt1, paramArrayOfByte, i7, paramInt2, O(paramObject), paramp3);; i3 = n3.c(paramInt1, paramArrayOfByte, i7, paramInt2, O(paramObject), paramp3))
      {
        localObject4 = paramp3;
        i10 = i4;
        i4 = i2;
        i7 = i1;
        localObject3 = localObject2;
        localObject2 = localObject4;
        i1 = i6;
        i2 = i10;
        i6 = i4;
        i4 = paramInt1;
        break;
      }
      label5652:
      i8 = i1;
      localObject2 = paramp3;
      i1 = i6;
      i6 = i7;
      i7 = i3;
      localObject3 = localObject6;
      i3 = i4;
      i4 = i8;
      break;
      localObject2 = localObject3;
      i6 = i1;
      paramInt2 = i2;
      paramInt3 = paramInt1;
      paramInt1 = i4;
    }
    label5708:
    if (i7 != 1048575) {
      ((Unsafe)localObject2).putInt(localObject1, i7, i5);
    }
    i4 = k;
    paramArrayOfByte = null;
    while (i4 < l)
    {
      paramArrayOfByte = (v5)r(paramObject, j[i4], paramArrayOfByte, o, paramObject);
      i4++;
    }
    if (paramArrayOfByte != null) {
      o.h(localObject1, paramArrayOfByte);
    }
    if (paramInt2 == 0)
    {
      if (paramInt3 != i6) {
        throw k4.e();
      }
    }
    else {
      if ((paramInt3 > i6) || (paramInt1 != paramInt2)) {
        break label5821;
      }
    }
    return paramInt3;
    label5821:
    throw k4.e();
  }
  
  public final Object o(int paramInt1, int paramInt2, Map paramMap, g4 paramg4, Object paramObject1, x5 paramx5, Object paramObject2)
  {
    q.b(Q(paramInt1));
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (!paramg4.e(((Integer)localEntry.getValue()).intValue()))
      {
        paramMap = (Map)paramObject1;
        if (paramObject1 == null) {
          paramMap = paramx5.i(paramObject2);
        }
        paramObject1 = q3.U(A4.a(null, localEntry.getKey(), localEntry.getValue()));
        J3 localJ3 = ((z3)paramObject1).b();
        try
        {
          A4.b(localJ3, null, localEntry.getKey(), localEntry.getValue());
          paramx5.c(paramMap, paramInt2, ((z3)paramObject1).a());
          localIterator.remove();
          paramObject1 = paramMap;
        }
        catch (IOException paramMap)
        {
          throw new RuntimeException(paramMap);
        }
      }
    }
    return paramObject1;
  }
  
  public final Object p(Object paramObject, int paramInt)
  {
    Z4 localZ4 = N(paramInt);
    long l1 = G(paramInt) & 0xFFFFF;
    if (!I(paramObject, paramInt)) {
      return localZ4.a();
    }
    paramObject = s.getObject(paramObject, l1);
    if (T(paramObject)) {
      return paramObject;
    }
    Object localObject = localZ4.a();
    if (paramObject != null) {
      localZ4.d(localObject, paramObject);
    }
    return localObject;
  }
  
  public final Object q(Object paramObject, int paramInt1, int paramInt2)
  {
    Z4 localZ4 = N(paramInt2);
    if (!J(paramObject, paramInt1, paramInt2)) {
      return localZ4.a();
    }
    Object localObject = s.getObject(paramObject, G(paramInt2) & 0xFFFFF);
    if (T(localObject)) {
      return localObject;
    }
    paramObject = localZ4.a();
    if (localObject != null) {
      localZ4.d(paramObject, localObject);
    }
    return paramObject;
  }
  
  public final Object r(Object paramObject1, int paramInt, Object paramObject2, x5 paramx5, Object paramObject3)
  {
    int i1 = a[paramInt];
    Object localObject = D5.B(paramObject1, G(paramInt) & 0xFFFFF);
    if (localObject == null) {
      return paramObject2;
    }
    paramObject1 = M(paramInt);
    if (paramObject1 == null) {
      return paramObject2;
    }
    return o(paramInt, i1, q.h(localObject), (g4)paramObject1, paramObject2, paramx5, paramObject3);
  }
  
  public final void v(T5 paramT5, int paramInt1, Object paramObject, int paramInt2)
  {
    if (paramObject != null)
    {
      q.b(Q(paramInt2));
      paramT5.o(paramInt1, null, q.c(paramObject));
    }
  }
  
  public final void w(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2)
  {
    s.putObject(paramObject1, G(paramInt2) & 0xFFFFF, paramObject2);
    E(paramObject1, paramInt1, paramInt2);
  }
  
  public final void x(Object paramObject1, int paramInt, Object paramObject2)
  {
    s.putObject(paramObject1, G(paramInt) & 0xFFFFF, paramObject2);
    D(paramObject1, paramInt);
  }
  
  public final void y(Object paramObject1, Object paramObject2, int paramInt)
  {
    if (!I(paramObject2, paramInt)) {
      return;
    }
    long l1 = G(paramInt) & 0xFFFFF;
    Unsafe localUnsafe = s;
    Object localObject1 = localUnsafe.getObject(paramObject2, l1);
    if (localObject1 != null)
    {
      Z4 localZ4 = N(paramInt);
      if (!I(paramObject1, paramInt))
      {
        if (!T(localObject1))
        {
          localUnsafe.putObject(paramObject1, l1, localObject1);
        }
        else
        {
          paramObject2 = localZ4.a();
          localZ4.d(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l1, paramObject2);
        }
        D(paramObject1, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l1);
      paramObject2 = localObject2;
      if (!T(localObject2))
      {
        paramObject2 = localZ4.a();
        localZ4.d(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l1, paramObject2);
      }
      localZ4.d(paramObject2, localObject1);
      return;
    }
    paramInt = a[paramInt];
    paramObject1 = String.valueOf(paramObject2);
    paramObject2 = new StringBuilder("Source subfield ");
    ((StringBuilder)paramObject2).append(paramInt);
    ((StringBuilder)paramObject2).append(" is present but null: ");
    ((StringBuilder)paramObject2).append((String)paramObject1);
    throw new IllegalStateException(((StringBuilder)paramObject2).toString());
  }
  
  public final boolean z(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 == 1048575) {
      return I(paramObject, paramInt1);
    }
    return (paramInt3 & paramInt4) != 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.M4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

public final class S
  implements e0
{
  public static final int[] r = new int[0];
  public static final Unsafe s = o0.D();
  public final int[] a;
  public final Object[] b;
  public final int c;
  public final int d;
  public final O e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  public final int[] j;
  public final int k;
  public final int l;
  public final U m;
  public final E n;
  public final k0 o;
  public final q p;
  public final J q;
  
  public S(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, O paramO, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt2, int paramInt3, int paramInt4, U paramU, E paramE, k0 paramk0, q paramq, J paramJ)
  {
    a = paramArrayOfInt1;
    b = paramArrayOfObject;
    c = paramInt1;
    d = paramInt2;
    g = (paramO instanceof x);
    h = paramBoolean1;
    if ((paramq != null) && (paramq.e(paramO))) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    f = paramBoolean1;
    i = paramBoolean2;
    j = paramArrayOfInt2;
    k = paramInt3;
    l = paramInt4;
    m = paramU;
    n = paramE;
    o = paramk0;
    p = paramq;
    e = paramO;
    q = paramJ;
  }
  
  public static boolean A(int paramInt)
  {
    boolean bool;
    if ((paramInt & 0x20000000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean D(Object paramObject, int paramInt, e0 parame0)
  {
    return parame0.c(o0.C(paramObject, X(paramInt)));
  }
  
  public static boolean G(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramObject instanceof x)) {
      return ((x)paramObject).D();
    }
    return true;
  }
  
  public static boolean J(int paramInt)
  {
    boolean bool;
    if ((paramInt & 0x10000000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static List K(Object paramObject, long paramLong)
  {
    return (List)o0.C(paramObject, paramLong);
  }
  
  public static long L(Object paramObject, long paramLong)
  {
    return o0.A(paramObject, paramLong);
  }
  
  public static S T(Class paramClass, M paramM, U paramU, E paramE, k0 paramk0, q paramq, J paramJ)
  {
    if ((paramM instanceof c0)) {
      return V((c0)paramM, paramU, paramE, paramk0, paramq, paramJ);
    }
    a.a(paramM);
    return U(null, paramU, paramE, paramk0, paramq, paramJ);
  }
  
  public static S U(h0 paramh0, U paramU, E paramE, k0 paramk0, q paramq, J paramJ)
  {
    throw null;
  }
  
  public static S V(c0 paramc0, U paramU, E paramE, k0 paramk0, q paramq, J paramJ)
  {
    boolean bool;
    if (paramc0.b() == Z.p) {
      bool = true;
    } else {
      bool = false;
    }
    String str = paramc0.e();
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
    int i3 = i4 + 1;
    int i5 = str.charAt(i4);
    int i2 = i3;
    i4 = i5;
    if (i5 >= 55296)
    {
      i2 = i5 & 0x1FFF;
      i4 = 13;
      for (i5 = i3;; i5 = i3)
      {
        i3 = i5 + 1;
        i5 = str.charAt(i5);
        if (i5 < 55296) {
          break;
        }
        i2 |= (i5 & 0x1FFF) << i4;
        i4 += 13;
      }
      i4 = i2 | i5 << i4;
      i2 = i3;
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
      i3 = i7;
      i4 = i3;
      i8 = i4;
      i9 = i8;
      i10 = i3;
    }
    else
    {
      i4 = i2 + 1;
      i5 = str.charAt(i2);
      i3 = i5;
      i2 = i4;
      if (i5 >= 55296)
      {
        i2 = i5 & 0x1FFF;
        i3 = 13;
        for (i5 = i4;; i5 = i4)
        {
          i4 = i5 + 1;
          i5 = str.charAt(i5);
          if (i5 < 55296) {
            break;
          }
          i2 |= (i5 & 0x1FFF) << i3;
          i3 += 13;
        }
        i3 = i2 | i5 << i3;
        i2 = i4;
      }
      i4 = i2 + 1;
      i5 = str.charAt(i2);
      i8 = i5;
      i2 = i4;
      if (i5 >= 55296)
      {
        i5 &= 0x1FFF;
        i2 = 13;
        for (i7 = i4;; i7 = i4)
        {
          i4 = i7 + 1;
          i7 = str.charAt(i7);
          if (i7 < 55296) {
            break;
          }
          i5 |= (i7 & 0x1FFF) << i2;
          i2 += 13;
        }
        i8 = i5 | i7 << i2;
        i2 = i4;
      }
      i4 = i2 + 1;
      i7 = str.charAt(i2);
      i2 = i7;
      i5 = i4;
      if (i7 >= 55296)
      {
        i5 = i7 & 0x1FFF;
        i2 = 13;
        for (i7 = i4;; i7 = i4)
        {
          i4 = i7 + 1;
          i7 = str.charAt(i7);
          if (i7 < 55296) {
            break;
          }
          i5 |= (i7 & 0x1FFF) << i2;
          i2 += 13;
        }
        i2 = i5 | i7 << i2;
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
      i10 = i7 + 1;
      i4 = str.charAt(i7);
      i7 = i4;
      i6 = i10;
      if (i4 >= 55296)
      {
        i7 = i4 & 0x1FFF;
        i4 = 13;
        i6 = i10;
        i10 = i7;
        for (;;)
        {
          i7 = i6 + 1;
          i6 = str.charAt(i6);
          if (i6 < 55296) {
            break;
          }
          i10 |= (i6 & 0x1FFF) << i4;
          i4 += 13;
          i6 = i7;
        }
        i4 = i10 | i6 << i4;
        i6 = i7;
        i7 = i4;
      }
      i4 = i6 + 1;
      i6 = str.charAt(i6);
      i10 = i6;
      i11 = i4;
      if (i6 >= 55296)
      {
        i6 &= 0x1FFF;
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
        i11 = i4;
      }
      i6 = i11 + 1;
      i9 = str.charAt(i11);
      i11 = i9;
      i4 = i6;
      if (i9 >= 55296)
      {
        i11 = i9 & 0x1FFF;
        i4 = 13;
        for (i9 = i6;; i9 = i6)
        {
          i6 = i9 + 1;
          i9 = str.charAt(i9);
          if (i9 < 55296) {
            break;
          }
          i11 |= (i9 & 0x1FFF) << i4;
          i4 += 13;
        }
        i11 |= i9 << i4;
        i4 = i6;
      }
      i9 = i4 + 1;
      i12 = str.charAt(i4);
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
      i8 = i3 * 2 + i8;
      i11 = i6;
      i6 = i5;
      i5 = i2;
      i9 = i3;
      i2 = i11;
    }
    Unsafe localUnsafe = s;
    Object[] arrayOfObject1 = paramc0.d();
    Class localClass = paramc0.c().getClass();
    int[] arrayOfInt2 = new int[i7 * 3];
    Object[] arrayOfObject2 = new Object[i7 * 2];
    int i13 = i4 + i10;
    i3 = i4;
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
      if (i2 >= i4) {
        break;
      }
      i8 = i2 + 1;
      i11 = str.charAt(i2);
      if (i11 >= 55296)
      {
        i6 = i11 & 0x1FFF;
        i2 = 13;
        for (;;)
        {
          i5 = i8 + 1;
          i8 = str.charAt(i8);
          if (i8 < 55296) {
            break;
          }
          i6 |= (i8 & 0x1FFF) << i2;
          i2 += 13;
          i8 = i5;
        }
        i11 = i6 | i8 << i2;
      }
      else
      {
        i5 = i8;
      }
      i2 = i5 + 1;
      i1 = str.charAt(i5);
      if (i1 >= 55296)
      {
        i6 = i1 & 0x1FFF;
        i5 = 13;
        for (;;)
        {
          i8 = i2 + 1;
          i1 = str.charAt(i2);
          i2 = i4;
          if (i1 < 55296) {
            break;
          }
          i6 |= (i1 & 0x1FFF) << i5;
          i5 += 13;
          i4 = i2;
          i2 = i8;
        }
        i1 = i6 | i1 << i5;
        i6 = i8;
      }
      else
      {
        i6 = i2;
        i2 = i4;
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
          i6 = i8 & 0x1FFF;
          i4 = 13;
          for (i8 = i10;; i8 = i10)
          {
            i10 = i8 + 1;
            i8 = str.charAt(i8);
            if (i8 < 55296) {
              break;
            }
            i6 |= (i8 & 0x1FFF) << i4;
            i4 += 13;
          }
          i6 |= i8 << i4;
          i4 = i10;
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
          localObject = p0(localClass, (String)localObject);
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
          localObject = p0(localClass, (String)localObject);
          arrayOfObject1[i7] = localObject;
        }
        i20 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        i21 = 0;
        i7 = i10;
        i22 = i3;
        i23 = i14;
      }
      else
      {
        i8 = i7 + 1;
        localObject = p0(localClass, (String)arrayOfObject1[i7]);
        if ((i18 == 9) || (i18 != 17)) {
          if ((i18 == 27) || (i18 != 49)) {
            if ((i18 != 12) && (i18 != 30) && (i18 != 44))
            {
              i10 = i8;
              i4 = i3;
              if (i18 == 50)
              {
                i4 = i3 + 1;
                arrayOfInt1[i3] = i17;
                i24 = i17 / 3 * 2;
                i10 = i7 + 2;
                arrayOfObject2[i24] = arrayOfObject1[i8];
                if ((i1 & 0x800) != 0)
                {
                  i3 = i7 + 3;
                  arrayOfObject2[(i24 + 1)] = arrayOfObject1[i10];
                  i10 = i3;
                }
              }
              else
              {
                i3 = i4;
              }
            }
          }
        }
        for (;;)
        {
          i4 = i10;
          break label2104;
          i3 = i4;
          i4 = i10;
          break label2104;
          i10 = i8;
          i4 = i3;
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
          i10 = i8;
        }
        label2104:
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
              i6 = i10 + 1;
              i10 = str.charAt(i10);
              if (i10 < 55296) {
                break;
              }
              i7 |= (i10 & 0x1FFF) << i4;
              i4 += 13;
              i10 = i6;
            }
            i4 = i7 | i10 << i4;
          }
          else
          {
            i6 = i7;
          }
          i7 = i9 * 2 + i4 / 32;
          localObject = arrayOfObject1[i7];
          if ((localObject instanceof Field)) {
            localObject = (Field)localObject;
          }
          for (;;)
          {
            break;
            localObject = p0(localClass, (String)localObject);
            arrayOfObject1[i7] = localObject;
          }
          i8 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i10 = i4 % 32;
        }
        else
        {
          i8 = 1048575;
          i10 = 0;
        }
        i21 = i10;
        i19 = i25;
        i20 = i8;
        i7 = i24;
        i22 = i3;
        i23 = i14;
        i4 = i6;
        if (i18 >= 18)
        {
          i21 = i10;
          i19 = i25;
          i20 = i8;
          i7 = i24;
          i22 = i3;
          i23 = i14;
          i4 = i6;
          if (i18 <= 49)
          {
            arrayOfInt1[i14] = i25;
            i23 = i14 + 1;
            i4 = i6;
            i22 = i3;
            i7 = i24;
            i20 = i8;
            i19 = i25;
            i21 = i10;
          }
        }
      }
      arrayOfInt2[i17] = i11;
      if ((i1 & 0x200) != 0) {
        i3 = 536870912;
      } else {
        i3 = 0;
      }
      if ((i1 & 0x100) != 0) {
        i10 = 268435456;
      } else {
        i10 = 0;
      }
      arrayOfInt2[(i17 + 1)] = (i10 | i3 | i18 << 20 | i19);
      i11 = i17 + 3;
      arrayOfInt2[(i17 + 2)] = (i21 << 20 | i20);
      i3 = i4;
      i4 = i2;
      i2 = i3;
      i10 = i5;
      i3 = i22;
      i14 = i23;
    }
    return new S(arrayOfInt2, arrayOfObject2, i16, i12, paramc0.c(), bool, false, arrayOfInt1, i15, i13, paramU, paramE, paramk0, paramq, paramJ);
  }
  
  public static long X(int paramInt)
  {
    return paramInt & 0xFFFFF;
  }
  
  public static boolean Y(Object paramObject, long paramLong)
  {
    return ((Boolean)o0.C(paramObject, paramLong)).booleanValue();
  }
  
  public static double Z(Object paramObject, long paramLong)
  {
    return ((Double)o0.C(paramObject, paramLong)).doubleValue();
  }
  
  public static float a0(Object paramObject, long paramLong)
  {
    return ((Float)o0.C(paramObject, paramLong)).floatValue();
  }
  
  public static int b0(Object paramObject, long paramLong)
  {
    return ((Integer)o0.C(paramObject, paramLong)).intValue();
  }
  
  public static long c0(Object paramObject, long paramLong)
  {
    return ((Long)o0.C(paramObject, paramLong)).longValue();
  }
  
  public static boolean l(Object paramObject, long paramLong)
  {
    return o0.r(paramObject, paramLong);
  }
  
  public static void m(Object paramObject)
  {
    if (G(paramObject)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Mutating immutable message: ");
    localStringBuilder.append(paramObject);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static double o(Object paramObject, long paramLong)
  {
    return o0.x(paramObject, paramLong);
  }
  
  public static Field p0(Class paramClass, String paramString)
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
  
  public static float r(Object paramObject, long paramLong)
  {
    return o0.y(paramObject, paramLong);
  }
  
  public static l0 v(Object paramObject)
  {
    x localx = (x)paramObject;
    l0 locall0 = unknownFields;
    paramObject = locall0;
    if (locall0 == l0.c())
    {
      paramObject = l0.k();
      unknownFields = ((l0)paramObject);
    }
    return (l0)paramObject;
  }
  
  public static int v0(int paramInt)
  {
    return (paramInt & 0xFF00000) >>> 20;
  }
  
  public static int z(Object paramObject, long paramLong)
  {
    return o0.z(paramObject, paramLong);
  }
  
  public final void A0(r0 paramr0, int paramInt1, Object paramObject, int paramInt2)
  {
    if (paramObject != null)
    {
      q.d(t(paramInt2));
      paramr0.N(paramInt1, null, q.e(paramObject));
    }
  }
  
  public final boolean B(Object paramObject, int paramInt)
  {
    int i1 = k0(paramInt);
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
      paramInt = w0(paramInt);
      l1 = X(paramInt);
      switch (v0(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        if (o0.C(paramObject, l1) != null) {
          bool16 = true;
        }
        return bool16;
      case 16: 
        bool16 = bool1;
        if (o0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 15: 
        bool16 = bool2;
        if (o0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 14: 
        bool16 = bool3;
        if (o0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 13: 
        bool16 = bool4;
        if (o0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 12: 
        bool16 = bool5;
        if (o0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 11: 
        bool16 = bool6;
        if (o0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 10: 
        return h.p.equals(o0.C(paramObject, l1)) ^ true;
      case 9: 
        bool16 = bool7;
        if (o0.C(paramObject, l1) != null) {
          bool16 = true;
        }
        return bool16;
      case 8: 
        paramObject = o0.C(paramObject, l1);
        if ((paramObject instanceof String)) {
          return ((String)paramObject).isEmpty() ^ true;
        }
        if ((paramObject instanceof h)) {
          return h.p.equals(paramObject) ^ true;
        }
        throw new IllegalArgumentException();
      case 7: 
        return o0.r(paramObject, l1);
      case 6: 
        bool16 = bool8;
        if (o0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 5: 
        bool16 = bool9;
        if (o0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 4: 
        bool16 = bool10;
        if (o0.z(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 3: 
        bool16 = bool11;
        if (o0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 2: 
        bool16 = bool12;
        if (o0.A(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 1: 
        bool16 = bool13;
        if (Float.floatToRawIntBits(o0.y(paramObject, l1)) != 0) {
          bool16 = true;
        }
        return bool16;
      }
      bool16 = bool14;
      if (Double.doubleToRawLongBits(o0.x(paramObject, l1)) != 0L) {
        bool16 = true;
      }
      return bool16;
    }
    bool16 = bool15;
    if ((o0.z(paramObject, l1) & 1 << (i1 >>> 20)) != 0) {
      bool16 = true;
    }
    return bool16;
  }
  
  public final void B0(int paramInt, Object paramObject, r0 paramr0)
  {
    if ((paramObject instanceof String)) {
      paramr0.A(paramInt, (String)paramObject);
    } else {
      paramr0.M(paramInt, (h)paramObject);
    }
  }
  
  public final boolean C(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 == 1048575) {
      return B(paramObject, paramInt1);
    }
    boolean bool;
    if ((paramInt3 & paramInt4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void C0(k0 paramk0, Object paramObject, r0 paramr0)
  {
    paramk0.t(paramk0.g(paramObject), paramr0);
  }
  
  public final boolean E(Object paramObject, int paramInt1, int paramInt2)
  {
    List localList = (List)o0.C(paramObject, X(paramInt1));
    if (localList.isEmpty()) {
      return true;
    }
    paramObject = u(paramInt2);
    for (paramInt1 = 0; paramInt1 < localList.size(); paramInt1++) {
      if (!((e0)paramObject).c(localList.get(paramInt1))) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean F(Object paramObject, int paramInt1, int paramInt2)
  {
    if (q.e(o0.C(paramObject, X(paramInt1))).isEmpty()) {
      return true;
    }
    paramObject = t(paramInt2);
    q.d(paramObject);
    throw null;
  }
  
  public final boolean H(Object paramObject1, Object paramObject2, int paramInt)
  {
    long l1 = k0(paramInt) & 0xFFFFF;
    boolean bool;
    if (o0.z(paramObject1, l1) == o0.z(paramObject2, l1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean I(Object paramObject, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (o0.z(paramObject, k0(paramInt2) & 0xFFFFF) == paramInt1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void M(k0 paramk0, q paramq, Object paramObject, d0 paramd0, p paramp)
  {
    Object localObject1 = null;
    for (;;)
    {
      Object localObject3 = localObject1;
      try
      {
        i1 = paramd0.p();
        localObject3 = localObject1;
        i2 = i0(i1);
        if (i2 < 0)
        {
          if (i1 == Integer.MAX_VALUE)
          {
            i2 = k;
            paramq = (q)localObject1;
            while (i2 < l)
            {
              paramq = q(paramObject, j[i2], paramq, paramk0, paramObject);
              i2++;
            }
            if (paramq != null) {
              paramk0.o(paramObject, paramq);
            }
            return;
          }
          localObject3 = localObject1;
          if (!f)
          {
            localObject4 = null;
          }
          else
          {
            localObject3 = localObject1;
            localObject4 = paramq.b(paramp, e, i1);
          }
          if (localObject4 != null)
          {
            localObject3 = localObject1;
            localObject1 = paramq.g(paramObject, paramd0, localObject4, paramp, paramq.d(paramObject), localObject1, paramk0);
            continue;
          }
        }
      }
      finally
      {
        int i1;
        break label3286;
        localObject3 = localObject1;
        if (paramk0.q(paramd0))
        {
          localObject3 = localObject1;
          localObject5 = localObject1;
          if (!paramd0.y()) {
            break label248;
          }
          continue;
        }
        Object localObject4 = localObject1;
        if (localObject1 == null)
        {
          localObject3 = localObject1;
          localObject4 = paramk0.f(paramObject);
        }
        localObject3 = localObject4;
        boolean bool = paramk0.m(localObject4, paramd0);
        Object localObject5 = localObject4;
        if (bool)
        {
          localObject1 = localObject4;
          continue;
        }
        label248:
        int i2 = k;
        paramq = (q)localObject5;
        while (i2 < l)
        {
          paramq = q(paramObject, j[i2], paramq, paramk0, paramObject);
          i2++;
        }
        if (paramq != null) {
          paramk0.o(paramObject, paramq);
        }
        return;
        localObject3 = localObject1;
        int i3 = w0(i2);
        localObject3 = localObject1;
        localObject4 = localObject1;
        try
        {
          switch (v0(i3))
          {
          default: 
            localObject5 = localObject1;
            if (localObject1 == null)
            {
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = paramk0.f(paramObject);
            }
            localObject3 = localObject5;
            localObject4 = localObject5;
            bool = paramk0.m(localObject5, paramd0);
            localObject1 = localObject5;
            if (bool) {
              continue;
            }
            for (i2 = k; i2 < l; i2++) {
              localObject5 = q(paramObject, j[i2], localObject5, paramk0, paramObject);
            }
            if (localObject5 != null) {
              paramk0.o(paramObject, localObject5);
            }
            return;
          case 68: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = (O)S(paramObject, i1, i2);
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.L(localObject5, u(i2), paramp);
            localObject3 = localObject1;
            localObject4 = localObject1;
            u0(paramObject, i1, i2, localObject5);
            break;
          case 67: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            o0.R(paramObject, X(i3), Long.valueOf(paramd0.j()));
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
            for (;;)
            {
              localObject3 = localObject1;
              localObject4 = localObject1;
              r0(paramObject, i1, i2);
              break;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Integer.valueOf(paramd0.h()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Long.valueOf(paramd0.r()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Integer.valueOf(paramd0.z()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              int i4 = paramd0.b();
              localObject3 = localObject1;
              localObject4 = localObject1;
              s(i2);
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Integer.valueOf(i4));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Integer.valueOf(paramd0.w()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), paramd0.u());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = (O)S(paramObject, i1, i2);
              localObject3 = localObject1;
              localObject4 = localObject1;
              paramd0.J(localObject5, u(i2), paramp);
              break label766;
              localObject3 = localObject1;
              localObject4 = localObject1;
              n0(paramObject, i3, paramd0);
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Boolean.valueOf(paramd0.o()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Integer.valueOf(paramd0.n()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Long.valueOf(paramd0.f()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Integer.valueOf(paramd0.x()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Long.valueOf(paramd0.c()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Long.valueOf(paramd0.E()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Float.valueOf(paramd0.readFloat()));
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), Double.valueOf(paramd0.readDouble()));
            }
          case 50: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            N(paramObject, i2, t(i2), paramp, paramd0);
            break;
          case 49: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            l0(paramObject, X(i3), paramd0, u(i2), paramp);
            break;
          case 48: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.i((List)localObject5);
            break;
          case 47: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.a((List)localObject5);
            break;
          case 46: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.D((List)localObject5);
            break;
          case 45: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.g((List)localObject5);
            break;
          case 44: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.I((List)localObject5);
            localObject3 = localObject1;
            localObject4 = localObject1;
            s(i2);
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject1 = g0.z(paramObject, i1, (List)localObject5, null, localObject1, paramk0);
            break;
          case 43: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.k((List)localObject5);
            break;
          case 42: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.l((List)localObject5);
            break;
          case 41: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.d((List)localObject5);
            break;
          case 40: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.G((List)localObject5);
            break;
          case 39: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.H((List)localObject5);
            break;
          case 38: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.s((List)localObject5);
            break;
          case 37: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.C((List)localObject5);
            break;
          case 36: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = n.e(paramObject, X(i3));
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.v((List)localObject5);
            break;
          case 35: 
            localObject3 = localObject1;
            localObject4 = localObject1;
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
            for (localObject5 = n.e(paramObject, X(i3));; localObject5 = n.e(paramObject, X(i3)))
            {
              localObject3 = localObject1;
              localObject4 = localObject1;
              paramd0.B((List)localObject5);
              break;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1431;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1474;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1517;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1560;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              localObject3 = localObject1;
              localObject4 = localObject1;
              paramd0.I((List)localObject5);
              localObject3 = localObject1;
              localObject4 = localObject1;
              s(i2);
              break label1635;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1683;
              localObject3 = localObject1;
              localObject4 = localObject1;
              paramd0.A(n.e(paramObject, X(i3)));
              break;
              localObject3 = localObject1;
              localObject4 = localObject1;
              m0(paramObject, i3, paramd0, u(i2), paramp);
              break;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0(paramObject, i3, paramd0);
              break;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1726;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1769;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1812;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1855;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1898;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1941;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = n.e(paramObject, X(i3));
              break label1984;
              localObject3 = localObject1;
              localObject4 = localObject1;
            }
          case 17: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = (O)R(paramObject, i2);
            localObject3 = localObject1;
            localObject4 = localObject1;
            paramd0.L(localObject5, u(i2), paramp);
            localObject3 = localObject1;
            localObject4 = localObject1;
            t0(paramObject, i2, localObject5);
            break;
          case 16: 
            localObject3 = localObject1;
            localObject4 = localObject1;
            o0.Q(paramObject, X(i3), paramd0.j());
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
            for (;;)
            {
              label766:
              label1431:
              label1474:
              label1517:
              label1560:
              label1635:
              label1683:
              label1726:
              label1769:
              label1812:
              label1855:
              label1898:
              label1941:
              label1984:
              label2567:
              localObject3 = localObject1;
              localObject4 = localObject1;
              q0(paramObject, i2);
              break;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.P(paramObject, X(i3), paramd0.h());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.Q(paramObject, X(i3), paramd0.r());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.P(paramObject, X(i3), paramd0.z());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              i1 = paramd0.b();
              localObject3 = localObject1;
              localObject4 = localObject1;
              s(i2);
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.P(paramObject, X(i3), i1);
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.P(paramObject, X(i3), paramd0.w());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.R(paramObject, X(i3), paramd0.u());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = (O)R(paramObject, i2);
              localObject3 = localObject1;
              localObject4 = localObject1;
              paramd0.J(localObject5, u(i2), paramp);
              break label2567;
              localObject3 = localObject1;
              localObject4 = localObject1;
              n0(paramObject, i3, paramd0);
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.H(paramObject, X(i3), paramd0.o());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.P(paramObject, X(i3), paramd0.n());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.Q(paramObject, X(i3), paramd0.f());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.P(paramObject, X(i3), paramd0.x());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.Q(paramObject, X(i3), paramd0.c());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.Q(paramObject, X(i3), paramd0.E());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.O(paramObject, X(i3), paramd0.readFloat());
              continue;
              localObject3 = localObject1;
              localObject4 = localObject1;
              o0.N(paramObject, X(i3), paramd0.readDouble());
            }
          }
        }
        catch (A.a locala)
        {
          localObject3 = localObject4;
          if (paramk0.q(paramd0))
          {
            localObject3 = localObject4;
            bool = paramd0.y();
            localObject2 = localObject4;
            if (bool) {
              continue;
            }
            for (i2 = k; i2 < l; i2++) {
              localObject4 = q(paramObject, j[i2], localObject4, paramk0, paramObject);
            }
            if (localObject4 != null) {
              paramk0.o(paramObject, localObject4);
            }
            return;
          }
          localObject5 = localObject4;
          if (localObject4 == null)
          {
            localObject3 = localObject4;
            localObject5 = paramk0.f(paramObject);
          }
          localObject3 = localObject5;
          bool = paramk0.m(localObject5, paramd0);
          Object localObject2 = localObject5;
        }
        if (bool) {
          continue;
        }
        for (i2 = k; i2 < l; i2++) {
          localObject5 = q(paramObject, j[i2], localObject5, paramk0, paramObject);
        }
        if (localObject5 != null) {
          paramk0.o(paramObject, localObject5);
        }
        return;
        label3286:
        for (i2 = k; i2 < l; i2++) {
          localObject3 = q(paramObject, j[i2], localObject3, paramk0, paramObject);
        }
        if (localObject3 != null) {
          paramk0.o(paramObject, localObject3);
        }
      }
    }
  }
  
  public final void N(Object paramObject1, int paramInt, Object paramObject2, p paramp, d0 paramd0)
  {
    long l1 = X(w0(paramInt));
    Object localObject1 = o0.C(paramObject1, l1);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = q.f(paramObject2);
      o0.R(paramObject1, l1, localObject2);
    }
    else
    {
      localObject2 = localObject1;
      if (q.g(localObject1))
      {
        localObject2 = q.f(paramObject2);
        q.a(localObject2, localObject1);
        o0.R(paramObject1, l1, localObject2);
      }
    }
    paramObject1 = q.h(localObject2);
    q.d(paramObject2);
    paramd0.M((Map)paramObject1, null, paramp);
  }
  
  public final void O(Object paramObject1, Object paramObject2, int paramInt)
  {
    if (!B(paramObject2, paramInt)) {
      return;
    }
    long l1 = X(w0(paramInt));
    Unsafe localUnsafe = s;
    Object localObject1 = localUnsafe.getObject(paramObject2, l1);
    if (localObject1 != null)
    {
      e0 locale0 = u(paramInt);
      if (!B(paramObject1, paramInt))
      {
        if (!G(localObject1))
        {
          localUnsafe.putObject(paramObject1, l1, localObject1);
        }
        else
        {
          paramObject2 = locale0.f();
          locale0.a(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l1, paramObject2);
        }
        q0(paramObject1, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l1);
      paramObject2 = localObject2;
      if (!G(localObject2))
      {
        paramObject2 = locale0.f();
        locale0.a(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l1, paramObject2);
      }
      locale0.a(paramObject2, localObject1);
      return;
    }
    paramObject1 = new StringBuilder();
    ((StringBuilder)paramObject1).append("Source subfield ");
    ((StringBuilder)paramObject1).append(W(paramInt));
    ((StringBuilder)paramObject1).append(" is present but null: ");
    ((StringBuilder)paramObject1).append(paramObject2);
    throw new IllegalStateException(((StringBuilder)paramObject1).toString());
  }
  
  public final void P(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = W(paramInt);
    if (!I(paramObject2, i1, paramInt)) {
      return;
    }
    long l1 = X(w0(paramInt));
    Unsafe localUnsafe = s;
    Object localObject1 = localUnsafe.getObject(paramObject2, l1);
    if (localObject1 != null)
    {
      e0 locale0 = u(paramInt);
      if (!I(paramObject1, i1, paramInt))
      {
        if (!G(localObject1))
        {
          localUnsafe.putObject(paramObject1, l1, localObject1);
        }
        else
        {
          paramObject2 = locale0.f();
          locale0.a(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l1, paramObject2);
        }
        r0(paramObject1, i1, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l1);
      paramObject2 = localObject2;
      if (!G(localObject2))
      {
        paramObject2 = locale0.f();
        locale0.a(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l1, paramObject2);
      }
      locale0.a(paramObject2, localObject1);
      return;
    }
    paramObject1 = new StringBuilder();
    ((StringBuilder)paramObject1).append("Source subfield ");
    ((StringBuilder)paramObject1).append(W(paramInt));
    ((StringBuilder)paramObject1).append(" is present but null: ");
    ((StringBuilder)paramObject1).append(paramObject2);
    throw new IllegalStateException(((StringBuilder)paramObject1).toString());
  }
  
  public final void Q(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = w0(paramInt);
    long l1 = X(i1);
    int i2 = W(paramInt);
    switch (v0(i1))
    {
    default: 
      break;
    case 60: 
    case 68: 
      P(paramObject1, paramObject2, paramInt);
      break;
    case 61: 
    case 62: 
    case 63: 
    case 64: 
    case 65: 
    case 66: 
    case 67: 
      if (!I(paramObject2, i2, paramInt)) {
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
        o0.R(paramObject1, l1, o0.C(paramObject2, l1));
        r0(paramObject1, i2, paramInt);
        break;
        if (!I(paramObject2, i2, paramInt)) {
          break;
        }
      }
    case 50: 
      g0.E(q, paramObject1, paramObject2, l1);
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
      O(paramObject1, paramObject2, paramInt);
      break;
    case 16: 
      if (B(paramObject2, paramInt)) {
        o0.Q(paramObject1, l1, o0.A(paramObject2, l1));
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
        q0(paramObject1, paramInt);
        return;
        if (!B(paramObject2, paramInt)) {
          return;
        }
        for (;;)
        {
          o0.P(paramObject1, l1, o0.z(paramObject2, l1));
          break label436;
          if (!B(paramObject2, paramInt)) {
            return;
          }
          break;
          if (!B(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!B(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!B(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!B(paramObject2, paramInt)) {
            return;
          }
          for (;;)
          {
            o0.R(paramObject1, l1, o0.C(paramObject2, l1));
            break;
            if (!B(paramObject2, paramInt)) {
              return;
            }
          }
          if (!B(paramObject2, paramInt)) {
            return;
          }
          o0.H(paramObject1, l1, o0.r(paramObject2, l1));
          break label436;
          if (!B(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!B(paramObject2, paramInt)) {
            return;
          }
          break;
          if (!B(paramObject2, paramInt)) {
            return;
          }
        }
        if (!B(paramObject2, paramInt)) {
          return;
        }
        break;
        if (!B(paramObject2, paramInt)) {
          return;
        }
        break;
        if (!B(paramObject2, paramInt)) {
          return;
        }
        o0.O(paramObject1, l1, o0.y(paramObject2, l1));
        continue;
        if (!B(paramObject2, paramInt)) {
          return;
        }
        o0.N(paramObject1, l1, o0.x(paramObject2, l1));
      }
    }
  }
  
  public final Object R(Object paramObject, int paramInt)
  {
    e0 locale0 = u(paramInt);
    long l1 = X(w0(paramInt));
    if (!B(paramObject, paramInt)) {
      return locale0.f();
    }
    paramObject = s.getObject(paramObject, l1);
    if (G(paramObject)) {
      return paramObject;
    }
    Object localObject = locale0.f();
    if (paramObject != null) {
      locale0.a(localObject, paramObject);
    }
    return localObject;
  }
  
  public final Object S(Object paramObject, int paramInt1, int paramInt2)
  {
    e0 locale0 = u(paramInt2);
    if (!I(paramObject, paramInt1, paramInt2)) {
      return locale0.f();
    }
    paramObject = s.getObject(paramObject, X(w0(paramInt2)));
    if (G(paramObject)) {
      return paramObject;
    }
    Object localObject = locale0.f();
    if (paramObject != null) {
      locale0.a(localObject, paramObject);
    }
    return localObject;
  }
  
  public final int W(int paramInt)
  {
    return a[paramInt];
  }
  
  public void a(Object paramObject1, Object paramObject2)
  {
    m(paramObject1);
    paramObject2.getClass();
    for (int i1 = 0; i1 < a.length; i1 += 3) {
      Q(paramObject1, paramObject2, i1);
    }
    g0.F(o, paramObject1, paramObject2);
    if (f) {
      g0.D(p, paramObject1, paramObject2);
    }
  }
  
  public void b(Object paramObject)
  {
    if (!G(paramObject)) {
      return;
    }
    Object localObject;
    if ((paramObject instanceof x))
    {
      localObject = (x)paramObject;
      ((x)localObject).n();
      ((x)localObject).m();
      ((x)localObject).F();
    }
    int i1 = a.length;
    for (int i2 = 0; i2 < i1; i2 += 3)
    {
      int i3 = w0(i2);
      long l1 = X(i3);
      i3 = v0(i3);
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
      } else if (B(paramObject, i2)) {
        u(i2).b(s.getObject(paramObject, l1));
      }
    }
    o.j(paramObject);
    if (f) {
      p.f(paramObject);
    }
  }
  
  public final boolean c(Object paramObject)
  {
    int i1 = 1048575;
    int i2 = 0;
    for (int i3 = i2; i3 < k; i3++)
    {
      int i4 = j[i3];
      int i5 = W(i4);
      int i6 = w0(i4);
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
      if ((J(i6)) && (!C(paramObject, i4, i1, i2, i7))) {
        return false;
      }
      i8 = v0(i6);
      if ((i8 != 9) && (i8 != 17))
      {
        if (i8 != 27) {
          if ((i8 != 60) && (i8 != 68))
          {
            if (i8 != 49)
            {
              if ((i8 != 50) || (F(paramObject, i6, i4))) {
                continue;
              }
              return false;
            }
          }
          else
          {
            if ((!I(paramObject, i5, i4)) || (D(paramObject, i6, u(i4)))) {
              continue;
            }
            return false;
          }
        }
        if (!E(paramObject, i6, i4)) {
          return false;
        }
      }
      else if ((C(paramObject, i4, i1, i2, i7)) && (!D(paramObject, i6, u(i4))))
      {
        return false;
      }
    }
    return (!f) || (p.c(paramObject).e());
  }
  
  public boolean d(Object paramObject1, Object paramObject2)
  {
    int i1 = a.length;
    for (int i2 = 0; i2 < i1; i2 += 3) {
      if (!p(paramObject1, paramObject2, i2)) {
        return false;
      }
    }
    if (!o.g(paramObject1).equals(o.g(paramObject2))) {
      return false;
    }
    if (f) {
      return p.c(paramObject1).equals(p.c(paramObject2));
    }
    return true;
  }
  
  public final int d0(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong, e.a parama)
  {
    Unsafe localUnsafe = s;
    Object localObject1 = t(paramInt3);
    Object localObject2 = localUnsafe.getObject(paramObject, paramLong);
    Object localObject3 = localObject2;
    if (q.g(localObject2))
    {
      localObject3 = q.f(localObject1);
      q.a(localObject3, localObject2);
      localUnsafe.putObject(paramObject, paramLong, localObject3);
    }
    q.d(localObject1);
    return n(paramArrayOfByte, paramInt1, paramInt2, null, q.h(localObject3), parama);
  }
  
  public int e(Object paramObject)
  {
    int i1;
    if (h) {
      i1 = x(paramObject);
    } else {
      i1 = w(paramObject);
    }
    return i1;
  }
  
  public final int e0(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, int paramInt8, e.a parama)
  {
    Object localObject = s;
    long l1 = a[(paramInt8 + 2)] & 0xFFFFF;
    boolean bool = true;
    long l2;
    switch (paramInt7)
    {
    default: 
      break;
    case 68: 
      if (paramInt5 == 3)
      {
        localObject = S(paramObject, paramInt4, paramInt8);
        paramInt1 = e.M(localObject, u(paramInt8), paramArrayOfByte, paramInt1, paramInt2, paramInt3 & 0xFFFFFFF8 | 0x4, parama);
        paramArrayOfByte = (byte[])localObject;
        u0(paramObject, paramInt4, paramInt8, paramArrayOfByte);
      }
      break;
    case 67: 
      if (paramInt5 == 0)
      {
        paramInt1 = e.K(paramArrayOfByte, paramInt1, parama);
        l2 = i.c(b);
        paramArrayOfByte = Long.valueOf(l2);
        ((Unsafe)localObject).putObject(paramObject, paramLong, paramArrayOfByte);
      }
      break;
    case 66: 
    case 63: 
    case 61: 
    case 60: 
    case 59: 
    case 58: 
    case 57: 
    case 64: 
      for (;;)
      {
        ((Unsafe)localObject).putInt(paramObject, l1, paramInt4);
        return paramInt1;
        if (paramInt5 != 0) {
          return paramInt1;
        }
        paramInt1 = e.H(paramArrayOfByte, paramInt1, parama);
        paramInt2 = i.b(a);
        for (;;)
        {
          paramArrayOfByte = Integer.valueOf(paramInt2);
          break;
          if (paramInt5 != 0) {
            return paramInt1;
          }
          paramInt1 = e.H(paramArrayOfByte, paramInt1, parama);
          paramInt2 = a;
          s(paramInt8);
        }
        if (paramInt5 != 2) {
          return paramInt1;
        }
        paramInt1 = e.b(paramArrayOfByte, paramInt1, parama);
        paramArrayOfByte = c;
        break label202;
        if (paramInt5 != 2) {
          return paramInt1;
        }
        localObject = S(paramObject, paramInt4, paramInt8);
        paramInt1 = e.N(localObject, u(paramInt8), paramArrayOfByte, paramInt1, paramInt2, parama);
        paramArrayOfByte = (byte[])localObject;
        break;
        if (paramInt5 != 2) {
          return paramInt1;
        }
        paramInt1 = e.H(paramArrayOfByte, paramInt1, parama);
        paramInt2 = a;
        if (paramInt2 == 0)
        {
          paramArrayOfByte = "";
          break label202;
        }
        if (((paramInt6 & 0x20000000) != 0) && (!p0.n(paramArrayOfByte, paramInt1, paramInt1 + paramInt2))) {
          throw A.d();
        }
        ((Unsafe)localObject).putObject(paramObject, paramLong, new String(paramArrayOfByte, paramInt1, paramInt2, z.b));
        paramInt1 += paramInt2;
        continue;
        if (paramInt5 != 0) {
          return paramInt1;
        }
        paramInt1 = e.K(paramArrayOfByte, paramInt1, parama);
        if (b == 0L) {
          bool = false;
        }
        paramArrayOfByte = Boolean.valueOf(bool);
        break label202;
        if (paramInt5 != 5) {
          return paramInt1;
        }
        paramArrayOfByte = Integer.valueOf(e.g(paramArrayOfByte, paramInt1));
        ((Unsafe)localObject).putObject(paramObject, paramLong, paramArrayOfByte);
        paramInt1 += 4;
      }
    case 56: 
    case 65: 
      if (paramInt5 != 1) {
        break;
      }
    case 55: 
    case 62: 
    case 53: 
    case 54: 
    case 52: 
    case 51: 
      label202:
      label211:
      label247:
      label493:
      for (paramArrayOfByte = Long.valueOf(e.i(paramArrayOfByte, paramInt1));; paramArrayOfByte = Double.valueOf(e.d(paramArrayOfByte, paramInt1)))
      {
        ((Unsafe)localObject).putObject(paramObject, paramLong, paramArrayOfByte);
        paramInt1 += 8;
        break label211;
        if (paramInt5 != 0) {
          return paramInt1;
        }
        paramInt1 = e.H(paramArrayOfByte, paramInt1, parama);
        paramInt2 = a;
        break label247;
        if (paramInt5 != 0) {
          return paramInt1;
        }
        paramInt1 = e.K(paramArrayOfByte, paramInt1, parama);
        l2 = b;
        break;
        if (paramInt5 != 5) {
          return paramInt1;
        }
        paramArrayOfByte = Float.valueOf(e.k(paramArrayOfByte, paramInt1));
        break label493;
        if (paramInt5 != 1) {
          return paramInt1;
        }
      }
    }
    return paramInt1;
  }
  
  public Object f()
  {
    return m.a(e);
  }
  
  public int f0(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, e.a parama)
  {
    Object localObject1 = paramArrayOfByte;
    int i1 = paramInt3;
    m(paramObject);
    Unsafe localUnsafe = s;
    int i2 = 0;
    int i3 = i2;
    int i4 = i3;
    int i5 = -1;
    int i6 = 1048575;
    S localS = this;
    Object localObject2 = paramObject;
    Object localObject3 = parama;
    int i7;
    int i8;
    if (paramInt1 < paramInt2)
    {
      i7 = paramInt1 + 1;
      i3 = localObject1[paramInt1];
      if (i3 < 0)
      {
        i7 = e.G(i3, (byte[])localObject1, i7, (e.a)localObject3);
        i3 = a;
      }
      i8 = i3 >>> 3;
      int i9 = i3 & 0x7;
      if (i8 > i5) {}
      for (paramInt1 = localS.j0(i8, i2 / 3);; paramInt1 = localS.i0(i8)) {
        break;
      }
      if (paramInt1 == -1)
      {
        paramInt1 = i1;
        i1 = 0;
      }
      else
      {
        int i10 = a[(paramInt1 + 1)];
        int i11 = v0(i10);
        long l1 = X(i10);
        if (i11 <= 17)
        {
          i1 = a[(paramInt1 + 2)];
          i5 = 1 << (i1 >>> 20);
          i1 &= 0xFFFFF;
          if (i1 != i6)
          {
            if (i6 != 1048575) {
              localUnsafe.putInt(localObject2, i6, i4);
            }
            i6 = localUnsafe.getInt(localObject2, i1);
            i4 = i1;
            i1 = i6;
          }
          else
          {
            i1 = i4;
            i4 = i6;
          }
          switch (i11)
          {
          default: 
            break;
          case 17: 
            if (i9 == 3)
            {
              localObject1 = localS.R(localObject2, paramInt1);
              i7 = e.M(localObject1, localS.u(paramInt1), paramArrayOfByte, i7, paramInt2, i8 << 3 | 0x4, parama);
              localS.t0(localObject2, paramInt1, localObject1);
              i1 |= i5;
              i6 = i4;
              i4 = i1;
            }
            break;
          }
        }
        for (;;)
        {
          i1 = paramInt3;
          i2 = paramInt1;
          localObject1 = paramArrayOfByte;
          paramInt1 = i7;
          i5 = i8;
          break;
          break label959;
          if (i9 == 0)
          {
            i6 = e.K(paramArrayOfByte, i7, (e.a)localObject3);
            long l2 = i.c(b);
            localUnsafe.putLong(paramObject, l1, l2);
            i1 |= i5;
            i7 = i6;
            i6 = i1;
            i2 = paramInt1;
            paramInt1 = i7;
            label501:
            i1 = paramInt3;
            i7 = i4;
            localObject1 = paramArrayOfByte;
            i5 = i8;
            i4 = i6;
            i6 = i7;
            break;
            if (i9 == 0)
            {
              i6 = e.H(paramArrayOfByte, i7, (e.a)localObject3);
              i7 = i.b(a);
              label552:
              localUnsafe.putInt(localObject2, l1, i7);
              for (;;)
              {
                label563:
                i7 = i1 | i5;
                i2 = paramInt1;
                paramInt1 = i6;
                i6 = i7;
                break label501;
                if (i9 != 0) {
                  break label959;
                }
                i6 = e.H(paramArrayOfByte, i7, (e.a)localObject3);
                i7 = a;
                localS.s(paramInt1);
                break label552;
                if (i9 != 2) {
                  break label959;
                }
                i6 = e.b(paramArrayOfByte, i7, (e.a)localObject3);
                for (;;)
                {
                  localUnsafe.putObject(localObject2, l1, c);
                  break;
                  i6 = paramInt1;
                  if (i9 != 2) {
                    break label959;
                  }
                  localObject1 = localS.R(localObject2, i6);
                  i7 = e.N(localObject1, localS.u(i6), paramArrayOfByte, i7, paramInt2, parama);
                  localS.t0(localObject2, i6, localObject1);
                  i6 = i7;
                  break;
                  localObject1 = paramArrayOfByte;
                  if (i9 != 2) {
                    break label959;
                  }
                  if ((0x20000000 & i10) == 0) {
                    i6 = e.B((byte[])localObject1, i7, (e.a)localObject3);
                  } else {
                    i6 = e.E((byte[])localObject1, i7, (e.a)localObject3);
                  }
                }
                if (i9 != 0) {
                  break label959;
                }
                i6 = e.K(paramArrayOfByte, i7, (e.a)localObject3);
                boolean bool;
                if (b != 0L) {
                  bool = true;
                } else {
                  bool = false;
                }
                o0.H(localObject2, l1, bool);
                continue;
                if (i9 != 5) {
                  break label959;
                }
                localUnsafe.putInt(localObject2, l1, e.g(paramArrayOfByte, i7));
                for (;;)
                {
                  i6 = i7 + 4;
                  break label563;
                  if (i9 != 1) {
                    break label959;
                  }
                  localUnsafe.putLong(paramObject, l1, e.i(paramArrayOfByte, i7));
                  i6 = i7 + 8;
                  break label563;
                  if (i9 != 0) {
                    break label959;
                  }
                  i6 = e.H(paramArrayOfByte, i7, (e.a)localObject3);
                  i7 = a;
                  break label552;
                  if (i9 != 0) {
                    break label959;
                  }
                  i6 = e.K(paramArrayOfByte, i7, (e.a)localObject3);
                  l2 = b;
                  break;
                  if (i9 != 5) {
                    break label959;
                  }
                  o0.O(localObject2, l1, e.k(paramArrayOfByte, i7));
                }
                if (i9 != 1) {
                  break label959;
                }
                o0.N(localObject2, l1, e.d(paramArrayOfByte, i7));
                i6 = i7 + 8;
              }
            }
          }
          label959:
          i6 = paramInt1;
          paramInt1 = i1;
          i1 = i6;
          i6 = i4;
          i4 = paramInt1;
          paramInt1 = paramInt3;
          break label1319;
          i5 = i8;
          if (i11 != 27) {
            break label1104;
          }
          if (i9 != 2) {
            break label1101;
          }
          localObject3 = (z.d)localUnsafe.getObject(localObject2, l1);
          localObject1 = localObject3;
          if (!((z.d)localObject3).p())
          {
            i1 = ((List)localObject3).size();
            if (i1 == 0) {
              i1 = 10;
            } else {
              i1 *= 2;
            }
            localObject1 = ((z.d)localObject3).h(i1);
            localUnsafe.putObject(localObject2, l1, localObject1);
          }
          i7 = e.p(localS.u(paramInt1), i3, paramArrayOfByte, i7, paramInt2, (z.d)localObject1, parama);
        }
        label1101:
        break label1267;
        label1104:
        i1 = i6;
        if (i11 <= 49)
        {
          i2 = h0(paramObject, paramArrayOfByte, i7, paramInt2, i3, i5, i9, paramInt1, i10, i11, l1, parama);
          i6 = i2;
          if (i2 != i7) {
            i6 = i2;
          }
        }
        for (;;)
        {
          label1158:
          i7 = paramInt3;
          i8 = i1;
          i1 = i7;
          i7 = i8;
          i2 = paramInt1;
          paramInt1 = i6;
          localObject1 = paramArrayOfByte;
          i6 = i7;
          break;
          label1267:
          label1273:
          do
          {
            int i12;
            do
            {
              i5 = paramInt1;
              paramInt1 = paramInt3;
              i7 = i6;
              i6 = i1;
              i1 = i5;
              break label1319;
              i2 = i7;
              i12 = paramInt1;
              if (i11 != 50) {
                break label1273;
              }
              if (i9 != 2) {
                break;
              }
              i7 = d0(paramObject, paramArrayOfByte, i2, paramInt2, i12, l1, parama);
              i6 = i7;
            } while (i7 == i2);
            i6 = i7;
            break label1158;
            i1 = paramInt1;
            break;
            i7 = e0(paramObject, paramArrayOfByte, i2, paramInt2, i3, i5, i9, i10, i11, l1, i12, parama);
            i6 = i7;
          } while (i7 == i2);
          i6 = i7;
        }
      }
      label1319:
      if ((i3 == paramInt1) && (paramInt1 != 0))
      {
        paramArrayOfByte = this;
        paramInt3 = i7;
      }
    }
    for (;;)
    {
      break label1433;
      if ((f) && (d != p.b())) {
        i7 = e.f(i3, paramArrayOfByte, i7, paramInt2, paramObject, e, o, parama);
      } else {
        i7 = e.F(i3, paramArrayOfByte, i7, paramInt2, v(paramObject), parama);
      }
      i2 = i1;
      i1 = paramInt1;
      paramInt1 = i7;
      i5 = i8;
      i7 = i6;
      break;
      paramArrayOfByte = localS;
      paramInt3 = paramInt1;
      paramInt1 = i1;
    }
    label1433:
    if (i6 != 1048575) {
      localUnsafe.putInt(paramObject, i6, i4);
    }
    i6 = k;
    parama = null;
    while (i6 < l)
    {
      parama = (l0)q(paramObject, j[i6], parama, o, paramObject);
      i6++;
    }
    if (parama != null) {
      o.o(paramObject, parama);
    }
    if (paramInt1 == 0)
    {
      if (paramInt3 != paramInt2) {
        throw A.h();
      }
    }
    else {
      if ((paramInt3 > paramInt2) || (i3 != paramInt1)) {
        break label1551;
      }
    }
    return paramInt3;
    label1551:
    throw A.h();
  }
  
  public int g(Object paramObject)
  {
    int i1 = a.length;
    int i2 = 0;
    for (int i3 = 0; i2 < i1; i3 = i4)
    {
      i4 = w0(i2);
      int i5 = W(i2);
      long l1 = X(i4);
      int i6 = v0(i4);
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
        if (I(paramObject, i5, i2))
        {
          localObject = o0.C(paramObject, l1);
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
          if (!I(paramObject, i5, i2)) {
            break label978;
          }
          for (;;)
          {
            i4 = i3 * 53;
            l1 = c0(paramObject, l1);
            i3 = z.f(l1);
            break label384;
            i4 = i3;
            if (!I(paramObject, i5, i2)) {
              break label978;
            }
            for (;;)
            {
              i4 = i3 * 53;
              i3 = b0(paramObject, l1);
              break label384;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              break label409;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              i4 = i3 * 53;
              localObject = o0.C(paramObject, l1);
              break label377;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              break;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              i4 = i3 * 53;
              i3 = ((String)o0.C(paramObject, l1)).hashCode();
              break label384;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              i4 = i3 * 53;
              bool = Y(paramObject, l1);
              i3 = z.c(bool);
              break label384;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
              break label409;
              i4 = i3;
              if (!I(paramObject, i5, i2)) {
                break label978;
              }
            }
            i4 = i3;
            if (!I(paramObject, i5, i2)) {
              break label978;
            }
            continue;
            i4 = i3;
            if (!I(paramObject, i5, i2)) {
              break label978;
            }
          }
          i4 = i3;
          if (!I(paramObject, i5, i2)) {
            break label978;
          }
          i4 = i3 * 53;
          f1 = a0(paramObject, l1);
          i3 = Float.floatToIntBits(f1);
        }
      case 51: 
        i4 = i3;
        if (I(paramObject, i5, i2)) {
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
        for (double d1 = Z(paramObject, l1);; d1 = o0.x(paramObject, l1))
        {
          l1 = Double.doubleToLongBits(d1);
          break label424;
          localObject = o0.C(paramObject, l1);
          if (localObject != null) {}
          for (;;)
          {
            i4 = localObject.hashCode();
            do
            {
              i4 = i3 * 53 + i4;
              break label978;
              i4 = i3 * 53;
              l1 = o0.A(paramObject, l1);
              break label424;
              i4 = i3 * 53;
              i3 = o0.z(paramObject, l1);
              break;
              localObject = o0.C(paramObject, l1);
            } while (localObject == null);
          }
          i4 = i3 * 53;
          bool = o0.r(paramObject, l1);
          break label659;
          i4 = i3 * 53;
          f1 = o0.y(paramObject, l1);
          break label789;
          i4 = i3 * 53;
        }
      }
      label978:
      i2 += 3;
    }
    i3 = i3 * 53 + o.g(paramObject).hashCode();
    int i4 = i3;
    if (f) {
      i4 = i3 * 53 + p.c(paramObject).hashCode();
    }
    return i4;
  }
  
  public final int g0(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, e.a parama)
  {
    m(paramObject);
    Unsafe localUnsafe = s;
    int i1 = -1;
    int i2 = paramInt1;
    paramInt1 = -1;
    int i3 = 0;
    int i4 = i3;
    int i5 = 1048575;
    Object localObject1 = parama;
    Object localObject2 = this;
    Object localObject3 = paramObject;
    Object localObject4 = paramArrayOfByte;
    if (i2 < paramInt2)
    {
      int i6 = i2 + 1;
      int i7 = localObject4[i2];
      if (i7 < 0)
      {
        i6 = e.G(i7, (byte[])localObject4, i6, (e.a)localObject1);
        i7 = a;
      }
      i2 = i7 >>> 3;
      int i8 = i7 & 0x7;
      if (i2 > paramInt1) {}
      for (paramInt1 = ((S)localObject2).j0(i2, i3 / 3);; paramInt1 = ((S)localObject2).i0(i2)) {
        break;
      }
      int i9;
      int i10;
      long l1;
      int i12;
      if (paramInt1 == i1)
      {
        i3 = i6;
        i6 = i1;
        paramInt1 = 0;
      }
      else
      {
        i9 = a[(paramInt1 + 1)];
        i10 = v0(i9);
        l1 = X(i9);
        int i11;
        if (i10 <= 17)
        {
          i1 = a[(paramInt1 + 2)];
          i11 = 1 << (i1 >>> 20);
          i12 = i1 & 0xFFFFF;
          i3 = i4;
          i1 = i5;
          if (i12 != i5)
          {
            if (i5 != 1048575) {
              localUnsafe.putInt(localObject3, i5, i4);
            }
            if (i12 != 1048575) {
              i4 = localUnsafe.getInt(localObject3, i12);
            }
            i1 = i12;
            i3 = i4;
          }
          switch (i10)
          {
          default: 
          case 16: 
            for (;;)
            {
              label356:
              break;
              if (i8 == 0)
              {
                localObject3 = parama;
                i4 = e.K((byte[])localObject4, i6, (e.a)localObject3);
                localUnsafe.putLong(paramObject, l1, i.c(b));
                i6 = i3 | i11;
                i3 = i4;
                i5 = i1;
                i4 = paramInt1;
                paramInt1 = i3;
              }
            }
          }
        }
        for (;;)
        {
          label416:
          i1 = i2;
          i7 = -1;
          i2 = paramInt1;
          paramInt1 = i1;
          i3 = i4;
          i4 = i6;
          i1 = i7;
          break;
          localObject2 = parama;
          if (i8 != 0) {
            break label356;
          }
          i4 = e.H((byte[])localObject4, i6, (e.a)localObject2);
          localUnsafe.putInt(localObject3, l1, i.b(a));
          label481:
          i6 = i3 | i11;
          for (;;)
          {
            label488:
            i5 = paramInt1;
            paramInt1 = i4;
            i4 = i5;
            i5 = i1;
            break label416;
            localObject2 = parama;
            if (i8 != 0) {
              break;
            }
            i4 = e.H((byte[])localObject4, i6, (e.a)localObject2);
            localUnsafe.putInt(localObject3, l1, a);
            for (;;)
            {
              i6 = i3 | i11;
              break label488;
              localObject2 = parama;
              if (i8 != 2) {
                break;
              }
              i4 = e.b((byte[])localObject4, i6, (e.a)localObject2);
              localUnsafe.putObject(localObject3, l1, c);
            }
            i4 = paramInt1;
            if (i8 != 2) {
              break;
            }
            localObject4 = ((S)localObject2).R(localObject3, i4);
            i5 = e.N(localObject4, ((S)localObject2).u(i4), paramArrayOfByte, i6, paramInt2, parama);
            ((S)localObject2).t0(localObject3, i4, localObject4);
            i4 = i5;
            break label481;
            localObject2 = parama;
            if (i8 != 2) {
              break label713;
            }
            if ((0x20000000 & i9) == 0) {
              i4 = e.B((byte[])localObject4, i6, (e.a)localObject2);
            } else {
              i4 = e.E((byte[])localObject4, i6, (e.a)localObject2);
            }
            localUnsafe.putObject(localObject3, l1, c);
            label703:
            i6 = i3 | i11;
          }
          for (;;)
          {
            label713:
            break label979;
            localObject2 = parama;
            boolean bool = true;
            if (i8 == 0)
            {
              i4 = e.K((byte[])localObject4, i6, (e.a)localObject2);
              if (b == 0L) {
                bool = false;
              }
              o0.H(localObject3, l1, bool);
              i6 = i3 | i11;
              break;
              if (i8 == 5)
              {
                localUnsafe.putInt(localObject3, l1, e.g((byte[])localObject4, i6));
                i4 = i6 + 4;
                break label703;
                if (i8 == 1)
                {
                  localUnsafe.putLong(paramObject, l1, e.i((byte[])localObject4, i6));
                  for (;;)
                  {
                    i4 = i6 + 8;
                    break label703;
                    localObject2 = parama;
                    if (i8 != 0) {
                      break label979;
                    }
                    i4 = e.H((byte[])localObject4, i6, (e.a)localObject2);
                    localUnsafe.putInt(localObject3, l1, a);
                    break label703;
                    localObject3 = parama;
                    if (i8 != 0) {
                      break label979;
                    }
                    i5 = e.K((byte[])localObject4, i6, (e.a)localObject3);
                    localUnsafe.putLong(paramObject, l1, b);
                    i6 = i3 | i11;
                    i4 = paramInt1;
                    paramInt1 = i5;
                    i5 = i1;
                    break;
                    i4 = i6;
                    if (i8 != 5) {
                      break label979;
                    }
                    o0.O(localObject3, l1, e.k((byte[])localObject4, i4));
                    i4 += 4;
                    break label703;
                    if (i8 != 1) {
                      break label979;
                    }
                    o0.N(localObject3, l1, e.d((byte[])localObject4, i6));
                  }
                }
              }
            }
          }
          label979:
          i4 = i3;
          i12 = -1;
          i3 = i6;
          i5 = i1;
          i6 = i12;
          break label1318;
          i3 = i2;
          if (i10 != 27) {
            break label1137;
          }
          if (i8 != 2) {
            break label1134;
          }
          localObject1 = (z.d)localUnsafe.getObject(localObject3, l1);
          localObject4 = localObject1;
          if (!((z.d)localObject1).p())
          {
            i1 = ((List)localObject1).size();
            if (i1 == 0) {
              i1 = 10;
            } else {
              i1 *= 2;
            }
            localObject4 = ((z.d)localObject1).h(i1);
            localUnsafe.putObject(localObject3, l1, localObject4);
          }
          i3 = e.p(((S)localObject2).u(paramInt1), i7, paramArrayOfByte, i6, paramInt2, (z.d)localObject4, parama);
          i1 = paramInt1;
          i6 = i4;
          paramInt1 = i3;
          i4 = i1;
        }
        label1134:
        break label1269;
        label1137:
        if (i10 <= 49)
        {
          i12 = h0(paramObject, paramArrayOfByte, i6, paramInt2, i7, i3, i8, paramInt1, i9, i10, l1, parama);
          i1 = i12;
          if (i12 != i6)
          {
            i6 = i12;
            label1187:
            i1 = -1;
          }
        }
      }
      for (;;)
      {
        i7 = paramInt1;
        i2 = i6;
        paramInt1 = i3;
        i3 = i7;
        break;
        label1207:
        label1269:
        label1276:
        do
        {
          for (i3 = i1;; i3 = i6)
          {
            i6 = -1;
            break label1318;
            i1 = paramInt1;
            i12 = i6;
            if (i10 != 50) {
              break label1276;
            }
            if (i8 == 2)
            {
              i6 = d0(paramObject, paramArrayOfByte, i12, paramInt2, i1, l1, parama);
              i1 = i6;
              if (i6 == i12) {
                break label1207;
              }
              break;
            }
          }
          i6 = e0(paramObject, paramArrayOfByte, i12, paramInt2, i7, i3, i8, i9, i10, l1, i1, parama);
          i1 = i6;
        } while (i6 == i12);
        break label1187;
        label1318:
        i3 = e.F(i7, paramArrayOfByte, i3, paramInt2, v(paramObject), parama);
        i1 = i6;
        i6 = i3;
        i3 = i2;
      }
    }
    if (i5 != 1048575) {
      localUnsafe.putInt(paramObject, i5, i4);
    }
    if (i2 == paramInt2) {
      return i2;
    }
    throw A.h();
  }
  
  public void h(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, e.a parama)
  {
    if (h) {
      g0(paramObject, paramArrayOfByte, paramInt1, paramInt2, parama);
    } else {
      f0(paramObject, paramArrayOfByte, paramInt1, paramInt2, 0, parama);
    }
  }
  
  public final int h0(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, int paramInt7, long paramLong2, e.a parama)
  {
    Unsafe localUnsafe = s;
    z.d locald1 = (z.d)localUnsafe.getObject(paramObject, paramLong2);
    z.d locald2 = locald1;
    if (!locald1.p())
    {
      int i1 = locald1.size();
      if (i1 == 0) {
        i1 = 10;
      } else {
        i1 *= 2;
      }
      locald2 = locald1.h(i1);
      localUnsafe.putObject(paramObject, paramLong2, locald2);
    }
    switch (paramInt7)
    {
    default: 
      break;
    case 49: 
      if (paramInt5 == 3) {
        paramInt1 = e.n(u(paramInt6), paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 34: 
    case 48: 
      if (paramInt5 == 2) {
        paramInt1 = e.w(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = e.A(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 33: 
    case 47: 
      if (paramInt5 == 2) {
        paramInt1 = e.v(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = e.z(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 30: 
    case 44: 
      if (paramInt5 == 2)
      {
        paramInt1 = e.x(paramArrayOfByte, paramInt1, locald2, parama);
      }
      else
      {
        if (paramInt5 != 0) {
          break;
        }
        paramInt1 = e.I(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      s(paramInt6);
      g0.z(paramObject, paramInt4, locald2, null, null, o);
      break;
    case 28: 
      if (paramInt5 == 2) {
        paramInt1 = e.c(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 27: 
      if (paramInt5 == 2) {
        paramInt1 = e.p(u(paramInt6), paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 26: 
      if (paramInt5 == 2) {
        if ((paramLong1 & 0x20000000) == 0L) {
          paramInt1 = e.C(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
        } else {
          paramInt1 = e.D(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
        }
      }
      break;
    case 25: 
    case 42: 
      if (paramInt5 == 2) {
        paramInt1 = e.q(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = e.a(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 24: 
    case 31: 
    case 41: 
    case 45: 
      if (paramInt5 == 2) {
        paramInt1 = e.s(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 5) {
        paramInt1 = e.h(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 23: 
    case 32: 
    case 40: 
    case 46: 
      if (paramInt5 == 2) {
        paramInt1 = e.t(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 1) {
        paramInt1 = e.j(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 22: 
    case 29: 
    case 39: 
    case 43: 
      if (paramInt5 == 2) {
        paramInt1 = e.x(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = e.I(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 20: 
    case 21: 
    case 37: 
    case 38: 
      if (paramInt5 == 2) {
        paramInt1 = e.y(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = e.L(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 19: 
    case 36: 
      if (paramInt5 == 2) {
        paramInt1 = e.u(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 5) {
        paramInt1 = e.l(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 18: 
    case 35: 
      if (paramInt5 == 2) {
        paramInt1 = e.r(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 1) {
        paramInt1 = e.e(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    }
    return paramInt1;
  }
  
  public void i(Object paramObject, r0 paramr0)
  {
    if (paramr0.v() == r0.a.p) {
      z0(paramObject, paramr0);
    } else if (h) {
      y0(paramObject, paramr0);
    } else {
      x0(paramObject, paramr0);
    }
  }
  
  public final int i0(int paramInt)
  {
    if ((paramInt >= c) && (paramInt <= d)) {
      return s0(paramInt, 0);
    }
    return -1;
  }
  
  public void j(Object paramObject, d0 paramd0, p paramp)
  {
    paramp.getClass();
    m(paramObject);
    M(o, p, paramObject, paramd0, paramp);
  }
  
  public final int j0(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= c) && (paramInt1 <= d)) {
      return s0(paramInt1, paramInt2);
    }
    return -1;
  }
  
  public final boolean k(Object paramObject1, Object paramObject2, int paramInt)
  {
    boolean bool;
    if (B(paramObject1, paramInt) == B(paramObject2, paramInt)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int k0(int paramInt)
  {
    return a[(paramInt + 2)];
  }
  
  public final void l0(Object paramObject, long paramLong, d0 paramd0, e0 parame0, p paramp)
  {
    paramd0.N(n.e(paramObject, paramLong), parame0, paramp);
  }
  
  public final void m0(Object paramObject, int paramInt, d0 paramd0, e0 parame0, p paramp)
  {
    long l1 = X(paramInt);
    paramd0.K(n.e(paramObject, l1), parame0, paramp);
  }
  
  public final int n(byte[] paramArrayOfByte, int paramInt1, int paramInt2, H.a parama, Map paramMap, e.a parama1)
  {
    int i1 = e.H(paramArrayOfByte, paramInt1, parama1);
    paramInt1 = a;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2 - i1)) {
      throw null;
    }
    throw A.m();
  }
  
  public final void n0(Object paramObject, int paramInt, d0 paramd0)
  {
    long l1;
    if (A(paramInt))
    {
      l1 = X(paramInt);
      paramd0 = paramd0.F();
    }
    for (;;)
    {
      o0.R(paramObject, l1, paramd0);
      break;
      if (g)
      {
        l1 = X(paramInt);
        paramd0 = paramd0.m();
      }
      else
      {
        l1 = X(paramInt);
        paramd0 = paramd0.u();
      }
    }
  }
  
  public final void o0(Object paramObject, int paramInt, d0 paramd0)
  {
    if (A(paramInt)) {
      paramd0.t(n.e(paramObject, X(paramInt)));
    } else {
      paramd0.q(n.e(paramObject, X(paramInt)));
    }
  }
  
  public final boolean p(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = w0(paramInt);
    long l1 = X(i1);
    i1 = v0(i1);
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
      if (H(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool19;
        if (g0.J(o0.C(paramObject1, l1), o0.C(paramObject2, l1))) {
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
      return g0.J(o0.C(paramObject1, l1), o0.C(paramObject2, l1));
    case 17: 
      bool20 = bool1;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool1;
        if (g0.J(o0.C(paramObject1, l1), o0.C(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 16: 
      bool20 = bool2;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool2;
        if (o0.A(paramObject1, l1) == o0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 15: 
      bool20 = bool3;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool3;
        if (o0.z(paramObject1, l1) == o0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 14: 
      bool20 = bool4;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool4;
        if (o0.A(paramObject1, l1) == o0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 13: 
      bool20 = bool5;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool5;
        if (o0.z(paramObject1, l1) == o0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 12: 
      bool20 = bool6;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool6;
        if (o0.z(paramObject1, l1) == o0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 11: 
      bool20 = bool7;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool7;
        if (o0.z(paramObject1, l1) == o0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 10: 
      bool20 = bool8;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool8;
        if (g0.J(o0.C(paramObject1, l1), o0.C(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 9: 
      bool20 = bool9;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool9;
        if (g0.J(o0.C(paramObject1, l1), o0.C(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 8: 
      bool20 = bool10;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool10;
        if (g0.J(o0.C(paramObject1, l1), o0.C(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 7: 
      bool20 = bool11;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool11;
        if (o0.r(paramObject1, l1) == o0.r(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 6: 
      bool20 = bool12;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool12;
        if (o0.z(paramObject1, l1) == o0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 5: 
      bool20 = bool13;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool13;
        if (o0.A(paramObject1, l1) == o0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 4: 
      bool20 = bool14;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool14;
        if (o0.z(paramObject1, l1) == o0.z(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 3: 
      bool20 = bool15;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool15;
        if (o0.A(paramObject1, l1) == o0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 2: 
      bool20 = bool16;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool16;
        if (o0.A(paramObject1, l1) == o0.A(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 1: 
      bool20 = bool17;
      if (k(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool17;
        if (Float.floatToIntBits(o0.y(paramObject1, l1)) == Float.floatToIntBits(o0.y(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    }
    boolean bool20 = bool18;
    if (k(paramObject1, paramObject2, paramInt))
    {
      bool20 = bool18;
      if (Double.doubleToLongBits(o0.x(paramObject1, l1)) == Double.doubleToLongBits(o0.x(paramObject2, l1))) {
        bool20 = true;
      }
    }
    return bool20;
  }
  
  public final Object q(Object paramObject1, int paramInt, Object paramObject2, k0 paramk0, Object paramObject3)
  {
    W(paramInt);
    if (o0.C(paramObject1, X(w0(paramInt))) == null) {
      return paramObject2;
    }
    s(paramInt);
    return paramObject2;
  }
  
  public final void q0(Object paramObject, int paramInt)
  {
    paramInt = k0(paramInt);
    long l1 = 0xFFFFF & paramInt;
    if (l1 == 1048575L) {
      return;
    }
    o0.P(paramObject, l1, 1 << (paramInt >>> 20) | o0.z(paramObject, l1));
  }
  
  public final void r0(Object paramObject, int paramInt1, int paramInt2)
  {
    o0.P(paramObject, k0(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  public final z.c s(int paramInt)
  {
    a.a(b[(paramInt / 3 * 2 + 1)]);
    return null;
  }
  
  public final int s0(int paramInt1, int paramInt2)
  {
    int i1 = a.length / 3 - 1;
    while (paramInt2 <= i1)
    {
      int i2 = i1 + paramInt2 >>> 1;
      int i3 = i2 * 3;
      int i4 = W(i3);
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
  
  public final Object t(int paramInt)
  {
    return b[(paramInt / 3 * 2)];
  }
  
  public final void t0(Object paramObject1, int paramInt, Object paramObject2)
  {
    s.putObject(paramObject1, X(w0(paramInt)), paramObject2);
    q0(paramObject1, paramInt);
  }
  
  public final e0 u(int paramInt)
  {
    paramInt = paramInt / 3 * 2;
    e0 locale0 = (e0)b[paramInt];
    if (locale0 != null) {
      return locale0;
    }
    locale0 = a0.a().c((Class)b[(paramInt + 1)]);
    b[paramInt] = locale0;
    return locale0;
  }
  
  public final void u0(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2)
  {
    s.putObject(paramObject1, X(w0(paramInt2)), paramObject2);
    r0(paramObject1, paramInt1, paramInt2);
  }
  
  public final int w(Object paramObject)
  {
    Unsafe localUnsafe = s;
    int i1 = 1048575;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    while (i2 < a.length)
    {
      int i5 = w0(i2);
      int i6 = W(i2);
      int i7 = v0(i5);
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
        if ((i) && (i7 >= u.c0.c()) && (i7 <= u.p0.c())) {}
        for (i10 = a[(i2 + 2)] & 0xFFFFF;; i10 = 0)
        {
          i13 = 0;
          i11 = i1;
          i12 = i10;
          break;
        }
      }
      long l1 = X(i5);
      switch (i7)
      {
      default: 
        i10 = i3;
        break;
      case 68: 
        i10 = i3;
        if (I(paramObject, i6, i2))
        {
          i10 = k.r(i6, (O)localUnsafe.getObject(paramObject, l1), u(i2));
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
        if (I(paramObject, i6, i2))
        {
          l1 = c0(paramObject, l1);
          label568:
          i10 = k.H(i6, l1);
          break label534;
          i10 = i3;
          if (I(paramObject, i6, i2))
          {
            i10 = b0(paramObject, l1);
            label604:
            i10 = k.F(i6, i10);
            break label534;
            i10 = i3;
            if (I(paramObject, i6, i2))
            {
              label632:
              i10 = k.D(i6, 0L);
              break label534;
              i10 = i3;
              if (I(paramObject, i6, i2))
              {
                label659:
                i10 = k.B(i6, 0);
                label667:
                i10 = i3 + i10;
                continue;
                i10 = i3;
                if (I(paramObject, i6, i2))
                {
                  i10 = b0(paramObject, l1);
                  label701:
                  i10 = k.j(i6, i10);
                  break label534;
                  i10 = i3;
                  if (I(paramObject, i6, i2))
                  {
                    i10 = b0(paramObject, l1);
                    label737:
                    i10 = k.M(i6, i10);
                    break label534;
                    i10 = i3;
                    if (I(paramObject, i6, i2))
                    {
                      label765:
                      i10 = k.f(i6, (h)localUnsafe.getObject(paramObject, l1));
                      break label534;
                      i10 = i3;
                      if (I(paramObject, i6, i2))
                      {
                        label801:
                        i10 = g0.o(i6, localUnsafe.getObject(paramObject, l1), u(i2));
                        break label534;
                        i10 = i3;
                        if (I(paramObject, i6, i2))
                        {
                          Object localObject = localUnsafe.getObject(paramObject, l1);
                          if ((localObject instanceof h))
                          {
                            i10 = k.f(i6, (h)localObject);
                            break label534;
                          }
                          i10 = k.J(i6, (String)localObject);
                          break label534;
                          i10 = i3;
                          if (I(paramObject, i6, i2))
                          {
                            for (;;)
                            {
                              i10 = k.d(i6, true);
                              break label534;
                              i10 = i3;
                              if (!I(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = k.l(i6, 0);
                              break label667;
                              i10 = i3;
                              if (!I(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = k.n(i6, 0L);
                              break label534;
                              i10 = i3;
                              if (!I(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = k.t(i6, b0(paramObject, l1));
                              break label534;
                              i10 = i3;
                              if (!I(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = k.O(i6, c0(paramObject, l1));
                              break label534;
                              i10 = i3;
                              if (!I(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = k.v(i6, c0(paramObject, l1));
                              break label534;
                              i10 = i3;
                              if (!I(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = k.p(i6, 0.0F);
                              break label534;
                              i10 = i3;
                              if (!I(paramObject, i6, i2)) {
                                break label541;
                              }
                              i10 = k.h(i6, 0.0D);
                              break label534;
                              i10 = q.b(i6, localUnsafe.getObject(paramObject, l1), t(i2));
                              break label534;
                              i10 = g0.j(i6, (List)localUnsafe.getObject(paramObject, l1), u(i2));
                              break label534;
                              i1 = g0.t((List)localUnsafe.getObject(paramObject, l1));
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
                                                          i10 = k.L(i6) + k.N(i10) + i10;
                                                          break label667;
                                                          i1 = g0.r((List)localUnsafe.getObject(paramObject, l1));
                                                          i10 = i3;
                                                          if (i1 <= 0) {
                                                            break;
                                                          }
                                                          i10 = i1;
                                                        } while (!i);
                                                        i10 = i1;
                                                        break label1208;
                                                        i1 = g0.i((List)localUnsafe.getObject(paramObject, l1));
                                                        i10 = i3;
                                                        if (i1 <= 0) {
                                                          break;
                                                        }
                                                        i10 = i1;
                                                      } while (!i);
                                                      i10 = i1;
                                                      break label1208;
                                                      i1 = g0.g((List)localUnsafe.getObject(paramObject, l1));
                                                      i10 = i3;
                                                      if (i1 <= 0) {
                                                        break;
                                                      }
                                                      i10 = i1;
                                                    } while (!i);
                                                    i10 = i1;
                                                    break label1208;
                                                    i1 = g0.e((List)localUnsafe.getObject(paramObject, l1));
                                                    i10 = i3;
                                                    if (i1 <= 0) {
                                                      break;
                                                    }
                                                    i10 = i1;
                                                  } while (!i);
                                                  i10 = i1;
                                                  break label1208;
                                                  i1 = g0.w((List)localUnsafe.getObject(paramObject, l1));
                                                  i10 = i3;
                                                  if (i1 <= 0) {
                                                    break;
                                                  }
                                                  i10 = i1;
                                                } while (!i);
                                                i10 = i1;
                                                break label1208;
                                                i1 = g0.b((List)localUnsafe.getObject(paramObject, l1));
                                                i10 = i3;
                                                if (i1 <= 0) {
                                                  break;
                                                }
                                                i10 = i1;
                                              } while (!i);
                                              i10 = i1;
                                              break label1208;
                                              i1 = g0.g((List)localUnsafe.getObject(paramObject, l1));
                                              i10 = i3;
                                              if (i1 <= 0) {
                                                break;
                                              }
                                              i10 = i1;
                                            } while (!i);
                                            i10 = i1;
                                            break label1208;
                                            i1 = g0.i((List)localUnsafe.getObject(paramObject, l1));
                                            i10 = i3;
                                            if (i1 <= 0) {
                                              break;
                                            }
                                            i10 = i1;
                                          } while (!i);
                                          i10 = i1;
                                          break label1208;
                                          i1 = g0.l((List)localUnsafe.getObject(paramObject, l1));
                                          i10 = i3;
                                          if (i1 <= 0) {
                                            break;
                                          }
                                          i10 = i1;
                                        } while (!i);
                                        i10 = i1;
                                        break label1208;
                                        i1 = g0.y((List)localUnsafe.getObject(paramObject, l1));
                                        i10 = i3;
                                        if (i1 <= 0) {
                                          break;
                                        }
                                        i10 = i1;
                                      } while (!i);
                                      i10 = i1;
                                      break label1208;
                                      i1 = g0.n((List)localUnsafe.getObject(paramObject, l1));
                                      i10 = i3;
                                      if (i1 <= 0) {
                                        break;
                                      }
                                      i10 = i1;
                                    } while (!i);
                                    i10 = i1;
                                    break label1208;
                                    i1 = g0.g((List)localUnsafe.getObject(paramObject, l1));
                                    i10 = i3;
                                    if (i1 <= 0) {
                                      break;
                                    }
                                    i10 = i1;
                                  } while (!i);
                                  i10 = i1;
                                  break label1208;
                                  i1 = g0.i((List)localUnsafe.getObject(paramObject, l1));
                                  i10 = i3;
                                  if (i1 <= 0) {
                                    break;
                                  }
                                  i10 = i1;
                                } while (!i);
                                i10 = i1;
                              }
                              i10 = g0.s(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                              for (;;)
                              {
                                i10 = i3 + i10;
                                break label2466;
                                i10 = g0.q(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = g0.h(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = g0.f(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = g0.d(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = g0.v(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                break;
                                i10 = g0.c(i6, (List)localUnsafe.getObject(paramObject, l1));
                                break;
                                i10 = g0.p(i6, (List)localUnsafe.getObject(paramObject, l1), u(i2));
                                break;
                                i10 = g0.u(i6, (List)localUnsafe.getObject(paramObject, l1));
                                break;
                                i10 = g0.a(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = g0.k(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = g0.x(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                                continue;
                                i10 = g0.m(i6, (List)localUnsafe.getObject(paramObject, l1), false);
                              }
                              i10 = g0.h(i6, (List)localUnsafe.getObject(paramObject, l1), false);
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
                              if ((localObject instanceof h))
                              {
                                i10 = k.f(i6, (h)localObject);
                                break label534;
                              }
                              i10 = k.J(i6, (String)localObject);
                              break label534;
                              i10 = i3;
                              if ((i4 & i13) == 0) {
                                break label541;
                              }
                            }
                            i10 = i3;
                            if ((i4 & i13) != 0)
                            {
                              i10 = k.l(i6, 0);
                              for (;;)
                              {
                                i10 = i3 + i10;
                                break;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = k.n(i6, 0L);
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = k.t(i6, localUnsafe.getInt(paramObject, l1));
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = k.O(i6, localUnsafe.getLong(paramObject, l1));
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = k.v(i6, localUnsafe.getLong(paramObject, l1));
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = k.p(i6, 0.0F);
                                continue;
                                i10 = i3;
                                if ((i4 & i13) == 0) {
                                  break;
                                }
                                i10 = k.h(i6, 0.0D);
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
    i3 += y(o, paramObject);
    int i10 = i3;
    if (f) {
      i10 = i3 + p.c(paramObject).c();
    }
    return i10;
  }
  
  public final int w0(int paramInt)
  {
    return a[(paramInt + 1)];
  }
  
  public final int x(Object paramObject)
  {
    Unsafe localUnsafe = s;
    int i1 = 0;
    int i4;
    for (int i2 = i1; i1 < a.length; i2 = i4)
    {
      int i3 = w0(i1);
      i4 = v0(i3);
      int i5 = W(i1);
      long l1 = X(i3);
      if ((i4 >= u.c0.c()) && (i4 <= u.p0.c())) {
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
        if (I(paramObject, i5, i1)) {
          i4 = k.r(i5, (O)o0.C(paramObject, l1), u(i1));
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
          if (!I(paramObject, i5, i1)) {
            break;
          }
          l1 = c0(paramObject, l1);
          i4 = k.H(i5, l1);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = b0(paramObject, l1);
          i4 = k.F(i5, i4);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = k.D(i5, 0L);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = k.B(i5, 0);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = b0(paramObject, l1);
          i4 = k.j(i5, i4);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = b0(paramObject, l1);
          i4 = k.M(i5, i4);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          for (localObject1 = o0.C(paramObject, l1);; localObject1 = localObject2)
          {
            i4 = k.f(i5, (h)localObject1);
            break;
            i4 = i2;
            if (!I(paramObject, i5, i1)) {
              break label2244;
            }
            i4 = g0.o(i5, o0.C(paramObject, l1), u(i1));
            break;
            i4 = i2;
            if (!I(paramObject, i5, i1)) {
              break label2244;
            }
            localObject2 = o0.C(paramObject, l1);
            localObject1 = localObject2;
            if (!(localObject2 instanceof h)) {
              break label741;
            }
          }
          i4 = k.J(i5, (String)localObject1);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = k.d(i5, true);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = k.l(i5, 0);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = k.n(i5, 0L);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = b0(paramObject, l1);
          i4 = k.t(i5, i4);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          l1 = c0(paramObject, l1);
          i4 = k.O(i5, l1);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          l1 = c0(paramObject, l1);
          i4 = k.v(i5, l1);
          continue;
          i4 = i2;
          if (!I(paramObject, i5, i1)) {
            break;
          }
          i4 = k.p(i5, 0.0F);
        }
      case 51: 
        i4 = i2;
        if (!I(paramObject, i5, i1)) {
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
          i4 = k.h(i5, 0.0D);
          break label423;
          i4 = q.b(i5, o0.C(paramObject, l1), t(i1));
          break label423;
          i4 = g0.j(i5, K(paramObject, l1), u(i1));
          break label423;
          int i6 = g0.t((List)localUnsafe.getObject(paramObject, l1));
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
                                      i4 = k.L(i5) + k.N(i4) + i4;
                                      break;
                                      i6 = g0.r((List)localUnsafe.getObject(paramObject, l1));
                                      i4 = i2;
                                      if (i6 <= 0) {
                                        break label2244;
                                      }
                                      i4 = i6;
                                    } while (!i);
                                    i4 = i6;
                                    break label1078;
                                    i6 = g0.i((List)localUnsafe.getObject(paramObject, l1));
                                    i4 = i2;
                                    if (i6 <= 0) {
                                      break label2244;
                                    }
                                    i4 = i6;
                                  } while (!i);
                                  i4 = i6;
                                  break label1078;
                                  i6 = g0.g((List)localUnsafe.getObject(paramObject, l1));
                                  i4 = i2;
                                  if (i6 <= 0) {
                                    break label2244;
                                  }
                                  i4 = i6;
                                } while (!i);
                                i4 = i6;
                                break label1078;
                                i6 = g0.e((List)localUnsafe.getObject(paramObject, l1));
                                i4 = i2;
                                if (i6 <= 0) {
                                  break label2244;
                                }
                                i4 = i6;
                              } while (!i);
                              i4 = i6;
                              break label1078;
                              i6 = g0.w((List)localUnsafe.getObject(paramObject, l1));
                              i4 = i2;
                              if (i6 <= 0) {
                                break label2244;
                              }
                              i4 = i6;
                            } while (!i);
                            i4 = i6;
                            break label1078;
                            i6 = g0.b((List)localUnsafe.getObject(paramObject, l1));
                            i4 = i2;
                            if (i6 <= 0) {
                              break label2244;
                            }
                            i4 = i6;
                          } while (!i);
                          i4 = i6;
                          break label1078;
                          i6 = g0.g((List)localUnsafe.getObject(paramObject, l1));
                          i4 = i2;
                          if (i6 <= 0) {
                            break label2244;
                          }
                          i4 = i6;
                        } while (!i);
                        i4 = i6;
                        break label1078;
                        i6 = g0.i((List)localUnsafe.getObject(paramObject, l1));
                        i4 = i2;
                        if (i6 <= 0) {
                          break label2244;
                        }
                        i4 = i6;
                      } while (!i);
                      i4 = i6;
                      break label1078;
                      i6 = g0.l((List)localUnsafe.getObject(paramObject, l1));
                      i4 = i2;
                      if (i6 <= 0) {
                        break label2244;
                      }
                      i4 = i6;
                    } while (!i);
                    i4 = i6;
                    break label1078;
                    i6 = g0.y((List)localUnsafe.getObject(paramObject, l1));
                    i4 = i2;
                    if (i6 <= 0) {
                      break label2244;
                    }
                    i4 = i6;
                  } while (!i);
                  i4 = i6;
                  break label1078;
                  i6 = g0.n((List)localUnsafe.getObject(paramObject, l1));
                  i4 = i2;
                  if (i6 <= 0) {
                    break label2244;
                  }
                  i4 = i6;
                } while (!i);
                i4 = i6;
                break label1078;
                i6 = g0.g((List)localUnsafe.getObject(paramObject, l1));
                i4 = i2;
                if (i6 <= 0) {
                  break label2244;
                }
                i4 = i6;
              } while (!i);
              i4 = i6;
              break label1078;
              i6 = g0.i((List)localUnsafe.getObject(paramObject, l1));
              i4 = i2;
              if (i6 <= 0) {
                break label2244;
              }
              i4 = i6;
            } while (!i);
            i4 = i6;
          }
          i4 = g0.s(i5, K(paramObject, l1), false);
          break label423;
          i4 = g0.q(i5, K(paramObject, l1), false);
          break label423;
          i4 = g0.h(i5, K(paramObject, l1), false);
          break label423;
          i4 = g0.f(i5, K(paramObject, l1), false);
          break label423;
          i4 = g0.d(i5, K(paramObject, l1), false);
          break label423;
          i4 = g0.v(i5, K(paramObject, l1), false);
          break label423;
          i4 = g0.c(i5, K(paramObject, l1));
          break label423;
          i4 = g0.p(i5, K(paramObject, l1), u(i1));
          break label423;
          i4 = g0.u(i5, K(paramObject, l1));
          break label423;
          i4 = g0.a(i5, K(paramObject, l1), false);
          break label423;
          i4 = g0.k(i5, K(paramObject, l1), false);
          break label423;
          i4 = g0.x(i5, K(paramObject, l1), false);
          break label423;
          i4 = g0.m(i5, K(paramObject, l1), false);
          break label423;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          break;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          l1 = o0.A(paramObject, l1);
          break label456;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          i4 = o0.z(paramObject, l1);
          break label491;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          break label518;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          break label544;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          i4 = o0.z(paramObject, l1);
          break label578;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          i4 = o0.z(paramObject, l1);
          break label613;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          break label640;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          break label678;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          localObject2 = o0.C(paramObject, l1);
          localObject1 = localObject2;
          if (!(localObject2 instanceof h)) {
            break label741;
          }
          localObject1 = localObject2;
          break label738;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          break label771;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          break label797;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          break label823;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          i4 = o0.z(paramObject, l1);
          break label857;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          l1 = o0.A(paramObject, l1);
          break label892;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          l1 = o0.A(paramObject, l1);
          break label927;
          i4 = i2;
          if (!B(paramObject, i1)) {
            break label2244;
          }
          break label954;
          i4 = i2;
        } while (B(paramObject, i1));
      }
      label2244:
      i1 += 3;
    }
    return i2 + y(o, paramObject);
  }
  
  public final void x0(Object paramObject, r0 paramr0)
  {
    if (f)
    {
      localObject1 = p.c(paramObject);
      if (!((t)localObject1).d())
      {
        localIterator = ((t)localObject1).f();
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
      int i5 = w0(i3);
      int i6 = W(i3);
      int i7 = v0(i5);
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
        p.j(paramr0, (Map.Entry)localObject1);
        if (localIterator.hasNext()) {
          localObject1 = (Map.Entry)localIterator.next();
        } else {
          localObject1 = null;
        }
      }
      long l1 = X(i5);
      switch (i7)
      {
      }
      for (;;)
      {
        break;
        if (I(paramObject, i6, i3))
        {
          paramr0.O(i6, localUnsafe.getObject(paramObject, l1), u(i3));
          continue;
          if (I(paramObject, i6, i3))
          {
            paramr0.w(i6, c0(paramObject, l1));
            continue;
            if (I(paramObject, i6, i3))
            {
              paramr0.H(i6, b0(paramObject, l1));
              continue;
              if (I(paramObject, i6, i3))
              {
                paramr0.n(i6, c0(paramObject, l1));
                continue;
                if (I(paramObject, i6, i3))
                {
                  paramr0.g(i6, b0(paramObject, l1));
                  continue;
                  if (I(paramObject, i6, i3))
                  {
                    paramr0.D(i6, b0(paramObject, l1));
                    continue;
                    if (I(paramObject, i6, i3))
                    {
                      paramr0.e(i6, b0(paramObject, l1));
                      continue;
                      if (I(paramObject, i6, i3))
                      {
                        paramr0.M(i6, (h)localUnsafe.getObject(paramObject, l1));
                        continue;
                        if (I(paramObject, i6, i3))
                        {
                          paramr0.L(i6, localUnsafe.getObject(paramObject, l1), u(i3));
                          continue;
                          if (I(paramObject, i6, i3))
                          {
                            B0(i6, localUnsafe.getObject(paramObject, l1), paramr0);
                            continue;
                            if (I(paramObject, i6, i3))
                            {
                              paramr0.d(i6, Y(paramObject, l1));
                              continue;
                              if (I(paramObject, i6, i3))
                              {
                                paramr0.l(i6, b0(paramObject, l1));
                                continue;
                                if (I(paramObject, i6, i3))
                                {
                                  paramr0.u(i6, c0(paramObject, l1));
                                  continue;
                                  if (I(paramObject, i6, i3))
                                  {
                                    paramr0.i(i6, b0(paramObject, l1));
                                    continue;
                                    if (I(paramObject, i6, i3))
                                    {
                                      paramr0.C(i6, c0(paramObject, l1));
                                      continue;
                                      if (I(paramObject, i6, i3))
                                      {
                                        paramr0.c(i6, c0(paramObject, l1));
                                        continue;
                                        if (I(paramObject, i6, i3))
                                        {
                                          paramr0.x(i6, a0(paramObject, l1));
                                          continue;
                                          if (I(paramObject, i6, i3))
                                          {
                                            paramr0.m(i6, Z(paramObject, l1));
                                            continue;
                                            A0(paramr0, i6, localUnsafe.getObject(paramObject, l1), i3);
                                            continue;
                                            g0.T(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, u(i3));
                                            continue;
                                            g0.a0(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.Z(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.Y(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.X(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.P(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.c0(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.M(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.Q(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.R(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.U(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.d0(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.V(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.S(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.O(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, true);
                                            continue;
                                            g0.a0(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.Z(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.Y(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.X(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.P(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.c0(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.N(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0);
                                            continue;
                                            g0.W(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, u(i3));
                                            continue;
                                            g0.b0(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0);
                                            continue;
                                            g0.M(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.Q(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.R(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.U(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.d0(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.V(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.S(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            g0.O(W(i3), (List)localUnsafe.getObject(paramObject, l1), paramr0, false);
                                            break;
                                            if ((i9 & i4) != 0)
                                            {
                                              paramr0.O(i6, localUnsafe.getObject(paramObject, l1), u(i3));
                                              break;
                                              if ((i9 & i4) != 0)
                                              {
                                                paramr0.w(i6, localUnsafe.getLong(paramObject, l1));
                                                break;
                                                if ((i9 & i4) != 0)
                                                {
                                                  paramr0.H(i6, localUnsafe.getInt(paramObject, l1));
                                                  break;
                                                  if ((i9 & i4) != 0)
                                                  {
                                                    paramr0.n(i6, localUnsafe.getLong(paramObject, l1));
                                                    break;
                                                    if ((i9 & i4) != 0)
                                                    {
                                                      paramr0.g(i6, localUnsafe.getInt(paramObject, l1));
                                                      break;
                                                      if ((i9 & i4) != 0)
                                                      {
                                                        paramr0.D(i6, localUnsafe.getInt(paramObject, l1));
                                                        break;
                                                        if ((i9 & i4) != 0)
                                                        {
                                                          paramr0.e(i6, localUnsafe.getInt(paramObject, l1));
                                                          break;
                                                          if ((i9 & i4) != 0)
                                                          {
                                                            paramr0.M(i6, (h)localUnsafe.getObject(paramObject, l1));
                                                            break;
                                                            if ((i9 & i4) != 0)
                                                            {
                                                              paramr0.L(i6, localUnsafe.getObject(paramObject, l1), u(i3));
                                                              break;
                                                              if ((i9 & i4) != 0)
                                                              {
                                                                B0(i6, localUnsafe.getObject(paramObject, l1), paramr0);
                                                                break;
                                                                if ((i9 & i4) != 0)
                                                                {
                                                                  paramr0.d(i6, l(paramObject, l1));
                                                                  break;
                                                                  if ((i9 & i4) != 0)
                                                                  {
                                                                    paramr0.l(i6, localUnsafe.getInt(paramObject, l1));
                                                                    break;
                                                                    if ((i9 & i4) != 0)
                                                                    {
                                                                      paramr0.u(i6, localUnsafe.getLong(paramObject, l1));
                                                                      break;
                                                                      if ((i9 & i4) != 0)
                                                                      {
                                                                        paramr0.i(i6, localUnsafe.getInt(paramObject, l1));
                                                                        break;
                                                                        if ((i9 & i4) != 0)
                                                                        {
                                                                          paramr0.C(i6, localUnsafe.getLong(paramObject, l1));
                                                                          break;
                                                                          if ((i9 & i4) != 0)
                                                                          {
                                                                            paramr0.c(i6, localUnsafe.getLong(paramObject, l1));
                                                                            break;
                                                                            if ((i9 & i4) != 0)
                                                                            {
                                                                              paramr0.x(i6, r(paramObject, l1));
                                                                              break;
                                                                              if ((i9 & i4) != 0) {
                                                                                paramr0.m(i6, o(paramObject, l1));
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
      p.j(paramr0, (Map.Entry)localObject2);
      if (localIterator.hasNext()) {
        localObject2 = (Map.Entry)localIterator.next();
      } else {
        localObject2 = null;
      }
    }
    C0(o, paramObject, paramr0);
  }
  
  public final int y(k0 paramk0, Object paramObject)
  {
    return paramk0.h(paramk0.g(paramObject));
  }
  
  public final void y0(Object paramObject, r0 paramr0)
  {
    if (f)
    {
      localObject1 = p.c(paramObject);
      if (!((t)localObject1).d())
      {
        localIterator = ((t)localObject1).f();
        localObject1 = (Map.Entry)localIterator.next();
        break label49;
      }
    }
    Iterator localIterator = null;
    Object localObject1 = localIterator;
    label49:
    int i1 = a.length;
    Object localObject2;
    label500:
    label536:
    label572:
    label608:
    label644:
    label680:
    label705:
    label740:
    label778:
    label820:
    label856:
    label892:
    label928:
    label964:
    label1000:
    label1036:
    label2334:
    for (int i2 = 0;; i2 += 3)
    {
      localObject2 = localObject1;
      if (i2 >= i1) {
        break;
      }
      int i3 = w0(i2);
      int i4 = W(i2);
      while ((localObject1 != null) && (p.a((Map.Entry)localObject1) <= i4))
      {
        p.j(paramr0, (Map.Entry)localObject1);
        if (localIterator.hasNext()) {
          localObject1 = (Map.Entry)localIterator.next();
        } else {
          localObject1 = null;
        }
      }
      long l1;
      boolean bool;
      float f1;
      switch (v0(i3))
      {
      default: 
        break;
      case 68: 
        if (I(paramObject, i4, i2)) {
          paramr0.O(i4, o0.C(paramObject, X(i3)), u(i2));
        }
        break;
      case 67: 
        if (I(paramObject, i4, i2))
        {
          l1 = c0(paramObject, X(i3));
          paramr0.w(i4, l1);
        }
        break;
      case 66: 
        if (I(paramObject, i4, i2))
        {
          i3 = b0(paramObject, X(i3));
          paramr0.H(i4, i3);
        }
        break;
      case 65: 
        if (I(paramObject, i4, i2))
        {
          l1 = c0(paramObject, X(i3));
          paramr0.n(i4, l1);
        }
        break;
      case 64: 
        if (I(paramObject, i4, i2))
        {
          i3 = b0(paramObject, X(i3));
          paramr0.g(i4, i3);
        }
        break;
      case 63: 
        if (I(paramObject, i4, i2))
        {
          i3 = b0(paramObject, X(i3));
          paramr0.D(i4, i3);
        }
        break;
      case 62: 
        if (I(paramObject, i4, i2))
        {
          i3 = b0(paramObject, X(i3));
          paramr0.e(i4, i3);
        }
        break;
      case 61: 
        if (I(paramObject, i4, i2)) {
          paramr0.M(i4, (h)o0.C(paramObject, X(i3)));
        }
        break;
      case 60: 
        if (I(paramObject, i4, i2)) {
          paramr0.L(i4, o0.C(paramObject, X(i3)), u(i2));
        }
        break;
      case 59: 
        if (I(paramObject, i4, i2)) {
          B0(i4, o0.C(paramObject, X(i3)), paramr0);
        }
        break;
      case 58: 
        if (I(paramObject, i4, i2))
        {
          bool = Y(paramObject, X(i3));
          paramr0.d(i4, bool);
        }
        break;
      case 57: 
        if (I(paramObject, i4, i2))
        {
          i3 = b0(paramObject, X(i3));
          paramr0.l(i4, i3);
        }
        break;
      case 56: 
        if (I(paramObject, i4, i2))
        {
          l1 = c0(paramObject, X(i3));
          paramr0.u(i4, l1);
        }
        break;
      case 55: 
        if (I(paramObject, i4, i2))
        {
          i3 = b0(paramObject, X(i3));
          paramr0.i(i4, i3);
        }
        break;
      case 54: 
        if (I(paramObject, i4, i2))
        {
          l1 = c0(paramObject, X(i3));
          paramr0.C(i4, l1);
        }
        break;
      case 53: 
        if (I(paramObject, i4, i2))
        {
          l1 = c0(paramObject, X(i3));
          paramr0.c(i4, l1);
        }
        break;
      case 52: 
        if (I(paramObject, i4, i2))
        {
          f1 = a0(paramObject, X(i3));
          paramr0.x(i4, f1);
        }
        break;
      case 51: 
        if (!I(paramObject, i4, i2)) {
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
        for (double d1 = Z(paramObject, X(i3));; d1 = o(paramObject, X(i3)))
        {
          paramr0.m(i4, d1);
          break label2334;
          A0(paramr0, i4, o0.C(paramObject, X(i3)), i2);
          break label2334;
          g0.T(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, u(i2));
          break label2334;
          g0.a0(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.Z(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.Y(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.X(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.P(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.c0(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.M(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.Q(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.R(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.U(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.d0(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.V(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.S(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.O(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, true);
          break label2334;
          g0.a0(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.Z(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.Y(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.X(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.P(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.c0(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.N(W(i2), (List)o0.C(paramObject, X(i3)), paramr0);
          break label2334;
          g0.W(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, u(i2));
          break label2334;
          g0.b0(W(i2), (List)o0.C(paramObject, X(i3)), paramr0);
          break label2334;
          g0.M(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.Q(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.R(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.U(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.d0(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.V(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.S(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          g0.O(W(i2), (List)o0.C(paramObject, X(i3)), paramr0, false);
          break label2334;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          break;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          l1 = L(paramObject, X(i3));
          break label500;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          i3 = z(paramObject, X(i3));
          break label536;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          l1 = L(paramObject, X(i3));
          break label572;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          i3 = z(paramObject, X(i3));
          break label608;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          i3 = z(paramObject, X(i3));
          break label644;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          i3 = z(paramObject, X(i3));
          break label680;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          break label705;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          break label740;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          break label778;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          bool = l(paramObject, X(i3));
          break label820;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          i3 = z(paramObject, X(i3));
          break label856;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          l1 = L(paramObject, X(i3));
          break label892;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          i3 = z(paramObject, X(i3));
          break label928;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          l1 = L(paramObject, X(i3));
          break label964;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          l1 = L(paramObject, X(i3));
          break label1000;
          if (!B(paramObject, i2)) {
            break label2334;
          }
          f1 = r(paramObject, X(i3));
          break label1036;
          if (!B(paramObject, i2)) {
            break label2334;
          }
        }
      }
    }
    while (localObject2 != null)
    {
      p.j(paramr0, (Map.Entry)localObject2);
      if (localIterator.hasNext()) {
        localObject2 = (Map.Entry)localIterator.next();
      } else {
        localObject2 = null;
      }
    }
    C0(o, paramObject, paramr0);
  }
  
  public final void z0(Object paramObject, r0 paramr0)
  {
    C0(o, paramObject, paramr0);
    if (f)
    {
      localObject1 = p.c(paramObject);
      if (!((t)localObject1).d())
      {
        localIterator = ((t)localObject1).a();
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
      int i2 = w0(i1);
      int i3 = W(i1);
      while ((localObject2 != null) && (p.a((Map.Entry)localObject2) > i3))
      {
        p.j(paramr0, (Map.Entry)localObject2);
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
      switch (v0(i2))
      {
      default: 
        break;
      case 68: 
        if (I(paramObject, i3, i1)) {
          paramr0.O(i3, o0.C(paramObject, X(i2)), u(i1));
        }
        break;
      case 67: 
        if (I(paramObject, i3, i1))
        {
          l1 = c0(paramObject, X(i2));
          paramr0.w(i3, l1);
        }
        break;
      case 66: 
        if (I(paramObject, i3, i1))
        {
          i2 = b0(paramObject, X(i2));
          paramr0.H(i3, i2);
        }
        break;
      case 65: 
        if (I(paramObject, i3, i1))
        {
          l1 = c0(paramObject, X(i2));
          paramr0.n(i3, l1);
        }
        break;
      case 64: 
        if (I(paramObject, i3, i1))
        {
          i2 = b0(paramObject, X(i2));
          paramr0.g(i3, i2);
        }
        break;
      case 63: 
        if (I(paramObject, i3, i1))
        {
          i2 = b0(paramObject, X(i2));
          paramr0.D(i3, i2);
        }
        break;
      case 62: 
        if (I(paramObject, i3, i1))
        {
          i2 = b0(paramObject, X(i2));
          paramr0.e(i3, i2);
        }
        break;
      case 61: 
        if (I(paramObject, i3, i1)) {
          paramr0.M(i3, (h)o0.C(paramObject, X(i2)));
        }
        break;
      case 60: 
        if (I(paramObject, i3, i1)) {
          paramr0.L(i3, o0.C(paramObject, X(i2)), u(i1));
        }
        break;
      case 59: 
        if (I(paramObject, i3, i1)) {
          B0(i3, o0.C(paramObject, X(i2)), paramr0);
        }
        break;
      case 58: 
        if (I(paramObject, i3, i1))
        {
          bool = Y(paramObject, X(i2));
          paramr0.d(i3, bool);
        }
        break;
      case 57: 
        if (I(paramObject, i3, i1))
        {
          i2 = b0(paramObject, X(i2));
          paramr0.l(i3, i2);
        }
        break;
      case 56: 
        if (I(paramObject, i3, i1))
        {
          l1 = c0(paramObject, X(i2));
          paramr0.u(i3, l1);
        }
        break;
      case 55: 
        if (I(paramObject, i3, i1))
        {
          i2 = b0(paramObject, X(i2));
          paramr0.i(i3, i2);
        }
        break;
      case 54: 
        if (I(paramObject, i3, i1))
        {
          l1 = c0(paramObject, X(i2));
          paramr0.C(i3, l1);
        }
        break;
      case 53: 
        if (I(paramObject, i3, i1))
        {
          l1 = c0(paramObject, X(i2));
          paramr0.c(i3, l1);
        }
        break;
      case 52: 
        if (I(paramObject, i3, i1))
        {
          f1 = a0(paramObject, X(i2));
          paramr0.x(i3, f1);
        }
        break;
      case 51: 
        if (!I(paramObject, i3, i1)) {
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
        for (double d1 = Z(paramObject, X(i2));; d1 = o(paramObject, X(i2)))
        {
          paramr0.m(i3, d1);
          break label2350;
          A0(paramr0, i3, o0.C(paramObject, X(i2)), i1);
          break label2350;
          g0.T(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, u(i1));
          break label2350;
          g0.a0(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.Z(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.Y(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.X(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.P(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.c0(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.M(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.Q(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.R(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.U(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.d0(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.V(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.S(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.O(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, true);
          break label2350;
          g0.a0(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.Z(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.Y(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.X(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.P(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.c0(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.N(W(i1), (List)o0.C(paramObject, X(i2)), paramr0);
          break label2350;
          g0.W(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, u(i1));
          break label2350;
          g0.b0(W(i1), (List)o0.C(paramObject, X(i2)), paramr0);
          break label2350;
          g0.M(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.Q(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.R(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.U(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.d0(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.V(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.S(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          g0.O(W(i1), (List)o0.C(paramObject, X(i2)), paramr0, false);
          break label2350;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          break;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          l1 = L(paramObject, X(i2));
          break label516;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          i2 = z(paramObject, X(i2));
          break label552;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          l1 = L(paramObject, X(i2));
          break label588;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          i2 = z(paramObject, X(i2));
          break label624;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          i2 = z(paramObject, X(i2));
          break label660;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          i2 = z(paramObject, X(i2));
          break label696;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          break label721;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          break label756;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          break label794;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          bool = l(paramObject, X(i2));
          break label836;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          i2 = z(paramObject, X(i2));
          break label872;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          l1 = L(paramObject, X(i2));
          break label908;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          i2 = z(paramObject, X(i2));
          break label944;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          l1 = L(paramObject, X(i2));
          break label980;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          l1 = L(paramObject, X(i2));
          break label1016;
          if (!B(paramObject, i1)) {
            break label2350;
          }
          f1 = r(paramObject, X(i2));
          break label1052;
          if (!B(paramObject, i1)) {
            break label2350;
          }
        }
      }
      label2350:
      i1 -= 3;
    }
    while (localObject1 != null)
    {
      p.j(paramr0, (Map.Entry)localObject1);
      if (localIterator.hasNext()) {
        localObject1 = (Map.Entry)localIterator.next();
      } else {
        localObject1 = null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.S
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
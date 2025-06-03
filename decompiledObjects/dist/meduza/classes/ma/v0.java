package ma;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import q0.g;
import sun.misc.Unsafe;

public final class v0<T>
  implements i1<T>
{
  public static final int[] q = new int[0];
  public static final Unsafe r = t1.q();
  public final int[] a;
  public final Object[] b;
  public final int c;
  public final int d;
  public final s0 e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final int[] i;
  public final int j;
  public final int k;
  public final x0 l;
  public final i0 m;
  public final p1<?, ?> n;
  public final p<?> o;
  public final n0 p;
  
  public v0(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, s0 params0, int[] paramArrayOfInt2, int paramInt3, int paramInt4, x0 paramx0, i0 parami0, p1 paramp1, p paramp, n0 paramn0)
  {
    a = paramArrayOfInt1;
    b = paramArrayOfObject;
    c = paramInt1;
    d = paramInt2;
    g = (params0 instanceof w);
    boolean bool;
    if ((paramp != null) && (paramp.e(params0))) {
      bool = true;
    } else {
      bool = false;
    }
    f = bool;
    h = false;
    i = paramArrayOfInt2;
    j = paramInt3;
    k = paramInt4;
    l = paramx0;
    m = parami0;
    n = paramp1;
    o = paramp;
    e = params0;
    p = paramn0;
  }
  
  public static <T> v0<T> B(f1 paramf1, x0 paramx0, i0 parami0, p1<?, ?> paramp1, p<?> paramp, n0 paramn0)
  {
    String str = paramf1.e();
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
    int i10;
    int i11;
    if (i4 == 0)
    {
      arrayOfInt1 = q;
      i6 = 0;
      i7 = i6;
      i4 = i7;
      i8 = i4;
      i9 = i8;
      i2 = i9;
      i5 = i2;
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
      i3 = str.charAt(i3);
      i7 = i3;
      i5 = i4;
      if (i3 >= 55296)
      {
        i5 = i3 & 0x1FFF;
        i3 = 13;
        for (i6 = i4;; i6 = i4)
        {
          i4 = i6 + 1;
          i6 = str.charAt(i6);
          if (i6 < 55296) {
            break;
          }
          i5 |= (i6 & 0x1FFF) << i3;
          i3 += 13;
        }
        i7 = i5 | i6 << i3;
        i5 = i4;
      }
      i3 = i5 + 1;
      i5 = str.charAt(i5);
      i4 = i5;
      i6 = i3;
      if (i5 >= 55296)
      {
        i4 = i5 & 0x1FFF;
        i5 = 13;
        i6 = i3;
        i3 = i4;
        for (;;)
        {
          i4 = i6 + 1;
          i6 = str.charAt(i6);
          if (i6 < 55296) {
            break;
          }
          i3 |= (i6 & 0x1FFF) << i5;
          i5 += 13;
          i6 = i4;
        }
        i3 |= i6 << i5;
        i6 = i4;
        i4 = i3;
      }
      i5 = i6 + 1;
      i6 = str.charAt(i6);
      i3 = i6;
      i8 = i5;
      if (i6 >= 55296)
      {
        i3 = i6 & 0x1FFF;
        i6 = 13;
        i8 = i5;
        i5 = i3;
        for (;;)
        {
          i3 = i8 + 1;
          i8 = str.charAt(i8);
          if (i8 < 55296) {
            break;
          }
          i5 |= (i8 & 0x1FFF) << i6;
          i6 += 13;
          i8 = i3;
        }
        i5 |= i8 << i6;
        i8 = i3;
        i3 = i5;
      }
      i6 = i8 + 1;
      i8 = str.charAt(i8);
      i5 = i8;
      i9 = i6;
      if (i8 >= 55296)
      {
        i8 &= 0x1FFF;
        i5 = 13;
        for (i9 = i6;; i9 = i6)
        {
          i6 = i9 + 1;
          i9 = str.charAt(i9);
          if (i9 < 55296) {
            break;
          }
          i8 |= (i9 & 0x1FFF) << i5;
          i5 += 13;
        }
        i5 = i8 | i9 << i5;
        i9 = i6;
      }
      i8 = i9 + 1;
      i10 = str.charAt(i9);
      i6 = i10;
      i9 = i8;
      if (i10 >= 55296)
      {
        i6 = i10 & 0x1FFF;
        i9 = 13;
        i10 = i8;
        i8 = i6;
        for (;;)
        {
          i6 = i10 + 1;
          i10 = str.charAt(i10);
          if (i10 < 55296) {
            break;
          }
          i8 |= (i10 & 0x1FFF) << i9;
          i9 += 13;
          i10 = i6;
        }
        i8 |= i10 << i9;
        i9 = i6;
        i6 = i8;
      }
      i8 = i9 + 1;
      i11 = str.charAt(i9);
      i10 = i11;
      i9 = i8;
      if (i11 >= 55296)
      {
        i10 = i11 & 0x1FFF;
        i9 = 13;
        for (i11 = i8;; i11 = i8)
        {
          i8 = i11 + 1;
          i11 = str.charAt(i11);
          if (i11 < 55296) {
            break;
          }
          i10 |= (i11 & 0x1FFF) << i9;
          i9 += 13;
        }
        i10 |= i11 << i9;
        i9 = i8;
      }
      i11 = i9 + 1;
      i12 = str.charAt(i9);
      i8 = i12;
      i9 = i11;
      if (i12 >= 55296)
      {
        i8 = i12 & 0x1FFF;
        i9 = 13;
        i12 = i11;
        i11 = i8;
        for (;;)
        {
          i8 = i12 + 1;
          i12 = str.charAt(i12);
          if (i12 < 55296) {
            break;
          }
          i11 |= (i12 & 0x1FFF) << i9;
          i9 += 13;
          i12 = i8;
        }
        i11 |= i12 << i9;
        i9 = i8;
        i8 = i11;
      }
      arrayOfInt1 = new int[i8 + i6 + i10];
      i10 = i2;
      i11 = i9;
      i12 = i2 * 2 + i7;
      i2 = i8;
      i9 = i3;
      i8 = i4;
      i4 = i6;
      i7 = i5;
      i6 = i12;
      i5 = i10;
      i3 = i11;
    }
    Unsafe localUnsafe = r;
    Object[] arrayOfObject1 = paramf1.d();
    Class localClass = paramf1.b().getClass();
    int[] arrayOfInt2 = new int[i7 * 3];
    Object[] arrayOfObject2 = new Object[i7 * 2];
    int i13 = i2 + i4;
    i4 = i2;
    int i14 = i13;
    int i15 = 0;
    int i7 = 0;
    int i16 = i2;
    i2 = i9;
    int i12 = i8;
    int i17 = i5;
    i5 = i3;
    i3 = i1;
    while (i5 < i3)
    {
      i8 = i5 + 1;
      i1 = str.charAt(i5);
      if (i1 >= 55296)
      {
        i9 = i1 & 0x1FFF;
        i10 = i8;
        i8 = 13;
        for (;;)
        {
          i5 = i10 + 1;
          i10 = str.charAt(i10);
          if (i10 < 55296) {
            break;
          }
          i9 |= (i10 & 0x1FFF) << i8;
          i8 += 13;
          i10 = i5;
        }
        i1 = i9 | i10 << i8;
        i8 = i5;
      }
      i5 = i8 + 1;
      i9 = str.charAt(i8);
      if (i9 >= 55296)
      {
        i9 &= 0x1FFF;
        i10 = i5;
        i5 = 13;
        for (;;)
        {
          i8 = i10 + 1;
          i10 = str.charAt(i10);
          if (i10 < 55296) {
            break;
          }
          i9 |= (i10 & 0x1FFF) << i5;
          i5 += 13;
          i10 = i8;
        }
        i5 = i9 | i10 << i5;
      }
      else
      {
        i8 = i5;
        i5 = i9;
      }
      int i18 = i5 & 0xFF;
      int i19 = i7;
      if ((i5 & 0x400) != 0)
      {
        arrayOfInt1[i7] = i15;
        i19 = i7 + 1;
      }
      label1721:
      Object localObject;
      int i20;
      int i21;
      int i22;
      int i23;
      int i24;
      if (i18 >= 51)
      {
        i9 = i8 + 1;
        i7 = str.charAt(i8);
        if (i7 >= 55296)
        {
          i7 &= 0x1FFF;
          i8 = 13;
          for (i10 = i9;; i10 = i9)
          {
            i9 = i10 + 1;
            i10 = str.charAt(i10);
            if (i10 < 55296) {
              break;
            }
            i7 |= (i10 & 0x1FFF) << i8;
            i8 += 13;
          }
          i7 |= i10 << i8;
          i8 = i9;
        }
        else
        {
          i8 = i9;
        }
        i10 = i18 - 51;
        if ((i10 != 9) && (i10 != 17))
        {
          i9 = i6;
          if (i10 != 12) {
            break label1721;
          }
          if (!g.b(paramf1.c(), 1))
          {
            i9 = i6;
            if ((i5 & 0x800) == 0) {
              break label1721;
            }
          }
          i10 = i15 / 3;
          i9 = i6 + 1;
          arrayOfObject2[(i10 * 2 + 1)] = arrayOfObject1[i6];
          i6 = i9;
        }
        else
        {
          i10 = i15 / 3;
          i9 = i6 + 1;
          arrayOfObject2[(i10 * 2 + 1)] = arrayOfObject1[i6];
          i6 = i9;
        }
        i9 = i6;
        i6 = i7 * 2;
        localObject = arrayOfObject1[i6];
        if ((localObject instanceof Field))
        {
          localObject = (Field)localObject;
        }
        else
        {
          localObject = N(localClass, (String)localObject);
          arrayOfObject1[i6] = localObject;
        }
        i20 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        i6++;
        localObject = arrayOfObject1[i6];
        if ((localObject instanceof Field))
        {
          localObject = (Field)localObject;
        }
        else
        {
          localObject = N(localClass, (String)localObject);
          arrayOfObject1[i6] = localObject;
        }
        i21 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        i22 = 0;
        i23 = i4;
        i24 = i14;
        i6 = i2;
      }
      else
      {
        int i25 = i2;
        i2 = i6 + 1;
        localObject = N(localClass, (String)arrayOfObject1[i6]);
        if ((i18 != 9) && (i18 != 17))
        {
          if ((i18 != 27) && (i18 != 49))
          {
            if ((i18 != 12) && (i18 != 30) && (i18 != 44))
            {
              if (i18 == 50)
              {
                i6 = i4 + 1;
                arrayOfInt1[i4] = i15;
                i4 = i15 / 3 * 2;
                i9 = i2 + 1;
                arrayOfObject2[i4] = arrayOfObject1[i2];
                if ((i5 & 0x800) != 0)
                {
                  arrayOfObject2[(i4 + 1)] = arrayOfObject1[i9];
                  i2 = i9 + 1;
                  i4 = i6;
                }
                else
                {
                  i4 = i6;
                  i2 = i9;
                }
              }
            }
            else if ((paramf1.c() == 1) || ((i5 & 0x800) != 0))
            {
              i9 = i15 / 3;
              i6 = i2 + 1;
              arrayOfObject2[(i9 * 2 + 1)] = arrayOfObject1[i2];
              i2 = i6;
            }
          }
          else
          {
            i9 = i15 / 3;
            i6 = i2 + 1;
            arrayOfObject2[(i9 * 2 + 1)] = arrayOfObject1[i2];
            i2 = i6;
          }
        }
        else {
          arrayOfObject2[(i15 / 3 * 2 + 1)] = ((Field)localObject).getType();
        }
        int i26 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        if ((i5 & 0x1000) != 0) {
          i6 = 1;
        } else {
          i6 = 0;
        }
        if ((i6 != 0) && (i18 <= 17))
        {
          i9 = i8 + 1;
          i6 = str.charAt(i8);
          if (i6 >= 55296)
          {
            i8 = i6 & 0x1FFF;
            i6 = 13;
            for (;;)
            {
              i10 = i9 + 1;
              i9 = str.charAt(i9);
              if (i9 < 55296) {
                break;
              }
              i8 |= (i9 & 0x1FFF) << i6;
              i6 += 13;
              i9 = i10;
            }
            i6 = i8 | i9 << i6;
          }
          else
          {
            i10 = i9;
          }
          i8 = i6 / 32 + i17 * 2;
          localObject = arrayOfObject1[i8];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = N(localClass, (String)localObject);
            arrayOfObject1[i8] = localObject;
          }
          i7 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i11 = i6 % 32;
        }
        else
        {
          i7 = 1048575;
          i11 = 0;
          i10 = i8;
        }
        i22 = i11;
        i21 = i7;
        i20 = i26;
        i23 = i4;
        i24 = i14;
        i9 = i2;
        i8 = i10;
        i6 = i25;
        if (i18 >= 18)
        {
          i22 = i11;
          i21 = i7;
          i20 = i26;
          i23 = i4;
          i24 = i14;
          i9 = i2;
          i8 = i10;
          i6 = i25;
          if (i18 <= 49)
          {
            arrayOfInt1[i14] = i26;
            i24 = i14 + 1;
            i6 = i25;
            i8 = i10;
            i9 = i2;
            i23 = i4;
            i20 = i26;
            i21 = i7;
            i22 = i11;
          }
        }
      }
      i7 = i15 + 1;
      arrayOfInt2[i15] = i1;
      i10 = i7 + 1;
      if ((i5 & 0x200) != 0) {
        i2 = 536870912;
      } else {
        i2 = 0;
      }
      if ((i5 & 0x100) != 0) {
        i4 = 268435456;
      } else {
        i4 = 0;
      }
      if ((i5 & 0x800) != 0) {
        i5 = Integer.MIN_VALUE;
      } else {
        i5 = 0;
      }
      arrayOfInt2[i7] = (i18 << 20 | i5 | i2 | i4 | i20);
      i15 = i10 + 1;
      arrayOfInt2[i10] = (i22 << 20 | i21);
      i5 = i8;
      i2 = i6;
      i6 = i9;
      i7 = i19;
      i4 = i23;
      i14 = i24;
    }
    return new v0(arrayOfInt2, arrayOfObject2, i12, i2, paramf1.b(), arrayOfInt1, i16, i13, paramx0, parami0, paramp1, paramp, paramn0);
  }
  
  public static long C(int paramInt)
  {
    return paramInt & 0xFFFFF;
  }
  
  public static <T> int D(T paramT, long paramLong)
  {
    return ((Integer)t1.p(paramT, paramLong)).intValue();
  }
  
  public static <T> long E(T paramT, long paramLong)
  {
    return ((Long)t1.p(paramT, paramLong)).longValue();
  }
  
  public static Field N(Class<?> paramClass, String paramString)
  {
    try
    {
      Field localField1 = paramClass.getDeclaredField(paramString);
      return localField1;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (Field localField2 : paramClass.getDeclaredFields()) {
        if (paramString.equals(localField2.getName())) {
          return localField2;
        }
      }
      paramString = f.m("Field ", paramString, " for ");
      paramString.append(paramClass.getName());
      paramString.append(" not found. Known fields are ");
      paramString.append(Arrays.toString(???));
      throw new RuntimeException(paramString.toString());
    }
  }
  
  public static void l(Object paramObject)
  {
    if (u(paramObject)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Mutating immutable message: ");
    localStringBuilder.append(paramObject);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static int m(byte[] paramArrayOfByte, int paramInt1, int paramInt2, v1 paramv1, Class paramClass, f.a parama)
  {
    long l1;
    switch (paramv1.ordinal())
    {
    case 9: 
    default: 
      throw new RuntimeException("unsupported field type.");
    case 17: 
      paramInt1 = f.I(paramArrayOfByte, paramInt1, parama);
      l1 = i.c(b);
      break;
    case 16: 
      paramInt1 = f.G(paramArrayOfByte, paramInt1, parama);
      paramInt2 = i.b(a);
      break;
    case 11: 
      paramInt1 = f.b(paramArrayOfByte, paramInt1, parama);
      break;
    case 10: 
      paramInt1 = f.n(d1.c.a(paramClass), paramArrayOfByte, paramInt1, paramInt2, parama);
      break;
    case 8: 
      paramInt1 = f.D(paramArrayOfByte, paramInt1, parama);
      break;
    case 7: 
      paramInt1 = f.I(paramArrayOfByte, paramInt1, parama);
      boolean bool;
      if (b != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      paramArrayOfByte = Boolean.valueOf(bool);
      break;
    case 6: 
    case 14: 
      paramArrayOfByte = Integer.valueOf(f.g(paramArrayOfByte, paramInt1));
      break;
    case 5: 
    case 15: 
      paramArrayOfByte = Long.valueOf(f.i(paramArrayOfByte, paramInt1));
      break;
    case 4: 
    case 12: 
    case 13: 
      paramInt1 = f.G(paramArrayOfByte, paramInt1, parama);
      paramInt2 = a;
      paramArrayOfByte = Integer.valueOf(paramInt2);
      break;
    case 2: 
    case 3: 
      paramInt1 = f.I(paramArrayOfByte, paramInt1, parama);
      l1 = b;
      paramArrayOfByte = Long.valueOf(l1);
      c = paramArrayOfByte;
      break;
    case 1: 
      paramArrayOfByte = Float.valueOf(Float.intBitsToFloat(f.g(paramArrayOfByte, paramInt1)));
      c = paramArrayOfByte;
      paramInt1 += 4;
      break;
    }
    paramArrayOfByte = Double.valueOf(Double.longBitsToDouble(f.i(paramArrayOfByte, paramInt1)));
    c = paramArrayOfByte;
    paramInt1 += 8;
    return paramInt1;
  }
  
  public static q1 r(Object paramObject)
  {
    w localw = (w)paramObject;
    q1 localq1 = unknownFields;
    paramObject = localq1;
    if (localq1 == q1.f)
    {
      paramObject = new q1();
      unknownFields = ((q1)paramObject);
    }
    return (q1)paramObject;
  }
  
  public static boolean u(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if ((paramObject instanceof w)) {
      return ((w)paramObject).y();
    }
    return true;
  }
  
  public final Object A(T paramT, int paramInt1, int paramInt2)
  {
    i1 locali1 = q(paramInt2);
    if (!v(paramT, paramInt1, paramInt2)) {
      return locali1.f();
    }
    Object localObject = r.getObject(paramT, T(paramInt2) & 0xFFFFF);
    if (u(localObject)) {
      return localObject;
    }
    paramT = locali1.f();
    if (localObject != null) {
      locali1.a(paramT, localObject);
    }
    return paramT;
  }
  
  public final <K, V> int F(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, long paramLong, f.a parama)
  {
    Object localObject1 = r;
    Object localObject2 = p(paramInt3);
    Object localObject3 = ((Unsafe)localObject1).getObject(paramT, paramLong);
    Object localObject4 = localObject3;
    if (p.g(localObject3))
    {
      localObject4 = p.d();
      p.a(localObject4, localObject3);
      ((Unsafe)localObject1).putObject(paramT, paramLong, localObject4);
    }
    localObject3 = p.c(localObject2);
    localObject2 = p.e(localObject4);
    paramInt1 = f.G(paramArrayOfByte, paramInt1, parama);
    paramInt3 = a;
    if ((paramInt3 >= 0) && (paramInt3 <= paramInt2 - paramInt1))
    {
      int i1 = paramInt3 + paramInt1;
      paramT = b;
      localObject4 = d;
      while (paramInt1 < i1)
      {
        int i2 = paramInt1 + 1;
        int i3 = paramArrayOfByte[paramInt1];
        paramInt3 = i2;
        paramInt1 = i3;
        if (i3 < 0)
        {
          paramInt3 = f.F(i3, paramArrayOfByte, i2, parama);
          paramInt1 = a;
        }
        i2 = paramInt1 >>> 3;
        i3 = paramInt1 & 0x7;
        if (i2 != 1)
        {
          if (i2 == 2)
          {
            localObject1 = c;
            if (i3 == b)
            {
              paramInt1 = m(paramArrayOfByte, paramInt3, paramInt2, (v1)localObject1, d.getClass(), parama);
              localObject4 = c;
            }
          }
        }
        else
        {
          localObject1 = a;
          if (i3 == b)
          {
            paramInt1 = m(paramArrayOfByte, paramInt3, paramInt2, (v1)localObject1, null, parama);
            paramT = c;
            continue;
          }
        }
        paramInt1 = f.M(paramInt1, paramArrayOfByte, paramInt3, paramInt2, parama);
      }
      if (paramInt1 == i1)
      {
        ((m0)localObject2).put(paramT, localObject4);
        return i1;
      }
      throw b0.g();
    }
    throw b0.h();
  }
  
  public final int G(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, f.a parama)
  {
    l(paramT);
    Unsafe localUnsafe = r;
    int i1 = paramInt3;
    int i2 = 0;
    int i3 = -1;
    int i4 = 0;
    int i5 = 1048575;
    int i6 = 0;
    Object localObject1;
    int i8;
    int i9;
    label194:
    int i10;
    int i11;
    long l1;
    int i13;
    for (;;)
    {
      localObject1 = this;
      T ? = paramT;
      Object localObject2 = paramArrayOfByte;
      Object localObject3 = parama;
      if (paramInt1 >= paramInt2) {
        break label1705;
      }
      i7 = paramInt1 + 1;
      i2 = localObject2[paramInt1];
      if (i2 < 0)
      {
        i7 = f.F(i2, (byte[])localObject2, i7, (f.a)localObject3);
        i2 = a;
      }
      i8 = i2 >>> 3;
      i9 = i2 & 0x7;
      if (i8 > i3)
      {
        paramInt1 = i4 / 3;
        if ((i8 >= c) && (i8 <= d)) {
          paramInt1 = ((v0)localObject1).Q(i8, paramInt1);
        } else {
          paramInt1 = -1;
        }
      }
      else if ((i8 >= c) && (i8 <= d))
      {
        paramInt1 = ((v0)localObject1).Q(i8, 0);
      }
      else
      {
        paramInt1 = -1;
      }
      if (paramInt1 == -1)
      {
        paramInt1 = i1;
        i1 = 0;
        i3 = i6;
        i6 = i2;
        i2 = i3;
        break label1615;
      }
      localObject3 = a;
      i10 = localObject3[(paramInt1 + 1)];
      i11 = (i10 & 0xFF00000) >>> 20;
      l1 = i10 & 0xFFFFF;
      if (i11 <= 17)
      {
        i1 = localObject3[(paramInt1 + 2)];
        int i12 = 1 << (i1 >>> 20);
        i1 &= 0xFFFFF;
        if (i1 != i5)
        {
          if (i5 != 1048575) {
            localUnsafe.putInt(?, i5, i6);
          }
          i6 = i1;
          if (i6 == 1048575) {
            i1 = 0;
          } else {
            i1 = localUnsafe.getInt(?, i6);
          }
          i5 = i6;
        }
        else
        {
          i1 = i6;
        }
        long l2;
        switch (i11)
        {
        default: 
          i6 = paramInt1;
          break;
        case 17: 
          if (i9 == 3)
          {
            localObject2 = ((v0)localObject1).z(paramInt1, ?);
            i7 = f.K(localObject2, ((v0)localObject1).q(paramInt1), paramArrayOfByte, i7, paramInt2, i8 << 3 | 0x4, parama);
            ((v0)localObject1).R(paramInt1, ?, localObject2);
            i6 = i1 | i12;
            break label1352;
          }
          i6 = paramInt1;
          break;
        case 16: 
          if (i9 == 0)
          {
            localObject1 = parama;
            i6 = f.I((byte[])localObject2, i7, (f.a)localObject1);
            l2 = i.c(b);
          }
          break;
        case 15: 
          localObject1 = parama;
          if (i9 == 0)
          {
            i7 = f.G((byte[])localObject2, i7, (f.a)localObject1);
            i6 = i.b(a);
          }
        case 12: 
          for (;;)
          {
            i3 = paramInt1;
            paramInt1 = i7;
            i7 = i6;
            i6 = i3;
            break label1048;
            i3 = paramInt1;
            localObject3 = parama;
            if (i9 != 0) {
              break label799;
            }
            i4 = f.G((byte[])localObject2, i7, (f.a)localObject3);
            i9 = a;
            localObject1 = ((v0)localObject1).o(i3);
            if ((i10 & 0x80000000) != 0) {
              i13 = 1;
            } else {
              i13 = 0;
            }
            i7 = i4;
            i6 = i9;
            if (i13 != 0)
            {
              i7 = i4;
              i6 = i9;
              if (localObject1 != null)
              {
                if (!((a0.b)localObject1).a()) {
                  break;
                }
                i7 = i4;
                i6 = i9;
              }
            }
          }
          r(paramT).c(i2, Long.valueOf(i9));
          i7 = i3;
          i6 = i1;
          paramInt1 = i4;
          break;
        case 10: 
          if (i9 == 2) {
            i6 = f.b((byte[])localObject2, i7, parama);
          }
          break;
        case 9: 
          i6 = paramInt1;
          if (i9 == 2)
          {
            localObject3 = ((v0)localObject1).z(i6, ?);
            localObject2 = ((v0)localObject1).q(i6);
            paramInt1 = f.L(localObject3, (i1)localObject2, paramArrayOfByte, i7, paramInt2, parama);
            ((v0)localObject1).R(i6, ?, localObject3);
            break label1188;
          }
          i6 = paramInt1;
          break;
        case 8: 
          i3 = i7;
          localObject1 = parama;
          i6 = paramInt1;
          if (i9 != 2) {
            break label1210;
          }
          if ((i10 & 0x20000000) != 0) {
            i6 = 1;
          } else {
            i6 = 0;
          }
          if (i6 != 0) {
            i6 = f.D((byte[])localObject2, i3, (f.a)localObject1);
          } else {
            i6 = f.A((byte[])localObject2, i3, (f.a)localObject1);
          }
          i7 = paramInt1;
          localUnsafe.putObject(?, l1, c);
          paramInt1 = i6;
          i6 = i7;
          break;
        case 7: 
          localObject1 = parama;
          i3 = paramInt1;
          i6 = i3;
          if (i9 != 0) {
            break label1210;
          }
          paramInt1 = f.I((byte[])localObject2, i7, (f.a)localObject1);
          boolean bool;
          if (b != 0L) {
            bool = true;
          } else {
            bool = false;
          }
          t1.r(?, l1, bool);
          i6 = i3;
          break;
        case 6: 
        case 13: 
          i6 = paramInt1;
          if (i9 != 5) {
            break label1210;
          }
          localUnsafe.putInt(?, l1, f.g((byte[])localObject2, i7));
          break;
        case 5: 
        case 14: 
          i6 = paramInt1;
          if (i9 != 1) {
            break label1210;
          }
          localUnsafe.putLong(paramT, l1, f.i((byte[])localObject2, i7));
          break;
        case 4: 
        case 11: 
          localObject1 = parama;
          i6 = paramInt1;
          if (i9 != 0) {
            break label1210;
          }
          i3 = f.G((byte[])localObject2, i7, (f.a)localObject1);
          i7 = a;
          i6 = paramInt1;
          paramInt1 = i3;
          localUnsafe.putInt(?, l1, i7);
          break;
        case 2: 
        case 3: 
          localObject1 = parama;
          i6 = paramInt1;
          if (i9 != 0) {
            break label1210;
          }
          i6 = f.I((byte[])localObject2, i7, (f.a)localObject1);
          l2 = b;
          i7 = paramInt1;
          localUnsafe.putLong(paramT, l1, l2);
          i1 |= i12;
          paramInt1 = i6;
          i6 = i1;
          break;
        case 1: 
          label799:
          label1048:
          i6 = paramInt1;
          if (i9 != 5) {
            break label1210;
          }
          t1.w(?, l1, f.k((byte[])localObject2, i7));
          i6 = paramInt1;
          paramInt1 = i7 + 4;
          break;
        }
        i6 = paramInt1;
        if (i9 == 1)
        {
          t1.v(?, l1, f.d((byte[])localObject2, i7));
          i7 += 8;
          i6 = paramInt1;
          paramInt1 = i7;
          label1188:
          i1 |= i12;
          i7 = i6;
          i6 = i1;
          i4 = i7;
        }
        else
        {
          label1210:
          paramInt1 = paramInt3;
          i3 = i1;
          i1 = i6;
          i6 = i2;
          i2 = i3;
          break label1615;
        }
      }
      else
      {
        i1 = paramInt1;
        if (i11 != 27) {
          break label1372;
        }
        if (i9 != 2) {
          break;
        }
        localObject3 = (a0.d)localUnsafe.getObject(?, l1);
        localObject2 = localObject3;
        if (!((a0.d)localObject3).g())
        {
          i3 = ((List)localObject3).size();
          if (i3 == 0) {
            i3 = 10;
          } else {
            i3 *= 2;
          }
          localObject2 = ((a0.d)localObject3).c(i3);
          localUnsafe.putObject(?, l1, localObject2);
        }
        localObject1 = ((v0)localObject1).q(i1);
        i7 = f.o((i1)localObject1, i2, paramArrayOfByte, i7, paramInt2, (a0.d)localObject2, parama);
        label1352:
        i4 = paramInt1;
        paramInt1 = i7;
      }
      i3 = i8;
      i1 = paramInt3;
    }
    break label1487;
    label1372:
    i4 = i5;
    i3 = i6;
    if (i11 <= 49)
    {
      i13 = I(paramT, paramArrayOfByte, i7, paramInt2, i2, i8, i9, i1, i10, i11, l1, parama);
      i1 = i13;
      if (i13 == i7) {
        break label1598;
      }
      i6 = i13;
    }
    else
    {
      i13 = i7;
      if (i11 == 50)
      {
        if (i9 == 2)
        {
          i7 = F(paramT, paramArrayOfByte, i13, paramInt2, i1, l1, parama);
          i1 = i7;
          if (i7 == i13) {
            break label1598;
          }
          i6 = i7;
        }
        else
        {
          label1487:
          i1 = paramInt1;
          i3 = i6;
          i6 = i2;
          paramInt1 = paramInt3;
          i2 = i3;
          break label1615;
        }
      }
      else
      {
        i7 = H(paramT, paramArrayOfByte, i13, paramInt2, i2, i8, i9, i10, i11, l1, i1, parama);
        i1 = i7;
        if (i7 == i13) {
          break label1598;
        }
        i6 = i7;
      }
    }
    i1 = paramInt1;
    int i7 = i2;
    paramInt1 = paramInt3;
    i5 = i4;
    i2 = i3;
    i3 = paramInt1;
    paramInt1 = i6;
    for (;;)
    {
      i6 = i2;
      i4 = i1;
      i1 = i3;
      i2 = i7;
      i3 = i8;
      break;
      label1598:
      i3 = paramInt1;
      paramInt1 = paramInt3;
      i7 = i1;
      i1 = i3;
      break label194;
      label1615:
      if ((i6 == paramInt1) && (paramInt1 != 0))
      {
        paramArrayOfByte = this;
        paramInt3 = i7;
        break label1726;
      }
      if ((f) && (d != o.a())) {
        i7 = f.f(i6, paramArrayOfByte, i7, paramInt2, paramT, e, parama);
      } else {
        i7 = f.E(i6, paramArrayOfByte, i7, paramInt2, r(paramT), parama);
      }
      i3 = paramInt1;
      paramInt1 = i7;
      i7 = i6;
    }
    label1705:
    paramArrayOfByte = (byte[])localObject1;
    paramInt3 = paramInt1;
    paramInt1 = i1;
    i7 = i2;
    i2 = i6;
    i6 = i7;
    label1726:
    if (i5 != 1048575) {
      localUnsafe.putInt(paramT, i5, i2);
    }
    i2 = j;
    parama = null;
    while (i2 < k)
    {
      parama = (q1)n(paramT, i[i2], parama, n, paramT);
      i2++;
    }
    if (parama != null) {
      n.n(paramT, parama);
    }
    if (paramInt1 == 0)
    {
      if (paramInt3 != paramInt2) {
        throw b0.g();
      }
    }
    else {
      if ((paramInt3 > paramInt2) || (i6 != paramInt1)) {
        break label1844;
      }
    }
    return paramInt3;
    label1844:
    throw b0.g();
  }
  
  public final int H(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, int paramInt8, f.a parama)
  {
    Object localObject = r;
    long l1 = a[(paramInt8 + 2)] & 0xFFFFF;
    long l2;
    switch (paramInt7)
    {
    default: 
      break;
    case 68: 
      if (paramInt5 != 3) {
        return paramInt1;
      }
      localObject = A(paramT, paramInt4, paramInt8);
      paramInt1 = f.K(localObject, q(paramInt8), paramArrayOfByte, paramInt1, paramInt2, paramInt3 & 0xFFFFFFF8 | 0x4, parama);
      paramArrayOfByte = (byte[])localObject;
      break;
    case 67: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = f.I(paramArrayOfByte, paramInt1, parama);
      l2 = i.c(b);
      break;
    case 66: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = f.G(paramArrayOfByte, paramInt1, parama);
      paramInt2 = i.b(a);
      break;
    case 63: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = f.G(paramArrayOfByte, paramInt1, parama);
      paramInt2 = a;
      paramArrayOfByte = o(paramInt8);
      if ((paramArrayOfByte != null) && (!paramArrayOfByte.a()))
      {
        r(paramT).c(paramInt3, Long.valueOf(paramInt2));
      }
      else
      {
        ((Unsafe)localObject).putObject(paramT, paramLong, Integer.valueOf(paramInt2));
        ((Unsafe)localObject).putInt(paramT, l1, paramInt4);
      }
      break;
    case 61: 
      if (paramInt5 != 2) {
        return paramInt1;
      }
      paramInt1 = f.b(paramArrayOfByte, paramInt1, parama);
      paramArrayOfByte = c;
      break;
    case 60: 
      if (paramInt5 != 2) {
        return paramInt1;
      }
      localObject = A(paramT, paramInt4, paramInt8);
      paramInt1 = f.L(localObject, q(paramInt8), paramArrayOfByte, paramInt1, paramInt2, parama);
      paramArrayOfByte = (byte[])localObject;
      S(paramT, paramInt4, paramInt8, paramArrayOfByte);
      break;
    case 59: 
      if (paramInt5 != 2) {
        return paramInt1;
      }
      paramInt1 = f.G(paramArrayOfByte, paramInt1, parama);
      paramInt2 = a;
      if (paramInt2 == 0)
      {
        paramArrayOfByte = "";
      }
      else
      {
        if (((paramInt6 & 0x20000000) != 0) && (!u1.e(paramArrayOfByte, paramInt1, paramInt1 + paramInt2))) {
          throw b0.c();
        }
        ((Unsafe)localObject).putObject(paramT, paramLong, new String(paramArrayOfByte, paramInt1, paramInt2, a0.a));
        paramInt1 += paramInt2;
      }
      break;
    case 58: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = f.I(paramArrayOfByte, paramInt1, parama);
      boolean bool;
      if (b != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      paramArrayOfByte = Boolean.valueOf(bool);
      break;
    case 57: 
    case 64: 
      if (paramInt5 != 5) {
        return paramInt1;
      }
      paramArrayOfByte = Integer.valueOf(f.g(paramArrayOfByte, paramInt1));
      break;
    case 56: 
    case 65: 
      if (paramInt5 != 1) {
        return paramInt1;
      }
      paramArrayOfByte = Long.valueOf(f.i(paramArrayOfByte, paramInt1));
      break;
    case 55: 
    case 62: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = f.G(paramArrayOfByte, paramInt1, parama);
      paramInt2 = a;
      paramArrayOfByte = Integer.valueOf(paramInt2);
      break;
    case 53: 
    case 54: 
      if (paramInt5 != 0) {
        return paramInt1;
      }
      paramInt1 = f.I(paramArrayOfByte, paramInt1, parama);
      l2 = b;
      paramArrayOfByte = Long.valueOf(l2);
      ((Unsafe)localObject).putObject(paramT, paramLong, paramArrayOfByte);
      break;
    case 52: 
      if (paramInt5 != 5) {
        return paramInt1;
      }
      paramArrayOfByte = Float.valueOf(f.k(paramArrayOfByte, paramInt1));
      ((Unsafe)localObject).putObject(paramT, paramLong, paramArrayOfByte);
      paramInt1 += 4;
      break;
    }
    if (paramInt5 == 1)
    {
      paramArrayOfByte = Double.valueOf(f.d(paramArrayOfByte, paramInt1));
      ((Unsafe)localObject).putObject(paramT, paramLong, paramArrayOfByte);
      paramInt1 += 8;
      ((Unsafe)localObject).putInt(paramT, l1, paramInt4);
    }
    return paramInt1;
  }
  
  public final int I(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, int paramInt7, long paramLong2, f.a parama)
  {
    Unsafe localUnsafe = r;
    a0.d locald1 = (a0.d)localUnsafe.getObject(paramT, paramLong2);
    a0.d locald2 = locald1;
    if (!locald1.g())
    {
      int i1 = locald1.size();
      if (i1 == 0) {
        i1 = 10;
      } else {
        i1 *= 2;
      }
      locald2 = locald1.c(i1);
      localUnsafe.putObject(paramT, paramLong2, locald2);
    }
    switch (paramInt7)
    {
    default: 
      break;
    case 49: 
      if (paramInt5 == 3) {
        paramInt1 = f.m(q(paramInt6), paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 34: 
    case 48: 
      if (paramInt5 == 2) {
        paramInt1 = f.v(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = f.z(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 33: 
    case 47: 
      if (paramInt5 == 2) {
        paramInt1 = f.u(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = f.y(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 30: 
    case 44: 
      if (paramInt5 == 2)
      {
        paramInt1 = f.w(paramArrayOfByte, paramInt1, locald2, parama);
      }
      else
      {
        if (paramInt5 != 0) {
          break;
        }
        paramInt1 = f.H(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      j1.z(paramT, paramInt4, locald2, o(paramInt6), null, n);
      break;
    case 28: 
      if (paramInt5 == 2) {
        paramInt1 = f.c(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 27: 
      if (paramInt5 == 2) {
        paramInt1 = f.o(q(paramInt6), paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 26: 
      if (paramInt5 == 2) {
        if ((paramLong1 & 0x20000000) == 0L) {
          paramInt1 = f.B(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
        } else {
          paramInt1 = f.C(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
        }
      }
      break;
    case 25: 
    case 42: 
      if (paramInt5 == 2) {
        paramInt1 = f.p(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = f.a(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 24: 
    case 31: 
    case 41: 
    case 45: 
      if (paramInt5 == 2) {
        paramInt1 = f.r(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 5) {
        paramInt1 = f.h(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 23: 
    case 32: 
    case 40: 
    case 46: 
      if (paramInt5 == 2) {
        paramInt1 = f.s(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 1) {
        paramInt1 = f.j(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 22: 
    case 29: 
    case 39: 
    case 43: 
      if (paramInt5 == 2) {
        paramInt1 = f.w(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = f.H(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 20: 
    case 21: 
    case 37: 
    case 38: 
      if (paramInt5 == 2) {
        paramInt1 = f.x(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 0) {
        paramInt1 = f.J(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 19: 
    case 36: 
      if (paramInt5 == 2) {
        paramInt1 = f.t(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 5) {
        paramInt1 = f.l(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    case 18: 
    case 35: 
      if (paramInt5 == 2) {
        paramInt1 = f.q(paramArrayOfByte, paramInt1, locald2, parama);
      } else if (paramInt5 == 1) {
        paramInt1 = f.e(paramInt3, paramArrayOfByte, paramInt1, paramInt2, locald2, parama);
      }
      break;
    }
    return paramInt1;
  }
  
  public final <E> void J(Object paramObject, long paramLong, g1 paramg1, i1<E> parami1, o paramo)
  {
    paramObject = m.c(paramObject, paramLong);
    j localj = (j)paramg1;
    int i1 = b;
    if ((i1 & 0x7) == 3)
    {
      do
      {
        paramg1 = parami1.f();
        localj.b(paramg1, parami1, paramo);
        parami1.b(paramg1);
        ((List)paramObject).add(paramg1);
        if ((a.e()) || (d != 0)) {
          break;
        }
        i2 = a.x();
      } while (i2 == i1);
      d = i2;
      return;
    }
    int i2 = b0.c;
    throw new b0.a();
  }
  
  public final <E> void K(Object paramObject, int paramInt, g1 paramg1, i1<E> parami1, o paramo)
  {
    long l1 = paramInt & 0xFFFFF;
    paramObject = m.c(paramObject, l1);
    paramg1 = (j)paramg1;
    paramInt = b;
    if ((paramInt & 0x7) == 2)
    {
      int i1;
      do
      {
        Object localObject = parami1.f();
        paramg1.c(localObject, parami1, paramo);
        parami1.b(localObject);
        ((List)paramObject).add(localObject);
        if ((a.e()) || (d != 0)) {
          break;
        }
        i1 = a.x();
      } while (i1 == paramInt);
      d = i1;
      return;
    }
    paramInt = b0.c;
    throw new b0.a();
  }
  
  public final void L(Object paramObject, int paramInt, g1 paramg1)
  {
    int i1;
    if ((0x20000000 & paramInt) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    long l1;
    if (i1 != 0)
    {
      l1 = paramInt & 0xFFFFF;
      paramg1 = (j)paramg1;
      paramg1.w(2);
      paramg1 = a.w();
    }
    else
    {
      boolean bool = g;
      paramInt &= 0xFFFFF;
      if (bool)
      {
        l1 = paramInt;
        paramg1 = (j)paramg1;
        paramg1.w(2);
        paramg1 = a.v();
      }
      else
      {
        l1 = paramInt;
        paramg1 = ((j)paramg1).e();
      }
    }
    t1.z(paramObject, l1, paramg1);
  }
  
  public final void M(Object paramObject, int paramInt, g1 paramg1)
  {
    int i1;
    if ((0x20000000 & paramInt) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      paramObject = m.c(paramObject, paramInt & 0xFFFFF);
      ((j)paramg1).s((List)paramObject, true);
    }
    else
    {
      paramObject = m.c(paramObject, paramInt & 0xFFFFF);
      ((j)paramg1).s((List)paramObject, false);
    }
  }
  
  public final void O(int paramInt, Object paramObject)
  {
    paramInt = a[(paramInt + 2)];
    long l1 = 0xFFFFF & paramInt;
    if (l1 == 1048575L) {
      return;
    }
    t1.x(paramObject, 1 << (paramInt >>> 20) | t1.n(paramObject, l1), l1);
  }
  
  public final void P(T paramT, int paramInt1, int paramInt2)
  {
    t1.x(paramT, paramInt1, a[(paramInt2 + 2)] & 0xFFFFF);
  }
  
  public final int Q(int paramInt1, int paramInt2)
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
  
  public final void R(int paramInt, Object paramObject1, Object paramObject2)
  {
    r.putObject(paramObject1, T(paramInt) & 0xFFFFF, paramObject2);
    O(paramInt, paramObject1);
  }
  
  public final void S(T paramT, int paramInt1, int paramInt2, Object paramObject)
  {
    r.putObject(paramT, T(paramInt2) & 0xFFFFF, paramObject);
    P(paramT, paramInt1, paramInt2);
  }
  
  public final int T(int paramInt)
  {
    return a[(paramInt + 1)];
  }
  
  public final void U(Object paramObject, l paraml)
  {
    if (f)
    {
      localObject1 = o.c(paramObject);
      if (!((s)localObject1).i())
      {
        localIterator = ((s)localObject1).l();
        localObject1 = (Map.Entry)localIterator.next();
        break label48;
      }
    }
    Object localObject1 = null;
    Iterator localIterator = null;
    label48:
    int i1 = a.length;
    Unsafe localUnsafe = r;
    int i2 = 1048575;
    int i3 = 0;
    for (int i4 = 0; i4 < i1; i4 += 3)
    {
      int i5 = T(i4);
      Object localObject2 = a;
      int i6 = localObject2[i4];
      int i7 = (i5 & 0xFF00000) >>> 20;
      int i9;
      if (i7 <= 17)
      {
        int i8 = localObject2[(i4 + 2)];
        i9 = i8 & 0xFFFFF;
        if (i9 != i2)
        {
          if (i9 == 1048575) {
            i3 = 0;
          } else {
            i3 = localUnsafe.getInt(paramObject, i9);
          }
          i2 = i9;
        }
        i9 = 1 << (i8 >>> 20);
      }
      else
      {
        i9 = 0;
      }
      while (localObject1 != null)
      {
        o.a((Map.Entry)localObject1);
        if (i6 < 0) {
          break;
        }
        o.j((Map.Entry)localObject1);
        if (localIterator.hasNext()) {
          localObject1 = (Map.Entry)localIterator.next();
        } else {
          localObject1 = null;
        }
      }
      long l1 = i5 & 0xFFFFF;
      switch (i7)
      {
      }
      for (;;)
      {
        break;
        if (v(paramObject, i6, i4))
        {
          localObject2 = localUnsafe.getObject(paramObject, l1);
          paraml.h(i6, q(i4), localObject2);
          continue;
          if (v(paramObject, i6, i4))
          {
            paraml.p(i6, E(paramObject, l1));
            continue;
            if (v(paramObject, i6, i4))
            {
              paraml.o(i6, D(paramObject, l1));
              continue;
              if (v(paramObject, i6, i4))
              {
                paraml.n(i6, E(paramObject, l1));
                continue;
                if (v(paramObject, i6, i4))
                {
                  paraml.m(i6, D(paramObject, l1));
                  continue;
                  if (v(paramObject, i6, i4))
                  {
                    paraml.d(i6, D(paramObject, l1));
                    continue;
                    if (v(paramObject, i6, i4))
                    {
                      paraml.q(i6, D(paramObject, l1));
                      continue;
                      if (v(paramObject, i6, i4))
                      {
                        paraml.b(i6, (h)localUnsafe.getObject(paramObject, l1));
                        continue;
                        if (v(paramObject, i6, i4))
                        {
                          localObject2 = localUnsafe.getObject(paramObject, l1);
                          paraml.k(i6, q(i4), localObject2);
                          continue;
                          if (v(paramObject, i6, i4))
                          {
                            localObject2 = localUnsafe.getObject(paramObject, l1);
                            if ((localObject2 instanceof String))
                            {
                              localObject2 = (String)localObject2;
                              a.i0(i6, (String)localObject2);
                            }
                            else
                            {
                              paraml.b(i6, (h)localObject2);
                              continue;
                              if (v(paramObject, i6, i4))
                              {
                                paraml.a(i6, ((Boolean)t1.p(paramObject, l1)).booleanValue());
                                continue;
                                if (v(paramObject, i6, i4))
                                {
                                  paraml.e(i6, D(paramObject, l1));
                                  continue;
                                  if (v(paramObject, i6, i4))
                                  {
                                    paraml.f(i6, E(paramObject, l1));
                                    continue;
                                    if (v(paramObject, i6, i4))
                                    {
                                      paraml.i(i6, D(paramObject, l1));
                                      continue;
                                      if (v(paramObject, i6, i4))
                                      {
                                        paraml.r(i6, E(paramObject, l1));
                                        continue;
                                        if (v(paramObject, i6, i4))
                                        {
                                          paraml.j(i6, E(paramObject, l1));
                                          continue;
                                          if (v(paramObject, i6, i4))
                                          {
                                            paraml.g(((Float)t1.p(paramObject, l1)).floatValue(), i6);
                                            continue;
                                            if (v(paramObject, i6, i4))
                                            {
                                              paraml.c(i6, ((Double)t1.p(paramObject, l1)).doubleValue());
                                              continue;
                                              Object localObject3 = localUnsafe.getObject(paramObject, l1);
                                              if (localObject3 != null)
                                              {
                                                localObject2 = p.c(p(i4));
                                                localObject3 = p.h(localObject3);
                                                a.getClass();
                                                localObject3 = ((m0)localObject3).entrySet().iterator();
                                                while (((Iterator)localObject3).hasNext())
                                                {
                                                  Map.Entry localEntry = (Map.Entry)((Iterator)localObject3).next();
                                                  a.k0(i6, 2);
                                                  a.m0(l0.a((l0.a)localObject2, localEntry.getKey(), localEntry.getValue()));
                                                  l0.b(a, (l0.a)localObject2, localEntry.getKey(), localEntry.getValue());
                                                }
                                                continue;
                                                j1.K(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, q(i4));
                                                continue;
                                                i9 = a[i4];
                                                localObject2 = (List)localUnsafe.getObject(paramObject, l1);
                                                boolean bool = true;
                                                break label1630;
                                                i9 = a[i4];
                                                bool = true;
                                                break label1655;
                                                i9 = a[i4];
                                                bool = true;
                                                break label1689;
                                                i9 = a[i4];
                                                bool = true;
                                                break label1723;
                                                i9 = a[i4];
                                                bool = true;
                                                break label1757;
                                                i9 = a[i4];
                                                bool = true;
                                                break label1791;
                                                j1.D(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, true);
                                                continue;
                                                j1.H(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, true);
                                                continue;
                                                j1.I(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, true);
                                                continue;
                                                j1.L(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, true);
                                                continue;
                                                j1.U(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, true);
                                                continue;
                                                j1.M(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, true);
                                                continue;
                                                j1.J(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, true);
                                                continue;
                                                j1.F(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, true);
                                                continue;
                                                i9 = a[i4];
                                                localObject2 = (List)localUnsafe.getObject(paramObject, l1);
                                                bool = false;
                                                label1630:
                                                j1.R(i9, (List)localObject2, paraml, bool);
                                                continue;
                                                i9 = a[i4];
                                                bool = false;
                                                label1655:
                                                j1.Q(i9, (List)localUnsafe.getObject(paramObject, l1), paraml, bool);
                                                continue;
                                                i9 = a[i4];
                                                bool = false;
                                                label1689:
                                                j1.P(i9, (List)localUnsafe.getObject(paramObject, l1), paraml, bool);
                                                continue;
                                                i9 = a[i4];
                                                bool = false;
                                                label1723:
                                                j1.O(i9, (List)localUnsafe.getObject(paramObject, l1), paraml, bool);
                                                continue;
                                                i9 = a[i4];
                                                bool = false;
                                                label1757:
                                                j1.G(i9, (List)localUnsafe.getObject(paramObject, l1), paraml, bool);
                                                continue;
                                                i9 = a[i4];
                                                bool = false;
                                                label1791:
                                                j1.T(i9, (List)localUnsafe.getObject(paramObject, l1), paraml, bool);
                                                continue;
                                                j1.E(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml);
                                                continue;
                                                j1.N(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, q(i4));
                                                continue;
                                                j1.S(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml);
                                                continue;
                                                j1.D(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, false);
                                                continue;
                                                j1.H(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, false);
                                                continue;
                                                j1.I(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, false);
                                                continue;
                                                j1.L(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, false);
                                                continue;
                                                j1.U(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, false);
                                                continue;
                                                j1.M(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, false);
                                                continue;
                                                j1.J(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, false);
                                                continue;
                                                j1.F(a[i4], (List)localUnsafe.getObject(paramObject, l1), paraml, false);
                                                continue;
                                                if (t(paramObject, i4, i2, i3, i9))
                                                {
                                                  localObject2 = localUnsafe.getObject(paramObject, l1);
                                                  paraml.h(i6, q(i4), localObject2);
                                                  break;
                                                  if (t(paramObject, i4, i2, i3, i9))
                                                  {
                                                    paraml.p(i6, localUnsafe.getLong(paramObject, l1));
                                                    break;
                                                    if (t(paramObject, i4, i2, i3, i9))
                                                    {
                                                      paraml.o(i6, localUnsafe.getInt(paramObject, l1));
                                                      break;
                                                      if (t(paramObject, i4, i2, i3, i9))
                                                      {
                                                        paraml.n(i6, localUnsafe.getLong(paramObject, l1));
                                                        break;
                                                        if (t(paramObject, i4, i2, i3, i9))
                                                        {
                                                          paraml.m(i6, localUnsafe.getInt(paramObject, l1));
                                                          break;
                                                          if (t(paramObject, i4, i2, i3, i9))
                                                          {
                                                            paraml.d(i6, localUnsafe.getInt(paramObject, l1));
                                                            break;
                                                            if (t(paramObject, i4, i2, i3, i9))
                                                            {
                                                              paraml.q(i6, localUnsafe.getInt(paramObject, l1));
                                                              break;
                                                              if (t(paramObject, i4, i2, i3, i9))
                                                              {
                                                                paraml.b(i6, (h)localUnsafe.getObject(paramObject, l1));
                                                                break;
                                                                if (t(paramObject, i4, i2, i3, i9))
                                                                {
                                                                  localObject2 = localUnsafe.getObject(paramObject, l1);
                                                                  paraml.k(i6, q(i4), localObject2);
                                                                  break;
                                                                  if (t(paramObject, i4, i2, i3, i9))
                                                                  {
                                                                    localObject2 = localUnsafe.getObject(paramObject, l1);
                                                                    if ((localObject2 instanceof String))
                                                                    {
                                                                      localObject2 = (String)localObject2;
                                                                      a.i0(i6, (String)localObject2);
                                                                    }
                                                                    else
                                                                    {
                                                                      paraml.b(i6, (h)localObject2);
                                                                      break;
                                                                      if (t(paramObject, i4, i2, i3, i9))
                                                                      {
                                                                        paraml.a(i6, t1.g(paramObject, l1));
                                                                        break;
                                                                        if (t(paramObject, i4, i2, i3, i9))
                                                                        {
                                                                          paraml.e(i6, localUnsafe.getInt(paramObject, l1));
                                                                          break;
                                                                          if (t(paramObject, i4, i2, i3, i9))
                                                                          {
                                                                            paraml.f(i6, localUnsafe.getLong(paramObject, l1));
                                                                            break;
                                                                            if (t(paramObject, i4, i2, i3, i9))
                                                                            {
                                                                              paraml.i(i6, localUnsafe.getInt(paramObject, l1));
                                                                              break;
                                                                              if (t(paramObject, i4, i2, i3, i9))
                                                                              {
                                                                                paraml.r(i6, localUnsafe.getLong(paramObject, l1));
                                                                                break;
                                                                                if (t(paramObject, i4, i2, i3, i9))
                                                                                {
                                                                                  paraml.j(i6, localUnsafe.getLong(paramObject, l1));
                                                                                  break;
                                                                                  if (t(paramObject, i4, i2, i3, i9))
                                                                                  {
                                                                                    paraml.g(t1.m(paramObject, l1), i6);
                                                                                    break;
                                                                                    if (t(paramObject, i4, i2, i3, i9)) {
                                                                                      paraml.c(i6, t1.l(paramObject, l1));
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
          }
        }
      }
    }
    while (localObject1 != null)
    {
      o.j((Map.Entry)localObject1);
      if (localIterator.hasNext()) {
        localObject1 = (Map.Entry)localIterator.next();
      } else {
        localObject1 = null;
      }
    }
    localObject1 = n;
    ((p1)localObject1).s(((p1)localObject1).g(paramObject), paraml);
  }
  
  /* Error */
  public final void a(T paramT1, T paramT2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 423	ma/v0:l	(Ljava/lang/Object;)V
    //   4: aload_2
    //   5: invokevirtual 121	java/lang/Object:getClass	()Ljava/lang/Class;
    //   8: pop
    //   9: iconst_0
    //   10: istore_3
    //   11: iload_3
    //   12: aload_0
    //   13: getfield 56	ma/v0:a	[I
    //   16: arraylength
    //   17: if_icmpge +724 -> 741
    //   20: aload_0
    //   21: iload_3
    //   22: invokevirtual 350	ma/v0:T	(I)I
    //   25: istore 4
    //   27: ldc -112
    //   29: iload 4
    //   31: iand
    //   32: i2l
    //   33: lstore 5
    //   35: aload_0
    //   36: getfield 56	ma/v0:a	[I
    //   39: iload_3
    //   40: iaload
    //   41: istore 7
    //   43: iload 4
    //   45: ldc_w 428
    //   48: iand
    //   49: bipush 20
    //   51: iushr
    //   52: tableswitch	default:+292->344, 0:+656->708, 1:+632->684, 2:+608->660, 3:+596->648, 4:+572->624, 5:+560->612, 6:+548->600, 7:+524->576, 8:+500->552, 9:+490->542, 10:+478->530, 11:+466->518, 12:+454->506, 13:+442->494, 14:+430->482, 15:+418->470, 16:+406->458, 17:+490->542, 18:+392->444, 19:+392->444, 20:+392->444, 21:+392->444, 22:+392->444, 23:+392->444, 24:+392->444, 25:+392->444, 26:+392->444, 27:+392->444, 28:+392->444, 29:+392->444, 30:+392->444, 31:+392->444, 32:+392->444, 33:+392->444, 34:+392->444, 35:+392->444, 36:+392->444, 37:+392->444, 38:+392->444, 39:+392->444, 40:+392->444, 41:+392->444, 42:+392->444, 43:+392->444, 44:+392->444, 45:+392->444, 46:+392->444, 47:+392->444, 48:+392->444, 49:+392->444, 50:+353->405, 51:+319->371, 52:+319->371, 53:+319->371, 54:+319->371, 55:+319->371, 56:+319->371, 57:+319->371, 58:+319->371, 59:+319->371, 60:+309->361, 61:+295->347, 62:+295->347, 63:+295->347, 64:+295->347, 65:+295->347, 66:+295->347, 67:+295->347, 68:+309->361
    //   344: goto +391 -> 735
    //   347: aload_0
    //   348: aload_2
    //   349: iload 7
    //   351: iload_3
    //   352: invokevirtual 344	ma/v0:v	(Ljava/lang/Object;II)Z
    //   355: ifeq +380 -> 735
    //   358: goto +24 -> 382
    //   361: aload_0
    //   362: iload_3
    //   363: aload_1
    //   364: aload_2
    //   365: invokevirtual 865	ma/v0:y	(ILjava/lang/Object;Ljava/lang/Object;)V
    //   368: goto +367 -> 735
    //   371: aload_0
    //   372: aload_2
    //   373: iload 7
    //   375: iload_3
    //   376: invokevirtual 344	ma/v0:v	(Ljava/lang/Object;II)Z
    //   379: ifeq +356 -> 735
    //   382: aload_1
    //   383: lload 5
    //   385: aload_2
    //   386: lload 5
    //   388: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   391: invokestatic 659	ma/t1:z	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   394: aload_0
    //   395: aload_1
    //   396: iload 7
    //   398: iload_3
    //   399: invokevirtual 677	ma/v0:P	(Ljava/lang/Object;II)V
    //   402: goto +333 -> 735
    //   405: aload_0
    //   406: getfield 93	ma/v0:p	Lma/n0;
    //   409: astore 8
    //   411: getstatic 868	ma/j1:a	Ljava/lang/Class;
    //   414: astore 9
    //   416: aload_1
    //   417: lload 5
    //   419: aload 8
    //   421: aload_1
    //   422: lload 5
    //   424: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   427: aload_2
    //   428: lload 5
    //   430: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   433: invokeinterface 372 3 0
    //   438: invokestatic 659	ma/t1:z	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   441: goto +294 -> 735
    //   444: aload_0
    //   445: getfield 85	ma/v0:m	Lma/i0;
    //   448: aload_1
    //   449: lload 5
    //   451: aload_2
    //   452: invokevirtual 870	ma/i0:b	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   455: goto +280 -> 735
    //   458: aload_0
    //   459: iload_3
    //   460: aload_2
    //   461: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   464: ifeq +271 -> 735
    //   467: goto +202 -> 669
    //   470: aload_0
    //   471: iload_3
    //   472: aload_2
    //   473: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   476: ifeq +259 -> 735
    //   479: goto +154 -> 633
    //   482: aload_0
    //   483: iload_3
    //   484: aload_2
    //   485: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   488: ifeq +247 -> 735
    //   491: goto +178 -> 669
    //   494: aload_0
    //   495: iload_3
    //   496: aload_2
    //   497: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   500: ifeq +235 -> 735
    //   503: goto +130 -> 633
    //   506: aload_0
    //   507: iload_3
    //   508: aload_2
    //   509: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   512: ifeq +223 -> 735
    //   515: goto +118 -> 633
    //   518: aload_0
    //   519: iload_3
    //   520: aload_2
    //   521: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   524: ifeq +211 -> 735
    //   527: goto +106 -> 633
    //   530: aload_0
    //   531: iload_3
    //   532: aload_2
    //   533: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   536: ifeq +199 -> 735
    //   539: goto +22 -> 561
    //   542: aload_0
    //   543: iload_3
    //   544: aload_1
    //   545: aload_2
    //   546: invokevirtual 875	ma/v0:x	(ILjava/lang/Object;Ljava/lang/Object;)V
    //   549: goto +186 -> 735
    //   552: aload_0
    //   553: iload_3
    //   554: aload_2
    //   555: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   558: ifeq +177 -> 735
    //   561: aload_1
    //   562: lload 5
    //   564: aload_2
    //   565: lload 5
    //   567: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   570: invokestatic 659	ma/t1:z	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   573: goto +156 -> 729
    //   576: aload_0
    //   577: iload_3
    //   578: aload_2
    //   579: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   582: ifeq +153 -> 735
    //   585: aload_1
    //   586: lload 5
    //   588: aload_2
    //   589: lload 5
    //   591: invokestatic 853	ma/t1:g	(Ljava/lang/Object;J)Z
    //   594: invokestatic 468	ma/t1:r	(Ljava/lang/Object;JZ)V
    //   597: goto +132 -> 729
    //   600: aload_0
    //   601: iload_3
    //   602: aload_2
    //   603: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   606: ifeq +129 -> 735
    //   609: goto +24 -> 633
    //   612: aload_0
    //   613: iload_3
    //   614: aload_2
    //   615: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   618: ifeq +117 -> 735
    //   621: goto +48 -> 669
    //   624: aload_0
    //   625: iload_3
    //   626: aload_2
    //   627: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   630: ifeq +105 -> 735
    //   633: aload_1
    //   634: aload_2
    //   635: lload 5
    //   637: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   640: lload 5
    //   642: invokestatic 670	ma/t1:x	(Ljava/lang/Object;IJ)V
    //   645: goto +84 -> 729
    //   648: aload_0
    //   649: iload_3
    //   650: aload_2
    //   651: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   654: ifeq +81 -> 735
    //   657: goto +12 -> 669
    //   660: aload_0
    //   661: iload_3
    //   662: aload_2
    //   663: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   666: ifeq +69 -> 735
    //   669: aload_1
    //   670: lload 5
    //   672: aload_2
    //   673: lload 5
    //   675: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   678: invokestatic 879	ma/t1:y	(Ljava/lang/Object;JJ)V
    //   681: goto +48 -> 729
    //   684: aload_0
    //   685: iload_3
    //   686: aload_2
    //   687: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   690: ifeq +45 -> 735
    //   693: aload_1
    //   694: lload 5
    //   696: aload_2
    //   697: lload 5
    //   699: invokestatic 856	ma/t1:m	(Ljava/lang/Object;J)F
    //   702: invokestatic 479	ma/t1:w	(Ljava/lang/Object;JF)V
    //   705: goto +24 -> 729
    //   708: aload_0
    //   709: iload_3
    //   710: aload_2
    //   711: invokevirtual 873	ma/v0:s	(ILjava/lang/Object;)Z
    //   714: ifeq +21 -> 735
    //   717: aload_1
    //   718: lload 5
    //   720: aload_2
    //   721: lload 5
    //   723: invokestatic 859	ma/t1:l	(Ljava/lang/Object;J)D
    //   726: invokestatic 485	ma/t1:v	(Ljava/lang/Object;JD)V
    //   729: aload_0
    //   730: iload_3
    //   731: aload_1
    //   732: invokevirtual 675	ma/v0:O	(ILjava/lang/Object;)V
    //   735: iinc 3 3
    //   738: goto -727 -> 11
    //   741: aload_0
    //   742: getfield 87	ma/v0:n	Lma/p1;
    //   745: astore 8
    //   747: getstatic 868	ma/j1:a	Ljava/lang/Class;
    //   750: astore 9
    //   752: aload 8
    //   754: aload_1
    //   755: aload 8
    //   757: aload 8
    //   759: aload_1
    //   760: invokevirtual 861	ma/p1:g	(Ljava/lang/Object;)Lma/q1;
    //   763: aload 8
    //   765: aload_2
    //   766: invokevirtual 861	ma/p1:g	(Ljava/lang/Object;)Lma/q1;
    //   769: invokevirtual 882	ma/p1:k	(Ljava/lang/Object;Ljava/lang/Object;)Lma/q1;
    //   772: invokevirtual 884	ma/p1:o	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   775: aload_0
    //   776: getfield 73	ma/v0:f	Z
    //   779: ifeq +12 -> 791
    //   782: aload_0
    //   783: getfield 89	ma/v0:o	Lma/p;
    //   786: aload_1
    //   787: aload_2
    //   788: invokestatic 887	ma/j1:A	(Lma/p;Ljava/lang/Object;Ljava/lang/Object;)V
    //   791: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	792	0	this	v0
    //   0	792	1	paramT1	T
    //   0	792	2	paramT2	T
    //   10	726	3	i1	int
    //   25	24	4	i2	int
    //   33	689	5	l1	long
    //   41	356	7	i3	int
    //   409	355	8	localObject	Object
    //   414	337	9	localClass	Class
  }
  
  public final void b(T paramT)
  {
    if (!u(paramT)) {
      return;
    }
    Object localObject;
    if ((paramT instanceof w))
    {
      localObject = (w)paramT;
      ((w)localObject).r();
      ((w)localObject).q();
      ((w)localObject).z();
    }
    int i1 = a.length;
    for (int i2 = 0; i2 < i1; i2 += 3)
    {
      int i3 = T(i2);
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
          Unsafe localUnsafe = r;
          localObject = localUnsafe.getObject(paramT, l1);
          if (localObject == null) {
            continue;
          }
          localUnsafe.putObject(paramT, l1, p.b(localObject));
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
          m.a(paramT, l1);
          continue;
          if (!v(paramT, a[i2], i2)) {
            continue;
          }
          break;
        }
      }
      else
      {
        if (!s(i2, paramT)) {
          continue;
        }
      }
      q(i2).b(r.getObject(paramT, l1));
    }
    n.j(paramT);
    if (f) {
      o.f(paramT);
    }
  }
  
  public final boolean c(T paramT)
  {
    int i1 = 1048575;
    int i2 = 0;
    for (int i3 = i2;; i3++)
    {
      int i4 = j;
      int i5 = 1;
      int i6 = 1;
      if (i3 >= i4) {
        break;
      }
      int i7 = i[i3];
      int i8 = a[i7];
      int i9 = T(i7);
      int i10 = a[(i7 + 2)];
      i4 = i10 & 0xFFFFF;
      i10 = 1 << (i10 >>> 20);
      if (i4 != i1)
      {
        if (i4 != 1048575) {
          i2 = r.getInt(paramT, i4);
        }
        i1 = i4;
      }
      if ((0x10000000 & i9) != 0) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      if ((i4 != 0) && (!t(paramT, i7, i1, i2, i10))) {
        return false;
      }
      i4 = (0xFF00000 & i9) >>> 20;
      if ((i4 != 9) && (i4 != 17))
      {
        Object localObject1;
        if (i4 != 27) {
          if ((i4 != 60) && (i4 != 68))
          {
            if (i4 != 49)
            {
              if (i4 != 50) {
                continue;
              }
              localObject1 = p.h(t1.p(paramT, i9 & 0xFFFFF));
              if (((HashMap)localObject1).isEmpty())
              {
                i4 = i6;
              }
              else
              {
                localObject2 = p(i7);
                if (p.c(localObject2).c.a != w1.r)
                {
                  i4 = i6;
                }
                else
                {
                  localObject2 = null;
                  Iterator localIterator = ((LinkedHashMap)localObject1).values().iterator();
                  Object localObject3;
                  do
                  {
                    i4 = i6;
                    if (!localIterator.hasNext()) {
                      break;
                    }
                    localObject3 = localIterator.next();
                    localObject1 = localObject2;
                    if (localObject2 == null) {
                      localObject1 = d1.c.a(localObject3.getClass());
                    }
                    localObject2 = localObject1;
                  } while (((i1)localObject1).c(localObject3));
                  i4 = 0;
                }
              }
              if (i4 != 0) {
                continue;
              }
              return false;
            }
          }
          else
          {
            if ((!v(paramT, i8, i7)) || (q(i7).c(t1.p(paramT, i9 & 0xFFFFF)))) {
              continue;
            }
            return false;
          }
        }
        Object localObject2 = (List)t1.p(paramT, i9 & 0xFFFFF);
        if (((List)localObject2).isEmpty())
        {
          i6 = i5;
        }
        else
        {
          localObject1 = q(i7);
          for (i4 = 0;; i4++)
          {
            i6 = i5;
            if (i4 >= ((List)localObject2).size()) {
              break;
            }
            if (!((i1)localObject1).c(((List)localObject2).get(i4)))
            {
              i6 = 0;
              break;
            }
          }
        }
        if (i6 == 0) {
          return false;
        }
      }
      else if ((t(paramT, i7, i1, i2, i10)) && (!q(i7).c(t1.p(paramT, i9 & 0xFFFFF))))
      {
        return false;
      }
    }
    return (!f) || (o.c(paramT).j());
  }
  
  /* Error */
  public final boolean d(T paramT1, T paramT2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	ma/v0:a	[I
    //   4: arraylength
    //   5: istore_3
    //   6: iconst_0
    //   7: istore 4
    //   9: iconst_1
    //   10: istore 5
    //   12: iload 4
    //   14: iload_3
    //   15: if_icmpge +973 -> 988
    //   18: aload_0
    //   19: iload 4
    //   21: invokevirtual 350	ma/v0:T	(I)I
    //   24: istore 6
    //   26: iload 6
    //   28: ldc -112
    //   30: iand
    //   31: i2l
    //   32: lstore 7
    //   34: iload 6
    //   36: ldc_w 428
    //   39: iand
    //   40: bipush 20
    //   42: iushr
    //   43: tableswitch	default:+289->332, 0:+893->936, 1:+858->901, 2:+828->871, 3:+798->841, 4:+769->812, 5:+739->782, 6:+710->753, 7:+681->724, 8:+649->692, 9:+617->660, 10:+585->628, 11:+556->599, 12:+527->570, 13:+498->541, 14:+468->511, 15:+439->482, 16:+409->452, 17:+377->420, 18:+357->400, 19:+357->400, 20:+357->400, 21:+357->400, 22:+357->400, 23:+357->400, 24:+357->400, 25:+357->400, 26:+357->400, 27:+357->400, 28:+357->400, 29:+357->400, 30:+357->400, 31:+357->400, 32:+357->400, 33:+357->400, 34:+357->400, 35:+357->400, 36:+357->400, 37:+357->400, 38:+357->400, 39:+357->400, 40:+357->400, 41:+357->400, 42:+357->400, 43:+357->400, 44:+357->400, 45:+357->400, 46:+357->400, 47:+357->400, 48:+357->400, 49:+357->400, 50:+357->400, 51:+292->335, 52:+292->335, 53:+292->335, 54:+292->335, 55:+292->335, 56:+292->335, 57:+292->335, 58:+292->335, 59:+292->335, 60:+292->335, 61:+292->335, 62:+292->335, 63:+292->335, 64:+292->335, 65:+292->335, 66:+292->335, 67:+292->335, 68:+292->335
    //   332: goto +643 -> 975
    //   335: aload_0
    //   336: getfield 56	ma/v0:a	[I
    //   339: iload 4
    //   341: iconst_2
    //   342: iadd
    //   343: iaload
    //   344: ldc -112
    //   346: iand
    //   347: i2l
    //   348: lstore 9
    //   350: aload_1
    //   351: lload 9
    //   353: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   356: aload_2
    //   357: lload 9
    //   359: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   362: if_icmpne +9 -> 371
    //   365: iconst_1
    //   366: istore 6
    //   368: goto +6 -> 374
    //   371: iconst_0
    //   372: istore 6
    //   374: iload 6
    //   376: ifeq +596 -> 972
    //   379: aload_1
    //   380: lload 7
    //   382: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   385: aload_2
    //   386: lload 7
    //   388: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   391: invokestatic 938	ma/j1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   394: ifeq +578 -> 972
    //   397: goto +578 -> 975
    //   400: aload_1
    //   401: lload 7
    //   403: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   406: aload_2
    //   407: lload 7
    //   409: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   412: invokestatic 938	ma/j1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   415: istore 5
    //   417: goto +558 -> 975
    //   420: aload_0
    //   421: iload 4
    //   423: aload_1
    //   424: aload_2
    //   425: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   428: ifeq +544 -> 972
    //   431: aload_1
    //   432: lload 7
    //   434: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   437: aload_2
    //   438: lload 7
    //   440: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   443: invokestatic 938	ma/j1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   446: ifeq +526 -> 972
    //   449: goto +526 -> 975
    //   452: aload_0
    //   453: iload 4
    //   455: aload_1
    //   456: aload_2
    //   457: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   460: ifeq +512 -> 972
    //   463: aload_1
    //   464: lload 7
    //   466: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   469: aload_2
    //   470: lload 7
    //   472: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   475: lcmp
    //   476: ifne +496 -> 972
    //   479: goto +496 -> 975
    //   482: aload_0
    //   483: iload 4
    //   485: aload_1
    //   486: aload_2
    //   487: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   490: ifeq +482 -> 972
    //   493: aload_1
    //   494: lload 7
    //   496: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   499: aload_2
    //   500: lload 7
    //   502: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   505: if_icmpne +467 -> 972
    //   508: goto +467 -> 975
    //   511: aload_0
    //   512: iload 4
    //   514: aload_1
    //   515: aload_2
    //   516: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   519: ifeq +453 -> 972
    //   522: aload_1
    //   523: lload 7
    //   525: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   528: aload_2
    //   529: lload 7
    //   531: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   534: lcmp
    //   535: ifne +437 -> 972
    //   538: goto +437 -> 975
    //   541: aload_0
    //   542: iload 4
    //   544: aload_1
    //   545: aload_2
    //   546: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   549: ifeq +423 -> 972
    //   552: aload_1
    //   553: lload 7
    //   555: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   558: aload_2
    //   559: lload 7
    //   561: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   564: if_icmpne +408 -> 972
    //   567: goto +408 -> 975
    //   570: aload_0
    //   571: iload 4
    //   573: aload_1
    //   574: aload_2
    //   575: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   578: ifeq +394 -> 972
    //   581: aload_1
    //   582: lload 7
    //   584: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   587: aload_2
    //   588: lload 7
    //   590: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   593: if_icmpne +379 -> 972
    //   596: goto +379 -> 975
    //   599: aload_0
    //   600: iload 4
    //   602: aload_1
    //   603: aload_2
    //   604: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   607: ifeq +365 -> 972
    //   610: aload_1
    //   611: lload 7
    //   613: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   616: aload_2
    //   617: lload 7
    //   619: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   622: if_icmpne +350 -> 972
    //   625: goto +350 -> 975
    //   628: aload_0
    //   629: iload 4
    //   631: aload_1
    //   632: aload_2
    //   633: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   636: ifeq +336 -> 972
    //   639: aload_1
    //   640: lload 7
    //   642: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   645: aload_2
    //   646: lload 7
    //   648: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   651: invokestatic 938	ma/j1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   654: ifeq +318 -> 972
    //   657: goto +318 -> 975
    //   660: aload_0
    //   661: iload 4
    //   663: aload_1
    //   664: aload_2
    //   665: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   668: ifeq +304 -> 972
    //   671: aload_1
    //   672: lload 7
    //   674: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   677: aload_2
    //   678: lload 7
    //   680: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   683: invokestatic 938	ma/j1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   686: ifeq +286 -> 972
    //   689: goto +286 -> 975
    //   692: aload_0
    //   693: iload 4
    //   695: aload_1
    //   696: aload_2
    //   697: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   700: ifeq +272 -> 972
    //   703: aload_1
    //   704: lload 7
    //   706: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   709: aload_2
    //   710: lload 7
    //   712: invokestatic 158	ma/t1:p	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   715: invokestatic 938	ma/j1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   718: ifeq +254 -> 972
    //   721: goto +254 -> 975
    //   724: aload_0
    //   725: iload 4
    //   727: aload_1
    //   728: aload_2
    //   729: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   732: ifeq +240 -> 972
    //   735: aload_1
    //   736: lload 7
    //   738: invokestatic 853	ma/t1:g	(Ljava/lang/Object;J)Z
    //   741: aload_2
    //   742: lload 7
    //   744: invokestatic 853	ma/t1:g	(Ljava/lang/Object;J)Z
    //   747: if_icmpne +225 -> 972
    //   750: goto +225 -> 975
    //   753: aload_0
    //   754: iload 4
    //   756: aload_1
    //   757: aload_2
    //   758: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   761: ifeq +211 -> 972
    //   764: aload_1
    //   765: lload 7
    //   767: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   770: aload_2
    //   771: lload 7
    //   773: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   776: if_icmpne +196 -> 972
    //   779: goto +196 -> 975
    //   782: aload_0
    //   783: iload 4
    //   785: aload_1
    //   786: aload_2
    //   787: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   790: ifeq +182 -> 972
    //   793: aload_1
    //   794: lload 7
    //   796: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   799: aload_2
    //   800: lload 7
    //   802: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   805: lcmp
    //   806: ifne +166 -> 972
    //   809: goto +166 -> 975
    //   812: aload_0
    //   813: iload 4
    //   815: aload_1
    //   816: aload_2
    //   817: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   820: ifeq +152 -> 972
    //   823: aload_1
    //   824: lload 7
    //   826: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   829: aload_2
    //   830: lload 7
    //   832: invokestatic 667	ma/t1:n	(Ljava/lang/Object;J)I
    //   835: if_icmpne +137 -> 972
    //   838: goto +137 -> 975
    //   841: aload_0
    //   842: iload 4
    //   844: aload_1
    //   845: aload_2
    //   846: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   849: ifeq +123 -> 972
    //   852: aload_1
    //   853: lload 7
    //   855: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   858: aload_2
    //   859: lload 7
    //   861: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   864: lcmp
    //   865: ifne +107 -> 972
    //   868: goto +107 -> 975
    //   871: aload_0
    //   872: iload 4
    //   874: aload_1
    //   875: aload_2
    //   876: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   879: ifeq +93 -> 972
    //   882: aload_1
    //   883: lload 7
    //   885: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   888: aload_2
    //   889: lload 7
    //   891: invokestatic 877	ma/t1:o	(Ljava/lang/Object;J)J
    //   894: lcmp
    //   895: ifne +77 -> 972
    //   898: goto +77 -> 975
    //   901: aload_0
    //   902: iload 4
    //   904: aload_1
    //   905: aload_2
    //   906: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   909: ifeq +63 -> 972
    //   912: aload_1
    //   913: lload 7
    //   915: invokestatic 856	ma/t1:m	(Ljava/lang/Object;J)F
    //   918: invokestatic 945	java/lang/Float:floatToIntBits	(F)I
    //   921: aload_2
    //   922: lload 7
    //   924: invokestatic 856	ma/t1:m	(Ljava/lang/Object;J)F
    //   927: invokestatic 945	java/lang/Float:floatToIntBits	(F)I
    //   930: if_icmpne +42 -> 972
    //   933: goto +42 -> 975
    //   936: aload_0
    //   937: iload 4
    //   939: aload_1
    //   940: aload_2
    //   941: invokevirtual 941	ma/v0:k	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   944: ifeq +28 -> 972
    //   947: aload_1
    //   948: lload 7
    //   950: invokestatic 859	ma/t1:l	(Ljava/lang/Object;J)D
    //   953: invokestatic 949	java/lang/Double:doubleToLongBits	(D)J
    //   956: aload_2
    //   957: lload 7
    //   959: invokestatic 859	ma/t1:l	(Ljava/lang/Object;J)D
    //   962: invokestatic 949	java/lang/Double:doubleToLongBits	(D)J
    //   965: lcmp
    //   966: ifne +6 -> 972
    //   969: goto +6 -> 975
    //   972: iconst_0
    //   973: istore 5
    //   975: iload 5
    //   977: ifne +5 -> 982
    //   980: iconst_0
    //   981: ireturn
    //   982: iinc 4 3
    //   985: goto -976 -> 9
    //   988: aload_0
    //   989: getfield 87	ma/v0:n	Lma/p1;
    //   992: aload_1
    //   993: invokevirtual 861	ma/p1:g	(Ljava/lang/Object;)Lma/q1;
    //   996: aload_0
    //   997: getfield 87	ma/v0:n	Lma/p1;
    //   1000: aload_2
    //   1001: invokevirtual 861	ma/p1:g	(Ljava/lang/Object;)Lma/q1;
    //   1004: invokevirtual 950	ma/q1:equals	(Ljava/lang/Object;)Z
    //   1007: ifne +5 -> 1012
    //   1010: iconst_0
    //   1011: ireturn
    //   1012: aload_0
    //   1013: getfield 73	ma/v0:f	Z
    //   1016: ifeq +23 -> 1039
    //   1019: aload_0
    //   1020: getfield 89	ma/v0:o	Lma/p;
    //   1023: aload_1
    //   1024: invokevirtual 683	ma/p:c	(Ljava/lang/Object;)Lma/s;
    //   1027: aload_0
    //   1028: getfield 89	ma/v0:o	Lma/p;
    //   1031: aload_2
    //   1032: invokevirtual 683	ma/p:c	(Ljava/lang/Object;)Lma/s;
    //   1035: invokevirtual 951	ma/s:equals	(Ljava/lang/Object;)Z
    //   1038: ireturn
    //   1039: iconst_1
    //   1040: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1041	0	this	v0
    //   0	1041	1	paramT1	T
    //   0	1041	2	paramT2	T
    //   5	11	3	i1	int
    //   7	976	4	i2	int
    //   10	966	5	bool	boolean
    //   24	351	6	i3	int
    //   32	926	7	l1	long
    //   348	10	9	l2	long
  }
  
  public final int e(T paramT)
  {
    Unsafe localUnsafe = r;
    int i1 = 1048575;
    int i2 = 0;
    int i3 = 0;
    for (int i4 = 0; i3 < a.length; i4 = i10)
    {
      int i5 = T(i3);
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
            i2 = localUnsafe.getInt(paramT, i9);
          }
          i10 = i9;
        }
        i1 = i2;
        i8 = 1 << (i8 >>> 20);
        i2 = i10;
      }
      else
      {
        i10 = i1;
        i1 = i2;
        i8 = 0;
        i2 = i10;
      }
      long l1 = i5 & 0xFFFFF;
      if ((i6 < t.b.f()) || (i6 > t.c.f())) {
        i9 = 0;
      }
      label553:
      label589:
      label617:
      label677:
      label713:
      label750:
      label790:
      Object localObject2;
      switch (i6)
      {
      default: 
        i10 = i4;
        break;
      case 68: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        localObject1 = localUnsafe.getObject(paramT, l1);
        i10 = k.C(i7, (s0)localObject1, q(i3));
        break;
      case 67: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        l1 = E(paramT, l1);
        i10 = k.K(i7, l1);
        break;
      case 66: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        i10 = D(paramT, l1);
        i10 = k.J(i7, i10);
        break;
      case 65: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        i10 = k.I(i7);
        break;
      case 64: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        i10 = k.H(i7);
        break;
      case 63: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        i10 = D(paramT, l1);
        i10 = k.y(i7, i10);
        break;
      case 62: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        i10 = D(paramT, l1);
        i10 = k.O(i7, i10);
        break;
      case 61: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        localObject1 = localUnsafe.getObject(paramT, l1);
        i10 = k.w(i7, (h)localObject1);
        break;
      case 60: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        localObject1 = localUnsafe.getObject(paramT, l1);
        i10 = j1.o(i7, q(i3), localObject1);
        break;
      case 59: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
        localObject2 = localUnsafe.getObject(paramT, l1);
        localObject1 = localObject2;
        if ((localObject2 instanceof h)) {
          i10 = k.w(i7, (h)localObject2);
        } else {
          i10 = k.L(i7, (String)localObject1);
        }
        break;
      case 58: 
        i10 = i4;
        if (!v(paramT, i7, i3)) {
          break label2580;
        }
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
      case 30: 
      case 29: 
      case 28: 
      case 27: 
      case 26: 
      case 25: 
      case 22: 
      case 21: 
      case 20: 
      case 19: 
      case 24: 
      case 31: 
      case 18: 
      case 23: 
      case 32: 
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
        for (;;)
        {
          i10 = k.v(i7);
          break label2573;
          i10 = i4;
          if (!v(paramT, i7, i3)) {
            break label2580;
          }
          break label2359;
          i10 = i4;
          if (!v(paramT, i7, i3)) {
            break label2580;
          }
          break label2388;
          i10 = i4;
          if (!v(paramT, i7, i3)) {
            break label2580;
          }
          i10 = D(paramT, l1);
          break label2426;
          i10 = i4;
          if (!v(paramT, i7, i3)) {
            break label2580;
          }
          l1 = E(paramT, l1);
          break label2466;
          i10 = i4;
          if (!v(paramT, i7, i3)) {
            break label2580;
          }
          l1 = E(paramT, l1);
          break label2506;
          i10 = i4;
          if (!v(paramT, i7, i3)) {
            break label2580;
          }
          break label2537;
          i10 = i4;
          if (!v(paramT, i7, i3)) {
            break label2580;
          }
          break label2566;
          i10 = p.f(i7, localUnsafe.getObject(paramT, l1), p(i3));
          break label2573;
          i10 = j1.j(i7, (List)localUnsafe.getObject(paramT, l1), q(i3));
          break label2573;
          i8 = j1.t((List)localUnsafe.getObject(paramT, l1));
          i10 = i4;
          if (i8 <= 0) {
            break label2580;
          }
          i10 = i8;
          if (h)
          {
            i10 = i8;
            break label1698;
            i8 = j1.r((List)localUnsafe.getObject(paramT, l1));
            i10 = i4;
            if (i8 <= 0) {
              break label2580;
            }
            i10 = i8;
            if (h)
            {
              i10 = i8;
              break label1698;
              i8 = j1.i((List)localUnsafe.getObject(paramT, l1));
              i10 = i4;
              if (i8 <= 0) {
                break label2580;
              }
              i10 = i8;
              if (h)
              {
                i10 = i8;
                break label1698;
                i8 = j1.g((List)localUnsafe.getObject(paramT, l1));
                i10 = i4;
                if (i8 <= 0) {
                  break label2580;
                }
                i10 = i8;
                if (h)
                {
                  i10 = i8;
                  break label1698;
                  i8 = j1.e((List)localUnsafe.getObject(paramT, l1));
                  i10 = i4;
                  if (i8 <= 0) {
                    break label2580;
                  }
                  i10 = i8;
                  if (h)
                  {
                    i10 = i8;
                    break label1698;
                    i8 = j1.w((List)localUnsafe.getObject(paramT, l1));
                    i10 = i4;
                    if (i8 <= 0) {
                      break label2580;
                    }
                    i10 = i8;
                    if (h)
                    {
                      i10 = i8;
                      break label1698;
                      i8 = j1.b((List)localUnsafe.getObject(paramT, l1));
                      i10 = i4;
                      if (i8 <= 0) {
                        break label2580;
                      }
                      i10 = i8;
                      if (h)
                      {
                        i10 = i8;
                        break label1698;
                        i8 = j1.g((List)localUnsafe.getObject(paramT, l1));
                        i10 = i4;
                        if (i8 <= 0) {
                          break label2580;
                        }
                        i10 = i8;
                        if (h)
                        {
                          i10 = i8;
                          break label1698;
                          i8 = j1.i((List)localUnsafe.getObject(paramT, l1));
                          i10 = i4;
                          if (i8 <= 0) {
                            break label2580;
                          }
                          i10 = i8;
                          if (h)
                          {
                            i10 = i8;
                            break label1698;
                            i8 = j1.l((List)localUnsafe.getObject(paramT, l1));
                            i10 = i4;
                            if (i8 <= 0) {
                              break label2580;
                            }
                            i10 = i8;
                            if (h)
                            {
                              i10 = i8;
                              break label1698;
                              i8 = j1.y((List)localUnsafe.getObject(paramT, l1));
                              i10 = i4;
                              if (i8 <= 0) {
                                break label2580;
                              }
                              i10 = i8;
                              if (h)
                              {
                                i10 = i8;
                                break label1698;
                                i8 = j1.n((List)localUnsafe.getObject(paramT, l1));
                                i10 = i4;
                                if (i8 <= 0) {
                                  break label2580;
                                }
                                i10 = i8;
                                if (h)
                                {
                                  i10 = i8;
                                  break label1698;
                                  i8 = j1.g((List)localUnsafe.getObject(paramT, l1));
                                  i10 = i4;
                                  if (i8 <= 0) {
                                    break label2580;
                                  }
                                  i10 = i8;
                                  if (h)
                                  {
                                    i10 = i8;
                                    break label1698;
                                    i8 = j1.i((List)localUnsafe.getObject(paramT, l1));
                                    i10 = i4;
                                    if (i8 <= 0) {
                                      break label2580;
                                    }
                                    i10 = i8;
                                    if (h)
                                    {
                                      i10 = i8;
                                      localUnsafe.putInt(paramT, i9, i10);
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
          i9 = k.N(i7);
          i10 = k.P(i10) + i9 + i10 + i4;
          break label2580;
          i10 = j1.s(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.q(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.d(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.v(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.c(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.p(i7, (List)localUnsafe.getObject(paramT, l1), q(i3));
          break label2573;
          i10 = j1.u(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.a(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.k(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.x(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.m(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.f(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = j1.h(i7, (List)localUnsafe.getObject(paramT, l1));
          break label2573;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          localObject1 = localUnsafe.getObject(paramT, l1);
          break;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          l1 = localUnsafe.getLong(paramT, l1);
          break label553;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          i10 = localUnsafe.getInt(paramT, l1);
          break label589;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          break label617;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          i10 = k.H(i7);
          i10 += i4;
          break label2580;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          i10 = localUnsafe.getInt(paramT, l1);
          break label677;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          i10 = localUnsafe.getInt(paramT, l1);
          break label713;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          localObject1 = localUnsafe.getObject(paramT, l1);
          break label750;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          localObject1 = localUnsafe.getObject(paramT, l1);
          break label790;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
          localObject2 = localUnsafe.getObject(paramT, l1);
          localObject1 = localObject2;
          if (!(localObject2 instanceof h)) {
            break label860;
          }
          break label845;
          i10 = i4;
          if (!t(paramT, i3, i2, i1, i8)) {
            break label2580;
          }
        }
      case 6: 
        i10 = i4;
        if (!t(paramT, i3, i2, i1, i8)) {
          break label2580;
        }
        i10 = k.z(i7);
        break;
      case 5: 
        i10 = i4;
        if (!t(paramT, i3, i2, i1, i8)) {
          break label2580;
        }
        i10 = k.A(i7);
        break;
      case 4: 
        i10 = i4;
        if (!t(paramT, i3, i2, i1, i8)) {
          break label2580;
        }
        i10 = localUnsafe.getInt(paramT, l1);
        i10 = k.D(i7, i10);
        break;
      case 3: 
        i10 = i4;
        if (!t(paramT, i3, i2, i1, i8)) {
          break label2580;
        }
        l1 = localUnsafe.getLong(paramT, l1);
        i10 = k.Q(i7, l1);
        break;
      case 2: 
        i10 = i4;
        if (!t(paramT, i3, i2, i1, i8)) {
          break label2580;
        }
        l1 = localUnsafe.getLong(paramT, l1);
        i10 = k.F(i7, l1);
        break;
      case 1: 
        label845:
        label860:
        label1698:
        label2359:
        label2388:
        label2426:
        label2466:
        label2506:
        i10 = i4;
        if (!t(paramT, i3, i2, i1, i8)) {
          break label2580;
        }
        label2537:
        i10 = k.B(i7);
        break;
      }
      i10 = i4;
      if (t(paramT, i3, i2, i1, i8))
      {
        label2566:
        i10 = k.x(i7);
        label2573:
        i10 = i4 + i10;
      }
      label2580:
      i4 = i3 + 3;
      i3 = i1;
      i1 = i2;
      i2 = i3;
      i3 = i4;
    }
    Object localObject1 = n;
    i1 = ((p1)localObject1).h(((p1)localObject1).g(paramT)) + i4;
    int i10 = i1;
    if (f) {
      i10 = i1 + o.c(paramT).h();
    }
    return i10;
  }
  
  public final T f()
  {
    return l.a(e);
  }
  
  public final int g(T paramT)
  {
    int i1 = a.length;
    int i2 = 0;
    for (int i3 = 0; i2 < i1; i3 = i6)
    {
      int i4 = T(i2);
      int i5 = a[i2];
      long l1 = 0xFFFFF & i4;
      i6 = 37;
      Object localObject;
      boolean bool;
      float f1;
      switch ((i4 & 0xFF00000) >>> 20)
      {
      default: 
        i6 = i3;
        break;
      case 68: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 67: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 66: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 65: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 64: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 63: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 62: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 61: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 60: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        localObject = t1.p(paramT, l1);
        i6 = i3 * 53;
        break;
      case 59: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 58: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        bool = ((Boolean)t1.p(paramT, l1)).booleanValue();
        break;
      case 57: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 56: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 55: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        i3 = D(paramT, l1);
        break;
      case 54: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 53: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        l1 = E(paramT, l1);
        break;
      case 52: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        f1 = ((Float)t1.p(paramT, l1)).floatValue();
        break;
      case 51: 
        i6 = i3;
        if (!v(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        d1 = ((Double)t1.p(paramT, l1)).doubleValue();
        break;
      case 17: 
        localObject = t1.p(paramT, l1);
        if (localObject == null) {}
        break;
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
        i6 = i3 * 53;
        localObject = t1.p(paramT, l1);
        i3 = localObject.hashCode();
        break;
      case 9: 
        localObject = t1.p(paramT, l1);
        if (localObject != null) {
          i6 = localObject.hashCode();
        }
        i6 = i3 * 53 + i6;
        break;
      case 8: 
        i6 = i3 * 53;
        i3 = ((String)t1.p(paramT, l1)).hashCode();
        break;
      case 7: 
        i6 = i3 * 53;
        bool = t1.g(paramT, l1);
        i3 = a0.a(bool);
        break;
      case 4: 
      case 6: 
      case 11: 
      case 12: 
      case 13: 
      case 15: 
        i6 = i3 * 53;
        i3 = t1.n(paramT, l1);
        break;
      case 2: 
      case 3: 
      case 5: 
      case 14: 
      case 16: 
        i6 = i3 * 53;
        l1 = t1.o(paramT, l1);
        break;
      case 1: 
        i6 = i3 * 53;
        f1 = t1.m(paramT, l1);
        i3 = Float.floatToIntBits(f1);
        break;
      }
      i6 = i3 * 53;
      double d1 = t1.l(paramT, l1);
      l1 = Double.doubleToLongBits(d1);
      i3 = a0.b(l1);
      i6 = i3 + i6;
      label1003:
      i2 += 3;
    }
    i3 = n.g(paramT).hashCode() + i3 * 53;
    int i6 = i3;
    if (f) {
      i6 = i3 * 53 + o.c(paramT).hashCode();
    }
    return i6;
  }
  
  public final void h(Object paramObject, l paraml)
  {
    paraml.getClass();
    U(paramObject, paraml);
  }
  
  public final void i(T paramT, g1 paramg1, o paramo)
  {
    paramo.getClass();
    l(paramT);
    p1 localp1 = n;
    p localp = o;
    Object localObject1 = null;
    Object localObject3 = null;
    Object localObject4 = localObject1;
    j localj;
    int i1;
    try
    {
      localj = (j)paramg1;
      localObject4 = localObject1;
      i1 = localj.a();
      localObject4 = localObject1;
      if (i1 >= c)
      {
        localObject4 = localObject1;
        if (i1 <= d)
        {
          localObject4 = localObject1;
          i2 = Q(i1, 0);
        }
      }
    }
    finally
    {
      break label4113;
    }
    int i2 = -1;
    if (i2 < 0) {
      if (i1 == Integer.MAX_VALUE)
      {
        i3 = j;
        paramg1 = (g1)localObject1;
        while (i3 < k)
        {
          paramg1 = n(paramT, i[i3], paramg1, localp1, paramT);
          i3++;
        }
        if (paramg1 == null) {
          break label4112;
        }
      }
    }
    label805:
    label863:
    label1231:
    label1623:
    label1639:
    label1739:
    label1782:
    label1825:
    label1868:
    label1913:
    label1953:
    label1996:
    label2039:
    label2082:
    label2125:
    label2168:
    label2211:
    label2254:
    label2343:
    label2386:
    label2429:
    label2472:
    label2517:
    label2573:
    label2693:
    label2736:
    label2779:
    label2822:
    label2865:
    label2908:
    label2951:
    label2994:
    label3330:
    label3489:
    label3702:
    label3804:
    label3914:
    label3932:
    do
    {
      Object localObject5;
      Object localObject6;
      boolean bool;
      for (;;)
      {
        localp1.n(paramT, paramg1);
        break label4112;
        localObject4 = localObject1;
        if (!f)
        {
          localObject5 = null;
        }
        else
        {
          localObject4 = localObject1;
          localObject5 = localp.b(paramo, e, i1);
        }
        if (localObject5 != null)
        {
          localObject6 = localObject3;
          if (localObject3 == null)
          {
            localObject4 = localObject1;
            localObject6 = localp.d(paramT);
          }
          localObject4 = localObject1;
          localObject1 = localp.g(localObject5);
          localObject3 = localObject6;
          break;
        }
        localObject4 = localObject1;
        localp1.p();
        localObject5 = localObject1;
        if (localObject1 == null)
        {
          localObject4 = localObject1;
          localObject5 = localp1.f(paramT);
        }
        localObject4 = localObject5;
        bool = localp1.l(localObject5, localj);
        if (bool)
        {
          localObject1 = localObject5;
          break;
        }
        i3 = j;
        paramg1 = (g1)localObject5;
        while (i3 < k)
        {
          paramg1 = n(paramT, i[i3], paramg1, localp1, paramT);
          i3++;
        }
        if (paramg1 == null) {
          break label4112;
        }
      }
      localObject4 = localObject1;
      int i4 = T(i2);
      switch ((0xFF00000 & i4) >>> 20)
      {
      default: 
        localObject5 = localObject1;
        if (localObject1 == null)
        {
          localObject4 = localObject1;
          localObject6 = localObject1;
        }
        break;
      }
      try
      {
        localObject5 = localp1.f(paramT);
        break label3932;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localObject5 = (s0)A(paramT, i1, i2);
        localObject4 = localObject1;
        localObject6 = localObject1;
        i1 locali1 = q(i2);
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(3);
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.b(localObject5, locali1, paramo);
        break label1231;
        long l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(0);
        localObject4 = localObject1;
        localObject6 = localObject1;
        long l2 = a.u();
        localObject4 = localObject1;
        localObject6 = localObject1;
        localObject5 = Long.valueOf(l2);
        break label1623;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(0);
        localObject4 = localObject1;
        localObject6 = localObject1;
        for (i3 = a.t();; i3 = a.r())
        {
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = Integer.valueOf(i3);
          break label1623;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(1);
          localObject4 = localObject1;
          localObject6 = localObject1;
          l2 = a.s();
          break;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(5);
          localObject4 = localObject1;
          localObject6 = localObject1;
        }
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(0);
        localObject4 = localObject1;
        localObject6 = localObject1;
        int i5 = a.l();
        localObject4 = localObject1;
        localObject6 = localObject1;
        localObject5 = o(i2);
        if (localObject5 != null)
        {
          localObject4 = localObject1;
          i3 = i5;
          localObject6 = localObject1;
          if (((a0.b)localObject5).a()) {}
        }
        do
        {
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject1 = j1.C(paramT, i1, i3, localObject1, localp1);
          break;
          localObject4 = localObject1;
          localObject6 = localObject1;
          l1 = C(i4);
          i3 = i5;
          break label863;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(0);
          localObject4 = localObject1;
          localObject6 = localObject1;
          i3 = a.y();
          break label863;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = localj.e();
          break label1623;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = (s0)A(paramT, i1, i2);
          localObject4 = localObject1;
          localObject6 = localObject1;
          locali1 = q(i2);
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(2);
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.c(localObject5, locali1, paramo);
          localObject4 = localObject1;
          localObject6 = localObject1;
          S(paramT, i1, i2, localObject5);
          break;
          localObject4 = localObject1;
          localObject6 = localObject1;
          L(paramT, i4, localj);
          break label1639;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(0);
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = Boolean.valueOf(a.i());
          break label1623;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(5);
          localObject4 = localObject1;
          localObject6 = localObject1;
          i3 = a.m();
          break label863;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(1);
          localObject4 = localObject1;
          localObject6 = localObject1;
          l2 = a.n();
          break label805;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(0);
          localObject4 = localObject1;
          localObject6 = localObject1;
          i3 = a.p();
          break label863;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(0);
          localObject4 = localObject1;
          localObject6 = localObject1;
          l2 = a.z();
          break label805;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(0);
          localObject4 = localObject1;
          localObject6 = localObject1;
          l2 = a.q();
          break label805;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(5);
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = Float.valueOf(a.o());
          break label1623;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(1);
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = Double.valueOf(a.k());
          localObject4 = localObject1;
          localObject6 = localObject1;
          t1.z(paramT, l1, localObject5);
          localObject4 = localObject1;
          localObject6 = localObject1;
          P(paramT, i1, i2);
          break;
          localObject4 = localObject1;
          localObject6 = localObject1;
          w(paramT, i2, p(i2), paramo, localj);
          break;
          localObject4 = localObject1;
          localObject6 = localObject1;
          J(paramT, i4 & 0xFFFFF, localj, q(i2), paramo);
          break;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2343;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2386;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2429;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2472;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m.c(paramT, i4 & 0xFFFFF);
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.h((List)localObject5);
          break label2517;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2573;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2693;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2736;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2779;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2822;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2865;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2908;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = ((i0)localObject5).c(paramT, l1);
          break label2951;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = m;
          for (l1 = i4 & 0xFFFFF;; l1 = i4 & 0xFFFFF)
          {
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = ((i0)localObject5).c(paramT, l1);
            break label2994;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label1739;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.r((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label1782;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.q((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label1825;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.p((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label1868;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.o((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m.c(paramT, i4 & 0xFFFFF);
            break label1913;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject1 = j1.z(paramT, i1, (List)localObject5, o(i2), localObject1, localp1);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label1953;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.t((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.f(m.c(paramT, i4 & 0xFFFFF));
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            K(paramT, i4, localj, q(i2), paramo);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            M(paramT, i4, localj);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label1996;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.d((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label2039;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.j((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label2082;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.k((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label2125;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.m((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label2168;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.u((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label2211;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.n((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
            l1 = i4 & 0xFFFFF;
            break label2254;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localj.l((List)localObject5);
            break;
            localObject4 = localObject1;
            localObject6 = localObject1;
            localObject5 = m;
          }
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.g((List)localObject5);
          break;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = (s0)z(i2, paramT);
          localObject4 = localObject1;
          localObject6 = localObject1;
          locali1 = q(i2);
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(3);
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.b(localObject5, locali1, paramo);
          break label3489;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(0);
          localObject4 = localObject1;
          localObject6 = localObject1;
          l2 = a.u();
          break label3804;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(0);
          localObject4 = localObject1;
          localObject6 = localObject1;
          i3 = a.t();
          break label3702;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(1);
          localObject4 = localObject1;
          localObject6 = localObject1;
          l2 = a.s();
          break label3804;
          l1 = i4 & 0xFFFFF;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(5);
          localObject4 = localObject1;
          localObject6 = localObject1;
          i3 = a.r();
          break label3702;
          localObject4 = localObject1;
          localObject6 = localObject1;
          localj.w(0);
          localObject4 = localObject1;
          localObject6 = localObject1;
          i5 = a.l();
          localObject4 = localObject1;
          localObject6 = localObject1;
          localObject5 = o(i2);
          if (localObject5 == null) {
            break label3330;
          }
          localObject4 = localObject1;
          i3 = i5;
          localObject6 = localObject1;
        } while (!((a0.b)localObject5).a());
        localObject4 = localObject1;
        localObject6 = localObject1;
        t1.x(paramT, i5, C(i4));
        break label3914;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(0);
        localObject4 = localObject1;
        localObject6 = localObject1;
        i3 = a.y();
        break label3702;
        localObject4 = localObject1;
        localObject6 = localObject1;
        t1.z(paramT, i4 & 0xFFFFF, localj.e());
        break label3914;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localObject5 = (s0)z(i2, paramT);
        localObject4 = localObject1;
        localObject6 = localObject1;
        locali1 = q(i2);
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(2);
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.c(localObject5, locali1, paramo);
        localObject4 = localObject1;
        localObject6 = localObject1;
        R(i2, paramT, localObject5);
        break;
        localObject4 = localObject1;
        localObject6 = localObject1;
        L(paramT, i4, localj);
        break label3914;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(0);
        localObject4 = localObject1;
        localObject6 = localObject1;
        t1.r(paramT, l1, a.i());
        break label3914;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(5);
        localObject4 = localObject1;
        localObject6 = localObject1;
        i3 = a.m();
        break label3702;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(1);
        localObject4 = localObject1;
        localObject6 = localObject1;
        l2 = a.n();
        break label3804;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(0);
        localObject4 = localObject1;
        localObject6 = localObject1;
        i3 = a.p();
        localObject4 = localObject1;
        localObject6 = localObject1;
        t1.x(paramT, i3, l1);
        break label3914;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(0);
        localObject4 = localObject1;
        localObject6 = localObject1;
        l2 = a.z();
        break label3804;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(0);
        localObject4 = localObject1;
        localObject6 = localObject1;
        l2 = a.q();
        localObject4 = localObject1;
        localObject6 = localObject1;
        t1.y(paramT, l1, l2);
        break label3914;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(5);
        localObject4 = localObject1;
        localObject6 = localObject1;
        t1.w(paramT, l1, a.o());
        break label3914;
        l1 = i4 & 0xFFFFF;
        localObject4 = localObject1;
        localObject6 = localObject1;
        localj.w(1);
        localObject4 = localObject1;
        localObject6 = localObject1;
        t1.v(paramT, l1, a.k());
        localObject4 = localObject1;
        localObject6 = localObject1;
        O(i2, paramT);
        break;
        localObject4 = localObject5;
        localObject6 = localObject5;
        bool = localp1.l(localObject5, localj);
        localObject1 = localObject5;
        if (bool) {
          break;
        }
        i3 = j;
        paramg1 = (g1)localObject5;
        while (i3 < k)
        {
          paramg1 = n(paramT, i[i3], paramg1, localp1, paramT);
          i3++;
        }
        if (paramg1 == null) {
          break label4112;
        }
      }
      catch (b0.a locala)
      {
        localObject4 = localObject6;
        localp1.p();
        localObject5 = localObject6;
        if (localObject6 == null)
        {
          localObject4 = localObject6;
          localObject5 = localp1.f(paramT);
        }
        localObject4 = localObject5;
        bool = localp1.l(localObject5, localj);
        Object localObject2 = localObject5;
      }
      if (bool) {
        break;
      }
      i3 = j;
      paramg1 = (g1)localObject5;
      while (i3 < k)
      {
        paramg1 = n(paramT, i[i3], paramg1, localp1, paramT);
        i3++;
      }
    } while (paramg1 != null);
    label4112:
    return;
    label4113:
    for (int i3 = j; i3 < k; i3++) {
      localObject4 = n(paramT, i[i3], localObject4, localp1, paramT);
    }
    if (localObject4 != null) {
      localp1.n(paramT, localObject4);
    }
    throw paramg1;
  }
  
  public final void j(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, f.a parama)
  {
    G(paramT, paramArrayOfByte, paramInt1, paramInt2, 0, parama);
  }
  
  public final boolean k(int paramInt, Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (s(paramInt, paramObject1) == s(paramInt, paramObject2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final <UT, UB> UB n(Object paramObject1, int paramInt, UB paramUB, p1<UT, UB> paramp1, Object paramObject2)
  {
    int i1 = a[paramInt];
    paramObject1 = t1.p(paramObject1, T(paramInt) & 0xFFFFF);
    if (paramObject1 == null) {
      return paramUB;
    }
    a0.b localb = o(paramInt);
    if (localb == null) {
      return paramUB;
    }
    paramObject1 = p.e(paramObject1);
    l0.a locala = p.c(p(paramInt));
    Iterator localIterator = ((m0)paramObject1).entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((Integer)localEntry.getValue()).intValue();
      if (!localb.a())
      {
        paramObject1 = paramUB;
        if (paramUB == null) {
          paramObject1 = paramp1.f(paramObject2);
        }
        paramInt = l0.a(locala, localEntry.getKey(), localEntry.getValue());
        paramUB = new byte[paramInt];
        Object localObject = k.c;
        localObject = new k.b(paramUB, 0, paramInt);
        try
        {
          l0.b((k)localObject, locala, localEntry.getKey(), localEntry.getValue());
          if (((k.b)localObject).p0() == 0)
          {
            paramp1.d(paramObject1, i1, new h.h(paramUB));
            localIterator.remove();
            paramUB = (UB)paramObject1;
          }
          else
          {
            throw new IllegalStateException("Did not write as much data as expected.");
          }
        }
        catch (IOException paramObject1)
        {
          throw new RuntimeException((Throwable)paramObject1);
        }
      }
    }
    return paramUB;
  }
  
  public final a0.b o(int paramInt)
  {
    return (a0.b)b[(paramInt / 3 * 2 + 1)];
  }
  
  public final Object p(int paramInt)
  {
    return b[(paramInt / 3 * 2)];
  }
  
  public final i1 q(int paramInt)
  {
    paramInt = paramInt / 3 * 2;
    Object localObject = b;
    i1 locali1 = (i1)localObject[paramInt];
    if (locali1 != null) {
      return locali1;
    }
    localObject = d1.c.a((Class)localObject[(paramInt + 1)]);
    b[paramInt] = localObject;
    return (i1)localObject;
  }
  
  public final boolean s(int paramInt, Object paramObject)
  {
    int i1 = a[(paramInt + 2)];
    long l1 = i1 & 0xFFFFF;
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
      paramInt = T(paramInt);
      l1 = paramInt & 0xFFFFF;
      switch ((paramInt & 0xFF00000) >>> 20)
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        if (t1.p(paramObject, l1) != null) {
          bool16 = true;
        }
        return bool16;
      case 16: 
        bool16 = bool1;
        if (t1.o(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 15: 
        bool16 = bool2;
        if (t1.n(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 14: 
        bool16 = bool3;
        if (t1.o(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 13: 
        bool16 = bool4;
        if (t1.n(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 12: 
        bool16 = bool5;
        if (t1.n(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 11: 
        bool16 = bool6;
        if (t1.n(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 10: 
        bool16 = h.b.equals(t1.p(paramObject, l1));
      case 9: 
      case 8: 
        for (;;)
        {
          return bool16 ^ true;
          bool16 = bool7;
          if (t1.p(paramObject, l1) != null) {
            bool16 = true;
          }
          return bool16;
          paramObject = t1.p(paramObject, l1);
          if ((paramObject instanceof String))
          {
            bool16 = ((String)paramObject).isEmpty();
          }
          else
          {
            if (!(paramObject instanceof h)) {
              break;
            }
            bool16 = h.b.equals(paramObject);
          }
        }
        throw new IllegalArgumentException();
      case 7: 
        return t1.g(paramObject, l1);
      case 6: 
        bool16 = bool8;
        if (t1.n(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 5: 
        bool16 = bool9;
        if (t1.o(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 4: 
        bool16 = bool10;
        if (t1.n(paramObject, l1) != 0) {
          bool16 = true;
        }
        return bool16;
      case 3: 
        bool16 = bool11;
        if (t1.o(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 2: 
        bool16 = bool12;
        if (t1.o(paramObject, l1) != 0L) {
          bool16 = true;
        }
        return bool16;
      case 1: 
        bool16 = bool13;
        if (Float.floatToRawIntBits(t1.m(paramObject, l1)) != 0) {
          bool16 = true;
        }
        return bool16;
      }
      bool16 = bool14;
      if (Double.doubleToRawLongBits(t1.l(paramObject, l1)) != 0L) {
        bool16 = true;
      }
      return bool16;
    }
    bool16 = bool15;
    if ((1 << (i1 >>> 20) & t1.n(paramObject, l1)) != 0) {
      bool16 = true;
    }
    return bool16;
  }
  
  public final boolean t(T paramT, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 == 1048575) {
      return s(paramInt1, paramT);
    }
    boolean bool;
    if ((paramInt3 & paramInt4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean v(T paramT, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (t1.n(paramT, a[(paramInt2 + 2)] & 0xFFFFF) == paramInt1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final <K, V> void w(Object paramObject1, int paramInt, Object paramObject2, o paramo, g1 paramg1)
  {
    long l1 = T(paramInt) & 0xFFFFF;
    Object localObject1 = t1.p(paramObject1, l1);
    if (localObject1 == null)
    {
      localObject2 = p.d();
      t1.z(paramObject1, l1, localObject2);
    }
    else
    {
      localObject2 = localObject1;
      if (p.g(localObject1))
      {
        localObject2 = p.d();
        p.a(localObject2, localObject1);
        t1.z(paramObject1, l1, localObject2);
      }
    }
    localObject1 = p.e(localObject2);
    l0.a locala = p.c(paramObject2);
    Object localObject2 = (j)paramg1;
    ((j)localObject2).w(2);
    paramInt = a.y();
    int i1 = a.h(paramInt);
    paramObject1 = b;
    paramObject2 = d;
    try
    {
      do
      {
        for (;;)
        {
          paramInt = ((j)localObject2).a();
          if (paramInt == Integer.MAX_VALUE) {
            break;
          }
          boolean bool = a.e();
          if (bool) {
            break;
          }
          if ((paramInt == 1) || (paramInt != 2)) {}
          try
          {
            if (((j)localObject2).x()) {
              continue;
            }
            paramg1 = new ma/b0;
            paramg1.<init>("Unable to parse map entry.");
            throw paramg1;
          }
          catch (b0.a paramg1) {}
          paramg1 = ((j)localObject2).i(c, d.getClass(), paramo);
          paramObject2 = paramg1;
          continue;
          paramg1 = ((j)localObject2).i(a, null, null);
          paramObject1 = paramg1;
        }
      } while (((j)localObject2).x());
      paramObject1 = new ma/b0;
      ((b0)paramObject1).<init>("Unable to parse map entry.");
      throw ((Throwable)paramObject1);
      ((m0)localObject1).put(paramObject1, paramObject2);
      return;
    }
    finally
    {
      a.g(i1);
    }
  }
  
  public final void x(int paramInt, Object paramObject1, Object paramObject2)
  {
    if (!s(paramInt, paramObject2)) {
      return;
    }
    long l1 = T(paramInt) & 0xFFFFF;
    Unsafe localUnsafe = r;
    Object localObject1 = localUnsafe.getObject(paramObject2, l1);
    if (localObject1 != null)
    {
      i1 locali1 = q(paramInt);
      if (!s(paramInt, paramObject1))
      {
        if (!u(localObject1))
        {
          localUnsafe.putObject(paramObject1, l1, localObject1);
        }
        else
        {
          paramObject2 = locali1.f();
          locali1.a(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l1, paramObject2);
        }
        O(paramInt, paramObject1);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l1);
      paramObject2 = localObject2;
      if (!u(localObject2))
      {
        paramObject2 = locali1.f();
        locali1.a(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l1, paramObject2);
      }
      locali1.a(paramObject2, localObject1);
      return;
    }
    paramObject1 = f.l("Source subfield ");
    ((StringBuilder)paramObject1).append(a[paramInt]);
    ((StringBuilder)paramObject1).append(" is present but null: ");
    ((StringBuilder)paramObject1).append(paramObject2);
    throw new IllegalStateException(((StringBuilder)paramObject1).toString());
  }
  
  public final void y(int paramInt, Object paramObject1, Object paramObject2)
  {
    int i1 = a[paramInt];
    if (!v(paramObject2, i1, paramInt)) {
      return;
    }
    long l1 = T(paramInt) & 0xFFFFF;
    Unsafe localUnsafe = r;
    Object localObject1 = localUnsafe.getObject(paramObject2, l1);
    if (localObject1 != null)
    {
      i1 locali1 = q(paramInt);
      if (!v(paramObject1, i1, paramInt))
      {
        if (!u(localObject1))
        {
          localUnsafe.putObject(paramObject1, l1, localObject1);
        }
        else
        {
          paramObject2 = locali1.f();
          locali1.a(paramObject2, localObject1);
          localUnsafe.putObject(paramObject1, l1, paramObject2);
        }
        P(paramObject1, i1, paramInt);
        return;
      }
      Object localObject2 = localUnsafe.getObject(paramObject1, l1);
      paramObject2 = localObject2;
      if (!u(localObject2))
      {
        paramObject2 = locali1.f();
        locali1.a(paramObject2, localObject2);
        localUnsafe.putObject(paramObject1, l1, paramObject2);
      }
      locali1.a(paramObject2, localObject1);
      return;
    }
    paramObject1 = f.l("Source subfield ");
    ((StringBuilder)paramObject1).append(a[paramInt]);
    ((StringBuilder)paramObject1).append(" is present but null: ");
    ((StringBuilder)paramObject1).append(paramObject2);
    throw new IllegalStateException(((StringBuilder)paramObject1).toString());
  }
  
  public final Object z(int paramInt, Object paramObject)
  {
    i1 locali1 = q(paramInt);
    long l1 = T(paramInt) & 0xFFFFF;
    if (!s(paramInt, paramObject)) {
      return locali1.f();
    }
    Object localObject = r.getObject(paramObject, l1);
    if (u(localObject)) {
      return localObject;
    }
    paramObject = locali1.f();
    if (localObject != null) {
      locali1.a(paramObject, localObject);
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     ma.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
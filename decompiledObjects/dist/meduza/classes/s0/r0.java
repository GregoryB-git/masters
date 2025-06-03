package s0;

import f;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Set;
import sun.misc.Unsafe;

public final class r0<T>
  implements c1<T>
{
  public static final int[] r = new int[0];
  public static final Unsafe s = l1.o();
  public final int[] a;
  public final Object[] b;
  public final int c;
  public final int d;
  public final o0 e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  public final int[] j;
  public final int k;
  public final int l;
  public final t0 m;
  public final e0 n;
  public final h1<?, ?> o;
  public final o<?> p;
  public final j0 q;
  
  public r0(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, o0 paramo0, boolean paramBoolean, int[] paramArrayOfInt2, int paramInt3, int paramInt4, t0 paramt0, e0 parame0, h1 paramh1, o paramo, j0 paramj0)
  {
    a = paramArrayOfInt1;
    b = paramArrayOfObject;
    c = paramInt1;
    d = paramInt2;
    g = (paramo0 instanceof v);
    h = paramBoolean;
    if ((paramo != null) && (paramo.e(paramo0))) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    f = paramBoolean;
    i = false;
    j = paramArrayOfInt2;
    k = paramInt3;
    l = paramInt4;
    m = paramt0;
    n = parame0;
    o = paramh1;
    p = paramo;
    e = paramo0;
    q = paramj0;
  }
  
  public static Field C(Class<?> paramClass, String paramString)
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
  
  public static void I(int paramInt, Object paramObject, k paramk)
  {
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      a.i0(paramInt, (String)paramObject);
    }
    else
    {
      paramk.b(paramInt, (g)paramObject);
    }
  }
  
  public static List<?> s(Object paramObject, long paramLong)
  {
    return (List)l1.n(paramObject, paramLong);
  }
  
  public static <T> r0<T> u(a1 parama1, t0 paramt0, e0 parame0, h1<?, ?> paramh1, o<?> paramo, j0 paramj0)
  {
    int i1 = parama1.c();
    int i2 = 0;
    boolean bool;
    if (i1 == 2) {
      bool = true;
    } else {
      bool = false;
    }
    String str = parama1.e();
    int i3 = str.length();
    int i4 = str.charAt(0);
    if (i4 >= 55296)
    {
      i5 = i4 & 0x1FFF;
      i6 = 1;
      i7 = 13;
      for (;;)
      {
        i1 = i6 + 1;
        i6 = str.charAt(i6);
        if (i6 < 55296) {
          break;
        }
        i5 |= (i6 & 0x1FFF) << i7;
        i7 += 13;
        i6 = i1;
      }
      i4 = i5 | i6 << i7;
    }
    else
    {
      i1 = 1;
    }
    int i7 = i1 + 1;
    int i6 = str.charAt(i1);
    i1 = i7;
    int i5 = i6;
    if (i6 >= 55296)
    {
      i5 = i6 & 0x1FFF;
      i1 = 13;
      for (i6 = i7;; i6 = i7)
      {
        i7 = i6 + 1;
        i6 = str.charAt(i6);
        if (i6 < 55296) {
          break;
        }
        i5 |= (i6 & 0x1FFF) << i1;
        i1 += 13;
      }
      i5 |= i6 << i1;
      i1 = i7;
    }
    int[] arrayOfInt1;
    int i8;
    int i9;
    if (i5 == 0)
    {
      arrayOfInt1 = r;
      i8 = 0;
      i9 = i8;
      i5 = i9;
      i6 = i5;
      i7 = i6;
      i10 = i7;
      i11 = i6;
    }
    else
    {
      i7 = i1 + 1;
      i5 = str.charAt(i1);
      i1 = i5;
      i6 = i7;
      if (i5 >= 55296)
      {
        i1 = i5 & 0x1FFF;
        i5 = 13;
        i6 = i7;
        i7 = i1;
        for (;;)
        {
          i1 = i6 + 1;
          i6 = str.charAt(i6);
          if (i6 < 55296) {
            break;
          }
          i7 |= (i6 & 0x1FFF) << i5;
          i5 += 13;
          i6 = i1;
        }
        i7 |= i6 << i5;
        i6 = i1;
        i1 = i7;
      }
      i5 = i6 + 1;
      i6 = str.charAt(i6);
      i9 = i6;
      i7 = i5;
      if (i6 >= 55296)
      {
        i6 &= 0x1FFF;
        i7 = 13;
        for (i2 = i5;; i2 = i5)
        {
          i5 = i2 + 1;
          i2 = str.charAt(i2);
          if (i2 < 55296) {
            break;
          }
          i6 |= (i2 & 0x1FFF) << i7;
          i7 += 13;
        }
        i9 = i6 | i2 << i7;
        i7 = i5;
      }
      i5 = i7 + 1;
      i2 = str.charAt(i7);
      i7 = i2;
      i6 = i5;
      if (i2 >= 55296)
      {
        i6 = i2 & 0x1FFF;
        i7 = 13;
        for (i2 = i5;; i2 = i5)
        {
          i5 = i2 + 1;
          i2 = str.charAt(i2);
          if (i2 < 55296) {
            break;
          }
          i6 |= (i2 & 0x1FFF) << i7;
          i7 += 13;
        }
        i7 = i6 | i2 << i7;
        i6 = i5;
      }
      i5 = i6 + 1;
      i2 = str.charAt(i6);
      i6 = i2;
      i11 = i5;
      if (i2 >= 55296)
      {
        i2 &= 0x1FFF;
        i6 = 13;
        for (i11 = i5;; i11 = i5)
        {
          i5 = i11 + 1;
          i11 = str.charAt(i11);
          if (i11 < 55296) {
            break;
          }
          i2 |= (i11 & 0x1FFF) << i6;
          i6 += 13;
        }
        i6 = i2 | i11 << i6;
        i11 = i5;
      }
      i2 = i11 + 1;
      i11 = str.charAt(i11);
      i5 = i11;
      i8 = i2;
      if (i11 >= 55296)
      {
        i11 &= 0x1FFF;
        i5 = 13;
        for (i8 = i2;; i8 = i2)
        {
          i2 = i8 + 1;
          i8 = str.charAt(i8);
          if (i8 < 55296) {
            break;
          }
          i11 |= (i8 & 0x1FFF) << i5;
          i5 += 13;
        }
        i5 = i11 | i8 << i5;
        i8 = i2;
      }
      i11 = i8 + 1;
      i12 = str.charAt(i8);
      i2 = i12;
      i8 = i11;
      if (i12 >= 55296)
      {
        i2 = i12 & 0x1FFF;
        i8 = 13;
        i12 = i11;
        i11 = i2;
        for (;;)
        {
          i2 = i12 + 1;
          i12 = str.charAt(i12);
          if (i12 < 55296) {
            break;
          }
          i11 |= (i12 & 0x1FFF) << i8;
          i8 += 13;
          i12 = i2;
        }
        i11 |= i12 << i8;
        i8 = i2;
        i2 = i11;
      }
      i10 = i8 + 1;
      i12 = str.charAt(i8);
      if (i12 >= 55296)
      {
        i12 &= 0x1FFF;
        i8 = 13;
        for (;;)
        {
          i11 = i10 + 1;
          i10 = str.charAt(i10);
          if (i10 < 55296) {
            break;
          }
          i12 |= (i10 & 0x1FFF) << i8;
          i8 += 13;
          i10 = i11;
        }
        i12 |= i10 << i8;
      }
      else
      {
        i11 = i10;
      }
      i10 = i11 + 1;
      i13 = str.charAt(i11);
      i8 = i13;
      i11 = i10;
      if (i13 >= 55296)
      {
        i8 = i13 & 0x1FFF;
        i11 = 13;
        i13 = i10;
        i10 = i8;
        for (;;)
        {
          i8 = i13 + 1;
          i13 = str.charAt(i13);
          if (i13 < 55296) {
            break;
          }
          i10 |= (i13 & 0x1FFF) << i11;
          i11 += 13;
          i13 = i8;
        }
        i10 |= i13 << i11;
        i11 = i8;
        i8 = i10;
      }
      arrayOfInt1 = new int[i8 + i2 + i12];
      i9 = i1 * 2 + i9;
      i10 = i5;
      i5 = i8;
      i12 = i1;
      i1 = i11;
      i8 = i7;
      i7 = i9;
      i11 = i2;
      i9 = i6;
      i2 = i12;
    }
    Unsafe localUnsafe = s;
    Object[] arrayOfObject1 = parama1.d();
    Class localClass = parama1.b().getClass();
    int[] arrayOfInt2 = new int[i10 * 3];
    Object[] arrayOfObject2 = new Object[i10 * 2];
    int i10 = i11 + i5;
    int i11 = i5;
    i6 = i10;
    int i14 = 0;
    int i12 = 0;
    int i15 = i1;
    i1 = i11;
    i11 = i7;
    i7 = i10;
    int i16 = i5;
    i10 = i9;
    int i17 = i8;
    i5 = i3;
    int i13 = i2;
    while (i15 < i5)
    {
      i2 = i15 + 1;
      i15 = str.charAt(i15);
      if (i15 >= 55296)
      {
        i9 = i15 & 0x1FFF;
        i15 = i2;
        i2 = 13;
        for (;;)
        {
          i8 = i15 + 1;
          i15 = str.charAt(i15);
          if (i15 < 55296) {
            break;
          }
          i9 |= (i15 & 0x1FFF) << i2;
          i2 += 13;
          i15 = i8;
        }
        i15 = i9 | i15 << i2;
      }
      else
      {
        i8 = i2;
      }
      i2 = i8 + 1;
      int i18 = str.charAt(i8);
      if (i18 >= 55296)
      {
        i3 = i18 & 0x1FFF;
        i8 = 13;
        for (;;)
        {
          i9 = i2 + 1;
          i18 = str.charAt(i2);
          i2 = i7;
          if (i18 < 55296) {
            break;
          }
          i3 |= (i18 & 0x1FFF) << i8;
          i8 += 13;
          i7 = i2;
          i2 = i9;
        }
        i18 = i3 | i18 << i8;
        i8 = i9;
      }
      else
      {
        i8 = i2;
        i2 = i7;
      }
      int i19 = i18 & 0xFF;
      i3 = i12;
      if ((i18 & 0x400) != 0)
      {
        arrayOfInt1[i12] = i14;
        i3 = i12 + 1;
      }
      Object localObject;
      int i20;
      if (i19 >= 51)
      {
        i12 = i8 + 1;
        i9 = str.charAt(i8);
        if (i9 >= 55296)
        {
          i9 &= 0x1FFF;
          i8 = 13;
          for (;;)
          {
            i7 = i12 + 1;
            i12 = str.charAt(i12);
            if (i12 < 55296) {
              break;
            }
            i9 |= (i12 & 0x1FFF) << i8;
            i8 += 13;
            i12 = i7;
          }
          i9 |= i12 << i8;
        }
        else
        {
          i7 = i12;
        }
        i12 = i19 - 51;
        if ((i12 != 9) && (i12 != 17))
        {
          i8 = i11;
          if (i12 == 12)
          {
            i8 = i11;
            if ((i4 & 0x1) == 1)
            {
              arrayOfObject2[(i14 / 3 * 2 + 1)] = arrayOfObject1[i11];
              i8 = i11 + 1;
            }
          }
          i11 = i8;
        }
        else
        {
          arrayOfObject2[(i14 / 3 * 2 + 1)] = arrayOfObject1[i11];
          i11++;
        }
        i8 = i9 * 2;
        localObject = arrayOfObject1[i8];
        if ((localObject instanceof Field))
        {
          localObject = (Field)localObject;
        }
        else
        {
          localObject = C(localClass, (String)localObject);
          arrayOfObject1[i8] = localObject;
        }
        i20 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        i8++;
        localObject = arrayOfObject1[i8];
        if ((localObject instanceof Field))
        {
          localObject = (Field)localObject;
        }
        else
        {
          localObject = C(localClass, (String)localObject);
          arrayOfObject1[i8] = localObject;
        }
        i12 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        i9 = 0;
        i8 = i1;
      }
      else
      {
        i9 = i11 + 1;
        localObject = C(localClass, (String)arrayOfObject1[i11]);
        if ((i19 != 9) && (i19 != 17))
        {
          if ((i19 != 27) && (i19 != 49))
          {
            if ((i19 != 12) && (i19 != 30) && (i19 != 44))
            {
              i11 = i9;
              i7 = i1;
              if (i19 == 50)
              {
                i7 = i1 + 1;
                arrayOfInt1[i1] = i14;
                i1 = i14 / 3 * 2;
                i11 = i9 + 1;
                arrayOfObject2[i1] = arrayOfObject1[i9];
                if ((i18 & 0x800) != 0)
                {
                  i9 = i11 + 1;
                  arrayOfObject2[(i1 + 1)] = arrayOfObject1[i11];
                  i1 = i7;
                  i7 = i9;
                  break label2047;
                }
              }
              i1 = i7;
              i7 = i11;
              label2047:
              i11 = i1;
              break label2156;
            }
            i7 = i9;
            i11 = i1;
            if ((i4 & 0x1) != 1) {
              break label2156;
            }
            i11 = i14 / 3;
            i7 = i9 + 1;
            arrayOfObject2[(i11 * 2 + 1)] = arrayOfObject1[i9];
          }
          else
          {
            i11 = i14 / 3;
            i7 = i9 + 1;
            arrayOfObject2[(i11 * 2 + 1)] = arrayOfObject1[i9];
          }
          i11 = i1;
        }
        else
        {
          arrayOfObject2[(i14 / 3 * 2 + 1)] = ((Field)localObject).getType();
          i11 = i1;
          i7 = i9;
        }
        label2156:
        i20 = (int)localUnsafe.objectFieldOffset((Field)localObject);
        if (((i4 & 0x1) == 1) && (i19 <= 17))
        {
          i9 = i8 + 1;
          i12 = str.charAt(i8);
          i8 = i12;
          i1 = i9;
          if (i12 >= 55296)
          {
            i1 = i12 & 0x1FFF;
            i8 = 13;
            i12 = i9;
            i9 = i1;
            for (;;)
            {
              i1 = i12 + 1;
              i12 = str.charAt(i12);
              if (i12 < 55296) {
                break;
              }
              i9 |= (i12 & 0x1FFF) << i8;
              i8 += 13;
              i12 = i1;
            }
            i8 = i9 | i12 << i8;
          }
          i9 = i8 / 32 + i13 * 2;
          localObject = arrayOfObject1[i9];
          if ((localObject instanceof Field))
          {
            localObject = (Field)localObject;
          }
          else
          {
            localObject = C(localClass, (String)localObject);
            arrayOfObject1[i9] = localObject;
          }
          i9 = (int)localUnsafe.objectFieldOffset((Field)localObject);
          i12 = i8 % 32;
          i8 = i1;
          i1 = i12;
        }
        else
        {
          i1 = 0;
          i9 = 0;
        }
        i12 = i6;
        if (i19 >= 18)
        {
          i12 = i6;
          if (i19 <= 49)
          {
            arrayOfInt1[i6] = i20;
            i12 = i6 + 1;
          }
        }
        i21 = i7;
        i7 = i8;
        i8 = i11;
        i6 = i12;
        i11 = i21;
        i12 = i9;
        i9 = i1;
      }
      int i21 = i14 + 1;
      arrayOfInt2[i14] = i15;
      i15 = i21 + 1;
      if ((i18 & 0x200) != 0) {
        i1 = 536870912;
      } else {
        i1 = 0;
      }
      if ((i18 & 0x100) != 0) {
        i14 = 268435456;
      } else {
        i14 = 0;
      }
      arrayOfInt2[i21] = (i14 | i1 | i19 << 20 | i20);
      i14 = i15 + 1;
      arrayOfInt2[i15] = (i9 << 20 | i12);
      i15 = i7;
      i7 = i2;
      i12 = i3;
      i1 = i8;
    }
    return new r0(arrayOfInt2, arrayOfObject2, i17, i10, parama1.b(), bool, arrayOfInt1, i16, i7, paramt0, parame0, paramh1, paramo, paramj0);
  }
  
  public static <T> int v(T paramT, long paramLong)
  {
    return ((Integer)l1.n(paramT, paramLong)).intValue();
  }
  
  public static <T> long w(T paramT, long paramLong)
  {
    return ((Long)l1.n(paramT, paramLong)).longValue();
  }
  
  public final void A(Object paramObject, int paramInt, b1 paramb1)
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
      paramb1 = paramb1.M();
    }
    else
    {
      boolean bool = g;
      paramInt &= 0xFFFFF;
      if (bool)
      {
        l1 = paramInt;
        paramb1 = paramb1.z();
      }
      else
      {
        l1 = paramInt;
        paramb1 = paramb1.E();
      }
    }
    l1.u(paramObject, l1, paramb1);
  }
  
  public final void B(Object paramObject, int paramInt, b1 paramb1)
  {
    int i1;
    if ((0x20000000 & paramInt) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0) {
      paramb1.D(n.c(paramObject, paramInt & 0xFFFFF));
    } else {
      paramb1.C(n.c(paramObject, paramInt & 0xFFFFF));
    }
  }
  
  public final void D(int paramInt, Object paramObject)
  {
    if (h) {
      return;
    }
    paramInt = a[(paramInt + 2)];
    long l1 = paramInt & 0xFFFFF;
    l1.s(paramObject, l1.l(paramObject, l1) | 1 << (paramInt >>> 20), l1);
  }
  
  public final void E(T paramT, int paramInt1, int paramInt2)
  {
    l1.s(paramT, paramInt1, a[(paramInt2 + 2)] & 0xFFFFF);
  }
  
  public final int F(int paramInt)
  {
    return a[(paramInt + 1)];
  }
  
  public final void G(Object paramObject, k paramk)
  {
    if (f)
    {
      localObject1 = p.c(paramObject);
      if (!((r)localObject1).i())
      {
        localIterator = ((r)localObject1).l();
        localObject1 = (Map.Entry)localIterator.next();
        break label48;
      }
    }
    Iterator localIterator = null;
    Object localObject1 = null;
    label48:
    int i1 = -1;
    int i2 = a.length;
    Unsafe localUnsafe = s;
    int i3 = 0;
    int i4 = 0;
    Object localObject2;
    for (;;)
    {
      localObject2 = localObject1;
      if (i3 >= i2) {
        break;
      }
      int i5 = F(i3);
      localObject2 = a;
      int i6 = localObject2[i3];
      int i7 = (0xFF00000 & i5) >>> 20;
      int i9;
      int i10;
      if ((!h) && (i7 <= 17))
      {
        int i8 = localObject2[(i3 + 2)];
        i9 = i8 & 0xFFFFF;
        i10 = i1;
        if (i9 != i1)
        {
          i4 = localUnsafe.getInt(paramObject, i9);
          i10 = i9;
        }
        i9 = 1 << (i8 >>> 20);
        i1 = i10;
      }
      else
      {
        i9 = 0;
      }
      for (;;)
      {
        i10 = i3;
        if (localObject1 == null) {
          break;
        }
        p.a((Map.Entry)localObject1);
        if (i6 < 0) {
          break;
        }
        p.j((Map.Entry)localObject1);
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
        if (r(paramObject, i6, i10))
        {
          localObject2 = localUnsafe.getObject(paramObject, l1);
          paramk.h(i6, n(i10), localObject2);
          continue;
          if (r(paramObject, i6, i10))
          {
            paramk.p(i6, w(paramObject, l1));
            continue;
            if (r(paramObject, i6, i10))
            {
              paramk.o(i6, v(paramObject, l1));
              continue;
              if (r(paramObject, i6, i10))
              {
                paramk.n(i6, w(paramObject, l1));
                continue;
                if (r(paramObject, i6, i10))
                {
                  paramk.m(i6, v(paramObject, l1));
                  continue;
                  if (r(paramObject, i6, i10))
                  {
                    paramk.d(i6, v(paramObject, l1));
                    continue;
                    if (r(paramObject, i6, i10))
                    {
                      paramk.q(i6, v(paramObject, l1));
                      continue;
                      if (r(paramObject, i6, i10))
                      {
                        paramk.b(i6, (g)localUnsafe.getObject(paramObject, l1));
                        continue;
                        if (r(paramObject, i6, i10))
                        {
                          localObject2 = localUnsafe.getObject(paramObject, l1);
                          paramk.k(i6, n(i10), localObject2);
                          continue;
                          if (r(paramObject, i6, i10))
                          {
                            I(i6, localUnsafe.getObject(paramObject, l1), paramk);
                            continue;
                            if (r(paramObject, i6, i10))
                            {
                              paramk.a(i6, ((Boolean)l1.n(paramObject, l1)).booleanValue());
                              continue;
                              if (r(paramObject, i6, i10))
                              {
                                paramk.e(i6, v(paramObject, l1));
                                continue;
                                if (r(paramObject, i6, i10))
                                {
                                  paramk.f(i6, w(paramObject, l1));
                                  continue;
                                  if (r(paramObject, i6, i10))
                                  {
                                    paramk.i(i6, v(paramObject, l1));
                                    continue;
                                    if (r(paramObject, i6, i10))
                                    {
                                      paramk.r(i6, w(paramObject, l1));
                                      continue;
                                      if (r(paramObject, i6, i10))
                                      {
                                        paramk.j(i6, w(paramObject, l1));
                                        continue;
                                        if (r(paramObject, i6, i10))
                                        {
                                          paramk.g(((Float)l1.n(paramObject, l1)).floatValue(), i6);
                                          continue;
                                          if (r(paramObject, i6, i10))
                                          {
                                            paramk.c(i6, ((Double)l1.n(paramObject, l1)).doubleValue());
                                            continue;
                                            H(paramk, i6, localUnsafe.getObject(paramObject, l1), i10);
                                            continue;
                                            d1.K(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, n(i10));
                                            continue;
                                            d1.R(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.Q(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.P(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.O(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.G(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.T(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.D(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.H(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.I(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.L(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.U(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.M(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.J(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.F(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, true);
                                            continue;
                                            d1.R(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.Q(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.P(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.O(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.G(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.T(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.E(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk);
                                            continue;
                                            d1.N(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, n(i10));
                                            continue;
                                            d1.S(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk);
                                            continue;
                                            d1.D(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.H(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.I(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.L(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.U(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.M(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.J(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            d1.F(a[i10], (List)localUnsafe.getObject(paramObject, l1), paramk, false);
                                            break;
                                            if ((i9 & i4) != 0)
                                            {
                                              localObject2 = localUnsafe.getObject(paramObject, l1);
                                              paramk.h(i6, n(i10), localObject2);
                                              break;
                                              if ((i9 & i4) != 0)
                                              {
                                                paramk.p(i6, localUnsafe.getLong(paramObject, l1));
                                                break;
                                                if ((i9 & i4) != 0)
                                                {
                                                  paramk.o(i6, localUnsafe.getInt(paramObject, l1));
                                                  break;
                                                  if ((i9 & i4) != 0)
                                                  {
                                                    paramk.n(i6, localUnsafe.getLong(paramObject, l1));
                                                    break;
                                                    if ((i9 & i4) != 0)
                                                    {
                                                      paramk.m(i6, localUnsafe.getInt(paramObject, l1));
                                                      break;
                                                      if ((i9 & i4) != 0)
                                                      {
                                                        paramk.d(i6, localUnsafe.getInt(paramObject, l1));
                                                        break;
                                                        if ((i9 & i4) != 0)
                                                        {
                                                          paramk.q(i6, localUnsafe.getInt(paramObject, l1));
                                                          break;
                                                          if ((i9 & i4) != 0)
                                                          {
                                                            paramk.b(i6, (g)localUnsafe.getObject(paramObject, l1));
                                                            break;
                                                            if ((i9 & i4) != 0)
                                                            {
                                                              localObject2 = localUnsafe.getObject(paramObject, l1);
                                                              paramk.k(i6, n(i10), localObject2);
                                                              break;
                                                              if ((i9 & i4) != 0)
                                                              {
                                                                I(i6, localUnsafe.getObject(paramObject, l1), paramk);
                                                                break;
                                                                if ((i9 & i4) != 0)
                                                                {
                                                                  paramk.a(i6, l1.f(paramObject, l1));
                                                                  break;
                                                                  if ((i9 & i4) != 0)
                                                                  {
                                                                    paramk.e(i6, localUnsafe.getInt(paramObject, l1));
                                                                    break;
                                                                    if ((i9 & i4) != 0)
                                                                    {
                                                                      paramk.f(i6, localUnsafe.getLong(paramObject, l1));
                                                                      break;
                                                                      if ((i9 & i4) != 0)
                                                                      {
                                                                        paramk.i(i6, localUnsafe.getInt(paramObject, l1));
                                                                        break;
                                                                        if ((i9 & i4) != 0)
                                                                        {
                                                                          paramk.r(i6, localUnsafe.getLong(paramObject, l1));
                                                                          break;
                                                                          if ((i9 & i4) != 0)
                                                                          {
                                                                            paramk.j(i6, localUnsafe.getLong(paramObject, l1));
                                                                            break;
                                                                            if ((i9 & i4) != 0)
                                                                            {
                                                                              paramk.g(l1.k(paramObject, l1), i6);
                                                                              break;
                                                                              if ((i9 & i4) != 0) {
                                                                                paramk.c(i6, l1.j(paramObject, l1));
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
      i3 = i10 + 3;
    }
    while (localObject2 != null)
    {
      p.j((Map.Entry)localObject2);
      if (localIterator.hasNext()) {
        localObject2 = (Map.Entry)localIterator.next();
      } else {
        localObject2 = null;
      }
    }
    localObject1 = o;
    ((h1)localObject1).s(((h1)localObject1).g(paramObject), paramk);
  }
  
  public final void H(k paramk, int paramInt1, Object paramObject, int paramInt2)
  {
    if (paramObject != null)
    {
      h0.a locala = q.c(m(paramInt2));
      paramObject = q.h(paramObject);
      a.getClass();
      Iterator localIterator = ((i0)paramObject).entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramObject = (Map.Entry)localIterator.next();
        a.k0(paramInt1, 2);
        a.m0(h0.a(locala, ((Map.Entry)paramObject).getKey(), ((Map.Entry)paramObject).getValue()));
        h0.b(a, locala, ((Map.Entry)paramObject).getKey(), ((Map.Entry)paramObject).getValue());
      }
    }
  }
  
  /* Error */
  public final void a(T paramT1, T paramT2)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 205	java/lang/Object:getClass	()Ljava/lang/Class;
    //   4: pop
    //   5: iconst_0
    //   6: istore_3
    //   7: iload_3
    //   8: aload_0
    //   9: getfield 57	s0/r0:a	[I
    //   12: arraylength
    //   13: if_icmpge +907 -> 920
    //   16: aload_0
    //   17: iload_3
    //   18: invokevirtual 300	s0/r0:F	(I)I
    //   21: istore 4
    //   23: iload 4
    //   25: ldc -15
    //   27: iand
    //   28: i2l
    //   29: lstore 5
    //   31: aload_0
    //   32: getfield 57	s0/r0:a	[I
    //   35: iload_3
    //   36: iaload
    //   37: istore 7
    //   39: iload 4
    //   41: ldc_w 301
    //   44: iand
    //   45: bipush 20
    //   47: iushr
    //   48: tableswitch	default:+292->340, 0:+832->880, 1:+801->849, 2:+777->825, 3:+765->813, 4:+741->789, 5:+729->777, 6:+717->765, 7:+686->734, 8:+662->710, 9:+579->627, 10:+567->615, 11:+555->603, 12:+543->591, 13:+531->579, 14:+519->567, 15:+507->555, 16:+495->543, 17:+579->627, 18:+481->529, 19:+481->529, 20:+481->529, 21:+481->529, 22:+481->529, 23:+481->529, 24:+481->529, 25:+481->529, 26:+481->529, 27:+481->529, 28:+481->529, 29:+481->529, 30:+481->529, 31:+481->529, 32:+481->529, 33:+481->529, 34:+481->529, 35:+481->529, 36:+481->529, 37:+481->529, 38:+481->529, 39:+481->529, 40:+481->529, 41:+481->529, 42:+481->529, 43:+481->529, 44:+481->529, 45:+481->529, 46:+481->529, 47:+481->529, 48:+481->529, 49:+481->529, 50:+442->490, 51:+408->456, 52:+408->456, 53:+408->456, 54:+408->456, 55:+408->456, 56:+408->456, 57:+408->456, 58:+408->456, 59:+408->456, 60:+309->357, 61:+295->343, 62:+295->343, 63:+295->343, 64:+295->343, 65:+295->343, 66:+295->343, 67:+295->343, 68:+309->357
    //   340: goto +574 -> 914
    //   343: aload_0
    //   344: aload_2
    //   345: iload 7
    //   347: iload_3
    //   348: invokevirtual 315	s0/r0:r	(Ljava/lang/Object;II)Z
    //   351: ifeq +563 -> 914
    //   354: goto +113 -> 467
    //   357: aload_0
    //   358: iload_3
    //   359: invokevirtual 300	s0/r0:F	(I)I
    //   362: istore 7
    //   364: aload_0
    //   365: getfield 57	s0/r0:a	[I
    //   368: iload_3
    //   369: iaload
    //   370: istore 4
    //   372: iload 7
    //   374: ldc -15
    //   376: iand
    //   377: i2l
    //   378: lstore 5
    //   380: aload_0
    //   381: aload_2
    //   382: iload 4
    //   384: iload_3
    //   385: invokevirtual 315	s0/r0:r	(Ljava/lang/Object;II)Z
    //   388: ifne +6 -> 394
    //   391: goto +523 -> 914
    //   394: aload_1
    //   395: lload 5
    //   397: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   400: astore 8
    //   402: aload_2
    //   403: lload 5
    //   405: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   408: astore 9
    //   410: aload 8
    //   412: ifnull +20 -> 432
    //   415: aload 9
    //   417: ifnull +15 -> 432
    //   420: aload 8
    //   422: aload 9
    //   424: invokestatic 506	s0/x:c	(Ljava/lang/Object;Ljava/lang/Object;)Ls0/v;
    //   427: astore 9
    //   429: goto +8 -> 437
    //   432: aload 9
    //   434: ifnull +480 -> 914
    //   437: aload_1
    //   438: lload 5
    //   440: aload 9
    //   442: invokestatic 256	s0/l1:u	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   445: aload_0
    //   446: aload_1
    //   447: iload 4
    //   449: iload_3
    //   450: invokevirtual 508	s0/r0:E	(Ljava/lang/Object;II)V
    //   453: goto +461 -> 914
    //   456: aload_0
    //   457: aload_2
    //   458: iload 7
    //   460: iload_3
    //   461: invokevirtual 315	s0/r0:r	(Ljava/lang/Object;II)Z
    //   464: ifeq +450 -> 914
    //   467: aload_1
    //   468: lload 5
    //   470: aload_2
    //   471: lload 5
    //   473: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   476: invokestatic 256	s0/l1:u	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   479: aload_0
    //   480: aload_1
    //   481: iload 7
    //   483: iload_3
    //   484: invokevirtual 508	s0/r0:E	(Ljava/lang/Object;II)V
    //   487: goto +427 -> 914
    //   490: aload_0
    //   491: getfield 96	s0/r0:q	Ls0/j0;
    //   494: astore 8
    //   496: getstatic 511	s0/d1:a	Ljava/lang/Class;
    //   499: astore 9
    //   501: aload_1
    //   502: lload 5
    //   504: aload 8
    //   506: aload_1
    //   507: lload 5
    //   509: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   512: aload_2
    //   513: lload 5
    //   515: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   518: invokeinterface 514 3 0
    //   523: invokestatic 256	s0/l1:u	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   526: goto +388 -> 914
    //   529: aload_0
    //   530: getfield 88	s0/r0:n	Ls0/e0;
    //   533: aload_1
    //   534: lload 5
    //   536: aload_2
    //   537: invokevirtual 516	s0/e0:b	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   540: goto +374 -> 914
    //   543: aload_0
    //   544: iload_3
    //   545: aload_2
    //   546: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   549: ifeq +365 -> 914
    //   552: goto +282 -> 834
    //   555: aload_0
    //   556: iload_3
    //   557: aload_2
    //   558: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   561: ifeq +353 -> 914
    //   564: goto +234 -> 798
    //   567: aload_0
    //   568: iload_3
    //   569: aload_2
    //   570: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   573: ifeq +341 -> 914
    //   576: goto +258 -> 834
    //   579: aload_0
    //   580: iload_3
    //   581: aload_2
    //   582: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   585: ifeq +329 -> 914
    //   588: goto +210 -> 798
    //   591: aload_0
    //   592: iload_3
    //   593: aload_2
    //   594: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   597: ifeq +317 -> 914
    //   600: goto +198 -> 798
    //   603: aload_0
    //   604: iload_3
    //   605: aload_2
    //   606: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   609: ifeq +305 -> 914
    //   612: goto +186 -> 798
    //   615: aload_0
    //   616: iload_3
    //   617: aload_2
    //   618: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   621: ifeq +293 -> 914
    //   624: goto +95 -> 719
    //   627: aload_0
    //   628: iload_3
    //   629: invokevirtual 300	s0/r0:F	(I)I
    //   632: ldc -15
    //   634: iand
    //   635: i2l
    //   636: lstore 5
    //   638: aload_0
    //   639: iload_3
    //   640: aload_2
    //   641: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   644: ifne +6 -> 650
    //   647: goto +267 -> 914
    //   650: aload_1
    //   651: lload 5
    //   653: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   656: astore 8
    //   658: aload_2
    //   659: lload 5
    //   661: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   664: astore 9
    //   666: aload 8
    //   668: ifnull +20 -> 688
    //   671: aload 9
    //   673: ifnull +15 -> 688
    //   676: aload 8
    //   678: aload 9
    //   680: invokestatic 506	s0/x:c	(Ljava/lang/Object;Ljava/lang/Object;)Ls0/v;
    //   683: astore 9
    //   685: goto +8 -> 693
    //   688: aload 9
    //   690: ifnull +224 -> 914
    //   693: aload_1
    //   694: lload 5
    //   696: aload 9
    //   698: invokestatic 256	s0/l1:u	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   701: aload_0
    //   702: iload_3
    //   703: aload_1
    //   704: invokevirtual 521	s0/r0:D	(ILjava/lang/Object;)V
    //   707: goto +207 -> 914
    //   710: aload_0
    //   711: iload_3
    //   712: aload_2
    //   713: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   716: ifeq +198 -> 914
    //   719: aload_1
    //   720: lload 5
    //   722: aload_2
    //   723: lload 5
    //   725: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   728: invokestatic 256	s0/l1:u	(Ljava/lang/Object;JLjava/lang/Object;)V
    //   731: goto +177 -> 908
    //   734: aload_0
    //   735: iload_3
    //   736: aload_2
    //   737: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   740: ifeq +174 -> 914
    //   743: aload_2
    //   744: lload 5
    //   746: invokestatic 444	s0/l1:f	(Ljava/lang/Object;J)Z
    //   749: istore 10
    //   751: getstatic 524	s0/l1:d	Ls0/l1$e;
    //   754: aload_1
    //   755: lload 5
    //   757: iload 10
    //   759: invokevirtual 529	s0/l1$e:k	(Ljava/lang/Object;JZ)V
    //   762: goto +146 -> 908
    //   765: aload_0
    //   766: iload_3
    //   767: aload_2
    //   768: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   771: ifeq +143 -> 914
    //   774: goto +24 -> 798
    //   777: aload_0
    //   778: iload_3
    //   779: aload_2
    //   780: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   783: ifeq +131 -> 914
    //   786: goto +48 -> 834
    //   789: aload_0
    //   790: iload_3
    //   791: aload_2
    //   792: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   795: ifeq +119 -> 914
    //   798: aload_1
    //   799: aload_2
    //   800: lload 5
    //   802: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   805: lload 5
    //   807: invokestatic 273	s0/l1:s	(Ljava/lang/Object;IJ)V
    //   810: goto +98 -> 908
    //   813: aload_0
    //   814: iload_3
    //   815: aload_2
    //   816: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   819: ifeq +95 -> 914
    //   822: goto +12 -> 834
    //   825: aload_0
    //   826: iload_3
    //   827: aload_2
    //   828: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   831: ifeq +83 -> 914
    //   834: aload_1
    //   835: lload 5
    //   837: aload_2
    //   838: lload 5
    //   840: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   843: invokestatic 535	s0/l1:t	(Ljava/lang/Object;JJ)V
    //   846: goto +62 -> 908
    //   849: aload_0
    //   850: iload_3
    //   851: aload_2
    //   852: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   855: ifeq +59 -> 914
    //   858: aload_2
    //   859: lload 5
    //   861: invokestatic 447	s0/l1:k	(Ljava/lang/Object;J)F
    //   864: fstore 11
    //   866: getstatic 524	s0/l1:d	Ls0/l1$e;
    //   869: aload_1
    //   870: lload 5
    //   872: fload 11
    //   874: invokevirtual 538	s0/l1$e:n	(Ljava/lang/Object;JF)V
    //   877: goto +31 -> 908
    //   880: aload_0
    //   881: iload_3
    //   882: aload_2
    //   883: invokevirtual 519	s0/r0:q	(ILjava/lang/Object;)Z
    //   886: ifeq +28 -> 914
    //   889: aload_2
    //   890: lload 5
    //   892: invokestatic 450	s0/l1:j	(Ljava/lang/Object;J)D
    //   895: dstore 12
    //   897: getstatic 524	s0/l1:d	Ls0/l1$e;
    //   900: aload_1
    //   901: lload 5
    //   903: dload 12
    //   905: invokevirtual 541	s0/l1$e:m	(Ljava/lang/Object;JD)V
    //   908: aload_0
    //   909: iload_3
    //   910: aload_1
    //   911: invokevirtual 521	s0/r0:D	(ILjava/lang/Object;)V
    //   914: iinc 3 3
    //   917: goto -910 -> 7
    //   920: aload_0
    //   921: getfield 69	s0/r0:h	Z
    //   924: ifne +53 -> 977
    //   927: aload_0
    //   928: getfield 90	s0/r0:o	Ls0/h1;
    //   931: astore 8
    //   933: getstatic 511	s0/d1:a	Ljava/lang/Class;
    //   936: astore 9
    //   938: aload 8
    //   940: aload_1
    //   941: aload 8
    //   943: aload 8
    //   945: aload_1
    //   946: invokevirtual 455	s0/h1:g	(Ljava/lang/Object;)Ls0/i1;
    //   949: aload 8
    //   951: aload_2
    //   952: invokevirtual 455	s0/h1:g	(Ljava/lang/Object;)Ls0/i1;
    //   955: invokevirtual 544	s0/h1:k	(Ljava/lang/Object;Ljava/lang/Object;)Ls0/i1;
    //   958: invokevirtual 546	s0/h1:o	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   961: aload_0
    //   962: getfield 76	s0/r0:f	Z
    //   965: ifeq +12 -> 977
    //   968: aload_0
    //   969: getfield 92	s0/r0:p	Ls0/o;
    //   972: aload_1
    //   973: aload_2
    //   974: invokestatic 549	s0/d1:A	(Ls0/o;Ljava/lang/Object;Ljava/lang/Object;)V
    //   977: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	978	0	this	r0
    //   0	978	1	paramT1	T
    //   0	978	2	paramT2	T
    //   6	909	3	i1	int
    //   21	427	4	i2	int
    //   29	873	5	l1	long
    //   37	445	7	i3	int
    //   400	550	8	localObject1	Object
    //   408	529	9	localObject2	Object
    //   749	9	10	bool	boolean
    //   864	9	11	f1	float
    //   895	9	12	d1	double
  }
  
  public final void b(T paramT)
  {
    int i2;
    for (int i1 = k;; i1++)
    {
      i2 = l;
      if (i1 >= i2) {
        break;
      }
      long l1 = F(j[i1]) & 0xFFFFF;
      Object localObject = l1.n(paramT, l1);
      if (localObject != null) {
        l1.u(paramT, l1, q.b(localObject));
      }
    }
    int i3 = j.length;
    for (i1 = i2; i1 < i3; i1++) {
      n.a(paramT, j[i1]);
    }
    o.j(paramT);
    if (f) {
      p.f(paramT);
    }
  }
  
  public final boolean c(T paramT)
  {
    int i1 = -1;
    int i2 = 0;
    int i3 = i2;
    for (;;)
    {
      int i4 = k;
      int i5 = 1;
      boolean bool1 = true;
      int i6 = 1;
      if (i2 >= i4) {
        break;
      }
      int i7 = j[i2];
      int i8 = a[i7];
      int i9 = F(i7);
      int i12;
      if (!h)
      {
        i4 = a[(i7 + 2)];
        int i10 = i4 & 0xFFFFF;
        int i11 = 1 << (i4 >>> 20);
        i4 = i1;
        i12 = i11;
        if (i10 != i1)
        {
          i3 = s.getInt(paramT, i10);
          i4 = i10;
          i12 = i11;
        }
      }
      else
      {
        i12 = 0;
        i4 = i1;
      }
      if ((0x10000000 & i9) != 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      boolean bool2;
      if (i1 != 0)
      {
        if (h) {
          bool2 = q(i7, paramT);
        } else if ((i3 & i12) != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        if (!bool2) {
          return false;
        }
      }
      i1 = (0xFF00000 & i9) >>> 20;
      if ((i1 != 9) && (i1 != 17))
      {
        Object localObject1;
        if (i1 != 27) {
          if ((i1 != 60) && (i1 != 68))
          {
            if (i1 != 49)
            {
              if (i1 != 50) {
                break label606;
              }
              localObject1 = q.h(l1.n(paramT, i9 & 0xFFFFF));
              if (((HashMap)localObject1).isEmpty())
              {
                i12 = i6;
              }
              else
              {
                localObject2 = m(i7);
                if (q.c(localObject2).c.a != o1.r)
                {
                  i12 = i6;
                }
                else
                {
                  localObject2 = null;
                  Iterator localIterator = ((LinkedHashMap)localObject1).values().iterator();
                  Object localObject3;
                  do
                  {
                    i12 = i6;
                    if (!localIterator.hasNext()) {
                      break;
                    }
                    localObject3 = localIterator.next();
                    localObject1 = localObject2;
                    if (localObject2 == null) {
                      localObject1 = y0.c.a(localObject3.getClass());
                    }
                    localObject2 = localObject1;
                  } while (((c1)localObject1).c(localObject3));
                  i12 = 0;
                }
              }
              if (i12 != 0) {
                break label606;
              }
              return false;
            }
          }
          else
          {
            if ((!r(paramT, i8, i7)) || (n(i7).c(l1.n(paramT, i9 & 0xFFFFF)))) {
              break label606;
            }
            return false;
          }
        }
        Object localObject2 = (List)l1.n(paramT, i9 & 0xFFFFF);
        if (((List)localObject2).isEmpty())
        {
          i12 = i5;
        }
        else
        {
          localObject1 = n(i7);
          for (i1 = 0;; i1++)
          {
            i12 = i5;
            if (i1 >= ((List)localObject2).size()) {
              break;
            }
            if (!((c1)localObject1).c(((List)localObject2).get(i1)))
            {
              i12 = 0;
              break;
            }
          }
        }
        if (i12 == 0) {
          return false;
        }
      }
      else
      {
        if (h) {
          bool2 = q(i7, paramT);
        } else if ((i3 & i12) != 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        if ((bool2) && (!n(i7).c(l1.n(paramT, i9 & 0xFFFFF)))) {
          return false;
        }
      }
      label606:
      i2++;
      i1 = i4;
    }
    return (!f) || (p.c(paramT).j());
  }
  
  /* Error */
  public final boolean d(T paramT1, T paramT2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 57	s0/r0:a	[I
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
    //   21: invokevirtual 300	s0/r0:F	(I)I
    //   24: istore 6
    //   26: iload 6
    //   28: ldc -15
    //   30: iand
    //   31: i2l
    //   32: lstore 7
    //   34: iload 6
    //   36: ldc_w 301
    //   39: iand
    //   40: bipush 20
    //   42: iushr
    //   43: tableswitch	default:+289->332, 0:+893->936, 1:+858->901, 2:+828->871, 3:+798->841, 4:+769->812, 5:+739->782, 6:+710->753, 7:+681->724, 8:+649->692, 9:+617->660, 10:+585->628, 11:+556->599, 12:+527->570, 13:+498->541, 14:+468->511, 15:+439->482, 16:+409->452, 17:+377->420, 18:+357->400, 19:+357->400, 20:+357->400, 21:+357->400, 22:+357->400, 23:+357->400, 24:+357->400, 25:+357->400, 26:+357->400, 27:+357->400, 28:+357->400, 29:+357->400, 30:+357->400, 31:+357->400, 32:+357->400, 33:+357->400, 34:+357->400, 35:+357->400, 36:+357->400, 37:+357->400, 38:+357->400, 39:+357->400, 40:+357->400, 41:+357->400, 42:+357->400, 43:+357->400, 44:+357->400, 45:+357->400, 46:+357->400, 47:+357->400, 48:+357->400, 49:+357->400, 50:+357->400, 51:+292->335, 52:+292->335, 53:+292->335, 54:+292->335, 55:+292->335, 56:+292->335, 57:+292->335, 58:+292->335, 59:+292->335, 60:+292->335, 61:+292->335, 62:+292->335, 63:+292->335, 64:+292->335, 65:+292->335, 66:+292->335, 67:+292->335, 68:+292->335
    //   332: goto +643 -> 975
    //   335: aload_0
    //   336: getfield 57	s0/r0:a	[I
    //   339: iload 4
    //   341: iconst_2
    //   342: iadd
    //   343: iaload
    //   344: ldc -15
    //   346: iand
    //   347: i2l
    //   348: lstore 9
    //   350: aload_1
    //   351: lload 9
    //   353: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   356: aload_2
    //   357: lload 9
    //   359: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
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
    //   382: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   385: aload_2
    //   386: lload 7
    //   388: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   391: invokestatic 613	s0/d1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   394: ifeq +578 -> 972
    //   397: goto +578 -> 975
    //   400: aload_1
    //   401: lload 7
    //   403: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   406: aload_2
    //   407: lload 7
    //   409: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   412: invokestatic 613	s0/d1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   415: istore 5
    //   417: goto +558 -> 975
    //   420: aload_0
    //   421: iload 4
    //   423: aload_1
    //   424: aload_2
    //   425: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   428: ifeq +544 -> 972
    //   431: aload_1
    //   432: lload 7
    //   434: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   437: aload_2
    //   438: lload 7
    //   440: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   443: invokestatic 613	s0/d1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   446: ifeq +526 -> 972
    //   449: goto +526 -> 975
    //   452: aload_0
    //   453: iload 4
    //   455: aload_1
    //   456: aload_2
    //   457: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   460: ifeq +512 -> 972
    //   463: aload_1
    //   464: lload 7
    //   466: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   469: aload_2
    //   470: lload 7
    //   472: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   475: lcmp
    //   476: ifne +496 -> 972
    //   479: goto +496 -> 975
    //   482: aload_0
    //   483: iload 4
    //   485: aload_1
    //   486: aload_2
    //   487: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   490: ifeq +482 -> 972
    //   493: aload_1
    //   494: lload 7
    //   496: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   499: aload_2
    //   500: lload 7
    //   502: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   505: if_icmpne +467 -> 972
    //   508: goto +467 -> 975
    //   511: aload_0
    //   512: iload 4
    //   514: aload_1
    //   515: aload_2
    //   516: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   519: ifeq +453 -> 972
    //   522: aload_1
    //   523: lload 7
    //   525: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   528: aload_2
    //   529: lload 7
    //   531: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   534: lcmp
    //   535: ifne +437 -> 972
    //   538: goto +437 -> 975
    //   541: aload_0
    //   542: iload 4
    //   544: aload_1
    //   545: aload_2
    //   546: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   549: ifeq +423 -> 972
    //   552: aload_1
    //   553: lload 7
    //   555: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   558: aload_2
    //   559: lload 7
    //   561: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   564: if_icmpne +408 -> 972
    //   567: goto +408 -> 975
    //   570: aload_0
    //   571: iload 4
    //   573: aload_1
    //   574: aload_2
    //   575: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   578: ifeq +394 -> 972
    //   581: aload_1
    //   582: lload 7
    //   584: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   587: aload_2
    //   588: lload 7
    //   590: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   593: if_icmpne +379 -> 972
    //   596: goto +379 -> 975
    //   599: aload_0
    //   600: iload 4
    //   602: aload_1
    //   603: aload_2
    //   604: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   607: ifeq +365 -> 972
    //   610: aload_1
    //   611: lload 7
    //   613: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   616: aload_2
    //   617: lload 7
    //   619: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   622: if_icmpne +350 -> 972
    //   625: goto +350 -> 975
    //   628: aload_0
    //   629: iload 4
    //   631: aload_1
    //   632: aload_2
    //   633: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   636: ifeq +336 -> 972
    //   639: aload_1
    //   640: lload 7
    //   642: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   645: aload_2
    //   646: lload 7
    //   648: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   651: invokestatic 613	s0/d1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   654: ifeq +318 -> 972
    //   657: goto +318 -> 975
    //   660: aload_0
    //   661: iload 4
    //   663: aload_1
    //   664: aload_2
    //   665: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   668: ifeq +304 -> 972
    //   671: aload_1
    //   672: lload 7
    //   674: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   677: aload_2
    //   678: lload 7
    //   680: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   683: invokestatic 613	s0/d1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   686: ifeq +286 -> 972
    //   689: goto +286 -> 975
    //   692: aload_0
    //   693: iload 4
    //   695: aload_1
    //   696: aload_2
    //   697: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   700: ifeq +272 -> 972
    //   703: aload_1
    //   704: lload 7
    //   706: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   709: aload_2
    //   710: lload 7
    //   712: invokestatic 175	s0/l1:n	(Ljava/lang/Object;J)Ljava/lang/Object;
    //   715: invokestatic 613	s0/d1:B	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   718: ifeq +254 -> 972
    //   721: goto +254 -> 975
    //   724: aload_0
    //   725: iload 4
    //   727: aload_1
    //   728: aload_2
    //   729: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   732: ifeq +240 -> 972
    //   735: aload_1
    //   736: lload 7
    //   738: invokestatic 444	s0/l1:f	(Ljava/lang/Object;J)Z
    //   741: aload_2
    //   742: lload 7
    //   744: invokestatic 444	s0/l1:f	(Ljava/lang/Object;J)Z
    //   747: if_icmpne +225 -> 972
    //   750: goto +225 -> 975
    //   753: aload_0
    //   754: iload 4
    //   756: aload_1
    //   757: aload_2
    //   758: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   761: ifeq +211 -> 972
    //   764: aload_1
    //   765: lload 7
    //   767: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   770: aload_2
    //   771: lload 7
    //   773: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   776: if_icmpne +196 -> 972
    //   779: goto +196 -> 975
    //   782: aload_0
    //   783: iload 4
    //   785: aload_1
    //   786: aload_2
    //   787: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   790: ifeq +182 -> 972
    //   793: aload_1
    //   794: lload 7
    //   796: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   799: aload_2
    //   800: lload 7
    //   802: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   805: lcmp
    //   806: ifne +166 -> 972
    //   809: goto +166 -> 975
    //   812: aload_0
    //   813: iload 4
    //   815: aload_1
    //   816: aload_2
    //   817: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   820: ifeq +152 -> 972
    //   823: aload_1
    //   824: lload 7
    //   826: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   829: aload_2
    //   830: lload 7
    //   832: invokestatic 270	s0/l1:l	(Ljava/lang/Object;J)I
    //   835: if_icmpne +137 -> 972
    //   838: goto +137 -> 975
    //   841: aload_0
    //   842: iload 4
    //   844: aload_1
    //   845: aload_2
    //   846: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   849: ifeq +123 -> 972
    //   852: aload_1
    //   853: lload 7
    //   855: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   858: aload_2
    //   859: lload 7
    //   861: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   864: lcmp
    //   865: ifne +107 -> 972
    //   868: goto +107 -> 975
    //   871: aload_0
    //   872: iload 4
    //   874: aload_1
    //   875: aload_2
    //   876: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   879: ifeq +93 -> 972
    //   882: aload_1
    //   883: lload 7
    //   885: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   888: aload_2
    //   889: lload 7
    //   891: invokestatic 531	s0/l1:m	(Ljava/lang/Object;J)J
    //   894: lcmp
    //   895: ifne +77 -> 972
    //   898: goto +77 -> 975
    //   901: aload_0
    //   902: iload 4
    //   904: aload_1
    //   905: aload_2
    //   906: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   909: ifeq +63 -> 972
    //   912: aload_1
    //   913: lload 7
    //   915: invokestatic 447	s0/l1:k	(Ljava/lang/Object;J)F
    //   918: invokestatic 620	java/lang/Float:floatToIntBits	(F)I
    //   921: aload_2
    //   922: lload 7
    //   924: invokestatic 447	s0/l1:k	(Ljava/lang/Object;J)F
    //   927: invokestatic 620	java/lang/Float:floatToIntBits	(F)I
    //   930: if_icmpne +42 -> 972
    //   933: goto +42 -> 975
    //   936: aload_0
    //   937: iload 4
    //   939: aload_1
    //   940: aload_2
    //   941: invokevirtual 616	s0/r0:j	(ILjava/lang/Object;Ljava/lang/Object;)Z
    //   944: ifeq +28 -> 972
    //   947: aload_1
    //   948: lload 7
    //   950: invokestatic 450	s0/l1:j	(Ljava/lang/Object;J)D
    //   953: invokestatic 624	java/lang/Double:doubleToLongBits	(D)J
    //   956: aload_2
    //   957: lload 7
    //   959: invokestatic 450	s0/l1:j	(Ljava/lang/Object;J)D
    //   962: invokestatic 624	java/lang/Double:doubleToLongBits	(D)J
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
    //   989: getfield 90	s0/r0:o	Ls0/h1;
    //   992: aload_1
    //   993: invokevirtual 455	s0/h1:g	(Ljava/lang/Object;)Ls0/i1;
    //   996: aload_0
    //   997: getfield 90	s0/r0:o	Ls0/h1;
    //   1000: aload_2
    //   1001: invokevirtual 455	s0/h1:g	(Ljava/lang/Object;)Ls0/i1;
    //   1004: invokevirtual 627	s0/i1:equals	(Ljava/lang/Object;)Z
    //   1007: ifne +5 -> 1012
    //   1010: iconst_0
    //   1011: ireturn
    //   1012: aload_0
    //   1013: getfield 76	s0/r0:f	Z
    //   1016: ifeq +23 -> 1039
    //   1019: aload_0
    //   1020: getfield 92	s0/r0:p	Ls0/o;
    //   1023: aload_1
    //   1024: invokevirtual 282	s0/o:c	(Ljava/lang/Object;)Ls0/r;
    //   1027: aload_0
    //   1028: getfield 92	s0/r0:p	Ls0/o;
    //   1031: aload_2
    //   1032: invokevirtual 282	s0/o:c	(Ljava/lang/Object;)Ls0/r;
    //   1035: invokevirtual 628	s0/r:equals	(Ljava/lang/Object;)Z
    //   1038: ireturn
    //   1039: iconst_1
    //   1040: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1041	0	this	r0
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
    int i1;
    if (h) {
      i1 = p(paramT);
    } else {
      i1 = o(paramT);
    }
    return i1;
  }
  
  public final T f()
  {
    return (T)m.a(e);
  }
  
  public final int g(T paramT)
  {
    int i1 = a.length;
    int i2 = 0;
    for (int i3 = 0; i2 < i1; i3 = i6)
    {
      int i4 = F(i2);
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
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 67: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 66: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 65: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 64: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 63: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 62: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 61: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 60: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        localObject = l1.n(paramT, l1);
        i6 = i3 * 53;
        break;
      case 59: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 58: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        bool = ((Boolean)l1.n(paramT, l1)).booleanValue();
        break;
      case 57: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 56: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 55: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        i3 = v(paramT, l1);
        break;
      case 54: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        break;
      case 53: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        l1 = w(paramT, l1);
        break;
      case 52: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        f1 = ((Float)l1.n(paramT, l1)).floatValue();
        break;
      case 51: 
        i6 = i3;
        if (!r(paramT, i5, i2)) {
          break label1003;
        }
        i6 = i3 * 53;
        d1 = ((Double)l1.n(paramT, l1)).doubleValue();
        break;
      case 17: 
        localObject = l1.n(paramT, l1);
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
        localObject = l1.n(paramT, l1);
        i3 = localObject.hashCode();
        break;
      case 9: 
        localObject = l1.n(paramT, l1);
        if (localObject != null) {
          i6 = localObject.hashCode();
        }
        i6 = i3 * 53 + i6;
        break;
      case 8: 
        i6 = i3 * 53;
        i3 = ((String)l1.n(paramT, l1)).hashCode();
        break;
      case 7: 
        i6 = i3 * 53;
        bool = l1.f(paramT, l1);
        i3 = x.a(bool);
        break;
      case 4: 
      case 6: 
      case 11: 
      case 12: 
      case 13: 
      case 15: 
        i6 = i3 * 53;
        i3 = l1.l(paramT, l1);
        break;
      case 2: 
      case 3: 
      case 5: 
      case 14: 
      case 16: 
        i6 = i3 * 53;
        l1 = l1.m(paramT, l1);
        break;
      case 1: 
        i6 = i3 * 53;
        f1 = l1.k(paramT, l1);
        i3 = Float.floatToIntBits(f1);
        break;
      }
      i6 = i3 * 53;
      double d1 = l1.j(paramT, l1);
      l1 = Double.doubleToLongBits(d1);
      i3 = x.b(l1);
      i6 = i3 + i6;
      label1003:
      i2 += 3;
    }
    i3 = o.g(paramT).hashCode() + i3 * 53;
    int i6 = i3;
    if (f) {
      i6 = i3 * 53 + p.c(paramT).hashCode();
    }
    return i6;
  }
  
  public final void h(Object paramObject, k paramk)
  {
    paramk.getClass();
    if (h)
    {
      if (f)
      {
        localObject1 = p.c(paramObject);
        if (!((r)localObject1).i())
        {
          localIterator = ((r)localObject1).l();
          localObject1 = (Map.Entry)localIterator.next();
          break label61;
        }
      }
      Iterator localIterator = null;
      Object localObject1 = localIterator;
      label61:
      int i1 = a.length;
      Object localObject2;
      for (int i2 = 0;; i2 += 3)
      {
        localObject2 = localObject1;
        if (i2 >= i1) {
          break;
        }
        int i3 = F(i2);
        int i4 = a[i2];
        while (localObject1 != null)
        {
          p.a((Map.Entry)localObject1);
          if (i4 < 0) {
            break;
          }
          p.j((Map.Entry)localObject1);
          if (localIterator.hasNext()) {
            localObject1 = (Map.Entry)localIterator.next();
          } else {
            localObject1 = null;
          }
        }
        long l1;
        boolean bool;
        float f1;
        double d1;
        switch ((0xFF00000 & i3) >>> 20)
        {
        default: 
          break;
        case 68: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          break;
        case 67: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          l1 = w(paramObject, i3 & 0xFFFFF);
          break;
        case 66: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          i3 = v(paramObject, i3 & 0xFFFFF);
          break;
        case 65: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          l1 = w(paramObject, i3 & 0xFFFFF);
          break;
        case 64: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          i3 = v(paramObject, i3 & 0xFFFFF);
          break;
        case 63: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          i3 = v(paramObject, i3 & 0xFFFFF);
          break;
        case 62: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          i3 = v(paramObject, i3 & 0xFFFFF);
          break;
        case 61: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          break;
        case 60: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          break;
        case 59: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          break;
        case 58: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          bool = ((Boolean)l1.n(paramObject, i3 & 0xFFFFF)).booleanValue();
          break;
        case 57: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          i3 = v(paramObject, i3 & 0xFFFFF);
          break;
        case 56: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          l1 = w(paramObject, i3 & 0xFFFFF);
          break;
        case 55: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          i3 = v(paramObject, i3 & 0xFFFFF);
          break;
        case 54: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          l1 = w(paramObject, i3 & 0xFFFFF);
          break;
        case 53: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          l1 = w(paramObject, i3 & 0xFFFFF);
          break;
        case 52: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          f1 = ((Float)l1.n(paramObject, i3 & 0xFFFFF)).floatValue();
          break;
        case 51: 
          if (!r(paramObject, i4, i2)) {
            continue;
          }
          d1 = ((Double)l1.n(paramObject, i3 & 0xFFFFF)).doubleValue();
          break;
        case 50: 
          H(paramk, i4, l1.n(paramObject, i3 & 0xFFFFF), i2);
          break;
        case 49: 
          d1.K(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, n(i2));
          break;
        case 48: 
          d1.R(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 47: 
          d1.Q(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 46: 
          d1.P(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 45: 
          d1.O(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 44: 
          d1.G(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 43: 
          d1.T(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 42: 
          d1.D(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 41: 
          d1.H(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 40: 
          d1.I(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 39: 
          d1.L(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 38: 
          d1.U(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 37: 
          d1.M(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 36: 
          d1.J(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 35: 
          d1.F(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, true);
          break;
        case 34: 
          d1.R(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 33: 
          d1.Q(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 32: 
          d1.P(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 31: 
          d1.O(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 30: 
          d1.G(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 29: 
          d1.T(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 28: 
          d1.E(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk);
          break;
        case 27: 
          d1.N(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, n(i2));
          break;
        case 26: 
          d1.S(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk);
          break;
        case 25: 
          d1.D(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 24: 
          d1.H(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 23: 
          d1.I(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 22: 
          d1.L(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 21: 
          d1.U(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 20: 
          d1.M(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 19: 
          d1.J(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 18: 
          d1.F(a[i2], (List)l1.n(paramObject, i3 & 0xFFFFF), paramk, false);
          break;
        case 17: 
          if (!q(i2, paramObject)) {
            continue;
          }
          localObject2 = l1.n(paramObject, i3 & 0xFFFFF);
          paramk.h(i4, n(i2), localObject2);
          break;
        case 16: 
          if (!q(i2, paramObject)) {
            continue;
          }
          l1 = l1.m(paramObject, i3 & 0xFFFFF);
          paramk.p(i4, l1);
          break;
        case 15: 
          if (!q(i2, paramObject)) {
            continue;
          }
          i3 = l1.l(paramObject, i3 & 0xFFFFF);
          paramk.o(i4, i3);
          break;
        case 14: 
          if (!q(i2, paramObject)) {
            continue;
          }
          l1 = l1.m(paramObject, i3 & 0xFFFFF);
          paramk.n(i4, l1);
          break;
        case 13: 
          if (!q(i2, paramObject)) {
            continue;
          }
          i3 = l1.l(paramObject, i3 & 0xFFFFF);
          paramk.m(i4, i3);
          break;
        case 12: 
          if (!q(i2, paramObject)) {
            continue;
          }
          i3 = l1.l(paramObject, i3 & 0xFFFFF);
          paramk.d(i4, i3);
          break;
        case 11: 
          if (!q(i2, paramObject)) {
            continue;
          }
          i3 = l1.l(paramObject, i3 & 0xFFFFF);
          paramk.q(i4, i3);
          break;
        case 10: 
          if (!q(i2, paramObject)) {
            continue;
          }
          paramk.b(i4, (g)l1.n(paramObject, i3 & 0xFFFFF));
          break;
        case 9: 
          if (!q(i2, paramObject)) {
            continue;
          }
          localObject2 = l1.n(paramObject, i3 & 0xFFFFF);
          paramk.k(i4, n(i2), localObject2);
          break;
        case 8: 
          if (!q(i2, paramObject)) {
            continue;
          }
          I(i4, l1.n(paramObject, i3 & 0xFFFFF), paramk);
          break;
        case 7: 
          if (!q(i2, paramObject)) {
            continue;
          }
          bool = l1.f(paramObject, i3 & 0xFFFFF);
          paramk.a(i4, bool);
          break;
        case 6: 
          if (!q(i2, paramObject)) {
            continue;
          }
          i3 = l1.l(paramObject, i3 & 0xFFFFF);
          paramk.e(i4, i3);
          break;
        case 5: 
          if (!q(i2, paramObject)) {
            continue;
          }
          l1 = l1.m(paramObject, i3 & 0xFFFFF);
          paramk.f(i4, l1);
          break;
        case 4: 
          if (!q(i2, paramObject)) {
            continue;
          }
          i3 = l1.l(paramObject, i3 & 0xFFFFF);
          paramk.i(i4, i3);
          break;
        case 3: 
          if (!q(i2, paramObject)) {
            continue;
          }
          l1 = l1.m(paramObject, i3 & 0xFFFFF);
          paramk.r(i4, l1);
          break;
        case 2: 
          if (!q(i2, paramObject)) {
            continue;
          }
          l1 = l1.m(paramObject, i3 & 0xFFFFF);
          paramk.j(i4, l1);
          break;
        case 1: 
          if (!q(i2, paramObject)) {
            continue;
          }
          f1 = l1.k(paramObject, i3 & 0xFFFFF);
          paramk.g(f1, i4);
          break;
        }
        if (q(i2, paramObject))
        {
          d1 = l1.j(paramObject, i3 & 0xFFFFF);
          paramk.c(i4, d1);
        }
      }
      while (localObject2 != null)
      {
        p.j((Map.Entry)localObject2);
        if (localIterator.hasNext()) {
          localObject2 = (Map.Entry)localIterator.next();
        } else {
          localObject2 = null;
        }
      }
      localObject1 = o;
      ((h1)localObject1).s(((h1)localObject1).g(paramObject), paramk);
    }
    else
    {
      G(paramObject, paramk);
    }
  }
  
  public final void i(T paramT, b1 paramb1, n paramn)
  {
    paramn.getClass();
    h1 localh1 = o;
    o localo = p;
    Object localObject1 = null;
    Object localObject3 = null;
    for (;;)
    {
      Object localObject4 = localObject1;
      try
      {
        int i1 = paramb1.A();
        localObject4 = localObject1;
        int i2 = x(i1);
        Object localObject5;
        Object localObject6;
        boolean bool;
        if (i2 < 0)
        {
          if (i1 == Integer.MAX_VALUE)
          {
            i3 = k;
            paramb1 = (b1)localObject1;
            while (i3 < l)
            {
              paramb1 = k(paramT, j[i3], paramb1, localh1);
              i3++;
            }
            if (paramb1 == null) {
              break label3590;
            }
            break label3583;
          }
          localObject4 = localObject1;
          if (!f)
          {
            localObject5 = null;
          }
          else
          {
            localObject4 = localObject1;
            localObject5 = localo.b(paramn, e, i1);
          }
          if (localObject5 != null)
          {
            localObject6 = localObject3;
            if (localObject3 == null)
            {
              localObject4 = localObject1;
              localObject6 = localo.d(paramT);
            }
            localObject4 = localObject1;
            localObject1 = localo.g(localObject5);
            localObject3 = localObject6;
            continue;
          }
          localObject4 = localObject1;
          localh1.p();
          localObject6 = localObject1;
          if (localObject1 == null)
          {
            localObject4 = localObject1;
            localObject6 = localh1.f(paramT);
          }
          localObject4 = localObject6;
          bool = localh1.l(localObject6, paramb1);
          if (bool)
          {
            localObject1 = localObject6;
            continue;
          }
          i3 = k;
          paramb1 = (b1)localObject6;
          while (i3 < l)
          {
            paramb1 = k(paramT, j[i3], paramb1, localh1);
            i3++;
          }
          if (paramb1 == null) {
            break label3590;
          }
          break label3583;
        }
        localObject4 = localObject1;
        int i4 = F(i2);
        switch ((0xFF00000 & i4) >>> 20)
        {
        default: 
          localObject6 = localObject1;
          if (localObject1 == null)
          {
            localObject5 = localObject1;
            localObject4 = localObject1;
          }
          break;
        }
        try
        {
          localObject6 = localh1.m();
          break label3410;
          long l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          localObject6 = paramb1.B(n(i2), paramn);
          break label1295;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          long l2 = paramb1.w();
          int i5;
          for (;;)
          {
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = Long.valueOf(l2);
            break;
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            i3 = paramb1.v();
            for (;;)
            {
              localObject5 = localObject1;
              localObject4 = localObject1;
              localObject6 = Integer.valueOf(i3);
              break label1295;
              l1 = i4 & 0xFFFFF;
              localObject5 = localObject1;
              localObject4 = localObject1;
              l2 = paramb1.l();
              break;
              l1 = i4 & 0xFFFFF;
              localObject5 = localObject1;
              localObject4 = localObject1;
              i3 = paramb1.I();
              continue;
              localObject5 = localObject1;
              localObject4 = localObject1;
              i5 = paramb1.t();
              localObject5 = localObject1;
              localObject4 = localObject1;
              localObject6 = l(i2);
              if (localObject6 != null)
              {
                i3 = i5;
                localObject5 = localObject1;
                localObject4 = localObject1;
                if (!((x.b)localObject6).a()) {
                  break label2833;
                }
              }
              l1 = i4 & 0xFFFFF;
              localObject5 = localObject1;
              localObject4 = localObject1;
              localObject6 = Integer.valueOf(i5);
              break label1295;
              l1 = i4 & 0xFFFFF;
              localObject5 = localObject1;
              localObject4 = localObject1;
              i3 = paramb1.n();
              continue;
              l1 = i4 & 0xFFFFF;
              localObject5 = localObject1;
              localObject4 = localObject1;
              localObject6 = paramb1.E();
              break label1295;
              localObject5 = localObject1;
              localObject4 = localObject1;
              if (r(paramT, i1, i2))
              {
                l1 = i4 & 0xFFFFF;
                localObject5 = localObject1;
                localObject4 = localObject1;
                localObject6 = x.c(l1.n(paramT, l1), paramb1.y(n(i2), paramn));
                break label1295;
              }
              localObject5 = localObject1;
              localObject4 = localObject1;
              l1.u(paramT, i4 & 0xFFFFF, paramb1.y(n(i2), paramn));
              localObject5 = localObject1;
              localObject4 = localObject1;
              D(i2, paramT);
              break label1311;
              localObject5 = localObject1;
              localObject4 = localObject1;
              A(paramT, i4, paramb1);
              break label1311;
              l1 = i4 & 0xFFFFF;
              localObject5 = localObject1;
              localObject4 = localObject1;
              localObject6 = Boolean.valueOf(paramb1.k());
              break label1295;
              l1 = i4 & 0xFFFFF;
              localObject5 = localObject1;
              localObject4 = localObject1;
              i3 = paramb1.j();
              continue;
              l1 = i4 & 0xFFFFF;
              localObject5 = localObject1;
              localObject4 = localObject1;
              l2 = paramb1.d();
              break;
              l1 = i4 & 0xFFFFF;
              localObject5 = localObject1;
              localObject4 = localObject1;
              i3 = paramb1.G();
            }
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            l2 = paramb1.c();
            continue;
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            l2 = paramb1.L();
          }
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          localObject6 = Float.valueOf(paramb1.readFloat());
          break label1295;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          localObject6 = Double.valueOf(paramb1.readDouble());
          label1295:
          localObject5 = localObject1;
          localObject4 = localObject1;
          l1.u(paramT, l1, localObject6);
          label1311:
          localObject5 = localObject1;
          localObject4 = localObject1;
          E(paramT, i1, i2);
          continue;
          localObject5 = localObject1;
          localObject4 = localObject1;
          t(paramT, i2, m(i2), paramn, paramb1);
          continue;
          localObject5 = localObject1;
          localObject4 = localObject1;
          y(paramT, i4 & 0xFFFFF, paramb1, n(i2), paramn);
          continue;
          localObject5 = localObject1;
          localObject4 = localObject1;
          localObject6 = n;
          l1 = i4 & 0xFFFFF;
          break label1755;
          localObject5 = localObject1;
          localObject4 = localObject1;
          localObject6 = n;
          l1 = i4 & 0xFFFFF;
          break label1780;
          localObject5 = localObject1;
          localObject4 = localObject1;
          localObject6 = n;
          l1 = i4 & 0xFFFFF;
          break label1805;
          localObject5 = localObject1;
          localObject4 = localObject1;
          localObject6 = n;
          l1 = i4 & 0xFFFFF;
          break label1830;
          localObject5 = localObject1;
          localObject4 = localObject1;
          for (Object localObject7 = n.c(paramT, i4 & 0xFFFFF);; localObject7 = n.c(paramT, i4 & 0xFFFFF))
          {
            localObject5 = localObject1;
            localObject4 = localObject1;
            paramb1.s((List)localObject7);
            break label1882;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = n;
            l1 = i4 & 0xFFFFF;
            break label2247;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = n;
            l1 = i4 & 0xFFFFF;
            break label2348;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = n;
            l1 = i4 & 0xFFFFF;
            break label2373;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = n;
            l1 = i4 & 0xFFFFF;
            break label2398;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = n;
            l1 = i4 & 0xFFFFF;
            break label2423;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = n;
            l1 = i4 & 0xFFFFF;
            break label2448;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = n;
            l1 = i4 & 0xFFFFF;
            break label2473;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = n;
            l1 = i4 & 0xFFFFF;
            break label2498;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = n;
            l1 = i4 & 0xFFFFF;
            break label2523;
            label1755:
            localObject5 = localObject1;
            localObject4 = localObject1;
            paramb1.f(((e0)localObject6).c(paramT, l1));
            break;
            label1780:
            localObject5 = localObject1;
            localObject4 = localObject1;
            paramb1.b(((e0)localObject6).c(paramT, l1));
            break;
            label1805:
            localObject5 = localObject1;
            localObject4 = localObject1;
            paramb1.q(((e0)localObject6).c(paramT, l1));
            break;
            label1830:
            localObject5 = localObject1;
            localObject4 = localObject1;
            paramb1.e(((e0)localObject6).c(paramT, l1));
            break;
            localObject5 = localObject1;
            localObject4 = localObject1;
          }
          label1882:
          localObject5 = localObject1;
          localObject4 = localObject1;
          x.b localb = l(i2);
          localObject5 = localObject1;
          localObject4 = localObject1;
          localObject6 = d1.a;
          if (localb == null) {
            continue;
          }
          localObject5 = localObject1;
          localObject4 = localObject1;
          Object localObject8;
          if ((localObject7 instanceof RandomAccess))
          {
            localObject5 = localObject1;
            localObject4 = localObject1;
            i2 = ((List)localObject7).size();
            i3 = 0;
            i5 = 0;
            localObject8 = localObject1;
            while (i3 < i2)
            {
              localObject5 = localObject1;
              localObject4 = localObject1;
              i4 = ((Integer)((List)localObject7).get(i3)).intValue();
              localObject5 = localObject1;
              localObject4 = localObject1;
              if (localb.a())
              {
                if (i3 != i5)
                {
                  localObject5 = localObject1;
                  localObject4 = localObject1;
                  ((List)localObject7).set(i5, Integer.valueOf(i4));
                }
                i5++;
              }
              else
              {
                localObject5 = localObject1;
                localObject4 = localObject1;
                localObject8 = d1.C(i1, i4, localObject8, localh1);
              }
              i3++;
            }
            localObject6 = localObject8;
            if (i5 != i2)
            {
              localObject5 = localObject1;
              localObject4 = localObject1;
              ((List)localObject7).subList(i5, i2).clear();
              localObject6 = localObject8;
            }
          }
          else
          {
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject7 = ((List)localObject7).iterator();
            localObject8 = localObject1;
            for (;;)
            {
              localObject6 = localObject8;
              localObject5 = localObject1;
              localObject4 = localObject1;
              if (!((Iterator)localObject7).hasNext()) {
                break;
              }
              localObject5 = localObject1;
              localObject4 = localObject1;
              i3 = ((Integer)((Iterator)localObject7).next()).intValue();
              localObject5 = localObject1;
              localObject4 = localObject1;
              if (!localb.a())
              {
                localObject5 = localObject1;
                localObject4 = localObject1;
                localObject8 = d1.C(i1, i3, localObject8, localh1);
                localObject5 = localObject1;
                localObject4 = localObject1;
                ((Iterator)localObject7).remove();
              }
            }
          }
          localObject1 = localObject6;
          continue;
          label2247:
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.h(((e0)localObject6).c(paramT, l1));
          continue;
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.J(n.c(paramT, i4 & 0xFFFFF));
          continue;
          localObject5 = localObject1;
          localObject4 = localObject1;
          z(paramT, i4, paramb1, n(i2), paramn);
          continue;
          localObject5 = localObject1;
          localObject4 = localObject1;
          B(paramT, i4, paramb1);
          continue;
          label2348:
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.x(((e0)localObject6).c(paramT, l1));
          continue;
          label2373:
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.u(((e0)localObject6).c(paramT, l1));
          continue;
          label2398:
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.N(((e0)localObject6).c(paramT, l1));
          continue;
          label2423:
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.r(((e0)localObject6).c(paramT, l1));
          continue;
          label2448:
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.m(((e0)localObject6).c(paramT, l1));
          continue;
          label2473:
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.o(((e0)localObject6).c(paramT, l1));
          continue;
          label2498:
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.F(((e0)localObject6).c(paramT, l1));
          continue;
          label2523:
          localObject5 = localObject1;
          localObject4 = localObject1;
          paramb1.K(((e0)localObject6).c(paramT, l1));
          continue;
          localObject5 = localObject1;
          localObject4 = localObject1;
          if (q(i2, paramT))
          {
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject8 = l1.n(paramT, i4 & 0xFFFFF);
            localObject5 = localObject1;
            localObject4 = localObject1;
          }
          for (localObject6 = paramb1.B(n(i2), paramn);; localObject6 = paramb1.y(n(i2), paramn))
          {
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = x.c(localObject8, localObject6);
            break label2998;
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = paramb1.B(n(i2), paramn);
            break label3052;
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            l2 = paramb1.w();
            break label3284;
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            i3 = paramb1.v();
            break label3214;
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            l2 = paramb1.l();
            break label3284;
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            i3 = paramb1.I();
            break label3214;
            localObject5 = localObject1;
            localObject4 = localObject1;
            i5 = paramb1.t();
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = l(i2);
            if (localObject6 != null)
            {
              i3 = i5;
              localObject5 = localObject1;
              localObject4 = localObject1;
              if (!((x.b)localObject6).a())
              {
                label2833:
                localObject5 = localObject1;
                localObject4 = localObject1;
                localObject1 = d1.C(i1, i3, localObject1, localh1);
                break;
              }
            }
            localObject5 = localObject1;
            localObject4 = localObject1;
            l1.s(paramT, i5, i4 & 0xFFFFF);
            break label3392;
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            i3 = paramb1.n();
            break label3214;
            l1 = i4 & 0xFFFFF;
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject6 = paramb1.E();
            break label3052;
            localObject5 = localObject1;
            localObject4 = localObject1;
            if (!q(i2, paramT)) {
              break label3021;
            }
            localObject5 = localObject1;
            localObject4 = localObject1;
            localObject8 = l1.n(paramT, i4 & 0xFFFFF);
            localObject5 = localObject1;
            localObject4 = localObject1;
          }
          label2998:
          localObject5 = localObject1;
          localObject4 = localObject1;
          l1.u(paramT, i4 & 0xFFFFF, localObject6);
          continue;
          label3021:
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          localObject6 = paramb1.y(n(i2), paramn);
          label3052:
          localObject5 = localObject1;
          localObject4 = localObject1;
          l1.u(paramT, l1, localObject6);
          break label3392;
          localObject5 = localObject1;
          localObject4 = localObject1;
          A(paramT, i4, paramb1);
          break label3392;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          bool = paramb1.k();
          localObject5 = localObject1;
          localObject4 = localObject1;
          l1.d.k(paramT, l1, bool);
          break label3392;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          i3 = paramb1.j();
          break label3214;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          l2 = paramb1.d();
          break label3284;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          i3 = paramb1.G();
          label3214:
          localObject5 = localObject1;
          localObject4 = localObject1;
          l1.s(paramT, i3, l1);
          break label3392;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          l2 = paramb1.c();
          break label3284;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          l2 = paramb1.L();
          label3284:
          localObject5 = localObject1;
          localObject4 = localObject1;
          l1.t(paramT, l1, l2);
          break label3392;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          float f1 = paramb1.readFloat();
          localObject5 = localObject1;
          localObject4 = localObject1;
          l1.d.n(paramT, l1, f1);
          break label3392;
          l1 = i4 & 0xFFFFF;
          localObject5 = localObject1;
          localObject4 = localObject1;
          double d1 = paramb1.readDouble();
          localObject5 = localObject1;
          localObject4 = localObject1;
          l1.d.m(paramT, l1, d1);
          label3392:
          localObject5 = localObject1;
          localObject4 = localObject1;
          D(i2, paramT);
          continue;
          label3410:
          localObject5 = localObject6;
          localObject4 = localObject6;
          bool = localh1.l(localObject6, paramb1);
          localObject1 = localObject6;
          if (bool) {
            continue;
          }
          i3 = k;
          paramb1 = (b1)localObject6;
          while (i3 < l)
          {
            paramb1 = k(paramT, j[i3], paramb1, localh1);
            i3++;
          }
          if (paramb1 == null) {
            break label3590;
          }
        }
        catch (y.a locala)
        {
          localObject4 = localObject5;
          localh1.p();
          localObject6 = localObject5;
          if (localObject5 == null)
          {
            localObject4 = localObject5;
            localObject6 = localh1.f(paramT);
          }
          localObject4 = localObject6;
          bool = localh1.l(localObject6, paramb1);
          Object localObject2 = localObject6;
        }
        if (bool) {
          continue;
        }
        i3 = k;
        paramb1 = (b1)localObject6;
        while (i3 < l)
        {
          paramb1 = k(paramT, j[i3], paramb1, localh1);
          i3++;
        }
        if (paramb1 != null) {
          label3583:
          localh1.n(paramT, paramb1);
        }
        label3590:
        return;
      }
      finally
      {
        for (int i3 = k; i3 < l; i3++) {
          localObject4 = k(paramT, j[i3], localObject4, localh1);
        }
        if (localObject4 != null) {
          localh1.n(paramT, localObject4);
        }
      }
    }
  }
  
  public final boolean j(int paramInt, Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (q(paramInt, paramObject1) == q(paramInt, paramObject2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final <UT, UB> UB k(Object paramObject, int paramInt, UB paramUB, h1<UT, UB> paramh1)
  {
    int i1 = a[paramInt];
    paramObject = l1.n(paramObject, F(paramInt) & 0xFFFFF);
    if (paramObject == null) {
      return paramUB;
    }
    x.b localb = l(paramInt);
    if (localb == null) {
      return paramUB;
    }
    paramObject = q.e(paramObject);
    h0.a locala = q.c(m(paramInt));
    Iterator localIterator = ((i0)paramObject).entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((Integer)localEntry.getValue()).intValue();
      if (!localb.a())
      {
        paramObject = paramUB;
        if (paramUB == null) {
          paramObject = paramh1.m();
        }
        paramInt = h0.a(locala, localEntry.getKey(), localEntry.getValue());
        paramUB = new byte[paramInt];
        Object localObject = j.c;
        localObject = new j.b(paramUB, paramInt);
        try
        {
          h0.b((j)localObject, locala, localEntry.getKey(), localEntry.getValue());
          if (f - g == 0)
          {
            paramh1.d(paramObject, i1, new g.e(paramUB));
            localIterator.remove();
            paramUB = (UB)paramObject;
          }
          else
          {
            throw new IllegalStateException("Did not write as much data as expected.");
          }
        }
        catch (IOException paramObject)
        {
          throw new RuntimeException((Throwable)paramObject);
        }
      }
    }
    return paramUB;
  }
  
  public final x.b l(int paramInt)
  {
    return (x.b)b[(paramInt / 3 * 2 + 1)];
  }
  
  public final Object m(int paramInt)
  {
    return b[(paramInt / 3 * 2)];
  }
  
  public final c1 n(int paramInt)
  {
    paramInt = paramInt / 3 * 2;
    Object[] arrayOfObject = b;
    c1 localc1 = (c1)arrayOfObject[paramInt];
    if (localc1 != null) {
      return localc1;
    }
    localc1 = y0.c.a((Class)arrayOfObject[(paramInt + 1)]);
    b[paramInt] = localc1;
    return localc1;
  }
  
  public final int o(T paramT)
  {
    Unsafe localUnsafe = s;
    int i1 = -1;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    while (i2 < a.length)
    {
      int i5 = F(i2);
      localObject1 = a;
      int i6 = localObject1[i2];
      int i7 = (0xFF00000 & i5) >>> 20;
      int i12;
      int i13;
      if (i7 <= 17)
      {
        int i8 = localObject1[(i2 + 2)];
        int i9 = i8 & 0xFFFFF;
        i10 = 1 << (i8 >>> 20);
        i11 = i1;
        i12 = i8;
        i13 = i10;
        if (i9 != i1)
        {
          i4 = localUnsafe.getInt(paramT, i9);
          i11 = i9;
          i12 = i8;
          i13 = i10;
        }
      }
      else
      {
        if ((i) && (i7 >= s.b.f()) && (i7 <= s.c.f())) {
          i10 = a[(i2 + 2)] & 0xFFFFF;
        } else {
          i10 = 0;
        }
        i13 = 0;
        i12 = i10;
        i11 = i1;
      }
      long l1 = i5 & 0xFFFFF;
      Object localObject2;
      switch (i7)
      {
      default: 
        i10 = i3;
        break;
      case 68: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        break;
      case 67: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        l1 = w(paramT, l1);
        break;
      case 66: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        i10 = v(paramT, l1);
        break;
      case 65: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        break;
      case 64: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        break;
      case 63: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        i10 = v(paramT, l1);
        break;
      case 62: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        i10 = v(paramT, l1);
        break;
      case 61: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        break;
      case 60: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        break;
      case 59: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        localObject2 = localUnsafe.getObject(paramT, l1);
        localObject1 = localObject2;
        if (!(localObject2 instanceof g)) {}
        break;
      case 58: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        break;
      case 57: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        i10 = j.z(i6);
        break;
      case 56: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        i10 = j.A(i6);
        break;
      case 55: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        i10 = v(paramT, l1);
        i10 = j.D(i6, i10);
        break;
      case 54: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        l1 = w(paramT, l1);
        i10 = j.Q(i6, l1);
        break;
      case 53: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        l1 = w(paramT, l1);
        i10 = j.F(i6, l1);
        break;
      case 52: 
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
        i10 = j.B(i6);
        break;
      case 51: 
        label803:
        label837:
        label873:
        label909:
        label937:
        i10 = i3;
        if (!r(paramT, i6, i2)) {
          break label2373;
        }
      }
      label1557:
      label1854:
      do
      {
        i10 = j.x(i6);
        break label1854;
        i10 = q.f(i6, localUnsafe.getObject(paramT, l1), m(i2));
        break label1854;
        i10 = d1.j(i6, (List)localUnsafe.getObject(paramT, l1), n(i2));
        break label1854;
        i1 = d1.t((List)localUnsafe.getObject(paramT, l1));
        i10 = i3;
        if (i1 <= 0) {
          break label2373;
        }
        i10 = i1;
        if (i)
        {
          i10 = i1;
          break label1557;
          i1 = d1.r((List)localUnsafe.getObject(paramT, l1));
          i10 = i3;
          if (i1 <= 0) {
            break label2373;
          }
          i10 = i1;
          if (i)
          {
            i10 = i1;
            break label1557;
            i1 = d1.i((List)localUnsafe.getObject(paramT, l1));
            i10 = i3;
            if (i1 <= 0) {
              break label2373;
            }
            i10 = i1;
            if (i)
            {
              i10 = i1;
              break label1557;
              i1 = d1.g((List)localUnsafe.getObject(paramT, l1));
              i10 = i3;
              if (i1 <= 0) {
                break label2373;
              }
              i10 = i1;
              if (i)
              {
                i10 = i1;
                break label1557;
                i1 = d1.e((List)localUnsafe.getObject(paramT, l1));
                i10 = i3;
                if (i1 <= 0) {
                  break label2373;
                }
                i10 = i1;
                if (i)
                {
                  i10 = i1;
                  break label1557;
                  i1 = d1.w((List)localUnsafe.getObject(paramT, l1));
                  i10 = i3;
                  if (i1 <= 0) {
                    break label2373;
                  }
                  i10 = i1;
                  if (i)
                  {
                    i10 = i1;
                    break label1557;
                    i1 = d1.b((List)localUnsafe.getObject(paramT, l1));
                    i10 = i3;
                    if (i1 <= 0) {
                      break label2373;
                    }
                    i10 = i1;
                    if (i)
                    {
                      i10 = i1;
                      break label1557;
                      i1 = d1.g((List)localUnsafe.getObject(paramT, l1));
                      i10 = i3;
                      if (i1 <= 0) {
                        break label2373;
                      }
                      i10 = i1;
                      if (i)
                      {
                        i10 = i1;
                        break label1557;
                        i1 = d1.i((List)localUnsafe.getObject(paramT, l1));
                        i10 = i3;
                        if (i1 <= 0) {
                          break label2373;
                        }
                        i10 = i1;
                        if (i)
                        {
                          i10 = i1;
                          break label1557;
                          i1 = d1.l((List)localUnsafe.getObject(paramT, l1));
                          i10 = i3;
                          if (i1 <= 0) {
                            break label2373;
                          }
                          i10 = i1;
                          if (i)
                          {
                            i10 = i1;
                            break label1557;
                            i1 = d1.y((List)localUnsafe.getObject(paramT, l1));
                            i10 = i3;
                            if (i1 <= 0) {
                              break label2373;
                            }
                            i10 = i1;
                            if (i)
                            {
                              i10 = i1;
                              break label1557;
                              i1 = d1.n((List)localUnsafe.getObject(paramT, l1));
                              i10 = i3;
                              if (i1 <= 0) {
                                break label2373;
                              }
                              i10 = i1;
                              if (i)
                              {
                                i10 = i1;
                                break label1557;
                                i1 = d1.g((List)localUnsafe.getObject(paramT, l1));
                                i10 = i3;
                                if (i1 <= 0) {
                                  break label2373;
                                }
                                i10 = i1;
                                if (i)
                                {
                                  i10 = i1;
                                  break label1557;
                                  i1 = d1.i((List)localUnsafe.getObject(paramT, l1));
                                  i10 = i3;
                                  if (i1 <= 0) {
                                    break label2373;
                                  }
                                  i10 = i1;
                                  if (i)
                                  {
                                    i10 = i1;
                                    localUnsafe.putInt(paramT, i12, i10);
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
        i1 = j.N(i6);
        i10 = j.P(i10) + i1 + i10 + i3;
        break label2373;
        i10 = d1.s(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.q(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.d(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.v(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.c(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.p(i6, (List)localUnsafe.getObject(paramT, l1), n(i2));
        break label1854;
        i10 = d1.u(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.a(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.h(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.k(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.x(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.m(i6, (List)localUnsafe.getObject(paramT, l1));
        break label1854;
        i10 = d1.f(i6, (List)localUnsafe.getObject(paramT, l1));
        for (;;)
        {
          i10 = i3 + i10;
          break;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          i10 = j.C(i6, (o0)localUnsafe.getObject(paramT, l1), n(i2));
          continue;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          l1 = localUnsafe.getLong(paramT, l1);
          i10 = j.K(i6, l1);
          continue;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          i10 = localUnsafe.getInt(paramT, l1);
          i10 = j.J(i6, i10);
          continue;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          i10 = j.I(i6);
          continue;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          i10 = j.H(i6);
          continue;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          i10 = localUnsafe.getInt(paramT, l1);
          i10 = j.y(i6, i10);
          continue;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          i10 = localUnsafe.getInt(paramT, l1);
          i10 = j.O(i6, i10);
          continue;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          i10 = j.w(i6, (g)localUnsafe.getObject(paramT, l1));
          continue;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          localObject1 = localUnsafe.getObject(paramT, l1);
          i10 = d1.o(i6, n(i2), localObject1);
          continue;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          localObject2 = localUnsafe.getObject(paramT, l1);
          localObject1 = localObject2;
          if ((localObject2 instanceof g)) {
            i10 = j.w(i6, (g)localObject2);
          } else {
            i10 = j.L(i6, (String)localObject1);
          }
          i10 += i3;
          break;
          i10 = i3;
          if ((i4 & i13) == 0) {
            break;
          }
          i10 = j.v(i6);
        }
        i10 = i3;
        if ((i4 & i13) == 0) {
          break label2373;
        }
        break;
        i10 = i3;
        if ((i4 & i13) == 0) {
          break label2373;
        }
        break label803;
        i10 = i3;
        if ((i4 & i13) == 0) {
          break label2373;
        }
        i10 = localUnsafe.getInt(paramT, l1);
        break label837;
        i10 = i3;
        if ((i4 & i13) == 0) {
          break label2373;
        }
        l1 = localUnsafe.getLong(paramT, l1);
        break label873;
        i10 = i3;
        if ((i4 & i13) == 0) {
          break label2373;
        }
        l1 = localUnsafe.getLong(paramT, l1);
        break label909;
        i10 = i3;
        if ((i4 & i13) == 0) {
          break label2373;
        }
        break label937;
        i10 = i3;
      } while ((i4 & i13) != 0);
      label2373:
      i2 += 3;
      i1 = i11;
      i3 = i10;
    }
    Object localObject1 = o;
    int i11 = ((h1)localObject1).h(((h1)localObject1).g(paramT)) + i3;
    int i10 = i11;
    if (f) {
      i10 = i11 + p.c(paramT).h();
    }
    return i10;
  }
  
  public final int p(T paramT)
  {
    Unsafe localUnsafe = s;
    int i1 = 0;
    int i4;
    for (int i2 = i1; i1 < a.length; i2 = i4)
    {
      int i3 = F(i1);
      i4 = (0xFF00000 & i3) >>> 20;
      int i5 = a[i1];
      long l1 = i3 & 0xFFFFF;
      if ((i4 >= s.b.f()) && (i4 <= s.c.f())) {
        i3 = a[(i1 + 2)] & 0xFFFFF;
      } else {
        i3 = 0;
      }
      Object localObject1;
      int i6;
      switch (i4)
      {
      default: 
        i4 = i2;
        break;
      case 68: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 67: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        l1 = w(paramT, l1);
        break;
      case 66: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        i4 = v(paramT, l1);
        break;
      case 65: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 64: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 63: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        i4 = v(paramT, l1);
        break;
      case 62: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        i4 = v(paramT, l1);
        break;
      case 61: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 60: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 59: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        localObject1 = l1.n(paramT, l1);
        localObject2 = localObject1;
        if (!(localObject1 instanceof g)) {}
        break;
      case 58: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 57: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 56: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 55: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        i4 = v(paramT, l1);
        break;
      case 54: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        l1 = w(paramT, l1);
        break;
      case 53: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        l1 = w(paramT, l1);
        break;
      case 52: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 51: 
        i4 = i2;
        if (!r(paramT, i5, i1)) {
          break label2246;
        }
        break;
      case 50: 
        i4 = q.f(i5, l1.n(paramT, l1), m(i1));
        break;
      case 49: 
        i4 = d1.j(i5, s(paramT, l1), n(i1));
        break;
      case 48: 
        i6 = d1.t((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 47: 
        i6 = d1.r((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 46: 
        i6 = d1.i((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 45: 
        i6 = d1.g((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 44: 
        i6 = d1.e((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 43: 
        i6 = d1.w((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 42: 
        i6 = d1.b((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 41: 
        i6 = d1.g((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 40: 
        i6 = d1.i((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 39: 
        i6 = d1.l((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 38: 
        i6 = d1.y((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 37: 
        i6 = d1.n((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 36: 
        i6 = d1.g((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i) {
          i4 = i6;
        }
        break;
      case 35: 
        i6 = d1.i((List)localUnsafe.getObject(paramT, l1));
        i4 = i2;
        if (i6 <= 0) {
          break label2246;
        }
        i4 = i6;
        if (i)
        {
          i4 = i6;
          localUnsafe.putInt(paramT, i3, i4);
        }
        i3 = j.N(i5);
        i4 = i2 + (j.P(i4) + i3 + i4);
        break;
      case 34: 
        i4 = d1.s(i5, s(paramT, l1));
        break;
      case 33: 
        i4 = d1.q(i5, s(paramT, l1));
        break;
      case 30: 
        i4 = d1.d(i5, s(paramT, l1));
        break;
      case 29: 
        i4 = d1.v(i5, s(paramT, l1));
        break;
      case 28: 
        i4 = d1.c(i5, s(paramT, l1));
        break;
      case 27: 
        i4 = d1.p(i5, s(paramT, l1), n(i1));
        break;
      case 26: 
        i4 = d1.u(i5, s(paramT, l1));
        break;
      case 25: 
        i4 = d1.a(i5, s(paramT, l1));
        break;
      case 22: 
        i4 = d1.k(i5, s(paramT, l1));
        break;
      case 21: 
        i4 = d1.x(i5, s(paramT, l1));
        break;
      case 20: 
        i4 = d1.m(i5, s(paramT, l1));
        break;
      case 19: 
      case 24: 
      case 31: 
        i4 = d1.f(i5, s(paramT, l1));
        break;
      case 18: 
      case 23: 
      case 32: 
        i4 = d1.h(i5, s(paramT, l1));
        break;
      case 17: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = j.C(i5, (o0)l1.n(paramT, l1), n(i1));
        break;
      case 16: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        l1 = l1.m(paramT, l1);
        i4 = j.K(i5, l1);
        break;
      case 15: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = l1.l(paramT, l1);
        i4 = j.J(i5, i4);
        break;
      case 14: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = j.I(i5);
        break;
      case 13: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = j.H(i5);
        break;
      case 12: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = l1.l(paramT, l1);
        i4 = j.y(i5, i4);
        break;
      case 11: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = l1.l(paramT, l1);
        i4 = j.O(i5, i4);
        break;
      case 10: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = j.w(i5, (g)l1.n(paramT, l1));
        break;
      case 9: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        localObject2 = l1.n(paramT, l1);
        i4 = d1.o(i5, n(i1), localObject2);
        break;
      case 8: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        localObject1 = l1.n(paramT, l1);
        localObject2 = localObject1;
        if ((localObject1 instanceof g)) {
          i4 = j.w(i5, (g)localObject1);
        } else {
          i4 = j.L(i5, (String)localObject2);
        }
        i4 = i2 + i4;
        break;
      case 7: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = j.v(i5);
        break;
      case 6: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = j.z(i5);
        break;
      case 5: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = j.A(i5);
        break;
      case 4: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = l1.l(paramT, l1);
        i4 = j.D(i5, i4);
        break;
      case 3: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        l1 = l1.m(paramT, l1);
        i4 = j.Q(i5, l1);
        break;
      case 2: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        l1 = l1.m(paramT, l1);
        i4 = j.F(i5, l1);
        break;
      case 1: 
        i4 = i2;
        if (!q(i1, paramT)) {
          break label2246;
        }
        i4 = j.B(i5);
        break;
      }
      i4 = i2;
      if (q(i1, paramT))
      {
        i4 = j.x(i5);
        i4 = i2 + i4;
      }
      label2246:
      i1 += 3;
    }
    Object localObject2 = o;
    return ((h1)localObject2).h(((h1)localObject2).g(paramT)) + i2;
  }
  
  public final boolean q(int paramInt, Object paramObject)
  {
    boolean bool1 = h;
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
    if (bool1)
    {
      paramInt = F(paramInt);
      long l1 = paramInt & 0xFFFFF;
      switch ((paramInt & 0xFF00000) >>> 20)
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        if (l1.n(paramObject, l1) != null) {
          bool17 = true;
        }
        return bool17;
      case 16: 
        bool17 = bool2;
        if (l1.m(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 15: 
        bool17 = bool3;
        if (l1.l(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 14: 
        bool17 = bool4;
        if (l1.m(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 13: 
        bool17 = bool5;
        if (l1.l(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 12: 
        bool17 = bool6;
        if (l1.l(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 11: 
        bool17 = bool7;
        if (l1.l(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 10: 
        bool17 = g.b.equals(l1.n(paramObject, l1));
      case 9: 
      case 8: 
        for (;;)
        {
          return bool17 ^ true;
          bool17 = bool8;
          if (l1.n(paramObject, l1) != null) {
            bool17 = true;
          }
          return bool17;
          paramObject = l1.n(paramObject, l1);
          if ((paramObject instanceof String))
          {
            bool17 = ((String)paramObject).isEmpty();
          }
          else
          {
            if (!(paramObject instanceof g)) {
              break;
            }
            bool17 = g.b.equals(paramObject);
          }
        }
        throw new IllegalArgumentException();
      case 7: 
        return l1.f(paramObject, l1);
      case 6: 
        bool17 = bool9;
        if (l1.l(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 5: 
        bool17 = bool10;
        if (l1.m(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 4: 
        bool17 = bool11;
        if (l1.l(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 3: 
        bool17 = bool12;
        if (l1.m(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 2: 
        bool17 = bool13;
        if (l1.m(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 1: 
        bool17 = bool14;
        if (l1.k(paramObject, l1) != 0.0F) {
          bool17 = true;
        }
        return bool17;
      }
      bool17 = bool15;
      if (l1.j(paramObject, l1) != 0.0D) {
        bool17 = true;
      }
      return bool17;
    }
    paramInt = a[(paramInt + 2)];
    bool17 = bool16;
    if ((l1.l(paramObject, paramInt & 0xFFFFF) & 1 << (paramInt >>> 20)) != 0) {
      bool17 = true;
    }
    return bool17;
  }
  
  public final boolean r(T paramT, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (l1.l(paramT, a[(paramInt2 + 2)] & 0xFFFFF) == paramInt1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final <K, V> void t(Object paramObject1, int paramInt, Object paramObject2, n paramn, b1 paramb1)
  {
    long l1 = F(paramInt) & 0xFFFFF;
    Object localObject1 = l1.n(paramObject1, l1);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = q.d();
      l1.u(paramObject1, l1, localObject2);
    }
    else
    {
      localObject2 = localObject1;
      if (q.g(localObject1))
      {
        localObject2 = q.d();
        q.a(localObject2, localObject1);
        l1.u(paramObject1, l1, localObject2);
      }
    }
    paramb1.a(q.e(localObject2), q.c(paramObject2), paramn);
  }
  
  public final int x(int paramInt)
  {
    int i1 = c;
    int i2 = -1;
    int i3 = i2;
    if (paramInt >= i1)
    {
      i3 = i2;
      if (paramInt <= d)
      {
        int i4 = 0;
        i1 = a.length / 3 - 1;
        for (;;)
        {
          i3 = i2;
          if (i4 > i1) {
            break;
          }
          int i5 = i1 + i4 >>> 1;
          i3 = i5 * 3;
          int i6 = a[i3];
          if (paramInt == i6) {
            break;
          }
          if (paramInt < i6) {
            i1 = i5 - 1;
          } else {
            i4 = i5 + 1;
          }
        }
      }
    }
    return i3;
  }
  
  public final <E> void y(Object paramObject, long paramLong, b1 paramb1, c1<E> paramc1, n paramn)
  {
    paramb1.g(n.c(paramObject, paramLong), paramc1, paramn);
  }
  
  public final <E> void z(Object paramObject, int paramInt, b1 paramb1, c1<E> paramc1, n paramn)
  {
    long l1 = paramInt & 0xFFFFF;
    paramb1.i(n.c(paramObject, l1), paramc1, paramn);
  }
}

/* Location:
 * Qualified Name:     s0.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.datastore.preferences.protobuf;

import android.support.v4.media.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

public final class S
  implements e0
{
  public static final int[] r = new int[0];
  public static final Unsafe s = p0.B();
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
  public final l0 o;
  public final p p;
  public final J q;
  
  public S(int[] paramArrayOfInt1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, O paramO, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfInt2, int paramInt3, int paramInt4, U paramU, E paramE, l0 paraml0, p paramp, J paramJ)
  {
    a = paramArrayOfInt1;
    b = paramArrayOfObject;
    c = paramInt1;
    d = paramInt2;
    g = (paramO instanceof w);
    h = paramBoolean1;
    if ((paramp != null) && (paramp.e(paramO))) {
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
    o = paraml0;
    p = paramp;
    e = paramO;
    q = paramJ;
  }
  
  public static boolean E(int paramInt)
  {
    boolean bool;
    if ((paramInt & 0x10000000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static List F(Object paramObject, long paramLong)
  {
    return (List)p0.A(paramObject, paramLong);
  }
  
  public static long G(Object paramObject, long paramLong)
  {
    return p0.y(paramObject, paramLong);
  }
  
  public static S M(Class paramClass, M paramM, U paramU, E paramE, l0 paraml0, p paramp, J paramJ)
  {
    if ((paramM instanceof c0)) {
      return O((c0)paramM, paramU, paramE, paraml0, paramp, paramJ);
    }
    a.a(paramM);
    return N(null, paramU, paramE, paraml0, paramp, paramJ);
  }
  
  public static S N(i0 parami0, U paramU, E paramE, l0 paraml0, p paramp, J paramJ)
  {
    throw null;
  }
  
  public static S O(c0 paramc0, U paramU, E paramE, l0 paraml0, p paramp, J paramJ)
  {
    Object localObject1 = paramc0.b();
    Object localObject2 = Z.p;
    int i1 = 0;
    boolean bool;
    if (localObject1 == localObject2) {
      bool = true;
    } else {
      bool = false;
    }
    String str = paramc0.e();
    int i2 = str.length();
    int i3 = str.charAt(0);
    if (i3 >= 55296)
    {
      i3 &= 0x1FFF;
      i4 = 1;
      i5 = 13;
      for (;;)
      {
        i6 = i4 + 1;
        i4 = str.charAt(i4);
        if (i4 < 55296) {
          break;
        }
        i3 |= (i4 & 0x1FFF) << i5;
        i5 += 13;
        i4 = i6;
      }
      i3 |= i4 << i5;
      i5 = i6;
    }
    else
    {
      i5 = 1;
    }
    int i6 = i5 + 1;
    int i4 = str.charAt(i5);
    int i7 = i6;
    int i5 = i4;
    int i8;
    if (i4 >= 55296)
    {
      i4 &= 0x1FFF;
      i5 = 13;
      for (i8 = i6;; i8 = i6)
      {
        i6 = i8 + 1;
        i8 = str.charAt(i8);
        if (i8 < 55296) {
          break;
        }
        i4 |= (i8 & 0x1FFF) << i5;
        i5 += 13;
      }
      i5 = i4 | i8 << i5;
      i7 = i6;
    }
    int i10;
    int i11;
    if (i5 == 0)
    {
      localObject1 = r;
      i4 = 0;
      i9 = i4;
      i6 = i9;
      i10 = i6;
      i5 = i10;
      i11 = i5;
      i8 = i1;
      i12 = i6;
    }
    else
    {
      i5 = i7 + 1;
      i8 = str.charAt(i7);
      i6 = i8;
      i4 = i5;
      if (i8 >= 55296)
      {
        i6 = i8 & 0x1FFF;
        i4 = 13;
        i8 = i5;
        i5 = i6;
        for (;;)
        {
          i6 = i8 + 1;
          i8 = str.charAt(i8);
          if (i8 < 55296) {
            break;
          }
          i5 |= (i8 & 0x1FFF) << i4;
          i4 += 13;
          i8 = i6;
        }
        i5 |= i8 << i4;
        i4 = i6;
        i6 = i5;
      }
      i5 = i4 + 1;
      i4 = str.charAt(i4);
      i1 = i4;
      i8 = i5;
      if (i4 >= 55296)
      {
        i8 = i4 & 0x1FFF;
        i4 = 13;
        for (i7 = i5;; i7 = i5)
        {
          i5 = i7 + 1;
          i7 = str.charAt(i7);
          if (i7 < 55296) {
            break;
          }
          i8 |= (i7 & 0x1FFF) << i4;
          i4 += 13;
        }
        i1 = i8 | i7 << i4;
        i8 = i5;
      }
      i4 = i8 + 1;
      i8 = str.charAt(i8);
      i5 = i8;
      i7 = i4;
      if (i8 >= 55296)
      {
        i8 &= 0x1FFF;
        i5 = 13;
        for (i7 = i4;; i7 = i4)
        {
          i4 = i7 + 1;
          i7 = str.charAt(i7);
          if (i7 < 55296) {
            break;
          }
          i8 |= (i7 & 0x1FFF) << i5;
          i5 += 13;
        }
        i5 = i8 | i7 << i5;
        i7 = i4;
      }
      i8 = i7 + 1;
      i7 = str.charAt(i7);
      i4 = i7;
      i10 = i8;
      if (i7 >= 55296)
      {
        i4 = i7 & 0x1FFF;
        i7 = 13;
        i10 = i8;
        i8 = i4;
        for (;;)
        {
          i4 = i10 + 1;
          i10 = str.charAt(i10);
          if (i10 < 55296) {
            break;
          }
          i8 |= (i10 & 0x1FFF) << i7;
          i7 += 13;
          i10 = i4;
        }
        i8 |= i10 << i7;
        i10 = i4;
        i4 = i8;
      }
      i7 = i10 + 1;
      i9 = str.charAt(i10);
      i8 = i9;
      i10 = i7;
      if (i9 >= 55296)
      {
        i8 = i9 & 0x1FFF;
        i10 = 13;
        i9 = i7;
        i7 = i8;
        for (;;)
        {
          i8 = i9 + 1;
          i9 = str.charAt(i9);
          if (i9 < 55296) {
            break;
          }
          i7 |= (i9 & 0x1FFF) << i10;
          i10 += 13;
          i9 = i8;
        }
        i7 |= i9 << i10;
        i10 = i8;
        i8 = i7;
      }
      i9 = i10 + 1;
      i10 = str.charAt(i10);
      i7 = i10;
      i11 = i9;
      if (i10 >= 55296)
      {
        i7 = i10 & 0x1FFF;
        i10 = 13;
        i11 = i9;
        i9 = i7;
        for (;;)
        {
          i7 = i11 + 1;
          i11 = str.charAt(i11);
          if (i11 < 55296) {
            break;
          }
          i9 |= (i11 & 0x1FFF) << i10;
          i10 += 13;
          i11 = i7;
        }
        i10 = i9 | i11 << i10;
        i11 = i7;
        i7 = i10;
      }
      i10 = i11 + 1;
      i12 = str.charAt(i11);
      i11 = i12;
      i9 = i10;
      if (i12 >= 55296)
      {
        i11 = i12 & 0x1FFF;
        i9 = 13;
        for (i12 = i10;; i12 = i10)
        {
          i10 = i12 + 1;
          i12 = str.charAt(i12);
          if (i12 < 55296) {
            break;
          }
          i11 |= (i12 & 0x1FFF) << i9;
          i9 += 13;
        }
        i11 |= i12 << i9;
        i9 = i10;
      }
      i12 = i9 + 1;
      i13 = str.charAt(i9);
      i10 = i13;
      i9 = i12;
      if (i13 >= 55296)
      {
        i9 = i13 & 0x1FFF;
        i13 = i12;
        i10 = 13;
        i12 = i9;
        for (;;)
        {
          i9 = i13 + 1;
          i13 = str.charAt(i13);
          if (i13 < 55296) {
            break;
          }
          i12 |= (i13 & 0x1FFF) << i10;
          i10 += 13;
          i13 = i9;
        }
        i10 = i12 | i13 << i10;
      }
      localObject1 = new int[i10 + i7 + i11];
      i12 = i6 * 2 + i1;
      i11 = i6;
      i1 = i9;
      i6 = i5;
      i5 = i10;
      i10 = i12;
      i12 = i8;
      i9 = i4;
      i4 = i7;
      i7 = i1;
      i8 = i6;
    }
    Unsafe localUnsafe = s;
    Object[] arrayOfObject1 = paramc0.d();
    Class localClass = paramc0.c().getClass();
    localObject2 = new int[i12 * 3];
    Object[] arrayOfObject2 = new Object[i12 * 2];
    int i14 = i5 + i4;
    i6 = i5;
    i4 = i14;
    int i13 = 0;
    i1 = 0;
    int i12 = i9;
    int i9 = i13;
    int i15 = i3;
    i13 = i8;
    for (;;)
    {
      int i16 = i1;
      if (i7 >= i2) {
        break;
      }
      i8 = i7 + 1;
      int i17 = str.charAt(i7);
      if (i17 >= 55296)
      {
        i1 = i17 & 0x1FFF;
        i3 = 13;
        for (;;)
        {
          i7 = i8 + 1;
          i17 = str.charAt(i8);
          i8 = i5;
          if (i17 < 55296) {
            break;
          }
          i1 |= (i17 & 0x1FFF) << i3;
          i3 += 13;
          i5 = i8;
          i8 = i7;
        }
        i17 = i1 | i17 << i3;
        i5 = i7;
      }
      else
      {
        i3 = i5;
        i5 = i8;
        i8 = i3;
      }
      i1 = i5 + 1;
      int i18 = str.charAt(i5);
      if (i18 >= 55296)
      {
        i7 = i18 & 0x1FFF;
        i3 = 13;
        for (;;)
        {
          i5 = i1 + 1;
          i1 = str.charAt(i1);
          if (i1 < 55296) {
            break;
          }
          i7 |= (i1 & 0x1FFF) << i3;
          i3 += 13;
          i1 = i5;
        }
        i18 = i7 | i1 << i3;
        i1 = i5;
      }
      int i19 = i18 & 0xFF;
      i7 = i9;
      if ((i18 & 0x400) != 0)
      {
        localObject1[i9] = i16;
        i7 = i9 + 1;
      }
      Object localObject3;
      if (i19 >= 51)
      {
        i3 = i1 + 1;
        i1 = str.charAt(i1);
        i5 = i3;
        i9 = i1;
        if (i1 >= 55296)
        {
          i1 &= 0x1FFF;
          i9 = 13;
          for (;;)
          {
            i5 = i3 + 1;
            i3 = str.charAt(i3);
            if (i3 < 55296) {
              break;
            }
            i1 |= (i3 & 0x1FFF) << i9;
            i9 += 13;
            i3 = i5;
          }
          i9 = i1 | i3 << i9;
        }
        i1 = i19 - 51;
        if ((i1 != 9) && (i1 != 17))
        {
          i3 = i10;
          if (i1 == 12)
          {
            i3 = i10;
            if ((i15 & 0x1) == 1)
            {
              i1 = i16 / 3;
              i3 = i10 + 1;
              arrayOfObject2[(i1 * 2 + 1)] = arrayOfObject1[i10];
            }
          }
        }
        else
        {
          for (;;)
          {
            break;
            i1 = i16 / 3;
            i3 = i10 + 1;
            arrayOfObject2[(i1 * 2 + 1)] = arrayOfObject1[i10];
          }
        }
        i10 = i9 * 2;
        localObject3 = arrayOfObject1[i10];
        if ((localObject3 instanceof Field)) {
          localObject3 = (Field)localObject3;
        }
        for (;;)
        {
          break;
          localObject3 = c0(localClass, (String)localObject3);
          arrayOfObject1[i10] = localObject3;
        }
        i1 = (int)localUnsafe.objectFieldOffset((Field)localObject3);
        i10++;
        localObject3 = arrayOfObject1[i10];
        if ((localObject3 instanceof Field)) {
          localObject3 = (Field)localObject3;
        }
        for (;;)
        {
          break;
          localObject3 = c0(localClass, (String)localObject3);
          arrayOfObject1[i10] = localObject3;
        }
        i10 = (int)localUnsafe.objectFieldOffset((Field)localObject3);
        i9 = 0;
      }
      else
      {
        i9 = i10 + 1;
        localObject3 = c0(localClass, (String)arrayOfObject1[i10]);
        if ((i19 == 9) || (i19 != 17)) {
          if ((i19 == 27) || (i19 != 49)) {
            if ((i19 != 12) && (i19 != 30) && (i19 != 44)) {
              if (i19 == 50)
              {
                i5 = i6 + 1;
                localObject1[i6] = i16;
                i20 = i16 / 3 * 2;
                i3 = i10 + 2;
                arrayOfObject2[i20] = arrayOfObject1[i9];
                if ((i18 & 0x800) != 0)
                {
                  i6 = i10 + 3;
                  arrayOfObject2[(i20 + 1)] = arrayOfObject1[i3];
                  i3 = i6;
                }
              }
            }
          }
        }
        for (;;)
        {
          i6 = i5;
          break;
          continue;
          i3 = i9;
          i5 = i6;
          continue;
          i3 = i9;
          i5 = i6;
          if ((i15 & 0x1) == 1)
          {
            i3 = i16 / 3;
            i5 = i10 + 2;
            arrayOfObject2[(i3 * 2 + 1)] = arrayOfObject1[i9];
            for (;;)
            {
              i3 = i5;
              break;
              i3 = i16 / 3;
              i5 = i10 + 2;
              arrayOfObject2[(i3 * 2 + 1)] = arrayOfObject1[i9];
            }
            arrayOfObject2[(i16 / 3 * 2 + 1)] = ((Field)localObject3).getType();
            i3 = i9;
            i5 = i6;
          }
        }
        int i20 = (int)localUnsafe.objectFieldOffset((Field)localObject3);
        if (((i15 & 0x1) == 1) && (i19 <= 17))
        {
          i10 = i1 + 1;
          i1 = str.charAt(i1);
          i5 = i10;
          i9 = i1;
          if (i1 >= 55296)
          {
            i9 = i1 & 0x1FFF;
            i5 = 13;
            for (i1 = i10;; i1 = i10)
            {
              i10 = i1 + 1;
              i1 = str.charAt(i1);
              if (i1 < 55296) {
                break;
              }
              i9 |= (i1 & 0x1FFF) << i5;
              i5 += 13;
            }
            i9 |= i1 << i5;
            i5 = i10;
          }
          i10 = i11 * 2 + i9 / 32;
          localObject3 = arrayOfObject1[i10];
          if ((localObject3 instanceof Field)) {
            localObject3 = (Field)localObject3;
          }
          for (;;)
          {
            i1 = i5;
            break;
            localObject3 = c0(localClass, (String)localObject3);
            arrayOfObject1[i10] = localObject3;
          }
          i10 = (int)localUnsafe.objectFieldOffset((Field)localObject3);
          i5 = i9 % 32;
        }
        else
        {
          i10 = 0;
          i5 = 0;
        }
        i9 = i4;
        if (i19 >= 18)
        {
          i9 = i4;
          if (i19 <= 49)
          {
            localObject1[i4] = i20;
            i9 = i4 + 1;
          }
        }
        i4 = i9;
        i9 = i5;
        i5 = i1;
        i1 = i20;
      }
      localObject2[i16] = i17;
      if ((i18 & 0x200) != 0) {
        i17 = 536870912;
      } else {
        i17 = 0;
      }
      if ((i18 & 0x100) != 0) {
        i18 = 268435456;
      } else {
        i18 = 0;
      }
      localObject2[(i16 + 1)] = (i18 | i17 | i19 << 20 | i1);
      i1 = i16 + 3;
      localObject2[(i16 + 2)] = (i9 << 20 | i10);
      i9 = i7;
      i7 = i5;
      i10 = i3;
      i5 = i8;
    }
    return new S((int[])localObject2, arrayOfObject2, i13, i12, paramc0.c(), bool, false, (int[])localObject1, i5, i14, paramU, paramE, paraml0, paramp, paramJ);
  }
  
  public static long Q(int paramInt)
  {
    return paramInt & 0xFFFFF;
  }
  
  public static boolean R(Object paramObject, long paramLong)
  {
    return ((Boolean)p0.A(paramObject, paramLong)).booleanValue();
  }
  
  public static double S(Object paramObject, long paramLong)
  {
    return ((Double)p0.A(paramObject, paramLong)).doubleValue();
  }
  
  public static float T(Object paramObject, long paramLong)
  {
    return ((Float)p0.A(paramObject, paramLong)).floatValue();
  }
  
  public static int U(Object paramObject, long paramLong)
  {
    return ((Integer)p0.A(paramObject, paramLong)).intValue();
  }
  
  public static long V(Object paramObject, long paramLong)
  {
    return ((Long)p0.A(paramObject, paramLong)).longValue();
  }
  
  public static Field c0(Class paramClass, String paramString)
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
  
  public static int g0(int paramInt)
  {
    return (paramInt & 0xFF00000) >>> 20;
  }
  
  public static boolean k(Object paramObject, long paramLong)
  {
    return p0.p(paramObject, paramLong);
  }
  
  public static double l(Object paramObject, long paramLong)
  {
    return p0.v(paramObject, paramLong);
  }
  
  public static float o(Object paramObject, long paramLong)
  {
    return p0.w(paramObject, paramLong);
  }
  
  public static int v(Object paramObject, long paramLong)
  {
    return p0.x(paramObject, paramLong);
  }
  
  public static boolean w(int paramInt)
  {
    boolean bool;
    if ((paramInt & 0x20000000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean z(Object paramObject, int paramInt, e0 parame0)
  {
    return parame0.c(p0.A(paramObject, Q(paramInt)));
  }
  
  public final boolean A(Object paramObject, int paramInt1, int paramInt2)
  {
    List localList = (List)p0.A(paramObject, Q(paramInt1));
    if (localList.isEmpty()) {
      return true;
    }
    paramObject = r(paramInt2);
    for (paramInt1 = 0; paramInt1 < localList.size(); paramInt1++) {
      if (!((e0)paramObject).c(localList.get(paramInt1))) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean B(Object paramObject, int paramInt1, int paramInt2)
  {
    paramObject = q.e(p0.A(paramObject, Q(paramInt1)));
    if (((Map)paramObject).isEmpty()) {
      return true;
    }
    Object localObject1 = q(paramInt2);
    if (q.d(localObject1).c.c() != r0.c.x) {
      return true;
    }
    Iterator localIterator = ((Map)paramObject).values().iterator();
    paramObject = null;
    while (localIterator.hasNext())
    {
      Object localObject2 = localIterator.next();
      localObject1 = paramObject;
      if (paramObject == null) {
        localObject1 = a0.a().c(localObject2.getClass());
      }
      paramObject = localObject1;
      if (!((e0)localObject1).c(localObject2)) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean C(Object paramObject1, Object paramObject2, int paramInt)
  {
    long l1 = X(paramInt) & 0xFFFFF;
    boolean bool;
    if (p0.x(paramObject1, l1) == p0.x(paramObject2, l1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean D(Object paramObject, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (p0.x(paramObject, X(paramInt2) & 0xFFFFF) == paramInt1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void H(l0 paraml0, p paramp, Object paramObject, d0 paramd0, o paramo)
  {
    Object localObject1 = null;
    Object localObject3 = localObject1;
    Object localObject4;
    Object localObject6;
    label191:
    boolean bool;
    label326:
    label1498:
    label1541:
    label1584:
    label1627:
    label1702:
    label1749:
    label1792:
    label1835:
    label1878:
    label1921:
    label1964:
    label2007:
    label2050:
    label2658:
    do
    {
      for (;;)
      {
        localObject4 = localObject1;
        int i1;
        try
        {
          i1 = paramd0.p();
          localObject4 = localObject1;
          i2 = W(i1);
          if (i2 >= 0) {
            break label326;
          }
          if (i1 == Integer.MAX_VALUE)
          {
            for (i2 = k; i2 < l; i2++) {
              localObject1 = n(paramObject, j[i2], localObject1, paraml0);
            }
            if (localObject1 != null) {
              paraml0.o(paramObject, localObject1);
            }
            return;
          }
          localObject4 = localObject1;
          if (!f)
          {
            localObject5 = null;
          }
          else
          {
            localObject4 = localObject1;
            localObject5 = paramp.b(paramo, e, i1);
          }
          if (localObject5 == null) {
            break label191;
          }
          localObject6 = localObject3;
          if (localObject3 == null)
          {
            localObject4 = localObject1;
            localObject6 = paramp.d(paramObject);
          }
        }
        finally
        {
          break label3469;
        }
        localObject4 = localObject1;
        localObject1 = paramp.g(paramd0, localObject5, paramo, (s)localObject6, localObject1, paraml0);
        localObject3 = localObject6;
        continue;
        localObject4 = localObject1;
        if (paraml0.q(paramd0))
        {
          localObject4 = localObject1;
          localObject6 = localObject1;
          if (!paramd0.y()) {}
        }
        else
        {
          localObject5 = localObject1;
          if (localObject1 == null)
          {
            localObject4 = localObject1;
            localObject5 = paraml0.f(paramObject);
          }
          localObject4 = localObject5;
          bool = paraml0.m(localObject5, paramd0);
          localObject6 = localObject5;
          if (bool)
          {
            localObject1 = localObject5;
            continue;
          }
        }
        for (i2 = k; i2 < l; i2++) {
          localObject6 = n(paramObject, j[i2], localObject6, paraml0);
        }
        if (localObject6 != null) {
          paraml0.o(paramObject, localObject6);
        }
        return;
        localObject4 = localObject1;
        int i3 = h0(i2);
        localObject4 = localObject1;
        Object localObject5 = localObject1;
        try
        {
          int i4;
          long l1;
          switch (g0(i3))
          {
          default: 
            localObject6 = localObject1;
            if (localObject1 == null)
            {
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = paraml0.n();
            }
            localObject4 = localObject6;
            localObject5 = localObject6;
            bool = paraml0.m(localObject6, paramd0);
            localObject1 = localObject6;
            if (!bool)
            {
              for (i2 = k; i2 < l; i2++) {
                localObject6 = n(paramObject, j[i2], localObject6, paraml0);
              }
              if (localObject6 != null) {
                paraml0.o(paramObject, localObject6);
              }
              return;
            }
            break;
          case 68: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            p0.O(paramObject, Q(i3), paramd0.N(r(i2), paramo));
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
            for (;;)
            {
              localObject4 = localObject1;
              localObject5 = localObject1;
              e0(paramObject, i1, i2);
              break;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), Long.valueOf(paramd0.j()));
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), Integer.valueOf(paramd0.h()));
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), Long.valueOf(paramd0.r()));
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), Integer.valueOf(paramd0.z()));
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              i4 = paramd0.b();
              localObject4 = localObject1;
              localObject5 = localObject1;
              p(i2);
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), Integer.valueOf(i4));
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), Integer.valueOf(paramd0.w()));
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), paramd0.u());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              if (D(paramObject, i1, i2))
              {
                localObject4 = localObject1;
                localObject5 = localObject1;
                localObject6 = y.h(p0.A(paramObject, Q(i3)), paramd0.J(r(i2), paramo));
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), localObject6);
              }
              else
              {
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), paramd0.J(r(i2), paramo));
                localObject4 = localObject1;
                localObject5 = localObject1;
                d0(paramObject, i2);
                continue;
                localObject4 = localObject1;
                localObject5 = localObject1;
                a0(paramObject, i3, paramd0);
                continue;
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), Boolean.valueOf(paramd0.o()));
                continue;
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), Integer.valueOf(paramd0.n()));
                continue;
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), Long.valueOf(paramd0.f()));
                continue;
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), Integer.valueOf(paramd0.x()));
                continue;
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), Long.valueOf(paramd0.c()));
                continue;
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), Long.valueOf(paramd0.E()));
                continue;
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), Float.valueOf(paramd0.readFloat()));
                continue;
                localObject4 = localObject1;
                localObject5 = localObject1;
                p0.O(paramObject, Q(i3), Double.valueOf(paramd0.readDouble()));
              }
            }
          case 50: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            I(paramObject, i2, q(i2), paramo, paramd0);
            break;
          case 49: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            Y(paramObject, Q(i3), paramd0, r(i2), paramo);
            break;
          case 48: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.i((List)localObject6);
            break;
          case 47: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.a((List)localObject6);
            break;
          case 46: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.D((List)localObject6);
            break;
          case 45: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.g((List)localObject6);
            break;
          case 44: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.I((List)localObject6);
            localObject4 = localObject1;
            localObject5 = localObject1;
            p(i2);
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject1 = g0.z(i1, (List)localObject6, null, localObject1, paraml0);
            break;
          case 43: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.k((List)localObject6);
            break;
          case 42: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.l((List)localObject6);
            break;
          case 41: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.d((List)localObject6);
            break;
          case 40: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.G((List)localObject6);
            break;
          case 39: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.H((List)localObject6);
            break;
          case 38: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.s((List)localObject6);
            break;
          case 37: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.C((List)localObject6);
            break;
          case 36: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = n.e(paramObject, Q(i3));
            localObject4 = localObject1;
            localObject5 = localObject1;
            paramd0.v((List)localObject6);
            break;
          case 35: 
            localObject4 = localObject1;
            localObject5 = localObject1;
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
            for (localObject6 = n.e(paramObject, Q(i3));; localObject6 = n.e(paramObject, Q(i3)))
            {
              localObject4 = localObject1;
              localObject5 = localObject1;
              paramd0.B((List)localObject6);
              break;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1498;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1541;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1584;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1627;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              localObject4 = localObject1;
              localObject5 = localObject1;
              paramd0.I((List)localObject6);
              localObject4 = localObject1;
              localObject5 = localObject1;
              p(i2);
              break label1702;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1749;
              localObject4 = localObject1;
              localObject5 = localObject1;
              paramd0.A(n.e(paramObject, Q(i3)));
              break;
              localObject4 = localObject1;
              localObject5 = localObject1;
              Z(paramObject, i3, paramd0, r(i2), paramo);
              break;
              localObject4 = localObject1;
              localObject5 = localObject1;
              b0(paramObject, i3, paramd0);
              break;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1792;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1835;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1878;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1921;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label1964;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label2007;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = n.e(paramObject, Q(i3));
              break label2050;
              localObject4 = localObject1;
              localObject5 = localObject1;
            }
          case 17: 
            localObject4 = localObject1;
            localObject5 = localObject1;
            if (x(paramObject, i2))
            {
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = y.h(p0.A(paramObject, Q(i3)), paramd0.N(r(i2), paramo));
              localObject4 = localObject1;
              localObject5 = localObject1;
              l1 = Q(i3);
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, l1, localObject6);
            }
            else
            {
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), paramd0.N(r(i2), paramo));
            }
            break;
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
            for (;;)
            {
              localObject4 = localObject1;
              localObject5 = localObject1;
              d0(paramObject, i2);
              break;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.N(paramObject, Q(i3), paramd0.j());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.M(paramObject, Q(i3), paramd0.h());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.N(paramObject, Q(i3), paramd0.r());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.M(paramObject, Q(i3), paramd0.z());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              i4 = paramd0.b();
              localObject4 = localObject1;
              localObject5 = localObject1;
              p(i2);
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.M(paramObject, Q(i3), i4);
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.M(paramObject, Q(i3), paramd0.w());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), paramd0.u());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              if (x(paramObject, i2))
              {
                localObject4 = localObject1;
                localObject5 = localObject1;
                localObject6 = y.h(p0.A(paramObject, Q(i3)), paramd0.J(r(i2), paramo));
                localObject4 = localObject1;
                localObject5 = localObject1;
                l1 = Q(i3);
                break label2658;
              }
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.O(paramObject, Q(i3), paramd0.J(r(i2), paramo));
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              a0(paramObject, i3, paramd0);
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.E(paramObject, Q(i3), paramd0.o());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.M(paramObject, Q(i3), paramd0.n());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.N(paramObject, Q(i3), paramd0.f());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.M(paramObject, Q(i3), paramd0.x());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.N(paramObject, Q(i3), paramd0.c());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.N(paramObject, Q(i3), paramd0.E());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.L(paramObject, Q(i3), paramd0.readFloat());
              continue;
              localObject4 = localObject1;
              localObject5 = localObject1;
              p0.K(paramObject, Q(i3), paramd0.readDouble());
            }
          }
        }
        catch (z.a locala)
        {
          localObject4 = localObject5;
          Object localObject2;
          if (paraml0.q(paramd0))
          {
            localObject4 = localObject5;
            bool = paramd0.y();
            localObject2 = localObject5;
            if (!bool)
            {
              for (i2 = k; i2 < l; i2++) {
                localObject5 = n(paramObject, j[i2], localObject5, paraml0);
              }
              if (localObject5 != null) {
                paraml0.o(paramObject, localObject5);
              }
            }
          }
          else
          {
            localObject6 = localObject5;
            if (localObject5 == null)
            {
              localObject4 = localObject5;
              localObject6 = paraml0.f(paramObject);
            }
            localObject4 = localObject6;
            bool = paraml0.m(localObject6, paramd0);
            localObject2 = localObject6;
          }
        }
      }
    } while (bool);
    for (int i2 = k; i2 < l; i2++) {
      localObject6 = n(paramObject, j[i2], localObject6, paraml0);
    }
    if (localObject6 != null) {
      paraml0.o(paramObject, localObject6);
    }
    return;
    label3469:
    for (i2 = k; i2 < l; i2++) {
      localObject4 = n(paramObject, j[i2], localObject4, paraml0);
    }
    if (localObject4 != null) {
      paraml0.o(paramObject, localObject4);
    }
    throw paramp;
  }
  
  public final void I(Object paramObject1, int paramInt, Object paramObject2, o paramo, d0 paramd0)
  {
    long l1 = Q(h0(paramInt));
    Object localObject1 = p0.A(paramObject1, l1);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = q.f(paramObject2);
      p0.O(paramObject1, l1, localObject2);
    }
    else
    {
      localObject2 = localObject1;
      if (q.g(localObject1))
      {
        localObject2 = q.f(paramObject2);
        q.a(localObject2, localObject1);
        p0.O(paramObject1, l1, localObject2);
      }
    }
    paramd0.K(q.h(localObject2), q.d(paramObject2), paramo);
  }
  
  public final void J(Object paramObject1, Object paramObject2, int paramInt)
  {
    long l1 = Q(h0(paramInt));
    if (!x(paramObject2, paramInt)) {
      return;
    }
    Object localObject = p0.A(paramObject1, l1);
    paramObject2 = p0.A(paramObject2, l1);
    if ((localObject != null) && (paramObject2 != null)) {
      paramObject2 = y.h(localObject, paramObject2);
    }
    while (paramObject2 != null)
    {
      p0.O(paramObject1, l1, paramObject2);
      d0(paramObject1, paramInt);
      break;
    }
  }
  
  public final void K(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = h0(paramInt);
    int i2 = P(paramInt);
    long l1 = Q(i1);
    if (!D(paramObject2, i2, paramInt)) {
      return;
    }
    Object localObject = p0.A(paramObject1, l1);
    paramObject2 = p0.A(paramObject2, l1);
    if ((localObject != null) && (paramObject2 != null)) {
      paramObject2 = y.h(localObject, paramObject2);
    }
    while (paramObject2 != null)
    {
      p0.O(paramObject1, l1, paramObject2);
      e0(paramObject1, i2, paramInt);
      break;
    }
  }
  
  public final void L(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = h0(paramInt);
    long l1 = Q(i1);
    int i2 = P(paramInt);
    switch (g0(i1))
    {
    default: 
      break;
    case 60: 
    case 68: 
      K(paramObject1, paramObject2, paramInt);
      break;
    case 61: 
    case 62: 
    case 63: 
    case 64: 
    case 65: 
    case 66: 
    case 67: 
      if (!D(paramObject2, i2, paramInt)) {
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
        p0.O(paramObject1, l1, p0.A(paramObject2, l1));
        e0(paramObject1, i2, paramInt);
        break;
        if (!D(paramObject2, i2, paramInt)) {
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
      J(paramObject1, paramObject2, paramInt);
      break;
    case 16: 
      if (x(paramObject2, paramInt)) {
        p0.N(paramObject1, l1, p0.y(paramObject2, l1));
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
        d0(paramObject1, paramInt);
        return;
        if (!x(paramObject2, paramInt)) {
          return;
        }
        for (;;)
        {
          p0.M(paramObject1, l1, p0.x(paramObject2, l1));
          break label436;
          if (!x(paramObject2, paramInt)) {
            return;
          }
          break;
          if (!x(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!x(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!x(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!x(paramObject2, paramInt)) {
            return;
          }
          for (;;)
          {
            p0.O(paramObject1, l1, p0.A(paramObject2, l1));
            break;
            if (!x(paramObject2, paramInt)) {
              return;
            }
          }
          if (!x(paramObject2, paramInt)) {
            return;
          }
          p0.E(paramObject1, l1, p0.p(paramObject2, l1));
          break label436;
          if (!x(paramObject2, paramInt)) {
            return;
          }
          continue;
          if (!x(paramObject2, paramInt)) {
            return;
          }
          break;
          if (!x(paramObject2, paramInt)) {
            return;
          }
        }
        if (!x(paramObject2, paramInt)) {
          return;
        }
        break;
        if (!x(paramObject2, paramInt)) {
          return;
        }
        break;
        if (!x(paramObject2, paramInt)) {
          return;
        }
        p0.L(paramObject1, l1, p0.w(paramObject2, l1));
        continue;
        if (!x(paramObject2, paramInt)) {
          return;
        }
        p0.K(paramObject1, l1, p0.v(paramObject2, l1));
      }
    }
  }
  
  public final int P(int paramInt)
  {
    return a[paramInt];
  }
  
  public final int W(int paramInt)
  {
    if ((paramInt >= c) && (paramInt <= d)) {
      return f0(paramInt, 0);
    }
    return -1;
  }
  
  public final int X(int paramInt)
  {
    return a[(paramInt + 2)];
  }
  
  public final void Y(Object paramObject, long paramLong, d0 paramd0, e0 parame0, o paramo)
  {
    paramd0.L(n.e(paramObject, paramLong), parame0, paramo);
  }
  
  public final void Z(Object paramObject, int paramInt, d0 paramd0, e0 parame0, o paramo)
  {
    long l1 = Q(paramInt);
    paramd0.M(n.e(paramObject, l1), parame0, paramo);
  }
  
  public void a(Object paramObject1, Object paramObject2)
  {
    paramObject2.getClass();
    for (int i1 = 0; i1 < a.length; i1 += 3) {
      L(paramObject1, paramObject2, i1);
    }
    if (!h)
    {
      g0.F(o, paramObject1, paramObject2);
      if (f) {
        g0.D(p, paramObject1, paramObject2);
      }
    }
  }
  
  public final void a0(Object paramObject, int paramInt, d0 paramd0)
  {
    long l1;
    if (w(paramInt))
    {
      l1 = Q(paramInt);
      paramd0 = paramd0.F();
    }
    for (;;)
    {
      p0.O(paramObject, l1, paramd0);
      break;
      if (g)
      {
        l1 = Q(paramInt);
        paramd0 = paramd0.m();
      }
      else
      {
        l1 = Q(paramInt);
        paramd0 = paramd0.u();
      }
    }
  }
  
  public void b(Object paramObject)
  {
    int i2;
    for (int i1 = k;; i1++)
    {
      i2 = l;
      if (i1 >= i2) {
        break;
      }
      long l1 = Q(h0(j[i1]));
      Object localObject = p0.A(paramObject, l1);
      if (localObject != null) {
        p0.O(paramObject, l1, q.c(localObject));
      }
    }
    int i3 = j.length;
    for (i1 = i2; i1 < i3; i1++) {
      n.c(paramObject, j[i1]);
    }
    o.j(paramObject);
    if (f) {
      p.f(paramObject);
    }
  }
  
  public final void b0(Object paramObject, int paramInt, d0 paramd0)
  {
    if (w(paramInt)) {
      paramd0.t(n.e(paramObject, Q(paramInt)));
    } else {
      paramd0.q(n.e(paramObject, Q(paramInt)));
    }
  }
  
  public final boolean c(Object paramObject)
  {
    int i1 = -1;
    int i2 = 0;
    int i3 = i2;
    while (i2 < k)
    {
      int i4 = j[i2];
      int i5 = P(i4);
      int i6 = h0(i4);
      int i7;
      int i10;
      if (!h)
      {
        i7 = a[(i4 + 2)];
        int i8 = 0xFFFFF & i7;
        int i9 = 1 << (i7 >>> 20);
        i7 = i1;
        i10 = i9;
        if (i8 != i1)
        {
          i3 = s.getInt(paramObject, i8);
          i7 = i8;
          i10 = i9;
        }
      }
      else
      {
        i10 = 0;
        i7 = i1;
      }
      if ((E(i6)) && (!y(paramObject, i4, i3, i10))) {
        return false;
      }
      i1 = g0(i6);
      if ((i1 != 9) && (i1 != 17))
      {
        if (i1 != 27) {
          if ((i1 != 60) && (i1 != 68))
          {
            if (i1 != 49)
            {
              if ((i1 != 50) || (B(paramObject, i6, i4))) {
                break label278;
              }
              return false;
            }
          }
          else
          {
            if ((!D(paramObject, i5, i4)) || (z(paramObject, i6, r(i4)))) {
              break label278;
            }
            return false;
          }
        }
        if (!A(paramObject, i6, i4)) {
          return false;
        }
      }
      else if ((y(paramObject, i4, i3, i10)) && (!z(paramObject, i6, r(i4))))
      {
        return false;
      }
      label278:
      i2++;
      i1 = i7;
    }
    return (!f) || (p.c(paramObject).k());
  }
  
  public boolean d(Object paramObject1, Object paramObject2)
  {
    int i1 = a.length;
    for (int i2 = 0; i2 < i1; i2 += 3) {
      if (!m(paramObject1, paramObject2, i2)) {
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
  
  public final void d0(Object paramObject, int paramInt)
  {
    if (h) {
      return;
    }
    paramInt = X(paramInt);
    long l1 = paramInt & 0xFFFFF;
    p0.M(paramObject, l1, p0.x(paramObject, l1) | 1 << (paramInt >>> 20));
  }
  
  public int e(Object paramObject)
  {
    int i1;
    if (h) {
      i1 = t(paramObject);
    } else {
      i1 = s(paramObject);
    }
    return i1;
  }
  
  public final void e0(Object paramObject, int paramInt1, int paramInt2)
  {
    p0.M(paramObject, X(paramInt2) & 0xFFFFF, paramInt1);
  }
  
  public Object f()
  {
    return m.a(e);
  }
  
  public final int f0(int paramInt1, int paramInt2)
  {
    int i1 = a.length / 3 - 1;
    while (paramInt2 <= i1)
    {
      int i2 = i1 + paramInt2 >>> 1;
      int i3 = i2 * 3;
      int i4 = P(i3);
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
  
  public int g(Object paramObject)
  {
    int i1 = a.length;
    int i2 = 0;
    for (int i3 = 0; i2 < i1; i3 = i4)
    {
      i4 = h0(i2);
      int i5 = P(i2);
      long l1 = Q(i4);
      int i6 = g0(i4);
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
        if (D(paramObject, i5, i2))
        {
          localObject = p0.A(paramObject, l1);
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
          if (!D(paramObject, i5, i2)) {
            break label978;
          }
          for (;;)
          {
            i4 = i3 * 53;
            l1 = V(paramObject, l1);
            i3 = y.f(l1);
            break label384;
            i4 = i3;
            if (!D(paramObject, i5, i2)) {
              break label978;
            }
            for (;;)
            {
              i4 = i3 * 53;
              i3 = U(paramObject, l1);
              break label384;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              break label409;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              i4 = i3 * 53;
              localObject = p0.A(paramObject, l1);
              break label377;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              break;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              i4 = i3 * 53;
              i3 = ((String)p0.A(paramObject, l1)).hashCode();
              break label384;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              i4 = i3 * 53;
              bool = R(paramObject, l1);
              i3 = y.c(bool);
              break label384;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              continue;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
              break label409;
              i4 = i3;
              if (!D(paramObject, i5, i2)) {
                break label978;
              }
            }
            i4 = i3;
            if (!D(paramObject, i5, i2)) {
              break label978;
            }
            continue;
            i4 = i3;
            if (!D(paramObject, i5, i2)) {
              break label978;
            }
          }
          i4 = i3;
          if (!D(paramObject, i5, i2)) {
            break label978;
          }
          i4 = i3 * 53;
          f1 = T(paramObject, l1);
          i3 = Float.floatToIntBits(f1);
        }
      case 51: 
        i4 = i3;
        if (D(paramObject, i5, i2)) {
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
        for (double d1 = S(paramObject, l1);; d1 = p0.v(paramObject, l1))
        {
          l1 = Double.doubleToLongBits(d1);
          break label424;
          localObject = p0.A(paramObject, l1);
          if (localObject != null) {}
          for (;;)
          {
            i4 = localObject.hashCode();
            do
            {
              i4 = i3 * 53 + i4;
              break label978;
              i4 = i3 * 53;
              l1 = p0.y(paramObject, l1);
              break label424;
              i4 = i3 * 53;
              i3 = p0.x(paramObject, l1);
              break;
              localObject = p0.A(paramObject, l1);
            } while (localObject == null);
          }
          i4 = i3 * 53;
          bool = p0.p(paramObject, l1);
          break label659;
          i4 = i3 * 53;
          f1 = p0.w(paramObject, l1);
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
  
  public void h(Object paramObject, d0 paramd0, o paramo)
  {
    paramo.getClass();
    H(o, p, paramObject, paramd0, paramo);
  }
  
  public final int h0(int paramInt)
  {
    return a[(paramInt + 1)];
  }
  
  public void i(Object paramObject, s0 params0)
  {
    if (params0.v() == s0.a.p) {
      k0(paramObject, params0);
    } else if (h) {
      j0(paramObject, params0);
    } else {
      i0(paramObject, params0);
    }
  }
  
  public final void i0(Object paramObject, s0 params0)
  {
    if (f)
    {
      localObject = p.c(paramObject);
      if (!((s)localObject).j())
      {
        localIterator = ((s)localObject).n();
        localObject = (Map.Entry)localIterator.next();
        break label48;
      }
    }
    Iterator localIterator = null;
    Object localObject = null;
    label48:
    int i1 = a.length;
    Unsafe localUnsafe = s;
    int i2 = -1;
    int i3 = 0;
    int i4 = 0;
    while (i3 < i1)
    {
      int i5 = h0(i3);
      int i6 = P(i3);
      int i7 = g0(i5);
      int i9;
      if ((!h) && (i7 <= 17))
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
      while ((localObject != null) && (p.a((Map.Entry)localObject) <= i6))
      {
        p.j(params0, (Map.Entry)localObject);
        if (localIterator.hasNext()) {
          localObject = (Map.Entry)localIterator.next();
        } else {
          localObject = null;
        }
      }
      long l1 = Q(i5);
      switch (i7)
      {
      }
      for (;;)
      {
        break;
        if (D(paramObject, i6, i3))
        {
          params0.O(i6, localUnsafe.getObject(paramObject, l1), r(i3));
          continue;
          if (D(paramObject, i6, i3))
          {
            params0.w(i6, V(paramObject, l1));
            continue;
            if (D(paramObject, i6, i3))
            {
              params0.H(i6, U(paramObject, l1));
              continue;
              if (D(paramObject, i6, i3))
              {
                params0.n(i6, V(paramObject, l1));
                continue;
                if (D(paramObject, i6, i3))
                {
                  params0.g(i6, U(paramObject, l1));
                  continue;
                  if (D(paramObject, i6, i3))
                  {
                    params0.D(i6, U(paramObject, l1));
                    continue;
                    if (D(paramObject, i6, i3))
                    {
                      params0.e(i6, U(paramObject, l1));
                      continue;
                      if (D(paramObject, i6, i3))
                      {
                        params0.J(i6, (g)localUnsafe.getObject(paramObject, l1));
                        continue;
                        if (D(paramObject, i6, i3))
                        {
                          params0.K(i6, localUnsafe.getObject(paramObject, l1), r(i3));
                          continue;
                          if (D(paramObject, i6, i3))
                          {
                            m0(i6, localUnsafe.getObject(paramObject, l1), params0);
                            continue;
                            if (D(paramObject, i6, i3))
                            {
                              params0.d(i6, R(paramObject, l1));
                              continue;
                              if (D(paramObject, i6, i3))
                              {
                                params0.l(i6, U(paramObject, l1));
                                continue;
                                if (D(paramObject, i6, i3))
                                {
                                  params0.u(i6, V(paramObject, l1));
                                  continue;
                                  if (D(paramObject, i6, i3))
                                  {
                                    params0.i(i6, U(paramObject, l1));
                                    continue;
                                    if (D(paramObject, i6, i3))
                                    {
                                      params0.C(i6, V(paramObject, l1));
                                      continue;
                                      if (D(paramObject, i6, i3))
                                      {
                                        params0.c(i6, V(paramObject, l1));
                                        continue;
                                        if (D(paramObject, i6, i3))
                                        {
                                          params0.x(i6, T(paramObject, l1));
                                          continue;
                                          if (D(paramObject, i6, i3))
                                          {
                                            params0.m(i6, S(paramObject, l1));
                                            continue;
                                            l0(params0, i6, localUnsafe.getObject(paramObject, l1), i3);
                                            continue;
                                            g0.T(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, r(i3));
                                            continue;
                                            g0.a0(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.Z(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.Y(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.X(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.P(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.c0(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.M(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.Q(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.R(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.U(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.d0(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.V(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.S(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.O(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, true);
                                            continue;
                                            g0.a0(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.Z(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.Y(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.X(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.P(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.c0(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.N(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0);
                                            continue;
                                            g0.W(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, r(i3));
                                            continue;
                                            g0.b0(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0);
                                            continue;
                                            g0.M(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.Q(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.R(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.U(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.d0(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.V(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.S(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            g0.O(P(i3), (List)localUnsafe.getObject(paramObject, l1), params0, false);
                                            break;
                                            if ((i9 & i4) != 0)
                                            {
                                              params0.O(i6, localUnsafe.getObject(paramObject, l1), r(i3));
                                              break;
                                              if ((i9 & i4) != 0)
                                              {
                                                params0.w(i6, localUnsafe.getLong(paramObject, l1));
                                                break;
                                                if ((i9 & i4) != 0)
                                                {
                                                  params0.H(i6, localUnsafe.getInt(paramObject, l1));
                                                  break;
                                                  if ((i9 & i4) != 0)
                                                  {
                                                    params0.n(i6, localUnsafe.getLong(paramObject, l1));
                                                    break;
                                                    if ((i9 & i4) != 0)
                                                    {
                                                      params0.g(i6, localUnsafe.getInt(paramObject, l1));
                                                      break;
                                                      if ((i9 & i4) != 0)
                                                      {
                                                        params0.D(i6, localUnsafe.getInt(paramObject, l1));
                                                        break;
                                                        if ((i9 & i4) != 0)
                                                        {
                                                          params0.e(i6, localUnsafe.getInt(paramObject, l1));
                                                          break;
                                                          if ((i9 & i4) != 0)
                                                          {
                                                            params0.J(i6, (g)localUnsafe.getObject(paramObject, l1));
                                                            break;
                                                            if ((i9 & i4) != 0)
                                                            {
                                                              params0.K(i6, localUnsafe.getObject(paramObject, l1), r(i3));
                                                              break;
                                                              if ((i9 & i4) != 0)
                                                              {
                                                                m0(i6, localUnsafe.getObject(paramObject, l1), params0);
                                                                break;
                                                                if ((i9 & i4) != 0)
                                                                {
                                                                  params0.d(i6, k(paramObject, l1));
                                                                  break;
                                                                  if ((i9 & i4) != 0)
                                                                  {
                                                                    params0.l(i6, localUnsafe.getInt(paramObject, l1));
                                                                    break;
                                                                    if ((i9 & i4) != 0)
                                                                    {
                                                                      params0.u(i6, localUnsafe.getLong(paramObject, l1));
                                                                      break;
                                                                      if ((i9 & i4) != 0)
                                                                      {
                                                                        params0.i(i6, localUnsafe.getInt(paramObject, l1));
                                                                        break;
                                                                        if ((i9 & i4) != 0)
                                                                        {
                                                                          params0.C(i6, localUnsafe.getLong(paramObject, l1));
                                                                          break;
                                                                          if ((i9 & i4) != 0)
                                                                          {
                                                                            params0.c(i6, localUnsafe.getLong(paramObject, l1));
                                                                            break;
                                                                            if ((i9 & i4) != 0)
                                                                            {
                                                                              params0.x(i6, o(paramObject, l1));
                                                                              break;
                                                                              if ((i9 & i4) != 0) {
                                                                                params0.m(i6, l(paramObject, l1));
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
    while (localObject != null)
    {
      p.j(params0, (Map.Entry)localObject);
      if (localIterator.hasNext()) {
        localObject = (Map.Entry)localIterator.next();
      } else {
        localObject = null;
      }
    }
    n0(o, paramObject, params0);
  }
  
  public final boolean j(Object paramObject1, Object paramObject2, int paramInt)
  {
    boolean bool;
    if (x(paramObject1, paramInt) == x(paramObject2, paramInt)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void j0(Object paramObject, s0 params0)
  {
    if (f)
    {
      localObject1 = p.c(paramObject);
      if (!((s)localObject1).j())
      {
        localIterator = ((s)localObject1).n();
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
      int i3 = h0(i2);
      int i4 = P(i2);
      while ((localObject2 != null) && (p.a((Map.Entry)localObject2) <= i4))
      {
        p.j(params0, (Map.Entry)localObject2);
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
      switch (g0(i3))
      {
      default: 
        break;
      case 68: 
        if (D(paramObject, i4, i2)) {
          params0.O(i4, p0.A(paramObject, Q(i3)), r(i2));
        }
        break;
      case 67: 
        if (D(paramObject, i4, i2))
        {
          l1 = V(paramObject, Q(i3));
          params0.w(i4, l1);
        }
        break;
      case 66: 
        if (D(paramObject, i4, i2))
        {
          i3 = U(paramObject, Q(i3));
          params0.H(i4, i3);
        }
        break;
      case 65: 
        if (D(paramObject, i4, i2))
        {
          l1 = V(paramObject, Q(i3));
          params0.n(i4, l1);
        }
        break;
      case 64: 
        if (D(paramObject, i4, i2))
        {
          i3 = U(paramObject, Q(i3));
          params0.g(i4, i3);
        }
        break;
      case 63: 
        if (D(paramObject, i4, i2))
        {
          i3 = U(paramObject, Q(i3));
          params0.D(i4, i3);
        }
        break;
      case 62: 
        if (D(paramObject, i4, i2))
        {
          i3 = U(paramObject, Q(i3));
          params0.e(i4, i3);
        }
        break;
      case 61: 
        if (D(paramObject, i4, i2)) {
          params0.J(i4, (g)p0.A(paramObject, Q(i3)));
        }
        break;
      case 60: 
        if (D(paramObject, i4, i2)) {
          params0.K(i4, p0.A(paramObject, Q(i3)), r(i2));
        }
        break;
      case 59: 
        if (D(paramObject, i4, i2)) {
          m0(i4, p0.A(paramObject, Q(i3)), params0);
        }
        break;
      case 58: 
        if (D(paramObject, i4, i2))
        {
          bool = R(paramObject, Q(i3));
          params0.d(i4, bool);
        }
        break;
      case 57: 
        if (D(paramObject, i4, i2))
        {
          i3 = U(paramObject, Q(i3));
          params0.l(i4, i3);
        }
        break;
      case 56: 
        if (D(paramObject, i4, i2))
        {
          l1 = V(paramObject, Q(i3));
          params0.u(i4, l1);
        }
        break;
      case 55: 
        if (D(paramObject, i4, i2))
        {
          i3 = U(paramObject, Q(i3));
          params0.i(i4, i3);
        }
        break;
      case 54: 
        if (D(paramObject, i4, i2))
        {
          l1 = V(paramObject, Q(i3));
          params0.C(i4, l1);
        }
        break;
      case 53: 
        if (D(paramObject, i4, i2))
        {
          l1 = V(paramObject, Q(i3));
          params0.c(i4, l1);
        }
        break;
      case 52: 
        if (D(paramObject, i4, i2))
        {
          f1 = T(paramObject, Q(i3));
          params0.x(i4, f1);
        }
        break;
      case 51: 
        if (!D(paramObject, i4, i2)) {
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
        for (double d1 = S(paramObject, Q(i3));; d1 = l(paramObject, Q(i3)))
        {
          params0.m(i4, d1);
          break label2342;
          l0(params0, i4, p0.A(paramObject, Q(i3)), i2);
          break label2342;
          g0.T(P(i2), (List)p0.A(paramObject, Q(i3)), params0, r(i2));
          break label2342;
          g0.a0(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.Z(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.Y(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.X(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.P(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.c0(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.M(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.Q(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.R(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.U(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.d0(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.V(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.S(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.O(P(i2), (List)p0.A(paramObject, Q(i3)), params0, true);
          break label2342;
          g0.a0(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.Z(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.Y(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.X(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.P(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.c0(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.N(P(i2), (List)p0.A(paramObject, Q(i3)), params0);
          break label2342;
          g0.W(P(i2), (List)p0.A(paramObject, Q(i3)), params0, r(i2));
          break label2342;
          g0.b0(P(i2), (List)p0.A(paramObject, Q(i3)), params0);
          break label2342;
          g0.M(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.Q(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.R(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.U(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.d0(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.V(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.S(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          g0.O(P(i2), (List)p0.A(paramObject, Q(i3)), params0, false);
          break label2342;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          break;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          l1 = G(paramObject, Q(i3));
          break label508;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          i3 = v(paramObject, Q(i3));
          break label544;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          l1 = G(paramObject, Q(i3));
          break label580;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          i3 = v(paramObject, Q(i3));
          break label616;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          i3 = v(paramObject, Q(i3));
          break label652;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          i3 = v(paramObject, Q(i3));
          break label688;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          break label713;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          break label748;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          break label786;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          bool = k(paramObject, Q(i3));
          break label828;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          i3 = v(paramObject, Q(i3));
          break label864;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          l1 = G(paramObject, Q(i3));
          break label900;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          i3 = v(paramObject, Q(i3));
          break label936;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          l1 = G(paramObject, Q(i3));
          break label972;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          l1 = G(paramObject, Q(i3));
          break label1008;
          if (!x(paramObject, i2)) {
            break label2342;
          }
          f1 = o(paramObject, Q(i3));
          break label1044;
          if (!x(paramObject, i2)) {
            break label2342;
          }
        }
      }
      label2342:
      i2 += 3;
    }
    while (localObject1 != null)
    {
      p.j(params0, (Map.Entry)localObject1);
      if (localIterator.hasNext()) {
        localObject1 = (Map.Entry)localIterator.next();
      } else {
        localObject1 = null;
      }
    }
    n0(o, paramObject, params0);
  }
  
  public final void k0(Object paramObject, s0 params0)
  {
    n0(o, paramObject, params0);
    if (f)
    {
      localObject1 = p.c(paramObject);
      if (!((s)localObject1).j())
      {
        localIterator = ((s)localObject1).e();
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
      int i2 = h0(i1);
      int i3 = P(i1);
      while ((localObject2 != null) && (p.a((Map.Entry)localObject2) > i3))
      {
        p.j(params0, (Map.Entry)localObject2);
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
      switch (g0(i2))
      {
      default: 
        break;
      case 68: 
        if (D(paramObject, i3, i1)) {
          params0.O(i3, p0.A(paramObject, Q(i2)), r(i1));
        }
        break;
      case 67: 
        if (D(paramObject, i3, i1))
        {
          l1 = V(paramObject, Q(i2));
          params0.w(i3, l1);
        }
        break;
      case 66: 
        if (D(paramObject, i3, i1))
        {
          i2 = U(paramObject, Q(i2));
          params0.H(i3, i2);
        }
        break;
      case 65: 
        if (D(paramObject, i3, i1))
        {
          l1 = V(paramObject, Q(i2));
          params0.n(i3, l1);
        }
        break;
      case 64: 
        if (D(paramObject, i3, i1))
        {
          i2 = U(paramObject, Q(i2));
          params0.g(i3, i2);
        }
        break;
      case 63: 
        if (D(paramObject, i3, i1))
        {
          i2 = U(paramObject, Q(i2));
          params0.D(i3, i2);
        }
        break;
      case 62: 
        if (D(paramObject, i3, i1))
        {
          i2 = U(paramObject, Q(i2));
          params0.e(i3, i2);
        }
        break;
      case 61: 
        if (D(paramObject, i3, i1)) {
          params0.J(i3, (g)p0.A(paramObject, Q(i2)));
        }
        break;
      case 60: 
        if (D(paramObject, i3, i1)) {
          params0.K(i3, p0.A(paramObject, Q(i2)), r(i1));
        }
        break;
      case 59: 
        if (D(paramObject, i3, i1)) {
          m0(i3, p0.A(paramObject, Q(i2)), params0);
        }
        break;
      case 58: 
        if (D(paramObject, i3, i1))
        {
          bool = R(paramObject, Q(i2));
          params0.d(i3, bool);
        }
        break;
      case 57: 
        if (D(paramObject, i3, i1))
        {
          i2 = U(paramObject, Q(i2));
          params0.l(i3, i2);
        }
        break;
      case 56: 
        if (D(paramObject, i3, i1))
        {
          l1 = V(paramObject, Q(i2));
          params0.u(i3, l1);
        }
        break;
      case 55: 
        if (D(paramObject, i3, i1))
        {
          i2 = U(paramObject, Q(i2));
          params0.i(i3, i2);
        }
        break;
      case 54: 
        if (D(paramObject, i3, i1))
        {
          l1 = V(paramObject, Q(i2));
          params0.C(i3, l1);
        }
        break;
      case 53: 
        if (D(paramObject, i3, i1))
        {
          l1 = V(paramObject, Q(i2));
          params0.c(i3, l1);
        }
        break;
      case 52: 
        if (D(paramObject, i3, i1))
        {
          f1 = T(paramObject, Q(i2));
          params0.x(i3, f1);
        }
        break;
      case 51: 
        if (!D(paramObject, i3, i1)) {
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
        for (double d1 = S(paramObject, Q(i2));; d1 = l(paramObject, Q(i2)))
        {
          params0.m(i3, d1);
          break label2350;
          l0(params0, i3, p0.A(paramObject, Q(i2)), i1);
          break label2350;
          g0.T(P(i1), (List)p0.A(paramObject, Q(i2)), params0, r(i1));
          break label2350;
          g0.a0(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.Z(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.Y(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.X(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.P(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.c0(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.M(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.Q(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.R(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.U(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.d0(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.V(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.S(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.O(P(i1), (List)p0.A(paramObject, Q(i2)), params0, true);
          break label2350;
          g0.a0(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.Z(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.Y(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.X(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.P(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.c0(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.N(P(i1), (List)p0.A(paramObject, Q(i2)), params0);
          break label2350;
          g0.W(P(i1), (List)p0.A(paramObject, Q(i2)), params0, r(i1));
          break label2350;
          g0.b0(P(i1), (List)p0.A(paramObject, Q(i2)), params0);
          break label2350;
          g0.M(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.Q(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.R(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.U(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.d0(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.V(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.S(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          g0.O(P(i1), (List)p0.A(paramObject, Q(i2)), params0, false);
          break label2350;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          break;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          l1 = G(paramObject, Q(i2));
          break label516;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          i2 = v(paramObject, Q(i2));
          break label552;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          l1 = G(paramObject, Q(i2));
          break label588;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          i2 = v(paramObject, Q(i2));
          break label624;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          i2 = v(paramObject, Q(i2));
          break label660;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          i2 = v(paramObject, Q(i2));
          break label696;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          break label721;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          break label756;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          break label794;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          bool = k(paramObject, Q(i2));
          break label836;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          i2 = v(paramObject, Q(i2));
          break label872;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          l1 = G(paramObject, Q(i2));
          break label908;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          i2 = v(paramObject, Q(i2));
          break label944;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          l1 = G(paramObject, Q(i2));
          break label980;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          l1 = G(paramObject, Q(i2));
          break label1016;
          if (!x(paramObject, i1)) {
            break label2350;
          }
          f1 = o(paramObject, Q(i2));
          break label1052;
          if (!x(paramObject, i1)) {
            break label2350;
          }
        }
      }
      label2350:
      i1 -= 3;
    }
    while (localObject1 != null)
    {
      p.j(params0, (Map.Entry)localObject1);
      if (localIterator.hasNext()) {
        localObject1 = (Map.Entry)localIterator.next();
      } else {
        localObject1 = null;
      }
    }
  }
  
  public final void l0(s0 params0, int paramInt1, Object paramObject, int paramInt2)
  {
    if (paramObject != null) {
      params0.N(paramInt1, q.d(q(paramInt2)), q.e(paramObject));
    }
  }
  
  public final boolean m(Object paramObject1, Object paramObject2, int paramInt)
  {
    int i1 = h0(paramInt);
    long l1 = Q(i1);
    i1 = g0(i1);
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
      if (C(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool19;
        if (g0.J(p0.A(paramObject1, l1), p0.A(paramObject2, l1))) {
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
      return g0.J(p0.A(paramObject1, l1), p0.A(paramObject2, l1));
    case 17: 
      bool20 = bool1;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool1;
        if (g0.J(p0.A(paramObject1, l1), p0.A(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 16: 
      bool20 = bool2;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool2;
        if (p0.y(paramObject1, l1) == p0.y(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 15: 
      bool20 = bool3;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool3;
        if (p0.x(paramObject1, l1) == p0.x(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 14: 
      bool20 = bool4;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool4;
        if (p0.y(paramObject1, l1) == p0.y(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 13: 
      bool20 = bool5;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool5;
        if (p0.x(paramObject1, l1) == p0.x(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 12: 
      bool20 = bool6;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool6;
        if (p0.x(paramObject1, l1) == p0.x(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 11: 
      bool20 = bool7;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool7;
        if (p0.x(paramObject1, l1) == p0.x(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 10: 
      bool20 = bool8;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool8;
        if (g0.J(p0.A(paramObject1, l1), p0.A(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 9: 
      bool20 = bool9;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool9;
        if (g0.J(p0.A(paramObject1, l1), p0.A(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 8: 
      bool20 = bool10;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool10;
        if (g0.J(p0.A(paramObject1, l1), p0.A(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    case 7: 
      bool20 = bool11;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool11;
        if (p0.p(paramObject1, l1) == p0.p(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 6: 
      bool20 = bool12;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool12;
        if (p0.x(paramObject1, l1) == p0.x(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 5: 
      bool20 = bool13;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool13;
        if (p0.y(paramObject1, l1) == p0.y(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 4: 
      bool20 = bool14;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool14;
        if (p0.x(paramObject1, l1) == p0.x(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 3: 
      bool20 = bool15;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool15;
        if (p0.y(paramObject1, l1) == p0.y(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 2: 
      bool20 = bool16;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool16;
        if (p0.y(paramObject1, l1) == p0.y(paramObject2, l1)) {
          bool20 = true;
        }
      }
      return bool20;
    case 1: 
      bool20 = bool17;
      if (j(paramObject1, paramObject2, paramInt))
      {
        bool20 = bool17;
        if (Float.floatToIntBits(p0.w(paramObject1, l1)) == Float.floatToIntBits(p0.w(paramObject2, l1))) {
          bool20 = true;
        }
      }
      return bool20;
    }
    boolean bool20 = bool18;
    if (j(paramObject1, paramObject2, paramInt))
    {
      bool20 = bool18;
      if (Double.doubleToLongBits(p0.v(paramObject1, l1)) == Double.doubleToLongBits(p0.v(paramObject2, l1))) {
        bool20 = true;
      }
    }
    return bool20;
  }
  
  public final void m0(int paramInt, Object paramObject, s0 params0)
  {
    if ((paramObject instanceof String)) {
      params0.A(paramInt, (String)paramObject);
    } else {
      params0.J(paramInt, (g)paramObject);
    }
  }
  
  public final Object n(Object paramObject1, int paramInt, Object paramObject2, l0 paraml0)
  {
    P(paramInt);
    if (p0.A(paramObject1, Q(h0(paramInt))) == null) {
      return paramObject2;
    }
    p(paramInt);
    return paramObject2;
  }
  
  public final void n0(l0 paraml0, Object paramObject, s0 params0)
  {
    paraml0.t(paraml0.g(paramObject), params0);
  }
  
  public final y.a p(int paramInt)
  {
    a.a(b[(paramInt / 3 * 2 + 1)]);
    return null;
  }
  
  public final Object q(int paramInt)
  {
    return b[(paramInt / 3 * 2)];
  }
  
  public final e0 r(int paramInt)
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
  
  public final int s(Object paramObject)
  {
    Unsafe localUnsafe = s;
    int i1 = -1;
    int i2 = 0;
    int i3 = 0;
    int i9;
    for (int i4 = 0; i2 < a.length; i4 = i9)
    {
      int i5 = h0(i2);
      int i6 = P(i2);
      int i7 = g0(i5);
      int i8;
      int i10;
      int i11;
      if (i7 <= 17)
      {
        i8 = a[(i2 + 2)];
        i9 = 0xFFFFF & i8;
        i10 = i1;
        if (i9 != i1)
        {
          i4 = localUnsafe.getInt(paramObject, i9);
          i10 = i9;
        }
        i11 = 1 << (i8 >>> 20);
        i9 = i4;
      }
      else
      {
        if ((i) && (i7 >= t.c0.c()) && (i7 <= t.p0.c())) {}
        for (i8 = a[(i2 + 2)] & 0xFFFFF;; i8 = 0)
        {
          i11 = 0;
          i10 = i1;
          i9 = i4;
          break;
        }
      }
      long l1 = Q(i5);
      switch (i7)
      {
      default: 
        i1 = i3;
        break;
      case 68: 
        i1 = i3;
        if (D(paramObject, i6, i2))
        {
          i1 = j.r(i6, (O)localUnsafe.getObject(paramObject, l1), r(i2));
          i1 = i3 + i1;
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
        label515:
        label520:
        label549:
        label582:
        label607:
        label632:
        label639:
        label669:
        label701:
        label726:
        label760:
        label1146:
        do
        {
          Object localObject;
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
                      for (;;)
                      {
                        i4 = i1;
                        break label2373;
                        i1 = i3;
                        if (D(paramObject, i6, i2))
                        {
                          l1 = V(paramObject, l1);
                          i1 = j.L(i6, l1);
                          break;
                          i1 = i3;
                          if (D(paramObject, i6, i2))
                          {
                            i1 = U(paramObject, l1);
                            i1 = j.J(i6, i1);
                            break;
                            i1 = i3;
                            if (D(paramObject, i6, i2))
                            {
                              i1 = j.H(i6, 0L);
                              break;
                              i1 = i3;
                              if (D(paramObject, i6, i2))
                              {
                                i1 = j.F(i6, 0);
                                i1 = i3 + i1;
                              }
                            }
                          }
                        }
                      }
                      i1 = i3;
                    } while (!D(paramObject, i6, i2));
                    i1 = U(paramObject, l1);
                    i1 = j.j(i6, i1);
                    break;
                    i1 = i3;
                  } while (!D(paramObject, i6, i2));
                  i1 = U(paramObject, l1);
                  i1 = j.Q(i6, i1);
                  break;
                  i1 = i3;
                } while (!D(paramObject, i6, i2));
                i1 = j.f(i6, (g)localUnsafe.getObject(paramObject, l1));
                break;
                i1 = i3;
              } while (!D(paramObject, i6, i2));
              i1 = g0.o(i6, localUnsafe.getObject(paramObject, l1), r(i2));
              break;
              i1 = i3;
            } while (!D(paramObject, i6, i2));
            localObject = localUnsafe.getObject(paramObject, l1);
            if ((localObject instanceof g))
            {
              i1 = j.f(i6, (g)localObject);
              break;
            }
            i1 = j.N(i6, (String)localObject);
            break;
            i1 = i3;
          } while (!D(paramObject, i6, i2));
          for (;;)
          {
            i1 = j.c(i6, true);
            break label515;
            i1 = i3;
            if (!D(paramObject, i6, i2)) {
              break label520;
            }
            i1 = j.l(i6, 0);
            break label639;
            i1 = i3;
            if (!D(paramObject, i6, i2)) {
              break label520;
            }
            i1 = j.n(i6, 0L);
            break label515;
            i1 = i3;
            if (!D(paramObject, i6, i2)) {
              break label520;
            }
            i1 = j.u(i6, U(paramObject, l1));
            break label515;
            i1 = i3;
            if (!D(paramObject, i6, i2)) {
              break label520;
            }
            i1 = j.S(i6, V(paramObject, l1));
            break label515;
            i1 = i3;
            if (!D(paramObject, i6, i2)) {
              break label520;
            }
            i1 = j.w(i6, V(paramObject, l1));
            break label515;
            i1 = i3;
            if (!D(paramObject, i6, i2)) {
              break label520;
            }
            i1 = j.p(i6, 0.0F);
            break label515;
            i1 = i3;
            if (!D(paramObject, i6, i2)) {
              break label520;
            }
            i1 = j.h(i6, 0.0D);
            break label515;
            i1 = q.b(i6, localUnsafe.getObject(paramObject, l1), q(i2));
            break label515;
            i1 = g0.j(i6, (List)localUnsafe.getObject(paramObject, l1), r(i2));
            break label515;
            i4 = g0.t((List)localUnsafe.getObject(paramObject, l1));
            i1 = i3;
            if (i4 <= 0) {
              break label520;
            }
            i1 = i4;
            if (i) {
              i1 = i4;
            }
            for (;;)
            {
              localUnsafe.putInt(paramObject, i8, i1);
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
                                        i1 = j.P(i6) + j.R(i1) + i1;
                                        break label639;
                                        i4 = g0.r((List)localUnsafe.getObject(paramObject, l1));
                                        i1 = i3;
                                        if (i4 <= 0) {
                                          break;
                                        }
                                        i1 = i4;
                                      } while (!i);
                                      i1 = i4;
                                      break label1146;
                                      i4 = g0.i((List)localUnsafe.getObject(paramObject, l1));
                                      i1 = i3;
                                      if (i4 <= 0) {
                                        break;
                                      }
                                      i1 = i4;
                                    } while (!i);
                                    i1 = i4;
                                    break label1146;
                                    i4 = g0.g((List)localUnsafe.getObject(paramObject, l1));
                                    i1 = i3;
                                    if (i4 <= 0) {
                                      break;
                                    }
                                    i1 = i4;
                                  } while (!i);
                                  i1 = i4;
                                  break label1146;
                                  i4 = g0.e((List)localUnsafe.getObject(paramObject, l1));
                                  i1 = i3;
                                  if (i4 <= 0) {
                                    break;
                                  }
                                  i1 = i4;
                                } while (!i);
                                i1 = i4;
                                break label1146;
                                i4 = g0.w((List)localUnsafe.getObject(paramObject, l1));
                                i1 = i3;
                                if (i4 <= 0) {
                                  break;
                                }
                                i1 = i4;
                              } while (!i);
                              i1 = i4;
                              break label1146;
                              i4 = g0.b((List)localUnsafe.getObject(paramObject, l1));
                              i1 = i3;
                              if (i4 <= 0) {
                                break;
                              }
                              i1 = i4;
                            } while (!i);
                            i1 = i4;
                            break label1146;
                            i4 = g0.g((List)localUnsafe.getObject(paramObject, l1));
                            i1 = i3;
                            if (i4 <= 0) {
                              break;
                            }
                            i1 = i4;
                          } while (!i);
                          i1 = i4;
                          break label1146;
                          i4 = g0.i((List)localUnsafe.getObject(paramObject, l1));
                          i1 = i3;
                          if (i4 <= 0) {
                            break;
                          }
                          i1 = i4;
                        } while (!i);
                        i1 = i4;
                        break label1146;
                        i4 = g0.l((List)localUnsafe.getObject(paramObject, l1));
                        i1 = i3;
                        if (i4 <= 0) {
                          break;
                        }
                        i1 = i4;
                      } while (!i);
                      i1 = i4;
                      break label1146;
                      i4 = g0.y((List)localUnsafe.getObject(paramObject, l1));
                      i1 = i3;
                      if (i4 <= 0) {
                        break;
                      }
                      i1 = i4;
                    } while (!i);
                    i1 = i4;
                    break label1146;
                    i4 = g0.n((List)localUnsafe.getObject(paramObject, l1));
                    i1 = i3;
                    if (i4 <= 0) {
                      break;
                    }
                    i1 = i4;
                  } while (!i);
                  i1 = i4;
                  break label1146;
                  i4 = g0.g((List)localUnsafe.getObject(paramObject, l1));
                  i1 = i3;
                  if (i4 <= 0) {
                    break;
                  }
                  i1 = i4;
                } while (!i);
                i1 = i4;
                break label1146;
                i4 = g0.i((List)localUnsafe.getObject(paramObject, l1));
                i1 = i3;
                if (i4 <= 0) {
                  break;
                }
                i1 = i4;
              } while (!i);
              i1 = i4;
            }
            i1 = g0.s(i6, (List)localUnsafe.getObject(paramObject, l1), false);
            for (;;)
            {
              i4 = i3 + i1;
              break label2373;
              i1 = g0.q(i6, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = g0.h(i6, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = g0.f(i6, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = g0.d(i6, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = g0.v(i6, (List)localUnsafe.getObject(paramObject, l1), false);
              break;
              i1 = g0.c(i6, (List)localUnsafe.getObject(paramObject, l1));
              break;
              i1 = g0.p(i6, (List)localUnsafe.getObject(paramObject, l1), r(i2));
              break;
              i1 = g0.u(i6, (List)localUnsafe.getObject(paramObject, l1));
              break;
              i1 = g0.a(i6, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = g0.k(i6, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = g0.x(i6, (List)localUnsafe.getObject(paramObject, l1), false);
              continue;
              i1 = g0.m(i6, (List)localUnsafe.getObject(paramObject, l1), false);
            }
            i1 = g0.h(i6, (List)localUnsafe.getObject(paramObject, l1), false);
            break label515;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            break;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            l1 = localUnsafe.getLong(paramObject, l1);
            break label549;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            i1 = localUnsafe.getInt(paramObject, l1);
            break label582;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            break label607;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            break label632;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            i1 = localUnsafe.getInt(paramObject, l1);
            break label669;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            i1 = localUnsafe.getInt(paramObject, l1);
            break label701;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            break label726;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            break label760;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
            localObject = localUnsafe.getObject(paramObject, l1);
            if ((localObject instanceof g))
            {
              i1 = j.f(i6, (g)localObject);
              break label515;
            }
            i1 = j.N(i6, (String)localObject);
            break label515;
            i1 = i3;
            if ((i9 & i11) == 0) {
              break label520;
            }
          }
          i1 = i3;
        } while ((i9 & i11) == 0);
        i1 = j.l(i6, 0);
      }
      for (;;)
      {
        i4 = i3 + i1;
        break;
        i4 = i3;
        if ((i9 & i11) == 0) {
          break;
        }
        i1 = j.n(i6, 0L);
        continue;
        i4 = i3;
        if ((i9 & i11) == 0) {
          break;
        }
        i1 = j.u(i6, localUnsafe.getInt(paramObject, l1));
        continue;
        i4 = i3;
        if ((i9 & i11) == 0) {
          break;
        }
        i1 = j.S(i6, localUnsafe.getLong(paramObject, l1));
        continue;
        i4 = i3;
        if ((i9 & i11) == 0) {
          break;
        }
        i1 = j.w(i6, localUnsafe.getLong(paramObject, l1));
        continue;
        i4 = i3;
        if ((i9 & i11) == 0) {
          break;
        }
        i1 = j.p(i6, 0.0F);
        continue;
        i4 = i3;
        if ((i9 & i11) == 0) {
          break;
        }
        i1 = j.h(i6, 0.0D);
      }
      label2373:
      i2 += 3;
      i1 = i10;
      i3 = i4;
    }
    i4 = i3 + u(o, paramObject);
    i1 = i4;
    if (f) {
      i1 = i4 + p.c(paramObject).h();
    }
    return i1;
  }
  
  public final int t(Object paramObject)
  {
    Unsafe localUnsafe = s;
    int i1 = 0;
    int i4;
    for (int i2 = i1; i1 < a.length; i2 = i4)
    {
      int i3 = h0(i1);
      i4 = g0(i3);
      int i5 = P(i1);
      long l1 = Q(i3);
      if ((i4 >= t.c0.c()) && (i4 <= t.p0.c())) {
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
        if (D(paramObject, i5, i1)) {
          i4 = j.r(i5, (O)p0.A(paramObject, l1), r(i1));
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
          if (!D(paramObject, i5, i1)) {
            break;
          }
          l1 = V(paramObject, l1);
          i4 = j.L(i5, l1);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = U(paramObject, l1);
          i4 = j.J(i5, i4);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = j.H(i5, 0L);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = j.F(i5, 0);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = U(paramObject, l1);
          i4 = j.j(i5, i4);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = U(paramObject, l1);
          i4 = j.Q(i5, i4);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          for (localObject1 = p0.A(paramObject, l1);; localObject1 = localObject2)
          {
            i4 = j.f(i5, (g)localObject1);
            break;
            i4 = i2;
            if (!D(paramObject, i5, i1)) {
              break label2244;
            }
            i4 = g0.o(i5, p0.A(paramObject, l1), r(i1));
            break;
            i4 = i2;
            if (!D(paramObject, i5, i1)) {
              break label2244;
            }
            localObject2 = p0.A(paramObject, l1);
            localObject1 = localObject2;
            if (!(localObject2 instanceof g)) {
              break label741;
            }
          }
          i4 = j.N(i5, (String)localObject1);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = j.c(i5, true);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = j.l(i5, 0);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = j.n(i5, 0L);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = U(paramObject, l1);
          i4 = j.u(i5, i4);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          l1 = V(paramObject, l1);
          i4 = j.S(i5, l1);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          l1 = V(paramObject, l1);
          i4 = j.w(i5, l1);
          continue;
          i4 = i2;
          if (!D(paramObject, i5, i1)) {
            break;
          }
          i4 = j.p(i5, 0.0F);
        }
      case 51: 
        i4 = i2;
        if (!D(paramObject, i5, i1)) {
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
          i4 = j.h(i5, 0.0D);
          break label423;
          i4 = q.b(i5, p0.A(paramObject, l1), q(i1));
          break label423;
          i4 = g0.j(i5, F(paramObject, l1), r(i1));
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
                                      i4 = j.P(i5) + j.R(i4) + i4;
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
          i4 = g0.s(i5, F(paramObject, l1), false);
          break label423;
          i4 = g0.q(i5, F(paramObject, l1), false);
          break label423;
          i4 = g0.h(i5, F(paramObject, l1), false);
          break label423;
          i4 = g0.f(i5, F(paramObject, l1), false);
          break label423;
          i4 = g0.d(i5, F(paramObject, l1), false);
          break label423;
          i4 = g0.v(i5, F(paramObject, l1), false);
          break label423;
          i4 = g0.c(i5, F(paramObject, l1));
          break label423;
          i4 = g0.p(i5, F(paramObject, l1), r(i1));
          break label423;
          i4 = g0.u(i5, F(paramObject, l1));
          break label423;
          i4 = g0.a(i5, F(paramObject, l1), false);
          break label423;
          i4 = g0.k(i5, F(paramObject, l1), false);
          break label423;
          i4 = g0.x(i5, F(paramObject, l1), false);
          break label423;
          i4 = g0.m(i5, F(paramObject, l1), false);
          break label423;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          break;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          l1 = p0.y(paramObject, l1);
          break label456;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          i4 = p0.x(paramObject, l1);
          break label491;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          break label518;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          break label544;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          i4 = p0.x(paramObject, l1);
          break label578;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          i4 = p0.x(paramObject, l1);
          break label613;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          break label640;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          break label678;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          localObject2 = p0.A(paramObject, l1);
          localObject1 = localObject2;
          if (!(localObject2 instanceof g)) {
            break label741;
          }
          localObject1 = localObject2;
          break label738;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          break label771;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          break label797;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          break label823;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          i4 = p0.x(paramObject, l1);
          break label857;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          l1 = p0.y(paramObject, l1);
          break label892;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          l1 = p0.y(paramObject, l1);
          break label927;
          i4 = i2;
          if (!x(paramObject, i1)) {
            break label2244;
          }
          break label954;
          i4 = i2;
        } while (x(paramObject, i1));
      }
      label2244:
      i1 += 3;
    }
    return i2 + u(o, paramObject);
  }
  
  public final int u(l0 paraml0, Object paramObject)
  {
    return paraml0.h(paraml0.g(paramObject));
  }
  
  public final boolean x(Object paramObject, int paramInt)
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
      paramInt = h0(paramInt);
      long l1 = Q(paramInt);
      switch (g0(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 17: 
        if (p0.A(paramObject, l1) != null) {
          bool17 = true;
        }
        return bool17;
      case 16: 
        bool17 = bool2;
        if (p0.y(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 15: 
        bool17 = bool3;
        if (p0.x(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 14: 
        bool17 = bool4;
        if (p0.y(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 13: 
        bool17 = bool5;
        if (p0.x(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 12: 
        bool17 = bool6;
        if (p0.x(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 11: 
        bool17 = bool7;
        if (p0.x(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 10: 
        return g.p.equals(p0.A(paramObject, l1)) ^ true;
      case 9: 
        bool17 = bool8;
        if (p0.A(paramObject, l1) != null) {
          bool17 = true;
        }
        return bool17;
      case 8: 
        paramObject = p0.A(paramObject, l1);
        if ((paramObject instanceof String)) {
          return ((String)paramObject).isEmpty() ^ true;
        }
        if ((paramObject instanceof g)) {
          return g.p.equals(paramObject) ^ true;
        }
        throw new IllegalArgumentException();
      case 7: 
        return p0.p(paramObject, l1);
      case 6: 
        bool17 = bool9;
        if (p0.x(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 5: 
        bool17 = bool10;
        if (p0.y(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 4: 
        bool17 = bool11;
        if (p0.x(paramObject, l1) != 0) {
          bool17 = true;
        }
        return bool17;
      case 3: 
        bool17 = bool12;
        if (p0.y(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 2: 
        bool17 = bool13;
        if (p0.y(paramObject, l1) != 0L) {
          bool17 = true;
        }
        return bool17;
      case 1: 
        bool17 = bool14;
        if (p0.w(paramObject, l1) != 0.0F) {
          bool17 = true;
        }
        return bool17;
      }
      bool17 = bool15;
      if (p0.v(paramObject, l1) != 0.0D) {
        bool17 = true;
      }
      return bool17;
    }
    paramInt = X(paramInt);
    bool17 = bool16;
    if ((p0.x(paramObject, paramInt & 0xFFFFF) & 1 << (paramInt >>> 20)) != 0) {
      bool17 = true;
    }
    return bool17;
  }
  
  public final boolean y(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    if (h) {
      return x(paramObject, paramInt1);
    }
    boolean bool;
    if ((paramInt2 & paramInt3) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.S
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
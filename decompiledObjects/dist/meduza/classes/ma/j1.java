package ma;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.logging.Logger;

public final class j1
{
  public static final Class<?> a;
  public static final p1<?, ?> b;
  public static final r1 c;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 16
    //   4: invokestatic 22	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   7: astore_1
    //   8: goto +6 -> 14
    //   11: astore_1
    //   12: aconst_null
    //   13: astore_1
    //   14: aload_1
    //   15: putstatic 24	ma/j1:a	Ljava/lang/Class;
    //   18: ldc 26
    //   20: invokestatic 22	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   23: astore_1
    //   24: goto +6 -> 30
    //   27: astore_1
    //   28: aconst_null
    //   29: astore_1
    //   30: aload_1
    //   31: ifnonnull +8 -> 39
    //   34: aload_0
    //   35: astore_1
    //   36: goto +22 -> 58
    //   39: aload_1
    //   40: iconst_0
    //   41: anewarray 18	java/lang/Class
    //   44: invokevirtual 30	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   47: iconst_0
    //   48: anewarray 4	java/lang/Object
    //   51: invokevirtual 36	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   54: checkcast 38	ma/p1
    //   57: astore_1
    //   58: aload_1
    //   59: putstatic 40	ma/j1:b	Lma/p1;
    //   62: new 42	ma/r1
    //   65: dup
    //   66: invokespecial 45	ma/r1:<init>	()V
    //   69: putstatic 47	ma/j1:c	Lma/r1;
    //   72: return
    //   73: astore_1
    //   74: aload_0
    //   75: astore_1
    //   76: goto -18 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	74	0	localObject1	Object
    //   7	1	1	localClass1	Class
    //   11	1	1	localObject2	Object
    //   13	11	1	localClass2	Class
    //   27	1	1	localObject3	Object
    //   29	30	1	localObject4	Object
    //   73	1	1	localObject5	Object
    //   75	1	1	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   2	8	11	finally
    //   18	24	27	finally
    //   39	58	73	finally
  }
  
  public static <T, FT extends s.a<FT>> void A(p<FT> paramp, T paramT1, T paramT2)
  {
    paramT2 = paramp.c(paramT2);
    if (!paramT2.i())
    {
      paramp = paramp.d(paramT1);
      paramp.getClass();
      for (int i = 0; i < a.e(); i++) {
        paramp.n(a.d(i));
      }
      paramT1 = a.f().iterator();
      while (paramT1.hasNext()) {
        paramp.n((Map.Entry)paramT1.next());
      }
    }
  }
  
  public static boolean B(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 != paramObject2) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static <UT, UB> UB C(Object paramObject, int paramInt1, int paramInt2, UB paramUB, p1<UT, UB> paramp1)
  {
    Object localObject = paramUB;
    if (paramUB == null) {
      localObject = paramp1.f(paramObject);
    }
    paramp1.e(localObject, paramInt1, paramInt2);
    return (UB)localObject;
  }
  
  public static void D(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          ((Boolean)paramList.get(paramInt)).booleanValue();
          Logger localLogger = k.c;
          i++;
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.T((byte)((Boolean)paramList.get(paramInt)).booleanValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.U(paramInt, ((Boolean)paramList.get(i)).booleanValue());
        i++;
      }
    }
  }
  
  public static void E(int paramInt, List paramList, l paraml)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      paraml.getClass();
      for (int i = 0; i < paramList.size(); i++) {
        a.W(paramInt, (h)paramList.get(i));
      }
    }
  }
  
  public static void F(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      Object localObject;
      double d;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          ((Double)paramList.get(i)).doubleValue();
          localObject = k.c;
          paramInt += 8;
          i++;
        }
        a.m0(paramInt);
        for (paramInt = j; paramInt < paramList.size(); paramInt++)
        {
          localObject = a;
          d = ((Double)paramList.get(paramInt)).doubleValue();
          localObject.getClass();
          ((k)localObject).b0(Double.doubleToRawLongBits(d));
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        localObject = a;
        d = ((Double)paramList.get(i)).doubleValue();
        localObject.getClass();
        ((k)localObject).a0(paramInt, Double.doubleToRawLongBits(d));
        i++;
      }
    }
  }
  
  public static void G(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += k.E(((Integer)paramList.get(paramInt)).intValue());
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.d0(((Integer)paramList.get(paramInt)).intValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.c0(paramInt, ((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
  }
  
  public static void H(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          ((Integer)paramList.get(paramInt)).intValue();
          Logger localLogger = k.c;
          i += 4;
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.Z(((Integer)paramList.get(paramInt)).intValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.Y(paramInt, ((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
  }
  
  public static void I(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          ((Long)paramList.get(i)).longValue();
          Logger localLogger = k.c;
          paramInt += 8;
          i++;
        }
        a.m0(paramInt);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.b0(((Long)paramList.get(paramInt)).longValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.a0(paramInt, ((Long)paramList.get(i)).longValue());
        i++;
      }
    }
  }
  
  public static void J(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      Object localObject;
      float f;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          ((Float)paramList.get(paramInt)).floatValue();
          localObject = k.c;
          i += 4;
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++)
        {
          localObject = a;
          f = ((Float)paramList.get(paramInt)).floatValue();
          localObject.getClass();
          ((k)localObject).Z(Float.floatToRawIntBits(f));
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        localObject = a;
        f = ((Float)paramList.get(i)).floatValue();
        localObject.getClass();
        ((k)localObject).Y(paramInt, Float.floatToRawIntBits(f));
        i++;
      }
    }
  }
  
  public static void K(int paramInt, List paramList, l paraml, i1 parami1)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      paraml.getClass();
      for (int i = 0; i < paramList.size(); i++) {
        paraml.h(paramInt, parami1, paramList.get(i));
      }
    }
  }
  
  public static void L(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += k.E(((Integer)paramList.get(paramInt)).intValue());
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.d0(((Integer)paramList.get(paramInt)).intValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.c0(paramInt, ((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
  }
  
  public static void M(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += k.R(((Long)paramList.get(paramInt)).longValue());
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.o0(((Long)paramList.get(paramInt)).longValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.n0(paramInt, ((Long)paramList.get(i)).longValue());
        i++;
      }
    }
  }
  
  public static void N(int paramInt, List paramList, l paraml, i1 parami1)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      paraml.getClass();
      for (int i = 0; i < paramList.size(); i++) {
        paraml.k(paramInt, parami1, paramList.get(i));
      }
    }
  }
  
  public static void O(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          ((Integer)paramList.get(i)).intValue();
          Logger localLogger = k.c;
          paramInt += 4;
          i++;
        }
        a.m0(paramInt);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.Z(((Integer)paramList.get(paramInt)).intValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.Y(paramInt, ((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
  }
  
  public static void P(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          ((Long)paramList.get(paramInt)).longValue();
          Logger localLogger = k.c;
          i += 8;
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.b0(((Long)paramList.get(paramInt)).longValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.a0(paramInt, ((Long)paramList.get(i)).longValue());
        i++;
      }
    }
  }
  
  public static void Q(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      k localk;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        i = 0;
        paramInt = i;
        while (i < paramList.size())
        {
          int k = ((Integer)paramList.get(i)).intValue();
          paramInt += k.P(k >> 31 ^ k << 1);
          i++;
        }
        a.m0(paramInt);
        for (paramInt = j; paramInt < paramList.size(); paramInt++)
        {
          localk = a;
          i = ((Integer)paramList.get(paramInt)).intValue();
          localk.m0(i >> 31 ^ i << 1);
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        localk = a;
        j = ((Integer)paramList.get(i)).intValue();
        localk.l0(paramInt, j >> 31 ^ j << 1);
        i++;
      }
    }
  }
  
  public static void R(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      long l;
      k localk;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          l = ((Long)paramList.get(paramInt)).longValue();
          i += k.R(l >> 63 ^ l << 1);
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++)
        {
          localk = a;
          l = ((Long)paramList.get(paramInt)).longValue();
          localk.o0(l >> 63 ^ l << 1);
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        localk = a;
        l = ((Long)paramList.get(i)).longValue();
        localk.n0(paramInt, l >> 63 ^ l << 1);
        i++;
      }
    }
  }
  
  public static void S(int paramInt, List paramList, l paraml)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      paraml.getClass();
      boolean bool = paramList instanceof h0;
      int i = 0;
      int j = 0;
      if (bool)
      {
        h0 localh0 = (h0)paramList;
        for (i = j; i < paramList.size(); i++)
        {
          Object localObject = localh0.f(i);
          if ((localObject instanceof String)) {
            a.i0(paramInt, (String)localObject);
          } else {
            a.W(paramInt, (h)localObject);
          }
        }
      }
      while (i < paramList.size())
      {
        a.i0(paramInt, (String)paramList.get(i));
        i++;
      }
    }
  }
  
  public static void T(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += k.P(((Integer)paramList.get(paramInt)).intValue());
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.m0(((Integer)paramList.get(paramInt)).intValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.l0(paramInt, ((Integer)paramList.get(i)).intValue());
        i++;
      }
    }
  }
  
  public static void U(int paramInt, List paramList, l paraml, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      int i = 0;
      int j = 0;
      if (paramBoolean)
      {
        a.k0(paramInt, 2);
        paramInt = 0;
        i = paramInt;
        while (paramInt < paramList.size())
        {
          i += k.R(((Long)paramList.get(paramInt)).longValue());
          paramInt++;
        }
        a.m0(i);
        for (paramInt = j; paramInt < paramList.size(); paramInt++) {
          a.o0(((Long)paramList.get(paramInt)).longValue());
        }
      }
      paraml.getClass();
      while (i < paramList.size())
      {
        a.n0(paramInt, ((Long)paramList.get(i)).longValue());
        i++;
      }
    }
  }
  
  public static int a(int paramInt, List paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return k.v(paramInt) * i;
  }
  
  public static int b(List<?> paramList)
  {
    return paramList.size();
  }
  
  public static int c(int paramInt, List<h> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    i = k.N(paramInt) * i;
    for (paramInt = j; paramInt < paramList.size(); paramInt++)
    {
      j = ((h)paramList.get(paramInt)).size();
      i += k.P(j) + j;
    }
    return i;
  }
  
  public static int d(int paramInt, List paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = e(paramList);
    return k.N(paramInt) * i + j;
  }
  
  public static int e(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        paramList.i(k);
        m += k.E(b[k]);
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += k.E(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int f(int paramInt, List paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return k.z(paramInt) * i;
  }
  
  public static int g(List<?> paramList)
  {
    return paramList.size() * 4;
  }
  
  public static int h(int paramInt, List paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return k.A(paramInt) * i;
  }
  
  public static int i(List<?> paramList)
  {
    return paramList.size() * 8;
  }
  
  public static int j(int paramInt, List<s0> paramList, i1 parami1)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = 0;
    while (j < i)
    {
      k += k.C(paramInt, (s0)paramList.get(j), parami1);
      j++;
    }
    return k;
  }
  
  public static int k(int paramInt, List paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = l(paramList);
    return k.N(paramInt) * i + j;
  }
  
  public static int l(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        paramList.i(k);
        m += k.E(b[k]);
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += k.E(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int m(int paramInt, List paramList)
  {
    if (paramList.size() == 0) {
      return 0;
    }
    int i = n(paramList);
    int j = paramList.size();
    return k.N(paramInt) * j + i;
  }
  
  public static int n(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof j0))
    {
      paramList = (j0)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        paramList.i(k);
        m += k.R(b[k]);
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += k.R(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static int o(int paramInt, i1 parami1, Object paramObject)
  {
    if ((paramObject instanceof f0))
    {
      parami1 = (f0)paramObject;
      paramInt = k.N(paramInt);
      return k.G(parami1) + paramInt;
    }
    paramObject = (s0)paramObject;
    paramInt = k.N(paramInt);
    int i = ((a)paramObject).m(parami1);
    return k.P(i) + i + paramInt;
  }
  
  public static int p(int paramInt, List<?> paramList, i1 parami1)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    paramInt = k.N(paramInt) * i;
    while (j < i)
    {
      Object localObject = paramList.get(j);
      int k;
      if ((localObject instanceof f0))
      {
        k = k.G((f0)localObject);
      }
      else
      {
        k = ((a)localObject).m(parami1);
        k += k.P(k);
      }
      paramInt += k;
      j++;
    }
    return paramInt;
  }
  
  public static int q(int paramInt, List paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = r(paramList);
    return k.N(paramInt) * i + j;
  }
  
  public static int r(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        paramList.i(k);
        j = b[k];
        m += k.P(j >> 31 ^ j << 1);
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      j = ((Integer)paramList.get(k)).intValue();
      m += k.P(j >> 31 ^ j << 1);
    }
    return j;
  }
  
  public static int s(int paramInt, List paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = t(paramList);
    return k.N(paramInt) * i + j;
  }
  
  public static int t(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    long l;
    if ((paramList instanceof j0))
    {
      paramList = (j0)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        paramList.i(k);
        l = b[k];
        m += k.R(l >> 63 ^ l << 1);
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      l = ((Long)paramList.get(k)).longValue();
      m += k.R(l >> 63 ^ l << 1);
    }
    return j;
  }
  
  public static int u(int paramInt, List<?> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    int m = k.N(paramInt) * i;
    paramInt = m;
    Object localObject;
    if ((paramList instanceof h0))
    {
      localObject = (h0)paramList;
      paramInt = m;
      for (j = k;; j++)
      {
        m = paramInt;
        if (j >= i) {
          break;
        }
        paramList = ((h0)localObject).f(j);
        if ((paramList instanceof h))
        {
          m = ((h)paramList).size();
          m = k.P(m) + m;
        }
        else
        {
          m = k.M((String)paramList);
        }
        paramInt += m;
      }
    }
    for (;;)
    {
      m = paramInt;
      if (j >= i) {
        break;
      }
      localObject = paramList.get(j);
      if ((localObject instanceof h))
      {
        m = ((h)localObject).size();
        m = k.P(m) + m;
      }
      else
      {
        m = k.M((String)localObject);
      }
      paramInt += m;
      j++;
    }
    return m;
  }
  
  public static int v(int paramInt, List paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = w(paramList);
    return k.N(paramInt) * i + j;
  }
  
  public static int w(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        paramList.i(k);
        m += k.P(b[k]);
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += k.P(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int x(int paramInt, List paramList)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = y(paramList);
    return k.N(paramInt) * i + j;
  }
  
  public static int y(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof j0))
    {
      paramList = (j0)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        paramList.i(k);
        m += k.R(b[k]);
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += k.R(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static <UT, UB> UB z(Object paramObject, int paramInt, List<Integer> paramList, a0.b paramb, UB paramUB, p1<UT, UB> paramp1)
  {
    if (paramb == null) {
      return paramUB;
    }
    int j;
    UB ?;
    if ((paramList instanceof RandomAccess))
    {
      int i = paramList.size();
      j = 0;
      int k = 0;
      while (j < i)
      {
        int m = ((Integer)paramList.get(j)).intValue();
        if (paramb.a())
        {
          if (j != k) {
            paramList.set(k, Integer.valueOf(m));
          }
          k++;
        }
        else
        {
          paramUB = C(paramObject, paramInt, m, paramUB, paramp1);
        }
        j++;
      }
      ? = paramUB;
      if (k != i)
      {
        paramList.subList(k, i).clear();
        ? = paramUB;
      }
    }
    else
    {
      paramList = paramList.iterator();
      for (;;)
      {
        ? = paramUB;
        if (!paramList.hasNext()) {
          break;
        }
        j = ((Integer)paramList.next()).intValue();
        if (!paramb.a())
        {
          paramUB = C(paramObject, paramInt, j, paramUB, paramp1);
          paramList.remove();
        }
      }
    }
    return ?;
  }
}

/* Location:
 * Qualified Name:     ma.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
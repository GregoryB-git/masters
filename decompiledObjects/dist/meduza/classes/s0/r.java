package s0;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class r<T extends a<T>>
{
  public static final r d = new r(0);
  public final f1<T, Object> a;
  public boolean b;
  public boolean c;
  
  public r()
  {
    int i = f1.o;
    a = new e1(16);
  }
  
  public r(int paramInt)
  {
    a = locale1;
    if (!b)
    {
      locale1.h();
      b = true;
    }
    if (!b)
    {
      locale1.h();
      b = true;
    }
  }
  
  public static Object b(Object paramObject)
  {
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      paramObject = new byte[arrayOfByte.length];
      System.arraycopy(arrayOfByte, 0, paramObject, 0, arrayOfByte.length);
      return paramObject;
    }
    return paramObject;
  }
  
  public static int c(n1 paramn1, int paramInt, Object paramObject)
  {
    int i = j.N(paramInt);
    paramInt = i;
    if (paramn1 == n1.d) {
      paramInt = i * 2;
    }
    return d(paramn1, paramObject) + paramInt;
  }
  
  public static int d(n1 paramn1, Object paramObject)
  {
    int i;
    switch (paramn1.ordinal())
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 17: 
      long l = ((Long)paramObject).longValue();
      return j.R(l >> 63 ^ l << 1);
    case 16: 
      i = ((Integer)paramObject).intValue();
      return j.P(i >> 31 ^ i << 1);
    case 13: 
      if ((paramObject instanceof x.a)) {
        return j.E(((x.a)paramObject).a());
      }
      return j.E(((Integer)paramObject).intValue());
    case 12: 
      return j.P(((Integer)paramObject).intValue());
    case 11: 
      if ((paramObject instanceof g))
      {
        paramn1 = (g)paramObject;
        paramObject = j.c;
        i = paramn1.size();
        return j.P(i) + i;
      }
      paramObject = (byte[])paramObject;
      paramn1 = j.c;
      i = paramObject.length;
      return j.P(i) + i;
    case 10: 
      if ((paramObject instanceof a0)) {
        return j.G((a0)paramObject);
      }
      paramn1 = (o0)paramObject;
      paramObject = j.c;
      i = paramn1.d();
      return j.P(i) + i;
    case 9: 
      paramObject = (o0)paramObject;
      paramn1 = j.c;
      return ((o0)paramObject).d();
    case 8: 
      if ((paramObject instanceof g))
      {
        paramObject = (g)paramObject;
        paramn1 = j.c;
        i = ((g)paramObject).size();
        return j.P(i) + i;
      }
      return j.M((String)paramObject);
    case 7: 
      ((Boolean)paramObject).booleanValue();
      paramn1 = j.c;
      return 1;
    case 6: 
    case 14: 
      ((Integer)paramObject).intValue();
      break;
    case 5: 
    case 15: 
      ((Long)paramObject).longValue();
      break;
    case 4: 
      return j.E(((Integer)paramObject).intValue());
    case 3: 
      return j.R(((Long)paramObject).longValue());
    case 2: 
      return j.R(((Long)paramObject).longValue());
    case 1: 
      ((Float)paramObject).floatValue();
      paramn1 = j.c;
      return 4;
    }
    ((Double)paramObject).doubleValue();
    paramn1 = j.c;
    return 8;
  }
  
  public static int e(a<?> parama, Object paramObject)
  {
    parama.c();
    parama.a();
    parama.b();
    return c(null, 0, paramObject);
  }
  
  public static int g(Map.Entry paramEntry)
  {
    a locala = (a)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    if (locala.d() == o1.r)
    {
      locala.b();
      locala.e();
      boolean bool = localObject instanceof a0;
      ((a)paramEntry.getKey()).a();
      if (bool)
      {
        paramEntry = (a0)localObject;
        i = j.N(1);
        j = j.O(2, 0);
        k = j.N(3);
        return j.G(paramEntry) + k + (j + i * 2);
      }
      paramEntry = (o0)localObject;
      int i = j.N(1);
      int m = j.O(2, 0);
      int k = j.N(3);
      int j = paramEntry.d();
      return j.P(j) + j + k + (m + i * 2);
    }
    return e(locala, localObject);
  }
  
  public static <T extends a<T>> boolean k(Map.Entry<T, Object> paramEntry)
  {
    a locala = (a)paramEntry.getKey();
    if (locala.d() == o1.r)
    {
      locala.b();
      paramEntry = paramEntry.getValue();
      if ((paramEntry instanceof o0))
      {
        if (!((o0)paramEntry).f()) {
          return false;
        }
      }
      else
      {
        if ((paramEntry instanceof a0)) {
          return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    return true;
  }
  
  /* Error */
  public static void o(n1 paramn1, Object paramObject)
  {
    // Byte code:
    //   0: getstatic 205	s0/x:a	Ljava/nio/charset/Charset;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual 209	java/lang/Object:getClass	()Ljava/lang/Class;
    //   8: pop
    //   9: aload_0
    //   10: getfield 211	s0/n1:a	Ls0/o1;
    //   13: invokevirtual 72	java/lang/Enum:ordinal	()I
    //   16: istore_3
    //   17: iconst_0
    //   18: istore 4
    //   20: iload_3
    //   21: tableswitch	default:+51->72, 0:+153->174, 1:+144->165, 2:+135->156, 3:+126->147, 4:+117->138, 5:+108->129, 6:+88->109, 7:+71->92, 8:+54->75
    //   72: goto +108 -> 180
    //   75: aload_1
    //   76: instanceof 120
    //   79: ifne +44 -> 123
    //   82: aload_1
    //   83: instanceof 114
    //   86: ifeq +94 -> 180
    //   89: goto +34 -> 123
    //   92: aload_1
    //   93: instanceof 91
    //   96: ifne +27 -> 123
    //   99: aload_1
    //   100: instanceof 99
    //   103: ifeq +77 -> 180
    //   106: goto +17 -> 123
    //   109: aload_1
    //   110: instanceof 106
    //   113: ifne +10 -> 123
    //   116: aload_1
    //   117: instanceof 45
    //   120: ifeq +60 -> 180
    //   123: iconst_1
    //   124: istore 4
    //   126: goto +54 -> 180
    //   129: aload_1
    //   130: instanceof 124
    //   133: istore 4
    //   135: goto +45 -> 180
    //   138: aload_1
    //   139: instanceof 130
    //   142: istore 4
    //   144: goto +36 -> 180
    //   147: aload_1
    //   148: instanceof 142
    //   151: istore 4
    //   153: goto +27 -> 180
    //   156: aload_1
    //   157: instanceof 136
    //   160: istore 4
    //   162: goto +18 -> 180
    //   165: aload_1
    //   166: instanceof 81
    //   169: istore 4
    //   171: goto +9 -> 180
    //   174: aload_1
    //   175: instanceof 91
    //   178: istore 4
    //   180: iload 4
    //   182: ifeq +4 -> 186
    //   185: return
    //   186: new 195	java/lang/IllegalArgumentException
    //   189: dup
    //   190: ldc -59
    //   192: invokespecial 198	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   195: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	paramn1	n1
    //   0	196	1	paramObject	Object
    //   3	1	2	localCharset	java.nio.charset.Charset
    //   16	5	3	i	int
    //   18	163	4	bool	boolean
  }
  
  public static void p(j paramj, n1 paramn1, int paramInt, Object paramObject)
  {
    if (paramn1 == n1.d)
    {
      paramn1 = (o0)paramObject;
      paramj.k0(paramInt, 3);
      paramn1.g(paramj);
      paramj.k0(paramInt, 4);
    }
    else
    {
      paramj.k0(paramInt, b);
      switch (paramn1.ordinal())
      {
      default: 
        break;
      case 17: 
        long l = ((Long)paramObject).longValue();
        paramj.o0(l >> 63 ^ l << 1);
        break;
      case 16: 
        paramInt = ((Integer)paramObject).intValue();
        paramj.m0(paramInt >> 31 ^ paramInt << 1);
        break;
      case 15: 
        paramj.b0(((Long)paramObject).longValue());
        break;
      case 14: 
        paramj.Z(((Integer)paramObject).intValue());
        break;
      case 13: 
        if ((paramObject instanceof x.a)) {
          paramInt = ((x.a)paramObject).a();
        } else {
          paramInt = ((Integer)paramObject).intValue();
        }
        paramj.d0(paramInt);
        break;
      case 12: 
        paramj.m0(((Integer)paramObject).intValue());
        break;
      case 11: 
        if (!(paramObject instanceof g))
        {
          paramn1 = (byte[])paramObject;
          paramj.V(paramn1, paramn1.length);
        }
        break;
      case 10: 
        paramj.f0((o0)paramObject);
        break;
      case 9: 
        ((o0)paramObject).g(paramj);
        break;
      case 8: 
        if ((paramObject instanceof g)) {
          paramj.X((g)paramObject);
        } else {
          paramj.j0((String)paramObject);
        }
        break;
      case 7: 
        paramj.T((byte)((Boolean)paramObject).booleanValue());
        break;
      case 6: 
        paramj.Z(((Integer)paramObject).intValue());
        break;
      case 5: 
        paramj.b0(((Long)paramObject).longValue());
        break;
      case 4: 
        paramj.d0(((Integer)paramObject).intValue());
        break;
      case 3: 
        paramj.o0(((Long)paramObject).longValue());
        break;
      case 2: 
        paramj.o0(((Long)paramObject).longValue());
        break;
      case 1: 
        paramj.Z(Float.floatToRawIntBits(((Float)paramObject).floatValue()));
        break;
      }
      paramj.b0(Double.doubleToRawLongBits(((Double)paramObject).doubleValue()));
    }
  }
  
  public final r<T> a()
  {
    r localr = new r();
    Map.Entry localEntry;
    for (int i = 0; i < a.e(); i++)
    {
      localEntry = a.d(i);
      localr.n((a)localEntry.getKey(), localEntry.getValue());
    }
    Iterator localIterator = a.f().iterator();
    while (localIterator.hasNext())
    {
      localEntry = (Map.Entry)localIterator.next();
      localr.n((a)localEntry.getKey(), localEntry.getValue());
    }
    c = c;
    return localr;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof r)) {
      return false;
    }
    paramObject = (r)paramObject;
    return a.equals(a);
  }
  
  public final Object f(T paramT)
  {
    Object localObject = a.get(paramT);
    paramT = (T)localObject;
    if ((localObject instanceof a0)) {
      paramT = ((a0)localObject).a(null);
    }
    return paramT;
  }
  
  public final int h()
  {
    int i = 0;
    int j = 0;
    while (i < a.e())
    {
      localObject = a.d(i);
      j += e((a)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
      i++;
    }
    Object localObject = a.f().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      j += e((a)localEntry.getKey(), localEntry.getValue());
    }
    return j;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final boolean i()
  {
    return a.isEmpty();
  }
  
  public final boolean j()
  {
    for (int i = 0; i < a.e(); i++) {
      if (!k(a.d(i))) {
        return false;
      }
    }
    Iterator localIterator = a.f().iterator();
    while (localIterator.hasNext()) {
      if (!k((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final Iterator<Map.Entry<T, Object>> l()
  {
    if (c) {
      return new a0.b(a.entrySet().iterator());
    }
    return a.entrySet().iterator();
  }
  
  public final void m(Map.Entry<T, Object> paramEntry)
  {
    a locala = (a)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    paramEntry = (Map.Entry<T, Object>)localObject;
    if ((localObject instanceof a0)) {
      paramEntry = ((a0)localObject).a(null);
    }
    locala.b();
    if (locala.d() == o1.r)
    {
      localObject = f(locala);
      if (localObject != null)
      {
        localObject = locala.j(((o0)localObject).a(), (o0)paramEntry).h();
        paramEntry = a;
        break label111;
      }
    }
    f1 localf1 = a;
    localObject = b(paramEntry);
    paramEntry = localf1;
    label111:
    paramEntry.i(locala, localObject);
  }
  
  public final void n(T paramT, Object paramObject)
  {
    paramT.b();
    paramT.c();
    o(null, paramObject);
    if ((paramObject instanceof a0)) {
      c = true;
    }
    a.i(paramT, paramObject);
  }
  
  public static abstract interface a<T extends a<T>>
    extends Comparable<T>
  {
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract o1 d();
    
    public abstract void e();
    
    public abstract v.a j(o0.a parama, o0 paramo0);
  }
}

/* Location:
 * Qualified Name:     s0.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
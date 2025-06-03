package B0;

import java.util.Arrays;

public final class h
  implements b
{
  public final boolean a;
  public final int b;
  public final byte[] c;
  public int d;
  public int e;
  public int f;
  public a[] g;
  
  public h(boolean paramBoolean, int paramInt)
  {
    this(paramBoolean, paramInt, 0);
  }
  
  public h(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    int i = 0;
    boolean bool2;
    if (paramInt1 > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.a(bool2);
    if (paramInt2 >= 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    g0.a.a(bool2);
    a = paramBoolean;
    b = paramInt1;
    f = paramInt2;
    g = new a[paramInt2 + 100];
    if (paramInt2 > 0)
    {
      c = new byte[paramInt2 * paramInt1];
      while (i < paramInt2)
      {
        g[i] = new a(c, i * paramInt1);
        i++;
      }
    }
    c = null;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 48	B0/h:d	I
    //   6: aload_0
    //   7: getfield 35	B0/h:b	I
    //   10: invokestatic 54	g0/M:k	(II)I
    //   13: istore_1
    //   14: aload_0
    //   15: getfield 56	B0/h:e	I
    //   18: istore_2
    //   19: iconst_0
    //   20: istore_3
    //   21: iconst_0
    //   22: iload_1
    //   23: iload_2
    //   24: isub
    //   25: invokestatic 61	java/lang/Math:max	(II)I
    //   28: istore_1
    //   29: aload_0
    //   30: getfield 37	B0/h:f	I
    //   33: istore 4
    //   35: iload_1
    //   36: iload 4
    //   38: if_icmplt +6 -> 44
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: iload_1
    //   45: istore_2
    //   46: aload_0
    //   47: getfield 43	B0/h:c	[B
    //   50: ifnull +130 -> 180
    //   53: iload 4
    //   55: iconst_1
    //   56: isub
    //   57: istore_2
    //   58: iload_3
    //   59: iload_2
    //   60: if_icmpgt +99 -> 159
    //   63: aload_0
    //   64: getfield 41	B0/h:g	[LB0/a;
    //   67: iload_3
    //   68: aaload
    //   69: invokestatic 64	g0/a:e	(Ljava/lang/Object;)Ljava/lang/Object;
    //   72: checkcast 39	B0/a
    //   75: astore 5
    //   77: aload 5
    //   79: getfield 66	B0/a:a	[B
    //   82: aload_0
    //   83: getfield 43	B0/h:c	[B
    //   86: if_acmpne +9 -> 95
    //   89: iinc 3 1
    //   92: goto -34 -> 58
    //   95: aload_0
    //   96: getfield 41	B0/h:g	[LB0/a;
    //   99: iload_2
    //   100: aaload
    //   101: invokestatic 64	g0/a:e	(Ljava/lang/Object;)Ljava/lang/Object;
    //   104: checkcast 39	B0/a
    //   107: astore 6
    //   109: aload 6
    //   111: getfield 66	B0/a:a	[B
    //   114: aload_0
    //   115: getfield 43	B0/h:c	[B
    //   118: if_acmpeq +9 -> 127
    //   121: iinc 2 -1
    //   124: goto -66 -> 58
    //   127: aload_0
    //   128: getfield 41	B0/h:g	[LB0/a;
    //   131: astore 7
    //   133: aload 7
    //   135: iload_3
    //   136: aload 6
    //   138: aastore
    //   139: aload 7
    //   141: iload_2
    //   142: aload 5
    //   144: aastore
    //   145: iinc 2 -1
    //   148: iinc 3 1
    //   151: goto -93 -> 58
    //   154: astore 7
    //   156: goto +45 -> 201
    //   159: iload_1
    //   160: iload_3
    //   161: invokestatic 61	java/lang/Math:max	(II)I
    //   164: istore_3
    //   165: aload_0
    //   166: getfield 37	B0/h:f	I
    //   169: istore_1
    //   170: iload_3
    //   171: istore_2
    //   172: iload_3
    //   173: iload_1
    //   174: if_icmplt +6 -> 180
    //   177: aload_0
    //   178: monitorexit
    //   179: return
    //   180: aload_0
    //   181: getfield 41	B0/h:g	[LB0/a;
    //   184: iload_2
    //   185: aload_0
    //   186: getfield 37	B0/h:f	I
    //   189: aconst_null
    //   190: invokestatic 72	java/util/Arrays:fill	([Ljava/lang/Object;IILjava/lang/Object;)V
    //   193: aload_0
    //   194: iload_2
    //   195: putfield 37	B0/h:f	I
    //   198: aload_0
    //   199: monitorexit
    //   200: return
    //   201: aload_0
    //   202: monitorexit
    //   203: aload 7
    //   205: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	206	0	this	h
    //   13	162	1	i	int
    //   18	177	2	j	int
    //   20	155	3	k	int
    //   33	24	4	m	int
    //   75	68	5	locala1	a
    //   107	30	6	locala2	a
    //   131	9	7	arrayOfa	a[]
    //   154	50	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	154	finally
    //   21	35	154	finally
    //   46	53	154	finally
    //   63	89	154	finally
    //   95	121	154	finally
    //   127	133	154	finally
    //   159	170	154	finally
    //   180	198	154	finally
  }
  
  public void b(b.a parama)
  {
    for (;;)
    {
      if (parama != null) {
        try
        {
          a[] arrayOfa = g;
          int i = f;
          f = (i + 1);
          arrayOfa[i] = parama.a();
          e -= 1;
          parama = parama.next();
        }
        finally
        {
          break label63;
        }
      }
    }
    notifyAll();
    return;
    label63:
    throw parama;
  }
  
  public void c(a parama)
  {
    try
    {
      a[] arrayOfa = g;
      int i = f;
      f = (i + 1);
      arrayOfa[i] = parama;
      e -= 1;
      notifyAll();
      return;
    }
    finally {}
  }
  
  public a d()
  {
    try
    {
      e += 1;
      i = f;
      if (i > 0)
      {
        Object localObject1 = g;
        i--;
        f = i;
        localObject1 = (a)g0.a.e(localObject1[i]);
        g[f] = null;
      }
    }
    finally
    {
      break label119;
    }
    a locala = new B0/a;
    locala.<init>(new byte[b], 0);
    int i = e;
    a[] arrayOfa = g;
    Object localObject3 = locala;
    if (i > arrayOfa.length)
    {
      g = ((a[])Arrays.copyOf(arrayOfa, arrayOfa.length * 2));
      localObject3 = locala;
    }
    return (a)localObject3;
    label119:
    throw ((Throwable)localObject3);
  }
  
  public int e()
  {
    return b;
  }
  
  public int f()
  {
    try
    {
      int i = e;
      int j = b;
      return i * j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	B0/h:a	Z
    //   6: ifeq +15 -> 21
    //   9: aload_0
    //   10: iconst_0
    //   11: invokevirtual 96	B0/h:h	(I)V
    //   14: goto +7 -> 21
    //   17: astore_1
    //   18: goto +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	this	h
    //   17	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public void h(int paramInt)
  {
    try
    {
      int i;
      if (paramInt < d) {
        i = 1;
      } else {
        i = 0;
      }
      d = paramInt;
      if (i != 0) {
        a();
      }
    }
    finally
    {
      break label40;
    }
    return;
    label40:
    throw ((Throwable)localObject);
  }
}

/* Location:
 * Qualified Name:     B0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
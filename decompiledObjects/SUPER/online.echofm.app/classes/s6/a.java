package s6;

public abstract class a
  implements b
{
  /* Error */
  public final Object a(c paramc, X5.d paramd)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 8
    //   4: ifeq +36 -> 40
    //   7: aload_2
    //   8: checkcast 8	s6/a$a
    //   11: astore_3
    //   12: aload_3
    //   13: getfield 19	s6/a$a:r	I
    //   16: istore 4
    //   18: iload 4
    //   20: ldc 20
    //   22: iand
    //   23: ifeq +17 -> 40
    //   26: aload_3
    //   27: iload 4
    //   29: ldc 20
    //   31: iadd
    //   32: putfield 19	s6/a$a:r	I
    //   35: aload_3
    //   36: astore_2
    //   37: goto +13 -> 50
    //   40: new 8	s6/a$a
    //   43: dup
    //   44: aload_0
    //   45: aload_2
    //   46: invokespecial 23	s6/a$a:<init>	(Ls6/a;LX5/d;)V
    //   49: astore_2
    //   50: aload_2
    //   51: getfield 27	s6/a$a:p	Ljava/lang/Object;
    //   54: astore 5
    //   56: invokestatic 33	Y5/b:c	()Ljava/lang/Object;
    //   59: astore_3
    //   60: aload_2
    //   61: getfield 19	s6/a$a:r	I
    //   64: istore 4
    //   66: iload 4
    //   68: ifeq +39 -> 107
    //   71: iload 4
    //   73: iconst_1
    //   74: if_icmpne +23 -> 97
    //   77: aload_2
    //   78: getfield 36	s6/a$a:o	Ljava/lang/Object;
    //   81: checkcast 38	t6/i
    //   84: astore_1
    //   85: aload 5
    //   87: invokestatic 44	V5/o:b	(Ljava/lang/Object;)V
    //   90: goto +61 -> 151
    //   93: astore_2
    //   94: goto +66 -> 160
    //   97: new 46	java/lang/IllegalStateException
    //   100: dup
    //   101: ldc 48
    //   103: invokespecial 51	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   106: athrow
    //   107: aload 5
    //   109: invokestatic 44	V5/o:b	(Ljava/lang/Object;)V
    //   112: new 38	t6/i
    //   115: dup
    //   116: aload_1
    //   117: aload_2
    //   118: invokeinterface 57 1 0
    //   123: invokespecial 60	t6/i:<init>	(Ls6/c;LX5/g;)V
    //   126: astore_1
    //   127: aload_2
    //   128: aload_1
    //   129: putfield 36	s6/a$a:o	Ljava/lang/Object;
    //   132: aload_2
    //   133: iconst_1
    //   134: putfield 19	s6/a$a:r	I
    //   137: aload_0
    //   138: aload_1
    //   139: aload_2
    //   140: invokevirtual 62	s6/a:b	(Ls6/c;LX5/d;)Ljava/lang/Object;
    //   143: astore_2
    //   144: aload_2
    //   145: aload_3
    //   146: if_acmpne +5 -> 151
    //   149: aload_3
    //   150: areturn
    //   151: aload_1
    //   152: invokevirtual 65	t6/i:releaseIntercepted	()V
    //   155: getstatic 70	V5/t:a	LV5/t;
    //   158: areturn
    //   159: astore_2
    //   160: aload_1
    //   161: invokevirtual 65	t6/i:releaseIntercepted	()V
    //   164: aload_2
    //   165: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	a
    //   0	166	1	paramc	c
    //   0	166	2	paramd	X5.d
    //   11	139	3	localObject1	Object
    //   16	59	4	i	int
    //   54	54	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   85	90	93	finally
    //   127	144	159	finally
  }
  
  public abstract Object b(c paramc, X5.d paramd);
  
  public static final class a
    extends Z5.d
  {
    public Object o;
    public int r;
    
    public a(a parama, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      p = paramObject;
      r |= 0x80000000;
      return q.a(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     s6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
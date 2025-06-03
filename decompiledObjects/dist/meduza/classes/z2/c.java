package z2;

public final class c<V>
  extends a<V>
{
  public final boolean i(V paramV)
  {
    Object localObject = paramV;
    if (paramV == null) {
      localObject = a.o;
    }
    boolean bool;
    if (a.f.b(this, null, localObject))
    {
      a.b(this);
      bool = true;
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final boolean j(Throwable paramThrowable)
  {
    paramThrowable.getClass();
    paramThrowable = new a.c(paramThrowable);
    boolean bool;
    if (a.f.b(this, null, paramThrowable))
    {
      a.b(this);
      bool = true;
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public final boolean k(s7.e<? extends V> parame)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 39	java/lang/Object:getClass	()Ljava/lang/Class;
    //   4: pop
    //   5: aload_0
    //   6: getfield 49	z2/a:a	Ljava/lang/Object;
    //   9: astore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: aload_2
    //   13: astore 4
    //   15: aload_2
    //   16: ifnonnull +118 -> 134
    //   19: aload_1
    //   20: invokeinterface 55 1 0
    //   25: ifeq +33 -> 58
    //   28: aload_1
    //   29: invokestatic 59	z2/a:e	(Ls7/e;)Ljava/lang/Object;
    //   32: astore_1
    //   33: iload_3
    //   34: istore 5
    //   36: getstatic 20	z2/a:f	Lz2/a$a;
    //   39: aload_0
    //   40: aconst_null
    //   41: aload_1
    //   42: invokevirtual 26	z2/a$a:b	(Lz2/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   45: ifeq +118 -> 163
    //   48: aload_0
    //   49: invokestatic 29	z2/a:b	(Lz2/a;)V
    //   52: iconst_1
    //   53: istore 5
    //   55: goto +108 -> 163
    //   58: new 61	z2/a$f
    //   61: dup
    //   62: aload_0
    //   63: aload_1
    //   64: invokespecial 64	z2/a$f:<init>	(Lz2/a;Ls7/e;)V
    //   67: astore 4
    //   69: getstatic 20	z2/a:f	Lz2/a$a;
    //   72: aload_0
    //   73: aconst_null
    //   74: aload 4
    //   76: invokevirtual 26	z2/a$a:b	(Lz2/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   79: ifeq +49 -> 128
    //   82: aload_1
    //   83: aload 4
    //   85: getstatic 69	z2/b:a	Lz2/b;
    //   88: invokeinterface 74 3 0
    //   93: goto -41 -> 52
    //   96: astore_2
    //   97: new 41	z2/a$c
    //   100: astore_1
    //   101: aload_1
    //   102: aload_2
    //   103: invokespecial 44	z2/a$c:<init>	(Ljava/lang/Throwable;)V
    //   106: goto +8 -> 114
    //   109: astore_1
    //   110: getstatic 77	z2/a$c:b	Lz2/a$c;
    //   113: astore_1
    //   114: getstatic 20	z2/a:f	Lz2/a$a;
    //   117: aload_0
    //   118: aload 4
    //   120: aload_1
    //   121: invokevirtual 26	z2/a$a:b	(Lz2/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    //   124: pop
    //   125: goto -73 -> 52
    //   128: aload_0
    //   129: getfield 49	z2/a:a	Ljava/lang/Object;
    //   132: astore 4
    //   134: iload_3
    //   135: istore 5
    //   137: aload 4
    //   139: instanceof 79
    //   142: ifeq +21 -> 163
    //   145: aload_1
    //   146: aload 4
    //   148: checkcast 79	z2/a$b
    //   151: getfield 82	z2/a$b:a	Z
    //   154: invokeinterface 86 2 0
    //   159: pop
    //   160: iload_3
    //   161: istore 5
    //   163: iload 5
    //   165: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	c
    //   0	166	1	parame	s7.e<? extends V>
    //   9	7	2	localObject1	Object
    //   96	7	2	localThrowable	Throwable
    //   11	150	3	bool1	boolean
    //   13	134	4	localObject2	Object
    //   34	130	5	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   82	93	96	finally
    //   97	106	109	finally
  }
}

/* Location:
 * Qualified Name:     z2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
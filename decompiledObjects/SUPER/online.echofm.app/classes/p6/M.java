package p6;

public abstract class M
{
  public static final String a(Object paramObject)
  {
    return paramObject.getClass().getSimpleName();
  }
  
  public static final String b(Object paramObject)
  {
    return Integer.toHexString(System.identityHashCode(paramObject));
  }
  
  /* Error */
  public static final String c(X5.d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: instanceof 34
    //   4: ifeq +11 -> 15
    //   7: aload_0
    //   8: invokevirtual 37	java/lang/Object:toString	()Ljava/lang/String;
    //   11: astore_0
    //   12: goto +117 -> 129
    //   15: getstatic 43	V5/n:o	LV5/n$a;
    //   18: astore_1
    //   19: new 45	java/lang/StringBuilder
    //   22: astore_1
    //   23: aload_1
    //   24: invokespecial 49	java/lang/StringBuilder:<init>	()V
    //   27: aload_1
    //   28: aload_0
    //   29: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_1
    //   34: bipush 64
    //   36: invokevirtual 56	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_1
    //   41: aload_0
    //   42: invokestatic 58	p6/M:b	(Ljava/lang/Object;)Ljava/lang/String;
    //   45: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload_1
    //   50: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: invokestatic 65	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   56: astore_1
    //   57: goto +16 -> 73
    //   60: astore_1
    //   61: getstatic 43	V5/n:o	LV5/n$a;
    //   64: astore_2
    //   65: aload_1
    //   66: invokestatic 70	V5/o:a	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   69: invokestatic 65	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   72: astore_1
    //   73: aload_1
    //   74: invokestatic 73	V5/n:b	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   77: ifnonnull +6 -> 83
    //   80: goto +44 -> 124
    //   83: new 45	java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial 49	java/lang/StringBuilder:<init>	()V
    //   90: astore_1
    //   91: aload_1
    //   92: aload_0
    //   93: invokevirtual 10	java/lang/Object:getClass	()Ljava/lang/Class;
    //   96: invokevirtual 76	java/lang/Class:getName	()Ljava/lang/String;
    //   99: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_1
    //   104: bipush 64
    //   106: invokevirtual 56	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: aload_1
    //   111: aload_0
    //   112: invokestatic 58	p6/M:b	(Ljava/lang/Object;)Ljava/lang/String;
    //   115: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload_1
    //   120: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: astore_1
    //   124: aload_1
    //   125: checkcast 78	java/lang/String
    //   128: astore_0
    //   129: aload_0
    //   130: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	paramd	X5.d
    //   18	39	1	localObject1	Object
    //   60	6	1	localThrowable	Throwable
    //   72	53	1	localObject2	Object
    //   64	1	2	locala	V5.n.a
    // Exception table:
    //   from	to	target	type
    //   15	57	60	finally
  }
}

/* Location:
 * Qualified Name:     p6.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
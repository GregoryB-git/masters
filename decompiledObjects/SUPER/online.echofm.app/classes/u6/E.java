package u6;

import a.a;

public abstract class E
{
  public static final StackTraceElement a = new a().a();
  public static final String b;
  public static final String c;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: new 13	a/a
    //   3: dup
    //   4: invokespecial 16	a/a:<init>	()V
    //   7: invokevirtual 19	a/a:a	()Ljava/lang/StackTraceElement;
    //   10: putstatic 21	u6/E:a	Ljava/lang/StackTraceElement;
    //   13: getstatic 27	V5/n:o	LV5/n$a;
    //   16: astore_0
    //   17: ldc 29
    //   19: invokevirtual 35	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   22: invokestatic 38	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   25: astore_0
    //   26: goto +16 -> 42
    //   29: astore_1
    //   30: getstatic 27	V5/n:o	LV5/n$a;
    //   33: astore_0
    //   34: aload_1
    //   35: invokestatic 43	V5/o:a	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   38: invokestatic 38	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   41: astore_0
    //   42: aload_0
    //   43: invokestatic 46	V5/n:b	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   46: ifnonnull +6 -> 52
    //   49: goto +6 -> 55
    //   52: ldc 48
    //   54: astore_0
    //   55: aload_0
    //   56: checkcast 50	java/lang/String
    //   59: putstatic 52	u6/E:b	Ljava/lang/String;
    //   62: ldc 2
    //   64: invokevirtual 35	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   67: invokestatic 38	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   70: astore_0
    //   71: goto +16 -> 87
    //   74: astore_1
    //   75: getstatic 27	V5/n:o	LV5/n$a;
    //   78: astore_0
    //   79: aload_1
    //   80: invokestatic 43	V5/o:a	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   83: invokestatic 38	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   86: astore_0
    //   87: aload_0
    //   88: invokestatic 46	V5/n:b	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   91: ifnonnull +6 -> 97
    //   94: goto +6 -> 100
    //   97: ldc 54
    //   99: astore_0
    //   100: aload_0
    //   101: checkcast 50	java/lang/String
    //   104: putstatic 56	u6/E:c	Ljava/lang/String;
    //   107: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   16	85	0	localObject	Object
    //   29	6	1	localThrowable1	Throwable
    //   74	6	1	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   13	26	29	finally
    //   62	71	74	finally
  }
  
  public static final Throwable a(Throwable paramThrowable)
  {
    return paramThrowable;
  }
}

/* Location:
 * Qualified Name:     u6.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
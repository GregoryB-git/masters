package u6;

public abstract class h
{
  /* Error */
  public static final void a(X5.g paramg, Throwable paramThrowable)
  {
    // Byte code:
    //   0: invokestatic 11	u6/g:a	()Ljava/util/Collection;
    //   3: invokeinterface 17 1 0
    //   8: astore_2
    //   9: aload_2
    //   10: invokeinterface 23 1 0
    //   15: ifeq +36 -> 51
    //   18: aload_2
    //   19: invokeinterface 27 1 0
    //   24: checkcast 29	p6/G
    //   27: astore_3
    //   28: aload_3
    //   29: aload_0
    //   30: aload_1
    //   31: invokeinterface 32 3 0
    //   36: goto -27 -> 9
    //   39: astore_3
    //   40: aload_1
    //   41: aload_3
    //   42: invokestatic 38	p6/H:b	(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   45: invokestatic 41	u6/g:b	(Ljava/lang/Throwable;)V
    //   48: goto -39 -> 9
    //   51: new 43	u6/i
    //   54: astore_2
    //   55: aload_2
    //   56: aload_0
    //   57: invokespecial 47	u6/i:<init>	(LX5/g;)V
    //   60: aload_1
    //   61: aload_2
    //   62: invokestatic 52	V5/a:a	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   65: aload_1
    //   66: invokestatic 41	u6/g:b	(Ljava/lang/Throwable;)V
    //   69: return
    //   70: astore_0
    //   71: goto -6 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	paramg	X5.g
    //   0	74	1	paramThrowable	Throwable
    //   8	54	2	localObject	Object
    //   27	2	3	localG	p6.G
    //   39	3	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   28	36	39	finally
    //   51	65	70	finally
  }
}

/* Location:
 * Qualified Name:     u6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package e6;

public abstract class b
{
  /* Error */
  public static final void a(java.io.Closeable paramCloseable, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +31 -> 32
    //   4: aload_1
    //   5: ifnonnull +12 -> 17
    //   8: aload_0
    //   9: invokeinterface 12 1 0
    //   14: goto +18 -> 32
    //   17: aload_0
    //   18: invokeinterface 12 1 0
    //   23: goto +9 -> 32
    //   26: astore_0
    //   27: aload_1
    //   28: aload_0
    //   29: invokestatic 17	V5/a:a	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   32: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	paramCloseable	java.io.Closeable
    //   0	33	1	paramThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   17	23	26	finally
  }
}

/* Location:
 * Qualified Name:     e6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package b3;

public abstract class g
{
  /* Error */
  public static Object a(java.util.concurrent.Future paramFuture)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: invokeinterface 14 1 0
    //   8: astore_2
    //   9: iload_1
    //   10: ifeq +9 -> 19
    //   13: invokestatic 20	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   16: invokevirtual 24	java/lang/Thread:interrupt	()V
    //   19: aload_2
    //   20: areturn
    //   21: astore_0
    //   22: iload_1
    //   23: ifeq +9 -> 32
    //   26: invokestatic 20	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   29: invokevirtual 24	java/lang/Thread:interrupt	()V
    //   32: aload_0
    //   33: athrow
    //   34: astore_2
    //   35: iconst_1
    //   36: istore_1
    //   37: goto -35 -> 2
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	paramFuture	java.util.concurrent.Future
    //   1	36	1	i	int
    //   8	12	2	localObject	Object
    //   34	1	2	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   2	9	21	finally
    //   2	9	34	java/lang/InterruptedException
  }
}

/* Location:
 * Qualified Name:     b3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
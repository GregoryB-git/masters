package u6;

import V5.e;
import p6.B0;

public abstract class v
{
  public static final w a(Throwable paramThrowable, String paramString)
  {
    if (paramThrowable != null) {
      throw paramThrowable;
    }
    d();
    throw new e();
  }
  
  public static final boolean c(B0 paramB0)
  {
    return paramB0.H() instanceof w;
  }
  
  public static final Void d()
  {
    throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
  }
  
  /* Error */
  public static final B0 e(t paramt, java.util.List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface 46 2 0
    //   7: astore_1
    //   8: aload_1
    //   9: astore_0
    //   10: goto +15 -> 25
    //   13: astore_1
    //   14: aload_1
    //   15: aload_0
    //   16: invokeinterface 49 1 0
    //   21: invokestatic 22	u6/v:a	(Ljava/lang/Throwable;Ljava/lang/String;)Lu6/w;
    //   24: astore_0
    //   25: aload_0
    //   26: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	paramt	t
    //   0	27	1	paramList	java.util.List
    // Exception table:
    //   from	to	target	type
    //   0	8	13	finally
  }
}

/* Location:
 * Qualified Name:     u6.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
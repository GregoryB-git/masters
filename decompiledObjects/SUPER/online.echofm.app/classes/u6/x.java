package u6;

import X5.g;
import p6.H;

public abstract class x
{
  public static final g6.l a(g6.l paraml, final Object paramObject, final g paramg)
  {
    return new a(paraml, paramObject, paramg);
  }
  
  public static final void b(g6.l paraml, Object paramObject, g paramg)
  {
    paraml = c(paraml, paramObject, null);
    if (paraml != null) {
      H.a(paramg, paraml);
    }
  }
  
  /* Error */
  public static final O c(g6.l paraml, Object paramObject, O paramO)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface 29 2 0
    //   7: pop
    //   8: goto +21 -> 29
    //   11: astore_0
    //   12: aload_2
    //   13: ifnull +18 -> 31
    //   16: aload_2
    //   17: invokevirtual 35	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   20: aload_0
    //   21: if_acmpeq +10 -> 31
    //   24: aload_2
    //   25: aload_0
    //   26: invokestatic 40	V5/a:a	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   29: aload_2
    //   30: areturn
    //   31: new 42	java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial 45	java/lang/StringBuilder:<init>	()V
    //   38: astore_2
    //   39: aload_2
    //   40: ldc 47
    //   42: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_2
    //   47: aload_1
    //   48: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: new 56	u6/O
    //   55: dup
    //   56: aload_2
    //   57: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: aload_0
    //   61: invokespecial 63	u6/O:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   64: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	paraml	g6.l
    //   0	65	1	paramObject	Object
    //   0	65	2	paramO	O
    // Exception table:
    //   from	to	target	type
    //   0	8	11	finally
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public a(g6.l paraml, Object paramObject, g paramg)
    {
      super();
    }
    
    public final void a(Throwable paramThrowable)
    {
      x.b(o, paramObject, paramg);
    }
  }
}

/* Location:
 * Qualified Name:     u6.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
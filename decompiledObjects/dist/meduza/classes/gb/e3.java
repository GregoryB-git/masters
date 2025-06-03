package gb;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public final class e3
  implements Executor
{
  public static final Logger c = Logger.getLogger(e3.class.getName());
  public boolean a;
  public ArrayDeque<Runnable> b;
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	gb/e3:b	Ljava/util/ArrayDeque;
    //   4: invokevirtual 41	java/util/ArrayDeque:poll	()Ljava/lang/Object;
    //   7: checkcast 43	java/lang/Runnable
    //   10: astore_1
    //   11: aload_1
    //   12: ifnull +61 -> 73
    //   15: aload_1
    //   16: invokeinterface 46 1 0
    //   21: goto -21 -> 0
    //   24: astore_2
    //   25: getstatic 29	gb/e3:c	Ljava/util/logging/Logger;
    //   28: astore_3
    //   29: getstatic 52	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   32: astore 4
    //   34: new 54	java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   41: astore 5
    //   43: aload 5
    //   45: ldc 57
    //   47: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: aload 5
    //   53: aload_1
    //   54: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload_3
    //   59: aload 4
    //   61: aload 5
    //   63: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: aload_2
    //   67: invokevirtual 71	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   70: goto -70 -> 0
    //   73: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	e3
    //   10	44	1	localRunnable	Runnable
    //   24	43	2	localThrowable	Throwable
    //   28	31	3	localLogger	Logger
    //   32	28	4	localLevel	java.util.logging.Level
    //   41	21	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   15	21	24	finally
  }
  
  /* Error */
  public final void execute(Runnable paramRunnable)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 75
    //   3: invokestatic 81	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   6: aload_0
    //   7: getfield 83	gb/e3:a	Z
    //   10: ifne +109 -> 119
    //   13: aload_0
    //   14: iconst_1
    //   15: putfield 83	gb/e3:a	Z
    //   18: aload_1
    //   19: invokeinterface 46 1 0
    //   24: aload_0
    //   25: getfield 35	gb/e3:b	Ljava/util/ArrayDeque;
    //   28: ifnull +64 -> 92
    //   31: goto +57 -> 88
    //   34: astore_2
    //   35: getstatic 29	gb/e3:c	Ljava/util/logging/Logger;
    //   38: astore_3
    //   39: getstatic 52	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   42: astore 4
    //   44: new 54	java/lang/StringBuilder
    //   47: astore 5
    //   49: aload 5
    //   51: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   54: aload 5
    //   56: ldc 57
    //   58: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload 5
    //   64: aload_1
    //   65: invokevirtual 64	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_3
    //   70: aload 4
    //   72: aload 5
    //   74: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: aload_2
    //   78: invokevirtual 71	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   81: aload_0
    //   82: getfield 35	gb/e3:b	Ljava/util/ArrayDeque;
    //   85: ifnull +7 -> 92
    //   88: aload_0
    //   89: invokevirtual 85	gb/e3:a	()V
    //   92: aload_0
    //   93: iconst_0
    //   94: putfield 83	gb/e3:a	Z
    //   97: goto +50 -> 147
    //   100: astore_1
    //   101: aload_0
    //   102: getfield 35	gb/e3:b	Ljava/util/ArrayDeque;
    //   105: ifnull +7 -> 112
    //   108: aload_0
    //   109: invokevirtual 85	gb/e3:a	()V
    //   112: aload_0
    //   113: iconst_0
    //   114: putfield 83	gb/e3:a	Z
    //   117: aload_1
    //   118: athrow
    //   119: aload_0
    //   120: getfield 35	gb/e3:b	Ljava/util/ArrayDeque;
    //   123: ifnonnull +15 -> 138
    //   126: aload_0
    //   127: new 37	java/util/ArrayDeque
    //   130: dup
    //   131: iconst_4
    //   132: invokespecial 88	java/util/ArrayDeque:<init>	(I)V
    //   135: putfield 35	gb/e3:b	Ljava/util/ArrayDeque;
    //   138: aload_0
    //   139: getfield 35	gb/e3:b	Ljava/util/ArrayDeque;
    //   142: aload_1
    //   143: invokevirtual 92	java/util/ArrayDeque:add	(Ljava/lang/Object;)Z
    //   146: pop
    //   147: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	e3
    //   0	148	1	paramRunnable	Runnable
    //   34	44	2	localThrowable	Throwable
    //   38	32	3	localLogger	Logger
    //   42	29	4	localLevel	java.util.logging.Level
    //   47	26	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   18	24	34	finally
    //   35	81	100	finally
  }
}

/* Location:
 * Qualified Name:     gb.e3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
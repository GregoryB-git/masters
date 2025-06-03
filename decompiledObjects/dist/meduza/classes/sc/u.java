package sc;

public final class u
{
  /* Error */
  static
  {
    // Byte code:
    //   0: new 11	java/lang/Exception
    //   3: dup
    //   4: invokespecial 14	java/lang/Exception:<init>	()V
    //   7: astore_0
    //   8: ldc 16
    //   10: invokevirtual 22	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   13: astore_1
    //   14: aload_0
    //   15: invokevirtual 28	java/lang/Throwable:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   18: iconst_0
    //   19: aaload
    //   20: astore_2
    //   21: new 30	java/lang/StringBuilder
    //   24: dup
    //   25: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   28: astore_0
    //   29: aload_0
    //   30: ldc 33
    //   32: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_0
    //   37: bipush 46
    //   39: invokevirtual 40	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual 37	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: new 42	java/lang/StackTraceElement
    //   52: dup
    //   53: aload_0
    //   54: invokevirtual 45	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: ldc 47
    //   59: aload_2
    //   60: invokevirtual 50	java/lang/StackTraceElement:getFileName	()Ljava/lang/String;
    //   63: aload_2
    //   64: invokevirtual 54	java/lang/StackTraceElement:getLineNumber	()I
    //   67: invokespecial 57	java/lang/StackTraceElement:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   70: pop
    //   71: ldc 59
    //   73: invokestatic 63	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   76: invokevirtual 66	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   79: astore_1
    //   80: goto +9 -> 89
    //   83: astore_1
    //   84: aload_1
    //   85: invokestatic 71	rb/f:a	(Ljava/lang/Throwable;)Lrb/e$a;
    //   88: astore_1
    //   89: aload_1
    //   90: invokestatic 76	rb/e:a	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   93: ifnonnull +6 -> 99
    //   96: goto +6 -> 102
    //   99: ldc 78
    //   101: astore_1
    //   102: aload_1
    //   103: checkcast 80	java/lang/String
    //   106: astore_1
    //   107: ldc 2
    //   109: invokevirtual 66	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   112: astore_1
    //   113: goto +9 -> 122
    //   116: astore_1
    //   117: aload_1
    //   118: invokestatic 71	rb/f:a	(Ljava/lang/Throwable;)Lrb/e$a;
    //   121: astore_1
    //   122: aload_1
    //   123: invokestatic 76	rb/e:a	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   126: ifnonnull +6 -> 132
    //   129: goto +6 -> 135
    //   132: ldc 82
    //   134: astore_1
    //   135: aload_1
    //   136: checkcast 80	java/lang/String
    //   139: astore_1
    //   140: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   7	47	0	localObject1	Object
    //   13	67	1	str	String
    //   83	2	1	localThrowable1	Throwable
    //   88	25	1	localObject2	Object
    //   116	2	1	localThrowable2	Throwable
    //   121	19	1	localObject3	Object
    //   20	44	2	localStackTraceElement	StackTraceElement
    // Exception table:
    //   from	to	target	type
    //   71	80	83	finally
    //   107	113	116	finally
  }
}

/* Location:
 * Qualified Name:     sc.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
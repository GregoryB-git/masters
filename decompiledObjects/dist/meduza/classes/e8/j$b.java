package e8;

import f;
import g;

public final class j$b
  implements Runnable
{
  public Runnable a;
  
  public j$b(j paramj) {}
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: iload_2
    //   5: istore_3
    //   6: aload_0
    //   7: getfield 16	e8/j$b:b	Le8/j;
    //   10: getfield 25	e8/j:b	Ljava/util/ArrayDeque;
    //   13: astore 4
    //   15: iload_2
    //   16: istore_3
    //   17: aload 4
    //   19: monitorenter
    //   20: iload_1
    //   21: istore 5
    //   23: iload_1
    //   24: ifne +53 -> 77
    //   27: aload_0
    //   28: getfield 16	e8/j$b:b	Le8/j;
    //   31: astore 6
    //   33: aload 6
    //   35: getfield 29	e8/j:c	I
    //   38: iconst_4
    //   39: if_icmpne +17 -> 56
    //   42: aload 4
    //   44: monitorexit
    //   45: iload_2
    //   46: ifeq +9 -> 55
    //   49: invokestatic 35	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   52: invokevirtual 38	java/lang/Thread:interrupt	()V
    //   55: return
    //   56: aload 6
    //   58: aload 6
    //   60: getfield 42	e8/j:d	J
    //   63: lconst_1
    //   64: ladd
    //   65: putfield 42	e8/j:d	J
    //   68: aload 6
    //   70: iconst_4
    //   71: putfield 29	e8/j:c	I
    //   74: iconst_1
    //   75: istore 5
    //   77: aload_0
    //   78: getfield 16	e8/j$b:b	Le8/j;
    //   81: getfield 25	e8/j:b	Ljava/util/ArrayDeque;
    //   84: invokevirtual 48	java/util/ArrayDeque:poll	()Ljava/lang/Object;
    //   87: checkcast 6	java/lang/Runnable
    //   90: astore 6
    //   92: aload_0
    //   93: aload 6
    //   95: putfield 50	e8/j$b:a	Ljava/lang/Runnable;
    //   98: aload 6
    //   100: ifnonnull +25 -> 125
    //   103: aload_0
    //   104: getfield 16	e8/j$b:b	Le8/j;
    //   107: iconst_1
    //   108: putfield 29	e8/j:c	I
    //   111: aload 4
    //   113: monitorexit
    //   114: iload_2
    //   115: ifeq +9 -> 124
    //   118: invokestatic 35	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   121: invokevirtual 38	java/lang/Thread:interrupt	()V
    //   124: return
    //   125: aload 4
    //   127: monitorexit
    //   128: iload_2
    //   129: istore_3
    //   130: invokestatic 54	java/lang/Thread:interrupted	()Z
    //   133: istore 7
    //   135: iload_2
    //   136: iload 7
    //   138: ior
    //   139: istore_2
    //   140: aload_0
    //   141: getfield 50	e8/j$b:a	Ljava/lang/Runnable;
    //   144: invokeinterface 57 1 0
    //   149: goto +62 -> 211
    //   152: astore 4
    //   154: goto +70 -> 224
    //   157: astore 6
    //   159: getstatic 61	e8/j:f	Ljava/util/logging/Logger;
    //   162: astore 8
    //   164: getstatic 67	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   167: astore 4
    //   169: new 69	java/lang/StringBuilder
    //   172: astore 9
    //   174: aload 9
    //   176: invokespecial 70	java/lang/StringBuilder:<init>	()V
    //   179: aload 9
    //   181: ldc 72
    //   183: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload 9
    //   189: aload_0
    //   190: getfield 50	e8/j$b:a	Ljava/lang/Runnable;
    //   193: invokevirtual 79	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   196: pop
    //   197: aload 8
    //   199: aload 4
    //   201: aload 9
    //   203: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: aload 6
    //   208: invokevirtual 89	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   211: iload_2
    //   212: istore_3
    //   213: aload_0
    //   214: aconst_null
    //   215: putfield 50	e8/j$b:a	Ljava/lang/Runnable;
    //   218: iload 5
    //   220: istore_1
    //   221: goto -217 -> 4
    //   224: iload_2
    //   225: istore_3
    //   226: aload_0
    //   227: aconst_null
    //   228: putfield 50	e8/j$b:a	Ljava/lang/Runnable;
    //   231: iload_2
    //   232: istore_3
    //   233: aload 4
    //   235: athrow
    //   236: astore 6
    //   238: aload 4
    //   240: monitorexit
    //   241: iload_2
    //   242: istore_3
    //   243: aload 6
    //   245: athrow
    //   246: astore 4
    //   248: iload_3
    //   249: ifeq +9 -> 258
    //   252: invokestatic 35	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   255: invokevirtual 38	java/lang/Thread:interrupt	()V
    //   258: aload 4
    //   260: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	this	b
    //   1	220	1	i	int
    //   3	239	2	bool1	boolean
    //   5	244	3	j	int
    //   13	113	4	localArrayDeque	java.util.ArrayDeque
    //   152	1	4	localObject1	Object
    //   167	72	4	localLevel	java.util.logging.Level
    //   246	13	4	localObject2	Object
    //   21	198	5	k	int
    //   31	68	6	localObject3	Object
    //   157	50	6	localRuntimeException	RuntimeException
    //   236	8	6	localObject4	Object
    //   133	6	7	bool2	boolean
    //   162	36	8	localLogger	java.util.logging.Logger
    //   172	30	9	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   140	149	152	finally
    //   159	211	152	finally
    //   140	149	157	java/lang/RuntimeException
    //   27	45	236	finally
    //   56	74	236	finally
    //   77	98	236	finally
    //   103	114	236	finally
    //   125	128	236	finally
    //   238	241	236	finally
    //   6	15	246	finally
    //   17	20	246	finally
    //   130	135	246	finally
    //   213	218	246	finally
    //   226	231	246	finally
    //   233	236	246	finally
    //   243	246	246	finally
  }
  
  public final void run()
  {
    try
    {
      a();
      return;
    }
    catch (Error localError)
    {
      synchronized (b.b)
      {
        b.c = 1;
        throw localError;
      }
    }
  }
  
  public final String toString()
  {
    Object localObject = a;
    if (localObject != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SequentialExecutorWorker{running=");
      localStringBuilder.append(localObject);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    localObject = f.l("SequentialExecutorWorker{state=");
    ((StringBuilder)localObject).append(g.m(b.c));
    ((StringBuilder)localObject).append("}");
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     e8.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
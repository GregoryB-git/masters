package I2;

import android.util.Log;

public abstract class d
{
  public static volatile ClassLoader a;
  public static volatile Thread b;
  
  public static ClassLoader a()
  {
    try
    {
      if (a == null) {
        a = b();
      }
    }
    finally
    {
      break label31;
    }
    ClassLoader localClassLoader = a;
    return localClassLoader;
    label31:
    throw localClassLoader;
  }
  
  public static ClassLoader b()
  {
    label109:
    try
    {
      localObject1 = b;
      Object localObject2 = null;
      if (localObject1 == null)
      {
        b = c();
        localObject1 = b;
        if (localObject1 == null) {
          return null;
        }
      }
    }
    finally
    {
      Object localObject1;
      break label109;
      try
      {
        synchronized (b)
        {
          localObject1 = b.getContextClassLoader();
          Object localObject4 = localObject1;
        }
      }
      catch (SecurityException localSecurityException)
      {
        String str = localSecurityException.getMessage();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Failed to get thread context classloader ");
        localStringBuilder.append(str);
        Log.w("DynamiteLoaderV2CL", localStringBuilder.toString());
        return localClassLoader;
      }
      throw localClassLoader;
    }
  }
  
  /* Error */
  public static Thread c()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 63	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   6: invokevirtual 66	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   9: invokevirtual 70	java/lang/Thread:getThreadGroup	()Ljava/lang/ThreadGroup;
    //   12: astore_0
    //   13: aload_0
    //   14: ifnonnull +8 -> 22
    //   17: ldc 2
    //   19: monitorexit
    //   20: aconst_null
    //   21: areturn
    //   22: ldc 72
    //   24: monitorenter
    //   25: aload_0
    //   26: invokevirtual 78	java/lang/ThreadGroup:activeGroupCount	()I
    //   29: istore_1
    //   30: iload_1
    //   31: anewarray 74	java/lang/ThreadGroup
    //   34: astore_2
    //   35: aload_0
    //   36: aload_2
    //   37: invokevirtual 82	java/lang/ThreadGroup:enumerate	([Ljava/lang/ThreadGroup;)I
    //   40: pop
    //   41: iconst_0
    //   42: istore_3
    //   43: iconst_0
    //   44: istore 4
    //   46: iload 4
    //   48: iload_1
    //   49: if_icmpge +40 -> 89
    //   52: aload_2
    //   53: iload 4
    //   55: aaload
    //   56: astore 5
    //   58: ldc 84
    //   60: aload 5
    //   62: invokevirtual 87	java/lang/ThreadGroup:getName	()Ljava/lang/String;
    //   65: invokevirtual 93	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   68: ifeq +6 -> 74
    //   71: goto +21 -> 92
    //   74: iinc 4 1
    //   77: goto -31 -> 46
    //   80: astore 5
    //   82: goto +187 -> 269
    //   85: astore_2
    //   86: goto +133 -> 219
    //   89: aconst_null
    //   90: astore 5
    //   92: aload 5
    //   94: astore_2
    //   95: aload 5
    //   97: ifnonnull +14 -> 111
    //   100: new 74	java/lang/ThreadGroup
    //   103: astore_2
    //   104: aload_2
    //   105: aload_0
    //   106: ldc 84
    //   108: invokespecial 96	java/lang/ThreadGroup:<init>	(Ljava/lang/ThreadGroup;Ljava/lang/String;)V
    //   111: aload_2
    //   112: invokevirtual 99	java/lang/ThreadGroup:activeCount	()I
    //   115: istore_1
    //   116: iload_1
    //   117: anewarray 26	java/lang/Thread
    //   120: astore_0
    //   121: aload_2
    //   122: aload_0
    //   123: invokevirtual 102	java/lang/ThreadGroup:enumerate	([Ljava/lang/Thread;)I
    //   126: pop
    //   127: iload_3
    //   128: istore 4
    //   130: iload 4
    //   132: iload_1
    //   133: if_icmpge +35 -> 168
    //   136: aload_0
    //   137: iload 4
    //   139: aaload
    //   140: astore 5
    //   142: ldc 104
    //   144: aload 5
    //   146: invokevirtual 105	java/lang/Thread:getName	()Ljava/lang/String;
    //   149: invokevirtual 93	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   152: istore 6
    //   154: iload 6
    //   156: ifeq +6 -> 162
    //   159: goto +12 -> 171
    //   162: iinc 4 1
    //   165: goto -35 -> 130
    //   168: aconst_null
    //   169: astore 5
    //   171: aload 5
    //   173: astore_0
    //   174: aload 5
    //   176: ifnonnull +85 -> 261
    //   179: new 107	I2/c
    //   182: astore_0
    //   183: aload_0
    //   184: aload_2
    //   185: ldc 104
    //   187: invokespecial 108	I2/c:<init>	(Ljava/lang/ThreadGroup;Ljava/lang/String;)V
    //   190: aload_0
    //   191: aconst_null
    //   192: invokevirtual 112	java/lang/Thread:setContextClassLoader	(Ljava/lang/ClassLoader;)V
    //   195: aload_0
    //   196: invokevirtual 115	java/lang/Thread:start	()V
    //   199: aload_0
    //   200: astore 5
    //   202: aload 5
    //   204: astore_0
    //   205: goto +56 -> 261
    //   208: astore_2
    //   209: aload_0
    //   210: astore 5
    //   212: goto +10 -> 222
    //   215: astore_2
    //   216: goto +6 -> 222
    //   219: aconst_null
    //   220: astore 5
    //   222: aload_2
    //   223: invokevirtual 35	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   226: astore_0
    //   227: new 37	java/lang/StringBuilder
    //   230: astore_2
    //   231: aload_2
    //   232: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   235: aload_2
    //   236: ldc 117
    //   238: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: aload_2
    //   243: aload_0
    //   244: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: ldc 48
    //   250: aload_2
    //   251: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   254: invokestatic 57	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   257: pop
    //   258: goto -56 -> 202
    //   261: ldc 72
    //   263: monitorexit
    //   264: ldc 2
    //   266: monitorexit
    //   267: aload_0
    //   268: areturn
    //   269: ldc 72
    //   271: monitorexit
    //   272: aload 5
    //   274: athrow
    //   275: astore 5
    //   277: ldc 2
    //   279: monitorexit
    //   280: aload 5
    //   282: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	256	0	localObject1	Object
    //   29	105	1	i	int
    //   34	19	2	arrayOfThreadGroup	ThreadGroup[]
    //   85	1	2	localSecurityException1	SecurityException
    //   94	91	2	localObject2	Object
    //   208	1	2	localSecurityException2	SecurityException
    //   215	8	2	localSecurityException3	SecurityException
    //   230	21	2	localStringBuilder	StringBuilder
    //   42	86	3	j	int
    //   44	119	4	k	int
    //   56	5	5	localThreadGroup	ThreadGroup
    //   80	1	5	localObject3	Object
    //   90	183	5	localObject4	Object
    //   275	6	5	localObject5	Object
    //   152	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   25	41	80	finally
    //   58	71	80	finally
    //   100	111	80	finally
    //   111	127	80	finally
    //   142	154	80	finally
    //   179	190	80	finally
    //   190	199	80	finally
    //   222	258	80	finally
    //   261	264	80	finally
    //   269	272	80	finally
    //   25	41	85	java/lang/SecurityException
    //   58	71	85	java/lang/SecurityException
    //   100	111	85	java/lang/SecurityException
    //   111	127	85	java/lang/SecurityException
    //   142	154	85	java/lang/SecurityException
    //   190	199	208	java/lang/SecurityException
    //   179	190	215	java/lang/SecurityException
    //   3	13	275	finally
    //   22	25	275	finally
    //   272	275	275	finally
  }
}

/* Location:
 * Qualified Name:     I2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
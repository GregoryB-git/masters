package n7;

public final class u
{
  public static final Object a;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 18
    //   4: iconst_0
    //   5: aconst_null
    //   6: invokestatic 24	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   9: ldc 26
    //   11: iconst_0
    //   12: anewarray 20	java/lang/Class
    //   15: invokevirtual 30	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   18: aconst_null
    //   19: iconst_0
    //   20: anewarray 4	java/lang/Object
    //   23: invokevirtual 36	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   26: astore_1
    //   27: goto +6 -> 33
    //   30: astore_1
    //   31: aconst_null
    //   32: astore_1
    //   33: aload_1
    //   34: putstatic 38	n7/u:a	Ljava/lang/Object;
    //   37: aload_1
    //   38: ifnonnull +6 -> 44
    //   41: goto +33 -> 74
    //   44: getstatic 44	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   47: astore_2
    //   48: ldc 46
    //   50: iconst_0
    //   51: aconst_null
    //   52: invokestatic 24	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   55: ldc 48
    //   57: iconst_2
    //   58: anewarray 20	java/lang/Class
    //   61: dup
    //   62: iconst_0
    //   63: ldc 50
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: aload_2
    //   69: aastore
    //   70: invokevirtual 30	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   73: pop
    //   74: aload_1
    //   75: ifnonnull +6 -> 81
    //   78: goto +62 -> 140
    //   81: ldc 46
    //   83: iconst_0
    //   84: aconst_null
    //   85: invokestatic 24	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   88: ldc 52
    //   90: iconst_1
    //   91: anewarray 20	java/lang/Class
    //   94: dup
    //   95: iconst_0
    //   96: ldc 50
    //   98: aastore
    //   99: invokevirtual 30	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   102: astore_2
    //   103: aload_2
    //   104: astore_0
    //   105: aload_0
    //   106: ifnonnull +6 -> 112
    //   109: goto +31 -> 140
    //   112: new 50	java/lang/Throwable
    //   115: astore_2
    //   116: aload_2
    //   117: invokespecial 55	java/lang/Throwable:<init>	()V
    //   120: aload_0
    //   121: aload_1
    //   122: iconst_1
    //   123: anewarray 4	java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload_2
    //   129: aastore
    //   130: invokevirtual 36	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   133: pop
    //   134: goto +6 -> 140
    //   137: astore_1
    //   138: aload_1
    //   139: athrow
    //   140: return
    //   141: astore_1
    //   142: aload_1
    //   143: athrow
    //   144: astore_1
    //   145: aload_1
    //   146: athrow
    //   147: astore_2
    //   148: goto -74 -> 74
    //   151: astore_1
    //   152: goto -12 -> 140
    //   155: astore_2
    //   156: goto -51 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	120	0	localObject1	Object
    //   26	1	1	localObject2	Object
    //   30	1	1	localObject3	Object
    //   32	90	1	localObject4	Object
    //   137	2	1	localThreadDeath1	ThreadDeath
    //   141	2	1	localThreadDeath2	ThreadDeath
    //   144	2	1	localThreadDeath3	ThreadDeath
    //   151	1	1	localUnsupportedOperationException	UnsupportedOperationException
    //   47	82	2	localObject5	Object
    //   147	1	2	localObject6	Object
    //   155	1	2	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   2	27	30	finally
    //   81	103	137	java/lang/ThreadDeath
    //   48	74	141	java/lang/ThreadDeath
    //   2	27	144	java/lang/ThreadDeath
    //   48	74	147	finally
    //   112	134	151	java/lang/UnsupportedOperationException
    //   112	134	151	java/lang/IllegalAccessException
    //   112	134	151	java/lang/reflect/InvocationTargetException
    //   138	140	151	java/lang/UnsupportedOperationException
    //   138	140	151	java/lang/IllegalAccessException
    //   138	140	151	java/lang/reflect/InvocationTargetException
    //   81	103	155	finally
  }
}

/* Location:
 * Qualified Name:     n7.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
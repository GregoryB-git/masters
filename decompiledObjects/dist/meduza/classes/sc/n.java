package sc;

import nc.s1;

public final class n
{
  public static final s1 a;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: getstatic 15	sc/v:a	I
    //   3: istore_0
    //   4: aconst_null
    //   5: astore_1
    //   6: ldc 17
    //   8: invokestatic 23	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   11: astore_2
    //   12: goto +6 -> 18
    //   15: astore_2
    //   16: aconst_null
    //   17: astore_2
    //   18: aload_2
    //   19: ifnull +8 -> 27
    //   22: aload_2
    //   23: invokestatic 29	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   26: pop
    //   27: invokestatic 35	g:h	()Ljava/util/Iterator;
    //   30: astore_3
    //   31: aload_3
    //   32: ldc 37
    //   34: invokestatic 43	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   37: new 45	kc/f
    //   40: astore_2
    //   41: aload_2
    //   42: aload_3
    //   43: invokespecial 49	kc/f:<init>	(Ljava/util/Iterator;)V
    //   46: aload_2
    //   47: instanceof 51
    //   50: ifeq +6 -> 56
    //   53: goto +12 -> 65
    //   56: new 51	kc/a
    //   59: dup
    //   60: aload_2
    //   61: invokespecial 54	kc/a:<init>	(Lkc/f;)V
    //   64: astore_2
    //   65: aload_2
    //   66: invokestatic 60	kc/i:N	(Lkc/b;)Ljava/util/List;
    //   69: astore 4
    //   71: aload 4
    //   73: invokeinterface 65 1 0
    //   78: astore 5
    //   80: aload 5
    //   82: invokeinterface 71 1 0
    //   87: ifne +8 -> 95
    //   90: aconst_null
    //   91: astore_2
    //   92: goto +90 -> 182
    //   95: aload 5
    //   97: invokeinterface 75 1 0
    //   102: astore_2
    //   103: aload 5
    //   105: invokeinterface 71 1 0
    //   110: ifne +6 -> 116
    //   113: goto +69 -> 182
    //   116: aload_2
    //   117: checkcast 77	sc/m
    //   120: invokeinterface 81 1 0
    //   125: istore_0
    //   126: aload_2
    //   127: astore_3
    //   128: aload 5
    //   130: invokeinterface 75 1 0
    //   135: astore 6
    //   137: aload 6
    //   139: checkcast 77	sc/m
    //   142: invokeinterface 81 1 0
    //   147: istore 7
    //   149: aload_3
    //   150: astore_2
    //   151: iload_0
    //   152: istore 8
    //   154: iload_0
    //   155: iload 7
    //   157: if_icmpge +10 -> 167
    //   160: aload 6
    //   162: astore_2
    //   163: iload 7
    //   165: istore 8
    //   167: aload_2
    //   168: astore_3
    //   169: iload 8
    //   171: istore_0
    //   172: aload 5
    //   174: invokeinterface 71 1 0
    //   179: ifne -51 -> 128
    //   182: aload_2
    //   183: checkcast 77	sc/m
    //   186: astore_3
    //   187: aload_3
    //   188: ifnull +34 -> 222
    //   191: aload_3
    //   192: aload 4
    //   194: invokeinterface 85 2 0
    //   199: astore_2
    //   200: goto +13 -> 213
    //   203: astore_2
    //   204: aload_3
    //   205: invokeinterface 88 1 0
    //   210: pop
    //   211: aload_1
    //   212: astore_2
    //   213: aload_2
    //   214: ifnull +8 -> 222
    //   217: aload_2
    //   218: putstatic 90	sc/n:a	Lnc/s1;
    //   221: return
    //   222: new 92	java/lang/IllegalStateException
    //   225: astore_2
    //   226: aload_2
    //   227: ldc 94
    //   229: invokespecial 97	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   232: aload_2
    //   233: athrow
    //   234: astore_2
    //   235: aload_2
    //   236: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	169	0	i	int
    //   5	207	1	localObject1	Object
    //   11	1	2	str	String
    //   15	1	2	localSecurityException	SecurityException
    //   17	183	2	localObject2	Object
    //   203	1	2	localObject3	Object
    //   212	21	2	localObject4	Object
    //   234	2	2	localObject5	Object
    //   30	175	3	localObject6	Object
    //   69	124	4	localList	java.util.List
    //   78	95	5	localIterator	java.util.Iterator
    //   135	26	6	localObject7	Object
    //   147	17	7	j	int
    //   152	18	8	k	int
    // Exception table:
    //   from	to	target	type
    //   6	12	15	java/lang/SecurityException
    //   191	200	203	finally
    //   27	53	234	finally
    //   56	65	234	finally
    //   65	90	234	finally
    //   95	113	234	finally
    //   116	126	234	finally
    //   128	149	234	finally
    //   172	182	234	finally
    //   182	187	234	finally
    //   204	211	234	finally
    //   222	234	234	finally
  }
}

/* Location:
 * Qualified Name:     sc.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
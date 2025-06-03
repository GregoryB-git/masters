package o2;

public abstract class s
{
  public static final String a = j.f("WorkerFactory");
  
  /* Error */
  public final androidx.work.d a(android.content.Context paramContext, String paramString, androidx.work.WorkerParameters paramWorkerParameters)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_2
    //   4: invokestatic 29	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   7: ldc 31
    //   9: invokevirtual 35	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   12: astore 5
    //   14: goto +56 -> 70
    //   17: astore 5
    //   19: invokestatic 39	o2/j:d	()Lo2/j;
    //   22: astore 6
    //   24: getstatic 18	o2/s:a	Ljava/lang/String;
    //   27: astore 7
    //   29: new 41	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   36: astore 8
    //   38: aload 8
    //   40: ldc 44
    //   42: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload 8
    //   48: aload_2
    //   49: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload 6
    //   55: aload 7
    //   57: aload 8
    //   59: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: aload 5
    //   64: invokevirtual 56	o2/j:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   67: aconst_null
    //   68: astore 5
    //   70: aload 4
    //   72: astore 6
    //   74: aload 5
    //   76: ifnull +95 -> 171
    //   79: aload 5
    //   81: iconst_2
    //   82: anewarray 25	java/lang/Class
    //   85: dup
    //   86: iconst_0
    //   87: ldc 58
    //   89: aastore
    //   90: dup
    //   91: iconst_1
    //   92: ldc 60
    //   94: aastore
    //   95: invokevirtual 64	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   98: iconst_2
    //   99: anewarray 4	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: aload_1
    //   105: aastore
    //   106: dup
    //   107: iconst_1
    //   108: aload_3
    //   109: aastore
    //   110: invokevirtual 70	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   113: checkcast 31	androidx/work/d
    //   116: astore 6
    //   118: goto +53 -> 171
    //   121: astore_1
    //   122: invokestatic 39	o2/j:d	()Lo2/j;
    //   125: astore 6
    //   127: getstatic 18	o2/s:a	Ljava/lang/String;
    //   130: astore_3
    //   131: new 41	java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   138: astore 5
    //   140: aload 5
    //   142: ldc 72
    //   144: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload 5
    //   150: aload_2
    //   151: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload 6
    //   157: aload_3
    //   158: aload 5
    //   160: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: aload_1
    //   164: invokevirtual 56	o2/j:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   167: aload 4
    //   169: astore 6
    //   171: aload 6
    //   173: ifnull +75 -> 248
    //   176: aload 6
    //   178: getfield 75	androidx/work/d:d	Z
    //   181: ifne +6 -> 187
    //   184: goto +64 -> 248
    //   187: aload_0
    //   188: invokevirtual 79	java/lang/Object:getClass	()Ljava/lang/Class;
    //   191: invokevirtual 82	java/lang/Class:getName	()Ljava/lang/String;
    //   194: astore_3
    //   195: new 41	java/lang/StringBuilder
    //   198: dup
    //   199: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   202: astore_1
    //   203: aload_1
    //   204: ldc 84
    //   206: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: aload_1
    //   211: aload_3
    //   212: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload_1
    //   217: ldc 86
    //   219: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload_1
    //   224: aload_2
    //   225: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload_1
    //   230: ldc 88
    //   232: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: new 90	java/lang/IllegalStateException
    //   239: dup
    //   240: aload_1
    //   241: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: invokespecial 93	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   247: athrow
    //   248: aload 6
    //   250: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	this	s
    //   0	251	1	paramContext	android.content.Context
    //   0	251	2	paramString	String
    //   0	251	3	paramWorkerParameters	androidx.work.WorkerParameters
    //   1	167	4	localObject1	Object
    //   12	1	5	localClass	Class
    //   17	46	5	localThrowable	Throwable
    //   68	91	5	localStringBuilder1	StringBuilder
    //   22	227	6	localObject2	Object
    //   27	29	7	str	String
    //   36	22	8	localStringBuilder2	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   3	14	17	finally
    //   79	118	121	finally
  }
}

/* Location:
 * Qualified Name:     o2.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
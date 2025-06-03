package v6;

public final class f
{
  public static String a;
  public static int b;
  public static Boolean c;
  
  /* Error */
  public static String a()
  {
    // Byte code:
    //   0: getstatic 15	v6/f:a	Ljava/lang/String;
    //   3: ifnonnull +189 -> 192
    //   6: getstatic 20	android/os/Build$VERSION:SDK_INT	I
    //   9: bipush 28
    //   11: if_icmplt +12 -> 23
    //   14: invokestatic 25	com/google/android/recaptcha/internal/a:j	()Ljava/lang/String;
    //   17: putstatic 15	v6/f:a	Ljava/lang/String;
    //   20: goto +172 -> 192
    //   23: getstatic 27	v6/f:b	I
    //   26: istore_0
    //   27: iload_0
    //   28: istore_1
    //   29: iload_0
    //   30: ifne +11 -> 41
    //   33: invokestatic 33	android/os/Process:myPid	()I
    //   36: istore_1
    //   37: iload_1
    //   38: putstatic 27	v6/f:b	I
    //   41: aconst_null
    //   42: astore_2
    //   43: aconst_null
    //   44: astore_3
    //   45: aconst_null
    //   46: astore 4
    //   48: iload_1
    //   49: ifgt +9 -> 58
    //   52: aload_3
    //   53: astore 4
    //   55: goto +132 -> 187
    //   58: new 35	java/lang/StringBuilder
    //   61: astore_3
    //   62: aload_3
    //   63: invokespecial 39	java/lang/StringBuilder:<init>	()V
    //   66: aload_3
    //   67: ldc 41
    //   69: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload_3
    //   74: iload_1
    //   75: invokevirtual 48	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload_3
    //   80: ldc 50
    //   82: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_3
    //   87: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: astore 5
    //   92: invokestatic 59	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   95: astore 6
    //   97: new 61	java/io/BufferedReader
    //   100: astore_3
    //   101: new 63	java/io/FileReader
    //   104: astore 7
    //   106: aload 7
    //   108: aload 5
    //   110: invokespecial 66	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   113: aload_3
    //   114: aload 7
    //   116: invokespecial 69	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   119: aload 6
    //   121: invokestatic 73	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   124: aload_3
    //   125: invokevirtual 76	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   128: astore 4
    //   130: aload 4
    //   132: invokestatic 82	m6/j:i	(Ljava/lang/Object;)V
    //   135: aload 4
    //   137: invokevirtual 87	java/lang/String:trim	()Ljava/lang/String;
    //   140: astore 4
    //   142: goto +15 -> 157
    //   145: astore_2
    //   146: aload_3
    //   147: astore 4
    //   149: goto +20 -> 169
    //   152: astore 4
    //   154: aconst_null
    //   155: astore 4
    //   157: goto +26 -> 183
    //   160: astore_3
    //   161: aload 6
    //   163: invokestatic 73	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   166: aload_3
    //   167: athrow
    //   168: astore_2
    //   169: aload 4
    //   171: invokestatic 92	v6/c:a	(Ljava/io/Closeable;)V
    //   174: aload_2
    //   175: athrow
    //   176: astore 4
    //   178: aconst_null
    //   179: astore 4
    //   181: aload_2
    //   182: astore_3
    //   183: aload_3
    //   184: invokestatic 92	v6/c:a	(Ljava/io/Closeable;)V
    //   187: aload 4
    //   189: putstatic 15	v6/f:a	Ljava/lang/String;
    //   192: getstatic 15	v6/f:a	Ljava/lang/String;
    //   195: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   26	4	0	i	int
    //   28	47	1	j	int
    //   42	1	2	localObject1	Object
    //   145	1	2	localObject2	Object
    //   168	14	2	localObject3	Object
    //   44	103	3	localObject4	Object
    //   160	7	3	localObject5	Object
    //   182	2	3	localObject6	Object
    //   46	102	4	localObject7	Object
    //   152	1	4	localIOException1	java.io.IOException
    //   155	15	4	localCloseable	java.io.Closeable
    //   176	1	4	localIOException2	java.io.IOException
    //   179	9	4	str1	String
    //   90	19	5	str2	String
    //   95	67	6	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   104	11	7	localFileReader	java.io.FileReader
    // Exception table:
    //   from	to	target	type
    //   124	142	145	finally
    //   124	142	152	java/io/IOException
    //   97	119	160	finally
    //   58	97	168	finally
    //   119	124	168	finally
    //   161	168	168	finally
    //   58	97	176	java/io/IOException
    //   119	124	176	java/io/IOException
    //   161	168	176	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     v6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
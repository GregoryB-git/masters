package com.facebook.appevents.internal;

import java.io.File;

final class HashUtils
{
  private static final String MD5 = "MD5";
  
  public static final String computeChecksum(String paramString)
    throws Exception
  {
    return computeFileMd5(new File(paramString));
  }
  
  /* Error */
  private static String computeFileMd5(File paramFile)
    throws Exception
  {
    // Byte code:
    //   0: new 28	java/io/BufferedInputStream
    //   3: dup
    //   4: new 30	java/io/FileInputStream
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 33	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   12: sipush 1024
    //   15: invokespecial 36	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   18: astore_0
    //   19: ldc 7
    //   21: invokestatic 42	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   24: astore_1
    //   25: sipush 1024
    //   28: newarray <illegal type>
    //   30: astore_2
    //   31: aload_0
    //   32: aload_2
    //   33: invokevirtual 48	java/io/InputStream:read	([B)I
    //   36: istore_3
    //   37: iload_3
    //   38: ifle +10 -> 48
    //   41: aload_1
    //   42: aload_2
    //   43: iconst_0
    //   44: iload_3
    //   45: invokevirtual 52	java/security/MessageDigest:update	([BII)V
    //   48: iload_3
    //   49: iconst_m1
    //   50: if_icmpne -19 -> 31
    //   53: new 54	java/math/BigInteger
    //   56: astore_2
    //   57: aload_2
    //   58: iconst_1
    //   59: aload_1
    //   60: invokevirtual 58	java/security/MessageDigest:digest	()[B
    //   63: invokespecial 61	java/math/BigInteger:<init>	(I[B)V
    //   66: aload_2
    //   67: bipush 16
    //   69: invokevirtual 65	java/math/BigInteger:toString	(I)Ljava/lang/String;
    //   72: astore_1
    //   73: aload_0
    //   74: invokevirtual 68	java/io/InputStream:close	()V
    //   77: aload_1
    //   78: areturn
    //   79: astore_2
    //   80: aload_2
    //   81: athrow
    //   82: astore_1
    //   83: aload_0
    //   84: invokevirtual 68	java/io/InputStream:close	()V
    //   87: goto +9 -> 96
    //   90: astore_0
    //   91: aload_2
    //   92: aload_0
    //   93: invokevirtual 74	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	paramFile	File
    //   24	54	1	localObject1	Object
    //   82	15	1	localObject2	Object
    //   30	37	2	localObject3	Object
    //   79	13	2	localObject4	Object
    //   36	15	3	i	int
    // Exception table:
    //   from	to	target	type
    //   19	31	79	finally
    //   31	37	79	finally
    //   41	48	79	finally
    //   53	73	79	finally
    //   80	82	82	finally
    //   83	87	90	finally
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.HashUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
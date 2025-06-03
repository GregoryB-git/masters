package com.facebook.common.internal;

import a;
import java.io.IOException;
import java.io.InputStream;

public class Files
{
  public static byte[] readFile(InputStream paramInputStream, long paramLong)
    throws IOException
  {
    if (paramLong <= 2147483647L)
    {
      if (paramLong == 0L) {
        paramInputStream = ByteStreams.toByteArray(paramInputStream);
      } else {
        paramInputStream = ByteStreams.toByteArray(paramInputStream, (int)paramLong);
      }
      return paramInputStream;
    }
    throw new OutOfMemoryError(a.i("file is too large to fit in a byte array: ", paramLong, " bytes"));
  }
  
  /* Error */
  public static byte[] toByteArray(java.io.File paramFile)
    throws IOException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 43	java/io/FileInputStream
    //   5: astore_2
    //   6: aload_2
    //   7: aload_0
    //   8: invokespecial 46	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   11: aload_2
    //   12: aload_2
    //   13: invokevirtual 50	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   16: invokevirtual 56	java/nio/channels/FileChannel:size	()J
    //   19: invokestatic 58	com/facebook/common/internal/Files:readFile	(Ljava/io/InputStream;J)[B
    //   22: astore_0
    //   23: aload_2
    //   24: invokevirtual 61	java/io/FileInputStream:close	()V
    //   27: aload_0
    //   28: areturn
    //   29: astore_0
    //   30: goto +6 -> 36
    //   33: astore_0
    //   34: aload_1
    //   35: astore_2
    //   36: aload_2
    //   37: ifnull +7 -> 44
    //   40: aload_2
    //   41: invokevirtual 61	java/io/FileInputStream:close	()V
    //   44: aload_0
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	paramFile	java.io.File
    //   1	34	1	localObject1	Object
    //   5	36	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   11	23	29	finally
    //   2	11	33	finally
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.Files
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
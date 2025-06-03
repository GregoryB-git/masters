package H3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

public abstract class G
{
  public static void a(InputStream paramInputStream, File paramFile)
  {
    if (paramInputStream == null) {
      return;
    }
    byte[] arrayOfByte = new byte[' '];
    Object localObject = null;
    try
    {
      GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>(paramFile);
      localGZIPOutputStream.<init>(localFileOutputStream);
      try
      {
        for (;;)
        {
          int i = paramInputStream.read(arrayOfByte);
          if (i <= 0) {
            break;
          }
          localGZIPOutputStream.write(arrayOfByte, 0, i);
        }
        localGZIPOutputStream.finish();
      }
      finally
      {
        paramFile = localGZIPOutputStream;
        break label81;
      }
      i.g(localGZIPOutputStream);
      return;
    }
    finally
    {
      paramFile = (File)localObject;
      label81:
      i.g(paramFile);
    }
  }
  
  /* Error */
  public static void b(File paramFile, java.util.List paramList)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 48 1 0
    //   6: astore_2
    //   7: aload_2
    //   8: invokeinterface 54 1 0
    //   13: ifeq +100 -> 113
    //   16: aload_2
    //   17: invokeinterface 58 1 0
    //   22: checkcast 60	H3/F
    //   25: astore_3
    //   26: aconst_null
    //   27: astore_1
    //   28: aconst_null
    //   29: astore 4
    //   31: aload_3
    //   32: invokeinterface 64 1 0
    //   37: astore 5
    //   39: aload 5
    //   41: ifnonnull +13 -> 54
    //   44: aload 5
    //   46: astore_1
    //   47: aload_1
    //   48: invokestatic 37	H3/i:g	(Ljava/io/Closeable;)V
    //   51: goto -44 -> 7
    //   54: aload 5
    //   56: astore 4
    //   58: aload 5
    //   60: astore_1
    //   61: new 66	java/io/File
    //   64: astore 6
    //   66: aload 5
    //   68: astore 4
    //   70: aload 5
    //   72: astore_1
    //   73: aload 6
    //   75: aload_0
    //   76: aload_3
    //   77: invokeinterface 70 1 0
    //   82: invokespecial 73	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   85: aload 5
    //   87: astore 4
    //   89: aload 5
    //   91: astore_1
    //   92: aload 5
    //   94: aload 6
    //   96: invokestatic 75	H3/G:a	(Ljava/io/InputStream;Ljava/io/File;)V
    //   99: aload 5
    //   101: astore_1
    //   102: goto -55 -> 47
    //   105: astore_0
    //   106: aload 4
    //   108: invokestatic 37	H3/i:g	(Ljava/io/Closeable;)V
    //   111: aload_0
    //   112: athrow
    //   113: return
    //   114: astore 5
    //   116: goto -69 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	paramFile	File
    //   0	119	1	paramList	java.util.List
    //   6	11	2	localIterator	java.util.Iterator
    //   25	52	3	localF	F
    //   29	78	4	localObject	Object
    //   37	63	5	localInputStream	InputStream
    //   114	1	5	localIOException	java.io.IOException
    //   64	31	6	localFile	File
    // Exception table:
    //   from	to	target	type
    //   31	39	105	finally
    //   61	66	105	finally
    //   73	85	105	finally
    //   92	99	105	finally
    //   31	39	114	java/io/IOException
    //   61	66	114	java/io/IOException
    //   73	85	114	java/io/IOException
    //   92	99	114	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     H3.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
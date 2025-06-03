package s4;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.spi.AbstractInterruptibleChannel;

public class b
{
  public final FileChannel a;
  public final FileLock b;
  
  public b(FileChannel paramFileChannel, FileLock paramFileLock)
  {
    a = paramFileChannel;
    b = paramFileLock;
  }
  
  /* Error */
  public static b a(android.content.Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 27	java/io/File
    //   3: astore_2
    //   4: aload_2
    //   5: aload_0
    //   6: invokevirtual 33	android/content/Context:getFilesDir	()Ljava/io/File;
    //   9: aload_1
    //   10: invokespecial 36	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   13: new 38	java/io/RandomAccessFile
    //   16: astore_0
    //   17: aload_0
    //   18: aload_2
    //   19: ldc 40
    //   21: invokespecial 41	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokevirtual 45	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   28: astore_2
    //   29: aload_2
    //   30: invokevirtual 51	java/nio/channels/FileChannel:lock	()Ljava/nio/channels/FileLock;
    //   33: astore_1
    //   34: new 2	s4/b
    //   37: dup
    //   38: aload_2
    //   39: aload_1
    //   40: invokespecial 53	s4/b:<init>	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileLock;)V
    //   43: astore_0
    //   44: aload_0
    //   45: areturn
    //   46: astore_0
    //   47: goto +41 -> 88
    //   50: astore_0
    //   51: goto +37 -> 88
    //   54: astore_0
    //   55: goto +33 -> 88
    //   58: astore_0
    //   59: aconst_null
    //   60: astore_1
    //   61: goto +27 -> 88
    //   64: astore_0
    //   65: goto -6 -> 59
    //   68: astore_0
    //   69: goto -10 -> 59
    //   72: astore_0
    //   73: aconst_null
    //   74: astore_2
    //   75: aload_2
    //   76: astore_1
    //   77: goto +11 -> 88
    //   80: astore_0
    //   81: goto -8 -> 73
    //   84: astore_0
    //   85: goto -12 -> 73
    //   88: ldc 55
    //   90: ldc 57
    //   92: aload_0
    //   93: invokestatic 63	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   96: pop
    //   97: aload_1
    //   98: ifnull +7 -> 105
    //   101: aload_1
    //   102: invokevirtual 68	java/nio/channels/FileLock:release	()V
    //   105: aload_2
    //   106: ifnull +7 -> 113
    //   109: aload_2
    //   110: invokevirtual 73	java/nio/channels/spi/AbstractInterruptibleChannel:close	()V
    //   113: aconst_null
    //   114: areturn
    //   115: astore_0
    //   116: goto -11 -> 105
    //   119: astore_0
    //   120: goto -7 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramContext	android.content.Context
    //   0	123	1	paramString	String
    //   3	107	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   34	44	46	java/nio/channels/OverlappingFileLockException
    //   34	44	50	java/lang/Error
    //   34	44	54	java/io/IOException
    //   29	34	58	java/nio/channels/OverlappingFileLockException
    //   29	34	64	java/lang/Error
    //   29	34	68	java/io/IOException
    //   0	29	72	java/nio/channels/OverlappingFileLockException
    //   0	29	80	java/lang/Error
    //   0	29	84	java/io/IOException
    //   101	105	115	java/io/IOException
    //   109	113	119	java/io/IOException
  }
  
  public void b()
  {
    try
    {
      b.release();
      a.close();
    }
    catch (IOException localIOException)
    {
      Log.e("CrossProcessLock", "encountered error while releasing, ignoring", localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     s4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
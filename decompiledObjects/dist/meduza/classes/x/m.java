package x;

import android.content.Context;
import android.os.Process;
import f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public final class m
{
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public static boolean b(File paramFile, android.content.res.Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokevirtual 23	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   5: astore_3
    //   6: aload_0
    //   7: aload_3
    //   8: invokestatic 27	x/m:c	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   11: istore 4
    //   13: aload_3
    //   14: invokestatic 29	x/m:a	(Ljava/io/Closeable;)V
    //   17: iload 4
    //   19: ireturn
    //   20: astore_1
    //   21: aload_3
    //   22: astore_0
    //   23: goto +6 -> 29
    //   26: astore_1
    //   27: aconst_null
    //   28: astore_0
    //   29: aload_0
    //   30: invokestatic 29	x/m:a	(Ljava/io/Closeable;)V
    //   33: aload_1
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	paramFile	File
    //   0	35	1	paramResources	android.content.res.Resources
    //   0	35	2	paramInt	int
    //   5	17	3	localInputStream	java.io.InputStream
    //   11	7	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	13	20	finally
    //   0	6	26	finally
  }
  
  /* Error */
  public static boolean c(File paramFile, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: invokestatic 35	android/os/StrictMode:allowThreadDiskWrites	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aload 4
    //   11: astore 5
    //   13: new 37	java/io/FileOutputStream
    //   16: astore 6
    //   18: aload 4
    //   20: astore 5
    //   22: aload 6
    //   24: aload_0
    //   25: iconst_0
    //   26: invokespecial 41	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   29: sipush 1024
    //   32: newarray <illegal type>
    //   34: astore_0
    //   35: aload_1
    //   36: aload_0
    //   37: invokevirtual 47	java/io/InputStream:read	([B)I
    //   40: istore 7
    //   42: iload 7
    //   44: iconst_m1
    //   45: if_icmpeq +15 -> 60
    //   48: aload 6
    //   50: aload_0
    //   51: iconst_0
    //   52: iload 7
    //   54: invokevirtual 51	java/io/FileOutputStream:write	([BII)V
    //   57: goto -22 -> 35
    //   60: aload 6
    //   62: invokestatic 29	x/m:a	(Ljava/io/Closeable;)V
    //   65: aload_2
    //   66: invokestatic 55	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   69: iconst_1
    //   70: ireturn
    //   71: astore_0
    //   72: goto +85 -> 157
    //   75: astore_1
    //   76: aload 6
    //   78: astore_0
    //   79: goto +10 -> 89
    //   82: astore_0
    //   83: goto +70 -> 153
    //   86: astore_1
    //   87: aload_3
    //   88: astore_0
    //   89: aload_0
    //   90: astore 5
    //   92: new 57	java/lang/StringBuilder
    //   95: astore 6
    //   97: aload_0
    //   98: astore 5
    //   100: aload 6
    //   102: invokespecial 59	java/lang/StringBuilder:<init>	()V
    //   105: aload_0
    //   106: astore 5
    //   108: aload 6
    //   110: ldc 61
    //   112: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_0
    //   117: astore 5
    //   119: aload 6
    //   121: aload_1
    //   122: invokevirtual 71	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   125: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: aload_0
    //   130: astore 5
    //   132: ldc 73
    //   134: aload 6
    //   136: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokestatic 82	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   142: pop
    //   143: aload_0
    //   144: invokestatic 29	x/m:a	(Ljava/io/Closeable;)V
    //   147: aload_2
    //   148: invokestatic 55	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   151: iconst_0
    //   152: ireturn
    //   153: aload 5
    //   155: astore 6
    //   157: aload 6
    //   159: invokestatic 29	x/m:a	(Ljava/io/Closeable;)V
    //   162: aload_2
    //   163: invokestatic 55	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   166: aload_0
    //   167: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	paramFile	File
    //   0	168	1	paramInputStream	java.io.InputStream
    //   3	160	2	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   5	83	3	localObject1	Object
    //   7	12	4	localObject2	Object
    //   11	143	5	localObject3	Object
    //   16	142	6	localObject4	Object
    //   40	13	7	i	int
    // Exception table:
    //   from	to	target	type
    //   29	35	71	finally
    //   35	42	71	finally
    //   48	57	71	finally
    //   29	35	75	java/io/IOException
    //   35	42	75	java/io/IOException
    //   48	57	75	java/io/IOException
    //   13	18	82	finally
    //   22	29	82	finally
    //   92	97	82	finally
    //   100	105	82	finally
    //   108	116	82	finally
    //   119	129	82	finally
    //   132	143	82	finally
    //   13	18	86	java/io/IOException
    //   22	29	86	java/io/IOException
  }
  
  public static File d(Context paramContext)
  {
    paramContext = paramContext.getCacheDir();
    if (paramContext == null) {
      return null;
    }
    Object localObject = f.l(".font");
    ((StringBuilder)localObject).append(Process.myPid());
    ((StringBuilder)localObject).append("-");
    ((StringBuilder)localObject).append(Process.myTid());
    ((StringBuilder)localObject).append("-");
    localObject = ((StringBuilder)localObject).toString();
    for (int i = 0; i < 100; i++)
    {
      File localFile = new File(paramContext, f.h((String)localObject, i));
      try
      {
        boolean bool = localFile.createNewFile();
        if (bool) {
          return localFile;
        }
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
    return null;
  }
  
  /* Error */
  public static java.nio.MappedByteBuffer e(Context paramContext, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 129	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_0
    //   5: aload_0
    //   6: aload_1
    //   7: ldc -125
    //   9: aconst_null
    //   10: invokevirtual 137	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   13: astore_0
    //   14: aload_0
    //   15: ifnonnull +13 -> 28
    //   18: aload_0
    //   19: ifnull +7 -> 26
    //   22: aload_0
    //   23: invokevirtual 140	android/os/ParcelFileDescriptor:close	()V
    //   26: aconst_null
    //   27: areturn
    //   28: new 142	java/io/FileInputStream
    //   31: astore_1
    //   32: aload_1
    //   33: aload_0
    //   34: invokevirtual 146	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   37: invokespecial 149	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   40: aload_1
    //   41: invokevirtual 153	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   44: astore_2
    //   45: aload_2
    //   46: invokevirtual 159	java/nio/channels/FileChannel:size	()J
    //   49: lstore_3
    //   50: aload_2
    //   51: getstatic 165	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   54: lconst_0
    //   55: lload_3
    //   56: invokevirtual 169	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   59: astore_2
    //   60: aload_1
    //   61: invokevirtual 170	java/io/FileInputStream:close	()V
    //   64: aload_0
    //   65: invokevirtual 140	android/os/ParcelFileDescriptor:close	()V
    //   68: aload_2
    //   69: areturn
    //   70: astore_2
    //   71: aload_1
    //   72: invokevirtual 170	java/io/FileInputStream:close	()V
    //   75: goto +9 -> 84
    //   78: astore_1
    //   79: aload_2
    //   80: aload_1
    //   81: invokevirtual 174	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   84: aload_2
    //   85: athrow
    //   86: astore_1
    //   87: aload_0
    //   88: invokevirtual 140	android/os/ParcelFileDescriptor:close	()V
    //   91: goto +9 -> 100
    //   94: astore_0
    //   95: aload_1
    //   96: aload_0
    //   97: invokevirtual 174	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   100: aload_1
    //   101: athrow
    //   102: astore_0
    //   103: aconst_null
    //   104: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	paramContext	Context
    //   0	105	1	paramUri	android.net.Uri
    //   44	25	2	localObject1	Object
    //   70	15	2	localObject2	Object
    //   49	7	3	l	long
    // Exception table:
    //   from	to	target	type
    //   40	60	70	finally
    //   71	75	78	finally
    //   28	40	86	finally
    //   60	64	86	finally
    //   79	84	86	finally
    //   84	86	86	finally
    //   87	91	94	finally
    //   5	14	102	java/io/IOException
    //   22	26	102	java/io/IOException
    //   64	68	102	java/io/IOException
    //   95	100	102	java/io/IOException
    //   100	102	102	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     x.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
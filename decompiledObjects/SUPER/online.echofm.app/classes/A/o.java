package A;

import F.g.b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class o
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
  
  public static ByteBuffer b(Context paramContext, Resources paramResources, int paramInt)
  {
    paramContext = e(paramContext);
    if (paramContext == null) {
      return null;
    }
    try
    {
      boolean bool = c(paramContext, paramResources, paramInt);
      if (!bool) {
        return null;
      }
      paramResources = g(paramContext);
      return paramResources;
    }
    finally
    {
      paramContext.delete();
    }
  }
  
  /* Error */
  public static boolean c(File paramFile, Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokevirtual 43	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   5: astore_1
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 47	A/o:d	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   11: istore_3
    //   12: aload_1
    //   13: invokestatic 49	A/o:a	(Ljava/io/Closeable;)V
    //   16: iload_3
    //   17: ireturn
    //   18: astore_0
    //   19: goto +6 -> 25
    //   22: astore_0
    //   23: aconst_null
    //   24: astore_1
    //   25: aload_1
    //   26: invokestatic 49	A/o:a	(Ljava/io/Closeable;)V
    //   29: aload_0
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	paramFile	File
    //   0	31	1	paramResources	Resources
    //   0	31	2	paramInt	int
    //   11	6	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	12	18	finally
    //   0	6	22	finally
  }
  
  /* Error */
  public static boolean d(File paramFile, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: invokestatic 55	android/os/StrictMode:allowThreadDiskWrites	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aload 4
    //   11: astore 5
    //   13: new 57	java/io/FileOutputStream
    //   16: astore 6
    //   18: aload 4
    //   20: astore 5
    //   22: aload 6
    //   24: aload_0
    //   25: iconst_0
    //   26: invokespecial 61	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   29: sipush 1024
    //   32: newarray <illegal type>
    //   34: astore_0
    //   35: aload_1
    //   36: aload_0
    //   37: invokevirtual 67	java/io/InputStream:read	([B)I
    //   40: istore 7
    //   42: iload 7
    //   44: iconst_m1
    //   45: if_icmpeq +30 -> 75
    //   48: aload 6
    //   50: aload_0
    //   51: iconst_0
    //   52: iload 7
    //   54: invokevirtual 71	java/io/FileOutputStream:write	([BII)V
    //   57: goto -22 -> 35
    //   60: astore_0
    //   61: aload 6
    //   63: astore 5
    //   65: goto +92 -> 157
    //   68: astore_1
    //   69: aload 6
    //   71: astore_0
    //   72: goto +21 -> 93
    //   75: aload 6
    //   77: invokestatic 49	A/o:a	(Ljava/io/Closeable;)V
    //   80: aload_2
    //   81: invokestatic 75	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   84: iconst_1
    //   85: ireturn
    //   86: astore_0
    //   87: goto +70 -> 157
    //   90: astore_1
    //   91: aload_3
    //   92: astore_0
    //   93: aload_0
    //   94: astore 5
    //   96: new 77	java/lang/StringBuilder
    //   99: astore 6
    //   101: aload_0
    //   102: astore 5
    //   104: aload 6
    //   106: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   109: aload_0
    //   110: astore 5
    //   112: aload 6
    //   114: ldc 81
    //   116: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload_0
    //   121: astore 5
    //   123: aload 6
    //   125: aload_1
    //   126: invokevirtual 91	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   129: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload_0
    //   134: astore 5
    //   136: ldc 93
    //   138: aload 6
    //   140: invokevirtual 96	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   143: invokestatic 101	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   146: pop
    //   147: aload_0
    //   148: invokestatic 49	A/o:a	(Ljava/io/Closeable;)V
    //   151: aload_2
    //   152: invokestatic 75	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   155: iconst_0
    //   156: ireturn
    //   157: aload 5
    //   159: invokestatic 49	A/o:a	(Ljava/io/Closeable;)V
    //   162: aload_2
    //   163: invokestatic 75	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   166: aload_0
    //   167: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	paramFile	File
    //   0	168	1	paramInputStream	java.io.InputStream
    //   3	160	2	localThreadPolicy	android.os.StrictMode.ThreadPolicy
    //   5	87	3	localObject1	Object
    //   7	12	4	localObject2	Object
    //   11	147	5	localObject3	Object
    //   16	123	6	localObject4	Object
    //   40	13	7	i	int
    // Exception table:
    //   from	to	target	type
    //   29	35	60	finally
    //   35	42	60	finally
    //   48	57	60	finally
    //   29	35	68	java/io/IOException
    //   35	42	68	java/io/IOException
    //   48	57	68	java/io/IOException
    //   13	18	86	finally
    //   22	29	86	finally
    //   96	101	86	finally
    //   104	109	86	finally
    //   112	120	86	finally
    //   123	133	86	finally
    //   136	147	86	finally
    //   13	18	90	java/io/IOException
    //   22	29	90	java/io/IOException
  }
  
  public static File e(Context paramContext)
  {
    paramContext = paramContext.getCacheDir();
    if (paramContext == null) {
      return null;
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(".font");
    ((StringBuilder)localObject1).append(Process.myPid());
    ((StringBuilder)localObject1).append("-");
    ((StringBuilder)localObject1).append(Process.myTid());
    ((StringBuilder)localObject1).append("-");
    localObject1 = ((StringBuilder)localObject1).toString();
    for (int i = 0; i < 100; i++)
    {
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(i);
      localObject2 = new File(paramContext, ((StringBuilder)localObject2).toString());
      try
      {
        boolean bool = ((File)localObject2).createNewFile();
        if (bool) {
          return (File)localObject2;
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
  public static ByteBuffer f(Context paramContext, CancellationSignal paramCancellationSignal, Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 135	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_0
    //   5: aload_0
    //   6: aload_2
    //   7: ldc -119
    //   9: aload_1
    //   10: invokestatic 140	A/o$a:a	(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   13: astore_0
    //   14: aload_0
    //   15: ifnonnull +13 -> 28
    //   18: aload_0
    //   19: ifnull +7 -> 26
    //   22: aload_0
    //   23: invokevirtual 143	android/os/ParcelFileDescriptor:close	()V
    //   26: aconst_null
    //   27: areturn
    //   28: new 145	java/io/FileInputStream
    //   31: astore_1
    //   32: aload_1
    //   33: aload_0
    //   34: invokevirtual 149	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   37: invokespecial 152	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   40: aload_1
    //   41: invokevirtual 156	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   44: astore_2
    //   45: aload_2
    //   46: invokevirtual 162	java/nio/channels/FileChannel:size	()J
    //   49: lstore_3
    //   50: aload_2
    //   51: getstatic 168	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   54: lconst_0
    //   55: lload_3
    //   56: invokevirtual 172	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   59: astore_2
    //   60: aload_1
    //   61: invokevirtual 173	java/io/FileInputStream:close	()V
    //   64: aload_0
    //   65: invokevirtual 143	android/os/ParcelFileDescriptor:close	()V
    //   68: aload_2
    //   69: areturn
    //   70: astore_1
    //   71: goto +19 -> 90
    //   74: astore_2
    //   75: aload_1
    //   76: invokevirtual 173	java/io/FileInputStream:close	()V
    //   79: goto +9 -> 88
    //   82: astore_1
    //   83: aload_2
    //   84: aload_1
    //   85: invokevirtual 177	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   88: aload_2
    //   89: athrow
    //   90: aload_0
    //   91: invokevirtual 143	android/os/ParcelFileDescriptor:close	()V
    //   94: goto +9 -> 103
    //   97: astore_0
    //   98: aload_1
    //   99: aload_0
    //   100: invokevirtual 177	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   103: aload_1
    //   104: athrow
    //   105: astore_0
    //   106: aconst_null
    //   107: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	paramContext	Context
    //   0	108	1	paramCancellationSignal	CancellationSignal
    //   0	108	2	paramUri	Uri
    //   49	7	3	l	long
    // Exception table:
    //   from	to	target	type
    //   28	40	70	finally
    //   60	64	70	finally
    //   83	88	70	finally
    //   88	90	70	finally
    //   40	60	74	finally
    //   75	79	82	finally
    //   90	94	97	finally
    //   5	14	105	java/io/IOException
    //   22	26	105	java/io/IOException
    //   64	68	105	java/io/IOException
    //   98	103	105	java/io/IOException
    //   103	105	105	java/io/IOException
  }
  
  /* Error */
  public static ByteBuffer g(File paramFile)
  {
    // Byte code:
    //   0: new 145	java/io/FileInputStream
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 180	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   9: aload_1
    //   10: invokevirtual 156	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   13: astore_0
    //   14: aload_0
    //   15: invokevirtual 162	java/nio/channels/FileChannel:size	()J
    //   18: lstore_2
    //   19: aload_0
    //   20: getstatic 168	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   23: lconst_0
    //   24: lload_2
    //   25: invokevirtual 172	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   28: astore_0
    //   29: aload_1
    //   30: invokevirtual 173	java/io/FileInputStream:close	()V
    //   33: aload_0
    //   34: areturn
    //   35: astore_0
    //   36: aload_1
    //   37: invokevirtual 173	java/io/FileInputStream:close	()V
    //   40: goto +9 -> 49
    //   43: astore_1
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual 177	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   49: aload_0
    //   50: athrow
    //   51: astore_0
    //   52: aconst_null
    //   53: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	paramFile	File
    //   3	34	1	localFileInputStream	java.io.FileInputStream
    //   43	3	1	localThrowable	Throwable
    //   18	7	2	l	long
    // Exception table:
    //   from	to	target	type
    //   9	29	35	finally
    //   36	40	43	finally
    //   0	9	51	java/io/IOException
    //   29	33	51	java/io/IOException
    //   44	49	51	java/io/IOException
    //   49	51	51	java/io/IOException
  }
  
  public static Map h(Context paramContext, g.b[] paramArrayOfb, CancellationSignal paramCancellationSignal)
  {
    HashMap localHashMap = new HashMap();
    int i = paramArrayOfb.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramArrayOfb[j];
      if (((g.b)localObject).b() == 0)
      {
        localObject = ((g.b)localObject).d();
        if (!localHashMap.containsKey(localObject)) {
          localHashMap.put(localObject, f(paramContext, paramCancellationSignal, (Uri)localObject));
        }
      }
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public static abstract class a
  {
    public static ParcelFileDescriptor a(ContentResolver paramContentResolver, Uri paramUri, String paramString, CancellationSignal paramCancellationSignal)
    {
      return paramContentResolver.openFileDescriptor(paramUri, paramString, paramCancellationSignal);
    }
  }
}

/* Location:
 * Qualified Name:     A.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
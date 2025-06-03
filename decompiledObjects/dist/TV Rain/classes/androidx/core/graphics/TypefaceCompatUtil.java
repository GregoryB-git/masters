package androidx.core.graphics;

import a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TypefaceCompatUtil
{
  private static final String CACHE_FILE_PREFIX = ".font";
  private static final String TAG = "TypefaceCompatUtil";
  
  public static void closeQuietly(@Nullable Closeable paramCloseable)
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
  
  @Nullable
  @RequiresApi(19)
  public static ByteBuffer copyToDirectBuffer(@NonNull Context paramContext, @NonNull Resources paramResources, int paramInt)
  {
    paramContext = getTempFile(paramContext);
    if (paramContext == null) {
      return null;
    }
    try
    {
      boolean bool = copyToFile(paramContext, paramResources, paramInt);
      if (!bool) {
        return null;
      }
      paramResources = mmap(paramContext);
      return paramResources;
    }
    finally
    {
      paramContext.delete();
    }
  }
  
  /* Error */
  public static boolean copyToFile(@NonNull File paramFile, @NonNull Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokevirtual 64	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   5: astore_1
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 67	androidx/core/graphics/TypefaceCompatUtil:copyToFile	(Ljava/io/File;Ljava/io/InputStream;)Z
    //   11: istore_3
    //   12: aload_1
    //   13: invokestatic 69	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   16: iload_3
    //   17: ireturn
    //   18: astore_0
    //   19: goto +6 -> 25
    //   22: astore_0
    //   23: aconst_null
    //   24: astore_1
    //   25: aload_1
    //   26: invokestatic 69	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
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
  public static boolean copyToFile(@NonNull File paramFile, @NonNull java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: invokestatic 75	android/os/StrictMode:allowThreadDiskWrites	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aload 4
    //   11: astore 5
    //   13: new 77	java/io/FileOutputStream
    //   16: astore 6
    //   18: aload 4
    //   20: astore 5
    //   22: aload 6
    //   24: aload_0
    //   25: iconst_0
    //   26: invokespecial 80	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   29: sipush 1024
    //   32: newarray <illegal type>
    //   34: astore_0
    //   35: aload_1
    //   36: aload_0
    //   37: invokevirtual 86	java/io/InputStream:read	([B)I
    //   40: istore 7
    //   42: iload 7
    //   44: iconst_m1
    //   45: if_icmpeq +15 -> 60
    //   48: aload 6
    //   50: aload_0
    //   51: iconst_0
    //   52: iload 7
    //   54: invokevirtual 90	java/io/FileOutputStream:write	([BII)V
    //   57: goto -22 -> 35
    //   60: aload 6
    //   62: invokestatic 69	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   65: aload_2
    //   66: invokestatic 94	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   69: iconst_1
    //   70: ireturn
    //   71: astore_0
    //   72: aload 6
    //   74: astore 5
    //   76: goto +81 -> 157
    //   79: astore_1
    //   80: aload 6
    //   82: astore_0
    //   83: goto +10 -> 93
    //   86: astore_0
    //   87: goto +70 -> 157
    //   90: astore_1
    //   91: aload_3
    //   92: astore_0
    //   93: aload_0
    //   94: astore 5
    //   96: new 96	java/lang/StringBuilder
    //   99: astore 6
    //   101: aload_0
    //   102: astore 5
    //   104: aload 6
    //   106: invokespecial 97	java/lang/StringBuilder:<init>	()V
    //   109: aload_0
    //   110: astore 5
    //   112: aload 6
    //   114: ldc 99
    //   116: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload_0
    //   121: astore 5
    //   123: aload 6
    //   125: aload_1
    //   126: invokevirtual 109	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   129: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: pop
    //   133: aload_0
    //   134: astore 5
    //   136: ldc 18
    //   138: aload 6
    //   140: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   143: invokestatic 118	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   146: pop
    //   147: aload_0
    //   148: invokestatic 69	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   151: aload_2
    //   152: invokestatic 94	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   155: iconst_0
    //   156: ireturn
    //   157: aload 5
    //   159: invokestatic 69	androidx/core/graphics/TypefaceCompatUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   162: aload_2
    //   163: invokestatic 94	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
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
    //   29	35	71	finally
    //   35	42	71	finally
    //   48	57	71	finally
    //   29	35	79	java/io/IOException
    //   35	42	79	java/io/IOException
    //   48	57	79	java/io/IOException
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
  
  @Nullable
  public static File getTempFile(@NonNull Context paramContext)
  {
    paramContext = paramContext.getCacheDir();
    if (paramContext == null) {
      return null;
    }
    Object localObject = z2.t(".font");
    ((StringBuilder)localObject).append(Process.myPid());
    ((StringBuilder)localObject).append("-");
    ((StringBuilder)localObject).append(Process.myTid());
    ((StringBuilder)localObject).append("-");
    localObject = ((StringBuilder)localObject).toString();
    for (int i = 0; i < 100; i++)
    {
      File localFile = new File(paramContext, a.f((String)localObject, i));
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
  @Nullable
  @RequiresApi(19)
  public static ByteBuffer mmap(@NonNull Context paramContext, @Nullable CancellationSignal paramCancellationSignal, @NonNull Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 160	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_0
    //   5: aload_0
    //   6: aload_2
    //   7: ldc -94
    //   9: aload_1
    //   10: invokestatic 166	androidx/core/graphics/TypefaceCompatUtil$Api19Impl:openFileDescriptor	(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   13: astore_0
    //   14: aload_0
    //   15: ifnonnull +13 -> 28
    //   18: aload_0
    //   19: ifnull +7 -> 26
    //   22: aload_0
    //   23: invokevirtual 169	android/os/ParcelFileDescriptor:close	()V
    //   26: aconst_null
    //   27: areturn
    //   28: new 171	java/io/FileInputStream
    //   31: astore_1
    //   32: aload_1
    //   33: aload_0
    //   34: invokevirtual 175	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   37: invokespecial 178	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   40: aload_1
    //   41: invokevirtual 182	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   44: astore_2
    //   45: aload_2
    //   46: invokevirtual 188	java/nio/channels/FileChannel:size	()J
    //   49: lstore_3
    //   50: aload_2
    //   51: getstatic 194	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   54: lconst_0
    //   55: lload_3
    //   56: invokevirtual 198	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   59: astore_2
    //   60: aload_1
    //   61: invokevirtual 199	java/io/FileInputStream:close	()V
    //   64: aload_0
    //   65: invokevirtual 169	android/os/ParcelFileDescriptor:close	()V
    //   68: aload_2
    //   69: areturn
    //   70: astore_2
    //   71: aload_1
    //   72: invokevirtual 199	java/io/FileInputStream:close	()V
    //   75: goto +9 -> 84
    //   78: astore_1
    //   79: aload_2
    //   80: aload_1
    //   81: invokevirtual 203	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   84: aload_2
    //   85: athrow
    //   86: astore_1
    //   87: aload_0
    //   88: invokevirtual 169	android/os/ParcelFileDescriptor:close	()V
    //   91: goto +9 -> 100
    //   94: astore_0
    //   95: aload_1
    //   96: aload_0
    //   97: invokevirtual 203	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   100: aload_1
    //   101: athrow
    //   102: astore_0
    //   103: aconst_null
    //   104: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	paramContext	Context
    //   0	105	1	paramCancellationSignal	CancellationSignal
    //   0	105	2	paramUri	Uri
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
  
  /* Error */
  @Nullable
  @RequiresApi(19)
  private static ByteBuffer mmap(File paramFile)
  {
    // Byte code:
    //   0: new 171	java/io/FileInputStream
    //   3: astore_1
    //   4: aload_1
    //   5: aload_0
    //   6: invokespecial 206	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   9: aload_1
    //   10: invokevirtual 182	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   13: astore_0
    //   14: aload_0
    //   15: invokevirtual 188	java/nio/channels/FileChannel:size	()J
    //   18: lstore_2
    //   19: aload_0
    //   20: getstatic 194	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   23: lconst_0
    //   24: lload_2
    //   25: invokevirtual 198	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   28: astore_0
    //   29: aload_1
    //   30: invokevirtual 199	java/io/FileInputStream:close	()V
    //   33: aload_0
    //   34: areturn
    //   35: astore_0
    //   36: aload_1
    //   37: invokevirtual 199	java/io/FileInputStream:close	()V
    //   40: goto +9 -> 49
    //   43: astore_1
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual 203	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
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
  
  @NonNull
  @RequiresApi(19)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static Map<Uri, ByteBuffer> readFontInfoIntoByteBuffer(@NonNull Context paramContext, @NonNull FontsContractCompat.FontInfo[] paramArrayOfFontInfo, @Nullable CancellationSignal paramCancellationSignal)
  {
    HashMap localHashMap = new HashMap();
    int i = paramArrayOfFontInfo.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramArrayOfFontInfo[j];
      if (((FontsContractCompat.FontInfo)localObject).getResultCode() == 0)
      {
        localObject = ((FontsContractCompat.FontInfo)localObject).getUri();
        if (!localHashMap.containsKey(localObject)) {
          localHashMap.put(localObject, mmap(paramContext, paramCancellationSignal, (Uri)localObject));
        }
      }
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static ParcelFileDescriptor openFileDescriptor(ContentResolver paramContentResolver, Uri paramUri, String paramString, CancellationSignal paramCancellationSignal)
      throws FileNotFoundException
    {
      return paramContentResolver.openFileDescriptor(paramUri, paramString, paramCancellationSignal);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.TypefaceCompatUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
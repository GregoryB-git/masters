package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.OutputStream;
import z2;

class UrlRedirectCache
{
  private static final String REDIRECT_CONTENT_TAG = z2.o("UrlRedirectCache", "_Redirect");
  public static final String TAG = "UrlRedirectCache";
  private static FileLruCache urlRedirectCache;
  
  public static void cacheUriRedirect(Uri paramUri1, Uri paramUri2)
  {
    Uri localUri2;
    if ((paramUri1 != null) && (paramUri2 != null))
    {
      localUri1 = null;
      localUri2 = null;
    }
    try
    {
      try
      {
        paramUri1 = getCache().openPutStream(paramUri1.toString(), REDIRECT_CONTENT_TAG);
        localUri2 = paramUri1;
        localUri1 = paramUri1;
        paramUri1.write(paramUri2.toString().getBytes());
      }
      finally
      {
        Utility.closeQuietly(localUri2);
      }
    }
    catch (IOException paramUri1)
    {
      for (;;)
      {
        paramUri1 = localUri1;
      }
    }
    Utility.closeQuietly(paramUri1);
  }
  
  public static void clearCache()
  {
    try
    {
      getCache().clearCache();
    }
    catch (IOException localIOException)
    {
      LoggingBehavior localLoggingBehavior = LoggingBehavior.CACHE;
      String str = TAG;
      StringBuilder localStringBuilder = z2.t("clearCache failed ");
      localStringBuilder.append(localIOException.getMessage());
      Logger.log(localLoggingBehavior, 5, str, localStringBuilder.toString());
    }
  }
  
  public static FileLruCache getCache()
    throws IOException
  {
    try
    {
      if (urlRedirectCache == null)
      {
        localFileLruCache = new com/facebook/internal/FileLruCache;
        String str = TAG;
        FileLruCache.Limits localLimits = new com/facebook/internal/FileLruCache$Limits;
        localLimits.<init>();
        localFileLruCache.<init>(str, localLimits);
        urlRedirectCache = localFileLruCache;
      }
      FileLruCache localFileLruCache = urlRedirectCache;
      return localFileLruCache;
    }
    finally {}
  }
  
  /* Error */
  public static Uri getRedirectedUri(Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: invokevirtual 41	android/net/Uri:toString	()Ljava/lang/String;
    //   10: astore_1
    //   11: invokestatic 35	com/facebook/internal/UrlRedirectCache:getCache	()Lcom/facebook/internal/FileLruCache;
    //   14: astore_2
    //   15: aconst_null
    //   16: astore_0
    //   17: iconst_0
    //   18: istore_3
    //   19: aload_2
    //   20: aload_1
    //   21: getstatic 23	com/facebook/internal/UrlRedirectCache:REDIRECT_CONTENT_TAG	Ljava/lang/String;
    //   24: invokevirtual 114	com/facebook/internal/FileLruCache:get	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    //   27: astore 4
    //   29: aload 4
    //   31: ifnull +84 -> 115
    //   34: iconst_1
    //   35: istore_3
    //   36: new 116	java/io/InputStreamReader
    //   39: astore 5
    //   41: aload 5
    //   43: aload 4
    //   45: invokespecial 119	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   48: sipush 128
    //   51: newarray <illegal type>
    //   53: astore_1
    //   54: new 89	java/lang/StringBuilder
    //   57: astore_0
    //   58: aload_0
    //   59: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   62: aload 5
    //   64: aload_1
    //   65: iconst_0
    //   66: sipush 128
    //   69: invokevirtual 124	java/io/InputStreamReader:read	([CII)I
    //   72: istore 6
    //   74: iload 6
    //   76: ifle +15 -> 91
    //   79: aload_0
    //   80: aload_1
    //   81: iconst_0
    //   82: iload 6
    //   84: invokevirtual 127	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: goto -26 -> 62
    //   91: aload 5
    //   93: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   96: aload_0
    //   97: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: astore_1
    //   101: aload 5
    //   103: astore_0
    //   104: goto -85 -> 19
    //   107: astore_0
    //   108: goto +40 -> 148
    //   111: astore_0
    //   112: goto +47 -> 159
    //   115: aload_0
    //   116: astore 5
    //   118: iload_3
    //   119: ifeq +40 -> 159
    //   122: aload_1
    //   123: invokestatic 131	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   126: astore 5
    //   128: aload_0
    //   129: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   132: aload 5
    //   134: areturn
    //   135: astore_1
    //   136: aload_0
    //   137: astore 5
    //   139: aload_1
    //   140: astore_0
    //   141: goto +7 -> 148
    //   144: astore_0
    //   145: aconst_null
    //   146: astore 5
    //   148: aload 5
    //   150: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   153: aload_0
    //   154: athrow
    //   155: astore_0
    //   156: aconst_null
    //   157: astore 5
    //   159: aload 5
    //   161: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   164: aconst_null
    //   165: areturn
    //   166: astore 5
    //   168: aload_0
    //   169: astore 5
    //   171: goto -12 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	paramUri	Uri
    //   10	113	1	localObject1	Object
    //   135	5	1	localObject2	Object
    //   14	6	2	localFileLruCache	FileLruCache
    //   18	101	3	i	int
    //   27	17	4	localInputStream	java.io.InputStream
    //   39	121	5	localObject3	Object
    //   166	1	5	localIOException	IOException
    //   169	1	5	localUri	Uri
    //   72	11	6	j	int
    // Exception table:
    //   from	to	target	type
    //   48	62	107	finally
    //   62	74	107	finally
    //   79	88	107	finally
    //   91	101	107	finally
    //   48	62	111	java/io/IOException
    //   62	74	111	java/io/IOException
    //   79	88	111	java/io/IOException
    //   91	101	111	java/io/IOException
    //   19	29	135	finally
    //   36	48	135	finally
    //   122	128	135	finally
    //   11	15	144	finally
    //   11	15	155	java/io/IOException
    //   19	29	166	java/io/IOException
    //   36	48	166	java/io/IOException
    //   122	128	166	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.UrlRedirectCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
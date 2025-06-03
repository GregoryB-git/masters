package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import z2;

class ImageResponseCache
{
  public static final String TAG = "ImageResponseCache";
  private static FileLruCache imageCache;
  
  public static void clearCache(Context paramContext)
  {
    try
    {
      getCache(paramContext).clearCache();
    }
    catch (IOException paramContext)
    {
      LoggingBehavior localLoggingBehavior = LoggingBehavior.CACHE;
      String str = TAG;
      StringBuilder localStringBuilder = z2.t("clearCache failed ");
      localStringBuilder.append(paramContext.getMessage());
      Logger.log(localLoggingBehavior, 5, str, localStringBuilder.toString());
    }
  }
  
  public static FileLruCache getCache(Context paramContext)
    throws IOException
  {
    try
    {
      if (imageCache == null)
      {
        paramContext = new com/facebook/internal/FileLruCache;
        String str = TAG;
        FileLruCache.Limits localLimits = new com/facebook/internal/FileLruCache$Limits;
        localLimits.<init>();
        paramContext.<init>(str, localLimits);
        imageCache = paramContext;
      }
      paramContext = imageCache;
      return paramContext;
    }
    finally {}
  }
  
  public static InputStream getCachedImageStream(Uri paramUri, Context paramContext)
  {
    if ((paramUri != null) && (isCDNURL(paramUri))) {
      try
      {
        paramUri = getCache(paramContext).get(paramUri.toString());
      }
      catch (IOException paramUri)
      {
        Logger.log(LoggingBehavior.CACHE, 5, TAG, paramUri.toString());
      }
    } else {
      paramUri = null;
    }
    return paramUri;
  }
  
  public static InputStream interceptAndCacheImageStream(Context paramContext, HttpURLConnection paramHttpURLConnection)
    throws IOException
  {
    Object localObject1;
    if (paramHttpURLConnection.getResponseCode() == 200)
    {
      localObject1 = Uri.parse(paramHttpURLConnection.getURL().toString());
      localInputStream = paramHttpURLConnection.getInputStream();
      localObject2 = localInputStream;
    }
    try
    {
      if (!isCDNURL((Uri)localObject1)) {
        break label72;
      }
      paramContext = getCache(paramContext);
      localObject2 = ((Uri)localObject1).toString();
      localObject1 = new com/facebook/internal/ImageResponseCache$BufferedHttpInputStream;
      ((BufferedHttpInputStream)localObject1).<init>(localInputStream, paramHttpURLConnection);
      localObject2 = paramContext.interceptAndPut((String)localObject2, (InputStream)localObject1);
    }
    catch (IOException paramContext)
    {
      for (;;)
      {
        label72:
        localObject2 = localInputStream;
      }
    }
    localObject2 = null;
    return (InputStream)localObject2;
  }
  
  private static boolean isCDNURL(Uri paramUri)
  {
    if (paramUri != null)
    {
      paramUri = paramUri.getHost();
      if (paramUri.endsWith("fbcdn.net")) {
        return true;
      }
      if ((paramUri.startsWith("fbcdn")) && (paramUri.endsWith("akamaihd.net"))) {
        return true;
      }
    }
    return false;
  }
  
  public static class BufferedHttpInputStream
    extends BufferedInputStream
  {
    public HttpURLConnection connection;
    
    public BufferedHttpInputStream(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection)
    {
      super(8192);
      connection = paramHttpURLConnection;
    }
    
    public void close()
      throws IOException
    {
      super.close();
      Utility.disconnectQuietly(connection);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ImageResponseCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
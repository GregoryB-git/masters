package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.Closeable;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ImageDownloader
{
  private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
  private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;
  private static WorkQueue cacheReadQueue = new WorkQueue(2);
  private static WorkQueue downloadQueue = new WorkQueue(8);
  private static Handler handler;
  private static final Map<RequestKey, DownloaderContext> pendingRequests = new HashMap();
  
  public static boolean cancelRequest(ImageRequest arg0)
  {
    RequestKey localRequestKey = new RequestKey(???.getImageUri(), ???.getCallerTag());
    synchronized (pendingRequests)
    {
      DownloaderContext localDownloaderContext = (DownloaderContext)???.get(localRequestKey);
      boolean bool = true;
      if (localDownloaderContext != null)
      {
        if (workItem.cancel()) {
          ???.remove(localRequestKey);
        } else {
          isCancelled = true;
        }
      }
      else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static void clearCache(Context paramContext)
  {
    ImageResponseCache.clearCache(paramContext);
    UrlRedirectCache.clearCache();
  }
  
  /* Error */
  private static void download(RequestKey paramRequestKey, Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: iconst_1
    //   8: istore 5
    //   10: iconst_1
    //   11: istore 6
    //   13: new 113	java/net/URL
    //   16: astore 7
    //   18: aload 7
    //   20: aload_0
    //   21: getfield 117	com/facebook/internal/ImageDownloader$RequestKey:uri	Landroid/net/Uri;
    //   24: invokevirtual 123	android/net/Uri:toString	()Ljava/lang/String;
    //   27: invokespecial 126	java/net/URL:<init>	(Ljava/lang/String;)V
    //   30: aload 7
    //   32: invokevirtual 130	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   35: checkcast 132	java/net/HttpURLConnection
    //   38: astore 7
    //   40: aload 7
    //   42: iconst_0
    //   43: invokevirtual 136	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   46: aload 7
    //   48: invokevirtual 140	java/net/HttpURLConnection:getResponseCode	()I
    //   51: istore 8
    //   53: iload 8
    //   55: sipush 200
    //   58: if_icmpeq +286 -> 344
    //   61: iload 8
    //   63: sipush 301
    //   66: if_icmpeq +182 -> 248
    //   69: iload 8
    //   71: sipush 302
    //   74: if_icmpeq +174 -> 248
    //   77: aload 7
    //   79: invokevirtual 144	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   82: astore 4
    //   84: aload 4
    //   86: astore_1
    //   87: aload 4
    //   89: astore_2
    //   90: new 146	java/lang/StringBuilder
    //   93: astore 9
    //   95: aload 4
    //   97: astore_1
    //   98: aload 4
    //   100: astore_2
    //   101: aload 9
    //   103: invokespecial 147	java/lang/StringBuilder:<init>	()V
    //   106: aload 4
    //   108: ifnull +98 -> 206
    //   111: aload 4
    //   113: astore_1
    //   114: aload 4
    //   116: astore_2
    //   117: new 149	java/io/InputStreamReader
    //   120: astore 10
    //   122: aload 4
    //   124: astore_1
    //   125: aload 4
    //   127: astore_2
    //   128: aload 10
    //   130: aload 4
    //   132: invokespecial 152	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   135: aload 4
    //   137: astore_1
    //   138: aload 4
    //   140: astore_2
    //   141: sipush 128
    //   144: newarray <illegal type>
    //   146: astore 11
    //   148: aload 4
    //   150: astore_1
    //   151: aload 4
    //   153: astore_2
    //   154: aload 10
    //   156: aload 11
    //   158: iconst_0
    //   159: sipush 128
    //   162: invokevirtual 156	java/io/InputStreamReader:read	([CII)I
    //   165: istore 8
    //   167: iload 8
    //   169: ifle +23 -> 192
    //   172: aload 4
    //   174: astore_1
    //   175: aload 4
    //   177: astore_2
    //   178: aload 9
    //   180: aload 11
    //   182: iconst_0
    //   183: iload 8
    //   185: invokevirtual 160	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: goto -41 -> 148
    //   192: aload 4
    //   194: astore_1
    //   195: aload 4
    //   197: astore_2
    //   198: aload 10
    //   200: invokestatic 166	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   203: goto +17 -> 220
    //   206: aload 4
    //   208: astore_1
    //   209: aload 4
    //   211: astore_2
    //   212: aload 9
    //   214: ldc -88
    //   216: invokevirtual 171	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload 4
    //   222: astore_1
    //   223: aload 4
    //   225: astore_2
    //   226: new 173	com/facebook/FacebookException
    //   229: dup
    //   230: aload 9
    //   232: invokevirtual 174	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   235: invokespecial 175	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   238: astore 9
    //   240: aconst_null
    //   241: astore_1
    //   242: aload 9
    //   244: astore_2
    //   245: goto +125 -> 370
    //   248: aload 7
    //   250: ldc -79
    //   252: invokevirtual 183	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   255: astore_1
    //   256: aload_1
    //   257: invokestatic 187	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   260: ifne +65 -> 325
    //   263: aload_1
    //   264: invokestatic 191	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   267: astore_1
    //   268: aload_0
    //   269: getfield 117	com/facebook/internal/ImageDownloader$RequestKey:uri	Landroid/net/Uri;
    //   272: aload_1
    //   273: invokestatic 195	com/facebook/internal/UrlRedirectCache:cacheUriRedirect	(Landroid/net/Uri;Landroid/net/Uri;)V
    //   276: aload_0
    //   277: invokestatic 199	com/facebook/internal/ImageDownloader:removePendingRequest	(Lcom/facebook/internal/ImageDownloader$RequestKey;)Lcom/facebook/internal/ImageDownloader$DownloaderContext;
    //   280: astore 9
    //   282: aload 9
    //   284: ifnull +41 -> 325
    //   287: aload 9
    //   289: getfield 99	com/facebook/internal/ImageDownloader$DownloaderContext:isCancelled	Z
    //   292: ifne +33 -> 325
    //   295: aload 9
    //   297: getfield 203	com/facebook/internal/ImageDownloader$DownloaderContext:request	Lcom/facebook/internal/ImageRequest;
    //   300: astore 11
    //   302: new 17	com/facebook/internal/ImageDownloader$RequestKey
    //   305: astore 9
    //   307: aload 9
    //   309: aload_1
    //   310: aload_0
    //   311: getfield 207	com/facebook/internal/ImageDownloader$RequestKey:tag	Ljava/lang/Object;
    //   314: invokespecial 76	com/facebook/internal/ImageDownloader$RequestKey:<init>	(Landroid/net/Uri;Ljava/lang/Object;)V
    //   317: aload 11
    //   319: aload 9
    //   321: iconst_0
    //   322: invokestatic 211	com/facebook/internal/ImageDownloader:enqueueCacheRead	(Lcom/facebook/internal/ImageRequest;Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V
    //   325: aconst_null
    //   326: astore_1
    //   327: aload_1
    //   328: astore_2
    //   329: iconst_0
    //   330: istore 6
    //   332: goto +38 -> 370
    //   335: astore_1
    //   336: aconst_null
    //   337: astore_2
    //   338: iconst_0
    //   339: istore 6
    //   341: goto +97 -> 438
    //   344: aload_1
    //   345: aload 7
    //   347: invokestatic 215	com/facebook/internal/ImageResponseCache:interceptAndCacheImageStream	(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    //   350: astore 4
    //   352: aload 4
    //   354: astore_1
    //   355: aload 4
    //   357: astore_2
    //   358: aload 4
    //   360: invokestatic 221	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   363: astore 9
    //   365: aconst_null
    //   366: astore_2
    //   367: aload 9
    //   369: astore_1
    //   370: aload 4
    //   372: invokestatic 166	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   375: aload 7
    //   377: invokestatic 225	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   380: goto +71 -> 451
    //   383: astore_0
    //   384: goto +33 -> 417
    //   387: astore_1
    //   388: iload 5
    //   390: istore 6
    //   392: goto +46 -> 438
    //   395: astore_0
    //   396: aload_2
    //   397: astore_1
    //   398: goto +19 -> 417
    //   401: astore_1
    //   402: aconst_null
    //   403: astore_2
    //   404: iload 5
    //   406: istore 6
    //   408: goto +30 -> 438
    //   411: astore_0
    //   412: aconst_null
    //   413: astore 7
    //   415: aload_2
    //   416: astore_1
    //   417: aload_1
    //   418: invokestatic 166	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   421: aload 7
    //   423: invokestatic 225	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   426: aload_0
    //   427: athrow
    //   428: astore_1
    //   429: aconst_null
    //   430: astore_2
    //   431: aload_2
    //   432: astore 7
    //   434: iload 5
    //   436: istore 6
    //   438: aload_2
    //   439: invokestatic 166	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   442: aload 7
    //   444: invokestatic 225	com/facebook/internal/Utility:disconnectQuietly	(Ljava/net/URLConnection;)V
    //   447: aload_1
    //   448: astore_2
    //   449: aload_3
    //   450: astore_1
    //   451: iload 6
    //   453: ifeq +10 -> 463
    //   456: aload_0
    //   457: aload_2
    //   458: aload_1
    //   459: iconst_0
    //   460: invokestatic 229	com/facebook/internal/ImageDownloader:issueResponse	(Lcom/facebook/internal/ImageDownloader$RequestKey;Ljava/lang/Exception;Landroid/graphics/Bitmap;Z)V
    //   463: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	464	0	paramRequestKey	RequestKey
    //   0	464	1	paramContext	Context
    //   1	457	2	localObject1	Object
    //   3	447	3	localObject2	Object
    //   5	366	4	localInputStream	InputStream
    //   8	427	5	i	int
    //   11	441	6	j	int
    //   16	427	7	localObject3	Object
    //   51	133	8	k	int
    //   93	275	9	localObject4	Object
    //   120	79	10	localInputStreamReader	java.io.InputStreamReader
    //   146	172	11	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   248	282	335	java/io/IOException
    //   287	325	335	java/io/IOException
    //   90	95	383	finally
    //   101	106	383	finally
    //   117	122	383	finally
    //   128	135	383	finally
    //   141	148	383	finally
    //   154	167	383	finally
    //   178	189	383	finally
    //   198	203	383	finally
    //   212	220	383	finally
    //   226	240	383	finally
    //   358	365	383	finally
    //   90	95	387	java/io/IOException
    //   101	106	387	java/io/IOException
    //   117	122	387	java/io/IOException
    //   128	135	387	java/io/IOException
    //   141	148	387	java/io/IOException
    //   154	167	387	java/io/IOException
    //   178	189	387	java/io/IOException
    //   198	203	387	java/io/IOException
    //   212	220	387	java/io/IOException
    //   226	240	387	java/io/IOException
    //   358	365	387	java/io/IOException
    //   40	53	395	finally
    //   77	84	395	finally
    //   248	282	395	finally
    //   287	325	395	finally
    //   344	352	395	finally
    //   40	53	401	java/io/IOException
    //   77	84	401	java/io/IOException
    //   344	352	401	java/io/IOException
    //   13	40	411	finally
    //   13	40	428	java/io/IOException
  }
  
  public static void downloadAsync(ImageRequest paramImageRequest)
  {
    if (paramImageRequest == null) {
      return;
    }
    RequestKey localRequestKey = new RequestKey(paramImageRequest.getImageUri(), paramImageRequest.getCallerTag());
    synchronized (pendingRequests)
    {
      DownloaderContext localDownloaderContext = (DownloaderContext)???.get(localRequestKey);
      if (localDownloaderContext != null)
      {
        request = paramImageRequest;
        isCancelled = false;
        workItem.moveToFront();
      }
      else
      {
        enqueueCacheRead(paramImageRequest, localRequestKey, paramImageRequest.isCachedRedirectAllowed());
      }
      return;
    }
  }
  
  private static void enqueueCacheRead(ImageRequest paramImageRequest, RequestKey paramRequestKey, boolean paramBoolean)
  {
    enqueueRequest(paramImageRequest, paramRequestKey, cacheReadQueue, new CacheReadWorkItem(paramImageRequest.getContext(), paramRequestKey, paramBoolean));
  }
  
  private static void enqueueDownload(ImageRequest paramImageRequest, RequestKey paramRequestKey)
  {
    enqueueRequest(paramImageRequest, paramRequestKey, downloadQueue, new DownloadImageWorkItem(paramImageRequest.getContext(), paramRequestKey));
  }
  
  private static void enqueueRequest(ImageRequest paramImageRequest, RequestKey paramRequestKey, WorkQueue paramWorkQueue, Runnable paramRunnable)
  {
    synchronized (pendingRequests)
    {
      DownloaderContext localDownloaderContext = new com/facebook/internal/ImageDownloader$DownloaderContext;
      localDownloaderContext.<init>(null);
      request = paramImageRequest;
      ???.put(paramRequestKey, localDownloaderContext);
      workItem = paramWorkQueue.addActiveWorkItem(paramRunnable);
      return;
    }
  }
  
  private static Handler getHandler()
  {
    try
    {
      if (handler == null)
      {
        localHandler = new android/os/Handler;
        localHandler.<init>(Looper.getMainLooper());
        handler = localHandler;
      }
      Handler localHandler = handler;
      return localHandler;
    }
    finally {}
  }
  
  private static void issueResponse(RequestKey paramRequestKey, final Exception paramException, final Bitmap paramBitmap, final boolean paramBoolean)
  {
    paramRequestKey = removePendingRequest(paramRequestKey);
    if ((paramRequestKey != null) && (!isCancelled))
    {
      paramRequestKey = request;
      final ImageRequest.Callback localCallback = paramRequestKey.getCallback();
      if (localCallback != null) {
        getHandler().post(new Runnable()
        {
          public void run()
          {
            if (CrashShieldHandler.isObjectCrashing(this)) {
              return;
            }
            try
            {
              ImageResponse localImageResponse = new com/facebook/internal/ImageResponse;
              localImageResponse.<init>(val$request, paramException, paramBoolean, paramBitmap);
              localCallback.onCompleted(localImageResponse);
              return;
            }
            finally
            {
              CrashShieldHandler.handleThrowable(localThrowable, this);
            }
          }
        });
      }
    }
  }
  
  public static void prioritizeRequest(ImageRequest arg0)
  {
    Object localObject1 = new RequestKey(???.getImageUri(), ???.getCallerTag());
    synchronized (pendingRequests)
    {
      localObject1 = (DownloaderContext)???.get(localObject1);
      if (localObject1 != null) {
        workItem.moveToFront();
      }
      return;
    }
  }
  
  private static void readFromCache(RequestKey paramRequestKey, Context paramContext, boolean paramBoolean)
  {
    boolean bool = false;
    if (paramBoolean)
    {
      localObject = UrlRedirectCache.getRedirectedUri(uri);
      if (localObject != null)
      {
        InputStream localInputStream = ImageResponseCache.getCachedImageStream((Uri)localObject, paramContext);
        paramBoolean = bool;
        localObject = localInputStream;
        if (localInputStream == null) {
          break label53;
        }
        paramBoolean = true;
        localObject = localInputStream;
        break label53;
      }
    }
    Object localObject = null;
    paramBoolean = bool;
    label53:
    if (!paramBoolean) {
      localObject = ImageResponseCache.getCachedImageStream(uri, paramContext);
    }
    if (localObject != null)
    {
      paramContext = BitmapFactory.decodeStream((InputStream)localObject);
      Utility.closeQuietly((Closeable)localObject);
      issueResponse(paramRequestKey, null, paramContext, paramBoolean);
    }
    else
    {
      paramContext = removePendingRequest(paramRequestKey);
      if ((paramContext != null) && (!isCancelled)) {
        enqueueDownload(request, paramRequestKey);
      }
    }
  }
  
  private static DownloaderContext removePendingRequest(RequestKey paramRequestKey)
  {
    synchronized (pendingRequests)
    {
      paramRequestKey = (DownloaderContext)???.remove(paramRequestKey);
      return paramRequestKey;
    }
  }
  
  public static class CacheReadWorkItem
    implements Runnable
  {
    private boolean allowCachedRedirects;
    private Context context;
    private ImageDownloader.RequestKey key;
    
    public CacheReadWorkItem(Context paramContext, ImageDownloader.RequestKey paramRequestKey, boolean paramBoolean)
    {
      context = paramContext;
      key = paramRequestKey;
      allowCachedRedirects = paramBoolean;
    }
    
    public void run()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        ImageDownloader.access$100(key, context, allowCachedRedirects);
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
    }
  }
  
  public static class DownloadImageWorkItem
    implements Runnable
  {
    private Context context;
    private ImageDownloader.RequestKey key;
    
    public DownloadImageWorkItem(Context paramContext, ImageDownloader.RequestKey paramRequestKey)
    {
      context = paramContext;
      key = paramRequestKey;
    }
    
    public void run()
    {
      if (CrashShieldHandler.isObjectCrashing(this)) {
        return;
      }
      try
      {
        ImageDownloader.access$200(key, context);
        return;
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
    }
  }
  
  public static class DownloaderContext
  {
    public boolean isCancelled;
    public ImageRequest request;
    public WorkQueue.WorkItem workItem;
  }
  
  public static class RequestKey
  {
    private static final int HASH_MULTIPLIER = 37;
    private static final int HASH_SEED = 29;
    public Object tag;
    public Uri uri;
    
    public RequestKey(Uri paramUri, Object paramObject)
    {
      uri = paramUri;
      tag = paramObject;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (paramObject != null)
      {
        bool2 = bool1;
        if ((paramObject instanceof RequestKey))
        {
          paramObject = (RequestKey)paramObject;
          bool2 = bool1;
          if (uri == uri)
          {
            bool2 = bool1;
            if (tag == tag) {
              bool2 = true;
            }
          }
        }
      }
      return bool2;
    }
    
    public int hashCode()
    {
      int i = uri.hashCode();
      return tag.hashCode() + (i + 1073) * 37;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ImageDownloader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
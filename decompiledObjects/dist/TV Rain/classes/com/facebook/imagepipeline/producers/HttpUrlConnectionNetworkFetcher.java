package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HttpUrlConnectionNetworkFetcher
  extends BaseNetworkFetcher<FetchState>
{
  public static final int HTTP_PERMANENT_REDIRECT = 308;
  public static final int HTTP_TEMPORARY_REDIRECT = 307;
  private static final int MAX_REDIRECTS = 5;
  private static final int NUM_NETWORK_THREADS = 3;
  private final ExecutorService mExecutorService;
  
  public HttpUrlConnectionNetworkFetcher()
  {
    this(Executors.newFixedThreadPool(3));
  }
  
  @VisibleForTesting
  public HttpUrlConnectionNetworkFetcher(ExecutorService paramExecutorService)
  {
    mExecutorService = paramExecutorService;
  }
  
  private HttpURLConnection downloadFrom(Uri paramUri, int paramInt)
    throws IOException
  {
    Object localObject1 = openConnectionTo(paramUri);
    int i = ((HttpURLConnection)localObject1).getResponseCode();
    if (isHttpSuccess(i)) {
      return (HttpURLConnection)localObject1;
    }
    if (isHttpRedirect(i))
    {
      Object localObject2 = ((URLConnection)localObject1).getHeaderField("Location");
      ((HttpURLConnection)localObject1).disconnect();
      if (localObject2 == null) {
        localObject2 = null;
      } else {
        localObject2 = Uri.parse((String)localObject2);
      }
      localObject1 = paramUri.getScheme();
      if ((paramInt > 0) && (localObject2 != null) && (!((Uri)localObject2).getScheme().equals(localObject1))) {
        return downloadFrom((Uri)localObject2, paramInt - 1);
      }
      if (paramInt == 0) {
        paramUri = error("URL %s follows too many redirects", new Object[] { paramUri.toString() });
      } else {
        paramUri = error("URL %s returned %d without a valid redirect", new Object[] { paramUri.toString(), Integer.valueOf(i) });
      }
      throw new IOException(paramUri);
    }
    ((HttpURLConnection)localObject1).disconnect();
    throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[] { paramUri.toString(), Integer.valueOf(i) }));
  }
  
  private static String error(String paramString, Object... paramVarArgs)
  {
    return String.format(Locale.getDefault(), paramString, paramVarArgs);
  }
  
  private static boolean isHttpRedirect(int paramInt)
  {
    if ((paramInt != 307) && (paramInt != 308)) {
      switch (paramInt)
      {
      default: 
        return false;
      }
    }
    return true;
  }
  
  private static boolean isHttpSuccess(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 200) && (paramInt < 300)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @VisibleForTesting
  public static HttpURLConnection openConnectionTo(Uri paramUri)
    throws IOException
  {
    return (HttpURLConnection)UriUtil.uriToUrl(paramUri).openConnection();
  }
  
  public FetchState createFetchState(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    return new FetchState(paramConsumer, paramProducerContext);
  }
  
  public void fetch(final FetchState paramFetchState, final NetworkFetcher.Callback paramCallback)
  {
    final Future localFuture = mExecutorService.submit(new Runnable()
    {
      public void run()
      {
        fetchSync(paramFetchState, paramCallback);
      }
    });
    paramFetchState.getContext().addCallbacks(new BaseProducerContextCallbacks()
    {
      public void onCancellationRequested()
      {
        if (localFuture.cancel(false)) {
          paramCallback.onCancellation();
        }
      }
    });
  }
  
  /* Error */
  @VisibleForTesting
  public void fetchSync(FetchState paramFetchState, NetworkFetcher.Callback paramCallback)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: aconst_null
    //   9: astore 6
    //   11: aconst_null
    //   12: astore 7
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 175	com/facebook/imagepipeline/producers/FetchState:getUri	()Landroid/net/Uri;
    //   19: iconst_5
    //   20: invokespecial 88	com/facebook/imagepipeline/producers/HttpUrlConnectionNetworkFetcher:downloadFrom	(Landroid/net/Uri;I)Ljava/net/HttpURLConnection;
    //   23: astore 8
    //   25: aload 8
    //   27: ifnull +44 -> 71
    //   30: aload 7
    //   32: astore 4
    //   34: aload 5
    //   36: astore_1
    //   37: aload 8
    //   39: astore 6
    //   41: aload 8
    //   43: invokevirtual 179	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   46: astore_3
    //   47: aload_3
    //   48: astore 4
    //   50: aload_3
    //   51: astore_1
    //   52: aload 8
    //   54: astore 6
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_m1
    //   59: invokeinterface 185 3 0
    //   64: goto +7 -> 71
    //   67: astore_3
    //   68: goto +37 -> 105
    //   71: aload_3
    //   72: ifnull +7 -> 79
    //   75: aload_3
    //   76: invokevirtual 190	java/io/InputStream:close	()V
    //   79: aload 8
    //   81: ifnull +58 -> 139
    //   84: goto +50 -> 134
    //   87: astore_2
    //   88: aconst_null
    //   89: astore 8
    //   91: aload 6
    //   93: astore_1
    //   94: aload 8
    //   96: astore 6
    //   98: goto +43 -> 141
    //   101: astore_3
    //   102: aconst_null
    //   103: astore 8
    //   105: aload 4
    //   107: astore_1
    //   108: aload 8
    //   110: astore 6
    //   112: aload_2
    //   113: aload_3
    //   114: invokeinterface 194 2 0
    //   119: aload 4
    //   121: ifnull +8 -> 129
    //   124: aload 4
    //   126: invokevirtual 190	java/io/InputStream:close	()V
    //   129: aload 8
    //   131: ifnull +8 -> 139
    //   134: aload 8
    //   136: invokevirtual 70	java/net/HttpURLConnection:disconnect	()V
    //   139: return
    //   140: astore_2
    //   141: aload_1
    //   142: ifnull +7 -> 149
    //   145: aload_1
    //   146: invokevirtual 190	java/io/InputStream:close	()V
    //   149: aload 6
    //   151: ifnull +8 -> 159
    //   154: aload 6
    //   156: invokevirtual 70	java/net/HttpURLConnection:disconnect	()V
    //   159: aload_2
    //   160: athrow
    //   161: astore_1
    //   162: goto -83 -> 79
    //   165: astore_1
    //   166: goto -37 -> 129
    //   169: astore_1
    //   170: goto -21 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	HttpUrlConnectionNetworkFetcher
    //   0	173	1	paramFetchState	FetchState
    //   0	173	2	paramCallback	NetworkFetcher.Callback
    //   1	57	3	localInputStream	java.io.InputStream
    //   67	9	3	localIOException1	IOException
    //   101	13	3	localIOException2	IOException
    //   3	122	4	localObject1	Object
    //   6	29	5	localObject2	Object
    //   9	146	6	localObject3	Object
    //   12	19	7	localObject4	Object
    //   23	112	8	localHttpURLConnection	HttpURLConnection
    // Exception table:
    //   from	to	target	type
    //   41	47	67	java/io/IOException
    //   56	64	67	java/io/IOException
    //   14	25	87	finally
    //   14	25	101	java/io/IOException
    //   41	47	140	finally
    //   56	64	140	finally
    //   112	119	140	finally
    //   75	79	161	java/io/IOException
    //   124	129	165	java/io/IOException
    //   145	149	169	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
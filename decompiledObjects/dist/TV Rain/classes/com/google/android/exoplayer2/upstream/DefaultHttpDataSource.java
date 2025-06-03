package com.google.android.exoplayer2.upstream;

import a;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Predicate;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public class DefaultHttpDataSource
  extends BaseDataSource
  implements HttpDataSource
{
  private static final Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
  public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
  private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
  private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
  private static final long MAX_BYTES_TO_DRAIN = 2048L;
  private static final int MAX_REDIRECTS = 20;
  private static final String TAG = "DefaultHttpDataSource";
  private static final AtomicReference<byte[]> skipBufferReference = new AtomicReference();
  private final boolean allowCrossProtocolRedirects;
  private long bytesRead;
  private long bytesSkipped;
  private long bytesToRead;
  private long bytesToSkip;
  private final int connectTimeoutMillis;
  @Nullable
  private HttpURLConnection connection;
  @Nullable
  private final Predicate<String> contentTypePredicate;
  @Nullable
  private DataSpec dataSpec;
  @Nullable
  private final HttpDataSource.RequestProperties defaultRequestProperties;
  @Nullable
  private InputStream inputStream;
  private boolean opened;
  private final int readTimeoutMillis;
  private final HttpDataSource.RequestProperties requestProperties;
  private final String userAgent;
  
  public DefaultHttpDataSource(String paramString, @Nullable Predicate<String> paramPredicate)
  {
    this(paramString, paramPredicate, 8000, 8000);
  }
  
  public DefaultHttpDataSource(String paramString, @Nullable Predicate<String> paramPredicate, int paramInt1, int paramInt2)
  {
    this(paramString, paramPredicate, paramInt1, paramInt2, false, null);
  }
  
  public DefaultHttpDataSource(String paramString, @Nullable Predicate<String> paramPredicate, int paramInt1, int paramInt2, boolean paramBoolean, @Nullable HttpDataSource.RequestProperties paramRequestProperties)
  {
    super(true);
    userAgent = Assertions.checkNotEmpty(paramString);
    contentTypePredicate = paramPredicate;
    requestProperties = new HttpDataSource.RequestProperties();
    connectTimeoutMillis = paramInt1;
    readTimeoutMillis = paramInt2;
    allowCrossProtocolRedirects = paramBoolean;
    defaultRequestProperties = paramRequestProperties;
  }
  
  @Deprecated
  public DefaultHttpDataSource(String paramString, @Nullable Predicate<String> paramPredicate, @Nullable TransferListener paramTransferListener)
  {
    this(paramString, paramPredicate, paramTransferListener, 8000, 8000);
  }
  
  @Deprecated
  public DefaultHttpDataSource(String paramString, @Nullable Predicate<String> paramPredicate, @Nullable TransferListener paramTransferListener, int paramInt1, int paramInt2)
  {
    this(paramString, paramPredicate, paramTransferListener, paramInt1, paramInt2, false, null);
  }
  
  @Deprecated
  public DefaultHttpDataSource(String paramString, @Nullable Predicate<String> paramPredicate, @Nullable TransferListener paramTransferListener, int paramInt1, int paramInt2, boolean paramBoolean, @Nullable HttpDataSource.RequestProperties paramRequestProperties)
  {
    this(paramString, paramPredicate, paramInt1, paramInt2, paramBoolean, paramRequestProperties);
    if (paramTransferListener != null) {
      addTransferListener(paramTransferListener);
    }
  }
  
  private void closeConnectionQuietly()
  {
    HttpURLConnection localHttpURLConnection = connection;
    if (localHttpURLConnection != null)
    {
      try
      {
        localHttpURLConnection.disconnect();
      }
      catch (Exception localException)
      {
        Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", localException);
      }
      connection = null;
    }
  }
  
  private static long getContentLength(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("Content-Length");
    long l1;
    Object localObject;
    if (!TextUtils.isEmpty(str)) {
      try
      {
        l1 = Long.parseLong(str);
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unexpected Content-Length [");
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append("]");
        Log.e("DefaultHttpDataSource", ((StringBuilder)localObject).toString());
      }
    } else {
      l1 = -1L;
    }
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Content-Range");
    long l2 = l1;
    if (!TextUtils.isEmpty(paramHttpURLConnection))
    {
      localObject = CONTENT_RANGE_HEADER.matcher(paramHttpURLConnection);
      l2 = l1;
      if (((Matcher)localObject).find()) {
        try
        {
          long l3 = Long.parseLong(((Matcher)localObject).group(2)) - Long.parseLong(((Matcher)localObject).group(1)) + 1L;
          if (l1 < 0L)
          {
            l2 = l3;
          }
          else
          {
            l2 = l1;
            if (l1 != l3)
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>();
              ((StringBuilder)localObject).append("Inconsistent headers [");
              ((StringBuilder)localObject).append(str);
              ((StringBuilder)localObject).append("] [");
              ((StringBuilder)localObject).append(paramHttpURLConnection);
              ((StringBuilder)localObject).append("]");
              Log.w("DefaultHttpDataSource", ((StringBuilder)localObject).toString());
              l2 = Math.max(l1, l3);
            }
          }
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unexpected Content-Range [");
          localStringBuilder.append(paramHttpURLConnection);
          localStringBuilder.append("]");
          Log.e("DefaultHttpDataSource", localStringBuilder.toString());
          l2 = l1;
        }
      }
    }
    return l2;
  }
  
  private static URL handleRedirect(URL paramURL, String paramString)
    throws IOException
  {
    if (paramString != null)
    {
      paramURL = new URL(paramURL, paramString);
      paramString = paramURL.getProtocol();
      if ((!"https".equals(paramString)) && (!"http".equals(paramString))) {
        throw new ProtocolException(z2.o("Unsupported protocol redirect: ", paramString));
      }
      return paramURL;
    }
    throw new ProtocolException("Null location redirect");
  }
  
  private HttpURLConnection makeConnection(DataSpec paramDataSpec)
    throws IOException
  {
    Object localObject1 = new URL(uri.toString());
    int i = httpMethod;
    Object localObject2 = httpBody;
    long l1 = position;
    long l2 = length;
    boolean bool = paramDataSpec.isFlagSet(1);
    if (!allowCrossProtocolRedirects) {
      return makeConnection((URL)localObject1, i, (byte[])localObject2, l1, l2, bool, true);
    }
    int j = 0;
    int k;
    for (paramDataSpec = (DataSpec)localObject2;; paramDataSpec = (DataSpec)localObject2)
    {
      k = j + 1;
      if (j > 20) {
        break;
      }
      HttpURLConnection localHttpURLConnection = makeConnection((URL)localObject1, i, paramDataSpec, l1, l2, bool, false);
      j = localHttpURLConnection.getResponseCode();
      localObject2 = localHttpURLConnection.getHeaderField("Location");
      if (((i != 1) && (i != 3)) || ((j != 300) && (j != 301) && (j != 302) && (j != 303) && (j != 307) && (j != 308)))
      {
        if ((i == 2) && ((j == 300) || (j == 301) || (j == 302) || (j == 303)))
        {
          localHttpURLConnection.disconnect();
          paramDataSpec = handleRedirect((URL)localObject1, (String)localObject2);
          localObject2 = null;
          i = 1;
        }
        else
        {
          return localHttpURLConnection;
        }
      }
      else
      {
        localHttpURLConnection.disconnect();
        localObject1 = handleRedirect((URL)localObject1, (String)localObject2);
        localObject2 = paramDataSpec;
        paramDataSpec = (DataSpec)localObject1;
      }
      j = k;
      localObject1 = paramDataSpec;
    }
    throw new NoRouteToHostException(a.f("Too many redirects: ", k));
  }
  
  private HttpURLConnection makeConnection(URL paramURL, int paramInt, byte[] paramArrayOfByte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2)
    throws IOException
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setConnectTimeout(connectTimeoutMillis);
    localHttpURLConnection.setReadTimeout(readTimeoutMillis);
    paramURL = defaultRequestProperties;
    if (paramURL != null)
    {
      localObject = paramURL.getSnapshot().entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramURL = (Map.Entry)((Iterator)localObject).next();
        localHttpURLConnection.setRequestProperty((String)paramURL.getKey(), (String)paramURL.getValue());
      }
    }
    Object localObject = requestProperties.getSnapshot().entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramURL = (Map.Entry)((Iterator)localObject).next();
      localHttpURLConnection.setRequestProperty((String)paramURL.getKey(), (String)paramURL.getValue());
    }
    if ((paramLong1 != 0L) || (paramLong2 != -1L))
    {
      localObject = a.i("bytes=", paramLong1, "-");
      paramURL = (URL)localObject;
      if (paramLong2 != -1L)
      {
        paramURL = z2.t((String)localObject);
        paramURL.append(paramLong1 + paramLong2 - 1L);
        paramURL = paramURL.toString();
      }
      localHttpURLConnection.setRequestProperty("Range", paramURL);
    }
    localHttpURLConnection.setRequestProperty("User-Agent", userAgent);
    if (!paramBoolean1) {
      localHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
    }
    localHttpURLConnection.setInstanceFollowRedirects(paramBoolean2);
    if (paramArrayOfByte != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    localHttpURLConnection.setDoOutput(paramBoolean1);
    localHttpURLConnection.setRequestMethod(DataSpec.getStringForHttpMethod(paramInt));
    if (paramArrayOfByte != null)
    {
      localHttpURLConnection.setFixedLengthStreamingMode(paramArrayOfByte.length);
      localHttpURLConnection.connect();
      paramURL = localHttpURLConnection.getOutputStream();
      paramURL.write(paramArrayOfByte);
      paramURL.close();
    }
    else
    {
      localHttpURLConnection.connect();
    }
    return localHttpURLConnection;
  }
  
  private static void maybeTerminateInputStream(HttpURLConnection paramHttpURLConnection, long paramLong)
  {
    int i = Util.SDK_INT;
    if ((i != 19) && (i != 20)) {
      return;
    }
    try
    {
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      if (paramLong == -1L)
      {
        if (paramHttpURLConnection.read() != -1) {}
      }
      else if (paramLong <= 2048L) {
        return;
      }
      Object localObject = paramHttpURLConnection.getClass().getName();
      if (("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(localObject)) || ("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(localObject)))
      {
        localObject = paramHttpURLConnection.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
        ((AccessibleObject)localObject).setAccessible(true);
        ((Method)localObject).invoke(paramHttpURLConnection, new Object[0]);
      }
      return;
    }
    catch (Exception paramHttpURLConnection)
    {
      for (;;) {}
    }
  }
  
  private int readInternal(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l = bytesToRead;
    int i = paramInt2;
    if (l != -1L)
    {
      l -= bytesRead;
      if (l == 0L) {
        return -1;
      }
      i = (int)Math.min(paramInt2, l);
    }
    paramInt1 = inputStream.read(paramArrayOfByte, paramInt1, i);
    if (paramInt1 == -1)
    {
      if (bytesToRead == -1L) {
        return -1;
      }
      throw new EOFException();
    }
    bytesRead += paramInt1;
    bytesTransferred(paramInt1);
    return paramInt1;
  }
  
  private void skipInternal()
    throws IOException
  {
    if (bytesSkipped == bytesToSkip) {
      return;
    }
    byte[] arrayOfByte1 = (byte[])skipBufferReference.getAndSet(null);
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1 == null) {
      arrayOfByte2 = new byte['က'];
    }
    for (;;)
    {
      long l1 = bytesSkipped;
      long l2 = bytesToSkip;
      if (l1 == l2) {
        break label132;
      }
      int i = (int)Math.min(l2 - l1, arrayOfByte2.length);
      i = inputStream.read(arrayOfByte2, 0, i);
      if (Thread.currentThread().isInterrupted()) {
        break label124;
      }
      if (i == -1) {
        break;
      }
      bytesSkipped += i;
      bytesTransferred(i);
    }
    throw new EOFException();
    label124:
    throw new InterruptedIOException();
    label132:
    skipBufferReference.set(arrayOfByte2);
  }
  
  public final long bytesRead()
  {
    return bytesRead;
  }
  
  public final long bytesRemaining()
  {
    long l = bytesToRead;
    if (l != -1L) {
      l -= bytesRead;
    }
    return l;
  }
  
  public final long bytesSkipped()
  {
    return bytesSkipped;
  }
  
  public void clearAllRequestProperties()
  {
    requestProperties.clear();
  }
  
  public void clearRequestProperty(String paramString)
  {
    Assertions.checkNotNull(paramString);
    requestProperties.remove(paramString);
  }
  
  public void close()
    throws HttpDataSource.HttpDataSourceException
  {
    try
    {
      if (inputStream != null)
      {
        maybeTerminateInputStream(connection, bytesRemaining());
        try
        {
          inputStream.close();
        }
        catch (IOException localIOException)
        {
          HttpDataSource.HttpDataSourceException localHttpDataSourceException = new com/google/android/exoplayer2/upstream/HttpDataSource$HttpDataSourceException;
          localHttpDataSourceException.<init>(localIOException, dataSpec, 3);
          throw localHttpDataSourceException;
        }
      }
      return;
    }
    finally
    {
      inputStream = null;
      closeConnectionQuietly();
      if (opened)
      {
        opened = false;
        transferEnded();
      }
    }
  }
  
  @Nullable
  public final HttpURLConnection getConnection()
  {
    return connection;
  }
  
  public Map<String, List<String>> getResponseHeaders()
  {
    Object localObject = connection;
    if (localObject == null) {
      localObject = Collections.emptyMap();
    } else {
      localObject = ((URLConnection)localObject).getHeaderFields();
    }
    return (Map<String, List<String>>)localObject;
  }
  
  @Nullable
  public Uri getUri()
  {
    Object localObject = connection;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Uri.parse(((URLConnection)localObject).getURL().toString());
    }
    return (Uri)localObject;
  }
  
  /* Error */
  public long open(DataSpec paramDataSpec)
    throws HttpDataSource.HttpDataSourceException
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield 525	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:dataSpec	Lcom/google/android/exoplayer2/upstream/DataSpec;
    //   5: lconst_0
    //   6: lstore_2
    //   7: aload_0
    //   8: lconst_0
    //   9: putfield 464	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:bytesRead	J
    //   12: aload_0
    //   13: lconst_0
    //   14: putfield 480	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:bytesSkipped	J
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 565	com/google/android/exoplayer2/upstream/BaseDataSource:transferInitializing	(Lcom/google/android/exoplayer2/upstream/DataSpec;)V
    //   22: aload_0
    //   23: aload_1
    //   24: invokespecial 567	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:makeConnection	(Lcom/google/android/exoplayer2/upstream/DataSpec;)Ljava/net/HttpURLConnection;
    //   27: astore 4
    //   29: aload_0
    //   30: aload 4
    //   32: putfield 131	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:connection	Ljava/net/HttpURLConnection;
    //   35: aload 4
    //   37: invokevirtual 292	java/net/HttpURLConnection:getResponseCode	()I
    //   40: istore 5
    //   42: aload_0
    //   43: getfield 131	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:connection	Ljava/net/HttpURLConnection;
    //   46: invokevirtual 570	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
    //   49: astore 6
    //   51: iload 5
    //   53: sipush 200
    //   56: if_icmplt +226 -> 282
    //   59: iload 5
    //   61: sipush 299
    //   64: if_icmple +6 -> 70
    //   67: goto +215 -> 282
    //   70: aload_0
    //   71: getfield 131	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:connection	Ljava/net/HttpURLConnection;
    //   74: invokevirtual 573	java/net/URLConnection:getContentType	()Ljava/lang/String;
    //   77: astore 4
    //   79: aload_0
    //   80: getfield 96	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:contentTypePredicate	Lcom/google/android/exoplayer2/util/Predicate;
    //   83: astore 6
    //   85: aload 6
    //   87: ifnull +33 -> 120
    //   90: aload 6
    //   92: aload 4
    //   94: invokeinterface 578 2 0
    //   99: ifeq +6 -> 105
    //   102: goto +18 -> 120
    //   105: aload_0
    //   106: invokespecial 530	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:closeConnectionQuietly	()V
    //   109: new 580	com/google/android/exoplayer2/upstream/HttpDataSource$InvalidContentTypeException
    //   112: dup
    //   113: aload 4
    //   115: aload_1
    //   116: invokespecial 583	com/google/android/exoplayer2/upstream/HttpDataSource$InvalidContentTypeException:<init>	(Ljava/lang/String;Lcom/google/android/exoplayer2/upstream/DataSpec;)V
    //   119: athrow
    //   120: lload_2
    //   121: lstore 7
    //   123: iload 5
    //   125: sipush 200
    //   128: if_icmpne +23 -> 151
    //   131: aload_1
    //   132: getfield 278	com/google/android/exoplayer2/upstream/DataSpec:position	J
    //   135: lstore 9
    //   137: lload_2
    //   138: lstore 7
    //   140: lload 9
    //   142: lconst_0
    //   143: lcmp
    //   144: ifeq +7 -> 151
    //   147: lload 9
    //   149: lstore 7
    //   151: aload_0
    //   152: lload 7
    //   154: putfield 482	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:bytesToSkip	J
    //   157: aload_1
    //   158: iconst_1
    //   159: invokevirtual 285	com/google/android/exoplayer2/upstream/DataSpec:isFlagSet	(I)Z
    //   162: ifne +68 -> 230
    //   165: aload_1
    //   166: getfield 281	com/google/android/exoplayer2/upstream/DataSpec:length	J
    //   169: lstore 9
    //   171: ldc2_w 186
    //   174: lstore 7
    //   176: lload 9
    //   178: ldc2_w 186
    //   181: lcmp
    //   182: ifeq +12 -> 194
    //   185: aload_0
    //   186: lload 9
    //   188: putfield 462	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:bytesToRead	J
    //   191: goto +47 -> 238
    //   194: aload_0
    //   195: getfield 131	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:connection	Ljava/net/HttpURLConnection;
    //   198: invokestatic 585	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:getContentLength	(Ljava/net/HttpURLConnection;)J
    //   201: lstore 9
    //   203: lload 9
    //   205: ldc2_w 186
    //   208: lcmp
    //   209: ifeq +12 -> 221
    //   212: lload 9
    //   214: aload_0
    //   215: getfield 482	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:bytesToSkip	J
    //   218: lsub
    //   219: lstore 7
    //   221: aload_0
    //   222: lload 7
    //   224: putfield 462	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:bytesToRead	J
    //   227: goto +11 -> 238
    //   230: aload_0
    //   231: aload_1
    //   232: getfield 281	com/google/android/exoplayer2/upstream/DataSpec:length	J
    //   235: putfield 462	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:bytesToRead	J
    //   238: aload_0
    //   239: aload_0
    //   240: getfield 131	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:connection	Ljava/net/HttpURLConnection;
    //   243: invokevirtual 418	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   246: putfield 469	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:inputStream	Ljava/io/InputStream;
    //   249: aload_0
    //   250: iconst_1
    //   251: putfield 532	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:opened	Z
    //   254: aload_0
    //   255: aload_1
    //   256: invokevirtual 588	com/google/android/exoplayer2/upstream/BaseDataSource:transferStarted	(Lcom/google/android/exoplayer2/upstream/DataSpec;)V
    //   259: aload_0
    //   260: getfield 462	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:bytesToRead	J
    //   263: lreturn
    //   264: astore 4
    //   266: aload_0
    //   267: invokespecial 530	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:closeConnectionQuietly	()V
    //   270: new 518	com/google/android/exoplayer2/upstream/HttpDataSource$HttpDataSourceException
    //   273: dup
    //   274: aload 4
    //   276: aload_1
    //   277: iconst_1
    //   278: invokespecial 528	com/google/android/exoplayer2/upstream/HttpDataSource$HttpDataSourceException:<init>	(Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/DataSpec;I)V
    //   281: athrow
    //   282: aload_0
    //   283: getfield 131	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:connection	Ljava/net/HttpURLConnection;
    //   286: invokevirtual 547	java/net/URLConnection:getHeaderFields	()Ljava/util/Map;
    //   289: astore 4
    //   291: aload_0
    //   292: invokespecial 530	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:closeConnectionQuietly	()V
    //   295: new 590	com/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException
    //   298: dup
    //   299: iload 5
    //   301: aload 6
    //   303: aload 4
    //   305: aload_1
    //   306: invokespecial 593	com/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException:<init>	(ILjava/lang/String;Ljava/util/Map;Lcom/google/android/exoplayer2/upstream/DataSpec;)V
    //   309: astore_1
    //   310: iload 5
    //   312: sipush 416
    //   315: if_icmpne +16 -> 331
    //   318: aload_1
    //   319: new 595	com/google/android/exoplayer2/upstream/DataSourceException
    //   322: dup
    //   323: iconst_0
    //   324: invokespecial 597	com/google/android/exoplayer2/upstream/DataSourceException:<init>	(I)V
    //   327: invokevirtual 603	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: pop
    //   331: aload_1
    //   332: athrow
    //   333: astore 4
    //   335: aload_0
    //   336: invokespecial 530	com/google/android/exoplayer2/upstream/DefaultHttpDataSource:closeConnectionQuietly	()V
    //   339: ldc_w 605
    //   342: invokestatic 365	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: astore 6
    //   347: aload 6
    //   349: aload_1
    //   350: getfield 264	com/google/android/exoplayer2/upstream/DataSpec:uri	Landroid/net/Uri;
    //   353: invokevirtual 267	android/net/Uri:toString	()Ljava/lang/String;
    //   356: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: pop
    //   360: new 518	com/google/android/exoplayer2/upstream/HttpDataSource$HttpDataSourceException
    //   363: dup
    //   364: aload 6
    //   366: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   369: aload 4
    //   371: aload_1
    //   372: iconst_1
    //   373: invokespecial 608	com/google/android/exoplayer2/upstream/HttpDataSource$HttpDataSourceException:<init>	(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/DataSpec;I)V
    //   376: athrow
    //   377: astore 4
    //   379: ldc_w 605
    //   382: invokestatic 365	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: astore 6
    //   387: aload 6
    //   389: aload_1
    //   390: getfield 264	com/google/android/exoplayer2/upstream/DataSpec:uri	Landroid/net/Uri;
    //   393: invokevirtual 267	android/net/Uri:toString	()Ljava/lang/String;
    //   396: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: pop
    //   400: new 518	com/google/android/exoplayer2/upstream/HttpDataSource$HttpDataSourceException
    //   403: dup
    //   404: aload 6
    //   406: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   409: aload 4
    //   411: aload_1
    //   412: iconst_1
    //   413: invokespecial 608	com/google/android/exoplayer2/upstream/HttpDataSource$HttpDataSourceException:<init>	(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/DataSpec;I)V
    //   416: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	417	0	this	DefaultHttpDataSource
    //   0	417	1	paramDataSpec	DataSpec
    //   6	132	2	l1	long
    //   27	87	4	localObject1	Object
    //   264	11	4	localIOException1	IOException
    //   289	15	4	localMap	Map
    //   333	37	4	localIOException2	IOException
    //   377	33	4	localIOException3	IOException
    //   40	276	5	i	int
    //   49	356	6	localObject2	Object
    //   121	102	7	l2	long
    //   135	78	9	l3	long
    // Exception table:
    //   from	to	target	type
    //   238	249	264	java/io/IOException
    //   35	51	333	java/io/IOException
    //   22	35	377	java/io/IOException
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws HttpDataSource.HttpDataSourceException
  {
    try
    {
      skipInternal();
      paramInt1 = readInternal(paramArrayOfByte, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new HttpDataSource.HttpDataSourceException(paramArrayOfByte, dataSpec, 2);
    }
  }
  
  public void setRequestProperty(String paramString1, String paramString2)
  {
    Assertions.checkNotNull(paramString1);
    Assertions.checkNotNull(paramString2);
    requestProperties.set(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DefaultHttpDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
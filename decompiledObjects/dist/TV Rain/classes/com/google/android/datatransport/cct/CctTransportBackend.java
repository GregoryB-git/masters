package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ClientInfo.Builder;
import com.google.android.datatransport.cct.internal.ClientInfo.ClientType;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogEvent.Builder;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogRequest.Builder;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.EventInternal.Builder;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.retries.RetryStrategy;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import z2;

final class CctTransportBackend
  implements TransportBackend
{
  private static final String ACCEPT_ENCODING_HEADER_KEY = "Accept-Encoding";
  public static final String API_KEY_HEADER_KEY = "X-Goog-Api-Key";
  private static final int CONNECTION_TIME_OUT = 30000;
  private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
  private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
  private static final String GZIP_CONTENT_ENCODING = "gzip";
  private static final int INVALID_VERSION_CODE = -1;
  private static final String JSON_CONTENT_TYPE = "application/json";
  private static final String KEY_APPLICATION_BUILD = "application_build";
  private static final String KEY_COUNTRY = "country";
  private static final String KEY_DEVICE = "device";
  private static final String KEY_FINGERPRINT = "fingerprint";
  private static final String KEY_HARDWARE = "hardware";
  private static final String KEY_LOCALE = "locale";
  private static final String KEY_MANUFACTURER = "manufacturer";
  private static final String KEY_MCC_MNC = "mcc_mnc";
  @VisibleForTesting
  public static final String KEY_MOBILE_SUBTYPE = "mobile-subtype";
  private static final String KEY_MODEL = "model";
  @VisibleForTesting
  public static final String KEY_NETWORK_TYPE = "net-type";
  private static final String KEY_OS_BUILD = "os-uild";
  private static final String KEY_PRODUCT = "product";
  private static final String KEY_SDK_VERSION = "sdk-version";
  private static final String KEY_TIMEZONE_OFFSET = "tz-offset";
  private static final String LOG_TAG = "CctTransportBackend";
  private static final int READ_TIME_OUT = 130000;
  private final Context applicationContext;
  private final ConnectivityManager connectivityManager;
  private final DataEncoder dataEncoder = BatchedLogRequest.createDataEncoder();
  public final URL endPoint;
  private final int readTimeout;
  private final Clock uptimeClock;
  private final Clock wallTimeClock;
  
  public CctTransportBackend(Context paramContext, Clock paramClock1, Clock paramClock2)
  {
    this(paramContext, paramClock1, paramClock2, 130000);
  }
  
  public CctTransportBackend(Context paramContext, Clock paramClock1, Clock paramClock2, int paramInt)
  {
    applicationContext = paramContext;
    connectivityManager = ((ConnectivityManager)paramContext.getSystemService("connectivity"));
    endPoint = parseUrlOrThrow(CCTDestination.DEFAULT_END_POINT);
    uptimeClock = paramClock2;
    wallTimeClock = paramClock1;
    readTimeout = paramInt;
  }
  
  /* Error */
  private HttpResponse doSend(HttpRequest paramHttpRequest)
    throws IOException
  {
    // Byte code:
    //   0: ldc 85
    //   2: ldc -88
    //   4: aload_1
    //   5: getfield 171	com/google/android/datatransport/cct/CctTransportBackend$HttpRequest:url	Ljava/net/URL;
    //   8: invokestatic 177	com/google/android/datatransport/runtime/logging/Logging:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   11: aload_1
    //   12: getfield 171	com/google/android/datatransport/cct/CctTransportBackend$HttpRequest:url	Ljava/net/URL;
    //   15: invokevirtual 183	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   18: checkcast 185	java/net/HttpURLConnection
    //   21: astore_2
    //   22: aload_2
    //   23: sipush 30000
    //   26: invokevirtual 191	java/net/URLConnection:setConnectTimeout	(I)V
    //   29: aload_2
    //   30: aload_0
    //   31: getfield 147	com/google/android/datatransport/cct/CctTransportBackend:readTimeout	I
    //   34: invokevirtual 194	java/net/URLConnection:setReadTimeout	(I)V
    //   37: aload_2
    //   38: iconst_1
    //   39: invokevirtual 198	java/net/URLConnection:setDoOutput	(Z)V
    //   42: aload_2
    //   43: iconst_0
    //   44: invokevirtual 201	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   47: aload_2
    //   48: ldc -53
    //   50: invokevirtual 207	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   53: aload_2
    //   54: ldc -47
    //   56: ldc -45
    //   58: iconst_1
    //   59: anewarray 4	java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: ldc -43
    //   66: aastore
    //   67: invokestatic 219	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   70: invokevirtual 223	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   73: aload_2
    //   74: ldc 25
    //   76: ldc 31
    //   78: invokevirtual 223	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: aload_2
    //   82: ldc 28
    //   84: ldc 36
    //   86: invokevirtual 223	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   89: aload_2
    //   90: ldc 16
    //   92: ldc 31
    //   94: invokevirtual 223	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: aload_1
    //   98: getfield 226	com/google/android/datatransport/cct/CctTransportBackend$HttpRequest:apiKey	Ljava/lang/String;
    //   101: astore_3
    //   102: aload_3
    //   103: ifnull +10 -> 113
    //   106: aload_2
    //   107: ldc 19
    //   109: aload_3
    //   110: invokevirtual 223	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload_2
    //   114: invokevirtual 230	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   117: astore_3
    //   118: new 232	java/util/zip/GZIPOutputStream
    //   121: astore 4
    //   123: aload 4
    //   125: aload_3
    //   126: invokespecial 235	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   129: aload_0
    //   130: getfield 116	com/google/android/datatransport/cct/CctTransportBackend:dataEncoder	Lcom/google/firebase/encoders/DataEncoder;
    //   133: astore 5
    //   135: aload_1
    //   136: getfield 239	com/google/android/datatransport/cct/CctTransportBackend$HttpRequest:requestBody	Lcom/google/android/datatransport/cct/internal/BatchedLogRequest;
    //   139: astore 6
    //   141: new 241	java/io/BufferedWriter
    //   144: astore_1
    //   145: new 243	java/io/OutputStreamWriter
    //   148: astore 7
    //   150: aload 7
    //   152: aload 4
    //   154: invokespecial 244	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   157: aload_1
    //   158: aload 7
    //   160: invokespecial 247	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   163: aload 5
    //   165: aload 6
    //   167: aload_1
    //   168: invokeinterface 253 3 0
    //   173: aload 4
    //   175: invokevirtual 258	java/io/OutputStream:close	()V
    //   178: aload_3
    //   179: ifnull +7 -> 186
    //   182: aload_3
    //   183: invokevirtual 258	java/io/OutputStream:close	()V
    //   186: aload_2
    //   187: invokevirtual 262	java/net/HttpURLConnection:getResponseCode	()I
    //   190: istore 8
    //   192: ldc 85
    //   194: ldc_w 264
    //   197: iload 8
    //   199: invokestatic 270	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   202: invokestatic 177	com/google/android/datatransport/runtime/logging/Logging:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   205: ldc 85
    //   207: ldc_w 272
    //   210: aload_2
    //   211: ldc 28
    //   213: invokevirtual 276	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   216: invokestatic 279	com/google/android/datatransport/runtime/logging/Logging:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   219: ldc 85
    //   221: ldc_w 281
    //   224: aload_2
    //   225: ldc 25
    //   227: invokevirtual 276	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   230: invokestatic 279	com/google/android/datatransport/runtime/logging/Logging:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    //   233: iload 8
    //   235: sipush 302
    //   238: if_icmpeq +159 -> 397
    //   241: iload 8
    //   243: sipush 301
    //   246: if_icmpeq +151 -> 397
    //   249: iload 8
    //   251: sipush 307
    //   254: if_icmpne +6 -> 260
    //   257: goto +140 -> 397
    //   260: iload 8
    //   262: sipush 200
    //   265: if_icmpeq +15 -> 280
    //   268: new 11	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse
    //   271: dup
    //   272: iload 8
    //   274: aconst_null
    //   275: lconst_0
    //   276: invokespecial 284	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse:<init>	(ILjava/net/URL;J)V
    //   279: areturn
    //   280: aload_2
    //   281: invokevirtual 288	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   284: astore_1
    //   285: aload_1
    //   286: aload_2
    //   287: ldc 25
    //   289: invokevirtual 276	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   292: invokestatic 292	com/google/android/datatransport/cct/CctTransportBackend:maybeUnGzip	(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
    //   295: astore_3
    //   296: new 294	java/io/BufferedReader
    //   299: astore 4
    //   301: new 296	java/io/InputStreamReader
    //   304: astore_2
    //   305: aload_2
    //   306: aload_3
    //   307: invokespecial 299	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   310: aload 4
    //   312: aload_2
    //   313: invokespecial 302	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   316: aload 4
    //   318: invokestatic 308	com/google/android/datatransport/cct/internal/LogResponse:fromJson	(Ljava/io/Reader;)Lcom/google/android/datatransport/cct/internal/LogResponse;
    //   321: invokevirtual 312	com/google/android/datatransport/cct/internal/LogResponse:getNextRequestWaitMillis	()J
    //   324: lstore 9
    //   326: new 11	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse
    //   329: astore_2
    //   330: aload_2
    //   331: iload 8
    //   333: aconst_null
    //   334: lload 9
    //   336: invokespecial 284	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse:<init>	(ILjava/net/URL;J)V
    //   339: aload_3
    //   340: ifnull +7 -> 347
    //   343: aload_3
    //   344: invokevirtual 315	java/io/InputStream:close	()V
    //   347: aload_1
    //   348: ifnull +7 -> 355
    //   351: aload_1
    //   352: invokevirtual 315	java/io/InputStream:close	()V
    //   355: aload_2
    //   356: areturn
    //   357: astore_2
    //   358: aload_3
    //   359: ifnull +16 -> 375
    //   362: aload_3
    //   363: invokevirtual 315	java/io/InputStream:close	()V
    //   366: goto +9 -> 375
    //   369: astore_3
    //   370: aload_2
    //   371: aload_3
    //   372: invokevirtual 321	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   375: aload_2
    //   376: athrow
    //   377: astore_3
    //   378: aload_1
    //   379: ifnull +16 -> 395
    //   382: aload_1
    //   383: invokevirtual 315	java/io/InputStream:close	()V
    //   386: goto +9 -> 395
    //   389: astore_1
    //   390: aload_3
    //   391: aload_1
    //   392: invokevirtual 321	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   395: aload_3
    //   396: athrow
    //   397: new 11	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse
    //   400: dup
    //   401: iload 8
    //   403: new 179	java/net/URL
    //   406: dup
    //   407: aload_2
    //   408: ldc_w 323
    //   411: invokevirtual 276	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   414: invokespecial 325	java/net/URL:<init>	(Ljava/lang/String;)V
    //   417: lconst_0
    //   418: invokespecial 284	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse:<init>	(ILjava/net/URL;J)V
    //   421: areturn
    //   422: astore_1
    //   423: aload 4
    //   425: invokevirtual 258	java/io/OutputStream:close	()V
    //   428: goto +9 -> 437
    //   431: astore_2
    //   432: aload_1
    //   433: aload_2
    //   434: invokevirtual 321	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   437: aload_1
    //   438: athrow
    //   439: astore_1
    //   440: aload_3
    //   441: ifnull +16 -> 457
    //   444: aload_3
    //   445: invokevirtual 258	java/io/OutputStream:close	()V
    //   448: goto +9 -> 457
    //   451: astore_3
    //   452: aload_1
    //   453: aload_3
    //   454: invokevirtual 321	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   457: aload_1
    //   458: athrow
    //   459: astore_1
    //   460: goto +4 -> 464
    //   463: astore_1
    //   464: ldc 85
    //   466: ldc_w 327
    //   469: aload_1
    //   470: invokestatic 331	com/google/android/datatransport/runtime/logging/Logging:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   473: new 11	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse
    //   476: dup
    //   477: sipush 400
    //   480: aconst_null
    //   481: lconst_0
    //   482: invokespecial 284	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse:<init>	(ILjava/net/URL;J)V
    //   485: areturn
    //   486: astore_1
    //   487: goto +4 -> 491
    //   490: astore_1
    //   491: ldc 85
    //   493: ldc_w 333
    //   496: aload_1
    //   497: invokestatic 331	com/google/android/datatransport/runtime/logging/Logging:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   500: new 11	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse
    //   503: dup
    //   504: sipush 500
    //   507: aconst_null
    //   508: lconst_0
    //   509: invokespecial 284	com/google/android/datatransport/cct/CctTransportBackend$HttpResponse:<init>	(ILjava/net/URL;J)V
    //   512: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	513	0	this	CctTransportBackend
    //   0	513	1	paramHttpRequest	HttpRequest
    //   21	335	2	localObject1	Object
    //   357	51	2	localObject2	Object
    //   431	3	2	localThrowable1	Throwable
    //   101	262	3	localObject3	Object
    //   369	3	3	localThrowable2	Throwable
    //   377	68	3	localObject4	Object
    //   451	3	3	localThrowable3	Throwable
    //   121	303	4	localObject5	Object
    //   133	31	5	localDataEncoder	DataEncoder
    //   139	27	6	localBatchedLogRequest	BatchedLogRequest
    //   148	11	7	localOutputStreamWriter	java.io.OutputStreamWriter
    //   190	212	8	i	int
    //   324	11	9	l	long
    // Exception table:
    //   from	to	target	type
    //   296	339	357	finally
    //   362	366	369	finally
    //   285	296	377	finally
    //   343	347	377	finally
    //   370	375	377	finally
    //   375	377	377	finally
    //   382	386	389	finally
    //   129	173	422	finally
    //   423	428	431	finally
    //   118	129	439	finally
    //   173	178	439	finally
    //   432	437	439	finally
    //   437	439	439	finally
    //   444	448	451	finally
    //   113	118	459	java/io/IOException
    //   182	186	459	java/io/IOException
    //   452	457	459	java/io/IOException
    //   457	459	459	java/io/IOException
    //   113	118	463	com/google/firebase/encoders/EncodingException
    //   182	186	463	com/google/firebase/encoders/EncodingException
    //   452	457	463	com/google/firebase/encoders/EncodingException
    //   457	459	463	com/google/firebase/encoders/EncodingException
    //   113	118	486	java/net/UnknownHostException
    //   182	186	486	java/net/UnknownHostException
    //   452	457	486	java/net/UnknownHostException
    //   457	459	486	java/net/UnknownHostException
    //   113	118	490	java/net/ConnectException
    //   182	186	490	java/net/ConnectException
    //   452	457	490	java/net/ConnectException
    //   457	459	490	java/net/ConnectException
  }
  
  private static int getNetSubtypeValue(NetworkInfo paramNetworkInfo)
  {
    if (paramNetworkInfo == null) {
      return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
    }
    int i = paramNetworkInfo.getSubtype();
    if (i == -1) {
      return NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
    }
    if (NetworkConnectionInfo.MobileSubtype.forNumber(i) == null) {
      i = 0;
    }
    return i;
  }
  
  private static int getNetTypeValue(NetworkInfo paramNetworkInfo)
  {
    if (paramNetworkInfo == null) {
      return NetworkConnectionInfo.NetworkType.NONE.getValue();
    }
    return paramNetworkInfo.getType();
  }
  
  private static int getPackageVersionCode(Context paramContext)
  {
    try
    {
      int i = getPackageManagergetPackageInfogetPackageName0versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Logging.e("CctTransportBackend", "Unable to find version code for package", paramContext);
    }
    return -1;
  }
  
  private BatchedLogRequest getRequestBody(BackendRequest paramBackendRequest)
  {
    Object localObject1 = new HashMap();
    Iterator localIterator1 = paramBackendRequest.getEvents().iterator();
    Object localObject3;
    while (localIterator1.hasNext())
    {
      localObject2 = (EventInternal)localIterator1.next();
      paramBackendRequest = ((EventInternal)localObject2).getTransportName();
      if (!((HashMap)localObject1).containsKey(paramBackendRequest))
      {
        localObject3 = new ArrayList();
        ((ArrayList)localObject3).add(localObject2);
        ((HashMap)localObject1).put(paramBackendRequest, localObject3);
      }
      else
      {
        ((List)((HashMap)localObject1).get(paramBackendRequest)).add(localObject2);
      }
    }
    Object localObject2 = new ArrayList();
    localObject1 = ((HashMap)localObject1).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramBackendRequest = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (EventInternal)((List)paramBackendRequest.getValue()).get(0);
      localObject3 = LogRequest.builder().setQosTier(QosTier.DEFAULT).setRequestTimeMs(wallTimeClock.getTime()).setRequestUptimeMs(uptimeClock.getTime()).setClientInfo(ClientInfo.builder().setClientType(ClientInfo.ClientType.ANDROID_FIREBASE).setAndroidClientInfo(AndroidClientInfo.builder().setSdkVersion(Integer.valueOf(((EventInternal)localObject3).getInteger("sdk-version"))).setModel(((EventInternal)localObject3).get("model")).setHardware(((EventInternal)localObject3).get("hardware")).setDevice(((EventInternal)localObject3).get("device")).setProduct(((EventInternal)localObject3).get("product")).setOsBuild(((EventInternal)localObject3).get("os-uild")).setManufacturer(((EventInternal)localObject3).get("manufacturer")).setFingerprint(((EventInternal)localObject3).get("fingerprint")).setCountry(((EventInternal)localObject3).get("country")).setLocale(((EventInternal)localObject3).get("locale")).setMccMnc(((EventInternal)localObject3).get("mcc_mnc")).setApplicationBuild(((EventInternal)localObject3).get("application_build")).build()).build());
      try
      {
        ((LogRequest.Builder)localObject3).setSource(Integer.parseInt((String)paramBackendRequest.getKey()));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        ((LogRequest.Builder)localObject3).setSource((String)paramBackendRequest.getKey());
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator2 = ((List)paramBackendRequest.getValue()).iterator();
      while (localIterator2.hasNext())
      {
        EventInternal localEventInternal = (EventInternal)localIterator2.next();
        paramBackendRequest = localEventInternal.getEncodedPayload();
        Encoding localEncoding = paramBackendRequest.getEncoding();
        if (localEncoding.equals(Encoding.of("proto")))
        {
          paramBackendRequest = LogEvent.protoBuilder(paramBackendRequest.getBytes());
        }
        else
        {
          if (!localEncoding.equals(Encoding.of("json"))) {
            break label587;
          }
          paramBackendRequest = LogEvent.jsonBuilder(new String(paramBackendRequest.getBytes(), Charset.forName("UTF-8")));
        }
        paramBackendRequest.setEventTimeMs(localEventInternal.getEventMillis()).setEventUptimeMs(localEventInternal.getUptimeMillis()).setTimezoneOffsetSeconds(localEventInternal.getLong("tz-offset")).setNetworkConnectionInfo(NetworkConnectionInfo.builder().setNetworkType(NetworkConnectionInfo.NetworkType.forNumber(localEventInternal.getInteger("net-type"))).setMobileSubtype(NetworkConnectionInfo.MobileSubtype.forNumber(localEventInternal.getInteger("mobile-subtype"))).build());
        if (localEventInternal.getCode() != null) {
          paramBackendRequest.setEventCode(localEventInternal.getCode());
        }
        localArrayList.add(paramBackendRequest.build());
        continue;
        label587:
        Logging.w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", localEncoding);
      }
      ((LogRequest.Builder)localObject3).setLogEvents(localArrayList);
      ((ArrayList)localObject2).add(((LogRequest.Builder)localObject3).build());
    }
    return BatchedLogRequest.create((List)localObject2);
  }
  
  private static TelephonyManager getTelephonyManager(Context paramContext)
  {
    return (TelephonyManager)paramContext.getSystemService("phone");
  }
  
  @VisibleForTesting
  public static long getTzOffset()
  {
    Calendar.getInstance();
    return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
  }
  
  private static InputStream maybeUnGzip(InputStream paramInputStream, String paramString)
    throws IOException
  {
    if ("gzip".equals(paramString)) {
      return new GZIPInputStream(paramInputStream);
    }
    return paramInputStream;
  }
  
  private static URL parseUrlOrThrow(String paramString)
  {
    try
    {
      URL localURL = new URL(paramString);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      throw new IllegalArgumentException(z2.o("Invalid url: ", paramString), localMalformedURLException);
    }
  }
  
  public EventInternal decorate(EventInternal paramEventInternal)
  {
    NetworkInfo localNetworkInfo = connectivityManager.getActiveNetworkInfo();
    return paramEventInternal.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata("hardware", Build.HARDWARE).addMetadata("device", Build.DEVICE).addMetadata("product", Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata("manufacturer", Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT).addMetadata("tz-offset", getTzOffset()).addMetadata("net-type", getNetTypeValue(localNetworkInfo)).addMetadata("mobile-subtype", getNetSubtypeValue(localNetworkInfo)).addMetadata("country", Locale.getDefault().getCountry()).addMetadata("locale", Locale.getDefault().getLanguage()).addMetadata("mcc_mnc", getTelephonyManager(applicationContext).getSimOperator()).addMetadata("application_build", Integer.toString(getPackageVersionCode(applicationContext))).build();
  }
  
  public BackendResponse send(BackendRequest paramBackendRequest)
  {
    BatchedLogRequest localBatchedLogRequest = getRequestBody(paramBackendRequest);
    URL localURL = endPoint;
    Object localObject1 = paramBackendRequest.getExtras();
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = localURL;
    if (localObject1 != null) {
      try
      {
        localObject1 = CCTDestination.fromByteArray(paramBackendRequest.getExtras());
        paramBackendRequest = (BackendRequest)localObject3;
        if (((CCTDestination)localObject1).getAPIKey() != null) {
          paramBackendRequest = ((CCTDestination)localObject1).getAPIKey();
        }
        localObject4 = localURL;
        localObject2 = paramBackendRequest;
        if (((CCTDestination)localObject1).getEndPoint() != null)
        {
          localObject4 = parseUrlOrThrow(((CCTDestination)localObject1).getEndPoint());
          localObject2 = paramBackendRequest;
        }
      }
      catch (IllegalArgumentException paramBackendRequest)
      {
        return BackendResponse.fatalError();
      }
    }
    try
    {
      paramBackendRequest = new com/google/android/datatransport/cct/CctTransportBackend$HttpRequest;
      paramBackendRequest.<init>((URL)localObject4, localBatchedLogRequest, (String)localObject2);
      localObject2 = new com/google/android/datatransport/cct/a;
      ((a)localObject2).<init>(this);
      localObject4 = new com/google/android/datatransport/cct/b;
      ((b)localObject4).<init>();
      paramBackendRequest = (HttpResponse)Retries.retry(5, paramBackendRequest, (Function)localObject2, (RetryStrategy)localObject4);
      int i = code;
      if (i == 200) {
        return BackendResponse.ok(nextRequestMillis);
      }
      if ((i < 500) && (i != 404))
      {
        if (i == 400) {
          return BackendResponse.invalidPayload();
        }
        return BackendResponse.fatalError();
      }
      paramBackendRequest = BackendResponse.transientError();
      return paramBackendRequest;
    }
    catch (IOException paramBackendRequest)
    {
      Logging.e("CctTransportBackend", "Could not make request to the backend", paramBackendRequest);
    }
    return BackendResponse.transientError();
  }
  
  public static final class HttpRequest
  {
    @Nullable
    public final String apiKey;
    public final BatchedLogRequest requestBody;
    public final URL url;
    
    public HttpRequest(URL paramURL, BatchedLogRequest paramBatchedLogRequest, @Nullable String paramString)
    {
      url = paramURL;
      requestBody = paramBatchedLogRequest;
      apiKey = paramString;
    }
    
    public HttpRequest withUrl(URL paramURL)
    {
      return new HttpRequest(paramURL, requestBody, apiKey);
    }
  }
  
  public static final class HttpResponse
  {
    public final int code;
    public final long nextRequestMillis;
    @Nullable
    public final URL redirectUrl;
    
    public HttpResponse(int paramInt, @Nullable URL paramURL, long paramLong)
    {
      code = paramInt;
      redirectUrl = paramURL;
      nextRequestMillis = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.CctTransportBackend
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
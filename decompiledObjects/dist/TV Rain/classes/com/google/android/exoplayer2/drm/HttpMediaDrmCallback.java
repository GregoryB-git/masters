package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.HttpDataSource.Factory;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
public final class HttpMediaDrmCallback
  implements MediaDrmCallback
{
  private static final int MAX_MANUAL_REDIRECTS = 5;
  private final HttpDataSource.Factory dataSourceFactory;
  private final String defaultLicenseUrl;
  private final boolean forceDefaultLicenseUrl;
  private final Map<String, String> keyRequestProperties;
  
  public HttpMediaDrmCallback(String paramString, HttpDataSource.Factory paramFactory)
  {
    this(paramString, false, paramFactory);
  }
  
  public HttpMediaDrmCallback(String paramString, boolean paramBoolean, HttpDataSource.Factory paramFactory)
  {
    dataSourceFactory = paramFactory;
    defaultLicenseUrl = paramString;
    forceDefaultLicenseUrl = paramBoolean;
    keyRequestProperties = new HashMap();
  }
  
  /* Error */
  private static byte[] executePost(HttpDataSource.Factory paramFactory, String paramString, byte[] paramArrayOfByte, Map<String, String> paramMap)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface 53 1 0
    //   6: astore 4
    //   8: aload_3
    //   9: ifnull +62 -> 71
    //   12: aload_3
    //   13: invokeinterface 59 1 0
    //   18: invokeinterface 65 1 0
    //   23: astore_3
    //   24: aload_3
    //   25: invokeinterface 71 1 0
    //   30: ifeq +41 -> 71
    //   33: aload_3
    //   34: invokeinterface 75 1 0
    //   39: checkcast 77	java/util/Map$Entry
    //   42: astore_0
    //   43: aload 4
    //   45: aload_0
    //   46: invokeinterface 80 1 0
    //   51: checkcast 82	java/lang/String
    //   54: aload_0
    //   55: invokeinterface 85 1 0
    //   60: checkcast 82	java/lang/String
    //   63: invokeinterface 91 3 0
    //   68: goto -44 -> 24
    //   71: aload_1
    //   72: astore_0
    //   73: iconst_0
    //   74: istore 5
    //   76: new 93	com/google/android/exoplayer2/upstream/DataSourceInputStream
    //   79: dup
    //   80: aload 4
    //   82: new 95	com/google/android/exoplayer2/upstream/DataSpec
    //   85: dup
    //   86: aload_0
    //   87: invokestatic 101	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   90: aload_2
    //   91: lconst_0
    //   92: lconst_0
    //   93: ldc2_w 102
    //   96: aconst_null
    //   97: iconst_1
    //   98: invokespecial 106	com/google/android/exoplayer2/upstream/DataSpec:<init>	(Landroid/net/Uri;[BJJJLjava/lang/String;I)V
    //   101: invokespecial 109	com/google/android/exoplayer2/upstream/DataSourceInputStream:<init>	(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSpec;)V
    //   104: astore_1
    //   105: aload_1
    //   106: invokestatic 115	com/google/android/exoplayer2/util/Util:toByteArray	(Ljava/io/InputStream;)[B
    //   109: astore_0
    //   110: aload_1
    //   111: invokestatic 119	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   114: aload_0
    //   115: areturn
    //   116: astore_0
    //   117: goto +89 -> 206
    //   120: astore_3
    //   121: aload_3
    //   122: getfield 122	com/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException:responseCode	I
    //   125: sipush 307
    //   128: if_icmpeq +17 -> 145
    //   131: iload 5
    //   133: istore 6
    //   135: aload_3
    //   136: getfield 122	com/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException:responseCode	I
    //   139: sipush 308
    //   142: if_icmpne +29 -> 171
    //   145: iload 5
    //   147: iconst_1
    //   148: iadd
    //   149: istore 6
    //   151: iload 5
    //   153: iconst_5
    //   154: if_icmpge +17 -> 171
    //   157: iconst_1
    //   158: istore 7
    //   160: iload 6
    //   162: istore 5
    //   164: iload 7
    //   166: istore 6
    //   168: goto +10 -> 178
    //   171: iload 6
    //   173: istore 5
    //   175: iconst_0
    //   176: istore 6
    //   178: iload 6
    //   180: ifeq +11 -> 191
    //   183: aload_3
    //   184: invokestatic 126	com/google/android/exoplayer2/drm/HttpMediaDrmCallback:getRedirectUrl	(Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;)Ljava/lang/String;
    //   187: astore_0
    //   188: goto +5 -> 193
    //   191: aconst_null
    //   192: astore_0
    //   193: aload_0
    //   194: ifnull +10 -> 204
    //   197: aload_1
    //   198: invokestatic 119	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   201: goto -125 -> 76
    //   204: aload_3
    //   205: athrow
    //   206: aload_1
    //   207: invokestatic 119	com/google/android/exoplayer2/util/Util:closeQuietly	(Ljava/io/Closeable;)V
    //   210: aload_0
    //   211: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	paramFactory	HttpDataSource.Factory
    //   0	212	1	paramString	String
    //   0	212	2	paramArrayOfByte	byte[]
    //   0	212	3	paramMap	Map<String, String>
    //   6	75	4	localHttpDataSource	com.google.android.exoplayer2.upstream.HttpDataSource
    //   74	100	5	i	int
    //   133	46	6	j	int
    //   158	7	7	k	int
    // Exception table:
    //   from	to	target	type
    //   105	110	116	finally
    //   121	131	116	finally
    //   135	145	116	finally
    //   183	188	116	finally
    //   204	206	116	finally
    //   105	110	120	com/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException
  }
  
  private static String getRedirectUrl(HttpDataSource.InvalidResponseCodeException paramInvalidResponseCodeException)
  {
    paramInvalidResponseCodeException = headerFields;
    if (paramInvalidResponseCodeException != null)
    {
      paramInvalidResponseCodeException = (List)paramInvalidResponseCodeException.get("Location");
      if ((paramInvalidResponseCodeException != null) && (!paramInvalidResponseCodeException.isEmpty())) {
        return (String)paramInvalidResponseCodeException.get(0);
      }
    }
    return null;
  }
  
  public void clearAllKeyRequestProperties()
  {
    synchronized (keyRequestProperties)
    {
      keyRequestProperties.clear();
      return;
    }
  }
  
  public void clearKeyRequestProperty(String paramString)
  {
    Assertions.checkNotNull(paramString);
    synchronized (keyRequestProperties)
    {
      keyRequestProperties.remove(paramString);
      return;
    }
  }
  
  public byte[] executeKeyRequest(UUID arg1, ExoMediaDrm.KeyRequest paramKeyRequest)
    throws Exception
  {
    String str1 = paramKeyRequest.getLicenseServerUrl();
    String str2;
    if (!forceDefaultLicenseUrl)
    {
      str2 = str1;
      if (!TextUtils.isEmpty(str1)) {}
    }
    else
    {
      str2 = defaultLicenseUrl;
    }
    HashMap localHashMap = new HashMap();
    UUID localUUID = C.PLAYREADY_UUID;
    if (localUUID.equals(???)) {
      str1 = "text/xml";
    } else if (C.CLEARKEY_UUID.equals(???)) {
      str1 = "application/json";
    } else {
      str1 = "application/octet-stream";
    }
    localHashMap.put("Content-Type", str1);
    if (localUUID.equals(???)) {
      localHashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
    }
    synchronized (keyRequestProperties)
    {
      localHashMap.putAll(keyRequestProperties);
      return executePost(dataSourceFactory, str2, paramKeyRequest.getData(), localHashMap);
    }
  }
  
  public byte[] executeProvisionRequest(UUID paramUUID, ExoMediaDrm.ProvisionRequest paramProvisionRequest)
    throws IOException
  {
    paramUUID = new StringBuilder();
    paramUUID.append(paramProvisionRequest.getDefaultUrl());
    paramUUID.append("&signedRequest=");
    paramUUID.append(Util.fromUtf8Bytes(paramProvisionRequest.getData()));
    paramUUID = paramUUID.toString();
    return executePost(dataSourceFactory, paramUUID, Util.EMPTY_BYTE_ARRAY, null);
  }
  
  public void setKeyRequestProperty(String paramString1, String paramString2)
  {
    Assertions.checkNotNull(paramString1);
    Assertions.checkNotNull(paramString2);
    synchronized (keyRequestProperties)
    {
      keyRequestProperties.put(paramString1, paramString2);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.HttpMediaDrmCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
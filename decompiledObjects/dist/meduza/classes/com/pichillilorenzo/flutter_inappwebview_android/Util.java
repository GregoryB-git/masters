package com.pichillilorenzo.flutter_inappwebview_android;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslCertificate;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowInsets.Type;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import g;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONArray;
import org.json.JSONObject;

public class Util
{
  public static final String ANDROID_ASSET_URL = "file:///android_asset/";
  public static final String LOG_TAG = "Util";
  
  public static String JSONStringify(Object paramObject)
  {
    if (paramObject == null) {
      return "null";
    }
    if ((paramObject instanceof Map)) {
      return new JSONObject((Map)paramObject).toString();
    }
    if ((paramObject instanceof List)) {
      return new JSONArray((List)paramObject).toString();
    }
    if ((paramObject instanceof String)) {
      return JSONObject.quote((String)paramObject);
    }
    return JSONObject.wrap(paramObject).toString();
  }
  
  public static Drawable drawableFromBytes(Context paramContext, byte[] paramArrayOfByte)
  {
    return new BitmapDrawable(paramContext.getResources(), BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length));
  }
  
  public static InputStream getFileAsset(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, String paramString)
  {
    paramString = flutterAssets.getAssetFilePathByName(paramString);
    return applicationContext.getResources().getAssets().open(paramString);
  }
  
  public static Size2D getFullscreenSize(Context paramContext)
  {
    Size2D localSize2D = new Size2D(-1.0D, -1.0D);
    Object localObject = (WindowManager)paramContext.getSystemService("window");
    if (localObject != null)
    {
      int j;
      if (Build.VERSION.SDK_INT >= 30)
      {
        paramContext = ((WindowManager)localObject).getCurrentWindowMetrics();
        localObject = paramContext.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        int i = right;
        j = left;
        int k = top;
        int m = bottom;
        paramContext = paramContext.getBounds();
        localSize2D.setWidth(paramContext.width() - (i + j));
        j = paramContext.height() - (k + m);
      }
      else
      {
        paramContext = new DisplayMetrics();
        ((WindowManager)localObject).getDefaultDisplay().getMetrics(paramContext);
        localSize2D.setWidth(widthPixels);
        j = heightPixels;
      }
      localSize2D.setHeight(j);
    }
    return localSize2D;
  }
  
  public static <T> T getOrDefault(Map<String, Object> paramMap, String paramString, T paramT)
  {
    if (paramMap.containsKey(paramString)) {
      paramT = paramMap.get(paramString);
    }
    return paramT;
  }
  
  public static float getPixelDensity(Context paramContext)
  {
    return getResourcesgetDisplayMetricsdensity;
  }
  
  /* Error */
  public static String getUrlAsset(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 82	com/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin:flutterAssets	Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterAssets;
    //   4: aload_1
    //   5: invokeinterface 87 2 0
    //   10: astore_2
    //   11: aload_0
    //   12: aload_1
    //   13: invokestatic 230	com/pichillilorenzo/flutter_inappwebview_android/Util:getFileAsset	(Lcom/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin;Ljava/lang/String;)Ljava/io/InputStream;
    //   16: astore_0
    //   17: aload_0
    //   18: ifnull +7 -> 25
    //   21: aload_0
    //   22: invokevirtual 235	java/io/InputStream:close	()V
    //   25: aconst_null
    //   26: astore_0
    //   27: goto +7 -> 34
    //   30: astore_0
    //   31: aload_0
    //   32: athrow
    //   33: astore_0
    //   34: aload_0
    //   35: ifnonnull +10 -> 45
    //   38: ldc 13
    //   40: aload_2
    //   41: invokestatic 241	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   44: areturn
    //   45: aload_0
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	paramInAppWebViewFlutterPlugin	InAppWebViewFlutterPlugin
    //   0	47	1	paramString	String
    //   10	31	2	str	String
    // Exception table:
    //   from	to	target	type
    //   11	17	30	finally
    //   11	17	33	java/io/IOException
    //   21	25	33	java/io/IOException
  }
  
  public static X509Certificate getX509CertFromSslCertHack(SslCertificate paramSslCertificate)
  {
    Object localObject = SslCertificate.saveState(paramSslCertificate).getByteArray("x509-certificate");
    paramSslCertificate = null;
    if (localObject != null) {}
    try
    {
      CertificateFactory localCertificateFactory = CertificateFactory.getInstance("X.509");
      ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
      localByteArrayInputStream.<init>((byte[])localObject);
      localObject = (X509Certificate)localCertificateFactory.generateCertificate(localByteArrayInputStream);
      paramSslCertificate = (SslCertificate)localObject;
    }
    catch (CertificateException localCertificateException)
    {
      for (;;) {}
    }
    return paramSslCertificate;
  }
  
  public static <T> T invokeMethodAndWaitResult(MethodChannel paramMethodChannel, final String paramString, final Object paramObject, final SyncBaseCallbackResultImpl<T> paramSyncBaseCallbackResultImpl)
  {
    new Handler(Looper.getMainLooper()).post(new Runnable()
    {
      public void run()
      {
        val$channel.invokeMethod(paramString, paramObject, paramSyncBaseCallbackResultImpl);
      }
    });
    latch.await();
    return (T)result;
  }
  
  public static <O> Object invokeMethodIfExists(O paramO, String paramString, Object... paramVarArgs)
  {
    for (Method localMethod : paramO.getClass().getMethods()) {
      if (localMethod.getName().equals(paramString)) {
        try
        {
          paramO = localMethod.invoke(paramO, paramVarArgs);
          return paramO;
        }
        catch (IllegalAccessException|InvocationTargetException paramO)
        {
          return null;
        }
      }
    }
    return null;
  }
  
  public static boolean isClass(String paramString)
  {
    try
    {
      Class.forName(paramString);
      return true;
    }
    catch (ClassNotFoundException paramString) {}
    return false;
  }
  
  public static boolean isIPv6(String paramString)
  {
    try
    {
      InetAddress.getByName(paramString);
      return true;
    }
    catch (UnknownHostException paramString) {}
    return false;
  }
  
  /* Error */
  public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 230	com/pichillilorenzo/flutter_inappwebview_android/Util:getFileAsset	(Lcom/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin;Ljava/lang/String;)Ljava/io/InputStream;
    //   11: astore_0
    //   12: goto +6 -> 18
    //   15: astore_0
    //   16: aconst_null
    //   17: astore_0
    //   18: aload_0
    //   19: astore 6
    //   21: aload_0
    //   22: ifnonnull +34 -> 56
    //   25: aload_0
    //   26: astore 7
    //   28: aload 4
    //   30: astore 8
    //   32: aload_0
    //   33: astore 9
    //   35: new 366	java/io/FileInputStream
    //   38: astore 6
    //   40: aload_0
    //   41: astore 7
    //   43: aload 4
    //   45: astore 8
    //   47: aload_0
    //   48: astore 9
    //   50: aload 6
    //   52: aload_1
    //   53: invokespecial 369	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   56: aload 6
    //   58: astore 7
    //   60: aload 4
    //   62: astore 8
    //   64: aload 6
    //   66: astore 9
    //   68: aload_3
    //   69: invokestatic 374	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   72: astore_1
    //   73: aload_2
    //   74: ifnull +8 -> 82
    //   77: aload_2
    //   78: astore_0
    //   79: goto +7 -> 86
    //   82: ldc_w 376
    //   85: astore_0
    //   86: aload 6
    //   88: astore 7
    //   90: aload 4
    //   92: astore 8
    //   94: aload 6
    //   96: astore 9
    //   98: aload_1
    //   99: aload 6
    //   101: aload_0
    //   102: invokevirtual 380	java/lang/String:toCharArray	()[C
    //   105: invokevirtual 384	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   108: aload 6
    //   110: astore 7
    //   112: aload 4
    //   114: astore 8
    //   116: aload 6
    //   118: astore 9
    //   120: aload_1
    //   121: invokevirtual 388	java/security/KeyStore:aliases	()Ljava/util/Enumeration;
    //   124: invokeinterface 394 1 0
    //   129: checkcast 46	java/lang/String
    //   132: astore_3
    //   133: aload_2
    //   134: ifnull +6 -> 140
    //   137: goto +7 -> 144
    //   140: ldc_w 376
    //   143: astore_2
    //   144: aload 6
    //   146: astore 7
    //   148: aload 4
    //   150: astore 8
    //   152: aload 6
    //   154: astore 9
    //   156: aload_1
    //   157: aload_3
    //   158: aload_2
    //   159: invokevirtual 380	java/lang/String:toCharArray	()[C
    //   162: invokevirtual 398	java/security/KeyStore:getKey	(Ljava/lang/String;[C)Ljava/security/Key;
    //   165: astore_2
    //   166: aload 5
    //   168: astore_0
    //   169: aload 6
    //   171: astore 7
    //   173: aload 4
    //   175: astore 8
    //   177: aload 6
    //   179: astore 9
    //   181: aload_2
    //   182: instanceof 400
    //   185: ifeq +82 -> 267
    //   188: aload 6
    //   190: astore 7
    //   192: aload 4
    //   194: astore 8
    //   196: aload 6
    //   198: astore 9
    //   200: aload_2
    //   201: checkcast 400	java/security/PrivateKey
    //   204: astore_2
    //   205: aload 6
    //   207: astore 7
    //   209: aload 4
    //   211: astore 8
    //   213: aload 6
    //   215: astore 9
    //   217: aload_1
    //   218: aload_3
    //   219: invokevirtual 404	java/security/KeyStore:getCertificate	(Ljava/lang/String;)Ljava/security/cert/Certificate;
    //   222: checkcast 278	java/security/cert/X509Certificate
    //   225: astore_1
    //   226: aload 6
    //   228: astore 7
    //   230: aload 4
    //   232: astore 8
    //   234: aload 6
    //   236: astore 9
    //   238: new 8	com/pichillilorenzo/flutter_inappwebview_android/Util$PrivateKeyAndCertificates
    //   241: astore_0
    //   242: aload 6
    //   244: astore 7
    //   246: aload 4
    //   248: astore 8
    //   250: aload 6
    //   252: astore 9
    //   254: aload_0
    //   255: aload_2
    //   256: iconst_1
    //   257: anewarray 278	java/security/cert/X509Certificate
    //   260: dup
    //   261: iconst_0
    //   262: aload_1
    //   263: aastore
    //   264: invokespecial 407	com/pichillilorenzo/flutter_inappwebview_android/Util$PrivateKeyAndCertificates:<init>	(Ljava/security/PrivateKey;[Ljava/security/cert/X509Certificate;)V
    //   267: aload 6
    //   269: astore 7
    //   271: aload_0
    //   272: astore 8
    //   274: aload 6
    //   276: astore 9
    //   278: aload 6
    //   280: invokevirtual 235	java/io/InputStream:close	()V
    //   283: aload_0
    //   284: astore_1
    //   285: aload 6
    //   287: invokevirtual 235	java/io/InputStream:close	()V
    //   290: goto +57 -> 347
    //   293: astore_0
    //   294: ldc 16
    //   296: ldc_w 376
    //   299: aload_0
    //   300: invokestatic 413	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   303: pop
    //   304: aload_1
    //   305: astore_0
    //   306: goto +41 -> 347
    //   309: astore_0
    //   310: goto +39 -> 349
    //   313: astore_0
    //   314: aload 9
    //   316: astore 7
    //   318: ldc 16
    //   320: ldc_w 376
    //   323: aload_0
    //   324: invokestatic 413	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   327: pop
    //   328: aload 8
    //   330: astore_0
    //   331: aload 9
    //   333: ifnull +14 -> 347
    //   336: aload 8
    //   338: astore_1
    //   339: aload 9
    //   341: invokevirtual 235	java/io/InputStream:close	()V
    //   344: aload 8
    //   346: astore_0
    //   347: aload_0
    //   348: areturn
    //   349: aload 7
    //   351: ifnull +22 -> 373
    //   354: aload 7
    //   356: invokevirtual 235	java/io/InputStream:close	()V
    //   359: goto +14 -> 373
    //   362: astore_1
    //   363: ldc 16
    //   365: ldc_w 376
    //   368: aload_1
    //   369: invokestatic 413	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   372: pop
    //   373: aload_0
    //   374: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	375	0	paramInAppWebViewFlutterPlugin	InAppWebViewFlutterPlugin
    //   0	375	1	paramString1	String
    //   0	375	2	paramString2	String
    //   0	375	3	paramString3	String
    //   1	246	4	localObject1	Object
    //   4	163	5	localObject2	Object
    //   19	267	6	localObject3	Object
    //   26	329	7	localObject4	Object
    //   30	315	8	localObject5	Object
    //   33	307	9	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   6	12	15	java/io/IOException
    //   285	290	293	java/io/IOException
    //   339	344	293	java/io/IOException
    //   35	40	309	finally
    //   50	56	309	finally
    //   68	73	309	finally
    //   98	108	309	finally
    //   120	133	309	finally
    //   156	166	309	finally
    //   181	188	309	finally
    //   200	205	309	finally
    //   217	226	309	finally
    //   238	242	309	finally
    //   254	267	309	finally
    //   278	283	309	finally
    //   318	328	309	finally
    //   35	40	313	java/lang/Exception
    //   50	56	313	java/lang/Exception
    //   68	73	313	java/lang/Exception
    //   98	108	313	java/lang/Exception
    //   120	133	313	java/lang/Exception
    //   156	166	313	java/lang/Exception
    //   181	188	313	java/lang/Exception
    //   200	205	313	java/lang/Exception
    //   217	226	313	java/lang/Exception
    //   238	242	313	java/lang/Exception
    //   254	267	313	java/lang/Exception
    //   278	283	313	java/lang/Exception
    //   354	359	362	java/io/IOException
  }
  
  public static void log(String paramString1, String paramString2)
  {
    int i = paramString2.length();
    int j = 0;
    if (j < i)
    {
      int k = paramString2.indexOf('\n', j);
      if (k == -1) {
        k = i;
      }
      for (;;)
      {
        int m = Math.min(k, j + 4000);
        Log.d(paramString1, paramString2.substring(j, m));
        if (m >= k)
        {
          j = m + 1;
          break;
        }
        j = m;
      }
    }
  }
  
  public static HttpURLConnection makeHttpRequest(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    try
    {
      Object localObject = new java/net/URL;
      ((URL)localObject).<init>(paramString1);
      paramString1 = (HttpURLConnection)((URL)localObject).openConnection();
      try
      {
        paramString1.setRequestMethod(paramString2);
        if (paramMap != null)
        {
          paramMap = paramMap.entrySet().iterator();
          while (paramMap.hasNext())
          {
            localObject = (Map.Entry)paramMap.next();
            paramString1.setRequestProperty((String)((Map.Entry)localObject).getKey(), (String)((Map.Entry)localObject).getValue());
          }
        }
        paramString1.setConnectTimeout(15000);
        paramString1.setReadTimeout(15000);
        paramString1.setDoInput(true);
        paramString1.setInstanceFollowRedirects(true);
        if ("GET".equalsIgnoreCase(paramString2)) {
          paramString1.setDoOutput(false);
        }
        paramString1.connect();
        return paramString1;
      }
      catch (Exception paramString2) {}
      if ((paramString2 instanceof SSLHandshakeException)) {
        break label151;
      }
    }
    catch (Exception paramString2)
    {
      paramString1 = null;
    }
    Log.e("Util", "", paramString2);
    label151:
    if (paramString1 != null) {
      paramString1.disconnect();
    }
    return null;
  }
  
  public static String normalizeIPv6(String paramString)
  {
    if (isIPv6(paramString)) {
      return InetAddress.getByName(paramString).getCanonicalHostName();
    }
    throw new Exception(g.d("Invalid address: ", paramString));
  }
  
  public static boolean objEquals(Object paramObject1, Object paramObject2)
  {
    return Objects.equals(paramObject1, paramObject2);
  }
  
  /* Error */
  public static byte[] readAllBytes(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: ifnonnull +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: sipush 4096
    //   11: newarray <illegal type>
    //   13: astore_2
    //   14: new 529	java/io/ByteArrayOutputStream
    //   17: dup
    //   18: invokespecial 530	java/io/ByteArrayOutputStream:<init>	()V
    //   21: astore_3
    //   22: aload_0
    //   23: aload_2
    //   24: iconst_0
    //   25: sipush 4096
    //   28: invokevirtual 534	java/io/InputStream:read	([BII)I
    //   31: istore 4
    //   33: iload 4
    //   35: iconst_m1
    //   36: if_icmpeq +14 -> 50
    //   39: aload_3
    //   40: aload_2
    //   41: iconst_0
    //   42: iload 4
    //   44: invokevirtual 538	java/io/ByteArrayOutputStream:write	([BII)V
    //   47: goto -25 -> 22
    //   50: aload_3
    //   51: invokevirtual 542	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   54: astore_2
    //   55: aload_0
    //   56: invokevirtual 235	java/io/InputStream:close	()V
    //   59: aload_3
    //   60: invokevirtual 543	java/io/ByteArrayOutputStream:close	()V
    //   63: aload_2
    //   64: astore_0
    //   65: goto +45 -> 110
    //   68: astore_1
    //   69: aload_0
    //   70: invokevirtual 235	java/io/InputStream:close	()V
    //   73: aload_3
    //   74: invokevirtual 543	java/io/ByteArrayOutputStream:close	()V
    //   77: aload_1
    //   78: athrow
    //   79: astore_2
    //   80: aload_0
    //   81: invokevirtual 235	java/io/InputStream:close	()V
    //   84: goto +9 -> 93
    //   87: astore_0
    //   88: aload_2
    //   89: aload_0
    //   90: invokevirtual 549	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   93: aload_3
    //   94: invokevirtual 543	java/io/ByteArrayOutputStream:close	()V
    //   97: aload_1
    //   98: astore_0
    //   99: goto +11 -> 110
    //   102: astore_0
    //   103: aload_2
    //   104: aload_0
    //   105: invokevirtual 549	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   108: aload_1
    //   109: astore_0
    //   110: aload_0
    //   111: areturn
    //   112: astore_0
    //   113: goto -54 -> 59
    //   116: astore_0
    //   117: aload_2
    //   118: astore_0
    //   119: goto -9 -> 110
    //   122: astore_0
    //   123: goto -50 -> 73
    //   126: astore_0
    //   127: goto -50 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	paramInputStream	InputStream
    //   1	1	1	localObject1	Object
    //   68	41	1	localObject2	Object
    //   13	51	2	arrayOfByte	byte[]
    //   79	39	2	localIOException	java.io.IOException
    //   21	73	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   31	12	4	i	int
    // Exception table:
    //   from	to	target	type
    //   22	33	68	finally
    //   39	47	68	finally
    //   50	55	68	finally
    //   22	33	79	java/io/IOException
    //   39	47	79	java/io/IOException
    //   50	55	79	java/io/IOException
    //   80	84	87	java/io/IOException
    //   93	97	102	java/io/IOException
    //   55	59	112	java/io/IOException
    //   59	63	116	java/io/IOException
    //   69	73	122	java/io/IOException
    //   73	77	126	java/io/IOException
  }
  
  public static String replaceAll(String paramString1, String paramString2, String paramString3)
  {
    return TextUtils.join(paramString3, paramString1.split(Pattern.quote(paramString2)));
  }
  
  public static class PrivateKeyAndCertificates
  {
    public X509Certificate[] certificates;
    public PrivateKey privateKey;
    
    public PrivateKeyAndCertificates(PrivateKey paramPrivateKey, X509Certificate[] paramArrayOfX509Certificate)
    {
      privateKey = paramPrivateKey;
      certificates = paramArrayOfX509Certificate;
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.Util
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
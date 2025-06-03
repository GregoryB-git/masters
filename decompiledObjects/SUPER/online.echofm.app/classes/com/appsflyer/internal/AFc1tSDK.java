package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1tSDK
{
  @NotNull
  private static String valueOf = "https://%smonitorsdk.%s/remote-debug/exception-manager";
  @NotNull
  private byte[] AFInAppEventParameterName;
  private Map<String, String> AFKeystoreWrapper;
  private final int values;
  
  static
  {
    new AFa1wSDK((byte)0);
  }
  
  public AFc1tSDK(@NotNull byte[] paramArrayOfByte, Map<String, String> paramMap, int paramInt)
  {
    AFInAppEventParameterName = paramArrayOfByte;
    AFKeystoreWrapper = paramMap;
    values = paramInt;
  }
  
  public final boolean AFInAppEventParameterName()
  {
    long l1 = System.currentTimeMillis();
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2;
    boolean bool2;
    label853:
    label861:
    label877:
    String str2;
    try
    {
      localObject3 = String.format(valueOf, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), AFa1eSDK.valueOf().getHostName() });
      Intrinsics.checkNotNullExpressionValue(localObject3, "");
      Intrinsics.checkNotNullParameter(localObject3, "");
      Object localObject4 = new java/net/URL;
      ((URL)localObject4).<init>((String)localObject3);
      localObject4 = (URLConnection)FirebasePerfUrlConnection.instrument(((URL)localObject4).openConnection());
      if (localObject4 == null) {
        break label861;
      }
      localObject3 = (HttpURLConnection)localObject4;
      Object localObject9;
      try
      {
        ((HttpURLConnection)localObject3).setRequestMethod("POST");
        localObject1 = new java/lang/StringBuilder;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append(((HttpURLConnection)localObject3).getRequestMethod());
        ((StringBuilder)localObject4).append(':');
        ((StringBuilder)localObject4).append(((URLConnection)localObject3).getURL());
        ((StringBuilder)localObject1).<init>(localObject4.toString());
        ((StringBuilder)localObject1).append("\n length: ");
        localObject4 = new java/lang/String;
        ((String)localObject4).<init>(AFInAppEventParameterName, b.b);
        ((StringBuilder)localObject1).append(((String)localObject4).length());
        localObject4 = AFKeystoreWrapper;
        if (localObject4 != null)
        {
          localObject4 = ((Map)localObject4).entrySet().iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject9 = (Map.Entry)((Iterator)localObject4).next();
            ((StringBuilder)localObject1).append("\n ");
            ((StringBuilder)localObject1).append((String)((Map.Entry)localObject9).getKey());
            ((StringBuilder)localObject1).append(": ");
            ((StringBuilder)localObject1).append((String)((Map.Entry)localObject9).getValue());
          }
        }
        localObject6 = new java/lang/StringBuilder;
      }
      finally
      {
        localObject1 = localObject3;
        break label877;
      }
      ((StringBuilder)localObject6).<init>("HTTP: [");
      ((StringBuilder)localObject6).append(localObject3.hashCode());
      ((StringBuilder)localObject6).append("] ");
      ((StringBuilder)localObject6).append(localObject1);
      localObject1 = localObject6.toString();
      Intrinsics.checkNotNullParameter(localObject1, "");
      AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(localObject1)));
      ((HttpURLConnection)localObject3).setInstanceFollowRedirects(false);
      ((URLConnection)localObject3).setUseCaches(false);
      ((URLConnection)localObject3).setReadTimeout(values);
      ((URLConnection)localObject3).setConnectTimeout(values);
      ((URLConnection)localObject3).addRequestProperty("Content-Type", "application/json");
      localObject1 = AFKeystoreWrapper;
      if (localObject1 != null)
      {
        localObject6 = ((Map)localObject1).entrySet().iterator();
        while (((Iterator)localObject6).hasNext())
        {
          localObject1 = (Map.Entry)((Iterator)localObject6).next();
          ((URLConnection)localObject3).addRequestProperty((String)((Map.Entry)localObject1).getKey(), (String)((Map.Entry)localObject1).getValue());
        }
      }
      ((URLConnection)localObject3).setDoOutput(true);
      ((URLConnection)localObject3).setRequestProperty("Content-Length", String.valueOf(AFInAppEventParameterName.length));
      try
      {
        localObject1 = ((URLConnection)localObject3).getOutputStream();
        Intrinsics.checkNotNullExpressionValue(localObject1, "");
        if ((localObject1 instanceof BufferedOutputStream)) {
          localObject1 = (BufferedOutputStream)localObject1;
        }
      }
      finally
      {
        break label853;
      }
      localObject2 = new BufferedOutputStream(localOutputStream, 8192);
      ((OutputStream)localObject2).write(AFInAppEventParameterName);
      ((OutputStream)localObject2).close();
      if (AFc1uSDK.AFa1wSDK.values((HttpURLConnection)localObject3)) {
        localObject2 = ((URLConnection)localObject3).getInputStream();
      } else {
        localObject2 = ((HttpURLConnection)localObject3).getErrorStream();
      }
      if (localObject2 != null)
      {
        Intrinsics.checkNotNullExpressionValue(localObject2, "");
        localObject9 = b.b;
        localObject6 = new java/io/InputStreamReader;
        ((InputStreamReader)localObject6).<init>((InputStream)localObject2, (Charset)localObject9);
        localObject2 = new java/io/BufferedReader;
        ((BufferedReader)localObject2).<init>((Reader)localObject6, 8192);
        localObject6 = W5.m.x((Iterable)e6.m.e((Reader)localObject2), null, null, null, 0, null, null, 63, null);
        ((Reader)localObject2).close();
        localObject2 = localObject6;
        if (localObject6 != null) {}
      }
      else
      {
        localObject2 = "";
      }
      l2 = System.currentTimeMillis();
      Object localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>("response code:");
      ((StringBuilder)localObject6).append(((HttpURLConnection)localObject3).getResponseCode());
      ((StringBuilder)localObject6).append(' ');
      ((StringBuilder)localObject6).append(((HttpURLConnection)localObject3).getResponseMessage());
      ((StringBuilder)localObject6).append("\n\tbody:");
      ((StringBuilder)localObject6).append((String)localObject2);
      ((StringBuilder)localObject6).append("\n\ttook ");
      ((StringBuilder)localObject6).append(l2 - l1);
      ((StringBuilder)localObject6).append("ms");
      localObject2 = localObject6.toString();
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>("HTTP: [");
      ((StringBuilder)localObject6).append(localObject3.hashCode());
      ((StringBuilder)localObject6).append("] ");
      ((StringBuilder)localObject6).append((String)localObject2);
      localObject2 = localObject6.toString();
      Intrinsics.checkNotNullParameter(localObject2, "");
      AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(localObject2)));
      bool2 = AFc1uSDK.AFa1wSDK.values((HttpURLConnection)localObject3);
      ((HttpURLConnection)localObject3).disconnect();
    }
    finally
    {
      Object localObject3;
      long l2;
      break label877;
      Object localObject8 = new java/lang/NullPointerException;
      ((NullPointerException)localObject8).<init>("null cannot be cast to non-null type java.net.HttpURLConnection");
      throw ((Throwable)localObject8);
      try
      {
        l2 = System.currentTimeMillis();
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("error: ");
        ((StringBuilder)localObject3).append(localObject8);
        ((StringBuilder)localObject3).append("\n\ttook ");
        ((StringBuilder)localObject3).append(l2 - l1);
        ((StringBuilder)localObject3).append("ms\n\t");
        ((StringBuilder)localObject3).append(((Throwable)localObject8).getMessage());
        localObject8 = localObject3.toString();
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("HTTP: [");
        if (localObject2 != null) {
          i = localObject2.hashCode();
        }
      }
      finally
      {
        break label1054;
      }
      int i = 0;
      ((StringBuilder)localObject3).append(i);
      ((StringBuilder)localObject3).append("] ");
      ((StringBuilder)localObject3).append(str1);
      str2 = localObject3.toString();
      Intrinsics.checkNotNullParameter(str2, "");
      AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(str2)));
      bool2 = bool1;
      if (localObject2 == null) {
        break label1051;
      }
      ((HttpURLConnection)localObject2).disconnect();
      bool2 = bool1;
    }
    throw ((Throwable)localObject2);
    label1051:
    return bool2;
    label1054:
    if (localObject2 != null) {
      ((HttpURLConnection)localObject2).disconnect();
    }
    throw str2;
  }
  
  @Metadata
  public static final class AFa1wSDK {}
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1tSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
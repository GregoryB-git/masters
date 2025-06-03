package com.google.firebase.perf.network;

import I4.h;
import L4.k;
import M4.l;
import androidx.annotation.Keep;
import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient
{
  public static Object a(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler, l paraml, k paramk)
  {
    paramk = G4.j.h(paramk);
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(paramHttpHost.toURI());
      ((StringBuilder)localObject).append(paramHttpRequest.getRequestLine().getUri());
      paramk.C(((StringBuilder)localObject).toString()).q(paramHttpRequest.getRequestLine().getMethod());
      localObject = I4.j.a(paramHttpRequest);
      if (localObject != null) {
        paramk.v(((Long)localObject).longValue());
      }
    }
    catch (IOException paramHttpClient)
    {
      break label142;
    }
    paraml.g();
    paramk.w(paraml.e());
    Object localObject = new I4/h;
    ((h)localObject).<init>(paramResponseHandler, paraml, paramk);
    paramHttpClient = paramHttpClient.execute(paramHttpHost, paramHttpRequest, (ResponseHandler)localObject);
    return paramHttpClient;
    label142:
    paramk.A(paraml.c());
    I4.j.d(paramk);
    throw paramHttpClient;
  }
  
  public static Object b(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext, l paraml, k paramk)
  {
    paramk = G4.j.h(paramk);
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(paramHttpHost.toURI());
      ((StringBuilder)localObject).append(paramHttpRequest.getRequestLine().getUri());
      paramk.C(((StringBuilder)localObject).toString()).q(paramHttpRequest.getRequestLine().getMethod());
      localObject = I4.j.a(paramHttpRequest);
      if (localObject != null) {
        paramk.v(((Long)localObject).longValue());
      }
    }
    catch (IOException paramHttpClient)
    {
      break label144;
    }
    paraml.g();
    paramk.w(paraml.e());
    Object localObject = new I4/h;
    ((h)localObject).<init>(paramResponseHandler, paraml, paramk);
    paramHttpClient = paramHttpClient.execute(paramHttpHost, paramHttpRequest, (ResponseHandler)localObject, paramHttpContext);
    return paramHttpClient;
    label144:
    paramk.A(paraml.c());
    I4.j.d(paramk);
    throw paramHttpClient;
  }
  
  public static Object c(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler, l paraml, k paramk)
  {
    paramk = G4.j.h(paramk);
    try
    {
      paramk.C(paramHttpUriRequest.getURI().toString()).q(paramHttpUriRequest.getMethod());
      localObject = I4.j.a(paramHttpUriRequest);
      if (localObject != null) {
        paramk.v(((Long)localObject).longValue());
      }
    }
    catch (IOException paramHttpClient)
    {
      break label100;
    }
    paraml.g();
    paramk.w(paraml.e());
    Object localObject = new I4/h;
    ((h)localObject).<init>(paramResponseHandler, paraml, paramk);
    paramHttpClient = paramHttpClient.execute(paramHttpUriRequest, (ResponseHandler)localObject);
    return paramHttpClient;
    label100:
    paramk.A(paraml.c());
    I4.j.d(paramk);
    throw paramHttpClient;
  }
  
  public static Object d(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext, l paraml, k paramk)
  {
    paramk = G4.j.h(paramk);
    try
    {
      paramk.C(paramHttpUriRequest.getURI().toString()).q(paramHttpUriRequest.getMethod());
      localObject = I4.j.a(paramHttpUriRequest);
      if (localObject != null) {
        paramk.v(((Long)localObject).longValue());
      }
    }
    catch (IOException paramHttpClient)
    {
      break label104;
    }
    paraml.g();
    paramk.w(paraml.e());
    Object localObject = new I4/h;
    ((h)localObject).<init>(paramResponseHandler, paraml, paramk);
    paramHttpClient = paramHttpClient.execute(paramHttpUriRequest, (ResponseHandler)localObject, paramHttpContext);
    return paramHttpClient;
    label104:
    paramk.A(paraml.c());
    I4.j.d(paramk);
    throw paramHttpClient;
  }
  
  public static HttpResponse e(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, l paraml, k paramk)
  {
    paramk = G4.j.h(paramk);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(paramHttpHost.toURI());
      ((StringBuilder)localObject).append(paramHttpRequest.getRequestLine().getUri());
      paramk.C(((StringBuilder)localObject).toString()).q(paramHttpRequest.getRequestLine().getMethod());
      localObject = I4.j.a(paramHttpRequest);
      if (localObject != null) {
        paramk.v(((Long)localObject).longValue());
      }
    }
    catch (IOException paramHttpClient)
    {
      break label191;
    }
    paraml.g();
    paramk.w(paraml.e());
    paramHttpClient = paramHttpClient.execute(paramHttpHost, paramHttpRequest);
    paramk.A(paraml.c());
    paramk.r(paramHttpClient.getStatusLine().getStatusCode());
    paramHttpHost = I4.j.a(paramHttpClient);
    if (paramHttpHost != null) {
      paramk.y(paramHttpHost.longValue());
    }
    paramHttpHost = I4.j.b(paramHttpClient);
    if (paramHttpHost != null) {
      paramk.x(paramHttpHost);
    }
    paramk.g();
    return paramHttpClient;
    label191:
    paramk.A(paraml.c());
    I4.j.d(paramk);
    throw paramHttpClient;
  }
  
  @Keep
  public static <T> T execute(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler<? extends T> paramResponseHandler)
  {
    return (T)a(paramHttpClient, paramHttpHost, paramHttpRequest, paramResponseHandler, new l(), k.l());
  }
  
  @Keep
  public static <T> T execute(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler<? extends T> paramResponseHandler, HttpContext paramHttpContext)
  {
    return (T)b(paramHttpClient, paramHttpHost, paramHttpRequest, paramResponseHandler, paramHttpContext, new l(), k.l());
  }
  
  @Keep
  public static <T> T execute(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, ResponseHandler<T> paramResponseHandler)
  {
    return (T)c(paramHttpClient, paramHttpUriRequest, paramResponseHandler, new l(), k.l());
  }
  
  @Keep
  public static <T> T execute(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, ResponseHandler<T> paramResponseHandler, HttpContext paramHttpContext)
  {
    return (T)d(paramHttpClient, paramHttpUriRequest, paramResponseHandler, paramHttpContext, new l(), k.l());
  }
  
  @Keep
  public static HttpResponse execute(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest)
  {
    return e(paramHttpClient, paramHttpHost, paramHttpRequest, new l(), k.l());
  }
  
  @Keep
  public static HttpResponse execute(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    return f(paramHttpClient, paramHttpHost, paramHttpRequest, paramHttpContext, new l(), k.l());
  }
  
  @Keep
  public static HttpResponse execute(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest)
  {
    return g(paramHttpClient, paramHttpUriRequest, new l(), k.l());
  }
  
  @Keep
  public static HttpResponse execute(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext)
  {
    return h(paramHttpClient, paramHttpUriRequest, paramHttpContext, new l(), k.l());
  }
  
  public static HttpResponse f(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext, l paraml, k paramk)
  {
    paramk = G4.j.h(paramk);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(paramHttpHost.toURI());
      ((StringBuilder)localObject).append(paramHttpRequest.getRequestLine().getUri());
      paramk.C(((StringBuilder)localObject).toString()).q(paramHttpRequest.getRequestLine().getMethod());
      localObject = I4.j.a(paramHttpRequest);
      if (localObject != null) {
        paramk.v(((Long)localObject).longValue());
      }
    }
    catch (IOException paramHttpClient)
    {
      break label195;
    }
    paraml.g();
    paramk.w(paraml.e());
    paramHttpClient = paramHttpClient.execute(paramHttpHost, paramHttpRequest, paramHttpContext);
    paramk.A(paraml.c());
    paramk.r(paramHttpClient.getStatusLine().getStatusCode());
    paramHttpHost = I4.j.a(paramHttpClient);
    if (paramHttpHost != null) {
      paramk.y(paramHttpHost.longValue());
    }
    paramHttpHost = I4.j.b(paramHttpClient);
    if (paramHttpHost != null) {
      paramk.x(paramHttpHost);
    }
    paramk.g();
    return paramHttpClient;
    label195:
    paramk.A(paraml.c());
    I4.j.d(paramk);
    throw paramHttpClient;
  }
  
  public static HttpResponse g(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, l paraml, k paramk)
  {
    paramk = G4.j.h(paramk);
    try
    {
      paramk.C(paramHttpUriRequest.getURI().toString()).q(paramHttpUriRequest.getMethod());
      Long localLong = I4.j.a(paramHttpUriRequest);
      if (localLong != null) {
        paramk.v(localLong.longValue());
      }
    }
    catch (IOException paramHttpClient)
    {
      break label142;
    }
    paraml.g();
    paramk.w(paraml.e());
    paramHttpClient = paramHttpClient.execute(paramHttpUriRequest);
    paramk.A(paraml.c());
    paramk.r(paramHttpClient.getStatusLine().getStatusCode());
    paramHttpUriRequest = I4.j.a(paramHttpClient);
    if (paramHttpUriRequest != null) {
      paramk.y(paramHttpUriRequest.longValue());
    }
    paramHttpUriRequest = I4.j.b(paramHttpClient);
    if (paramHttpUriRequest != null) {
      paramk.x(paramHttpUriRequest);
    }
    paramk.g();
    return paramHttpClient;
    label142:
    paramk.A(paraml.c());
    I4.j.d(paramk);
    throw paramHttpClient;
  }
  
  public static HttpResponse h(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext, l paraml, k paramk)
  {
    paramk = G4.j.h(paramk);
    try
    {
      paramk.C(paramHttpUriRequest.getURI().toString()).q(paramHttpUriRequest.getMethod());
      Long localLong = I4.j.a(paramHttpUriRequest);
      if (localLong != null) {
        paramk.v(localLong.longValue());
      }
    }
    catch (IOException paramHttpClient)
    {
      break label153;
    }
    paraml.g();
    paramk.w(paraml.e());
    paramHttpClient = paramHttpClient.execute(paramHttpUriRequest, paramHttpContext);
    paramk.A(paraml.c());
    paramk.r(paramHttpClient.getStatusLine().getStatusCode());
    paramHttpUriRequest = I4.j.a(paramHttpClient);
    if (paramHttpUriRequest != null) {
      paramk.y(paramHttpUriRequest.longValue());
    }
    paramHttpUriRequest = I4.j.b(paramHttpClient);
    if (paramHttpUriRequest != null) {
      paramk.x(paramHttpUriRequest);
    }
    paramk.g();
    return paramHttpClient;
    label153:
    paramk.A(paraml.c());
    I4.j.d(paramk);
    throw paramHttpClient;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.network.FirebasePerfHttpClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
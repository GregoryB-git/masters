package com.google.firebase.perf.network;

import I4.c;
import I4.d;
import L4.k;
import M4.l;
import M4.n;
import androidx.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection
{
  public static Object a(n paramn, k paramk, l paraml)
  {
    paraml.g();
    long l = paraml.e();
    paramk = G4.j.h(paramk);
    try
    {
      URLConnection localURLConnection = paramn.a();
      if ((localURLConnection instanceof HttpsURLConnection))
      {
        localObject2 = new I4/d;
        ((d)localObject2).<init>((HttpsURLConnection)localURLConnection, paraml, paramk);
        return ((d)localObject2).getContent();
      }
    }
    catch (IOException localIOException)
    {
      Object localObject2;
      break label97;
      if ((localIOException instanceof HttpURLConnection))
      {
        localObject2 = new I4/c;
        ((c)localObject2).<init>((HttpURLConnection)localIOException, paraml, paramk);
        return ((c)localObject2).getContent();
      }
      Object localObject1 = localIOException.getContent();
      return localObject1;
      label97:
      paramk.w(l);
      paramk.A(paraml.c());
      paramk.C(paramn.toString());
      I4.j.d(paramk);
      throw ((Throwable)localObject1);
    }
  }
  
  public static Object b(n paramn, Class[] paramArrayOfClass, k paramk, l paraml)
  {
    paraml.g();
    long l = paraml.e();
    paramk = G4.j.h(paramk);
    try
    {
      localURLConnection = paramn.a();
      if ((localURLConnection instanceof HttpsURLConnection))
      {
        localObject = new I4/d;
        ((d)localObject).<init>((HttpsURLConnection)localURLConnection, paraml, paramk);
        return ((d)localObject).getContent(paramArrayOfClass);
      }
    }
    catch (IOException paramArrayOfClass)
    {
      URLConnection localURLConnection;
      Object localObject;
      break label98;
      if ((localURLConnection instanceof HttpURLConnection))
      {
        localObject = new I4/c;
        ((c)localObject).<init>((HttpURLConnection)localURLConnection, paraml, paramk);
        return ((c)localObject).getContent(paramArrayOfClass);
      }
      paramArrayOfClass = localURLConnection.getContent(paramArrayOfClass);
      return paramArrayOfClass;
      label98:
      paramk.w(l);
      paramk.A(paraml.c());
      paramk.C(paramn.toString());
      I4.j.d(paramk);
      throw paramArrayOfClass;
    }
  }
  
  public static InputStream c(n paramn, k paramk, l paraml)
  {
    paraml.g();
    long l = paraml.e();
    paramk = G4.j.h(paramk);
    try
    {
      URLConnection localURLConnection = paramn.a();
      if ((localURLConnection instanceof HttpsURLConnection))
      {
        localObject = new I4/d;
        ((d)localObject).<init>((HttpsURLConnection)localURLConnection, paraml, paramk);
        return ((d)localObject).getInputStream();
      }
    }
    catch (IOException localIOException)
    {
      Object localObject;
      break label97;
      if ((localIOException instanceof HttpURLConnection))
      {
        localObject = new I4/c;
        ((c)localObject).<init>((HttpURLConnection)localIOException, paraml, paramk);
        return ((c)localObject).getInputStream();
      }
      InputStream localInputStream = localIOException.getInputStream();
      return localInputStream;
      label97:
      paramk.w(l);
      paramk.A(paraml.c());
      paramk.C(paramn.toString());
      I4.j.d(paramk);
      throw localInputStream;
    }
  }
  
  @Keep
  public static Object getContent(URL paramURL)
  {
    return a(new n(paramURL), k.l(), new l());
  }
  
  @Keep
  public static Object getContent(URL paramURL, Class[] paramArrayOfClass)
  {
    return b(new n(paramURL), paramArrayOfClass, k.l(), new l());
  }
  
  @Keep
  public static Object instrument(Object paramObject)
  {
    if ((paramObject instanceof HttpsURLConnection)) {
      return new d((HttpsURLConnection)paramObject, new l(), G4.j.h(k.l()));
    }
    if ((paramObject instanceof HttpURLConnection)) {
      return new c((HttpURLConnection)paramObject, new l(), G4.j.h(k.l()));
    }
    return paramObject;
  }
  
  @Keep
  public static InputStream openStream(URL paramURL)
  {
    return c(new n(paramURL), k.l(), new l());
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.network.FirebasePerfUrlConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package e7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.zzgf.zzj;
import com.google.android.gms.internal.measurement.zzio;
import d2.q;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;

public final class g1
  extends h6
{
  public g1(i6 parami6)
  {
    super(parami6);
  }
  
  public static byte[] t(HttpURLConnection paramHttpURLConnection)
  {
    byte[] arrayOfByte = null;
    Object localObject = arrayOfByte;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localObject = arrayOfByte;
      localByteArrayOutputStream.<init>();
      localObject = arrayOfByte;
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      localObject = paramHttpURLConnection;
      arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        localObject = paramHttpURLConnection;
        int i = paramHttpURLConnection.read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        localObject = paramHttpURLConnection;
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localObject = paramHttpURLConnection;
      arrayOfByte = localByteArrayOutputStream.toByteArray();
      paramHttpURLConnection.close();
      return arrayOfByte;
    }
    finally
    {
      if (localObject != null) {
        ((InputStream)localObject).close();
      }
    }
  }
  
  public final boolean r()
  {
    return false;
  }
  
  public final void s(String paramString, j6 paramj6, zzgf.zzj paramzzj, f1 paramf1)
  {
    l();
    p();
    try
    {
      Object localObject = new java/net/URI;
      ((URI)localObject).<init>(a);
      URL localURL = ((URI)localObject).toURL();
      m();
      byte[] arrayOfByte = paramzzj.zzce();
      e2 locale2 = zzl();
      h1 localh1 = new e7/h1;
      localObject = b;
      paramzzj = (zzgf.zzj)localObject;
      if (localObject == null) {
        paramzzj = Collections.emptyMap();
      }
      localh1.<init>(this, paramString, localURL, arrayOfByte, paramzzj, paramf1);
      locale2.s(localh1);
      return;
    }
    catch (IllegalArgumentException|MalformedURLException|URISyntaxException paramzzj)
    {
      zzjo.d("Failed to parse URL. Not uploading MeasurementBatch. appId", a1.p(paramString), a);
    }
  }
  
  public final boolean u()
  {
    p();
    ConnectivityManager localConnectivityManager = (ConnectivityManager)zza().getSystemService("connectivity");
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localConnectivityManager != null) {}
    try
    {
      localObject2 = localConnectivityManager.getActiveNetworkInfo();
      return (localObject2 != null) && (((NetworkInfo)localObject2).isConnected());
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        Object localObject3 = localObject1;
      }
    }
  }
}

/* Location:
 * Qualified Name:     e7.g1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package vn.hunghd.flutterdownloader;

import android.util.Log;
import ec.i;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class a
  implements X509TrustManager
{
  public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    i.e(paramArrayOfX509Certificate, "chain");
    i.e(paramString, "authType");
    Log.i("trustAllHosts", "checkClientTrusted");
  }
  
  public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    i.e(paramArrayOfX509Certificate, "chain");
    i.e(paramString, "authType");
    Log.i("trustAllHosts", "checkServerTrusted");
  }
  
  public final X509Certificate[] getAcceptedIssuers()
  {
    return new X509Certificate[0];
  }
}

/* Location:
 * Qualified Name:     vn.hunghd.flutterdownloader.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
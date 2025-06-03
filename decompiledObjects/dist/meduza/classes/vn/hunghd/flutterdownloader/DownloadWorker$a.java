package vn.hunghd.flutterdownloader;

import ec.i;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public final class DownloadWorker$a
{
  public static final void a()
  {
    Object localObject = DownloadWorker.H;
    a locala = new a();
    try
    {
      localObject = SSLContext.getInstance("TLS");
      i.d(localObject, "getInstance(...)");
      SecureRandom localSecureRandom = new java/security/SecureRandom;
      localSecureRandom.<init>();
      ((SSLContext)localObject).init(null, new TrustManager[] { locala }, localSecureRandom);
      HttpsURLConnection.setDefaultSSLSocketFactory(((SSLContext)localObject).getSocketFactory());
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     vn.hunghd.flutterdownloader.DownloadWorker.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
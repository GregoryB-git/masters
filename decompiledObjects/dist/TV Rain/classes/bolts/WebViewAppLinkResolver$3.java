package bolts;

import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

class WebViewAppLinkResolver$3
  implements Callable<Void>
{
  public WebViewAppLinkResolver$3(WebViewAppLinkResolver paramWebViewAppLinkResolver, Uri paramUri, Capture paramCapture1, Capture paramCapture2) {}
  
  public Void call()
    throws Exception
  {
    URL localURL = new URL(val$url.toString());
    URLConnection localURLConnection = null;
    while (localURL != null)
    {
      localURLConnection = localURL.openConnection();
      if ((localURLConnection instanceof HttpURLConnection)) {
        ((HttpURLConnection)localURLConnection).setInstanceFollowRedirects(true);
      }
      localURLConnection.setRequestProperty("Prefer-Html-Meta-Tags", "al");
      localURLConnection.connect();
      if ((localURLConnection instanceof HttpURLConnection))
      {
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURLConnection;
        if ((localHttpURLConnection.getResponseCode() >= 300) && (localHttpURLConnection.getResponseCode() < 400))
        {
          localURL = new URL(localHttpURLConnection.getHeaderField("Location"));
          localHttpURLConnection.disconnect();
          continue;
        }
      }
      localURL = null;
    }
    try
    {
      val$content.set(WebViewAppLinkResolver.access$300(localURLConnection));
      val$contentType.set(localURLConnection.getContentType());
      return null;
    }
    finally
    {
      if ((localURLConnection instanceof HttpURLConnection)) {
        ((HttpURLConnection)localURLConnection).disconnect();
      }
    }
  }
}

/* Location:
 * Qualified Name:     bolts.WebViewAppLinkResolver.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
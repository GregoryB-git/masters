package d2;

import android.net.Uri;
import android.webkit.WebResourceRequest;

public final class b
{
  public static Uri a(WebResourceRequest paramWebResourceRequest)
  {
    return paramWebResourceRequest.getUrl();
  }
  
  public static boolean b(WebResourceRequest paramWebResourceRequest)
  {
    return paramWebResourceRequest.isForMainFrame();
  }
}

/* Location:
 * Qualified Name:     d2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
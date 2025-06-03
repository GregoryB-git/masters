package bolts;

import android.net.Uri;
import org.json.JSONArray;

class WebViewAppLinkResolver$1
  implements Continuation<JSONArray, AppLink>
{
  public WebViewAppLinkResolver$1(WebViewAppLinkResolver paramWebViewAppLinkResolver, Uri paramUri) {}
  
  public AppLink then(Task<JSONArray> paramTask)
    throws Exception
  {
    return WebViewAppLinkResolver.access$100(WebViewAppLinkResolver.access$000((JSONArray)paramTask.getResult()), val$url);
  }
}

/* Location:
 * Qualified Name:     bolts.WebViewAppLinkResolver.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package bolts;

import android.webkit.JavascriptInterface;
import org.json.JSONArray;
import org.json.JSONException;

class WebViewAppLinkResolver$2$2
{
  public WebViewAppLinkResolver$2$2(WebViewAppLinkResolver.2 param2, TaskCompletionSource paramTaskCompletionSource) {}
  
  @JavascriptInterface
  public void setValue(String paramString)
  {
    try
    {
      TaskCompletionSource localTaskCompletionSource = val$tcs;
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramString);
      localTaskCompletionSource.trySetResult(localJSONArray);
    }
    catch (JSONException paramString)
    {
      val$tcs.trySetError(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     bolts.WebViewAppLinkResolver.2.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
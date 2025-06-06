package bolts;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.json.JSONArray;
import org.json.JSONException;

class WebViewAppLinkResolver$2
  implements Continuation<Void, Task<JSONArray>>
{
  public WebViewAppLinkResolver$2(WebViewAppLinkResolver paramWebViewAppLinkResolver, Capture paramCapture1, Uri paramUri, Capture paramCapture2) {}
  
  public Task<JSONArray> then(Task<Void> paramTask)
    throws Exception
  {
    final TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    WebView localWebView = new WebView(WebViewAppLinkResolver.access$200(this$0));
    localWebView.getSettings().setJavaScriptEnabled(true);
    localWebView.setNetworkAvailable(false);
    localWebView.setWebViewClient(new WebViewClient()
    {
      private boolean loaded = false;
      
      private void runJavaScript(WebView paramAnonymousWebView)
      {
        if (!loaded)
        {
          loaded = true;
          paramAnonymousWebView.loadUrl("javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
        }
      }
      
      public void onLoadResource(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        super.onLoadResource(paramAnonymousWebView, paramAnonymousString);
        runJavaScript(paramAnonymousWebView);
      }
      
      public void onPageFinished(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        super.onPageFinished(paramAnonymousWebView, paramAnonymousString);
        runJavaScript(paramAnonymousWebView);
      }
    });
    localWebView.addJavascriptInterface(new Object()
    {
      @JavascriptInterface
      public void setValue(String paramAnonymousString)
      {
        try
        {
          TaskCompletionSource localTaskCompletionSource = localTaskCompletionSource;
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>(paramAnonymousString);
          localTaskCompletionSource.trySetResult(localJSONArray);
        }
        catch (JSONException paramAnonymousString)
        {
          localTaskCompletionSource.trySetError(paramAnonymousString);
        }
      }
    }, "boltsWebViewAppLinkResolverResult");
    if (val$contentType.get() != null) {
      paramTask = ((String)val$contentType.get()).split(";")[0];
    } else {
      paramTask = null;
    }
    localWebView.loadDataWithBaseURL(val$url.toString(), (String)val$content.get(), paramTask, null, null);
    return localTaskCompletionSource.getTask();
  }
}

/* Location:
 * Qualified Name:     bolts.WebViewAppLinkResolver.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
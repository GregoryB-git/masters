package bolts;

import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WebViewAppLinkResolver
  implements AppLinkResolver
{
  private static final String KEY_AL_VALUE = "value";
  private static final String KEY_ANDROID = "android";
  private static final String KEY_APP_NAME = "app_name";
  private static final String KEY_CLASS = "class";
  private static final String KEY_PACKAGE = "package";
  private static final String KEY_SHOULD_FALLBACK = "should_fallback";
  private static final String KEY_URL = "url";
  private static final String KEY_WEB = "web";
  private static final String KEY_WEB_URL = "url";
  private static final String META_TAG_PREFIX = "al";
  private static final String PREFER_HEADER = "Prefer-Html-Meta-Tags";
  private static final String TAG_EXTRACTION_JAVASCRIPT = "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())";
  private final Context context;
  
  public WebViewAppLinkResolver(Context paramContext)
  {
    context = paramContext;
  }
  
  private static List<Map<String, Object>> getAlList(Map<String, Object> paramMap, String paramString)
  {
    paramString = (List)paramMap.get(paramString);
    paramMap = paramString;
    if (paramString == null) {
      paramMap = Collections.emptyList();
    }
    return paramMap;
  }
  
  private static AppLink makeAppLinkFromAlData(Map<String, Object> paramMap, Uri paramUri)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = (List)paramMap.get("android");
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = Collections.emptyList();
    }
    localObject1 = ((List)localObject2).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      int i = 0;
      localObject2 = null;
      if (!bool) {
        break;
      }
      localObject2 = (Map)((Iterator)localObject1).next();
      List localList1 = getAlList((Map)localObject2, "url");
      List localList2 = getAlList((Map)localObject2, "package");
      List localList3 = getAlList((Map)localObject2, "class");
      List localList4 = getAlList((Map)localObject2, "app_name");
      int j = Math.max(localList1.size(), Math.max(localList2.size(), Math.max(localList3.size(), localList4.size())));
      while (i < j)
      {
        if (localList1.size() > i) {
          localObject2 = ((Map)localList1.get(i)).get("value");
        } else {
          localObject2 = null;
        }
        Uri localUri = tryCreateUrl((String)localObject2);
        if (localList2.size() > i) {
          localObject2 = ((Map)localList2.get(i)).get("value");
        } else {
          localObject2 = null;
        }
        String str1 = (String)localObject2;
        if (localList3.size() > i) {
          localObject2 = ((Map)localList3.get(i)).get("value");
        } else {
          localObject2 = null;
        }
        String str2 = (String)localObject2;
        if (localList4.size() > i) {
          localObject2 = ((Map)localList4.get(i)).get("value");
        } else {
          localObject2 = null;
        }
        localArrayList.add(new AppLink.Target(str1, str2, localUri, (String)localObject2));
        i++;
      }
    }
    paramMap = (List)paramMap.get("web");
    if ((paramMap != null) && (paramMap.size() > 0))
    {
      paramMap = (Map)paramMap.get(0);
      localObject1 = (List)paramMap.get("url");
      paramMap = (List)paramMap.get("should_fallback");
      if ((paramMap != null) && (paramMap.size() > 0))
      {
        paramMap = (String)((Map)paramMap.get(0)).get("value");
        if (Arrays.asList(new String[] { "no", "false", "0" }).contains(paramMap.toLowerCase()))
        {
          paramMap = (Map<String, Object>)localObject2;
          break label497;
        }
      }
      paramMap = paramUri;
      label497:
      localObject2 = paramMap;
      if (paramMap != null)
      {
        localObject2 = paramMap;
        if (localObject1 != null)
        {
          localObject2 = paramMap;
          if (((List)localObject1).size() > 0) {
            localObject2 = tryCreateUrl((String)((Map)((List)localObject1).get(0)).get("value"));
          }
        }
      }
    }
    else
    {
      localObject2 = paramUri;
    }
    return new AppLink(paramUri, localArrayList, (Uri)localObject2);
  }
  
  private static Map<String, Object> parseAlData(JSONArray paramJSONArray)
    throws JSONException
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
      String[] arrayOfString = localJSONObject.getString("property").split(":");
      if (arrayOfString[0].equals("al"))
      {
        Object localObject1 = localHashMap;
        for (int j = 1;; j++)
        {
          int k = arrayOfString.length;
          Object localObject2 = null;
          if (j >= k) {
            break;
          }
          List localList = (List)((Map)localObject1).get(arrayOfString[j]);
          Object localObject3 = localList;
          if (localList == null)
          {
            localObject3 = new ArrayList();
            ((Map)localObject1).put(arrayOfString[j], localObject3);
          }
          localObject1 = localObject2;
          if (((List)localObject3).size() > 0) {
            localObject1 = (Map)((List)localObject3).get(((List)localObject3).size() - 1);
          }
          if ((localObject1 != null) && (j != arrayOfString.length - 1)) {
            continue;
          }
          localObject1 = new HashMap();
          ((List)localObject3).add(localObject1);
        }
        if (localJSONObject.has("content")) {
          if (localJSONObject.isNull("content")) {
            ((Map)localObject1).put("value", null);
          } else {
            ((Map)localObject1).put("value", localJSONObject.getString("content"));
          }
        }
      }
    }
    return localHashMap;
  }
  
  private static String readFromConnection(URLConnection paramURLConnection)
    throws IOException
  {
    Object localObject;
    InputStream localInputStream2;
    if ((paramURLConnection instanceof HttpURLConnection))
    {
      localObject = (HttpURLConnection)paramURLConnection;
      try
      {
        InputStream localInputStream1 = paramURLConnection.getInputStream();
      }
      catch (Exception localException)
      {
        localInputStream2 = ((HttpURLConnection)localObject).getErrorStream();
      }
    }
    else
    {
      localInputStream2 = paramURLConnection.getInputStream();
    }
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      localObject = new byte['Ѐ'];
      int i;
      int j;
      for (;;)
      {
        i = localInputStream2.read((byte[])localObject);
        j = 0;
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write((byte[])localObject, 0, i);
      }
      String str = paramURLConnection.getContentEncoding();
      localObject = str;
      if (str == null)
      {
        localObject = paramURLConnection.getContentType().split(";");
        i = localObject.length;
        for (;;)
        {
          paramURLConnection = str;
          if (j >= i) {
            break;
          }
          paramURLConnection = localObject[j].trim();
          if (paramURLConnection.startsWith("charset="))
          {
            paramURLConnection = paramURLConnection.substring(8);
            break;
          }
          j++;
        }
        localObject = paramURLConnection;
        if (paramURLConnection == null) {
          localObject = "UTF-8";
        }
      }
      paramURLConnection = new String(localByteArrayOutputStream.toByteArray(), (String)localObject);
      return paramURLConnection;
    }
    finally
    {
      localInputStream2.close();
    }
  }
  
  private static Uri tryCreateUrl(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Uri.parse(paramString);
  }
  
  public Task<AppLink> getAppLinkFromUrlInBackground(final Uri paramUri)
  {
    final Capture localCapture1 = new Capture();
    final Capture localCapture2 = new Capture();
    Task.callInBackground(new Callable()
    {
      public Void call()
        throws Exception
      {
        URL localURL = new URL(paramUri.toString());
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
          localCapture1.set(WebViewAppLinkResolver.access$300(localURLConnection));
          localCapture2.set(localURLConnection.getContentType());
          return null;
        }
        finally
        {
          if ((localURLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection)localURLConnection).disconnect();
          }
        }
      }
    }).onSuccessTask(new Continuation()
    {
      public Task<JSONArray> then(Task<Void> paramAnonymousTask)
        throws Exception
      {
        final TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
        WebView localWebView = new WebView(WebViewAppLinkResolver.access$200(WebViewAppLinkResolver.this));
        localWebView.getSettings().setJavaScriptEnabled(true);
        localWebView.setNetworkAvailable(false);
        localWebView.setWebViewClient(new WebViewClient()
        {
          private boolean loaded = false;
          
          private void runJavaScript(WebView paramAnonymous2WebView)
          {
            if (!loaded)
            {
              loaded = true;
              paramAnonymous2WebView.loadUrl("javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
            }
          }
          
          public void onLoadResource(WebView paramAnonymous2WebView, String paramAnonymous2String)
          {
            super.onLoadResource(paramAnonymous2WebView, paramAnonymous2String);
            runJavaScript(paramAnonymous2WebView);
          }
          
          public void onPageFinished(WebView paramAnonymous2WebView, String paramAnonymous2String)
          {
            super.onPageFinished(paramAnonymous2WebView, paramAnonymous2String);
            runJavaScript(paramAnonymous2WebView);
          }
        });
        localWebView.addJavascriptInterface(new Object()
        {
          @JavascriptInterface
          public void setValue(String paramAnonymous2String)
          {
            try
            {
              TaskCompletionSource localTaskCompletionSource = localTaskCompletionSource;
              JSONArray localJSONArray = new org/json/JSONArray;
              localJSONArray.<init>(paramAnonymous2String);
              localTaskCompletionSource.trySetResult(localJSONArray);
            }
            catch (JSONException paramAnonymous2String)
            {
              localTaskCompletionSource.trySetError(paramAnonymous2String);
            }
          }
        }, "boltsWebViewAppLinkResolverResult");
        if (localCapture2.get() != null) {
          paramAnonymousTask = ((String)localCapture2.get()).split(";")[0];
        } else {
          paramAnonymousTask = null;
        }
        localWebView.loadDataWithBaseURL(paramUri.toString(), (String)localCapture1.get(), paramAnonymousTask, null, null);
        return localTaskCompletionSource.getTask();
      }
    }, Task.UI_THREAD_EXECUTOR).onSuccess(new Continuation()
    {
      public AppLink then(Task<JSONArray> paramAnonymousTask)
        throws Exception
      {
        return WebViewAppLinkResolver.access$100(WebViewAppLinkResolver.access$000((JSONArray)paramAnonymousTask.getResult()), paramUri);
      }
    });
  }
}

/* Location:
 * Qualified Name:     bolts.WebViewAppLinkResolver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
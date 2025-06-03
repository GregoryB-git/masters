package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import c2.l;
import c2.m;
import c2.o;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.Util.PrivateKeyAndCertificates;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.FormResubmissionCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ReceivedClientCertRequestCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ReceivedHttpAuthRequestCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.SafeBrowsingHitCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback;
import d2.a;
import d2.a.f;
import d2.c;
import d2.g0;
import d2.h0;
import d2.i0;
import d2.j0.a;
import d2.v;
import g;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import x6.b;

public class InAppWebViewClientCompat
  extends WebViewClientCompat
{
  public static final String LOG_TAG = "IAWebViewClientCompat";
  private static List<URLCredential> credentialsProposed;
  private static int previousAuthRequestFailureCount;
  private InAppBrowserDelegate inAppBrowserDelegate;
  
  public InAppWebViewClientCompat(InAppBrowserDelegate paramInAppBrowserDelegate)
  {
    inAppBrowserDelegate = paramInAppBrowserDelegate;
  }
  
  private void allowShouldOverrideUrlLoading(WebView paramWebView, String paramString, Map<String, String> paramMap, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramWebView.loadUrl(paramString, paramMap);
    }
  }
  
  public void dispose()
  {
    if (inAppBrowserDelegate != null) {
      inAppBrowserDelegate = null;
    }
  }
  
  public void doUpdateVisitedHistory(WebView paramWebView, String paramString, boolean paramBoolean)
  {
    super.doUpdateVisitedHistory(paramWebView, paramString, paramBoolean);
    paramString = paramWebView.getUrl();
    InAppBrowserDelegate localInAppBrowserDelegate = inAppBrowserDelegate;
    if (localInAppBrowserDelegate != null) {
      localInAppBrowserDelegate.didUpdateVisitedHistory(paramString);
    }
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onUpdateVisitedHistory(paramString, paramBoolean);
    }
  }
  
  public void loadCustomJavaScriptOnPageFinished(WebView paramWebView)
  {
    paramWebView = (InAppWebView)paramWebView;
    paramWebView.evaluateJavascript(userContentController.generateWrappedCodeForDocumentEnd(), null);
  }
  
  public void loadCustomJavaScriptOnPageStarted(WebView paramWebView)
  {
    paramWebView = (InAppWebView)paramWebView;
    if (!b.c0("DOCUMENT_START_SCRIPT")) {
      paramWebView.evaluateJavascript(userContentController.generateWrappedCodeForDocumentStart(), null);
    }
  }
  
  public void onFormResubmission(final WebView paramWebView, final Message paramMessage1, final Message paramMessage2)
  {
    InAppWebView localInAppWebView = (InAppWebView)paramWebView;
    paramMessage1 = new WebViewChannelDelegate.FormResubmissionCallback()
    {
      public void defaultBehaviour(Integer paramAnonymousInteger)
      {
        InAppWebViewClientCompat.access$701(InAppWebViewClientCompat.this, paramWebView, paramMessage1, paramMessage2);
      }
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        a0.j.t(paramAnonymousString1, paramAnonymousString2, "IAWebViewClientCompat");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(Integer paramAnonymousInteger)
      {
        if (paramAnonymousInteger.intValue() != 0) {
          paramAnonymousInteger = paramMessage1;
        } else {
          paramAnonymousInteger = paramMessage2;
        }
        paramAnonymousInteger.sendToTarget();
        return false;
      }
    };
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onFormResubmission(localInAppWebView.getUrl(), paramMessage1);
    } else {
      paramMessage1.defaultBehaviour(null);
    }
  }
  
  public void onPageCommitVisible(WebView paramWebView, String paramString)
  {
    super.onPageCommitVisible(paramWebView, paramString);
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onPageCommitVisible(paramString);
    }
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    InAppWebView localInAppWebView = (InAppWebView)paramWebView;
    isLoading = false;
    loadCustomJavaScriptOnPageFinished(localInAppWebView);
    previousAuthRequestFailureCount = 0;
    credentialsProposed = null;
    super.onPageFinished(paramWebView, paramString);
    paramWebView = inAppBrowserDelegate;
    if (paramWebView != null) {
      paramWebView.didFinishNavigation(paramString);
    }
    CookieManager.getInstance().flush();
    localInAppWebView.evaluateJavascript("(function() {  if ((window.top == null || window.top === window) && window.flutter_inappwebview != null && window.flutter_inappwebview._platformReady == null) {    window.dispatchEvent(new Event('flutterInAppWebViewPlatformReady'));    window.flutter_inappwebview._platformReady = true;  }})();", null);
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onLoadStop(paramString);
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    InAppWebView localInAppWebView = (InAppWebView)paramWebView;
    isLoading = true;
    localInAppWebView.disposeWebMessageChannels();
    userContentController.resetContentWorlds();
    loadCustomJavaScriptOnPageStarted(localInAppWebView);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    paramWebView = inAppBrowserDelegate;
    if (paramWebView != null) {
      paramWebView.didStartNavigation(paramString);
    }
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onLoadStart(paramString);
    }
  }
  
  public void onReceivedClientCertRequest(final WebView paramWebView, final ClientCertRequest paramClientCertRequest)
  {
    String str = paramWebView.getUrl();
    final Object localObject2 = paramClientCertRequest.getHost();
    int i = paramClientCertRequest.getPort();
    if (str != null) {
      try
      {
        URI localURI = new java/net/URI;
        localURI.<init>(str);
        str = localURI.getScheme();
      }
      catch (URISyntaxException localURISyntaxException)
      {
        Log.e("IAWebViewClientCompat", "", localURISyntaxException);
      }
    } else {
      localObject1 = "https";
    }
    Object localObject1 = new ClientCertChallenge(new URLProtectionSpace((String)localObject2, (String)localObject1, null, i, paramWebView.getCertificate(), null), paramClientCertRequest.getPrincipals(), paramClientCertRequest.getKeyTypes());
    localObject2 = (InAppWebView)paramWebView;
    paramWebView = new WebViewChannelDelegate.ReceivedClientCertRequestCallback()
    {
      public void defaultBehaviour(ClientCertResponse paramAnonymousClientCertResponse)
      {
        InAppWebViewClientCompat.access$501(InAppWebViewClientCompat.this, paramWebView, paramClientCertRequest);
      }
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        a0.j.t(paramAnonymousString1, paramAnonymousString2, "IAWebViewClientCompat");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(ClientCertResponse paramAnonymousClientCertResponse)
      {
        Object localObject = paramAnonymousClientCertResponse.getAction();
        if ((localObject != null) && (localObject2plugin != null))
        {
          int i = ((Integer)localObject).intValue();
          if (i != 1) {
            if (i == 2) {}
          }
          do
          {
            paramClientCertRequest.cancel();
            break;
            paramClientCertRequest.ignore();
            break;
            String str = paramAnonymousClientCertResponse.getCertificatePath();
            localObject = paramAnonymousClientCertResponse.getCertificatePassword();
            paramAnonymousClientCertResponse = paramAnonymousClientCertResponse.getKeyStoreType();
            paramAnonymousClientCertResponse = Util.loadPrivateKeyAndCertificate(localObject2plugin, str, (String)localObject, paramAnonymousClientCertResponse);
          } while (paramAnonymousClientCertResponse == null);
          paramClientCertRequest.proceed(privateKey, certificates);
          return false;
        }
        return true;
      }
    };
    paramClientCertRequest = channelDelegate;
    if (paramClientCertRequest != null) {
      paramClientCertRequest.onReceivedClientCertRequest((ClientCertChallenge)localObject1, paramWebView);
    } else {
      paramWebView.defaultBehaviour(null);
    }
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Object localObject1 = (InAppWebView)paramWebView;
    if (customSettings.disableDefaultErrorPage.booleanValue())
    {
      ((WebView)localObject1).stopLoading();
      ((WebView)localObject1).loadUrl("about:blank");
    }
    isLoading = false;
    previousAuthRequestFailureCount = 0;
    credentialsProposed = null;
    Object localObject2 = inAppBrowserDelegate;
    if (localObject2 != null) {
      ((InAppBrowserDelegate)localObject2).didFailNavigation(paramString2, paramInt, paramString1);
    }
    localObject2 = new WebResourceRequestExt(paramString2, null, false, false, true, "GET");
    WebResourceErrorExt localWebResourceErrorExt = new WebResourceErrorExt(paramInt, paramString1);
    localObject1 = channelDelegate;
    if (localObject1 != null) {
      ((WebViewChannelDelegate)localObject1).onReceivedError((WebResourceRequestExt)localObject2, localWebResourceErrorExt);
    }
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }
  
  public void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, l paraml)
  {
    InAppWebView localInAppWebView = (InAppWebView)paramWebView;
    if (paramWebResourceRequest.isForMainFrame())
    {
      if (customSettings.disableDefaultErrorPage.booleanValue())
      {
        localInAppWebView.stopLoading();
        localInAppWebView.loadUrl("about:blank");
      }
      isLoading = false;
      previousAuthRequestFailureCount = 0;
      credentialsProposed = null;
      if (inAppBrowserDelegate != null)
      {
        int i = -1;
        Object localObject1;
        Object localObject2;
        if (b.c0("WEB_RESOURCE_ERROR_GET_CODE"))
        {
          localObject1 = (g0)paraml;
          localObject1.getClass();
          i0.o.getClass();
          if (a == null)
          {
            localObject2 = j0.a.a;
            paramWebView = Proxy.getInvocationHandler(b);
            a = ((WebResourceError)((WebkitToCompatConverterBoundaryInterface)b).convertWebResourceError(paramWebView));
          }
          i = c.f(a);
        }
        if (b.c0("WEB_RESOURCE_ERROR_GET_DESCRIPTION"))
        {
          localObject2 = (g0)paraml;
          localObject2.getClass();
          i0.n.getClass();
          if (a == null)
          {
            localObject1 = j0.a.a;
            paramWebView = Proxy.getInvocationHandler(b);
            a = ((WebResourceError)((WebkitToCompatConverterBoundaryInterface)b).convertWebResourceError(paramWebView));
          }
          paramWebView = c.e(a).toString();
        }
        else
        {
          paramWebView = "";
        }
        inAppBrowserDelegate.didFailNavigation(paramWebResourceRequest.getUrl().toString(), i, paramWebView);
      }
    }
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onReceivedError(WebResourceRequestExt.fromWebResourceRequest(paramWebResourceRequest), WebResourceErrorExt.fromWebResourceError(paraml));
    }
  }
  
  public void onReceivedHttpAuthRequest(final WebView paramWebView, final HttpAuthHandler paramHttpAuthHandler, final String paramString1, final String paramString2)
  {
    Object localObject1 = paramWebView.getUrl();
    String str1 = "https";
    final String str2 = str1;
    final int i;
    if (localObject1 != null)
    {
      str2 = str1;
      try
      {
        URI localURI = new java/net/URI;
        str2 = str1;
        localURI.<init>((String)localObject1);
        str2 = str1;
        str1 = localURI.getScheme();
        str2 = str1;
        i = localURI.getPort();
        str2 = str1;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        Log.e("IAWebViewClientCompat", "", localURISyntaxException);
      }
    }
    else
    {
      i = 0;
    }
    previousAuthRequestFailureCount += 1;
    if (credentialsProposed == null) {
      credentialsProposed = CredentialDatabase.getInstance(paramWebView.getContext()).getHttpAuthCredentials(paramString1, str2, paramString2, Integer.valueOf(i));
    }
    Object localObject2 = credentialsProposed;
    if ((localObject2 != null) && (((List)localObject2).size() > 0)) {
      localObject2 = (URLCredential)credentialsProposed.get(0);
    } else {
      localObject2 = null;
    }
    localObject2 = new HttpAuthenticationChallenge(new URLProtectionSpace(paramString1, str2, paramString2, i, paramWebView.getCertificate(), null), previousAuthRequestFailureCount, (URLCredential)localObject2);
    localObject1 = (InAppWebView)paramWebView;
    paramWebView = new WebViewChannelDelegate.ReceivedHttpAuthRequestCallback()
    {
      public void defaultBehaviour(HttpAuthResponse paramAnonymousHttpAuthResponse)
      {
        InAppWebViewClientCompat.access$301(InAppWebViewClientCompat.this, paramWebView, paramHttpAuthHandler, paramString1, paramString2);
      }
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        a0.j.t(paramAnonymousString1, paramAnonymousString2, "IAWebViewClientCompat");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(HttpAuthResponse paramAnonymousHttpAuthResponse)
      {
        Object localObject = paramAnonymousHttpAuthResponse.getAction();
        if (localObject != null)
        {
          int i = ((Integer)localObject).intValue();
          if (i != 1)
          {
            if (i != 2)
            {
              InAppWebViewClientCompat.access$102(null);
              InAppWebViewClientCompat.access$202(0);
            }
            while (InAppWebViewClientCompat.access$100().size() <= 0)
            {
              paramHttpAuthHandler.cancel();
              break;
            }
            paramAnonymousHttpAuthResponse = (URLCredential)InAppWebViewClientCompat.access$100().remove(0);
            paramHttpAuthHandler.proceed(paramAnonymousHttpAuthResponse.getUsername(), paramAnonymousHttpAuthResponse.getPassword());
          }
          else
          {
            String str = paramAnonymousHttpAuthResponse.getUsername();
            localObject = paramAnonymousHttpAuthResponse.getPassword();
            if (paramAnonymousHttpAuthResponse.isPermanentPersistence()) {
              CredentialDatabase.getInstance(paramWebView.getContext()).setHttpAuthCredential(paramString1, str2, paramString2, Integer.valueOf(i), str, (String)localObject);
            }
            paramHttpAuthHandler.proceed(str, (String)localObject);
          }
          return false;
        }
        return true;
      }
    };
    paramHttpAuthHandler = channelDelegate;
    if (paramHttpAuthHandler != null) {
      paramHttpAuthHandler.onReceivedHttpAuthRequest((HttpAuthenticationChallenge)localObject2, paramWebView);
    } else {
      paramWebView.defaultBehaviour(null);
    }
  }
  
  public void onReceivedHttpError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse)
  {
    super.onReceivedHttpError(paramWebView, paramWebResourceRequest, paramWebResourceResponse);
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onReceivedHttpError(WebResourceRequestExt.fromWebResourceRequest(paramWebResourceRequest), WebResourceResponseExt.fromWebResourceResponse(paramWebResourceResponse));
    }
  }
  
  public void onReceivedLoginRequest(WebView paramWebView, String paramString1, String paramString2, String paramString3)
  {
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onReceivedLoginRequest(paramString1, paramString2, paramString3);
    }
  }
  
  public void onReceivedSslError(final WebView paramWebView, final SslErrorHandler paramSslErrorHandler, final SslError paramSslError)
  {
    Object localObject1 = paramSslError.getUrl();
    Object localObject2 = "https";
    try
    {
      URI localURI = new java/net/URI;
      localURI.<init>((String)localObject1);
      localObject1 = localURI.getHost();
      try
      {
        String str = localURI.getScheme();
        localObject2 = str;
        i = localURI.getPort();
        localObject2 = str;
      }
      catch (URISyntaxException localURISyntaxException1) {}
      Log.e("IAWebViewClientCompat", "", localURISyntaxException2);
    }
    catch (URISyntaxException localURISyntaxException2)
    {
      localObject1 = "";
    }
    int i = 0;
    localObject2 = new ServerTrustChallenge(new URLProtectionSpace((String)localObject1, (String)localObject2, null, i, paramSslError.getCertificate(), paramSslError));
    localObject1 = (InAppWebView)paramWebView;
    paramWebView = new WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback()
    {
      public void defaultBehaviour(ServerTrustAuthResponse paramAnonymousServerTrustAuthResponse)
      {
        InAppWebViewClientCompat.access$401(InAppWebViewClientCompat.this, paramWebView, paramSslErrorHandler, paramSslError);
      }
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        a0.j.t(paramAnonymousString1, paramAnonymousString2, "IAWebViewClientCompat");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(ServerTrustAuthResponse paramAnonymousServerTrustAuthResponse)
      {
        paramAnonymousServerTrustAuthResponse = paramAnonymousServerTrustAuthResponse.getAction();
        if (paramAnonymousServerTrustAuthResponse != null)
        {
          if (paramAnonymousServerTrustAuthResponse.intValue() != 1) {
            paramSslErrorHandler.cancel();
          } else {
            paramSslErrorHandler.proceed();
          }
          return false;
        }
        return true;
      }
    };
    paramSslErrorHandler = channelDelegate;
    if (paramSslErrorHandler != null) {
      paramSslErrorHandler.onReceivedServerTrustAuthRequest((ServerTrustChallenge)localObject2, paramWebView);
    } else {
      paramWebView.defaultBehaviour(null);
    }
  }
  
  public boolean onRenderProcessGone(WebView paramWebView, RenderProcessGoneDetail paramRenderProcessGoneDetail)
  {
    InAppWebView localInAppWebView = (InAppWebView)paramWebView;
    if ((customSettings.useOnRenderProcessGone.booleanValue()) && (channelDelegate != null))
    {
      boolean bool = paramRenderProcessGoneDetail.didCrash();
      int i = paramRenderProcessGoneDetail.rendererPriorityAtExit();
      channelDelegate.onRenderProcessGone(bool, i);
      return true;
    }
    return super.onRenderProcessGone(paramWebView, paramRenderProcessGoneDetail);
  }
  
  public void onSafeBrowsingHit(final WebView paramWebView, final WebResourceRequest paramWebResourceRequest, final int paramInt, final c2.d paramd)
  {
    InAppWebView localInAppWebView = (InAppWebView)paramWebView;
    paramWebView = new WebViewChannelDelegate.SafeBrowsingHitCallback()
    {
      public void defaultBehaviour(SafeBrowsingResponse paramAnonymousSafeBrowsingResponse)
      {
        InAppWebViewClientCompat.access$601(InAppWebViewClientCompat.this, paramWebView, paramWebResourceRequest, paramInt, paramd);
      }
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        a0.j.t(paramAnonymousString1, paramAnonymousString2, "IAWebViewClientCompat");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(SafeBrowsingResponse paramAnonymousSafeBrowsingResponse)
      {
        Object localObject = paramAnonymousSafeBrowsingResponse.getAction();
        if (localObject != null)
        {
          boolean bool = paramAnonymousSafeBrowsingResponse.isReport();
          int i = ((Integer)localObject).intValue();
          if (i != 0)
          {
            if (i != 1)
            {
              if (b.c0("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
                paramd.a(bool);
              } else {
                return true;
              }
            }
            else if (b.c0("SAFE_BROWSING_RESPONSE_PROCEED"))
            {
              paramAnonymousSafeBrowsingResponse = (v)paramd;
              paramAnonymousSafeBrowsingResponse.getClass();
              localObject = i0.q;
              if (((a.f)localObject).c()) {
                d2.j.c(paramAnonymousSafeBrowsingResponse.c(), bool);
              } else if (((a)localObject).d()) {
                paramAnonymousSafeBrowsingResponse.b().proceed(bool);
              } else {
                throw i0.a();
              }
            }
            else
            {
              return true;
            }
          }
          else
          {
            if (!b.c0("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY")) {
              break label187;
            }
            paramAnonymousSafeBrowsingResponse = (v)paramd;
            paramAnonymousSafeBrowsingResponse.getClass();
            localObject = i0.p;
            if (((a.f)localObject).c())
            {
              d2.j.a(paramAnonymousSafeBrowsingResponse.c(), bool);
            }
            else
            {
              if (!((a)localObject).d()) {
                break label183;
              }
              paramAnonymousSafeBrowsingResponse.b().backToSafety(bool);
            }
          }
          return false;
          label183:
          throw i0.a();
        }
        label187:
        return true;
      }
    };
    paramd = channelDelegate;
    if (paramd != null) {
      paramd.onSafeBrowsingHit(paramWebResourceRequest.getUrl().toString(), paramInt, paramWebView);
    } else {
      paramWebView.defaultBehaviour(null);
    }
  }
  
  public void onScaleChanged(WebView paramWebView, float paramFloat1, float paramFloat2)
  {
    super.onScaleChanged(paramWebView, paramFloat1, paramFloat2);
    paramWebView = (InAppWebView)paramWebView;
    zoomScale = (paramFloat2 / Util.getPixelDensity(paramWebView.getContext()));
    paramWebView = channelDelegate;
    if (paramWebView != null) {
      paramWebView.onZoomScaleChanged(paramFloat1, paramFloat2);
    }
  }
  
  public void onShouldOverrideUrlLoading(final InAppWebView paramInAppWebView, final String paramString1, String paramString2, final Map<String, String> paramMap, final boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    paramString2 = new NavigationAction(new URLRequest(paramString1, paramString2, null, paramMap), paramBoolean1, paramBoolean2, paramBoolean3);
    paramString1 = new WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback()
    {
      public void defaultBehaviour(NavigationActionPolicy paramAnonymousNavigationActionPolicy)
      {
        InAppWebViewClientCompat.access$000(InAppWebViewClientCompat.this, paramInAppWebView, paramString1, paramMap, paramBoolean1);
      }
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        a0.j.t(paramAnonymousString1, paramAnonymousString2, "IAWebViewClientCompat");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(NavigationActionPolicy paramAnonymousNavigationActionPolicy)
      {
        if (InAppWebViewClientCompat.7.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy[paramAnonymousNavigationActionPolicy.ordinal()] == 1) {
          InAppWebViewClientCompat.access$000(InAppWebViewClientCompat.this, paramInAppWebView, paramString1, paramMap, paramBoolean1);
        }
        return false;
      }
    };
    paramInAppWebView = channelDelegate;
    if (paramInAppWebView != null) {
      paramInAppWebView.shouldOverrideUrlLoading(paramString2, paramString1);
    } else {
      paramString1.defaultBehaviour(null);
    }
  }
  
  public void onUnhandledKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent) {}
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    return shouldInterceptRequest(paramWebView, WebResourceRequestExt.fromWebResourceRequest(paramWebResourceRequest));
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequestExt paramWebResourceRequestExt)
  {
    Object localObject1 = (InAppWebView)paramWebView;
    paramWebView = webViewAssetLoaderExt;
    if ((paramWebView != null) && (loader != null)) {
      try
      {
        paramWebView = Uri.parse(paramWebResourceRequestExt.getUrl());
        paramWebView = webViewAssetLoaderExt.loader.a(paramWebView);
        if (paramWebView != null) {
          return paramWebView;
        }
      }
      catch (Exception paramWebView)
      {
        Log.e("IAWebViewClientCompat", "", paramWebView);
      }
    }
    boolean bool = customSettings.useShouldInterceptRequest.booleanValue();
    Integer localInteger = null;
    Map localMap = null;
    Object localObject2 = null;
    if (bool)
    {
      paramWebView = channelDelegate;
      if (paramWebView != null) {
        try
        {
          paramWebView = paramWebView.shouldInterceptRequest(paramWebResourceRequestExt);
        }
        catch (InterruptedException paramWebView)
        {
          Log.e("IAWebViewClientCompat", "", paramWebView);
          return null;
        }
      } else {
        paramWebView = null;
      }
      if (paramWebView != null)
      {
        localObject1 = paramWebView.getContentType();
        paramWebResourceRequestExt = paramWebView.getContentEncoding();
        byte[] arrayOfByte = paramWebView.getData();
        localMap = paramWebView.getHeaders();
        localInteger = paramWebView.getStatusCode();
        String str = paramWebView.getReasonPhrase();
        paramWebView = (WebView)localObject2;
        if (arrayOfByte != null) {
          paramWebView = new ByteArrayInputStream(arrayOfByte);
        }
        if ((localInteger != null) && (str != null)) {
          return new WebResourceResponse((String)localObject1, paramWebResourceRequestExt, localInteger.intValue(), str, localMap, paramWebView);
        }
        return new WebResourceResponse((String)localObject1, paramWebResourceRequestExt, paramWebView);
      }
      return null;
    }
    paramWebView = paramWebResourceRequestExt.getUrl().split(":")[0].toLowerCase();
    try
    {
      localObject2 = Uri.parse(paramWebResourceRequestExt.getUrl()).getScheme();
      paramWebView = (WebView)localObject2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    localObject2 = customSettings.resourceCustomSchemes;
    if ((localObject2 != null) && (((List)localObject2).contains(paramWebView)))
    {
      paramWebView = channelDelegate;
      if (paramWebView != null) {
        try
        {
          paramWebView = paramWebView.onLoadResourceWithCustomScheme(paramWebResourceRequestExt);
        }
        catch (InterruptedException paramWebView)
        {
          Log.e("IAWebViewClientCompat", "", paramWebView);
          return null;
        }
      } else {
        paramWebView = null;
      }
      if (paramWebView != null)
      {
        try
        {
          paramWebResourceRequestExt = contentBlockerHandler.checkUrl((InAppWebView)localObject1, paramWebResourceRequestExt, paramWebView.getContentType());
        }
        catch (Exception paramWebResourceRequestExt)
        {
          Log.e("IAWebViewClientCompat", "", paramWebResourceRequestExt);
          paramWebResourceRequestExt = localInteger;
        }
        if (paramWebResourceRequestExt != null) {
          return paramWebResourceRequestExt;
        }
        return new WebResourceResponse(paramWebView.getContentType(), paramWebView.getContentType(), new ByteArrayInputStream(paramWebView.getData()));
      }
    }
    paramWebView = localMap;
    if (contentBlockerHandler.getRuleList().size() > 0) {
      try
      {
        paramWebView = contentBlockerHandler.checkUrl((InAppWebView)localObject1, paramWebResourceRequestExt);
      }
      catch (Exception paramWebView)
      {
        Log.e("IAWebViewClientCompat", "", paramWebView);
        paramWebView = localMap;
      }
    }
    return paramWebView;
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    return shouldInterceptRequest(paramWebView, new WebResourceRequestExt(paramString, null, false, false, true, "GET"));
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    paramWebView = (InAppWebView)paramWebView;
    if (customSettings.useShouldOverrideUrlLoading.booleanValue())
    {
      boolean bool;
      if (b.c0("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
        bool = m.a(paramWebResourceRequest);
      }
      for (;;)
      {
        break;
        if (Build.VERSION.SDK_INT >= 24) {
          bool = a0.d.m(paramWebResourceRequest);
        } else {
          bool = false;
        }
      }
      onShouldOverrideUrlLoading(paramWebView, paramWebResourceRequest.getUrl().toString(), paramWebResourceRequest.getMethod(), paramWebResourceRequest.getRequestHeaders(), paramWebResourceRequest.isForMainFrame(), paramWebResourceRequest.hasGesture(), bool);
      if (regexToCancelSubFramesLoadingCompiled != null)
      {
        if (paramWebResourceRequest.isForMainFrame()) {
          return true;
        }
        return regexToCancelSubFramesLoadingCompiled.matcher(paramWebResourceRequest.getUrl().toString()).matches();
      }
      return paramWebResourceRequest.isForMainFrame();
    }
    return false;
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView = (InAppWebView)paramWebView;
    if (customSettings.useShouldOverrideUrlLoading.booleanValue())
    {
      onShouldOverrideUrlLoading(paramWebView, paramString, "GET", null, true, false, false);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
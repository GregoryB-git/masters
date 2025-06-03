package O1;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import x1.D;
import x1.m;
import x1.r;

public final class V$c
  extends WebViewClient
{
  public V$c(V paramV) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramWebView, "view");
    Intrinsics.checkNotNullParameter(paramString, "url");
    super.onPageFinished(paramWebView, paramString);
    if (!V.j(a))
    {
      paramWebView = V.h(a);
      if (paramWebView != null) {
        paramWebView.dismiss();
      }
    }
    paramWebView = V.d(a);
    if (paramWebView != null) {
      paramWebView.setBackgroundColor(0);
    }
    paramWebView = a.r();
    if (paramWebView != null) {
      paramWebView.setVisibility(0);
    }
    paramWebView = V.e(a);
    if (paramWebView != null) {
      paramWebView.setVisibility(0);
    }
    V.k(a, true);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    Intrinsics.checkNotNullParameter(paramWebView, "view");
    Intrinsics.checkNotNullParameter(paramString, "url");
    P localP = P.a;
    P.j0("FacebookSDK.WebDialog", Intrinsics.i("Webview loading URL: ", paramString));
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    if (!V.j(a))
    {
      paramWebView = V.h(a);
      if (paramWebView != null) {
        paramWebView.show();
      }
    }
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramWebView, "view");
    Intrinsics.checkNotNullParameter(paramString1, "description");
    Intrinsics.checkNotNullParameter(paramString2, "failingUrl");
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    a.y(new m(paramString1, paramInt, paramString2));
  }
  
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    Intrinsics.checkNotNullParameter(paramWebView, "view");
    Intrinsics.checkNotNullParameter(paramSslErrorHandler, "handler");
    Intrinsics.checkNotNullParameter(paramSslError, "error");
    super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
    paramSslErrorHandler.cancel();
    a.y(new m(null, -11, null));
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramWebView, "view");
    Intrinsics.checkNotNullParameter(paramString, "url");
    paramWebView = P.a;
    P.j0("FacebookSDK.WebDialog", Intrinsics.i("Redirect URL: ", paramString));
    paramWebView = Uri.parse(paramString);
    Object localObject = paramWebView.getPath();
    boolean bool = true;
    if ((localObject != null) && (Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", paramWebView.getPath()))) {
      i = 1;
    } else {
      i = 0;
    }
    Bundle localBundle;
    if (i.s(paramString, V.g(a), false, 2, null))
    {
      localBundle = a.w(paramString);
      paramWebView = localBundle.getString("error");
      paramString = paramWebView;
      if (paramWebView == null) {
        paramString = localBundle.getString("error_type");
      }
      localObject = localBundle.getString("error_msg");
      paramWebView = (WebView)localObject;
      if (localObject == null) {
        paramWebView = localBundle.getString("error_message");
      }
      localObject = paramWebView;
      if (paramWebView == null) {
        localObject = localBundle.getString("error_description");
      }
      paramWebView = localBundle.getString("error_code");
      if ((paramWebView == null) || (P.c0(paramWebView))) {}
    }
    try
    {
      i = Integer.parseInt(paramWebView);
    }
    catch (NumberFormatException paramWebView)
    {
      for (;;) {}
    }
    int i = -1;
    if ((P.c0(paramString)) && (P.c0((String)localObject)) && (i == -1))
    {
      a.z(localBundle);
    }
    else
    {
      if ((paramString != null) && ((Intrinsics.a(paramString, "access_denied")) || (Intrinsics.a(paramString, "OAuthAccessDeniedException")))) {}
      while (i == 4201)
      {
        a.cancel();
        break;
      }
      paramWebView = new r(i, paramString, (String)localObject);
      a.y(new D(paramWebView, (String)localObject));
    }
    return true;
    if (i.s(paramString, "fbconnect://cancel", false, 2, null))
    {
      a.cancel();
      return true;
    }
    if ((i == 0) && (!i.v(paramString, "touch", false, 2, null)))
    {
      try
      {
        localObject = a.getContext();
        paramWebView = new android/content/Intent;
        paramWebView.<init>("android.intent.action.VIEW", Uri.parse(paramString));
        ((Context)localObject).startActivity(paramWebView);
      }
      catch (ActivityNotFoundException paramWebView)
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     O1.V.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
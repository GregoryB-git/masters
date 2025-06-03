package d2;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c0.b;
import com.google.android.gms.internal.base.a;

public final class f
{
  public static PackageInfo a()
  {
    return b.e();
  }
  
  public static boolean b(WebSettings paramWebSettings)
  {
    return a.x(paramWebSettings);
  }
  
  public static WebChromeClient c(WebView paramWebView)
  {
    return e.j(paramWebView);
  }
  
  public static WebViewClient d(WebView paramWebView)
  {
    return a.m(paramWebView);
  }
  
  public static void e(WebSettings paramWebSettings, boolean paramBoolean)
  {
    b.x(paramWebSettings, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     d2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
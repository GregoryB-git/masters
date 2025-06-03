package c2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
import d2.a.f;
import d2.a.h;
import d2.b0;
import d2.c;
import d2.f;
import d2.i0;
import d2.j0.b;
import d2.k0;
import d2.l0;
import d2.m;
import d2.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import zc.a.a;

public final class p
{
  public static final Uri a = Uri.parse("*");
  public static final Uri b = Uri.parse("");
  
  public static w a(WebView paramWebView, String paramString, Set paramSet)
  {
    if (i0.J.d()) {
      return new w((ScriptHandlerBoundaryInterface)zc.a.a(ScriptHandlerBoundaryInterface.class, j0.b.a.createWebView(paramWebView).addDocumentStartJavaScript(paramString, (String[])paramSet.toArray(new String[0]))));
    }
    throw i0.a();
  }
  
  public static PackageInfo b(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    localObject1 = null;
    PackageInfo localPackageInfo;
    Object localObject2;
    if (i >= 26) {
      localPackageInfo = f.a();
    } else {
      try
      {
        localPackageInfo = c();
      }
      catch (ClassNotFoundException|IllegalAccessException|InvocationTargetException|NoSuchMethodException localClassNotFoundException)
      {
        localObject2 = null;
      }
    }
    if (localObject2 != null) {
      return (PackageInfo)localObject2;
    }
    if (i <= 23) {}
    try
    {
      localObject2 = Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
      break label90;
      localObject2 = Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
      label90:
      localObject2 = (String)localObject2;
      if (localObject2 == null)
      {
        paramContext = (Context)localObject1;
      }
      else
      {
        paramContext = paramContext.getPackageManager();
        paramContext = paramContext.getPackageInfo((String)localObject2, 0);
      }
    }
    catch (ClassNotFoundException|IllegalAccessException|InvocationTargetException|NoSuchMethodException|PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject1;
      }
    }
    return paramContext;
  }
  
  public static PackageInfo c()
  {
    return (PackageInfo)Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
  }
  
  public static void d(InAppWebView paramInAppWebView, j paramj, Uri paramUri)
  {
    Uri localUri = paramUri;
    if (a.equals(paramUri)) {
      localUri = b;
    }
    paramUri = i0.x;
    paramUri.getClass();
    if (d == 0)
    {
      c.j(paramInAppWebView, c.b(paramj), localUri);
    }
    else
    {
      if (!paramUri.d()) {
        break label130;
      }
      int i = d;
      int j = 1;
      int k = j;
      if (i != 0) {
        if ((i == 1) && (i0.u.d())) {
          k = j;
        } else {
          k = 0;
        }
      }
      if (k == 0) {
        break label130;
      }
      j0.b.a.createWebView(paramInAppWebView).postMessageToMainFrame(new a.a(new b0(paramj)), localUri);
    }
    return;
    label130:
    throw i0.a();
  }
  
  public static void e(HashSet paramHashSet, ValueCallback paramValueCallback)
  {
    a.f localf1 = i0.f;
    a.f localf2 = i0.e;
    if (localf1.d())
    {
      j0.b.a.getStatics().setSafeBrowsingAllowlist(paramHashSet, paramValueCallback);
      return;
    }
    paramHashSet = new ArrayList(paramHashSet);
    if (localf2.c())
    {
      d2.j.d(paramHashSet, paramValueCallback);
    }
    else
    {
      if (!localf2.d()) {
        break label78;
      }
      j0.b.a.getStatics().setSafeBrowsingWhitelist(paramHashSet, paramValueCallback);
    }
    return;
    label78:
    throw i0.a();
  }
  
  public static void f(WebView paramWebView, InAppWebViewRenderProcessClient paramInAppWebViewRenderProcessClient)
  {
    Object localObject = i0.C;
    if (((a.h)localObject).c())
    {
      m.e(paramWebView, paramInAppWebViewRenderProcessClient);
    }
    else
    {
      if (!((d2.a)localObject).d()) {
        break label66;
      }
      localObject = j0.b.a.createWebView(paramWebView);
      paramWebView = null;
      if (paramInAppWebViewRenderProcessClient != null) {
        paramWebView = new a.a(new l0(paramInAppWebViewRenderProcessClient));
      }
      ((WebViewProviderBoundaryInterface)localObject).setWebViewRendererClient(paramWebView);
    }
    return;
    label66:
    throw i0.a();
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
  
  public static abstract interface b
  {
    public abstract void onPostMessage(WebView paramWebView, j paramj, Uri paramUri, boolean paramBoolean, a parama);
  }
}

/* Location:
 * Qualified Name:     c2.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package d2;

import android.webkit.WebView;
import c2.q;
import c2.r;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;
import zc.a;

public final class l0
  implements WebViewRendererClientBoundaryInterface
{
  public static final String[] c = { "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE" };
  public final Executor a = null;
  public final r b;
  
  public l0(InAppWebViewRenderProcessClient paramInAppWebViewRenderProcessClient)
  {
    b = paramInAppWebViewRenderProcessClient;
  }
  
  public final String[] getSupportedFeatures()
  {
    return c;
  }
  
  public final void onRendererResponsive(final WebView paramWebView, InvocationHandler paramInvocationHandler)
  {
    final Object localObject = o0.c;
    paramInvocationHandler = (WebViewRendererBoundaryInterface)a.a(WebViewRendererBoundaryInterface.class, paramInvocationHandler);
    localObject = (o0)paramInvocationHandler.getOrCreatePeer(new n0(paramInvocationHandler));
    paramInvocationHandler = b;
    Executor localExecutor = a;
    if (localExecutor == null) {
      paramInvocationHandler.onRenderProcessResponsive(paramWebView, (q)localObject);
    } else {
      localExecutor.execute(new b(paramInvocationHandler, paramWebView, (o0)localObject));
    }
  }
  
  public final void onRendererUnresponsive(final WebView paramWebView, final InvocationHandler paramInvocationHandler)
  {
    Object localObject = o0.c;
    paramInvocationHandler = (WebViewRendererBoundaryInterface)a.a(WebViewRendererBoundaryInterface.class, paramInvocationHandler);
    paramInvocationHandler = (o0)paramInvocationHandler.getOrCreatePeer(new n0(paramInvocationHandler));
    r localr = b;
    localObject = a;
    if (localObject == null) {
      localr.onRenderProcessUnresponsive(paramWebView, paramInvocationHandler);
    } else {
      ((Executor)localObject).execute(new a(localr, paramWebView, paramInvocationHandler));
    }
  }
  
  public final class a
    implements Runnable
  {
    public a(WebView paramWebView, o0 paramo0) {}
    
    public final void run()
    {
      onRenderProcessUnresponsive(paramWebView, paramInvocationHandler);
    }
  }
  
  public final class b
    implements Runnable
  {
    public b(WebView paramWebView, o0 paramo0) {}
    
    public final void run()
    {
      onRenderProcessResponsive(paramWebView, localObject);
    }
  }
}

/* Location:
 * Qualified Name:     d2.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
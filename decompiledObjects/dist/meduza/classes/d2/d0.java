package d2;

import android.net.Uri;
import android.webkit.WebView;
import c2.p.b;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import zc.a;

public final class d0
  implements WebMessageListenerBoundaryInterface
{
  public p.b a;
  
  public d0(p.b paramb)
  {
    a = paramb;
  }
  
  public final String[] getSupportedFeatures()
  {
    return new String[] { "WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER" };
  }
  
  public final void onPostMessage(WebView paramWebView, InvocationHandler paramInvocationHandler1, Uri paramUri, boolean paramBoolean, InvocationHandler paramInvocationHandler2)
  {
    paramInvocationHandler1 = b0.a((WebMessageBoundaryInterface)a.a(WebMessageBoundaryInterface.class, paramInvocationHandler1));
    if (paramInvocationHandler1 != null)
    {
      paramInvocationHandler2 = (JsReplyProxyBoundaryInterface)a.a(JsReplyProxyBoundaryInterface.class, paramInvocationHandler2);
      paramInvocationHandler2 = (t)paramInvocationHandler2.getOrCreatePeer(new s(paramInvocationHandler2));
      a.onPostMessage(paramWebView, paramInvocationHandler1, paramUri, paramBoolean, paramInvocationHandler2);
    }
  }
}

/* Location:
 * Qualified Name:     d2.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
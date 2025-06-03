package d2;

import android.webkit.WebViewRenderProcess;
import c2.q;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

public final class o0
  extends q
{
  public static final WeakHashMap<WebViewRenderProcess, o0> c = new WeakHashMap();
  public WebViewRendererBoundaryInterface a;
  public WeakReference<WebViewRenderProcess> b;
  
  public o0(WebViewRenderProcess paramWebViewRenderProcess)
  {
    b = new WeakReference(paramWebViewRenderProcess);
  }
  
  public o0(WebViewRendererBoundaryInterface paramWebViewRendererBoundaryInterface)
  {
    a = paramWebViewRendererBoundaryInterface;
  }
  
  public final boolean a()
  {
    Object localObject = i0.y;
    if (((a.h)localObject).c())
    {
      localObject = (WebViewRenderProcess)b.get();
      boolean bool;
      if ((localObject != null) && (m.g((WebViewRenderProcess)localObject))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    if (((a)localObject).d()) {
      return a.terminate();
    }
    throw i0.a();
  }
}

/* Location:
 * Qualified Name:     d2.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
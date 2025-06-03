package d2;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import c2.f;

public final class r
  extends ServiceWorkerClient
{
  public final f a;
  
  public r(f paramf)
  {
    a = paramf;
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebResourceRequest paramWebResourceRequest)
  {
    return a.shouldInterceptRequest(paramWebResourceRequest);
  }
}

/* Location:
 * Qualified Name:     d2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
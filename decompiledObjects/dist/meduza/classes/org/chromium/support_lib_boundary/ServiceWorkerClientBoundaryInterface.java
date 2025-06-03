package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

public abstract interface ServiceWorkerClientBoundaryInterface
  extends FeatureFlagHolderBoundaryInterface
{
  public abstract WebResourceResponse shouldInterceptRequest(WebResourceRequest paramWebResourceRequest);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
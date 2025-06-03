package c2;

import android.webkit.WebResourceRequest;
import d2.a.c;
import d2.d;
import d2.h0;
import d2.i0;
import d2.j0.a;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public final class m
{
  public static boolean a(WebResourceRequest paramWebResourceRequest)
  {
    a.c localc = i0.m;
    if (localc.c()) {
      return d.j(paramWebResourceRequest);
    }
    if (localc.d()) {
      return ((WebResourceRequestBoundaryInterface)zc.a.a(WebResourceRequestBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)ab).convertWebResourceRequest(paramWebResourceRequest))).isRedirect();
    }
    throw i0.a();
  }
}

/* Location:
 * Qualified Name:     c2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
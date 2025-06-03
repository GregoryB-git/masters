package c2;

import android.webkit.WebResourceRequest;
import d2.a;
import d2.i0;
import d2.j0;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class m {
    public static boolean a(WebResourceRequest webResourceRequest) {
        a.c cVar = i0.f3375m;
        if (cVar.c()) {
            return d2.d.j(webResourceRequest);
        }
        if (cVar.d()) {
            return ((WebResourceRequestBoundaryInterface) zc.a.a(WebResourceRequestBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) j0.a.f3389a.f3363b).convertWebResourceRequest(webResourceRequest))).isRedirect();
        }
        throw i0.a();
    }
}

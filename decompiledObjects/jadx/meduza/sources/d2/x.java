package d2;

import android.webkit.ServiceWorkerController;
import d2.a;
import d2.j0;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* loaded from: classes.dex */
public final class x extends c2.g {

    /* renamed from: a, reason: collision with root package name */
    public ServiceWorkerController f3415a;

    /* renamed from: b, reason: collision with root package name */
    public ServiceWorkerControllerBoundaryInterface f3416b;

    /* renamed from: c, reason: collision with root package name */
    public final y f3417c;

    public x() {
        a.c cVar = i0.f3370h;
        if (cVar.c()) {
            ServiceWorkerController g10 = d.g();
            this.f3415a = g10;
            this.f3416b = null;
            if (g10 == null) {
                this.f3415a = d.g();
            }
            this.f3417c = d.i(this.f3415a);
            return;
        }
        if (!cVar.d()) {
            throw i0.a();
        }
        this.f3415a = null;
        ServiceWorkerControllerBoundaryInterface serviceWorkerController = j0.b.f3390a.getServiceWorkerController();
        this.f3416b = serviceWorkerController;
        this.f3417c = new y(serviceWorkerController.getServiceWorkerWebSettings());
    }
}

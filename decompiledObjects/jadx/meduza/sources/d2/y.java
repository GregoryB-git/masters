package d2;

import android.webkit.ServiceWorkerWebSettings;
import d2.j0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class y extends m.e {

    /* renamed from: b, reason: collision with root package name */
    public ServiceWorkerWebSettings f3418b;

    /* renamed from: c, reason: collision with root package name */
    public ServiceWorkerWebSettingsBoundaryInterface f3419c;

    public y(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        super(2);
        this.f3418b = serviceWorkerWebSettings;
    }

    public y(InvocationHandler invocationHandler) {
        super(2);
        this.f3419c = (ServiceWorkerWebSettingsBoundaryInterface) zc.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    public final ServiceWorkerWebSettingsBoundaryInterface v() {
        if (this.f3419c == null) {
            h0 h0Var = j0.a.f3389a;
            this.f3419c = (ServiceWorkerWebSettingsBoundaryInterface) zc.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) h0Var.f3363b).convertServiceWorkerSettings(this.f3418b));
        }
        return this.f3419c;
    }

    public final ServiceWorkerWebSettings w() {
        if (this.f3418b == null) {
            h0 h0Var = j0.a.f3389a;
            this.f3418b = (ServiceWorkerWebSettings) ((WebkitToCompatConverterBoundaryInterface) h0Var.f3363b).convertServiceWorkerSettings(Proxy.getInvocationHandler(this.f3419c));
        }
        return this.f3418b;
    }
}

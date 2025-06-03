package g;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import b8.c;
import c8.a1;
import c8.i0;
import c8.y;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import d2.k0;
import io.flutter.plugins.firebase.analytics.Constants;
import nc.g0;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s implements k0, Continuation, OnFailureListener, h8.b, i8.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5642a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5643b;

    public /* synthetic */ s(int i10) {
        this.f5642a = i10;
    }

    public static String e(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(Constants.PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }

    @Override // d2.k0
    public final String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f5643b).getSupportedFeatures();
    }

    @Override // h8.b
    public final void b(Bundle bundle, String str) {
        i8.a aVar = (i8.a) this.f5643b;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + e(bundle, str));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // i8.b
    public final void c(i8.a aVar) {
        this.f5643b = aVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // d2.k0
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) zc.a.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f5643b).createWebView(webView));
    }

    public final r8.c d(JSONObject jSONObject) {
        r8.g kVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            kVar = new r8.a();
        } else {
            kVar = new r8.k();
        }
        return kVar.a((g0) this.f5643b, jSONObject);
    }

    @Override // d2.k0
    public final ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) zc.a.a(ProxyControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f5643b).getProxyController());
    }

    @Override // d2.k0
    public final ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) zc.a.a(ServiceWorkerControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f5643b).getServiceWorkerController());
    }

    @Override // d2.k0
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) zc.a.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f5643b).getStatics());
    }

    @Override // d2.k0
    public final TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) zc.a.a(TracingControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f5643b).getTracingController());
    }

    @Override // d2.k0
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) zc.a.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f5643b).getWebkitToCompatConverter());
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        y yVar = y.f2542b;
        Log.e("y", String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        if ((exc instanceof b8.l) && ((b8.l) exc).f2106a.endsWith("UNAUTHORIZED_DOMAIN")) {
            ((TaskCompletionSource) this.f5643b).setException(exc);
        } else {
            ((TaskCompletionSource) this.f5643b).setResult(new a1(null, null, null));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        String str;
        switch (this.f5642a) {
            case 4:
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException());
                }
                String str2 = ((b8.s) task.getResult()).f2137a;
                c8.i iVar = ((c8.l) this.f5643b).f2477a;
                m6.j.e(str2);
                c8.n nVar = new c8.n();
                nVar.f2490a = str2;
                nVar.f2494e = iVar;
                return Tasks.forResult(nVar);
            case 5:
                i0 i0Var = (i0) this.f5643b;
                if (task.isSuccessful()) {
                    str = (String) task.getResult();
                } else {
                    Exception exception = task.getException();
                    m6.j.i(exception);
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception.getMessage() + "\n\n Failing open with a fake token.");
                    str = "NO_RECAPTCHA";
                }
                return i0Var.b(str);
            default:
                b8.s sVar = (b8.s) task.getResult();
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(((b8.r) this.f5643b).K());
                String str3 = sVar.f2137a;
                m6.j.i(str3);
                b8.c cVar = null;
                firebaseAuth.getClass();
                m6.j.e(str3);
                if (firebaseAuth.f3064i != null) {
                    cVar = new b8.c(new c.a());
                    cVar.f2043p = firebaseAuth.f3064i;
                }
                return firebaseAuth.f3061e.zza(firebaseAuth.f3057a, cVar, str3);
        }
    }

    public s(WorkDatabase workDatabase) {
        this.f5642a = 2;
        ec.i.e(workDatabase, "workDatabase");
        this.f5643b = workDatabase;
    }

    public s(TaskCompletionSource taskCompletionSource) {
        this.f5642a = 6;
        this.f5643b = taskCompletionSource;
    }

    public /* synthetic */ s(Object obj, int i10) {
        this.f5642a = i10;
        this.f5643b = obj;
    }

    public s(l8.n nVar) {
        this.f5642a = 8;
        this.f5643b = nVar;
    }
}

package d2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import c8.k1;
import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e7.a1;
import e7.b1;
import e7.c2;
import e7.c3;
import e7.e2;
import e7.e3;
import e7.f1;
import e7.g3;
import e7.i6;
import e7.j2;
import e7.k3;
import e7.l1;
import e7.r6;
import e7.t6;
import e7.w1;
import e7.x0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* loaded from: classes.dex */
public class q implements ServiceWorkerClientBoundaryInterface, zzv, c3, t6, f1, Continuation, h8.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3406a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3407b;

    public q() {
        this.f3406a = 9;
        this.f3407b = new ArrayList();
    }

    public static q g(String str) {
        return new q((TextUtils.isEmpty(str) || str.length() > 1) ? g3.UNINITIALIZED : e3.e(str.charAt(0)), 2);
    }

    @Override // e7.t6
    public void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            ((j2) ((k3) this.f3407b).f3407b).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        k3 k3Var = (k3) this.f3407b;
        ((b.z) k3Var.zzb()).getClass();
        k3Var.E("auto", str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // e7.f1
    public final void c(String str, int i10, Throwable th, byte[] bArr, Map map) {
        ((i6) this.f3407b).s(str, i10, th, bArr, map);
    }

    @Override // h8.a
    public final void d(Bundle bundle) {
        ((w7.a) this.f3407b).b("clx", Constants.FIREBASE_APPLICATION_EXCEPTION, bundle);
    }

    public final void e(Object obj) {
        ((ArrayList) this.f3407b).add(String.valueOf(obj));
    }

    public final void f(Object obj, String str) {
        ((ArrayList) this.f3407b).add(str + "=" + obj);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    public final e7.h h() {
        return ((j2) this.f3407b).f4365o;
    }

    public final x0 i() {
        return ((j2) this.f3407b).f4370u;
    }

    public final l1 j() {
        return ((j2) this.f3407b).j();
    }

    public final r6 k() {
        return ((j2) this.f3407b).m();
    }

    public void l() {
        ((j2) this.f3407b).zzl().l();
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return ((c2.f) this.f3407b).shouldInterceptRequest(webResourceRequest);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        if (((c8.m) this.f3407b).f2483d == null) {
            return task;
        }
        if (task.isSuccessful()) {
            b8.g gVar = (b8.g) task.getResult();
            return Tasks.forResult(new k1(gVar.z(), gVar.s(), ((c8.m) this.f3407b).f2483d));
        }
        Exception exception = task.getException();
        if (exception instanceof b8.p) {
            ((b8.p) exception).f2123b = ((c8.m) this.f3407b).f2483d;
        }
        return Tasks.forException(exception);
    }

    public final String toString() {
        switch (this.f3406a) {
            case 9:
                return ((ArrayList) this.f3407b).toString();
            default:
                return super.toString();
        }
    }

    @Override // e7.c3
    public final Context zza() {
        return ((j2) this.f3407b).f4360a;
    }

    @Override // e7.c3
    public final v6.b zzb() {
        return ((j2) this.f3407b).f4371v;
    }

    @Override // e7.c3
    public final nc.g0 zzd() {
        return ((j2) this.f3407b).f;
    }

    @Override // e7.c3
    public final a1 zzj() {
        return ((j2) this.f3407b).zzj();
    }

    @Override // e7.c3
    public final e2 zzl() {
        return ((j2) this.f3407b).zzl();
    }

    public q(j2 j2Var) {
        this.f3406a = 4;
        m6.j.i(j2Var);
        this.f3407b = j2Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(zzs zzsVar, String str, List list, boolean z10, boolean z11) {
        b1 b1Var;
        int i10 = c2.f4130a[zzsVar.ordinal()];
        if (i10 == 1) {
            b1Var = ((w1) this.f3407b).zzj().f4066v;
        } else if (i10 == 2) {
            a1 zzj = ((w1) this.f3407b).zzj();
            b1Var = z10 ? zzj.f4061p : !z11 ? zzj.f4062q : zzj.f4060o;
        } else if (i10 != 3) {
            b1Var = i10 != 4 ? ((w1) this.f3407b).zzj().f4065u : ((w1) this.f3407b).zzj().f4067w;
        } else {
            a1 zzj2 = ((w1) this.f3407b).zzj();
            b1Var = z10 ? zzj2.f4064s : !z11 ? zzj2.t : zzj2.f4063r;
        }
        int size = list.size();
        if (size == 1) {
            b1Var.c(str, list.get(0));
            return;
        }
        if (size == 2) {
            b1Var.d(str, list.get(0), list.get(1));
        } else if (size != 3) {
            b1Var.b(str);
        } else {
            b1Var.a(list.get(0), list.get(1), list.get(2), str);
        }
    }

    public /* synthetic */ q(Object obj, int i10) {
        this.f3406a = i10;
        this.f3407b = obj;
    }
}

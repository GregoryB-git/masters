package v3;

import com.google.android.gms.internal.measurement.J0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC2052a implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f20137o;

    public CallableC2052a(FirebaseAnalytics firebaseAnalytics) {
        this.f20137o = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        J0 j02;
        j02 = this.f20137o.f11563a;
        return j02.M();
    }
}

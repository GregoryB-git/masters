package v3;

import com.google.android.gms.internal.measurement.J0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: v3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC2055d implements Callable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f20139o;

    public CallableC2055d(FirebaseAnalytics firebaseAnalytics) {
        this.f20139o = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        J0 j02;
        j02 = this.f20139o.f11563a;
        return j02.F();
    }
}

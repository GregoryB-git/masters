package v7;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable<Long> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f16003a;

    public d(FirebaseAnalytics firebaseAnalytics) {
        this.f16003a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        return this.f16003a.f3047a.zzc();
    }
}

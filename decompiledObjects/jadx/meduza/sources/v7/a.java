package v7;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f16001a;

    public a(FirebaseAnalytics firebaseAnalytics) {
        this.f16001a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.f16001a.f3047a.zze();
    }
}

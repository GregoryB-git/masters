package j8;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f8620b;

    public p(n nVar, long j10) {
        this.f8620b = nVar;
        this.f8619a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.FATAL, 1);
        bundle.putLong(Constants.TIMESTAMP, this.f8619a);
        this.f8620b.f8602k.d(bundle);
        return null;
    }
}

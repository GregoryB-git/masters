package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8015b;

    public /* synthetic */ e(int i10, TaskCompletionSource taskCompletionSource) {
        this.f8014a = i10;
        this.f8015b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8014a) {
            case 0:
                FlutterFirebaseAnalyticsPlugin.lambda$didReinitializeFirebaseCore$12(this.f8015b);
                break;
            case 1:
                FlutterFirebaseCrashlyticsPlugin.lambda$didReinitializeFirebaseCore$12(this.f8015b);
                break;
            default:
                this.f8015b.setResult(null);
                break;
        }
    }
}

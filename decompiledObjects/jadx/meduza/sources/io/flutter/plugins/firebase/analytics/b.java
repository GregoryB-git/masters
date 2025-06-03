package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f8004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f8005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8006d;

    public /* synthetic */ b(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource, int i10) {
        this.f8003a = i10;
        this.f8004b = flutterFirebaseAnalyticsPlugin;
        this.f8005c = map;
        this.f8006d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8003a) {
            case 0:
                this.f8004b.lambda$handleSetSessionTimeoutDuration$5(this.f8005c, this.f8006d);
                break;
            case 1:
                this.f8004b.lambda$setDefaultEventParameters$9(this.f8005c, this.f8006d);
                break;
            default:
                this.f8004b.lambda$handleSetAnalyticsCollectionEnabled$4(this.f8005c, this.f8006d);
                break;
        }
    }
}
